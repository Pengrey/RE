package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.Timeout;
import kotlinx.coroutines.internal.AbstractC6852a0;
import kotlinx.coroutines.internal.C6865g0;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6895s;
import kotlinx.coroutines.internal.C6896t;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p337rd.AbstractC9872g;
import p337rd.InterfaceC9870e;
import p337rd.SequenceBuilder;
import p468yc.C13195u;
import p468yc.Exceptions;
import td.InterfaceC10574t1;

/* renamed from: td.a2 */
/* loaded from: classes2.dex */
public class C10479a2 implements InterfaceC10574t1, InterfaceC10564r, InterfaceC10522h2 {

    /* renamed from: w */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27193w = AtomicReferenceFieldUpdater.newUpdater(C10479a2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: td.a2$a */
    /* loaded from: classes2.dex */
    public static final class C10480a<T> extends C10534k {

        /* renamed from: E */
        private final C10479a2 f27194E;

        public C10480a(InterfaceC1886d interfaceC1886d, C10479a2 c10479a2) {
            super(interfaceC1886d, 1);
            this.f27194E = c10479a2;
        }

        /* renamed from: E */
        protected String m7869E() {
            return "AwaitContinuation";
        }

        /* renamed from: s */
        public Throwable m7868s(InterfaceC10574t1 interfaceC10574t1) {
            Throwable m7864e;
            Object m7887i0 = this.f27194E.m7887i0();
            return (!(m7887i0 instanceof C10482c) || (m7864e = ((C10482c) m7887i0).m7864e()) == null) ? m7887i0 instanceof C10590x ? ((C10590x) m7887i0).f27303a : interfaceC10574t1.mo7658e0() : m7864e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: td.a2$b */
    /* loaded from: classes2.dex */
    public static final class C10481b extends AbstractC10601z1 {

        /* renamed from: A */
        private final C10479a2 f27195A;

        /* renamed from: B */
        private final C10482c f27196B;

        /* renamed from: C */
        private final C10559q f27197C;

        /* renamed from: D */
        private final Object f27198D;

        public C10481b(C10479a2 c10479a2, C10482c c10482c, C10559q c10559q, Object obj) {
            this.f27195A = c10479a2;
            this.f27196B = c10482c;
            this.f27197C = c10559q;
            this.f27198D = obj;
        }

        /* renamed from: A */
        public void mo7587A(Throwable th2) {
            C10479a2.m7884m(this.f27195A, this.f27196B, this.f27197C, this.f27198D);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            mo7587A((Throwable) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* renamed from: td.a2$c */
    /* loaded from: classes2.dex */
    public static final class C10482c implements InterfaceC10548n1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: w */
        private final C10503d2 f27199w;

        public C10482c(C10503d2 c10503d2, boolean z, Throwable th2) {
            this.f27199w = c10503d2;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: c */
        private final ArrayList m7866c() {
            return new ArrayList(4);
        }

        /* renamed from: d */
        private final Object m7865d() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m7858l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public boolean mo7698a() {
            return m7864e() == null;
        }

        /* renamed from: b */
        public final void m7867b(Throwable th2) {
            Throwable m7864e = m7864e();
            if (m7864e == null) {
                m7857m(th2);
            } else if (th2 == m7864e) {
            } else {
                Object m7865d = m7865d();
                if (m7865d == null) {
                    m7858l(th2);
                } else if (m7865d instanceof Throwable) {
                    if (th2 == m7865d) {
                        return;
                    }
                    ArrayList m7866c = m7866c();
                    m7866c.add(m7865d);
                    m7866c.add(th2);
                    m7858l(m7866c);
                } else if (m7865d instanceof ArrayList) {
                    ((ArrayList) m7865d).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + m7865d).toString());
                }
            }
        }

        /* renamed from: e */
        public final Throwable m7864e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean m7863f() {
            return m7864e() != null;
        }

        /* renamed from: g */
        public C10503d2 mo7697g() {
            return this.f27199w;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean m7862h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m7861i() {
            C6867h0 c6867h0;
            Object m7865d = m7865d();
            c6867h0 = C10488b2.f27212e;
            return m7865d == c6867h0;
        }

        /* renamed from: j */
        public final List m7860j(Throwable th2) {
            ArrayList arrayList;
            C6867h0 c6867h0;
            Object m7865d = m7865d();
            if (m7865d == null) {
                arrayList = m7866c();
            } else if (m7865d instanceof Throwable) {
                ArrayList m7866c = m7866c();
                m7866c.add(m7865d);
                arrayList = m7866c;
            } else if (!(m7865d instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + m7865d).toString());
            } else {
                arrayList = (ArrayList) m7865d;
            }
            Throwable m7864e = m7864e();
            if (m7864e != null) {
                arrayList.add(0, m7864e);
            }
            if (th2 != null && !Intrinsics.equals(th2, m7864e)) {
                arrayList.add(th2);
            }
            c6867h0 = C10488b2.f27212e;
            m7858l(c6867h0);
            return arrayList;
        }

        /* renamed from: k */
        public final void m7859k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void m7857m(Throwable th2) {
            this._rootCause = th2;
        }

        public String toString() {
            return "Finishing[cancelling=" + m7863f() + ", completing=" + m7862h() + ", rootCause=" + m7864e() + ", exceptions=" + m7865d() + ", list=" + mo7697g() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* renamed from: td.a2$d */
    /* loaded from: classes2.dex */
    public static final class C10483d extends C6896t.AbstractC6897a {

        /* renamed from: d */
        final /* synthetic */ C10479a2 f27200d;

        /* renamed from: e */
        final /* synthetic */ Object f27201e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10483d(C6896t c6896t, C10479a2 c10479a2, Object obj) {
            super(c6896t);
            this.f27200d = c10479a2;
            this.f27201e = obj;
        }

        /* renamed from: i */
        public Object mo5729i(C6896t c6896t) {
            if (this.f27200d.m7887i0() == this.f27201e) {
                return null;
            }
            return C6895s.m19884a();
        }
    }

    /* compiled from: JobSupport.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.JobSupport$children$1", m20196f = "JobSupport.kt", m20195l = {952, 954}, m20194m = "invokeSuspend")
    /* renamed from: td.a2$e */
    /* loaded from: classes2.dex */
    static final class C10484e extends AbstractC6763k implements InterfaceC6112p {

        /* renamed from: A */
        private /* synthetic */ Object f27202A;

        /* renamed from: x */
        Object f27204x;

        /* renamed from: y */
        Object f27205y;

        /* renamed from: z */
        int f27206z;

        C10484e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10484e c10484e = new C10484e(interfaceC1886d);
            c10484e.f27202A = obj;
            return c10484e;
        }

        /* renamed from: d */
        public final Object mo39856d(AbstractC9872g abstractC9872g, InterfaceC1886d interfaceC1886d) {
            return ((C10484e) create(abstractC9872g, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r7.f27206z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f27205y
                kotlinx.coroutines.internal.t r1 = (kotlinx.coroutines.internal.C6896t) r1
                java.lang.Object r3 = r7.f27204x
                kotlinx.coroutines.internal.r r3 = (kotlinx.coroutines.internal.C6894r) r3
                java.lang.Object r4 = r7.f27202A
                rd.g r4 = (p337rd.AbstractC9872g) r4
                p468yc.C13186n.m1453b(r8)
                r8 = r7
                goto L7e
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                p468yc.C13186n.m1453b(r8)
                goto L83
            L2b:
                p468yc.C13186n.m1453b(r8)
                java.lang.Object r8 = r7.f27202A
                rd.g r8 = (p337rd.AbstractC9872g) r8
                td.a2 r1 = td.C10479a2.this
                java.lang.Object r1 = r1.m7887i0()
                boolean r4 = r1 instanceof td.C10559q
                if (r4 == 0) goto L49
                td.q r1 = (td.C10559q) r1
                td.r r1 = r1.f27274A
                r7.f27206z = r3
                java.lang.Object r8 = r8.mo9772a(r1, r7)
                if (r8 != r0) goto L83
                return r0
            L49:
                boolean r3 = r1 instanceof td.InterfaceC10548n1
                if (r3 == 0) goto L83
                td.n1 r1 = (td.InterfaceC10548n1) r1
                td.d2 r1 = r1.mo7697g()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.m19875o()
                kotlinx.coroutines.internal.t r3 = (kotlinx.coroutines.internal.C6896t) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L60:
                boolean r5 = p181jd.Intrinsics.equals(r1, r3)
                if (r5 != 0) goto L83
                boolean r5 = r1 instanceof td.C10559q
                if (r5 == 0) goto L7e
                r5 = r1
                td.q r5 = (td.C10559q) r5
                td.r r5 = r5.f27274A
                r8.f27202A = r4
                r8.f27204x = r3
                r8.f27205y = r1
                r8.f27206z = r2
                java.lang.Object r5 = r4.mo9772a(r5, r8)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                kotlinx.coroutines.internal.t r1 = r1.m19874p()
                goto L60
            L83:
                yc.u r8 = p468yc.C13195u.f34156a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: td.C10479a2.C10484e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C10479a2(boolean z) {
        this._state = z ? C10488b2.f27214g : C10488b2.f27213f;
        this._parentHandle = null;
    }

    /* renamed from: C0 */
    private final C10559q m7919C0(C6896t c6896t) {
        while (c6896t.mo19885u()) {
            c6896t = c6896t.m19873r();
        }
        while (true) {
            c6896t = c6896t.m19874p();
            if (!c6896t.mo19885u()) {
                if (c6896t instanceof C10559q) {
                    return (C10559q) c6896t;
                }
                if (c6896t instanceof C10503d2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: D */
    private final Object m7918D(Object obj) {
        C6867h0 c6867h0;
        Object m7894T0;
        C6867h0 c6867h02;
        do {
            Object m7887i0 = m7887i0();
            if (!(m7887i0 instanceof InterfaceC10548n1) || ((m7887i0 instanceof C10482c) && ((C10482c) m7887i0).m7862h())) {
                c6867h0 = C10488b2.f27208a;
                return c6867h0;
            }
            m7894T0 = m7894T0(m7887i0, new C10590x(m7902O(obj), false, 2, null));
            c6867h02 = C10488b2.f27210c;
        } while (m7894T0 == c6867h02);
        return m7894T0;
    }

    /* renamed from: D0 */
    private final void m7917D0(C10503d2 c10503d2, Throwable th2) {
        m7915F0(th2);
        CompletionHandlerException completionHandlerException = null;
        for (C6896t c6896t = (C6896t) c10503d2.m19875o(); !Intrinsics.equals(c6896t, c10503d2); c6896t = c6896t.m19874p()) {
            if (c6896t instanceof AbstractC10580u1) {
                AbstractC10601z1 abstractC10601z1 = (AbstractC10601z1) c6896t;
                try {
                    abstractC10601z1.mo7587A(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        Exceptions.m1470a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC10601z1 + " for " + this, th3);
                        C13195u c13195u = C13195u.f34156a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo7927m0(completionHandlerException);
        }
        m7914G(th2);
    }

    /* renamed from: E0 */
    private final void m7916E0(C10503d2 c10503d2, Throwable th2) {
        CompletionHandlerException completionHandlerException = null;
        for (C6896t c6896t = (C6896t) c10503d2.m19875o(); !Intrinsics.equals(c6896t, c10503d2); c6896t = c6896t.m19874p()) {
            if (c6896t instanceof AbstractC10601z1) {
                AbstractC10601z1 abstractC10601z1 = (AbstractC10601z1) c6896t;
                try {
                    abstractC10601z1.mo7587A(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        Exceptions.m1470a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC10601z1 + " for " + this, th3);
                        C13195u c13195u = C13195u.f34156a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo7927m0(completionHandlerException);
        }
    }

    /* renamed from: G */
    private final boolean m7914G(Throwable th2) {
        if (mo20001r0()) {
            return true;
        }
        boolean z = th2 instanceof CancellationException;
        InterfaceC10554p m7888h0 = m7888h0();
        return (m7888h0 == null || m7888h0 == C10513f2.f27237w) ? z : m7888h0.mo7681e(th2) || z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [td.m1] */
    /* renamed from: I0 */
    private final void m7910I0(C10487b1 c10487b1) {
        C10503d2 c10503d2 = new C10503d2();
        if (!c10487b1.mo7698a()) {
            c10503d2 = new C10544m1(c10503d2);
        }
        f27193w.compareAndSet(this, c10487b1, c10503d2);
    }

    /* renamed from: J0 */
    private final void m7909J0(AbstractC10601z1 abstractC10601z1) {
        abstractC10601z1.m19879k(new C10503d2());
        f27193w.compareAndSet(this, abstractC10601z1, abstractC10601z1.m19874p());
    }

    /* renamed from: K */
    private final void m7908K(InterfaceC10548n1 interfaceC10548n1, Object obj) {
        InterfaceC10554p m7888h0 = m7888h0();
        if (m7888h0 != null) {
            m7888h0.mo6823b();
            m7906L0(C10513f2.f27237w);
        }
        C10590x c10590x = obj instanceof C10590x ? (C10590x) obj : null;
        Throwable th2 = c10590x != null ? c10590x.f27303a : null;
        if (interfaceC10548n1 instanceof AbstractC10601z1) {
            try {
                ((AbstractC10601z1) interfaceC10548n1).mo7587A(th2);
                return;
            } catch (Throwable th3) {
                mo7927m0(new CompletionHandlerException("Exception in completion handler " + interfaceC10548n1 + " for " + this, th3));
                return;
            }
        }
        C10503d2 mo7697g = interfaceC10548n1.mo7697g();
        if (mo7697g != null) {
            m7916E0(mo7697g, th2);
        }
    }

    /* renamed from: M0 */
    private final int m7905M0(Object obj) {
        C10487b1 c10487b1;
        if (obj instanceof C10487b1) {
            if (((C10487b1) obj).mo7698a()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27193w;
            c10487b1 = C10488b2.f27214g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c10487b1)) {
                mo20018H0();
                return 1;
            }
            return -1;
        } else if (obj instanceof C10544m1) {
            if (f27193w.compareAndSet(this, obj, ((C10544m1) obj).mo7697g())) {
                mo20018H0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    /* renamed from: N */
    private final void m7904N(C10482c c10482c, C10559q c10559q, Object obj) {
        if (C10539l0.m7720a()) {
            if (!(m7887i0() == c10482c)) {
                throw new AssertionError();
            }
        }
        C10559q m7919C0 = m7919C0(c10559q);
        if (m7919C0 == null || !m7891V0(c10482c, m7919C0, obj)) {
            mo7662s(m7899Q(c10482c, obj));
        }
    }

    /* renamed from: N0 */
    private final String m7903N0(Object obj) {
        if (!(obj instanceof C10482c)) {
            return obj instanceof InterfaceC10548n1 ? ((InterfaceC10548n1) obj).mo7698a() ? "Active" : "New" : obj instanceof C10590x ? "Cancelled" : "Completed";
        }
        C10482c c10482c = (C10482c) obj;
        return c10482c.m7863f() ? "Cancelling" : c10482c.m7862h() ? "Completing" : "Active";
    }

    /* renamed from: O */
    private final Throwable m7902O(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new kotlinx.coroutines.Exceptions(m7885l(this), null, this) : th2;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC10522h2) obj).mo7783b0();
    }

    /* renamed from: P0 */
    public static /* synthetic */ CancellationException m7900P0(C10479a2 c10479a2, Throwable th2, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c10479a2.m7901O0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: Q */
    private final Object m7899Q(C10482c c10482c, Object obj) {
        boolean m7863f;
        Throwable m7890Y;
        boolean z = true;
        if (C10539l0.m7720a()) {
            if (!(m7887i0() == c10482c)) {
                throw new AssertionError();
            }
        }
        if (!C10539l0.m7720a() || (!c10482c.m7861i())) {
            if (!C10539l0.m7720a() || c10482c.m7862h()) {
                C10590x c10590x = obj instanceof C10590x ? (C10590x) obj : null;
                Throwable th2 = c10590x != null ? c10590x.f27303a : null;
                synchronized (c10482c) {
                    m7863f = c10482c.m7863f();
                    List m7860j = c10482c.m7860j(th2);
                    m7890Y = m7890Y(c10482c, m7860j);
                    if (m7890Y != null) {
                        m7879r(m7890Y, m7860j);
                    }
                }
                if (m7890Y != null && m7890Y != th2) {
                    obj = new C10590x(m7890Y, false, 2, null);
                }
                if (m7890Y != null) {
                    if (!m7914G(m7890Y) && !mo19832k0(m7890Y)) {
                        z = false;
                    }
                    if (z) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((C10590x) obj).m7601b();
                    }
                }
                if (!m7863f) {
                    m7915F0(m7890Y);
                }
                mo7930G0(obj);
                boolean compareAndSet = f27193w.compareAndSet(this, c10482c, C10488b2.m7846g(obj));
                if (!C10539l0.m7720a() || compareAndSet) {
                    m7908K(c10482c, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: R0 */
    private final boolean m7897R0(InterfaceC10548n1 interfaceC10548n1, Object obj) {
        if (C10539l0.m7720a()) {
            if (!((interfaceC10548n1 instanceof C10487b1) || (interfaceC10548n1 instanceof AbstractC10601z1))) {
                throw new AssertionError();
            }
        }
        if (!C10539l0.m7720a() || (!(obj instanceof C10590x))) {
            if (f27193w.compareAndSet(this, interfaceC10548n1, C10488b2.m7846g(obj))) {
                m7915F0(null);
                mo7930G0(obj);
                m7908K(interfaceC10548n1, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: S0 */
    private final boolean m7896S0(InterfaceC10548n1 interfaceC10548n1, Throwable th2) {
        if (!C10539l0.m7720a() || (!(interfaceC10548n1 instanceof C10482c))) {
            if (!C10539l0.m7720a() || interfaceC10548n1.mo7698a()) {
                C10503d2 m7889g0 = m7889g0(interfaceC10548n1);
                if (m7889g0 == null) {
                    return false;
                }
                if (f27193w.compareAndSet(this, interfaceC10548n1, new C10482c(m7889g0, false, th2))) {
                    m7917D0(m7889g0, th2);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: T */
    private final C10559q m7895T(InterfaceC10548n1 interfaceC10548n1) {
        C10559q c10559q = interfaceC10548n1 instanceof C10559q ? (C10559q) interfaceC10548n1 : null;
        if (c10559q == null) {
            C10503d2 mo7697g = interfaceC10548n1.mo7697g();
            if (mo7697g != null) {
                return m7919C0(mo7697g);
            }
            return null;
        }
        return c10559q;
    }

    /* renamed from: T0 */
    private final Object m7894T0(Object obj, Object obj2) {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        if (!(obj instanceof InterfaceC10548n1)) {
            c6867h02 = C10488b2.f27208a;
            return c6867h02;
        } else if (((obj instanceof C10487b1) || (obj instanceof AbstractC10601z1)) && !(obj instanceof C10559q) && !(obj2 instanceof C10590x)) {
            if (m7897R0((InterfaceC10548n1) obj, obj2)) {
                return obj2;
            }
            c6867h0 = C10488b2.f27210c;
            return c6867h0;
        } else {
            return m7892U0((InterfaceC10548n1) obj, obj2);
        }
    }

    /* renamed from: U */
    private final Throwable m7893U(Object obj) {
        C10590x c10590x = obj instanceof C10590x ? (C10590x) obj : null;
        if (c10590x != null) {
            return c10590x.f27303a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U0 */
    private final Object m7892U0(InterfaceC10548n1 interfaceC10548n1, Object obj) {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        C6867h0 c6867h03;
        C10503d2 m7889g0 = m7889g0(interfaceC10548n1);
        if (m7889g0 == null) {
            c6867h03 = C10488b2.f27210c;
            return c6867h03;
        }
        C10482c c10482c = interfaceC10548n1 instanceof C10482c ? (C10482c) interfaceC10548n1 : null;
        if (c10482c == null) {
            c10482c = new C10482c(m7889g0, false, null);
        }
        C6449y c6449y = new C6449y();
        synchronized (c10482c) {
            if (c10482c.m7862h()) {
                c6867h02 = C10488b2.f27208a;
                return c6867h02;
            }
            c10482c.m7859k(true);
            if (c10482c != interfaceC10548n1 && !f27193w.compareAndSet(this, interfaceC10548n1, c10482c)) {
                c6867h0 = C10488b2.f27210c;
                return c6867h0;
            }
            if (C10539l0.m7720a() && !(!c10482c.m7861i())) {
                throw new AssertionError();
            }
            boolean m7863f = c10482c.m7863f();
            C10590x c10590x = obj instanceof C10590x ? (C10590x) obj : null;
            if (c10590x != null) {
                c10482c.m7867b(c10590x.f27303a);
            }
            T m7864e = Boolean.valueOf(m7863f ? false : true).booleanValue() ? c10482c.m7864e() : 0;
            c6449y.f17533w = m7864e;
            C13195u c13195u = C13195u.f34156a;
            Throwable th2 = (Throwable) m7864e;
            if (th2 != null) {
                m7917D0(m7889g0, th2);
            }
            C10559q m7895T = m7895T(interfaceC10548n1);
            if (m7895T != null && m7891V0(c10482c, m7895T, obj)) {
                return C10488b2.f27209b;
            }
            return m7899Q(c10482c, obj);
        }
    }

    /* renamed from: V0 */
    private final boolean m7891V0(C10482c c10482c, C10559q c10559q, Object obj) {
        while (InterfaceC10574t1.C10575a.m7651d(c10559q.f27274A, false, false, new C10481b(this, c10482c, c10559q, obj), 1, null) == C10513f2.f27237w) {
            c10559q = m7919C0(c10559q);
            if (c10559q == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y */
    private final Throwable m7890Y(C10482c c10482c, List list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (c10482c.m7863f()) {
                return new kotlinx.coroutines.Exceptions(m7885l(this), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof Timeout) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 == th3 || !(th4 instanceof Timeout)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* renamed from: g0 */
    private final C10503d2 m7889g0(InterfaceC10548n1 interfaceC10548n1) {
        C10503d2 mo7697g = interfaceC10548n1.mo7697g();
        if (mo7697g == null) {
            if (interfaceC10548n1 instanceof C10487b1) {
                return new C10503d2();
            }
            if (interfaceC10548n1 instanceof AbstractC10601z1) {
                m7909J0((AbstractC10601z1) interfaceC10548n1);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC10548n1).toString());
        }
        return mo7697g;
    }

    /* renamed from: l */
    public static final /* synthetic */ String m7885l(C10479a2 c10479a2) {
        return c10479a2.mo7929I();
    }

    /* renamed from: m */
    public static final /* synthetic */ void m7884m(C10479a2 c10479a2, C10482c c10482c, C10559q c10559q, Object obj) {
        c10479a2.m7904N(c10482c, c10559q, obj);
    }

    /* renamed from: q */
    private final boolean m7880q(Object obj, C10503d2 c10503d2, AbstractC10601z1 abstractC10601z1) {
        int m19866z;
        C10483d c10483d = new C10483d(abstractC10601z1, this, obj);
        do {
            m19866z = c10503d2.m19873r().m19866z(abstractC10601z1, c10503d2, c10483d);
            if (m19866z == 1) {
                return true;
            }
        } while (m19866z != 2);
        return false;
    }

    /* renamed from: r */
    private final void m7879r(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable m19966n = !C10539l0.m7717d() ? th2 : C6865g0.m19966n(th2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (C10539l0.m7717d()) {
                th3 = C6865g0.m19966n(th3);
            }
            if (th3 != th2 && th3 != m19966n && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                Exceptions.m1470a(th2, th3);
            }
        }
    }

    /* renamed from: s0 */
    private final boolean m7877s0() {
        Object m7887i0;
        do {
            m7887i0 = m7887i0();
            if (!(m7887i0 instanceof InterfaceC10548n1)) {
                return false;
            }
        } while (m7905M0(m7887i0) < 0);
        return true;
    }

    /* renamed from: t0 */
    private final Object m7876t0(InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        C10542m.m7715a(c10534k, mo7659X(new C10537k2(c10534k)));
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
    }

    /* renamed from: u0 */
    private final Object m7875u0(Object obj) {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        C6867h0 c6867h03;
        C6867h0 c6867h04;
        C6867h0 c6867h05;
        C6867h0 c6867h06;
        Throwable th2 = null;
        while (true) {
            Object m7887i0 = m7887i0();
            if (m7887i0 instanceof C10482c) {
                synchronized (m7887i0) {
                    if (((C10482c) m7887i0).m7861i()) {
                        c6867h02 = C10488b2.f27211d;
                        return c6867h02;
                    }
                    boolean m7863f = ((C10482c) m7887i0).m7863f();
                    if (obj != null || !m7863f) {
                        if (th2 == null) {
                            th2 = m7902O(obj);
                        }
                        ((C10482c) m7887i0).m7867b(th2);
                    }
                    Throwable m7864e = m7863f ^ true ? ((C10482c) m7887i0).m7864e() : null;
                    if (m7864e != null) {
                        m7917D0(((C10482c) m7887i0).mo7697g(), m7864e);
                    }
                    c6867h0 = C10488b2.f27208a;
                    return c6867h0;
                }
            } else if (!(m7887i0 instanceof InterfaceC10548n1)) {
                c6867h03 = C10488b2.f27211d;
                return c6867h03;
            } else {
                if (th2 == null) {
                    th2 = m7902O(obj);
                }
                InterfaceC10548n1 interfaceC10548n1 = (InterfaceC10548n1) m7887i0;
                if (interfaceC10548n1.mo7698a()) {
                    if (m7896S0(interfaceC10548n1, th2)) {
                        c6867h04 = C10488b2.f27208a;
                        return c6867h04;
                    }
                } else {
                    Object m7894T0 = m7894T0(m7887i0, new C10590x(th2, false, 2, null));
                    c6867h05 = C10488b2.f27208a;
                    if (m7894T0 != c6867h05) {
                        c6867h06 = C10488b2.f27210c;
                        if (m7894T0 != c6867h06) {
                            return m7894T0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + m7887i0).toString());
                    }
                }
            }
        }
    }

    /* renamed from: z */
    private final Object m7871z(InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10480a c10480a = new C10480a(m34637c, this);
        c10480a.m7723y();
        C10542m.m7715a(c10480a, mo7659X(new C10533j2(c10480a)));
        Object m7728t = c10480a.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    /* renamed from: z0 */
    private final AbstractC10601z1 m7870z0(InterfaceC6108l interfaceC6108l, boolean z) {
        AbstractC10601z1 abstractC10601z1;
        if (z) {
            abstractC10601z1 = interfaceC6108l instanceof AbstractC10580u1 ? (AbstractC10580u1) interfaceC6108l : null;
            if (abstractC10601z1 == null) {
                abstractC10601z1 = new C10566r1(interfaceC6108l);
            }
        } else {
            abstractC10601z1 = interfaceC6108l instanceof AbstractC10601z1 ? (AbstractC10601z1) interfaceC6108l : null;
            if (abstractC10601z1 != null) {
                if (C10539l0.m7720a() && !(!(abstractC10601z1 instanceof AbstractC10580u1))) {
                    throw new AssertionError();
                }
            } else {
                abstractC10601z1 = new C10570s1(interfaceC6108l);
            }
        }
        abstractC10601z1.m7585D(this);
        return abstractC10601z1;
    }

    /* renamed from: A */
    public final boolean m7921A(Throwable th2) {
        return m7920B(th2);
    }

    /* renamed from: A0 */
    public final InterfaceC10595y0 mo7661A0(boolean z, boolean z2, InterfaceC6108l interfaceC6108l) {
        AbstractC10601z1 m7870z0 = m7870z0(interfaceC6108l, z);
        while (true) {
            Object m7887i0 = m7887i0();
            if (m7887i0 instanceof C10487b1) {
                C10487b1 c10487b1 = (C10487b1) m7887i0;
                if (c10487b1.mo7698a()) {
                    if (f27193w.compareAndSet(this, m7887i0, m7870z0)) {
                        return m7870z0;
                    }
                } else {
                    m7910I0(c10487b1);
                }
            } else {
                if (m7887i0 instanceof InterfaceC10548n1) {
                    C10503d2 mo7697g = ((InterfaceC10548n1) m7887i0).mo7697g();
                    if (mo7697g == null) {
                        Objects.requireNonNull(m7887i0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m7909J0((AbstractC10601z1) m7887i0);
                    } else {
                        InterfaceC10595y0 interfaceC10595y0 = C10513f2.f27237w;
                        if (z && (m7887i0 instanceof C10482c)) {
                            synchronized (m7887i0) {
                                r3 = ((C10482c) m7887i0).m7864e();
                                if (r3 == null || ((interfaceC6108l instanceof C10559q) && !((C10482c) m7887i0).m7862h())) {
                                    if (m7880q(m7887i0, mo7697g, m7870z0)) {
                                        if (r3 == null) {
                                            return m7870z0;
                                        }
                                        interfaceC10595y0 = m7870z0;
                                    }
                                }
                                C13195u c13195u = C13195u.f34156a;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                interfaceC6108l.mo9587d(r3);
                            }
                            return interfaceC10595y0;
                        } else if (m7880q(m7887i0, mo7697g, m7870z0)) {
                            return m7870z0;
                        }
                    }
                } else {
                    if (z2) {
                        C10590x c10590x = m7887i0 instanceof C10590x ? (C10590x) m7887i0 : null;
                        interfaceC6108l.mo9587d(c10590x != null ? c10590x.f27303a : null);
                    }
                    return C10513f2.f27237w;
                }
            }
        }
    }

    /* renamed from: B */
    public final boolean m7920B(Object obj) {
        Object obj2;
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        C6867h0 c6867h03;
        obj2 = C10488b2.f27208a;
        if (mo7629c0() && (obj2 = m7918D(obj)) == C10488b2.f27209b) {
            return true;
        }
        c6867h0 = C10488b2.f27208a;
        if (obj2 == c6867h0) {
            obj2 = m7875u0(obj);
        }
        c6867h02 = C10488b2.f27208a;
        if (obj2 == c6867h02 || obj2 == C10488b2.f27209b) {
            return true;
        }
        c6867h03 = C10488b2.f27211d;
        if (obj2 == c6867h03) {
            return false;
        }
        mo7662s(obj2);
        return true;
    }

    /* renamed from: B0 */
    public String mo7648B0() {
        return C10543m0.m7712a(this);
    }

    /* renamed from: C */
    public void mo5697C(Throwable th2) {
        m7920B(th2);
    }

    /* renamed from: F0 */
    protected void m7915F0(Throwable th2) {
    }

    /* renamed from: G0 */
    protected void mo7930G0(Object obj) {
    }

    /* renamed from: H */
    public final InterfaceC9870e mo7660H() {
        InterfaceC9870e m9762b;
        m9762b = SequenceBuilder.m9762b(new C10484e(null));
        return m9762b;
    }

    /* renamed from: H0 */
    protected void mo20018H0() {
    }

    /* renamed from: I */
    protected String mo7929I() {
        return "Job was cancelled";
    }

    /* renamed from: J */
    public boolean mo4543J(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m7920B(th2) && mo7630Z();
    }

    /* renamed from: K0 */
    public final void m7907K0(AbstractC10601z1 abstractC10601z1) {
        Object m7887i0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C10487b1 c10487b1;
        do {
            m7887i0 = m7887i0();
            if (!(m7887i0 instanceof AbstractC10601z1)) {
                if (!(m7887i0 instanceof InterfaceC10548n1) || ((InterfaceC10548n1) m7887i0).mo7697g() == null) {
                    return;
                }
                abstractC10601z1.mo5634v();
                return;
            } else if (m7887i0 != abstractC10601z1) {
                return;
            } else {
                atomicReferenceFieldUpdater = f27193w;
                c10487b1 = C10488b2.f27214g;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, m7887i0, c10487b1));
    }

    /* renamed from: L0 */
    public final void m7906L0(InterfaceC10554p interfaceC10554p) {
        this._parentHandle = interfaceC10554p;
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC10574t1.C10575a.m7653b(this, obj, interfaceC6112p);
    }

    /* renamed from: O0 */
    protected final CancellationException m7901O0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = m7885l(this);
            }
            cancellationException = new kotlinx.coroutines.Exceptions(str, th2, this);
        }
        return cancellationException;
    }

    /* renamed from: Q0 */
    public final String m7898Q0() {
        return mo7648B0() + '{' + m7903N0(m7887i0()) + '}';
    }

    /* renamed from: W */
    public final void mo7678W(InterfaceC10522h2 interfaceC10522h2) {
        m7920B(interfaceC10522h2);
    }

    /* renamed from: X */
    public final InterfaceC10595y0 mo7659X(InterfaceC6108l interfaceC6108l) {
        return mo7661A0(false, true, interfaceC6108l);
    }

    /* renamed from: Z */
    public boolean mo7630Z() {
        return true;
    }

    /* renamed from: a */
    public boolean mo5659a() {
        Object m7887i0 = m7887i0();
        return (m7887i0 instanceof InterfaceC10548n1) && ((InterfaceC10548n1) m7887i0).mo7698a();
    }

    /* renamed from: b0 */
    public CancellationException mo7783b0() {
        Throwable th2;
        Object m7887i0 = m7887i0();
        if (m7887i0 instanceof C10482c) {
            th2 = ((C10482c) m7887i0).m7864e();
        } else if (m7887i0 instanceof C10590x) {
            th2 = ((C10590x) m7887i0).f27303a;
        } else if (m7887i0 instanceof InterfaceC10548n1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m7887i0).toString());
        } else {
            th2 = null;
        }
        CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
        if (cancellationException == null) {
            return new kotlinx.coroutines.Exceptions("Parent job is " + m7903N0(m7887i0), th2, this);
        }
        return cancellationException;
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return InterfaceC10574t1.C10575a.m7652c(this, interfaceC1893c);
    }

    /* renamed from: c0 */
    public boolean mo7629c0() {
        return false;
    }

    /* renamed from: e */
    public void mo5695e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new kotlinx.coroutines.Exceptions(m7885l(this), null, this);
        }
        mo5697C(cancellationException);
    }

    /* renamed from: e0 */
    public final CancellationException mo7658e0() {
        Object m7887i0 = m7887i0();
        if (m7887i0 instanceof C10482c) {
            Throwable m7864e = ((C10482c) m7887i0).m7864e();
            if (m7864e != null) {
                CancellationException m7901O0 = m7901O0(m7864e, C10543m0.m7712a(this) + " is cancelling");
                if (m7901O0 != null) {
                    return m7901O0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(m7887i0 instanceof InterfaceC10548n1)) {
            if (m7887i0 instanceof C10590x) {
                return m7900P0(this, ((C10590x) m7887i0).f27303a, null, 1, null);
            }
            return new kotlinx.coroutines.Exceptions(C10543m0.m7712a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return InterfaceC10574t1.C10575a.m7649f(this, coroutineContext);
    }

    public final CoroutineContext.InterfaceC1893c getKey() {
        return InterfaceC10574t1.f27288s;
    }

    /* renamed from: h0 */
    public final InterfaceC10554p m7888h0() {
        return (InterfaceC10554p) this._parentHandle;
    }

    /* renamed from: i0 */
    public final Object m7887i0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC6852a0)) {
                return obj;
            }
            ((AbstractC6852a0) obj).mo20008c(this);
        }
    }

    /* renamed from: j0 */
    public final boolean mo7657j0() {
        return !(m7887i0() instanceof InterfaceC10548n1);
    }

    /* renamed from: k0 */
    protected boolean mo19832k0(Throwable th2) {
        return false;
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return InterfaceC10574t1.C10575a.m7650e(this, interfaceC1893c);
    }

    /* renamed from: m0 */
    public void mo7927m0(Throwable th2) {
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void m7882n0(InterfaceC10574t1 interfaceC10574t1) {
        if (C10539l0.m7720a()) {
            if (!(m7888h0() == null)) {
                throw new AssertionError();
            }
        }
        if (interfaceC10574t1 == null) {
            m7906L0(C10513f2.f27237w);
            return;
        }
        interfaceC10574t1.start();
        InterfaceC10554p mo7656t = interfaceC10574t1.mo7656t(this);
        m7906L0(mo7656t);
        if (mo7657j0()) {
            mo7656t.mo6823b();
            m7906L0(C10513f2.f27237w);
        }
    }

    /* renamed from: p0 */
    public final boolean m7881p0() {
        Object m7887i0 = m7887i0();
        return (m7887i0 instanceof C10590x) || ((m7887i0 instanceof C10482c) && ((C10482c) m7887i0).m7863f());
    }

    /* renamed from: r0 */
    protected boolean mo20001r0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void mo7662s(Object obj) {
    }

    public final boolean start() {
        int m7905M0;
        do {
            m7905M0 = m7905M0(m7887i0());
            if (m7905M0 == 0) {
                return false;
            }
        } while (m7905M0 != 1);
        return true;
    }

    /* renamed from: t */
    public final InterfaceC10554p mo7656t(InterfaceC10564r interfaceC10564r) {
        return (InterfaceC10554p) InterfaceC10574t1.C10575a.m7651d(this, true, false, new C10559q(interfaceC10564r), 2, null);
    }

    public String toString() {
        return m7898Q0() + '@' + C10543m0.m7711b(this);
    }

    /* renamed from: v */
    public final Object mo7655v(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        if (!m7877s0()) {
            C10588w1.m7609j(interfaceC1886d.getContext());
            return C13195u.f34156a;
        }
        Object m7876t0 = m7876t0(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7876t0 == m34636d ? m7876t0 : C13195u.f34156a;
    }

    /* renamed from: w */
    public final Object m7874w(InterfaceC1886d interfaceC1886d) {
        Object m7887i0;
        do {
            m7887i0 = m7887i0();
            if (!(m7887i0 instanceof InterfaceC10548n1)) {
                if (m7887i0 instanceof C10590x) {
                    Throwable th2 = ((C10590x) m7887i0).f27303a;
                    if (C10539l0.m7717d()) {
                        if (interfaceC1886d instanceof InterfaceC6758e) {
                            throw C6865g0.m19979a(th2, (InterfaceC6758e) interfaceC1886d);
                        }
                        throw th2;
                    }
                    throw th2;
                }
                return C10488b2.m7845h(m7887i0);
            }
        } while (m7905M0(m7887i0) < 0);
        return m7871z(interfaceC1886d);
    }

    /* renamed from: w0 */
    public final boolean m7873w0(Object obj) {
        Object m7894T0;
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        do {
            m7894T0 = m7894T0(m7887i0(), obj);
            c6867h0 = C10488b2.f27208a;
            if (m7894T0 == c6867h0) {
                return false;
            }
            if (m7894T0 == C10488b2.f27209b) {
                return true;
            }
            c6867h02 = C10488b2.f27210c;
        } while (m7894T0 == c6867h02);
        mo7662s(m7894T0);
        return true;
    }

    /* renamed from: y0 */
    public final Object m7872y0(Object obj) {
        Object m7894T0;
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        do {
            m7894T0 = m7894T0(m7887i0(), obj);
            c6867h0 = C10488b2.f27208a;
            if (m7894T0 != c6867h0) {
                c6867h02 = C10488b2.f27210c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m7893U(obj));
            }
        } while (m7894T0 == c6867h02);
        return m7894T0;
    }
}
