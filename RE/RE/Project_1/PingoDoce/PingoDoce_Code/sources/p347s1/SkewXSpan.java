package p347s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.i */
/* loaded from: classes.dex */
public class SkewXSpan extends MetricAffectingSpan {

    /* renamed from: w */
    private final float f26252w;

    public SkewXSpan(float f) {
        this.f26252w = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f26252w + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f26252w + textPaint.getTextSkewX());
    }
}
