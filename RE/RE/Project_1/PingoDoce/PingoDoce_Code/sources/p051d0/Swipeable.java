package p051d0;

import java.util.Set;
import p070e.C4906j;
import p181jd.Intrinsics;
import p345s.C9965m0;
import p479z1.C13605g;
import p489zc._Collections;

/* renamed from: d0.c1 */
/* loaded from: classes.dex */
public final class Swipeable {

    /* renamed from: a */
    public static final Swipeable f12259a = new Swipeable();

    /* renamed from: b */
    private static final float f12260b;

    static {
        new C9965m0(0.0f, 0.0f, null, 7, null);
        f12260b = C13605g.m875g((float) C4906j.f13415H0);
    }

    private Swipeable() {
    }

    /* renamed from: c */
    public static /* synthetic */ C4607n0 m27262c(Swipeable swipeable, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeable.m27263b(set, f, f2);
    }

    /* renamed from: a */
    public final float m27264a() {
        return f12260b;
    }

    /* renamed from: b */
    public final C4607n0 m27263b(Set set, float f, float f2) {
        Float m470Y;
        Float m468a0;
        Intrinsics.isThisObjectNull(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        m470Y = _Collections.m470Y(set);
        Intrinsics.ifNullDoSomething(m470Y);
        float floatValue = m470Y.floatValue();
        m468a0 = _Collections.m468a0(set);
        Intrinsics.ifNullDoSomething(m468a0);
        return new C4607n0(floatValue - m468a0.floatValue(), f, f2);
    }
}
