package p169j1;

import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p112g0.MutableVector;
import p169j1.InterfaceC6253f0;
import p169j1.LayoutNode;
import p181jd.Intrinsics;
import p479z1.C13599b;

/* renamed from: j1.q */
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {

    /* renamed from: a */
    private final LayoutNode f17252a;

    /* renamed from: b */
    private final DepthSortedSet f17253b;

    /* renamed from: c */
    private boolean f17254c;

    /* renamed from: d */
    private final OnPositionedDispatcher f17255d;

    /* renamed from: e */
    private long f17256e;

    /* renamed from: f */
    private final List f17257f;

    /* renamed from: g */
    private C13599b f17258g;

    /* renamed from: h */
    private final LayoutTreeConsistencyChecker f17259h;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* renamed from: j1.q$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6292a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17260a;

        static {
            int[] iArr = new int[LayoutNode.EnumC6272e.values().length];
            iArr[LayoutNode.EnumC6272e.Measuring.ordinal()] = 1;
            iArr[LayoutNode.EnumC6272e.NeedsRemeasure.ordinal()] = 2;
            iArr[LayoutNode.EnumC6272e.LayingOut.ordinal()] = 3;
            iArr[LayoutNode.EnumC6272e.NeedsRelayout.ordinal()] = 4;
            iArr[LayoutNode.EnumC6272e.Ready.ordinal()] = 5;
            f17260a = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "root");
        this.f17252a = layoutNode;
        InterfaceC6253f0.C6254a c6254a = InterfaceC6253f0.f17138p;
        DepthSortedSet depthSortedSet = new DepthSortedSet(c6254a.m21642a());
        this.f17253b = depthSortedSet;
        this.f17255d = new OnPositionedDispatcher();
        this.f17256e = 1L;
        ArrayList arrayList = new ArrayList();
        this.f17257f = arrayList;
        this.f17259h = c6254a.m21642a() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSet, arrayList) : null;
    }

    /* renamed from: a */
    public static final /* synthetic */ LayoutNode m21332a(MeasureAndLayoutDelegate measureAndLayoutDelegate) {
        return measureAndLayoutDelegate.f17252a;
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m21331b(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode) {
        return measureAndLayoutDelegate.m21321l(layoutNode);
    }

    /* renamed from: d */
    public static /* synthetic */ void m21329d(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.m21330c(z);
    }

    /* renamed from: e */
    private final boolean m21328e(LayoutNode layoutNode) {
        boolean m21584E0;
        if (layoutNode == this.f17252a) {
            C13599b c13599b = this.f17258g;
            Intrinsics.ifNullDoSomething(c13599b);
            m21584E0 = layoutNode.m21586D0(c13599b);
        } else {
            m21584E0 = LayoutNode.m21584E0(layoutNode, null, 1, null);
        }
        LayoutNode m21547a0 = layoutNode.m21547a0();
        if (m21584E0 && m21547a0 != null) {
            if (layoutNode.m21554U() == LayoutNode.EnumC6274g.InMeasureBlock) {
                m21319n(m21547a0);
            } else {
                if (layoutNode.m21554U() == LayoutNode.EnumC6274g.InLayoutBlock) {
                    m21320m(m21547a0);
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        return m21584E0;
    }

    /* renamed from: g */
    private final boolean m21326g(LayoutNode layoutNode) {
        return layoutNode.m21561Q() == LayoutNode.EnumC6272e.NeedsRemeasure && (layoutNode.m21554U() == LayoutNode.EnumC6274g.InMeasureBlock || layoutNode.m21579H().m21469e());
    }

    /* renamed from: l */
    private final boolean m21321l(LayoutNode layoutNode) {
        int i = 0;
        if (layoutNode.mo23015f() || m21326g(layoutNode) || layoutNode.m21579H().m21469e()) {
            boolean m21328e = layoutNode.m21561Q() == LayoutNode.EnumC6272e.NeedsRemeasure ? m21328e(layoutNode) : false;
            if (layoutNode.m21561Q() == LayoutNode.EnumC6272e.NeedsRelayout && layoutNode.mo23015f()) {
                if (layoutNode == this.f17252a) {
                    layoutNode.m21590B0(0, 0);
                } else {
                    layoutNode.m21578H0();
                }
                this.f17255d.m21715c(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17259h;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.m21338a();
                }
            }
            if (!this.f17257f.isEmpty()) {
                List list = this.f17257f;
                int size = list.size();
                while (i < size) {
                    int i2 = i + 1;
                    LayoutNode layoutNode2 = (LayoutNode) list.get(i);
                    if (layoutNode2.m21515q0()) {
                        m21319n(layoutNode2);
                    }
                    i = i2;
                }
                this.f17257f.clear();
            }
            return m21328e;
        }
        return false;
    }

    /* renamed from: c */
    public final void m21330c(boolean z) {
        if (z) {
            this.f17255d.m21714d(this.f17252a);
        }
        this.f17255d.m21717a();
    }

    /* renamed from: f */
    public final void m21327f(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        if (this.f17253b.m21722d()) {
            return;
        }
        if (this.f17254c) {
            int i = 0;
            if (layoutNode.m21561Q() != LayoutNode.EnumC6272e.NeedsRemeasure) {
                MutableVector m21537f0 = layoutNode.m21537f0();
                int m23649p = m21537f0.m23649p();
                if (m23649p > 0) {
                    Object[] m23650o = m21537f0.m23650o();
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) m23650o[i];
                        LayoutNode.EnumC6272e m21561Q = layoutNode2.m21561Q();
                        LayoutNode.EnumC6272e enumC6272e = LayoutNode.EnumC6272e.NeedsRemeasure;
                        if (m21561Q == enumC6272e && this.f17253b.m21720f(layoutNode2)) {
                            m21321l(layoutNode2);
                        }
                        if (layoutNode2.m21561Q() != enumC6272e) {
                            m21327f(layoutNode2);
                        }
                        i++;
                    } while (i < m23649p);
                    if (layoutNode.m21561Q() == LayoutNode.EnumC6272e.NeedsRemeasure || !this.f17253b.m21720f(layoutNode)) {
                        return;
                    }
                    m21321l(layoutNode);
                    return;
                } else if (layoutNode.m21561Q() == LayoutNode.EnumC6272e.NeedsRemeasure) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: h */
    public final boolean m21325h() {
        return !this.f17253b.m21722d();
    }

    /* renamed from: i */
    public final long m21324i() {
        if (this.f17254c) {
            return this.f17256e;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* renamed from: j */
    public final boolean m21323j(InterfaceC6097a interfaceC6097a) {
        if (this.f17252a.m21515q0()) {
            if (this.f17252a.mo23015f()) {
                if (!this.f17254c) {
                    if (this.f17258g != null && (!this.f17253b.m21722d())) {
                        this.f17254c = true;
                        try {
                            DepthSortedSet depthSortedSet = this.f17253b;
                            boolean z = false;
                            while (!depthSortedSet.m21722d()) {
                                LayoutNode m21721e = depthSortedSet.m21721e();
                                boolean m21331b = m21331b(this, m21721e);
                                if (m21721e == m21332a(this) && m21331b) {
                                    z = true;
                                }
                            }
                            this.f17254c = false;
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17259h;
                            if (layoutTreeConsistencyChecker != null) {
                                layoutTreeConsistencyChecker.m21338a();
                            }
                            if (interfaceC6097a != null) {
                                interfaceC6097a.mo42214q();
                            }
                            return z;
                        } catch (Throwable th2) {
                            this.f17254c = false;
                            throw th2;
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k */
    public final void m21322k(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        this.f17253b.m21720f(layoutNode);
    }

    /* renamed from: m */
    public final boolean m21320m(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        int i = C6292a.f17260a[layoutNode.m21561Q().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17259h;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.m21338a();
            return false;
        } else if (i == 5) {
            LayoutNode.EnumC6272e enumC6272e = LayoutNode.EnumC6272e.NeedsRelayout;
            layoutNode.m21564O0(enumC6272e);
            if (layoutNode.mo23015f()) {
                LayoutNode m21547a0 = layoutNode.m21547a0();
                LayoutNode.EnumC6272e m21561Q = m21547a0 == null ? null : m21547a0.m21561Q();
                if (m21561Q != LayoutNode.EnumC6272e.NeedsRemeasure && m21561Q != enumC6272e) {
                    this.f17253b.m21725a(layoutNode);
                }
            }
            return !this.f17254c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: n */
    public final boolean m21319n(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        int i = C6292a.f17260a[layoutNode.m21561Q().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.f17257f.add(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17259h;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.m21338a();
                }
            } else if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            } else {
                LayoutNode.EnumC6272e enumC6272e = LayoutNode.EnumC6272e.NeedsRemeasure;
                layoutNode.m21564O0(enumC6272e);
                if (layoutNode.mo23015f() || m21326g(layoutNode)) {
                    LayoutNode m21547a0 = layoutNode.m21547a0();
                    if ((m21547a0 == null ? null : m21547a0.m21561Q()) != enumC6272e) {
                        this.f17253b.m21725a(layoutNode);
                    }
                }
                if (!this.f17254c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public final void m21318o(long j) {
        C13599b c13599b = this.f17258g;
        if (c13599b == null ? false : C13599b.m923g(c13599b.m911s(), j)) {
            return;
        }
        if (!this.f17254c) {
            this.f17258g = C13599b.m928b(j);
            this.f17252a.m21564O0(LayoutNode.EnumC6272e.NeedsRemeasure);
            this.f17253b.m21725a(this.f17252a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
