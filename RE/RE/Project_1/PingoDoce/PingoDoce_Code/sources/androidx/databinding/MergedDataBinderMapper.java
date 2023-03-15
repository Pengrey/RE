package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC1273d {

    /* renamed from: a */
    private Set<Class<? extends AbstractC1273d>> f3663a = new HashSet();

    /* renamed from: b */
    private List<AbstractC1273d> f3664b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<String> f3665c = new CopyOnWriteArrayList();

    /* renamed from: e */
    private boolean m37830e() {
        boolean z = false;
        for (String str : this.f3665c) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC1273d.class.isAssignableFrom(cls)) {
                    m37831d((AbstractC1273d) cls.newInstance());
                    this.f3665c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: b */
    public ViewDataBinding mo14799b(InterfaceC1274e interfaceC1274e, View view, int i) {
        for (AbstractC1273d abstractC1273d : this.f3664b) {
            ViewDataBinding mo14799b = abstractC1273d.mo14799b(interfaceC1274e, view, i);
            if (mo14799b != null) {
                return mo14799b;
            }
        }
        if (m37830e()) {
            return mo14799b(interfaceC1274e, view, i);
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: c */
    public ViewDataBinding mo14798c(InterfaceC1274e interfaceC1274e, View[] viewArr, int i) {
        for (AbstractC1273d abstractC1273d : this.f3664b) {
            ViewDataBinding mo14798c = abstractC1273d.mo14798c(interfaceC1274e, viewArr, i);
            if (mo14798c != null) {
                return mo14798c;
            }
        }
        if (m37830e()) {
            return mo14798c(interfaceC1274e, viewArr, i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public void m37831d(AbstractC1273d abstractC1273d) {
        if (this.f3663a.add(abstractC1273d.getClass())) {
            this.f3664b.add(abstractC1273d);
            for (AbstractC1273d abstractC1273d2 : abstractC1273d.mo14800a()) {
                m37831d(abstractC1273d2);
            }
        }
    }
}
