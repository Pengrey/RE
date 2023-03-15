package p182jf;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: jf.e */
/* loaded from: classes2.dex */
public final class TaskRunner {

    /* renamed from: h */
    public static final C6454b f17552h = new C6454b(null);

    /* renamed from: i */
    public static final TaskRunner f17553i = new TaskRunner(new C6455c(Util.m23430M(Intrinsics.addStrAndObj(Util.f15906h, " TaskRunner"), true)));

    /* renamed from: j */
    private static final Logger f17554j;

    /* renamed from: a */
    private final InterfaceC6453a f17555a;

    /* renamed from: b */
    private int f17556b;

    /* renamed from: c */
    private boolean f17557c;

    /* renamed from: d */
    private long f17558d;

    /* renamed from: e */
    private final List f17559e;

    /* renamed from: f */
    private final List f17560f;

    /* renamed from: g */
    private final Runnable f17561g;

    /* compiled from: TaskRunner.kt */
    /* renamed from: jf.e$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC6453a {
        /* renamed from: a */
        void m20855a(TaskRunner taskRunner);

        /* renamed from: b */
        long m20854b();

        /* renamed from: c */
        void m20853c(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    /* renamed from: jf.e$b */
    /* loaded from: classes2.dex */
    public static final class C6454b {
        private C6454b() {
        }

        public /* synthetic */ C6454b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m20852a() {
            return TaskRunner.m20865a();
        }
    }

    /* compiled from: TaskRunner.kt */
    /* renamed from: jf.e$c */
    /* loaded from: classes2.dex */
    public static final class C6455c implements InterfaceC6453a {

        /* renamed from: a */
        private final ThreadPoolExecutor f17562a;

        public C6455c(ThreadFactory threadFactory) {
            Intrinsics.isThisObjectNull(threadFactory, "threadFactory");
            this.f17562a = new ThreadPoolExecutor(0, (int) Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public void m20851a(TaskRunner taskRunner) {
            Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        /* renamed from: b */
        public long m20850b() {
            return System.nanoTime();
        }

        /* renamed from: c */
        public void m20849c(TaskRunner taskRunner, long j) throws InterruptedException {
            Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            Intrinsics.isThisObjectNull(runnable, "runnable");
            this.f17562a.execute(runnable);
        }
    }

    /* compiled from: TaskRunner.kt */
    /* renamed from: jf.e$d */
    /* loaded from: classes2.dex */
    public static final class RunnableC6456d implements Runnable {
        RunnableC6456d() {
        }

        public void run() {
            Task m20862d;
            while (true) {
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    m20862d = taskRunner.m20862d();
                }
                if (m20862d == null) {
                    return;
                }
                TaskQueue m20887d = m20862d.m20887d();
                Intrinsics.ifNullDoSomething(m20887d);
                TaskRunner taskRunner2 = TaskRunner.this;
                long j = -1;
                boolean isLoggable = TaskRunner.f17552h.m20852a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j = m20887d.m20873h().m20859g().m20854b();
                    C6451b.m20884a(m20862d, m20887d, "starting");
                }
                try {
                    TaskRunner.m20864b(taskRunner2, m20862d);
                    C13195u c13195u = C13195u.f34156a;
                    if (isLoggable) {
                        C6451b.m20884a(m20862d, m20887d, Intrinsics.addStrAndObj("finished run in ", C6451b.m20883b(m20887d.m20873h().m20859g().m20854b() - j)));
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C6451b.m20884a(m20862d, m20887d, Intrinsics.addStrAndObj("failed a run in ", C6451b.m20883b(m20887d.m20873h().m20859g().m20854b() - j)));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkIfNull(logger, "getLogger(TaskRunner::class.java.name)");
        f17554j = logger;
    }

    public TaskRunner(InterfaceC6453a interfaceC6453a) {
        Intrinsics.isThisObjectNull(interfaceC6453a, "backend");
        this.f17555a = interfaceC6453a;
        this.f17556b = 10000;
        this.f17559e = new ArrayList();
        this.f17560f = new ArrayList();
        this.f17561g = new RunnableC6456d();
    }

    /* renamed from: a */
    public static final /* synthetic */ Logger m20865a() {
        return f17554j;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m20864b(TaskRunner taskRunner, Task task) {
        taskRunner.m20856j(task);
    }

    /* renamed from: c */
    private final void m20863c(Task task, long j) {
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        TaskQueue m20887d = task.m20887d();
        Intrinsics.ifNullDoSomething(m20887d);
        if (m20887d.m20878c() == task) {
            boolean m20877d = m20887d.m20877d();
            m20887d.m20868m(false);
            m20887d.m20869l(null);
            this.f17559e.remove(m20887d);
            if (j != -1 && !m20877d && !m20887d.m20874g()) {
                m20887d.m20870k(task, j, true);
            }
            if (!m20887d.m20876e().isEmpty()) {
                this.f17560f.add(m20887d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    private final void m20861e(Task task) {
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        task.m20885g(-1L);
        TaskQueue m20887d = task.m20887d();
        Intrinsics.ifNullDoSomething(m20887d);
        m20887d.m20876e().remove(task);
        this.f17560f.remove(m20887d);
        m20887d.m20869l(task);
        this.f17559e.add(m20887d);
    }

    /* renamed from: j */
    private final void m20856j(Task task) {
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.m20889b());
        try {
            long mo20881f = task.mo20881f();
            synchronized (this) {
                m20863c(task, mo20881f);
                C13195u c13195u = C13195u.f34156a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                m20863c(task, -1L);
                C13195u c13195u2 = C13195u.f34156a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final Task m20862d() {
        boolean z;
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f17560f.isEmpty()) {
            long m20854b = this.f17555a.m20854b();
            long j = Long.MAX_VALUE;
            Iterator it = this.f17560f.iterator();
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).m20876e().get(0);
                long max = Math.max(0L, task2.m20888c() - m20854b);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (task != null) {
                    z = true;
                    break;
                } else {
                    task = task2;
                }
            }
            if (task != null) {
                m20861e(task);
                if (z || (!this.f17557c && (!this.f17560f.isEmpty()))) {
                    this.f17555a.execute(this.f17561g);
                }
                return task;
            } else if (this.f17557c) {
                if (j < this.f17558d - m20854b) {
                    this.f17555a.m20855a(this);
                }
                return null;
            } else {
                this.f17557c = true;
                this.f17558d = m20854b + j;
                try {
                    try {
                        this.f17555a.m20853c(this, j);
                    } catch (InterruptedException unused) {
                        m20860f();
                    }
                } finally {
                    this.f17557c = false;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m20860f() {
        int size = this.f17559e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((TaskQueue) this.f17559e.get(size)).m20879b();
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        int size2 = this.f17560f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            TaskQueue taskQueue = (TaskQueue) this.f17560f.get(size2);
            taskQueue.m20879b();
            if (taskQueue.m20876e().isEmpty()) {
                this.f17560f.remove(size2);
            }
            if (i2 < 0) {
                return;
            }
            size2 = i2;
        }
    }

    /* renamed from: g */
    public final InterfaceC6453a m20859g() {
        return this.f17555a;
    }

    /* renamed from: h */
    public final void m20858h(TaskQueue taskQueue) {
        Intrinsics.isThisObjectNull(taskQueue, "taskQueue");
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.m20878c() == null) {
            if (!taskQueue.m20876e().isEmpty()) {
                Util.m23414c(this.f17560f, taskQueue);
            } else {
                this.f17560f.remove(taskQueue);
            }
        }
        if (this.f17557c) {
            this.f17555a.m20855a(this);
        } else {
            this.f17555a.execute(this.f17561g);
        }
    }

    /* renamed from: i */
    public final TaskQueue m20857i() {
        int i;
        synchronized (this) {
            i = this.f17556b;
            this.f17556b = i + 1;
        }
        return new TaskQueue(this, Intrinsics.addStrAndObj("Q", Integer.valueOf(i)));
    }
}
