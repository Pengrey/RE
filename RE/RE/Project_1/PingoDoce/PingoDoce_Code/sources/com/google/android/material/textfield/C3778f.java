package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes.dex */
public class C3778f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m28951a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C0981a.m38859r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                C0981a.m38862o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m28950b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                C0981a.m38862o(drawable, colorStateList);
            }
            if (mode != null) {
                C0981a.m38861p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    private static int[] m28950b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m28949c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m28950b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = C0981a.m38859r(drawable).mutate();
        C0981a.m38862o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: d */
    private static void m28948d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m38451R = C1112b0.m38451R(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        if (m38451R || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(m38451R);
        checkableImageButton.setPressable(m38451R);
        checkableImageButton.setLongClickable(z2);
        C1112b0.m38479C0(checkableImageButton, z ? 1 : 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m28947e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m28948d(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m28946f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m28948d(checkableImageButton, onLongClickListener);
    }
}
