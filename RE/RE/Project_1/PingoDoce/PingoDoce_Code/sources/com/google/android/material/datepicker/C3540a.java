package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import p100f8.C5429l;
import p354s8.C10086c;
import p401v8.C11141g;
import p401v8.C11148k;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
final class C3540a {

    /* renamed from: a */
    private final Rect f9829a;

    /* renamed from: b */
    private final ColorStateList f9830b;

    /* renamed from: c */
    private final ColorStateList f9831c;

    /* renamed from: d */
    private final ColorStateList f9832d;

    /* renamed from: e */
    private final int f9833e;

    /* renamed from: f */
    private final C11148k f9834f;

    private C3540a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C11148k c11148k, Rect rect) {
        C1076h.m38621d(rect.left);
        C1076h.m38621d(rect.top);
        C1076h.m38621d(rect.right);
        C1076h.m38621d(rect.bottom);
        this.f9829a = rect;
        this.f9830b = colorStateList2;
        this.f9831c = colorStateList;
        this.f9832d = colorStateList3;
        this.f9833e = i;
        this.f9834f = c11148k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3540a m29948a(Context context, int i) {
        C1076h.m38623b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5429l.f15209m3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C5429l.f15217n3, 0), obtainStyledAttributes.getDimensionPixelOffset(C5429l.f15233p3, 0), obtainStyledAttributes.getDimensionPixelOffset(C5429l.f15225o3, 0), obtainStyledAttributes.getDimensionPixelOffset(C5429l.f15241q3, 0));
        ColorStateList m9229a = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15249r3);
        ColorStateList m9229a2 = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15289w3);
        ColorStateList m9229a3 = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15273u3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15281v3, 0);
        C11148k m5914m = C11148k.m5956b(context, obtainStyledAttributes.getResourceId(C5429l.f15257s3, 0), obtainStyledAttributes.getResourceId(C5429l.f15265t3, 0)).m5914m();
        obtainStyledAttributes.recycle();
        return new C3540a(m9229a, m9229a2, m9229a3, dimensionPixelSize, m5914m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m29947b() {
        return this.f9829a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m29946c() {
        return this.f9829a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m29945d(TextView textView) {
        C11141g c11141g = new C11141g();
        C11141g c11141g2 = new C11141g();
        c11141g.setShapeAppearanceModel(this.f9834f);
        c11141g2.setShapeAppearanceModel(this.f9834f);
        c11141g.m6004Z(this.f9831c);
        c11141g.m5989h0(this.f9833e, this.f9832d);
        textView.setTextColor(this.f9830b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f9830b.withAlpha(30), c11141g, c11141g2) : c11141g;
        Rect rect = this.f9829a;
        C1112b0.m38399v0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
