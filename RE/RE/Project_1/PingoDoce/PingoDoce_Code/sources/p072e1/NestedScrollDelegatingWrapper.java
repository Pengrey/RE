package p072e1;

import id.InterfaceC6097a;
import p112g0.MutableVector;
import p169j1.DelegatingLayoutNodeWrapper;
import p169j1.LayoutNode;
import p169j1.LayoutNodeWrapper;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import td.InterfaceC10524i0;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class NestedScrollDelegatingWrapper extends DelegatingLayoutNodeWrapper {

    /* renamed from: Z */
    private NestedScrollModifier f13730Z;

    /* renamed from: a0 */
    private InterfaceC4949e f13731a0;

    /* renamed from: b0 */
    private final C4957h f13732b0;

    /* renamed from: c0 */
    private final MutableVector f13733c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollDelegatingWrapper.kt */
    /* renamed from: e1.b$a */
    /* loaded from: classes.dex */
    public static final class C4941a extends AbstractC6438m implements InterfaceC6097a {
        C4941a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10524i0 mo42214q() {
            return (InterfaceC10524i0) NestedScrollDelegatingWrapper.m26227Y1(NestedScrollDelegatingWrapper.this).mo42214q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollDelegatingWrapper.kt */
    /* renamed from: e1.b$b */
    /* loaded from: classes.dex */
    public static final class C4942b extends AbstractC6438m implements InterfaceC6097a {
        C4942b() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10524i0 mo42214q() {
            InterfaceC4949e m26225a2;
            C4945d m26198a0;
            NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = NestedScrollDelegatingWrapper.this;
            if (nestedScrollDelegatingWrapper == null || (m26225a2 = nestedScrollDelegatingWrapper.m26225a2()) == null || (m26198a0 = m26225a2.m26198a0()) == null) {
                return null;
            }
            return m26198a0.m26204g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDelegatingWrapper(LayoutNodeWrapper layoutNodeWrapper, InterfaceC4949e interfaceC4949e) {
        super(layoutNodeWrapper, interfaceC4949e);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC4949e, "nestedScrollModifier");
        NestedScrollModifier nestedScrollModifier = this.f13730Z;
        this.f13732b0 = new C4957h(nestedScrollModifier == null ? C4943c.f13736a : nestedScrollModifier, interfaceC4949e.m26197k());
        this.f13733c0 = new MutableVector(new NestedScrollDelegatingWrapper[16], 0);
    }

    /* renamed from: Y1 */
    public static final /* synthetic */ InterfaceC6097a m26227Y1(NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper) {
        return nestedScrollDelegatingWrapper.m26226Z1();
    }

    /* renamed from: Z1 */
    private final InterfaceC6097a m26226Z1() {
        return m26225a2().m26198a0().m26206e();
    }

    /* renamed from: b2 */
    private final void m26224b2(MutableVector mutableVector) {
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = mutableVector.m23650o();
            do {
                LayoutNode layoutNode = (LayoutNode) m23650o[i];
                NestedScrollDelegatingWrapper m21396O0 = layoutNode.m21550Y().m21396O0();
                if (m21396O0 != null) {
                    this.f13733c0.m23659c(m21396O0);
                } else {
                    m26224b2(layoutNode.m21537f0());
                }
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: c2 */
    private final void m26223c2(NestedScrollModifier nestedScrollModifier) {
        this.f13733c0.m23654i();
        NestedScrollDelegatingWrapper m21396O0 = m21742k1().m21396O0();
        if (m21396O0 != null) {
            this.f13733c0.m23659c(m21396O0);
        } else {
            m26224b2(m21378c1().m21537f0());
        }
        int i = 0;
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = this.f13733c0.m23646s() ? (NestedScrollDelegatingWrapper) this.f13733c0.m23650o()[0] : null;
        MutableVector mutableVector = this.f13733c0;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            do {
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper2 = (NestedScrollDelegatingWrapper) m23650o[i];
                nestedScrollDelegatingWrapper2.m26219g2(nestedScrollModifier);
                nestedScrollDelegatingWrapper2.m26221e2(nestedScrollModifier != null ? new C4941a() : new C4942b());
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: d2 */
    private final void m26222d2() {
        InterfaceC4949e interfaceC4949e = this.f13731a0;
        if (((interfaceC4949e != null && interfaceC4949e.m26197k() == m26225a2().m26197k() && interfaceC4949e.m26198a0() == m26225a2().m26198a0()) ? false : true) && mo23109S()) {
            NestedScrollDelegatingWrapper m21749T0 = super.m21749T0();
            m26219g2(m21749T0 == null ? null : m21749T0.f13732b0);
            InterfaceC6097a m26226Z1 = m21749T0 != null ? m21749T0.m26226Z1() : null;
            if (m26226Z1 == null) {
                m26226Z1 = m26226Z1();
            }
            m26221e2(m26226Z1);
            m26223c2(this.f13732b0);
            this.f13731a0 = m26225a2();
        }
    }

    /* renamed from: e2 */
    private final void m26221e2(InterfaceC6097a interfaceC6097a) {
        m26225a2().m26198a0().m26202i(interfaceC6097a);
    }

    /* renamed from: g2 */
    private final void m26219g2(NestedScrollModifier nestedScrollModifier) {
        m26225a2().m26198a0().m26200k(nestedScrollModifier);
        this.f13732b0.m26175g(nestedScrollModifier == null ? C4943c.f13736a : nestedScrollModifier);
        this.f13730Z = nestedScrollModifier;
    }

    /* renamed from: C0 */
    public void m26233C0() {
        super.m21420C0();
        m26222d2();
    }

    /* renamed from: F0 */
    public void m26232F0() {
        super.m21414F0();
        m26223c2(this.f13730Z);
        this.f13731a0 = null;
    }

    /* renamed from: O0 */
    public NestedScrollDelegatingWrapper m26231O0() {
        return this;
    }

    /* renamed from: T0 */
    public NestedScrollDelegatingWrapper m26229T0() {
        return this;
    }

    /* renamed from: a2 */
    public InterfaceC4949e m26230P1() {
        return (InterfaceC4949e) super.m21755P1();
    }

    /* renamed from: f2 */
    public void m26228U1(InterfaceC4949e interfaceC4949e) {
        Intrinsics.isThisObjectNull(interfaceC4949e, "value");
        this.f13731a0 = (InterfaceC4949e) super.m21755P1();
        super.m21747U1(interfaceC4949e);
    }

    /* renamed from: y1 */
    public void m26218y1() {
        super.m21346y1();
        this.f13732b0.m26174h(m26225a2().m26197k());
        m26225a2().m26198a0().m26200k(this.f13730Z);
        m26222d2();
    }
}
