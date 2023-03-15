package p385ud;

import android.os.Handler;
import android.os.Looper;
import bd.CoroutineContext;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p468yc.C13195u;
import td.C10513f2;
import td.C10587w0;
import td.C10588w1;
import td.InterfaceC10529j;
import td.InterfaceC10595y0;

/* renamed from: ud.b */
/* loaded from: classes2.dex */
public final class C10868b extends AbstractC10871c {

    /* renamed from: A */
    private final boolean f28072A;

    /* renamed from: B */
    private final C10868b f28073B;
    private volatile C10868b _immediate;

    /* renamed from: y */
    private final Handler f28074y;

    /* renamed from: z */
    private final String f28075z;

    /* compiled from: Runnable.kt */
    /* renamed from: ud.b$a */
    /* loaded from: classes2.dex */
    public static final class RunnableC10869a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10529j f28076w;

        /* renamed from: x */
        final /* synthetic */ C10868b f28077x;

        public RunnableC10869a(InterfaceC10529j interfaceC10529j, C10868b c10868b) {
            this.f28076w = interfaceC10529j;
            this.f28077x = c10868b;
        }

        public final void run() {
            this.f28076w.mo7780V(this.f28077x, C13195u.f34156a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* renamed from: ud.b$b */
    /* loaded from: classes2.dex */
    static final class C10870b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ Runnable f28079x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10870b(Runnable runnable) {
            super(1);
            this.f28079x = runnable;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            C10868b.m6818L0(C10868b.this).removeCallbacks(this.f28079x);
        }
    }

    private C10868b(Handler handler, String str, boolean z) {
        super(null);
        this.f28074y = handler;
        this.f28075z = str;
        this.f28072A = z;
        this._immediate = z ? this : null;
        C10868b c10868b = this._immediate;
        if (c10868b == null) {
            c10868b = new C10868b(handler, str, true);
            this._immediate = c10868b;
        }
        this.f28073B = c10868b;
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m6819K0(C10868b c10868b, Runnable runnable) {
        m6815O0(c10868b, runnable);
    }

    /* renamed from: L0 */
    public static final /* synthetic */ Handler m6818L0(C10868b c10868b) {
        return c10868b.f28074y;
    }

    /* renamed from: M0 */
    private final void m6817M0(CoroutineContext coroutineContext, Runnable runnable) {
        C10588w1.m7616c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C10587w0.m7620b().mo7628D0(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m6815O0(C10868b c10868b, Runnable runnable) {
        c10868b.f28074y.removeCallbacks(runnable);
    }

    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f28074y.post(runnable)) {
            return;
        }
        m6817M0(coroutineContext, runnable);
    }

    /* renamed from: F0 */
    public boolean mo7627F0(CoroutineContext coroutineContext) {
        return (this.f28072A && Intrinsics.equals(Looper.myLooper(), this.f28074y.getLooper())) ? false : true;
    }

    /* renamed from: N0 */
    public C10868b mo6813J0() {
        return this.f28073B;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10868b) && ((C10868b) obj).f28074y == this.f28074y;
    }

    public int hashCode() {
        return System.identityHashCode(this.f28074y);
    }

    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        long m14999j;
        Handler handler = this.f28074y;
        m14999j = _Ranges.m14999j(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, m14999j)) {
            return new InterfaceC10595y0() { // from class: ud.a
                @Override // td.InterfaceC10595y0
                /* renamed from: b */
                public final void mo6823b() {
                    C10868b.m6815O0(C10868b.this, runnable);
                }
            };
        }
        m6817M0(coroutineContext, runnable);
        return C10513f2.f27237w;
    }

    public String toString() {
        String m7829I0 = m7829I0();
        if (m7829I0 == null) {
            String str = this.f28075z;
            if (str == null) {
                str = this.f28074y.toString();
            }
            if (this.f28072A) {
                return str + ".immediate";
            }
            return str;
        }
        return m7829I0;
    }

    /* renamed from: y */
    public void mo7680y(long j, InterfaceC10529j interfaceC10529j) {
        long m14999j;
        RunnableC10869a runnableC10869a = new RunnableC10869a(interfaceC10529j, this);
        Handler handler = this.f28074y;
        m14999j = _Ranges.m14999j(j, 4611686018427387903L);
        if (handler.postDelayed(runnableC10869a, m14999j)) {
            interfaceC10529j.mo7778n(new C10870b(runnableC10869a));
        } else {
            m6817M0(interfaceC10529j.getContext(), runnableC10869a);
        }
    }

    public /* synthetic */ C10868b(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C10868b(Handler handler, String str) {
        this(handler, str, false);
    }
}
