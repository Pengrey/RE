package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p120g8.C5616a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0873c<V> {

    /* renamed from: a */
    private int f9442a;

    /* renamed from: b */
    private int f9443b;

    /* renamed from: c */
    private int f9444c;

    /* renamed from: d */
    private ViewPropertyAnimator f9445d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C3472a extends AnimatorListenerAdapter {
        C3472a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f9445d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9442a = 0;
        this.f9443b = 2;
        this.f9444c = 0;
    }

    /* renamed from: F */
    private void m30500F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f9445d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C3472a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: A */
    public boolean mo30690n0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public boolean m30499G() {
        return this.f9443b == 1;
    }

    /* renamed from: H */
    public boolean m30498H() {
        return this.f9443b == 2;
    }

    /* renamed from: I */
    public void m30497I(V v, int i) {
        this.f9444c = i;
        if (this.f9443b == 1) {
            v.setTranslationY(this.f9442a + i);
        }
    }

    /* renamed from: J */
    public void m30496J(V v) {
        m30495K(v, true);
    }

    /* renamed from: K */
    public void m30495K(V v, boolean z) {
        if (m30499G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9445d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f9443b = 1;
        int i = this.f9442a + this.f9444c;
        if (z) {
            m30500F(v, i, 175L, C5616a.f15855c);
        } else {
            v.setTranslationY(i);
        }
    }

    /* renamed from: L */
    public void m30494L(V v) {
        m30493M(v, true);
    }

    /* renamed from: M */
    public void m30493M(V v, boolean z) {
        if (m30498H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9445d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f9443b = 2;
        if (z) {
            m30500F(v, 0, 225L, C5616a.f15856d);
        } else {
            v.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: l */
    public boolean mo30696h0(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f9442a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo30696h0(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: t */
    public void mo30693k0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m30496J(v);
        } else if (i2 < 0) {
            m30494L(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9442a = 0;
        this.f9443b = 2;
        this.f9444c = 0;
    }
}
