package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p219l9.C7011f;

/* renamed from: com.google.firebase.crashlytics.internal.common.t */
/* loaded from: classes.dex */
public final class C4234t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.t$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC4235a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f11542a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f11543b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.t$a$a */
        /* loaded from: classes.dex */
        class C4236a extends AbstractRunnableC4188c {

            /* renamed from: w */
            final /* synthetic */ Runnable f11544w;

            C4236a(ThreadFactoryC4235a threadFactoryC4235a, Runnable runnable) {
                this.f11544w = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC4188c
            /* renamed from: a */
            public void mo28209a() {
                this.f11544w.run();
            }
        }

        ThreadFactoryC4235a(String str, AtomicLong atomicLong) {
            this.f11542a = str;
            this.f11543b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C4236a(this, runnable));
            newThread.setName(this.f11542a + this.f11543b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.t$b */
    /* loaded from: classes.dex */
    public class C4237b extends AbstractRunnableC4188c {

        /* renamed from: w */
        final /* synthetic */ String f11545w;

        /* renamed from: x */
        final /* synthetic */ ExecutorService f11546x;

        /* renamed from: y */
        final /* synthetic */ long f11547y;

        /* renamed from: z */
        final /* synthetic */ TimeUnit f11548z;

        C4237b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f11545w = str;
            this.f11546x = executorService;
            this.f11547y = j;
            this.f11548z = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC4188c
        /* renamed from: a */
        public void mo28209a() {
            try {
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19615b("Executing shutdown hook for " + this.f11545w);
                this.f11546x.shutdown();
                if (this.f11546x.awaitTermination(this.f11547y, this.f11548z)) {
                    return;
                }
                C7011f m19611f2 = C7011f.m19611f();
                m19611f2.m19615b(this.f11545w + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f11546x.shutdownNow();
            } catch (InterruptedException unused) {
                C7011f.m19611f().m19615b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f11545w));
                this.f11546x.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m28214a(String str, ExecutorService executorService) {
        m28213b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m28213b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C4237b c4237b = new C4237b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(c4237b, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m28212c(String str) {
        ExecutorService m28210e = m28210e(m28211d(str), new ThreadPoolExecutor.DiscardPolicy());
        m28214a(str, m28210e);
        return m28210e;
    }

    /* renamed from: d */
    public static ThreadFactory m28211d(String str) {
        return new ThreadFactoryC4235a(str, new AtomicLong(1L));
    }

    /* renamed from: e */
    private static ExecutorService m28210e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
