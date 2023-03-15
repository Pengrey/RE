package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1112b0;
import androidx.core.view.C1170i;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p100f8.C5423f;
import p100f8.C5429l;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public class C3630e extends ViewGroup {

    /* renamed from: w */
    private int f10186w;

    /* renamed from: x */
    private int f10187x;

    /* renamed from: y */
    private boolean f10188y;

    /* renamed from: z */
    private int f10189z;

    public C3630e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m29543a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: d */
    private void m29540d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5429l.f15248r2, 0, 0);
        this.f10186w = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15264t2, 0);
        this.f10187x = obtainStyledAttributes.getDimensionPixelSize(C5429l.f15256s2, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m29542b(View view) {
        Object tag = view.getTag(C5423f.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo29541c() {
        return this.f10188y;
    }

    protected int getItemSpacing() {
        return this.f10187x;
    }

    protected int getLineSpacing() {
        return this.f10186w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f10189z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f10189z = 0;
            return;
        }
        this.f10189z = 1;
        boolean z2 = C1112b0.m38476E(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C5423f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = C1170i.m38156b(marginLayoutParams);
                    i5 = C1170i.m38157a(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.f10188y && measuredWidth > i7) {
                    i9 = this.f10186w + paddingTop;
                    this.f10189z++;
                    i8 = paddingRight;
                }
                childAt.setTag(C5423f.row_index_key, Integer.valueOf(this.f10189z - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.f10187x;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Reader.READ_DONE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft;
                if (paddingLeft + i3 + childAt.getMeasuredWidth() <= paddingRight || mo29541c()) {
                    i5 = i10;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f10186w + paddingTop;
                }
                int measuredWidth = i5 + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i3 + i4 + childAt.getMeasuredWidth() + this.f10187x;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m29543a(size, mode, i8 + getPaddingRight()), m29543a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f10187x = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f10186w = i;
    }

    public void setSingleLine(boolean z) {
        this.f10188y = z;
    }

    public C3630e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10188y = false;
        m29540d(context, attributeSet);
    }
}
