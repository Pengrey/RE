package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.crashlytics.internal.common.h */
/* loaded from: classes.dex */
public class C4199h {

    /* renamed from: a */
    private final Executor f11448a;

    /* renamed from: b */
    private AbstractC3419d<Void> f11449b = C3425g.m30765e(null);

    /* renamed from: c */
    private final Object f11450c = new Object();

    /* renamed from: d */
    private final ThreadLocal<Boolean> f11451d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$a */
    /* loaded from: classes.dex */
    class RunnableC4200a implements Runnable {
        RunnableC4200a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4199h.this.f11451d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$b */
    /* loaded from: classes.dex */
    class CallableC4201b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f11453a;

        CallableC4201b(C4199h c4199h, Runnable runnable) {
            this.f11453a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            this.f11453a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$c */
    /* loaded from: classes.dex */
    public class C4202c implements InterfaceC3415b<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f11454a;

        C4202c(C4199h c4199h, Callable callable) {
            this.f11454a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // com.google.android.gms.tasks.InterfaceC3415b
        /* renamed from: a */
        public T mo4684a(AbstractC3419d<Void> abstractC3419d) throws Exception {
            return this.f11454a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h$d */
    /* loaded from: classes.dex */
    public class C4203d implements InterfaceC3415b<T, Void> {
        C4203d(C4199h c4199h) {
        }

        @Override // com.google.android.gms.tasks.InterfaceC3415b
        /* renamed from: b */
        public Void mo4684a(AbstractC3419d<T> abstractC3419d) throws Exception {
            return null;
        }
    }

    public C4199h(Executor executor) {
        this.f11448a = executor;
        executor.execute(new RunnableC4200a());
    }

    /* renamed from: d */
    private <T> AbstractC3419d<Void> m28348d(AbstractC3419d<T> abstractC3419d) {
        return abstractC3419d.mo30788h(this.f11448a, new C4203d(this));
    }

    /* renamed from: e */
    private boolean m28347e() {
        return Boolean.TRUE.equals(this.f11451d.get());
    }

    /* renamed from: f */
    private <T> InterfaceC3415b<Void, T> m28346f(Callable<T> callable) {
        return new C4202c(this, callable);
    }

    /* renamed from: b */
    public void m28350b() {
        if (!m28347e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m28349c() {
        return this.f11448a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC3419d<Void> m28345g(Runnable runnable) {
        return m28344h(new CallableC4201b(this, runnable));
    }

    /* renamed from: h */
    public <T> AbstractC3419d<T> m28344h(Callable<T> callable) {
        AbstractC3419d<T> mo30788h;
        synchronized (this.f11450c) {
            mo30788h = this.f11449b.mo30788h(this.f11448a, m28346f(callable));
            this.f11449b = m28348d(mo30788h);
        }
        return mo30788h;
    }

    /* renamed from: i */
    public <T> AbstractC3419d<T> m28343i(Callable<AbstractC3419d<T>> callable) {
        AbstractC3419d<T> mo30786j;
        synchronized (this.f11450c) {
            mo30786j = this.f11449b.mo30786j(this.f11448a, m28346f(callable));
            this.f11449b = m28348d(mo30786j);
        }
        return mo30786j;
    }
}
