package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class RewindableReadableByteChannel implements ReadableByteChannel {
    @GuardedBy("this")
    final ReadableByteChannel baseChannel;
    @GuardedBy("this")
    ByteBuffer buffer = null;
    @GuardedBy("this")
    boolean canRewind = true;
    @GuardedBy("this")
    boolean directRead = false;

    public RewindableReadableByteChannel(ReadableByteChannel readableByteChannel) {
        this.baseChannel = readableByteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    @GuardedBy("this")
    public synchronized void close() throws IOException {
        this.canRewind = false;
        this.directRead = true;
        this.baseChannel.close();
    }

    @GuardedBy("this")
    public synchronized void disableRewinding() {
        this.canRewind = false;
    }

    @Override // java.nio.channels.Channel
    @GuardedBy("this")
    public synchronized boolean isOpen() {
        return this.baseChannel.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    @GuardedBy("this")
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (this.directRead) {
            return this.baseChannel.read(byteBuffer);
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return 0;
        }
        ByteBuffer byteBuffer2 = this.buffer;
        if (byteBuffer2 == null) {
            if (!this.canRewind) {
                this.directRead = true;
                return this.baseChannel.read(byteBuffer);
            }
            ByteBuffer allocate = ByteBuffer.allocate(remaining);
            this.buffer = allocate;
            int read = this.baseChannel.read(allocate);
            if (read > 0) {
                this.buffer.flip();
                byteBuffer.put(this.buffer);
            }
            return read;
        } else if (byteBuffer2.remaining() >= remaining) {
            byte[] bArr = new byte[remaining];
            this.buffer.get(bArr);
            byteBuffer.put(bArr);
            if (!this.canRewind && this.buffer.remaining() == 0) {
                this.directRead = true;
            }
            return remaining;
        } else {
            int remaining2 = this.buffer.remaining();
            int i = remaining - remaining2;
            byteBuffer.put(this.buffer);
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            int read2 = this.baseChannel.read(allocate2);
            if (read2 > 0) {
                allocate2.flip();
                byteBuffer.put(allocate2);
            }
            if (this.canRewind) {
                ByteBuffer allocate3 = ByteBuffer.allocate(this.buffer.limit() + i);
                this.buffer.flip();
                allocate3.put(this.buffer);
                if (read2 > 0) {
                    allocate2.flip();
                    allocate3.put(allocate2);
                }
                allocate3.flip();
                allocate3.position(allocate3.limit());
                this.buffer = allocate3;
            } else {
                this.buffer = null;
                this.directRead = true;
            }
            return remaining2 + read2;
        }
    }

    @GuardedBy("this")
    public synchronized void rewind() throws IOException {
        if (this.canRewind) {
            ByteBuffer byteBuffer = this.buffer;
            if (byteBuffer != null) {
                byteBuffer.position(0);
            }
        } else {
            throw new IOException("Cannot rewind anymore.");
        }
    }
}
