package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1601h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C1580d<T> {

    /* renamed from: h */
    private static final Executor f4770h = new ExecutorC1585c();

    /* renamed from: a */
    private final InterfaceC1639r f4771a;

    /* renamed from: b */
    final C1578c<T> f4772b;

    /* renamed from: c */
    Executor f4773c;

    /* renamed from: e */
    private List<T> f4775e;

    /* renamed from: g */
    int f4777g;

    /* renamed from: d */
    private final List<InterfaceC1584b<T>> f4774d = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List<T> f4776f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    public class RunnableC1581a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ List f4779w;

        /* renamed from: x */
        final /* synthetic */ List f4780x;

        /* renamed from: y */
        final /* synthetic */ int f4781y;

        /* renamed from: z */
        final /* synthetic */ Runnable f4782z;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* loaded from: classes.dex */
        class C1582a extends C1601h.AbstractC1603b {
            C1582a() {
            }

            @Override // androidx.recyclerview.widget.C1601h.AbstractC1603b
            /* renamed from: a */
            public boolean mo36050a(int i, int i2) {
                Object obj = RunnableC1581a.this.f4779w.get(i);
                Object obj2 = RunnableC1581a.this.f4780x.get(i2);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return C1580d.this.f4772b.m36118b().mo36035a(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1601h.AbstractC1603b
            /* renamed from: b */
            public boolean mo36049b(int i, int i2) {
                Object obj = RunnableC1581a.this.f4779w.get(i);
                Object obj2 = RunnableC1581a.this.f4780x.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C1580d.this.f4772b.m36118b().mo36034b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1601h.AbstractC1603b
            /* renamed from: c */
            public Object mo36048c(int i, int i2) {
                Object obj = RunnableC1581a.this.f4779w.get(i);
                Object obj2 = RunnableC1581a.this.f4780x.get(i2);
                if (obj != null && obj2 != null) {
                    return C1580d.this.f4772b.m36118b().m36033c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C1601h.AbstractC1603b
            /* renamed from: d */
            public int mo36047d() {
                return RunnableC1581a.this.f4780x.size();
            }

            @Override // androidx.recyclerview.widget.C1601h.AbstractC1603b
            /* renamed from: e */
            public int mo36046e() {
                return RunnableC1581a.this.f4779w.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes.dex */
        class RunnableC1583b implements Runnable {

            /* renamed from: w */
            final /* synthetic */ C1601h.C1604c f4784w;

            RunnableC1583b(C1601h.C1604c c1604c) {
                this.f4784w = c1604c;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC1581a runnableC1581a = RunnableC1581a.this;
                C1580d c1580d = C1580d.this;
                if (c1580d.f4777g == runnableC1581a.f4781y) {
                    c1580d.m36113c(runnableC1581a.f4780x, this.f4784w, runnableC1581a.f4782z);
                }
            }
        }

        RunnableC1581a(List list, List list2, int i, Runnable runnable) {
            this.f4779w = list;
            this.f4780x = list2;
            this.f4781y = i;
            this.f4782z = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1580d.this.f4773c.execute(new RunnableC1583b(C1601h.m36054a(new C1582a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1584b<T> {
        /* renamed from: a */
        void mo35899a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private static class ExecutorC1585c implements Executor {

        /* renamed from: w */
        final Handler f4786w = new Handler(Looper.getMainLooper());

        ExecutorC1585c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f4786w.post(runnable);
        }
    }

    public C1580d(InterfaceC1639r interfaceC1639r, C1578c<T> c1578c) {
        this.f4771a = interfaceC1639r;
        this.f4772b = c1578c;
        if (c1578c.m36117c() != null) {
            this.f4773c = c1578c.m36117c();
        } else {
            this.f4773c = f4770h;
        }
    }

    /* renamed from: d */
    private void m36112d(List<T> list, Runnable runnable) {
        for (InterfaceC1584b<T> interfaceC1584b : this.f4774d) {
            interfaceC1584b.mo35899a(list, this.f4776f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m36115a(InterfaceC1584b<T> interfaceC1584b) {
        this.f4774d.add(interfaceC1584b);
    }

    /* renamed from: b */
    public List<T> m36114b() {
        return this.f4776f;
    }

    /* renamed from: c */
    void m36113c(List<T> list, C1601h.C1604c c1604c, Runnable runnable) {
        List<T> list2 = this.f4776f;
        this.f4775e = list;
        this.f4776f = Collections.unmodifiableList(list);
        c1604c.m36042d(this.f4771a);
        m36112d(list2, runnable);
    }

    /* renamed from: e */
    public void m36111e(List<T> list) {
        m36110f(list, null);
    }

    /* renamed from: f */
    public void m36110f(List<T> list, Runnable runnable) {
        int i = this.f4777g + 1;
        this.f4777g = i;
        List<T> list2 = this.f4775e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f4776f;
        if (list == null) {
            int size = list2.size();
            this.f4775e = null;
            this.f4776f = Collections.emptyList();
            this.f4771a.mo35898a(0, size);
            m36112d(list3, runnable);
        } else if (list2 == null) {
            this.f4775e = list;
            this.f4776f = Collections.unmodifiableList(list);
            this.f4771a.mo35896c(0, list.size());
            m36112d(list3, runnable);
        } else {
            this.f4772b.m36119a().execute(new RunnableC1581a(list2, list, i, runnable));
        }
    }
}
