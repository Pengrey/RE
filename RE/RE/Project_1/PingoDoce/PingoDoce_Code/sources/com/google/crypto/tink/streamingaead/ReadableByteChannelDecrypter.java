package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class ReadableByteChannelDecrypter implements ReadableByteChannel {
    byte[] associatedData;
    @GuardedBy("this")
    RewindableReadableByteChannel ciphertextChannel;
    PrimitiveSet<StreamingAead> primitives;
    @GuardedBy("this")
    boolean attemptedMatching = false;
    @GuardedBy("this")
    ReadableByteChannel matchingChannel = null;

    public ReadableByteChannelDecrypter(PrimitiveSet<StreamingAead> primitiveSet, ReadableByteChannel readableByteChannel, byte[] bArr) {
        this.primitives = primitiveSet;
        this.ciphertextChannel = new RewindableReadableByteChannel(readableByteChannel);
        this.associatedData = (byte[]) bArr.clone();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    @GuardedBy("this")
    public synchronized void close() throws IOException {
        this.ciphertextChannel.close();
    }

    @Override // java.nio.channels.Channel
    @GuardedBy("this")
    public synchronized boolean isOpen() {
        return this.ciphertextChannel.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    @GuardedBy("this")
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        ReadableByteChannel readableByteChannel = this.matchingChannel;
        if (readableByteChannel != null) {
            return readableByteChannel.read(byteBuffer);
        } else if (!this.attemptedMatching) {
            this.attemptedMatching = true;
            for (PrimitiveSet.Entry<StreamingAead> entry : this.primitives.getRawPrimitives()) {
                try {
                    try {
                        ReadableByteChannel newDecryptingChannel = entry.getPrimitive().newDecryptingChannel(this.ciphertextChannel, this.associatedData);
                        int read = newDecryptingChannel.read(byteBuffer);
                        if (read > 0) {
                            this.matchingChannel = newDecryptingChannel;
                            this.ciphertextChannel.disableRewinding();
                        } else if (read == 0) {
                            this.ciphertextChannel.rewind();
                            this.attemptedMatching = false;
                        }
                        return read;
                    } catch (GeneralSecurityException unused) {
                        this.ciphertextChannel.rewind();
                    }
                } catch (IOException unused2) {
                    this.ciphertextChannel.rewind();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }
}
