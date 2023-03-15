package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C3646n;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5429l;
import p198k8.C6608a;
import p354s8.C10086c;

/* renamed from: com.google.android.material.progressindicator.b */
/* loaded from: classes.dex */
public abstract class AbstractC3675b {

    /* renamed from: a */
    public int f10342a;

    /* renamed from: b */
    public int f10343b;

    /* renamed from: c */
    public int[] f10344c = new int[0];

    /* renamed from: d */
    public int f10345d;

    /* renamed from: e */
    public int f10346e;

    /* renamed from: f */
    public int f10347f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3675b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C5421d.mtrl_progress_track_thickness);
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, C5429l.f14891A, i, i2, new int[0]);
        this.f10342a = C10086c.m9226d(context, m29500h, C5429l.f14955I, dimensionPixelSize);
        this.f10343b = Math.min(C10086c.m9226d(context, m29500h, C5429l.f14947H, 0), this.f10342a / 2);
        this.f10346e = m29500h.getInt(C5429l.f14923E, 0);
        this.f10347f = m29500h.getInt(C5429l.f14899B, 0);
        m29389c(context, m29500h);
        m29388d(context, m29500h);
        m29500h.recycle();
    }

    /* renamed from: c */
    private void m29389c(Context context, TypedArray typedArray) {
        int i = C5429l.f14907C;
        if (!typedArray.hasValue(i)) {
            this.f10344c = new int[]{C6608a.m20506b(context, C5419b.f14888n, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f10344c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f10344c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m29388d(Context context, TypedArray typedArray) {
        int i = C5429l.f14939G;
        if (typedArray.hasValue(i)) {
            this.f10345d = typedArray.getColor(i, -1);
            return;
        }
        this.f10345d = this.f10344c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f10345d = C6608a.m20507a(this.f10345d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean m29391a() {
        return this.f10347f != 0;
    }

    /* renamed from: b */
    public boolean m29390b() {
        return this.f10346e != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo29311e();
}
