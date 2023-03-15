package p286p1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p359t1.AbstractC10364e;
import p359t1.C10366h;
import p359t1.C10368i;
import p359t1.FontWeight;
import p393v0.C10995a1;
import p393v0.Color;
import p394v1.LocaleList;
import p457y1.C13058a;
import p457y1.C13061c;
import p457y1.C13064e;
import p457y1.C13066f;
import p457y1.C13068g;
import p457y1.TextDecoration;
import p479z1.C13619p;
import p479z1.C13621q;

/* renamed from: p1.y */
/* loaded from: classes.dex */
public final class TextStyle {

    /* renamed from: s */
    public static final C8396a f21721s = new C8396a(null);

    /* renamed from: t */
    private static final TextStyle f21722t = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);

    /* renamed from: a */
    private final long f21723a;

    /* renamed from: b */
    private final long f21724b;

    /* renamed from: c */
    private final FontWeight f21725c;

    /* renamed from: d */
    private final C10366h f21726d;

    /* renamed from: e */
    private final C10368i f21727e;

    /* renamed from: f */
    private final AbstractC10364e f21728f;

    /* renamed from: g */
    private final String f21729g;

    /* renamed from: h */
    private final long f21730h;

    /* renamed from: i */
    private final C13058a f21731i;

    /* renamed from: j */
    private final C13066f f21732j;

    /* renamed from: k */
    private final LocaleList f21733k;

    /* renamed from: l */
    private final long f21734l;

    /* renamed from: m */
    private final TextDecoration f21735m;

    /* renamed from: n */
    private final C10995a1 f21736n;

    /* renamed from: o */
    private final C13061c f21737o;

    /* renamed from: p */
    private final C13064e f21738p;

    /* renamed from: q */
    private final long f21739q;

    /* renamed from: r */
    private final C13068g f21740r;

    /* compiled from: TextStyle.kt */
    /* renamed from: p1.y$a */
    /* loaded from: classes.dex */
    public static final class C8396a {
        private C8396a() {
        }

        public /* synthetic */ C8396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TextStyle m15501a() {
            return TextStyle.m15526a();
        }
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, C13061c c13061c, C13064e c13064e, long j5, C13068g c13068g) {
        this.f21723a = j;
        this.f21724b = j2;
        this.f21725c = fontWeight;
        this.f21726d = c10366h;
        this.f21727e = c10368i;
        this.f21728f = abstractC10364e;
        this.f21729g = str;
        this.f21730h = j3;
        this.f21731i = c13058a;
        this.f21732j = c13066f;
        this.f21733k = localeList;
        this.f21734l = j4;
        this.f21735m = textDecoration;
        this.f21736n = c10995a1;
        this.f21737o = c13061c;
        this.f21738p = c13064e;
        this.f21739q = j5;
        this.f21740r = c13068g;
        if (C13621q.m802d(m15513n())) {
            return;
        }
        if (C13619p.m810h(m15513n()) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + C13619p.m810h(m15513n()) + ')').toString());
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, C13061c c13061c, C13064e c13064e, long j5, C13068g c13068g, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, c10366h, c10368i, abstractC10364e, str, j3, c13058a, c13066f, localeList, j4, textDecoration, c10995a1, c13061c, c13064e, j5, c13068g);
    }

    /* renamed from: a */
    public static final /* synthetic */ TextStyle m15526a() {
        return f21722t;
    }

    /* renamed from: c */
    public static /* synthetic */ TextStyle m15524c(TextStyle textStyle, long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, C13061c c13061c, C13064e c13064e, long j5, C13068g c13068g, int i, Object obj) {
        return textStyle.m15525b((i & 1) != 0 ? textStyle.m15521f() : j, (i & 2) != 0 ? textStyle.m15518i() : j2, (i & 4) != 0 ? textStyle.f21725c : fontWeight, (i & 8) != 0 ? textStyle.m15517j() : c10366h, (i & 16) != 0 ? textStyle.m15516k() : c10368i, (i & 32) != 0 ? textStyle.f21728f : abstractC10364e, (i & 64) != 0 ? textStyle.f21729g : str, (i & 128) != 0 ? textStyle.m15514m() : j3, (i & 256) != 0 ? textStyle.m15522e() : c13058a, (i & 512) != 0 ? textStyle.f21732j : c13066f, (i & 1024) != 0 ? textStyle.f21733k : localeList, (i & 2048) != 0 ? textStyle.m15523d() : j4, (i & 4096) != 0 ? textStyle.f21735m : textDecoration, (i & 8192) != 0 ? textStyle.f21736n : c10995a1, (i & 16384) != 0 ? textStyle.m15510q() : c13061c, (i & 32768) != 0 ? textStyle.m15508s() : c13064e, (i & 65536) != 0 ? textStyle.m15513n() : j5, (i & 131072) != 0 ? textStyle.f21740r : c13068g);
    }

    /* renamed from: b */
    public final TextStyle m15525b(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, C13061c c13061c, C13064e c13064e, long j5, C13068g c13068g) {
        return new TextStyle(j, j2, fontWeight, c10366h, c10368i, abstractC10364e, str, j3, c13058a, c13066f, localeList, j4, textDecoration, c10995a1, c13061c, c13064e, j5, c13068g, null);
    }

    /* renamed from: d */
    public final long m15523d() {
        return this.f21734l;
    }

    /* renamed from: e */
    public final C13058a m15522e() {
        return this.f21731i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) obj;
            return Color.m6646n(m15521f(), textStyle.m15521f()) && C13619p.m813e(m15518i(), textStyle.m15518i()) && Intrinsics.equals(this.f21725c, textStyle.f21725c) && Intrinsics.equals(m15517j(), textStyle.m15517j()) && Intrinsics.equals(m15516k(), textStyle.m15516k()) && Intrinsics.equals(this.f21728f, textStyle.f21728f) && Intrinsics.equals(this.f21729g, textStyle.f21729g) && C13619p.m813e(m15514m(), textStyle.m15514m()) && Intrinsics.equals(m15522e(), textStyle.m15522e()) && Intrinsics.equals(this.f21732j, textStyle.f21732j) && Intrinsics.equals(this.f21733k, textStyle.f21733k) && Color.m6646n(m15523d(), textStyle.m15523d()) && Intrinsics.equals(this.f21735m, textStyle.f21735m) && Intrinsics.equals(this.f21736n, textStyle.f21736n) && Intrinsics.equals(m15510q(), textStyle.m15510q()) && Intrinsics.equals(m15508s(), textStyle.m15508s()) && C13619p.m813e(m15513n(), textStyle.m15513n()) && Intrinsics.equals(this.f21740r, textStyle.f21740r);
        }
        return false;
    }

    /* renamed from: f */
    public final long m15521f() {
        return this.f21723a;
    }

    /* renamed from: g */
    public final AbstractC10364e m15520g() {
        return this.f21728f;
    }

    /* renamed from: h */
    public final String m15519h() {
        return this.f21729g;
    }

    public int hashCode() {
        int m6640t = ((Color.m6640t(m15521f()) * 31) + C13619p.m809i(m15518i())) * 31;
        FontWeight fontWeight = this.f21725c;
        int hashCode = (m6640t + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        C10366h m15517j = m15517j();
        int m8132g = (hashCode + (m15517j == null ? 0 : C10366h.m8132g(m15517j.m8130i()))) * 31;
        C10368i m15516k = m15516k();
        int m8121g = (m8132g + (m15516k == null ? 0 : C10368i.m8121g(m15516k.m8117k()))) * 31;
        AbstractC10364e abstractC10364e = this.f21728f;
        int hashCode2 = (m8121g + (abstractC10364e == null ? 0 : abstractC10364e.hashCode())) * 31;
        String str = this.f21729g;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C13619p.m809i(m15514m())) * 31;
        C13058a m15522e = m15522e();
        int m1751f = (hashCode3 + (m15522e == null ? 0 : C13058a.m1751f(m15522e.m1749h()))) * 31;
        C13066f c13066f = this.f21732j;
        int hashCode4 = (m1751f + (c13066f == null ? 0 : c13066f.hashCode())) * 31;
        LocaleList localeList = this.f21733k;
        int hashCode5 = (((hashCode4 + (localeList == null ? 0 : localeList.hashCode())) * 31) + Color.m6640t(m15523d())) * 31;
        TextDecoration textDecoration = this.f21735m;
        int hashCode6 = (hashCode5 + (textDecoration == null ? 0 : textDecoration.hashCode())) * 31;
        C10995a1 c10995a1 = this.f21736n;
        int hashCode7 = (hashCode6 + (c10995a1 == null ? 0 : c10995a1.hashCode())) * 31;
        C13061c m15510q = m15510q();
        int m1737k = (hashCode7 + (m15510q == null ? 0 : C13061c.m1737k(m15510q.m1735m()))) * 31;
        C13064e m15508s = m15508s();
        int m1711j = (((m1737k + (m15508s == null ? 0 : C13064e.m1711j(m15508s.m1709l()))) * 31) + C13619p.m809i(m15513n())) * 31;
        C13068g c13068g = this.f21740r;
        return m1711j + (c13068g != null ? c13068g.hashCode() : 0);
    }

    /* renamed from: i */
    public final long m15518i() {
        return this.f21724b;
    }

    /* renamed from: j */
    public final C10366h m15517j() {
        return this.f21726d;
    }

    /* renamed from: k */
    public final C10368i m15516k() {
        return this.f21727e;
    }

    /* renamed from: l */
    public final FontWeight m15515l() {
        return this.f21725c;
    }

    /* renamed from: m */
    public final long m15514m() {
        return this.f21730h;
    }

    /* renamed from: n */
    public final long m15513n() {
        return this.f21739q;
    }

    /* renamed from: o */
    public final LocaleList m15512o() {
        return this.f21733k;
    }

    /* renamed from: p */
    public final C10995a1 m15511p() {
        return this.f21736n;
    }

    /* renamed from: q */
    public final C13061c m15510q() {
        return this.f21737o;
    }

    /* renamed from: r */
    public final TextDecoration m15509r() {
        return this.f21735m;
    }

    /* renamed from: s */
    public final C13064e m15508s() {
        return this.f21738p;
    }

    /* renamed from: t */
    public final C13066f m15507t() {
        return this.f21732j;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m6639u(m15521f())) + ", fontSize=" + ((Object) C13619p.m808j(m15518i())) + ", fontWeight=" + this.f21725c + ", fontStyle=" + m15517j() + ", fontSynthesis=" + m15516k() + ", fontFamily=" + this.f21728f + ", fontFeatureSettings=" + ((Object) this.f21729g) + ", letterSpacing=" + ((Object) C13619p.m808j(m15514m())) + ", baselineShift=" + m15522e() + ", textGeometricTransform=" + this.f21732j + ", localeList=" + this.f21733k + ", background=" + ((Object) Color.m6639u(m15523d())) + ", textDecoration=" + this.f21735m + ", shadow=" + this.f21736n + ", textAlign=" + m15510q() + ", textDirection=" + m15508s() + ", lineHeight=" + ((Object) C13619p.m808j(m15513n())) + ", textIndent=" + this.f21740r + ')';
    }

    /* renamed from: u */
    public final C13068g m15506u() {
        return this.f21740r;
    }

    /* renamed from: v */
    public final TextStyle m15505v(C8349n c8349n) {
        Intrinsics.isThisObjectNull(c8349n, "other");
        return new TextStyle(m15502y(), m15503x().m15674g(c8349n));
    }

    /* renamed from: w */
    public final TextStyle m15504w(TextStyle textStyle) {
        return (textStyle == null || Intrinsics.equals(textStyle, f21722t)) ? this : new TextStyle(m15502y().m15582o(textStyle.m15502y()), m15503x().m15674g(textStyle.m15503x()));
    }

    /* renamed from: x */
    public final C8349n m15503x() {
        return new C8349n(m15510q(), m15508s(), m15513n(), this.f21740r, null);
    }

    /* renamed from: y */
    public final C8391r m15502y() {
        return new C8391r(m15521f(), m15518i(), this.f21725c, m15517j(), m15516k(), this.f21728f, this.f21729g, m15514m(), m15522e(), this.f21732j, this.f21733k, m15523d(), this.f21735m, this.f21736n, null);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, C13061c c13061c, C13064e c13064e, long j5, C13068g c13068g, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.f28297b.m6632f() : j, (i & 2) != 0 ? C13619p.f34613b.m806a() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : c10366h, (i & 16) != 0 ? null : c10368i, (i & 32) != 0 ? null : abstractC10364e, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C13619p.f34613b.m806a() : j3, (i & 256) != 0 ? null : c13058a, (i & 512) != 0 ? null : c13066f, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.f28297b.m6632f() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : c10995a1, (i & 16384) != 0 ? null : c13061c, (i & 32768) != 0 ? null : c13064e, (i & 65536) != 0 ? C13619p.f34613b.m806a() : j5, (i & 131072) != 0 ? null : c13068g, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStyle(C8391r c8391r, C8349n c8349n) {
        this(c8391r.m15594c(), c8391r.m15591f(), c8391r.m15588i(), c8391r.m15590g(), c8391r.m15589h(), c8391r.m15593d(), c8391r.m15592e(), c8391r.m15587j(), c8391r.m15595b(), c8391r.m15583n(), c8391r.m15586k(), c8391r.m15596a(), c8391r.m15584m(), c8391r.m15585l(), c8349n.m15677d(), c8349n.m15676e(), c8349n.m15678c(), c8349n.m15675f(), null);
        Intrinsics.isThisObjectNull(c8391r, "spanStyle");
        Intrinsics.isThisObjectNull(c8349n, "paragraphStyle");
    }
}
