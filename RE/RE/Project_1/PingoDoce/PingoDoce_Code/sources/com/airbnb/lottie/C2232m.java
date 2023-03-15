package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p130h4.C5848d;

/* renamed from: com.airbnb.lottie.m */
/* loaded from: classes.dex */
public class C2232m<T> {

    /* renamed from: e */
    public static Executor f6489e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<InterfaceC2227h<T>> f6490a;

    /* renamed from: b */
    private final Set<InterfaceC2227h<Throwable>> f6491b;

    /* renamed from: c */
    private final Handler f6492c;

    /* renamed from: d */
    private volatile C2231l<T> f6493d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.m$a */
    /* loaded from: classes.dex */
    public class RunnableC2233a implements Runnable {
        RunnableC2233a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2232m.this.f6493d == null) {
                return;
            }
            C2231l c2231l = C2232m.this.f6493d;
            if (c2231l.m34304b() != null) {
                C2232m.this.m34295i(c2231l.m34304b());
            } else {
                C2232m.this.m34297g(c2231l.m34305a());
            }
        }
    }

    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.m$b */
    /* loaded from: classes.dex */
    private class C2234b extends FutureTask<C2231l<T>> {
        C2234b(Callable<C2231l<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C2232m.this.m34292l(get());
            } catch (InterruptedException | ExecutionException e) {
                C2232m.this.m34292l(new C2231l(e));
            }
        }
    }

    public C2232m(Callable<C2231l<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m34297g(Throwable th2) {
        ArrayList<InterfaceC2227h> arrayList = new ArrayList(this.f6491b);
        if (arrayList.isEmpty()) {
            C5848d.m22928d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (InterfaceC2227h interfaceC2227h : arrayList) {
            interfaceC2227h.mo34441b(th2);
        }
    }

    /* renamed from: h */
    private void m34296h() {
        this.f6492c.post(new RunnableC2233a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m34295i(T t) {
        for (InterfaceC2227h interfaceC2227h : new ArrayList(this.f6490a)) {
            interfaceC2227h.mo34441b(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m34292l(C2231l<T> c2231l) {
        if (this.f6493d == null) {
            this.f6493d = c2231l;
            m34296h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: e */
    public synchronized C2232m<T> m34299e(InterfaceC2227h<Throwable> interfaceC2227h) {
        if (this.f6493d != null && this.f6493d.m34305a() != null) {
            interfaceC2227h.mo34441b(this.f6493d.m34305a());
        }
        this.f6491b.add(interfaceC2227h);
        return this;
    }

    /* renamed from: f */
    public synchronized C2232m<T> m34298f(InterfaceC2227h<T> interfaceC2227h) {
        if (this.f6493d != null && this.f6493d.m34304b() != null) {
            interfaceC2227h.mo34441b(this.f6493d.m34304b());
        }
        this.f6490a.add(interfaceC2227h);
        return this;
    }

    /* renamed from: j */
    public synchronized C2232m<T> m34294j(InterfaceC2227h<Throwable> interfaceC2227h) {
        this.f6491b.remove(interfaceC2227h);
        return this;
    }

    /* renamed from: k */
    public synchronized C2232m<T> m34293k(InterfaceC2227h<T> interfaceC2227h) {
        this.f6490a.remove(interfaceC2227h);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2232m(Callable<C2231l<T>> callable, boolean z) {
        this.f6490a = new LinkedHashSet(1);
        this.f6491b = new LinkedHashSet(1);
        this.f6492c = new Handler(Looper.getMainLooper());
        this.f6493d = null;
        if (z) {
            try {
                m34292l(callable.call());
                return;
            } catch (Throwable th2) {
                m34292l(new C2231l<>(th2));
                return;
            }
        }
        f6489e.execute(new C2234b(callable));
    }
}
