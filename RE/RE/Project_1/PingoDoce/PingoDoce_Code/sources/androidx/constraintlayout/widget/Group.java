package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends AbstractC0853b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0853b
    /* renamed from: h */
    public void mo39364h(AttributeSet attributeSet) {
        super.mo39364h(attributeSet);
        this.f2599A = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0853b
    /* renamed from: j */
    public void mo39411j(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) getLayoutParams();
        c0847b.f2568m0.m26099U0(0);
        c0847b.f2568m0.m26057v0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0853b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m39416d();
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
