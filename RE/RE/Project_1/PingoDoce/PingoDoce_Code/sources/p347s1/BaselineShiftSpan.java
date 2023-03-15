package p347s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public class BaselineShiftSpan extends MetricAffectingSpan {

    /* renamed from: w */
    private final float f26233w;

    public BaselineShiftSpan(float f) {
        this.f26233w = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26233w);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f26233w);
    }
}
