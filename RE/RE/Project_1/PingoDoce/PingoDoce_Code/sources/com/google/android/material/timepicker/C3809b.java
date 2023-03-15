package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0857d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1112b0;
import p100f8.C5423f;
import p100f8.C5425h;
import p100f8.C5429l;
import p401v8.C11141g;
import p401v8.C11146i;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
class C3809b extends ConstraintLayout {

    /* renamed from: P */
    private final Runnable f10841P;

    /* renamed from: Q */
    private int f10842Q;

    /* renamed from: R */
    private C11141g f10843R;

    /* compiled from: RadialViewGroup.java */
    /* renamed from: com.google.android.material.timepicker.b$a */
    /* loaded from: classes.dex */
    class RunnableC3810a implements Runnable {
        RunnableC3810a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3809b.this.m28809y();
        }
    }

    public C3809b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: u */
    private Drawable m28813u() {
        C11141g c11141g = new C11141g();
        this.f10843R = c11141g;
        c11141g.m6006X(new C11146i(0.5f));
        this.f10843R.m6004Z(ColorStateList.valueOf(-1));
        return this.f10843R;
    }

    /* renamed from: x */
    private static boolean m28810x(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: z */
    private void m28808z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f10841P);
            handler.post(this.f10841P);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C1112b0.m38418m());
        }
        m28808z();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m28809y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m28808z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f10843R.m6004Z(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public int m28812v() {
        return this.f10842Q;
    }

    /* renamed from: w */
    public void mo28811w(int i) {
        this.f10842Q = i;
        m28809y();
    }

    /* renamed from: y */
    protected void m28809y() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m28810x(getChildAt(i2))) {
                i++;
            }
        }
        C0857d c0857d = new C0857d();
        c0857d.m39396g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id2 = childAt.getId();
            int i4 = C5423f.circle_center;
            if (id2 != i4 && !m28810x(childAt)) {
                c0857d.m39393j(childAt.getId(), i4, this.f10842Q, f);
                f += 360.0f / (childCount - i);
            }
        }
        c0857d.m39400c(this);
    }

    public C3809b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C5425h.material_radial_view_group, this);
        C1112b0.m38399v0(this, m28813u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f14904B4, i, 0);
        this.f10842Q = obtainStyledAttributes.getDimensionPixelSize(C5429l.f14912C4, 0);
        this.f10841P = new RunnableC3810a();
        obtainStyledAttributes.recycle();
    }
}
