package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.C1240i;
import androidx.core.widget.InterfaceC1225b;
import androidx.core.widget.InterfaceC1251l;
import p070e.C4897a;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public class C0466e extends Button implements InterfaceC1217z, InterfaceC1225b, InterfaceC1251l {

    /* renamed from: w */
    private final C0463d f1554w;

    /* renamed from: x */
    private final C0531w f1555x;

    public C0466e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.buttonStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            return c0531w.m40393e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeMinTextSize();
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            return c0531w.m40392f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeStepGranularity();
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            return c0531w.m40391g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0531w c0531w = this.f1555x;
        return c0531w != null ? c0531w.m40390h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            return c0531w.m40389i();
        }
        return 0;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1555x.m40388j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1555x.m40387k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40383o(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0531w c0531w = this.f1555x;
        if (c0531w == null || InterfaceC1225b.f3643c || !c0531w.m40386l()) {
            return;
        }
        this.f1555x.m40395c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (InterfaceC1225b.f3643c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40378t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (InterfaceC1225b.f3643c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40377u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC1225b.f3643c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40376v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1240i.m37870s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40379s(z);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1554w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1251l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1555x.m40375w(colorStateList);
        this.f1555x.m40396b();
    }

    @Override // androidx.core.widget.InterfaceC1251l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1555x.m40374x(mode);
        this.f1555x.m40396b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40381q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC1225b.f3643c) {
            super.setTextSize(i, f);
            return;
        }
        C0531w c0531w = this.f1555x;
        if (c0531w != null) {
            c0531w.m40400A(i, f);
        }
    }

    public C0466e(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0463d c0463d = new C0463d(this);
        this.f1554w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1555x = c0531w;
        c0531w.m40385m(attributeSet, i);
        c0531w.m40396b();
    }
}
