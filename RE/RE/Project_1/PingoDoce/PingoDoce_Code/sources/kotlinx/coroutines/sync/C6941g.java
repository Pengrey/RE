package kotlinx.coroutines.sync;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.AbstractC6438m;
import p468yc.C13195u;
import td.C10534k;
import td.C10542m;
import td.InterfaceC10529j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.sync.g */
/* loaded from: classes2.dex */
public final class C6941g implements InterfaceC6940f {

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18442c = AtomicReferenceFieldUpdater.newUpdater(C6941g.class, Object.class, "head");

    /* renamed from: d */
    private static final /* synthetic */ AtomicLongFieldUpdater f18443d = AtomicLongFieldUpdater.newUpdater(C6941g.class, "deqIdx");

    /* renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18444e = AtomicReferenceFieldUpdater.newUpdater(C6941g.class, Object.class, "tail");

    /* renamed from: f */
    private static final /* synthetic */ AtomicLongFieldUpdater f18445f = AtomicLongFieldUpdater.newUpdater(C6941g.class, "enqIdx");

    /* renamed from: g */
    static final /* synthetic */ AtomicIntegerFieldUpdater f18446g = AtomicIntegerFieldUpdater.newUpdater(C6941g.class, "_availablePermits");
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    private final int f18447a;

    /* renamed from: b */
    private final InterfaceC6108l<Throwable, C13195u> f18448b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    /* compiled from: Semaphore.kt */
    /* renamed from: kotlinx.coroutines.sync.g$a */
    /* loaded from: classes2.dex */
    static final class C6942a extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {
        C6942a() {
            super(1);
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            invoke2(th2);
            return C13195u.f34156a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C6941g.this.mo19753a();
        }
    }

    public C6941g(int i, int i2) {
        this.f18447a = i;
        boolean z = true;
        if (!(i > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if ((i2 < 0 || i2 > i) ? false : z) {
            C6944i c6944i = new C6944i(0L, null, 2);
            this.head = c6944i;
            this.tail = c6944i;
            this._availablePermits = i - i2;
            this.f18448b = new C6942a();
            return;
        }
        throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
    }

    /* renamed from: e */
    private final Object m19749e(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k m7714b = C10542m.m7714b(m34637c);
        while (true) {
            if (!m19748f(m7714b)) {
                if (f18446g.getAndDecrement(this) > 0) {
                    m7714b.mo7777o(C13195u.f34156a, this.f18448b);
                    break;
                }
            } else {
                break;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0070, code lost:
        continue;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m19748f(td.InterfaceC10529j<? super p468yc.C13195u> r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6941g.m19748f(td.j):boolean");
    }

    /* renamed from: g */
    private final boolean m19747g(InterfaceC10529j<? super C13195u> interfaceC10529j) {
        Object mo7775u = interfaceC10529j.mo7775u(C13195u.f34156a, null, this.f18448b);
        if (mo7775u == null) {
            return false;
        }
        interfaceC10529j.mo7781S(mo7775u);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0070, code lost:
        continue;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m19746h() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6941g.m19746h():boolean");
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6940f
    /* renamed from: a */
    public void mo19753a() {
        while (true) {
            int i = this._availablePermits;
            if (i < this.f18447a) {
                if (f18446g.compareAndSet(this, i, i + 1) && (i >= 0 || m19746h())) {
                    return;
                }
            } else {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f18447a).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.sync.InterfaceC6940f
    /* renamed from: b */
    public Object mo19752b(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        if (f18446g.getAndDecrement(this) > 0) {
            return C13195u.f34156a;
        }
        Object m19749e = m19749e(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m19749e == m34636d ? m19749e : C13195u.f34156a;
    }
}
