package androidx.lifecycle;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10565r0;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* compiled from: CoroutineLiveData.kt */
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C1427c<T> {

    /* renamed from: a */
    private InterfaceC10574t1 f4268a;

    /* renamed from: b */
    private InterfaceC10574t1 f4269b;

    /* renamed from: c */
    private final C1437f f4270c;

    /* renamed from: d */
    private final InterfaceC6112p f4271d;

    /* renamed from: e */
    private final long f4272e;

    /* renamed from: f */
    private final InterfaceC10524i0 f4273f;

    /* renamed from: g */
    private final InterfaceC6097a f4274g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineLiveData.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.BlockRunner$cancel$1", m20196f = "CoroutineLiveData.kt", m20195l = {187}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.c$a */
    /* loaded from: classes.dex */
    public static final class C1428a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f4275x;

        C1428a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1428a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            return new C1428a(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4275x;
            if (i == 0) {
                C13186n.m1453b(obj);
                long m37059e = C1427c.m37059e(C1427c.this);
                this.f4275x = 1;
                if (C10565r0.m7677a(m37059e, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (!C1427c.m37062b(C1427c.this).m37078h()) {
                InterfaceC10574t1 m37060d = C1427c.m37060d(C1427c.this);
                if (m37060d != null) {
                    InterfaceC10574t1.C10575a.m7654a(m37060d, null, 1, null);
                }
                C1427c.m37058f(C1427c.this, null);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineLiveData.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.BlockRunner$maybeRun$1", m20196f = "CoroutineLiveData.kt", m20195l = {176}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.c$b */
    /* loaded from: classes.dex */
    public static final class C1429b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        private /* synthetic */ Object f4277x;

        /* renamed from: y */
        int f4278y;

        C1429b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1429b) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            C1429b c1429b = new C1429b(interfaceC1886d);
            c1429b.f4277x = obj;
            return c1429b;
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4278y;
            if (i == 0) {
                C13186n.m1453b(obj);
                CoroutineLiveData coroutineLiveData = new CoroutineLiveData(C1427c.m37062b(C1427c.this), ((InterfaceC10524i0) this.f4277x).mo7716y());
                InterfaceC6112p m37063a = C1427c.m37063a(C1427c.this);
                this.f4278y = 1;
                if (m37063a.mo39856d(coroutineLiveData, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            C1427c.m37061c(C1427c.this).mo42214q();
            return C13195u.f34156a;
        }
    }

    public C1427c(C1437f c1437f, InterfaceC6112p interfaceC6112p, long j, InterfaceC10524i0 interfaceC10524i0, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(c1437f, "liveData");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onDone");
        this.f4270c = c1437f;
        this.f4271d = interfaceC6112p;
        this.f4272e = j;
        this.f4273f = interfaceC10524i0;
        this.f4274g = interfaceC6097a;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC6112p m37063a(C1427c c1427c) {
        return c1427c.f4271d;
    }

    /* renamed from: b */
    public static final /* synthetic */ C1437f m37062b(C1427c c1427c) {
        return c1427c.f4270c;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC6097a m37061c(C1427c c1427c) {
        return c1427c.f4274g;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC10574t1 m37060d(C1427c c1427c) {
        return c1427c.f4268a;
    }

    /* renamed from: e */
    public static final /* synthetic */ long m37059e(C1427c c1427c) {
        return c1427c.f4272e;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m37058f(C1427c c1427c, InterfaceC10574t1 interfaceC10574t1) {
        c1427c.f4268a = interfaceC10574t1;
    }

    /* renamed from: g */
    public final void m37057g() {
        InterfaceC10574t1 m20158d;
        if (this.f4269b == null) {
            m20158d = C6772d.m20158d(this.f4273f, C10587w0.m7619c().mo7830H0(), null, new C1428a(null), 2, null);
            this.f4269b = m20158d;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    /* renamed from: h */
    public final void m37056h() {
        InterfaceC10574t1 m20158d;
        InterfaceC10574t1 interfaceC10574t1 = this.f4269b;
        if (interfaceC10574t1 != null) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        }
        this.f4269b = null;
        if (this.f4268a != null) {
            return;
        }
        m20158d = C6772d.m20158d(this.f4273f, null, null, new C1429b(null), 3, null);
        this.f4268a = m20158d;
    }
}
