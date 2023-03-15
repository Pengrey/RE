package p093f1;

import java.util.Map;
import p112g0.MutableVector;
import p127h1.InterfaceC5776j;
import p181jd.Intrinsics;

/* compiled from: HitPathTracker.kt */
/* renamed from: f1.k */
/* loaded from: classes.dex */
public class C5304k {

    /* renamed from: a */
    private final MutableVector f14634a = new MutableVector(new C5303j[16], 0);

    /* renamed from: a */
    public boolean m24717a(Map map, InterfaceC5776j interfaceC5776j, C5283g c5283g, boolean z) {
        Intrinsics.isThisObjectNull(map, "changes");
        Intrinsics.isThisObjectNull(interfaceC5776j, "parentCoordinates");
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        MutableVector mutableVector = this.f14634a;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((C5303j) m23650o[i]).m24727a(map, interfaceC5776j, c5283g, z) || z2;
                i++;
            } while (i < m23649p);
            return z2;
        }
        return false;
    }

    /* renamed from: b */
    public void m24716b(C5283g c5283g) {
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        int m23649p = this.f14634a.m23649p() - 1;
        if (m23649p < 0) {
            return;
        }
        while (true) {
            int i = m23649p - 1;
            if (((C5303j) this.f14634a.m23650o()[m23649p]).m24721j().m23647r()) {
                this.f14634a.m23642w(m23649p);
            }
            if (i < 0) {
                return;
            }
            m23649p = i;
        }
    }

    /* renamed from: c */
    public final void m24715c() {
        this.f14634a.m23654i();
    }

    /* renamed from: d */
    public void m24714d() {
        MutableVector mutableVector = this.f14634a;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = mutableVector.m23650o();
            do {
                ((C5303j) m23650o[i]).m24725d();
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: e */
    public boolean m24713e(C5283g c5283g) {
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        MutableVector mutableVector = this.f14634a;
        int m23649p = mutableVector.m23649p();
        boolean z = false;
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((C5303j) m23650o[i]).m24724e(c5283g) || z2;
                i++;
            } while (i < m23649p);
            z = z2;
        }
        m24716b(c5283g);
        return z;
    }

    /* renamed from: f */
    public boolean m24712f(Map map, InterfaceC5776j interfaceC5776j, C5283g c5283g, boolean z) {
        Intrinsics.isThisObjectNull(map, "changes");
        Intrinsics.isThisObjectNull(interfaceC5776j, "parentCoordinates");
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        MutableVector mutableVector = this.f14634a;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((C5303j) m23650o[i]).m24723f(map, interfaceC5776j, c5283g, z) || z2;
                i++;
            } while (i < m23649p);
            return z2;
        }
        return false;
    }

    /* renamed from: g */
    public final MutableVector m24711g() {
        return this.f14634a;
    }

    /* renamed from: h */
    public final void m24710h() {
        int i = 0;
        while (i < this.f14634a.m23649p()) {
            C5303j c5303j = (C5303j) this.f14634a.m23650o()[i];
            if (!c5303j.m24720k().m24837n0()) {
                this.f14634a.m23642w(i);
                c5303j.m24725d();
            } else {
                i++;
                c5303j.m24710h();
            }
        }
    }
}
