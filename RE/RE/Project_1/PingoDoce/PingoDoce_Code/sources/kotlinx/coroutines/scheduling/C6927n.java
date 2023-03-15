package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.scheduling.n */
/* loaded from: classes2.dex */
public final class C6927n {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18419b = AtomicReferenceFieldUpdater.newUpdater(C6927n.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18420c = AtomicIntegerFieldUpdater.newUpdater(C6927n.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18421d = AtomicIntegerFieldUpdater.newUpdater(C6927n.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18422e = AtomicIntegerFieldUpdater.newUpdater(C6927n.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC6921h> f18423a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC6921h m19785b(C6927n c6927n, AbstractRunnableC6921h abstractRunnableC6921h, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c6927n.m19786a(abstractRunnableC6921h, z);
    }

    /* renamed from: c */
    private final AbstractRunnableC6921h m19784c(AbstractRunnableC6921h abstractRunnableC6921h) {
        if (abstractRunnableC6921h.f18408x.mo19787b() == 1) {
            f18422e.incrementAndGet(this);
        }
        if (m19782e() == 127) {
            return abstractRunnableC6921h;
        }
        int i = this.producerIndex & 127;
        while (this.f18423a.get(i) != null) {
            Thread.yield();
        }
        this.f18423a.lazySet(i, abstractRunnableC6921h);
        f18420c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m19783d(AbstractRunnableC6921h abstractRunnableC6921h) {
        if (abstractRunnableC6921h != null) {
            if (abstractRunnableC6921h.f18408x.mo19787b() == 1) {
                int decrementAndGet = f18422e.decrementAndGet(this);
                if (C10539l0.m7720a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC6921h m19778i() {
        AbstractRunnableC6921h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f18421d.compareAndSet(this, i, i + 1) && (andSet = this.f18423a.getAndSet(i2, null)) != null) {
                m19783d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m19777j(C6917d c6917d) {
        AbstractRunnableC6921h m19778i = m19778i();
        if (m19778i == null) {
            return false;
        }
        c6917d.m19864a(m19778i);
        return true;
    }

    /* renamed from: m */
    private final long m19774m(C6927n c6927n, boolean z) {
        AbstractRunnableC6921h abstractRunnableC6921h;
        do {
            abstractRunnableC6921h = (AbstractRunnableC6921h) c6927n.lastScheduledTask;
            if (abstractRunnableC6921h == null) {
                return -2L;
            }
            if (z) {
                if (!(abstractRunnableC6921h.f18408x.mo19787b() == 1)) {
                    return -2L;
                }
            }
            long mo19789a = C6925l.f18415e.mo19789a() - abstractRunnableC6921h.f18407w;
            long j = C6925l.f18411a;
            if (mo19789a < j) {
                return j - mo19789a;
            }
        } while (!f18419b.compareAndSet(c6927n, abstractRunnableC6921h, null));
        m19785b(this, abstractRunnableC6921h, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC6921h m19786a(AbstractRunnableC6921h abstractRunnableC6921h, boolean z) {
        if (z) {
            return m19784c(abstractRunnableC6921h);
        }
        AbstractRunnableC6921h abstractRunnableC6921h2 = (AbstractRunnableC6921h) f18419b.getAndSet(this, abstractRunnableC6921h);
        if (abstractRunnableC6921h2 == null) {
            return null;
        }
        return m19784c(abstractRunnableC6921h2);
    }

    /* renamed from: e */
    public final int m19782e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m19781f() {
        return this.lastScheduledTask != null ? m19782e() + 1 : m19782e();
    }

    /* renamed from: g */
    public final void m19780g(C6917d c6917d) {
        AbstractRunnableC6921h abstractRunnableC6921h = (AbstractRunnableC6921h) f18419b.getAndSet(this, null);
        if (abstractRunnableC6921h != null) {
            c6917d.m19864a(abstractRunnableC6921h);
        }
        do {
        } while (m19777j(c6917d));
    }

    /* renamed from: h */
    public final AbstractRunnableC6921h m19779h() {
        AbstractRunnableC6921h abstractRunnableC6921h = (AbstractRunnableC6921h) f18419b.getAndSet(this, null);
        return abstractRunnableC6921h == null ? m19778i() : abstractRunnableC6921h;
    }

    /* renamed from: k */
    public final long m19776k(C6927n c6927n) {
        if (C10539l0.m7720a()) {
            if (!(m19782e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = c6927n.producerIndex;
        AtomicReferenceArray<AbstractRunnableC6921h> atomicReferenceArray = c6927n.f18423a;
        for (int i2 = c6927n.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c6927n.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC6921h abstractRunnableC6921h = atomicReferenceArray.get(i3);
            if (abstractRunnableC6921h != null) {
                if ((abstractRunnableC6921h.f18408x.mo19787b() == 1) && atomicReferenceArray.compareAndSet(i3, abstractRunnableC6921h, null)) {
                    f18422e.decrementAndGet(c6927n);
                    m19785b(this, abstractRunnableC6921h, false, 2, null);
                    return -1L;
                }
            }
        }
        return m19774m(c6927n, true);
    }

    /* renamed from: l */
    public final long m19775l(C6927n c6927n) {
        if (C10539l0.m7720a()) {
            if (!(m19782e() == 0)) {
                throw new AssertionError();
            }
        }
        AbstractRunnableC6921h m19778i = c6927n.m19778i();
        if (m19778i != null) {
            AbstractRunnableC6921h m19785b = m19785b(this, m19778i, false, 2, null);
            if (C10539l0.m7720a()) {
                if (m19785b == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return m19774m(c6927n, false);
    }
}
