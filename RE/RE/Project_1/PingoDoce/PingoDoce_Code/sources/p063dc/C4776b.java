package p063dc;

/* renamed from: dc.b */
/* loaded from: classes2.dex */
final class C4776b {

    /* renamed from: a */
    private final byte[] f13080a;

    /* renamed from: b */
    private int f13081b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4776b(int i) {
        this.f13080a = new byte[i];
    }

    /* renamed from: c */
    private void m26645c(int i, boolean z) {
        this.f13080a[i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m26647a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f13081b;
            this.f13081b = i3 + 1;
            m26645c(i3, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte[] m26646b(int i) {
        int length = this.f13080a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f13080a[i2 / i];
        }
        return bArr;
    }
}
