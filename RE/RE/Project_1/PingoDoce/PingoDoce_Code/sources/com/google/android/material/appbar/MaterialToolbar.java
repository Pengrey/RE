package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import com.google.android.material.internal.C3647o;
import p100f8.C5419b;
import p100f8.C5428k;
import p401v8.C11141g;
import p401v8.C11145h;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: t0 */
    private static final int f9368t0 = C5428k.Widget_MaterialComponents_Toolbar;

    /* renamed from: u0 */
    private static final ImageView.ScaleType[] f9369u0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: o0 */
    private Integer f9370o0;

    /* renamed from: p0 */
    private boolean f9371p0;

    /* renamed from: q0 */
    private boolean f9372q0;

    /* renamed from: r0 */
    private ImageView.ScaleType f9373r0;

    /* renamed from: s0 */
    private Boolean f9374s0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14883W);
    }

    /* renamed from: O */
    private Pair<Integer, Integer> m30637O(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: P */
    private void m30636P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C11141g c11141g = new C11141g();
            c11141g.m6004Z(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c11141g.m6015O(context);
            c11141g.m6005Y(C1112b0.m38394y(this));
            C1112b0.m38399v0(this, c11141g);
        }
    }

    /* renamed from: Q */
    private void m30635Q(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: R */
    private void m30634R() {
        if (this.f9371p0 || this.f9372q0) {
            TextView m29494e = C3647o.m29494e(this);
            TextView m29496c = C3647o.m29496c(this);
            if (m29494e == null && m29496c == null) {
                return;
            }
            Pair<Integer, Integer> m30637O = m30637O(m29494e, m29496c);
            if (this.f9371p0 && m29494e != null) {
                m30635Q(m29494e, m30637O);
            }
            if (!this.f9372q0 || m29496c == null) {
                return;
            }
            m30635Q(m29496c, m30637O);
        }
    }

    /* renamed from: S */
    private Drawable m30633S(Drawable drawable) {
        if (drawable == null || this.f9370o0 == null) {
            return drawable;
        }
        Drawable m38859r = C0981a.m38859r(drawable.mutate());
        C0981a.m38863n(m38859r, this.f9370o0.intValue());
        return m38859r;
    }

    /* renamed from: T */
    private void m30632T() {
        ImageView m29497b = C3647o.m29497b(this);
        if (m29497b != null) {
            Boolean bool = this.f9374s0;
            if (bool != null) {
                m29497b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9373r0;
            if (scaleType != null) {
                m29497b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9373r0;
    }

    public Integer getNavigationIconTint() {
        return this.f9370o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5961e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m30634R();
        m30632T();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C11145h.m5962d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f9374s0;
        if (bool == null || bool.booleanValue() != z) {
            this.f9374s0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9373r0 != scaleType) {
            this.f9373r0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m30633S(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f9370o0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f9372q0 != z) {
            this.f9372q0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f9371p0 != z) {
            this.f9371p0 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f9368t0
            android.content.Context r8 = p419w8.C11602a.m4640c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p100f8.C5429l.f15104a4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r10 = p100f8.C5429l.f15131d4
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L29
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = p100f8.C5429l.f15149f4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f9371p0 = r10
            int r10 = p100f8.C5429l.f15140e4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f9372q0 = r10
            int r10 = p100f8.C5429l.f15122c4
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f9369u0
            int r1 = r0.length
            if (r10 >= r1) goto L4a
            r10 = r0[r10]
            r7.f9373r0 = r10
        L4a:
            int r10 = p100f8.C5429l.f15113b4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L5c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f9374s0 = r10
        L5c:
            r9.recycle()
            r7.m30636P(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
