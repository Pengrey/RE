package p411w0;

import id.InterfaceC6108l;
import p181jd.AbstractC6438m;

/* renamed from: w0.e */
/* loaded from: classes.dex */
public final class C11511e {

    /* renamed from: a */
    public static final C11511e f29459a = new C11511e();

    /* renamed from: b */
    private static final float[] f29460b;

    /* renamed from: c */
    private static final float[] f29461c;

    /* renamed from: d */
    private static final C11532l f29462d;

    /* renamed from: e */
    private static final C11532l f29463e;

    /* renamed from: f */
    private static final Rgb f29464f;

    /* renamed from: g */
    private static final Rgb f29465g;

    /* renamed from: h */
    private static final Rgb f29466h;

    /* renamed from: i */
    private static final Rgb f29467i;

    /* renamed from: j */
    private static final Rgb f29468j;

    /* renamed from: k */
    private static final Rgb f29469k;

    /* renamed from: l */
    private static final Rgb f29470l;

    /* renamed from: m */
    private static final Rgb f29471m;

    /* renamed from: n */
    private static final Rgb f29472n;

    /* renamed from: o */
    private static final Rgb f29473o;

    /* renamed from: p */
    private static final Rgb f29474p;

    /* renamed from: q */
    private static final Rgb f29475q;

    /* renamed from: r */
    private static final Rgb f29476r;

    /* renamed from: s */
    private static final Rgb f29477s;

    /* renamed from: t */
    private static final AbstractC11509c f29478t;

    /* renamed from: u */
    private static final AbstractC11509c f29479u;

    /* renamed from: v */
    private static final Rgb f29480v;

    /* renamed from: w */
    private static final AbstractC11509c f29481w;

    /* renamed from: x */
    private static final AbstractC11509c[] f29482x;

    /* compiled from: ColorSpaces.kt */
    /* renamed from: w0.e$a */
    /* loaded from: classes.dex */
    static final class C11512a extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: w */
        public static final C11512a f29483w = new C11512a();

        C11512a() {
            super(1);
        }

        /* renamed from: a */
        public final Double m4879a(double d) {
            return Double.valueOf(ColorSpace.m4916a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m4879a(d.doubleValue());
        }
    }

    /* compiled from: ColorSpaces.kt */
    /* renamed from: w0.e$b */
    /* loaded from: classes.dex */
    static final class C11513b extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: w */
        public static final C11513b f29484w = new C11513b();

        C11513b() {
            super(1);
        }

        /* renamed from: a */
        public final Double m4878a(double d) {
            return Double.valueOf(ColorSpace.m4915b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m4878a(d.doubleValue());
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f29460b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f29461c = fArr2;
        C11532l c11532l = new C11532l(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f29462d = c11532l;
        C11532l c11532l2 = new C11532l(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f29463e = c11532l2;
        C11517g c11517g = C11517g.f29492a;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, c11517g.m4866e(), c11532l, 0);
        f29464f = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, c11517g.m4866e(), 1.0d, 0.0f, 1.0f, 1);
        f29465g = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, c11517g.m4866e(), null, C11512a.f29483w, C11513b.f29484w, -0.799f, 2.399f, c11532l, 2);
        f29466h = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, c11517g.m4866e(), 1.0d, -0.5f, 7.499f, 3);
        f29467i = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c11517g.m4866e(), new C11532l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f29468j = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c11517g.m4866e(), new C11532l(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f29469k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C11533m(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f29470l = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c11517g.m4866e(), c11532l, 7);
        f29471m = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, c11517g.m4870a(), new C11532l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f29472n = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c11517g.m4866e(), new C11532l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f29473o = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c11517g.m4866e(), 2.2d, 0.0f, 1.0f, 10);
        f29474p = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, c11517g.m4869b(), new C11532l(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f29475q = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c11517g.m4867d(), 1.0d, -65504.0f, 65504.0f, 12);
        f29476r = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c11517g.m4867d(), 1.0d, -65504.0f, 65504.0f, 13);
        f29477s = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        f29478t = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        f29479u = lab;
        Rgb rgb15 = new Rgb("None", fArr, c11517g.m4866e(), c11532l2, 16);
        f29480v = rgb15;
        Oklab oklab = new Oklab("Oklab", 17);
        f29481w = oklab;
        f29482x = new AbstractC11509c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, oklab};
    }

    private C11511e() {
    }

    /* renamed from: a */
    public final Rgb m4899a() {
        return f29476r;
    }

    /* renamed from: b */
    public final Rgb m4898b() {
        return f29477s;
    }

    /* renamed from: c */
    public final Rgb m4897c() {
        return f29474p;
    }

    /* renamed from: d */
    public final Rgb m4896d() {
        return f29469k;
    }

    /* renamed from: e */
    public final Rgb m4895e() {
        return f29468j;
    }

    /* renamed from: f */
    public final AbstractC11509c m4894f() {
        return f29479u;
    }

    /* renamed from: g */
    public final AbstractC11509c m4893g() {
        return f29478t;
    }

    /* renamed from: h */
    public final AbstractC11509c[] m4892h() {
        return f29482x;
    }

    /* renamed from: i */
    public final Rgb m4891i() {
        return f29470l;
    }

    /* renamed from: j */
    public final Rgb m4890j() {
        return f29471m;
    }

    /* renamed from: k */
    public final Rgb m4889k() {
        return f29466h;
    }

    /* renamed from: l */
    public final Rgb m4888l() {
        return f29467i;
    }

    /* renamed from: m */
    public final Rgb m4887m() {
        return f29465g;
    }

    /* renamed from: n */
    public final Rgb m4886n() {
        return f29472n;
    }

    /* renamed from: o */
    public final float[] m4885o() {
        return f29461c;
    }

    /* renamed from: p */
    public final Rgb m4884p() {
        return f29475q;
    }

    /* renamed from: q */
    public final Rgb m4883q() {
        return f29473o;
    }

    /* renamed from: r */
    public final Rgb m4882r() {
        return f29464f;
    }

    /* renamed from: s */
    public final float[] m4881s() {
        return f29460b;
    }

    /* renamed from: t */
    public final Rgb m4880t() {
        return f29480v;
    }
}
