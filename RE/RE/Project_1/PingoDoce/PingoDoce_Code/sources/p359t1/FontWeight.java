package p359t1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: t1.j */
/* loaded from: classes.dex */
public final class FontWeight implements Comparable {

    /* renamed from: A */
    private static final FontWeight f26964A;

    /* renamed from: B */
    private static final FontWeight f26965B;

    /* renamed from: C */
    private static final FontWeight f26966C;

    /* renamed from: D */
    private static final FontWeight f26967D;

    /* renamed from: E */
    private static final FontWeight f26968E;

    /* renamed from: F */
    private static final FontWeight f26969F;

    /* renamed from: G */
    private static final FontWeight f26970G;

    /* renamed from: H */
    private static final FontWeight f26971H;

    /* renamed from: I */
    private static final FontWeight f26972I;

    /* renamed from: J */
    private static final FontWeight f26973J;

    /* renamed from: K */
    private static final FontWeight f26974K;

    /* renamed from: L */
    private static final List f26975L;

    /* renamed from: x */
    public static final C10370a f26976x = new C10370a(null);

    /* renamed from: y */
    private static final FontWeight f26977y;

    /* renamed from: z */
    private static final FontWeight f26978z;

    /* renamed from: w */
    private final int f26979w;

    /* compiled from: FontWeight.kt */
    /* renamed from: t1.j$a */
    /* loaded from: classes.dex */
    public static final class C10370a {
        private C10370a() {
        }

        public /* synthetic */ C10370a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FontWeight m8105a() {
            return FontWeight.m8114b();
        }

        /* renamed from: b */
        public final FontWeight m8104b() {
            return FontWeight.m8113c();
        }

        /* renamed from: c */
        public final FontWeight m8103c() {
            return FontWeight.m8112d();
        }

        /* renamed from: d */
        public final FontWeight m8102d() {
            return FontWeight.m8111e();
        }

        /* renamed from: e */
        public final FontWeight m8101e() {
            return FontWeight.m8110f();
        }

        /* renamed from: f */
        public final FontWeight m8100f() {
            return FontWeight.m8109g();
        }

        /* renamed from: g */
        public final FontWeight m8099g() {
            return FontWeight.m8108h();
        }
    }

    static {
        List m194j;
        FontWeight fontWeight = new FontWeight(100);
        f26977y = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f26978z = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f26964A = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f26965B = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f26966C = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f26967D = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f26968E = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f26969F = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f26970G = fontWeight9;
        f26971H = fontWeight3;
        f26972I = fontWeight4;
        f26973J = fontWeight5;
        f26974K = fontWeight7;
        m194j = C13780s.m194j(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
        f26975L = m194j;
    }

    public FontWeight(int i) {
        this.f26979w = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("Font weight can be in range [1, 1000]. Current value: ", Integer.valueOf(m8106j())).toString());
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ FontWeight m8114b() {
        return f26974K;
    }

    /* renamed from: c */
    public static final /* synthetic */ FontWeight m8113c() {
        return f26971H;
    }

    /* renamed from: d */
    public static final /* synthetic */ FontWeight m8112d() {
        return f26973J;
    }

    /* renamed from: e */
    public static final /* synthetic */ FontWeight m8111e() {
        return f26972I;
    }

    /* renamed from: f */
    public static final /* synthetic */ FontWeight m8110f() {
        return f26965B;
    }

    /* renamed from: g */
    public static final /* synthetic */ FontWeight m8109g() {
        return f26966C;
    }

    /* renamed from: h */
    public static final /* synthetic */ FontWeight m8108h() {
        return f26967D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontWeight) && this.f26979w == ((FontWeight) obj).f26979w;
    }

    public int hashCode() {
        return this.f26979w;
    }

    /* renamed from: i */
    public int mo7763i(FontWeight fontWeight) {
        Intrinsics.isThisObjectNull(fontWeight, "other");
        return Intrinsics.isLessOrEqual(this.f26979w, fontWeight.f26979w);
    }

    /* renamed from: j */
    public final int m8106j() {
        return this.f26979w;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f26979w + ')';
    }
}
