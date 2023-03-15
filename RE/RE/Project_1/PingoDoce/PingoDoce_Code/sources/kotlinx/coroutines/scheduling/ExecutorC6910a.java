package kotlinx.coroutines.scheduling;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C6856c0;
import kotlinx.coroutines.internal.C6867h0;
import p181jd.Intrinsics;
import p255nd.AbstractC7700c;
import p297pd._Ranges;
import p468yc.C13195u;
import td.C10489c;
import td.C10539l0;
import td.C10543m0;

/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: classes2.dex */
public final class ExecutorC6910a implements Executor, Closeable {

    /* renamed from: D */
    private static final /* synthetic */ AtomicLongFieldUpdater f18378D;

    /* renamed from: E */
    static final /* synthetic */ AtomicLongFieldUpdater f18379E;

    /* renamed from: F */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18380F;

    /* renamed from: G */
    public static final C6867h0 f18381G;

    /* renamed from: A */
    public final C6917d f18382A;

    /* renamed from: B */
    public final C6917d f18383B;

    /* renamed from: C */
    public final C6856c0 f18384C;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: w */
    public final int f18385w;

    /* renamed from: x */
    public final int f18386x;

    /* renamed from: y */
    public final long f18387y;

    /* renamed from: z */
    public final String f18388z;

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: classes2.dex */
    public static final class C6911a {
        private C6911a() {
        }

        public /* synthetic */ C6911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6912b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18389a;

        static {
            int[] iArr = new int[EnumC6914d.values().length];
            iArr[EnumC6914d.PARKING.ordinal()] = 1;
            iArr[EnumC6914d.BLOCKING.ordinal()] = 2;
            iArr[EnumC6914d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC6914d.DORMANT.ordinal()] = 4;
            iArr[EnumC6914d.TERMINATED.ordinal()] = 5;
            f18389a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    /* loaded from: classes2.dex */
    public enum EnumC6914d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C6911a(null);
        f18381G = new C6867h0("NOT_IN_STACK");
        f18378D = AtomicLongFieldUpdater.newUpdater(ExecutorC6910a.class, "parkedWorkersStack");
        f18379E = AtomicLongFieldUpdater.newUpdater(ExecutorC6910a.class, "controlState");
        f18380F = AtomicIntegerFieldUpdater.newUpdater(ExecutorC6910a.class, "_isTerminated");
    }

    public ExecutorC6910a(int i, int i2, long j, String str) {
        this.f18385w = i;
        this.f18386x = i2;
        this.f18387y = j;
        this.f18388z = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j > 0) {
            this.f18382A = new C6917d();
            this.f18383B = new C6917d();
            this.parkedWorkersStack = 0L;
            this.f18384C = new C6856c0(i + 1);
            this.controlState = i << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
    }

    /* renamed from: E */
    private final int m19831E(C6913c c6913c) {
        Object m19805h = c6913c.m19805h();
        while (m19805h != f18381G) {
            if (m19805h == null) {
                return 0;
            }
            C6913c c6913c2 = (C6913c) m19805h;
            int m19806g = c6913c2.m19806g();
            if (m19806g != 0) {
                return m19806g;
            }
            m19805h = c6913c2.m19805h();
        }
        return -1;
    }

    /* renamed from: F */
    private final C6913c m19830F() {
        while (true) {
            long j = this.parkedWorkersStack;
            C6913c c6913c = (C6913c) this.f18384C.m20004b((int) (2097151 & j));
            if (c6913c == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int m19831E = m19831E(c6913c);
            if (m19831E >= 0 && f18378D.compareAndSet(this, j, m19831E | j2)) {
                c6913c.m19797p(f18381G);
                return c6913c;
            }
        }
    }

    /* renamed from: R */
    private final void m19825R(boolean z) {
        long addAndGet = f18379E.addAndGet(this, 2097152L);
        if (z || m19818d0() || m19821a0(addAndGet)) {
            return;
        }
        m19818d0();
    }

    /* renamed from: X */
    private final AbstractRunnableC6921h m19823X(C6913c c6913c, AbstractRunnableC6921h abstractRunnableC6921h, boolean z) {
        if (c6913c == null || c6913c.f18395x == EnumC6914d.TERMINATED) {
            return abstractRunnableC6921h;
        }
        if (abstractRunnableC6921h.f18408x.mo19787b() == 0 && c6913c.f18395x == EnumC6914d.BLOCKING) {
            return abstractRunnableC6921h;
        }
        c6913c.f18392B = true;
        return c6913c.f18394w.m19786a(abstractRunnableC6921h, z);
    }

    /* renamed from: a */
    private final boolean m19822a(AbstractRunnableC6921h abstractRunnableC6921h) {
        if (abstractRunnableC6921h.f18408x.mo19787b() == 1) {
            return this.f18383B.m19864a(abstractRunnableC6921h);
        }
        return this.f18382A.m19864a(abstractRunnableC6921h);
    }

    /* renamed from: a0 */
    private final boolean m19821a0(long j) {
        int m15005d;
        m15005d = _Ranges.m15005d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (m15005d < this.f18385w) {
            int m19819c = m19819c();
            if (m19819c == 1 && this.f18385w > 1) {
                m19819c();
            }
            if (m19819c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    static /* synthetic */ boolean m19820b0(ExecutorC6910a executorC6910a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = executorC6910a.controlState;
        }
        return executorC6910a.m19821a0(j);
    }

    /* renamed from: c */
    private final int m19819c() {
        int m15005d;
        synchronized (this.f18384C) {
            if (m19813y()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            m15005d = _Ranges.m15005d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (m15005d >= this.f18385w) {
                return 0;
            }
            if (i >= this.f18386x) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f18384C.m20004b(i2) == null) {
                C6913c c6913c = new C6913c(this, i2);
                this.f18384C.m20003c(i2, c6913c);
                if (i2 == ((int) (2097151 & f18379E.incrementAndGet(this)))) {
                    c6913c.start();
                    return m15005d + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: d0 */
    private final boolean m19818d0() {
        C6913c m19830F;
        do {
            m19830F = m19830F();
            if (m19830F == null) {
                return false;
            }
        } while (!C6913c.f18390D.compareAndSet(m19830F, -1, 0));
        LockSupport.unpark(m19830F);
        return true;
    }

    /* renamed from: h */
    private final C6913c m19816h() {
        Thread currentThread = Thread.currentThread();
        C6913c c6913c = currentThread instanceof C6913c ? (C6913c) currentThread : null;
        if (c6913c == null || !Intrinsics.equals(C6913c.m19812a(c6913c), this)) {
            return null;
        }
        return c6913c;
    }

    /* renamed from: v */
    public static /* synthetic */ void m19814v(ExecutorC6910a executorC6910a, Runnable runnable, InterfaceC6922i interfaceC6922i, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6922i = C6925l.f18416f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC6910a.m19815t(runnable, interfaceC6922i, z);
    }

    /* renamed from: H */
    public final boolean m19829H(C6913c c6913c) {
        long j;
        long j2;
        int m19806g;
        if (c6913c.m19805h() != f18381G) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & (-2097152);
            m19806g = c6913c.m19806g();
            if (C10539l0.m7720a()) {
                if (!(m19806g != 0)) {
                    throw new AssertionError();
                }
            }
            c6913c.m19797p(this.f18384C.m20004b(i));
        } while (!f18378D.compareAndSet(this, j, m19806g | j2));
        return true;
    }

    /* renamed from: L */
    public final void m19828L(C6913c c6913c, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? m19831E(c6913c) : i2;
            }
            if (i3 >= 0 && f18378D.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    /* renamed from: M */
    public final void m19827M(AbstractRunnableC6921h abstractRunnableC6921h) {
        try {
            abstractRunnableC6921h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: P */
    public final void m19826P(long j) {
        int i;
        AbstractRunnableC6921h m19861d;
        if (f18380F.compareAndSet(this, 0, 1)) {
            C6913c m19816h = m19816h();
            synchronized (this.f18384C) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object m20004b = this.f18384C.m20004b(i2);
                    Intrinsics.ifNullDoSomething(m20004b);
                    C6913c c6913c = (C6913c) m20004b;
                    if (c6913c != m19816h) {
                        while (c6913c.isAlive()) {
                            LockSupport.unpark(c6913c);
                            c6913c.join(j);
                        }
                        EnumC6914d enumC6914d = c6913c.f18395x;
                        if (C10539l0.m7720a()) {
                            if (!(enumC6914d == EnumC6914d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        c6913c.f18394w.m19780g(this.f18383B);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f18383B.m19863b();
            this.f18382A.m19863b();
            while (true) {
                if (m19816h != null) {
                    m19861d = m19816h.m19807f(true);
                    if (m19861d != null) {
                        continue;
                        m19827M(m19861d);
                    }
                }
                m19861d = this.f18382A.m19861d();
                if (m19861d == null && (m19861d = this.f18383B.m19861d()) == null) {
                    break;
                }
                m19827M(m19861d);
            }
            if (m19816h != null) {
                m19816h.m19794s(EnumC6914d.TERMINATED);
            }
            if (C10539l0.m7720a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f18385w)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* renamed from: W */
    public final void m19824W() {
        if (m19818d0() || m19820b0(this, 0L, 1, null)) {
            return;
        }
        m19818d0();
    }

    public void close() {
        m19826P(10000L);
    }

    /* renamed from: e */
    public final AbstractRunnableC6921h m19817e(Runnable runnable, InterfaceC6922i interfaceC6922i) {
        long mo19789a = C6925l.f18415e.mo19789a();
        if (runnable instanceof AbstractRunnableC6921h) {
            AbstractRunnableC6921h abstractRunnableC6921h = (AbstractRunnableC6921h) runnable;
            abstractRunnableC6921h.f18407w = mo19789a;
            abstractRunnableC6921h.f18408x = interfaceC6922i;
            return abstractRunnableC6921h;
        }
        return new C6924k(runnable, mo19789a, interfaceC6922i);
    }

    public void execute(Runnable runnable) {
        m19814v(this, runnable, null, false, 6, null);
    }

    /* renamed from: t */
    public final void m19815t(Runnable runnable, InterfaceC6922i interfaceC6922i, boolean z) {
        C10489c.m7844a();
        AbstractRunnableC6921h m19817e = m19817e(runnable, interfaceC6922i);
        C6913c m19816h = m19816h();
        AbstractRunnableC6921h m19823X = m19823X(m19816h, m19817e, z);
        if (m19823X != null && !m19822a(m19823X)) {
            throw new RejectedExecutionException(this.f18388z + " was terminated");
        }
        boolean z2 = z && m19816h != null;
        if (m19817e.f18408x.mo19787b() != 0) {
            m19825R(z2);
        } else if (z2) {
        } else {
            m19824W();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m20005a = this.f18384C.m20005a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < m20005a; i6++) {
            C6913c c6913c = (C6913c) this.f18384C.m20004b(i6);
            if (c6913c != null) {
                int m19781f = c6913c.f18394w.m19781f();
                int i7 = C6912b.f18389a[c6913c.f18395x.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m19781f);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m19781f);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (m19781f > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m19781f);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f18388z + '@' + C10543m0.m7711b(this) + "[Pool Size {core = " + this.f18385w + ", max = " + this.f18386x + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f18382A.m19862c() + ", global blocking queue size = " + this.f18383B.m19862c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f18385w - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: y */
    public final boolean m19813y() {
        return this._isTerminated;
    }

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* loaded from: classes2.dex */
    public final class C6913c extends Thread {

        /* renamed from: D */
        static final /* synthetic */ AtomicIntegerFieldUpdater f18390D = AtomicIntegerFieldUpdater.newUpdater(C6913c.class, "workerCtl");

        /* renamed from: A */
        private int f18391A;

        /* renamed from: B */
        public boolean f18392B;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: w */
        public final C6927n f18394w;
        volatile /* synthetic */ int workerCtl;

        /* renamed from: x */
        public EnumC6914d f18395x;

        /* renamed from: y */
        private long f18396y;

        /* renamed from: z */
        private long f18397z;

        private C6913c() {
            setDaemon(true);
            this.f18394w = new C6927n();
            this.f18395x = EnumC6914d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC6910a.f18381G;
            this.f18391A = AbstractC7700c.f20299w.mo17674b();
        }

        /* renamed from: a */
        public static final /* synthetic */ ExecutorC6910a m19812a(C6913c c6913c) {
            return ExecutorC6910a.this;
        }

        /* renamed from: b */
        private final void m19811b(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC6910a.f18379E.addAndGet(ExecutorC6910a.this, -2097152L);
            EnumC6914d enumC6914d = this.f18395x;
            if (enumC6914d != EnumC6914d.TERMINATED) {
                if (C10539l0.m7720a()) {
                    if (!(enumC6914d == EnumC6914d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f18395x = EnumC6914d.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m19810c(int i) {
            if (i != 0 && m19794s(EnumC6914d.BLOCKING)) {
                ExecutorC6910a.this.m19824W();
            }
        }

        /* renamed from: d */
        private final void m19809d(AbstractRunnableC6921h abstractRunnableC6921h) {
            int mo19787b = abstractRunnableC6921h.f18408x.mo19787b();
            m19804i(mo19787b);
            m19810c(mo19787b);
            ExecutorC6910a.this.m19827M(abstractRunnableC6921h);
            m19811b(mo19787b);
        }

        /* renamed from: e */
        private final AbstractRunnableC6921h m19808e(boolean z) {
            AbstractRunnableC6921h m19800m;
            AbstractRunnableC6921h m19800m2;
            if (z) {
                boolean z2 = m19802k(ExecutorC6910a.this.f18385w * 2) == 0;
                if (z2 && (m19800m2 = m19800m()) != null) {
                    return m19800m2;
                }
                AbstractRunnableC6921h m19779h = this.f18394w.m19779h();
                if (m19779h != null) {
                    return m19779h;
                }
                if (!z2 && (m19800m = m19800m()) != null) {
                    return m19800m;
                }
            } else {
                AbstractRunnableC6921h m19800m3 = m19800m();
                if (m19800m3 != null) {
                    return m19800m3;
                }
            }
            return m19793t(false);
        }

        /* renamed from: i */
        private final void m19804i(int i) {
            this.f18396y = 0L;
            if (this.f18395x == EnumC6914d.PARKING) {
                if (C10539l0.m7720a()) {
                    if (!(i == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f18395x = EnumC6914d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m19803j() {
            return this.nextParkedWorker != ExecutorC6910a.f18381G;
        }

        /* renamed from: l */
        private final void m19801l() {
            if (this.f18396y == 0) {
                this.f18396y = System.nanoTime() + ExecutorC6910a.this.f18387y;
            }
            LockSupport.parkNanos(ExecutorC6910a.this.f18387y);
            if (System.nanoTime() - this.f18396y >= 0) {
                this.f18396y = 0L;
                m19792u();
            }
        }

        /* renamed from: m */
        private final AbstractRunnableC6921h m19800m() {
            if (m19802k(2) == 0) {
                AbstractRunnableC6921h m19861d = ExecutorC6910a.this.f18382A.m19861d();
                return m19861d != null ? m19861d : ExecutorC6910a.this.f18383B.m19861d();
            }
            AbstractRunnableC6921h m19861d2 = ExecutorC6910a.this.f18383B.m19861d();
            return m19861d2 != null ? m19861d2 : ExecutorC6910a.this.f18382A.m19861d();
        }

        /* renamed from: n */
        private final void m19799n() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC6910a.this.m19813y() && this.f18395x != EnumC6914d.TERMINATED) {
                    AbstractRunnableC6921h m19807f = m19807f(this.f18392B);
                    if (m19807f != null) {
                        this.f18397z = 0L;
                        m19809d(m19807f);
                    } else {
                        this.f18392B = false;
                        if (this.f18397z == 0) {
                            m19795r();
                        } else if (z) {
                            m19794s(EnumC6914d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f18397z);
                            this.f18397z = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            m19794s(EnumC6914d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m19796q() {
            boolean z;
            if (this.f18395x != EnumC6914d.CPU_ACQUIRED) {
                ExecutorC6910a executorC6910a = ExecutorC6910a.this;
                while (true) {
                    long j = executorC6910a.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (ExecutorC6910a.f18379E.compareAndSet(executorC6910a, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f18395x = EnumC6914d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m19795r() {
            if (!m19803j()) {
                ExecutorC6910a.this.m19829H(this);
                return;
            }
            if (C10539l0.m7720a()) {
                if (!(this.f18394w.m19781f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m19803j() && this.workerCtl == -1 && !ExecutorC6910a.this.m19813y() && this.f18395x != EnumC6914d.TERMINATED) {
                m19794s(EnumC6914d.PARKING);
                Thread.interrupted();
                m19801l();
            }
        }

        /* renamed from: t */
        private final AbstractRunnableC6921h m19793t(boolean z) {
            long m19775l;
            if (C10539l0.m7720a()) {
                if (!(this.f18394w.m19781f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (ExecutorC6910a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int m19802k = m19802k(i);
            ExecutorC6910a executorC6910a = ExecutorC6910a.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                m19802k++;
                if (m19802k > i) {
                    m19802k = 1;
                }
                C6913c c6913c = (C6913c) executorC6910a.f18384C.m20004b(m19802k);
                if (c6913c != null && c6913c != this) {
                    if (C10539l0.m7720a()) {
                        if (!(this.f18394w.m19781f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        m19775l = this.f18394w.m19776k(c6913c.f18394w);
                    } else {
                        m19775l = this.f18394w.m19775l(c6913c.f18394w);
                    }
                    if (m19775l == -1) {
                        return this.f18394w.m19779h();
                    }
                    if (m19775l > 0) {
                        j = Math.min(j, m19775l);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f18397z = j;
            return null;
        }

        /* renamed from: u */
        private final void m19792u() {
            ExecutorC6910a executorC6910a = ExecutorC6910a.this;
            synchronized (executorC6910a.f18384C) {
                if (executorC6910a.m19813y()) {
                    return;
                }
                if (((int) (executorC6910a.controlState & 2097151)) <= executorC6910a.f18385w) {
                    return;
                }
                if (f18390D.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    m19798o(0);
                    executorC6910a.m19828L(this, i, 0);
                    int andDecrement = (int) (ExecutorC6910a.f18379E.getAndDecrement(executorC6910a) & 2097151);
                    if (andDecrement != i) {
                        Object m20004b = executorC6910a.f18384C.m20004b(andDecrement);
                        Intrinsics.ifNullDoSomething(m20004b);
                        C6913c c6913c = (C6913c) m20004b;
                        executorC6910a.f18384C.m20003c(i, c6913c);
                        c6913c.m19798o(i);
                        executorC6910a.m19828L(c6913c, andDecrement, i);
                    }
                    executorC6910a.f18384C.m20003c(andDecrement, null);
                    C13195u c13195u = C13195u.f34156a;
                    this.f18395x = EnumC6914d.TERMINATED;
                }
            }
        }

        /* renamed from: f */
        public final AbstractRunnableC6921h m19807f(boolean z) {
            AbstractRunnableC6921h m19861d;
            if (m19796q()) {
                return m19808e(z);
            }
            if (z) {
                m19861d = this.f18394w.m19779h();
                if (m19861d == null) {
                    m19861d = ExecutorC6910a.this.f18383B.m19861d();
                }
            } else {
                m19861d = ExecutorC6910a.this.f18383B.m19861d();
            }
            return m19861d == null ? m19793t(true) : m19861d;
        }

        /* renamed from: g */
        public final int m19806g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object m19805h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int m19802k(int i) {
            int i2 = this.f18391A;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f18391A = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Reader.READ_DONE) % i;
        }

        /* renamed from: o */
        public final void m19798o(int i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC6910a.this.f18388z);
            sb2.append("-worker-");
            sb2.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb2.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void m19797p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m19799n();
        }

        /* renamed from: s */
        public final boolean m19794s(EnumC6914d enumC6914d) {
            EnumC6914d enumC6914d2 = this.f18395x;
            boolean z = enumC6914d2 == EnumC6914d.CPU_ACQUIRED;
            if (z) {
                ExecutorC6910a.f18379E.addAndGet(ExecutorC6910a.this, 4398046511104L);
            }
            if (enumC6914d2 != enumC6914d) {
                this.f18395x = enumC6914d;
            }
            return z;
        }

        public C6913c(ExecutorC6910a executorC6910a, int i) {
            this();
            m19798o(i);
        }
    }
}
