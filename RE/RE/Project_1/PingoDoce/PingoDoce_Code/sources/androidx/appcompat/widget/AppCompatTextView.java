package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0975d;
import androidx.core.text.C1055d;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.C1240i;
import androidx.core.widget.InterfaceC1225b;
import androidx.core.widget.InterfaceC1251l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p111g.C5586a;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC1217z, InterfaceC1251l, InterfaceC1225b {

    /* renamed from: A */
    private Future<C1055d> f1303A;

    /* renamed from: w */
    private final C0463d f1304w;

    /* renamed from: x */
    private final C0531w f1305x;

    /* renamed from: y */
    private final C0527v f1306y;

    /* renamed from: z */
    private boolean f1307z;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m40831c() {
        Future<C1055d> future = this.f1303A;
        if (future != null) {
            try {
                this.f1303A = null;
                C1240i.m37873p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0531w c0531w = this.f1305x;
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
        C0531w c0531w = this.f1305x;
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
        C0531w c0531w = this.f1305x;
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
        C0531w c0531w = this.f1305x;
        return c0531w != null ? c0531w.m40390h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC1225b.f3643c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            return c0531w.m40389i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C1240i.m37887b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C1240i.m37886c(this);
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1305x.m40388j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1305x.m40387k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m40831c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0527v c0527v;
        if (Build.VERSION.SDK_INT < 28 && (c0527v = this.f1306y) != null) {
            return c0527v.m40410a();
        }
        return super.getTextClassifier();
    }

    public C1055d.C1056a getTextMetricsParamsCompat() {
        return C1240i.m37882g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1305x.m40380r(this, onCreateInputConnection, editorInfo);
        return C0496k.m40540a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40383o(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m40831c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0531w c0531w = this.f1305x;
        if (c0531w == null || InterfaceC1225b.f3643c || !c0531w.m40386l()) {
            return;
        }
        this.f1305x.m40395c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (InterfaceC1225b.f3643c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0531w c0531w = this.f1305x;
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
        C0531w c0531w = this.f1305x;
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
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40376v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1240i.m37870s(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1240i.m37876m(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1240i.m37875n(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C1240i.m37874o(this, i);
    }

    public void setPrecomputedText(C1055d c1055d) {
        C1240i.m37873p(this, c1055d);
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1304w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1251l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1305x.m40375w(colorStateList);
        this.f1305x.m40396b();
    }

    @Override // androidx.core.widget.InterfaceC1251l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1305x.m40374x(mode);
        this.f1305x.m40396b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40381q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0527v c0527v;
        if (Build.VERSION.SDK_INT < 28 && (c0527v = this.f1306y) != null) {
            c0527v.m40409b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<C1055d> future) {
        this.f1303A = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1055d.C1056a c1056a) {
        C1240i.m37871r(this, c1056a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC1225b.f3643c) {
            super.setTextSize(i, f);
            return;
        }
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40400A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.f1307z) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = C0975d.m38917a(getContext(), typeface, i);
        }
        this.f1307z = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1307z = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        this.f1307z = false;
        C0508n0.m40495a(this, getContext());
        C0463d c0463d = new C0463d(this);
        this.f1304w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1305x = c0531w;
        c0531w.m40385m(attributeSet, i);
        c0531w.m40396b();
        this.f1306y = new C0527v(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C5586a.m23699b(context, i) : null, i2 != 0 ? C5586a.m23699b(context, i2) : null, i3 != 0 ? C5586a.m23699b(context, i3) : null, i4 != 0 ? C5586a.m23699b(context, i4) : null);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C5586a.m23699b(context, i) : null, i2 != 0 ? C5586a.m23699b(context, i2) : null, i3 != 0 ? C5586a.m23699b(context, i3) : null, i4 != 0 ? C5586a.m23699b(context, i4) : null);
        C0531w c0531w = this.f1305x;
        if (c0531w != null) {
            c0531w.m40382p();
        }
    }
}
