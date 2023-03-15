package androidx.core.content.res;

import androidx.core.graphics.C0969a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.a */
/* loaded from: classes.dex */
public class C0942a {

    /* renamed from: a */
    private final float f3196a;

    /* renamed from: b */
    private final float f3197b;

    /* renamed from: c */
    private final float f3198c;

    /* renamed from: d */
    private final float f3199d;

    /* renamed from: e */
    private final float f3200e;

    /* renamed from: f */
    private final float f3201f;

    C0942a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f3196a = f;
        this.f3197b = f2;
        this.f3198c = f3;
        this.f3199d = f7;
        this.f3200e = f8;
        this.f3201f = f9;
    }

    /* renamed from: b */
    private static C0942a m39070b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        float f5 = 0.0f;
        C0942a c0942a = null;
        float f6 = 100.0f;
        float f7 = 1000.0f;
        while (Math.abs(f5 - f6) > 0.01f) {
            float f8 = ((f6 - f5) / 2.0f) + f5;
            int m39056p = m39067e(f8, f2, f).m39056p();
            float m39054b = C0943b.m39054b(m39056p);
            float abs = Math.abs(f3 - m39054b);
            if (abs < 0.2f) {
                C0942a m39069c = m39069c(m39056p);
                float m39071a = m39069c.m39071a(m39067e(m39069c.m39061k(), m39069c.m39063i(), f));
                if (m39071a <= 1.0f) {
                    c0942a = m39069c;
                    f4 = abs;
                    f7 = m39071a;
                }
            }
            if (f4 == 0.0f && f7 == 0.0f) {
                break;
            } else if (m39054b < f3) {
                f5 = f8;
            } else {
                f6 = f8;
            }
        }
        return c0942a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0942a m39069c(int i) {
        return m39068d(i, C0968l.f3238k);
    }

    /* renamed from: d */
    static C0942a m39068d(int i, C0968l c0968l) {
        float pow;
        float[] m39050f = C0943b.m39050f(i);
        float[][] fArr = C0943b.f3202a;
        float f = (m39050f[0] * fArr[0][0]) + (m39050f[1] * fArr[0][1]) + (m39050f[2] * fArr[0][2]);
        float f2 = (m39050f[0] * fArr[1][0]) + (m39050f[1] * fArr[1][1]) + (m39050f[2] * fArr[1][2]);
        float f3 = (m39050f[0] * fArr[2][0]) + (m39050f[1] * fArr[2][1]) + (m39050f[2] * fArr[2][2]);
        float f4 = c0968l.m38951i()[0] * f;
        float f5 = c0968l.m38951i()[1] * f2;
        float f6 = c0968l.m38951i()[2] * f3;
        float pow2 = (float) Math.pow((c0968l.m38957c() * Math.abs(f4)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c0968l.m38957c() * Math.abs(f5)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((c0968l.m38957c() * Math.abs(f6)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f4) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f5) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f6) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f7 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f8 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f9 = signum2 * 20.0f;
        float f10 = (((signum * 20.0f) + f9) + (21.0f * signum3)) / 20.0f;
        float f11 = (((signum * 40.0f) + f9) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f8, f7)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f12 = atan2;
        float f13 = (3.1415927f * f12) / 180.0f;
        float pow5 = ((float) Math.pow((f11 * c0968l.m38954f()) / c0968l.m38959a(), c0968l.m38958b() * c0968l.m38950j())) * 100.0f;
        float m38956d = c0968l.m38956d() * (4.0f / c0968l.m38958b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (c0968l.m38959a() + 4.0f);
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0968l.m38955e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f12) < 20.14d ? 360.0f + f12 : f12) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0968l.m38953g()) * c0968l.m38952h()) * ((float) Math.sqrt((f7 * f7) + (f8 * f8)))) / (f10 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float m38956d2 = pow6 * c0968l.m38956d();
        float sqrt = ((float) Math.sqrt((pow * c0968l.m38958b()) / (c0968l.m38959a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * m38956d2) + 1.0f)) * 43.85965f;
        double d2 = f13;
        return new C0942a(f12, pow6, pow5, m38956d, m38956d2, sqrt, f14, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: e */
    private static C0942a m39067e(float f, float f2, float f3) {
        return m39066f(f, f2, f3, C0968l.f3238k);
    }

    /* renamed from: f */
    private static C0942a m39066f(float f, float f2, float f3, C0968l c0968l) {
        double d;
        float m38958b = (4.0f / c0968l.m38958b()) * ((float) Math.sqrt(f / 100.0d)) * (c0968l.m38959a() + 4.0f) * c0968l.m38956d();
        float m38956d = f2 * c0968l.m38956d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c0968l.m38958b()) / (c0968l.m38959a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m38956d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0942a(f3, f2, f, m38958b, m38956d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m39059m(float f, float f2, float f3) {
        return m39058n(f, f2, f3, C0968l.f3238k);
    }

    /* renamed from: n */
    static int m39058n(float f, float f2, float f3, C0968l c0968l) {
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
            C0942a c0942a = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4f) {
                C0942a m39070b = m39070b(min, f5, f3);
                if (z) {
                    if (m39070b != null) {
                        return m39070b.m39057o(c0968l);
                    }
                    z = false;
                } else if (m39070b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    c0942a = m39070b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            }
            if (c0942a == null) {
                return C0943b.m39055a(f3);
            }
            return c0942a.m39057o(c0968l);
        }
        return C0943b.m39055a(f3);
    }

    /* renamed from: a */
    float m39071a(C0942a c0942a) {
        float m39060l = m39060l() - c0942a.m39060l();
        float m39065g = m39065g() - c0942a.m39065g();
        float m39064h = m39064h() - c0942a.m39064h();
        return (float) (Math.pow(Math.sqrt((m39060l * m39060l) + (m39065g * m39065g) + (m39064h * m39064h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m39065g() {
        return this.f3200e;
    }

    /* renamed from: h */
    float m39064h() {
        return this.f3201f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m39063i() {
        return this.f3197b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m39062j() {
        return this.f3196a;
    }

    /* renamed from: k */
    float m39061k() {
        return this.f3198c;
    }

    /* renamed from: l */
    float m39060l() {
        return this.f3199d;
    }

    /* renamed from: o */
    int m39057o(C0968l c0968l) {
        float f;
        float pow = (float) Math.pow(((((double) m39063i()) == 0.0d || ((double) m39061k()) == 0.0d) ? 0.0f : m39063i() / ((float) Math.sqrt(m39061k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c0968l.m38955e()), 0.73d), 1.1111111111111112d);
        double m39062j = (m39062j() * 3.1415927f) / 180.0f;
        float m38959a = c0968l.m38959a() * ((float) Math.pow(m39061k() / 100.0d, (1.0d / c0968l.m38958b()) / c0968l.m38950j()));
        float cos = ((float) (Math.cos(2.0d + m39062j) + 3.8d)) * 0.25f * 3846.1538f * c0968l.m38953g() * c0968l.m38952h();
        float m38954f = m38959a / c0968l.m38954f();
        float sin = (float) Math.sin(m39062j);
        float cos2 = (float) Math.cos(m39062j);
        float f2 = (((0.305f + m38954f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = m38954f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / c0968l.m38957c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / c0968l.m38957c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / c0968l.m38957c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f) * 27.13d) / (400.0d - Math.abs(f))), 2.380952380952381d));
        float f8 = signum / c0968l.m38951i()[0];
        float f9 = signum2 / c0968l.m38951i()[1];
        float f10 = signum3 / c0968l.m38951i()[2];
        float[][] fArr = C0943b.f3203b;
        return C0969a.m38947b((fArr[0][0] * f8) + (fArr[0][1] * f9) + (fArr[0][2] * f10), (fArr[1][0] * f8) + (fArr[1][1] * f9) + (fArr[1][2] * f10), (f8 * fArr[2][0]) + (f9 * fArr[2][1]) + (f10 * fArr[2][2]));
    }

    /* renamed from: p */
    int m39056p() {
        return m39057o(C0968l.f3238k);
    }
}
