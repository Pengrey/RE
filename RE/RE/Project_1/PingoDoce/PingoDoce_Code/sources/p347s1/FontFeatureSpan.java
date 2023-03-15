package p347s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p181jd.Intrinsics;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {

    /* renamed from: w */
    private final String f26234w;

    public FontFeatureSpan(String str) {
        Intrinsics.isThisObjectNull(str, "fontFeatureSettings");
        this.f26234w = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f26234w);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f26234w);
    }
}
