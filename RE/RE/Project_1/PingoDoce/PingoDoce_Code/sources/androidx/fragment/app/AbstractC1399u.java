package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p020os.C1008b;
import androidx.core.view.C1112b0;
import androidx.core.view.C1156e0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public abstract class AbstractC1399u {

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.u$a */
    /* loaded from: classes.dex */
    class RunnableC1400a implements Runnable {

        /* renamed from: A */
        final /* synthetic */ ArrayList f4177A;

        /* renamed from: w */
        final /* synthetic */ int f4178w;

        /* renamed from: x */
        final /* synthetic */ ArrayList f4179x;

        /* renamed from: y */
        final /* synthetic */ ArrayList f4180y;

        /* renamed from: z */
        final /* synthetic */ ArrayList f4181z;

        RunnableC1400a(AbstractC1399u abstractC1399u, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4178w = i;
            this.f4179x = arrayList;
            this.f4180y = arrayList2;
            this.f4181z = arrayList3;
            this.f4177A = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f4178w; i++) {
                C1112b0.m38465J0((View) this.f4179x.get(i), (String) this.f4180y.get(i));
                C1112b0.m38465J0((View) this.f4181z.get(i), (String) this.f4177A.get(i));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.u$b */
    /* loaded from: classes.dex */
    class RunnableC1401b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4182w;

        /* renamed from: x */
        final /* synthetic */ Map f4183x;

        RunnableC1401b(AbstractC1399u abstractC1399u, ArrayList arrayList, Map map) {
            this.f4182w = arrayList;
            this.f4183x = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4182w.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4182w.get(i);
                String m38458N = C1112b0.m38458N(view);
                if (m38458N != null) {
                    C1112b0.m38465J0(view, AbstractC1399u.m37138i(this.f4183x, m38458N));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* renamed from: androidx.fragment.app.u$c */
    /* loaded from: classes.dex */
    class RunnableC1402c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4184w;

        /* renamed from: x */
        final /* synthetic */ Map f4185x;

        RunnableC1402c(AbstractC1399u abstractC1399u, ArrayList arrayList, Map map) {
            this.f4184w = arrayList;
            this.f4185x = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4184w.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4184w.get(i);
                C1112b0.m38465J0(view, (String) this.f4185x.get(C1112b0.m38458N(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m37141d(List<View> list, View view) {
        int size = list.size();
        if (m37139h(list, view, size)) {
            return;
        }
        if (C1112b0.m38458N(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m37139h(list, childAt, size) && C1112b0.m38458N(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m37139h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m37138i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m37135l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo34933A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo34932B(Object obj);

    /* renamed from: a */
    public abstract void mo34930a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo34929b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo34928c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo34927e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37140f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (C1156e0.m38202a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m37140f(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo34926g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m37137j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m38458N = C1112b0.m38458N(view);
            if (m38458N != null) {
                map.put(m38458N, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m37137j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m37136k(View view, Rect rect) {
        if (C1112b0.m38447V(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo34925m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo34924n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m37134o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C1112b0.m38458N(view));
            C1112b0.m38465J0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo34923p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo34922q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo34921r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m37133s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(viewGroup, new RunnableC1402c(this, arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo34920t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo34919u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo34918v(Object obj, View view);

    /* renamed from: w */
    public void mo37132w(Fragment fragment, Object obj, C1008b c1008b, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m37131x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(view, new RunnableC1401b(this, arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m37130y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m38458N = C1112b0.m38458N(view2);
            arrayList4.add(m38458N);
            if (m38458N != null) {
                C1112b0.m38465J0(view2, null);
                String str = map.get(m38458N);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C1112b0.m38465J0(arrayList2.get(i2), m38458N);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(view, new RunnableC1400a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo34917z(Object obj, View view, ArrayList<View> arrayList);
}
