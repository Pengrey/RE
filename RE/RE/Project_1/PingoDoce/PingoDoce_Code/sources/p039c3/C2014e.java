package p039c3;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1399u;
import java.util.ArrayList;
import java.util.List;
import p039c3.AbstractC2037m;

@SuppressLint({"RestrictedApi"})
/* renamed from: c3.e */
/* loaded from: classes.dex */
public class C2014e extends AbstractC1399u {

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c3.e$a */
    /* loaded from: classes.dex */
    class C2015a extends AbstractC2037m.AbstractC2042e {
        C2015a(C2014e c2014e, Rect rect) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c3.e$b */
    /* loaded from: classes.dex */
    class C2016b implements AbstractC2037m.InterfaceC2043f {

        /* renamed from: a */
        final /* synthetic */ View f5853a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5854b;

        C2016b(C2014e c2014e, View view, ArrayList arrayList) {
            this.f5853a = view;
            this.f5854b = arrayList;
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: a */
        public void mo34856a(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: b */
        public void mo34855b(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: c */
        public void mo34817c(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: d */
        public void mo34854d(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            abstractC2037m.mo34846T(this);
            this.f5853a.setVisibility(8);
            int size = this.f5854b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5854b.get(i)).setVisibility(0);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c3.e$c */
    /* loaded from: classes.dex */
    class C2017c extends C2045n {

        /* renamed from: a */
        final /* synthetic */ Object f5855a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5856b;

        /* renamed from: c */
        final /* synthetic */ Object f5857c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5858d;

        /* renamed from: e */
        final /* synthetic */ Object f5859e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5860f;

        C2017c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5855a = obj;
            this.f5856b = arrayList;
            this.f5857c = obj2;
            this.f5858d = arrayList2;
            this.f5859e = obj3;
            this.f5860f = arrayList3;
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: c */
        public void mo34817c(AbstractC2037m abstractC2037m) {
            Object obj = this.f5855a;
            if (obj != null) {
                C2014e.this.mo34922q(obj, this.f5856b, null);
            }
            Object obj2 = this.f5857c;
            if (obj2 != null) {
                C2014e.this.mo34922q(obj2, this.f5858d, null);
            }
            Object obj3 = this.f5859e;
            if (obj3 != null) {
                C2014e.this.mo34922q(obj3, this.f5860f, null);
            }
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            abstractC2037m.mo34846T(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c3.e$d */
    /* loaded from: classes.dex */
    class C2018d extends AbstractC2037m.AbstractC2042e {
        C2018d(C2014e c2014e, Rect rect) {
        }
    }

    /* renamed from: C */
    private static boolean m34931C(AbstractC2037m abstractC2037m) {
        return (AbstractC1399u.m37135l(abstractC2037m.m34888C()) && AbstractC1399u.m37135l(abstractC2037m.m34887D()) && AbstractC1399u.m37135l(abstractC2037m.m34886F())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: A */
    public void mo34933A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2050q c2050q = (C2050q) obj;
        if (c2050q != null) {
            c2050q.m34885G().clear();
            c2050q.m34885G().addAll(arrayList2);
            mo34922q(c2050q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: B */
    public Object mo34932B(Object obj) {
        if (obj == null) {
            return null;
        }
        C2050q c2050q = new C2050q();
        c2050q.m34830i0((AbstractC2037m) obj);
        return c2050q;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: a */
    public void mo34930a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2037m) obj).mo34838b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: b */
    public void mo34929b(Object obj, ArrayList<View> arrayList) {
        AbstractC2037m abstractC2037m = (AbstractC2037m) obj;
        if (abstractC2037m == null) {
            return;
        }
        int i = 0;
        if (abstractC2037m instanceof C2050q) {
            C2050q c2050q = (C2050q) abstractC2037m;
            int m34827l0 = c2050q.m34827l0();
            while (i < m34827l0) {
                mo34929b(c2050q.m34828k0(i), arrayList);
                i++;
            }
        } else if (m34931C(abstractC2037m) || !AbstractC1399u.m37135l(abstractC2037m.m34885G())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                abstractC2037m.mo34838b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: c */
    public void mo34928c(ViewGroup viewGroup, Object obj) {
        C2046o.m34852b(viewGroup, (AbstractC2037m) obj);
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: e */
    public boolean mo34927e(Object obj) {
        return obj instanceof AbstractC2037m;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: g */
    public Object mo34926g(Object obj) {
        if (obj != null) {
            return ((AbstractC2037m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: m */
    public Object mo34925m(Object obj, Object obj2, Object obj3) {
        AbstractC2037m abstractC2037m = (AbstractC2037m) obj;
        AbstractC2037m abstractC2037m2 = (AbstractC2037m) obj2;
        AbstractC2037m abstractC2037m3 = (AbstractC2037m) obj3;
        if (abstractC2037m != null && abstractC2037m2 != null) {
            abstractC2037m = new C2050q().m34830i0(abstractC2037m).m34830i0(abstractC2037m2).m34820q0(1);
        } else if (abstractC2037m == null) {
            abstractC2037m = abstractC2037m2 != null ? abstractC2037m2 : null;
        }
        if (abstractC2037m3 != null) {
            C2050q c2050q = new C2050q();
            if (abstractC2037m != null) {
                c2050q.m34830i0(abstractC2037m);
            }
            c2050q.m34830i0(abstractC2037m3);
            return c2050q;
        }
        return abstractC2037m;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: n */
    public Object mo34924n(Object obj, Object obj2, Object obj3) {
        C2050q c2050q = new C2050q();
        if (obj != null) {
            c2050q.m34830i0((AbstractC2037m) obj);
        }
        if (obj2 != null) {
            c2050q.m34830i0((AbstractC2037m) obj2);
        }
        if (obj3 != null) {
            c2050q.m34830i0((AbstractC2037m) obj3);
        }
        return c2050q;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: p */
    public void mo34923p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2037m) obj).mo34845U(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: q */
    public void mo34922q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC2037m abstractC2037m = (AbstractC2037m) obj;
        int i = 0;
        if (abstractC2037m instanceof C2050q) {
            C2050q c2050q = (C2050q) abstractC2037m;
            int m34827l0 = c2050q.m34827l0();
            while (i < m34827l0) {
                mo34922q(c2050q.m34828k0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m34931C(abstractC2037m)) {
            List<View> m34885G = abstractC2037m.m34885G();
            if (m34885G.size() == arrayList.size() && m34885G.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    abstractC2037m.mo34838b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    abstractC2037m.mo34845U(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: r */
    public void mo34921r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC2037m) obj).mo34840a(new C2016b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: t */
    public void mo34920t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC2037m) obj).mo34840a(new C2017c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: u */
    public void mo34919u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2037m) obj).mo34841Z(new C2018d(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: v */
    public void mo34918v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m37136k(view, rect);
            ((AbstractC2037m) obj).mo34841Z(new C2015a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: z */
    public void mo34917z(Object obj, View view, ArrayList<View> arrayList) {
        C2050q c2050q = (C2050q) obj;
        List<View> m34885G = c2050q.m34885G();
        m34885G.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1399u.m37141d(m34885G, arrayList.get(i));
        }
        m34885G.add(view);
        arrayList.add(view);
        mo34929b(c2050q, arrayList);
    }
}
