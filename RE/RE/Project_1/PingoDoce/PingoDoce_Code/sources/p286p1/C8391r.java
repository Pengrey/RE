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
import p457y1.C13066f;
import p457y1.TextDecoration;
import p479z1.C13619p;
import p479z1.C13621q;

/* renamed from: p1.r */
/* loaded from: classes.dex */
public final class C8391r {

    /* renamed from: a */
    private final long f21687a;

    /* renamed from: b */
    private final long f21688b;

    /* renamed from: c */
    private final FontWeight f21689c;

    /* renamed from: d */
    private final C10366h f21690d;

    /* renamed from: e */
    private final C10368i f21691e;

    /* renamed from: f */
    private final AbstractC10364e f21692f;

    /* renamed from: g */
    private final String f21693g;

    /* renamed from: h */
    private final long f21694h;

    /* renamed from: i */
    private final C13058a f21695i;

    /* renamed from: j */
    private final C13066f f21696j;

    /* renamed from: k */
    private final LocaleList f21697k;

    /* renamed from: l */
    private final long f21698l;

    /* renamed from: m */
    private final TextDecoration f21699m;

    /* renamed from: n */
    private final C10995a1 f21700n;

    private C8391r(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1) {
        this.f21687a = j;
        this.f21688b = j2;
        this.f21689c = fontWeight;
        this.f21690d = c10366h;
        this.f21691e = c10368i;
        this.f21692f = abstractC10364e;
        this.f21693g = str;
        this.f21694h = j3;
        this.f21695i = c13058a;
        this.f21696j = c13066f;
        this.f21697k = localeList;
        this.f21698l = j4;
        this.f21699m = textDecoration;
        this.f21700n = c10995a1;
    }

    public /* synthetic */ C8391r(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, c10366h, c10368i, abstractC10364e, str, j3, c13058a, c13066f, localeList, j4, textDecoration, c10995a1);
    }

    /* renamed from: a */
    public final long m15596a() {
        return this.f21698l;
    }

    /* renamed from: b */
    public final C13058a m15595b() {
        return this.f21695i;
    }

    /* renamed from: c */
    public final long m15594c() {
        return this.f21687a;
    }

    /* renamed from: d */
    public final AbstractC10364e m15593d() {
        return this.f21692f;
    }

    /* renamed from: e */
    public final String m15592e() {
        return this.f21693g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8391r) {
            C8391r c8391r = (C8391r) obj;
            return Color.m6646n(m15594c(), c8391r.m15594c()) && C13619p.m813e(m15591f(), c8391r.m15591f()) && Intrinsics.equals(this.f21689c, c8391r.f21689c) && Intrinsics.equals(m15590g(), c8391r.m15590g()) && Intrinsics.equals(m15589h(), c8391r.m15589h()) && Intrinsics.equals(this.f21692f, c8391r.f21692f) && Intrinsics.equals(this.f21693g, c8391r.f21693g) && C13619p.m813e(m15587j(), c8391r.m15587j()) && Intrinsics.equals(m15595b(), c8391r.m15595b()) && Intrinsics.equals(this.f21696j, c8391r.f21696j) && Intrinsics.equals(this.f21697k, c8391r.f21697k) && Color.m6646n(m15596a(), c8391r.m15596a()) && Intrinsics.equals(this.f21699m, c8391r.f21699m) && Intrinsics.equals(this.f21700n, c8391r.f21700n);
        }
        return false;
    }

    /* renamed from: f */
    public final long m15591f() {
        return this.f21688b;
    }

    /* renamed from: g */
    public final C10366h m15590g() {
        return this.f21690d;
    }

    /* renamed from: h */
    public final C10368i m15589h() {
        return this.f21691e;
    }

    public int hashCode() {
        int m6640t = ((Color.m6640t(m15594c()) * 31) + C13619p.m809i(m15591f())) * 31;
        FontWeight fontWeight = this.f21689c;
        int hashCode = (m6640t + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        C10366h m15590g = m15590g();
        int m8132g = (hashCode + (m15590g == null ? 0 : C10366h.m8132g(m15590g.m8130i()))) * 31;
        C10368i m15589h = m15589h();
        int m8121g = (m8132g + (m15589h == null ? 0 : C10368i.m8121g(m15589h.m8117k()))) * 31;
        AbstractC10364e abstractC10364e = this.f21692f;
        int hashCode2 = (m8121g + (abstractC10364e == null ? 0 : abstractC10364e.hashCode())) * 31;
        String str = this.f21693g;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C13619p.m809i(m15587j())) * 31;
        C13058a m15595b = m15595b();
        int m1751f = (hashCode3 + (m15595b == null ? 0 : C13058a.m1751f(m15595b.m1749h()))) * 31;
        C13066f c13066f = this.f21696j;
        int hashCode4 = (m1751f + (c13066f == null ? 0 : c13066f.hashCode())) * 31;
        LocaleList localeList = this.f21697k;
        int hashCode5 = (((hashCode4 + (localeList == null ? 0 : localeList.hashCode())) * 31) + Color.m6640t(m15596a())) * 31;
        TextDecoration textDecoration = this.f21699m;
        int hashCode6 = (hashCode5 + (textDecoration == null ? 0 : textDecoration.hashCode())) * 31;
        C10995a1 c10995a1 = this.f21700n;
        return hashCode6 + (c10995a1 != null ? c10995a1.hashCode() : 0);
    }

    /* renamed from: i */
    public final FontWeight m15588i() {
        return this.f21689c;
    }

    /* renamed from: j */
    public final long m15587j() {
        return this.f21694h;
    }

    /* renamed from: k */
    public final LocaleList m15586k() {
        return this.f21697k;
    }

    /* renamed from: l */
    public final C10995a1 m15585l() {
        return this.f21700n;
    }

    /* renamed from: m */
    public final TextDecoration m15584m() {
        return this.f21699m;
    }

    /* renamed from: n */
    public final C13066f m15583n() {
        return this.f21696j;
    }

    /* renamed from: o */
    public final C8391r m15582o(C8391r c8391r) {
        long m15587j;
        if (c8391r == null) {
            return this;
        }
        long m15594c = c8391r.m15594c();
        Color.C10994a c10994a = Color.f28297b;
        if (!(m15594c != c10994a.m6632f())) {
            m15594c = m15594c();
        }
        long j = m15594c;
        AbstractC10364e abstractC10364e = c8391r.f21692f;
        if (abstractC10364e == null) {
            abstractC10364e = this.f21692f;
        }
        AbstractC10364e abstractC10364e2 = abstractC10364e;
        long m15591f = !C13621q.m802d(c8391r.m15591f()) ? c8391r.m15591f() : m15591f();
        FontWeight fontWeight = c8391r.f21689c;
        if (fontWeight == null) {
            fontWeight = this.f21689c;
        }
        FontWeight fontWeight2 = fontWeight;
        C10366h m15590g = c8391r.m15590g();
        if (m15590g == null) {
            m15590g = m15590g();
        }
        C10366h c10366h = m15590g;
        C10368i m15589h = c8391r.m15589h();
        if (m15589h == null) {
            m15589h = m15589h();
        }
        C10368i c10368i = m15589h;
        String str = c8391r.f21693g;
        if (str == null) {
            str = this.f21693g;
        }
        String str2 = str;
        if (!C13621q.m802d(c8391r.m15587j())) {
            m15587j = c8391r.m15587j();
        } else {
            m15587j = m15587j();
        }
        long j2 = m15587j;
        C13058a m15595b = c8391r.m15595b();
        if (m15595b == null) {
            m15595b = m15595b();
        }
        C13058a c13058a = m15595b;
        C13066f c13066f = c8391r.f21696j;
        if (c13066f == null) {
            c13066f = this.f21696j;
        }
        C13066f c13066f2 = c13066f;
        LocaleList localeList = c8391r.f21697k;
        if (localeList == null) {
            localeList = this.f21697k;
        }
        LocaleList localeList2 = localeList;
        long m15596a = c8391r.m15596a();
        if (!(m15596a != c10994a.m6632f())) {
            m15596a = m15596a();
        }
        long j3 = m15596a;
        TextDecoration textDecoration = c8391r.f21699m;
        if (textDecoration == null) {
            textDecoration = this.f21699m;
        }
        TextDecoration textDecoration2 = textDecoration;
        C10995a1 c10995a1 = c8391r.f21700n;
        if (c10995a1 == null) {
            c10995a1 = this.f21700n;
        }
        return new C8391r(j, m15591f, fontWeight2, c10366h, c10368i, abstractC10364e2, str2, j2, c13058a, c13066f2, localeList2, j3, textDecoration2, c10995a1, null);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m6639u(m15594c())) + ", fontSize=" + ((Object) C13619p.m808j(m15591f())) + ", fontWeight=" + this.f21689c + ", fontStyle=" + m15590g() + ", fontSynthesis=" + m15589h() + ", fontFamily=" + this.f21692f + ", fontFeatureSettings=" + ((Object) this.f21693g) + ", letterSpacing=" + ((Object) C13619p.m808j(m15587j())) + ", baselineShift=" + m15595b() + ", textGeometricTransform=" + this.f21696j + ", localeList=" + this.f21697k + ", background=" + ((Object) Color.m6639u(m15596a())) + ", textDecoration=" + this.f21699m + ", shadow=" + this.f21700n + ')';
    }

    public /* synthetic */ C8391r(long j, long j2, FontWeight fontWeight, C10366h c10366h, C10368i c10368i, AbstractC10364e abstractC10364e, String str, long j3, C13058a c13058a, C13066f c13066f, LocaleList localeList, long j4, TextDecoration textDecoration, C10995a1 c10995a1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.f28297b.m6632f() : j, (i & 2) != 0 ? C13619p.f34613b.m806a() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : c10366h, (i & 16) != 0 ? null : c10368i, (i & 32) != 0 ? null : abstractC10364e, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C13619p.f34613b.m806a() : j3, (i & 256) != 0 ? null : c13058a, (i & 512) != 0 ? null : c13066f, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.f28297b.m6632f() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : c10995a1, null);
    }
}
