package p039c3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C1112b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p301q.C9545a;

/* renamed from: c3.o */
/* loaded from: classes.dex */
public class C2046o {

    /* renamed from: a */
    private static AbstractC2037m f5942a = new C1993b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C9545a<ViewGroup, ArrayList<AbstractC2037m>>>> f5943b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f5944c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* renamed from: c3.o$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC2047a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: w */
        AbstractC2037m f5945w;

        /* renamed from: x */
        ViewGroup f5946x;

        /* compiled from: TransitionManager.java */
        /* renamed from: c3.o$a$a */
        /* loaded from: classes.dex */
        class C2048a extends C2045n {

            /* renamed from: a */
            final /* synthetic */ C9545a f5947a;

            C2048a(C9545a c9545a) {
                this.f5947a = c9545a;
            }

            @Override // p039c3.AbstractC2037m.InterfaceC2043f
            /* renamed from: e */
            public void mo34816e(AbstractC2037m abstractC2037m) {
                ((ArrayList) this.f5947a.get(ViewTreeObserver$OnPreDrawListenerC2047a.this.f5946x)).remove(abstractC2037m);
                abstractC2037m.mo34846T(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC2047a(AbstractC2037m abstractC2037m, ViewGroup viewGroup) {
            this.f5945w = abstractC2037m;
            this.f5946x = viewGroup;
        }

        /* renamed from: a */
        private void m34848a() {
            this.f5946x.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5946x.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m34848a();
            if (C2046o.f5944c.remove(this.f5946x)) {
                C9545a<ViewGroup, ArrayList<AbstractC2037m>> m34851c = C2046o.m34851c();
                ArrayList<AbstractC2037m> arrayList = m34851c.get(this.f5946x);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    m34851c.put(this.f5946x, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f5945w);
                this.f5945w.mo34840a(new C2048a(m34851c));
                this.f5945w.m34867k(this.f5946x, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC2037m) it.next()).mo34844V(this.f5946x);
                    }
                }
                this.f5945w.m34874S(this.f5946x);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m34848a();
            C2046o.f5944c.remove(this.f5946x);
            ArrayList<AbstractC2037m> arrayList = C2046o.m34851c().get(this.f5946x);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC2037m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo34844V(this.f5946x);
                }
            }
            this.f5945w.m34866l(true);
        }
    }

    /* renamed from: a */
    public static void m34853a(ViewGroup viewGroup) {
        m34852b(viewGroup, null);
    }

    /* renamed from: b */
    public static void m34852b(ViewGroup viewGroup, AbstractC2037m abstractC2037m) {
        if (f5944c.contains(viewGroup) || !C1112b0.m38446W(viewGroup)) {
            return;
        }
        f5944c.add(viewGroup);
        if (abstractC2037m == null) {
            abstractC2037m = f5942a;
        }
        AbstractC2037m clone = abstractC2037m.clone();
        m34849e(viewGroup, clone);
        C2035l.m34891c(viewGroup, null);
        m34850d(viewGroup, clone);
    }

    /* renamed from: c */
    static C9545a<ViewGroup, ArrayList<AbstractC2037m>> m34851c() {
        C9545a<ViewGroup, ArrayList<AbstractC2037m>> c9545a;
        WeakReference<C9545a<ViewGroup, ArrayList<AbstractC2037m>>> weakReference = f5943b.get();
        if (weakReference == null || (c9545a = weakReference.get()) == null) {
            C9545a<ViewGroup, ArrayList<AbstractC2037m>> c9545a2 = new C9545a<>();
            f5943b.set(new WeakReference<>(c9545a2));
            return c9545a2;
        }
        return c9545a;
    }

    /* renamed from: d */
    private static void m34850d(ViewGroup viewGroup, AbstractC2037m abstractC2037m) {
        if (abstractC2037m == null || viewGroup == null) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC2047a viewTreeObserver$OnPreDrawListenerC2047a = new ViewTreeObserver$OnPreDrawListenerC2047a(abstractC2037m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC2047a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC2047a);
    }

    /* renamed from: e */
    private static void m34849e(ViewGroup viewGroup, AbstractC2037m abstractC2037m) {
        ArrayList<AbstractC2037m> arrayList = m34851c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC2037m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo34847R(viewGroup);
            }
        }
        if (abstractC2037m != null) {
            abstractC2037m.m34867k(viewGroup, true);
        }
        C2035l m34892b = C2035l.m34892b(viewGroup);
        if (m34892b != null) {
            m34892b.m34893a();
        }
    }
}
