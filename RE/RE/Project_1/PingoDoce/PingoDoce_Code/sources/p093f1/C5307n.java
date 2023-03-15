package p093f1;

import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10781l;
import p479z1.C13615m;

/* compiled from: PointerEvent.kt */
/* renamed from: f1.n */
/* loaded from: classes.dex */
public final class C5307n {
    /* renamed from: a */
    public static final boolean m24703a(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return (c5318u.m24654e().m24819a() || c5318u.m24648k() || !c5318u.m24650i()) ? false : true;
    }

    /* renamed from: b */
    public static final boolean m24702b(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return !c5318u.m24648k() && c5318u.m24650i();
    }

    /* renamed from: c */
    public static final boolean m24701c(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return (c5318u.m24654e().m24819a() || !c5318u.m24648k() || c5318u.m24650i()) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m24700d(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return c5318u.m24648k() && !c5318u.m24650i();
    }

    /* renamed from: e */
    public static final void m24699e(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        m24698f(c5318u);
        m24697g(c5318u);
    }

    /* renamed from: f */
    public static final void m24698f(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        if (c5318u.m24650i() != c5318u.m24648k()) {
            c5318u.m24654e().m24817c(true);
        }
    }

    /* renamed from: g */
    public static final void m24697g(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        if (C10774f.m7147i(m24694j(c5318u), C10774f.f27866b.m7134c())) {
            return;
        }
        c5318u.m24654e().m24816d(true);
    }

    /* renamed from: h */
    public static final boolean m24696h(C5318u c5318u, long j) {
        Intrinsics.isThisObjectNull(c5318u, "$this$isOutOfBounds");
        long m24651h = c5318u.m24651h();
        float m7145k = C10774f.m7145k(m24651h);
        float m7144l = C10774f.m7144l(m24651h);
        return m7145k < 0.0f || m7145k > ((float) C13615m.m824g(j)) || m7144l < 0.0f || m7144l > ((float) C13615m.m825f(j));
    }

    /* renamed from: i */
    public static final boolean m24695i(C5318u c5318u, long j, long j2) {
        Intrinsics.isThisObjectNull(c5318u, "$this$isOutOfBounds");
        if (!C5280e0.m24806g(c5318u.m24646m(), C5280e0.f14552a.m24800d())) {
            return m24696h(c5318u, j);
        }
        long m24651h = c5318u.m24651h();
        float m7145k = C10774f.m7145k(m24651h);
        float m7144l = C10774f.m7144l(m24651h);
        return m7145k < (-C10781l.m7091i(j2)) || m7145k > ((float) C13615m.m824g(j)) + C10781l.m7091i(j2) || m7144l < (-C10781l.m7093g(j2)) || m7144l > ((float) C13615m.m825f(j)) + C10781l.m7093g(j2);
    }

    /* renamed from: j */
    public static final long m24694j(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return m24691m(c5318u, false);
    }

    /* renamed from: k */
    public static final boolean m24693k(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return c5318u.m24654e().m24818b();
    }

    /* renamed from: l */
    public static final long m24692l(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return m24691m(c5318u, true);
    }

    /* renamed from: m */
    private static final long m24691m(C5318u c5318u, boolean z) {
        long m7141o = C10774f.m7141o(c5318u.m24651h(), c5318u.m24649j());
        return (z || !c5318u.m24654e().m24818b()) ? m7141o : C10774f.f27866b.m7134c();
    }

    /* renamed from: n */
    public static final boolean m24690n(C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5318u, "<this>");
        return !C10774f.m7147i(m24691m(c5318u, true), C10774f.f27866b.m7134c());
    }
}
