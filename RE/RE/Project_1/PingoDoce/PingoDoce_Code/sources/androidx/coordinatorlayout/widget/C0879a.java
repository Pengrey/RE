package androidx.coordinatorlayout.widget;

import androidx.core.util.C1074f;
import androidx.core.util.InterfaceC1073e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p301q.C9558g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0879a<T> {

    /* renamed from: a */
    private final InterfaceC1073e<ArrayList<T>> f3050a = new C1074f(10);

    /* renamed from: b */
    private final C9558g<T, ArrayList<T>> f3051b = new C9558g<>();

    /* renamed from: c */
    private final ArrayList<T> f3052c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3053d = new HashSet<>();

    /* renamed from: e */
    private void m39278e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.f3051b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m39278e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList<T> m39277f() {
        ArrayList<T> mo38625b = this.f3050a.mo38625b();
        return mo38625b == null ? new ArrayList<>() : mo38625b;
    }

    /* renamed from: k */
    private void m39272k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3050a.mo38626a(arrayList);
    }

    /* renamed from: a */
    public void m39282a(T t, T t2) {
        if (this.f3051b.containsKey(t) && this.f3051b.containsKey(t2)) {
            ArrayList<T> arrayList = this.f3051b.get(t);
            if (arrayList == null) {
                arrayList = m39277f();
                this.f3051b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m39281b(T t) {
        if (this.f3051b.containsKey(t)) {
            return;
        }
        this.f3051b.put(t, null);
    }

    /* renamed from: c */
    public void m39280c() {
        int size = this.f3051b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m10610q = this.f3051b.m10610q(i);
            if (m10610q != null) {
                m39272k(m10610q);
            }
        }
        this.f3051b.clear();
    }

    /* renamed from: d */
    public boolean m39279d(T t) {
        return this.f3051b.containsKey(t);
    }

    /* renamed from: g */
    public List m39276g(T t) {
        return this.f3051b.get(t);
    }

    /* renamed from: h */
    public List<T> m39275h(T t) {
        int size = this.f3051b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m10610q = this.f3051b.m10610q(i);
            if (m10610q != null && m10610q.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3051b.m10614m(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m39274i() {
        this.f3052c.clear();
        this.f3053d.clear();
        int size = this.f3051b.size();
        for (int i = 0; i < size; i++) {
            m39278e(this.f3051b.m10614m(i), this.f3052c, this.f3053d);
        }
        return this.f3052c;
    }

    /* renamed from: j */
    public boolean m39273j(T t) {
        int size = this.f3051b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m10610q = this.f3051b.m10610q(i);
            if (m10610q != null && m10610q.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
