package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1112b0;
import p070e.C4906j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0463d {

    /* renamed from: a */
    private final View f1548a;

    /* renamed from: d */
    private C0514q0 f1551d;

    /* renamed from: e */
    private C0514q0 f1552e;

    /* renamed from: f */
    private C0514q0 f1553f;

    /* renamed from: c */
    private int f1550c = -1;

    /* renamed from: b */
    private final C0484i f1549b = C0484i.m40590b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0463d(View view) {
        this.f1548a = view;
    }

    /* renamed from: a */
    private boolean m40661a(Drawable drawable) {
        if (this.f1553f == null) {
            this.f1553f = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1553f;
        c0514q0.m40481a();
        ColorStateList m38402u = C1112b0.m38402u(this.f1548a);
        if (m38402u != null) {
            c0514q0.f1726d = true;
            c0514q0.f1723a = m38402u;
        }
        PorterDuff.Mode m38400v = C1112b0.m38400v(this.f1548a);
        if (m38400v != null) {
            c0514q0.f1725c = true;
            c0514q0.f1724b = m38400v;
        }
        if (c0514q0.f1726d || c0514q0.f1725c) {
            C0484i.m40583i(drawable, c0514q0, this.f1548a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m40651k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1551d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40660b() {
        Drawable background = this.f1548a.getBackground();
        if (background != null) {
            if (m40651k() && m40661a(background)) {
                return;
            }
            C0514q0 c0514q0 = this.f1552e;
            if (c0514q0 != null) {
                C0484i.m40583i(background, c0514q0, this.f1548a.getDrawableState());
                return;
            }
            C0514q0 c0514q02 = this.f1551d;
            if (c0514q02 != null) {
                C0484i.m40583i(background, c0514q02, this.f1548a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40659c() {
        C0514q0 c0514q0 = this.f1552e;
        if (c0514q0 != null) {
            return c0514q0.f1723a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40658d() {
        C0514q0 c0514q0 = this.f1552e;
        if (c0514q0 != null) {
            return c0514q0.f1724b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40657e(AttributeSet attributeSet, int i) {
        Context context = this.f1548a.getContext();
        int[] iArr = C4906j.f13383A3;
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, iArr, i, 0);
        View view = this.f1548a;
        C1112b0.m38409q0(view, view.getContext(), iArr, attributeSet, m40453v.m40457r(), i, 0);
        try {
            int i2 = C4906j.f13388B3;
            if (m40453v.m40456s(i2)) {
                this.f1550c = m40453v.m40461n(i2, -1);
                ColorStateList m40586f = this.f1549b.m40586f(this.f1548a.getContext(), this.f1550c);
                if (m40586f != null) {
                    m40654h(m40586f);
                }
            }
            int i3 = C4906j.f13393C3;
            if (m40453v.m40456s(i3)) {
                C1112b0.m38397w0(this.f1548a, m40453v.m40472c(i3));
            }
            int i4 = C4906j.f13398D3;
            if (m40453v.m40456s(i4)) {
                C1112b0.m38395x0(this.f1548a, C0456b0.m40678e(m40453v.m40464k(i4, -1), null));
            }
        } finally {
            m40453v.m40452w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40656f(Drawable drawable) {
        this.f1550c = -1;
        m40654h(null);
        m40660b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40655g(int i) {
        this.f1550c = i;
        C0484i c0484i = this.f1549b;
        m40654h(c0484i != null ? c0484i.m40586f(this.f1548a.getContext(), i) : null);
        m40660b();
    }

    /* renamed from: h */
    void m40654h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1551d == null) {
                this.f1551d = new C0514q0();
            }
            C0514q0 c0514q0 = this.f1551d;
            c0514q0.f1723a = colorStateList;
            c0514q0.f1726d = true;
        } else {
            this.f1551d = null;
        }
        m40660b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40653i(ColorStateList colorStateList) {
        if (this.f1552e == null) {
            this.f1552e = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1552e;
        c0514q0.f1723a = colorStateList;
        c0514q0.f1726d = true;
        m40660b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m40652j(PorterDuff.Mode mode) {
        if (this.f1552e == null) {
            this.f1552e = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1552e;
        c0514q0.f1724b = mode;
        c0514q0.f1725c = true;
        m40660b();
    }
}
