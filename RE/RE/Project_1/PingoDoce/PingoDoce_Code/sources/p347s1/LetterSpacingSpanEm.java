package p347s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public final class LetterSpacingSpanEm extends MetricAffectingSpan {

    /* renamed from: w */
    private final float f26235w;

    public LetterSpacingSpanEm(float f) {
        this.f26235w = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f26235w);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f26235w);
    }
}
