package be;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.C10565r0;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: be.a */
/* loaded from: classes2.dex */
public final class OperatorExtensions {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorExtensions.kt */
    /* renamed from: be.a$a */
    /* loaded from: classes2.dex */
    public static final class C1896a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C6449y f5624w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10524i0 f5625x;

        /* renamed from: y */
        final /* synthetic */ long f5626y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f5627z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorExtensions.kt */
        @InterfaceC6759f(m20197c = "module.common.extensions.OperatorExtensionsKt$debounce$1$1", m20196f = "OperatorExtensions.kt", m20195l = {49}, m20194m = "invokeSuspend")
        /* renamed from: be.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C1897a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ Object f5628A;

            /* renamed from: x */
            int f5629x;

            /* renamed from: y */
            final /* synthetic */ long f5630y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC6108l f5631z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1897a(long j, InterfaceC6108l interfaceC6108l, Object obj, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f5630y = j;
                this.f5631z = interfaceC6108l;
                this.f5628A = obj;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C1897a(this.f5630y, this.f5631z, this.f5628A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C1897a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f5629x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    long j = this.f5630y;
                    this.f5629x = 1;
                    if (C10565r0.m7677a(j, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f5631z.mo9587d(this.f5628A);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1896a(C6449y c6449y, InterfaceC10524i0 interfaceC10524i0, long j, InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f5624w = c6449y;
            this.f5625x = interfaceC10524i0;
            this.f5626y = j;
            this.f5627z = interfaceC6108l;
        }

        /* JADX WARN: Type inference failed for: r12v1, types: [T, td.t1] */
        /* renamed from: a */
        public final void m35175a(Object obj) {
            ?? m20158d;
            InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) this.f5624w.f17533w;
            if (interfaceC10574t1 != null) {
                InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
            }
            C6449y c6449y = this.f5624w;
            m20158d = C6772d.m20158d(this.f5625x, null, null, new C1897a(this.f5626y, this.f5627z, obj, null), 3, null);
            c6449y.f17533w = m20158d;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35175a(obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorExtensions.kt */
    /* renamed from: be.a$b */
    /* loaded from: classes2.dex */
    public static final class C1898b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C6449y f5632w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10524i0 f5633x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l f5634y;

        /* renamed from: z */
        final /* synthetic */ long f5635z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorExtensions.kt */
        @InterfaceC6759f(m20197c = "module.common.extensions.OperatorExtensionsKt$throttleFirst$1$1", m20196f = "OperatorExtensions.kt", m20195l = {18}, m20194m = "invokeSuspend")
        /* renamed from: be.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C1899a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ long f5636A;

            /* renamed from: x */
            int f5637x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6108l f5638y;

            /* renamed from: z */
            final /* synthetic */ Object f5639z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1899a(InterfaceC6108l interfaceC6108l, Object obj, long j, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f5638y = interfaceC6108l;
                this.f5639z = obj;
                this.f5636A = j;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C1899a(this.f5638y, this.f5639z, this.f5636A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C1899a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f5637x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f5638y.mo9587d(this.f5639z);
                    long j = this.f5636A;
                    this.f5637x = 1;
                    if (C10565r0.m7677a(j, this) == m34636d) {
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
        C1898b(C6449y c6449y, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l, long j) {
            super(1);
            this.f5632w = c6449y;
            this.f5633x = interfaceC10524i0;
            this.f5634y = interfaceC6108l;
            this.f5635z = j;
        }

        /* JADX WARN: Type inference failed for: r12v1, types: [T, td.t1] */
        /* renamed from: a */
        public final void m35173a(Object obj) {
            ?? m20158d;
            InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) this.f5632w.f17533w;
            boolean z = false;
            if (interfaceC10574t1 != null && !interfaceC10574t1.mo7657j0()) {
                z = true;
            }
            if (z) {
                return;
            }
            C6449y c6449y = this.f5632w;
            m20158d = C6772d.m20158d(this.f5633x, null, null, new C1899a(this.f5634y, obj, this.f5635z, null), 3, null);
            c6449y.f17533w = m20158d;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35173a(obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC6108l m35180a(long j, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        Intrinsics.isThisObjectNull(interfaceC6108l, "action");
        return new C1896a(new C6449y(), interfaceC10524i0, j, interfaceC6108l);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6108l m35179b(long j, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 700;
        }
        if ((i & 2) != 0) {
            interfaceC10524i0 = C10531j0.m7771a(C10587w0.m7619c());
        }
        return m35180a(j, interfaceC10524i0, interfaceC6108l);
    }

    /* renamed from: c */
    public static final InterfaceC6108l m35178c(InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        Intrinsics.isThisObjectNull(interfaceC6108l, "clickAction");
        return m35177d(1000L, interfaceC10524i0, interfaceC6108l);
    }

    /* renamed from: d */
    public static final InterfaceC6108l m35177d(long j, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        Intrinsics.isThisObjectNull(interfaceC6108l, "action");
        return new C1898b(new C6449y(), interfaceC10524i0, interfaceC6108l, j);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC6108l m35176e(long j, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 700;
        }
        if ((i & 2) != 0) {
            interfaceC10524i0 = C10531j0.m7771a(C10587w0.m7619c());
        }
        return m35177d(j, interfaceC10524i0, interfaceC6108l);
    }
}
