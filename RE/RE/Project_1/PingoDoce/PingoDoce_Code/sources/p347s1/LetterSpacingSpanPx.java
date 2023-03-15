package p347s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.d */
/* loaded from: classes.dex */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {

    /* renamed from: w */
    private final float f26236w;

    public LetterSpacingSpanPx(float f) {
        this.f26236w = f;
    }

    /* renamed from: a */
    private final void m9350a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f26236w / textSize);
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        m9350a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        m9350a(textPaint);
    }
}
