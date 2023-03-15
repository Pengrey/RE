package androidx.compose.p018ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.p020os.C1013d;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6769b;
import p092f0.MonotonicFrameClock;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.ArrayDeque;
import td.AbstractC10505e0;
import td.C10587w0;
import td.InterfaceC10524i0;

/* compiled from: AndroidUiDispatcher.android.kt */
/* renamed from: androidx.compose.ui.platform.c0 */
/* loaded from: classes.dex */
public final class C0692c0 extends AbstractC10505e0 {

    /* renamed from: I */
    public static final C0696c f2194I = new C0696c(null);

    /* renamed from: J */
    private static final InterfaceC13178g f2195J;

    /* renamed from: K */
    private static final ThreadLocal f2196K;

    /* renamed from: A */
    private final Object f2197A;

    /* renamed from: B */
    private final ArrayDeque f2198B;

    /* renamed from: C */
    private List f2199C;

    /* renamed from: D */
    private List f2200D;

    /* renamed from: E */
    private boolean f2201E;

    /* renamed from: F */
    private boolean f2202F;

    /* renamed from: G */
    private final Choreographer$FrameCallbackC0697d f2203G;

    /* renamed from: H */
    private final MonotonicFrameClock f2204H;

    /* renamed from: y */
    private final Choreographer f2205y;

    /* renamed from: z */
    private final Handler f2206z;

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* renamed from: androidx.compose.ui.platform.c0$a */
    /* loaded from: classes.dex */
    static final class C0693a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0693a f2207w = new C0693a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidUiDispatcher.android.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", m20196f = "AndroidUiDispatcher.android.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.c0$a$a */
        /* loaded from: classes.dex */
        public static final class C0694a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f2208x;

            C0694a(InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C0694a(interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C0694a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f2208x == 0) {
                    C13186n.m1453b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C0693a() {
            super(0);
        }

        /* renamed from: a */
        public final CoroutineContext mo42214q() {
            boolean m39772b;
            m39772b = C0702d0.m39772b();
            Choreographer choreographer = m39772b ? Choreographer.getInstance() : (Choreographer) C6769b.m20166e(C10587w0.m7619c(), new C0694a(null));
            Intrinsics.checkIfNull(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler m38751a = C1013d.m38751a(Looper.getMainLooper());
            Intrinsics.checkIfNull(m38751a, "createAsync(Looper.getMainLooper())");
            C0692c0 c0692c0 = new C0692c0(choreographer, m38751a, null);
            return c0692c0.mo4545f0(c0692c0.m39793Q0());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* renamed from: androidx.compose.ui.platform.c0$b */
    /* loaded from: classes.dex */
    public static final class C0695b extends ThreadLocal {
        C0695b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkIfNull(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler m38751a = C1013d.m38751a(myLooper);
                Intrinsics.checkIfNull(m38751a, "createAsync(\n           …d\")\n                    )");
                C0692c0 c0692c0 = new C0692c0(choreographer, m38751a, null);
                return c0692c0.mo4545f0(c0692c0.m39793Q0());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* renamed from: androidx.compose.ui.platform.c0$c */
    /* loaded from: classes.dex */
    public static final class C0696c {
        private C0696c() {
        }

        public /* synthetic */ C0696c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CoroutineContext m39784a() {
            boolean m39772b;
            m39772b = C0702d0.m39772b();
            if (m39772b) {
                return m39783b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) C0692c0.m39802H0().get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        /* renamed from: b */
        public final CoroutineContext m39783b() {
            return (CoroutineContext) C0692c0.m39799K0().getValue();
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* renamed from: androidx.compose.ui.platform.c0$d */
    /* loaded from: classes.dex */
    public static final class Choreographer$FrameCallbackC0697d implements Choreographer.FrameCallback, Runnable {
        Choreographer$FrameCallbackC0697d() {
        }

        public void doFrame(long j) {
            C0692c0.m39801I0(C0692c0.this).removeCallbacks(this);
            C0692c0.m39796N0(C0692c0.this);
            C0692c0.m39797M0(C0692c0.this, j);
        }

        public void run() {
            C0692c0.m39796N0(C0692c0.this);
            Object m39800J0 = C0692c0.m39800J0(C0692c0.this);
            C0692c0 c0692c0 = C0692c0.this;
            synchronized (m39800J0) {
                if (C0692c0.m39798L0(c0692c0).isEmpty()) {
                    c0692c0.m39794P0().removeFrameCallback(this);
                    C0692c0.m39795O0(c0692c0, false);
                }
                C13195u c13195u = C13195u.f34156a;
            }
        }
    }

    static {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(C0693a.f2207w);
        f2195J = m1464a;
        f2196K = new C0695b();
    }

    private C0692c0(Choreographer choreographer, Handler handler) {
        this.f2205y = choreographer;
        this.f2206z = handler;
        this.f2197A = new Object();
        this.f2198B = new ArrayDeque();
        this.f2199C = new ArrayList();
        this.f2200D = new ArrayList();
        this.f2203G = new Choreographer$FrameCallbackC0697d();
        this.f2204H = new C0706e0(choreographer);
    }

    public /* synthetic */ C0692c0(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* renamed from: H0 */
    public static final /* synthetic */ ThreadLocal m39802H0() {
        return f2196K;
    }

    /* renamed from: I0 */
    public static final /* synthetic */ Handler m39801I0(C0692c0 c0692c0) {
        return c0692c0.f2206z;
    }

    /* renamed from: J0 */
    public static final /* synthetic */ Object m39800J0(C0692c0 c0692c0) {
        return c0692c0.f2197A;
    }

    /* renamed from: K0 */
    public static final /* synthetic */ InterfaceC13178g m39799K0() {
        return f2195J;
    }

    /* renamed from: L0 */
    public static final /* synthetic */ List m39798L0(C0692c0 c0692c0) {
        return c0692c0.f2199C;
    }

    /* renamed from: M0 */
    public static final /* synthetic */ void m39797M0(C0692c0 c0692c0, long j) {
        c0692c0.m39791S0(j);
    }

    /* renamed from: N0 */
    public static final /* synthetic */ void m39796N0(C0692c0 c0692c0) {
        c0692c0.m39790T0();
    }

    /* renamed from: O0 */
    public static final /* synthetic */ void m39795O0(C0692c0 c0692c0, boolean z) {
        c0692c0.f2202F = z;
    }

    /* renamed from: R0 */
    private final Runnable m39792R0() {
        Runnable runnable;
        synchronized (this.f2197A) {
            runnable = (Runnable) this.f2198B.m390B();
        }
        return runnable;
    }

    /* renamed from: S0 */
    private final void m39791S0(long j) {
        synchronized (this.f2197A) {
            if (this.f2202F) {
                this.f2202F = false;
                List list = this.f2199C;
                this.f2199C = this.f2200D;
                this.f2200D = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    /* renamed from: T0 */
    private final void m39790T0() {
        boolean z;
        do {
            Runnable m39792R0 = m39792R0();
            while (m39792R0 != null) {
                m39792R0.run();
                m39792R0 = m39792R0();
            }
            synchronized (this.f2197A) {
                z = false;
                if (this.f2198B.isEmpty()) {
                    this.f2201E = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        Intrinsics.isThisObjectNull(runnable, "block");
        synchronized (this.f2197A) {
            this.f2198B.m385l(runnable);
            if (!this.f2201E) {
                this.f2201E = true;
                this.f2206z.post(this.f2203G);
                if (!this.f2202F) {
                    this.f2202F = true;
                    m39794P0().postFrameCallback(this.f2203G);
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: P0 */
    public final Choreographer m39794P0() {
        return this.f2205y;
    }

    /* renamed from: Q0 */
    public final MonotonicFrameClock m39793Q0() {
        return this.f2204H;
    }

    /* renamed from: U0 */
    public final void m39789U0(Choreographer.FrameCallback frameCallback) {
        Intrinsics.isThisObjectNull(frameCallback, "callback");
        synchronized (this.f2197A) {
            this.f2199C.add(frameCallback);
            if (!this.f2202F) {
                this.f2202F = true;
                m39794P0().postFrameCallback(this.f2203G);
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: V0 */
    public final void m39788V0(Choreographer.FrameCallback frameCallback) {
        Intrinsics.isThisObjectNull(frameCallback, "callback");
        synchronized (this.f2197A) {
            this.f2199C.remove(frameCallback);
        }
    }
}
