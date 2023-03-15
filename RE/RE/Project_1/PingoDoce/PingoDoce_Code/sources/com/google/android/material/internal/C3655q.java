package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.q */
/* loaded from: classes.dex */
public class C3655q extends ImageButton {

    /* renamed from: w */
    private int f10238w;

    public C3655q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void m29482b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f10238w = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f10238w;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m29482b(i, true);
    }

    public C3655q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10238w = getVisibility();
    }
}
