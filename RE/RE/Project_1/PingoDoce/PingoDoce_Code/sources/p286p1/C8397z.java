package p286p1;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
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
import p479z1.EnumC13618o;

/* compiled from: TextStyle.kt */
/* renamed from: p1.z */
/* loaded from: classes.dex */
public final class C8397z {

    /* renamed from: a */
    private static final long f21741a = C13621q.m803c(14);

    /* renamed from: b */
    private static final long f21742b = C13621q.m803c(0);

    /* renamed from: c */
    private static final long f21743c;

    /* renamed from: d */
    private static final long f21744d;

    /* renamed from: e */
    private static final long f21745e;

    /* compiled from: TextStyle.kt */
    /* renamed from: p1.z$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C8398a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21746a;

        static {
            int[] iArr = new int[EnumC13618o.values().length];
            iArr[EnumC13618o.Ltr.ordinal()] = 1;
            iArr[EnumC13618o.Rtl.ordinal()] = 2;
            f21746a = iArr;
        }
    }

    static {
        Color.C10994a c10994a = Color.f28297b;
        f21743c = c10994a.m6633e();
        f21744d = C13619p.f34613b.m806a();
        f21745e = c10994a.m6637a();
    }

    /* renamed from: a */
    public static final TextStyle m15500a(TextStyle textStyle, EnumC13618o enumC13618o) {
        long m15514m;
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(enumC13618o, "direction");
        long m15521f = textStyle.m15521f();
        Color.C10994a c10994a = Color.f28297b;
        if (!(m15521f != c10994a.m6632f())) {
            m15521f = f21745e;
        }
        long j = m15521f;
        long m15518i = C13621q.m802d(textStyle.m15518i()) ? f21741a : textStyle.m15518i();
        FontWeight m15515l = textStyle.m15515l();
        if (m15515l == null) {
            m15515l = FontWeight.f26976x.m8102d();
        }
        FontWeight fontWeight = m15515l;
        C10366h m15517j = textStyle.m15517j();
        C10366h m8136c = C10366h.m8136c(m15517j == null ? C10366h.f26954b.m8128b() : m15517j.m8130i());
        C10368i m15516k = textStyle.m15516k();
        C10368i m8125c = C10368i.m8125c(m15516k == null ? C10368i.f26958b.m8116a() : m15516k.m8117k());
        AbstractC10364e m15520g = textStyle.m15520g();
        if (m15520g == null) {
            m15520g = AbstractC10364e.f26951w.m8150a();
        }
        AbstractC10364e abstractC10364e = m15520g;
        String m15519h = textStyle.m15519h();
        if (m15519h == null) {
            m15519h = BuildConfig.VERSION_NAME;
        }
        String str = m15519h;
        if (C13621q.m802d(textStyle.m15514m())) {
            m15514m = f21742b;
        } else {
            m15514m = textStyle.m15514m();
        }
        long j2 = m15514m;
        C13058a m15522e = textStyle.m15522e();
        C13058a m1755b = C13058a.m1755b(m15522e == null ? C13058a.f33961b.m1748a() : m15522e.m1749h());
        C13066f m15507t = textStyle.m15507t();
        if (m15507t == null) {
            m15507t = C13066f.f33984c.m1700a();
        }
        C13066f c13066f = m15507t;
        LocaleList m15512o = textStyle.m15512o();
        if (m15512o == null) {
            m15512o = LocaleList.f28478y.m6181a();
        }
        LocaleList localeList = m15512o;
        long m15523d = textStyle.m15523d();
        if (!(m15523d != c10994a.m6632f())) {
            m15523d = f21743c;
        }
        long j3 = m15523d;
        TextDecoration m15509r = textStyle.m15509r();
        if (m15509r == null) {
            m15509r = TextDecoration.f33972b.m1722b();
        }
        TextDecoration textDecoration = m15509r;
        C10995a1 m15511p = textStyle.m15511p();
        if (m15511p == null) {
            m15511p = C10995a1.f28306d.m6626a();
        }
        C10995a1 c10995a1 = m15511p;
        C13061c m15510q = textStyle.m15510q();
        C13061c m1741g = C13061c.m1741g(m15510q == null ? C13061c.f33964b.m1729f() : m15510q.m1735m());
        C13064e m1715f = C13064e.m1715f(m15499b(enumC13618o, textStyle.m15508s()));
        long m15513n = C13621q.m802d(textStyle.m15513n()) ? f21744d : textStyle.m15513n();
        C13068g m15506u = textStyle.m15506u();
        if (m15506u == null) {
            m15506u = C13068g.f33988c.m1696a();
        }
        return new TextStyle(j, m15518i, fontWeight, m8136c, m8125c, abstractC10364e, str, j2, m1755b, c13066f, localeList, j3, textDecoration, c10995a1, m1741g, m1715f, m15513n, m15506u, null);
    }

    /* renamed from: b */
    public static final int m15499b(EnumC13618o enumC13618o, C13064e c13064e) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        C13064e.C13065a c13065a = C13064e.f33977b;
        if (c13064e == null ? false : C13064e.m1712i(c13064e.m1709l(), c13065a.m1708a())) {
            int i = C8398a.f21746a[enumC13618o.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return c13065a.m1706c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return c13065a.m1707b();
        } else if (c13064e == null) {
            int i2 = C8398a.f21746a[enumC13618o.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return c13065a.m1704e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return c13065a.m1705d();
        } else {
            return c13064e.m1709l();
        }
    }
}
