package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StreamingAeadSeekableDecryptingChannel implements SeekableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final SeekableByteChannel ciphertextChannel;
    private final long ciphertextChannelSize;
    private final int ciphertextOffset;
    private final ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private int currentSegmentNr;
    private final StreamSegmentDecrypter decrypter;
    private final int firstSegmentOffset;
    private final ByteBuffer header;
    private boolean headerRead;
    private boolean isCurrentSegmentDecrypted;
    private boolean isopen;
    private final int lastCiphertextSegmentSize;
    private final int numberOfSegments;
    private long plaintextPosition;
    private final ByteBuffer plaintextSegment;
    private final int plaintextSegmentSize;
    private long plaintextSize;

    public StreamingAeadSeekableDecryptingChannel(NonceBasedStreamingAead nonceBasedStreamingAead, SeekableByteChannel seekableByteChannel, byte[] bArr) throws IOException, GeneralSecurityException {
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.ciphertextChannel = seekableByteChannel;
        this.header = ByteBuffer.allocate(nonceBasedStreamingAead.getHeaderLength());
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        this.ciphertextSegment = ByteBuffer.allocate(ciphertextSegmentSize);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.plaintextSegment = ByteBuffer.allocate(plaintextSegmentSize + 16);
        this.plaintextPosition = 0L;
        this.headerRead = false;
        this.currentSegmentNr = -1;
        this.isCurrentSegmentDecrypted = false;
        long size = seekableByteChannel.size();
        this.ciphertextChannelSize = size;
        this.aad = Arrays.copyOf(bArr, bArr.length);
        this.isopen = seekableByteChannel.isOpen();
        int i = (int) (size / ciphertextSegmentSize);
        int i2 = (int) (size % ciphertextSegmentSize);
        int ciphertextOverhead = nonceBasedStreamingAead.getCiphertextOverhead();
        if (i2 > 0) {
            this.numberOfSegments = i + 1;
            if (i2 >= ciphertextOverhead) {
                this.lastCiphertextSegmentSize = i2;
            } else {
                throw new IOException("Invalid ciphertext size");
            }
        } else {
            this.numberOfSegments = i;
            this.lastCiphertextSegmentSize = ciphertextSegmentSize;
        }
        int ciphertextOffset = nonceBasedStreamingAead.getCiphertextOffset();
        this.ciphertextOffset = ciphertextOffset;
        int headerLength = ciphertextOffset - nonceBasedStreamingAead.getHeaderLength();
        this.firstSegmentOffset = headerLength;
        if (headerLength >= 0) {
            long j = (this.numberOfSegments * ciphertextOverhead) + ciphertextOffset;
            if (j <= size) {
                this.plaintextSize = size - j;
                return;
            }
            throw new IOException("Ciphertext is too short");
        }
        throw new IOException("Invalid ciphertext offset or header length");
    }

    private int getSegmentNr(long j) {
        return (int) ((j + this.ciphertextOffset) / this.plaintextSegmentSize);
    }

    private boolean reachedEnd() {
        return this.isCurrentSegmentDecrypted && this.currentSegmentNr == this.numberOfSegments - 1 && this.plaintextSegment.remaining() == 0;
    }

    private boolean tryLoadSegment(int i) throws IOException {
        int i2;
        if (i >= 0 && i < (i2 = this.numberOfSegments)) {
            boolean z = i == i2 - 1;
            if (i == this.currentSegmentNr) {
                if (this.isCurrentSegmentDecrypted) {
                    return true;
                }
            } else {
                int i3 = this.ciphertextSegmentSize;
                long j = i * i3;
                if (z) {
                    i3 = this.lastCiphertextSegmentSize;
                }
                if (i == 0) {
                    int i4 = this.ciphertextOffset;
                    i3 -= i4;
                    j = i4;
                }
                this.ciphertextChannel.position(j);
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(i3);
                this.currentSegmentNr = i;
                this.isCurrentSegmentDecrypted = false;
            }
            if (this.ciphertextSegment.remaining() > 0) {
                this.ciphertextChannel.read(this.ciphertextSegment);
            }
            if (this.ciphertextSegment.remaining() > 0) {
                return false;
            }
            this.ciphertextSegment.flip();
            this.plaintextSegment.clear();
            try {
                this.decrypter.decryptSegment(this.ciphertextSegment, i, z, this.plaintextSegment);
                this.plaintextSegment.flip();
                this.isCurrentSegmentDecrypted = true;
                return true;
            } catch (GeneralSecurityException e) {
                this.currentSegmentNr = -1;
                throw new IOException("Failed to decrypt", e);
            }
        }
        throw new IOException("Invalid position");
    }

    private boolean tryReadHeader() throws IOException {
        this.ciphertextChannel.position(this.header.position() + this.firstSegmentOffset);
        this.ciphertextChannel.read(this.header);
        if (this.header.remaining() > 0) {
            return false;
        }
        this.header.flip();
        try {
            this.decrypter.init(this.header, this.aad);
            this.headerRead = true;
            return true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextChannel.close();
        this.isopen = false;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.isopen;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() {
        return this.plaintextPosition;
    }

    public synchronized int read(ByteBuffer byteBuffer, long j) throws IOException {
        int read;
        long position = position();
        position(j);
        read = read(byteBuffer);
        position(position);
        return read;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
        return this.plaintextSize;
    }

    public synchronized String toString() {
        StringBuilder sb2;
        String str;
        sb2 = new StringBuilder();
        try {
            str = "position:" + this.ciphertextChannel.position();
        } catch (IOException unused) {
            str = "position: n/a";
        }
        sb2.append("StreamingAeadSeekableDecryptingChannel");
        sb2.append("\nciphertextChannel");
        sb2.append(str);
        sb2.append("\nciphertextChannelSize:");
        sb2.append(this.ciphertextChannelSize);
        sb2.append("\nplaintextSize:");
        sb2.append(this.plaintextSize);
        sb2.append("\nciphertextSegmentSize:");
        sb2.append(this.ciphertextSegmentSize);
        sb2.append("\nnumberOfSegments:");
        sb2.append(this.numberOfSegments);
        sb2.append("\nheaderRead:");
        sb2.append(this.headerRead);
        sb2.append("\nplaintextPosition:");
        sb2.append(this.plaintextPosition);
        sb2.append("\nHeader");
        sb2.append(" position:");
        sb2.append(this.header.position());
        sb2.append(" limit:");
        sb2.append(this.header.position());
        sb2.append("\ncurrentSegmentNr:");
        sb2.append(this.currentSegmentNr);
        sb2.append("\nciphertextSgement");
        sb2.append(" position:");
        sb2.append(this.ciphertextSegment.position());
        sb2.append(" limit:");
        sb2.append(this.ciphertextSegment.limit());
        sb2.append("\nisCurrentSegmentDecrypted:");
        sb2.append(this.isCurrentSegmentDecrypted);
        sb2.append("\nplaintextSegment");
        sb2.append(" position:");
        sb2.append(this.plaintextSegment.position());
        sb2.append(" limit:");
        sb2.append(this.plaintextSegment.limit());
        return sb2.toString();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) throws NonWritableChannelException {
        throw new NonWritableChannelException();
    }

    public synchronized long verifiedSize() throws IOException {
        if (tryLoadSegment(this.numberOfSegments - 1)) {
        } else {
            throw new IOException("could not verify the size");
        }
        return this.plaintextSize;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws NonWritableChannelException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized SeekableByteChannel position(long j) {
        this.plaintextPosition = j;
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        long j;
        if (this.isopen) {
            if (this.headerRead || tryReadHeader()) {
                int position = byteBuffer.position();
                while (byteBuffer.remaining() > 0) {
                    long j2 = this.plaintextPosition;
                    if (j2 < this.plaintextSize) {
                        int segmentNr = getSegmentNr(j2);
                        if (segmentNr == 0) {
                            j = this.plaintextPosition;
                        } else {
                            j = (this.plaintextPosition + this.ciphertextOffset) % this.plaintextSegmentSize;
                        }
                        int i = (int) j;
                        if (!tryLoadSegment(segmentNr)) {
                            break;
                        }
                        this.plaintextSegment.position(i);
                        if (this.plaintextSegment.remaining() <= byteBuffer.remaining()) {
                            this.plaintextPosition += this.plaintextSegment.remaining();
                            byteBuffer.put(this.plaintextSegment);
                        } else {
                            int remaining = byteBuffer.remaining();
                            ByteBuffer duplicate = this.plaintextSegment.duplicate();
                            duplicate.limit(duplicate.position() + remaining);
                            byteBuffer.put(duplicate);
                            this.plaintextPosition += remaining;
                            ByteBuffer byteBuffer2 = this.plaintextSegment;
                            byteBuffer2.position(byteBuffer2.position() + remaining);
                        }
                    } else {
                        break;
                    }
                }
                int position2 = byteBuffer.position() - position;
                if (position2 == 0 && reachedEnd()) {
                    return -1;
                }
                return position2;
            }
            return 0;
        }
        throw new ClosedChannelException();
    }
}
