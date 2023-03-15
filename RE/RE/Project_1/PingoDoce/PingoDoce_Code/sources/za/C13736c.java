package za;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p046cb.C2106a;
import p046cb.C2107b;
import p062db.C4774b;
import p082eb.C5027a;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;

/* renamed from: za.c */
/* loaded from: classes2.dex */
public class C13736c<T extends InterfaceC13143b> extends AbstractC13734a<T> {

    /* renamed from: e */
    private static final C4774b f34844e = new C4774b(1.0d);

    /* renamed from: b */
    private int f34845b = 100;

    /* renamed from: c */
    private final Collection<C13738b<T>> f34846c = new LinkedHashSet();

    /* renamed from: d */
    private final C5027a<C13738b<T>> f34847d = new C5027a<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
    /* renamed from: za.c$b */
    /* loaded from: classes2.dex */
    public static class C13738b<T extends InterfaceC13143b> implements C5027a.InterfaceC5028a, InterfaceC13142a<T> {

        /* renamed from: a */
        private final T f34848a;

        /* renamed from: b */
        private final C2107b f34849b;

        /* renamed from: c */
        private final LatLng f34850c;

        /* renamed from: d */
        private Set<T> f34851d;

        @Override // p466ya.InterfaceC13142a
        /* renamed from: a */
        public int mo524a() {
            return 1;
        }

        @Override // p466ya.InterfaceC13142a
        /* renamed from: b */
        public LatLng mo523b() {
            return this.f34850c;
        }

        @Override // p082eb.C5027a.InterfaceC5028a
        /* renamed from: c */
        public C2107b mo536c() {
            return this.f34849b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13738b) {
                return ((C13738b) obj).f34848a.equals(this.f34848a);
            }
            return false;
        }

        @Override // p466ya.InterfaceC13142a
        /* renamed from: f */
        public Set<T> mo521d() {
            return this.f34851d;
        }

        public int hashCode() {
            return this.f34848a.hashCode();
        }

        private C13738b(T t) {
            this.f34848a = t;
            LatLng mo1544b = t.mo1544b();
            this.f34850c = mo1544b;
            this.f34849b = C13736c.f34844e.m26651b(mo1544b);
            this.f34851d = Collections.singleton(t);
        }
    }

    /* renamed from: k */
    private C2106a m539k(C2107b c2107b, double d) {
        double d2 = d / 2.0d;
        double d3 = c2107b.f6112a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = c2107b.f6113b;
        return new C2106a(d4, d5, d6 - d2, d6 + d2);
    }

    /* renamed from: l */
    private double m538l(C2107b c2107b, C2107b c2107b2) {
        double d = c2107b.f6112a;
        double d2 = c2107b2.f6112a;
        double d3 = (d - d2) * (d - d2);
        double d4 = c2107b.f6113b;
        double d5 = c2107b2.f6113b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // za.InterfaceC13735b
    /* renamed from: b */
    public Set<? extends InterfaceC13142a<T>> mo529b(float f) {
        double pow = (this.f34845b / Math.pow(2.0d, (int) f)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f34847d) {
            Iterator<C13738b<T>> it = m537m(this.f34847d, f).iterator();
            while (it.hasNext()) {
                C13738b<T> next = it.next();
                if (!hashSet.contains(next)) {
                    Collection<C13738b<T>> m25874d = this.f34847d.m25874d(m539k(next.mo536c(), pow));
                    if (m25874d.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        C13743g c13743g = new C13743g(((C13738b) next).f34848a.mo1544b());
                        hashSet2.add(c13743g);
                        for (C13738b<T> c13738b : m25874d) {
                            Double d = (Double) hashMap.get(c13738b);
                            Iterator<C13738b<T>> it2 = it;
                            double m538l = m538l(c13738b.mo536c(), next.mo536c());
                            if (d != null) {
                                if (d.doubleValue() < m538l) {
                                    it = it2;
                                } else {
                                    ((C13743g) hashMap2.get(c13738b)).m520e(((C13738b) c13738b).f34848a);
                                }
                            }
                            hashMap.put(c13738b, Double.valueOf(m538l));
                            c13743g.m522c(((C13738b) c13738b).f34848a);
                            hashMap2.put(c13738b, c13743g);
                            it = it2;
                        }
                        hashSet.addAll(m25874d);
                        it = it;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: e */
    public boolean mo528e(Collection<T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (m540j(t)) {
                z = true;
            }
        }
        return z;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: f */
    public int mo527f() {
        return this.f34845b;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: h */
    public void mo525h() {
        synchronized (this.f34847d) {
            this.f34846c.clear();
            this.f34847d.m25876b();
        }
    }

    /* renamed from: j */
    public boolean m540j(T t) {
        boolean add;
        C13738b<T> c13738b = new C13738b<>(t);
        synchronized (this.f34847d) {
            add = this.f34846c.add(c13738b);
            if (add) {
                this.f34847d.m25877a(c13738b);
            }
        }
        return add;
    }

    /* renamed from: m */
    protected Collection<C13738b<T>> m537m(C5027a<C13738b<T>> c5027a, float f) {
        return this.f34846c;
    }
}
