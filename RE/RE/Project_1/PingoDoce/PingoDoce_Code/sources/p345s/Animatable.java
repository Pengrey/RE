package p345s;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p181jd.AbstractC6438m;
import p181jd.C6445u;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p345s.AbstractC9976o;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class Animatable<T, V extends AbstractC9976o> {

    /* renamed from: a */
    private final InterfaceC9980q0 f26005a;

    /* renamed from: b */
    private final Object f26006b;

    /* renamed from: c */
    private final C9954j f26007c;

    /* renamed from: d */
    private final InterfaceC5220m0 f26008d;

    /* renamed from: e */
    private final InterfaceC5220m0 f26009e;

    /* renamed from: f */
    private final InternalMutatorMutex f26010f;

    /* renamed from: g */
    private final C9965m0 f26011g;

    /* renamed from: h */
    private final AbstractC9976o f26012h;

    /* renamed from: i */
    private final AbstractC9976o f26013i;

    /* renamed from: j */
    private AbstractC9976o f26014j;

    /* renamed from: k */
    private AbstractC9976o f26015k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Animatable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.animation.core.Animatable$runAnimation$2", m20196f = "Animatable.kt", m20195l = {291}, m20194m = "invokeSuspend")
    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    public static final class C9933a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: B */
        final /* synthetic */ Object f26017B;

        /* renamed from: C */
        final /* synthetic */ Animation f26018C;

        /* renamed from: D */
        final /* synthetic */ long f26019D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6108l f26020E;

        /* renamed from: x */
        Object f26021x;

        /* renamed from: y */
        Object f26022y;

        /* renamed from: z */
        int f26023z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Animatable.kt */
        /* renamed from: s.a$a$a */
        /* loaded from: classes.dex */
        public static final class C9934a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ Animatable f26024w;

            /* renamed from: x */
            final /* synthetic */ C9954j f26025x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6108l f26026y;

            /* renamed from: z */
            final /* synthetic */ C6445u f26027z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9934a(Animatable animatable, C9954j c9954j, InterfaceC6108l interfaceC6108l, C6445u c6445u) {
                super(1);
                this.f26024w = animatable;
                this.f26025x = c9954j;
                this.f26026y = interfaceC6108l;
                this.f26027z = c6445u;
            }

            /* renamed from: a */
            public final void m9635a(AnimationState animationState) {
                Intrinsics.isThisObjectNull(animationState, "$this$animate");
                SuspendAnimation.m9495k(animationState, this.f26024w.m9647l());
                Object m9658a = Animatable.m9658a(this.f26024w, animationState.m9582e());
                if (!Intrinsics.equals(m9658a, animationState.m9582e())) {
                    this.f26024w.m9647l().m9546l(m9658a);
                    this.f26025x.m9546l(m9658a);
                    InterfaceC6108l interfaceC6108l = this.f26026y;
                    if (interfaceC6108l != null) {
                        interfaceC6108l.mo9587d(this.f26024w);
                    }
                    animationState.m9586a();
                    this.f26027z.f17529w = true;
                    return;
                }
                InterfaceC6108l interfaceC6108l2 = this.f26026y;
                if (interfaceC6108l2 == null) {
                    return;
                }
                interfaceC6108l2.mo9587d(this.f26024w);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m9635a((AnimationState) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9933a(Object obj, Animation animation, long j, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f26017B = obj;
            this.f26018C = animation;
            this.f26019D = j;
            this.f26020E = interfaceC6108l;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C9933a(this.f26017B, this.f26018C, this.f26019D, this.f26020E, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C9933a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            C9954j c9954j;
            C6445u c6445u;
            m34636d = C2116d.m34636d();
            int i = this.f26023z;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Animatable.this.m9647l().m9545m(Animatable.this.m9645n().mo9468a().mo9587d((T) this.f26017B));
                    Animatable.m9655d(Animatable.this, this.f26018C.m9613e());
                    Animatable.m9656c(Animatable.this, true);
                    C9954j m9528d = C9960k.m9528d(Animatable.this.m9647l(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    C6445u c6445u2 = new C6445u();
                    Animation animation = this.f26018C;
                    long j = this.f26019D;
                    C9934a c9934a = new C9934a(Animatable.this, m9528d, this.f26020E, c6445u2);
                    this.f26021x = m9528d;
                    this.f26022y = c6445u2;
                    this.f26023z = 1;
                    if (SuspendAnimation.m9503c(m9528d, animation, j, c9934a, this) == m34636d) {
                        return m34636d;
                    }
                    c9954j = m9528d;
                    c6445u = c6445u2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c6445u = (C6445u) this.f26022y;
                    c9954j = (C9954j) this.f26021x;
                    C13186n.m1453b(obj);
                }
                EnumC9942d enumC9942d = c6445u.f17529w ? EnumC9942d.BoundReached : EnumC9942d.Finished;
                Animatable.m9657b(Animatable.this);
                return new C9946f(c9954j, enumC9942d);
            } catch (CancellationException e) {
                Animatable.m9657b(Animatable.this);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Animatable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.animation.core.Animatable$snapTo$2", m20196f = "Animatable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: s.a$b */
    /* loaded from: classes.dex */
    public static final class C9935b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f26028x;

        /* renamed from: z */
        final /* synthetic */ Object f26030z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9935b(Object obj, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f26030z = obj;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C9935b(this.f26030z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C9935b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f26028x == 0) {
                C13186n.m1453b(obj);
                Animatable.m9657b(Animatable.this);
                Object m9658a = Animatable.m9658a(Animatable.this, this.f26030z);
                Animatable.this.m9647l().m9546l(m9658a);
                Animatable.m9655d(Animatable.this, m9658a);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Animatable(Object obj, InterfaceC9980q0 interfaceC9980q0, Object obj2) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        this.f26005a = interfaceC9980q0;
        this.f26006b = obj2;
        this.f26007c = new C9954j(interfaceC9980q0, obj, null, 0L, 0L, false, 60, null);
        m24962d = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
        this.f26008d = m24962d;
        m24962d2 = C5232o1.m24962d(obj, null, 2, null);
        this.f26009e = m24962d2;
        this.f26010f = new InternalMutatorMutex();
        this.f26011g = new C9965m0(0.0f, 0.0f, obj2, 3, null);
        AbstractC9976o m9650i = m9650i(obj, Float.NEGATIVE_INFINITY);
        this.f26012h = m9650i;
        AbstractC9976o m9650i2 = m9650i(obj, Float.POSITIVE_INFINITY);
        this.f26013i = m9650i2;
        this.f26014j = m9650i;
        this.f26015k = m9650i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m9658a(Animatable animatable, Object obj) {
        return animatable.m9651h(obj);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m9657b(Animatable animatable) {
        animatable.m9649j();
    }

    /* renamed from: c */
    public static final /* synthetic */ void m9656c(Animatable animatable, boolean z) {
        animatable.m9639t(z);
    }

    /* renamed from: d */
    public static final /* synthetic */ void m9655d(Animatable animatable, Object obj) {
        animatable.m9638u(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m9653f(Animatable animatable, Object obj, InterfaceC9950h interfaceC9950h, Object obj2, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d, int i, Object obj3) {
        if ((i & 2) != 0) {
            interfaceC9950h = animatable.m9648k();
        }
        InterfaceC9950h interfaceC9950h2 = interfaceC9950h;
        if ((i & 4) != 0) {
            obj2 = animatable.m9643p();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            interfaceC6108l = null;
        }
        return animatable.m9654e(obj, interfaceC9950h2, obj4, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: h */
    private final Object m9651h(Object obj) {
        float m14997l;
        if (Intrinsics.equals(this.f26014j, this.f26012h) && Intrinsics.equals(this.f26015k, this.f26013i)) {
            return obj;
        }
        V mo9587d = this.f26005a.mo9468a().mo9587d(obj);
        int mo9485b = mo9587d.mo9485b();
        int i = 0;
        boolean z = false;
        while (i < mo9485b) {
            int i2 = i + 1;
            if (mo9587d.mo9486a(i) < this.f26014j.mo9486a(i) || mo9587d.mo9486a(i) > this.f26015k.mo9486a(i)) {
                m14997l = _Ranges.m14997l(mo9587d.mo9486a(i), this.f26014j.mo9486a(i), this.f26015k.mo9486a(i));
                mo9587d.mo9482e(i, m14997l);
                z = true;
            }
            i = i2;
        }
        return z ? this.f26005a.mo9467b().mo9587d(mo9587d) : obj;
    }

    /* renamed from: i */
    private final AbstractC9976o m9650i(Object obj, float f) {
        V mo9587d = this.f26005a.mo9468a().mo9587d(obj);
        int mo9485b = mo9587d.mo9485b();
        for (int i = 0; i < mo9485b; i++) {
            mo9587d.mo9482e(i, f);
        }
        return mo9587d;
    }

    /* renamed from: j */
    private final void m9649j() {
        C9954j c9954j = this.f26007c;
        c9954j.m9551g().mo9483d();
        c9954j.m9548j(Long.MIN_VALUE);
        m9639t(false);
    }

    /* renamed from: s */
    private final Object m9640s(Animation animation, Object obj, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return InternalMutatorMutex.m9559e(this.f26010f, null, new C9933a(obj, animation, m9647l().m9553e(), interfaceC6108l, null), interfaceC1886d, 1, null);
    }

    /* renamed from: t */
    private final void m9639t(boolean z) {
        this.f26008d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: u */
    private final void m9638u(Object obj) {
        this.f26009e.setValue(obj);
    }

    /* renamed from: e */
    public final Object m9654e(Object obj, InterfaceC9950h interfaceC9950h, Object obj2, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return m9640s(C9944e.m9596a(interfaceC9950h, m9645n(), m9644o(), obj, obj2), obj2, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: g */
    public final InterfaceC5242r1 m9652g() {
        return this.f26007c;
    }

    /* renamed from: k */
    public final C9965m0 m9648k() {
        return this.f26011g;
    }

    /* renamed from: l */
    public final C9954j m9647l() {
        return this.f26007c;
    }

    /* renamed from: m */
    public final Object m9646m() {
        return this.f26009e.getValue();
    }

    /* renamed from: n */
    public final InterfaceC9980q0 m9645n() {
        return this.f26005a;
    }

    /* renamed from: o */
    public final Object m9644o() {
        return this.f26007c.getValue();
    }

    /* renamed from: p */
    public final Object m9643p() {
        return this.f26005a.mo9467b().mo9587d((V) m9642q());
    }

    /* renamed from: q */
    public final AbstractC9976o m9642q() {
        return this.f26007c.m9551g();
    }

    /* renamed from: r */
    public final boolean m9641r() {
        return ((Boolean) this.f26008d.getValue()).booleanValue();
    }

    /* renamed from: v */
    public final Object m9637v(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m9559e = InternalMutatorMutex.m9559e(this.f26010f, null, new C9935b(obj, null), interfaceC1886d, 1, null);
        m34636d = C2116d.m34636d();
        return m9559e == m34636d ? m9559e : C13195u.f34156a;
    }

    public /* synthetic */ Animatable(Object obj, InterfaceC9980q0 interfaceC9980q0, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC9980q0, (i & 4) != 0 ? null : obj2);
    }
}
