package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1240i;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0479g extends CheckedTextView {

    /* renamed from: x */
    private static final int[] f1611x = {16843016};

    /* renamed from: w */
    private final C0531w f1612w;

    public C0479g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0531w c0531w = this.f1612w;
        if (c0531w != null) {
            c0531w.m40396b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0496k.m40540a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C5586a.m23699b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1240i.m37870s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0531w c0531w = this.f1612w;
        if (c0531w != null) {
            c0531w.m40381q(context, i);
        }
    }

    public C0479g(Context context, AttributeSet attributeSet, int i) {
        super(C0512p0.m40482b(context), attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0531w c0531w = new C0531w(this);
        this.f1612w = c0531w;
        c0531w.m40385m(attributeSet, i);
        c0531w.m40396b();
        C0520s0 m40453v = C0520s0.m40453v(getContext(), attributeSet, f1611x, i, 0);
        setCheckMarkDrawable(m40453v.m40468g(0));
        m40453v.m40452w();
    }
}
