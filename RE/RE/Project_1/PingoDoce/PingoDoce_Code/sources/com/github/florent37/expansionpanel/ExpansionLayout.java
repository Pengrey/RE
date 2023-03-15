package com.github.florent37.expansionpanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.List;
import p329r5.C9815a;

/* loaded from: classes.dex */
public class ExpansionLayout extends NestedScrollView {

    /* renamed from: b0 */
    private final List<InterfaceC2350f> f6834b0;

    /* renamed from: c0 */
    private final List<InterfaceC2351g> f6835c0;

    /* renamed from: d0 */
    private boolean f6836d0;

    /* renamed from: e0 */
    private Animator f6837e0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC2343a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: w */
        final /* synthetic */ View f6838w;

        /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$a$a */
        /* loaded from: classes.dex */
        class View$OnLayoutChangeListenerC2344a implements View.OnLayoutChangeListener {

            /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$a$a$a */
            /* loaded from: classes.dex */
            class RunnableC2345a implements Runnable {

                /* renamed from: w */
                final /* synthetic */ int f6841w;

                RunnableC2345a(int i) {
                    this.f6841w = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ExpansionLayout.this.setHeight(this.f6841w);
                }
            }

            View$OnLayoutChangeListenerC2344a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (ExpansionLayout.this.f6836d0 && ExpansionLayout.this.f6837e0 == null) {
                    ExpansionLayout.this.post(new RunnableC2345a(i4 - i2));
                }
            }
        }

        ViewTreeObserver$OnPreDrawListenerC2343a(View view) {
            this.f6838w = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f6838w.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpansionLayout.this.f6836d0) {
                ExpansionLayout.this.m33860c0(false);
            }
            this.f6838w.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC2344a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$b */
    /* loaded from: classes.dex */
    public class C2346b implements ValueAnimator.AnimatorUpdateListener {
        C2346b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpansionLayout.this.setHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$c */
    /* loaded from: classes.dex */
    public class C2347c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6844a;

        C2347c(boolean z) {
            this.f6844a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ExpansionLayout.this.f6837e0 = null;
            if (this.f6844a) {
                ExpansionLayout.this.m33854i0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$d */
    /* loaded from: classes.dex */
    public class C2348d implements ValueAnimator.AnimatorUpdateListener {
        C2348d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpansionLayout.this.setHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$e */
    /* loaded from: classes.dex */
    public class C2349e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6847a;

        C2349e(boolean z) {
            this.f6847a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ExpansionLayout.this.f6837e0 = null;
            if (this.f6847a) {
                ExpansionLayout.this.m33854i0();
            }
        }
    }

    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2350f {
        /* renamed from: a */
        void mo33851a(ExpansionLayout expansionLayout, boolean z);
    }

    /* renamed from: com.github.florent37.expansionpanel.ExpansionLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2351g {
        /* renamed from: a */
        void m33850a(ExpansionLayout expansionLayout, boolean z);
    }

    public ExpansionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6834b0 = new ArrayList();
        this.f6835c0 = new ArrayList();
        this.f6836d0 = false;
        m33858e0(context, attributeSet);
    }

    /* renamed from: e0 */
    private void m33858e0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        requestDisallowInterceptTouchEvent(true);
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9815a.f25766g)) == null) {
            return;
        }
        this.f6836d0 = obtainStyledAttributes.getBoolean(C9815a.f25767h, this.f6836d0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: g0 */
    private void m33856g0() {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            childAt.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC2343a(childAt));
        }
    }

    /* renamed from: h0 */
    private void m33855h0(boolean z) {
        for (InterfaceC2350f interfaceC2350f : this.f6834b0) {
            if (interfaceC2350f != null) {
                interfaceC2350f.mo33851a(this, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m33854i0() {
        for (InterfaceC2351g interfaceC2351g : this.f6835c0) {
            if (interfaceC2351g != null) {
                interfaceC2351g.m33850a(this, this.f6836d0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(float f) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) f;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Z */
    public void m33863Z(InterfaceC2350f interfaceC2350f) {
        if (interfaceC2350f == null || this.f6834b0.contains(interfaceC2350f)) {
            return;
        }
        this.f6834b0.add(interfaceC2350f);
    }

    /* renamed from: a0 */
    public void m33862a0(boolean z) {
        m33861b0(z, true);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            m33856g0();
            return;
        }
        throw new IllegalStateException("ExpansionLayout can host only one direct child");
    }

    /* renamed from: b0 */
    public void m33861b0(boolean z, boolean z2) {
        if (isEnabled() && this.f6836d0) {
            if (z2) {
                m33855h0(false);
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(getHeight() * 1.0f, 0.0f);
                ofFloat.addUpdateListener(new C2346b());
                ofFloat.addListener(new C2347c(z2));
                this.f6836d0 = false;
                this.f6837e0 = ofFloat;
                ofFloat.start();
                return;
            }
            setHeight(0.0f);
            this.f6836d0 = false;
            if (z2) {
                m33854i0();
            }
        }
    }

    /* renamed from: c0 */
    public void m33860c0(boolean z) {
        m33859d0(z, true);
    }

    /* renamed from: d0 */
    public void m33859d0(boolean z, boolean z2) {
        if (!isEnabled() || this.f6836d0) {
            return;
        }
        if (z2) {
            m33855h0(true);
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, getChildAt(0).getHeight());
            ofFloat.addUpdateListener(new C2348d());
            ofFloat.addListener(new C2349e(z2));
            this.f6836d0 = true;
            this.f6837e0 = ofFloat;
            ofFloat.start();
            return;
        }
        setHeight(getChildAt(0).getHeight());
        this.f6836d0 = true;
        if (z2) {
            m33854i0();
        }
    }

    /* renamed from: f0 */
    public boolean m33857f0() {
        return this.f6836d0;
    }

    /* renamed from: j0 */
    public void m33853j0(boolean z) {
        m33852k0(z, true);
    }

    /* renamed from: k0 */
    public void m33852k0(boolean z, boolean z2) {
        if (this.f6836d0) {
            m33861b0(z, z2);
        } else {
            m33859d0(z, z2);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6836d0) {
            return;
        }
        setHeight(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getBoolean("expanded")) {
                m33860c0(false);
            } else {
                m33862a0(false);
            }
            super.onRestoreInstanceState(bundle.getParcelable("super"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("expanded", this.f6836d0);
        return bundle;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            m33856g0();
            return;
        }
        throw new IllegalStateException("ExpansionLayout can host only one direct child");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            m33856g0();
            return;
        }
        throw new IllegalStateException("ExpansionLayout can host only one direct child");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            m33856g0();
            return;
        }
        throw new IllegalStateException("ExpansionLayout can host only one direct child");
    }
}
