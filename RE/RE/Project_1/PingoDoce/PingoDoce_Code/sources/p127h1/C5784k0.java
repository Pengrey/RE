package p127h1;

import androidx.compose.p018ui.platform.C0689b2;
import androidx.compose.runtime.CompositionContext;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5216l;
import p127h1.InterfaceC5795l0;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.EnumC13618o;
import p489zc.C13766i0;

/* compiled from: SubcomposeLayout.kt */
/* renamed from: h1.k0 */
/* loaded from: classes.dex */
public final class C5784k0 {

    /* renamed from: n */
    public static final int f16095n = 8;

    /* renamed from: a */
    private final int f16096a;

    /* renamed from: b */
    private CompositionContext f16097b;

    /* renamed from: c */
    private final InterfaceC6108l f16098c;

    /* renamed from: d */
    private final InterfaceC6112p f16099d;

    /* renamed from: e */
    private LayoutNode f16100e;

    /* renamed from: f */
    private int f16101f;

    /* renamed from: g */
    private final Map f16102g;

    /* renamed from: h */
    private final Map f16103h;

    /* renamed from: i */
    private final C5787c f16104i;

    /* renamed from: j */
    private final Map f16105j;

    /* renamed from: k */
    private int f16106k;

    /* renamed from: l */
    private int f16107l;

    /* renamed from: m */
    private final String f16108m;

    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC5786b {
        /* renamed from: b */
        void m23045b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$c */
    /* loaded from: classes.dex */
    public final class C5787c implements InterfaceC5795l0 {

        /* renamed from: w */
        private EnumC13618o f16113w;

        /* renamed from: x */
        private float f16114x;

        /* renamed from: y */
        private float f16115y;

        /* renamed from: z */
        final /* synthetic */ C5784k0 f16116z;

        public C5787c(C5784k0 c5784k0) {
            Intrinsics.isThisObjectNull(c5784k0, "this$0");
            this.f16116z = c5784k0;
            this.f16113w = EnumC13618o.Rtl;
        }

        /* renamed from: A */
        public float m23044A(float f) {
            return InterfaceC5795l0.C5796a.m23022e(this, f);
        }

        /* renamed from: O */
        public int m23043O(float f) {
            return InterfaceC5795l0.C5796a.m23025b(this, f);
        }

        /* renamed from: U */
        public long m23042U(long j) {
            return InterfaceC5795l0.C5796a.m23021f(this, j);
        }

        /* renamed from: Y */
        public float m23041Y(long j) {
            return InterfaceC5795l0.C5796a.m23023d(this, j);
        }

        /* renamed from: f0 */
        public List m23040f0(Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "content");
            return this.f16116z.m23082H(obj, interfaceC6112p);
        }

        public float getDensity() {
            return this.f16114x;
        }

        public EnumC13618o getLayoutDirection() {
            return this.f16113w;
        }

        /* renamed from: i0 */
        public float m23039i0(int i) {
            return InterfaceC5795l0.C5796a.m23024c(this, i);
        }

        /* renamed from: k */
        public void m23038k(float f) {
            this.f16114x = f;
        }

        /* renamed from: n */
        public void m23037n(float f) {
            this.f16115y = f;
        }

        /* renamed from: o */
        public void m23036o(EnumC13618o enumC13618o) {
            Intrinsics.isThisObjectNull(enumC13618o, "<set-?>");
            this.f16113w = enumC13618o;
        }

        /* renamed from: r */
        public float m23035r() {
            return this.f16115y;
        }

        /* renamed from: s */
        public InterfaceC5805t m23034s(int i, int i2, Map map, InterfaceC6108l interfaceC6108l) {
            return InterfaceC5795l0.C5796a.m23026a(this, i, i2, map, interfaceC6108l);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$d */
    /* loaded from: classes.dex */
    public static final class C5788d extends LayoutNode.AbstractC6273f {

        /* renamed from: b */
        final /* synthetic */ InterfaceC6112p f16118b;

        /* compiled from: SubcomposeLayout.kt */
        /* renamed from: h1.k0$d$a */
        /* loaded from: classes.dex */
        public static final class C5789a implements InterfaceC5805t {

            /* renamed from: a */
            final /* synthetic */ InterfaceC5805t f16119a;

            /* renamed from: b */
            final /* synthetic */ C5784k0 f16120b;

            /* renamed from: c */
            final /* synthetic */ int f16121c;

            C5789a(InterfaceC5805t interfaceC5805t, C5784k0 c5784k0, int i) {
                this.f16119a = interfaceC5805t;
                this.f16120b = c5784k0;
                this.f16121c = i;
            }

            /* renamed from: a */
            public int mo23005a() {
                return this.f16119a.mo23005a();
            }

            /* renamed from: b */
            public int mo23004b() {
                return this.f16119a.mo23004b();
            }

            /* renamed from: d */
            public void mo23003d() {
                C5784k0.m23068l(this.f16120b, this.f16121c);
                this.f16119a.mo23003d();
                C5784k0 c5784k0 = this.f16120b;
                C5784k0.m23078b(c5784k0, C5784k0.m23076d(c5784k0));
            }

            /* renamed from: e */
            public Map mo23002e() {
                return this.f16119a.mo23002e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5788d(InterfaceC6112p interfaceC6112p, String str) {
            super(str);
            this.f16118b = interfaceC6112p;
        }

        /* renamed from: a */
        public InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            Intrinsics.isThisObjectNull(measureScope, "$receiver");
            Intrinsics.isThisObjectNull(list, "measurables");
            C5784k0.m23070j(C5784k0.this).m23036o(measureScope.getLayoutDirection());
            C5784k0.m23070j(C5784k0.this).m23038k(measureScope.getDensity());
            C5784k0.m23070j(C5784k0.this).m23037n(measureScope.m894r());
            C5784k0.m23068l(C5784k0.this, 0);
            return new C5789a((InterfaceC5805t) this.f16118b.mo39856d(C5784k0.m23070j(C5784k0.this), C13599b.m928b(j)), C5784k0.this, C5784k0.m23076d(C5784k0.this));
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$e */
    /* loaded from: classes.dex */
    public static final class C5790e implements InterfaceC5786b {

        /* renamed from: b */
        final /* synthetic */ Object f16123b;

        C5790e(Object obj) {
            this.f16123b = obj;
        }

        /* renamed from: b */
        public void m23033b() {
            LayoutNode layoutNode = (LayoutNode) C5784k0.m23074f(C5784k0.this).remove(this.f16123b);
            if (layoutNode != null) {
                int indexOf = C5784k0.m23071i(C5784k0.this).m21569M().indexOf(layoutNode);
                if (indexOf != -1) {
                    if (C5784k0.m23072h(C5784k0.this) < C5784k0.m23075e(C5784k0.this)) {
                        C5784k0.m23069k(C5784k0.this, indexOf, (C5784k0.m23071i(C5784k0.this).m21569M().size() - C5784k0.m23073g(C5784k0.this)) - C5784k0.m23072h(C5784k0.this), 1);
                        C5784k0 c5784k0 = C5784k0.this;
                        C5784k0.m23066n(c5784k0, C5784k0.m23072h(c5784k0) + 1);
                    } else {
                        C5784k0 c5784k02 = C5784k0.this;
                        LayoutNode m23071i = C5784k0.m23071i(c5784k02);
                        LayoutNode.m21510t(m23071i, true);
                        C5784k0.m23077c(c5784k02, layoutNode);
                        C5784k0.m23071i(c5784k02).m21580G0(indexOf, 1);
                        LayoutNode.m21510t(m23071i, false);
                    }
                    if (C5784k0.m23073g(C5784k0.this) > 0) {
                        C5784k0 c5784k03 = C5784k0.this;
                        C5784k0.m23067m(c5784k03, C5784k0.m23073g(c5784k03) - 1);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$f */
    /* loaded from: classes.dex */
    public static final class C5791f extends AbstractC6438m implements InterfaceC6112p {
        C5791f() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m23032a((LayoutNode) obj, (InterfaceC6112p) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m23032a(LayoutNode layoutNode, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(layoutNode, "$this$null");
            Intrinsics.isThisObjectNull(interfaceC6112p, "it");
            layoutNode.m21544c(C5784k0.m23079a(C5784k0.this, interfaceC6112p));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$g */
    /* loaded from: classes.dex */
    public static final class C5792g extends AbstractC6438m implements InterfaceC6108l {
        C5792g() {
            super(1);
        }

        /* renamed from: a */
        public final void m23031a(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "$this$null");
            C5784k0.m23065o(C5784k0.this, layoutNode);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23031a((LayoutNode) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$h */
    /* loaded from: classes.dex */
    public static final class C5793h extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ C5785a f16127x;

        /* renamed from: y */
        final /* synthetic */ LayoutNode f16128y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SubcomposeLayout.kt */
        /* renamed from: h1.k0$h$a */
        /* loaded from: classes.dex */
        public static final class C5794a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6112p f16129w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5794a(InterfaceC6112p interfaceC6112p) {
                super(2);
                this.f16129w = interfaceC6112p;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m23029a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m23029a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    this.f16129w.mo39856d(interfaceC5179i, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5793h(C5785a c5785a, LayoutNode layoutNode) {
            super(0);
            this.f16127x = c5785a;
            this.f16128y = layoutNode;
        }

        /* renamed from: a */
        public final void m23030a() {
            C5784k0 c5784k0 = C5784k0.this;
            C5785a c5785a = this.f16127x;
            LayoutNode layoutNode = this.f16128y;
            LayoutNode m23071i = C5784k0.m23071i(c5784k0);
            LayoutNode.m21510t(m23071i, true);
            InterfaceC6112p m23052b = c5785a.m23052b();
            InterfaceC5216l m23053a = c5785a.m23053a();
            CompositionContext m23057w = c5784k0.m23057w();
            if (m23057w != null) {
                c5785a.m23049e(C5784k0.m23064p(c5784k0, m23053a, layoutNode, m23057w, ComposableLambda.m19326c(-985539783, true, new C5794a(m23052b))));
                LayoutNode.m21510t(m23071i, false);
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m23030a();
            return C13195u.f34156a;
        }
    }

    public C5784k0(int i) {
        this.f16096a = i;
        this.f16098c = new C5792g();
        this.f16099d = new C5791f();
        this.f16102g = new LinkedHashMap();
        this.f16103h = new LinkedHashMap();
        this.f16104i = new C5787c(this);
        this.f16105j = new LinkedHashMap();
        this.f16108m = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* renamed from: A */
    private final void m23089A() {
        if (this.f16102g.size() == m23056x().m21569M().size()) {
            return;
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f16102g.size() + ") and the children count on the SubcomposeLayout (" + m23056x().m21569M().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* renamed from: B */
    private final void m23088B(int i, int i2, int i3) {
        LayoutNode m23071i = m23071i(this);
        LayoutNode.m21510t(m23071i, true);
        m23056x().m21505v0(i, i2, i3);
        LayoutNode.m21510t(m23071i, false);
    }

    /* renamed from: C */
    static /* synthetic */ void m23087C(C5784k0 c5784k0, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        c5784k0.m23088B(i, i2, i3);
    }

    /* renamed from: F */
    private final void m23084F(LayoutNode layoutNode, C5785a c5785a) {
        layoutNode.m21556S0(new C5793h(c5785a, layoutNode));
    }

    /* renamed from: G */
    private final void m23083G(LayoutNode layoutNode, Object obj, InterfaceC6112p interfaceC6112p) {
        Map map = this.f16102g;
        Object obj2 = map.get(layoutNode);
        if (obj2 == null) {
            obj2 = new C5785a(obj, C5749c.f16059a.m23188a(), null, 4, null);
            map.put(layoutNode, obj2);
        }
        C5785a c5785a = (C5785a) obj2;
        InterfaceC5216l m23053a = c5785a.m23053a();
        boolean mo25008m = m23053a == null ? true : m23053a.mo25008m();
        if (c5785a.m23052b() != interfaceC6112p || mo25008m || c5785a.m23051c()) {
            c5785a.m23048f(interfaceC6112p);
            m23084F(layoutNode, c5785a);
            c5785a.m23047g(false);
        }
    }

    /* renamed from: I */
    private final InterfaceC5216l m23081I(InterfaceC5216l interfaceC5216l, LayoutNode layoutNode, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p) {
        if (interfaceC5216l == null || interfaceC5216l.mo25007q()) {
            interfaceC5216l = C0689b2.m39812a(layoutNode, compositionContext);
        }
        interfaceC5216l.mo25006r(interfaceC6112p);
        return interfaceC5216l;
    }

    /* renamed from: J */
    private final LayoutNode m23080J(Object obj) {
        if (this.f16106k > 0) {
            int size = m23056x().m21569M().size() - this.f16107l;
            int i = size - this.f16106k;
            int i2 = i;
            while (true) {
                C5785a c5785a = (C5785a) C13766i0.m397f(this.f16102g, (LayoutNode) m23056x().m21569M().get(i2));
                if (Intrinsics.equals(c5785a.m23050d(), obj)) {
                    break;
                } else if (i2 == size - 1) {
                    c5785a.m23046h(obj);
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != i) {
                m23088B(i2, i, 1);
            }
            this.f16106k--;
            return (LayoutNode) m23056x().m21569M().get(i);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC5804s m23079a(C5784k0 c5784k0, InterfaceC6112p interfaceC6112p) {
        return c5784k0.m23063q(interfaceC6112p);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m23078b(C5784k0 c5784k0, int i) {
        c5784k0.m23061s(i);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m23077c(C5784k0 c5784k0, LayoutNode layoutNode) {
        c5784k0.m23059u(layoutNode);
    }

    /* renamed from: d */
    public static final /* synthetic */ int m23076d(C5784k0 c5784k0) {
        return c5784k0.f16101f;
    }

    /* renamed from: e */
    public static final /* synthetic */ int m23075e(C5784k0 c5784k0) {
        return c5784k0.f16096a;
    }

    /* renamed from: f */
    public static final /* synthetic */ Map m23074f(C5784k0 c5784k0) {
        return c5784k0.f16105j;
    }

    /* renamed from: g */
    public static final /* synthetic */ int m23073g(C5784k0 c5784k0) {
        return c5784k0.f16107l;
    }

    /* renamed from: h */
    public static final /* synthetic */ int m23072h(C5784k0 c5784k0) {
        return c5784k0.f16106k;
    }

    /* renamed from: i */
    public static final /* synthetic */ LayoutNode m23071i(C5784k0 c5784k0) {
        return c5784k0.m23056x();
    }

    /* renamed from: j */
    public static final /* synthetic */ C5787c m23070j(C5784k0 c5784k0) {
        return c5784k0.f16104i;
    }

    /* renamed from: k */
    public static final /* synthetic */ void m23069k(C5784k0 c5784k0, int i, int i2, int i3) {
        c5784k0.m23088B(i, i2, i3);
    }

    /* renamed from: l */
    public static final /* synthetic */ void m23068l(C5784k0 c5784k0, int i) {
        c5784k0.f16101f = i;
    }

    /* renamed from: m */
    public static final /* synthetic */ void m23067m(C5784k0 c5784k0, int i) {
        c5784k0.f16107l = i;
    }

    /* renamed from: n */
    public static final /* synthetic */ void m23066n(C5784k0 c5784k0, int i) {
        c5784k0.f16106k = i;
    }

    /* renamed from: o */
    public static final /* synthetic */ void m23065o(C5784k0 c5784k0, LayoutNode layoutNode) {
        c5784k0.f16100e = layoutNode;
    }

    /* renamed from: p */
    public static final /* synthetic */ InterfaceC5216l m23064p(C5784k0 c5784k0, InterfaceC5216l interfaceC5216l, LayoutNode layoutNode, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p) {
        return c5784k0.m23081I(interfaceC5216l, layoutNode, compositionContext, interfaceC6112p);
    }

    /* renamed from: q */
    private final InterfaceC5804s m23063q(InterfaceC6112p interfaceC6112p) {
        return new C5788d(interfaceC6112p, this.f16108m);
    }

    /* renamed from: r */
    private final LayoutNode m23062r(int i) {
        LayoutNode layoutNode = new LayoutNode(true);
        LayoutNode m23071i = m23071i(this);
        LayoutNode.m21510t(m23071i, true);
        m23056x().m21523m0(i, layoutNode);
        LayoutNode.m21510t(m23071i, false);
        return layoutNode;
    }

    /* renamed from: s */
    private final void m23061s(int i) {
        int size = m23056x().m21569M().size() - this.f16107l;
        int max = Math.max(i, size - this.f16096a);
        int i2 = size - max;
        this.f16106k = i2;
        int i3 = i2 + max;
        int i4 = max;
        while (i4 < i3) {
            int i5 = i4 + 1;
            Object obj = this.f16102g.get((LayoutNode) m23056x().m21569M().get(i4));
            Intrinsics.ifNullDoSomething(obj);
            this.f16103h.remove(((C5785a) obj).m23050d());
            i4 = i5;
        }
        int i6 = max - i;
        if (i6 > 0) {
            LayoutNode m23071i = m23071i(this);
            LayoutNode.m21510t(m23071i, true);
            int i7 = i + i6;
            for (int i8 = i; i8 < i7; i8++) {
                m23059u((LayoutNode) m23056x().m21569M().get(i8));
            }
            m23056x().m21580G0(i, i6);
            LayoutNode.m21510t(m23071i, false);
        }
        m23089A();
    }

    /* renamed from: u */
    private final void m23059u(LayoutNode layoutNode) {
        Object remove = this.f16102g.remove(layoutNode);
        Intrinsics.ifNullDoSomething(remove);
        C5785a c5785a = (C5785a) remove;
        InterfaceC5216l m23053a = c5785a.m23053a();
        Intrinsics.ifNullDoSomething(m23053a);
        m23053a.mo25009b();
        this.f16103h.remove(c5785a.m23050d());
    }

    /* renamed from: x */
    private final LayoutNode m23056x() {
        LayoutNode layoutNode = this.f16100e;
        if (layoutNode != null) {
            return layoutNode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: D */
    public final InterfaceC5786b m23086D(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        m23089A();
        if (!this.f16103h.containsKey(obj)) {
            Map map = this.f16105j;
            Object obj2 = map.get(obj);
            if (obj2 == null) {
                if (this.f16106k > 0) {
                    obj2 = m23080J(obj);
                    m23088B(m23056x().m21569M().indexOf(obj2), m23056x().m21569M().size(), 1);
                    this.f16107l++;
                } else {
                    obj2 = m23062r(m23056x().m21569M().size());
                    this.f16107l++;
                }
                map.put(obj, obj2);
            }
            m23083G((LayoutNode) obj2, obj, interfaceC6112p);
        }
        return new C5790e(obj);
    }

    /* renamed from: E */
    public final void m23085E(CompositionContext compositionContext) {
        this.f16097b = compositionContext;
    }

    /* renamed from: H */
    public final List m23082H(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        m23089A();
        LayoutNode.EnumC6272e m21561Q = m23056x().m21561Q();
        if (m21561Q == LayoutNode.EnumC6272e.Measuring || m21561Q == LayoutNode.EnumC6272e.LayingOut) {
            Map map = this.f16103h;
            Object obj2 = map.get(obj);
            if (obj2 == null) {
                obj2 = (LayoutNode) this.f16105j.remove(obj);
                if (obj2 != null) {
                    int i = this.f16107l;
                    if (i > 0) {
                        this.f16107l = i - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (this.f16106k > 0) {
                    obj2 = m23080J(obj);
                } else {
                    obj2 = m23062r(this.f16101f);
                }
                map.put(obj, obj2);
            }
            LayoutNode layoutNode = (LayoutNode) obj2;
            int indexOf = m23056x().m21569M().indexOf(layoutNode);
            int i2 = this.f16101f;
            if (indexOf >= i2) {
                if (i2 != indexOf) {
                    m23087C(this, indexOf, i2, 0, 4, null);
                }
                this.f16101f++;
                m23083G(layoutNode, obj, interfaceC6112p);
                return layoutNode.m21575J();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    /* renamed from: t */
    public final void m23060t() {
        for (C5785a c5785a : this.f16102g.values()) {
            InterfaceC5216l m23053a = c5785a.m23053a();
            if (m23053a != null) {
                m23053a.mo25009b();
            }
        }
        this.f16102g.clear();
        this.f16103h.clear();
    }

    /* renamed from: v */
    public final void m23058v() {
        LayoutNode layoutNode = this.f16100e;
        if (layoutNode != null) {
            for (Map.Entry entry : this.f16102g.entrySet()) {
                ((C5785a) entry.getValue()).m23047g(true);
            }
            if (layoutNode.m21561Q() != LayoutNode.EnumC6272e.NeedsRemeasure) {
                layoutNode.m21574J0();
            }
        }
    }

    /* renamed from: w */
    public final CompositionContext m23057w() {
        return this.f16097b;
    }

    /* renamed from: y */
    public final InterfaceC6112p m23055y() {
        return this.f16099d;
    }

    /* renamed from: z */
    public final InterfaceC6108l m23054z() {
        return this.f16098c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.k0$a */
    /* loaded from: classes.dex */
    public static final class C5785a {

        /* renamed from: a */
        private Object f16109a;

        /* renamed from: b */
        private InterfaceC6112p f16110b;

        /* renamed from: c */
        private InterfaceC5216l f16111c;

        /* renamed from: d */
        private boolean f16112d;

        public C5785a(Object obj, InterfaceC6112p interfaceC6112p, InterfaceC5216l interfaceC5216l) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "content");
            this.f16109a = obj;
            this.f16110b = interfaceC6112p;
            this.f16111c = interfaceC5216l;
        }

        /* renamed from: a */
        public final InterfaceC5216l m23053a() {
            return this.f16111c;
        }

        /* renamed from: b */
        public final InterfaceC6112p m23052b() {
            return this.f16110b;
        }

        /* renamed from: c */
        public final boolean m23051c() {
            return this.f16112d;
        }

        /* renamed from: d */
        public final Object m23050d() {
            return this.f16109a;
        }

        /* renamed from: e */
        public final void m23049e(InterfaceC5216l interfaceC5216l) {
            this.f16111c = interfaceC5216l;
        }

        /* renamed from: f */
        public final void m23048f(InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "<set-?>");
            this.f16110b = interfaceC6112p;
        }

        /* renamed from: g */
        public final void m23047g(boolean z) {
            this.f16112d = z;
        }

        /* renamed from: h */
        public final void m23046h(Object obj) {
            this.f16109a = obj;
        }

        public /* synthetic */ C5785a(Object obj, InterfaceC6112p interfaceC6112p, InterfaceC5216l interfaceC5216l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, interfaceC6112p, (i & 4) != 0 ? null : interfaceC5216l);
        }
    }

    public C5784k0() {
        this(0);
    }
}
