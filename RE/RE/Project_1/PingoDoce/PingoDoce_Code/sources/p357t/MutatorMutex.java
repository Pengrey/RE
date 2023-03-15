package p357t;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: t.p */
/* loaded from: classes.dex */
public final class MutatorMutex {

    /* renamed from: a */
    private final AtomicReference f26878a = new AtomicReference(null);

    /* renamed from: b */
    private final InterfaceC6930c f26879b = C6939e.m19759b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MutatorMutex.kt */
    /* renamed from: t.p$a */
    /* loaded from: classes.dex */
    public static final class C10315a {

        /* renamed from: a */
        private final EnumC10314o f26880a;

        /* renamed from: b */
        private final InterfaceC10574t1 f26881b;

        public C10315a(EnumC10314o enumC10314o, InterfaceC10574t1 interfaceC10574t1) {
            Intrinsics.isThisObjectNull(enumC10314o, "priority");
            Intrinsics.isThisObjectNull(interfaceC10574t1, "job");
            this.f26880a = enumC10314o;
            this.f26881b = interfaceC10574t1;
        }

        /* renamed from: a */
        public final boolean m8291a(C10315a c10315a) {
            Intrinsics.isThisObjectNull(c10315a, "other");
            return this.f26880a.compareTo(c10315a.f26880a) >= 0;
        }

        /* renamed from: b */
        public final void m8290b() {
            InterfaceC10574t1.C10575a.m7654a(this.f26881b, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MutatorMutex.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m20196f = "MutatorMutex.kt", m20195l = {173, 160}, m20194m = "invokeSuspend")
    /* renamed from: t.p$b */
    /* loaded from: classes.dex */
    public static final class C10316b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        Object f26882A;

        /* renamed from: B */
        int f26883B;

        /* renamed from: C */
        private /* synthetic */ Object f26884C;

        /* renamed from: D */
        final /* synthetic */ EnumC10314o f26885D;

        /* renamed from: E */
        final /* synthetic */ MutatorMutex f26886E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6112p f26887F;

        /* renamed from: G */
        final /* synthetic */ Object f26888G;

        /* renamed from: x */
        Object f26889x;

        /* renamed from: y */
        Object f26890y;

        /* renamed from: z */
        Object f26891z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10316b(EnumC10314o enumC10314o, MutatorMutex mutatorMutex, InterfaceC6112p interfaceC6112p, Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f26885D = enumC10314o;
            this.f26886E = mutatorMutex;
            this.f26887F = interfaceC6112p;
            this.f26888G = obj;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10316b c10316b = new C10316b(this.f26885D, this.f26886E, this.f26887F, this.f26888G, interfaceC1886d);
            c10316b.f26884C = obj;
            return c10316b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10316b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.c, int] */
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6930c m8295b;
            InterfaceC6112p interfaceC6112p;
            Object obj2;
            C10315a c10315a;
            MutatorMutex mutatorMutex;
            C10315a c10315a2;
            Throwable th2;
            MutatorMutex mutatorMutex2;
            InterfaceC6930c interfaceC6930c;
            m34636d = C2116d.m34636d();
            ?? r1 = this.f26883B;
            try {
                try {
                    if (r1 == 0) {
                        C13186n.m1453b(obj);
                        EnumC10314o enumC10314o = this.f26885D;
                        CoroutineContext.InterfaceC1891b mo4546c = ((InterfaceC10524i0) this.f26884C).mo7716y().mo4546c(InterfaceC10574t1.f27288s);
                        Intrinsics.ifNullDoSomething(mo4546c);
                        C10315a c10315a3 = new C10315a(enumC10314o, (InterfaceC10574t1) mo4546c);
                        MutatorMutex.m8294c(this.f26886E, c10315a3);
                        m8295b = MutatorMutex.m8295b(this.f26886E);
                        interfaceC6112p = this.f26887F;
                        Object obj3 = this.f26888G;
                        MutatorMutex mutatorMutex3 = this.f26886E;
                        this.f26884C = c10315a3;
                        this.f26889x = m8295b;
                        this.f26890y = interfaceC6112p;
                        this.f26891z = obj3;
                        this.f26882A = mutatorMutex3;
                        this.f26883B = 1;
                        if (m8295b.mo19768c(null, this) == m34636d) {
                            return m34636d;
                        }
                        obj2 = obj3;
                        c10315a = c10315a3;
                        mutatorMutex = mutatorMutex3;
                    } else if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.f26890y;
                        interfaceC6930c = (InterfaceC6930c) this.f26889x;
                        c10315a2 = (C10315a) this.f26884C;
                        try {
                            C13186n.m1453b(obj);
                            MutatorMutex.m8296a(mutatorMutex2).compareAndSet(c10315a2, null);
                            interfaceC6930c.mo19770a(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            MutatorMutex.m8296a(mutatorMutex2).compareAndSet(c10315a2, null);
                            throw th2;
                        }
                    } else {
                        mutatorMutex = (MutatorMutex) this.f26882A;
                        obj2 = this.f26891z;
                        interfaceC6112p = (InterfaceC6112p) this.f26890y;
                        c10315a = (C10315a) this.f26884C;
                        C13186n.m1453b(obj);
                        m8295b = (InterfaceC6930c) this.f26889x;
                    }
                    this.f26884C = c10315a;
                    this.f26889x = m8295b;
                    this.f26890y = mutatorMutex;
                    this.f26891z = null;
                    this.f26882A = null;
                    this.f26883B = 2;
                    Object mo39856d = interfaceC6112p.mo39856d(obj2, this);
                    if (mo39856d == m34636d) {
                        return m34636d;
                    }
                    mutatorMutex2 = mutatorMutex;
                    interfaceC6930c = m8295b;
                    obj = mo39856d;
                    c10315a2 = c10315a;
                    MutatorMutex.m8296a(mutatorMutex2).compareAndSet(c10315a2, null);
                    interfaceC6930c.mo19770a(null);
                    return obj;
                } catch (Throwable th4) {
                    c10315a2 = c10315a;
                    th2 = th4;
                    mutatorMutex2 = mutatorMutex;
                    MutatorMutex.m8296a(mutatorMutex2).compareAndSet(c10315a2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r1.mo19770a(null);
                throw th5;
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicReference m8296a(MutatorMutex mutatorMutex) {
        return mutatorMutex.f26878a;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6930c m8295b(MutatorMutex mutatorMutex) {
        return mutatorMutex.f26879b;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m8294c(MutatorMutex mutatorMutex, C10315a c10315a) {
        mutatorMutex.m8292e(c10315a);
    }

    /* renamed from: e */
    private final void m8292e(C10315a c10315a) {
        C10315a c10315a2;
        do {
            c10315a2 = (C10315a) this.f26878a.get();
            if (c10315a2 != null && !c10315a.m8291a(c10315a2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f26878a.compareAndSet(c10315a2, c10315a));
        if (c10315a2 == null) {
            return;
        }
        c10315a2.m8290b();
    }

    /* renamed from: d */
    public final Object m8293d(Object obj, EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        return C10531j0.m7768d(new C10316b(enumC10314o, this, interfaceC6112p, obj, null), interfaceC1886d);
    }
}
