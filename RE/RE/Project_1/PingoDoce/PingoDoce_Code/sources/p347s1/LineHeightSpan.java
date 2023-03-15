package p347s1;

import android.graphics.Paint;
import p181jd.Intrinsics;

/* renamed from: s1.e */
/* loaded from: classes.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {

    /* renamed from: w */
    private final int f26237w;

    public LineHeightSpan(int i) {
        this.f26237w = i;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(i5 * ((this.f26237w * 1.0f) / i6));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - this.f26237w;
    }
}
