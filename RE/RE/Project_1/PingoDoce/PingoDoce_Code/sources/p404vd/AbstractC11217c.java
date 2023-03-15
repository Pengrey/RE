package p404vd;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6889o;
import kotlinx.coroutines.internal.C6894r;
import kotlinx.coroutines.internal.C6895s;
import kotlinx.coroutines.internal.C6896t;
import kotlinx.coroutines.internal.C6907z;
import kotlinx.coroutines.internal.OnUndeliveredElement;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.Exceptions;
import td.C10534k;
import td.C10538l;
import td.C10539l0;
import td.C10542m;
import td.C10543m0;

/* renamed from: vd.c */
/* loaded from: classes2.dex */
public abstract class AbstractC11217c<E> implements InterfaceC11244w {

    /* renamed from: y */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28793y = AtomicReferenceFieldUpdater.newUpdater(AbstractC11217c.class, Object.class, "onCloseHandler");

    /* renamed from: w */
    protected final InterfaceC6108l f28794w;

    /* renamed from: x */
    private final C6894r f28795x = new C6894r();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.c$a */
    /* loaded from: classes2.dex */
    public static final class C11218a<E> extends AbstractC11243v {

        /* renamed from: z */
        public final Object f28796z;

        public C11218a(Object obj) {
            this.f28796z = obj;
        }

        /* renamed from: A */
        public void mo5639A() {
        }

        /* renamed from: B */
        public Object mo5674J() {
            return this.f28796z;
        }

        /* renamed from: D */
        public void mo5637D(C11233l c11233l) {
            if (C10539l0.m7720a()) {
                throw new AssertionError();
            }
        }

        /* renamed from: E */
        public C6867h0 mo5636E(C6896t.C6898b c6898b) {
            return C10538l.f27253a;
        }

        public String toString() {
            return "SendBuffered@" + C10543m0.m7711b(this) + '(' + this.f28796z + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: vd.c$b */
    /* loaded from: classes2.dex */
    public static final class C11219b extends C6896t.AbstractC6897a {

        /* renamed from: d */
        final /* synthetic */ AbstractC11217c f28797d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11219b(C6896t c6896t, AbstractC11217c abstractC11217c) {
            super(c6896t);
            this.f28797d = abstractC11217c;
        }

        /* renamed from: i */
        public Object mo5729i(C6896t c6896t) {
            if (this.f28797d.mo5644v()) {
                return null;
            }
            return C6895s.m19884a();
        }
    }

    public AbstractC11217c(InterfaceC6108l interfaceC6108l) {
        this.f28794w = interfaceC6108l;
    }

    /* renamed from: A */
    private final Object m5728A(Object obj, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        AbstractC11243v c11247y;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k m7714b = C10542m.m7714b(m34637c);
        while (true) {
            if (m5724c(this)) {
                if (this.f28794w == null) {
                    c11247y = new C11246x(obj, m7714b);
                } else {
                    c11247y = new C11247y(obj, m7714b, this.f28794w);
                }
                Object m5722k = m5722k(c11247y);
                if (m5722k == null) {
                    C10542m.m7713c(m7714b, c11247y);
                    break;
                } else if (m5722k instanceof C11233l) {
                    m5725a(this, m7714b, obj, (C11233l) m5722k);
                    break;
                } else if (m5722k != C11216b.f28791e && !(m5722k instanceof AbstractC11239r)) {
                    throw new IllegalStateException(("enqueueSend returned " + m5722k).toString());
                }
            }
            Object mo5665x = mo5665x(obj);
            if (mo5665x == C11216b.f28788b) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m7714b.resumeWith(C13183m.m1458a(C13195u.f34156a));
                break;
            } else if (mo5665x != C11216b.f28789c) {
                if (mo5665x instanceof C11233l) {
                    m5725a(this, m7714b, obj, (C11233l) mo5665x);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + mo5665x).toString());
                }
            }
        }
        Object m7728t = m7714b.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m5725a(AbstractC11217c abstractC11217c, InterfaceC1886d interfaceC1886d, Object obj, C11233l c11233l) {
        abstractC11217c.m5714s(interfaceC1886d, obj, c11233l);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m5724c(AbstractC11217c abstractC11217c) {
        return abstractC11217c.m5712w();
    }

    /* renamed from: h */
    private final int m5723h() {
        C6894r c6894r = this.f28795x;
        int i = 0;
        for (C6896t c6896t = (C6896t) c6894r.m19875o(); !Intrinsics.equals(c6896t, c6894r); c6896t = c6896t.m19874p()) {
            if (c6896t instanceof C6896t) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: p */
    private final String m5717p() {
        String str;
        C6896t m19874p = this.f28795x.m19874p();
        if (m19874p == this.f28795x) {
            return "EmptyQueue";
        }
        if (m19874p instanceof C11233l) {
            str = m19874p.toString();
        } else if (m19874p instanceof AbstractC11239r) {
            str = "ReceiveQueued";
        } else if (m19874p instanceof AbstractC11243v) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + m19874p;
        }
        C6896t m19873r = this.f28795x.m19873r();
        if (m19873r != m19874p) {
            String str2 = str + ",queueSize=" + m5723h();
            if (m19873r instanceof C11233l) {
                return str2 + ",closedForSend=" + m19873r;
            }
            return str2;
        }
        return str;
    }

    /* renamed from: q */
    private final void m5716q(C11233l c11233l) {
        Object m19895b = C6889o.m19895b(null, 1, null);
        while (true) {
            C6896t m19873r = c11233l.m19873r();
            AbstractC11239r abstractC11239r = m19873r instanceof AbstractC11239r ? (AbstractC11239r) m19873r : null;
            if (abstractC11239r == null) {
                break;
            } else if (!abstractC11239r.mo5634v()) {
                abstractC11239r.m19872s();
            } else {
                m19895b = C6889o.m19894c(m19895b, abstractC11239r);
            }
        }
        if (m19895b != null) {
            if (!(m19895b instanceof ArrayList)) {
                ((AbstractC11239r) m19895b).mo5655D(c11233l);
            } else {
                ArrayList arrayList = (ArrayList) m19895b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((AbstractC11239r) arrayList.get(size)).mo5655D(c11233l);
                }
            }
        }
        m5711y(c11233l);
    }

    /* renamed from: r */
    private final Throwable m5715r(C11233l c11233l) {
        m5716q(c11233l);
        return c11233l.m5672M();
    }

    /* renamed from: s */
    private final void m5714s(InterfaceC1886d interfaceC1886d, Object obj, C11233l c11233l) {
        OnUndeliveredElement m19833d;
        m5716q(c11233l);
        Throwable m5672M = c11233l.m5672M();
        InterfaceC6108l interfaceC6108l = this.f28794w;
        if (interfaceC6108l != null && (m19833d = C6907z.m19833d(interfaceC6108l, obj, null, 2, null)) != null) {
            Exceptions.m1470a(m19833d, m5672M);
            C13183m.C13184a c13184a = C13183m.f34143w;
            interfaceC1886d.resumeWith(C13183m.m1458a(C13186n.m1454a(m19833d)));
            return;
        }
        C13183m.C13184a c13184a2 = C13183m.f34143w;
        interfaceC1886d.resumeWith(C13183m.m1458a(C13186n.m1454a(m5672M)));
    }

    /* renamed from: t */
    private final void m5713t(Throwable th2) {
        C6867h0 c6867h0;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c6867h0 = C11216b.f28792f) || !f28793y.compareAndSet(this, obj, c6867h0)) {
            return;
        }
        ((InterfaceC6108l) C6431d0.m20951d(obj, 1)).mo9587d(th2);
    }

    /* renamed from: w */
    private final boolean m5712w() {
        return !(this.f28795x.m19874p() instanceof InterfaceC11241t) && mo5644v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public InterfaceC11241t mo5747B() {
        C6896t c6896t;
        C6896t m19868x;
        C6894r c6894r = this.f28795x;
        while (true) {
            c6896t = (C6896t) c6894r.m19875o();
            if (c6896t != c6894r && (c6896t instanceof InterfaceC11241t)) {
                if (((((InterfaceC11241t) c6896t) instanceof C11233l) && !c6896t.mo19885u()) || (m19868x = c6896t.m19868x()) == null) {
                    break;
                }
                m19868x.m19871t();
            }
        }
        c6896t = null;
        return (InterfaceC11241t) c6896t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final AbstractC11243v m5726C() {
        C6896t c6896t;
        C6896t m19868x;
        C6894r c6894r = this.f28795x;
        while (true) {
            c6896t = (C6896t) c6894r.m19875o();
            if (c6896t != c6894r && (c6896t instanceof AbstractC11243v)) {
                if (((((AbstractC11243v) c6896t) instanceof C11233l) && !c6896t.mo19885u()) || (m19868x = c6896t.m19868x()) == null) {
                    break;
                }
                m19868x.m19871t();
            }
        }
        c6896t = null;
        return (AbstractC11243v) c6896t;
    }

    /* renamed from: b */
    public final Object mo5643b(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        if (mo5665x(obj) == C11216b.f28788b) {
            return C13195u.f34156a;
        }
        Object m5728A = m5728A(obj, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m5728A == m34636d ? m5728A : C13195u.f34156a;
    }

    /* renamed from: d */
    public boolean mo5642d(Throwable th2) {
        boolean z;
        C11233l c11233l = new C11233l(th2);
        C6896t c6896t = this.f28795x;
        while (true) {
            C6896t m19873r = c6896t.m19873r();
            z = true;
            if (!(!(m19873r instanceof C11233l))) {
                z = false;
                break;
            } else if (m19873r.m19880j(c11233l, c6896t)) {
                break;
            }
        }
        if (!z) {
            c11233l = (C11233l) this.f28795x.m19873r();
        }
        m5716q(c11233l);
        if (z) {
            m5713t(th2);
        }
        return z;
    }

    /* renamed from: i */
    public final Object mo5641i(Object obj) {
        Object mo5665x = mo5665x(obj);
        if (mo5665x == C11216b.f28788b) {
            return C11227i.f28808b.m5678c(C13195u.f34156a);
        }
        if (mo5665x == C11216b.f28789c) {
            C11233l m5719n = m5719n();
            return m5719n == null ? C11227i.f28808b.m5679b() : C11227i.f28808b.m5680a(m5715r(m5719n));
        } else if (mo5665x instanceof C11233l) {
            return C11227i.f28808b.m5680a(m5715r((C11233l) mo5665x));
        } else {
            throw new IllegalStateException(("trySend returned " + mo5665x).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public Object m5722k(AbstractC11243v abstractC11243v) {
        boolean z;
        C6896t m19873r;
        if (mo5645u()) {
            C6896t c6896t = this.f28795x;
            do {
                m19873r = c6896t.m19873r();
                if (m19873r instanceof InterfaceC11241t) {
                    return m19873r;
                }
            } while (!m19873r.m19880j(abstractC11243v, c6896t));
            return null;
        }
        C6896t c6896t2 = this.f28795x;
        C11219b c11219b = new C11219b(abstractC11243v, this);
        while (true) {
            C6896t m19873r2 = c6896t2.m19873r();
            if (!(m19873r2 instanceof InterfaceC11241t)) {
                int m19866z = m19873r2.m19866z(abstractC11243v, c6896t2, c11219b);
                z = true;
                if (m19866z != 1) {
                    if (m19866z == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return m19873r2;
            }
        }
        if (z) {
            return null;
        }
        return C11216b.f28791e;
    }

    /* renamed from: l */
    protected String m5721l() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final C11233l m5720m() {
        C6896t m19874p = this.f28795x.m19874p();
        C11233l c11233l = m19874p instanceof C11233l ? (C11233l) m19874p : null;
        if (c11233l != null) {
            m5716q(c11233l);
            return c11233l;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final C11233l m5719n() {
        C6896t m19873r = this.f28795x.m19873r();
        C11233l c11233l = m19873r instanceof C11233l ? (C11233l) m19873r : null;
        if (c11233l != null) {
            m5716q(c11233l);
            return c11233l;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C6894r m5718o() {
        return this.f28795x;
    }

    public String toString() {
        return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this) + '{' + m5717p() + '}' + m5721l();
    }

    /* renamed from: u */
    protected abstract boolean mo5645u();

    /* renamed from: v */
    protected abstract boolean mo5644v();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public Object mo5665x(Object obj) {
        InterfaceC11241t mo5747B;
        C6867h0 mo5648f;
        do {
            mo5747B = mo5747B();
            if (mo5747B == null) {
                return C11216b.f28789c;
            }
            mo5648f = mo5747B.mo5648f(obj, null);
        } while (mo5648f == null);
        if (C10539l0.m7720a()) {
            if (!(mo5648f == C10538l.f27253a)) {
                throw new AssertionError();
            }
        }
        mo5747B.mo5650c(obj);
        return mo5747B.mo42225d();
    }

    /* renamed from: y */
    protected void m5711y(C6896t c6896t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final InterfaceC11241t m5710z(Object obj) {
        C6896t m19873r;
        C6896t c6896t = this.f28795x;
        C11218a c11218a = new C11218a(obj);
        do {
            m19873r = c6896t.m19873r();
            if (m19873r instanceof InterfaceC11241t) {
                return (InterfaceC11241t) m19873r;
            }
        } while (!m19873r.m19880j(c11218a, c6896t));
        return null;
    }
}
