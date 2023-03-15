package p130h4;

/* renamed from: h4.f */
/* loaded from: classes.dex */
public class C5850f {

    /* renamed from: a */
    private float f16267a;

    /* renamed from: b */
    private int f16268b;

    /* renamed from: a */
    public void m22904a(float f) {
        float f2 = this.f16267a + f;
        this.f16267a = f2;
        int i = this.f16268b + 1;
        this.f16268b = i;
        if (i == Integer.MAX_VALUE) {
            this.f16267a = f2 / 2.0f;
            this.f16268b = i / 2;
        }
    }
}
