package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p020os.C1008b;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import androidx.core.view.C1156e0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import androidx.fragment.app.AbstractC1406y;
import androidx.fragment.app.C1358e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p301q.C9545a;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
class C1333b extends AbstractC1406y {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1334a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3985a;

        static {
            int[] iArr = new int[AbstractC1406y.C1411e.EnumC1414c.values().length];
            f3985a = iArr;
            try {
                iArr[AbstractC1406y.C1411e.EnumC1414c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3985a[AbstractC1406y.C1411e.EnumC1414c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3985a[AbstractC1406y.C1411e.EnumC1414c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3985a[AbstractC1406y.C1411e.EnumC1414c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b */
    /* loaded from: classes.dex */
    class RunnableC1335b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ List f3986w;

        /* renamed from: x */
        final /* synthetic */ AbstractC1406y.C1411e f3987x;

        RunnableC1335b(List list, AbstractC1406y.C1411e c1411e) {
            this.f3986w = list;
            this.f3987x = c1411e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3986w.contains(this.f3987x)) {
                this.f3986w.remove(this.f3987x);
                C1333b.this.m37361s(this.f3987x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$c */
    /* loaded from: classes.dex */
    public class C1336c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3989a;

        /* renamed from: b */
        final /* synthetic */ View f3990b;

        /* renamed from: c */
        final /* synthetic */ boolean f3991c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1406y.C1411e f3992d;

        /* renamed from: e */
        final /* synthetic */ C1345k f3993e;

        C1336c(C1333b c1333b, ViewGroup viewGroup, View view, boolean z, AbstractC1406y.C1411e c1411e, C1345k c1345k) {
            this.f3989a = viewGroup;
            this.f3990b = view;
            this.f3991c = z;
            this.f3992d = c1411e;
            this.f3993e = c1345k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3989a.endViewTransition(this.f3990b);
            if (this.f3991c) {
                this.f3992d.m37098e().applyState(this.f3990b);
            }
            this.f3993e.m37354a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$d */
    /* loaded from: classes.dex */
    public class C1337d implements C1008b.InterfaceC1010b {

        /* renamed from: a */
        final /* synthetic */ Animator f3994a;

        C1337d(C1333b c1333b, Animator animator) {
            this.f3994a = animator;
        }

        @Override // androidx.core.p020os.C1008b.InterfaceC1010b
        /* renamed from: a */
        public void mo37090a() {
            this.f3994a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$e  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC1338e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3995a;

        /* renamed from: b */
        final /* synthetic */ View f3996b;

        /* renamed from: c */
        final /* synthetic */ C1345k f3997c;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.b$e$a */
        /* loaded from: classes.dex */
        class RunnableC1339a implements Runnable {
            RunnableC1339a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC1338e animationanimation_animationlistenerc1338e = animationAnimation$AnimationListenerC1338e.this;
                animationanimation_animationlistenerc1338e.f3995a.endViewTransition(animationanimation_animationlistenerc1338e.f3996b);
                animationAnimation$AnimationListenerC1338e.this.f3997c.m37354a();
            }
        }

        animationAnimation$AnimationListenerC1338e(C1333b c1333b, ViewGroup viewGroup, View view, C1345k c1345k) {
            this.f3995a = viewGroup;
            this.f3996b = view;
            this.f3997c = c1345k;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3995a.post(new RunnableC1339a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$f */
    /* loaded from: classes.dex */
    public class C1340f implements C1008b.InterfaceC1010b {

        /* renamed from: a */
        final /* synthetic */ View f3999a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4000b;

        /* renamed from: c */
        final /* synthetic */ C1345k f4001c;

        C1340f(C1333b c1333b, View view, ViewGroup viewGroup, C1345k c1345k) {
            this.f3999a = view;
            this.f4000b = viewGroup;
            this.f4001c = c1345k;
        }

        @Override // androidx.core.p020os.C1008b.InterfaceC1010b
        /* renamed from: a */
        public void mo37090a() {
            this.f3999a.clearAnimation();
            this.f4000b.endViewTransition(this.f3999a);
            this.f4001c.m37354a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$g */
    /* loaded from: classes.dex */
    public class RunnableC1341g implements Runnable {

        /* renamed from: w */
        final /* synthetic */ AbstractC1406y.C1411e f4002w;

        /* renamed from: x */
        final /* synthetic */ AbstractC1406y.C1411e f4003x;

        /* renamed from: y */
        final /* synthetic */ boolean f4004y;

        /* renamed from: z */
        final /* synthetic */ C9545a f4005z;

        RunnableC1341g(C1333b c1333b, AbstractC1406y.C1411e c1411e, AbstractC1406y.C1411e c1411e2, boolean z, C9545a c9545a) {
            this.f4002w = c1411e;
            this.f4003x = c1411e2;
            this.f4004y = z;
            this.f4005z = c9545a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1384s.m37165f(this.f4002w.m37097f(), this.f4003x.m37097f(), this.f4004y, this.f4005z, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$h */
    /* loaded from: classes.dex */
    public class RunnableC1342h implements Runnable {

        /* renamed from: w */
        final /* synthetic */ AbstractC1399u f4006w;

        /* renamed from: x */
        final /* synthetic */ View f4007x;

        /* renamed from: y */
        final /* synthetic */ Rect f4008y;

        RunnableC1342h(C1333b c1333b, AbstractC1399u abstractC1399u, View view, Rect rect) {
            this.f4006w = abstractC1399u;
            this.f4007x = view;
            this.f4008y = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4006w.m37136k(this.f4007x, this.f4008y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$i */
    /* loaded from: classes.dex */
    public class RunnableC1343i implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4009w;

        RunnableC1343i(C1333b c1333b, ArrayList arrayList) {
            this.f4009w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1384s.m37172A(this.f4009w, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$j */
    /* loaded from: classes.dex */
    public class RunnableC1344j implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1347m f4010w;

        RunnableC1344j(C1333b c1333b, C1347m c1347m) {
            this.f4010w = c1347m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4010w.m37354a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$k */
    /* loaded from: classes.dex */
    public static class C1345k extends C1346l {

        /* renamed from: c */
        private boolean f4011c;

        /* renamed from: d */
        private boolean f4012d;

        /* renamed from: e */
        private C1358e.C1363d f4013e;

        C1345k(AbstractC1406y.C1411e c1411e, C1008b c1008b, boolean z) {
            super(c1411e, c1008b);
            this.f4012d = false;
            this.f4011c = z;
        }

        /* renamed from: e */
        C1358e.C1363d m37355e(Context context) {
            if (this.f4012d) {
                return this.f4013e;
            }
            C1358e.C1363d m37308c = C1358e.m37308c(context, m37353b().m37097f(), m37353b().m37098e() == AbstractC1406y.C1411e.EnumC1414c.VISIBLE, this.f4011c);
            this.f4013e = m37308c;
            this.f4012d = true;
            return m37308c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$l */
    /* loaded from: classes.dex */
    public static class C1346l {

        /* renamed from: a */
        private final AbstractC1406y.C1411e f4014a;

        /* renamed from: b */
        private final C1008b f4015b;

        C1346l(AbstractC1406y.C1411e c1411e, C1008b c1008b) {
            this.f4014a = c1411e;
            this.f4015b = c1008b;
        }

        /* renamed from: a */
        void m37354a() {
            this.f4014a.m37099d(this.f4015b);
        }

        /* renamed from: b */
        AbstractC1406y.C1411e m37353b() {
            return this.f4014a;
        }

        /* renamed from: c */
        C1008b m37352c() {
            return this.f4015b;
        }

        /* renamed from: d */
        boolean m37351d() {
            AbstractC1406y.C1411e.EnumC1414c enumC1414c;
            AbstractC1406y.C1411e.EnumC1414c from = AbstractC1406y.C1411e.EnumC1414c.from(this.f4014a.m37097f().f3826d0);
            AbstractC1406y.C1411e.EnumC1414c m37098e = this.f4014a.m37098e();
            return from == m37098e || !(from == (enumC1414c = AbstractC1406y.C1411e.EnumC1414c.VISIBLE) || m37098e == enumC1414c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$m */
    /* loaded from: classes.dex */
    public static class C1347m extends C1346l {

        /* renamed from: c */
        private final Object f4016c;

        /* renamed from: d */
        private final boolean f4017d;

        /* renamed from: e */
        private final Object f4018e;

        C1347m(AbstractC1406y.C1411e c1411e, C1008b c1008b, boolean z, boolean z2) {
            super(c1411e, c1008b);
            Object m37642L;
            Object m37649I;
            boolean m37670A;
            if (c1411e.m37098e() == AbstractC1406y.C1411e.EnumC1414c.VISIBLE) {
                if (z) {
                    m37649I = c1411e.m37097f().m37605Y();
                } else {
                    m37649I = c1411e.m37097f().m37649I();
                }
                this.f4016c = m37649I;
                if (z) {
                    m37670A = c1411e.m37097f().m37668B();
                } else {
                    m37670A = c1411e.m37097f().m37670A();
                }
                this.f4017d = m37670A;
            } else {
                if (z) {
                    m37642L = c1411e.m37097f().m37601a0();
                } else {
                    m37642L = c1411e.m37097f().m37642L();
                }
                this.f4016c = m37642L;
                this.f4017d = true;
            }
            if (!z2) {
                this.f4018e = null;
            } else if (z) {
                this.f4018e = c1411e.m37097f().m37597c0();
            } else {
                this.f4018e = c1411e.m37097f().m37599b0();
            }
        }

        /* renamed from: f */
        private AbstractC1399u m37349f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC1399u abstractC1399u = C1384s.f4123b;
            if (abstractC1399u == null || !abstractC1399u.mo34927e(obj)) {
                AbstractC1399u abstractC1399u2 = C1384s.f4124c;
                if (abstractC1399u2 == null || !abstractC1399u2.mo34927e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + m37353b().m37097f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return abstractC1399u2;
            }
            return abstractC1399u;
        }

        /* renamed from: e */
        AbstractC1399u m37350e() {
            AbstractC1399u m37349f = m37349f(this.f4016c);
            AbstractC1399u m37349f2 = m37349f(this.f4018e);
            if (m37349f == null || m37349f2 == null || m37349f == m37349f2) {
                return m37349f != null ? m37349f : m37349f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m37353b().m37097f() + " returned Transition " + this.f4016c + " which uses a different Transition  type than its shared element transition " + this.f4018e);
        }

        /* renamed from: g */
        public Object m37348g() {
            return this.f4018e;
        }

        /* renamed from: h */
        Object m37347h() {
            return this.f4016c;
        }

        /* renamed from: i */
        public boolean m37346i() {
            return this.f4018e != null;
        }

        /* renamed from: j */
        boolean m37345j() {
            return this.f4017d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1333b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m37357w(List<C1345k> list, List<AbstractC1406y.C1411e> list2, boolean z, Map<AbstractC1406y.C1411e, Boolean> map) {
        ViewGroup m37108m = m37108m();
        Context context = m37108m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (C1345k c1345k : list) {
            if (c1345k.m37351d()) {
                c1345k.m37354a();
            } else {
                C1358e.C1363d m37355e = c1345k.m37355e(context);
                if (m37355e == null) {
                    c1345k.m37354a();
                } else {
                    Animator animator = m37355e.f4061b;
                    if (animator == null) {
                        arrayList.add(c1345k);
                    } else {
                        AbstractC1406y.C1411e m37353b = c1345k.m37353b();
                        Fragment m37097f = m37353b.m37097f();
                        if (Boolean.TRUE.equals(map.get(m37353b))) {
                            if (FragmentManager.m37520H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m37097f + " as this Fragment was involved in a Transition.");
                            }
                            c1345k.m37354a();
                        } else {
                            boolean z3 = m37353b.m37098e() == AbstractC1406y.C1411e.EnumC1414c.GONE;
                            if (z3) {
                                list2.remove(m37353b);
                            }
                            View view = m37097f.f3826d0;
                            m37108m.startViewTransition(view);
                            animator.addListener(new C1336c(this, m37108m, view, z3, m37353b, c1345k));
                            animator.setTarget(view);
                            animator.start();
                            c1345k.m37352c().m38757d(new C1337d(this, animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1345k c1345k2 = (C1345k) it.next();
            AbstractC1406y.C1411e m37353b2 = c1345k2.m37353b();
            Fragment m37097f2 = m37353b2.m37097f();
            if (z) {
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m37097f2 + " as Animations cannot run alongside Transitions.");
                }
                c1345k2.m37354a();
            } else if (z2) {
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m37097f2 + " as Animations cannot run alongside Animators.");
                }
                c1345k2.m37354a();
            } else {
                View view2 = m37097f2.f3826d0;
                Animation animation = (Animation) C1076h.m38619f(((C1358e.C1363d) C1076h.m38619f(c1345k2.m37355e(context))).f4060a);
                if (m37353b2.m37098e() != AbstractC1406y.C1411e.EnumC1414c.REMOVED) {
                    view2.startAnimation(animation);
                    c1345k2.m37354a();
                } else {
                    m37108m.startViewTransition(view2);
                    C1358e.RunnableC1364e runnableC1364e = new C1358e.RunnableC1364e(animation, m37108m, view2);
                    runnableC1364e.setAnimationListener(new animationAnimation$AnimationListenerC1338e(this, m37108m, view2, c1345k2));
                    view2.startAnimation(runnableC1364e);
                }
                c1345k2.m37352c().m38757d(new C1340f(this, view2, m37108m, c1345k2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private Map<AbstractC1406y.C1411e, Boolean> m37356x(List<C1347m> list, List<AbstractC1406y.C1411e> list2, boolean z, AbstractC1406y.C1411e c1411e, AbstractC1406y.C1411e c1411e2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC1406y.C1411e c1411e3;
        AbstractC1406y.C1411e c1411e4;
        View view2;
        Object mo34924n;
        C9545a c9545a;
        ArrayList<View> arrayList3;
        AbstractC1406y.C1411e c1411e5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        AbstractC1399u abstractC1399u;
        AbstractC1406y.C1411e c1411e6;
        View view4;
        boolean z2 = z;
        AbstractC1406y.C1411e c1411e7 = c1411e;
        AbstractC1406y.C1411e c1411e8 = c1411e2;
        HashMap hashMap = new HashMap();
        AbstractC1399u abstractC1399u2 = null;
        for (C1347m c1347m : list) {
            if (!c1347m.m37351d()) {
                AbstractC1399u m37350e = c1347m.m37350e();
                if (abstractC1399u2 == null) {
                    abstractC1399u2 = m37350e;
                } else if (m37350e != null && abstractC1399u2 != m37350e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c1347m.m37353b().m37097f() + " returned Transition " + c1347m.m37347h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC1399u2 == null) {
            for (C1347m c1347m2 : list) {
                hashMap.put(c1347m2.m37353b(), Boolean.FALSE);
                c1347m2.m37354a();
            }
            return hashMap;
        }
        View view5 = new View(m37108m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C9545a c9545a2 = new C9545a();
        Object obj3 = null;
        View view6 = null;
        boolean z3 = false;
        for (C1347m c1347m3 : list) {
            if (!c1347m3.m37346i() || c1411e7 == null || c1411e8 == null) {
                c9545a = c9545a2;
                arrayList3 = arrayList6;
                c1411e5 = c1411e7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                abstractC1399u = abstractC1399u2;
                c1411e6 = c1411e8;
                view6 = view6;
            } else {
                Object mo34932B = abstractC1399u2.mo34932B(abstractC1399u2.mo34926g(c1347m3.m37348g()));
                ArrayList<String> m37594d0 = c1411e2.m37097f().m37594d0();
                ArrayList<String> m37594d02 = c1411e.m37097f().m37594d0();
                ArrayList<String> m37592e0 = c1411e.m37097f().m37592e0();
                View view7 = view6;
                int i = 0;
                while (i < m37592e0.size()) {
                    int indexOf = m37594d0.indexOf(m37592e0.get(i));
                    ArrayList<String> arrayList7 = m37592e0;
                    if (indexOf != -1) {
                        m37594d0.set(indexOf, m37594d02.get(i));
                    }
                    i++;
                    m37592e0 = arrayList7;
                }
                ArrayList<String> m37592e02 = c1411e2.m37097f().m37592e0();
                if (!z2) {
                    c1411e.m37097f().m37640M();
                    c1411e2.m37097f().m37647J();
                } else {
                    c1411e.m37097f().m37647J();
                    c1411e2.m37097f().m37640M();
                }
                int i2 = 0;
                for (int size = m37594d0.size(); i2 < size; size = size) {
                    c9545a2.put(m37594d0.get(i2), m37592e02.get(i2));
                    i2++;
                }
                C9545a<String, View> c9545a3 = new C9545a<>();
                m37359u(c9545a3, c1411e.m37097f().f3826d0);
                c9545a3.m10668u(m37594d0);
                c9545a2.m10668u(c9545a3.keySet());
                C9545a<String, View> c9545a4 = new C9545a<>();
                m37359u(c9545a4, c1411e2.m37097f().f3826d0);
                c9545a4.m10668u(m37592e02);
                c9545a4.m10668u(c9545a2.values());
                C1384s.m37147x(c9545a2, c9545a4);
                m37358v(c9545a3, c9545a2.keySet());
                m37358v(c9545a4, c9545a2.values());
                if (c9545a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c9545a = c9545a2;
                    arrayList3 = arrayList6;
                    c1411e5 = c1411e7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC1399u = abstractC1399u2;
                    view6 = view7;
                    obj3 = null;
                    c1411e6 = c1411e8;
                } else {
                    C1384s.m37165f(c1411e2.m37097f(), c1411e.m37097f(), z2, c9545a3, true);
                    c9545a = c9545a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(m37108m(), new RunnableC1341g(this, c1411e2, c1411e, z, c9545a4));
                    arrayList5.addAll(c9545a3.values());
                    if (m37594d0.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = c9545a3.get(m37594d0.get(0));
                        abstractC1399u2.mo34918v(mo34932B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c9545a4.values());
                    if (!m37592e02.isEmpty() && (view4 = c9545a4.get(m37592e02.get(0))) != null) {
                        ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(m37108m(), new RunnableC1342h(this, abstractC1399u2, view4, rect2));
                        z3 = true;
                    }
                    abstractC1399u2.mo34917z(mo34932B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC1399u = abstractC1399u2;
                    abstractC1399u2.mo34920t(mo34932B, null, null, null, null, mo34932B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    c1411e5 = c1411e;
                    hashMap.put(c1411e5, bool);
                    c1411e6 = c1411e2;
                    hashMap.put(c1411e6, bool);
                    obj3 = mo34932B;
                }
            }
            c1411e7 = c1411e5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            c1411e8 = c1411e6;
            c9545a2 = c9545a;
            z2 = z;
            arrayList6 = arrayList3;
            abstractC1399u2 = abstractC1399u;
        }
        View view9 = view6;
        C9545a c9545a5 = c9545a2;
        Collection<?> collection = arrayList6;
        AbstractC1406y.C1411e c1411e9 = c1411e7;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        AbstractC1399u abstractC1399u3 = abstractC1399u2;
        boolean z4 = false;
        AbstractC1406y.C1411e c1411e10 = c1411e8;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (C1347m c1347m4 : list) {
            if (c1347m4.m37351d()) {
                hashMap.put(c1347m4.m37353b(), Boolean.FALSE);
                c1347m4.m37354a();
            } else {
                Object mo34926g = abstractC1399u3.mo34926g(c1347m4.m37347h());
                AbstractC1406y.C1411e m37353b = c1347m4.m37353b();
                boolean z5 = (obj3 == null || !(m37353b == c1411e9 || m37353b == c1411e10)) ? z4 : true;
                if (mo34926g == null) {
                    if (!z5) {
                        hashMap.put(m37353b, Boolean.FALSE);
                        c1347m4.m37354a();
                    }
                    arrayList2 = collection;
                    arrayList = collection2;
                    view = view10;
                    mo34924n = obj4;
                    c1411e3 = c1411e10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    m37360t(arrayList10, m37353b.m37097f().f3826d0);
                    if (z5) {
                        if (m37353b == c1411e9) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        abstractC1399u3.mo34930a(mo34926g, view10);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view10;
                        c1411e4 = m37353b;
                        obj2 = obj5;
                        c1411e3 = c1411e10;
                        obj = obj6;
                    } else {
                        abstractC1399u3.mo34929b(mo34926g, arrayList10);
                        view = view10;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        c1411e3 = c1411e10;
                        abstractC1399u3.mo34920t(mo34926g, mo34926g, arrayList10, null, null, null, null);
                        if (m37353b.m37098e() == AbstractC1406y.C1411e.EnumC1414c.GONE) {
                            c1411e4 = m37353b;
                            list2.remove(c1411e4);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(c1411e4.m37097f().f3826d0);
                            abstractC1399u3.mo34921r(mo34926g, c1411e4.m37097f().f3826d0, arrayList11);
                            ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(m37108m(), new RunnableC1343i(this, arrayList10));
                        } else {
                            c1411e4 = m37353b;
                        }
                    }
                    if (c1411e4.m37098e() == AbstractC1406y.C1411e.EnumC1414c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z3) {
                            abstractC1399u3.mo34919u(mo34926g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        abstractC1399u3.mo34918v(mo34926g, view2);
                    }
                    hashMap.put(c1411e4, Boolean.TRUE);
                    if (c1347m4.m37345j()) {
                        obj5 = abstractC1399u3.mo34924n(obj2, mo34926g, null);
                        mo34924n = obj;
                    } else {
                        mo34924n = abstractC1399u3.mo34924n(obj, mo34926g, null);
                        obj5 = obj2;
                    }
                }
                c1411e10 = c1411e3;
                obj4 = mo34924n;
                view9 = view2;
                view10 = view;
                collection2 = arrayList;
                collection = arrayList2;
                z4 = false;
            }
        }
        ArrayList<View> arrayList12 = collection;
        ArrayList<View> arrayList13 = collection2;
        AbstractC1406y.C1411e c1411e11 = c1411e10;
        Object mo34925m = abstractC1399u3.mo34925m(obj5, obj4, obj3);
        for (C1347m c1347m5 : list) {
            if (!c1347m5.m37351d()) {
                Object m37347h = c1347m5.m37347h();
                AbstractC1406y.C1411e m37353b2 = c1347m5.m37353b();
                boolean z6 = obj3 != null && (m37353b2 == c1411e9 || m37353b2 == c1411e11);
                if (m37347h != null || z6) {
                    if (!C1112b0.m38446W(m37108m())) {
                        if (FragmentManager.m37520H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m37108m() + " has not been laid out. Completing operation " + m37353b2);
                        }
                        c1347m5.m37354a();
                    } else {
                        abstractC1399u3.mo37132w(c1347m5.m37353b().m37097f(), mo34925m, c1347m5.m37352c(), new RunnableC1344j(this, c1347m5));
                    }
                }
            }
        }
        if (C1112b0.m38446W(m37108m())) {
            C1384s.m37172A(arrayList9, 4);
            ArrayList<String> m37134o = abstractC1399u3.m37134o(arrayList12);
            abstractC1399u3.mo34928c(m37108m(), mo34925m);
            abstractC1399u3.m37130y(m37108m(), arrayList13, arrayList12, m37134o, c9545a5);
            C1384s.m37172A(arrayList9, 0);
            abstractC1399u3.mo34933A(obj3, arrayList13, arrayList12);
            return hashMap;
        }
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC1406y
    /* renamed from: f */
    void mo37115f(List<AbstractC1406y.C1411e> list, boolean z) {
        AbstractC1406y.C1411e c1411e = null;
        AbstractC1406y.C1411e c1411e2 = null;
        for (AbstractC1406y.C1411e c1411e3 : list) {
            AbstractC1406y.C1411e.EnumC1414c from = AbstractC1406y.C1411e.EnumC1414c.from(c1411e3.m37097f().f3826d0);
            int i = C1334a.f3985a[c1411e3.m37098e().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4 && from != AbstractC1406y.C1411e.EnumC1414c.VISIBLE) {
                    c1411e2 = c1411e3;
                }
            } else if (from == AbstractC1406y.C1411e.EnumC1414c.VISIBLE && c1411e == null) {
                c1411e = c1411e3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC1406y.C1411e> arrayList3 = new ArrayList(list);
        for (AbstractC1406y.C1411e c1411e4 : list) {
            C1008b c1008b = new C1008b();
            c1411e4.m37093j(c1008b);
            arrayList.add(new C1345k(c1411e4, c1008b, z));
            C1008b c1008b2 = new C1008b();
            c1411e4.m37093j(c1008b2);
            boolean z2 = false;
            if (z) {
                if (c1411e4 != c1411e) {
                    arrayList2.add(new C1347m(c1411e4, c1008b2, z, z2));
                    c1411e4.m37102a(new RunnableC1335b(arrayList3, c1411e4));
                }
                z2 = true;
                arrayList2.add(new C1347m(c1411e4, c1008b2, z, z2));
                c1411e4.m37102a(new RunnableC1335b(arrayList3, c1411e4));
            } else {
                if (c1411e4 != c1411e2) {
                    arrayList2.add(new C1347m(c1411e4, c1008b2, z, z2));
                    c1411e4.m37102a(new RunnableC1335b(arrayList3, c1411e4));
                }
                z2 = true;
                arrayList2.add(new C1347m(c1411e4, c1008b2, z, z2));
                c1411e4.m37102a(new RunnableC1335b(arrayList3, c1411e4));
            }
        }
        Map<AbstractC1406y.C1411e, Boolean> m37356x = m37356x(arrayList2, arrayList3, z, c1411e, c1411e2);
        m37357w(arrayList, arrayList3, m37356x.containsValue(Boolean.TRUE), m37356x);
        for (AbstractC1406y.C1411e c1411e5 : arrayList3) {
            m37361s(c1411e5);
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m37361s(AbstractC1406y.C1411e c1411e) {
        c1411e.m37098e().applyState(c1411e.m37097f().f3826d0);
    }

    /* renamed from: t */
    void m37360t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C1156e0.m38202a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m37360t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    void m37359u(Map<String, View> map, View view) {
        String m38458N = C1112b0.m38458N(view);
        if (m38458N != null) {
            map.put(m38458N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m37359u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m37358v(C9545a<String, View> c9545a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c9545a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C1112b0.m38458N(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
