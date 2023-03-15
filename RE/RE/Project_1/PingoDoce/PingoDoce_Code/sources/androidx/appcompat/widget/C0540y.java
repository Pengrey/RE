package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.InterfaceC1217z;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0540y extends ToggleButton implements InterfaceC1217z {

    /* renamed from: w */
    private final C0463d f1820w;

    /* renamed from: x */
    private final C0531w f1821x;

    public C0540y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1821x;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1820w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    public C0540y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0463d c0463d = new C0463d(this);
        this.f1820w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1821x = c0531w;
        c0531w.m40385m(attributeSet, i);
    }
}
