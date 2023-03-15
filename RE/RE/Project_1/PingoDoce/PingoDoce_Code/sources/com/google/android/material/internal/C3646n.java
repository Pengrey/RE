package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0520s0;
import p100f8.C5419b;
import p100f8.C5429l;

/* renamed from: com.google.android.material.internal.n */
/* loaded from: classes.dex */
public final class C3646n {

    /* renamed from: a */
    private static final int[] f10228a = {C5419b.f14888n};

    /* renamed from: b */
    private static final int[] f10229b = {C5419b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m29507a(Context context) {
        m29503e(context, f10228a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m29506b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15161g7, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C5429l.f15179i7, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C5419b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m29505c(context);
            }
        }
        m29507a(context);
    }

    /* renamed from: c */
    public static void m29505c(Context context) {
        m29503e(context, f10229b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m29504d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15161g7, i, i2);
        if (!obtainStyledAttributes.getBoolean(C5429l.f15188j7, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m29502f(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            z = obtainStyledAttributes.getResourceId(C5429l.f15170h7, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m29503e(Context context, int[] iArr, String str) {
        if (m29501g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m29502f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m29501g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m29500h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m29506b(context, attributeSet, i, i2);
        m29504d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0520s0 m29499i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m29506b(context, attributeSet, i, i2);
        m29504d(context, attributeSet, iArr, i, i2, iArr2);
        return C0520s0.m40453v(context, attributeSet, iArr, i, i2);
    }
}
