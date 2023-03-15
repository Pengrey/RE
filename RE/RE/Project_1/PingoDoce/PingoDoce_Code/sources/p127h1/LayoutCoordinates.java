package p127h1;

import p127h1.InterfaceC5776j;
import p169j1.LayoutNodeWrapper;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.Rect;
import p479z1.C13615m;

/* renamed from: h1.k */
/* loaded from: classes.dex */
public final class LayoutCoordinates {
    /* renamed from: a */
    public static final Rect m23094a(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "<this>");
        InterfaceC5776j mo23103y = interfaceC5776j.mo23103y();
        Rect m23102a = mo23103y != null ? InterfaceC5776j.C5777a.m23102a(mo23103y, interfaceC5776j, false, 2, null) : null;
        return m23102a == null ? new Rect(0.0f, 0.0f, C13615m.m824g(interfaceC5776j.mo23107b()), C13615m.m825f(interfaceC5776j.mo23107b())) : m23102a;
    }

    /* renamed from: b */
    public static final Rect m23093b(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "<this>");
        return InterfaceC5776j.C5777a.m23102a(m23092c(interfaceC5776j), interfaceC5776j, false, 2, null);
    }

    /* renamed from: c */
    public static final InterfaceC5776j m23092c(InterfaceC5776j interfaceC5776j) {
        InterfaceC5776j interfaceC5776j2;
        Intrinsics.isThisObjectNull(interfaceC5776j, "<this>");
        InterfaceC5776j mo23103y = interfaceC5776j.mo23103y();
        while (true) {
            InterfaceC5776j interfaceC5776j3 = mo23103y;
            interfaceC5776j2 = interfaceC5776j;
            interfaceC5776j = interfaceC5776j3;
            if (interfaceC5776j == null) {
                break;
            }
            mo23103y = interfaceC5776j.mo23103y();
        }
        LayoutNodeWrapper layoutNodeWrapper = interfaceC5776j2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) interfaceC5776j2 : null;
        if (layoutNodeWrapper == null) {
            return interfaceC5776j2;
        }
        LayoutNodeWrapper m21368l1 = layoutNodeWrapper.m21368l1();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = m21368l1;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper == null) {
                return layoutNodeWrapper3;
            }
            m21368l1 = layoutNodeWrapper.m21368l1();
        }
    }

    /* renamed from: d */
    public static final long m23091d(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "<this>");
        return interfaceC5776j.mo23108V(C10774f.f27866b.m7134c());
    }

    /* renamed from: e */
    public static final long m23090e(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "<this>");
        return interfaceC5776j.mo23104u(C10774f.f27866b.m7134c());
    }
}
