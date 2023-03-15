package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p092f0.MonotonicFrameClock;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10565r0;
import td.C10587w0;
import td.InterfaceC10524i0;

/* compiled from: ActualAndroid.android.kt */
/* renamed from: f0.b1 */
/* loaded from: classes.dex */
final class C5155b1 implements MonotonicFrameClock {

    /* renamed from: w */
    public static final C5155b1 f14240w = new C5155b1();

    /* compiled from: ActualAndroid.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", m20196f = "ActualAndroid.android.kt", m20195l = {51}, m20194m = "invokeSuspend")
    /* renamed from: f0.b1$a */
    /* loaded from: classes.dex */
    static final class C5156a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super R>, Object> {

        /* renamed from: x */
        int f14241x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l<Long, R> f14242y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C5156a(InterfaceC6108l<? super Long, ? extends R> interfaceC6108l, InterfaceC1886d<? super C5156a> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14242y = interfaceC6108l;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            return new C5156a(this.f14242y, interfaceC1886d);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super R> interfaceC1886d) {
            return ((C5156a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14241x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f14241x = 1;
                if (C10565r0.m7677a(16L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return this.f14242y.mo9587d(C6755b.m20198d(System.nanoTime()));
        }
    }

    private C5155b1() {
    }

    @Override // p092f0.MonotonicFrameClock
    /* renamed from: F */
    public <R> Object mo24912F(InterfaceC6108l<? super Long, ? extends R> interfaceC6108l, InterfaceC1886d<? super R> interfaceC1886d) {
        return C6769b.m20164g(C10587w0.m7619c(), new C5156a(interfaceC6108l, null), interfaceC1886d);
    }

    @Override // bd.CoroutineContext
    /* renamed from: M */
    public <R> R mo4547M(R r, InterfaceC6112p<? super R, ? super CoroutineContext.InterfaceC1891b, ? extends R> interfaceC6112p) {
        return (R) MonotonicFrameClock.C5214a.m25018a(this, r, interfaceC6112p);
    }

    @Override // bd.CoroutineContext.InterfaceC1891b, bd.CoroutineContext
    /* renamed from: c */
    public <E extends CoroutineContext.InterfaceC1891b> E mo4546c(CoroutineContext.InterfaceC1893c<E> interfaceC1893c) {
        return (E) MonotonicFrameClock.C5214a.m25017b(this, interfaceC1893c);
    }

    @Override // bd.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.C5214a.m25014e(this, coroutineContext);
    }

    @Override // bd.CoroutineContext.InterfaceC1891b
    public CoroutineContext.InterfaceC1893c<?> getKey() {
        return MonotonicFrameClock.C5214a.m25016c(this);
    }

    @Override // bd.CoroutineContext
    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c<?> interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25015d(this, interfaceC1893c);
    }
}
