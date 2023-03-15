package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1601h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public final class C1578c<T> {

    /* renamed from: a */
    private final Executor f4762a;

    /* renamed from: b */
    private final Executor f4763b;

    /* renamed from: c */
    private final C1601h.AbstractC1605d<T> f4764c;

    /* compiled from: AsyncDifferConfig.java */
    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    public static final class C1579a<T> {

        /* renamed from: d */
        private static final Object f4765d = new Object();

        /* renamed from: e */
        private static Executor f4766e;

        /* renamed from: a */
        private Executor f4767a;

        /* renamed from: b */
        private Executor f4768b;

        /* renamed from: c */
        private final C1601h.AbstractC1605d<T> f4769c;

        public C1579a(C1601h.AbstractC1605d<T> abstractC1605d) {
            this.f4769c = abstractC1605d;
        }

        /* renamed from: a */
        public C1578c<T> m36116a() {
            if (this.f4768b == null) {
                synchronized (f4765d) {
                    if (f4766e == null) {
                        f4766e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f4768b = f4766e;
            }
            return new C1578c<>(this.f4767a, this.f4768b, this.f4769c);
        }
    }

    C1578c(Executor executor, Executor executor2, C1601h.AbstractC1605d<T> abstractC1605d) {
        this.f4762a = executor;
        this.f4763b = executor2;
        this.f4764c = abstractC1605d;
    }

    /* renamed from: a */
    public Executor m36119a() {
        return this.f4763b;
    }

    /* renamed from: b */
    public C1601h.AbstractC1605d<T> m36118b() {
        return this.f4764c;
    }

    /* renamed from: c */
    public Executor m36117c() {
        return this.f4762a;
    }
}
