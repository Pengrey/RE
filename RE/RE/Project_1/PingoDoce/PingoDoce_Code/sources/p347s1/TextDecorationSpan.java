package p347s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import p181jd.Intrinsics;

/* renamed from: s1.j */
/* loaded from: classes.dex */
public final class TextDecorationSpan extends CharacterStyle {

    /* renamed from: a */
    private final boolean f26253a;

    /* renamed from: b */
    private final boolean f26254b;

    public TextDecorationSpan(boolean z, boolean z2) {
        this.f26253a = z;
        this.f26254b = z2;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f26253a);
        textPaint.setStrikeThruText(this.f26254b);
    }
}
