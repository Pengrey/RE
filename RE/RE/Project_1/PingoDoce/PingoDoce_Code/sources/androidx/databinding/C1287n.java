package androidx.databinding;

import androidx.lifecycle.InterfaceC1491v;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.databinding.n */
/* loaded from: classes.dex */
public class C1287n<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a */
    private final InterfaceC1283k<T> f3710a;

    /* renamed from: b */
    protected final int f3711b;

    /* renamed from: c */
    private T f3712c;

    public C1287n(ViewDataBinding viewDataBinding, int i, InterfaceC1283k<T> interfaceC1283k, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f3711b = i;
        this.f3710a = interfaceC1283k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public ViewDataBinding m37745a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            m37741e();
        }
        return viewDataBinding;
    }

    /* renamed from: b */
    public T m37744b() {
        return this.f3712c;
    }

    /* renamed from: c */
    public void m37743c(InterfaceC1491v interfaceC1491v) {
        this.f3710a.mo37751d(interfaceC1491v);
    }

    /* renamed from: d */
    public void m37742d(T t) {
        m37741e();
        this.f3712c = t;
        if (t != null) {
            this.f3710a.mo37794e(t);
        }
    }

    /* renamed from: e */
    public boolean m37741e() {
        boolean z;
        T t = this.f3712c;
        if (t != null) {
            this.f3710a.mo37791h(t);
            z = true;
        } else {
            z = false;
        }
        this.f3712c = null;
        return z;
    }
}
