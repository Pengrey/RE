package p092f0;

import android.view.Choreographer;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p092f0.MonotonicFrameClock;
import p181jd.AbstractC6438m;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10534k;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10529j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActualAndroid.android.kt */
/* renamed from: f0.t */
/* loaded from: classes.dex */
public final class C5246t implements MonotonicFrameClock {

    /* renamed from: w */
    public static final C5246t f14511w = new C5246t();

    /* renamed from: x */
    private static final Choreographer f14512x = (Choreographer) C6769b.m20166e(C10587w0.m7619c().mo7830H0(), new C5247a(null));

    /* compiled from: ActualAndroid.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", m20196f = "ActualAndroid.android.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: f0.t$a */
    /* loaded from: classes.dex */
    static final class C5247a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super Choreographer>, Object> {

        /* renamed from: x */
        int f14513x;

        C5247a(InterfaceC1886d<? super C5247a> interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            return new C5247a(interfaceC1886d);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super Choreographer> interfaceC1886d) {
            return ((C5247a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f14513x == 0) {
                C13186n.m1453b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* renamed from: f0.t$b */
    /* loaded from: classes.dex */
    static final class C5248b extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

        /* renamed from: w */
        final /* synthetic */ Choreographer.FrameCallback f14514w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5248b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14514w = frameCallback;
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            invoke2(th2);
            return C13195u.f34156a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C5246t.f14512x.removeFrameCallback(this.f14514w);
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* renamed from: f0.t$c */
    /* loaded from: classes.dex */
    static final class Choreographer$FrameCallbackC5249c implements Choreographer.FrameCallback {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10529j<R> f14515w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l<Long, R> f14516x;

        /* JADX WARN: Multi-variable type inference failed */
        Choreographer$FrameCallbackC5249c(InterfaceC10529j<? super R> interfaceC10529j, InterfaceC6108l<? super Long, ? extends R> interfaceC6108l) {
            this.f14515w = interfaceC10529j;
            this.f14516x = interfaceC6108l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object m1458a;
            InterfaceC1886d interfaceC1886d = this.f14515w;
            C5246t c5246t = C5246t.f14511w;
            InterfaceC6108l<Long, R> interfaceC6108l = this.f14516x;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m1458a = C13183m.m1458a(interfaceC6108l.mo9587d(Long.valueOf(j)));
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            interfaceC1886d.resumeWith(m1458a);
        }
    }

    private C5246t() {
    }

    @Override // p092f0.MonotonicFrameClock
    /* renamed from: F */
    public <R> Object mo24912F(InterfaceC6108l<? super Long, ? extends R> interfaceC6108l, InterfaceC1886d<? super R> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        Choreographer$FrameCallbackC5249c choreographer$FrameCallbackC5249c = new Choreographer$FrameCallbackC5249c(c10534k, interfaceC6108l);
        f14512x.postFrameCallback(choreographer$FrameCallbackC5249c);
        c10534k.mo7778n(new C5248b(choreographer$FrameCallbackC5249c));
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
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
