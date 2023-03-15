package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.C1112b0;
import p100f8.C5419b;
import p100f8.C5428k;

/* loaded from: classes.dex */
public final class LinearProgressIndicator extends AbstractC3670a<C3693k> {

    /* renamed from: K */
    public static final int f10323K = C5428k.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.linearProgressIndicatorStyle);
    }

    /* renamed from: s */
    private void m29410s() {
        setIndeterminateDrawable(C3684g.m29353s(getContext(), (C3693k) this.f10334w));
        setProgressDrawable(C3676c.m29385u(getContext(), (C3693k) this.f10334w));
    }

    public int getIndeterminateAnimationType() {
        return ((C3693k) this.f10334w).f10402g;
    }

    public int getIndicatorDirection() {
        return ((C3693k) this.f10334w).f10403h;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3670a
    /* renamed from: o */
    public void mo29395o(int i, boolean z) {
        S s = this.f10334w;
        if (s != 0 && ((C3693k) s).f10402g == 0 && isIndeterminate()) {
            return;
        }
        super.mo29395o(i, z);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f10334w;
        C3693k c3693k = (C3693k) s;
        boolean z2 = true;
        if (((C3693k) s).f10403h != 1 && ((C1112b0.m38476E(this) != 1 || ((C3693k) this.f10334w).f10403h != 2) && (C1112b0.m38476E(this) != 0 || ((C3693k) this.f10334w).f10403h != 3))) {
            z2 = false;
        }
        c3693k.f10404i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C3684g<C3693k> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C3676c<C3693k> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC3670a
    /* renamed from: r */
    public C3693k mo29411r(Context context, AttributeSet attributeSet) {
        return new C3693k(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((C3693k) this.f10334w).f10402g == i) {
            return;
        }
        if (m29393q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.f10334w;
        ((C3693k) s).f10402g = i;
        ((C3693k) s).mo29311e();
        if (i == 0) {
            getIndeterminateDrawable().m29350v(new C3686i((C3693k) this.f10334w));
        } else {
            getIndeterminateDrawable().m29350v(new C3689j(getContext(), (C3693k) this.f10334w));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3670a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((C3693k) this.f10334w).mo29311e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f10334w;
        ((C3693k) s).f10403h = i;
        C3693k c3693k = (C3693k) s;
        boolean z = true;
        if (i != 1 && ((C1112b0.m38476E(this) != 1 || ((C3693k) this.f10334w).f10403h != 2) && (C1112b0.m38476E(this) != 0 || i != 3))) {
            z = false;
        }
        c3693k.f10404i = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.AbstractC3670a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((C3693k) this.f10334w).mo29311e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f10323K);
        m29410s();
    }
}
