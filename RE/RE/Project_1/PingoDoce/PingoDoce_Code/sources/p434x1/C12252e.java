package p434x1;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p286p1.AnnotatedString;
import p286p1.C8339b;
import p286p1.C8391r;
import p286p1.TextStyle;
import p347s1.BaselineShiftSpan;
import p347s1.FontFeatureSpan;
import p347s1.LetterSpacingSpanEm;
import p347s1.LetterSpacingSpanPx;
import p347s1.LineHeightSpan;
import p347s1.ShadowSpan;
import p347s1.SkewXSpan;
import p347s1.TextDecorationSpan;
import p347s1.TypefaceSpan;
import p359t1.AbstractC10364e;
import p359t1.C10366h;
import p359t1.C10368i;
import p359t1.FontWeight;
import p373u0.C10774f;
import p393v0.C10995a1;
import p393v0.C11003c0;
import p393v0.Color;
import p394v1.Locale;
import p394v1.LocaleList;
import p412w1.C11545j;
import p457y1.C13058a;
import p457y1.C13066f;
import p457y1.C13068g;
import p457y1.TextDecoration;
import p468yc.C13195u;
import p479z1.C13619p;
import p479z1.C13621q;
import p479z1.C13622r;
import p479z1.Density;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* compiled from: SpannableExtensions.android.kt */
/* renamed from: x1.e */
/* loaded from: classes.dex */
public final class C12252e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableExtensions.android.kt */
    /* renamed from: x1.e$a */
    /* loaded from: classes.dex */
    public static final class C12253a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Spannable f32299w;

        /* renamed from: x */
        final /* synthetic */ C11545j f32300x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12253a(Spannable spannable, C11545j c11545j) {
            super(3);
            this.f32299w = spannable;
            this.f32300x = c11545j;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m3189a((C8391r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3189a(C8391r c8391r, int i, int i2) {
            Intrinsics.isThisObjectNull(c8391r, "spanStyle");
            Spannable spannable = this.f32299w;
            C11545j c11545j = this.f32300x;
            AbstractC10364e m15593d = c8391r.m15593d();
            FontWeight m15588i = c8391r.m15588i();
            if (m15588i == null) {
                m15588i = FontWeight.f26976x.m8102d();
            }
            C10366h m15590g = c8391r.m15590g();
            int m8128b = m15590g == null ? C10366h.f26954b.m8128b() : m15590g.m8130i();
            C10368i m15589h = c8391r.m15589h();
            spannable.setSpan(new TypefaceSpan(c11545j.m4756b(m15593d, m15588i, m8128b, m15589h == null ? C10368i.f26958b.m8116a() : m15589h.m8117k())), i, i2, 33);
        }
    }

    /* renamed from: a */
    private static final MetricAffectingSpan m3209a(long j, Density density) {
        long m811g = C13619p.m811g(j);
        C13622r.C13623a c13623a = C13622r.f34617b;
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            return new LetterSpacingSpanPx(density.m896Y(j));
        }
        if (C13622r.m794g(m811g, c13623a.m790a())) {
            return new LetterSpacingSpanEm(C13619p.m810h(j));
        }
        return null;
    }

    /* renamed from: b */
    public static final void m3208b(C8391r c8391r, List list, InterfaceC6113q interfaceC6113q) {
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(interfaceC6113q, "block");
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                interfaceC6113q.mo4533i(m3206d(c8391r, (C8391r) ((AnnotatedString.C8337a) list.get(0)).m15763e()), Integer.valueOf(((AnnotatedString.C8337a) list.get(0)).m15762f()), Integer.valueOf(((AnnotatedString.C8337a) list.get(0)).m15764d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) list.get(i3);
            numArr[i3] = Integer.valueOf(c8337a.m15762f());
            numArr[i3 + size] = Integer.valueOf(c8337a.m15764d());
        }
        _ArraysJvm.m302v(numArr);
        int intValue = ((Number) C13768k.m373C(numArr)).intValue();
        int i4 = 0;
        while (i4 < i) {
            int intValue2 = numArr[i4].intValue();
            i4++;
            if (intValue2 != intValue) {
                int size3 = list.size();
                C8391r c8391r2 = c8391r;
                int i5 = 0;
                while (i5 < size3) {
                    int i6 = i5 + 1;
                    AnnotatedString.C8337a c8337a2 = (AnnotatedString.C8337a) list.get(i5);
                    if (C8339b.m15755f(intValue, intValue2, c8337a2.m15762f(), c8337a2.m15764d())) {
                        c8391r2 = m3206d(c8391r2, (C8391r) c8337a2.m15763e());
                    }
                    i5 = i6;
                }
                if (c8391r2 != null) {
                    interfaceC6113q.mo4533i(c8391r2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    /* renamed from: c */
    private static final boolean m3207c(TextStyle textStyle) {
        return C12254f.m3186c(textStyle.m15502y()) || textStyle.m15516k() != null;
    }

    /* renamed from: d */
    private static final C8391r m3206d(C8391r c8391r, C8391r c8391r2) {
        return c8391r == null ? c8391r2 : c8391r.m15582o(c8391r2);
    }

    /* renamed from: e */
    public static final void m3205e(Spannable spannable, long j, int i, int i2) {
        Intrinsics.isThisObjectNull(spannable, "$this$setBackground");
        if (j != Color.f28297b.m6632f()) {
            m3195o(spannable, new BackgroundColorSpan(C11003c0.m6587i(j)), i, i2);
        }
    }

    /* renamed from: f */
    private static final void m3204f(Spannable spannable, C13058a c13058a, int i, int i2) {
        if (c13058a == null) {
            return;
        }
        m3195o(spannable, new BaselineShiftSpan(c13058a.m1749h()), i, i2);
    }

    /* renamed from: g */
    public static final void m3203g(Spannable spannable, long j, int i, int i2) {
        Intrinsics.isThisObjectNull(spannable, "$this$setColor");
        if (j != Color.f28297b.m6632f()) {
            m3195o(spannable, new ForegroundColorSpan(C11003c0.m6587i(j)), i, i2);
        }
    }

    /* renamed from: h */
    private static final void m3202h(Spannable spannable, TextStyle textStyle, List list, C11545j c11545j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Object obj = list.get(i);
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) obj;
            if (C12254f.m3186c((C8391r) c8337a.m15763e()) || ((C8391r) c8337a.m15763e()).m15589h() != null) {
                arrayList.add(obj);
            }
            i = i2;
        }
        m3208b(m3207c(textStyle) ? new C8391r(0L, 0L, textStyle.m15515l(), textStyle.m15517j(), textStyle.m15516k(), textStyle.m15520g(), null, 0L, null, null, null, 0L, null, null, 16323, null) : null, arrayList, new C12253a(spannable, c11545j));
    }

    /* renamed from: i */
    private static final void m3201i(Spannable spannable, String str, int i, int i2) {
        if (str == null) {
            return;
        }
        m3195o(spannable, new FontFeatureSpan(str), i, i2);
    }

    /* renamed from: j */
    public static final void m3200j(Spannable spannable, long j, Density density, int i, int i2) {
        int m19530c;
        Intrinsics.isThisObjectNull(spannable, "$this$setFontSize");
        Intrinsics.isThisObjectNull(density, "density");
        long m811g = C13619p.m811g(j);
        C13622r.C13623a c13623a = C13622r.f34617b;
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            m19530c = C7037c.m19530c(density.m896Y(j));
            m3195o(spannable, new AbsoluteSizeSpan(m19530c, false), i, i2);
        } else if (C13622r.m794g(m811g, c13623a.m790a())) {
            m3195o(spannable, new RelativeSizeSpan(C13619p.m810h(j)), i, i2);
        }
    }

    /* renamed from: k */
    private static final void m3199k(Spannable spannable, C13066f c13066f, int i, int i2) {
        if (c13066f == null) {
            return;
        }
        m3195o(spannable, new ScaleXSpan(c13066f.m1702b()), i, i2);
        m3195o(spannable, new SkewXSpan(c13066f.m1701c()), i, i2);
    }

    /* renamed from: l */
    public static final void m3198l(Spannable spannable, long j, float f, Density density) {
        Intrinsics.isThisObjectNull(spannable, "$this$setLineHeight");
        Intrinsics.isThisObjectNull(density, "density");
        long m811g = C13619p.m811g(j);
        C13622r.C13623a c13623a = C13622r.f34617b;
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            m3195o(spannable, new LineHeightSpan((int) Math.ceil(density.m896Y(j))), 0, spannable.length());
        } else if (C13622r.m794g(m811g, c13623a.m790a())) {
            m3195o(spannable, new LineHeightSpan((int) Math.ceil(C13619p.m810h(j) * f)), 0, spannable.length());
        }
    }

    /* renamed from: m */
    public static final void m3197m(Spannable spannable, LocaleList localeList, int i, int i2) {
        Object localeSpan;
        Intrinsics.isThisObjectNull(spannable, "<this>");
        if (localeList == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            localeSpan = C12249b.f32295a.m3218a(localeList);
        } else {
            localeSpan = new LocaleSpan(C12248a.m3219a(localeList.isEmpty() ? Locale.f28476b.m6187a() : localeList.m6184h(0)));
        }
        m3195o(spannable, localeSpan, i, i2);
    }

    /* renamed from: n */
    private static final void m3196n(Spannable spannable, C10995a1 c10995a1, int i, int i2) {
        if (c10995a1 == null) {
            return;
        }
        m3195o(spannable, new ShadowSpan(C11003c0.m6587i(c10995a1.m6628c()), C10774f.m7145k(c10995a1.m6627d()), C10774f.m7144l(c10995a1.m6627d()), c10995a1.m6629b()), i, i2);
    }

    /* renamed from: o */
    public static final void m3195o(Spannable spannable, Object obj, int i, int i2) {
        Intrinsics.isThisObjectNull(spannable, "<this>");
        Intrinsics.isThisObjectNull(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    /* renamed from: p */
    private static final void m3194p(Spannable spannable, AnnotatedString.C8337a c8337a, Density density, ArrayList arrayList) {
        int m15762f = c8337a.m15762f();
        int m15764d = c8337a.m15764d();
        C8391r c8391r = (C8391r) c8337a.m15763e();
        m3204f(spannable, c8391r.m15595b(), m15762f, m15764d);
        m3203g(spannable, c8391r.m15594c(), m15762f, m15764d);
        m3192r(spannable, c8391r.m15584m(), m15762f, m15764d);
        m3200j(spannable, c8391r.m15591f(), density, m15762f, m15764d);
        m3201i(spannable, c8391r.m15592e(), m15762f, m15764d);
        m3199k(spannable, c8391r.m15583n(), m15762f, m15764d);
        m3197m(spannable, c8391r.m15586k(), m15762f, m15764d);
        m3205e(spannable, c8391r.m15596a(), m15762f, m15764d);
        m3196n(spannable, c8391r.m15585l(), m15762f, m15764d);
        MetricAffectingSpan m3209a = m3209a(c8391r.m15587j(), density);
        if (m3209a == null) {
            return;
        }
        arrayList.add(new C12251d(m3209a, m15762f, m15764d));
    }

    /* renamed from: q */
    public static final void m3193q(Spannable spannable, TextStyle textStyle, List list, Density density, C11545j c11545j) {
        Intrinsics.isThisObjectNull(spannable, "<this>");
        Intrinsics.isThisObjectNull(textStyle, "contextTextStyle");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(c11545j, "typefaceAdapter");
        m3202h(spannable, textStyle, list, c11545j);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) list.get(i);
            int m15762f = c8337a.m15762f();
            int m15764d = c8337a.m15764d();
            if (m15762f >= 0 && m15762f < spannable.length() && m15764d > m15762f && m15764d <= spannable.length()) {
                m3194p(spannable, c8337a, density, arrayList);
            }
            i = i2;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C12251d c12251d = (C12251d) arrayList.get(i3);
            m3195o(spannable, c12251d.m3212a(), c12251d.m3211b(), c12251d.m3210c());
        }
    }

    /* renamed from: r */
    public static final void m3192r(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        Intrinsics.isThisObjectNull(spannable, "<this>");
        if (textDecoration == null) {
            return;
        }
        TextDecoration.C13063a c13063a = TextDecoration.f33972b;
        m3195o(spannable, new TextDecorationSpan(textDecoration.m1725d(c13063a.m1721c()), textDecoration.m1725d(c13063a.m1723a())), i, i2);
    }

    /* renamed from: s */
    public static final void m3191s(Spannable spannable, C13068g c13068g, float f, Density density) {
        float m810h;
        Intrinsics.isThisObjectNull(spannable, "<this>");
        Intrinsics.isThisObjectNull(density, "density");
        if (c13068g == null) {
            return;
        }
        if ((C13619p.m813e(c13068g.m1698b(), C13621q.m803c(0)) && C13619p.m813e(c13068g.m1697c(), C13621q.m803c(0))) || C13621q.m802d(c13068g.m1698b()) || C13621q.m802d(c13068g.m1697c())) {
            return;
        }
        long m811g = C13619p.m811g(c13068g.m1698b());
        C13622r.C13623a c13623a = C13622r.f34617b;
        float f2 = 0.0f;
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            m810h = density.m896Y(c13068g.m1698b());
        } else {
            m810h = C13622r.m794g(m811g, c13623a.m790a()) ? C13619p.m810h(c13068g.m1698b()) * f : 0.0f;
        }
        long m811g2 = C13619p.m811g(c13068g.m1697c());
        if (C13622r.m794g(m811g2, c13623a.m789b())) {
            f2 = density.m896Y(c13068g.m1697c());
        } else if (C13622r.m794g(m811g2, c13623a.m790a())) {
            f2 = C13619p.m810h(c13068g.m1697c()) * f;
        }
        m3195o(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(m810h), (int) Math.ceil(f2)), 0, spannable.length());
    }
}
