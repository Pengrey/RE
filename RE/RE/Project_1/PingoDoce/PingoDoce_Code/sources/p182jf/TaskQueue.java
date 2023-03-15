package p182jf;

import gf.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: jf.d */
/* loaded from: classes2.dex */
public final class TaskQueue {

    /* renamed from: a */
    private final TaskRunner f17546a;

    /* renamed from: b */
    private final String f17547b;

    /* renamed from: c */
    private boolean f17548c;

    /* renamed from: d */
    private Task f17549d;

    /* renamed from: e */
    private final List f17550e;

    /* renamed from: f */
    private boolean f17551f;

    public TaskQueue(TaskRunner taskRunner, String str) {
        Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
        Intrinsics.isThisObjectNull(str, "name");
        this.f17546a = taskRunner;
        this.f17547b = str;
        this.f17550e = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m20871j(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.m20872i(task, j);
    }

    /* renamed from: a */
    public final void m20880a() {
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f17546a) {
            if (m20879b()) {
                m20873h().m20858h(this);
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: b */
    public final boolean m20879b() {
        Task task = this.f17549d;
        if (task != null) {
            Intrinsics.ifNullDoSomething(task);
            if (task.m20890a()) {
                this.f17551f = true;
            }
        }
        boolean z = false;
        int size = this.f17550e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((Task) this.f17550e.get(size)).m20890a()) {
                    Task task2 = (Task) this.f17550e.get(size);
                    if (TaskRunner.f17552h.m20852a().isLoggable(Level.FINE)) {
                        C6451b.m20884a(task2, this, "canceled");
                    }
                    this.f17550e.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final Task m20878c() {
        return this.f17549d;
    }

    /* renamed from: d */
    public final boolean m20877d() {
        return this.f17551f;
    }

    /* renamed from: e */
    public final List m20876e() {
        return this.f17550e;
    }

    /* renamed from: f */
    public final String m20875f() {
        return this.f17547b;
    }

    /* renamed from: g */
    public final boolean m20874g() {
        return this.f17548c;
    }

    /* renamed from: h */
    public final TaskRunner m20873h() {
        return this.f17546a;
    }

    /* renamed from: i */
    public final void m20872i(Task task, long j) {
        Intrinsics.isThisObjectNull(task, "task");
        synchronized (this.f17546a) {
            if (m20874g()) {
                if (task.m20890a()) {
                    if (TaskRunner.f17552h.m20852a().isLoggable(Level.FINE)) {
                        C6451b.m20884a(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (TaskRunner.f17552h.m20852a().isLoggable(Level.FINE)) {
                    C6451b.m20884a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (m20870k(task, j, false)) {
                m20873h().m20858h(this);
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: k */
    public final boolean m20870k(Task task, long j, boolean z) {
        String addStrAndObj;
        Intrinsics.isThisObjectNull(task, "task");
        task.m20886e(this);
        long m20854b = this.f17546a.m20859g().m20854b();
        long j2 = m20854b + j;
        int indexOf = this.f17550e.indexOf(task);
        if (indexOf != -1) {
            if (task.m20888c() <= j2) {
                if (TaskRunner.f17552h.m20852a().isLoggable(Level.FINE)) {
                    C6451b.m20884a(task, this, "already scheduled");
                }
                return false;
            }
            this.f17550e.remove(indexOf);
        }
        task.m20885g(j2);
        if (TaskRunner.f17552h.m20852a().isLoggable(Level.FINE)) {
            if (z) {
                addStrAndObj = Intrinsics.addStrAndObj("run again after ", C6451b.m20883b(j2 - m20854b));
            } else {
                addStrAndObj = Intrinsics.addStrAndObj("scheduled after ", C6451b.m20883b(j2 - m20854b));
            }
            C6451b.m20884a(task, this, addStrAndObj);
        }
        Iterator it = this.f17550e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Task) it.next()).m20888c() - m20854b > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f17550e.size();
        }
        this.f17550e.add(i, task);
        return i == 0;
    }

    /* renamed from: l */
    public final void m20869l(Task task) {
        this.f17549d = task;
    }

    /* renamed from: m */
    public final void m20868m(boolean z) {
        this.f17551f = z;
    }

    /* renamed from: n */
    public final void m20867n(boolean z) {
        this.f17548c = z;
    }

    /* renamed from: o */
    public final void m20866o() {
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f17546a) {
            m20867n(true);
            if (m20879b()) {
                m20873h().m20858h(this);
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    public String toString() {
        return this.f17547b;
    }
}
