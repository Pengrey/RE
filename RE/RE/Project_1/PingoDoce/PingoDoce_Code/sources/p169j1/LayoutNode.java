package p169j1;

import androidx.compose.p018ui.platform.C0843z0;
import androidx.compose.p018ui.platform.ViewConfiguration;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p052d1.KeyInputModifier;
import p072e1.InterfaceC4949e;
import p072e1.NestedScrollDelegatingWrapper;
import p093f1.PointerEvent;
import p112g0.MutableVector;
import p127h1.InterfaceC5745a0;
import p127h1.InterfaceC5764e0;
import p127h1.InterfaceC5776j;
import p127h1.InterfaceC5800o;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.InterfaceC5813z;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.OnGloballyPositionedModifier;
import p127h1.ParentDataModifier;
import p127h1.Placeable;
import p127h1.RemeasurementModifier;
import p149i1.ModifierLocalConsumer;
import p149i1.ModifierLocalProvider;
import p169j1.InterfaceC6253f0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7607q;
import p245n1.SemanticsModifier;
import p245n1.SemanticsWrapper;
import p302q0.InterfaceC9570f;
import p346s0.InterfaceC10024e;
import p358t0.FocusEventModifier;
import p358t0.FocusModifier;
import p358t0.InterfaceC10342n;
import p358t0.InterfaceC10351t;
import p393v0.InterfaceC11064u;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13604f;
import p479z1.C13610j;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: j1.k */
/* loaded from: classes.dex */
public final class LayoutNode implements InterfaceC5803r, InterfaceC5764e0, InterfaceC6257g0, InterfaceC5800o, ComposeUiNode {

    /* renamed from: i0 */
    public static final C6271d f17161i0 = new C6271d(null);

    /* renamed from: j0 */
    private static final AbstractC6273f f17162j0 = new C6270c();

    /* renamed from: k0 */
    private static final InterfaceC6097a f17163k0 = C6268a.f17203w;

    /* renamed from: l0 */
    private static final ViewConfiguration f17164l0 = new C6269b();

    /* renamed from: A */
    private boolean f17165A;

    /* renamed from: B */
    private LayoutNode f17166B;

    /* renamed from: C */
    private InterfaceC6253f0 f17167C;

    /* renamed from: D */
    private int f17168D;

    /* renamed from: E */
    private EnumC6272e f17169E;

    /* renamed from: F */
    private MutableVector f17170F;

    /* renamed from: G */
    private boolean f17171G;

    /* renamed from: H */
    private final MutableVector f17172H;

    /* renamed from: I */
    private boolean f17173I;

    /* renamed from: J */
    private InterfaceC5804s f17174J;

    /* renamed from: K */
    private final IntrinsicsPolicy f17175K;

    /* renamed from: L */
    private Density f17176L;

    /* renamed from: M */
    private final MeasureScope f17177M;

    /* renamed from: N */
    private EnumC13618o f17178N;

    /* renamed from: O */
    private ViewConfiguration f17179O;

    /* renamed from: P */
    private final LayoutNodeAlignmentLines f17180P;

    /* renamed from: Q */
    private boolean f17181Q;

    /* renamed from: R */
    private int f17182R;

    /* renamed from: S */
    private int f17183S;

    /* renamed from: T */
    private int f17184T;

    /* renamed from: U */
    private EnumC6274g f17185U;

    /* renamed from: V */
    private boolean f17186V;

    /* renamed from: W */
    private final LayoutNodeWrapper f17187W;

    /* renamed from: X */
    private final OuterMeasurablePlaceable f17188X;

    /* renamed from: Y */
    private float f17189Y;

    /* renamed from: Z */
    private LayoutNodeWrapper f17190Z;

    /* renamed from: a0 */
    private boolean f17191a0;

    /* renamed from: b0 */
    private InterfaceC9570f f17192b0;

    /* renamed from: c0 */
    private InterfaceC6108l f17193c0;

    /* renamed from: d0 */
    private InterfaceC6108l f17194d0;

    /* renamed from: e0 */
    private MutableVector f17195e0;

    /* renamed from: f0 */
    private boolean f17196f0;

    /* renamed from: g0 */
    private boolean f17197g0;

    /* renamed from: h0 */
    private final Comparator f17198h0;

    /* renamed from: w */
    private final boolean f17199w;

    /* renamed from: x */
    private int f17200x;

    /* renamed from: y */
    private final MutableVector f17201y;

    /* renamed from: z */
    private MutableVector f17202z;

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$a */
    /* loaded from: classes.dex */
    static final class C6268a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6268a f17203w = new C6268a();

        C6268a() {
            super(0);
        }

        /* renamed from: a */
        public final LayoutNode mo42214q() {
            return new LayoutNode(false, 1, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$b */
    /* loaded from: classes.dex */
    public static final class C6269b implements ViewConfiguration {
        C6269b() {
        }

        /* renamed from: a */
        public long m21495a() {
            return 300L;
        }

        /* renamed from: b */
        public long m21494b() {
            return 40L;
        }

        /* renamed from: c */
        public long m21493c() {
            return 400L;
        }

        /* renamed from: d */
        public float m21492d() {
            return 16.0f;
        }

        /* renamed from: e */
        public long m21491e() {
            return C13610j.f34604a.m847b();
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$c */
    /* loaded from: classes.dex */
    public static final class C6270c extends AbstractC6273f {
        C6270c() {
            super("Undefined intrinsics block and it is required");
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            m21489b(measureScope, list, j);
            throw new ExceptionsH();
        }

        /* renamed from: b */
        public Void m21489b(MeasureScope measureScope, List list, long j) {
            Intrinsics.isThisObjectNull(measureScope, "$receiver");
            Intrinsics.isThisObjectNull(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$d */
    /* loaded from: classes.dex */
    public static final class C6271d {
        private C6271d() {
        }

        public /* synthetic */ C6271d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC6097a m21488a() {
            return LayoutNode.m21526l();
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$e */
    /* loaded from: classes.dex */
    public enum EnumC6272e {
        NeedsRemeasure,
        Measuring,
        NeedsRelayout,
        LayingOut,
        Ready
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6273f implements InterfaceC5804s {
        public AbstractC6273f(String str) {
            Intrinsics.isThisObjectNull(str, "error");
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$g */
    /* loaded from: classes.dex */
    public enum EnumC6274g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$h */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6275h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17204a;

        static {
            int[] iArr = new int[EnumC6272e.values().length];
            iArr[EnumC6272e.NeedsRemeasure.ordinal()] = 1;
            iArr[EnumC6272e.NeedsRelayout.ordinal()] = 2;
            iArr[EnumC6272e.Ready.ordinal()] = 3;
            f17204a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$i */
    /* loaded from: classes.dex */
    public static final class C6276i extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ MutableVector f17205w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6276i(MutableVector mutableVector) {
            super(2);
            this.f17205w = mutableVector;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m21487a((InterfaceC9570f.InterfaceC9573c) obj, ((Boolean) obj2).booleanValue());
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
            if (r1 == null) goto L22;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean m21487a(p302q0.InterfaceC9570f.InterfaceC9573c r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r0 = "mod"
                p181jd.Intrinsics.isThisObjectNull(r7, r0)
                r0 = 0
                if (r8 != 0) goto L36
                boolean r8 = r7 instanceof p127h1.OnGloballyPositionedModifier
                if (r8 == 0) goto L37
                g0.e r8 = r6.f17205w
                r1 = 0
                if (r8 != 0) goto L12
                goto L34
            L12:
                int r2 = r8.m23649p()
                if (r2 <= 0) goto L32
                java.lang.Object[] r8 = r8.m23650o()
                r3 = r0
            L1d:
                r4 = r8[r3]
                r5 = r4
                j1.a0 r5 = (p169j1.OnGloballyPositionedModifierWrapper) r5
                q0.f$c r5 = r5.m21755P1()
                boolean r5 = p181jd.Intrinsics.equals(r7, r5)
                if (r5 == 0) goto L2e
                r1 = r4
                goto L32
            L2e:
                int r3 = r3 + 1
                if (r3 < r2) goto L1d
            L32:
                j1.a0 r1 = (p169j1.OnGloballyPositionedModifierWrapper) r1
            L34:
                if (r1 != 0) goto L37
            L36:
                r0 = 1
            L37:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutNode.C6276i.m21487a(q0.f$c, boolean):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$j */
    /* loaded from: classes.dex */
    public static final class C6277j extends AbstractC6438m implements InterfaceC6097a {
        C6277j() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ORIG_RETURN, RETURN] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m21486a() {
            /*
                r8 = this;
                j1.k r0 = p169j1.LayoutNode.this
                r1 = 0
                p169j1.LayoutNode.m21508u(r0, r1)
                j1.k r0 = p169j1.LayoutNode.this
                g0.e r0 = r0.m21537f0()
                int r2 = r0.m23649p()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 <= 0) goto L40
                java.lang.Object[] r0 = r0.m23650o()
                r4 = r1
            L1a:
                r5 = r0[r4]
                j1.k r5 = (p169j1.LayoutNode) r5
                int r6 = r5.m21545b0()
                p169j1.LayoutNode.m21504w(r5, r6)
                p169j1.LayoutNode.m21506v(r5, r3)
                j1.l r6 = r5.m21579H()
                r6.m21456r(r1)
                j1.k$g r6 = r5.m21554U()
                j1.k$g r7 = p169j1.LayoutNode.EnumC6274g.InLayoutBlock
                if (r6 != r7) goto L3c
                j1.k$g r6 = p169j1.LayoutNode.EnumC6274g.NotUsed
                r5.m21562P0(r6)
            L3c:
                int r4 = r4 + 1
                if (r4 < r2) goto L1a
            L40:
                j1.k r0 = p169j1.LayoutNode.this
                j1.o r0 = r0.m21563P()
                h1.t r0 = r0.m21377d1()
                r0.mo23003d()
                j1.k r0 = p169j1.LayoutNode.this
                g0.e r0 = r0.m21537f0()
                j1.k r2 = p169j1.LayoutNode.this
                int r4 = r0.m23649p()
                if (r4 <= 0) goto L8f
                java.lang.Object[] r0 = r0.m23650o()
            L5f:
                r5 = r0[r1]
                j1.k r5 = (p169j1.LayoutNode) r5
                int r6 = p169j1.LayoutNode.m21520o(r5)
                int r7 = r5.m21545b0()
                if (r6 == r7) goto L7c
                p169j1.LayoutNode.m21514r(r2)
                r2.m21521n0()
                int r6 = r5.m21545b0()
                if (r6 != r3) goto L7c
                p169j1.LayoutNode.m21516q(r5)
            L7c:
                j1.l r6 = r5.m21579H()
                j1.l r5 = r5.m21579H()
                boolean r5 = r5.m21466h()
                r6.m21459o(r5)
                int r1 = r1 + 1
                if (r1 < r4) goto L5f
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutNode.C6277j.m21486a():void");
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21486a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$k */
    /* loaded from: classes.dex */
    public static final class C6278k extends AbstractC6438m implements InterfaceC6112p {
        C6278k() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m21485a((C13195u) obj, (InterfaceC9570f.InterfaceC9573c) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m21485a(C13195u c13195u, InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
            DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper;
            Intrinsics.isThisObjectNull(c13195u, "$noName_0");
            Intrinsics.isThisObjectNull(interfaceC9573c, "mod");
            MutableVector m21518p = LayoutNode.m21518p(LayoutNode.this);
            int m23649p = m21518p.m23649p();
            if (m23649p > 0) {
                int i = m23649p - 1;
                Object[] m23650o = m21518p.m23650o();
                do {
                    delegatingLayoutNodeWrapper = m23650o[i];
                    DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper) delegatingLayoutNodeWrapper;
                    if (delegatingLayoutNodeWrapper2.m21755P1() == interfaceC9573c && !delegatingLayoutNodeWrapper2.m21754Q1()) {
                        break;
                    }
                    i--;
                } while (i >= 0);
                delegatingLayoutNodeWrapper = null;
            } else {
                delegatingLayoutNodeWrapper = null;
            }
            DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper3 = delegatingLayoutNodeWrapper;
            while (delegatingLayoutNodeWrapper3 != null) {
                delegatingLayoutNodeWrapper3.m21745W1(true);
                if (delegatingLayoutNodeWrapper3.m21750S1()) {
                    LayoutNodeWrapper m21368l1 = delegatingLayoutNodeWrapper3.m21368l1();
                    if (m21368l1 instanceof DelegatingLayoutNodeWrapper) {
                        delegatingLayoutNodeWrapper3 = (DelegatingLayoutNodeWrapper) m21368l1;
                    }
                }
                delegatingLayoutNodeWrapper3 = null;
            }
        }
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$l */
    /* loaded from: classes.dex */
    public static final class C6279l implements MeasureScope, Density {
        C6279l() {
        }

        /* renamed from: A */
        public float m21484A(float f) {
            return MeasureScope.C5806a.m22995f(this, f);
        }

        /* renamed from: O */
        public int m21483O(float f) {
            return MeasureScope.C5806a.m22998c(this, f);
        }

        /* renamed from: U */
        public long m21482U(long j) {
            return MeasureScope.C5806a.m22994g(this, j);
        }

        /* renamed from: Y */
        public float m21481Y(long j) {
            return MeasureScope.C5806a.m22996e(this, j);
        }

        public float getDensity() {
            return LayoutNode.this.m21573K().getDensity();
        }

        public EnumC13618o getLayoutDirection() {
            return LayoutNode.this.getLayoutDirection();
        }

        /* renamed from: i0 */
        public float m21480i0(int i) {
            return MeasureScope.C5806a.m22997d(this, i);
        }

        /* renamed from: r */
        public float m21479r() {
            return LayoutNode.this.m21573K().m894r();
        }

        /* renamed from: s */
        public InterfaceC5805t m21478s(int i, int i2, Map map, InterfaceC6108l interfaceC6108l) {
            return MeasureScope.C5806a.m23000a(this, i, i2, map, interfaceC6108l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    /* renamed from: j1.k$m */
    /* loaded from: classes.dex */
    public static final class C6280m extends AbstractC6438m implements InterfaceC6112p {
        C6280m() {
            super(2);
        }

        /* renamed from: a */
        public final LayoutNodeWrapper mo39856d(InterfaceC9570f.InterfaceC9573c interfaceC9573c, LayoutNodeWrapper layoutNodeWrapper) {
            ModifierLocalProviderNode modifierLocalProviderNode;
            Intrinsics.isThisObjectNull(interfaceC9573c, "mod");
            Intrinsics.isThisObjectNull(layoutNodeWrapper, "toWrap");
            if (interfaceC9573c instanceof RemeasurementModifier) {
                ((RemeasurementModifier) interfaceC9573c).m23128t(LayoutNode.this);
            }
            if (interfaceC9573c instanceof InterfaceC10024e) {
                DrawEntity drawEntity = new DrawEntity(layoutNodeWrapper, (InterfaceC10024e) interfaceC9573c);
                drawEntity.m21680n(layoutNodeWrapper.m21385X0());
                layoutNodeWrapper.m21411G1(drawEntity);
                drawEntity.m21682l();
            }
            DelegatingLayoutNodeWrapper m21512s = LayoutNode.m21512s(LayoutNode.this, interfaceC9573c, layoutNodeWrapper);
            if (m21512s == null) {
                if (interfaceC9573c instanceof ModifierLocalProvider) {
                    ModifierLocalProviderNode modifierLocalProviderNode2 = new ModifierLocalProviderNode(layoutNodeWrapper, (ModifierLocalProvider) interfaceC9573c);
                    modifierLocalProviderNode2.m21737v1();
                    LayoutNodeWrapper m21742k1 = modifierLocalProviderNode2.m21742k1();
                    modifierLocalProviderNode = modifierLocalProviderNode2;
                    if (layoutNodeWrapper != m21742k1) {
                        ((DelegatingLayoutNodeWrapper) modifierLocalProviderNode2.m21742k1()).m21748T1(true);
                        modifierLocalProviderNode = modifierLocalProviderNode2;
                    }
                } else {
                    modifierLocalProviderNode = layoutNodeWrapper;
                }
                ModifierLocalConsumerNode modifierLocalConsumerNode = modifierLocalProviderNode;
                if (interfaceC9573c instanceof ModifierLocalConsumer) {
                    ModifierLocalConsumerNode modifierLocalConsumerNode2 = new ModifierLocalConsumerNode(modifierLocalProviderNode, (ModifierLocalConsumer) interfaceC9573c);
                    modifierLocalConsumerNode2.m21737v1();
                    if (layoutNodeWrapper != modifierLocalConsumerNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifierLocalConsumerNode2.m21742k1()).m21748T1(true);
                    }
                    modifierLocalConsumerNode = modifierLocalConsumerNode2;
                }
                ModifiedFocusNode modifiedFocusNode = modifierLocalConsumerNode;
                if (interfaceC9573c instanceof FocusModifier) {
                    ModifiedFocusNode modifiedFocusNode2 = new ModifiedFocusNode(modifierLocalConsumerNode, (FocusModifier) interfaceC9573c);
                    modifiedFocusNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedFocusNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedFocusNode = modifiedFocusNode2;
                }
                ModifiedFocusEventNode modifiedFocusEventNode = modifiedFocusNode;
                if (interfaceC9573c instanceof FocusEventModifier) {
                    ModifiedFocusEventNode modifiedFocusEventNode2 = new ModifiedFocusEventNode(modifiedFocusNode, (FocusEventModifier) interfaceC9573c);
                    modifiedFocusEventNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedFocusEventNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusEventNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedFocusEventNode = modifiedFocusEventNode2;
                }
                ModifiedFocusRequesterNode modifiedFocusRequesterNode = modifiedFocusEventNode;
                if (interfaceC9573c instanceof InterfaceC10351t) {
                    ModifiedFocusRequesterNode modifiedFocusRequesterNode2 = new ModifiedFocusRequesterNode(modifiedFocusEventNode, (InterfaceC10351t) interfaceC9573c);
                    modifiedFocusRequesterNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedFocusRequesterNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusRequesterNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedFocusRequesterNode = modifiedFocusRequesterNode2;
                }
                ModifiedFocusOrderNode modifiedFocusOrderNode = modifiedFocusRequesterNode;
                if (interfaceC9573c instanceof InterfaceC10342n) {
                    ModifiedFocusOrderNode modifiedFocusOrderNode2 = new ModifiedFocusOrderNode(modifiedFocusRequesterNode, (InterfaceC10342n) interfaceC9573c);
                    modifiedFocusOrderNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedFocusOrderNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedFocusOrderNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedFocusOrderNode = modifiedFocusOrderNode2;
                }
                ModifiedKeyInputNode modifiedKeyInputNode = modifiedFocusOrderNode;
                if (interfaceC9573c instanceof KeyInputModifier) {
                    ModifiedKeyInputNode modifiedKeyInputNode2 = new ModifiedKeyInputNode(modifiedFocusOrderNode, (KeyInputModifier) interfaceC9573c);
                    modifiedKeyInputNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedKeyInputNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedKeyInputNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedKeyInputNode = modifiedKeyInputNode2;
                }
                PointerInputDelegatingWrapper pointerInputDelegatingWrapper = modifiedKeyInputNode;
                if (interfaceC9573c instanceof PointerEvent) {
                    PointerInputDelegatingWrapper pointerInputDelegatingWrapper2 = new PointerInputDelegatingWrapper(modifiedKeyInputNode, (PointerEvent) interfaceC9573c);
                    pointerInputDelegatingWrapper2.m21737v1();
                    if (layoutNodeWrapper != pointerInputDelegatingWrapper2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) pointerInputDelegatingWrapper2.m21742k1()).m21748T1(true);
                    }
                    pointerInputDelegatingWrapper = pointerInputDelegatingWrapper2;
                }
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = pointerInputDelegatingWrapper;
                if (interfaceC9573c instanceof InterfaceC4949e) {
                    NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper2 = new NestedScrollDelegatingWrapper(pointerInputDelegatingWrapper, (InterfaceC4949e) interfaceC9573c);
                    nestedScrollDelegatingWrapper2.m21737v1();
                    if (layoutNodeWrapper != nestedScrollDelegatingWrapper2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) nestedScrollDelegatingWrapper2.m21742k1()).m21748T1(true);
                    }
                    nestedScrollDelegatingWrapper = nestedScrollDelegatingWrapper2;
                }
                ModifiedLayoutNode modifiedLayoutNode = nestedScrollDelegatingWrapper;
                if (interfaceC9573c instanceof LayoutModifier) {
                    ModifiedLayoutNode modifiedLayoutNode2 = new ModifiedLayoutNode(nestedScrollDelegatingWrapper, (LayoutModifier) interfaceC9573c);
                    modifiedLayoutNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedLayoutNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedLayoutNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedLayoutNode = modifiedLayoutNode2;
                }
                ModifiedParentDataNode modifiedParentDataNode = modifiedLayoutNode;
                if (interfaceC9573c instanceof ParentDataModifier) {
                    ModifiedParentDataNode modifiedParentDataNode2 = new ModifiedParentDataNode(modifiedLayoutNode, (ParentDataModifier) interfaceC9573c);
                    modifiedParentDataNode2.m21737v1();
                    if (layoutNodeWrapper != modifiedParentDataNode2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) modifiedParentDataNode2.m21742k1()).m21748T1(true);
                    }
                    modifiedParentDataNode = modifiedParentDataNode2;
                }
                SemanticsWrapper semanticsWrapper = modifiedParentDataNode;
                if (interfaceC9573c instanceof SemanticsModifier) {
                    SemanticsWrapper semanticsWrapper2 = new SemanticsWrapper(modifiedParentDataNode, (SemanticsModifier) interfaceC9573c);
                    semanticsWrapper2.m21737v1();
                    if (layoutNodeWrapper != semanticsWrapper2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) semanticsWrapper2.m21742k1()).m21748T1(true);
                    }
                    semanticsWrapper = semanticsWrapper2;
                }
                RemeasureModifierWrapper remeasureModifierWrapper = semanticsWrapper;
                if (interfaceC9573c instanceof InterfaceC5745a0) {
                    RemeasureModifierWrapper remeasureModifierWrapper2 = new RemeasureModifierWrapper(semanticsWrapper, (InterfaceC5745a0) interfaceC9573c);
                    remeasureModifierWrapper2.m21737v1();
                    if (layoutNodeWrapper != remeasureModifierWrapper2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) remeasureModifierWrapper2.m21742k1()).m21748T1(true);
                    }
                    remeasureModifierWrapper = remeasureModifierWrapper2;
                }
                OnPlacedModifierWrapper onPlacedModifierWrapper = remeasureModifierWrapper;
                if (interfaceC9573c instanceof InterfaceC5813z) {
                    OnPlacedModifierWrapper onPlacedModifierWrapper2 = new OnPlacedModifierWrapper(remeasureModifierWrapper, (InterfaceC5813z) interfaceC9573c);
                    onPlacedModifierWrapper2.m21737v1();
                    if (layoutNodeWrapper != onPlacedModifierWrapper2.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) onPlacedModifierWrapper2.m21742k1()).m21748T1(true);
                    }
                    onPlacedModifierWrapper = onPlacedModifierWrapper2;
                }
                if (interfaceC9573c instanceof OnGloballyPositionedModifier) {
                    OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = new OnGloballyPositionedModifierWrapper(onPlacedModifierWrapper, (OnGloballyPositionedModifier) interfaceC9573c);
                    onGloballyPositionedModifierWrapper.m21737v1();
                    if (layoutNodeWrapper != onGloballyPositionedModifierWrapper.m21742k1()) {
                        ((DelegatingLayoutNodeWrapper) onGloballyPositionedModifierWrapper.m21742k1()).m21748T1(true);
                    }
                    return onGloballyPositionedModifierWrapper;
                }
                return onPlacedModifierWrapper;
            }
            return m21512s;
        }
    }

    public LayoutNode() {
        this(false, 1, null);
    }

    public LayoutNode(boolean z) {
        this.f17199w = z;
        this.f17201y = new MutableVector(new LayoutNode[16], 0);
        this.f17169E = EnumC6272e.Ready;
        this.f17170F = new MutableVector(new DelegatingLayoutNodeWrapper[16], 0);
        this.f17172H = new MutableVector(new LayoutNode[16], 0);
        this.f17173I = true;
        this.f17174J = f17162j0;
        this.f17175K = new IntrinsicsPolicy(this);
        this.f17176L = C13604f.m881b(1.0f, 0.0f, 2, null);
        this.f17177M = new C6279l();
        this.f17178N = EnumC13618o.Ltr;
        this.f17179O = f17164l0;
        this.f17180P = new LayoutNodeAlignmentLines(this);
        this.f17182R = Reader.READ_DONE;
        this.f17183S = Reader.READ_DONE;
        this.f17185U = EnumC6274g.NotUsed;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.f17187W = innerPlaceable;
        this.f17188X = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.f17191a0 = true;
        this.f17192b0 = InterfaceC9570f.f25164r;
        this.f17198h0 = C6266j.f17158w;
    }

    /* renamed from: A0 */
    private final void m21592A0() {
        if (this.f17199w) {
            LayoutNode m21547a0 = m21547a0();
            if (m21547a0 == null) {
                return;
            }
            m21547a0.m21592A0();
            return;
        }
        this.f17173I = true;
    }

    /* renamed from: B */
    private final void m21591B() {
        LayoutNodeWrapper m21550Y = m21550Y();
        LayoutNodeWrapper m21563P = m21563P();
        while (!Intrinsics.equals(m21550Y, m21563P)) {
            this.f17170F.m23659c((DelegatingLayoutNodeWrapper) m21550Y);
            m21550Y.m21411G1(null);
            m21550Y = m21550Y.m21369k1();
            Intrinsics.ifNullDoSomething(m21550Y);
        }
        this.f17187W.m21411G1(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String m21589C(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r8) goto L11
            int r2 = r2 + 1
            java.lang.String r3 = "  "
            r0.append(r3)
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            g0.e r2 = r7.m21537f0()
            int r3 = r2.m23649p()
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.m23650o()
            r4 = r1
        L31:
            r5 = r2[r4]
            j1.k r5 = (p169j1.LayoutNode) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.m21589C(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L31
        L42:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            p181jd.Intrinsics.checkIfNull(r0, r2)
            if (r8 != 0) goto L5c
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            p181jd.Intrinsics.checkIfNull(r0, r8)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutNode.m21589C(int):java.lang.String");
    }

    /* renamed from: C0 */
    private final void m21588C0() {
        if (this.f17165A) {
            int i = 0;
            this.f17165A = false;
            MutableVector mutableVector = this.f17202z;
            if (mutableVector == null) {
                MutableVector mutableVector2 = new MutableVector(new LayoutNode[16], 0);
                this.f17202z = mutableVector2;
                mutableVector = mutableVector2;
            }
            mutableVector.m23654i();
            MutableVector mutableVector3 = this.f17201y;
            int m23649p = mutableVector3.m23649p();
            if (m23649p > 0) {
                Object[] m23650o = mutableVector3.m23650o();
                do {
                    LayoutNode layoutNode = (LayoutNode) m23650o[i];
                    if (layoutNode.f17199w) {
                        mutableVector.m23658d(mutableVector.m23649p(), layoutNode.m21537f0());
                    } else {
                        mutableVector.m23659c(layoutNode);
                    }
                    i++;
                } while (i < m23649p);
            }
        }
    }

    /* renamed from: D */
    static /* synthetic */ String m21587D(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.m21589C(i);
    }

    /* renamed from: E0 */
    public static /* synthetic */ boolean m21584E0(LayoutNode layoutNode, C13599b c13599b, int i, Object obj) {
        if ((i & 1) != 0) {
            c13599b = layoutNode.f17188X.m21697x0();
        }
        return layoutNode.m21586D0(c13599b);
    }

    /* renamed from: K0 */
    private final void m21572K0(LayoutNode layoutNode) {
        int i = C6275h.f17204a[layoutNode.f17169E.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalStateException(Intrinsics.addStrAndObj("Unexpected state ", layoutNode.f17169E));
            }
            return;
        }
        layoutNode.f17169E = EnumC6272e.Ready;
        if (i == 1) {
            layoutNode.m21574J0();
        } else {
            layoutNode.m21576I0();
        }
    }

    /* renamed from: L0 */
    private final DelegatingLayoutNodeWrapper m21570L0(InterfaceC9570f.InterfaceC9573c interfaceC9573c, LayoutNodeWrapper layoutNodeWrapper) {
        int i;
        if (this.f17170F.m23647r()) {
            return null;
        }
        MutableVector mutableVector = this.f17170F;
        int m23649p = mutableVector.m23649p();
        int i2 = -1;
        if (m23649p > 0) {
            i = m23649p - 1;
            Object[] m23650o = mutableVector.m23650o();
            do {
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper = (DelegatingLayoutNodeWrapper) m23650o[i];
                if (delegatingLayoutNodeWrapper.m21754Q1() && delegatingLayoutNodeWrapper.m21755P1() == interfaceC9573c) {
                    break;
                }
                i--;
            } while (i >= 0);
            i = -1;
        } else {
            i = -1;
        }
        if (i < 0) {
            MutableVector mutableVector2 = this.f17170F;
            int m23649p2 = mutableVector2.m23649p();
            if (m23649p2 > 0) {
                int i3 = m23649p2 - 1;
                Object[] m23650o2 = mutableVector2.m23650o();
                while (true) {
                    DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper) m23650o2[i3];
                    if (!(!delegatingLayoutNodeWrapper2.m21754Q1() && Intrinsics.equals(C0843z0.m39451a(delegatingLayoutNodeWrapper2.m21755P1()), C0843z0.m39451a(interfaceC9573c)))) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
            }
            i = i2;
        }
        if (i < 0) {
            return null;
        }
        int i4 = i - 1;
        DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper3 = (DelegatingLayoutNodeWrapper) this.f17170F.m23642w(i);
        delegatingLayoutNodeWrapper3.m21744X1(layoutNodeWrapper);
        delegatingLayoutNodeWrapper3.m21746V1(interfaceC9573c);
        delegatingLayoutNodeWrapper3.m21737v1();
        while (delegatingLayoutNodeWrapper3.m21750S1()) {
            DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper4 = (DelegatingLayoutNodeWrapper) this.f17170F.m23642w(i4);
            delegatingLayoutNodeWrapper4.m21746V1(interfaceC9573c);
            delegatingLayoutNodeWrapper4.m21737v1();
            i4--;
            delegatingLayoutNodeWrapper3 = delegatingLayoutNodeWrapper4;
        }
        return delegatingLayoutNodeWrapper3;
    }

    /* renamed from: O */
    private final LayoutNodeWrapper m21565O() {
        if (this.f17191a0) {
            LayoutNodeWrapper layoutNodeWrapper = this.f17187W;
            LayoutNodeWrapper m21368l1 = m21550Y().m21368l1();
            this.f17190Z = null;
            while (true) {
                if (Intrinsics.equals(layoutNodeWrapper, m21368l1)) {
                    break;
                }
                if ((layoutNodeWrapper == null ? null : layoutNodeWrapper.m21382a1()) != null) {
                    this.f17190Z = layoutNodeWrapper;
                    break;
                }
                layoutNodeWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.m21368l1();
            }
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f17190Z;
        if (layoutNodeWrapper2 == null || layoutNodeWrapper2.m21382a1() != null) {
            return layoutNodeWrapper2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: R0 */
    private final boolean m21558R0() {
        LayoutNodeWrapper m21369k1 = m21563P().m21369k1();
        for (LayoutNodeWrapper m21550Y = m21550Y(); !Intrinsics.equals(m21550Y, m21369k1) && m21550Y != null; m21550Y = m21550Y.m21369k1()) {
            if (m21550Y.m21382a1() != null) {
                return false;
            }
            if (m21550Y.m21385X0() != null) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: h0 */
    private final boolean m21533h0() {
        return ((Boolean) m21553V().mo7208V(Boolean.FALSE, new C6276i(this.f17195e0))).booleanValue();
    }

    /* renamed from: i */
    public static /* synthetic */ int m21532i(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return m21530j(layoutNode, layoutNode2);
    }

    /* renamed from: j */
    private static final int m21530j(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f = layoutNode.f17189Y;
        float f2 = layoutNode2.f17189Y;
        if (f == f2) {
            return Intrinsics.isLessOrEqual(layoutNode.f17182R, layoutNode2.f17182R);
        }
        return Float.compare(f, f2);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m21529j0(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m21531i0(j, hitTestResult, z3, z2);
    }

    /* renamed from: l */
    public static final /* synthetic */ InterfaceC6097a m21526l() {
        return f17163k0;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m21525l0(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        layoutNode.m21527k0(j, hitTestResult, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    /* renamed from: m */
    public static final /* synthetic */ OuterMeasurablePlaceable m21524m(LayoutNode layoutNode) {
        return layoutNode.f17188X;
    }

    /* renamed from: o */
    public static final /* synthetic */ int m21520o(LayoutNode layoutNode) {
        return layoutNode.f17183S;
    }

    /* renamed from: p */
    public static final /* synthetic */ MutableVector m21518p(LayoutNode layoutNode) {
        return layoutNode.f17170F;
    }

    /* renamed from: p0 */
    private final void m21517p0() {
        LayoutNode m21547a0;
        if (this.f17200x > 0) {
            this.f17165A = true;
        }
        if (!this.f17199w || (m21547a0 = m21547a0()) == null) {
            return;
        }
        m21547a0.f17165A = true;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m21516q(LayoutNode layoutNode) {
        layoutNode.m21507u0();
    }

    /* renamed from: r */
    public static final /* synthetic */ void m21514r(LayoutNode layoutNode) {
        layoutNode.m21592A0();
    }

    /* renamed from: s */
    public static final /* synthetic */ DelegatingLayoutNodeWrapper m21512s(LayoutNode layoutNode, InterfaceC9570f.InterfaceC9573c interfaceC9573c, LayoutNodeWrapper layoutNodeWrapper) {
        return layoutNode.m21570L0(interfaceC9573c, layoutNodeWrapper);
    }

    /* renamed from: s0 */
    private final void m21511s0() {
        this.f17181Q = true;
        LayoutNodeWrapper m21369k1 = m21563P().m21369k1();
        for (LayoutNodeWrapper m21550Y = m21550Y(); !Intrinsics.equals(m21550Y, m21369k1) && m21550Y != null; m21550Y = m21550Y.m21369k1()) {
            if (m21550Y.m21383Z0()) {
                m21550Y.m21362p1();
            }
        }
        MutableVector m21537f0 = m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21537f0.m23650o();
            do {
                LayoutNode layoutNode = (LayoutNode) m23650o[i];
                if (layoutNode.m21545b0() != Integer.MAX_VALUE) {
                    layoutNode.m21511s0();
                    m21572K0(layoutNode);
                }
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: t */
    public static final /* synthetic */ void m21510t(LayoutNode layoutNode, boolean z) {
        layoutNode.f17171G = z;
    }

    /* renamed from: t0 */
    private final void m21509t0(InterfaceC9570f interfaceC9570f) {
        MutableVector mutableVector = this.f17170F;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            int i = 0;
            do {
                ((DelegatingLayoutNodeWrapper) m23650o[i]).m21745W1(false);
                i++;
            } while (i < m23649p);
            interfaceC9570f.mo7206o(C13195u.f34156a, new C6278k());
        }
        interfaceC9570f.mo7206o(C13195u.f34156a, new C6278k());
    }

    /* renamed from: u */
    public static final /* synthetic */ void m21508u(LayoutNode layoutNode, int i) {
        layoutNode.f17184T = i;
    }

    /* renamed from: u0 */
    private final void m21507u0() {
        if (mo23015f()) {
            int i = 0;
            this.f17181Q = false;
            MutableVector m21537f0 = m21537f0();
            int m23649p = m21537f0.m23649p();
            if (m23649p > 0) {
                Object[] m23650o = m21537f0.m23650o();
                do {
                    ((LayoutNode) m23650o[i]).m21507u0();
                    i++;
                } while (i < m23649p);
            }
        }
    }

    /* renamed from: v */
    public static final /* synthetic */ void m21506v(LayoutNode layoutNode, int i) {
        layoutNode.f17182R = i;
    }

    /* renamed from: w */
    public static final /* synthetic */ void m21504w(LayoutNode layoutNode, int i) {
        layoutNode.f17183S = i;
    }

    /* renamed from: x0 */
    private final void m21501x0() {
        MutableVector m21537f0 = m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21537f0.m23650o();
            do {
                LayoutNode layoutNode = (LayoutNode) m23650o[i];
                if (layoutNode.m21561Q() == EnumC6272e.NeedsRemeasure && layoutNode.m21554U() == EnumC6274g.InMeasureBlock && m21584E0(layoutNode, null, 1, null)) {
                    m21574J0();
                }
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: y */
    private final void m21500y() {
        if (this.f17169E == EnumC6272e.Measuring) {
            this.f17180P.m21457q(true);
            if (this.f17180P.m21473a()) {
                this.f17169E = EnumC6272e.NeedsRelayout;
                return;
            }
            return;
        }
        this.f17180P.m21458p(true);
    }

    /* renamed from: y0 */
    private final void m21499y0() {
        m21574J0();
        LayoutNode m21547a0 = m21547a0();
        if (m21547a0 != null) {
            m21547a0.m21521n0();
        }
        m21519o0();
    }

    /* renamed from: A */
    public final Map m21593A() {
        if (!this.f17188X.m21699w0()) {
            m21500y();
        }
        m21513r0();
        return this.f17180P.m21472b();
    }

    /* renamed from: B0 */
    public final void m21590B0(int i, int i2) {
        Placeable.AbstractC5751a.C5752a c5752a = Placeable.AbstractC5751a.f16066a;
        int m21703o0 = this.f17188X.m21703o0();
        EnumC13618o layoutDirection = getLayoutDirection();
        int m23145z = Placeable.AbstractC5751a.C5752a.m23145z(c5752a);
        EnumC13618o m23146y = Placeable.AbstractC5751a.C5752a.m23146y(c5752a);
        Placeable.AbstractC5751a.m23167f(m21703o0);
        Placeable.AbstractC5751a.m23168e(layoutDirection);
        Placeable.AbstractC5751a.m23159n(c5752a, m21524m(this), i, i2, 0.0f, 4, null);
        Placeable.AbstractC5751a.m23167f(m23145z);
        Placeable.AbstractC5751a.m23168e(m23146y);
    }

    /* renamed from: D0 */
    public final boolean m21586D0(C13599b c13599b) {
        if (c13599b != null) {
            return this.f17188X.m21707B0(c13599b.m911s());
        }
        return false;
    }

    /* renamed from: E */
    public final void m21585E() {
        InterfaceC6253f0 interfaceC6253f0 = this.f17167C;
        if (interfaceC6253f0 == null) {
            LayoutNode m21547a0 = m21547a0();
            throw new IllegalStateException(Intrinsics.addStrAndObj("Cannot detach node that is already detached!  Tree: ", m21547a0 != null ? m21587D(m21547a0, 0, 1, null) : null).toString());
        }
        LayoutNode m21547a02 = m21547a0();
        if (m21547a02 != null) {
            m21547a02.m21521n0();
            m21547a02.m21574J0();
        }
        this.f17180P.m21461m();
        InterfaceC6108l interfaceC6108l = this.f17194d0;
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(interfaceC6253f0);
        }
        LayoutNodeWrapper m21550Y = m21550Y();
        LayoutNodeWrapper m21563P = m21563P();
        while (!Intrinsics.equals(m21550Y, m21563P)) {
            m21550Y.m21414F0();
            m21550Y = m21550Y.m21369k1();
            Intrinsics.ifNullDoSomething(m21550Y);
        }
        this.f17187W.m21414F0();
        if (C7607q.m17974j(this) != null) {
            interfaceC6253f0.mo21649k();
        }
        interfaceC6253f0.mo21646p(this);
        this.f17167C = null;
        this.f17168D = 0;
        MutableVector mutableVector = this.f17201y;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            int i = 0;
            do {
                ((LayoutNode) m23650o[i]).m21585E();
                i++;
            } while (i < m23649p);
            this.f17182R = Reader.READ_DONE;
            this.f17183S = Reader.READ_DONE;
            this.f17181Q = false;
        }
        this.f17182R = Reader.READ_DONE;
        this.f17183S = Reader.READ_DONE;
        this.f17181Q = false;
    }

    /* renamed from: F */
    public final void m21583F() {
        MutableVector mutableVector;
        int m23649p;
        if (this.f17169E == EnumC6272e.Ready && mo23015f() && (mutableVector = this.f17195e0) != null && (m23649p = mutableVector.m23649p()) > 0) {
            int i = 0;
            Object[] m23650o = mutableVector.m23650o();
            do {
                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = (OnGloballyPositionedModifierWrapper) m23650o[i];
                ((OnGloballyPositionedModifier) onGloballyPositionedModifierWrapper.m21755P1()).m22988q(onGloballyPositionedModifierWrapper);
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: F0 */
    public final void m21582F0() {
        boolean z = this.f17167C != null;
        int m23649p = this.f17201y.m23649p() - 1;
        if (m23649p >= 0) {
            while (true) {
                int i = m23649p - 1;
                LayoutNode layoutNode = (LayoutNode) this.f17201y.m23650o()[m23649p];
                if (z) {
                    layoutNode.m21585E();
                }
                layoutNode.f17166B = null;
                if (i < 0) {
                    break;
                }
                m23649p = i;
            }
        }
        this.f17201y.m23654i();
        m21592A0();
        this.f17200x = 0;
        m21517p0();
    }

    /* renamed from: G */
    public final void m21581G(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        m21550Y().m21410H0(interfaceC11064u);
    }

    /* renamed from: G0 */
    public final void m21580G0(int i, int i2) {
        if (i2 >= 0) {
            boolean z = this.f17167C != null;
            int i3 = (i2 + i) - 1;
            if (i > i3) {
                return;
            }
            while (true) {
                int i4 = i3 - 1;
                LayoutNode layoutNode = (LayoutNode) this.f17201y.m23642w(i3);
                m21592A0();
                if (z) {
                    layoutNode.m21585E();
                }
                layoutNode.f17166B = null;
                if (layoutNode.f17199w) {
                    this.f17200x--;
                }
                m21517p0();
                if (i3 == i) {
                    return;
                }
                i3 = i4;
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    /* renamed from: H */
    public final LayoutNodeAlignmentLines m21579H() {
        return this.f17180P;
    }

    /* renamed from: H0 */
    public final void m21578H0() {
        try {
            this.f17197g0 = true;
            this.f17188X.m21706C0();
        } finally {
            this.f17197g0 = false;
        }
    }

    /* renamed from: I */
    public final boolean m21577I() {
        return this.f17186V;
    }

    /* renamed from: I0 */
    public final void m21576I0() {
        InterfaceC6253f0 interfaceC6253f0;
        if (this.f17199w || (interfaceC6253f0 = this.f17167C) == null) {
            return;
        }
        interfaceC6253f0.mo21645q(this);
    }

    /* renamed from: J */
    public final List m21575J() {
        return m21537f0().m23655h();
    }

    /* renamed from: J0 */
    public final void m21574J0() {
        InterfaceC6253f0 interfaceC6253f0 = this.f17167C;
        if (interfaceC6253f0 == null || this.f17171G || this.f17199w) {
            return;
        }
        interfaceC6253f0.mo21647o(this);
    }

    /* renamed from: K */
    public Density m21573K() {
        return this.f17176L;
    }

    /* renamed from: L */
    public final int m21571L() {
        return this.f17168D;
    }

    /* renamed from: M */
    public final List m21569M() {
        return this.f17201y.m23655h();
    }

    /* renamed from: M0 */
    public final void m21568M0(boolean z) {
        this.f17186V = z;
    }

    /* renamed from: N */
    public int m21567N() {
        return this.f17188X.m23182l0();
    }

    /* renamed from: N0 */
    public final void m21566N0(boolean z) {
        this.f17191a0 = z;
    }

    /* renamed from: O0 */
    public final void m21564O0(EnumC6272e enumC6272e) {
        Intrinsics.isThisObjectNull(enumC6272e, "<set-?>");
        this.f17169E = enumC6272e;
    }

    /* renamed from: P */
    public final LayoutNodeWrapper m21563P() {
        return this.f17187W;
    }

    /* renamed from: P0 */
    public final void m21562P0(EnumC6274g enumC6274g) {
        Intrinsics.isThisObjectNull(enumC6274g, "<set-?>");
        this.f17185U = enumC6274g;
    }

    /* renamed from: Q */
    public final EnumC6272e m21561Q() {
        return this.f17169E;
    }

    /* renamed from: Q0 */
    public final void m21560Q0(boolean z) {
        this.f17196f0 = z;
    }

    /* renamed from: R */
    public final LayoutNodeDrawScope m21559R() {
        return C6284n.m21433a(this).getSharedDrawScope();
    }

    /* renamed from: S */
    public InterfaceC5804s m21557S() {
        return this.f17174J;
    }

    /* renamed from: S0 */
    public final void m21556S0(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        C6284n.m21433a(this).getSnapshotObserver().m21607h(interfaceC6097a);
    }

    /* renamed from: T */
    public final MeasureScope m21555T() {
        return this.f17177M;
    }

    /* renamed from: U */
    public final EnumC6274g m21554U() {
        return this.f17185U;
    }

    /* renamed from: V */
    public InterfaceC9570f m21553V() {
        return this.f17192b0;
    }

    /* renamed from: W */
    public final boolean m21552W() {
        return this.f17196f0;
    }

    /* renamed from: X */
    public final MutableVector m21551X() {
        MutableVector mutableVector = this.f17195e0;
        if (mutableVector == null) {
            MutableVector mutableVector2 = new MutableVector(new OnGloballyPositionedModifierWrapper[16], 0);
            this.f17195e0 = mutableVector2;
            return mutableVector2;
        }
        return mutableVector;
    }

    /* renamed from: Y */
    public final LayoutNodeWrapper m21550Y() {
        return this.f17188X.m21696y0();
    }

    /* renamed from: Z */
    public final InterfaceC6253f0 m21549Z() {
        return this.f17167C;
    }

    /* renamed from: a */
    public void mo23130a() {
        m21574J0();
        InterfaceC6253f0 interfaceC6253f0 = this.f17167C;
        if (interfaceC6253f0 == null) {
            return;
        }
        InterfaceC6253f0.C6255b.m21641a(interfaceC6253f0, false, 1, null);
    }

    /* renamed from: a0 */
    public final LayoutNode m21547a0() {
        LayoutNode layoutNode = this.f17166B;
        boolean z = false;
        if (layoutNode != null && layoutNode.f17199w) {
            z = true;
        }
        if (z) {
            if (layoutNode == null) {
                return null;
            }
            return layoutNode.m21547a0();
        }
        return layoutNode;
    }

    /* renamed from: b */
    public void m21546b(ViewConfiguration viewConfiguration) {
        Intrinsics.isThisObjectNull(viewConfiguration, "<set-?>");
        this.f17179O = viewConfiguration;
    }

    /* renamed from: b0 */
    public final int m21545b0() {
        return this.f17182R;
    }

    /* renamed from: c */
    public void m21544c(InterfaceC5804s interfaceC5804s) {
        Intrinsics.isThisObjectNull(interfaceC5804s, "value");
        if (Intrinsics.equals(this.f17174J, interfaceC5804s)) {
            return;
        }
        this.f17174J = interfaceC5804s;
        this.f17175K.m21602a(m21557S());
        m21574J0();
    }

    /* renamed from: c0 */
    public ViewConfiguration m21543c0() {
        return this.f17179O;
    }

    /* renamed from: d */
    public void m21542d(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "value");
        if (this.f17178N != enumC13618o) {
            this.f17178N = enumC13618o;
            m21499y0();
        }
    }

    /* renamed from: d0 */
    public int m21541d0() {
        return this.f17188X.m23177q0();
    }

    /* renamed from: e */
    public InterfaceC5776j mo23016e() {
        return this.f17187W;
    }

    /* renamed from: e0 */
    public final MutableVector m21539e0() {
        if (this.f17173I) {
            this.f17172H.m23654i();
            MutableVector mutableVector = this.f17172H;
            mutableVector.m23658d(mutableVector.m23649p(), m21537f0());
            this.f17172H.m23639z(this.f17198h0);
            this.f17173I = false;
        }
        return this.f17172H;
    }

    /* renamed from: f */
    public boolean mo23015f() {
        return this.f17181Q;
    }

    /* renamed from: f0 */
    public final MutableVector m21537f0() {
        if (this.f17200x == 0) {
            return this.f17201y;
        }
        m21588C0();
        MutableVector mutableVector = this.f17202z;
        Intrinsics.ifNullDoSomething(mutableVector);
        return mutableVector;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21536g(p302q0.InterfaceC9570f r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutNode.m21536g(q0.f):void");
    }

    /* renamed from: g0 */
    public final void m21535g0(InterfaceC5805t interfaceC5805t) {
        Intrinsics.isThisObjectNull(interfaceC5805t, "measureResult");
        this.f17187W.m21409H1(interfaceC5805t);
    }

    public EnumC13618o getLayoutDirection() {
        return this.f17178N;
    }

    /* renamed from: h */
    public void m21534h(Density density) {
        Intrinsics.isThisObjectNull(density, "value");
        if (Intrinsics.equals(this.f17176L, density)) {
            return;
        }
        this.f17176L = density;
        m21499y0();
    }

    /* renamed from: i0 */
    public final void m21531i0(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitTestResult");
        m21550Y().m21366n1(m21550Y().m21387V0(j), hitTestResult, z, z2);
    }

    /* renamed from: k */
    public boolean mo21638k() {
        return m21515q0();
    }

    /* renamed from: k0 */
    public final void m21527k0(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitSemanticsWrappers");
        m21550Y().m21364o1(m21550Y().m21387V0(j), hitTestResult, z2);
    }

    /* renamed from: m0 */
    public final void m21523m0(int i, LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "instance");
        if (!(layoutNode.f17166B == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(layoutNode);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(m21587D(this, 0, 1, null));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode.f17166B;
            sb2.append((Object) (layoutNode2 != null ? m21587D(layoutNode2, 0, 1, null) : null));
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (layoutNode.f17167C == null) {
            layoutNode.f17166B = this;
            this.f17201y.m23660b(i, layoutNode);
            m21592A0();
            if (layoutNode.f17199w) {
                if (!this.f17199w) {
                    this.f17200x++;
                } else {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
            }
            m21517p0();
            layoutNode.m21550Y().m21405J1(this.f17187W);
            InterfaceC6253f0 interfaceC6253f0 = this.f17167C;
            if (interfaceC6253f0 != null) {
                layoutNode.m21498z(interfaceC6253f0);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + m21587D(this, 0, 1, null) + " Other tree: " + m21587D(layoutNode, 0, 1, null)).toString());
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        return this.f17188X.mo23007n(j);
    }

    /* renamed from: n0 */
    public final void m21521n0() {
        LayoutNodeWrapper m21565O = m21565O();
        if (m21565O != null) {
            m21565O.m21362p1();
            return;
        }
        LayoutNode m21547a0 = m21547a0();
        if (m21547a0 == null) {
            return;
        }
        m21547a0.m21521n0();
    }

    /* renamed from: o0 */
    public final void m21519o0() {
        LayoutNodeWrapper m21550Y = m21550Y();
        LayoutNodeWrapper m21563P = m21563P();
        while (!Intrinsics.equals(m21550Y, m21563P)) {
            InterfaceC6250e0 m21382a1 = m21550Y.m21382a1();
            if (m21382a1 != null) {
                m21382a1.invalidate();
            }
            m21550Y = m21550Y.m21369k1();
            Intrinsics.ifNullDoSomething(m21550Y);
        }
        InterfaceC6250e0 m21382a12 = this.f17187W.m21382a1();
        if (m21382a12 == null) {
            return;
        }
        m21382a12.invalidate();
    }

    /* renamed from: q0 */
    public boolean m21515q0() {
        return this.f17167C != null;
    }

    /* renamed from: r0 */
    public final void m21513r0() {
        this.f17180P.m21462l();
        EnumC6272e enumC6272e = this.f17169E;
        EnumC6272e enumC6272e2 = EnumC6272e.NeedsRelayout;
        if (enumC6272e == enumC6272e2) {
            m21501x0();
        }
        if (this.f17169E == enumC6272e2) {
            this.f17169E = EnumC6272e.LayingOut;
            C6284n.m21433a(this).getSnapshotObserver().m21612c(this, new C6277j());
            this.f17169E = EnumC6272e.Ready;
        }
        if (this.f17180P.m21466h()) {
            this.f17180P.m21459o(true);
        }
        if (this.f17180P.m21473a() && this.f17180P.m21469e()) {
            this.f17180P.m21464j();
        }
    }

    public String toString() {
        return C0843z0.m39450b(this, null) + " children: " + m21575J().size() + " measurePolicy: " + m21557S();
    }

    /* renamed from: v0 */
    public final void m21505v0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i > i2 ? i + i4 : i;
            this.f17201y.m23660b(i > i2 ? i4 + i2 : (i2 + i3) - 2, (LayoutNode) this.f17201y.m23642w(i6));
            i4 = i5;
        }
        m21592A0();
        m21517p0();
        m21574J0();
    }

    /* renamed from: w0 */
    public final void m21503w0() {
        if (this.f17180P.m21473a()) {
            return;
        }
        this.f17180P.m21460n(true);
        LayoutNode m21547a0 = m21547a0();
        if (m21547a0 == null) {
            return;
        }
        if (this.f17180P.m21465i()) {
            m21547a0.m21574J0();
        } else if (this.f17180P.m21471c()) {
            m21547a0.m21576I0();
        }
        if (this.f17180P.m21467g()) {
            m21574J0();
        }
        if (this.f17180P.m21468f()) {
            m21547a0.m21576I0();
        }
        m21547a0.m21503w0();
    }

    /* renamed from: x */
    public Object mo23120x() {
        return this.f17188X.mo23120x();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4 A[LOOP:1: B:49:0x00be->B:51:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21498z(p169j1.InterfaceC6253f0 r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutNode.m21498z(j1.f0):void");
    }

    /* renamed from: z0 */
    public final void m21497z0() {
        LayoutNode m21547a0 = m21547a0();
        float m21367m1 = this.f17187W.m21367m1();
        LayoutNodeWrapper m21550Y = m21550Y();
        LayoutNodeWrapper m21563P = m21563P();
        while (!Intrinsics.equals(m21550Y, m21563P)) {
            m21367m1 += m21550Y.m21367m1();
            m21550Y = m21550Y.m21369k1();
            Intrinsics.ifNullDoSomething(m21550Y);
        }
        if (!(m21367m1 == this.f17189Y)) {
            this.f17189Y = m21367m1;
            if (m21547a0 != null) {
                m21547a0.m21592A0();
            }
            if (m21547a0 != null) {
                m21547a0.m21521n0();
            }
        }
        if (!mo23015f()) {
            if (m21547a0 != null) {
                m21547a0.m21521n0();
            }
            m21511s0();
        }
        if (m21547a0 != null) {
            if (!this.f17197g0 && m21547a0.f17169E == EnumC6272e.LayingOut) {
                if (this.f17182R == Integer.MAX_VALUE) {
                    int i = m21547a0.f17184T;
                    this.f17182R = i;
                    m21547a0.f17184T = i + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.f17182R = 0;
        }
        m21513r0();
    }

    public /* synthetic */ LayoutNode(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
