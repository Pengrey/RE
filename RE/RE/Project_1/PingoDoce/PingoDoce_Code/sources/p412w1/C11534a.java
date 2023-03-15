package p412w1;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p181jd.Intrinsics;
import p286p1.AbstractC8338a0;
import p286p1.AnnotatedString;
import p286p1.C8391r;
import p359t1.AbstractC10364e;
import p359t1.C10366h;
import p359t1.C10368i;
import p359t1.C10371k;
import p359t1.FontWeight;
import p359t1.InterfaceC10362d;
import p434x1.C12252e;
import p434x1.C12255g;
import p457y1.TextDecoration;
import p479z1.Density;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class C11534a {
    /* renamed from: a */
    private static final void m4799a(SpannableString spannableString, C8391r c8391r, int i, int i2, Density density, C11545j c11545j) {
        C12252e.m3203g(spannableString, c8391r.m15594c(), i, i2);
        C12252e.m3200j(spannableString, c8391r.m15591f(), density, i, i2);
        if (c8391r.m15588i() != null || c8391r.m15590g() != null) {
            FontWeight m15588i = c8391r.m15588i();
            if (m15588i == null) {
                m15588i = FontWeight.f26976x.m8102d();
            }
            C10366h m15590g = c8391r.m15590g();
            spannableString.setSpan(new StyleSpan(C11545j.f29560c.m4751b(m15588i, m15590g == null ? C10366h.f26954b.m8128b() : m15590g.m8130i())), i, i2, 33);
        }
        if (c8391r.m15593d() != null) {
            if (c8391r.m15593d() instanceof C10371k) {
                spannableString.setSpan(new TypefaceSpan(((C10371k) c8391r.m15593d()).m8098f()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC10364e m15593d = c8391r.m15593d();
                C10368i m15589h = c8391r.m15589h();
                spannableString.setSpan(C11544i.f29559a.m4758a(C11545j.m4755c(c11545j, m15593d, null, 0, m15589h == null ? C10368i.f26958b.m8116a() : m15589h.m8117k(), 6, null)), i, i2, 33);
            }
        }
        if (c8391r.m15584m() != null) {
            TextDecoration m15584m = c8391r.m15584m();
            TextDecoration.C13063a c13063a = TextDecoration.f33972b;
            if (m15584m.m1725d(c13063a.m1721c())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (c8391r.m15584m().m1725d(c13063a.m1723a())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (c8391r.m15583n() != null) {
            spannableString.setSpan(new ScaleXSpan(c8391r.m15583n().m1702b()), i, i2, 33);
        }
        C12252e.m3197m(spannableString, c8391r.m15586k(), i, i2);
        C12252e.m3205e(spannableString, c8391r.m15596a(), i, i2);
    }

    /* renamed from: b */
    public static final SpannableString m4798b(AnnotatedString annotatedString, Density density, InterfaceC10362d.InterfaceC10363a interfaceC10363a) {
        Intrinsics.isThisObjectNull(annotatedString, "<this>");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        SpannableString spannableString = new SpannableString(annotatedString.m15771f());
        C11545j c11545j = new C11545j(null, interfaceC10363a, 1, null);
        List m15772e = annotatedString.m15772e();
        int size = m15772e.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) m15772e.get(i);
            m4799a(spannableString, (C8391r) c8337a.m15767a(), c8337a.m15766b(), c8337a.m15765c(), density, c11545j);
            i = i2;
        }
        List m15770g = annotatedString.m15770g(0, annotatedString.length());
        int size2 = m15770g.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.C8337a c8337a2 = (AnnotatedString.C8337a) m15770g.get(i3);
            spannableString.setSpan(C12255g.m3185a((AbstractC8338a0) c8337a2.m15767a()), c8337a2.m15766b(), c8337a2.m15765c(), 33);
        }
        return spannableString;
    }
}
