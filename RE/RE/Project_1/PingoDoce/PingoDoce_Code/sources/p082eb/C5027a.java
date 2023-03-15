package p082eb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p046cb.C2106a;
import p046cb.C2107b;
import p082eb.C5027a.InterfaceC5028a;

/* renamed from: eb.a */
/* loaded from: classes2.dex */
public class C5027a<T extends InterfaceC5028a> {

    /* renamed from: a */
    private final C2106a f13953a;

    /* renamed from: b */
    private final int f13954b;

    /* renamed from: c */
    private Set<T> f13955c;

    /* renamed from: d */
    private List<C5027a<T>> f13956d;

    /* compiled from: PointQuadTree.java */
    /* renamed from: eb.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5028a {
        /* renamed from: c */
        C2107b mo536c();
    }

    public C5027a(double d, double d2, double d3, double d4) {
        this(new C2106a(d, d2, d3, d4));
    }

    /* renamed from: c */
    private void m25875c(double d, double d2, T t) {
        List<C5027a<T>> list = this.f13956d;
        if (list != null) {
            C2106a c2106a = this.f13953a;
            if (d2 < c2106a.f6111f) {
                if (d < c2106a.f6110e) {
                    list.get(0).m25875c(d, d2, t);
                    return;
                } else {
                    list.get(1).m25875c(d, d2, t);
                    return;
                }
            } else if (d < c2106a.f6110e) {
                list.get(2).m25875c(d, d2, t);
                return;
            } else {
                list.get(3).m25875c(d, d2, t);
                return;
            }
        }
        if (this.f13955c == null) {
            this.f13955c = new LinkedHashSet();
        }
        this.f13955c.add(t);
        if (this.f13955c.size() <= 50 || this.f13954b >= 40) {
            return;
        }
        m25872f();
    }

    /* renamed from: e */
    private void m25873e(C2106a c2106a, Collection<T> collection) {
        if (this.f13953a.m34653e(c2106a)) {
            List<C5027a<T>> list = this.f13956d;
            if (list != null) {
                for (C5027a<T> c5027a : list) {
                    c5027a.m25873e(c2106a, collection);
                }
            } else if (this.f13955c != null) {
                if (c2106a.m34656b(this.f13953a)) {
                    collection.addAll(this.f13955c);
                    return;
                }
                for (T t : this.f13955c) {
                    if (c2106a.m34655c(t.mo536c())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m25872f() {
        ArrayList arrayList = new ArrayList(4);
        this.f13956d = arrayList;
        C2106a c2106a = this.f13953a;
        arrayList.add(new C5027a(c2106a.f6106a, c2106a.f6110e, c2106a.f6107b, c2106a.f6111f, this.f13954b + 1));
        List<C5027a<T>> list = this.f13956d;
        C2106a c2106a2 = this.f13953a;
        list.add(new C5027a<>(c2106a2.f6110e, c2106a2.f6108c, c2106a2.f6107b, c2106a2.f6111f, this.f13954b + 1));
        List<C5027a<T>> list2 = this.f13956d;
        C2106a c2106a3 = this.f13953a;
        list2.add(new C5027a<>(c2106a3.f6106a, c2106a3.f6110e, c2106a3.f6111f, c2106a3.f6109d, this.f13954b + 1));
        List<C5027a<T>> list3 = this.f13956d;
        C2106a c2106a4 = this.f13953a;
        list3.add(new C5027a<>(c2106a4.f6110e, c2106a4.f6108c, c2106a4.f6111f, c2106a4.f6109d, this.f13954b + 1));
        Set<T> set = this.f13955c;
        this.f13955c = null;
        for (T t : set) {
            m25875c(t.mo536c().f6112a, t.mo536c().f6113b, t);
        }
    }

    /* renamed from: a */
    public void m25877a(T t) {
        C2107b mo536c = t.mo536c();
        if (this.f13953a.m34657a(mo536c.f6112a, mo536c.f6113b)) {
            m25875c(mo536c.f6112a, mo536c.f6113b, t);
        }
    }

    /* renamed from: b */
    public void m25876b() {
        this.f13956d = null;
        Set<T> set = this.f13955c;
        if (set != null) {
            set.clear();
        }
    }

    /* renamed from: d */
    public Collection<T> m25874d(C2106a c2106a) {
        ArrayList arrayList = new ArrayList();
        m25873e(c2106a, arrayList);
        return arrayList;
    }

    public C5027a(C2106a c2106a) {
        this(c2106a, 0);
    }

    private C5027a(double d, double d2, double d3, double d4, int i) {
        this(new C2106a(d, d2, d3, d4), i);
    }

    private C5027a(C2106a c2106a, int i) {
        this.f13956d = null;
        this.f13953a = c2106a;
        this.f13954b = i;
    }
}
