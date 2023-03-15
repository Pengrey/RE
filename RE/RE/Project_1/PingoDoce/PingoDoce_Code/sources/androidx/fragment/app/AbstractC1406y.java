package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p020os.C1008b;
import androidx.core.view.C1112b0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p326r2.C9793b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public abstract class AbstractC1406y {

    /* renamed from: a */
    private final ViewGroup f4194a;

    /* renamed from: b */
    final ArrayList<C1411e> f4195b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C1411e> f4196c = new ArrayList<>();

    /* renamed from: d */
    boolean f4197d = false;

    /* renamed from: e */
    boolean f4198e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.y$a */
    /* loaded from: classes.dex */
    public class RunnableC1407a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1410d f4199w;

        RunnableC1407a(C1410d c1410d) {
            this.f4199w = c1410d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1406y.this.f4195b.contains(this.f4199w)) {
                this.f4199w.m37098e().applyState(this.f4199w.m37097f().f3826d0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.y$b */
    /* loaded from: classes.dex */
    public class RunnableC1408b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1410d f4201w;

        RunnableC1408b(C1410d c1410d) {
            this.f4201w = c1410d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1406y.this.f4195b.remove(this.f4201w);
            AbstractC1406y.this.f4196c.remove(this.f4201w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.y$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1409c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4203a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4204b;

        static {
            int[] iArr = new int[C1411e.EnumC1413b.values().length];
            f4204b = iArr;
            try {
                iArr[C1411e.EnumC1413b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4204b[C1411e.EnumC1413b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4204b[C1411e.EnumC1413b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C1411e.EnumC1414c.values().length];
            f4203a = iArr2;
            try {
                iArr2[C1411e.EnumC1414c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4203a[C1411e.EnumC1414c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4203a[C1411e.EnumC1414c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4203a[C1411e.EnumC1414c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.y$d */
    /* loaded from: classes.dex */
    public static class C1410d extends C1411e {

        /* renamed from: h */
        private final C1378p f4205h;

        C1410d(C1411e.EnumC1414c enumC1414c, C1411e.EnumC1413b enumC1413b, C1378p c1378p, C1008b c1008b) {
            super(enumC1414c, enumC1413b, c1378p.m37225k(), c1008b);
            this.f4205h = c1378p;
        }

        @Override // androidx.fragment.app.AbstractC1406y.C1411e
        /* renamed from: c */
        public void mo37100c() {
            super.mo37100c();
            this.f4205h.m37223m();
        }

        @Override // androidx.fragment.app.AbstractC1406y.C1411e
        /* renamed from: l */
        void mo37091l() {
            if (m37096g() == C1411e.EnumC1413b.ADDING) {
                Fragment m37225k = this.f4205h.m37225k();
                View findFocus = m37225k.f3826d0.findFocus();
                if (findFocus != null) {
                    m37225k.m37627Q1(findFocus);
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m37225k);
                    }
                }
                View m37648I1 = m37097f().m37648I1();
                if (m37648I1.getParent() == null) {
                    this.f4205h.m37234b();
                    m37648I1.setAlpha(0.0f);
                }
                if (m37648I1.getAlpha() == 0.0f && m37648I1.getVisibility() == 0) {
                    m37648I1.setVisibility(4);
                }
                m37648I1.setAlpha(m37225k.m37608X());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1406y(ViewGroup viewGroup) {
        this.f4194a = viewGroup;
    }

    /* renamed from: a */
    private void m37120a(C1411e.EnumC1414c enumC1414c, C1411e.EnumC1413b enumC1413b, C1378p c1378p) {
        synchronized (this.f4195b) {
            C1008b c1008b = new C1008b();
            C1411e m37113h = m37113h(c1378p.m37225k());
            if (m37113h != null) {
                m37113h.m37092k(enumC1414c, enumC1413b);
                return;
            }
            C1410d c1410d = new C1410d(enumC1414c, enumC1413b, c1378p, c1008b);
            this.f4195b.add(c1410d);
            c1410d.m37102a(new RunnableC1407a(c1410d));
            c1410d.m37102a(new RunnableC1408b(c1410d));
        }
    }

    /* renamed from: h */
    private C1411e m37113h(Fragment fragment) {
        Iterator<C1411e> it = this.f4195b.iterator();
        while (it.hasNext()) {
            C1411e next = it.next();
            if (next.m37097f().equals(fragment) && !next.m37095h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C1411e m37112i(Fragment fragment) {
        Iterator<C1411e> it = this.f4196c.iterator();
        while (it.hasNext()) {
            C1411e next = it.next();
            if (next.m37097f().equals(fragment) && !next.m37095h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC1406y m37107n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m37106o(viewGroup, fragmentManager.m37534A0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static AbstractC1406y m37106o(ViewGroup viewGroup, InterfaceC1415z interfaceC1415z) {
        int i = C9793b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC1406y) {
            return (AbstractC1406y) tag;
        }
        AbstractC1406y mo37089a = interfaceC1415z.mo37089a(viewGroup);
        viewGroup.setTag(i, mo37089a);
        return mo37089a;
    }

    /* renamed from: q */
    private void m37104q() {
        Iterator<C1411e> it = this.f4195b.iterator();
        while (it.hasNext()) {
            C1411e next = it.next();
            if (next.m37096g() == C1411e.EnumC1413b.ADDING) {
                next.m37092k(C1411e.EnumC1414c.from(next.m37097f().m37648I1().getVisibility()), C1411e.EnumC1413b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37119b(C1411e.EnumC1414c enumC1414c, C1378p c1378p) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c1378p.m37225k());
        }
        m37120a(enumC1414c, C1411e.EnumC1413b.ADDING, c1378p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37118c(C1378p c1378p) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c1378p.m37225k());
        }
        m37120a(C1411e.EnumC1414c.GONE, C1411e.EnumC1413b.NONE, c1378p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m37117d(C1378p c1378p) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c1378p.m37225k());
        }
        m37120a(C1411e.EnumC1414c.REMOVED, C1411e.EnumC1413b.REMOVING, c1378p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37116e(C1378p c1378p) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c1378p.m37225k());
        }
        m37120a(C1411e.EnumC1414c.VISIBLE, C1411e.EnumC1413b.NONE, c1378p);
    }

    /* renamed from: f */
    abstract void mo37115f(List<C1411e> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37114g() {
        if (this.f4198e) {
            return;
        }
        if (!C1112b0.m38447V(this.f4194a)) {
            m37111j();
            this.f4197d = false;
            return;
        }
        synchronized (this.f4195b) {
            if (!this.f4195b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4196c);
                this.f4196c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1411e c1411e = (C1411e) it.next();
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1411e);
                    }
                    c1411e.m37101b();
                    if (!c1411e.m37094i()) {
                        this.f4196c.add(c1411e);
                    }
                }
                m37104q();
                ArrayList arrayList2 = new ArrayList(this.f4195b);
                this.f4195b.clear();
                this.f4196c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C1411e) it2.next()).mo37091l();
                }
                mo37115f(arrayList2, this.f4197d);
                this.f4197d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m37111j() {
        String str;
        String str2;
        boolean m38447V = C1112b0.m38447V(this.f4194a);
        synchronized (this.f4195b) {
            m37104q();
            Iterator<C1411e> it = this.f4195b.iterator();
            while (it.hasNext()) {
                it.next().mo37091l();
            }
            Iterator it2 = new ArrayList(this.f4196c).iterator();
            while (it2.hasNext()) {
                C1411e c1411e = (C1411e) it2.next();
                if (FragmentManager.m37520H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m38447V) {
                        str2 = BuildConfig.VERSION_NAME;
                    } else {
                        str2 = "Container " + this.f4194a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(c1411e);
                    Log.v("FragmentManager", sb2.toString());
                }
                c1411e.m37101b();
            }
            Iterator it3 = new ArrayList(this.f4195b).iterator();
            while (it3.hasNext()) {
                C1411e c1411e2 = (C1411e) it3.next();
                if (FragmentManager.m37520H0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m38447V) {
                        str = BuildConfig.VERSION_NAME;
                    } else {
                        str = "Container " + this.f4194a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(c1411e2);
                    Log.v("FragmentManager", sb3.toString());
                }
                c1411e2.m37101b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m37110k() {
        if (this.f4198e) {
            this.f4198e = false;
            m37114g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C1411e.EnumC1413b m37109l(C1378p c1378p) {
        C1411e m37113h = m37113h(c1378p.m37225k());
        C1411e.EnumC1413b m37096g = m37113h != null ? m37113h.m37096g() : null;
        C1411e m37112i = m37112i(c1378p.m37225k());
        return (m37112i == null || !(m37096g == null || m37096g == C1411e.EnumC1413b.NONE)) ? m37096g : m37112i.m37096g();
    }

    /* renamed from: m */
    public ViewGroup m37108m() {
        return this.f4194a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m37105p() {
        synchronized (this.f4195b) {
            m37104q();
            this.f4198e = false;
            int size = this.f4195b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1411e c1411e = this.f4195b.get(size);
                C1411e.EnumC1414c from = C1411e.EnumC1414c.from(c1411e.m37097f().f3826d0);
                C1411e.EnumC1414c m37098e = c1411e.m37098e();
                C1411e.EnumC1414c enumC1414c = C1411e.EnumC1414c.VISIBLE;
                if (m37098e == enumC1414c && from != enumC1414c) {
                    this.f4198e = c1411e.m37097f().m37562s0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m37103r(boolean z) {
        this.f4197d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.y$e */
    /* loaded from: classes.dex */
    public static class C1411e {

        /* renamed from: a */
        private EnumC1414c f4206a;

        /* renamed from: b */
        private EnumC1413b f4207b;

        /* renamed from: c */
        private final Fragment f4208c;

        /* renamed from: d */
        private final List<Runnable> f4209d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C1008b> f4210e = new HashSet<>();

        /* renamed from: f */
        private boolean f4211f = false;

        /* renamed from: g */
        private boolean f4212g = false;

        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.y$e$a */
        /* loaded from: classes.dex */
        class C1412a implements C1008b.InterfaceC1010b {
            C1412a() {
            }

            @Override // androidx.core.p020os.C1008b.InterfaceC1010b
            /* renamed from: a */
            public void mo37090a() {
                C1411e.this.m37101b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.y$e$b */
        /* loaded from: classes.dex */
        public enum EnumC1413b {
            NONE,
            ADDING,
            REMOVING
        }

        C1411e(EnumC1414c enumC1414c, EnumC1413b enumC1413b, Fragment fragment, C1008b c1008b) {
            this.f4206a = enumC1414c;
            this.f4207b = enumC1413b;
            this.f4208c = fragment;
            c1008b.m38757d(new C1412a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final void m37102a(Runnable runnable) {
            this.f4209d.add(runnable);
        }

        /* renamed from: b */
        final void m37101b() {
            if (m37095h()) {
                return;
            }
            this.f4211f = true;
            if (this.f4210e.isEmpty()) {
                mo37100c();
                return;
            }
            Iterator it = new ArrayList(this.f4210e).iterator();
            while (it.hasNext()) {
                ((C1008b) it.next()).m38760a();
            }
        }

        /* renamed from: c */
        public void mo37100c() {
            if (this.f4212g) {
                return;
            }
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4212g = true;
            for (Runnable runnable : this.f4209d) {
                runnable.run();
            }
        }

        /* renamed from: d */
        public final void m37099d(C1008b c1008b) {
            if (this.f4210e.remove(c1008b) && this.f4210e.isEmpty()) {
                mo37100c();
            }
        }

        /* renamed from: e */
        public EnumC1414c m37098e() {
            return this.f4206a;
        }

        /* renamed from: f */
        public final Fragment m37097f() {
            return this.f4208c;
        }

        /* renamed from: g */
        EnumC1413b m37096g() {
            return this.f4207b;
        }

        /* renamed from: h */
        final boolean m37095h() {
            return this.f4211f;
        }

        /* renamed from: i */
        final boolean m37094i() {
            return this.f4212g;
        }

        /* renamed from: j */
        public final void m37093j(C1008b c1008b) {
            mo37091l();
            this.f4210e.add(c1008b);
        }

        /* renamed from: k */
        final void m37092k(EnumC1414c enumC1414c, EnumC1413b enumC1413b) {
            int i = C1409c.f4204b[enumC1413b.ordinal()];
            if (i == 1) {
                if (this.f4206a == EnumC1414c.REMOVED) {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4207b + " to ADDING.");
                    }
                    this.f4206a = EnumC1414c.VISIBLE;
                    this.f4207b = EnumC1413b.ADDING;
                }
            } else if (i != 2) {
                if (i == 3 && this.f4206a != EnumC1414c.REMOVED) {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = " + this.f4206a + " -> " + enumC1414c + ". ");
                    }
                    this.f4206a = enumC1414c;
                }
            } else {
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4208c + " mFinalState = " + this.f4206a + " -> REMOVED. mLifecycleImpact  = " + this.f4207b + " to REMOVING.");
                }
                this.f4206a = EnumC1414c.REMOVED;
                this.f4207b = EnumC1413b.REMOVING;
            }
        }

        /* renamed from: l */
        void mo37091l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4206a + "} {mLifecycleImpact = " + this.f4207b + "} {mFragment = " + this.f4208c + "}";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* renamed from: androidx.fragment.app.y$e$c */
        /* loaded from: classes.dex */
        public enum EnumC1414c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static EnumC1414c from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void applyState(View view) {
                int i = C1409c.f4203a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m37520H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i != 4) {
                } else {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static EnumC1414c from(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }
        }
    }
}
