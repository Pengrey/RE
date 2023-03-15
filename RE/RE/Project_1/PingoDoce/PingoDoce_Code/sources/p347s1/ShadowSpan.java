package p347s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import p181jd.Intrinsics;

/* renamed from: s1.h */
/* loaded from: classes.dex */
public final class ShadowSpan extends CharacterStyle {

    /* renamed from: a */
    private final int f26248a;

    /* renamed from: b */
    private final float f26249b;

    /* renamed from: c */
    private final float f26250c;

    /* renamed from: d */
    private final float f26251d;

    public ShadowSpan(int i, float f, float f2, float f3) {
        this.f26248a = i;
        this.f26249b = f;
        this.f26250c = f2;
        this.f26251d = f3;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.isThisObjectNull(textPaint, "tp");
        textPaint.setShadowLayer(this.f26251d, this.f26249b, this.f26250c, this.f26248a);
    }
}
