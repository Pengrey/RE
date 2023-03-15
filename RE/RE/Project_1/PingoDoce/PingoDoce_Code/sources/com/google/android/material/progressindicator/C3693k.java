package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C3646n;
import p100f8.C5419b;
import p100f8.C5429l;

/* renamed from: com.google.android.material.progressindicator.k */
/* loaded from: classes.dex */
public final class C3693k extends AbstractC3675b {

    /* renamed from: g */
    public int f10402g;

    /* renamed from: h */
    public int f10403h;

    /* renamed from: i */
    boolean f10404i;

    public C3693k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.linearProgressIndicatorStyle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC3675b
    /* renamed from: e */
    public void mo29311e() {
        if (this.f10402g == 0) {
            if (this.f10343b <= 0) {
                if (this.f10344c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public C3693k(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f10323K);
    }

    public C3693k(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, C5429l.f15304y2, C5419b.linearProgressIndicatorStyle, LinearProgressIndicator.f10323K, new int[0]);
        this.f10402g = m29500h.getInt(C5429l.f15312z2, 1);
        this.f10403h = m29500h.getInt(C5429l.f14894A2, 0);
        m29500h.recycle();
        mo29311e();
        this.f10404i = this.f10403h == 1;
    }
}
