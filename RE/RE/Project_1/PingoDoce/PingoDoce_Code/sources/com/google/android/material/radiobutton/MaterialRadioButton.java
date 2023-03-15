package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0513q;
import androidx.core.widget.C1226c;
import p100f8.C5419b;
import p100f8.C5428k;
import p198k8.C6608a;

/* loaded from: classes.dex */
public class MaterialRadioButton extends C0513q {

    /* renamed from: B */
    private static final int f10405B = C5428k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: C */
    private static final int[][] f10406C = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: A */
    private boolean f10407A;

    /* renamed from: z */
    private ColorStateList f10408z;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14881I);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10408z == null) {
            int m20504d = C6608a.m20504d(this, C5419b.f14886k);
            int m20504d2 = C6608a.m20504d(this, C5419b.colorOnSurface);
            int m20504d3 = C6608a.m20504d(this, C5419b.colorSurface);
            int[][] iArr = f10406C;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C6608a.m20500h(m20504d3, m20504d, 1.0f);
            iArr2[1] = C6608a.m20500h(m20504d3, m20504d2, 0.54f);
            iArr2[2] = C6608a.m20500h(m20504d3, m20504d2, 0.38f);
            iArr2[3] = C6608a.m20500h(m20504d3, m20504d2, 0.38f);
            this.f10408z = new ColorStateList(iArr, iArr2);
        }
        return this.f10408z;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10407A && C1226c.m37927b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10407A = z;
        if (z) {
            C1226c.m37926c(this, getMaterialThemeColorsTintList());
        } else {
            C1226c.m37926c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f10405B
            android.content.Context r8 = p419w8.C11602a.m4640c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p100f8.C5429l.f14991M3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r10 = p100f8.C5429l.f14999N3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p354s8.C10086c.m9229a(r8, r9, r10)
            androidx.core.widget.C1226c.m37926c(r7, r8)
        L28:
            int r8 = p100f8.C5429l.f15007O3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f10407A = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
