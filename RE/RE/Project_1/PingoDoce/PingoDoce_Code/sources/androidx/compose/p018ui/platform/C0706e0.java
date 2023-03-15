package androidx.compose.p018ui.platform;

import android.view.Choreographer;
import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p092f0.MonotonicFrameClock;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10534k;
import td.InterfaceC10529j;

/* compiled from: AndroidUiFrameClock.android.kt */
/* renamed from: androidx.compose.ui.platform.e0 */
/* loaded from: classes.dex */
public final class C0706e0 implements MonotonicFrameClock {

    /* renamed from: w */
    private final Choreographer f2232w;

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* renamed from: androidx.compose.ui.platform.e0$a */
    /* loaded from: classes.dex */
    static final class C0707a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C0692c0 f2233w;

        /* renamed from: x */
        final /* synthetic */ Choreographer.FrameCallback f2234x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0707a(C0692c0 c0692c0, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2233w = c0692c0;
            this.f2234x = frameCallback;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            this.f2233w.m39788V0(this.f2234x);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* renamed from: androidx.compose.ui.platform.e0$b */
    /* loaded from: classes.dex */
    static final class C0708b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ Choreographer.FrameCallback f2236x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0708b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2236x = frameCallback;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            C0706e0.this.m39766b().removeFrameCallback(this.f2236x);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* renamed from: androidx.compose.ui.platform.e0$c */
    /* loaded from: classes.dex */
    static final class Choreographer$FrameCallbackC0709c implements Choreographer.FrameCallback {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10529j f2237w;

        /* renamed from: x */
        final /* synthetic */ C0706e0 f2238x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l f2239y;

        Choreographer$FrameCallbackC0709c(InterfaceC10529j interfaceC10529j, C0706e0 c0706e0, InterfaceC6108l interfaceC6108l) {
            this.f2237w = interfaceC10529j;
            this.f2238x = c0706e0;
            this.f2239y = interfaceC6108l;
        }

        public final void doFrame(long j) {
            Object m1458a;
            InterfaceC10529j interfaceC10529j = this.f2237w;
            InterfaceC6108l interfaceC6108l = this.f2239y;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m1458a = C13183m.m1458a(interfaceC6108l.mo9587d(Long.valueOf(j)));
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            interfaceC10529j.resumeWith(m1458a);
        }
    }

    public C0706e0(Choreographer choreographer) {
        Intrinsics.isThisObjectNull(choreographer, "choreographer");
        this.f2232w = choreographer;
    }

    /* renamed from: F */
    public Object mo24912F(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        CoroutineContext.InterfaceC1891b mo4546c = interfaceC1886d.getContext().mo4546c(ContinuationInterceptor.f5618d);
        C0692c0 c0692c0 = mo4546c instanceof C0692c0 ? (C0692c0) mo4546c : null;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        Choreographer$FrameCallbackC0709c choreographer$FrameCallbackC0709c = new Choreographer$FrameCallbackC0709c(c10534k, this, interfaceC6108l);
        if (c0692c0 != null && Intrinsics.equals(c0692c0.m39794P0(), m39766b())) {
            c0692c0.m39789U0(choreographer$FrameCallbackC0709c);
            c10534k.mo7778n(new C0707a(c0692c0, choreographer$FrameCallbackC0709c));
        } else {
            m39766b().postFrameCallback(choreographer$FrameCallbackC0709c);
            c10534k.mo7778n(new C0708b(choreographer$FrameCallbackC0709c));
        }
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        return MonotonicFrameClock.C5214a.m25018a(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final Choreographer m39766b() {
        return this.f2232w;
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25017b(this, interfaceC1893c);
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.C5214a.m25014e(this, coroutineContext);
    }

    public CoroutineContext.InterfaceC1893c getKey() {
        return MonotonicFrameClock.C5214a.m25016c(this);
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25015d(this, interfaceC1893c);
    }
}
