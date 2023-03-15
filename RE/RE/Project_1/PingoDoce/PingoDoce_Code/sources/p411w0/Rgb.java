package p411w0;

import id.InterfaceC6108l;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p489zc._ArraysJvm;

/* renamed from: w0.k */
/* loaded from: classes.dex */
public final class Rgb extends AbstractC11509c {

    /* renamed from: p */
    public static final C11529h f29506p = new C11529h(null);

    /* renamed from: q */
    private static final InterfaceC6108l f29507q = C11528g.f29526w;

    /* renamed from: d */
    private final C11533m f29508d;

    /* renamed from: e */
    private final float f29509e;

    /* renamed from: f */
    private final float f29510f;

    /* renamed from: g */
    private final C11532l f29511g;

    /* renamed from: h */
    private final float[] f29512h;

    /* renamed from: i */
    private final float[] f29513i;

    /* renamed from: j */
    private final float[] f29514j;

    /* renamed from: k */
    private final InterfaceC6108l f29515k;

    /* renamed from: l */
    private final InterfaceC6108l f29516l;

    /* renamed from: m */
    private final InterfaceC6108l f29517m;

    /* renamed from: n */
    private final InterfaceC6108l f29518n;

    /* renamed from: o */
    private final boolean f29519o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$a */
    /* loaded from: classes.dex */
    public static final class C11522a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C11532l f29520w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11522a(C11532l c11532l) {
            super(1);
            this.f29520w = c11532l;
        }

        /* renamed from: a */
        public final Double m4835a(double d) {
            return Double.valueOf(ColorSpace.m4903n(d, this.f29520w.m4814a(), this.f29520w.m4813b(), this.f29520w.m4812c(), this.f29520w.m4811d(), this.f29520w.m4808g()));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4835a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$b */
    /* loaded from: classes.dex */
    public static final class C11523b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C11532l f29521w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11523b(C11532l c11532l) {
            super(1);
            this.f29521w = c11532l;
        }

        /* renamed from: a */
        public final Double m4834a(double d) {
            return Double.valueOf(ColorSpace.m4902o(d, this.f29521w.m4814a(), this.f29521w.m4813b(), this.f29521w.m4812c(), this.f29521w.m4811d(), this.f29521w.m4810e(), this.f29521w.m4809f(), this.f29521w.m4808g()));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4834a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$c */
    /* loaded from: classes.dex */
    public static final class C11524c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C11532l f29522w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11524c(C11532l c11532l) {
            super(1);
            this.f29522w = c11532l;
        }

        /* renamed from: a */
        public final Double m4833a(double d) {
            return Double.valueOf(ColorSpace.m4901p(d, this.f29522w.m4814a(), this.f29522w.m4813b(), this.f29522w.m4812c(), this.f29522w.m4811d(), this.f29522w.m4808g()));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4833a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$d */
    /* loaded from: classes.dex */
    public static final class C11525d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C11532l f29523w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11525d(C11532l c11532l) {
            super(1);
            this.f29523w = c11532l;
        }

        /* renamed from: a */
        public final Double m4832a(double d) {
            return Double.valueOf(ColorSpace.m4900q(d, this.f29523w.m4814a(), this.f29523w.m4813b(), this.f29523w.m4812c(), this.f29523w.m4811d(), this.f29523w.m4810e(), this.f29523w.m4809f(), this.f29523w.m4808g()));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4832a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$e */
    /* loaded from: classes.dex */
    public static final class C11526e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ double f29524w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11526e(double d) {
            super(1);
            this.f29524w = d;
        }

        /* renamed from: a */
        public final Double m4831a(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, 1.0d / this.f29524w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4831a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$f */
    /* loaded from: classes.dex */
    public static final class C11527f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ double f29525w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11527f(double d) {
            super(1);
            this.f29525w = d;
        }

        /* renamed from: a */
        public final Double m4830a(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, this.f29525w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4830a(((Number) obj).doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$g */
    /* loaded from: classes.dex */
    static final class C11528g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C11528g f29526w = new C11528g();

        C11528g() {
            super(1);
        }

        /* renamed from: a */
        public final Double m4829a(double d) {
            return Double.valueOf(d);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4829a(((Number) obj).doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$h */
    /* loaded from: classes.dex */
    public static final class C11529h {
        private C11529h() {
        }

        public /* synthetic */ C11529h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ float[] m4828a(C11529h c11529h, float[] fArr, C11533m c11533m) {
            return c11529h.m4822g(fArr, c11533m);
        }

        /* renamed from: b */
        public static final /* synthetic */ boolean m4827b(C11529h c11529h, float[] fArr, C11533m c11533m, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, float f, float f2, int i) {
            return c11529h.m4819j(fArr, c11533m, interfaceC6108l, interfaceC6108l2, f, f2, i);
        }

        /* renamed from: c */
        public static final /* synthetic */ boolean m4826c(C11529h c11529h, float[] fArr, float f, float f2) {
            return c11529h.m4818k(fArr, f, f2);
        }

        /* renamed from: d */
        public static final /* synthetic */ float[] m4825d(C11529h c11529h, float[] fArr) {
            return c11529h.m4817l(fArr);
        }

        /* renamed from: e */
        private final float m4824e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        /* renamed from: f */
        private final boolean m4823f(double d, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            return Math.abs(((Number) interfaceC6108l.mo9587d(Double.valueOf(d))).doubleValue() - ((Number) interfaceC6108l2.mo9587d(Double.valueOf(d))).doubleValue()) <= 0.001d;
        }

        /* renamed from: g */
        private final float[] m4822g(float[] fArr, C11533m c11533m) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float m4807a = c11533m.m4807a();
            float m4806b = c11533m.m4806b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (m4807a / m4806b) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - m4807a) / m4806b) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        /* renamed from: h */
        private final boolean m4821h(float[] fArr, float[] fArr2) {
            float[] fArr3 = {fArr[0] - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            return m4820i(fArr3[0], fArr3[1], fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) >= 0.0f && m4820i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && m4820i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && m4820i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && m4820i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && m4820i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        /* renamed from: i */
        private final float m4820i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: j */
        private final boolean m4819j(float[] fArr, C11533m c11533m, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            C11511e c11511e = C11511e.f29459a;
            if (ColorSpace.m4910g(fArr, c11511e.m4881s()) && ColorSpace.m4911f(c11533m, C11517g.f29492a.m4866e())) {
                if (f == 0.0f) {
                    if (f2 == 1.0f) {
                        Rgb m4882r = c11511e.m4882r();
                        for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                            if (!m4823f(d, interfaceC6108l, m4882r.m4838p()) || !m4823f(d, interfaceC6108l2, m4882r.m4841m())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* renamed from: k */
        private final boolean m4818k(float[] fArr, float f, float f2) {
            float m4824e = m4824e(fArr);
            C11511e c11511e = C11511e.f29459a;
            return (m4824e / m4824e(c11511e.m4885o()) > 0.9f && m4821h(fArr, c11511e.m4881s())) || (f < 0.0f && f2 > 1.0f);
        }

        /* renamed from: l */
        private final float[] m4817l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0] + fArr[1] + fArr[2];
                fArr2[0] = fArr[0] / f;
                fArr2[1] = fArr[1] / f;
                float f2 = fArr[3] + fArr[4] + fArr[5];
                fArr2[2] = fArr[3] / f2;
                fArr2[3] = fArr[4] / f2;
                float f3 = fArr[6] + fArr[7] + fArr[8];
                fArr2[4] = fArr[6] / f3;
                fArr2[5] = fArr[7] / f3;
            } else {
                _ArraysJvm.m313k(fArr, fArr2, 0, 0, 6, 6, null);
            }
            return fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$i */
    /* loaded from: classes.dex */
    public static final class C11530i extends AbstractC6438m implements InterfaceC6108l {
        C11530i() {
            super(1);
        }

        /* renamed from: a */
        public final Double m4816a(double d) {
            double m14998k;
            InterfaceC6108l m4841m = Rgb.this.m4841m();
            m14998k = _Ranges.m14998k(d, Rgb.m4843k(Rgb.this), Rgb.m4844j(Rgb.this));
            return (Double) m4841m.mo9587d(Double.valueOf(m14998k));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4816a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Rgb.kt */
    /* renamed from: w0.k$j */
    /* loaded from: classes.dex */
    public static final class C11531j extends AbstractC6438m implements InterfaceC6108l {
        C11531j() {
            super(1);
        }

        /* renamed from: a */
        public final Double m4815a(double d) {
            double m14998k;
            m14998k = _Ranges.m14998k(((Number) Rgb.this.m4838p().mo9587d(Double.valueOf(d))).doubleValue(), Rgb.m4843k(Rgb.this), Rgb.m4844j(Rgb.this));
            return Double.valueOf(m14998k);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m4815a(((Number) obj).doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, C11533m c11533m, float[] fArr2, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, float f, float f2, C11532l c11532l, int i) {
        super(str, C11507b.f29451a.m4927b(), i, null);
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(fArr, "primaries");
        Intrinsics.isThisObjectNull(c11533m, "whitePoint");
        Intrinsics.isThisObjectNull(interfaceC6108l, "oetf");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "eotf");
        this.f29508d = c11533m;
        this.f29509e = f;
        this.f29510f = f2;
        this.f29511g = c11532l;
        this.f29515k = interfaceC6108l;
        this.f29516l = new C11531j();
        this.f29517m = interfaceC6108l2;
        this.f29518n = new C11530i();
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            C11529h c11529h = f29506p;
            float[] m4825d = C11529h.m4825d(c11529h, fArr);
            this.f29512h = m4825d;
            if (fArr2 == null) {
                this.f29513i = C11529h.m4828a(c11529h, m4825d, c11533m);
            } else if (fArr2.length == 9) {
                this.f29513i = fArr2;
            } else {
                throw new IllegalArgumentException(Intrinsics.addStrAndObj("Transform must have 9 entries! Has ", Integer.valueOf(fArr2.length)));
            }
            this.f29514j = ColorSpace.m4907j(this.f29513i);
            C11529h.m4826c(c11529h, m4825d, f, f2);
            this.f29519o = C11529h.m4827b(c11529h, m4825d, c11533m, interfaceC6108l, interfaceC6108l2, f, f2, i);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* renamed from: j */
    public static final /* synthetic */ float m4844j(Rgb rgb) {
        return rgb.f29510f;
    }

    /* renamed from: k */
    public static final /* synthetic */ float m4843k(Rgb rgb) {
        return rgb.f29509e;
    }

    /* renamed from: a */
    public float[] m4849a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        ColorSpace.m4904m(this.f29514j, fArr);
        fArr[0] = (float) ((Number) this.f29516l.mo9587d(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.f29516l.mo9587d(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.f29516l.mo9587d(Double.valueOf(fArr[2]))).doubleValue();
        return fArr;
    }

    /* renamed from: d */
    public float m4848d(int i) {
        return this.f29510f;
    }

    /* renamed from: e */
    public float m4847e(int i) {
        return this.f29509e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.equals(C6450z.m20906b(Rgb.class), C6450z.m20906b(obj.getClass())) && super.equals(obj)) {
            Rgb rgb = (Rgb) obj;
            if (Float.compare(rgb.f29509e, this.f29509e) == 0 && Float.compare(rgb.f29510f, this.f29510f) == 0 && Intrinsics.equals(this.f29508d, rgb.f29508d) && Arrays.equals(this.f29512h, rgb.f29512h)) {
                C11532l c11532l = this.f29511g;
                if (c11532l != null) {
                    return Intrinsics.equals(c11532l, rgb.f29511g);
                }
                if (rgb.f29511g == null) {
                    return true;
                }
                if (Intrinsics.equals(this.f29515k, rgb.f29515k)) {
                    return Intrinsics.equals(this.f29517m, rgb.f29517m);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m4846h() {
        return this.f29519o;
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f29508d.hashCode()) * 31) + Arrays.hashCode(this.f29512h)) * 31;
        float f = this.f29509e;
        int floatToIntBits = (hashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f29510f;
        int floatToIntBits2 = (floatToIntBits + (!(f2 == 0.0f) ? Float.floatToIntBits(f2) : 0)) * 31;
        C11532l c11532l = this.f29511g;
        int hashCode2 = floatToIntBits2 + (c11532l != null ? c11532l.hashCode() : 0);
        return this.f29511g == null ? (((hashCode2 * 31) + this.f29515k.hashCode()) * 31) + this.f29517m.hashCode() : hashCode2;
    }

    /* renamed from: i */
    public float[] m4845i(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        fArr[0] = (float) ((Number) this.f29518n.mo9587d(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.f29518n.mo9587d(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.f29518n.mo9587d(Double.valueOf(fArr[2]))).doubleValue();
        return ColorSpace.m4904m(this.f29513i, fArr);
    }

    /* renamed from: l */
    public final InterfaceC6108l m4842l() {
        return this.f29518n;
    }

    /* renamed from: m */
    public final InterfaceC6108l m4841m() {
        return this.f29517m;
    }

    /* renamed from: n */
    public final float[] m4840n() {
        return this.f29514j;
    }

    /* renamed from: o */
    public final InterfaceC6108l m4839o() {
        return this.f29516l;
    }

    /* renamed from: p */
    public final InterfaceC6108l m4838p() {
        return this.f29515k;
    }

    /* renamed from: q */
    public final float[] m4837q() {
        return this.f29513i;
    }

    /* renamed from: r */
    public final C11533m m4836r() {
        return this.f29508d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r13, float[] r14, p411w0.C11533m r15, p411w0.C11532l r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            p181jd.Intrinsics.isThisObjectNull(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            p181jd.Intrinsics.isThisObjectNull(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            p181jd.Intrinsics.isThisObjectNull(r15, r0)
            java.lang.String r0 = "function"
            p181jd.Intrinsics.isThisObjectNull(r9, r0)
            double r4 = r16.m4810e()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r5
        L28:
            if (r0 == 0) goto L3d
            double r10 = r16.m4809f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r4
            goto L35
        L34:
            r0 = r5
        L35:
            if (r0 == 0) goto L3d
            w0.k$a r0 = new w0.k$a
            r0.<init>(r9)
            goto L42
        L3d:
            w0.k$b r0 = new w0.k$b
            r0.<init>(r9)
        L42:
            r8 = r0
            double r10 = r16.m4810e()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r0 = r4
            goto L4e
        L4d:
            r0 = r5
        L4e:
            if (r0 == 0) goto L62
            double r10 = r16.m4809f()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            goto L5a
        L59:
            r4 = r5
        L5a:
            if (r4 == 0) goto L62
            w0.k$c r0 = new w0.k$c
            r0.<init>(r9)
            goto L67
        L62:
            w0.k$d r0 = new w0.k$d
            r0.<init>(r9)
        L67:
            r6 = r0
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p411w0.Rgb.<init>(java.lang.String, float[], w0.m, w0.l, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(java.lang.String r23, float[] r24, p411w0.C11533m r25, double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r15 = r23
            p181jd.Intrinsics.isThisObjectNull(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r24
            p181jd.Intrinsics.isThisObjectNull(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r25
            p181jd.Intrinsics.isThisObjectNull(r14, r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L21
            r5 = r3
            goto L22
        L21:
            r5 = r4
        L22:
            if (r5 == 0) goto L27
            id.l r5 = p411w0.Rgb.f29507q
            goto L2c
        L27:
            w0.k$e r5 = new w0.k$e
            r5.<init>(r1)
        L2c:
            r17 = r5
            if (r0 != 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L37
            id.l r0 = p411w0.Rgb.f29507q
            goto L3c
        L37:
            w0.k$f r0 = new w0.k$f
            r0.<init>(r1)
        L3c:
            r18 = r0
            w0.l r19 = new w0.l
            r0 = r19
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r20 = 0
            r13 = r20
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p411w0.Rgb.<init>(java.lang.String, float[], w0.m, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, C11533m c11533m) {
        this(rgb.m4919g(), rgb.f29512h, c11533m, fArr, rgb.f29515k, rgb.f29517m, rgb.f29509e, rgb.f29510f, rgb.f29511g, -1);
        Intrinsics.isThisObjectNull(rgb, "colorSpace");
        Intrinsics.isThisObjectNull(fArr, "transform");
        Intrinsics.isThisObjectNull(c11533m, "whitePoint");
    }
}
