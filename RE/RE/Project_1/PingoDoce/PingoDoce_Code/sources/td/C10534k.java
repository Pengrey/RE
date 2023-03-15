package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsH;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.internal.C6865g0;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6870j;
import p181jd.Intrinsics;
import td.InterfaceC10574t1;

/* renamed from: td.k */
/* loaded from: classes2.dex */
public class C10534k<T> extends AbstractC10579u0 implements InterfaceC10529j, InterfaceC6758e {

    /* renamed from: C */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27247C = AtomicIntegerFieldUpdater.newUpdater(C10534k.class, "_decision");

    /* renamed from: D */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27248D = AtomicReferenceFieldUpdater.newUpdater(C10534k.class, Object.class, "_state");

    /* renamed from: A */
    private final CoroutineContext f27249A;

    /* renamed from: B */
    private InterfaceC10595y0 f27250B;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: z */
    private final InterfaceC1886d f27251z;

    public C10534k(InterfaceC1886d interfaceC1886d, int i) {
        super(i);
        this.f27251z = interfaceC1886d;
        if (C10539l0.m7720a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f27249A = interfaceC1886d.getContext();
        this._decision = 0;
        this._state = C10493d.f27219w;
    }

    /* renamed from: B */
    private final boolean m7761B() {
        return C10583v0.m7635c(this.f27291y) && ((C6870j) this.f27251z).m19951l();
    }

    /* renamed from: C */
    private final AbstractC10518h m7760C(InterfaceC6108l interfaceC6108l) {
        return interfaceC6108l instanceof AbstractC10518h ? (AbstractC10518h) interfaceC6108l : new C10562q1(interfaceC6108l);
    }

    /* renamed from: D */
    private final void m7759D(InterfaceC6108l interfaceC6108l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC6108l + ", already has " + obj).toString());
    }

    /* renamed from: G */
    private final void m7756G() {
        Throwable m19948r;
        InterfaceC1886d interfaceC1886d = this.f27251z;
        C6870j c6870j = interfaceC1886d instanceof C6870j ? (C6870j) interfaceC1886d : null;
        if (c6870j == null || (m19948r = c6870j.m19948r(this)) == null) {
            return;
        }
        m7735m();
        mo7776p(m19948r);
    }

    /* renamed from: I */
    private final void m7754I(Object obj, int i, InterfaceC6108l interfaceC6108l) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof InterfaceC10517g2) {
            } else {
                if (obj2 instanceof C10546n) {
                    C10546n c10546n = (C10546n) obj2;
                    if (c10546n.m7709c()) {
                        if (interfaceC6108l != null) {
                            m7738j(interfaceC6108l, c10546n.f27303a);
                            return;
                        }
                        return;
                    }
                }
                m7741g(obj);
                throw new ExceptionsH();
            }
        } while (!f27248D.compareAndSet(this, obj2, m7752K((InterfaceC10517g2) obj2, obj, i, interfaceC6108l, null)));
        m7731q();
        m7730r(i);
    }

    /* renamed from: J */
    static /* synthetic */ void m7753J(C10534k c10534k, Object obj, int i, InterfaceC6108l interfaceC6108l, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            interfaceC6108l = null;
        }
        c10534k.m7754I(obj, i, interfaceC6108l);
    }

    /* renamed from: K */
    private final Object m7752K(InterfaceC10517g2 interfaceC10517g2, Object obj, int i, InterfaceC6108l interfaceC6108l, Object obj2) {
        if (obj instanceof C10590x) {
            if (C10539l0.m7720a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (C10539l0.m7720a()) {
                if (interfaceC6108l == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (C10583v0.m7636b(i) || obj2 != null) {
            if (interfaceC6108l != null || (((interfaceC10517g2 instanceof AbstractC10518h) && !(interfaceC10517g2 instanceof AbstractC10504e)) || obj2 != null)) {
                return new C10586w(obj, interfaceC10517g2 instanceof AbstractC10518h ? (AbstractC10518h) interfaceC10517g2 : null, interfaceC6108l, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    /* renamed from: L */
    private final boolean m7751L() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27247C.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: M */
    private final C6867h0 m7750M(Object obj, Object obj2, InterfaceC6108l interfaceC6108l) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof InterfaceC10517g2) {
            } else if (!(obj3 instanceof C10586w) || obj2 == null) {
                return null;
            } else {
                C10586w c10586w = (C10586w) obj3;
                if (c10586w.f27297d == obj2) {
                    if (!C10539l0.m7720a() || Intrinsics.equals(c10586w.f27294a, obj)) {
                        return C10538l.f27253a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!f27248D.compareAndSet(this, obj3, m7752K((InterfaceC10517g2) obj3, obj, this.f27291y, interfaceC6108l, obj2)));
        m7731q();
        return C10538l.f27253a;
    }

    /* renamed from: N */
    private final boolean m7749N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f27247C.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: g */
    private final Void m7741g(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: h */
    private final void m7740h(InterfaceC6108l interfaceC6108l, Throwable th2) {
        try {
            interfaceC6108l.mo9587d(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10515g0.m7790a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: l */
    private final boolean m7736l(Throwable th2) {
        if (m7761B()) {
            return ((C6870j) this.f27251z).m19950m(th2);
        }
        return false;
    }

    /* renamed from: q */
    private final void m7731q() {
        if (m7761B()) {
            return;
        }
        m7735m();
    }

    /* renamed from: r */
    private final void m7730r(int i) {
        if (m7751L()) {
            return;
        }
        C10583v0.m7637a(this, i);
    }

    /* renamed from: w */
    private final String m7725w() {
        Object m7726v = m7726v();
        return m7726v instanceof InterfaceC10517g2 ? "Active" : m7726v instanceof C10546n ? "Cancelled" : "Completed";
    }

    /* renamed from: z */
    private final InterfaceC10595y0 m7722z() {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) getContext().mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 == null) {
            return null;
        }
        InterfaceC10595y0 m7651d = InterfaceC10574t1.C10575a.m7651d(interfaceC10574t1, true, false, new C10550o(this), 2, null);
        this.f27250B = m7651d;
        return m7651d;
    }

    /* renamed from: A */
    public boolean m7762A() {
        return !(m7726v() instanceof InterfaceC10517g2);
    }

    /* renamed from: E */
    protected String m7758E() {
        return "CancellableContinuation";
    }

    /* renamed from: F */
    public final void m7757F(Throwable th2) {
        if (m7736l(th2)) {
            return;
        }
        mo7776p(th2);
        m7731q();
    }

    /* renamed from: H */
    public final boolean m7755H() {
        if (C10539l0.m7720a()) {
            if (!(this.f27291y == 2)) {
                throw new AssertionError();
            }
        }
        if (C10539l0.m7720a()) {
            if (!(this.f27250B != C10513f2.f27237w)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!C10539l0.m7720a() || (!(obj instanceof InterfaceC10517g2))) {
            if ((obj instanceof C10586w) && ((C10586w) obj).f27297d != null) {
                m7735m();
                return false;
            }
            this._decision = 0;
            this._state = C10493d.f27219w;
            return true;
        }
        throw new AssertionError();
    }

    /* renamed from: S */
    public void mo7781S(Object obj) {
        if (C10539l0.m7720a()) {
            if (!(obj == C10538l.f27253a)) {
                throw new AssertionError();
            }
        }
        m7730r(this.f27291y);
    }

    /* renamed from: V */
    public void mo7780V(AbstractC10505e0 abstractC10505e0, Object obj) {
        InterfaceC1886d interfaceC1886d = this.f27251z;
        C6870j c6870j = interfaceC1886d instanceof C6870j ? (C6870j) interfaceC1886d : null;
        m7753J(this, obj, (c6870j != null ? c6870j.f18320z : null) == abstractC10505e0 ? 4 : this.f27291y, null, 4, null);
    }

    /* renamed from: a */
    public void m7746a(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC10517g2)) {
                if (obj2 instanceof C10590x) {
                    return;
                }
                if (obj2 instanceof C10586w) {
                    C10586w c10586w = (C10586w) obj2;
                    if (!c10586w.m7623c()) {
                        if (f27248D.compareAndSet(this, obj2, C10586w.m7624b(c10586w, null, null, null, null, th2, 15, null))) {
                            c10586w.m7622d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f27248D.compareAndSet(this, obj2, new C10586w(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC1886d m7745b() {
        return this.f27251z;
    }

    /* renamed from: c */
    public Throwable m7744c(Object obj) {
        Throwable m7644c = super.m7644c(obj);
        if (m7644c != null) {
            InterfaceC1886d interfaceC1886d = this.f27251z;
            return (C10539l0.m7717d() && (interfaceC1886d instanceof InterfaceC6758e)) ? C6865g0.m19979a(m7644c, (InterfaceC6758e) interfaceC1886d) : m7644c;
        }
        return null;
    }

    /* renamed from: d */
    public Object m7743d(Object obj) {
        return obj instanceof C10586w ? ((C10586w) obj).f27294a : obj;
    }

    /* renamed from: f */
    public Object m7742f() {
        return m7726v();
    }

    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d interfaceC1886d = this.f27251z;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f27249A;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: i */
    public final void m7739i(AbstractC10518h abstractC10518h, Throwable th2) {
        try {
            abstractC10518h.mo5730a(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10515g0.m7790a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: j */
    public final void m7738j(InterfaceC6108l interfaceC6108l, Throwable th2) {
        try {
            interfaceC6108l.mo9587d(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10515g0.m7790a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    /* renamed from: k */
    public Object mo7779k(Object obj, Object obj2) {
        return m7750M(obj, obj2, null);
    }

    /* renamed from: m */
    public final void m7735m() {
        InterfaceC10595y0 interfaceC10595y0 = this.f27250B;
        if (interfaceC10595y0 == null) {
            return;
        }
        interfaceC10595y0.mo6823b();
        this.f27250B = C10513f2.f27237w;
    }

    /* renamed from: n */
    public void mo7778n(InterfaceC6108l interfaceC6108l) {
        AbstractC10518h m7760C = m7760C(interfaceC6108l);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C10493d) {
                if (f27248D.compareAndSet(this, obj, m7760C)) {
                    return;
                }
            } else if (obj instanceof AbstractC10518h) {
                m7759D(interfaceC6108l, obj);
            } else {
                boolean z = obj instanceof C10590x;
                if (z) {
                    C10590x c10590x = (C10590x) obj;
                    if (!c10590x.m7601b()) {
                        m7759D(interfaceC6108l, obj);
                    }
                    if (obj instanceof C10546n) {
                        if (!z) {
                            c10590x = null;
                        }
                        m7740h(interfaceC6108l, c10590x != null ? c10590x.f27303a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof C10586w) {
                    C10586w c10586w = (C10586w) obj;
                    if (c10586w.f27295b != null) {
                        m7759D(interfaceC6108l, obj);
                    }
                    if (m7760C instanceof AbstractC10504e) {
                        return;
                    }
                    if (c10586w.m7623c()) {
                        m7740h(interfaceC6108l, c10586w.f27298e);
                        return;
                    } else {
                        if (f27248D.compareAndSet(this, obj, C10586w.m7624b(c10586w, null, m7760C, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (m7760C instanceof AbstractC10504e) {
                    return;
                } else {
                    if (f27248D.compareAndSet(this, obj, new C10586w(obj, m7760C, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo7777o(Object obj, InterfaceC6108l interfaceC6108l) {
        m7754I(obj, this.f27291y, interfaceC6108l);
    }

    /* renamed from: p */
    public boolean mo7776p(Throwable th2) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC10517g2)) {
                return false;
            }
            z = obj instanceof AbstractC10518h;
        } while (!f27248D.compareAndSet(this, obj, new C10546n(this, th2, z)));
        AbstractC10518h abstractC10518h = z ? (AbstractC10518h) obj : null;
        if (abstractC10518h != null) {
            m7739i(abstractC10518h, th2);
        }
        m7731q();
        m7730r(this.f27291y);
        return true;
    }

    public void resumeWith(Object obj) {
        m7753J(this, C10477a0.m7923c(obj, this), this.f27291y, null, 4, null);
    }

    /* renamed from: s */
    public Throwable m7729s(InterfaceC10574t1 interfaceC10574t1) {
        return interfaceC10574t1.mo7658e0();
    }

    /* renamed from: t */
    public final Object m7728t() {
        InterfaceC10574t1 interfaceC10574t1;
        Object m34636d;
        boolean m7761B = m7761B();
        if (m7749N()) {
            if (this.f27250B == null) {
                m7722z();
            }
            if (m7761B) {
                m7756G();
            }
            m34636d = C2116d.m34636d();
            return m34636d;
        }
        if (m7761B) {
            m7756G();
        }
        Object m7726v = m7726v();
        if (m7726v instanceof C10590x) {
            Throwable th2 = ((C10590x) m7726v).f27303a;
            if (C10539l0.m7717d()) {
                throw C6865g0.m19979a(th2, this);
            }
            throw th2;
        } else if (C10583v0.m7636b(this.f27291y) && (interfaceC10574t1 = (InterfaceC10574t1) getContext().mo4546c(InterfaceC10574t1.f27288s)) != null && !interfaceC10574t1.mo5659a()) {
            CancellationException mo7658e0 = interfaceC10574t1.mo7658e0();
            m7746a(m7726v, mo7658e0);
            if (C10539l0.m7717d()) {
                throw C6865g0.m19979a(mo7658e0, this);
            }
            throw mo7658e0;
        } else {
            return m7743d(m7726v);
        }
    }

    public String toString() {
        return m7758E() + '(' + C10543m0.m7710c(this.f27251z) + "){" + m7725w() + "}@" + C10543m0.m7711b(this);
    }

    /* renamed from: u */
    public Object mo7775u(Object obj, Object obj2, InterfaceC6108l interfaceC6108l) {
        return m7750M(obj, obj2, interfaceC6108l);
    }

    /* renamed from: v */
    public final Object m7726v() {
        return this._state;
    }

    /* renamed from: x */
    public Object mo7774x(Throwable th2) {
        return m7750M(new C10590x(th2, false, 2, null), null, null);
    }

    /* renamed from: y */
    public void m7723y() {
        InterfaceC10595y0 m7722z = m7722z();
        if (m7722z != null && m7762A()) {
            m7722z.mo6823b();
            this.f27250B = C10513f2.f27237w;
        }
    }
}
