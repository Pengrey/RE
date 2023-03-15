package p169j1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p127h1.AbstractC5743a;
import p127h1.InterfaceC5803r;
import p127h1.Placeable;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13612k;

/* renamed from: j1.d0 */
/* loaded from: classes.dex */
public final class OuterMeasurablePlaceable extends Placeable implements InterfaceC5803r {

    /* renamed from: A */
    private final LayoutNode f17099A;

    /* renamed from: B */
    private LayoutNodeWrapper f17100B;

    /* renamed from: C */
    private boolean f17101C;

    /* renamed from: D */
    private boolean f17102D;

    /* renamed from: E */
    private boolean f17103E;

    /* renamed from: F */
    private long f17104F;

    /* renamed from: G */
    private InterfaceC6108l f17105G;

    /* renamed from: H */
    private float f17106H;

    /* renamed from: I */
    private Object f17107I;

    /* compiled from: OuterMeasurablePlaceable.kt */
    /* renamed from: j1.d0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6243a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17108a;

        static {
            int[] iArr = new int[LayoutNode.EnumC6272e.values().length];
            iArr[LayoutNode.EnumC6272e.Measuring.ordinal()] = 1;
            iArr[LayoutNode.EnumC6272e.LayingOut.ordinal()] = 2;
            f17108a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OuterMeasurablePlaceable.kt */
    /* renamed from: j1.d0$b */
    /* loaded from: classes.dex */
    public static final class C6244b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ long f17110x;

        /* renamed from: y */
        final /* synthetic */ float f17111y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f17112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6244b(long j, float f, InterfaceC6108l interfaceC6108l) {
            super(0);
            this.f17110x = j;
            this.f17111y = f;
            this.f17112z = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m21694a() {
            OuterMeasurablePlaceable.m21700v0(OuterMeasurablePlaceable.this, this.f17110x, this.f17111y, this.f17112z);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21694a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OuterMeasurablePlaceable.kt */
    /* renamed from: j1.d0$c */
    /* loaded from: classes.dex */
    public static final class C6245c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ long f17114x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6245c(long j) {
            super(0);
            this.f17114x = j;
        }

        /* renamed from: a */
        public final void m21693a() {
            OuterMeasurablePlaceable.this.m21696y0().mo23007n(this.f17114x);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21693a();
            return C13195u.f34156a;
        }
    }

    public OuterMeasurablePlaceable(LayoutNode layoutNode, LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "outerWrapper");
        this.f17099A = layoutNode;
        this.f17100B = layoutNodeWrapper;
        this.f17104F = C13612k.f34607b.m834a();
    }

    /* renamed from: v0 */
    public static final /* synthetic */ void m21700v0(OuterMeasurablePlaceable outerMeasurablePlaceable, long j, float f, InterfaceC6108l interfaceC6108l) {
        outerMeasurablePlaceable.m21695z0(j, f, interfaceC6108l);
    }

    /* renamed from: z0 */
    private final void m21695z0(long j, float f, InterfaceC6108l interfaceC6108l) {
        Placeable.AbstractC5751a.C5752a c5752a = Placeable.AbstractC5751a.f16066a;
        if (interfaceC6108l == null) {
            c5752a.m23162k(m21696y0(), j, f);
        } else {
            c5752a.m23150w(m21696y0(), j, f, interfaceC6108l);
        }
    }

    /* renamed from: A0 */
    public final void m21708A0() {
        this.f17107I = this.f17100B.mo23120x();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m21707B0(long r9) {
        /*
            r8 = this;
            j1.k r0 = r8.f17099A
            j1.f0 r0 = p169j1.C6284n.m21433a(r0)
            j1.k r1 = r8.f17099A
            j1.k r1 = r1.m21547a0()
            j1.k r2 = r8.f17099A
            boolean r3 = r2.m21577I()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L21
            if (r1 == 0) goto L1f
            boolean r1 = r1.m21577I()
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = r5
            goto L22
        L21:
            r1 = r4
        L22:
            r2.m21568M0(r1)
            j1.k r1 = r8.f17099A
            j1.k$e r1 = r1.m21561Q()
            j1.k$e r2 = p169j1.LayoutNode.EnumC6272e.NeedsRemeasure
            if (r1 == r2) goto L40
            long r1 = r8.m23178p0()
            boolean r1 = p479z1.C13599b.m923g(r1, r9)
            if (r1 != 0) goto L3a
            goto L40
        L3a:
            j1.k r9 = r8.f17099A
            r0.mo21648l(r9)
            return r5
        L40:
            j1.k r1 = r8.f17099A
            j1.l r1 = r1.m21579H()
            r1.m21457q(r5)
            j1.k r1 = r8.f17099A
            g0.e r1 = r1.m21537f0()
            int r2 = r1.m23649p()
            if (r2 <= 0) goto L68
            java.lang.Object[] r1 = r1.m23650o()
            r3 = r5
        L5a:
            r6 = r1[r3]
            j1.k r6 = (p169j1.LayoutNode) r6
            j1.l r6 = r6.m21579H()
            r6.m21455s(r5)
            int r3 = r3 + r4
            if (r3 < r2) goto L5a
        L68:
            r8.f17101C = r4
            j1.k r1 = r8.f17099A
            j1.k$e r2 = p169j1.LayoutNode.EnumC6272e.Measuring
            r1.m21564O0(r2)
            r8.m23173u0(r9)
            j1.o r1 = r8.f17100B
            long r6 = r1.mo23107b()
            j1.h0 r0 = r0.getSnapshotObserver()
            j1.k r1 = r8.f17099A
            j1.d0$c r3 = new j1.d0$c
            r3.<init>(r9)
            r0.m21611d(r1, r3)
            j1.k r9 = r8.f17099A
            j1.k$e r9 = r9.m21561Q()
            if (r9 != r2) goto L97
            j1.k r9 = r8.f17099A
            j1.k$e r10 = p169j1.LayoutNode.EnumC6272e.NeedsRelayout
            r9.m21564O0(r10)
        L97:
            j1.o r9 = r8.f17100B
            long r9 = r9.mo23107b()
            boolean r9 = p479z1.C13615m.m826e(r9, r6)
            if (r9 == 0) goto Lbd
            j1.o r9 = r8.f17100B
            int r9 = r9.m23177q0()
            int r10 = r8.m23177q0()
            if (r9 != r10) goto Lbd
            j1.o r9 = r8.f17100B
            int r9 = r9.m23182l0()
            int r10 = r8.m23182l0()
            if (r9 == r10) goto Lbc
            goto Lbd
        Lbc:
            r4 = r5
        Lbd:
            j1.o r9 = r8.f17100B
            int r9 = r9.m23177q0()
            j1.o r10 = r8.f17100B
            int r10 = r10.m23182l0()
            long r9 = p479z1.C13617n.m819a(r9, r10)
            r8.m23174t0(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.OuterMeasurablePlaceable.m21707B0(long):boolean");
    }

    /* renamed from: C0 */
    public final void m21706C0() {
        if (this.f17102D) {
            m21701r0(this.f17104F, this.f17106H, this.f17105G);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: D0 */
    public final void m21705D0(LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "<set-?>");
        this.f17100B = layoutNodeWrapper;
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        LayoutNode.EnumC6274g enumC6274g;
        LayoutNode m21547a0 = this.f17099A.m21547a0();
        if (m21547a0 != null) {
            if (this.f17099A.m21554U() == LayoutNode.EnumC6274g.NotUsed || this.f17099A.m21577I()) {
                LayoutNode layoutNode = this.f17099A;
                int i = C6243a.f17108a[m21547a0.m21561Q().ordinal()];
                if (i == 1) {
                    enumC6274g = LayoutNode.EnumC6274g.InMeasureBlock;
                } else if (i == 2) {
                    enumC6274g = LayoutNode.EnumC6274g.InLayoutBlock;
                } else {
                    throw new IllegalStateException(Intrinsics.addStrAndObj("Measurable could be only measured from the parent's measure or layout block.Parents state is ", m21547a0.m21561Q()));
                }
                layoutNode.m21562P0(enumC6274g);
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.f17099A.m21554U() + ". Parent state " + m21547a0.m21561Q() + '.').toString());
            }
        } else {
            this.f17099A.m21562P0(LayoutNode.EnumC6274g.NotUsed);
        }
        m21707B0(j);
        return this;
    }

    /* renamed from: o0 */
    public int m21703o0() {
        return this.f17100B.m23179o0();
    }

    /* renamed from: p */
    public int mo22989p(AbstractC5743a abstractC5743a) {
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        LayoutNode m21547a0 = this.f17099A.m21547a0();
        if ((m21547a0 == null ? null : m21547a0.m21561Q()) == LayoutNode.EnumC6272e.Measuring) {
            this.f17099A.m21579H().m21455s(true);
        } else {
            LayoutNode m21547a02 = this.f17099A.m21547a0();
            if ((m21547a02 != null ? m21547a02.m21561Q() : null) == LayoutNode.EnumC6272e.LayingOut) {
                this.f17099A.m21579H().m21456r(true);
            }
        }
        this.f17103E = true;
        int mo22989p = this.f17100B.mo22989p(abstractC5743a);
        this.f17103E = false;
        return mo22989p;
    }

    /* renamed from: r0 */
    protected void m21701r0(long j, float f, InterfaceC6108l interfaceC6108l) {
        this.f17104F = j;
        this.f17106H = f;
        this.f17105G = interfaceC6108l;
        LayoutNodeWrapper m21368l1 = this.f17100B.m21368l1();
        if (m21368l1 != null && m21368l1.m21358s1()) {
            m21695z0(j, f, interfaceC6108l);
            return;
        }
        this.f17102D = true;
        this.f17099A.m21579H().m21458p(false);
        C6284n.m21433a(this.f17099A).getSnapshotObserver().m21613b(this.f17099A, new C6244b(j, f, interfaceC6108l));
    }

    /* renamed from: w0 */
    public final boolean m21699w0() {
        return this.f17103E;
    }

    /* renamed from: x */
    public Object mo23120x() {
        return this.f17107I;
    }

    /* renamed from: x0 */
    public final C13599b m21697x0() {
        if (this.f17101C) {
            return C13599b.m928b(m23178p0());
        }
        return null;
    }

    /* renamed from: y0 */
    public final LayoutNodeWrapper m21696y0() {
        return this.f17100B;
    }
}
