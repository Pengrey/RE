package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C1112b0;
import androidx.core.widget.C1232e;
import p070e.C4906j;
import p111g.C5586a;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0504m {

    /* renamed from: a */
    private final ImageView f1678a;

    /* renamed from: b */
    private C0514q0 f1679b;

    /* renamed from: c */
    private C0514q0 f1680c;

    /* renamed from: d */
    private C0514q0 f1681d;

    public C0504m(ImageView imageView) {
        this.f1678a = imageView;
    }

    /* renamed from: a */
    private boolean m40523a(Drawable drawable) {
        if (this.f1681d == null) {
            this.f1681d = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1681d;
        c0514q0.m40481a();
        ColorStateList m37911a = C1232e.m37911a(this.f1678a);
        if (m37911a != null) {
            c0514q0.f1726d = true;
            c0514q0.f1723a = m37911a;
        }
        PorterDuff.Mode m37910b = C1232e.m37910b(this.f1678a);
        if (m37910b != null) {
            c0514q0.f1725c = true;
            c0514q0.f1724b = m37910b;
        }
        if (c0514q0.f1726d || c0514q0.f1725c) {
            C0484i.m40583i(drawable, c0514q0, this.f1678a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m40514j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1679b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40522b() {
        Drawable drawable = this.f1678a.getDrawable();
        if (drawable != null) {
            C0456b0.m40681b(drawable);
        }
        if (drawable != null) {
            if (m40514j() && m40523a(drawable)) {
                return;
            }
            C0514q0 c0514q0 = this.f1680c;
            if (c0514q0 != null) {
                C0484i.m40583i(drawable, c0514q0, this.f1678a.getDrawableState());
                return;
            }
            C0514q0 c0514q02 = this.f1679b;
            if (c0514q02 != null) {
                C0484i.m40583i(drawable, c0514q02, this.f1678a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40521c() {
        C0514q0 c0514q0 = this.f1680c;
        if (c0514q0 != null) {
            return c0514q0.f1723a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40520d() {
        C0514q0 c0514q0 = this.f1680c;
        if (c0514q0 != null) {
            return c0514q0.f1724b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m40519e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1678a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m40518f(AttributeSet attributeSet, int i) {
        int m40461n;
        Context context = this.f1678a.getContext();
        int[] iArr = C4906j.f13435M;
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1678a;
        C1112b0.m38409q0(imageView, imageView.getContext(), iArr, attributeSet, m40453v.m40457r(), i, 0);
        try {
            Drawable drawable = this.f1678a.getDrawable();
            if (drawable == null && (m40461n = m40453v.m40461n(C4906j.f13439N, -1)) != -1 && (drawable = C5586a.m23699b(this.f1678a.getContext(), m40461n)) != null) {
                this.f1678a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0456b0.m40681b(drawable);
            }
            int i2 = C4906j.f13443O;
            if (m40453v.m40456s(i2)) {
                C1232e.m37909c(this.f1678a, m40453v.m40472c(i2));
            }
            int i3 = C4906j.f13447P;
            if (m40453v.m40456s(i3)) {
                C1232e.m37908d(this.f1678a, C0456b0.m40678e(m40453v.m40464k(i3, -1), null));
            }
        } finally {
            m40453v.m40452w();
        }
    }

    /* renamed from: g */
    public void m40517g(int i) {
        if (i != 0) {
            Drawable m23699b = C5586a.m23699b(this.f1678a.getContext(), i);
            if (m23699b != null) {
                C0456b0.m40681b(m23699b);
            }
            this.f1678a.setImageDrawable(m23699b);
        } else {
            this.f1678a.setImageDrawable(null);
        }
        m40522b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40516h(ColorStateList colorStateList) {
        if (this.f1680c == null) {
            this.f1680c = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1680c;
        c0514q0.f1723a = colorStateList;
        c0514q0.f1726d = true;
        m40522b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40515i(PorterDuff.Mode mode) {
        if (this.f1680c == null) {
            this.f1680c = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1680c;
        c0514q0.f1724b = mode;
        c0514q0.f1725c = true;
        m40522b();
    }
}
