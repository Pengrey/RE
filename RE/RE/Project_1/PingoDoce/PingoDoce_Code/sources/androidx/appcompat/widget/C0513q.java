package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.InterfaceC1250k;
import p070e.C4897a;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public class C0513q extends RadioButton implements InterfaceC1250k, InterfaceC1217z {

    /* renamed from: w */
    private final C0481h f1720w;

    /* renamed from: x */
    private final C0463d f1721x;

    /* renamed from: y */
    private final C0531w f1722y;

    public C0513q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.f13364G);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1722y;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0481h c0481h = this.f1720w;
        return c0481h != null ? c0481h.m40605b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1250k
    public ColorStateList getSupportButtonTintList() {
        C0481h c0481h = this.f1720w;
        if (c0481h != null) {
            return c0481h.m40604c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0481h c0481h = this.f1720w;
        if (c0481h != null) {
            return c0481h.m40603d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0481h c0481h = this.f1720w;
        if (c0481h != null) {
            c0481h.m40601f();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1721x;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1250k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0481h c0481h = this.f1720w;
        if (c0481h != null) {
            c0481h.m40600g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC1250k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0481h c0481h = this.f1720w;
        if (c0481h != null) {
            c0481h.m40599h(mode);
        }
    }

    public C0513q(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0481h c0481h = new C0481h(this);
        this.f1720w = c0481h;
        c0481h.m40602e(attributeSet, i);
        C0463d c0463d = new C0463d(this);
        this.f1721x = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1722y = c0531w;
        c0531w.m40385m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C5586a.m23699b(getContext(), i));
    }
}
