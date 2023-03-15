package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.crashlytics.internal.common.h0 */
/* loaded from: classes.dex */
public final class C4204h0 {

    /* renamed from: a */
    private static final ExecutorService f11455a = C4234t.m28212c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utils.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.h0$a */
    /* loaded from: classes.dex */
    public class RunnableC4205a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Callable f11456w;

        /* renamed from: x */
        final /* synthetic */ C3421e f11457x;

        /* compiled from: Utils.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.h0$a$a */
        /* loaded from: classes.dex */
        class C4206a implements InterfaceC3415b<T, Void> {
            C4206a() {
            }

            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: b */
            public Void mo4684a(AbstractC3419d<T> abstractC3419d) throws Exception {
                if (abstractC3419d.mo30780p()) {
                    RunnableC4205a.this.f11457x.m30800c(abstractC3419d.mo30784l());
                    return null;
                }
                RunnableC4205a.this.f11457x.m30801b(abstractC3419d.mo30785k());
                return null;
            }
        }

        RunnableC4205a(Callable callable, C3421e c3421e) {
            this.f11456w = callable;
            this.f11457x = c3421e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((AbstractC3419d) this.f11456w.call()).mo30789g(new C4206a());
            } catch (Exception e) {
                this.f11457x.m30801b(e);
            }
        }
    }

    /* renamed from: d */
    public static <T> T m28337d(AbstractC3419d<T> abstractC3419d) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC3419d.mo30788h(f11455a, new InterfaceC3415b() { // from class: com.google.firebase.crashlytics.internal.common.g0
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d2) {
                Object countDown;
                countDown = countDownLatch.countDown();
                return countDown;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (abstractC3419d.mo30780p()) {
            return abstractC3419d.mo30784l();
        }
        if (!abstractC3419d.mo30782n()) {
            if (abstractC3419d.mo30781o()) {
                throw new IllegalStateException(abstractC3419d.mo30785k());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: e */
    public static <T> AbstractC3419d<T> m28336e(Executor executor, Callable<AbstractC3419d<T>> callable) {
        C3421e c3421e = new C3421e();
        executor.execute(new RunnableC4205a(callable, c3421e));
        return c3421e.m30802a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Void m28334g(C3421e c3421e, AbstractC3419d abstractC3419d) throws Exception {
        if (abstractC3419d.mo30780p()) {
            c3421e.m30798e(abstractC3419d.mo30784l());
            return null;
        }
        Exception mo30785k = abstractC3419d.mo30785k();
        Objects.requireNonNull(mo30785k);
        c3421e.m30799d(mo30785k);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Void m28333h(C3421e c3421e, AbstractC3419d abstractC3419d) throws Exception {
        if (abstractC3419d.mo30780p()) {
            c3421e.m30798e(abstractC3419d.mo30784l());
            return null;
        }
        Exception mo30785k = abstractC3419d.mo30785k();
        Objects.requireNonNull(mo30785k);
        c3421e.m30799d(mo30785k);
        return null;
    }

    /* renamed from: i */
    public static <T> AbstractC3419d<T> m28332i(AbstractC3419d<T> abstractC3419d, AbstractC3419d<T> abstractC3419d2) {
        final C3421e c3421e = new C3421e();
        InterfaceC3415b<T, TContinuationResult> interfaceC3415b = new InterfaceC3415b() { // from class: com.google.firebase.crashlytics.internal.common.f0
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d3) {
                Void m28334g;
                m28334g = C4204h0.m28334g(C3421e.this, abstractC3419d3);
                return m28334g;
            }
        };
        abstractC3419d.mo30789g(interfaceC3415b);
        abstractC3419d2.mo30789g(interfaceC3415b);
        return c3421e.m30802a();
    }

    /* renamed from: j */
    public static <T> AbstractC3419d<T> m28331j(Executor executor, AbstractC3419d<T> abstractC3419d, AbstractC3419d<T> abstractC3419d2) {
        final C3421e c3421e = new C3421e();
        InterfaceC3415b<T, TContinuationResult> interfaceC3415b = new InterfaceC3415b() { // from class: com.google.firebase.crashlytics.internal.common.e0
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d3) {
                Void m28333h;
                m28333h = C4204h0.m28333h(C3421e.this, abstractC3419d3);
                return m28333h;
            }
        };
        abstractC3419d.mo30788h(executor, interfaceC3415b);
        abstractC3419d2.mo30788h(executor, interfaceC3415b);
        return c3421e.m30802a();
    }
}
