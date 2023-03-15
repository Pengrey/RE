package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p020os.C1008b;
import androidx.core.view.C1112b0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p039c3.C2014e;
import p301q.C9545a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public class C1384s {

    /* renamed from: a */
    private static final int[] f4122a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC1399u f4123b;

    /* renamed from: c */
    static final AbstractC1399u f4124c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: classes.dex */
    public class RunnableC1385a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1391g f4125w;

        /* renamed from: x */
        final /* synthetic */ Fragment f4126x;

        /* renamed from: y */
        final /* synthetic */ C1008b f4127y;

        RunnableC1385a(InterfaceC1391g interfaceC1391g, Fragment fragment, C1008b c1008b) {
            this.f4125w = interfaceC1391g;
            this.f4126x = fragment;
            this.f4127y = c1008b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4125w.mo37144a(this.f4126x, this.f4127y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$b */
    /* loaded from: classes.dex */
    public class RunnableC1386b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4128w;

        RunnableC1386b(ArrayList arrayList) {
            this.f4128w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1384s.m37172A(this.f4128w, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$c */
    /* loaded from: classes.dex */
    public class RunnableC1387c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1391g f4129w;

        /* renamed from: x */
        final /* synthetic */ Fragment f4130x;

        /* renamed from: y */
        final /* synthetic */ C1008b f4131y;

        RunnableC1387c(InterfaceC1391g interfaceC1391g, Fragment fragment, C1008b c1008b) {
            this.f4129w = interfaceC1391g;
            this.f4130x = fragment;
            this.f4131y = c1008b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4129w.mo37144a(this.f4130x, this.f4131y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$d */
    /* loaded from: classes.dex */
    public class RunnableC1388d implements Runnable {

        /* renamed from: A */
        final /* synthetic */ ArrayList f4132A;

        /* renamed from: B */
        final /* synthetic */ ArrayList f4133B;

        /* renamed from: C */
        final /* synthetic */ ArrayList f4134C;

        /* renamed from: D */
        final /* synthetic */ Object f4135D;

        /* renamed from: w */
        final /* synthetic */ Object f4136w;

        /* renamed from: x */
        final /* synthetic */ AbstractC1399u f4137x;

        /* renamed from: y */
        final /* synthetic */ View f4138y;

        /* renamed from: z */
        final /* synthetic */ Fragment f4139z;

        RunnableC1388d(Object obj, AbstractC1399u abstractC1399u, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4136w = obj;
            this.f4137x = abstractC1399u;
            this.f4138y = view;
            this.f4139z = fragment;
            this.f4132A = arrayList;
            this.f4133B = arrayList2;
            this.f4134C = arrayList3;
            this.f4135D = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4136w;
            if (obj != null) {
                this.f4137x.mo34923p(obj, this.f4138y);
                this.f4133B.addAll(C1384s.m37160k(this.f4137x, this.f4136w, this.f4139z, this.f4132A, this.f4138y));
            }
            if (this.f4134C != null) {
                if (this.f4135D != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4138y);
                    this.f4137x.mo34922q(this.f4135D, this.f4134C, arrayList);
                }
                this.f4134C.clear();
                this.f4134C.add(this.f4138y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$e */
    /* loaded from: classes.dex */
    public class RunnableC1389e implements Runnable {

        /* renamed from: A */
        final /* synthetic */ View f4140A;

        /* renamed from: B */
        final /* synthetic */ AbstractC1399u f4141B;

        /* renamed from: C */
        final /* synthetic */ Rect f4142C;

        /* renamed from: w */
        final /* synthetic */ Fragment f4143w;

        /* renamed from: x */
        final /* synthetic */ Fragment f4144x;

        /* renamed from: y */
        final /* synthetic */ boolean f4145y;

        /* renamed from: z */
        final /* synthetic */ C9545a f4146z;

        RunnableC1389e(Fragment fragment, Fragment fragment2, boolean z, C9545a c9545a, View view, AbstractC1399u abstractC1399u, Rect rect) {
            this.f4143w = fragment;
            this.f4144x = fragment2;
            this.f4145y = z;
            this.f4146z = c9545a;
            this.f4140A = view;
            this.f4141B = abstractC1399u;
            this.f4142C = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1384s.m37165f(this.f4143w, this.f4144x, this.f4145y, this.f4146z, false);
            View view = this.f4140A;
            if (view != null) {
                this.f4141B.m37136k(view, this.f4142C);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$f */
    /* loaded from: classes.dex */
    public class RunnableC1390f implements Runnable {

        /* renamed from: A */
        final /* synthetic */ ArrayList f4147A;

        /* renamed from: B */
        final /* synthetic */ View f4148B;

        /* renamed from: C */
        final /* synthetic */ Fragment f4149C;

        /* renamed from: D */
        final /* synthetic */ Fragment f4150D;

        /* renamed from: E */
        final /* synthetic */ boolean f4151E;

        /* renamed from: F */
        final /* synthetic */ ArrayList f4152F;

        /* renamed from: G */
        final /* synthetic */ Object f4153G;

        /* renamed from: H */
        final /* synthetic */ Rect f4154H;

        /* renamed from: w */
        final /* synthetic */ AbstractC1399u f4155w;

        /* renamed from: x */
        final /* synthetic */ C9545a f4156x;

        /* renamed from: y */
        final /* synthetic */ Object f4157y;

        /* renamed from: z */
        final /* synthetic */ C1392h f4158z;

        RunnableC1390f(AbstractC1399u abstractC1399u, C9545a c9545a, Object obj, C1392h c1392h, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4155w = abstractC1399u;
            this.f4156x = c9545a;
            this.f4157y = obj;
            this.f4158z = c1392h;
            this.f4147A = arrayList;
            this.f4148B = view;
            this.f4149C = fragment;
            this.f4150D = fragment2;
            this.f4151E = z;
            this.f4152F = arrayList2;
            this.f4153G = obj2;
            this.f4154H = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9545a<String, View> m37163h = C1384s.m37163h(this.f4155w, this.f4156x, this.f4157y, this.f4158z);
            if (m37163h != null) {
                this.f4147A.addAll(m37163h.values());
                this.f4147A.add(this.f4148B);
            }
            C1384s.m37165f(this.f4149C, this.f4150D, this.f4151E, m37163h, false);
            Object obj = this.f4157y;
            if (obj != null) {
                this.f4155w.mo34933A(obj, this.f4152F, this.f4147A);
                View m37152s = C1384s.m37152s(m37163h, this.f4158z, this.f4153G, this.f4151E);
                if (m37152s != null) {
                    this.f4155w.m37136k(m37152s, this.f4154H);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1391g {
        /* renamed from: a */
        void mo37144a(Fragment fragment, C1008b c1008b);

        /* renamed from: b */
        void mo37143b(Fragment fragment, C1008b c1008b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* renamed from: androidx.fragment.app.s$h */
    /* loaded from: classes.dex */
    public static class C1392h {

        /* renamed from: a */
        public Fragment f4159a;

        /* renamed from: b */
        public boolean f4160b;

        /* renamed from: c */
        public C1331a f4161c;

        /* renamed from: d */
        public Fragment f4162d;

        /* renamed from: e */
        public boolean f4163e;

        /* renamed from: f */
        public C1331a f4164f;

        C1392h() {
        }
    }

    static {
        f4123b = Build.VERSION.SDK_INT >= 21 ? new C1393t() : null;
        f4124c = m37148w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m37172A(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m37171B(Context context, AbstractC1365f abstractC1365f, ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, InterfaceC1391g interfaceC1391g) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C1331a c1331a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m37166e(c1331a, sparseArray, z);
            } else {
                m37168c(c1331a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C9545a<String, String> m37167d = m37167d(keyAt, arrayList, arrayList2, i, i2);
                C1392h c1392h = (C1392h) sparseArray.valueAt(i4);
                if (abstractC1365f.mo37276e() && (viewGroup = (ViewGroup) abstractC1365f.mo37277d(keyAt)) != null) {
                    if (z) {
                        m37156o(viewGroup, c1392h, view, m37167d, interfaceC1391g);
                    } else {
                        m37157n(viewGroup, c1392h, view, m37167d, interfaceC1391g);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m37170a(ArrayList<View> arrayList, C9545a<String, View> c9545a, Collection<String> collection) {
        for (int size = c9545a.size() - 1; size >= 0; size--) {
            View m10610q = c9545a.m10610q(size);
            if (collection.contains(C1112b0.m38458N(m10610q))) {
                arrayList.add(m10610q);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.f3806H != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
        if (r0.f3819V == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m37169b(androidx.fragment.app.C1331a r8, androidx.fragment.app.AbstractC1382r.C1383a r9, android.util.SparseArray<androidx.fragment.app.C1384s.C1392h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1384s.m37169b(androidx.fragment.app.a, androidx.fragment.app.r$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m37168c(C1331a c1331a, SparseArray<C1392h> sparseArray, boolean z) {
        int size = c1331a.f4112a.size();
        for (int i = 0; i < size; i++) {
            m37169b(c1331a, c1331a.f4112a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C9545a<String, String> m37167d(int i, ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C9545a<String, String> c9545a = new C9545a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1331a c1331a = arrayList.get(i4);
            if (c1331a.m37362z(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c1331a.f4109m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c1331a.f4109m;
                        arrayList4 = c1331a.f4110n;
                    } else {
                        ArrayList<String> arrayList6 = c1331a.f4109m;
                        arrayList3 = c1331a.f4110n;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c9545a.remove(str2);
                        if (remove != null) {
                            c9545a.put(str, remove);
                        } else {
                            c9545a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c9545a;
    }

    /* renamed from: e */
    public static void m37166e(C1331a c1331a, SparseArray<C1392h> sparseArray, boolean z) {
        if (c1331a.f3982q.m37437p0().mo37276e()) {
            for (int size = c1331a.f4112a.size() - 1; size >= 0; size--) {
                m37169b(c1331a, c1331a.f4112a.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m37165f(Fragment fragment, Fragment fragment2, boolean z, C9545a<String, View> c9545a, boolean z2) {
        if (z) {
            fragment2.m37647J();
        } else {
            fragment.m37647J();
        }
    }

    /* renamed from: g */
    private static boolean m37164g(AbstractC1399u abstractC1399u, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC1399u.mo34927e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C9545a<String, View> m37163h(AbstractC1399u abstractC1399u, C9545a<String, String> c9545a, Object obj, C1392h c1392h) {
        ArrayList<String> arrayList;
        Fragment fragment = c1392h.f4159a;
        View m37584h0 = fragment.m37584h0();
        if (!c9545a.isEmpty() && obj != null && m37584h0 != null) {
            C9545a<String, View> c9545a2 = new C9545a<>();
            abstractC1399u.m37137j(c9545a2, m37584h0);
            C1331a c1331a = c1392h.f4161c;
            if (c1392h.f4160b) {
                fragment.m37640M();
                arrayList = c1331a.f4109m;
            } else {
                fragment.m37647J();
                arrayList = c1331a.f4110n;
            }
            if (arrayList != null) {
                c9545a2.m10668u(arrayList);
                c9545a2.m10668u(c9545a.values());
            }
            m37147x(c9545a, c9545a2);
            return c9545a2;
        }
        c9545a.clear();
        return null;
    }

    /* renamed from: i */
    private static C9545a<String, View> m37162i(AbstractC1399u abstractC1399u, C9545a<String, String> c9545a, Object obj, C1392h c1392h) {
        ArrayList<String> arrayList;
        if (!c9545a.isEmpty() && obj != null) {
            Fragment fragment = c1392h.f4162d;
            C9545a<String, View> c9545a2 = new C9545a<>();
            abstractC1399u.m37137j(c9545a2, fragment.m37648I1());
            C1331a c1331a = c1392h.f4164f;
            if (c1392h.f4163e) {
                fragment.m37647J();
                arrayList = c1331a.f4110n;
            } else {
                fragment.m37640M();
                arrayList = c1331a.f4109m;
            }
            if (arrayList != null) {
                c9545a2.m10668u(arrayList);
            }
            c9545a.m10668u(c9545a2.keySet());
            return c9545a2;
        }
        c9545a.clear();
        return null;
    }

    /* renamed from: j */
    private static AbstractC1399u m37161j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m37642L = fragment.m37642L();
            if (m37642L != null) {
                arrayList.add(m37642L);
            }
            Object m37601a0 = fragment.m37601a0();
            if (m37601a0 != null) {
                arrayList.add(m37601a0);
            }
            Object m37597c0 = fragment.m37597c0();
            if (m37597c0 != null) {
                arrayList.add(m37597c0);
            }
        }
        if (fragment2 != null) {
            Object m37649I = fragment2.m37649I();
            if (m37649I != null) {
                arrayList.add(m37649I);
            }
            Object m37605Y = fragment2.m37605Y();
            if (m37605Y != null) {
                arrayList.add(m37605Y);
            }
            Object m37599b0 = fragment2.m37599b0();
            if (m37599b0 != null) {
                arrayList.add(m37599b0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1399u abstractC1399u = f4123b;
        if (abstractC1399u == null || !m37164g(abstractC1399u, arrayList)) {
            AbstractC1399u abstractC1399u2 = f4124c;
            if (abstractC1399u2 == null || !m37164g(abstractC1399u2, arrayList)) {
                if (abstractC1399u == null && abstractC1399u2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return abstractC1399u2;
        }
        return abstractC1399u;
    }

    /* renamed from: k */
    static ArrayList<View> m37160k(AbstractC1399u abstractC1399u, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View m37584h0 = fragment.m37584h0();
            if (m37584h0 != null) {
                abstractC1399u.m37140f(arrayList2, m37584h0);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            abstractC1399u.mo34929b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    private static Object m37159l(AbstractC1399u abstractC1399u, ViewGroup viewGroup, View view, C9545a<String, String> c9545a, C1392h c1392h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m37151t;
        C9545a<String, String> c9545a2;
        Object obj3;
        Rect rect;
        Fragment fragment = c1392h.f4159a;
        Fragment fragment2 = c1392h.f4162d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c1392h.f4160b;
        if (c9545a.isEmpty()) {
            c9545a2 = c9545a;
            m37151t = null;
        } else {
            m37151t = m37151t(abstractC1399u, fragment, fragment2, z);
            c9545a2 = c9545a;
        }
        C9545a<String, View> m37162i = m37162i(abstractC1399u, c9545a2, m37151t, c1392h);
        if (c9545a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m37162i.values());
            obj3 = m37151t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m37165f(fragment, fragment2, z, m37162i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC1399u.mo34917z(obj3, view, arrayList);
            m37145z(abstractC1399u, obj3, obj2, m37162i, c1392h.f4163e, c1392h.f4164f);
            if (obj != null) {
                abstractC1399u.mo34919u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(viewGroup, new RunnableC1390f(abstractC1399u, c9545a, obj3, c1392h, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m37158m(AbstractC1399u abstractC1399u, ViewGroup viewGroup, View view, C9545a<String, String> c9545a, C1392h c1392h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = c1392h.f4159a;
        Fragment fragment2 = c1392h.f4162d;
        if (fragment != null) {
            fragment.m37648I1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c1392h.f4160b;
        Object m37151t = c9545a.isEmpty() ? null : m37151t(abstractC1399u, fragment, fragment2, z);
        C9545a<String, View> m37162i = m37162i(abstractC1399u, c9545a, m37151t, c1392h);
        C9545a<String, View> m37163h = m37163h(abstractC1399u, c9545a, m37151t, c1392h);
        if (c9545a.isEmpty()) {
            if (m37162i != null) {
                m37162i.clear();
            }
            if (m37163h != null) {
                m37163h.clear();
            }
            obj3 = null;
        } else {
            m37170a(arrayList, m37162i, c9545a.keySet());
            m37170a(arrayList2, m37163h, c9545a.values());
            obj3 = m37151t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m37165f(fragment, fragment2, z, m37162i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC1399u.mo34917z(obj3, view, arrayList);
            m37145z(abstractC1399u, obj3, obj2, m37162i, c1392h.f4163e, c1392h.f4164f);
            Rect rect2 = new Rect();
            View m37152s = m37152s(m37163h, c1392h, obj, z);
            if (m37152s != null) {
                abstractC1399u.mo34919u(obj, rect2);
            }
            rect = rect2;
            view2 = m37152s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(viewGroup, new RunnableC1389e(fragment, fragment2, z, m37163h, view2, abstractC1399u, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m37157n(ViewGroup viewGroup, C1392h c1392h, View view, C9545a<String, String> c9545a, InterfaceC1391g interfaceC1391g) {
        Object obj;
        Fragment fragment = c1392h.f4159a;
        Fragment fragment2 = c1392h.f4162d;
        AbstractC1399u m37161j = m37161j(fragment2, fragment);
        if (m37161j == null) {
            return;
        }
        boolean z = c1392h.f4160b;
        boolean z2 = c1392h.f4163e;
        Object m37154q = m37154q(m37161j, fragment, z);
        Object m37153r = m37153r(m37161j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m37159l = m37159l(m37161j, viewGroup, view, c9545a, c1392h, arrayList, arrayList2, m37154q, m37153r);
        if (m37154q == null && m37159l == null) {
            obj = m37153r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m37153r;
        }
        ArrayList<View> m37160k = m37160k(m37161j, obj, fragment2, arrayList, view);
        Object obj2 = (m37160k == null || m37160k.isEmpty()) ? null : null;
        m37161j.mo34930a(m37154q, view);
        Object m37150u = m37150u(m37161j, m37154q, obj2, m37159l, fragment, c1392h.f4160b);
        if (fragment2 != null && m37160k != null && (m37160k.size() > 0 || arrayList.size() > 0)) {
            C1008b c1008b = new C1008b();
            interfaceC1391g.mo37143b(fragment2, c1008b);
            m37161j.mo37132w(fragment2, m37150u, c1008b, new RunnableC1387c(interfaceC1391g, fragment2, c1008b));
        }
        if (m37150u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m37161j.mo34920t(m37150u, m37154q, arrayList3, obj2, m37160k, m37159l, arrayList2);
            m37146y(m37161j, viewGroup, fragment, view, arrayList2, m37154q, arrayList3, obj2, m37160k);
            m37161j.m37131x(viewGroup, arrayList2, c9545a);
            m37161j.mo34928c(viewGroup, m37150u);
            m37161j.m37133s(viewGroup, arrayList2, c9545a);
        }
    }

    /* renamed from: o */
    private static void m37156o(ViewGroup viewGroup, C1392h c1392h, View view, C9545a<String, String> c9545a, InterfaceC1391g interfaceC1391g) {
        Object obj;
        Fragment fragment = c1392h.f4159a;
        Fragment fragment2 = c1392h.f4162d;
        AbstractC1399u m37161j = m37161j(fragment2, fragment);
        if (m37161j == null) {
            return;
        }
        boolean z = c1392h.f4160b;
        boolean z2 = c1392h.f4163e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m37154q = m37154q(m37161j, fragment, z);
        Object m37153r = m37153r(m37161j, fragment2, z2);
        Object m37158m = m37158m(m37161j, viewGroup, view, c9545a, c1392h, arrayList2, arrayList, m37154q, m37153r);
        if (m37154q == null && m37158m == null) {
            obj = m37153r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m37153r;
        }
        ArrayList<View> m37160k = m37160k(m37161j, obj, fragment2, arrayList2, view);
        ArrayList<View> m37160k2 = m37160k(m37161j, m37154q, fragment, arrayList, view);
        m37172A(m37160k2, 4);
        Object m37150u = m37150u(m37161j, m37154q, obj, m37158m, fragment, z);
        if (fragment2 != null && m37160k != null && (m37160k.size() > 0 || arrayList2.size() > 0)) {
            C1008b c1008b = new C1008b();
            interfaceC1391g.mo37143b(fragment2, c1008b);
            m37161j.mo37132w(fragment2, m37150u, c1008b, new RunnableC1385a(interfaceC1391g, fragment2, c1008b));
        }
        if (m37150u != null) {
            m37149v(m37161j, obj, fragment2, m37160k);
            ArrayList<String> m37134o = m37161j.m37134o(arrayList);
            m37161j.mo34920t(m37150u, m37154q, m37160k2, obj, m37160k, m37158m, arrayList);
            m37161j.mo34928c(viewGroup, m37150u);
            m37161j.m37130y(viewGroup, arrayList2, arrayList, m37134o, c9545a);
            m37172A(m37160k2, 0);
            m37161j.mo34933A(m37158m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static C1392h m37155p(C1392h c1392h, SparseArray<C1392h> sparseArray, int i) {
        if (c1392h == null) {
            C1392h c1392h2 = new C1392h();
            sparseArray.put(i, c1392h2);
            return c1392h2;
        }
        return c1392h;
    }

    /* renamed from: q */
    private static Object m37154q(AbstractC1399u abstractC1399u, Fragment fragment, boolean z) {
        Object m37649I;
        if (fragment == null) {
            return null;
        }
        if (z) {
            m37649I = fragment.m37605Y();
        } else {
            m37649I = fragment.m37649I();
        }
        return abstractC1399u.mo34926g(m37649I);
    }

    /* renamed from: r */
    private static Object m37153r(AbstractC1399u abstractC1399u, Fragment fragment, boolean z) {
        Object m37642L;
        if (fragment == null) {
            return null;
        }
        if (z) {
            m37642L = fragment.m37601a0();
        } else {
            m37642L = fragment.m37642L();
        }
        return abstractC1399u.mo34926g(m37642L);
    }

    /* renamed from: s */
    static View m37152s(C9545a<String, View> c9545a, C1392h c1392h, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C1331a c1331a = c1392h.f4161c;
        if (obj == null || c9545a == null || (arrayList = c1331a.f4109m) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = c1331a.f4109m.get(0);
        } else {
            str = c1331a.f4110n.get(0);
        }
        return c9545a.get(str);
    }

    /* renamed from: t */
    private static Object m37151t(AbstractC1399u abstractC1399u, Fragment fragment, Fragment fragment2, boolean z) {
        Object m37599b0;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            m37599b0 = fragment2.m37597c0();
        } else {
            m37599b0 = fragment.m37599b0();
        }
        return abstractC1399u.mo34932B(abstractC1399u.mo34926g(m37599b0));
    }

    /* renamed from: u */
    private static Object m37150u(AbstractC1399u abstractC1399u, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.m37668B();
        } else {
            z2 = fragment.m37670A();
        }
        if (z2) {
            return abstractC1399u.mo34924n(obj2, obj, obj3);
        }
        return abstractC1399u.mo34925m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m37149v(AbstractC1399u abstractC1399u, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3806H && fragment.f3819V && fragment.f3830i0) {
            fragment.m37621S1(true);
            abstractC1399u.mo34921r(obj, fragment.m37584h0(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(fragment.f3825c0, new RunnableC1386b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC1399u m37148w() {
        try {
            return (AbstractC1399u) C2014e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m37147x(C9545a<String, String> c9545a, C9545a<String, View> c9545a2) {
        for (int size = c9545a.size() - 1; size >= 0; size--) {
            if (!c9545a2.containsKey(c9545a.m10610q(size))) {
                c9545a.m10612o(size);
            }
        }
    }

    /* renamed from: y */
    private static void m37146y(AbstractC1399u abstractC1399u, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(viewGroup, new RunnableC1388d(obj, abstractC1399u, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m37145z(AbstractC1399u abstractC1399u, Object obj, Object obj2, C9545a<String, View> c9545a, boolean z, C1331a c1331a) {
        String str;
        ArrayList<String> arrayList = c1331a.f4109m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = c1331a.f4110n.get(0);
        } else {
            str = c1331a.f4109m.get(0);
        }
        View view = c9545a.get(str);
        abstractC1399u.mo34918v(obj, view);
        if (obj2 != null) {
            abstractC1399u.mo34918v(obj2, view);
        }
    }
}
