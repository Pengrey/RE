package p424wd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6787d;
import kotlinx.coroutines.internal.C6881l0;
import p468yc.C13186n;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wd.x */
/* loaded from: classes2.dex */
public final class C11659x<T> implements InterfaceC6787d<T> {

    /* renamed from: w */
    private final CoroutineContext f29796w;

    /* renamed from: x */
    private final Object f29797x;

    /* renamed from: y */
    private final InterfaceC6112p<T, InterfaceC1886d<? super C13195u>, Object> f29798y;

    /* compiled from: ChannelFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m20196f = "ChannelFlow.kt", m20195l = {212}, m20194m = "invokeSuspend")
    /* renamed from: wd.x$a */
    /* loaded from: classes2.dex */
    static final class C11660a extends AbstractC6764l implements InterfaceC6112p<T, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: x */
        int f29799x;

        /* renamed from: y */
        /* synthetic */ Object f29800y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6787d<T> f29801z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11660a(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C11660a> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29801z = interfaceC6787d;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C11660a c11660a = new C11660a(this.f29801z, interfaceC1886d);
            c11660a.f29800y = obj;
            return c11660a;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C11660a) create(t, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29799x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Object obj2 = this.f29800y;
                this.f29799x = 1;
                if (this.f29801z.mo4529a(obj2, this) == m34636d) {
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

    public C11659x(InterfaceC6787d<? super T> interfaceC6787d, CoroutineContext coroutineContext) {
        this.f29796w = coroutineContext;
        this.f29797x = C6881l0.m19923b(coroutineContext);
        this.f29798y = new C11660a(interfaceC6787d, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6787d
    /* renamed from: a */
    public Object mo4529a(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object m4569b = C11624e.m4569b(this.f29796w, t, this.f29797x, this.f29798y, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m4569b == m34636d ? m4569b : C13195u.f34156a;
    }
}
