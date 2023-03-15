package p286p1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.Rect;
import p457y1.EnumC13060b;
import p479z1.C13615m;

/* compiled from: TextLayoutResult.kt */
/* renamed from: p1.u */
/* loaded from: classes.dex */
public final class C8392u {

    /* renamed from: a */
    private final TextLayoutResult f21711a;

    /* renamed from: b */
    private final MultiParagraph f21712b;

    /* renamed from: c */
    private final long f21713c;

    /* renamed from: d */
    private final float f21714d;

    /* renamed from: e */
    private final float f21715e;

    /* renamed from: f */
    private final List f21716f;

    private C8392u(TextLayoutResult textLayoutResult, MultiParagraph multiParagraph, long j) {
        this.f21711a = textLayoutResult;
        this.f21712b = multiParagraph;
        this.f21713c = j;
        this.f21714d = multiParagraph.m15748d();
        this.f21715e = multiParagraph.m15745g();
        this.f21716f = multiParagraph.m15736p();
    }

    public /* synthetic */ C8392u(TextLayoutResult textLayoutResult, MultiParagraph multiParagraph, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, multiParagraph, j);
    }

    /* renamed from: k */
    public static /* synthetic */ int m15555k(C8392u c8392u, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c8392u.m15556j(i, z);
    }

    /* renamed from: a */
    public final C8392u m15565a(TextLayoutResult textLayoutResult, long j) {
        Intrinsics.isThisObjectNull(textLayoutResult, "layoutInput");
        return new C8392u(textLayoutResult, this.f21712b, j, null);
    }

    /* renamed from: b */
    public final Rect m15564b(int i) {
        return this.f21712b.m15750b(i);
    }

    /* renamed from: c */
    public final boolean m15563c() {
        return this.f21712b.m15749c() || ((float) C13615m.m825f(m15546t())) < this.f21712b.m15747e();
    }

    /* renamed from: d */
    public final boolean m15562d() {
        return ((float) C13615m.m824g(m15546t())) < this.f21712b.m15735q();
    }

    /* renamed from: e */
    public final float m15561e() {
        return this.f21714d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8392u) {
            C8392u c8392u = (C8392u) obj;
            if (Intrinsics.equals(this.f21711a, c8392u.f21711a) && Intrinsics.equals(this.f21712b, c8392u.f21712b) && C13615m.m826e(m15546t(), c8392u.m15546t())) {
                if (this.f21714d == c8392u.f21714d) {
                    return ((this.f21715e > c8392u.f21715e ? 1 : (this.f21715e == c8392u.f21715e ? 0 : -1)) == 0) && Intrinsics.equals(this.f21716f, c8392u.f21716f);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m15560f() {
        return m15562d() || m15563c();
    }

    /* renamed from: g */
    public final float m15559g() {
        return this.f21715e;
    }

    /* renamed from: h */
    public final TextLayoutResult m15558h() {
        return this.f21711a;
    }

    public int hashCode() {
        return (((((((((this.f21711a.hashCode() * 31) + this.f21712b.hashCode()) * 31) + C13615m.m823h(m15546t())) * 31) + Float.hashCode(this.f21714d)) * 31) + Float.hashCode(this.f21715e)) * 31) + this.f21716f.hashCode();
    }

    /* renamed from: i */
    public final int m15557i() {
        return this.f21712b.m15744h();
    }

    /* renamed from: j */
    public final int m15556j(int i, boolean z) {
        return this.f21712b.m15743i(i, z);
    }

    /* renamed from: l */
    public final int m15554l(int i) {
        return this.f21712b.m15742j(i);
    }

    /* renamed from: m */
    public final int m15553m(float f) {
        return this.f21712b.m15741k(f);
    }

    /* renamed from: n */
    public final int m15552n(int i) {
        return this.f21712b.m15740l(i);
    }

    /* renamed from: o */
    public final float m15551o(int i) {
        return this.f21712b.m15739m(i);
    }

    /* renamed from: p */
    public final MultiParagraph m15550p() {
        return this.f21712b;
    }

    /* renamed from: q */
    public final int m15549q(long j) {
        return this.f21712b.m15738n(j);
    }

    /* renamed from: r */
    public final EnumC13060b m15548r(int i) {
        return this.f21712b.m15737o(i);
    }

    /* renamed from: s */
    public final List m15547s() {
        return this.f21716f;
    }

    /* renamed from: t */
    public final long m15546t() {
        return this.f21713c;
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f21711a + ", multiParagraph=" + this.f21712b + ", size=" + ((Object) C13615m.m822i(m15546t())) + ", firstBaseline=" + this.f21714d + ", lastBaseline=" + this.f21715e + ", placeholderRects=" + this.f21716f + ')';
    }
}
