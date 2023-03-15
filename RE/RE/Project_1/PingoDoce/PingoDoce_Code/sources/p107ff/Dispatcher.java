package p107ff;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealCall;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: ff.p */
/* loaded from: classes2.dex */
public final class Dispatcher {

    /* renamed from: c */
    private Runnable f15517c;

    /* renamed from: d */
    private ExecutorService f15518d;

    /* renamed from: a */
    private int f15519a = 64;

    /* renamed from: b */
    private int f15520b = 5;

    /* renamed from: e */
    private final ArrayDeque f15521e = new ArrayDeque();

    /* renamed from: f */
    private final ArrayDeque f15522f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f15523g = new ArrayDeque();

    /* renamed from: d */
    private final RealCall.RunnableC8103a m24068d(String str) {
        Iterator it = this.f15522f.iterator();
        while (it.hasNext()) {
            RealCall.RunnableC8103a runnableC8103a = (RealCall.RunnableC8103a) it.next();
            if (Intrinsics.equals(runnableC8103a.m16825d(), str)) {
                return runnableC8103a;
            }
        }
        Iterator it2 = this.f15521e.iterator();
        while (it2.hasNext()) {
            RealCall.RunnableC8103a runnableC8103a2 = (RealCall.RunnableC8103a) it2.next();
            if (Intrinsics.equals(runnableC8103a2.m16825d(), str)) {
                return runnableC8103a2;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final void m24067e(Deque deque, Object obj) {
        Runnable m24064h;
        synchronized (this) {
            if (deque.remove(obj)) {
                m24064h = m24064h();
                C13195u c13195u = C13195u.f34156a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m24061k() || m24064h == null) {
            return;
        }
        m24064h.run();
    }

    /* renamed from: k */
    private final boolean m24061k() {
        int i;
        boolean z;
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f15521e.iterator();
            Intrinsics.checkIfNull(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.RunnableC8103a runnableC8103a = (RealCall.RunnableC8103a) it.next();
                if (this.f15522f.size() >= m24063i()) {
                    break;
                } else if (runnableC8103a.m16826c().get() < m24062j()) {
                    it.remove();
                    runnableC8103a.m16826c().incrementAndGet();
                    Intrinsics.checkIfNull(runnableC8103a, "asyncCall");
                    arrayList.add(runnableC8103a);
                    this.f15522f.add(runnableC8103a);
                }
            }
            z = m24060l() > 0;
            C13195u c13195u = C13195u.f34156a;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.RunnableC8103a) arrayList.get(i)).m16828a(m24069c());
        }
        return z;
    }

    /* renamed from: a */
    public final void m24071a(RealCall.RunnableC8103a runnableC8103a) {
        RealCall.RunnableC8103a m24068d;
        Intrinsics.isThisObjectNull(runnableC8103a, "call");
        synchronized (this) {
            this.f15521e.add(runnableC8103a);
            if (!runnableC8103a.m16827b().m16838n() && (m24068d = m24068d(runnableC8103a.m16825d())) != null) {
                runnableC8103a.m16824e(m24068d);
            }
            C13195u c13195u = C13195u.f34156a;
        }
        m24061k();
    }

    /* renamed from: b */
    public final synchronized void m24070b(RealCall realCall) {
        Intrinsics.isThisObjectNull(realCall, "call");
        this.f15523g.add(realCall);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m24069c() {
        ExecutorService executorService;
        if (this.f15518d == null) {
            this.f15518d = new ThreadPoolExecutor(0, (int) Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.m23430M(Intrinsics.addStrAndObj(Util.f15906h, " Dispatcher"), false));
        }
        executorService = this.f15518d;
        Intrinsics.ifNullDoSomething(executorService);
        return executorService;
    }

    /* renamed from: f */
    public final void m24066f(RealCall.RunnableC8103a runnableC8103a) {
        Intrinsics.isThisObjectNull(runnableC8103a, "call");
        runnableC8103a.m16826c().decrementAndGet();
        m24067e(this.f15522f, runnableC8103a);
    }

    /* renamed from: g */
    public final void m24065g(RealCall realCall) {
        Intrinsics.isThisObjectNull(realCall, "call");
        m24067e(this.f15523g, realCall);
    }

    /* renamed from: h */
    public final synchronized Runnable m24064h() {
        return this.f15517c;
    }

    /* renamed from: i */
    public final synchronized int m24063i() {
        return this.f15519a;
    }

    /* renamed from: j */
    public final synchronized int m24062j() {
        return this.f15520b;
    }

    /* renamed from: l */
    public final synchronized int m24060l() {
        return this.f15522f.size() + this.f15523g.size();
    }

    /* renamed from: m */
    public final void m24059m(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f15519a = i;
                C13195u c13195u = C13195u.f34156a;
            }
            m24061k();
            return;
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("max < 1: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: n */
    public final void m24058n(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f15520b = i;
                C13195u c13195u = C13195u.f34156a;
            }
            m24061k();
            return;
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("max < 1: ", Integer.valueOf(i)).toString());
    }
}
