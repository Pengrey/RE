package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public class C1371k {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C1372a> f4076a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f4077b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes.dex */
    public static final class C1372a {

        /* renamed from: a */
        final FragmentManager.AbstractC1324l f4078a;

        /* renamed from: b */
        final boolean f4079b;

        C1372a(FragmentManager.AbstractC1324l abstractC1324l, boolean z) {
            this.f4078a = abstractC1324l;
            this.f4079b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1371k(FragmentManager fragmentManager) {
        this.f4077b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37264a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37264a(fragment, bundle, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37400a(this.f4077b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37263b(Fragment fragment, boolean z) {
        Context m37274g = this.f4077b.m37419v0().m37274g();
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37263b(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37399b(this.f4077b, fragment, m37274g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37262c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37262c(fragment, bundle, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37398c(this.f4077b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m37261d(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37261d(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37397d(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37260e(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37260e(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37396e(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37259f(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37259f(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37395f(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37258g(Fragment fragment, boolean z) {
        Context m37274g = this.f4077b.m37419v0().m37274g();
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37258g(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37394g(this.f4077b, fragment, m37274g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37257h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37257h(fragment, bundle, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37393h(this.f4077b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37256i(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37256i(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37392i(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m37255j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37255j(fragment, bundle, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37391j(this.f4077b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m37254k(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37254k(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37390k(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m37253l(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37253l(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37389l(this.f4077b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m37252m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37252m(fragment, view, bundle, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.mo35503m(this.f4077b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m37251n(Fragment fragment, boolean z) {
        Fragment m37411y0 = this.f4077b.m37411y0();
        if (m37411y0 != null) {
            m37411y0.m37620T().m37413x0().m37251n(fragment, true);
        }
        Iterator<C1372a> it = this.f4076a.iterator();
        while (it.hasNext()) {
            C1372a next = it.next();
            if (!z || next.f4079b) {
                next.f4078a.m37388n(this.f4077b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m37250o(FragmentManager.AbstractC1324l abstractC1324l, boolean z) {
        this.f4076a.add(new C1372a(abstractC1324l, z));
    }

    /* renamed from: p */
    public void m37249p(FragmentManager.AbstractC1324l abstractC1324l) {
        synchronized (this.f4076a) {
            int i = 0;
            int size = this.f4076a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f4076a.get(i).f4078a == abstractC1324l) {
                    this.f4076a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
