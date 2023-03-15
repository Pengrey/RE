package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1112b0;
import androidx.fragment.app.AbstractC1406y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1488t0;
import p326r2.C9793b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public class C1378p {

    /* renamed from: a */
    private final C1371k f4088a;

    /* renamed from: b */
    private final C1381q f4089b;

    /* renamed from: c */
    private final Fragment f4090c;

    /* renamed from: d */
    private boolean f4091d = false;

    /* renamed from: e */
    private int f4092e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC1379a implements View.OnAttachStateChangeListener {

        /* renamed from: w */
        final /* synthetic */ View f4093w;

        View$OnAttachStateChangeListenerC1379a(C1378p c1378p, View view) {
            this.f4093w = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4093w.removeOnAttachStateChangeListener(this);
            C1112b0.m38411p0(this.f4093w);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.p$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1380b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4094a;

        static {
            int[] iArr = new int[AbstractC1469p.EnumC1472c.values().length];
            f4094a = iArr;
            try {
                iArr[AbstractC1469p.EnumC1472c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4094a[AbstractC1469p.EnumC1472c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4094a[AbstractC1469p.EnumC1472c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4094a[AbstractC1469p.EnumC1472c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1378p(C1371k c1371k, C1381q c1381q, Fragment fragment) {
        this.f4088a = c1371k;
        this.f4089b = c1381q;
        this.f4090c = fragment;
    }

    /* renamed from: l */
    private boolean m37224l(View view) {
        if (view == this.f4090c.f3826d0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4090c.f3826d0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m37219q() {
        Bundle bundle = new Bundle();
        this.f4090c.m37546y1(bundle);
        this.f4088a.m37255j(this.f4090c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4090c.f3826d0 != null) {
            m37216t();
        }
        if (this.f4090c.f3844y != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4090c.f3844y);
        }
        if (this.f4090c.f3845z != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4090c.f3845z);
        }
        if (!this.f4090c.f3852f0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4090c.f3852f0);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37235a() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        fragment.m37591e1(fragment.f3843x);
        C1371k c1371k = this.f4088a;
        Fragment fragment2 = this.f4090c;
        c1371k.m37264a(fragment2, fragment2.f3843x, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37234b() {
        int m37203j = this.f4089b.m37203j(this.f4090c);
        Fragment fragment = this.f4090c;
        fragment.f3825c0.addView(fragment.f3826d0, m37203j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37233c() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        Fragment fragment2 = fragment.f3804D;
        C1378p c1378p = null;
        if (fragment2 != null) {
            C1378p m37200m = this.f4089b.m37200m(fragment2.f3847B);
            if (m37200m != null) {
                Fragment fragment3 = this.f4090c;
                fragment3.f3848E = fragment3.f3804D.f3847B;
                fragment3.f3804D = null;
                c1378p = m37200m;
            } else {
                throw new IllegalStateException("Fragment " + this.f4090c + " declared target fragment " + this.f4090c.f3804D + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3848E;
            if (str != null && (c1378p = this.f4089b.m37200m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4090c + " declared target fragment " + this.f4090c.f3848E + " that does not belong to this FragmentManager!");
            }
        }
        if (c1378p != null && (FragmentManager.f3896P || c1378p.m37225k().f3846w < 1)) {
            c1378p.m37223m();
        }
        Fragment fragment4 = this.f4090c;
        fragment4.f3814P = fragment4.f3813O.m37419v0();
        Fragment fragment5 = this.f4090c;
        fragment5.f3815R = fragment5.f3813O.m37411y0();
        this.f4088a.m37258g(this.f4090c, false);
        this.f4090c.m37588f1();
        this.f4088a.m37263b(this.f4090c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m37232d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f4090c;
        if (fragment2.f3813O == null) {
            return fragment2.f3846w;
        }
        int i = this.f4092e;
        int i2 = C1380b.f4094a[fragment2.f3834m0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment3 = this.f4090c;
        if (fragment3.f3808J) {
            if (fragment3.f3809K) {
                i = Math.max(this.f4092e, 2);
                View view = this.f4090c.f3826d0;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4092e < 4 ? Math.min(i, fragment3.f3846w) : Math.min(i, 1);
            }
        }
        if (!this.f4090c.f3806H) {
            i = Math.min(i, 1);
        }
        AbstractC1406y.C1411e.EnumC1413b enumC1413b = null;
        if (FragmentManager.f3896P && (viewGroup = (fragment = this.f4090c).f3825c0) != null) {
            enumC1413b = AbstractC1406y.m37107n(viewGroup, fragment.m37620T()).m37109l(this);
        }
        if (enumC1413b == AbstractC1406y.C1411e.EnumC1413b.ADDING) {
            i = Math.min(i, 6);
        } else if (enumC1413b == AbstractC1406y.C1411e.EnumC1413b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f4090c;
            if (fragment4.f3807I) {
                if (fragment4.m37567q0()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f4090c;
        if (fragment5.f3827e0 && fragment5.f3846w < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f4090c);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37231e() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        if (!fragment.f3833l0) {
            this.f4088a.m37257h(fragment, fragment.f3843x, false);
            Fragment fragment2 = this.f4090c;
            fragment2.m37581i1(fragment2.f3843x);
            C1371k c1371k = this.f4088a;
            Fragment fragment3 = this.f4090c;
            c1371k.m37262c(fragment3, fragment3.f3843x, false);
            return;
        }
        fragment.m37645J1(fragment.f3843x);
        this.f4090c.f3846w = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m37230f() {
        String str;
        if (this.f4090c.f3808J) {
            return;
        }
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        LayoutInflater m37570o1 = fragment.m37570o1(fragment.f3843x);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4090c;
        ViewGroup viewGroup2 = fragment2.f3825c0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.f3817T;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.f3813O.m37437p0().mo37277d(this.f4090c.f3817T);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4090c;
                        if (!fragment3.f3810L) {
                            try {
                                str = fragment3.m37603Z().getResourceName(this.f4090c.f3817T);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4090c.f3817T) + " (" + str + ") for fragment " + this.f4090c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4090c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f4090c;
        fragment4.f3825c0 = viewGroup;
        fragment4.mo37337k1(m37570o1, viewGroup, fragment4.f3843x);
        View view = this.f4090c.f3826d0;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4090c;
            fragment5.f3826d0.setTag(C9793b.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m37234b();
            }
            Fragment fragment6 = this.f4090c;
            if (fragment6.f3819V) {
                fragment6.f3826d0.setVisibility(8);
            }
            if (C1112b0.m38447V(this.f4090c.f3826d0)) {
                C1112b0.m38411p0(this.f4090c.f3826d0);
            } else {
                View view2 = this.f4090c.f3826d0;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1379a(this, view2));
            }
            this.f4090c.m37666B1();
            C1371k c1371k = this.f4088a;
            Fragment fragment7 = this.f4090c;
            c1371k.m37252m(fragment7, fragment7.f3826d0, fragment7.f3843x, false);
            int visibility = this.f4090c.f3826d0.getVisibility();
            float alpha = this.f4090c.f3826d0.getAlpha();
            if (FragmentManager.f3896P) {
                this.f4090c.m37604Y1(alpha);
                Fragment fragment8 = this.f4090c;
                if (fragment8.f3825c0 != null && visibility == 0) {
                    View findFocus = fragment8.f3826d0.findFocus();
                    if (findFocus != null) {
                        this.f4090c.m37627Q1(findFocus);
                        if (FragmentManager.m37520H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4090c);
                        }
                    }
                    this.f4090c.f3826d0.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f4090c;
                if (visibility == 0 && fragment9.f3825c0 != null) {
                    z = true;
                }
                fragment9.f3829h0 = z;
            }
        }
        this.f4090c.f3846w = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37229g() {
        Fragment m37207f;
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        boolean z = true;
        boolean z2 = fragment.f3807I && !fragment.m37567q0();
        if (z2 || this.f4089b.m37198o().m37238q(this.f4090c)) {
            AbstractC1368i<?> abstractC1368i = this.f4090c.f3814P;
            if (abstractC1368i instanceof InterfaceC1488t0) {
                z = this.f4089b.m37198o().m37241n();
            } else if (abstractC1368i.m37274g() instanceof Activity) {
                z = true ^ ((Activity) abstractC1368i.m37274g()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f4089b.m37198o().m37247h(this.f4090c);
            }
            this.f4090c.m37576l1();
            this.f4088a.m37261d(this.f4090c, false);
            for (C1378p c1378p : this.f4089b.m37202k()) {
                if (c1378p != null) {
                    Fragment m37225k = c1378p.m37225k();
                    if (this.f4090c.f3847B.equals(m37225k.f3848E)) {
                        m37225k.f3804D = this.f4090c;
                        m37225k.f3848E = null;
                    }
                }
            }
            Fragment fragment2 = this.f4090c;
            String str = fragment2.f3848E;
            if (str != null) {
                fragment2.f3804D = this.f4089b.m37207f(str);
            }
            this.f4089b.m37196q(this);
            return;
        }
        String str2 = this.f4090c.f3848E;
        if (str2 != null && (m37207f = this.f4089b.m37207f(str2)) != null && m37207f.f3821X) {
            this.f4090c.f3804D = m37207f;
        }
        this.f4090c.f3846w = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37228h() {
        View view;
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4090c);
        }
        Fragment fragment = this.f4090c;
        ViewGroup viewGroup = fragment.f3825c0;
        if (viewGroup != null && (view = fragment.f3826d0) != null) {
            viewGroup.removeView(view);
        }
        this.f4090c.m37574m1();
        this.f4088a.m37251n(this.f4090c, false);
        Fragment fragment2 = this.f4090c;
        fragment2.f3825c0 = null;
        fragment2.f3826d0 = null;
        fragment2.f3836o0 = null;
        fragment2.f3837p0.mo166p(null);
        this.f4090c.f3809K = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m37227i() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4090c);
        }
        this.f4090c.m37572n1();
        boolean z = false;
        this.f4088a.m37260e(this.f4090c, false);
        Fragment fragment = this.f4090c;
        fragment.f3846w = -1;
        fragment.f3814P = null;
        fragment.f3815R = null;
        fragment.f3813O = null;
        if (fragment.f3807I && !fragment.m37567q0()) {
            z = true;
        }
        if (z || this.f4089b.m37198o().m37238q(this.f4090c)) {
            if (FragmentManager.m37520H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4090c);
            }
            this.f4090c.m37577l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m37226j() {
        Fragment fragment = this.f4090c;
        if (fragment.f3808J && fragment.f3809K && !fragment.f3811M) {
            if (FragmentManager.m37520H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4090c);
            }
            Fragment fragment2 = this.f4090c;
            fragment2.mo37337k1(fragment2.m37570o1(fragment2.f3843x), null, this.f4090c.f3843x);
            View view = this.f4090c.f3826d0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4090c;
                fragment3.f3826d0.setTag(C9793b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f4090c;
                if (fragment4.f3819V) {
                    fragment4.f3826d0.setVisibility(8);
                }
                this.f4090c.m37666B1();
                C1371k c1371k = this.f4088a;
                Fragment fragment5 = this.f4090c;
                c1371k.m37252m(fragment5, fragment5.f3826d0, fragment5.f3843x, false);
                this.f4090c.f3846w = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m37225k() {
        return this.f4090c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m37223m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4091d) {
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m37225k());
                return;
            }
            return;
        }
        try {
            this.f4091d = true;
            while (true) {
                int m37232d = m37232d();
                Fragment fragment = this.f4090c;
                int i = fragment.f3846w;
                if (m37232d == i) {
                    if (FragmentManager.f3896P && fragment.f3830i0) {
                        if (fragment.f3826d0 != null && (viewGroup = fragment.f3825c0) != null) {
                            AbstractC1406y m37107n = AbstractC1406y.m37107n(viewGroup, fragment.m37620T());
                            if (this.f4090c.f3819V) {
                                m37107n.m37118c(this);
                            } else {
                                m37107n.m37116e(this);
                            }
                        }
                        Fragment fragment2 = this.f4090c;
                        FragmentManager fragmentManager = fragment2.f3813O;
                        if (fragmentManager != null) {
                            fragmentManager.m37524F0(fragment2);
                        }
                        Fragment fragment3 = this.f4090c;
                        fragment3.f3830i0 = false;
                        fragment3.m37637N0(fragment3.f3819V);
                    }
                    return;
                } else if (m37232d > i) {
                    switch (i + 1) {
                        case 0:
                            m37233c();
                            continue;
                        case 1:
                            m37231e();
                            continue;
                        case 2:
                            m37226j();
                            m37230f();
                            continue;
                        case 3:
                            m37235a();
                            continue;
                        case 4:
                            if (fragment.f3826d0 != null && (viewGroup2 = fragment.f3825c0) != null) {
                                AbstractC1406y.m37107n(viewGroup2, fragment.m37620T()).m37119b(AbstractC1406y.C1411e.EnumC1414c.from(this.f4090c.f3826d0.getVisibility()), this);
                            }
                            this.f4090c.f3846w = 4;
                            continue;
                        case 5:
                            m37214v();
                            continue;
                        case 6:
                            fragment.f3846w = 6;
                            continue;
                        case 7:
                            m37220p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            m37227i();
                            continue;
                        case 0:
                            m37229g();
                            continue;
                        case 1:
                            m37228h();
                            this.f4090c.f3846w = 1;
                            continue;
                        case 2:
                            fragment.f3809K = false;
                            fragment.f3846w = 2;
                            continue;
                        case 3:
                            if (FragmentManager.m37520H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4090c);
                            }
                            Fragment fragment4 = this.f4090c;
                            if (fragment4.f3826d0 != null && fragment4.f3844y == null) {
                                m37216t();
                            }
                            Fragment fragment5 = this.f4090c;
                            if (fragment5.f3826d0 != null && (viewGroup3 = fragment5.f3825c0) != null) {
                                AbstractC1406y.m37107n(viewGroup3, fragment5.m37620T()).m37117d(this);
                            }
                            this.f4090c.f3846w = 3;
                            continue;
                        case 4:
                            m37213w();
                            continue;
                        case 5:
                            fragment.f3846w = 5;
                            continue;
                        case 6:
                            m37222n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f4091d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m37222n() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4090c);
        }
        this.f4090c.m37559t1();
        this.f4088a.m37259f(this.f4090c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m37221o(ClassLoader classLoader) {
        Bundle bundle = this.f4090c.f3843x;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4090c;
        fragment.f3844y = fragment.f3843x.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4090c;
        fragment2.f3845z = fragment2.f3843x.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4090c;
        fragment3.f3848E = fragment3.f3843x.getString("android:target_state");
        Fragment fragment4 = this.f4090c;
        if (fragment4.f3848E != null) {
            fragment4.f3805F = fragment4.f3843x.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4090c;
        Boolean bool = fragment5.f3802A;
        if (bool != null) {
            fragment5.f3852f0 = bool.booleanValue();
            this.f4090c.f3802A = null;
        } else {
            fragment5.f3852f0 = fragment5.f3843x.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4090c;
        if (fragment6.f3852f0) {
            return;
        }
        fragment6.f3827e0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m37220p() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4090c);
        }
        View m37638N = this.f4090c.m37638N();
        if (m37638N != null && m37224l(m37638N)) {
            boolean requestFocus = m37638N.requestFocus();
            if (FragmentManager.m37520H0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(m37638N);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4090c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4090c.f3826d0.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4090c.m37627Q1(null);
        this.f4090c.m37548x1();
        this.f4088a.m37256i(this.f4090c, false);
        Fragment fragment = this.f4090c;
        fragment.f3843x = null;
        fragment.f3844y = null;
        fragment.f3845z = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Fragment.SavedState m37218r() {
        Bundle m37219q;
        if (this.f4090c.f3846w <= -1 || (m37219q = m37219q()) == null) {
            return null;
        }
        return new Fragment.SavedState(m37219q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public FragmentState m37217s() {
        FragmentState fragmentState = new FragmentState(this.f4090c);
        Fragment fragment = this.f4090c;
        if (fragment.f3846w > -1 && fragmentState.f3977I == null) {
            Bundle m37219q = m37219q();
            fragmentState.f3977I = m37219q;
            if (this.f4090c.f3848E != null) {
                if (m37219q == null) {
                    fragmentState.f3977I = new Bundle();
                }
                fragmentState.f3977I.putString("android:target_state", this.f4090c.f3848E);
                int i = this.f4090c.f3805F;
                if (i != 0) {
                    fragmentState.f3977I.putInt("android:target_req_state", i);
                }
            }
        } else {
            fragmentState.f3977I = fragment.f3843x;
        }
        return fragmentState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m37216t() {
        if (this.f4090c.f3826d0 == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4090c.f3826d0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4090c.f3844y = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4090c.f3836o0.m37125f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4090c.f3845z = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m37215u(int i) {
        this.f4092e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m37214v() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4090c);
        }
        this.f4090c.m37544z1();
        this.f4088a.m37254k(this.f4090c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m37213w() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4090c);
        }
        this.f4090c.m37669A1();
        this.f4088a.m37253l(this.f4090c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1378p(C1371k c1371k, C1381q c1381q, ClassLoader classLoader, C1367h c1367h, FragmentState fragmentState) {
        this.f4088a = c1371k;
        this.f4089b = c1381q;
        Fragment mo37281a = c1367h.mo37281a(classLoader, fragmentState.f3978w);
        this.f4090c = mo37281a;
        Bundle bundle = fragmentState.f3974F;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo37281a.m37630P1(fragmentState.f3974F);
        mo37281a.f3847B = fragmentState.f3979x;
        mo37281a.f3808J = fragmentState.f3980y;
        mo37281a.f3810L = true;
        mo37281a.f3816S = fragmentState.f3981z;
        mo37281a.f3817T = fragmentState.f3969A;
        mo37281a.f3818U = fragmentState.f3970B;
        mo37281a.f3821X = fragmentState.f3971C;
        mo37281a.f3807I = fragmentState.f3972D;
        mo37281a.f3820W = fragmentState.f3973E;
        mo37281a.f3819V = fragmentState.f3975G;
        mo37281a.f3834m0 = AbstractC1469p.EnumC1472c.values()[fragmentState.f3976H];
        Bundle bundle2 = fragmentState.f3977I;
        if (bundle2 != null) {
            mo37281a.f3843x = bundle2;
        } else {
            mo37281a.f3843x = new Bundle();
        }
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo37281a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1378p(C1371k c1371k, C1381q c1381q, Fragment fragment, FragmentState fragmentState) {
        this.f4088a = c1371k;
        this.f4089b = c1381q;
        this.f4090c = fragment;
        fragment.f3844y = null;
        fragment.f3845z = null;
        fragment.f3812N = 0;
        fragment.f3809K = false;
        fragment.f3806H = false;
        Fragment fragment2 = fragment.f3804D;
        fragment.f3848E = fragment2 != null ? fragment2.f3847B : null;
        fragment.f3804D = null;
        Bundle bundle = fragmentState.f3977I;
        if (bundle != null) {
            fragment.f3843x = bundle;
        } else {
            fragment.f3843x = new Bundle();
        }
    }
}
