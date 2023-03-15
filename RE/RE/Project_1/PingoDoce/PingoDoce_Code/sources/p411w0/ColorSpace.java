package p411w0;

import p181jd.Intrinsics;
import p411w0.C11507b;
import p411w0.Connector;

/* renamed from: w0.d */
/* loaded from: classes.dex */
public final class ColorSpace {
    /* renamed from: a */
    public static final double m4916a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m4903n(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    /* renamed from: b */
    public static final double m4915b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m4901p(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    /* renamed from: c */
    public static final AbstractC11509c m4914c(AbstractC11509c abstractC11509c, C11533m c11533m, AbstractC11502a abstractC11502a) {
        Intrinsics.isThisObjectNull(abstractC11509c, "<this>");
        Intrinsics.isThisObjectNull(c11533m, "whitePoint");
        Intrinsics.isThisObjectNull(abstractC11502a, "adaptation");
        if (C11507b.m4932e(abstractC11509c.m4920f(), C11507b.f29451a.m4927b())) {
            Rgb rgb = (Rgb) abstractC11509c;
            if (m4911f(rgb.m4836r(), c11533m)) {
                return abstractC11509c;
            }
            return new Rgb(rgb, m4906k(m4912e(abstractC11502a.m4939c(), rgb.m4836r().m4805c(), c11533m.m4805c()), rgb.m4837q()), c11533m);
        }
        return abstractC11509c;
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC11509c m4913d(AbstractC11509c abstractC11509c, C11533m c11533m, AbstractC11502a abstractC11502a, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC11502a = AbstractC11502a.f29447b.m4938a();
        }
        return m4914c(abstractC11509c, c11533m, abstractC11502a);
    }

    /* renamed from: e */
    public static final float[] m4912e(float[] fArr, float[] fArr2, float[] fArr3) {
        Intrinsics.isThisObjectNull(fArr, "matrix");
        Intrinsics.isThisObjectNull(fArr2, "srcWhitePoint");
        Intrinsics.isThisObjectNull(fArr3, "dstWhitePoint");
        float[] m4904m = m4904m(fArr, fArr2);
        float[] m4904m2 = m4904m(fArr, fArr3);
        return m4906k(m4907j(fArr), m4905l(new float[]{m4904m2[0] / m4904m[0], m4904m2[1] / m4904m[1], m4904m2[2] / m4904m[2]}, fArr));
    }

    /* renamed from: f */
    public static final boolean m4911f(C11533m c11533m, C11533m c11533m2) {
        Intrinsics.isThisObjectNull(c11533m, "a");
        Intrinsics.isThisObjectNull(c11533m2, "b");
        if (c11533m == c11533m2) {
            return true;
        }
        return Math.abs(c11533m.m4807a() - c11533m2.m4807a()) < 0.001f && Math.abs(c11533m.m4806b() - c11533m2.m4806b()) < 0.001f;
    }

    /* renamed from: g */
    public static final boolean m4910g(float[] fArr, float[] fArr2) {
        Intrinsics.isThisObjectNull(fArr, "a");
        Intrinsics.isThisObjectNull(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: h */
    public static final Connector m4909h(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, int i) {
        Intrinsics.isThisObjectNull(abstractC11509c, "$this$connect");
        Intrinsics.isThisObjectNull(abstractC11509c2, "destination");
        if (abstractC11509c == abstractC11509c2) {
            return Connector.f29485d.m4874c(abstractC11509c);
        }
        long m4920f = abstractC11509c.m4920f();
        C11507b.C11508a c11508a = C11507b.f29451a;
        if (C11507b.m4932e(m4920f, c11508a.m4927b()) && C11507b.m4932e(abstractC11509c2.m4920f(), c11508a.m4927b())) {
            return new Connector.C11516b((Rgb) abstractC11509c, (Rgb) abstractC11509c2, i, null);
        }
        return new Connector(abstractC11509c, abstractC11509c2, i, null);
    }

    /* renamed from: i */
    public static /* synthetic */ Connector m4908i(AbstractC11509c abstractC11509c, AbstractC11509c abstractC11509c2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC11509c2 = C11511e.f29459a.m4882r();
        }
        if ((i2 & 2) != 0) {
            i = C11520j.f29502a.m4851b();
        }
        return m4909h(abstractC11509c, abstractC11509c2, i);
    }

    /* renamed from: j */
    public static final float[] m4907j(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "m");
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* renamed from: k */
    public static final float[] m4906k(float[] fArr, float[] fArr2) {
        Intrinsics.isThisObjectNull(fArr, "lhs");
        Intrinsics.isThisObjectNull(fArr2, "rhs");
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[3] * fArr2[1]) + (fArr[6] * fArr2[2]), (fArr[1] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[7] * fArr2[2]), (fArr[2] * fArr2[0]) + (fArr[5] * fArr2[1]) + (fArr[8] * fArr2[2]), (fArr[0] * fArr2[3]) + (fArr[3] * fArr2[4]) + (fArr[6] * fArr2[5]), (fArr[1] * fArr2[3]) + (fArr[4] * fArr2[4]) + (fArr[7] * fArr2[5]), (fArr[2] * fArr2[3]) + (fArr[5] * fArr2[4]) + (fArr[8] * fArr2[5]), (fArr[0] * fArr2[6]) + (fArr[3] * fArr2[7]) + (fArr[6] * fArr2[8]), (fArr[1] * fArr2[6]) + (fArr[4] * fArr2[7]) + (fArr[7] * fArr2[8]), (fArr[2] * fArr2[6]) + (fArr[5] * fArr2[7]) + (fArr[8] * fArr2[8])};
    }

    /* renamed from: l */
    public static final float[] m4905l(float[] fArr, float[] fArr2) {
        Intrinsics.isThisObjectNull(fArr, "lhs");
        Intrinsics.isThisObjectNull(fArr2, "rhs");
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr[0] * fArr2[3], fArr[1] * fArr2[4], fArr[2] * fArr2[5], fArr[0] * fArr2[6], fArr[1] * fArr2[7], fArr[2] * fArr2[8]};
    }

    /* renamed from: m */
    public static final float[] m4904m(float[] fArr, float[] fArr2) {
        Intrinsics.isThisObjectNull(fArr, "lhs");
        Intrinsics.isThisObjectNull(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    /* renamed from: n */
    public static final double m4903n(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    /* renamed from: o */
    public static final double m4902o(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    /* renamed from: p */
    public static final double m4901p(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    /* renamed from: q */
    public static final double m4900q(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}
