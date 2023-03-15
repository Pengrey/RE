package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) getLayoutParams();
        c0847b.f2543a = i;
        setLayoutParams(c0847b);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) getLayoutParams();
        c0847b.f2545b = i;
        setLayoutParams(c0847b);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) getLayoutParams();
        c0847b.f2547c = f;
        setLayoutParams(c0847b);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
