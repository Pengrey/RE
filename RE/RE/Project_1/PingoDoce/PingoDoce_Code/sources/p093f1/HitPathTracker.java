package p093f1;

import java.util.List;
import p112g0.MutableVector;
import p127h1.InterfaceC5776j;
import p181jd.Intrinsics;

/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class HitPathTracker {

    /* renamed from: a */
    private final InterfaceC5776j f14558a;

    /* renamed from: b */
    private final C5304k f14559b;

    public HitPathTracker(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "rootCoordinates");
        this.f14558a = interfaceC5776j;
        this.f14559b = new C5304k();
    }

    /* renamed from: a */
    public final void m24798a(long j, List list) {
        C5303j c5303j;
        C5303j c5303j2;
        Intrinsics.isThisObjectNull(list, "pointerInputFilters");
        C5304k c5304k = this.f14559b;
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AbstractC5271a0 abstractC5271a0 = (AbstractC5271a0) list.get(i);
            if (z) {
                MutableVector m24711g = c5304k.m24711g();
                int m23649p = m24711g.m23649p();
                if (m23649p > 0) {
                    Object[] m23650o = m24711g.m23650o();
                    int i3 = 0;
                    do {
                        c5303j2 = m23650o[i3];
                        if (Intrinsics.equals(((C5303j) c5303j2).m24720k(), abstractC5271a0)) {
                            break;
                        }
                        i3++;
                    } while (i3 < m23649p);
                    c5303j2 = null;
                } else {
                    c5303j2 = null;
                }
                c5303j = c5303j2;
                if (c5303j != null) {
                    c5303j.m24718m();
                    if (!c5303j.m24721j().m23653j(C5317t.m24665a(j))) {
                        c5303j.m24721j().m23659c(C5317t.m24665a(j));
                    }
                    i = i2;
                    c5304k = c5303j;
                } else {
                    z = false;
                }
            }
            c5303j = new C5303j(abstractC5271a0);
            c5303j.m24721j().m23659c(C5317t.m24665a(j));
            c5304k.m24711g().m23659c(c5303j);
            i = i2;
            c5304k = c5303j;
        }
    }

    /* renamed from: b */
    public final boolean m24797b(C5283g c5283g, boolean z) {
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        if (this.f14559b.m24717a(c5283g.m24792a(), this.f14558a, c5283g, z)) {
            return this.f14559b.m24713e(c5283g) || this.f14559b.m24712f(c5283g.m24792a(), this.f14558a, c5283g, z);
        }
        return false;
    }

    /* renamed from: c */
    public final void m24796c() {
        this.f14559b.m24714d();
        this.f14559b.m24715c();
    }

    /* renamed from: d */
    public final void m24795d() {
        this.f14559b.m24710h();
    }
}
