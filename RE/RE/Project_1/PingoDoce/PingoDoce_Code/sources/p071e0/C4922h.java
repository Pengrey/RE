package p071e0;

import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10776g;
import p373u0.C10781l;
import p479z1.C13605g;
import p479z1.Density;

/* compiled from: RippleAnimation.kt */
/* renamed from: e0.h */
/* loaded from: classes.dex */
public final class C4922h {

    /* renamed from: a */
    private static final float f13685a = C13605g.m875g(10);

    /* renamed from: a */
    public static final float m26276a(Density density, boolean z, long j) {
        Intrinsics.isThisObjectNull(density, "$this$getRippleEndRadius");
        float m7146j = C10774f.m7146j(C10776g.m7133a(C10781l.m7091i(j), C10781l.m7093g(j))) / 2.0f;
        return z ? m7146j + density.m899A(f13685a) : m7146j;
    }

    /* renamed from: b */
    public static final float m26275b(long j) {
        return Math.max(C10781l.m7091i(j), C10781l.m7093g(j)) * 0.3f;
    }
}
