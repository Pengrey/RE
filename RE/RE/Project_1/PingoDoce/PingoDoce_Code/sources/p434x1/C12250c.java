package p434x1;

import android.text.Spannable;
import java.util.List;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.C8350o;
import p286p1.C8351p;
import p347s1.PlaceholderSpan;
import p479z1.C13619p;
import p479z1.C13622r;
import p479z1.Density;

/* compiled from: PlaceholderExtensions.android.kt */
/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C12250c {
    /* renamed from: a */
    private static final int m3216a(long j) {
        long m811g = C13619p.m811g(j);
        C13622r.C13623a c13623a = C13622r.f34617b;
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            return 0;
        }
        return C13622r.m794g(m811g, c13623a.m790a()) ? 1 : 2;
    }

    /* renamed from: b */
    private static final int m3215b(int i) {
        C8351p.C8352a c8352a = C8351p.f21623a;
        if (C8351p.m15662i(i, c8352a.m15659a())) {
            return 0;
        }
        if (C8351p.m15662i(i, c8352a.m15653g())) {
            return 1;
        }
        if (C8351p.m15662i(i, c8352a.m15658b())) {
            return 2;
        }
        if (C8351p.m15662i(i, c8352a.m15657c())) {
            return 3;
        }
        if (C8351p.m15662i(i, c8352a.m15654f())) {
            return 4;
        }
        if (C8351p.m15662i(i, c8352a.m15656d())) {
            return 5;
        }
        if (C8351p.m15662i(i, c8352a.m15655e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: c */
    private static final void m3214c(Spannable spannable, C8350o c8350o, int i, int i2, Density density) {
        C12252e.m3195o(spannable, new PlaceholderSpan(C13619p.m810h(c8350o.m15671c()), m3216a(c8350o.m15671c()), C13619p.m810h(c8350o.m15673a()), m3216a(c8350o.m15673a()), density.m894r() * density.getDensity(), m3215b(c8350o.m15672b())), i, i2);
    }

    /* renamed from: d */
    public static final void m3213d(Spannable spannable, List list, Density density) {
        Intrinsics.isThisObjectNull(spannable, "<this>");
        Intrinsics.isThisObjectNull(list, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AnnotatedString.C8337a c8337a = (AnnotatedString.C8337a) list.get(i);
            m3214c(spannable, (C8350o) c8337a.m15767a(), c8337a.m15766b(), c8337a.m15765c(), density);
            i = i2;
        }
    }
}
