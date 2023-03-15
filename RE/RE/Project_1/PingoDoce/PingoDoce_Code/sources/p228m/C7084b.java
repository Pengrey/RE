package p228m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C7084b extends AbstractC7086c {

    /* renamed from: a */
    private final Object f18806a = new Object();

    /* renamed from: b */
    private final ExecutorService f18807b = Executors.newFixedThreadPool(4, new ThreadFactoryC7085a(this));

    /* renamed from: c */
    private volatile Handler f18808c;

    /* compiled from: DefaultTaskExecutor.java */
    /* renamed from: m.b$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC7085a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f18809a = new AtomicInteger(0);

        ThreadFactoryC7085a(C7084b c7084b) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f18809a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m19344d(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: a */
    public void mo19343a(Runnable runnable) {
        this.f18807b.execute(runnable);
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: b */
    public boolean mo19342b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: c */
    public void mo19341c(Runnable runnable) {
        if (this.f18808c == null) {
            synchronized (this.f18806a) {
                if (this.f18808c == null) {
                    this.f18808c = m19344d(Looper.getMainLooper());
                }
            }
        }
        this.f18808c.post(runnable);
    }
}
