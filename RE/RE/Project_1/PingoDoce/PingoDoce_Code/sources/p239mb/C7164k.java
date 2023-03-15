package p239mb;

/* renamed from: mb.k */
/* loaded from: classes2.dex */
public final class C7164k {

    /* renamed from: a */
    private final float f18988a;

    /* renamed from: b */
    private final float f18989b;

    /* renamed from: c */
    private final float f18990c;

    /* renamed from: d */
    private final float f18991d;

    /* renamed from: e */
    private final float f18992e;

    /* renamed from: f */
    private final float f18993f;

    /* renamed from: g */
    private final float f18994g;

    /* renamed from: h */
    private final float f18995h;

    /* renamed from: i */
    private final float f18996i;

    private C7164k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f18988a = f;
        this.f18989b = f4;
        this.f18990c = f7;
        this.f18991d = f2;
        this.f18992e = f5;
        this.f18993f = f8;
        this.f18994g = f3;
        this.f18995h = f6;
        this.f18996i = f9;
    }

    /* renamed from: b */
    public static C7164k m19014b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m19012d(f9, f10, f11, f12, f13, f14, f15, f16).m19011e(m19013c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C7164k m19013c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m19012d(f, f2, f3, f4, f5, f6, f7, f8).m19015a();
    }

    /* renamed from: d */
    public static C7164k m19012d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C7164k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C7164k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    C7164k m19015a() {
        float f = this.f18992e;
        float f2 = this.f18996i;
        float f3 = this.f18993f;
        float f4 = this.f18995h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f18994g;
        float f7 = this.f18991d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f18990c;
        float f11 = this.f18989b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f18988a;
        return new C7164k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    C7164k m19011e(C7164k c7164k) {
        float f = this.f18988a;
        float f2 = c7164k.f18988a;
        float f3 = this.f18991d;
        float f4 = c7164k.f18989b;
        float f5 = this.f18994g;
        float f6 = c7164k.f18990c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = c7164k.f18991d;
        float f9 = c7164k.f18992e;
        float f10 = c7164k.f18993f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = c7164k.f18994g;
        float f13 = c7164k.f18995h;
        float f14 = c7164k.f18996i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f18989b;
        float f17 = this.f18992e;
        float f18 = this.f18995h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f18990c;
        float f21 = this.f18993f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f18996i;
        return new C7164k(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    /* renamed from: f */
    public void m19010f(float[] fArr) {
        float f = this.f18988a;
        float f2 = this.f18989b;
        float f3 = this.f18990c;
        float f4 = this.f18991d;
        float f5 = this.f18992e;
        float f6 = this.f18993f;
        float f7 = this.f18994g;
        float f8 = this.f18995h;
        float f9 = this.f18996i;
        int length = fArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
