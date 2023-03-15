package bb;

import android.os.Handler;
import android.os.Looper;
import bb.AbstractC1872a.C1874b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p418w7.C11581c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1872a<O, C extends C1874b> {

    /* renamed from: a */
    protected final C11581c f5589a;

    /* renamed from: b */
    protected final Map<O, C> f5590b;

    /* compiled from: MapObjectManager.java */
    /* renamed from: bb.a$a */
    /* loaded from: classes2.dex */
    class RunnableC1873a implements Runnable {
        RunnableC1873a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1872a.this.mo35234k();
        }
    }

    /* compiled from: MapObjectManager.java */
    /* renamed from: bb.a$b */
    /* loaded from: classes2.dex */
    public class C1874b {

        /* renamed from: a */
        private final Set<O> f5592a = new HashSet();

        public C1874b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public void m35238a(O o) {
            this.f5592a.add(o);
            AbstractC1872a.this.f5590b.put(o, this);
        }

        /* renamed from: b */
        public void m35237b() {
            for (O o : this.f5592a) {
                AbstractC1872a.this.mo35235j(o);
                AbstractC1872a.this.f5590b.remove(o);
            }
            this.f5592a.clear();
        }

        /* renamed from: c */
        protected boolean m35236c(O o) {
            if (this.f5592a.remove(o)) {
                AbstractC1872a.this.f5590b.remove(o);
                AbstractC1872a.this.mo35235j(o);
                return true;
            }
            return false;
        }
    }

    public AbstractC1872a(C11581c c11581c) {
        new HashMap();
        this.f5590b = new HashMap();
        this.f5589a = c11581c;
        new Handler(Looper.getMainLooper()).post(new RunnableC1873a());
    }

    /* renamed from: i */
    public boolean m35239i(O o) {
        C c = this.f5590b.get(o);
        return c != null && c.m35236c(o);
    }

    /* renamed from: j */
    protected abstract void mo35235j(O o);

    /* renamed from: k */
    abstract void mo35234k();
}
