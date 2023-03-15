package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class InputStreamDecrypter extends InputStream {
    byte[] associatedData;
    @GuardedBy("this")
    InputStream ciphertextStream;
    PrimitiveSet<StreamingAead> primitives;
    @GuardedBy("this")
    boolean attemptedMatching = false;
    @GuardedBy("this")
    InputStream matchingStream = null;

    public InputStreamDecrypter(PrimitiveSet<StreamingAead> primitiveSet, InputStream inputStream, byte[] bArr) {
        this.primitives = primitiveSet;
        if (inputStream.markSupported()) {
            this.ciphertextStream = inputStream;
        } else {
            this.ciphertextStream = new BufferedInputStream(inputStream);
        }
        this.ciphertextStream.mark(Reader.READ_DONE);
        this.associatedData = (byte[]) bArr.clone();
    }

    @GuardedBy("this")
    private void disableRewinding() throws IOException {
        this.ciphertextStream.mark(0);
    }

    @GuardedBy("this")
    private void rewind() throws IOException {
        this.ciphertextStream.reset();
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public synchronized int available() throws IOException {
        InputStream inputStream = this.matchingStream;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    @GuardedBy("this")
    public synchronized void close() throws IOException {
        this.ciphertextStream.close();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == 1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    @GuardedBy("this")
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.matchingStream;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        } else if (!this.attemptedMatching) {
            this.attemptedMatching = true;
            for (PrimitiveSet.Entry<StreamingAead> entry : this.primitives.getRawPrimitives()) {
                try {
                    try {
                        InputStream newDecryptingStream = entry.getPrimitive().newDecryptingStream(this.ciphertextStream, this.associatedData);
                        int read = newDecryptingStream.read(bArr, i, i2);
                        if (read == 0) {
                            rewind();
                            this.attemptedMatching = false;
                        } else {
                            this.matchingStream = newDecryptingStream;
                            disableRewinding();
                        }
                        return read;
                    } catch (IOException unused) {
                        rewind();
                    }
                } catch (GeneralSecurityException unused2) {
                    rewind();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }
}
