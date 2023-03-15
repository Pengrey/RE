package p345s;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.C5217l0;
import p181jd.AbstractC6438m;
import p181jd.C6432f;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: s.n0 */
/* loaded from: classes.dex */
public final class SuspendAnimation {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$a */
    /* loaded from: classes.dex */
    public static final class C9967a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f26110w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9980q0 f26111x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9967a(InterfaceC6112p interfaceC6112p, InterfaceC9980q0 interfaceC9980q0) {
            super(1);
            this.f26110w = interfaceC6112p;
            this.f26111x = interfaceC9980q0;
        }

        /* renamed from: a */
        public final void m9494a(AnimationState animationState) {
            Intrinsics.isThisObjectNull(animationState, "$this$animate");
            this.f26110w.mo39856d(animationState.m9582e(), this.f26111x.mo9467b().mo9587d(animationState.m9580g()));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9494a((AnimationState) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.animation.core.SuspendAnimationKt", m20196f = "SuspendAnimation.kt", m20195l = {229, 261}, m20194m = "animate")
    /* renamed from: s.n0$b */
    /* loaded from: classes.dex */
    public static final class C9968b<T, V extends AbstractC9976o> extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f26112A;

        /* renamed from: B */
        int f26113B;

        /* renamed from: w */
        Object f26114w;

        /* renamed from: x */
        Object f26115x;

        /* renamed from: y */
        Object f26116y;

        /* renamed from: z */
        Object f26117z;

        C9968b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f26112A = obj;
            this.f26113B |= Integer.MIN_VALUE;
            return SuspendAnimation.m9503c(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$c */
    /* loaded from: classes.dex */
    public static final class C9969c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C9969c f26118w = new C9969c();

        C9969c() {
            super(1);
        }

        /* renamed from: a */
        public final void m9493a(AnimationState animationState) {
            Intrinsics.isThisObjectNull(animationState, "$this$null");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9493a((AnimationState) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$d */
    /* loaded from: classes.dex */
    public static final class C9970d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ C9954j f26119A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6108l f26120B;

        /* renamed from: w */
        final /* synthetic */ C6449y f26121w;

        /* renamed from: x */
        final /* synthetic */ Object f26122x;

        /* renamed from: y */
        final /* synthetic */ Animation f26123y;

        /* renamed from: z */
        final /* synthetic */ AbstractC9976o f26124z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendAnimation.kt */
        /* renamed from: s.n0$d$a */
        /* loaded from: classes.dex */
        public static final class C9971a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ C9954j f26125w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9971a(C9954j c9954j) {
                super(0);
                this.f26125w = c9954j;
            }

            /* renamed from: a */
            public final void m9491a() {
                this.f26125w.m9547k(false);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m9491a();
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9970d(C6449y c6449y, Object obj, Animation animation, AbstractC9976o abstractC9976o, C9954j c9954j, InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26121w = c6449y;
            this.f26122x = obj;
            this.f26123y = animation;
            this.f26124z = abstractC9976o;
            this.f26119A = c9954j;
            this.f26120B = interfaceC6108l;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, s.g] */
        /* renamed from: a */
        public final void m9492a(long j) {
            C6449y c6449y = this.f26121w;
            ?? animationState = new AnimationState(this.f26122x, this.f26123y.m9614d(), this.f26124z, j, this.f26123y.m9613e(), j, true, new C9971a(this.f26119A));
            SuspendAnimation.m9505a(animationState, j, this.f26123y, this.f26119A, this.f26120B);
            c6449y.f17533w = animationState;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9492a(((Number) obj).longValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$e */
    /* loaded from: classes.dex */
    public static final class C9972e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ C9954j f26126w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9972e(C9954j c9954j) {
            super(0);
            this.f26126w = c9954j;
        }

        /* renamed from: a */
        public final void m9490a() {
            this.f26126w.m9547k(false);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m9490a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$f */
    /* loaded from: classes.dex */
    public static final class C9973f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C6449y f26127w;

        /* renamed from: x */
        final /* synthetic */ Animation f26128x;

        /* renamed from: y */
        final /* synthetic */ C9954j f26129y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f26130z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9973f(C6449y c6449y, Animation animation, C9954j c9954j, InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26127w = c6449y;
            this.f26128x = animation;
            this.f26129y = c9954j;
            this.f26130z = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m9489a(long j) {
            T t = this.f26127w.f17533w;
            Intrinsics.ifNullDoSomething(t);
            SuspendAnimation.m9505a((AnimationState) t, j, this.f26128x, this.f26129y, this.f26130z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9489a(((Number) obj).longValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$g */
    /* loaded from: classes.dex */
    public static final class C9974g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C9974g f26131w = new C9974g();

        C9974g() {
            super(1);
        }

        /* renamed from: a */
        public final void m9488a(AnimationState animationState) {
            Intrinsics.isThisObjectNull(animationState, "$this$null");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9488a((AnimationState) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* renamed from: s.n0$h */
    /* loaded from: classes.dex */
    public static final class C9975h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26132w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9975h(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26132w = interfaceC6108l;
        }

        /* renamed from: a */
        public final Object m9487a(long j) {
            return this.f26132w.mo9587d(Long.valueOf(j / 1));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m9487a(((Number) obj).longValue());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m9505a(AnimationState animationState, long j, Animation animation, C9954j c9954j, InterfaceC6108l interfaceC6108l) {
        m9496j(animationState, j, animation, c9954j, interfaceC6108l);
    }

    /* renamed from: b */
    public static final Object m9504b(float f, float f2, float f3, InterfaceC9950h interfaceC9950h, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m9502d = m9502d(C9983s0.m9455b(C6432f.f17524a), C6755b.m20200b(f), C6755b.m20200b(f2), C6755b.m20200b(f3), interfaceC9950h, interfaceC6112p, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m9502d == m34636d ? m9502d : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0061, blocks: (B:16:0x005a, B:35:0x00d8, B:37:0x00e5), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, s.g] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m9503c(p345s.C9954j r24, p345s.Animation r25, long r26, id.InterfaceC6108l r28, bd.InterfaceC1886d r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345s.SuspendAnimation.m9503c(s.j, s.c, long, id.l, bd.d):java.lang.Object");
    }

    /* renamed from: d */
    public static final Object m9502d(InterfaceC9980q0 interfaceC9980q0, Object obj, Object obj2, Object obj3, InterfaceC9950h interfaceC9950h, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        AbstractC9976o abstractC9976o = obj3 == null ? null : (AbstractC9976o) interfaceC9980q0.mo9468a().mo9587d(obj3);
        if (abstractC9976o == null) {
            abstractC9976o = AnimationVectors.m9471d((AbstractC9976o) interfaceC9980q0.mo9468a().mo9587d(obj));
        }
        Object m9500f = m9500f(new C9954j(interfaceC9980q0, obj, abstractC9976o, 0L, 0L, false, 56, null), new C9977o0(interfaceC9950h, interfaceC9980q0, obj, obj2, abstractC9976o), 0L, new C9967a(interfaceC6112p, interfaceC9980q0), interfaceC1886d, 2, null);
        m34636d = C2116d.m34636d();
        return m9500f == m34636d ? m9500f : C13195u.f34156a;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m9501e(float f, float f2, float f3, InterfaceC9950h interfaceC9950h, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            interfaceC9950h = AnimationSpec.m9566d(0.0f, 0.0f, null, 7, null);
        }
        return m9504b(f, f2, f4, interfaceC9950h, interfaceC6112p, interfaceC1886d);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m9500f(C9954j c9954j, Animation animation, long j, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            interfaceC6108l = C9969c.f26118w;
        }
        return m9503c(c9954j, animation, j2, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: g */
    public static final Object m9499g(C9954j c9954j, InterfaceC10009v interfaceC10009v, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m9503c = m9503c(c9954j, new C10005u(interfaceC10009v, c9954j.m9552f(), c9954j.getValue(), c9954j.m9551g()), z ? c9954j.m9553e() : Long.MIN_VALUE, interfaceC6108l, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m9503c == m34636d ? m9503c : C13195u.f34156a;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m9498h(C9954j c9954j, InterfaceC10009v interfaceC10009v, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            interfaceC6108l = C9974g.f26131w;
        }
        return m9499g(c9954j, interfaceC10009v, z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: i */
    private static final Object m9497i(Animation animation, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        if (animation.m9617a()) {
            return C9947f0.m9588a(interfaceC6108l, interfaceC1886d);
        }
        return C5217l0.m25004b(new C9975h(interfaceC6108l), interfaceC1886d);
    }

    /* renamed from: j */
    private static final void m9496j(AnimationState animationState, long j, Animation animation, C9954j c9954j, InterfaceC6108l interfaceC6108l) {
        animationState.m9577j(j);
        long m9583d = j - animationState.m9583d();
        animationState.m9575l(animation.m9616b(m9583d));
        animationState.m9574m(animation.m9612f(m9583d));
        if (animation.m9611g(m9583d)) {
            animationState.m9578i(animationState.m9584c());
            animationState.m9576k(false);
        }
        m9495k(animationState, c9954j);
        interfaceC6108l.mo9587d(animationState);
    }

    /* renamed from: k */
    public static final void m9495k(AnimationState animationState, C9954j c9954j) {
        Intrinsics.isThisObjectNull(animationState, "<this>");
        Intrinsics.isThisObjectNull(c9954j, "state");
        c9954j.m9546l(animationState.m9582e());
        AnimationVectors.m9472c(c9954j.m9551g(), animationState.m9580g());
        c9954j.m9549i(animationState.m9585b());
        c9954j.m9548j(animationState.m9584c());
        c9954j.m9547k(animationState.m9579h());
    }
}
