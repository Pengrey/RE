package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0470f;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.widget.C1226c;
import com.google.android.material.internal.C3649p;
import p100f8.C5419b;
import p100f8.C5428k;
import p198k8.C6608a;

/* loaded from: classes.dex */
public class MaterialCheckBox extends C0470f {

    /* renamed from: C */
    private static final int f9701C = C5428k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: D */
    private static final int[][] f9702D = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: A */
    private boolean f9703A;

    /* renamed from: B */
    private boolean f9704B;

    /* renamed from: z */
    private ColorStateList f9705z;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14885g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9705z == null) {
            int[][] iArr = f9702D;
            int[] iArr2 = new int[iArr.length];
            int m20504d = C6608a.m20504d(this, C5419b.f14886k);
            int m20504d2 = C6608a.m20504d(this, C5419b.colorSurface);
            int m20504d3 = C6608a.m20504d(this, C5419b.colorOnSurface);
            iArr2[0] = C6608a.m20500h(m20504d2, m20504d, 1.0f);
            iArr2[1] = C6608a.m20500h(m20504d2, m20504d3, 0.54f);
            iArr2[2] = C6608a.m20500h(m20504d2, m20504d3, 0.38f);
            iArr2[3] = C6608a.m20500h(m20504d2, m20504d3, 0.38f);
            this.f9705z = new ColorStateList(iArr, iArr2);
        }
        return this.f9705z;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9703A && C1226c.m37927b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable m37928a;
        if (this.f9704B && TextUtils.isEmpty(getText()) && (m37928a = C1226c.m37928a(this)) != null) {
            int width = ((getWidth() - m37928a.getIntrinsicWidth()) / 2) * (C3649p.m29488e(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = m37928a.getBounds();
                C0981a.m38865l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f9704B = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9703A = z;
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
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f9701C
            android.content.Context r8 = p419w8.C11602a.m4640c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p100f8.C5429l.f14959I3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r10 = p100f8.C5429l.f14967J3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p354s8.C10086c.m9229a(r8, r9, r10)
            androidx.core.widget.C1226c.m37926c(r7, r8)
        L28:
            int r8 = p100f8.C5429l.f14983L3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f9703A = r8
            int r8 = p100f8.C5429l.f14975K3
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f9704B = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
