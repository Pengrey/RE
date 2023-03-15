package p345s;

import java.util.Map;
import p181jd.C6432f;
import p181jd.C6437k;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10781l;
import p373u0.Rect;
import p468yc.C13191r;
import p479z1.C13605g;
import p479z1.C13608i;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p489zc.C13769l0;

/* renamed from: s.c1 */
/* loaded from: classes.dex */
public final class VisibilityThresholds {

    /* renamed from: a */
    private static final Map f26036a;

    static {
        Map m331h;
        Float valueOf = Float.valueOf(0.5f);
        new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        InterfaceC9980q0 m9454c = C9983s0.m9454c(C6437k.f17527a);
        Float valueOf2 = Float.valueOf(1.0f);
        InterfaceC9980q0 m9450g = C9983s0.m9450g(C13605g.f34597x);
        Float valueOf3 = Float.valueOf(0.1f);
        m331h = C13769l0.m331h(C13191r.m1447a(m9454c, valueOf2), C13191r.m1447a(C9983s0.m9447j(C13615m.f34610b), valueOf2), C13191r.m1447a(C9983s0.m9448i(C13612k.f34607b), valueOf2), C13191r.m1447a(C9983s0.m9455b(C6432f.f17524a), Float.valueOf(0.01f)), C13191r.m1447a(C9983s0.m9452e(Rect.f27871e), valueOf), C13191r.m1447a(C9983s0.m9451f(C10781l.f27885b), valueOf), C13191r.m1447a(C9983s0.m9453d(C10774f.f27866b), valueOf), C13191r.m1447a(m9450g, valueOf3), C13191r.m1447a(C9983s0.m9449h(C13608i.f34601b), valueOf3));
        f26036a = m331h;
    }

    /* renamed from: a */
    public static final long m9604a(C13612k.C13613a c13613a) {
        Intrinsics.isThisObjectNull(c13613a, "<this>");
        return C13614l.m833a(1, 1);
    }
}
