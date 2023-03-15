package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import java.util.Iterator;
import java.util.Map;
import p228m.C7081a;
import p243n.C7547b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f4230k = new Object();

    /* renamed from: a */
    final Object f4231a;

    /* renamed from: b */
    private C7547b<InterfaceC1440f0<? super T>, LiveData<T>.AbstractC1420c> f4232b;

    /* renamed from: c */
    int f4233c;

    /* renamed from: d */
    private boolean f4234d;

    /* renamed from: e */
    private volatile Object f4235e;

    /* renamed from: f */
    volatile Object f4236f;

    /* renamed from: g */
    private int f4237g;

    /* renamed from: h */
    private boolean f4238h;

    /* renamed from: i */
    private boolean f4239i;

    /* renamed from: j */
    private final Runnable f4240j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC1420c implements InterfaceC1485s {

        /* renamed from: A */
        final InterfaceC1491v f4241A;

        LifecycleBoundObserver(InterfaceC1491v interfaceC1491v, InterfaceC1440f0<? super T> interfaceC1440f0) {
            super(interfaceC1440f0);
            this.f4241A = interfaceC1491v;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1420c
        /* renamed from: h */
        void mo37076h() {
            this.f4241A.mo137b().mo10400c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1420c
        /* renamed from: i */
        boolean mo37075i(InterfaceC1491v interfaceC1491v) {
            return this.f4241A == interfaceC1491v;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1420c
        /* renamed from: j */
        boolean mo37074j() {
            return this.f4241A.mo137b().mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1485s
        /* renamed from: n */
        public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
            AbstractC1469p.EnumC1472c mo10401b = this.f4241A.mo137b().mo10401b();
            if (mo10401b == AbstractC1469p.EnumC1472c.DESTROYED) {
                LiveData.this.mo168n(this.f4244w);
                return;
            }
            AbstractC1469p.EnumC1472c enumC1472c = null;
            while (enumC1472c != mo10401b) {
                m37077b(mo37074j());
                enumC1472c = mo10401b;
                mo10401b = this.f4241A.mo137b().mo10401b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC1418a implements Runnable {
        RunnableC1418a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4231a) {
                obj = LiveData.this.f4236f;
                LiveData.this.f4236f = LiveData.f4230k;
            }
            LiveData.this.mo166p(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    private class C1419b extends LiveData<T>.AbstractC1420c {
        C1419b(LiveData liveData, InterfaceC1440f0<? super T> interfaceC1440f0) {
            super(interfaceC1440f0);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1420c
        /* renamed from: j */
        boolean mo37074j() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC1420c {

        /* renamed from: w */
        final InterfaceC1440f0<? super T> f4244w;

        /* renamed from: x */
        boolean f4245x;

        /* renamed from: y */
        int f4246y = -1;

        AbstractC1420c(InterfaceC1440f0<? super T> interfaceC1440f0) {
            this.f4244w = interfaceC1440f0;
        }

        /* renamed from: b */
        void m37077b(boolean z) {
            if (z == this.f4245x) {
                return;
            }
            this.f4245x = z;
            LiveData.this.m37082c(z ? 1 : -1);
            if (this.f4245x) {
                LiveData.this.m37080e(this);
            }
        }

        /* renamed from: h */
        void mo37076h() {
        }

        /* renamed from: i */
        boolean mo37075i(InterfaceC1491v interfaceC1491v) {
            return false;
        }

        /* renamed from: j */
        abstract boolean mo37074j();
    }

    public LiveData(T t) {
        this.f4231a = new Object();
        this.f4232b = new C7547b<>();
        this.f4233c = 0;
        this.f4236f = f4230k;
        this.f4240j = new RunnableC1418a();
        this.f4235e = t;
        this.f4237g = 0;
    }

    /* renamed from: b */
    static void m37083b(String str) {
        if (C7081a.m19345d().mo19342b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: d */
    private void m37081d(LiveData<T>.AbstractC1420c abstractC1420c) {
        if (abstractC1420c.f4245x) {
            if (!abstractC1420c.mo37074j()) {
                abstractC1420c.m37077b(false);
                return;
            }
            int i = abstractC1420c.f4246y;
            int i2 = this.f4237g;
            if (i >= i2) {
                return;
            }
            abstractC1420c.f4246y = i2;
            abstractC1420c.f4244w.mo37325a((Object) this.f4235e);
        }
    }

    /* renamed from: c */
    void m37082c(int i) {
        int i2 = this.f4233c;
        this.f4233c = i + i2;
        if (this.f4234d) {
            return;
        }
        this.f4234d = true;
        while (true) {
            try {
                int i3 = this.f4233c;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo36938k();
                } else if (z2) {
                    mo36937l();
                }
                i2 = i3;
            } finally {
                this.f4234d = false;
            }
        }
    }

    /* renamed from: e */
    void m37080e(LiveData<T>.AbstractC1420c abstractC1420c) {
        if (this.f4238h) {
            this.f4239i = true;
            return;
        }
        this.f4238h = true;
        do {
            this.f4239i = false;
            if (abstractC1420c != null) {
                m37081d(abstractC1420c);
                abstractC1420c = null;
            } else {
                C7547b<InterfaceC1440f0<? super T>, LiveData<T>.AbstractC1420c>.C7551d m18165g = this.f4232b.m18165g();
                while (m18165g.hasNext()) {
                    m37081d((AbstractC1420c) m18165g.next().getValue());
                    if (this.f4239i) {
                        break;
                    }
                }
            }
        } while (this.f4239i);
        this.f4238h = false;
    }

    /* renamed from: f */
    public T mo172f() {
        T t = (T) this.f4235e;
        if (t != f4230k) {
            return t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m37079g() {
        return this.f4237g;
    }

    /* renamed from: h */
    public boolean m37078h() {
        return this.f4233c > 0;
    }

    /* renamed from: i */
    public void mo171i(InterfaceC1491v interfaceC1491v, InterfaceC1440f0<? super T> interfaceC1440f0) {
        m37083b("observe");
        if (interfaceC1491v.mo137b().mo10401b() == AbstractC1469p.EnumC1472c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1491v, interfaceC1440f0);
        LiveData<T>.AbstractC1420c mo18162o = this.f4232b.mo18162o(interfaceC1440f0, lifecycleBoundObserver);
        if (mo18162o != null && !mo18162o.mo37075i(interfaceC1491v)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo18162o != null) {
            return;
        }
        interfaceC1491v.mo137b().mo10402a(lifecycleBoundObserver);
    }

    /* renamed from: j */
    public void mo170j(InterfaceC1440f0<? super T> interfaceC1440f0) {
        m37083b("observeForever");
        C1419b c1419b = new C1419b(this, interfaceC1440f0);
        LiveData<T>.AbstractC1420c mo18162o = this.f4232b.mo18162o(interfaceC1440f0, c1419b);
        if (mo18162o instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo18162o != null) {
            return;
        }
        c1419b.m37077b(true);
    }

    /* renamed from: k */
    protected void mo36938k() {
    }

    /* renamed from: l */
    protected void mo36937l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo169m(T t) {
        boolean z;
        synchronized (this.f4231a) {
            z = this.f4236f == f4230k;
            this.f4236f = t;
        }
        if (z) {
            C7081a.m19345d().mo19341c(this.f4240j);
        }
    }

    /* renamed from: n */
    public void mo168n(InterfaceC1440f0<? super T> interfaceC1440f0) {
        m37083b("removeObserver");
        LiveData<T>.AbstractC1420c mo18161p = this.f4232b.mo18161p(interfaceC1440f0);
        if (mo18161p == null) {
            return;
        }
        mo18161p.mo37076h();
        mo18161p.m37077b(false);
    }

    /* renamed from: o */
    public void mo167o(InterfaceC1491v interfaceC1491v) {
        m37083b("removeObservers");
        Iterator<Map.Entry<InterfaceC1440f0<? super T>, LiveData<T>.AbstractC1420c>> it = this.f4232b.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC1440f0<? super T>, LiveData<T>.AbstractC1420c> next = it.next();
            if (next.getValue().mo37075i(interfaceC1491v)) {
                mo168n(next.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo166p(T t) {
        m37083b("setValue");
        this.f4237g++;
        this.f4235e = t;
        m37080e(null);
    }

    public LiveData() {
        this.f4231a = new Object();
        this.f4232b = new C7547b<>();
        this.f4233c = 0;
        Object obj = f4230k;
        this.f4236f = obj;
        this.f4240j = new RunnableC1418a();
        this.f4235e = obj;
        this.f4237g = -1;
    }
}
