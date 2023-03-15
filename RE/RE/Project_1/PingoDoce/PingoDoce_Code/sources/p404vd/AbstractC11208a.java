package p404vd;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.internal.C6865g0;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6889o;
import kotlinx.coroutines.internal.C6894r;
import kotlinx.coroutines.internal.C6895s;
import kotlinx.coroutines.internal.C6896t;
import kotlinx.coroutines.internal.C6907z;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.AbstractC10504e;
import td.C10534k;
import td.C10538l;
import td.C10539l0;
import td.C10542m;
import td.C10543m0;
import td.InterfaceC10529j;

/* renamed from: vd.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11208a<E> extends AbstractC11217c<E> implements InterfaceC11222e<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.a$a */
    /* loaded from: classes2.dex */
    public static final class C11209a<E> implements InterfaceC11225g<E> {

        /* renamed from: a */
        public final AbstractC11208a<E> f28774a;

        /* renamed from: b */
        private Object f28775b = C11216b.f28790d;

        public C11209a(AbstractC11208a<E> abstractC11208a) {
            this.f28774a = abstractC11208a;
        }

        /* renamed from: b */
        private final boolean m5734b(Object obj) {
            if (obj instanceof C11233l) {
                C11233l c11233l = (C11233l) obj;
                if (c11233l.f28812z == null) {
                    return false;
                }
                throw C6865g0.m19969k(c11233l.m5673L());
            }
            return true;
        }

        /* renamed from: c */
        private final Object m5733c(InterfaceC1886d<? super Boolean> interfaceC1886d) {
            InterfaceC1886d m34637c;
            Object m34636d;
            m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
            C10534k m7714b = C10542m.m7714b(m34637c);
            C11212d c11212d = new C11212d(this, m7714b);
            while (true) {
                if (this.f28774a.m5743G(c11212d)) {
                    this.f28774a.m5735R(m7714b, c11212d);
                    break;
                }
                Object mo5737P = this.f28774a.mo5737P();
                m5732d(mo5737P);
                if (mo5737P instanceof C11233l) {
                    C11233l c11233l = (C11233l) mo5737P;
                    if (c11233l.f28812z == null) {
                        C13183m.C13184a c13184a = C13183m.f34143w;
                        m7714b.resumeWith(C13183m.m1458a(C6755b.m20201a(false)));
                    } else {
                        C13183m.C13184a c13184a2 = C13183m.f34143w;
                        m7714b.resumeWith(C13183m.m1458a(C13186n.m1454a(c11233l.m5673L())));
                    }
                } else if (mo5737P != C11216b.f28790d) {
                    Boolean m20201a = C6755b.m20201a(true);
                    InterfaceC6108l interfaceC6108l = this.f28774a.f28794w;
                    m7714b.mo7777o(m20201a, interfaceC6108l != null ? C6907z.m19836a(interfaceC6108l, mo5737P, m7714b.getContext()) : null);
                }
            }
            Object m7728t = m7714b.m7728t();
            m34636d = C2116d.m34636d();
            if (m7728t == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            return m7728t;
        }

        @Override // p404vd.InterfaceC11225g
        /* renamed from: a */
        public Object mo5694a(InterfaceC1886d<? super Boolean> interfaceC1886d) {
            Object obj = this.f28775b;
            C6867h0 c6867h0 = C11216b.f28790d;
            if (obj != c6867h0) {
                return C6755b.m20201a(m5734b(obj));
            }
            Object mo5737P = this.f28774a.mo5737P();
            this.f28775b = mo5737P;
            if (mo5737P != c6867h0) {
                return C6755b.m20201a(m5734b(mo5737P));
            }
            return m5733c(interfaceC1886d);
        }

        /* renamed from: d */
        public final void m5732d(Object obj) {
            this.f28775b = obj;
        }

        @Override // p404vd.InterfaceC11225g
        public E next() {
            E e = (E) this.f28775b;
            if (!(e instanceof C11233l)) {
                C6867h0 c6867h0 = C11216b.f28790d;
                if (e != c6867h0) {
                    this.f28775b = c6867h0;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C6865g0.m19969k(((C11233l) e).m5673L());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.a$b */
    /* loaded from: classes2.dex */
    public static class C11210b<E> extends AbstractC11239r<E> {

        /* renamed from: A */
        public final int f28776A;

        /* renamed from: z */
        public final InterfaceC10529j<Object> f28777z;

        public C11210b(InterfaceC10529j<Object> interfaceC10529j, int i) {
            this.f28777z = interfaceC10529j;
            this.f28776A = i;
        }

        @Override // p404vd.AbstractC11239r
        /* renamed from: D */
        public void mo5655D(C11233l<?> c11233l) {
            if (this.f28776A == 1) {
                InterfaceC10529j<Object> interfaceC10529j = this.f28777z;
                C11227i m5690b = C11227i.m5690b(C11227i.f28808b.m5680a(c11233l.f28812z));
                C13183m.C13184a c13184a = C13183m.f34143w;
                interfaceC10529j.resumeWith(C13183m.m1458a(m5690b));
                return;
            }
            InterfaceC10529j<Object> interfaceC10529j2 = this.f28777z;
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            interfaceC10529j2.resumeWith(C13183m.m1458a(C13186n.m1454a(c11233l.m5673L())));
        }

        /* renamed from: E */
        public final Object m5731E(E e) {
            return this.f28776A == 1 ? C11227i.m5690b(C11227i.f28808b.m5678c(e)) : e;
        }

        @Override // p404vd.InterfaceC11241t
        /* renamed from: c */
        public void mo5650c(E e) {
            this.f28777z.mo7781S(C10538l.f27253a);
        }

        @Override // p404vd.InterfaceC11241t
        /* renamed from: f */
        public C6867h0 mo5648f(E e, C6896t.C6898b c6898b) {
            Object mo7775u = this.f28777z.mo7775u(m5731E(e), null, mo5656B(e));
            if (mo7775u == null) {
                return null;
            }
            if (C10539l0.m7720a()) {
                if (!(mo7775u == C10538l.f27253a)) {
                    throw new AssertionError();
                }
            }
            return C10538l.f27253a;
        }

        @Override // kotlinx.coroutines.internal.C6896t
        public String toString() {
            return "ReceiveElement@" + C10543m0.m7711b(this) + "[receiveMode=" + this.f28776A + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.a$c */
    /* loaded from: classes2.dex */
    public static final class C11211c<E> extends C11210b<E> {

        /* renamed from: B */
        public final InterfaceC6108l<E, C13195u> f28778B;

        /* JADX WARN: Multi-variable type inference failed */
        public C11211c(InterfaceC10529j<Object> interfaceC10529j, int i, InterfaceC6108l<? super E, C13195u> interfaceC6108l) {
            super(interfaceC10529j, i);
            this.f28778B = interfaceC6108l;
        }

        @Override // p404vd.AbstractC11239r
        /* renamed from: B */
        public InterfaceC6108l<Throwable, C13195u> mo5656B(E e) {
            return C6907z.m19836a(this.f28778B, e, this.f28777z.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.a$d */
    /* loaded from: classes2.dex */
    public static class C11212d<E> extends AbstractC11239r<E> {

        /* renamed from: A */
        public final InterfaceC10529j<Boolean> f28779A;

        /* renamed from: z */
        public final C11209a<E> f28780z;

        /* JADX WARN: Multi-variable type inference failed */
        public C11212d(C11209a<E> c11209a, InterfaceC10529j<? super Boolean> interfaceC10529j) {
            this.f28780z = c11209a;
            this.f28779A = interfaceC10529j;
        }

        @Override // p404vd.AbstractC11239r
        /* renamed from: B */
        public InterfaceC6108l<Throwable, C13195u> mo5656B(E e) {
            InterfaceC6108l interfaceC6108l = this.f28780z.f28774a.f28794w;
            if (interfaceC6108l != null) {
                return C6907z.m19836a(interfaceC6108l, e, this.f28779A.getContext());
            }
            return null;
        }

        @Override // p404vd.AbstractC11239r
        /* renamed from: D */
        public void mo5655D(C11233l<?> c11233l) {
            Object mo7774x;
            if (c11233l.f28812z == null) {
                mo7774x = InterfaceC10529j.C10530a.m7772b(this.f28779A, Boolean.FALSE, null, 2, null);
            } else {
                mo7774x = this.f28779A.mo7774x(c11233l.m5673L());
            }
            if (mo7774x != null) {
                this.f28780z.m5732d(c11233l);
                this.f28779A.mo7781S(mo7774x);
            }
        }

        @Override // p404vd.InterfaceC11241t
        /* renamed from: c */
        public void mo5650c(E e) {
            this.f28780z.m5732d(e);
            this.f28779A.mo7781S(C10538l.f27253a);
        }

        @Override // p404vd.InterfaceC11241t
        /* renamed from: f */
        public C6867h0 mo5648f(E e, C6896t.C6898b c6898b) {
            Object mo7775u = this.f28779A.mo7775u(Boolean.TRUE, null, mo5656B(e));
            if (mo7775u == null) {
                return null;
            }
            if (C10539l0.m7720a()) {
                if (!(mo7775u == C10538l.f27253a)) {
                    throw new AssertionError();
                }
            }
            return C10538l.f27253a;
        }

        @Override // kotlinx.coroutines.internal.C6896t
        public String toString() {
            return "ReceiveHasNext@" + C10543m0.m7711b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.kt */
    /* renamed from: vd.a$e */
    /* loaded from: classes2.dex */
    public final class C11213e extends AbstractC10504e {

        /* renamed from: w */
        private final AbstractC11239r<?> f28781w;

        public C11213e(AbstractC11239r<?> abstractC11239r) {
            this.f28781w = abstractC11239r;
        }

        @Override // td.AbstractC10523i
        /* renamed from: a */
        public void mo5730a(Throwable th2) {
            if (this.f28781w.mo5634v()) {
                AbstractC11208a.this.m5739N();
            }
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            mo5730a(th2);
            return C13195u.f34156a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f28781w + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: vd.a$f */
    /* loaded from: classes2.dex */
    public static final class C11214f extends C6896t.AbstractC6897a {

        /* renamed from: d */
        final /* synthetic */ AbstractC11208a f28783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11214f(C6896t c6896t, AbstractC11208a abstractC11208a) {
            super(c6896t);
            this.f28783d = abstractC11208a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6855c
        /* renamed from: i */
        public Object mo5729i(C6896t c6896t) {
            if (this.f28783d.mo5646J()) {
                return null;
            }
            return C6895s.m19884a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractChannel.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.channels.AbstractChannel", m20196f = "AbstractChannel.kt", m20195l = {633}, m20194m = "receiveCatching-JP2dKIU")
    /* renamed from: vd.a$g */
    /* loaded from: classes2.dex */
    public static final class C11215g extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f28784w;

        /* renamed from: x */
        final /* synthetic */ AbstractC11208a<E> f28785x;

        /* renamed from: y */
        int f28786y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11215g(AbstractC11208a<E> abstractC11208a, InterfaceC1886d<? super C11215g> interfaceC1886d) {
            super(interfaceC1886d);
            this.f28785x = abstractC11208a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            this.f28784w = obj;
            this.f28786y |= Integer.MIN_VALUE;
            Object mo5651j = this.f28785x.mo5651j(this);
            m34636d = C2116d.m34636d();
            return mo5651j == m34636d ? mo5651j : C11227i.m5690b(mo5651j);
        }
    }

    public AbstractC11208a(InterfaceC6108l<? super E, C13195u> interfaceC6108l) {
        super(interfaceC6108l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final boolean m5743G(AbstractC11239r<? super E> abstractC11239r) {
        boolean mo5742H = mo5742H(abstractC11239r);
        if (mo5742H) {
            m5738O();
        }
        return mo5742H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [vd.a$b] */
    /* renamed from: Q */
    private final <R> Object m5736Q(int i, InterfaceC1886d<? super R> interfaceC1886d) {
        InterfaceC1886d m34637c;
        C11211c c11211c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k m7714b = C10542m.m7714b(m34637c);
        if (this.f28794w == null) {
            c11211c = new C11210b(m7714b, i);
        } else {
            c11211c = new C11211c(m7714b, i, this.f28794w);
        }
        while (true) {
            if (m5743G(c11211c)) {
                m5735R(m7714b, c11211c);
                break;
            }
            Object mo5737P = mo5737P();
            if (mo5737P instanceof C11233l) {
                c11211c.mo5655D((C11233l) mo5737P);
                break;
            } else if (mo5737P != C11216b.f28790d) {
                m7714b.mo7777o(c11211c.m5731E(mo5737P), c11211c.mo5656B(mo5737P));
                break;
            }
        }
        Object m7728t = m7714b.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m5735R(InterfaceC10529j<?> interfaceC10529j, AbstractC11239r<?> abstractC11239r) {
        interfaceC10529j.mo7778n(new C11213e(abstractC11239r));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p404vd.AbstractC11217c
    /* renamed from: B */
    public InterfaceC11241t<E> mo5747B() {
        InterfaceC11241t<E> mo5747B = super.mo5747B();
        if (mo5747B != null && !(mo5747B instanceof C11233l)) {
            m5739N();
        }
        return mo5747B;
    }

    /* renamed from: F */
    public final boolean m5744F(Throwable th2) {
        boolean mo5642d = mo5642d(th2);
        mo5740L(mo5642d);
        return mo5642d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo5742H(AbstractC11239r<? super E> abstractC11239r) {
        int m19866z;
        C6896t m19873r;
        if (mo5647I()) {
            C6896t m5718o = m5718o();
            do {
                m19873r = m5718o.m19873r();
                if (!(!(m19873r instanceof AbstractC11243v))) {
                    return false;
                }
            } while (!m19873r.m19880j(abstractC11239r, m5718o));
        } else {
            C6896t m5718o2 = m5718o();
            C11214f c11214f = new C11214f(abstractC11239r, this);
            do {
                C6896t m19873r2 = m5718o2.m19873r();
                if (!(!(m19873r2 instanceof AbstractC11243v))) {
                    return false;
                }
                m19866z = m19873r2.m19866z(abstractC11239r, m5718o2, c11214f);
                if (m19866z != 1) {
                }
            } while (m19866z != 2);
            return false;
        }
        return true;
    }

    /* renamed from: I */
    protected abstract boolean mo5647I();

    /* renamed from: J */
    protected abstract boolean mo5646J();

    /* renamed from: K */
    public boolean mo5741K() {
        return m5720m() != null && mo5646J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void mo5740L(boolean z) {
        C11233l<?> m5719n = m5719n();
        if (m5719n != null) {
            Object m19895b = C6889o.m19895b(null, 1, null);
            while (true) {
                C6896t m19873r = m5719n.m19873r();
                if (m19873r instanceof C6894r) {
                    mo5666M(m19895b, m5719n);
                    return;
                } else if (C10539l0.m7720a() && !(m19873r instanceof AbstractC11243v)) {
                    throw new AssertionError();
                } else {
                    if (!m19873r.mo5634v()) {
                        m19873r.m19872s();
                    } else {
                        m19895b = C6889o.m19894c(m19895b, (AbstractC11243v) m19873r);
                    }
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: M */
    protected void mo5666M(Object obj, C11233l<?> c11233l) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((AbstractC11243v) obj).mo5637D(c11233l);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            ((AbstractC11243v) arrayList.get(size)).mo5637D(c11233l);
        }
    }

    /* renamed from: N */
    protected void m5739N() {
    }

    /* renamed from: O */
    protected void m5738O() {
    }

    /* renamed from: P */
    protected Object mo5737P() {
        while (true) {
            AbstractC11243v m5726C = m5726C();
            if (m5726C == null) {
                return C11216b.f28790d;
            }
            C6867h0 mo5636E = m5726C.mo5636E(null);
            if (mo5636E != null) {
                if (C10539l0.m7720a()) {
                    if (!(mo5636E == C10538l.f27253a)) {
                        throw new AssertionError();
                    }
                }
                m5726C.mo5639A();
                return m5726C.mo5674J();
            }
            m5726C.mo5635G();
        }
    }

    @Override // p404vd.InterfaceC11240s
    /* renamed from: e */
    public final void mo5654e(CancellationException cancellationException) {
        if (mo5741K()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(C10543m0.m7712a(this) + " was cancelled");
        }
        m5744F(cancellationException);
    }

    @Override // p404vd.InterfaceC11240s
    /* renamed from: f */
    public final Object mo5653f() {
        Object mo5737P = mo5737P();
        return mo5737P == C11216b.f28790d ? C11227i.f28808b.m5679b() : mo5737P instanceof C11233l ? C11227i.f28808b.m5680a(((C11233l) mo5737P).f28812z) : C11227i.f28808b.m5678c(mo5737P);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p404vd.InterfaceC11240s
    /* renamed from: g */
    public final Object mo5652g(InterfaceC1886d<? super E> interfaceC1886d) {
        Object mo5737P = mo5737P();
        return (mo5737P == C11216b.f28790d || (mo5737P instanceof C11233l)) ? m5736Q(0, interfaceC1886d) : mo5737P;
    }

    @Override // p404vd.InterfaceC11240s
    public final InterfaceC11225g<E> iterator() {
        return new C11209a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // p404vd.InterfaceC11240s
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5651j(bd.InterfaceC1886d<? super p404vd.C11227i<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p404vd.AbstractC11208a.C11215g
            if (r0 == 0) goto L13
            r0 = r5
            vd.a$g r0 = (p404vd.AbstractC11208a.C11215g) r0
            int r1 = r0.f28786y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28786y = r1
            goto L18
        L13:
            vd.a$g r0 = new vd.a$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28784w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f28786y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            java.lang.Object r5 = r4.mo5737P()
            kotlinx.coroutines.internal.h0 r2 = p404vd.C11216b.f28790d
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof p404vd.C11233l
            if (r0 == 0) goto L4b
            vd.i$b r0 = p404vd.C11227i.f28808b
            vd.l r5 = (p404vd.C11233l) r5
            java.lang.Throwable r5 = r5.f28812z
            java.lang.Object r5 = r0.m5680a(r5)
            goto L51
        L4b:
            vd.i$b r0 = p404vd.C11227i.f28808b
            java.lang.Object r5 = r0.m5678c(r5)
        L51:
            return r5
        L52:
            r0.f28786y = r3
            java.lang.Object r5 = r4.m5736Q(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            vd.i r5 = (p404vd.C11227i) r5
            java.lang.Object r5 = r5.m5681k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p404vd.AbstractC11208a.mo5651j(bd.d):java.lang.Object");
    }
}
