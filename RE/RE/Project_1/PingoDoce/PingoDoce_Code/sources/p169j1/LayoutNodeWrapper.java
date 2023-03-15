package p169j1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p072e1.NestedScrollDelegatingWrapper;
import p127h1.AbstractC5743a;
import p127h1.InterfaceC5776j;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p149i1.AbstractC5988a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p358t0.C10341m;
import p358t0.FocusNodeUtils;
import p358t0.InterfaceC10352u;
import p373u0.C10773d;
import p373u0.C10774f;
import p373u0.C10776g;
import p373u0.C10781l;
import p373u0.C10783m;
import p373u0.MutableRect;
import p373u0.Rect;
import p393v0.C11075y0;
import p393v0.InterfaceC11046o0;
import p393v0.InterfaceC11064u;
import p468yc.C13195u;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;
import p489zc.C13778q0;
import p489zc.CollectionsJVM;

/* renamed from: j1.o */
/* loaded from: classes.dex */
public abstract class LayoutNodeWrapper extends Placeable implements InterfaceC5803r, InterfaceC5776j, InterfaceC6257g0, InterfaceC6108l {

    /* renamed from: S */
    private static final InterfaceC6108l f17222S;

    /* renamed from: T */
    private static final InterfaceC6108l f17223T;

    /* renamed from: U */
    private static final C11075y0 f17224U;

    /* renamed from: A */
    private final LayoutNode f17225A;

    /* renamed from: B */
    private LayoutNodeWrapper f17226B;

    /* renamed from: C */
    private boolean f17227C;

    /* renamed from: D */
    private InterfaceC6108l f17228D;

    /* renamed from: E */
    private Density f17229E;

    /* renamed from: F */
    private EnumC13618o f17230F;

    /* renamed from: G */
    private float f17231G;

    /* renamed from: H */
    private boolean f17232H;

    /* renamed from: I */
    private InterfaceC5805t f17233I;

    /* renamed from: J */
    private Map f17234J;

    /* renamed from: K */
    private long f17235K;

    /* renamed from: L */
    private float f17236L;

    /* renamed from: M */
    private boolean f17237M;

    /* renamed from: N */
    private C10773d f17238N;

    /* renamed from: O */
    private DrawEntity f17239O;

    /* renamed from: P */
    private final InterfaceC6097a f17240P;

    /* renamed from: Q */
    private boolean f17241Q;

    /* renamed from: R */
    private InterfaceC6250e0 f17242R;

    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$a */
    /* loaded from: classes.dex */
    static final class C6286a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6286a f17243w = new C6286a();

        C6286a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21343a(LayoutNodeWrapper layoutNodeWrapper) {
            Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapper");
            InterfaceC6250e0 m21382a1 = layoutNodeWrapper.m21382a1();
            if (m21382a1 == null) {
                return;
            }
            m21382a1.invalidate();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21343a((LayoutNodeWrapper) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$b */
    /* loaded from: classes.dex */
    static final class C6287b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6287b f17244w = new C6287b();

        C6287b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21342a(LayoutNodeWrapper layoutNodeWrapper) {
            Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapper");
            if (layoutNodeWrapper.mo21638k()) {
                LayoutNodeWrapper.m21345z0(layoutNodeWrapper);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21342a((LayoutNodeWrapper) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$c */
    /* loaded from: classes.dex */
    public static final class C6288c {
        private C6288c() {
        }

        public /* synthetic */ C6288c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$d */
    /* loaded from: classes.dex */
    public static final class C6289d extends AbstractC6438m implements InterfaceC6097a {
        C6289d() {
            super(0);
        }

        /* renamed from: a */
        public final void m21341a() {
            LayoutNodeWrapper m21368l1 = LayoutNodeWrapper.this.m21368l1();
            if (m21368l1 == null) {
                return;
            }
            m21368l1.m21362p1();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21341a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$e */
    /* loaded from: classes.dex */
    public static final class C6290e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ InterfaceC11064u f17247x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6290e(InterfaceC11064u interfaceC11064u) {
            super(0);
            this.f17247x = interfaceC11064u;
        }

        /* renamed from: a */
        public final void m21340a() {
            LayoutNodeWrapper.m21354v0(LayoutNodeWrapper.this, this.f17247x);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21340a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeWrapper.kt */
    /* renamed from: j1.o$f */
    /* loaded from: classes.dex */
    public static final class C6291f extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f17248w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6291f(InterfaceC6108l interfaceC6108l) {
            super(0);
            this.f17248w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m21339a() {
            this.f17248w.mo9587d(LayoutNodeWrapper.m21352w0());
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21339a();
            return C13195u.f34156a;
        }
    }

    static {
        new C6288c(null);
        f17222S = C6287b.f17244w;
        f17223T = C6286a.f17243w;
        f17224U = new C11075y0();
    }

    public LayoutNodeWrapper(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f17225A = layoutNode;
        this.f17229E = layoutNode.m21573K();
        this.f17230F = layoutNode.getLayoutDirection();
        this.f17231G = 0.8f;
        this.f17235K = C13612k.f34607b.m834a();
        this.f17240P = new C6289d();
    }

    /* renamed from: A0 */
    private final void m21424A0(LayoutNodeWrapper layoutNodeWrapper, C10773d c10773d, boolean z) {
        if (layoutNodeWrapper == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f17226B;
        if (layoutNodeWrapper2 != null) {
            layoutNodeWrapper2.m21424A0(layoutNodeWrapper, c10773d, z);
        }
        m21386W0(c10773d, z);
    }

    /* renamed from: B0 */
    private final long m21422B0(LayoutNodeWrapper layoutNodeWrapper, long j) {
        if (layoutNodeWrapper == this) {
            return j;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f17226B;
        if (layoutNodeWrapper2 != null && !Intrinsics.equals(layoutNodeWrapper, layoutNodeWrapper2)) {
            return m21387V0(layoutNodeWrapper2.m21422B0(layoutNodeWrapper, j));
        }
        return m21387V0(j);
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m21413F1(LayoutNodeWrapper layoutNodeWrapper, C10773d c10773d, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        layoutNodeWrapper.m21415E1(c10773d, z, z2);
    }

    /* renamed from: J0 */
    private final void m21406J0(InterfaceC11064u interfaceC11064u) {
        DrawEntity drawEntity = this.f17239O;
        if (drawEntity == null) {
            m21421B1(interfaceC11064u);
        } else {
            drawEntity.m21688e(interfaceC11064u);
        }
    }

    /* renamed from: M1 */
    private final void m21399M1() {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            InterfaceC6108l interfaceC6108l = this.f17228D;
            if (interfaceC6108l != null) {
                C11075y0 c11075y0 = f17224U;
                c11075y0.m6225V();
                c11075y0.m6223a0(this.f17225A.m21573K());
                m21371j1().m21610e(this, f17222S, new C6291f(interfaceC6108l));
                interfaceC6250e0.mo21676a(c11075y0.m6202x(), c11075y0.m6201y(), c11075y0.m6213k(), c11075y0.m6231K(), c11075y0.m6227S(), c11075y0.m6234C(), c11075y0.m6207q(), c11075y0.m6205t(), c11075y0.m6204u(), c11075y0.m6210n(), c11075y0.m6232I(), c11075y0.m6233F(), c11075y0.m6209o(), c11075y0.m6208p(), this.f17225A.getLayoutDirection(), this.f17225A.m21573K());
                this.f17227C = c11075y0.m6209o();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (!(this.f17228D == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.f17231G = f17224U.m6213k();
        InterfaceC6253f0 m21549Z = this.f17225A.m21549Z();
        if (m21549Z == null) {
            return;
        }
        m21549Z.mo21643s(this.f17225A);
    }

    /* renamed from: W0 */
    private final void m21386W0(C10773d c10773d, boolean z) {
        float m839h = C13612k.m839h(m21374g1());
        c10773d.m7159i(c10773d.m7166b() - m839h);
        c10773d.m7158j(c10773d.m7165c() - m839h);
        float m838i = C13612k.m838i(m21374g1());
        c10773d.m7157k(c10773d.m7164d() - m838i);
        c10773d.m7160h(c10773d.m7167a() - m838i);
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.mo21671f(c10773d, true);
            if (this.f17227C && z) {
                c10773d.m7163e(0.0f, 0.0f, C13615m.m824g(mo23107b()), C13615m.m825f(mo23107b()));
                c10773d.m7162f();
            }
        }
    }

    /* renamed from: Y0 */
    private final boolean m21384Y0() {
        return this.f17233I != null;
    }

    /* renamed from: j1 */
    private final OwnerSnapshotObserver m21371j1() {
        return C6284n.m21433a(this.f17225A).getSnapshotObserver();
    }

    /* renamed from: u1 */
    private final long m21355u1(long j) {
        float m7145k = C10774f.m7145k(j);
        float max = Math.max(0.0f, m7145k < 0.0f ? -m7145k : m7145k - m23179o0());
        float m7144l = C10774f.m7144l(j);
        return C10776g.m7133a(max, Math.max(0.0f, m7144l < 0.0f ? -m7144l : m7144l - m23181m0()));
    }

    /* renamed from: v0 */
    public static final /* synthetic */ void m21354v0(LayoutNodeWrapper layoutNodeWrapper, InterfaceC11064u interfaceC11064u) {
        layoutNodeWrapper.m21406J0(interfaceC11064u);
    }

    /* renamed from: w0 */
    public static final /* synthetic */ C11075y0 m21352w0() {
        return f17224U;
    }

    /* renamed from: x0 */
    public static final /* synthetic */ long m21350x0(LayoutNodeWrapper layoutNodeWrapper) {
        return layoutNodeWrapper.m23180n0();
    }

    /* renamed from: y0 */
    public static final /* synthetic */ void m21347y0(LayoutNodeWrapper layoutNodeWrapper, long j) {
        layoutNodeWrapper.m23173u0(j);
    }

    /* renamed from: z0 */
    public static final /* synthetic */ void m21345z0(LayoutNodeWrapper layoutNodeWrapper) {
        layoutNodeWrapper.m21399M1();
    }

    /* renamed from: A1 */
    public void m21423A1() {
    }

    /* renamed from: B1 */
    public void m21421B1(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        LayoutNodeWrapper m21369k1 = m21369k1();
        if (m21369k1 == null) {
            return;
        }
        m21369k1.m21410H0(interfaceC11064u);
    }

    /* renamed from: C0 */
    public void m21420C0() {
        this.f17232H = true;
        m21351w1(this.f17228D);
    }

    /* renamed from: C1 */
    public void m21419C1(C10341m c10341m) {
        Intrinsics.isThisObjectNull(c10341m, "focusOrder");
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.m21419C1(c10341m);
    }

    /* renamed from: D0 */
    public abstract int m21418D0(AbstractC5743a abstractC5743a);

    /* renamed from: D1 */
    public void m21417D1(InterfaceC10352u interfaceC10352u) {
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.m21417D1(interfaceC10352u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E0 */
    public final long m21416E0(long j) {
        return C10783m.m7085a(Math.max(0.0f, (C10781l.m7091i(j) - m23179o0()) / 2.0f), Math.max(0.0f, (C10781l.m7093g(j) - m23181m0()) / 2.0f));
    }

    /* renamed from: E1 */
    public final void m21415E1(C10773d c10773d, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(c10773d, "bounds");
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            if (this.f17227C) {
                if (z2) {
                    long m21375f1 = m21375f1();
                    float m7091i = C10781l.m7091i(m21375f1) / 2.0f;
                    float m7093g = C10781l.m7093g(m21375f1) / 2.0f;
                    c10773d.m7163e(-m7091i, -m7093g, C13615m.m824g(mo23107b()) + m7091i, C13615m.m825f(mo23107b()) + m7093g);
                } else if (z) {
                    c10773d.m7163e(0.0f, 0.0f, C13615m.m824g(mo23107b()), C13615m.m825f(mo23107b()));
                }
                if (c10773d.m7162f()) {
                    return;
                }
            }
            interfaceC6250e0.mo21671f(c10773d, false);
        }
        float m839h = C13612k.m839h(m21374g1());
        c10773d.m7159i(c10773d.m7166b() + m839h);
        c10773d.m7158j(c10773d.m7165c() + m839h);
        float m838i = C13612k.m838i(m21374g1());
        c10773d.m7157k(c10773d.m7164d() + m838i);
        c10773d.m7160h(c10773d.m7167a() + m838i);
    }

    /* renamed from: F0 */
    public void m21414F0() {
        this.f17232H = false;
        m21351w1(this.f17228D);
        LayoutNode m21547a0 = this.f17225A.m21547a0();
        if (m21547a0 == null) {
            return;
        }
        m21547a0.m21521n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final float m21412G0(long j, long j2) {
        if (m23179o0() < C10781l.m7091i(j2) || m23181m0() < C10781l.m7093g(j2)) {
            long m21416E0 = m21416E0(j2);
            float m7091i = C10781l.m7091i(m21416E0);
            float m7093g = C10781l.m7093g(m21416E0);
            long m21355u1 = m21355u1(j);
            if ((m7091i > 0.0f || m7093g > 0.0f) && C10774f.m7145k(m21355u1) <= m7091i && C10774f.m7144l(m21355u1) <= m7093g) {
                return Math.max(C10774f.m7145k(m21355u1), C10774f.m7144l(m21355u1));
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    /* renamed from: G1 */
    public final void m21411G1(DrawEntity drawEntity) {
        this.f17239O = drawEntity;
    }

    /* renamed from: H0 */
    public final void m21410H0(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.mo21674c(interfaceC11064u);
            return;
        }
        float m839h = C13612k.m839h(m21374g1());
        float m838i = C13612k.m838i(m21374g1());
        interfaceC11064u.m6275b(m839h, m838i);
        m21406J0(interfaceC11064u);
        interfaceC11064u.m6275b(-m839h, -m838i);
    }

    /* renamed from: H1 */
    public final void m21409H1(InterfaceC5805t interfaceC5805t) {
        LayoutNode m21547a0;
        Intrinsics.isThisObjectNull(interfaceC5805t, "value");
        InterfaceC5805t interfaceC5805t2 = this.f17233I;
        if (interfaceC5805t != interfaceC5805t2) {
            this.f17233I = interfaceC5805t;
            if (interfaceC5805t2 == null || interfaceC5805t.mo23004b() != interfaceC5805t2.mo23004b() || interfaceC5805t.mo23005a() != interfaceC5805t2.mo23005a()) {
                m21349x1(interfaceC5805t.mo23004b(), interfaceC5805t.mo23005a());
            }
            Map map = this.f17234J;
            if ((!(map == null || map.isEmpty()) || (!interfaceC5805t.mo23002e().isEmpty())) && !Intrinsics.equals(interfaceC5805t.mo23002e(), this.f17234J)) {
                LayoutNodeWrapper m21369k1 = m21369k1();
                if (Intrinsics.equals(m21369k1 == null ? null : m21369k1.f17225A, this.f17225A)) {
                    LayoutNode m21547a02 = this.f17225A.m21547a0();
                    if (m21547a02 != null) {
                        m21547a02.m21503w0();
                    }
                    if (this.f17225A.m21579H().m21465i()) {
                        LayoutNode m21547a03 = this.f17225A.m21547a0();
                        if (m21547a03 != null) {
                            m21547a03.m21574J0();
                        }
                    } else if (this.f17225A.m21579H().m21466h() && (m21547a0 = this.f17225A.m21547a0()) != null) {
                        m21547a0.m21576I0();
                    }
                } else {
                    this.f17225A.m21503w0();
                }
                this.f17225A.m21579H().m21460n(true);
                Map map2 = this.f17234J;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f17234J = map2;
                }
                map2.clear();
                map2.putAll(interfaceC5805t.mo23002e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public final void m21408I0(InterfaceC11064u interfaceC11064u, InterfaceC11046o0 interfaceC11046o0) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
        interfaceC11064u.m6265l(new Rect(0.5f, 0.5f, C13615m.m824g(m23180n0()) - 0.5f, C13615m.m825f(m23180n0()) - 0.5f), interfaceC11046o0);
    }

    /* renamed from: I1 */
    public final void m21407I1(boolean z) {
        this.f17237M = z;
    }

    /* renamed from: J1 */
    public final void m21405J1(LayoutNodeWrapper layoutNodeWrapper) {
        this.f17226B = layoutNodeWrapper;
    }

    /* renamed from: K0 */
    public final LayoutNodeWrapper m21404K0(LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "other");
        LayoutNode layoutNode = layoutNodeWrapper.f17225A;
        LayoutNode layoutNode2 = this.f17225A;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper m21550Y = layoutNode2.m21550Y();
            LayoutNodeWrapper layoutNodeWrapper2 = this;
            while (layoutNodeWrapper2 != m21550Y && layoutNodeWrapper2 != layoutNodeWrapper) {
                layoutNodeWrapper2 = layoutNodeWrapper2.f17226B;
                Intrinsics.ifNullDoSomething(layoutNodeWrapper2);
            }
            return layoutNodeWrapper2 == layoutNodeWrapper ? layoutNodeWrapper : this;
        }
        while (layoutNode.m21571L() > layoutNode2.m21571L()) {
            layoutNode = layoutNode.m21547a0();
            Intrinsics.ifNullDoSomething(layoutNode);
        }
        while (layoutNode2.m21571L() > layoutNode.m21571L()) {
            layoutNode2 = layoutNode2.m21547a0();
            Intrinsics.ifNullDoSomething(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.m21547a0();
            layoutNode2 = layoutNode2.m21547a0();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return layoutNode2 == this.f17225A ? this : layoutNode == layoutNodeWrapper.f17225A ? layoutNodeWrapper : layoutNode.m21563P();
    }

    /* renamed from: K1 */
    public boolean m21403K1() {
        return false;
    }

    /* renamed from: L0 */
    public abstract ModifiedFocusNode m21402L0();

    /* renamed from: L1 */
    public long m21401L1(long j) {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            j = interfaceC6250e0.mo21675b(j, false);
        }
        return C13614l.m831c(j, m21374g1());
    }

    /* renamed from: M0 */
    public abstract ModifiedKeyInputNode m21400M0();

    /* renamed from: N0 */
    public abstract ModifiedFocusNode m21398N0(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N1 */
    public final boolean m21397N1(long j) {
        if (C10776g.m7132b(j)) {
            InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
            return interfaceC6250e0 == null || !this.f17227C || interfaceC6250e0.mo21667j(j);
        }
        return false;
    }

    /* renamed from: O0 */
    public abstract NestedScrollDelegatingWrapper m21396O0();

    /* renamed from: P0 */
    public final ModifiedFocusNode m21395P0() {
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        ModifiedFocusNode m21393R0 = layoutNodeWrapper == null ? null : layoutNodeWrapper.m21393R0();
        if (m21393R0 != null) {
            return m21393R0;
        }
        for (LayoutNode m21547a0 = this.f17225A.m21547a0(); m21547a0 != null; m21547a0 = m21547a0.m21547a0()) {
            ModifiedFocusNode m21402L0 = m21547a0.m21550Y().m21402L0();
            if (m21402L0 != null) {
                return m21402L0;
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public final ModifiedKeyInputNode m21394Q0() {
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        ModifiedKeyInputNode m21391S0 = layoutNodeWrapper == null ? null : layoutNodeWrapper.m21391S0();
        if (m21391S0 != null) {
            return m21391S0;
        }
        for (LayoutNode m21547a0 = this.f17225A.m21547a0(); m21547a0 != null; m21547a0 = m21547a0.m21547a0()) {
            ModifiedKeyInputNode m21400M0 = m21547a0.m21550Y().m21400M0();
            if (m21400M0 != null) {
                return m21400M0;
            }
        }
        return null;
    }

    /* renamed from: R0 */
    public abstract ModifiedFocusNode m21393R0();

    /* renamed from: S */
    public final boolean mo23109S() {
        if (!this.f17232H || this.f17225A.m21515q0()) {
            return this.f17232H;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: S0 */
    public abstract ModifiedKeyInputNode m21391S0();

    /* renamed from: T0 */
    public abstract NestedScrollDelegatingWrapper m21390T0();

    /* renamed from: U0 */
    public final List m21389U0(boolean z) {
        List m202b;
        LayoutNodeWrapper m21369k1 = m21369k1();
        ModifiedFocusNode m21398N0 = m21369k1 == null ? null : m21369k1.m21398N0(z);
        if (m21398N0 != null) {
            m202b = CollectionsJVM.m202b(m21398N0);
            return m202b;
        }
        ArrayList arrayList = new ArrayList();
        List m21575J = this.f17225A.m21575J();
        int size = m21575J.size();
        for (int i = 0; i < size; i++) {
            FocusNodeUtils.m8215a((LayoutNode) m21575J.get(i), arrayList, z);
        }
        return arrayList;
    }

    /* renamed from: V */
    public long mo23108V(long j) {
        if (mo23109S()) {
            for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.f17226B) {
                j = layoutNodeWrapper.m21401L1(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: V0 */
    public long m21387V0(long j) {
        long m832b = C13614l.m832b(j, m21374g1());
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        return interfaceC6250e0 == null ? m832b : interfaceC6250e0.mo21675b(m832b, true);
    }

    /* renamed from: X0 */
    public final DrawEntity m21385X0() {
        return this.f17239O;
    }

    /* renamed from: Z0 */
    public final boolean m21383Z0() {
        return this.f17241Q;
    }

    /* renamed from: a1 */
    public final InterfaceC6250e0 m21382a1() {
        return this.f17242R;
    }

    /* renamed from: b */
    public final long mo23107b() {
        return m23180n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final InterfaceC6108l m21380b1() {
        return this.f17228D;
    }

    /* renamed from: c0 */
    public Rect mo23106c0(InterfaceC5776j interfaceC5776j, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "sourceCoordinates");
        if (mo23109S()) {
            if (interfaceC5776j.mo23109S()) {
                LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) interfaceC5776j;
                LayoutNodeWrapper m21404K0 = m21404K0(layoutNodeWrapper);
                C10773d m21372i1 = m21372i1();
                m21372i1.m7159i(0.0f);
                m21372i1.m7157k(0.0f);
                m21372i1.m7158j(C13615m.m824g(interfaceC5776j.mo23107b()));
                m21372i1.m7160h(C13615m.m825f(interfaceC5776j.mo23107b()));
                while (layoutNodeWrapper != m21404K0) {
                    m21413F1(layoutNodeWrapper, m21372i1, z, false, 4, null);
                    if (m21372i1.m7162f()) {
                        return Rect.f27871e.m7115a();
                    }
                    layoutNodeWrapper = layoutNodeWrapper.f17226B;
                    Intrinsics.ifNullDoSomething(layoutNodeWrapper);
                }
                m21424A0(m21404K0, m21372i1, z);
                return MutableRect.m7156a(m21372i1);
            }
            throw new IllegalStateException(("LayoutCoordinates " + interfaceC5776j + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: c1 */
    public final LayoutNode m21378c1() {
        return this.f17225A;
    }

    /* renamed from: d1 */
    public final InterfaceC5805t m21377d1() {
        InterfaceC5805t interfaceC5805t = this.f17233I;
        if (interfaceC5805t != null) {
            return interfaceC5805t;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* renamed from: e1 */
    public abstract MeasureScope m21376e1();

    /* renamed from: f1 */
    public final long m21375f1() {
        return this.f17229E.m897U(m21378c1().m21543c0().m39640e());
    }

    /* renamed from: g1 */
    public final long m21374g1() {
        return this.f17235K;
    }

    /* renamed from: h1 */
    public Set m21373h1() {
        Set m208b;
        Map<AbstractC5743a, Integer> mo23002e;
        InterfaceC5805t interfaceC5805t = this.f17233I;
        Set<AbstractC5743a> set = null;
        if (interfaceC5805t != null && (mo23002e = interfaceC5805t.mo23002e()) != null) {
            set = mo23002e.keySet();
        }
        if (set == null) {
            m208b = C13778q0.m208b();
            return m208b;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public final C10773d m21372i1() {
        C10773d c10773d = this.f17238N;
        if (c10773d == null) {
            C10773d c10773d2 = new C10773d(0.0f, 0.0f, 0.0f, 0.0f);
            this.f17238N = c10773d2;
            return c10773d2;
        }
        return c10773d;
    }

    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
        m21361q1((InterfaceC11064u) obj);
        return C13195u.f34156a;
    }

    /* renamed from: k */
    public boolean mo21638k() {
        return this.f17242R != null;
    }

    /* renamed from: k1 */
    public LayoutNodeWrapper m21369k1() {
        return null;
    }

    /* renamed from: l1 */
    public final LayoutNodeWrapper m21368l1() {
        return this.f17226B;
    }

    /* renamed from: m1 */
    public final float m21367m1() {
        return this.f17236L;
    }

    /* renamed from: n1 */
    public abstract void m21366n1(long j, HitTestResult hitTestResult, boolean z, boolean z2);

    /* renamed from: o */
    public long mo23105o(InterfaceC5776j interfaceC5776j, long j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) interfaceC5776j;
        LayoutNodeWrapper m21404K0 = m21404K0(layoutNodeWrapper);
        while (layoutNodeWrapper != m21404K0) {
            j = layoutNodeWrapper.m21401L1(j);
            layoutNodeWrapper = layoutNodeWrapper.f17226B;
            Intrinsics.ifNullDoSomething(layoutNodeWrapper);
        }
        return m21422B0(m21404K0, j);
    }

    /* renamed from: o1 */
    public abstract void m21364o1(long j, HitTestResult hitTestResult, boolean z);

    /* renamed from: p */
    public final int mo22989p(AbstractC5743a abstractC5743a) {
        int m21418D0;
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        if (m21384Y0() && (m21418D0 = m21418D0(abstractC5743a)) != Integer.MIN_VALUE) {
            return m21418D0 + C13612k.m838i(m23183k0());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: p1 */
    public void m21362p1() {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.m21362p1();
    }

    /* renamed from: q1 */
    public void m21361q1(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        if (this.f17225A.mo23015f()) {
            m21371j1().m21610e(this, f17223T, new C6290e(interfaceC11064u));
            this.f17241Q = false;
            return;
        }
        this.f17241Q = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r0 */
    public void m21360r0(long j, float f, InterfaceC6108l interfaceC6108l) {
        m21351w1(interfaceC6108l);
        if (!C13612k.m840g(m21374g1(), j)) {
            this.f17235K = j;
            InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
            if (interfaceC6250e0 != null) {
                interfaceC6250e0.mo21669h(j);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.m21362p1();
                }
            }
            LayoutNodeWrapper m21369k1 = m21369k1();
            if (!Intrinsics.equals(m21369k1 == null ? null : m21369k1.f17225A, this.f17225A)) {
                this.f17225A.m21503w0();
            } else {
                LayoutNode m21547a0 = this.f17225A.m21547a0();
                if (m21547a0 != null) {
                    m21547a0.m21503w0();
                }
            }
            InterfaceC6253f0 m21549Z = this.f17225A.m21549Z();
            if (m21549Z != null) {
                m21549Z.mo21643s(this.f17225A);
            }
        }
        this.f17236L = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public final boolean m21359r1(long j) {
        float m7145k = C10774f.m7145k(j);
        float m7144l = C10774f.m7144l(j);
        return m7145k >= 0.0f && m7144l >= 0.0f && m7145k < ((float) m23179o0()) && m7144l < ((float) m23181m0());
    }

    /* renamed from: s1 */
    public final boolean m21358s1() {
        return this.f17237M;
    }

    /* renamed from: t1 */
    public final boolean m21357t1() {
        if (this.f17242R == null || this.f17231G > 0.0f) {
            LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
            Boolean valueOf = layoutNodeWrapper == null ? null : Boolean.valueOf(layoutNodeWrapper.m21357t1());
            if (valueOf == null) {
                return false;
            }
            return valueOf.booleanValue();
        }
        return true;
    }

    /* renamed from: u */
    public long mo23104u(long j) {
        return C6284n.m21433a(this.f17225A).mo21650j(mo23108V(j));
    }

    /* renamed from: v1 */
    public void m21353v1() {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 == null) {
            return;
        }
        interfaceC6250e0.invalidate();
    }

    /* renamed from: w1 */
    public final void m21351w1(InterfaceC6108l interfaceC6108l) {
        InterfaceC6253f0 m21549Z;
        boolean z = (this.f17228D == interfaceC6108l && Intrinsics.equals(this.f17229E, this.f17225A.m21573K()) && this.f17230F == this.f17225A.getLayoutDirection()) ? false : true;
        this.f17228D = interfaceC6108l;
        this.f17229E = this.f17225A.m21573K();
        this.f17230F = this.f17225A.getLayoutDirection();
        if (mo23109S() && interfaceC6108l != null) {
            if (this.f17242R != null) {
                if (z) {
                    m21399M1();
                    return;
                }
                return;
            }
            InterfaceC6250e0 mo21651i = C6284n.m21433a(this.f17225A).mo21651i(this, this.f17240P);
            mo21651i.mo21672e(m23180n0());
            mo21651i.mo21669h(m21374g1());
            this.f17242R = mo21651i;
            m21399M1();
            this.f17225A.m21566N0(true);
            this.f17240P.mo42214q();
            return;
        }
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.mo21670g();
            m21378c1().m21566N0(true);
            this.f17240P.mo42214q();
            if (mo23109S() && (m21549Z = m21378c1().m21549Z()) != null) {
                m21549Z.mo21643s(m21378c1());
            }
        }
        this.f17242R = null;
        this.f17241Q = false;
    }

    /* renamed from: x1 */
    protected void m21349x1(int i, int i2) {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.mo21672e(C13617n.m819a(i, i2));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.m21362p1();
            }
        }
        InterfaceC6253f0 m21549Z = this.f17225A.m21549Z();
        if (m21549Z != null) {
            m21549Z.mo21643s(this.f17225A);
        }
        m23174t0(C13617n.m819a(i, i2));
        DrawEntity drawEntity = this.f17239O;
        if (drawEntity == null) {
            return;
        }
        drawEntity.m21681m(i, i2);
    }

    /* renamed from: y */
    public final InterfaceC5776j mo23103y() {
        if (mo23109S()) {
            return this.f17225A.m21550Y().f17226B;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: y1 */
    public void m21346y1() {
        InterfaceC6250e0 interfaceC6250e0 = this.f17242R;
        if (interfaceC6250e0 == null) {
            return;
        }
        interfaceC6250e0.invalidate();
    }

    /* renamed from: z1 */
    public Object m21344z1(AbstractC5988a abstractC5988a) {
        Intrinsics.isThisObjectNull(abstractC5988a, "modifierLocal");
        LayoutNodeWrapper layoutNodeWrapper = this.f17226B;
        Object m21344z1 = layoutNodeWrapper == null ? null : layoutNodeWrapper.m21344z1(abstractC5988a);
        return m21344z1 == null ? abstractC5988a.m22454a().mo42214q() : m21344z1;
    }
}
