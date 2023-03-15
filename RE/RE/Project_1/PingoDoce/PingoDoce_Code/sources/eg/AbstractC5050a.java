package eg;

import androidx.constraintlayout.widget.C0868i;
import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import jm.C6537a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import p065df.C4786a;
import p070e.C4906j;
import p142hg.AbstractC5932c;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p317qg.C9729a;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: eg.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5050a<P, T> {

    /* renamed from: a */
    private final String f14005a = String.valueOf(C6450z.m20906b(getClass()).mo10119a());

    /* renamed from: b */
    private final InterfaceC6930c f14006b = C6939e.m19759b(false, 1, null);

    /* renamed from: c */
    private boolean f14007c;

    /* renamed from: d */
    private final CoroutineExceptionHandler f14008d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent", m20196f = "Agent.kt", m20195l = {61, 62}, m20194m = "clearCaches$suspendImpl")
    /* renamed from: eg.a$a */
    /* loaded from: classes2.dex */
    public static final class C5051a extends AbstractC6757d {

        /* renamed from: w */
        Object f14009w;

        /* renamed from: x */
        /* synthetic */ Object f14010x;

        /* renamed from: z */
        int f14012z;

        C5051a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14010x = obj;
            this.f14012z |= Integer.MIN_VALUE;
            return AbstractC5050a.m25800h(AbstractC5050a.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$ensureThereIsValidData$1", m20196f = "Agent.kt", m20195l = {140}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$b */
    /* loaded from: classes2.dex */
    public static final class C5052b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f14013x;

        /* renamed from: z */
        final /* synthetic */ Object f14015z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5052b(Object obj, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f14015z = obj;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C5052b(this.f14015z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C5052b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14013x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AbstractC5050a abstractC5050a = AbstractC5050a.this;
                Object obj2 = this.f14015z;
                this.f14013x = 1;
                if (abstractC5050a.m25795m(obj2, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$fetchFromNetwork$2", m20196f = "Agent.kt", m20195l = {48}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$c */
    /* loaded from: classes2.dex */
    public static final class C5053c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14016x;

        /* renamed from: z */
        final /* synthetic */ Object f14018z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5053c(Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14018z = obj;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5053c(this.f14018z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5053c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14016x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AbstractC5050a abstractC5050a = AbstractC5050a.this;
                    Object obj2 = this.f14018z;
                    this.f14016x = 1;
                    if (AbstractC5050a.m25807a(abstractC5050a, obj2, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC5050a.m25802f(AbstractC5050a.this, false);
                AbstractC5050a.m25802f(AbstractC5050a.this, false);
                return C13195u.f34156a;
            } catch (Exception e) {
                AbstractC5050a.m25802f(AbstractC5050a.this, false);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$fetchFromNetworkUnlocked$2", m20196f = "Agent.kt", m20195l = {C4906j.f13420I0, 128}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$d */
    /* loaded from: classes2.dex */
    public static final class C5054d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14019x;

        /* renamed from: z */
        final /* synthetic */ Object f14021z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5054d(Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14021z = obj;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5054d(this.f14021z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5054d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14019x;
            if (i == 0) {
                C13186n.m1453b(obj);
                String m25806b = AbstractC5050a.m25806b(AbstractC5050a.this);
                C6537a.m20678a(m25806b + " fetching from network 📶 🚀 ...", new Object[0]);
                InterfaceC6112p m25791q = AbstractC5050a.this.m25791q();
                Object obj2 = this.f14021z;
                this.f14019x = 1;
                obj = m25791q.mo39856d(obj2, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
            }
            String m25806b2 = AbstractC5050a.m25806b(AbstractC5050a.this);
            C6537a.m20678a(m25806b2 + " fetched from network 📶 🏁 ...", new Object[0]);
            AbstractC5050a abstractC5050a = AbstractC5050a.this;
            this.f14019x = 2;
            if (abstractC5050a.m25782z(obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$get$2", m20196f = "Agent.kt", m20195l = {177, 85, C0868i.f2993y0, C0868i.f2738A0}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$e */
    /* loaded from: classes2.dex */
    public static final class C5055e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        int f14022A;

        /* renamed from: C */
        final /* synthetic */ Object f14024C;

        /* renamed from: x */
        Object f14025x;

        /* renamed from: y */
        Object f14026y;

        /* renamed from: z */
        Object f14027z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Agent.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$get$2$1$1", m20196f = "Agent.kt", m20195l = {88}, m20194m = "invokeSuspend")
        /* renamed from: eg.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C5056a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f14028x;

            /* renamed from: y */
            final /* synthetic */ AbstractC5050a f14029y;

            /* renamed from: z */
            final /* synthetic */ Object f14030z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5056a(AbstractC5050a abstractC5050a, Object obj, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f14029y = abstractC5050a;
                this.f14030z = obj;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5056a(this.f14029y, this.f14030z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5056a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14028x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AbstractC5050a abstractC5050a = this.f14029y;
                    Object obj2 = this.f14030z;
                    this.f14028x = 1;
                    if (AbstractC5050a.m25797k(abstractC5050a, obj2, false, this, 2, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Agent.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$get$2$1$2", m20196f = "Agent.kt", m20195l = {C0868i.f2983w0}, m20194m = "invokeSuspend")
        /* renamed from: eg.a$e$b */
        /* loaded from: classes2.dex */
        public static final class C5057b extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f14031x;

            /* renamed from: y */
            final /* synthetic */ AbstractC5050a f14032y;

            /* renamed from: z */
            final /* synthetic */ Object f14033z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5057b(AbstractC5050a abstractC5050a, Object obj, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f14032y = abstractC5050a;
                this.f14033z = obj;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5057b(this.f14032y, this.f14033z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5057b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14031x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AbstractC5050a abstractC5050a = this.f14032y;
                    Object obj2 = this.f14033z;
                    this.f14031x = 1;
                    if (AbstractC5050a.m25797k(abstractC5050a, obj2, false, this, 2, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5055e(Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14024C = obj;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5055e(this.f14024C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5055e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.c] */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6930c m25805c;
            AbstractC5050a abstractC5050a;
            Object obj2;
            AbstractC5050a abstractC5050a2;
            InterfaceC6930c interfaceC6930c;
            AbstractC5050a abstractC5050a3;
            InterfaceC6930c interfaceC6930c2;
            Object m10098c;
            m34636d = C2116d.m34636d();
            ?? r1 = this.f14022A;
            boolean z = true;
            try {
                try {
                    if (r1 == 0) {
                        C13186n.m1453b(obj);
                        m25805c = AbstractC5050a.m25805c(AbstractC5050a.this);
                        abstractC5050a = AbstractC5050a.this;
                        obj2 = this.f14024C;
                        this.f14025x = m25805c;
                        this.f14026y = abstractC5050a;
                        this.f14027z = obj2;
                        this.f14022A = 1;
                        if (m25805c.mo19768c(null, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (r1 != 1) {
                        if (r1 == 2) {
                            abstractC5050a3 = (AbstractC5050a) this.f14026y;
                            interfaceC6930c2 = (InterfaceC6930c) this.f14025x;
                            C13186n.m1453b(obj);
                            m25805c = interfaceC6930c2;
                            abstractC5050a = abstractC5050a3;
                            m10098c = abstractC5050a.m25789s().m10098c();
                            m25805c.mo19770a(null);
                            return m10098c;
                        } else if (r1 == 3) {
                            interfaceC6930c = (InterfaceC6930c) this.f14025x;
                            C13186n.m1453b(obj);
                            m10098c = obj;
                            m25805c = interfaceC6930c;
                            m25805c.mo19770a(null);
                            return m10098c;
                        } else if (r1 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            abstractC5050a2 = (AbstractC5050a) this.f14026y;
                            interfaceC6930c = (InterfaceC6930c) this.f14025x;
                            C13186n.m1453b(obj);
                            m10098c = abstractC5050a2.m25789s().m10098c();
                            m25805c = interfaceC6930c;
                            m25805c.mo19770a(null);
                            return m10098c;
                        }
                    } else {
                        Object obj3 = this.f14027z;
                        AbstractC5050a abstractC5050a4 = (AbstractC5050a) this.f14026y;
                        C13186n.m1453b(obj);
                        m25805c = (InterfaceC6930c) this.f14025x;
                        obj2 = obj3;
                        abstractC5050a = abstractC5050a4;
                    }
                    C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " getting ...", new Object[0]);
                    if (!abstractC5050a.m25789s().m10094g()) {
                        C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " memory cache hit 🧠 ...", new Object[0]);
                        if (abstractC5050a.m25789s().m10096e()) {
                            AbstractC5932c m25790r = abstractC5050a.m25790r();
                            if (m25790r == null || m25790r.m22681j()) {
                                z = false;
                            }
                            if (z) {
                                C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " loaded new from disk cache 💾 ...", new Object[0]);
                                this.f14025x = m25805c;
                                this.f14026y = abstractC5050a;
                                this.f14027z = null;
                                this.f14022A = 2;
                                if (AbstractC5050a.m25803e(abstractC5050a, this) == m34636d) {
                                    return m34636d;
                                }
                                abstractC5050a3 = abstractC5050a;
                                interfaceC6930c2 = m25805c;
                                m25805c = interfaceC6930c2;
                                abstractC5050a = abstractC5050a3;
                            } else {
                                C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " enqueued refresh 🔜 ...", new Object[0]);
                                AbstractC5050a.m25804d(abstractC5050a, new C5056a(abstractC5050a, obj2, null));
                            }
                        }
                        m10098c = abstractC5050a.m25789s().m10098c();
                        m25805c.mo19770a(null);
                        return m10098c;
                    }
                    if (abstractC5050a.m25790r() != null) {
                        AbstractC5932c m25790r2 = abstractC5050a.m25790r();
                        Intrinsics.ifNullDoSomething(m25790r2);
                        if (!m25790r2.m22685f()) {
                            C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " disk cache hit 💾 ...", new Object[0]);
                            AbstractC5932c m25790r3 = abstractC5050a.m25790r();
                            Intrinsics.ifNullDoSomething(m25790r3);
                            if (m25790r3.m22681j()) {
                                C6537a.m20678a(AbstractC5050a.m25806b(abstractC5050a) + " enqueued refresh 🔜 ...", new Object[0]);
                                AbstractC5050a.m25804d(abstractC5050a, new C5057b(abstractC5050a, obj2, null));
                            }
                            this.f14025x = m25805c;
                            this.f14026y = null;
                            this.f14027z = null;
                            this.f14022A = 3;
                            Object m25803e = AbstractC5050a.m25803e(abstractC5050a, this);
                            if (m25803e == m34636d) {
                                return m34636d;
                            }
                            interfaceC6930c = m25805c;
                            obj = m25803e;
                            m10098c = obj;
                            m25805c = interfaceC6930c;
                            m25805c.mo19770a(null);
                            return m10098c;
                        }
                    }
                    this.f14025x = m25805c;
                    this.f14026y = abstractC5050a;
                    this.f14027z = null;
                    this.f14022A = 4;
                    if (AbstractC5050a.m25807a(abstractC5050a, obj2, this) == m34636d) {
                        return m34636d;
                    }
                    abstractC5050a2 = abstractC5050a;
                    interfaceC6930c = m25805c;
                    m10098c = abstractC5050a2.m25789s().m10098c();
                    m25805c = interfaceC6930c;
                    m25805c.mo19770a(null);
                    return m10098c;
                } catch (Throwable th2) {
                    r1 = m25805c;
                    th = th2;
                    r1.mo19770a(null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$launchInParallel$1", m20196f = "Agent.kt", m20195l = {151}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$f */
    /* loaded from: classes2.dex */
    public static final class C5058f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14034x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l f14035y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5058f(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14035y = interfaceC6108l;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5058f(this.f14035y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5058f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14034x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6108l interfaceC6108l = this.f14035y;
                this.f14034x = 1;
                if (interfaceC6108l.mo9587d(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent", m20196f = "Agent.kt", m20195l = {C0868i.f2778I0, 110}, m20194m = "loadFromLocalProvider")
    /* renamed from: eg.a$g */
    /* loaded from: classes2.dex */
    public static final class C5059g extends AbstractC6757d {

        /* renamed from: w */
        Object f14036w;

        /* renamed from: x */
        /* synthetic */ Object f14037x;

        /* renamed from: z */
        int f14039z;

        C5059g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14037x = obj;
            this.f14039z |= Integer.MIN_VALUE;
            return AbstractC5050a.m25803e(AbstractC5050a.this, this);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* renamed from: eg.a$h */
    /* loaded from: classes2.dex */
    public static final class C5060h extends CoroutineContextImpl implements CoroutineExceptionHandler {

        /* renamed from: x */
        final /* synthetic */ AbstractC5050a f14040x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5060h(CoroutineExceptionHandler.C6767a c6767a, AbstractC5050a abstractC5050a) {
            super(c6767a);
            this.f14040x = abstractC5050a;
        }

        /* renamed from: q0 */
        public void mo20171q0(CoroutineContext coroutineContext, Throwable th2) {
            AbstractC5050a.m25802f(this.f14040x, false);
            C4786a.f13106a.m26606a(th2);
            String m25794n = this.f14040x.m25794n();
            C6537a.m20676c(th2, m25794n + " Caught exception while fetching in the background", new Object[0]);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* renamed from: eg.a$i */
    /* loaded from: classes2.dex */
    public static final class C5061i extends CoroutineContextImpl implements CoroutineExceptionHandler {

        /* renamed from: x */
        final /* synthetic */ AbstractC5050a f14041x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5061i(CoroutineExceptionHandler.C6767a c6767a, AbstractC5050a abstractC5050a) {
            super(c6767a);
            this.f14041x = abstractC5050a;
        }

        /* renamed from: q0 */
        public void mo20171q0(CoroutineContext coroutineContext, Throwable th2) {
            String m25794n = this.f14041x.m25794n();
            C6537a.m20676c(th2, m25794n + " Caught exception while fetching in the background", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent$update$2", m20196f = "Agent.kt", m20195l = {177, 164}, m20194m = "invokeSuspend")
    /* renamed from: eg.a$j */
    /* loaded from: classes2.dex */
    public static final class C5062j extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        int f14042A;

        /* renamed from: C */
        final /* synthetic */ Object f14044C;

        /* renamed from: x */
        Object f14045x;

        /* renamed from: y */
        Object f14046y;

        /* renamed from: z */
        Object f14047z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5062j(Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14044C = obj;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5062j(this.f14044C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5062j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6930c m25805c;
            AbstractC5050a abstractC5050a;
            Object obj2;
            InterfaceC6930c interfaceC6930c;
            Throwable th2;
            m34636d = C2116d.m34636d();
            int i = this.f14042A;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    m25805c = AbstractC5050a.m25805c(AbstractC5050a.this);
                    AbstractC5050a abstractC5050a2 = AbstractC5050a.this;
                    Object obj3 = this.f14044C;
                    this.f14045x = m25805c;
                    this.f14046y = abstractC5050a2;
                    this.f14047z = obj3;
                    this.f14042A = 1;
                    if (m25805c.mo19768c(null, this) == m34636d) {
                        return m34636d;
                    }
                    abstractC5050a = abstractC5050a2;
                    obj2 = obj3;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC6930c = (InterfaceC6930c) this.f14045x;
                    try {
                        C13186n.m1453b(obj);
                        C13195u c13195u = C13195u.f34156a;
                        interfaceC6930c.mo19770a(null);
                        return c13195u;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC6930c.mo19770a(null);
                        throw th2;
                    }
                } else {
                    obj2 = this.f14047z;
                    abstractC5050a = (AbstractC5050a) this.f14046y;
                    C13186n.m1453b(obj);
                    m25805c = (InterfaceC6930c) this.f14045x;
                }
                this.f14045x = m25805c;
                this.f14046y = null;
                this.f14047z = null;
                this.f14042A = 2;
                if (abstractC5050a.m25782z(obj2, this) == m34636d) {
                    return m34636d;
                }
                interfaceC6930c = m25805c;
                C13195u c13195u2 = C13195u.f34156a;
                interfaceC6930c.mo19770a(null);
                return c13195u2;
            } catch (Throwable th4) {
                interfaceC6930c = m25805c;
                th2 = th4;
                interfaceC6930c.mo19770a(null);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Agent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.Agent", m20196f = "Agent.kt", m20195l = {156, 157}, m20194m = "updateUnlocked$suspendImpl")
    /* renamed from: eg.a$k */
    /* loaded from: classes2.dex */
    public static final class C5063k extends AbstractC6757d {

        /* renamed from: A */
        int f14048A;

        /* renamed from: w */
        Object f14049w;

        /* renamed from: x */
        Object f14050x;

        /* renamed from: y */
        /* synthetic */ Object f14051y;

        C5063k(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14051y = obj;
            this.f14048A |= Integer.MIN_VALUE;
            return AbstractC5050a.m25808A(AbstractC5050a.this, null, this);
        }
    }

    public AbstractC5050a() {
        CoroutineExceptionHandler.C6767a c6767a = CoroutineExceptionHandler.f18136q;
        this.f14008d = new C5060h(c6767a, this);
        new C5061i(c6767a, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m25808A(eg.AbstractC5050a r5, java.lang.Object r6, bd.InterfaceC1886d r7) {
        /*
            boolean r0 = r7 instanceof eg.AbstractC5050a.C5063k
            if (r0 == 0) goto L13
            r0 = r7
            eg.a$k r0 = (eg.AbstractC5050a.C5063k) r0
            int r1 = r0.f14048A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14048A = r1
            goto L18
        L13:
            eg.a$k r0 = new eg.a$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14051y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14048A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r6 = r0.f14050x
            java.lang.Object r5 = r0.f14049w
            eg.a r5 = (eg.AbstractC5050a) r5
            p468yc.C13186n.m1453b(r7)
            goto L52
        L3e:
            p468yc.C13186n.m1453b(r7)
            qg.a r7 = r5.m25789s()
            r0.f14049w = r5
            r0.f14050x = r6
            r0.f14048A = r4
            java.lang.Object r7 = r7.m10091j(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            hg.c r5 = r5.m25790r()
            if (r5 == 0) goto L69
            r7 = 0
            r0.f14049w = r7
            r0.f14050x = r7
            r0.f14048A = r3
            java.lang.Object r5 = r5.mo22682i(r6, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        L69:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5050a.m25808A(eg.a, java.lang.Object, bd.d):java.lang.Object");
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m25807a(AbstractC5050a abstractC5050a, Object obj, InterfaceC1886d interfaceC1886d) {
        return abstractC5050a.m25796l(obj, interfaceC1886d);
    }

    /* renamed from: b */
    public static final /* synthetic */ String m25806b(AbstractC5050a abstractC5050a) {
        return abstractC5050a.m25793o();
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC6930c m25805c(AbstractC5050a abstractC5050a) {
        return abstractC5050a.f14006b;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m25804d(AbstractC5050a abstractC5050a, InterfaceC6108l interfaceC6108l) {
        abstractC5050a.m25788t(interfaceC6108l);
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m25803e(AbstractC5050a abstractC5050a, InterfaceC1886d interfaceC1886d) {
        return abstractC5050a.m25787u(interfaceC1886d);
    }

    /* renamed from: f */
    public static final /* synthetic */ void m25802f(AbstractC5050a abstractC5050a, boolean z) {
        abstractC5050a.f14007c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m25800h(eg.AbstractC5050a r5, bd.InterfaceC1886d r6) {
        /*
            boolean r0 = r6 instanceof eg.AbstractC5050a.C5051a
            if (r0 == 0) goto L13
            r0 = r6
            eg.a$a r0 = (eg.AbstractC5050a.C5051a) r0
            int r1 = r0.f14012z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14012z = r1
            goto L18
        L13:
            eg.a$a r0 = new eg.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14010x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14012z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r6)
            goto L60
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f14009w
            eg.a r5 = (eg.AbstractC5050a) r5
            p468yc.C13186n.m1453b(r6)
            goto L4e
        L3c:
            p468yc.C13186n.m1453b(r6)
            qg.a r6 = r5.m25789s()
            r0.f14009w = r5
            r0.f14012z = r4
            java.lang.Object r6 = r6.m10100a(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            hg.c r5 = r5.m25790r()
            if (r5 == 0) goto L63
            r6 = 0
            r0.f14009w = r6
            r0.f14012z = r3
            java.lang.Object r5 = r5.mo22690a(r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        L63:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5050a.m25800h(eg.a, bd.d):java.lang.Object");
    }

    /* renamed from: i */
    private final void m25799i(Object obj) {
        m25788t(new C5052b(obj, null));
    }

    /* renamed from: k */
    public static /* synthetic */ Object m25797k(AbstractC5050a abstractC5050a, Object obj, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return abstractC5050a.m25798j(obj, z, interfaceC1886d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFromNetwork");
    }

    /* renamed from: l */
    private final Object m25796l(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(C10587w0.m7620b().mo4545f0(this.f14008d).mo4545f0(C10549n2.m7695b(null, 1, null)), new C5054d(obj, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* renamed from: o */
    private final String m25793o() {
        String m25794n = m25794n();
        return "AGENT: " + m25794n + " -->";
    }

    /* renamed from: t */
    private final void m25788t(InterfaceC6108l interfaceC6108l) {
        C6772d.m20158d(C10531j0.m7771a(C10587w0.m7620b().mo4545f0(this.f14008d).mo4545f0(C10549n2.m7695b(null, 1, null))), null, null, new C5058f(interfaceC6108l, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m25787u(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof eg.AbstractC5050a.C5059g
            if (r0 == 0) goto L13
            r0 = r7
            eg.a$g r0 = (eg.AbstractC5050a.C5059g) r0
            int r1 = r0.f14039z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14039z = r1
            goto L18
        L13:
            eg.a$g r0 = new eg.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14037x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14039z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f14036w
            p468yc.C13186n.m1453b(r7)
            goto L7a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.f14036w
            eg.a r2 = (eg.AbstractC5050a) r2
            p468yc.C13186n.m1453b(r7)
            goto L54
        L3e:
            p468yc.C13186n.m1453b(r7)
            hg.c r7 = r6.m25790r()
            p181jd.Intrinsics.ifNullDoSomething(r7)
            r0.f14036w = r6
            r0.f14039z = r4
            java.lang.Object r7 = r7.mo22688c(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r6
        L54:
            qg.a r4 = r2.m25789s()
            hg.c r5 = r2.m25790r()
            p181jd.Intrinsics.ifNullDoSomething(r5)
            org.threeten.bp.e r5 = r5.mo22687d()
            hg.c r2 = r2.m25790r()
            p181jd.Intrinsics.ifNullDoSomething(r2)
            org.threeten.bp.e r2 = r2.mo22686e()
            r0.f14036w = r7
            r0.f14039z = r3
            java.lang.Object r0 = r4.m10090k(r7, r5, r2, r0)
            if (r0 != r1) goto L79
            return r1
        L79:
            r0 = r7
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.AbstractC5050a.m25787u(bd.d):java.lang.Object");
    }

    /* renamed from: w */
    static /* synthetic */ Object m25785w(AbstractC5050a abstractC5050a, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        abstractC5050a.m25789s().m10093h();
        AbstractC5932c m25790r = abstractC5050a.m25790r();
        if (m25790r != null) {
            Object mo22684g = m25790r.mo22684g(interfaceC1886d);
            m34636d2 = C2116d.m34636d();
            return mo22684g == m34636d2 ? mo22684g : C13195u.f34156a;
        }
        m34636d = C2116d.m34636d();
        if (m34636d == null) {
            return null;
        }
        return C13195u.f34156a;
    }

    /* renamed from: g */
    public Object m25801g(InterfaceC1886d interfaceC1886d) {
        return m25800h(this, interfaceC1886d);
    }

    /* renamed from: j */
    public final Object m25798j(Object obj, boolean z, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        if (this.f14007c) {
            String m25794n = m25794n();
            C6537a.m20678a(m25794n + " already fetching", new Object[0]);
            return C13195u.f34156a;
        }
        this.f14007c = true;
        CoroutineContext m7620b = C10587w0.m7620b();
        if (z) {
            m7620b = m7620b.mo4545f0(this.f14008d).mo4545f0(C10549n2.m7695b(null, 1, null));
        }
        Object m20164g = C6769b.m20164g(m7620b, new C5053c(obj, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* renamed from: m */
    public final Object m25795m(Object obj, InterfaceC1886d interfaceC1886d) {
        return C6769b.m20164g(C10587w0.m7620b(), new C5055e(obj, null), interfaceC1886d);
    }

    /* renamed from: n */
    public String m25794n() {
        return this.f14005a;
    }

    /* renamed from: p */
    public final InterfaceC6785c m25792p(Object obj) {
        m25799i(obj);
        return m25789s().m10095f();
    }

    /* renamed from: q */
    protected abstract InterfaceC6112p m25791q();

    /* renamed from: r */
    protected abstract AbstractC5932c m25790r();

    /* renamed from: s */
    protected abstract C9729a m25789s();

    /* renamed from: v */
    public Object m25786v(InterfaceC1886d interfaceC1886d) {
        return m25785w(this, interfaceC1886d);
    }

    /* renamed from: x */
    public final Object m25784x(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        m25789s().m10092i();
        AbstractC5932c m25790r = m25790r();
        if (m25790r != null) {
            Object mo22683h = m25790r.mo22683h(interfaceC1886d);
            m34636d2 = C2116d.m34636d();
            return mo22683h == m34636d2 ? mo22683h : C13195u.f34156a;
        }
        m34636d = C2116d.m34636d();
        if (m34636d == null) {
            return null;
        }
        return C13195u.f34156a;
    }

    /* renamed from: y */
    public final Object m25783y(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(C10587w0.m7620b(), new C5062j(obj, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public Object m25782z(Object obj, InterfaceC1886d interfaceC1886d) {
        return m25808A(this, obj, interfaceC1886d);
    }
}
