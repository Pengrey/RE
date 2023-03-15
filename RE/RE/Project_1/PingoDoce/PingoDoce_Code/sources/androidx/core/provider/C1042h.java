package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.InterfaceC1068a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes.dex */
class C1042h {

    /* compiled from: RequestExecutor.java */
    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: classes.dex */
    private static class ThreadFactoryC1043a implements ThreadFactory {

        /* renamed from: a */
        private String f3357a;

        /* renamed from: b */
        private int f3358b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.h$a$a */
        /* loaded from: classes.dex */
        private static class C1044a extends Thread {

            /* renamed from: w */
            private final int f3359w;

            C1044a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f3359w = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3359w);
                super.run();
            }
        }

        ThreadFactoryC1043a(String str, int i) {
            this.f3357a = str;
            this.f3358b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1044a(runnable, this.f3357a, this.f3358b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: classes.dex */
    private static class RunnableC1045b<T> implements Runnable {

        /* renamed from: w */
        private Callable<T> f3360w;

        /* renamed from: x */
        private InterfaceC1068a<T> f3361x;

        /* renamed from: y */
        private Handler f3362y;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: classes.dex */
        class RunnableC1046a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ InterfaceC1068a f3363w;

            /* renamed from: x */
            final /* synthetic */ Object f3364x;

            RunnableC1046a(RunnableC1045b runnableC1045b, InterfaceC1068a interfaceC1068a, Object obj) {
                this.f3363w = interfaceC1068a;
                this.f3364x = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3363w.accept(this.f3364x);
            }
        }

        RunnableC1045b(Handler handler, Callable<T> callable, InterfaceC1068a<T> interfaceC1068a) {
            this.f3360w = callable;
            this.f3361x = interfaceC1068a;
            this.f3362y = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f3360w.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f3362y.post(new RunnableC1046a(this, this.f3361x, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m38692a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1043a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m38691b(Executor executor, Callable<T> callable, InterfaceC1068a<T> interfaceC1068a) {
        executor.execute(new RunnableC1045b(C1027b.m38731a(), callable, interfaceC1068a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m38690c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
