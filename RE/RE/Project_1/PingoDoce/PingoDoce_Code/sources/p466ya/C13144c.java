package p466ya;

import android.content.Context;
import android.os.AsyncTask;
import bb.C1875b;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p012ab.C0099b;
import p012ab.InterfaceC0098a;
import p418w7.C11581c;
import p463y7.C13130c;
import p466ya.InterfaceC13143b;
import za.C13736c;
import za.C13739d;
import za.C13742f;
import za.InterfaceC13735b;
import za.InterfaceC13741e;

/* renamed from: ya.c */
/* loaded from: classes2.dex */
public class C13144c<T extends InterfaceC13143b> implements C11581c.InterfaceC11583b, C11581c.InterfaceC11588g, C11581c.InterfaceC11585d {

    /* renamed from: a */
    private final C1875b f34095a;

    /* renamed from: b */
    private final C1875b.C1876a f34096b;

    /* renamed from: c */
    private final C1875b.C1876a f34097c;

    /* renamed from: d */
    private InterfaceC13741e<T> f34098d;

    /* renamed from: e */
    private InterfaceC0098a<T> f34099e;

    /* renamed from: f */
    private C11581c f34100f;

    /* renamed from: g */
    private CameraPosition f34101g;

    /* renamed from: h */
    private C13144c<T>.AsyncTaskC13146b f34102h;

    /* renamed from: i */
    private final ReadWriteLock f34103i;

    /* renamed from: j */
    private InterfaceC13150f<T> f34104j;

    /* renamed from: k */
    private InterfaceC13148d<T> f34105k;

    /* renamed from: l */
    private InterfaceC13149e<T> f34106l;

    /* renamed from: m */
    private InterfaceC13151g<T> f34107m;

    /* renamed from: n */
    private InterfaceC13152h<T> f34108n;

    /* renamed from: o */
    private InterfaceC13147c<T> f34109o;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$b */
    /* loaded from: classes2.dex */
    public class AsyncTaskC13146b extends AsyncTask<Float, Void, Set<? extends InterfaceC13142a<T>>> {
        private AsyncTaskC13146b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Set<? extends InterfaceC13142a<T>> mo1530a(Float... fArr) {
            InterfaceC13735b<T> m1536h = C13144c.this.m1536h();
            m1536h.mo542d();
            try {
                return m1536h.mo529b(fArr[0].floatValue());
            } finally {
                m1536h.mo543c();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void mo1529b(Set<? extends InterfaceC13142a<T>> set) {
            C13144c.this.f34099e.mo41936c(set);
        }
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC13147c<T extends InterfaceC13143b> {
        /* renamed from: a */
        boolean mo1528a(InterfaceC13142a<T> interfaceC13142a);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC13148d<T extends InterfaceC13143b> {
        /* renamed from: a */
        void m1527a(InterfaceC13142a<T> interfaceC13142a);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC13149e<T extends InterfaceC13143b> {
        /* renamed from: a */
        void m1526a(InterfaceC13142a<T> interfaceC13142a);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC13150f<T extends InterfaceC13143b> {
        /* renamed from: a */
        boolean mo1525a(T t);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC13151g<T extends InterfaceC13143b> {
        /* renamed from: a */
        void m1524a(T t);
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: ya.c$h */
    /* loaded from: classes2.dex */
    public interface InterfaceC13152h<T extends InterfaceC13143b> {
        /* renamed from: a */
        void m1523a(T t);
    }

    public C13144c(Context context, C11581c c11581c) {
        this(context, c11581c, new C1875b(c11581c));
    }

    @Override // p418w7.C11581c.InterfaceC11583b
    /* renamed from: a */
    public void mo1543a() {
        InterfaceC0098a<T> interfaceC0098a = this.f34099e;
        if (interfaceC0098a instanceof C11581c.InterfaceC11583b) {
            ((C11581c.InterfaceC11583b) interfaceC0098a).mo1543a();
        }
        this.f34098d.mo530a(this.f34100f.m4674c());
        if (this.f34098d.mo526g()) {
            m1537g();
            return;
        }
        CameraPosition cameraPosition = this.f34101g;
        if (cameraPosition == null || cameraPosition.f8246x != this.f34100f.m4674c().f8246x) {
            this.f34101g = this.f34100f.m4674c();
            m1537g();
        }
    }

    /* renamed from: c */
    public boolean m1541c(Collection<T> collection) {
        InterfaceC13735b<T> m1536h = m1536h();
        m1536h.mo542d();
        try {
            return m1536h.mo528e(collection);
        } finally {
            m1536h.mo543c();
        }
    }

    @Override // p418w7.C11581c.InterfaceC11585d
    /* renamed from: d */
    public void mo1540d(C13130c c13130c) {
        m1533k().mo1540d(c13130c);
    }

    /* renamed from: e */
    public void m1539e() {
        InterfaceC13735b<T> m1536h = m1536h();
        m1536h.mo542d();
        try {
            m1536h.mo525h();
        } finally {
            m1536h.mo543c();
        }
    }

    @Override // p418w7.C11581c.InterfaceC11588g
    /* renamed from: f */
    public boolean mo1538f(C13130c c13130c) {
        return m1533k().mo1538f(c13130c);
    }

    /* renamed from: g */
    public void m1537g() {
        this.f34103i.writeLock().lock();
        try {
            this.f34102h.cancel(true);
            C13144c<T>.AsyncTaskC13146b asyncTaskC13146b = new AsyncTaskC13146b();
            this.f34102h = asyncTaskC13146b;
            asyncTaskC13146b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f34100f.m4674c().f8246x));
        } finally {
            this.f34103i.writeLock().unlock();
        }
    }

    /* renamed from: h */
    public InterfaceC13735b<T> m1536h() {
        return this.f34098d;
    }

    /* renamed from: i */
    public C1875b.C1876a m1535i() {
        return this.f34097c;
    }

    /* renamed from: j */
    public C1875b.C1876a m1534j() {
        return this.f34096b;
    }

    /* renamed from: k */
    public C1875b m1533k() {
        return this.f34095a;
    }

    /* renamed from: l */
    public InterfaceC0098a<T> m1532l() {
        return this.f34099e;
    }

    /* renamed from: m */
    public void m1531m(InterfaceC0098a<T> interfaceC0098a) {
        this.f34099e.mo41933f(null);
        this.f34099e.mo41935d(null);
        this.f34097c.m35237b();
        this.f34096b.m35237b();
        this.f34099e.mo41931h();
        this.f34099e = interfaceC0098a;
        interfaceC0098a.mo41932g();
        this.f34099e.mo41933f(this.f34109o);
        this.f34099e.mo41930i(this.f34105k);
        this.f34099e.mo41934e(this.f34106l);
        this.f34099e.mo41935d(this.f34104j);
        this.f34099e.mo41937b(this.f34107m);
        this.f34099e.mo41938a(this.f34108n);
        m1537g();
    }

    public C13144c(Context context, C11581c c11581c, C1875b c1875b) {
        this.f34103i = new ReentrantReadWriteLock();
        this.f34100f = c11581c;
        this.f34095a = c1875b;
        this.f34097c = c1875b.m35233l();
        this.f34096b = c1875b.m35233l();
        this.f34099e = new C0099b(context, c11581c, this);
        this.f34098d = new C13742f(new C13739d(new C13736c()));
        this.f34102h = new AsyncTaskC13146b();
        this.f34099e.mo41932g();
    }
}
