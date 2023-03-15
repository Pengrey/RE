package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0494j;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.internal.C3632g;
import com.google.android.material.internal.C3646n;
import p100f8.C5419b;
import p100f8.C5428k;
import p100f8.C5429l;
import p419w8.C11602a;

/* loaded from: classes.dex */
public class TextInputEditText extends C0494j {

    /* renamed from: A */
    private final Rect f10588A;

    /* renamed from: B */
    private boolean f10589B;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.f14889q);
    }

    /* renamed from: b */
    private String m29089b(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        String str = BuildConfig.VERSION_NAME;
        String charSequence = z2 ? hint.toString() : BuildConfig.VERSION_NAME;
        if (!z) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : BuildConfig.VERSION_NAME;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: c */
    private boolean m29088c(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f10589B;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m29088c(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f10588A);
        rect.bottom = this.f10588A.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m29088c(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m29068O()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m29068O() && super.getHint() == null && C3632g.m29539a()) {
            setHint(BuildConfig.VERSION_NAME);
        }
    }

    @Override // androidx.appcompat.widget.C0494j, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(m29089b(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m29088c(textInputLayout) && rect != null) {
            this.f10588A.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f10588A);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f10589B = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C11602a.m4640c(context, attributeSet, i, 0), attributeSet, i);
        this.f10588A = new Rect();
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, C5429l.f15025Q5, i, C5428k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m29500h.getBoolean(C5429l.f15033R5, false));
        m29500h.recycle();
    }
}
