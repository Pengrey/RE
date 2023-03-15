package p169j1;

import androidx.compose.p018ui.platform.C0843z0;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Map;
import p072e1.NestedScrollDelegatingWrapper;
import p127h1.AbstractC5743a;
import p127h1.InterfaceC5805t;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p302q0.InterfaceC9570f.InterfaceC9573c;
import p393v0.InterfaceC11064u;
import p468yc.C13195u;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p479z1.EnumC13618o;
import p489zc.C13769l0;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public class DelegatingLayoutNodeWrapper<T extends InterfaceC9570f.InterfaceC9573c> extends LayoutNodeWrapper {

    /* renamed from: V */
    private LayoutNodeWrapper f17076V;

    /* renamed from: W */
    private InterfaceC9570f.InterfaceC9573c f17077W;

    /* renamed from: X */
    private boolean f17078X;

    /* renamed from: Y */
    private boolean f17079Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingLayoutNodeWrapper.kt */
    /* renamed from: j1.b$a */
    /* loaded from: classes.dex */
    public static final class C6233a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f17080w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6233a(InterfaceC6108l interfaceC6108l) {
            super(0);
            this.f17080w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m21735a() {
            this.f17080w.mo9587d(Boolean.FALSE);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21735a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingLayoutNodeWrapper.kt */
    /* renamed from: j1.b$b */
    /* loaded from: classes.dex */
    public static final class C6234b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f17081w;

        /* renamed from: x */
        final /* synthetic */ boolean f17082x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6234b(InterfaceC6108l interfaceC6108l, boolean z) {
            super(0);
            this.f17081w = interfaceC6108l;
            this.f17082x = z;
        }

        /* renamed from: a */
        public final void m21734a() {
            this.f17081w.mo9587d(Boolean.valueOf(this.f17082x));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21734a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingLayoutNodeWrapper.kt */
    /* renamed from: j1.b$c */
    /* loaded from: classes.dex */
    public static final class C6235c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f17083w;

        /* renamed from: x */
        final /* synthetic */ boolean f17084x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6235c(InterfaceC6108l interfaceC6108l, boolean z) {
            super(0);
            this.f17083w = interfaceC6108l;
            this.f17084x = z;
        }

        /* renamed from: a */
        public final void m21733a() {
            this.f17083w.mo9587d(Boolean.valueOf(this.f17084x));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21733a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingLayoutNodeWrapper.kt */
    /* renamed from: j1.b$d */
    /* loaded from: classes.dex */
    public static final class C6236d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f17085w;

        /* renamed from: x */
        final /* synthetic */ boolean f17086x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6236d(InterfaceC6108l interfaceC6108l, boolean z) {
            super(0);
            this.f17085w = interfaceC6108l;
            this.f17086x = z;
        }

        /* renamed from: a */
        public final void m21732a() {
            this.f17085w.mo9587d(Boolean.valueOf(this.f17086x));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21732a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: DelegatingLayoutNodeWrapper.kt */
    /* renamed from: j1.b$e */
    /* loaded from: classes.dex */
    public static final class C6237e implements InterfaceC5805t {

        /* renamed from: a */
        private final int f17087a;

        /* renamed from: b */
        private final int f17088b;

        /* renamed from: c */
        private final Map f17089c;

        /* renamed from: e */
        final /* synthetic */ Placeable f17091e;

        C6237e(Placeable placeable) {
            Map m334e;
            this.f17091e = placeable;
            this.f17087a = DelegatingLayoutNodeWrapper.this.m21742k1().m21377d1().mo23004b();
            this.f17088b = DelegatingLayoutNodeWrapper.this.m21742k1().m21377d1().mo23005a();
            m334e = C13769l0.m334e();
            this.f17089c = m334e;
        }

        /* renamed from: a */
        public int mo23005a() {
            return this.f17088b;
        }

        /* renamed from: b */
        public int mo23004b() {
            return this.f17087a;
        }

        /* renamed from: d */
        public void mo23003d() {
            Placeable.AbstractC5751a.C5752a c5752a = Placeable.AbstractC5751a.f16066a;
            Placeable placeable = this.f17091e;
            long m21756O1 = DelegatingLayoutNodeWrapper.m21756O1(DelegatingLayoutNodeWrapper.this);
            Placeable.AbstractC5751a.m23161l(c5752a, placeable, C13614l.m833a(-C13612k.m839h(m21756O1), -C13612k.m838i(m21756O1)), 0.0f, 2, null);
        }

        /* renamed from: e */
        public Map mo23002e() {
            return this.f17089c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingLayoutNodeWrapper(LayoutNodeWrapper layoutNodeWrapper, InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
        super(layoutNodeWrapper.m21378c1());
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC9573c, "modifier");
        this.f17076V = layoutNodeWrapper;
        this.f17077W = interfaceC9573c;
    }

    /* renamed from: O1 */
    public static final /* synthetic */ long m21756O1(DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper) {
        return delegatingLayoutNodeWrapper.m23183k0();
    }

    /* renamed from: B1 */
    public void m21763B1(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        m21742k1().m21410H0(interfaceC11064u);
    }

    /* renamed from: D0 */
    public int m21762D0(AbstractC5743a abstractC5743a) {
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        return m21742k1().mo22989p(abstractC5743a);
    }

    /* renamed from: K1 */
    public boolean m21761K1() {
        return m21742k1().m21403K1();
    }

    /* renamed from: L0 */
    public ModifiedFocusNode m21760L0() {
        ModifiedFocusNode modifiedFocusNode = null;
        for (ModifiedFocusNode m21758N0 = m21758N0(false); m21758N0 != null; m21758N0 = m21758N0.m21742k1().m21398N0(false)) {
            modifiedFocusNode = m21758N0;
        }
        return modifiedFocusNode;
    }

    /* renamed from: M0 */
    public ModifiedKeyInputNode m21759M0() {
        ModifiedKeyInputNode m21391S0 = m21378c1().m21563P().m21391S0();
        if (m21391S0 != this) {
            return m21391S0;
        }
        return null;
    }

    /* renamed from: N0 */
    public ModifiedFocusNode m21758N0(boolean z) {
        return m21742k1().m21398N0(z);
    }

    /* renamed from: O0 */
    public NestedScrollDelegatingWrapper m21757O0() {
        return m21742k1().m21396O0();
    }

    /* renamed from: P1 */
    public InterfaceC9570f.InterfaceC9573c m21755P1() {
        return this.f17077W;
    }

    /* renamed from: Q1 */
    public final boolean m21754Q1() {
        return this.f17079Y;
    }

    /* renamed from: R0 */
    public ModifiedFocusNode m21753R0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21393R0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R1 */
    public final void m21752R1(long j, HitTestResult hitTestResult, boolean z, boolean z2, boolean z3, Object obj, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitTestResult");
        Intrinsics.isThisObjectNull(interfaceC6108l, "block");
        boolean z4 = true;
        if (!m21397N1(j)) {
            if (z2) {
                float m21412G0 = m21412G0(j, m21375f1());
                if (Float.isInfinite(m21412G0) || Float.isNaN(m21412G0)) {
                    z4 = false;
                }
                if (z4 && hitTestResult.m21655x(m21412G0, false)) {
                    hitTestResult.m21656v(obj, m21412G0, false, new C6233a(interfaceC6108l));
                }
            }
        } else if (m21359r1(j)) {
            hitTestResult.m21657u(obj, z3, new C6234b(interfaceC6108l, z3));
        } else {
            float m21412G02 = !z2 ? Float.POSITIVE_INFINITY : m21412G0(j, m21375f1());
            if (Float.isInfinite(m21412G02) || Float.isNaN(m21412G02)) {
                z4 = false;
            }
            if (z4 && hitTestResult.m21655x(m21412G02, z3)) {
                hitTestResult.m21656v(obj, m21412G02, z3, new C6235c(interfaceC6108l, z3));
            } else if (z) {
                hitTestResult.m21666B(obj, m21412G02, z3, new C6236d(interfaceC6108l, z3));
            } else {
                interfaceC6108l.mo9587d(Boolean.valueOf(z3));
            }
        }
    }

    /* renamed from: S0 */
    public ModifiedKeyInputNode m21751S0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21391S0();
    }

    /* renamed from: S1 */
    public final boolean m21750S1() {
        return this.f17078X;
    }

    /* renamed from: T0 */
    public NestedScrollDelegatingWrapper m21749T0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21390T0();
    }

    /* renamed from: T1 */
    public final void m21748T1(boolean z) {
        this.f17078X = z;
    }

    /* renamed from: U1 */
    public void m21747U1(InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
        Intrinsics.isThisObjectNull(interfaceC9573c, "<set-?>");
        this.f17077W = interfaceC9573c;
    }

    /* renamed from: V1 */
    public final void m21746V1(InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
        Intrinsics.isThisObjectNull(interfaceC9573c, "modifier");
        if (interfaceC9573c != m21755P1()) {
            if (Intrinsics.equals(C0843z0.m39451a(interfaceC9573c), C0843z0.m39451a(m21755P1()))) {
                m21747U1(interfaceC9573c);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: W1 */
    public final void m21745W1(boolean z) {
        this.f17079Y = z;
    }

    /* renamed from: X1 */
    public void m21744X1(LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "<set-?>");
        this.f17076V = layoutNodeWrapper;
    }

    /* renamed from: e1 */
    public MeasureScope m21743e1() {
        return m21742k1().m21376e1();
    }

    /* renamed from: k1 */
    public LayoutNodeWrapper m21742k1() {
        return this.f17076V;
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        LayoutNodeWrapper.m21347y0(this, j);
        m21409H1(new C6237e(m21742k1().mo23007n(j)));
        return this;
    }

    /* renamed from: n1 */
    public void m21740n1(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitTestResult");
        boolean m21397N1 = m21397N1(j);
        if (!m21397N1) {
            if (!z) {
                return;
            }
            float m21412G0 = m21412G0(j, m21375f1());
            if (!((Float.isInfinite(m21412G0) || Float.isNaN(m21412G0)) ? false : true)) {
                return;
            }
        }
        m21742k1().m21366n1(m21742k1().m21387V0(j), hitTestResult, z, z2 && m21397N1);
    }

    /* renamed from: o1 */
    public void m21739o1(long j, HitTestResult hitTestResult, boolean z) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitSemanticsWrappers");
        boolean m21397N1 = m21397N1(j);
        boolean z2 = true;
        if (!m21397N1) {
            float m21412G0 = m21412G0(j, m21375f1());
            if (!((Float.isInfinite(m21412G0) || Float.isNaN(m21412G0)) ? false : true)) {
                return;
            }
        }
        long m21387V0 = m21742k1().m21387V0(j);
        if (!z || !m21397N1) {
            z2 = false;
        }
        m21742k1().m21364o1(m21387V0, hitTestResult, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r0 */
    public void m21738r0(long j, float f, InterfaceC6108l interfaceC6108l) {
        super.m21360r0(j, f, interfaceC6108l);
        LayoutNodeWrapper m21368l1 = m21368l1();
        boolean z = false;
        if (m21368l1 != null && m21368l1.m21358s1()) {
            z = true;
        }
        if (z) {
            return;
        }
        m21423A1();
        Placeable.AbstractC5751a.C5752a c5752a = Placeable.AbstractC5751a.f16066a;
        int m824g = C13615m.m824g(m23180n0());
        EnumC13618o layoutDirection = m21743e1().getLayoutDirection();
        int m23145z = Placeable.AbstractC5751a.C5752a.m23145z(c5752a);
        EnumC13618o m23146y = Placeable.AbstractC5751a.C5752a.m23146y(c5752a);
        Placeable.AbstractC5751a.m23167f(m824g);
        Placeable.AbstractC5751a.m23168e(layoutDirection);
        m21377d1().mo23003d();
        Placeable.AbstractC5751a.m23167f(m23145z);
        Placeable.AbstractC5751a.m23168e(m23146y);
    }

    /* renamed from: v1 */
    public void m21737v1() {
        super.m21353v1();
        m21742k1().m21405J1(this);
    }

    /* renamed from: x */
    public Object mo23120x() {
        return m21742k1().mo23120x();
    }
}
