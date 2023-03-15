package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import java.util.List;
import p268o8.InterfaceC8033a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0873c<View> {

    /* renamed from: a */
    private int f10845a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC3811a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: w */
        final /* synthetic */ View f10846w;

        /* renamed from: x */
        final /* synthetic */ int f10847x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC8033a f10848y;

        ViewTreeObserver$OnPreDrawListenerC3811a(View view, int i, InterfaceC8033a interfaceC8033a) {
            this.f10846w = view;
            this.f10847x = i;
            this.f10848y = interfaceC8033a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f10846w.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10845a == this.f10847x) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC8033a interfaceC8033a = this.f10848y;
                expandableBehavior.mo28775H((View) interfaceC8033a, this.f10846w, interfaceC8033a.mo17125a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f10845a = 0;
    }

    /* renamed from: F */
    private boolean m28806F(boolean z) {
        if (!z) {
            return this.f10845a == 1;
        }
        int i = this.f10845a;
        return i == 0 || i == 2;
    }

    /* renamed from: G */
    protected InterfaceC8033a m28805G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m39327r = coordinatorLayout.m39327r(view);
        int size = m39327r.size();
        for (int i = 0; i < size; i++) {
            View view2 = m39327r.get(i);
            if (mo28776e(coordinatorLayout, view, view2)) {
                return (InterfaceC8033a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo28775H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: h */
    public boolean mo29768H(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC8033a interfaceC8033a = (InterfaceC8033a) view2;
        if (m28806F(interfaceC8033a.mo17125a())) {
            this.f10845a = interfaceC8033a.mo17125a() ? 1 : 2;
            return mo28775H((View) interfaceC8033a, view, interfaceC8033a.mo17125a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: l */
    public boolean mo30696h0(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC8033a m28805G;
        if (C1112b0.m38446W(view) || (m28805G = m28805G(coordinatorLayout, view)) == null || !m28806F(m28805G.mo17125a())) {
            return false;
        }
        int i2 = m28805G.mo17125a() ? 1 : 2;
        this.f10845a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC3811a(view, i2, m28805G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10845a = 0;
    }
}
