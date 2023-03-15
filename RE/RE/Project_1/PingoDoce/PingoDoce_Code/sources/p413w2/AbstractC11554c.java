package p413w2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w2.c */
/* loaded from: classes.dex */
abstract class AbstractC11554c<Params, Progress, Result> {

    /* renamed from: B */
    private static final ThreadFactory f29587B;

    /* renamed from: C */
    private static final BlockingQueue<Runnable> f29588C;

    /* renamed from: D */
    public static final Executor f29589D;

    /* renamed from: E */
    private static HandlerC11560f f29590E;

    /* renamed from: w */
    private final AbstractCallableC11562h<Params, Result> f29592w;

    /* renamed from: x */
    private final FutureTask<Result> f29593x;

    /* renamed from: y */
    private volatile EnumC11561g f29594y = EnumC11561g.PENDING;

    /* renamed from: z */
    final AtomicBoolean f29595z = new AtomicBoolean();

    /* renamed from: A */
    final AtomicBoolean f29591A = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$a */
    /* loaded from: classes.dex */
    static class ThreadFactoryC11555a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f29596a = new AtomicInteger(1);

        ThreadFactoryC11555a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f29596a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$b */
    /* loaded from: classes.dex */
    class C11556b extends AbstractCallableC11562h<Params, Result> {
        C11556b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC11554c.this.f29591A.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC11554c.this.mo4715b(this.f29602a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$c */
    /* loaded from: classes.dex */
    class C11557c extends FutureTask<Result> {
        C11557c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC11554c.this.m4704m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC11554c.this.m4704m(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11558d {

        /* renamed from: a */
        static final /* synthetic */ int[] f29599a;

        static {
            int[] iArr = new int[EnumC11561g.values().length];
            f29599a = iArr;
            try {
                iArr[EnumC11561g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29599a[EnumC11561g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$e */
    /* loaded from: classes.dex */
    public static class C11559e<Data> {

        /* renamed from: a */
        final AbstractC11554c f29600a;

        /* renamed from: b */
        final Data[] f29601b;

        C11559e(AbstractC11554c abstractC11554c, Data... dataArr) {
            this.f29600a = abstractC11554c;
            this.f29601b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$f */
    /* loaded from: classes.dex */
    public static class HandlerC11560f extends Handler {
        HandlerC11560f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C11559e c11559e = (C11559e) message.obj;
            int i = message.what;
            if (i == 1) {
                c11559e.f29600a.m4713d(c11559e.f29601b[0]);
            } else if (i != 2) {
            } else {
                c11559e.f29600a.m4706k(c11559e.f29601b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$g */
    /* loaded from: classes.dex */
    public enum EnumC11561g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: w2.c$h */
    /* loaded from: classes.dex */
    private static abstract class AbstractCallableC11562h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f29602a;

        AbstractCallableC11562h() {
        }
    }

    static {
        ThreadFactoryC11555a threadFactoryC11555a = new ThreadFactoryC11555a();
        f29587B = threadFactoryC11555a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f29588C = linkedBlockingQueue;
        f29589D = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC11555a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11554c() {
        C11556b c11556b = new C11556b();
        this.f29592w = c11556b;
        this.f29593x = new C11557c(c11556b);
    }

    /* renamed from: e */
    private static Handler m4712e() {
        HandlerC11560f handlerC11560f;
        synchronized (AbstractC11554c.class) {
            if (f29590E == null) {
                f29590E = new HandlerC11560f();
            }
            handlerC11560f = f29590E;
        }
        return handlerC11560f;
    }

    /* renamed from: a */
    public final boolean m4716a(boolean z) {
        this.f29595z.set(true);
        return this.f29593x.cancel(z);
    }

    /* renamed from: b */
    protected abstract Result mo4715b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC11554c<Params, Progress, Result> m4714c(Executor executor, Params... paramsArr) {
        if (this.f29594y != EnumC11561g.PENDING) {
            int i = C11558d.f29599a[this.f29594y.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f29594y = EnumC11561g.RUNNING;
        m4707j();
        this.f29592w.f29602a = paramsArr;
        executor.execute(this.f29593x);
        return this;
    }

    /* renamed from: d */
    void m4713d(Result result) {
        if (m4711f()) {
            mo4709h(result);
        } else {
            mo4708i(result);
        }
        this.f29594y = EnumC11561g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m4711f() {
        return this.f29595z.get();
    }

    /* renamed from: g */
    protected void m4710g() {
    }

    /* renamed from: h */
    protected void mo4709h(Result result) {
        m4710g();
    }

    /* renamed from: i */
    protected void mo4708i(Result result) {
    }

    /* renamed from: j */
    protected void m4707j() {
    }

    /* renamed from: k */
    protected void m4706k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m4705l(Result result) {
        m4712e().obtainMessage(1, new C11559e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m4704m(Result result) {
        if (this.f29591A.get()) {
            return;
        }
        m4705l(result);
    }
}
