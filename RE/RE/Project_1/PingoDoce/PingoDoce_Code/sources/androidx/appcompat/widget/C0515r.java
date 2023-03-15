package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p070e.C4897a;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
public class C0515r extends RatingBar {

    /* renamed from: w */
    private final C0511p f1727w;

    public C0515r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m40486b = this.f1727w.m40486b();
        if (m40486b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m40486b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0515r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0511p c0511p = new C0511p(this);
        this.f1727w = c0511p;
        c0511p.mo40417c(attributeSet, i);
    }
}
