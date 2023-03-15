package p347s1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.k */
/* loaded from: classes.dex */
public final class TypefaceSpan extends MetricAffectingSpan {

    /* renamed from: w */
    private final Typeface f26255w;

    public TypefaceSpan(Typeface typeface) {
        Intrinsics.isThisObjectNull(typeface, "typeface");
        this.f26255w = typeface;
    }

    /* renamed from: a */
    private final void m9344a(Paint paint) {
        paint.setTypeface(this.f26255w);
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "ds");
        m9344a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "paint");
        m9344a(textPaint);
    }
}
