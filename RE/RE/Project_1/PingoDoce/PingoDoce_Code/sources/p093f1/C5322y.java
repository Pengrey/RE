package p093f1;

import java.util.Collection;
import p169j1.HitTestResult;
import p169j1.LayoutNode;
import p181jd.Intrinsics;

/* compiled from: PointerInputEventProcessor.kt */
/* renamed from: f1.y */
/* loaded from: classes.dex */
public final class C5322y {

    /* renamed from: a */
    private final LayoutNode f14687a;

    /* renamed from: b */
    private final HitPathTracker f14688b;

    /* renamed from: c */
    private final PointerInputEventProcessor f14689c;

    /* renamed from: d */
    private final HitTestResult f14690d;

    public C5322y(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "root");
        this.f14687a = layoutNode;
        this.f14688b = new HitPathTracker(layoutNode.mo23016e());
        this.f14689c = new PointerInputEventProcessor();
        this.f14690d = new HitTestResult();
    }

    /* renamed from: a */
    public final LayoutNode m24628a() {
        return this.f14687a;
    }

    /* renamed from: b */
    public final int m24627b(C5320w c5320w, InterfaceC5282f0 interfaceC5282f0, boolean z) {
        boolean z2;
        boolean z3;
        Intrinsics.isThisObjectNull(c5320w, "pointerEvent");
        Intrinsics.isThisObjectNull(interfaceC5282f0, "positionCalculator");
        C5283g m24643b = this.f14689c.m24643b(c5320w, interfaceC5282f0);
        Collection<C5318u> values = m24643b.m24792a().values();
        boolean z4 = true;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (C5318u c5318u : values) {
                if (c5318u.m24650i() || c5318u.m24648k()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        boolean z5 = !z3;
        for (C5318u c5318u2 : m24643b.m24792a().values()) {
            if (z5 || C5307n.m24702b(c5318u2)) {
                LayoutNode.m21529j0(m24628a(), c5318u2.m24651h(), this.f14690d, C5280e0.m24806g(c5318u2.m24646m(), C5280e0.f14552a.m24800d()), false, 8, null);
                if (!this.f14690d.isEmpty()) {
                    this.f14688b.m24798a(c5318u2.m24652g(), this.f14690d);
                    this.f14690d.clear();
                }
            }
        }
        this.f14688b.m24795d();
        boolean m24797b = this.f14688b.m24797b(m24643b, z);
        if (!m24643b.m24790c()) {
            Collection<C5318u> values2 = m24643b.m24792a().values();
            if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                for (C5318u c5318u3 : values2) {
                    if (c5318u3.m24654e().m24818b()) {
                        break;
                    }
                }
            }
        }
        z4 = false;
        return C5323z.m24625a(m24797b, z4);
    }

    /* renamed from: c */
    public final void m24626c() {
        this.f14689c.m24644a();
        this.f14688b.m24796c();
    }
}
