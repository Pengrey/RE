package p309q7;

import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.p */
/* loaded from: classes.dex */
final class C9688p extends OutputStream {

    /* renamed from: w */
    private long f25532w = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m10218a() {
        return this.f25532w;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f25532w++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f25532w += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f25532w += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
