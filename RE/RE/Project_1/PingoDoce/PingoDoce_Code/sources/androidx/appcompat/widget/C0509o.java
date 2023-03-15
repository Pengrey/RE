package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1237h;
import p070e.C4906j;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
class C0509o extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1711b;

    /* renamed from: a */
    private boolean f1712a;

    static {
        f1711b = Build.VERSION.SDK_INT < 21;
    }

    public C0509o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m40489a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m40489a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, C4906j.f13441N1, i, i2);
        int i3 = C4906j.f13449P1;
        if (m40453v.m40456s(i3)) {
            m40488b(m40453v.m40474a(i3, false));
        }
        setBackgroundDrawable(m40453v.m40468g(C4906j.f13445O1));
        m40453v.m40452w();
    }

    /* renamed from: b */
    private void m40488b(boolean z) {
        if (f1711b) {
            this.f1712a = z;
        } else {
            C1237h.m37896a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1711b && this.f1712a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1711b && this.f1712a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1711b && this.f1712a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
