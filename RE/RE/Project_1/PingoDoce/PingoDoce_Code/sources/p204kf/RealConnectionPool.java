package p204kf;

import gf.Util;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.platform.Platform;
import p107ff.Address;
import p181jd.Intrinsics;
import p182jf.Task;
import p182jf.TaskQueue;
import p182jf.TaskRunner;
import p468yc.C13195u;

/* renamed from: kf.a */
/* loaded from: classes2.dex */
public final class RealConnectionPool {

    /* renamed from: a */
    private final int f17948a;

    /* renamed from: b */
    private final long f17949b;

    /* renamed from: c */
    private final TaskQueue f17950c;

    /* renamed from: d */
    private final C6660b f17951d;

    /* renamed from: e */
    private final ConcurrentLinkedQueue f17952e;

    /* compiled from: RealConnectionPool.kt */
    /* renamed from: kf.a$a */
    /* loaded from: classes2.dex */
    public static final class C6659a {
        private C6659a() {
        }

        public /* synthetic */ C6659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    /* renamed from: kf.a$b */
    /* loaded from: classes2.dex */
    public static final class C6660b extends Task {
        C6660b(String str) {
            super(str, false, 2, null);
        }

        /* renamed from: f */
        public long mo20881f() {
            return RealConnectionPool.this.m20373b(System.nanoTime());
        }
    }

    static {
        new C6659a(null);
    }

    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
        Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
        Intrinsics.isThisObjectNull(timeUnit, "timeUnit");
        this.f17948a = i;
        this.f17949b = timeUnit.toNanos(j);
        this.f17950c = taskRunner.m20857i();
        this.f17951d = new C6660b(Intrinsics.addStrAndObj(Util.f15906h, " ConnectionPool"));
        this.f17952e = new ConcurrentLinkedQueue();
        if (!(j > 0)) {
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    /* renamed from: d */
    private final int m20371d(RealConnection realConnection, long j) {
        if (Util.f15905g && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List m16799o = realConnection.m16799o();
        int i = 0;
        while (i < m16799o.size()) {
            Reference reference = (Reference) m16799o.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.f21214a.m16457g().m16467l("A connection to " + realConnection.m16821A().m24151a().m24279l() + " was leaked. Did you forget to close a response body?", ((RealCall.C8104b) reference).m16823a());
                m16799o.remove(i);
                realConnection.m16818D(true);
                if (m16799o.isEmpty()) {
                    realConnection.m16819C(j - this.f17949b);
                    return 0;
                }
            }
        }
        return m16799o.size();
    }

    /* renamed from: a */
    public final boolean m20374a(Address address, RealCall realCall, List list, boolean z) {
        Intrinsics.isThisObjectNull(address, "address");
        Intrinsics.isThisObjectNull(realCall, "call");
        Iterator it = this.f17952e.iterator();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            Intrinsics.checkIfNull(realConnection, "connection");
            synchronized (realConnection) {
                if (z) {
                    if (!realConnection.m16791w()) {
                        C13195u c13195u = C13195u.f34156a;
                    }
                }
                if (realConnection.m16793u(address, list)) {
                    realCall.m16848c(realConnection);
                    return true;
                }
                C13195u c13195u2 = C13195u.f34156a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m20373b(long j) {
        Iterator it = this.f17952e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        while (it.hasNext()) {
            RealConnection realConnection2 = (RealConnection) it.next();
            Intrinsics.checkIfNull(realConnection2, "connection");
            synchronized (realConnection2) {
                if (m20371d(realConnection2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long m16798p = j - realConnection2.m16798p();
                    if (m16798p > j2) {
                        realConnection = realConnection2;
                        j2 = m16798p;
                    }
                    C13195u c13195u = C13195u.f34156a;
                }
            }
        }
        long j3 = this.f17949b;
        if (j2 < j3 && i <= this.f17948a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.ifNullDoSomething(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m16799o().isEmpty()) {
                return 0L;
            }
            if (realConnection.m16798p() + j2 != j) {
                return 0L;
            }
            realConnection.m16818D(true);
            this.f17952e.remove(realConnection);
            Util.m23403n(realConnection.m16817E());
            if (this.f17952e.isEmpty()) {
                this.f17950c.m20880a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m20372c(RealConnection realConnection) {
        Intrinsics.isThisObjectNull(realConnection, "connection");
        if (Util.f15905g && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        } else if (!realConnection.m16797q() && this.f17948a != 0) {
            TaskQueue.m20871j(this.f17950c, this.f17951d, 0L, 2, null);
            return false;
        } else {
            realConnection.m16818D(true);
            this.f17952e.remove(realConnection);
            if (this.f17952e.isEmpty()) {
                this.f17950c.m20880a();
                return true;
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void m20370e(RealConnection realConnection) {
        Intrinsics.isThisObjectNull(realConnection, "connection");
        if (Util.f15905g && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        this.f17952e.add(realConnection);
        TaskQueue.m20871j(this.f17950c, this.f17951d, 0L, 2, null);
    }
}
