package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.C6436j;
import p424wd.C11637j;
import p468yc.C13186n;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6828p {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.p$a */
    /* loaded from: classes2.dex */
    public static final class C6829a implements InterfaceC6785c<R> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c[] f18246w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6114r f18247x;

        /* compiled from: Zip.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m20196f = "Zip.kt", m20195l = {333, 333}, m20194m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.p$a$a */
        /* loaded from: classes2.dex */
        public static final class C6830a extends AbstractC6764l implements InterfaceC6113q<InterfaceC6787d<? super R>, Object[], InterfaceC1886d<? super C13195u>, Object> {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6114r f18248A;

            /* renamed from: x */
            int f18249x;

            /* renamed from: y */
            private /* synthetic */ Object f18250y;

            /* renamed from: z */
            /* synthetic */ Object f18251z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6830a(InterfaceC1886d interfaceC1886d, InterfaceC6114r interfaceC6114r) {
                super(3, interfaceC1886d);
                this.f18248A = interfaceC6114r;
            }

            @Override // id.InterfaceC6113q
            /* renamed from: d */
            public final Object mo4533i(InterfaceC6787d<? super R> interfaceC6787d, Object[] objArr, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                C6830a c6830a = new C6830a(interfaceC1886d, this.f18248A);
                c6830a.f18250y = interfaceC6787d;
                c6830a.f18251z = objArr;
                return c6830a.invokeSuspend(C13195u.f34156a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                InterfaceC6787d interfaceC6787d;
                m34636d = C2116d.m34636d();
                int i = this.f18249x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    interfaceC6787d = (InterfaceC6787d) this.f18250y;
                    Object[] objArr = (Object[]) this.f18251z;
                    InterfaceC6114r interfaceC6114r = this.f18248A;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f18250y = interfaceC6787d;
                    this.f18249x = 1;
                    C6436j.m20935c(6);
                    obj = interfaceC6114r.mo22157a0(obj2, obj3, obj4, this);
                    C6436j.m20935c(7);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        C13186n.m1453b(obj);
                        return C13195u.f34156a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    interfaceC6787d = (InterfaceC6787d) this.f18250y;
                    C13186n.m1453b(obj);
                }
                this.f18250y = null;
                this.f18249x = 2;
                if (interfaceC6787d.mo4529a(obj, this) == m34636d) {
                    return m34636d;
                }
                return C13195u.f34156a;
            }
        }

        public C6829a(InterfaceC6785c[] interfaceC6785cArr, InterfaceC6114r interfaceC6114r) {
            this.f18246w = interfaceC6785cArr;
            this.f18247x = interfaceC6114r;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object m4550a = C11637j.m4550a(interfaceC6787d, this.f18246w, C6828p.m20088e(), new C6830a(null, this.f18247x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m4550a == m34636d ? m4550a : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.p$b */
    /* loaded from: classes2.dex */
    public static final class C6831b implements InterfaceC6785c<R> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18252w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6785c f18253x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6113q f18254y;

        public C6831b(InterfaceC6785c interfaceC6785c, InterfaceC6785c interfaceC6785c2, InterfaceC6113q interfaceC6113q) {
            this.f18252w = interfaceC6785c;
            this.f18253x = interfaceC6785c2;
            this.f18254y = interfaceC6113q;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d<? super R> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            Object m34636d;
            Object m4550a = C11637j.m4550a(interfaceC6787d, new InterfaceC6785c[]{this.f18252w, this.f18253x}, C6828p.m20088e(), new C6832c(this.f18254y, null), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m4550a == m34636d ? m4550a : C13195u.f34156a;
        }
    }

    /* compiled from: Zip.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m20196f = "Zip.kt", m20195l = {33, 33}, m20194m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.p$c */
    /* loaded from: classes2.dex */
    static final class C6832c extends AbstractC6764l implements InterfaceC6113q<InterfaceC6787d<? super R>, Object[], InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6113q<T1, T2, InterfaceC1886d<? super R>, Object> f18255A;

        /* renamed from: x */
        int f18256x;

        /* renamed from: y */
        private /* synthetic */ Object f18257y;

        /* renamed from: z */
        /* synthetic */ Object f18258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6832c(InterfaceC6113q<? super T1, ? super T2, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6113q, InterfaceC1886d<? super C6832c> interfaceC1886d) {
            super(3, interfaceC1886d);
            this.f18255A = interfaceC6113q;
        }

        @Override // id.InterfaceC6113q
        /* renamed from: d */
        public final Object mo4533i(InterfaceC6787d<? super R> interfaceC6787d, Object[] objArr, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            C6832c c6832c = new C6832c(this.f18255A, interfaceC1886d);
            c6832c.f18257y = interfaceC6787d;
            c6832c.f18258z = objArr;
            return c6832c.invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6787d interfaceC6787d;
            m34636d = C2116d.m34636d();
            int i = this.f18256x;
            if (i == 0) {
                C13186n.m1453b(obj);
                interfaceC6787d = (InterfaceC6787d) this.f18257y;
                Object[] objArr = (Object[]) this.f18258z;
                InterfaceC6113q<T1, T2, InterfaceC1886d<? super R>, Object> interfaceC6113q = this.f18255A;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f18257y = interfaceC6787d;
                this.f18256x = 1;
                obj = interfaceC6113q.mo4533i(obj2, obj3, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                interfaceC6787d = (InterfaceC6787d) this.f18257y;
                C13186n.m1453b(obj);
            }
            this.f18257y = null;
            this.f18256x = 2;
            if (interfaceC6787d.mo4529a(obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Zip.kt */
    /* renamed from: kotlinx.coroutines.flow.p$d */
    /* loaded from: classes2.dex */
    public static final class C6833d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6833d f18259w = new C6833d();

        C6833d() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final Void mo42214q() {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T1, T2, R> InterfaceC6785c<R> m20091b(InterfaceC6785c<? extends T1> interfaceC6785c, InterfaceC6785c<? extends T2> interfaceC6785c2, InterfaceC6113q<? super T1, ? super T2, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6113q) {
        return C6788e.m20127u(interfaceC6785c, interfaceC6785c2, interfaceC6113q);
    }

    /* renamed from: c */
    public static final <T1, T2, T3, R> InterfaceC6785c<R> m20090c(InterfaceC6785c<? extends T1> interfaceC6785c, InterfaceC6785c<? extends T2> interfaceC6785c2, InterfaceC6785c<? extends T3> interfaceC6785c3, InterfaceC6114r<? super T1, ? super T2, ? super T3, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6114r) {
        return new C6829a(new InterfaceC6785c[]{interfaceC6785c, interfaceC6785c2, interfaceC6785c3}, interfaceC6114r);
    }

    /* renamed from: d */
    public static final <T1, T2, R> InterfaceC6785c<R> m20089d(InterfaceC6785c<? extends T1> interfaceC6785c, InterfaceC6785c<? extends T2> interfaceC6785c2, InterfaceC6113q<? super T1, ? super T2, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6113q) {
        return new C6831b(interfaceC6785c, interfaceC6785c2, interfaceC6113q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final <T> InterfaceC6097a<T[]> m20088e() {
        return C6833d.f18259w;
    }
}
