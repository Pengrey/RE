package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p073e2.C4975k;

/* renamed from: androidx.constraintlayout.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC0869j extends AbstractC0853b {

    /* renamed from: E */
    private boolean f3002E;

    /* renamed from: F */
    private boolean f3003F;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0853b
    /* renamed from: h */
    public void mo39364h(AttributeSet attributeSet) {
        super.mo39364h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0868i.f2783J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2793L0) {
                    this.f3002E = true;
                } else if (index == C0868i.f2818Q0) {
                    this.f3003F = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void m39363o(C4975k c4975k, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0853b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f3002E || this.f3003F) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f2604x; i++) {
                View m39438i = constraintLayout.m39438i(this.f2603w[i]);
                if (m39438i != null) {
                    if (this.f3002E) {
                        m39438i.setVisibility(visibility);
                    }
                    if (this.f3003F && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        m39438i.setTranslationZ(m39438i.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m39416d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m39416d();
    }
}
