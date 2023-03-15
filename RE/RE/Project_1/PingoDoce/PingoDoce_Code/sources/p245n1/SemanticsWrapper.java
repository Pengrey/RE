package p245n1;

import id.InterfaceC6108l;
import p127h1.InterfaceC5776j;
import p127h1.LayoutCoordinates;
import p169j1.DelegatingLayoutNodeWrapper;
import p169j1.HitTestResult;
import p169j1.InterfaceC6253f0;
import p169j1.LayoutNodeWrapper;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10773d;
import p373u0.C10781l;
import p373u0.MutableRect;
import p373u0.Rect;
import p468yc.C13195u;

/* renamed from: n1.x */
/* loaded from: classes.dex */
public final class SemanticsWrapper extends DelegatingLayoutNodeWrapper {

    /* compiled from: SemanticsWrapper.kt */
    /* renamed from: n1.x$a */
    /* loaded from: classes.dex */
    static final class C7623a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ long f20185x;

        /* renamed from: y */
        final /* synthetic */ HitTestResult f20186y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7623a(long j, HitTestResult hitTestResult) {
            super(1);
            this.f20185x = j;
            this.f20186y = hitTestResult;
        }

        /* renamed from: a */
        public final void m17898a(boolean z) {
            SemanticsWrapper.this.m21742k1().m21364o1(SemanticsWrapper.this.m21742k1().m21387V0(this.f20185x), this.f20186y, z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17898a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsWrapper(LayoutNodeWrapper layoutNodeWrapper, SemanticsModifier semanticsModifier) {
        super(layoutNodeWrapper, semanticsModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(semanticsModifier, "semanticsModifier");
    }

    /* renamed from: Z1 */
    private final boolean m17902Z1() {
        return C7595l.m18025a(((SemanticsModifier) m21755P1()).m18024c0(), C7594j.f20098a.m18044h()) != null;
    }

    /* renamed from: F0 */
    public void m17904F0() {
        super.m21414F0();
        InterfaceC6253f0 m21549Z = m21378c1().m21549Z();
        if (m21549Z == null) {
            return;
        }
        m21549Z.mo21649k();
    }

    /* renamed from: Y1 */
    public final SemanticsConfiguration m17903Y1() {
        SemanticsWrapper semanticsWrapper;
        LayoutNodeWrapper m21742k1 = m21742k1();
        while (true) {
            if (m21742k1 == null) {
                semanticsWrapper = null;
                break;
            } else if (m21742k1 instanceof SemanticsWrapper) {
                semanticsWrapper = (SemanticsWrapper) m21742k1;
                break;
            } else {
                m21742k1 = m21742k1.m21369k1();
            }
        }
        if (semanticsWrapper != null && !((SemanticsModifier) m21755P1()).m18024c0().m18030t()) {
            SemanticsConfiguration m18034l = ((SemanticsModifier) m21755P1()).m18024c0().m18034l();
            m18034l.m18036f(semanticsWrapper.m17903Y1());
            return m18034l;
        }
        return ((SemanticsModifier) m21755P1()).m18024c0();
    }

    /* renamed from: a2 */
    public final Rect m17901a2() {
        if (!mo23109S()) {
            return Rect.f27871e.m7115a();
        }
        if (!m17902Z1()) {
            return LayoutCoordinates.m23093b(this);
        }
        InterfaceC5776j m23092c = LayoutCoordinates.m23092c(this);
        C10773d m21372i1 = m21372i1();
        long m21416E0 = m21416E0(m21375f1());
        m21372i1.m7159i(-C10781l.m7091i(m21416E0));
        m21372i1.m7157k(-C10781l.m7093g(m21416E0));
        m21372i1.m7158j(m23179o0() + C10781l.m7091i(m21416E0));
        m21372i1.m7160h(m23181m0() + C10781l.m7093g(m21416E0));
        LayoutNodeWrapper layoutNodeWrapper = this;
        while (layoutNodeWrapper != m23092c) {
            layoutNodeWrapper.m21415E1(m21372i1, false, true);
            if (m21372i1.m7162f()) {
                return Rect.f27871e.m7115a();
            }
            layoutNodeWrapper = layoutNodeWrapper.m21368l1();
            Intrinsics.ifNullDoSomething(layoutNodeWrapper);
        }
        return MutableRect.m7156a(m21372i1);
    }

    /* renamed from: o1 */
    public void m17900o1(long j, HitTestResult hitTestResult, boolean z) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitSemanticsWrappers");
        m21752R1(j, hitTestResult, false, true, z, this, new C7623a(j, hitTestResult));
    }

    public String toString() {
        return super.toString() + " id: " + ((SemanticsModifier) m21755P1()).getId() + " config: " + ((SemanticsModifier) m21755P1()).m18024c0();
    }

    /* renamed from: y1 */
    public void m17899y1() {
        super.m21346y1();
        InterfaceC6253f0 m21549Z = m21378c1().m21549Z();
        if (m21549Z == null) {
            return;
        }
        m21549Z.mo21649k();
    }
}
