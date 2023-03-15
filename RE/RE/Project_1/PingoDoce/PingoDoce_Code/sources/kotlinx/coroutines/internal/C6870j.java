package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import p181jd.Intrinsics;
import p468yc.C13195u;
import td.AbstractC10491c1;
import td.AbstractC10505e0;
import td.AbstractC10579u0;
import td.C10477a0;
import td.C10534k;
import td.C10539l0;
import td.C10543m0;
import td.C10558p2;
import td.C10594y;
import td.InterfaceC10529j;

/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes2.dex */
public final class C6870j<T> extends AbstractC10579u0 implements InterfaceC6758e, InterfaceC1886d {

    /* renamed from: D */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18316D = AtomicReferenceFieldUpdater.newUpdater(C6870j.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: A */
    public final InterfaceC1886d f18317A;

    /* renamed from: B */
    public Object f18318B;

    /* renamed from: C */
    public final Object f18319C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: z */
    public final AbstractC10505e0 f18320z;

    public C6870j(AbstractC10505e0 abstractC10505e0, InterfaceC1886d interfaceC1886d) {
        super(-1);
        C6867h0 c6867h0;
        this.f18320z = abstractC10505e0;
        this.f18317A = interfaceC1886d;
        c6867h0 = C6872k.f18322a;
        this.f18318B = c6867h0;
        this.f18319C = C6881l0.m19923b(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: j */
    private final C10534k m19952j() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C10534k) {
            return (C10534k) obj;
        }
        return null;
    }

    /* renamed from: a */
    public void m19958a(Object obj, Throwable th2) {
        if (obj instanceof C10594y) {
            ((C10594y) obj).f27307b.mo9587d(th2);
        }
    }

    /* renamed from: b */
    public InterfaceC1886d m19957b() {
        return this;
    }

    /* renamed from: f */
    public Object m19956f() {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        Object obj = this.f18318B;
        if (C10539l0.m7720a()) {
            c6867h02 = C6872k.f18322a;
            if (!(obj != c6867h02)) {
                throw new AssertionError();
            }
        }
        c6867h0 = C6872k.f18322a;
        this.f18318B = c6867h0;
        return obj;
    }

    /* renamed from: g */
    public final void m19955g() {
        do {
        } while (this._reusableCancellableContinuation == C6872k.f18323b);
    }

    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d interfaceC1886d = this.f18317A;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f18317A.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final C10534k m19954h() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C6872k.f18323b;
                return null;
            } else if (obj instanceof C10534k) {
                if (f18316D.compareAndSet(this, obj, C6872k.f18323b)) {
                    return (C10534k) obj;
                }
            } else if (obj != C6872k.f18323b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: i */
    public final void m19953i(CoroutineContext coroutineContext, Object obj) {
        this.f18318B = obj;
        this.f27291y = 1;
        this.f18320z.mo7797E0(coroutineContext, this);
    }

    /* renamed from: l */
    public final boolean m19951l() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: m */
    public final boolean m19950m(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C6867h0 c6867h0 = C6872k.f18323b;
            if (Intrinsics.equals(obj, c6867h0)) {
                if (f18316D.compareAndSet(this, c6867h0, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f18316D.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: q */
    public final void m19949q() {
        m19955g();
        C10534k m19952j = m19952j();
        if (m19952j != null) {
            m19952j.m7735m();
        }
    }

    /* renamed from: r */
    public final Throwable m19948r(InterfaceC10529j interfaceC10529j) {
        C6867h0 c6867h0;
        do {
            Object obj = this._reusableCancellableContinuation;
            c6867h0 = C6872k.f18323b;
            if (obj != c6867h0) {
                if (obj instanceof Throwable) {
                    if (f18316D.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f18316D.compareAndSet(this, c6867h0, interfaceC10529j));
        return null;
    }

    public void resumeWith(Object obj) {
        CoroutineContext context = this.f18317A.getContext();
        Object m7922d = C10477a0.m7922d(obj, null, 1, null);
        if (this.f18320z.mo7627F0(context)) {
            this.f18318B = m7922d;
            this.f27291y = 0;
            this.f18320z.mo7628D0(context, this);
            return;
        }
        C10539l0.m7720a();
        AbstractC10491c1 m7684b = C10558p2.f27272a.m7684b();
        if (m7684b.m7835O0()) {
            this.f18318B = m7922d;
            this.f27291y = 0;
            m7684b.m7839K0(this);
            return;
        }
        m7684b.m7837M0(true);
        try {
            CoroutineContext context2 = getContext();
            Object m19922c = C6881l0.m19922c(context2, this.f18319C);
            this.f18317A.resumeWith(obj);
            C13195u c13195u = C13195u.f34156a;
            C6881l0.m19924a(context2, m19922c);
            do {
            } while (m7684b.m7832R0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f18320z + ", " + C10543m0.m7710c(this.f18317A) + ']';
    }
}
