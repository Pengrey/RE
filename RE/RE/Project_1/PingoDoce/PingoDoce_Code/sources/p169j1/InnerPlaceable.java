package p169j1;

import id.InterfaceC6108l;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p072e1.NestedScrollDelegatingWrapper;
import p112g0.MutableVector;
import p127h1.AbstractC5743a;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.LayoutNode;
import p181jd.Intrinsics;
import p358t0.EnumC10353v;
import p358t0.InterfaceC10352u;
import p393v0.C11028i;
import p393v0.C11049p0;
import p393v0.Color;
import p393v0.InterfaceC11046o0;
import p479z1.Density;

/* renamed from: j1.h */
/* loaded from: classes.dex */
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {

    /* renamed from: W */
    private static final InterfaceC11046o0 f17141W;

    /* renamed from: V */
    private final /* synthetic */ MeasureScope f17142V;

    /* compiled from: InnerPlaceable.kt */
    /* renamed from: j1.h$a */
    /* loaded from: classes.dex */
    public static final class C6258a {
        private C6258a() {
        }

        public /* synthetic */ C6258a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: InnerPlaceable.kt */
    /* renamed from: j1.h$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6259b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17143a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Active.ordinal()] = 1;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 2;
            iArr[EnumC10353v.Captured.ordinal()] = 3;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC10353v.Deactivated.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f17143a = iArr;
        }
    }

    static {
        new C6258a(null);
        InterfaceC11046o0 m6475a = C11028i.m6475a();
        m6475a.mo6394o(Color.f28297b.m6634d());
        m6475a.mo6388u(1.0f);
        m6475a.mo6397l(C11049p0.f28431a.m6318b());
        f17141W = m6475a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerPlaceable(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f17142V = layoutNode.m21555T();
    }

    /* renamed from: A */
    public float m21637A(float f) {
        return this.f17142V.m899A(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21636B1(p393v0.InterfaceC11064u r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            p181jd.Intrinsics.isThisObjectNull(r7, r0)
            j1.k r0 = r6.m21378c1()
            j1.f0 r0 = p169j1.C6284n.m21433a(r0)
            j1.k r1 = r6.m21378c1()
            g0.e r1 = r1.m21539e0()
            int r2 = r1.m23649p()
            if (r2 <= 0) goto L31
            r3 = 0
            java.lang.Object[] r1 = r1.m23650o()
        L20:
            r4 = r1[r3]
            j1.k r4 = (p169j1.LayoutNode) r4
            boolean r5 = r4.mo23015f()
            if (r5 == 0) goto L2d
            r4.m21581G(r7)
        L2d:
            int r3 = r3 + 1
            if (r3 < r2) goto L20
        L31:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L3c
            v0.o0 r0 = p169j1.InnerPlaceable.f17141W
            r6.m21408I0(r7, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.InnerPlaceable.m21636B1(v0.u):void");
    }

    /* renamed from: D0 */
    public int m21635D0(AbstractC5743a abstractC5743a) {
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        Integer num = (Integer) m21378c1().m21593A().get(abstractC5743a);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    /* renamed from: D1 */
    public void m21634D1(InterfaceC10352u interfaceC10352u) {
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
        int i = 0;
        List m21389U0 = m21389U0(false);
        int size = m21389U0.size();
        ModifiedFocusNode modifiedFocusNode = null;
        Boolean bool = null;
        while (i < size) {
            int i2 = i + 1;
            ModifiedFocusNode modifiedFocusNode2 = (ModifiedFocusNode) m21389U0.get(i);
            switch (C6259b.f17143a[modifiedFocusNode2.m21308Z1().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bool = Boolean.FALSE;
                    modifiedFocusNode = modifiedFocusNode2;
                    break;
                case 5:
                    if (bool != null) {
                        break;
                    } else {
                        bool = Boolean.TRUE;
                        break;
                    }
                case 6:
                    bool = Boolean.FALSE;
                    break;
            }
            i = i2;
        }
        EnumC10353v m21308Z1 = modifiedFocusNode != null ? modifiedFocusNode.m21308Z1() : null;
        if (m21308Z1 == null) {
            m21308Z1 = Intrinsics.equals(bool, Boolean.TRUE) ? EnumC10353v.Deactivated : EnumC10353v.Inactive;
        }
        super.m21417D1(m21308Z1);
    }

    /* renamed from: K1 */
    public boolean m21633K1() {
        return false;
    }

    /* renamed from: L0 */
    public ModifiedFocusNode m21632L0() {
        return m21627R0();
    }

    /* renamed from: M0 */
    public ModifiedKeyInputNode m21631M0() {
        return m21626S0();
    }

    /* renamed from: N0 */
    public ModifiedFocusNode m21630N0(boolean z) {
        return null;
    }

    /* renamed from: O */
    public int m21629O(float f) {
        return this.f17142V.m898O(f);
    }

    /* renamed from: O0 */
    public NestedScrollDelegatingWrapper m21628O0() {
        return null;
    }

    /* renamed from: R0 */
    public ModifiedFocusNode m21627R0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21393R0();
    }

    /* renamed from: S0 */
    public ModifiedKeyInputNode m21626S0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21391S0();
    }

    /* renamed from: T0 */
    public NestedScrollDelegatingWrapper m21625T0() {
        LayoutNodeWrapper m21368l1 = m21368l1();
        if (m21368l1 == null) {
            return null;
        }
        return m21368l1.m21390T0();
    }

    /* renamed from: U */
    public long m21624U(long j) {
        return this.f17142V.m897U(j);
    }

    /* renamed from: Y */
    public float m21623Y(long j) {
        return this.f17142V.m896Y(j);
    }

    /* renamed from: e1 */
    public MeasureScope m21622e1() {
        return m21378c1().m21555T();
    }

    public float getDensity() {
        return this.f17142V.getDensity();
    }

    /* renamed from: i0 */
    public float m21621i0(int i) {
        return this.f17142V.m895i0(i);
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        LayoutNodeWrapper.m21347y0(this, j);
        MutableVector m21537f0 = m21378c1().m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21537f0.m23650o();
            do {
                ((LayoutNode) m23650o[i]).m21562P0(LayoutNode.EnumC6274g.NotUsed);
                i++;
            } while (i < m23649p);
            m21378c1().m21535g0(m21378c1().m21557S().mo23006a(m21378c1().m21555T(), m21378c1().m21575J(), j));
            return this;
        }
        m21378c1().m21535g0(m21378c1().m21557S().mo23006a(m21378c1().m21555T(), m21378c1().m21575J(), j));
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[EDGE_INSN: B:39:0x0094->B:37:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: n1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21619n1(long r18, p169j1.HitTestResult r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r6 = r20
            java.lang.String r0 = "hitTestResult"
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            boolean r0 = r17.m21397N1(r18)
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L17
            r9 = r17
            r10 = r18
            r12 = r22
        L15:
            r0 = r8
            goto L3f
        L17:
            if (r21 == 0) goto L38
            long r0 = r17.m21375f1()
            r9 = r17
            r10 = r18
            float r0 = r9.m21412G0(r10, r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L33
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L33
            r0 = r8
            goto L34
        L33:
            r0 = r7
        L34:
            if (r0 == 0) goto L3c
            r12 = r7
            goto L15
        L38:
            r9 = r17
            r10 = r18
        L3c:
            r12 = r22
            r0 = r7
        L3f:
            if (r0 == 0) goto L97
            int r13 = p169j1.HitTestResult.m21664f(r20)
            j1.k r0 = r17.m21378c1()
            g0.e r0 = r0.m21539e0()
            int r1 = r0.m23649p()
            if (r1 <= 0) goto L94
            int r1 = r1 - r8
            java.lang.Object[] r14 = r0.m23650o()
            r15 = r1
        L59:
            r0 = r14[r15]
            r16 = r0
            j1.k r16 = (p169j1.LayoutNode) r16
            boolean r0 = r16.mo23015f()
            if (r0 == 0) goto L8c
            r0 = r16
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r12
            r0.m21531i0(r1, r3, r4, r5)
            boolean r0 = r20.m21658t()
            if (r0 != 0) goto L79
        L77:
            r0 = r8
            goto L88
        L79:
            j1.o r0 = r16.m21550Y()
            boolean r0 = r0.m21403K1()
            if (r0 == 0) goto L87
            r20.m21665b()
            goto L77
        L87:
            r0 = r7
        L88:
            if (r0 != 0) goto L8c
            r0 = r8
            goto L8d
        L8c:
            r0 = r7
        L8d:
            if (r0 == 0) goto L90
            goto L94
        L90:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L59
        L94:
            p169j1.HitTestResult.m21662l(r6, r13)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.InnerPlaceable.m21619n1(long, j1.f, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:35:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21618o1(long r18, p169j1.HitTestResult r20, boolean r21) {
        /*
            r17 = this;
            r6 = r20
            java.lang.String r0 = "hitSemanticsWrappers"
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            boolean r0 = r17.m21397N1(r18)
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L17
            r9 = r17
            r10 = r18
            r12 = r21
        L15:
            r0 = r8
            goto L39
        L17:
            long r0 = r17.m21375f1()
            r9 = r17
            r10 = r18
            float r0 = r9.m21412G0(r10, r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L31
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L31
            r0 = r8
            goto L32
        L31:
            r0 = r7
        L32:
            if (r0 == 0) goto L36
            r12 = r7
            goto L15
        L36:
            r12 = r21
            r0 = r7
        L39:
            if (r0 == 0) goto L90
            int r13 = p169j1.HitTestResult.m21664f(r20)
            j1.k r0 = r17.m21378c1()
            g0.e r0 = r0.m21539e0()
            int r1 = r0.m23649p()
            if (r1 <= 0) goto L8d
            int r1 = r1 - r8
            java.lang.Object[] r14 = r0.m23650o()
            r15 = r1
        L53:
            r0 = r14[r15]
            r16 = r0
            j1.k r16 = (p169j1.LayoutNode) r16
            boolean r0 = r16.mo23015f()
            if (r0 == 0) goto L85
            r4 = 1
            r0 = r16
            r1 = r18
            r3 = r20
            r5 = r12
            r0.m21527k0(r1, r3, r4, r5)
            boolean r0 = r20.m21658t()
            if (r0 != 0) goto L72
        L70:
            r0 = r8
            goto L81
        L72:
            j1.o r0 = r16.m21550Y()
            boolean r0 = r0.m21403K1()
            if (r0 == 0) goto L80
            r20.m21665b()
            goto L70
        L80:
            r0 = r7
        L81:
            if (r0 != 0) goto L85
            r0 = r8
            goto L86
        L85:
            r0 = r7
        L86:
            if (r0 == 0) goto L89
            goto L8d
        L89:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L53
        L8d:
            p169j1.HitTestResult.m21662l(r6, r13)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.InnerPlaceable.m21618o1(long, j1.f, boolean):void");
    }

    /* renamed from: r */
    public float m21617r() {
        return this.f17142V.m894r();
    }

    /* renamed from: r0 */
    protected void m21616r0(long j, float f, InterfaceC6108l interfaceC6108l) {
        super.m21360r0(j, f, interfaceC6108l);
        LayoutNodeWrapper m21368l1 = m21368l1();
        boolean z = false;
        if (m21368l1 != null && m21368l1.m21358s1()) {
            z = true;
        }
        if (z) {
            return;
        }
        m21378c1().m21497z0();
    }

    /* renamed from: x */
    public Object mo23120x() {
        return null;
    }
}
