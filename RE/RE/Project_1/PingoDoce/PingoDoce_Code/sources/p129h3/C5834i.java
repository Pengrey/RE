package p129h3;

import java.io.InputStream;

/* renamed from: h3.i */
/* loaded from: classes.dex */
final class C5834i extends InputStream {

    /* renamed from: w */
    private final InputStream f16235w;

    /* renamed from: x */
    private int f16236x = 1073741824;

    public C5834i(InputStream inputStream) {
        this.f16235w = inputStream;
    }

    /* renamed from: a */
    private final int m22964a(int i) {
        if (i == -1) {
            this.f16236x = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f16236x;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16235w.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m22964a(this.f16235w.read());
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f16235w.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m22964a(this.f16235w.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return m22964a(this.f16235w.read(bArr, i, i2));
    }
}
