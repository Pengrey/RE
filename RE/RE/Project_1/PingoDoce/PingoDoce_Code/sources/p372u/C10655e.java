package p372u;

import androidx.compose.foundation.gestures.EnumC0627a;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p127h1.InterfaceC5776j;
import p127h1.OnGloballyPositionedModifier;
import p149i1.C5992f;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p149i1.ModifierLocalProvider;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p373u0.C10781l;
import p373u0.Rect;
import p468yc.C13186n;
import p468yc.C13195u;
import p477z.BringIntoViewResponder;
import p479z1.C13617n;
import td.C10531j0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C10655e implements ModifierLocalConsumer, ModifierLocalProvider, BringIntoViewResponder, OnGloballyPositionedModifier {

    /* renamed from: A */
    private final C5992f f27452A;

    /* renamed from: B */
    private final C10655e f27453B;

    /* renamed from: C */
    private InterfaceC5776j f27454C;

    /* renamed from: w */
    private final EnumC0627a f27455w;

    /* renamed from: x */
    private final InterfaceC10675f0 f27456x;

    /* renamed from: y */
    private final boolean f27457y;

    /* renamed from: z */
    private BringIntoViewResponder f27458z;

    /* compiled from: Scrollable.kt */
    /* renamed from: u.e$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10656a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27459a;

        static {
            int[] iArr = new int[EnumC0627a.values().length];
            iArr[EnumC0627a.Vertical.ordinal()] = 1;
            iArr[EnumC0627a.Horizontal.ordinal()] = 2;
            f27459a = iArr;
        }
    }

    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2", m20196f = "Scrollable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.e$b */
    /* loaded from: classes.dex */
    static final class C10657b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ Rect f27460A;

        /* renamed from: B */
        final /* synthetic */ Rect f27461B;

        /* renamed from: x */
        int f27462x;

        /* renamed from: y */
        private /* synthetic */ Object f27463y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$1", m20196f = "Scrollable.kt", m20195l = {455}, m20194m = "invokeSuspend")
        /* renamed from: u.e$b$a */
        /* loaded from: classes.dex */
        public static final class C10658a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ Rect f27465A;

            /* renamed from: x */
            int f27466x;

            /* renamed from: y */
            final /* synthetic */ C10655e f27467y;

            /* renamed from: z */
            final /* synthetic */ Rect f27468z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10658a(C10655e c10655e, Rect rect, Rect rect2, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27467y = c10655e;
                this.f27468z = rect;
                this.f27465A = rect2;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10658a(this.f27467y, this.f27468z, this.f27465A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10658a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27466x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C10655e c10655e = this.f27467y;
                    Rect rect = this.f27468z;
                    Rect rect2 = this.f27465A;
                    this.f27466x = 1;
                    if (c10655e.m7383g(rect, rect2, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2", m20196f = "Scrollable.kt", m20195l = {460}, m20194m = "invokeSuspend")
        /* renamed from: u.e$b$b */
        /* loaded from: classes.dex */
        public static final class C10659b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f27469x;

            /* renamed from: y */
            final /* synthetic */ C10655e f27470y;

            /* renamed from: z */
            final /* synthetic */ Rect f27471z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10659b(C10655e c10655e, Rect rect, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27470y = c10655e;
                this.f27471z = rect;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10659b(this.f27470y, this.f27471z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10659b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27469x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    BringIntoViewResponder m7386d = C10655e.m7386d(this.f27470y);
                    InterfaceC5776j interfaceC5776j = null;
                    if (m7386d == null) {
                        Intrinsics.throwUninitPropException("parent");
                        m7386d = null;
                    }
                    BringIntoViewResponder m7386d2 = C10655e.m7386d(this.f27470y);
                    if (m7386d2 == null) {
                        Intrinsics.throwUninitPropException("parent");
                        m7386d2 = null;
                    }
                    Rect rect = this.f27471z;
                    InterfaceC5776j m7387c = C10655e.m7387c(this.f27470y);
                    if (m7387c == null) {
                        Intrinsics.throwUninitPropException("layoutCoordinates");
                    } else {
                        interfaceC5776j = m7387c;
                    }
                    Rect m1271b = m7386d2.m1271b(rect, interfaceC5776j);
                    this.f27469x = 1;
                    if (m7386d.m1272a(m1271b, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10657b(Rect rect, Rect rect2, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27460A = rect;
            this.f27461B = rect2;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10657b c10657b = new C10657b(this.f27460A, this.f27461B, interfaceC1886d);
            c10657b.f27463y = obj;
            return c10657b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10657b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            InterfaceC10574t1 m20158d;
            C2116d.m34636d();
            if (this.f27462x == 0) {
                C13186n.m1453b(obj);
                InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f27463y;
                C6772d.m20158d(interfaceC10524i0, null, null, new C10658a(C10655e.this, this.f27460A, this.f27461B, null), 3, null);
                m20158d = C6772d.m20158d(interfaceC10524i0, null, null, new C10659b(C10655e.this, this.f27461B, null), 3, null);
                return m20158d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10655e(EnumC0627a enumC0627a, InterfaceC10675f0 interfaceC10675f0, boolean z) {
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        Intrinsics.isThisObjectNull(interfaceC10675f0, "scrollableState");
        this.f27455w = enumC0627a;
        this.f27456x = interfaceC10675f0;
        this.f27457y = z;
        this.f27452A = BringIntoViewResponder.f34298v.m1270a();
        this.f27453B = this;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC5776j m7387c(C10655e c10655e) {
        return c10655e.f27454C;
    }

    /* renamed from: d */
    public static final /* synthetic */ BringIntoViewResponder m7386d(C10655e c10655e) {
        return c10655e.f27458z;
    }

    /* renamed from: h */
    private final float m7382h(float f) {
        return this.f27457y ? f * (-1) : f;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ModifierLocalConsumer.C5989a.m22452a(this, interfaceC6108l);
    }

    /* renamed from: K */
    public void m7390K(InterfaceC5991e interfaceC5991e) {
        Intrinsics.isThisObjectNull(interfaceC5991e, "scope");
        this.f27458z = (BringIntoViewResponder) interfaceC5991e.mo22443t(BringIntoViewResponder.f34298v.m1270a());
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22450c(this, obj, interfaceC6112p);
    }

    /* renamed from: a */
    public Object m7389a(Rect rect, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C10657b(rect, m7385e(rect), null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: b */
    public Rect m7388b(Rect rect, InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(rect, "rect");
        Intrinsics.isThisObjectNull(interfaceC5776j, "layoutCoordinates");
        InterfaceC5776j interfaceC5776j2 = this.f27454C;
        if (interfaceC5776j2 == null) {
            Intrinsics.throwUninitPropException("layoutCoordinates");
            interfaceC5776j2 = null;
        }
        return rect.m7116o(interfaceC5776j2.mo23106c0(interfaceC5776j, false).m7121j());
    }

    /* renamed from: e */
    public final Rect m7385e(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "source");
        InterfaceC5776j interfaceC5776j = this.f27454C;
        if (interfaceC5776j == null) {
            Intrinsics.throwUninitPropException("layoutCoordinates");
            interfaceC5776j = null;
        }
        long m818b = C13617n.m818b(interfaceC5776j.mo23107b());
        int i = C10656a.f27459a[this.f27455w.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return rect.m7117n(C10660e0.m7376b(rect.m7125f(), rect.m7124g(), C10781l.m7091i(m818b)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return rect.m7117n(0.0f, C10660e0.m7376b(rect.m7122i(), rect.m7128c(), C10781l.m7093g(m818b)));
    }

    /* renamed from: f */
    public C10655e mo41263getValue() {
        return this.f27453B;
    }

    /* renamed from: g */
    public final Object m7383g(Rect rect, Rect rect2, InterfaceC1886d interfaceC1886d) {
        float m7122i;
        float m7122i2;
        Object m34636d;
        int i = C10656a.f27459a[this.f27455w.ordinal()];
        if (i == 1) {
            m7122i = rect.m7122i();
            m7122i2 = rect2.m7122i();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            m7122i = rect.m7125f();
            m7122i2 = rect2.m7125f();
        }
        Object m7399b = C10648b0.m7399b(this.f27456x, m7382h(m7122i - m7122i2), null, interfaceC1886d, 2, null);
        m34636d = C2116d.m34636d();
        return m7399b == m34636d ? m7399b : C13195u.f34156a;
    }

    public C5992f getKey() {
        return this.f27452A;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ModifierLocalConsumer.C5989a.m22451b(this, obj, interfaceC6112p);
    }

    /* renamed from: q */
    public void m7381q(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "coordinates");
        this.f27454C = interfaceC5776j;
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ModifierLocalConsumer.C5989a.m22449d(this, interfaceC9570f);
    }
}
