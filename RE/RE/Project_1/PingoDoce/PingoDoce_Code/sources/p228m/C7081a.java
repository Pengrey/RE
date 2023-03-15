package p228m;

import java.util.concurrent.Executor;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C7081a extends AbstractC7086c {

    /* renamed from: c */
    private static volatile C7081a f18803c;

    /* renamed from: a */
    private AbstractC7086c f18804a;

    /* renamed from: b */
    private AbstractC7086c f18805b;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: m.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC7082a implements Executor {
        ExecutorC7082a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C7081a.m19345d().mo19341c(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: m.a$b */
    /* loaded from: classes.dex */
    static class ExecutorC7083b implements Executor {
        ExecutorC7083b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C7081a.m19345d().mo19343a(runnable);
        }
    }

    static {
        new ExecutorC7082a();
        new ExecutorC7083b();
    }

    private C7081a() {
        C7084b c7084b = new C7084b();
        this.f18805b = c7084b;
        this.f18804a = c7084b;
    }

    /* renamed from: d */
    public static C7081a m19345d() {
        if (f18803c != null) {
            return f18803c;
        }
        synchronized (C7081a.class) {
            if (f18803c == null) {
                f18803c = new C7081a();
            }
        }
        return f18803c;
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: a */
    public void mo19343a(Runnable runnable) {
        this.f18804a.mo19343a(runnable);
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: b */
    public boolean mo19342b() {
        return this.f18804a.mo19342b();
    }

    @Override // p228m.AbstractC7086c
    /* renamed from: c */
    public void mo19341c(Runnable runnable) {
        this.f18804a.mo19341c(runnable);
    }
}
