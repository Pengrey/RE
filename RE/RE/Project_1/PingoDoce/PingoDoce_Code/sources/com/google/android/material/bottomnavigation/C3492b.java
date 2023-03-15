package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0378e;
import androidx.core.view.C1112b0;
import com.google.android.material.navigation.AbstractC3661a;
import com.google.android.material.navigation.AbstractC3668c;
import p100f8.C5421d;

/* renamed from: com.google.android.material.bottomnavigation.b */
/* loaded from: classes.dex */
public class C3492b extends AbstractC3668c {

    /* renamed from: d0 */
    private final int f9511d0;

    /* renamed from: e0 */
    private final int f9512e0;

    /* renamed from: f0 */
    private final int f9513f0;

    /* renamed from: g0 */
    private final int f9514g0;

    /* renamed from: h0 */
    private boolean f9515h0;

    /* renamed from: i0 */
    private int[] f9516i0;

    public C3492b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f9511d0 = resources.getDimensionPixelSize(C5421d.design_bottom_navigation_item_max_width);
        this.f9512e0 = resources.getDimensionPixelSize(C5421d.design_bottom_navigation_item_min_width);
        this.f9513f0 = resources.getDimensionPixelSize(C5421d.design_bottom_navigation_active_item_max_width);
        this.f9514g0 = resources.getDimensionPixelSize(C5421d.design_bottom_navigation_active_item_min_width);
        this.f9516i0 = new int[5];
    }

    @Override // com.google.android.material.navigation.AbstractC3668c
    /* renamed from: g */
    protected AbstractC3661a mo29421g(Context context) {
        return new C3491a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C1112b0.m38476E(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0378e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.m41042G().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (m29418j(getLabelVisibilityMode(), size2) && m30418q()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i3 = this.f9514g0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f9513f0, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f9512e0 * i4), Math.min(i3, this.f9513f0));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f9511d0);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.f9516i0[i7] = i7 == getSelectedItemPosition() ? min : min2;
                    if (i6 > 0) {
                        int[] iArr = this.f9516i0;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.f9516i0[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f9513f0);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.f9516i0;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f9516i0[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f9516i0[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    /* renamed from: q */
    public boolean m30418q() {
        return this.f9515h0;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f9515h0 = z;
    }
}
