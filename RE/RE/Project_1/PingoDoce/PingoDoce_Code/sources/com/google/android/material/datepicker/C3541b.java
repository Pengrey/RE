package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p100f8.C5419b;
import p100f8.C5429l;
import p354s8.C10085b;
import p354s8.C10086c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C3541b {

    /* renamed from: a */
    final C3540a f9835a;

    /* renamed from: b */
    final C3540a f9836b;

    /* renamed from: c */
    final C3540a f9837c;

    /* renamed from: d */
    final C3540a f9838d;

    /* renamed from: e */
    final C3540a f9839e;

    /* renamed from: f */
    final C3540a f9840f;

    /* renamed from: g */
    final C3540a f9841g;

    /* renamed from: h */
    final Paint f9842h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3541b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10085b.m9231d(context, C5419b.materialCalendarStyle, C3544e.class.getCanonicalName()), C5429l.f15130d3);
        this.f9835a = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15157g3, 0));
        this.f9841g = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15139e3, 0));
        this.f9836b = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15148f3, 0));
        this.f9837c = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15166h3, 0));
        ColorStateList m9229a = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f15175i3);
        this.f9838d = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15193k3, 0));
        this.f9839e = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15184j3, 0));
        this.f9840f = C3540a.m29948a(context, obtainStyledAttributes.getResourceId(C5429l.f15201l3, 0));
        Paint paint = new Paint();
        this.f9842h = paint;
        paint.setColor(m9229a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
