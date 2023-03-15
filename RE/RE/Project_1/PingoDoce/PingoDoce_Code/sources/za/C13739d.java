package za;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p301q.C9557f;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;

/* renamed from: za.d */
/* loaded from: classes2.dex */
public class C13739d<T extends InterfaceC13143b> extends AbstractC13734a<T> {

    /* renamed from: b */
    private final InterfaceC13735b<T> f34852b;

    /* renamed from: c */
    private final C9557f<Integer, Set<? extends InterfaceC13142a<T>>> f34853c = new C9557f<>(5);

    /* renamed from: d */
    private final ReadWriteLock f34854d = new ReentrantReadWriteLock();

    /* renamed from: e */
    private final Executor f34855e = Executors.newCachedThreadPool();

    /* compiled from: PreCachingAlgorithmDecorator.java */
    /* renamed from: za.d$a */
    /* loaded from: classes2.dex */
    private class RunnableC13740a implements Runnable {

        /* renamed from: w */
        private final int f34856w;

        public RunnableC13740a(int i) {
            this.f34856w = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            C13739d.this.m531k(this.f34856w);
        }
    }

    public C13739d(InterfaceC13735b<T> interfaceC13735b) {
        this.f34852b = interfaceC13735b;
    }

    /* renamed from: j */
    private void m532j() {
        this.f34853c.m10632c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public Set<? extends InterfaceC13142a<T>> m531k(int i) {
        this.f34854d.readLock().lock();
        Set<? extends InterfaceC13142a<T>> m10631d = this.f34853c.m10631d(Integer.valueOf(i));
        this.f34854d.readLock().unlock();
        if (m10631d == null) {
            this.f34854d.writeLock().lock();
            m10631d = this.f34853c.m10631d(Integer.valueOf(i));
            if (m10631d == null) {
                m10631d = this.f34852b.mo529b(i);
                this.f34853c.m10629f(Integer.valueOf(i), m10631d);
            }
            this.f34854d.writeLock().unlock();
        }
        return m10631d;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: b */
    public Set<? extends InterfaceC13142a<T>> mo529b(float f) {
        int i = (int) f;
        Set<? extends InterfaceC13142a<T>> m531k = m531k(i);
        int i2 = i + 1;
        if (this.f34853c.m10631d(Integer.valueOf(i2)) == null) {
            this.f34855e.execute(new RunnableC13740a(i2));
        }
        int i3 = i - 1;
        if (this.f34853c.m10631d(Integer.valueOf(i3)) == null) {
            this.f34855e.execute(new RunnableC13740a(i3));
        }
        return m531k;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: e */
    public boolean mo528e(Collection<T> collection) {
        boolean mo528e = this.f34852b.mo528e(collection);
        if (mo528e) {
            m532j();
        }
        return mo528e;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: f */
    public int mo527f() {
        return this.f34852b.mo527f();
    }

    @Override // za.InterfaceC13735b
    /* renamed from: h */
    public void mo525h() {
        this.f34852b.mo525h();
        m532j();
    }
}
