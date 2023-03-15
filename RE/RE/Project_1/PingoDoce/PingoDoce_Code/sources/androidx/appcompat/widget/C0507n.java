package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.InterfaceC1217z;
import p070e.C4897a;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0507n extends MultiAutoCompleteTextView implements InterfaceC1217z {

    /* renamed from: y */
    private static final int[] f1701y = {16843126};

    /* renamed from: w */
    private final C0463d f1702w;

    /* renamed from: x */
    private final C0531w f1703x;

    public C0507n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.f13367p);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1703x;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0496k.m40540a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C5586a.m23699b(getContext(), i));
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1702w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0531w c0531w = this.f1703x;
        if (c0531w != null) {
            c0531w.m40381q(context, i);
        }
    }

    public C0507n(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0520s0 m40453v = C0520s0.m40453v(getContext(), attributeSet, f1701y, i, 0);
        if (m40453v.m40456s(0)) {
            setDropDownBackgroundDrawable(m40453v.m40468g(0));
        }
        m40453v.m40452w();
        C0463d c0463d = new C0463d(this);
        this.f1702w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1703x = c0531w;
        c0531w.m40385m(attributeSet, i);
        c0531w.m40396b();
    }
}
