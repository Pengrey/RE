package p113g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C5591a {

    /* renamed from: a */
    private final C5593d[] f15802a;

    public C5591a(int i, int i2) {
        C5593d[] c5593dArr = new C5593d[i];
        for (int i3 = 0; i3 < i; i3++) {
            c5593dArr[i3] = new C5593d(i2);
        }
        this.f15802a = c5593dArr;
    }

    /* renamed from: a */
    public final float m23634a(int i, int i2) {
        return this.f15802a[i].m23627a(i2);
    }

    /* renamed from: b */
    public final C5593d m23633b(int i) {
        return this.f15802a[i];
    }

    /* renamed from: c */
    public final void m23632c(int i, int i2, float f) {
        this.f15802a[i].m23625c(i2, f);
    }
}
