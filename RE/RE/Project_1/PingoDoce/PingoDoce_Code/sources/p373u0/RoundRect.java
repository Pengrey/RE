package p373u0;

import p181jd.Intrinsics;

/* renamed from: u0.k */
/* loaded from: classes.dex */
public final class RoundRect {
    /* renamed from: a */
    public static final C10779j m7103a(float f, float f2, float f3, float f4, float f5, float f6) {
        long m7170a = C10771b.m7170a(f5, f6);
        return new C10779j(f, f2, f3, f4, m7170a, m7170a, m7170a, m7170a, null);
    }

    /* renamed from: b */
    public static final C10779j m7102b(Rect rect, long j, long j2, long j3, long j4) {
        Intrinsics.isThisObjectNull(rect, "rect");
        return new C10779j(rect.m7125f(), rect.m7122i(), rect.m7124g(), rect.m7128c(), j, j2, j3, j4, null);
    }

    /* renamed from: c */
    public static final C10779j m7101c(float f, float f2, float f3, float f4, long j) {
        return m7103a(f, f2, f3, f4, C10769a.m7175d(j), C10769a.m7174e(j));
    }

    /* renamed from: d */
    public static final boolean m7100d(C10779j c10779j) {
        Intrinsics.isThisObjectNull(c10779j, "<this>");
        if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7174e(c10779j.m7106h())) {
            if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7175d(c10779j.m7105i())) {
                if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7174e(c10779j.m7105i())) {
                    if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7175d(c10779j.m7111c())) {
                        if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7174e(c10779j.m7111c())) {
                            if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7175d(c10779j.m7112b())) {
                                if (C10769a.m7175d(c10779j.m7106h()) == C10769a.m7174e(c10779j.m7112b())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
