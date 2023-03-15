package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p020os.C1008b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
class C1393t extends AbstractC1399u {

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.t$a */
    /* loaded from: classes.dex */
    class C1394a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4165a;

        C1394a(C1393t c1393t, Rect rect) {
            this.f4165a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4165a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.t$b */
    /* loaded from: classes.dex */
    class C1395b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4166a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4167b;

        C1395b(C1393t c1393t, View view, ArrayList arrayList) {
            this.f4166a = view;
            this.f4167b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4166a.setVisibility(8);
            int size = this.f4167b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4167b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.t$c */
    /* loaded from: classes.dex */
    class C1396c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4168a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4169b;

        /* renamed from: c */
        final /* synthetic */ Object f4170c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4171d;

        /* renamed from: e */
        final /* synthetic */ Object f4172e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4173f;

        C1396c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4168a = obj;
            this.f4169b = arrayList;
            this.f4170c = obj2;
            this.f4171d = arrayList2;
            this.f4172e = obj3;
            this.f4173f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4168a;
            if (obj != null) {
                C1393t.this.mo34922q(obj, this.f4169b, null);
            }
            Object obj2 = this.f4170c;
            if (obj2 != null) {
                C1393t.this.mo34922q(obj2, this.f4171d, null);
            }
            Object obj3 = this.f4172e;
            if (obj3 != null) {
                C1393t.this.mo34922q(obj3, this.f4173f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.t$d */
    /* loaded from: classes.dex */
    class C1397d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4175a;

        C1397d(C1393t c1393t, Runnable runnable) {
            this.f4175a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4175a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* renamed from: androidx.fragment.app.t$e */
    /* loaded from: classes.dex */
    class C1398e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4176a;

        C1398e(C1393t c1393t, Rect rect) {
            this.f4176a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4176a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4176a;
        }
    }

    /* renamed from: C */
    private static boolean m37142C(Transition transition) {
        return (AbstractC1399u.m37135l(transition.getTargetIds()) && AbstractC1399u.m37135l(transition.getTargetNames()) && AbstractC1399u.m37135l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: A */
    public void mo34933A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo34922q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: B */
    public Object mo34932B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: a */
    public void mo34930a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: b */
    public void mo34929b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo34929b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m37142C(transition) || !AbstractC1399u.m37135l(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: c */
    public void mo34928c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: e */
    public boolean mo34927e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: g */
    public Object mo34926g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: m */
    public Object mo34925m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: n */
    public Object mo34924n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: p */
    public void mo34923p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: q */
    public void mo34922q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo34922q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m37142C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: r */
    public void mo34921r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1395b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: t */
    public void mo34920t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1396c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: u */
    public void mo34919u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1398e(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: v */
    public void mo34918v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m37136k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1394a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: w */
    public void mo37132w(Fragment fragment, Object obj, C1008b c1008b, Runnable runnable) {
        ((Transition) obj).addListener(new C1397d(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC1399u
    /* renamed from: z */
    public void mo34917z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1399u.m37141d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo34929b(transitionSet, arrayList);
    }
}
