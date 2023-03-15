package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C1112b0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C1590g extends AbstractC1650x {

    /* renamed from: s */
    private static TimeInterpolator f4797s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC1531c0> f4798h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC1531c0> f4799i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1600j> f4800j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1599i> f4801k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC1531c0>> f4802l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1600j>> f4803m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1599i>> f4804n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC1531c0> f4805o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC1531c0> f4806p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC1531c0> f4807q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC1531c0> f4808r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes.dex */
    class RunnableC1591a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4809w;

        RunnableC1591a(ArrayList arrayList) {
            this.f4809w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4809w.iterator();
            while (it.hasNext()) {
                C1600j c1600j = (C1600j) it.next();
                C1590g.this.m36067U(c1600j.f4843a, c1600j.f4844b, c1600j.f4845c, c1600j.f4846d, c1600j.f4847e);
            }
            this.f4809w.clear();
            C1590g.this.f4803m.remove(this.f4809w);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes.dex */
    class RunnableC1592b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4811w;

        RunnableC1592b(ArrayList arrayList) {
            this.f4811w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4811w.iterator();
            while (it.hasNext()) {
                C1590g.this.m36068T((C1599i) it.next());
            }
            this.f4811w.clear();
            C1590g.this.f4804n.remove(this.f4811w);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$c */
    /* loaded from: classes.dex */
    class RunnableC1593c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ ArrayList f4813w;

        RunnableC1593c(ArrayList arrayList) {
            this.f4813w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4813w.iterator();
            while (it.hasNext()) {
                C1590g.this.m36069S((RecyclerView.AbstractC1531c0) it.next());
            }
            this.f4813w.clear();
            C1590g.this.f4802l.remove(this.f4813w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$d */
    /* loaded from: classes.dex */
    public class C1594d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1531c0 f4815a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4816b;

        /* renamed from: c */
        final /* synthetic */ View f4817c;

        C1594d(RecyclerView.AbstractC1531c0 abstractC1531c0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4815a = abstractC1531c0;
            this.f4816b = viewPropertyAnimator;
            this.f4817c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4816b.setListener(null);
            this.f4817c.setAlpha(1.0f);
            C1590g.this.m35841H(this.f4815a);
            C1590g.this.f4807q.remove(this.f4815a);
            C1590g.this.m36064X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1590g.this.m35840I(this.f4815a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$e */
    /* loaded from: classes.dex */
    public class C1595e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1531c0 f4819a;

        /* renamed from: b */
        final /* synthetic */ View f4820b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4821c;

        C1595e(RecyclerView.AbstractC1531c0 abstractC1531c0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4819a = abstractC1531c0;
            this.f4820b = view;
            this.f4821c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4820b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4821c.setListener(null);
            C1590g.this.m35847B(this.f4819a);
            C1590g.this.f4805o.remove(this.f4819a);
            C1590g.this.m36064X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1590g.this.m35846C(this.f4819a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$f */
    /* loaded from: classes.dex */
    public class C1596f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1531c0 f4823a;

        /* renamed from: b */
        final /* synthetic */ int f4824b;

        /* renamed from: c */
        final /* synthetic */ View f4825c;

        /* renamed from: d */
        final /* synthetic */ int f4826d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4827e;

        C1596f(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4823a = abstractC1531c0;
            this.f4824b = i;
            this.f4825c = view;
            this.f4826d = i2;
            this.f4827e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4824b != 0) {
                this.f4825c.setTranslationX(0.0f);
            }
            if (this.f4826d != 0) {
                this.f4825c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4827e.setListener(null);
            C1590g.this.m35843F(this.f4823a);
            C1590g.this.f4806p.remove(this.f4823a);
            C1590g.this.m36064X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1590g.this.m35842G(this.f4823a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$g */
    /* loaded from: classes.dex */
    public class C1597g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1599i f4829a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4830b;

        /* renamed from: c */
        final /* synthetic */ View f4831c;

        C1597g(C1599i c1599i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4829a = c1599i;
            this.f4830b = viewPropertyAnimator;
            this.f4831c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4830b.setListener(null);
            this.f4831c.setAlpha(1.0f);
            this.f4831c.setTranslationX(0.0f);
            this.f4831c.setTranslationY(0.0f);
            C1590g.this.m35845D(this.f4829a.f4837a, true);
            C1590g.this.f4808r.remove(this.f4829a.f4837a);
            C1590g.this.m36064X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1590g.this.m35844E(this.f4829a.f4837a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$h */
    /* loaded from: classes.dex */
    public class C1598h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1599i f4833a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4834b;

        /* renamed from: c */
        final /* synthetic */ View f4835c;

        C1598h(C1599i c1599i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4833a = c1599i;
            this.f4834b = viewPropertyAnimator;
            this.f4835c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4834b.setListener(null);
            this.f4835c.setAlpha(1.0f);
            this.f4835c.setTranslationX(0.0f);
            this.f4835c.setTranslationY(0.0f);
            C1590g.this.m35845D(this.f4833a.f4838b, false);
            C1590g.this.f4808r.remove(this.f4833a.f4838b);
            C1590g.this.m36064X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1590g.this.m35844E(this.f4833a.f4838b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$j */
    /* loaded from: classes.dex */
    public static class C1600j {

        /* renamed from: a */
        public RecyclerView.AbstractC1531c0 f4843a;

        /* renamed from: b */
        public int f4844b;

        /* renamed from: c */
        public int f4845c;

        /* renamed from: d */
        public int f4846d;

        /* renamed from: e */
        public int f4847e;

        C1600j(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, int i3, int i4) {
            this.f4843a = abstractC1531c0;
            this.f4844b = i;
            this.f4845c = i2;
            this.f4846d = i3;
            this.f4847e = i4;
        }
    }

    /* renamed from: V */
    private void m36066V(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        View view = abstractC1531c0.f4581a;
        ViewPropertyAnimator animate = view.animate();
        this.f4807q.add(abstractC1531c0);
        animate.setDuration(m36519o()).alpha(0.0f).setListener(new C1594d(abstractC1531c0, animate, view)).start();
    }

    /* renamed from: Y */
    private void m36063Y(List<C1599i> list, RecyclerView.AbstractC1531c0 abstractC1531c0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1599i c1599i = list.get(size);
            if (m36061a0(c1599i, abstractC1531c0) && c1599i.f4837a == null && c1599i.f4838b == null) {
                list.remove(c1599i);
            }
        }
    }

    /* renamed from: Z */
    private void m36062Z(C1599i c1599i) {
        RecyclerView.AbstractC1531c0 abstractC1531c0 = c1599i.f4837a;
        if (abstractC1531c0 != null) {
            m36061a0(c1599i, abstractC1531c0);
        }
        RecyclerView.AbstractC1531c0 abstractC1531c02 = c1599i.f4838b;
        if (abstractC1531c02 != null) {
            m36061a0(c1599i, abstractC1531c02);
        }
    }

    /* renamed from: a0 */
    private boolean m36061a0(C1599i c1599i, RecyclerView.AbstractC1531c0 abstractC1531c0) {
        boolean z = false;
        if (c1599i.f4838b == abstractC1531c0) {
            c1599i.f4838b = null;
        } else if (c1599i.f4837a != abstractC1531c0) {
            return false;
        } else {
            c1599i.f4837a = null;
            z = true;
        }
        abstractC1531c0.f4581a.setAlpha(1.0f);
        abstractC1531c0.f4581a.setTranslationX(0.0f);
        abstractC1531c0.f4581a.setTranslationY(0.0f);
        m35845D(abstractC1531c0, z);
        return true;
    }

    /* renamed from: b0 */
    private void m36060b0(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        if (f4797s == null) {
            f4797s = new ValueAnimator().getInterpolator();
        }
        abstractC1531c0.f4581a.animate().setInterpolator(f4797s);
        mo36058j(abstractC1531c0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1650x
    /* renamed from: A */
    public boolean mo35848A(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m36060b0(abstractC1531c0);
        this.f4798h.add(abstractC1531c0);
        return true;
    }

    /* renamed from: S */
    void m36069S(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        View view = abstractC1531c0.f4581a;
        ViewPropertyAnimator animate = view.animate();
        this.f4805o.add(abstractC1531c0);
        animate.alpha(1.0f).setDuration(m36522l()).setListener(new C1595e(abstractC1531c0, view, animate)).start();
    }

    /* renamed from: T */
    void m36068T(C1599i c1599i) {
        RecyclerView.AbstractC1531c0 abstractC1531c0 = c1599i.f4837a;
        View view = abstractC1531c0 == null ? null : abstractC1531c0.f4581a;
        RecyclerView.AbstractC1531c0 abstractC1531c02 = c1599i.f4838b;
        View view2 = abstractC1531c02 != null ? abstractC1531c02.f4581a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m36521m());
            this.f4808r.add(c1599i.f4837a);
            duration.translationX(c1599i.f4841e - c1599i.f4839c);
            duration.translationY(c1599i.f4842f - c1599i.f4840d);
            duration.alpha(0.0f).setListener(new C1597g(c1599i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4808r.add(c1599i.f4838b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m36521m()).alpha(1.0f).setListener(new C1598h(c1599i, animate, view2)).start();
        }
    }

    /* renamed from: U */
    void m36067U(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, int i3, int i4) {
        View view = abstractC1531c0.f4581a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4806p.add(abstractC1531c0);
        animate.setDuration(m36520n()).setListener(new C1596f(abstractC1531c0, i5, view, i6, animate)).start();
    }

    /* renamed from: W */
    void m36065W(List<RecyclerView.AbstractC1531c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4581a.animate().cancel();
        }
    }

    /* renamed from: X */
    void m36064X() {
        if (mo36056p()) {
            return;
        }
        m36523i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: g */
    public boolean mo36059g(RecyclerView.AbstractC1531c0 abstractC1531c0, List<Object> list) {
        return !list.isEmpty() || super.mo36059g(abstractC1531c0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: j */
    public void mo36058j(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        View view = abstractC1531c0.f4581a;
        view.animate().cancel();
        int size = this.f4800j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4800j.get(size).f4843a == abstractC1531c0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m35843F(abstractC1531c0);
                this.f4800j.remove(size);
            }
        }
        m36063Y(this.f4801k, abstractC1531c0);
        if (this.f4798h.remove(abstractC1531c0)) {
            view.setAlpha(1.0f);
            m35841H(abstractC1531c0);
        }
        if (this.f4799i.remove(abstractC1531c0)) {
            view.setAlpha(1.0f);
            m35847B(abstractC1531c0);
        }
        for (int size2 = this.f4804n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1599i> arrayList = this.f4804n.get(size2);
            m36063Y(arrayList, abstractC1531c0);
            if (arrayList.isEmpty()) {
                this.f4804n.remove(size2);
            }
        }
        for (int size3 = this.f4803m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1600j> arrayList2 = this.f4803m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4843a == abstractC1531c0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m35843F(abstractC1531c0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4803m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4802l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC1531c0> arrayList3 = this.f4802l.get(size5);
            if (arrayList3.remove(abstractC1531c0)) {
                view.setAlpha(1.0f);
                m35847B(abstractC1531c0);
                if (arrayList3.isEmpty()) {
                    this.f4802l.remove(size5);
                }
            }
        }
        this.f4807q.remove(abstractC1531c0);
        this.f4805o.remove(abstractC1531c0);
        this.f4808r.remove(abstractC1531c0);
        this.f4806p.remove(abstractC1531c0);
        m36064X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: k */
    public void mo36057k() {
        int size = this.f4800j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1600j c1600j = this.f4800j.get(size);
            View view = c1600j.f4843a.f4581a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m35843F(c1600j.f4843a);
            this.f4800j.remove(size);
        }
        for (int size2 = this.f4798h.size() - 1; size2 >= 0; size2--) {
            m35841H(this.f4798h.get(size2));
            this.f4798h.remove(size2);
        }
        int size3 = this.f4799i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1531c0 abstractC1531c0 = this.f4799i.get(size3);
            abstractC1531c0.f4581a.setAlpha(1.0f);
            m35847B(abstractC1531c0);
            this.f4799i.remove(size3);
        }
        for (int size4 = this.f4801k.size() - 1; size4 >= 0; size4--) {
            m36062Z(this.f4801k.get(size4));
        }
        this.f4801k.clear();
        if (mo36056p()) {
            for (int size5 = this.f4803m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1600j> arrayList = this.f4803m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1600j c1600j2 = arrayList.get(size6);
                    View view2 = c1600j2.f4843a.f4581a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m35843F(c1600j2.f4843a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4803m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4802l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC1531c0> arrayList2 = this.f4802l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1531c0 abstractC1531c02 = arrayList2.get(size8);
                    abstractC1531c02.f4581a.setAlpha(1.0f);
                    m35847B(abstractC1531c02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4802l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4804n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1599i> arrayList3 = this.f4804n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m36062Z(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4804n.remove(arrayList3);
                    }
                }
            }
            m36065W(this.f4807q);
            m36065W(this.f4806p);
            m36065W(this.f4805o);
            m36065W(this.f4808r);
            m36523i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: p */
    public boolean mo36056p() {
        return (this.f4799i.isEmpty() && this.f4801k.isEmpty() && this.f4800j.isEmpty() && this.f4798h.isEmpty() && this.f4806p.isEmpty() && this.f4807q.isEmpty() && this.f4805o.isEmpty() && this.f4808r.isEmpty() && this.f4803m.isEmpty() && this.f4802l.isEmpty() && this.f4804n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l
    /* renamed from: v */
    public void mo36055v() {
        boolean z = !this.f4798h.isEmpty();
        boolean z2 = !this.f4800j.isEmpty();
        boolean z3 = !this.f4801k.isEmpty();
        boolean z4 = !this.f4799i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC1531c0> it = this.f4798h.iterator();
            while (it.hasNext()) {
                m36066V(it.next());
            }
            this.f4798h.clear();
            if (z2) {
                ArrayList<C1600j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4800j);
                this.f4803m.add(arrayList);
                this.f4800j.clear();
                RunnableC1591a runnableC1591a = new RunnableC1591a(arrayList);
                if (z) {
                    C1112b0.m38419l0(arrayList.get(0).f4843a.f4581a, runnableC1591a, m36519o());
                } else {
                    runnableC1591a.run();
                }
            }
            if (z3) {
                ArrayList<C1599i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4801k);
                this.f4804n.add(arrayList2);
                this.f4801k.clear();
                RunnableC1592b runnableC1592b = new RunnableC1592b(arrayList2);
                if (z) {
                    C1112b0.m38419l0(arrayList2.get(0).f4837a.f4581a, runnableC1592b, m36519o());
                } else {
                    runnableC1592b.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC1531c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4799i);
                this.f4802l.add(arrayList3);
                this.f4799i.clear();
                RunnableC1593c runnableC1593c = new RunnableC1593c(arrayList3);
                if (!z && !z2 && !z3) {
                    runnableC1593c.run();
                } else {
                    C1112b0.m38419l0(arrayList3.get(0).f4581a, runnableC1593c, (z ? m36519o() : 0L) + Math.max(z2 ? m36520n() : 0L, z3 ? m36521m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1650x
    /* renamed from: x */
    public boolean mo35825x(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m36060b0(abstractC1531c0);
        abstractC1531c0.f4581a.setAlpha(0.0f);
        this.f4799i.add(abstractC1531c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1650x
    /* renamed from: y */
    public boolean mo35824y(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02, int i, int i2, int i3, int i4) {
        if (abstractC1531c0 == abstractC1531c02) {
            return mo35823z(abstractC1531c0, i, i2, i3, i4);
        }
        float translationX = abstractC1531c0.f4581a.getTranslationX();
        float translationY = abstractC1531c0.f4581a.getTranslationY();
        float alpha = abstractC1531c0.f4581a.getAlpha();
        m36060b0(abstractC1531c0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC1531c0.f4581a.setTranslationX(translationX);
        abstractC1531c0.f4581a.setTranslationY(translationY);
        abstractC1531c0.f4581a.setAlpha(alpha);
        if (abstractC1531c02 != null) {
            m36060b0(abstractC1531c02);
            abstractC1531c02.f4581a.setTranslationX(-i5);
            abstractC1531c02.f4581a.setTranslationY(-i6);
            abstractC1531c02.f4581a.setAlpha(0.0f);
        }
        this.f4801k.add(new C1599i(abstractC1531c0, abstractC1531c02, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1650x
    /* renamed from: z */
    public boolean mo35823z(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, int i3, int i4) {
        View view = abstractC1531c0.f4581a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1531c0.f4581a.getTranslationY());
        m36060b0(abstractC1531c0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m35843F(abstractC1531c0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f4800j.add(new C1600j(abstractC1531c0, translationX, translationY, i3, i4));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.g$i */
    /* loaded from: classes.dex */
    public static class C1599i {

        /* renamed from: a */
        public RecyclerView.AbstractC1531c0 f4837a;

        /* renamed from: b */
        public RecyclerView.AbstractC1531c0 f4838b;

        /* renamed from: c */
        public int f4839c;

        /* renamed from: d */
        public int f4840d;

        /* renamed from: e */
        public int f4841e;

        /* renamed from: f */
        public int f4842f;

        private C1599i(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02) {
            this.f4837a = abstractC1531c0;
            this.f4838b = abstractC1531c02;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4837a + ", newHolder=" + this.f4838b + ", fromX=" + this.f4839c + ", fromY=" + this.f4840d + ", toX=" + this.f4841e + ", toY=" + this.f4842f + '}';
        }

        C1599i(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02, int i, int i2, int i3, int i4) {
            this(abstractC1531c0, abstractC1531c02);
            this.f4839c = i;
            this.f4840d = i2;
            this.f4841e = i3;
            this.f4842f = i4;
        }
    }
}
