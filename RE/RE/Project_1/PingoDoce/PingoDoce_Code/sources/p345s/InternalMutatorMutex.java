package p345s;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import p070e.C4906j;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: s.i0 */
/* loaded from: classes.dex */
public final class InternalMutatorMutex {

    /* renamed from: a */
    private final AtomicReference f26055a = new AtomicReference(null);

    /* renamed from: b */
    private final InterfaceC6930c f26056b = C6939e.m19759b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalMutatorMutex.kt */
    /* renamed from: s.i0$a */
    /* loaded from: classes.dex */
    public static final class C9952a {

        /* renamed from: a */
        private final EnumC9951h0 f26057a;

        /* renamed from: b */
        private final InterfaceC10574t1 f26058b;

        public C9952a(EnumC9951h0 enumC9951h0, InterfaceC10574t1 interfaceC10574t1) {
            Intrinsics.isThisObjectNull(enumC9951h0, "priority");
            Intrinsics.isThisObjectNull(interfaceC10574t1, "job");
            this.f26057a = enumC9951h0;
            this.f26058b = interfaceC10574t1;
        }

        /* renamed from: a */
        public final boolean m9557a(C9952a c9952a) {
            Intrinsics.isThisObjectNull(c9952a, "other");
            return this.f26057a.compareTo(c9952a.f26057a) >= 0;
        }

        /* renamed from: b */
        public final void m9556b() {
            InterfaceC10574t1.C10575a.m7654a(this.f26058b, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalMutatorMutex.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m20196f = "InternalMutatorMutex.kt", m20195l = {171, C4906j.f13385B0}, m20194m = "invokeSuspend")
    /* renamed from: s.i0$b */
    /* loaded from: classes.dex */
    public static final class C9953b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        int f26059A;

        /* renamed from: B */
        private /* synthetic */ Object f26060B;

        /* renamed from: C */
        final /* synthetic */ EnumC9951h0 f26061C;

        /* renamed from: D */
        final /* synthetic */ InternalMutatorMutex f26062D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6108l f26063E;

        /* renamed from: x */
        Object f26064x;

        /* renamed from: y */
        Object f26065y;

        /* renamed from: z */
        Object f26066z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9953b(EnumC9951h0 enumC9951h0, InternalMutatorMutex internalMutatorMutex, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f26061C = enumC9951h0;
            this.f26062D = internalMutatorMutex;
            this.f26063E = interfaceC6108l;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C9953b c9953b = new C9953b(this.f26061C, this.f26062D, this.f26063E, interfaceC1886d);
            c9953b.f26060B = obj;
            return c9953b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9953b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.c, int] */
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6930c m9562b;
            InterfaceC6108l interfaceC6108l;
            C9952a c9952a;
            InternalMutatorMutex internalMutatorMutex;
            C9952a c9952a2;
            Throwable th2;
            InternalMutatorMutex internalMutatorMutex2;
            InterfaceC6930c interfaceC6930c;
            m34636d = C2116d.m34636d();
            ?? r1 = this.f26059A;
            try {
                try {
                    if (r1 == 0) {
                        C13186n.m1453b(obj);
                        EnumC9951h0 enumC9951h0 = this.f26061C;
                        CoroutineContext.InterfaceC1891b mo4546c = ((InterfaceC10524i0) this.f26060B).mo7716y().mo4546c(InterfaceC10574t1.f27288s);
                        Intrinsics.ifNullDoSomething(mo4546c);
                        C9952a c9952a3 = new C9952a(enumC9951h0, (InterfaceC10574t1) mo4546c);
                        InternalMutatorMutex.m9561c(this.f26062D, c9952a3);
                        m9562b = InternalMutatorMutex.m9562b(this.f26062D);
                        InterfaceC6108l interfaceC6108l2 = this.f26063E;
                        InternalMutatorMutex internalMutatorMutex3 = this.f26062D;
                        this.f26060B = c9952a3;
                        this.f26064x = m9562b;
                        this.f26065y = interfaceC6108l2;
                        this.f26066z = internalMutatorMutex3;
                        this.f26059A = 1;
                        if (m9562b.mo19768c(null, this) == m34636d) {
                            return m34636d;
                        }
                        interfaceC6108l = interfaceC6108l2;
                        c9952a = c9952a3;
                        internalMutatorMutex = internalMutatorMutex3;
                    } else if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.f26065y;
                        interfaceC6930c = (InterfaceC6930c) this.f26064x;
                        c9952a2 = (C9952a) this.f26060B;
                        try {
                            C13186n.m1453b(obj);
                            InternalMutatorMutex.m9563a(internalMutatorMutex2).compareAndSet(c9952a2, null);
                            interfaceC6930c.mo19770a(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            InternalMutatorMutex.m9563a(internalMutatorMutex2).compareAndSet(c9952a2, null);
                            throw th2;
                        }
                    } else {
                        internalMutatorMutex = (InternalMutatorMutex) this.f26066z;
                        interfaceC6108l = (InterfaceC6108l) this.f26065y;
                        c9952a = (C9952a) this.f26060B;
                        C13186n.m1453b(obj);
                        m9562b = (InterfaceC6930c) this.f26064x;
                    }
                    this.f26060B = c9952a;
                    this.f26064x = m9562b;
                    this.f26065y = internalMutatorMutex;
                    this.f26066z = null;
                    this.f26059A = 2;
                    Object mo9587d = interfaceC6108l.mo9587d(this);
                    if (mo9587d == m34636d) {
                        return m34636d;
                    }
                    internalMutatorMutex2 = internalMutatorMutex;
                    interfaceC6930c = m9562b;
                    obj = mo9587d;
                    c9952a2 = c9952a;
                    InternalMutatorMutex.m9563a(internalMutatorMutex2).compareAndSet(c9952a2, null);
                    interfaceC6930c.mo19770a(null);
                    return obj;
                } catch (Throwable th4) {
                    c9952a2 = c9952a;
                    th2 = th4;
                    internalMutatorMutex2 = internalMutatorMutex;
                    InternalMutatorMutex.m9563a(internalMutatorMutex2).compareAndSet(c9952a2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r1.mo19770a(null);
                throw th5;
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicReference m9563a(InternalMutatorMutex internalMutatorMutex) {
        return internalMutatorMutex.f26055a;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC6930c m9562b(InternalMutatorMutex internalMutatorMutex) {
        return internalMutatorMutex.f26056b;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m9561c(InternalMutatorMutex internalMutatorMutex, C9952a c9952a) {
        internalMutatorMutex.m9558f(c9952a);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m9559e(InternalMutatorMutex internalMutatorMutex, EnumC9951h0 enumC9951h0, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC9951h0 = EnumC9951h0.Default;
        }
        return internalMutatorMutex.m9560d(enumC9951h0, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: f */
    private final void m9558f(C9952a c9952a) {
        C9952a c9952a2;
        do {
            c9952a2 = (C9952a) this.f26055a.get();
            if (c9952a2 != null && !c9952a.m9557a(c9952a2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f26055a.compareAndSet(c9952a2, c9952a));
        if (c9952a2 == null) {
            return;
        }
        c9952a2.m9556b();
    }

    /* renamed from: d */
    public final Object m9560d(EnumC9951h0 enumC9951h0, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return C10531j0.m7768d(new C9953b(enumC9951h0, this, interfaceC6108l, null), interfaceC1886d);
    }
}
