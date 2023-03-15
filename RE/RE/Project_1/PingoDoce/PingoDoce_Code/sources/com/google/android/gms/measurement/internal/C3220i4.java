package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes.dex */
public final class C3220i4 extends AbstractC3188f5 {

    /* renamed from: l */
    private static final AtomicLong f8515l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C3209h4 f8516c;

    /* renamed from: d */
    private C3209h4 f8517d;

    /* renamed from: e */
    private final PriorityBlockingQueue f8518e;

    /* renamed from: f */
    private final BlockingQueue f8519f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f8520g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f8521h;

    /* renamed from: i */
    private final Object f8522i;

    /* renamed from: j */
    private final Semaphore f8523j;

    /* renamed from: k */
    private volatile boolean f8524k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3220i4(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8522i = new Object();
        this.f8523j = new Semaphore(2);
        this.f8518e = new PriorityBlockingQueue();
        this.f8519f = new LinkedBlockingQueue();
        this.f8520g = new C3187f4(this, "Thread death: Uncaught exception on worker thread");
        this.f8521h = new C3187f4(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: D */
    private final void m31252D(C3198g4 c3198g4) {
        synchronized (this.f8522i) {
            this.f8518e.add(c3198g4);
            C3209h4 c3209h4 = this.f8516c;
            if (c3209h4 == null) {
                C3209h4 c3209h42 = new C3209h4(this, "Measurement Worker", this.f8518e);
                this.f8516c = c3209h42;
                c3209h42.setUncaughtExceptionHandler(this.f8520g);
                this.f8516c.start();
            } else {
                c3209h4.m31260a();
            }
        }
    }

    /* renamed from: A */
    public final void m31255A(Runnable runnable) throws IllegalStateException {
        m31346k();
        C2597i.m33076j(runnable);
        m31252D(new C3198g4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m31253C() {
        return Thread.currentThread() == this.f8516c;
    }

    @Override // com.google.android.gms.measurement.internal.C3177e5
    /* renamed from: g */
    public final void mo31251g() {
        if (Thread.currentThread() != this.f8517d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3177e5
    /* renamed from: h */
    public final void mo30825h() {
        if (Thread.currentThread() != this.f8516c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: j */
    protected final boolean mo31007j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final Object m31247r(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f8410a.mo31118b().m31239z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.f8410a.mo31116d().m31327w().m31398a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f8410a.mo31116d().m31327w().m31398a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return obj;
    }

    /* renamed from: s */
    public final Future m31246s(Callable callable) throws IllegalStateException {
        m31346k();
        C2597i.m33076j(callable);
        C3198g4 c3198g4 = new C3198g4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8516c) {
            if (!this.f8518e.isEmpty()) {
                this.f8410a.mo31116d().m31327w().m31398a("Callable skipped the worker queue.");
            }
            c3198g4.run();
        } else {
            m31252D(c3198g4);
        }
        return c3198g4;
    }

    /* renamed from: t */
    public final Future m31245t(Callable callable) throws IllegalStateException {
        m31346k();
        C2597i.m33076j(callable);
        C3198g4 c3198g4 = new C3198g4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8516c) {
            c3198g4.run();
        } else {
            m31252D(c3198g4);
        }
        return c3198g4;
    }

    /* renamed from: y */
    public final void m31240y(Runnable runnable) throws IllegalStateException {
        m31346k();
        C2597i.m33076j(runnable);
        C3198g4 c3198g4 = new C3198g4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8522i) {
            this.f8519f.add(c3198g4);
            C3209h4 c3209h4 = this.f8517d;
            if (c3209h4 == null) {
                C3209h4 c3209h42 = new C3209h4(this, "Measurement Network", this.f8519f);
                this.f8517d = c3209h42;
                c3209h42.setUncaughtExceptionHandler(this.f8521h);
                this.f8517d.start();
            } else {
                c3209h4.m31260a();
            }
        }
    }

    /* renamed from: z */
    public final void m31239z(Runnable runnable) throws IllegalStateException {
        m31346k();
        C2597i.m33076j(runnable);
        m31252D(new C3198g4(this, runnable, false, "Task exception on worker thread"));
    }
}
