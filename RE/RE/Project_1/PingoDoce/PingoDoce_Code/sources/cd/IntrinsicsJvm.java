package cd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6762j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p468yc.C13186n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cd.c */
/* loaded from: classes2.dex */
public class IntrinsicsJvm {

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: cd.c$a */
    /* loaded from: classes2.dex */
    public static final class C2112a extends AbstractC6762j {

        /* renamed from: w */
        private int f6120w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f6121x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2112a(InterfaceC1886d interfaceC1886d, InterfaceC6108l interfaceC6108l) {
            super(interfaceC1886d);
            this.f6121x = interfaceC6108l;
            Intrinsics.m20929f(interfaceC1886d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        protected Object invokeSuspend(Object obj) {
            int i = this.f6120w;
            if (i == 0) {
                this.f6120w = 1;
                C13186n.m1453b(obj);
                Intrinsics.m20929f(this.f6121x, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
                return ((InterfaceC6108l) C6431d0.m20951d(this.f6121x, 1)).mo9587d(this);
            } else if (i == 1) {
                this.f6120w = 2;
                C13186n.m1453b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: cd.c$b */
    /* loaded from: classes2.dex */
    public static final class C2113b extends AbstractC6757d {

        /* renamed from: w */
        private int f6122w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f6123x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2113b(InterfaceC1886d interfaceC1886d, CoroutineContext coroutineContext, InterfaceC6108l interfaceC6108l) {
            super(interfaceC1886d, coroutineContext);
            this.f6123x = interfaceC6108l;
            Intrinsics.m20929f(interfaceC1886d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        protected Object invokeSuspend(Object obj) {
            int i = this.f6122w;
            if (i == 0) {
                this.f6122w = 1;
                C13186n.m1453b(obj);
                Intrinsics.m20929f(this.f6123x, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
                return ((InterfaceC6108l) C6431d0.m20951d(this.f6123x, 1)).mo9587d(this);
            } else if (i == 1) {
                this.f6122w = 2;
                C13186n.m1453b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: cd.c$c */
    /* loaded from: classes2.dex */
    public static final class C2114c extends AbstractC6762j {

        /* renamed from: w */
        private int f6124w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f6125x;

        /* renamed from: y */
        final /* synthetic */ Object f6126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2114c(InterfaceC1886d interfaceC1886d, InterfaceC6112p interfaceC6112p, Object obj) {
            super(interfaceC1886d);
            this.f6125x = interfaceC6112p;
            this.f6126y = obj;
            Intrinsics.m20929f(interfaceC1886d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        protected Object invokeSuspend(Object obj) {
            int i = this.f6124w;
            if (i == 0) {
                this.f6124w = 1;
                C13186n.m1453b(obj);
                Intrinsics.m20929f(this.f6125x, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((InterfaceC6112p) C6431d0.m20951d(this.f6125x, 2)).mo39856d(this.f6126y, this);
            } else if (i == 1) {
                this.f6124w = 2;
                C13186n.m1453b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: cd.c$d */
    /* loaded from: classes2.dex */
    public static final class C2115d extends AbstractC6757d {

        /* renamed from: w */
        private int f6127w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f6128x;

        /* renamed from: y */
        final /* synthetic */ Object f6129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2115d(InterfaceC1886d interfaceC1886d, CoroutineContext coroutineContext, InterfaceC6112p interfaceC6112p, Object obj) {
            super(interfaceC1886d, coroutineContext);
            this.f6128x = interfaceC6112p;
            this.f6129y = obj;
            Intrinsics.m20929f(interfaceC1886d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        protected Object invokeSuspend(Object obj) {
            int i = this.f6127w;
            if (i == 0) {
                this.f6127w = 1;
                C13186n.m1453b(obj);
                Intrinsics.m20929f(this.f6128x, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((InterfaceC6112p) C6431d0.m20951d(this.f6128x, 2)).mo39856d(this.f6129y, this);
            } else if (i == 1) {
                this.f6127w = 2;
                C13186n.m1453b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC1886d m34639a(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "<this>");
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        InterfaceC1886d m20188a = DebugProbes.m20188a(interfaceC1886d);
        if (interfaceC6108l instanceof ContinuationImpl) {
            return ((ContinuationImpl) interfaceC6108l).create(m20188a);
        }
        CoroutineContext context = m20188a.getContext();
        if (context == C1894h.f5621w) {
            return new C2112a(m20188a, interfaceC6108l);
        }
        return new C2113b(m20188a, context, interfaceC6108l);
    }

    /* renamed from: b */
    public static InterfaceC1886d m34638b(InterfaceC6112p interfaceC6112p, Object obj, InterfaceC1886d interfaceC1886d) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "<this>");
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        InterfaceC1886d m20188a = DebugProbes.m20188a(interfaceC1886d);
        if (interfaceC6112p instanceof ContinuationImpl) {
            return ((ContinuationImpl) interfaceC6112p).create(obj, m20188a);
        }
        CoroutineContext context = m20188a.getContext();
        if (context == C1894h.f5621w) {
            return new C2114c(m20188a, interfaceC6112p, obj);
        }
        return new C2115d(m20188a, context, interfaceC6112p, obj);
    }

    /* renamed from: c */
    public static InterfaceC1886d m34637c(InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d intercepted;
        Intrinsics.isThisObjectNull(interfaceC1886d, "<this>");
        AbstractC6757d abstractC6757d = interfaceC1886d instanceof AbstractC6757d ? (AbstractC6757d) interfaceC1886d : null;
        return (abstractC6757d == null || (intercepted = abstractC6757d.intercepted()) == null) ? interfaceC1886d : intercepted;
    }
}
