package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0863e extends ViewGroup {

    /* renamed from: w */
    C0857d f2720w;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0864a generateDefaultLayoutParams() {
        return new C0864a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0864a generateLayoutParams(AttributeSet attributeSet) {
        return new C0864a(getContext(), attributeSet);
    }

    public C0857d getConstraintSet() {
        if (this.f2720w == null) {
            this.f2720w = new C0857d();
        }
        this.f2720w.m39395h(this);
        return this.f2720w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0847b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* loaded from: classes.dex */
    public static class C0864a extends ConstraintLayout.C0847b {

        /* renamed from: n0 */
        public float f2721n0;

        /* renamed from: o0 */
        public boolean f2722o0;

        /* renamed from: p0 */
        public float f2723p0;

        /* renamed from: q0 */
        public float f2724q0;

        /* renamed from: r0 */
        public float f2725r0;

        /* renamed from: s0 */
        public float f2726s0;

        /* renamed from: t0 */
        public float f2727t0;

        /* renamed from: u0 */
        public float f2728u0;

        /* renamed from: v0 */
        public float f2729v0;

        /* renamed from: w0 */
        public float f2730w0;

        /* renamed from: x0 */
        public float f2731x0;

        /* renamed from: y0 */
        public float f2732y0;

        /* renamed from: z0 */
        public float f2733z0;

        public C0864a(int i, int i2) {
            super(i, i2);
            this.f2721n0 = 1.0f;
            this.f2722o0 = false;
            this.f2723p0 = 0.0f;
            this.f2724q0 = 0.0f;
            this.f2725r0 = 0.0f;
            this.f2726s0 = 0.0f;
            this.f2727t0 = 1.0f;
            this.f2728u0 = 1.0f;
            this.f2729v0 = 0.0f;
            this.f2730w0 = 0.0f;
            this.f2731x0 = 0.0f;
            this.f2732y0 = 0.0f;
            this.f2733z0 = 0.0f;
        }

        public C0864a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2721n0 = 1.0f;
            this.f2722o0 = false;
            this.f2723p0 = 0.0f;
            this.f2724q0 = 0.0f;
            this.f2725r0 = 0.0f;
            this.f2726s0 = 0.0f;
            this.f2727t0 = 1.0f;
            this.f2728u0 = 1.0f;
            this.f2729v0 = 0.0f;
            this.f2730w0 = 0.0f;
            this.f2731x0 = 0.0f;
            this.f2732y0 = 0.0f;
            this.f2733z0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0868i.f2854X1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0868i.f2859Y1) {
                    this.f2721n0 = obtainStyledAttributes.getFloat(index, this.f2721n0);
                } else if (index == C0868i.f2920j2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2723p0 = obtainStyledAttributes.getFloat(index, this.f2723p0);
                        this.f2722o0 = true;
                    }
                } else if (index == C0868i.f2905g2) {
                    this.f2725r0 = obtainStyledAttributes.getFloat(index, this.f2725r0);
                } else if (index == C0868i.f2910h2) {
                    this.f2726s0 = obtainStyledAttributes.getFloat(index, this.f2726s0);
                } else if (index == C0868i.f2900f2) {
                    this.f2724q0 = obtainStyledAttributes.getFloat(index, this.f2724q0);
                } else if (index == C0868i.f2888d2) {
                    this.f2727t0 = obtainStyledAttributes.getFloat(index, this.f2727t0);
                } else if (index == C0868i.f2894e2) {
                    this.f2728u0 = obtainStyledAttributes.getFloat(index, this.f2728u0);
                } else if (index == C0868i.f2864Z1) {
                    this.f2729v0 = obtainStyledAttributes.getFloat(index, this.f2729v0);
                } else if (index == C0868i.f2870a2) {
                    this.f2730w0 = obtainStyledAttributes.getFloat(index, this.f2730w0);
                } else if (index == C0868i.f2876b2) {
                    this.f2731x0 = obtainStyledAttributes.getFloat(index, this.f2731x0);
                } else if (index == C0868i.f2882c2) {
                    this.f2732y0 = obtainStyledAttributes.getFloat(index, this.f2732y0);
                } else if (index == C0868i.f2915i2 && Build.VERSION.SDK_INT >= 21) {
                    this.f2733z0 = obtainStyledAttributes.getFloat(index, this.f2733z0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
