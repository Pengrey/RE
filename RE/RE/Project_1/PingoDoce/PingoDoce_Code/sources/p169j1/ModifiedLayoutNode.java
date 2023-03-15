package p169j1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5220m0;
import p127h1.AbstractC5743a;
import p127h1.C5767g;
import p127h1.LayoutModifier;
import p127h1.Placeable;
import p181jd.Intrinsics;
import p393v0.C11028i;
import p393v0.C11049p0;
import p393v0.Color;
import p393v0.InterfaceC11046o0;
import p393v0.InterfaceC11064u;
import p479z1.C13612k;

/* renamed from: j1.w */
/* loaded from: classes.dex */
public final class ModifiedLayoutNode extends DelegatingLayoutNodeWrapper {

    /* renamed from: a0 */
    private static final InterfaceC11046o0 f17263a0;

    /* renamed from: Z */
    private InterfaceC5220m0 f17264Z;

    /* compiled from: ModifiedLayoutNode.kt */
    /* renamed from: j1.w$a */
    /* loaded from: classes.dex */
    public static final class C6294a {
        private C6294a() {
        }

        public /* synthetic */ C6294a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6294a(null);
        InterfaceC11046o0 m6475a = C11028i.m6475a();
        m6475a.mo6394o(Color.f28297b.m6636b());
        m6475a.mo6388u(1.0f);
        m6475a.mo6397l(C11049p0.f28431a.m6318b());
        f17263a0 = m6475a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedLayoutNode(LayoutNodeWrapper layoutNodeWrapper, LayoutModifier layoutModifier) {
        super(layoutNodeWrapper, layoutModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(layoutModifier, "modifier");
    }

    /* renamed from: B1 */
    public void m21291B1(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        m21742k1().m21410H0(interfaceC11064u);
        if (C6284n.m21433a(m21378c1()).getShowLayoutBounds()) {
            m21408I0(interfaceC11064u, f17263a0);
        }
    }

    /* renamed from: D0 */
    public int m21290D0(AbstractC5743a abstractC5743a) {
        int m839h;
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        if (m21377d1().mo23002e().containsKey(abstractC5743a)) {
            Integer num = m21377d1().mo23002e().get(abstractC5743a);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int mo22989p = m21742k1().mo22989p(abstractC5743a);
        if (mo22989p == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        m21407I1(true);
        m21738r0(m21374g1(), m21367m1(), m21380b1());
        m21407I1(false);
        if (abstractC5743a instanceof C5767g) {
            m839h = C13612k.m838i(m21742k1().m21374g1());
        } else {
            m839h = C13612k.m839h(m21742k1().m21374g1());
        }
        return mo22989p + m839h;
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        LayoutNodeWrapper.m21347y0(this, j);
        m21409H1(((LayoutModifier) m21755P1()).m23012S(m21743e1(), m21742k1(), j));
        InterfaceC6250e0 m21382a1 = m21382a1();
        if (m21382a1 != null) {
            m21382a1.mo21672e(LayoutNodeWrapper.m21350x0(this));
        }
        return this;
    }

    /* renamed from: y1 */
    public void m21288y1() {
        super.m21346y1();
        InterfaceC5220m0 interfaceC5220m0 = this.f17264Z;
        if (interfaceC5220m0 == null) {
            return;
        }
        interfaceC5220m0.setValue(m21755P1());
    }
}
