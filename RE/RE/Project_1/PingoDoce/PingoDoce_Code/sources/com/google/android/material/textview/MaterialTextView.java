package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p100f8.C5419b;
import p100f8.C5429l;
import p354s8.C10085b;
import p354s8.C10086c;
import p419w8.C11602a;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    private void m28866f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C5429l.f15039S3);
        int m28863i = m28863i(getContext(), obtainStyledAttributes, C5429l.f15055U3, C5429l.f15063V3);
        obtainStyledAttributes.recycle();
        if (m28863i >= 0) {
            setLineHeight(m28863i);
        }
    }

    /* renamed from: g */
    private static boolean m28865g(Context context) {
        return C10085b.m9233b(context, C5419b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m28864h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5429l.f15071W3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C5429l.f15079X3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m28863i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C10086c.m9226d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m28862j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5429l.f15071W3, i, i2);
        int m28863i = m28863i(context, obtainStyledAttributes, C5429l.f15087Y3, C5429l.f15095Z3);
        obtainStyledAttributes.recycle();
        return m28863i != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m28865g(context)) {
            m28866f(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C11602a.m4640c(context, attributeSet, i, i2), attributeSet, i);
        int m28864h;
        Context context2 = getContext();
        if (m28865g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (m28862j(context2, theme, attributeSet, i, i2) || (m28864h = m28864h(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            m28866f(theme, m28864h);
        }
    }
}
