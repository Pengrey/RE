package p345s;

import p468yc.C13182l;
import p468yc.C13191r;

/* renamed from: s.s */
/* loaded from: classes.dex */
public final class C9982s {
    /* renamed from: a */
    public static final C13182l<C9981r, C9981r> m9458a(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        C9981r m9457b = m9457b(d5);
        C9981r.m9463d(m9457b, C9981r.m9465b(m9457b) + d4);
        double d6 = d * 2.0d;
        C9981r.m9463d(m9457b, C9981r.m9465b(m9457b) / d6);
        C9981r.m9464c(m9457b, C9981r.m9466a(m9457b) / d6);
        C9981r m9457b2 = m9457b(d5);
        double d7 = -1;
        C9981r.m9463d(m9457b2, C9981r.m9465b(m9457b2) * d7);
        C9981r.m9464c(m9457b2, C9981r.m9466a(m9457b2) * d7);
        C9981r.m9463d(m9457b2, C9981r.m9465b(m9457b2) + d4);
        C9981r.m9463d(m9457b2, C9981r.m9465b(m9457b2) / d6);
        C9981r.m9464c(m9457b2, C9981r.m9466a(m9457b2) / d6);
        return C13191r.m1447a(m9457b, m9457b2);
    }

    /* renamed from: b */
    public static final C9981r m9457b(double d) {
        if (d < 0.0d) {
            return new C9981r(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new C9981r(Math.sqrt(d), 0.0d);
    }
}
