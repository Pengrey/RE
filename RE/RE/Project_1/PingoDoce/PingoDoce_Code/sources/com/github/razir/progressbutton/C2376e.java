package com.github.razir.progressbutton;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: com.github.razir.progressbutton.e */
/* loaded from: classes.dex */
public final class C2376e extends ImageSpan {

    /* renamed from: w */
    private int f6935w;

    /* renamed from: x */
    private int f6936x;

    /* renamed from: y */
    private final boolean f6937y;

    public /* synthetic */ C2376e(Drawable drawable, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, z);
    }

    /* renamed from: a */
    public final void m33749a(int i) {
        this.f6936x = i;
    }

    /* renamed from: b */
    public final void m33748b(int i) {
        this.f6935w = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.m20926i(canvas, "canvas");
        Intrinsics.m20926i(charSequence, "text");
        Intrinsics.m20926i(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent;
        Intrinsics.isNotNull(drawable, "drawable");
        int height = ((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - (drawable.getBounds().height() / 2);
        int i7 = this.f6935w;
        if (i7 != 0) {
            canvas.translate(f + i7, height);
        } else {
            canvas.translate(f, height);
        }
        if (this.f6937y) {
            drawable.setAlpha(Color.alpha(paint.getColor()));
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.m20926i(paint, "paint");
        Intrinsics.m20926i(charSequence, "text");
        Drawable drawable = getDrawable();
        Intrinsics.isNotNull(drawable, "drawable");
        Rect bounds = drawable.getBounds();
        Intrinsics.isNotNull(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int max = Math.max(i3, bounds.bottom - bounds.top);
            int i4 = fontMetricsInt2.top + (i3 / 2);
            int i5 = max / 2;
            int i6 = i4 - i5;
            fontMetricsInt.ascent = i6;
            int i7 = i4 + i5;
            fontMetricsInt.descent = i7;
            fontMetricsInt.top = i6;
            fontMetricsInt.bottom = i7;
        }
        return bounds.width() + this.f6935w + this.f6936x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376e(Drawable drawable, int i, int i2, boolean z) {
        super(drawable);
        Intrinsics.m20926i(drawable, "drawable");
        this.f6935w = i;
        this.f6936x = i2;
        this.f6937y = z;
    }
}
