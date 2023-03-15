package p309q7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.k */
/* loaded from: classes.dex */
final class C9683k extends FilterInputStream {

    /* renamed from: w */
    private long f25525w;

    /* renamed from: x */
    private long f25526x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9683k(InputStream inputStream, long j) {
        super(inputStream);
        this.f25526x = -1L;
        Objects.requireNonNull(inputStream);
        this.f25525w = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f25525w);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f25526x = this.f25525w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f25525w == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f25525w--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f25526x != -1) {
                ((FilterInputStream) this).in.reset();
                this.f25525w = this.f25526x;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f25525w));
        this.f25525w -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f25525w;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f25525w -= read;
        }
        return read;
    }
}
