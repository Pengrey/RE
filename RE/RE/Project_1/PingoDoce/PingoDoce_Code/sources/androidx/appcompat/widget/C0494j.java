package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1112b0;
import androidx.core.view.C1137c;
import androidx.core.view.InterfaceC1213w;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.C1240i;
import androidx.core.widget.C1247j;
import p070e.C4897a;
import p192k2.C6558a;
import p192k2.C6560b;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public class C0494j extends EditText implements InterfaceC1217z, InterfaceC1213w {

    /* renamed from: w */
    private final C0463d f1644w;

    /* renamed from: x */
    private final C0531w f1645x;

    /* renamed from: y */
    private final C0527v f1646y;

    /* renamed from: z */
    private final C1247j f1647z;

    public C0494j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.f13363B);
    }

    @Override // androidx.core.view.InterfaceC1213w
    /* renamed from: a */
    public C1137c mo38017a(C1137c c1137c) {
        return this.f1647z.mo37840a(this, c1137c);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            c0463d.m40660b();
        }
        C0531w c0531w = this.f1645x;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            return c0463d.m40659c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            return c0463d.m40658d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0527v c0527v;
        if (Build.VERSION.SDK_INT < 28 && (c0527v = this.f1646y) != null) {
            return c0527v.m40410a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1645x.m40380r(this, onCreateInputConnection, editorInfo);
        InputConnection m40540a = C0496k.m40540a(onCreateInputConnection, editorInfo, this);
        String[] m38470H = C1112b0.m38470H(this);
        if (m40540a == null || m38470H == null) {
            return m40540a;
        }
        C6558a.m20580d(editorInfo, m38470H);
        return C6560b.m20574a(m40540a, editorInfo, C0517s.m40480a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0517s.m40479b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C0517s.m40478c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            c0463d.m40656f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            c0463d.m40655g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1240i.m37870s(this, callback));
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            c0463d.m40653i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0463d c0463d = this.f1644w;
        if (c0463d != null) {
            c0463d.m40652j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0531w c0531w = this.f1645x;
        if (c0531w != null) {
            c0531w.m40381q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0527v c0527v;
        if (Build.VERSION.SDK_INT < 28 && (c0527v = this.f1646y) != null) {
            c0527v.m40409b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public C0494j(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0463d c0463d = new C0463d(this);
        this.f1644w = c0463d;
        c0463d.m40657e(attributeSet, i);
        C0531w c0531w = new C0531w(this);
        this.f1645x = c0531w;
        c0531w.m40385m(attributeSet, i);
        c0531w.m40396b();
        this.f1646y = new C0527v(this);
        this.f1647z = new C1247j();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
