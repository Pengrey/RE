package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f10850b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C3812a extends AnimatorListenerAdapter {
        C3812a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f10850b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo28775H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f10850b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo28778J = mo28778J(view, view2, z, z3);
        this.f10850b = mo28778J;
        mo28778J.addListener(new C3812a());
        this.f10850b.start();
        if (!z2) {
            this.f10850b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo28778J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
