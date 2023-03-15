package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class SeekableByteChannelDecrypter implements SeekableByteChannel {
    byte[] associatedData;
    @GuardedBy("this")
    SeekableByteChannel ciphertextChannel;
    PrimitiveSet<StreamingAead> primitives;
    @GuardedBy("this")
    long startingPosition;
    @GuardedBy("this")
    boolean attemptedMatching = false;
    @GuardedBy("this")
    SeekableByteChannel matchingChannel = null;
    @GuardedBy("this")
    long cachedPosition = -1;

    public SeekableByteChannelDecrypter(PrimitiveSet<StreamingAead> primitiveSet, SeekableByteChannel seekableByteChannel, byte[] bArr) throws IOException {
        this.primitives = primitiveSet;
        this.ciphertextChannel = seekableByteChannel;
        this.startingPosition = seekableByteChannel.position();
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

    @Override // java.nio.channels.SeekableByteChannel
    @GuardedBy("this")
    public synchronized SeekableByteChannel position(long j) throws IOException {
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            seekableByteChannel.position(j);
        } else if (j >= 0) {
            this.cachedPosition = j;
        } else {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    @GuardedBy("this")
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            return seekableByteChannel.read(byteBuffer);
        } else if (!this.attemptedMatching) {
            this.attemptedMatching = true;
            for (PrimitiveSet.Entry<StreamingAead> entry : this.primitives.getRawPrimitives()) {
                try {
                    SeekableByteChannel newSeekableDecryptingChannel = entry.getPrimitive().newSeekableDecryptingChannel(this.ciphertextChannel, this.associatedData);
                    long j = this.cachedPosition;
                    if (j >= 0) {
                        newSeekableDecryptingChannel.position(j);
                    }
                    int read = newSeekableDecryptingChannel.read(byteBuffer);
                    if (read > 0) {
                        this.matchingChannel = newSeekableDecryptingChannel;
                    } else if (read == 0) {
                        this.ciphertextChannel.position(this.startingPosition);
                        this.attemptedMatching = false;
                    }
                    this.matchingChannel = newSeekableDecryptingChannel;
                    return read;
                } catch (IOException unused) {
                    this.ciphertextChannel.position(this.startingPosition);
                } catch (GeneralSecurityException unused2) {
                    this.ciphertextChannel.position(this.startingPosition);
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    @GuardedBy("this")
    public synchronized long size() throws IOException {
        SeekableByteChannel seekableByteChannel;
        seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
        } else {
            throw new IOException("Cannot determine size before first read()-call.");
        }
        return seekableByteChannel.size();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    @GuardedBy("this")
    public synchronized long position() throws IOException {
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            return seekableByteChannel.position();
        }
        return this.cachedPosition;
    }
}
