package p061da;

import java.io.OutputStream;

/* renamed from: da.b */
/* loaded from: classes.dex */
final class C4757b extends OutputStream {

    /* renamed from: w */
    private long f13049w = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m26690a() {
        return this.f13049w;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f13049w++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f13049w += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f13049w += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
