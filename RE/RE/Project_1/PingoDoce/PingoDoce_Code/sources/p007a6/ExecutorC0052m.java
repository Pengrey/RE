package p007a6;

import java.util.concurrent.Executor;
import p098f6.C5414a;

/* renamed from: a6.m */
/* loaded from: classes.dex */
class ExecutorC0052m implements Executor {

    /* renamed from: w */
    private final Executor f157w;

    /* compiled from: SafeLoggingExecutor.java */
    /* renamed from: a6.m$a */
    /* loaded from: classes.dex */
    static class RunnableC0053a implements Runnable {

        /* renamed from: w */
        private final Runnable f158w;

        RunnableC0053a(Runnable runnable) {
            this.f158w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f158w.run();
            } catch (Exception e) {
                C5414a.m24380c("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC0052m(Executor executor) {
        this.f157w = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f157w.execute(new RunnableC0053a(runnable));
    }
}
