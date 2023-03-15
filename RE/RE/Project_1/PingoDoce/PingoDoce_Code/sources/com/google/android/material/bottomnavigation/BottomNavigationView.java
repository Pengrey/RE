package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0520s0;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import com.google.android.material.internal.C3646n;
import com.google.android.material.internal.C3649p;
import com.google.android.material.navigation.AbstractC3668c;
import com.google.android.material.navigation.NavigationBarView;
import p100f8.C5419b;
import p100f8.C5420c;
import p100f8.C5421d;
import p100f8.C5428k;
import p100f8.C5429l;
import p401v8.C11141g;

/* loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    /* loaded from: classes.dex */
    public class C3488a implements C3649p.InterfaceC3653d {
        C3488a(BottomNavigationView bottomNavigationView) {
        }

        @Override // com.google.android.material.internal.C3649p.InterfaceC3653d
        /* renamed from: a */
        public C1183m0 mo29484a(View view, C1183m0 c1183m0, C3649p.C3654e c3654e) {
            c3654e.f10237d += c1183m0.m38106h();
            boolean z = C1112b0.m38476E(view) == 1;
            int m38105i = c1183m0.m38105i();
            int m38104j = c1183m0.m38104j();
            c3654e.f10234a += z ? m38104j : m38105i;
            int i = c3654e.f10236c;
            if (!z) {
                m38105i = m38104j;
            }
            c3654e.f10236c = i + m38105i;
            c3654e.m29483a(view);
            return c1183m0;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3489b extends NavigationBarView.InterfaceC3659b {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3490c extends NavigationBarView.InterfaceC3660c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.bottomNavigationStyle);
    }

    /* renamed from: g */
    private void m30422g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0928a.m39113d(context, C5420c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C5421d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: h */
    private void m30421h() {
        C3649p.m29492a(this, new C3488a(this));
    }

    /* renamed from: i */
    private int m30420i(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    /* renamed from: j */
    private boolean m30419j() {
        return Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof C11141g);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: d */
    protected AbstractC3668c mo29464d(Context context) {
        return new C3492b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, m30420i(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C3492b c3492b = (C3492b) getMenuView();
        if (c3492b.m30418q() != z) {
            c3492b.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo29475g(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC3489b interfaceC3489b) {
        setOnItemReselectedListener(interfaceC3489b);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC3490c interfaceC3490c) {
        setOnItemSelectedListener(interfaceC3490c);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C5428k.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0520s0 m29499i = C3646n.m29499i(context2, attributeSet, C5429l.f14963J, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(m29499i.m40474a(C5429l.f14979L, true));
        int i3 = C5429l.f14971K;
        if (m29499i.m40456s(i3)) {
            setMinimumHeight(m29499i.m40469f(i3, 0));
        }
        m29499i.m40452w();
        if (m30419j()) {
            m30422g(context2);
        }
        m30421h();
    }
}
