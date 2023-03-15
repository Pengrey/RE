package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p120g8.C5617b;
import p120g8.C5624i;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C5624i f10867c;

    /* renamed from: d */
    private final C5624i f10868d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes.dex */
    class C3818a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10869a;

        /* renamed from: b */
        final /* synthetic */ View f10870b;

        C3818a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f10869a = z;
            this.f10870b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10869a) {
                return;
            }
            this.f10870b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10869a) {
                this.f10870b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f10867c = new C5624i(75L, 150L);
        this.f10868d = new C5624i(0L, 150L);
    }

    /* renamed from: K */
    private void m28777K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        C5624i c5624i = z ? this.f10867c : this.f10868d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c5624i.m23539a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: D */
    public boolean mo28779D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo28779D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo28778J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m28777K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C5617b.m23562a(animatorSet, arrayList);
        animatorSet.addListener(new C3818a(this, z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: e */
    public boolean mo28776e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10867c = new C5624i(75L, 150L);
        this.f10868d = new C5624i(0L, 150L);
    }
}
