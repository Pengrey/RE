package td;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: td.p1 */
/* loaded from: classes2.dex */
public final class C10556p1 {

    /* compiled from: Interruptible.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m20196f = "Interruptible.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: td.p1$a */
    /* loaded from: classes2.dex */
    public static final class C10557a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super T>, Object> {

        /* renamed from: x */
        int f27269x;

        /* renamed from: y */
        private /* synthetic */ Object f27270y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6097a<T> f27271z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10557a(InterfaceC6097a<? extends T> interfaceC6097a, InterfaceC1886d<? super C10557a> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27271z = interfaceC6097a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C10557a c10557a = new C10557a(this.f27271z, interfaceC1886d);
            c10557a.f27270y = obj;
            return c10557a;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super T> interfaceC1886d) {
            return ((C10557a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27269x == 0) {
                C13186n.m1453b(obj);
                return C10556p1.m7687d(((InterfaceC10524i0) this.f27270y).mo7716y(), this.f27271z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public static final <T> Object m7689b(CoroutineContext coroutineContext, InterfaceC6097a<? extends T> interfaceC6097a, InterfaceC1886d<? super T> interfaceC1886d) {
        return C6769b.m20164g(coroutineContext, new C10557a(interfaceC6097a, null), interfaceC1886d);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m7688c(CoroutineContext coroutineContext, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        return m7689b(coroutineContext, interfaceC6097a, interfaceC1886d);
    }

    /* renamed from: d */
    public static final <T> T m7687d(CoroutineContext coroutineContext, InterfaceC6097a<? extends T> interfaceC6097a) {
        try {
            C10571s2 c10571s2 = new C10571s2(C10588w1.m7607l(coroutineContext));
            c10571s2.m7668d();
            T mo42214q = interfaceC6097a.mo42214q();
            c10571s2.m7671a();
            return mo42214q;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
