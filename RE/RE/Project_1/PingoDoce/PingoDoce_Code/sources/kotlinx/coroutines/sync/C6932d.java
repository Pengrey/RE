package kotlinx.coroutines.sync;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.AbstractC6852a0;
import kotlinx.coroutines.internal.AbstractC6855c;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6894r;
import kotlinx.coroutines.internal.C6896t;
import p181jd.AbstractC6438m;
import p468yc.C13195u;
import td.C10538l;
import td.InterfaceC10529j;
import td.InterfaceC10595y0;

/* renamed from: kotlinx.coroutines.sync.d */
/* loaded from: classes2.dex */
public final class C6932d implements InterfaceC6930c {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18427a = AtomicReferenceFieldUpdater.newUpdater(C6932d.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.d$a */
    /* loaded from: classes2.dex */
    public final class C6933a extends AbstractC6935b {

        /* renamed from: B */
        private final InterfaceC10529j<C13195u> f18428B;

        /* compiled from: Mutex.kt */
        /* renamed from: kotlinx.coroutines.sync.d$a$a */
        /* loaded from: classes2.dex */
        static final class C6934a extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

            /* renamed from: w */
            final /* synthetic */ C6932d f18430w;

            /* renamed from: x */
            final /* synthetic */ C6933a f18431x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6934a(C6932d c6932d, C6933a c6933a) {
                super(1);
                this.f18430w = c6932d;
                this.f18431x = c6933a;
            }

            @Override // id.InterfaceC6108l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
                invoke2(th2);
                return C13195u.f34156a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                this.f18430w.mo19770a(this.f18431x.f18433z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C6933a(Object obj, InterfaceC10529j<? super C13195u> interfaceC10529j) {
            super(C6932d.this, obj);
            this.f18428B = interfaceC10529j;
        }

        @Override // kotlinx.coroutines.sync.C6932d.AbstractC6935b
        /* renamed from: A */
        public void mo19766A() {
            this.f18428B.mo7781S(C10538l.f27253a);
        }

        @Override // kotlinx.coroutines.sync.C6932d.AbstractC6935b
        /* renamed from: D */
        public boolean mo19764D() {
            return m19765B() && this.f18428B.mo7775u(C13195u.f34156a, null, new C6934a(C6932d.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.C6896t
        public String toString() {
            return "LockCont[" + this.f18433z + ", " + this.f18428B + "] for " + C6932d.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.d$b */
    /* loaded from: classes2.dex */
    public abstract class AbstractC6935b extends C6896t implements InterfaceC10595y0 {

        /* renamed from: A */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f18432A = AtomicIntegerFieldUpdater.newUpdater(AbstractC6935b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: z */
        public final Object f18433z;

        public AbstractC6935b(C6932d c6932d, Object obj) {
            this.f18433z = obj;
        }

        /* renamed from: A */
        public abstract void mo19766A();

        /* renamed from: B */
        public final boolean m19765B() {
            return f18432A.compareAndSet(this, 0, 1);
        }

        /* renamed from: D */
        public abstract boolean mo19764D();

        @Override // td.InterfaceC10595y0
        /* renamed from: b */
        public final void mo6823b() {
            mo5634v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.d$c */
    /* loaded from: classes2.dex */
    public static final class C6936c extends C6894r {
        public volatile Object owner;

        public C6936c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.C6896t
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.d$d */
    /* loaded from: classes2.dex */
    public static final class C6937d extends AbstractC6855c<C6932d> {

        /* renamed from: b */
        public final C6936c f18434b;

        public C6937d(C6936c c6936c) {
            this.f18434b = c6936c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6855c
        /* renamed from: h */
        public void mo19763d(C6932d c6932d, Object obj) {
            C6932d.f18427a.compareAndSet(c6932d, this, obj == null ? C6939e.f18441e : this.f18434b);
        }

        @Override // kotlinx.coroutines.internal.AbstractC6855c
        /* renamed from: i */
        public Object mo5729i(C6932d c6932d) {
            C6867h0 c6867h0;
            if (this.f18434b.m19887A()) {
                return null;
            }
            c6867h0 = C6939e.f18437a;
            return c6867h0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.d$e */
    /* loaded from: classes2.dex */
    public static final class C6938e extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

        /* renamed from: x */
        final /* synthetic */ Object f18436x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6938e(Object obj) {
            super(1);
            this.f18436x = obj;
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            invoke2(th2);
            return C13195u.f34156a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C6932d.this.mo19770a(this.f18436x);
        }
    }

    public C6932d(boolean z) {
        this._state = z ? C6939e.f18440d : C6939e.f18441e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        td.C10542m.m7713c(r0, r1);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m19767d(java.lang.Object r7, bd.InterfaceC1886d<? super p468yc.C13195u> r8) {
        /*
            r6 = this;
            bd.d r0 = cd.C2111b.m34641c(r8)
            td.k r0 = td.C10542m.m7714b(r0)
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C6929b
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.C6929b) r3
            java.lang.Object r4 = r3.f18426a
            kotlinx.coroutines.internal.h0 r5 = kotlinx.coroutines.sync.C6939e.m19755f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C6932d.f18427a
            kotlinx.coroutines.sync.d$c r5 = new kotlinx.coroutines.sync.d$c
            java.lang.Object r3 = r3.f18426a
            r5.<init>(r3)
            r4.compareAndSet(r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.b r3 = kotlinx.coroutines.sync.C6939e.m19758c()
            goto L37
        L32:
            kotlinx.coroutines.sync.b r3 = new kotlinx.coroutines.sync.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C6932d.f18427a
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Ld
            yc.u r1 = p468yc.C13195u.f34156a
            kotlinx.coroutines.sync.d$e r2 = new kotlinx.coroutines.sync.d$e
            r2.<init>(r7)
            r0.mo7777o(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C6932d.C6936c
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.sync.d$c r3 = (kotlinx.coroutines.sync.C6932d.C6936c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.m19881i(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.m19765B()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            td.C10542m.m7713c(r0, r1)
        L71:
            java.lang.Object r7 = r0.m7728t()
            java.lang.Object r0 = cd.C2111b.m34640d()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.DebugProbes.m20186c(r8)
        L7e:
            java.lang.Object r8 = cd.C2111b.m34640d()
            if (r7 != r8) goto L85
            return r7
        L85:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.AbstractC6852a0
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.a0 r2 = (kotlinx.coroutines.internal.AbstractC6852a0) r2
            r2.mo20008c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6932d.m19767d(java.lang.Object, bd.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6930c
    /* renamed from: a */
    public void mo19770a(Object obj) {
        C6929b c6929b;
        C6867h0 c6867h0;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C6929b) {
                if (obj == null) {
                    Object obj3 = ((C6929b) obj2).f18426a;
                    c6867h0 = C6939e.f18439c;
                    if (!(obj3 != c6867h0)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C6929b c6929b2 = (C6929b) obj2;
                    if (!(c6929b2.f18426a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c6929b2.f18426a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18427a;
                c6929b = C6939e.f18441e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c6929b)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC6852a0) {
                ((AbstractC6852a0) obj2).mo20008c(this);
            } else if (obj2 instanceof C6936c) {
                if (obj != null) {
                    C6936c c6936c = (C6936c) obj2;
                    if (!(c6936c.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c6936c.owner + " but expected " + obj).toString());
                    }
                }
                C6936c c6936c2 = (C6936c) obj2;
                C6896t m19869w = c6936c2.m19869w();
                if (m19869w == null) {
                    C6937d c6937d = new C6937d(c6936c2);
                    if (f18427a.compareAndSet(this, obj2, c6937d) && c6937d.mo20008c(this) == null) {
                        return;
                    }
                } else {
                    AbstractC6935b abstractC6935b = (AbstractC6935b) m19869w;
                    if (abstractC6935b.mo19764D()) {
                        Object obj4 = abstractC6935b.f18433z;
                        if (obj4 == null) {
                            obj4 = C6939e.f18438b;
                        }
                        c6936c2.owner = obj4;
                        abstractC6935b.mo19766A();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6930c
    /* renamed from: b */
    public boolean mo19769b(Object obj) {
        C6867h0 c6867h0;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C6929b) {
                Object obj3 = ((C6929b) obj2).f18426a;
                c6867h0 = C6939e.f18439c;
                if (obj3 != c6867h0) {
                    return false;
                }
                if (f18427a.compareAndSet(this, obj2, obj == null ? C6939e.f18440d : new C6929b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C6936c) {
                if (((C6936c) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof AbstractC6852a0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((AbstractC6852a0) obj2).mo20008c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6930c
    /* renamed from: c */
    public Object mo19768c(Object obj, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        if (mo19769b(obj)) {
            return C13195u.f34156a;
        }
        Object m19767d = m19767d(obj, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m19767d == m34636d ? m19767d : C13195u.f34156a;
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C6929b) {
                return "Mutex[" + ((C6929b) obj).f18426a + ']';
            } else if (!(obj instanceof AbstractC6852a0)) {
                if (!(obj instanceof C6936c)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((C6936c) obj).owner + ']';
            } else {
                ((AbstractC6852a0) obj).mo20008c(this);
            }
        }
    }
}
