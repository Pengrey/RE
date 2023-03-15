package p304q2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p301q.C9558g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q2.a */
/* loaded from: classes.dex */
public class C9593a {

    /* renamed from: g */
    public static final ThreadLocal<C9593a> f25251g = new ThreadLocal<>();

    /* renamed from: d */
    private AbstractC9596c f25255d;

    /* renamed from: a */
    private final C9558g<InterfaceC9595b, Long> f25252a = new C9558g<>();

    /* renamed from: b */
    final ArrayList<InterfaceC9595b> f25253b = new ArrayList<>();

    /* renamed from: c */
    private final C9594a f25254c = new C9594a();

    /* renamed from: e */
    long f25256e = 0;

    /* renamed from: f */
    private boolean f25257f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: q2.a$a */
    /* loaded from: classes.dex */
    public class C9594a {
        C9594a() {
        }

        /* renamed from: a */
        void m10492a() {
            C9593a.this.f25256e = SystemClock.uptimeMillis();
            C9593a c9593a = C9593a.this;
            c9593a.m10497c(c9593a.f25256e);
            if (C9593a.this.f25253b.size() > 0) {
                C9593a.this.m10495e().mo10491a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: q2.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC9595b {
        /* renamed from: a */
        boolean mo10490a(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: q2.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9596c {

        /* renamed from: a */
        final C9594a f25259a;

        AbstractC9596c(C9594a c9594a) {
            this.f25259a = c9594a;
        }

        /* renamed from: a */
        abstract void mo10491a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: q2.a$d */
    /* loaded from: classes.dex */
    public static class C9597d extends AbstractC9596c {

        /* renamed from: b */
        private final Runnable f25260b;

        /* renamed from: c */
        private final Handler f25261c;

        /* renamed from: d */
        long f25262d;

        /* compiled from: AnimationHandler.java */
        /* renamed from: q2.a$d$a */
        /* loaded from: classes.dex */
        class RunnableC9598a implements Runnable {
            RunnableC9598a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9597d.this.f25262d = SystemClock.uptimeMillis();
                C9597d.this.f25259a.m10492a();
            }
        }

        C9597d(C9594a c9594a) {
            super(c9594a);
            this.f25262d = -1L;
            this.f25260b = new RunnableC9598a();
            this.f25261c = new Handler(Looper.myLooper());
        }

        @Override // p304q2.C9593a.AbstractC9596c
        /* renamed from: a */
        void mo10491a() {
            this.f25261c.postDelayed(this.f25260b, Math.max(10 - (SystemClock.uptimeMillis() - this.f25262d), 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: q2.a$e */
    /* loaded from: classes.dex */
    public static class C9599e extends AbstractC9596c {

        /* renamed from: b */
        private final Choreographer f25264b;

        /* renamed from: c */
        private final Choreographer.FrameCallback f25265c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: q2.a$e$a */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC9600a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC9600a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C9599e.this.f25259a.m10492a();
            }
        }

        C9599e(C9594a c9594a) {
            super(c9594a);
            this.f25264b = Choreographer.getInstance();
            this.f25265c = new Choreographer$FrameCallbackC9600a();
        }

        @Override // p304q2.C9593a.AbstractC9596c
        /* renamed from: a */
        void mo10491a() {
            this.f25264b.postFrameCallback(this.f25265c);
        }
    }

    C9593a() {
    }

    /* renamed from: b */
    private void m10498b() {
        if (this.f25257f) {
            for (int size = this.f25253b.size() - 1; size >= 0; size--) {
                if (this.f25253b.get(size) == null) {
                    this.f25253b.remove(size);
                }
            }
            this.f25257f = false;
        }
    }

    /* renamed from: d */
    public static C9593a m10496d() {
        ThreadLocal<C9593a> threadLocal = f25251g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C9593a());
        }
        return threadLocal.get();
    }

    /* renamed from: f */
    private boolean m10494f(InterfaceC9595b interfaceC9595b, long j) {
        Long l = this.f25252a.get(interfaceC9595b);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.f25252a.remove(interfaceC9595b);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m10499a(InterfaceC9595b interfaceC9595b, long j) {
        if (this.f25253b.size() == 0) {
            m10495e().mo10491a();
        }
        if (!this.f25253b.contains(interfaceC9595b)) {
            this.f25253b.add(interfaceC9595b);
        }
        if (j > 0) {
            this.f25252a.put(interfaceC9595b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: c */
    void m10497c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f25253b.size(); i++) {
            InterfaceC9595b interfaceC9595b = this.f25253b.get(i);
            if (interfaceC9595b != null && m10494f(interfaceC9595b, uptimeMillis)) {
                interfaceC9595b.mo10490a(j);
            }
        }
        m10498b();
    }

    /* renamed from: e */
    AbstractC9596c m10495e() {
        if (this.f25255d == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f25255d = new C9599e(this.f25254c);
            } else {
                this.f25255d = new C9597d(this.f25254c);
            }
        }
        return this.f25255d;
    }

    /* renamed from: g */
    public void m10493g(InterfaceC9595b interfaceC9595b) {
        this.f25252a.remove(interfaceC9595b);
        int indexOf = this.f25253b.indexOf(interfaceC9595b);
        if (indexOf >= 0) {
            this.f25253b.set(indexOf, null);
            this.f25257f = true;
        }
    }
}
