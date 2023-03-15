package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.C3649p;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5428k;
import p198k8.C6608a;
import p252n8.C7688a;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: s0 */
    private static final int f10481s0 = C5428k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: t0 */
    private static final int[][] f10482t0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: o0 */
    private final C7688a f10483o0;

    /* renamed from: p0 */
    private ColorStateList f10484p0;

    /* renamed from: q0 */
    private ColorStateList f10485q0;

    /* renamed from: r0 */
    private boolean f10486r0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14882R);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f10484p0 == null) {
            int m20504d = C6608a.m20504d(this, C5419b.colorSurface);
            int m20504d2 = C6608a.m20504d(this, C5419b.f14886k);
            float dimension = getResources().getDimension(C5421d.mtrl_switch_thumb_elevation);
            if (this.f10483o0.m17713e()) {
                dimension += C3649p.m29489d(this);
            }
            int m17715c = this.f10483o0.m17715c(m20504d, dimension);
            int[][] iArr = f10482t0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C6608a.m20500h(m20504d, m20504d2, 1.0f);
            iArr2[1] = m17715c;
            iArr2[2] = C6608a.m20500h(m20504d, m20504d2, 0.38f);
            iArr2[3] = m17715c;
            this.f10484p0 = new ColorStateList(iArr, iArr2);
        }
        return this.f10484p0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f10485q0 == null) {
            int[][] iArr = f10482t0;
            int[] iArr2 = new int[iArr.length];
            int m20504d = C6608a.m20504d(this, C5419b.colorSurface);
            int m20504d2 = C6608a.m20504d(this, C5419b.f14886k);
            int m20504d3 = C6608a.m20504d(this, C5419b.colorOnSurface);
            iArr2[0] = C6608a.m20500h(m20504d, m20504d2, 0.54f);
            iArr2[1] = C6608a.m20500h(m20504d, m20504d3, 0.32f);
            iArr2[2] = C6608a.m20500h(m20504d, m20504d2, 0.12f);
            iArr2[3] = C6608a.m20500h(m20504d, m20504d3, 0.12f);
            this.f10485q0 = new ColorStateList(iArr, iArr2);
        }
        return this.f10485q0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10486r0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f10486r0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f10486r0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f10481s0
            android.content.Context r7 = p419w8.C11602a.m4640c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            n8.a r7 = new n8.a
            r7.<init>(r0)
            r6.f10483o0 = r7
            int[] r2 = p100f8.C5429l.f15096Z4
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r9 = p100f8.C5429l.f15105a5
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f10486r0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
