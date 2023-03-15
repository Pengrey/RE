package androidx.core.content.res;

/* renamed from: androidx.core.content.res.l */
/* loaded from: classes.dex */
final class C0968l {

    /* renamed from: k */
    static final C0968l f3238k = m38949k(C0943b.f3204c, (float) ((C0943b.m39048h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f3239a;

    /* renamed from: b */
    private final float f3240b;

    /* renamed from: c */
    private final float f3241c;

    /* renamed from: d */
    private final float f3242d;

    /* renamed from: e */
    private final float f3243e;

    /* renamed from: f */
    private final float f3244f;

    /* renamed from: g */
    private final float[] f3245g;

    /* renamed from: h */
    private final float f3246h;

    /* renamed from: i */
    private final float f3247i;

    /* renamed from: j */
    private final float f3248j;

    private C0968l(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f3244f = f;
        this.f3239a = f2;
        this.f3240b = f3;
        this.f3241c = f4;
        this.f3242d = f5;
        this.f3243e = f6;
        this.f3245g = fArr;
        this.f3246h = f7;
        this.f3247i = f8;
        this.f3248j = f9;
    }

    /* renamed from: k */
    static C0968l m38949k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = C0943b.f3202a;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float m39052d = ((double) f7) >= 0.9d ? C0943b.m39052d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : C0943b.m39052d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float cbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(f * 5.0d)));
        float m39048h = C0943b.m39048h(f2) / fArr[1];
        double d2 = m39048h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f4) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f6) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C0968l(m39048h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, m39052d, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m38959a() {
        return this.f3239a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m38958b() {
        return this.f3242d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m38957c() {
        return this.f3246h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m38956d() {
        return this.f3247i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m38955e() {
        return this.f3244f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m38954f() {
        return this.f3240b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m38953g() {
        return this.f3243e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m38952h() {
        return this.f3241c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m38951i() {
        return this.f3245g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m38950j() {
        return this.f3248j;
    }
}
