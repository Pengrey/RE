package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.p */
/* loaded from: classes.dex */
public class C1206p {

    /* renamed from: a */
    private ViewParent f3573a;

    /* renamed from: b */
    private ViewParent f3574b;

    /* renamed from: c */
    private final View f3575c;

    /* renamed from: d */
    private boolean f3576d;

    /* renamed from: e */
    private int[] f3577e;

    public C1206p(View view) {
        this.f3575c = view;
    }

    /* renamed from: g */
    private boolean m38034g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m38033h;
        int i6;
        int i7;
        int[] iArr3;
        if (!m38029l() || (m38033h = m38033h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3575c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m38032i = m38032i();
            m38032i[0] = 0;
            m38032i[1] = 0;
            iArr3 = m38032i;
        } else {
            iArr3 = iArr2;
        }
        C1160f0.m38190d(m38033h, this.f3575c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f3575c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m38033h(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f3574b;
        }
        return this.f3573a;
    }

    /* renamed from: i */
    private int[] m38032i() {
        if (this.f3577e == null) {
            this.f3577e = new int[2];
        }
        return this.f3577e;
    }

    /* renamed from: n */
    private void m38027n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f3573a = viewParent;
        } else if (i != 1) {
        } else {
            this.f3574b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m38040a(float f, float f2, boolean z) {
        ViewParent m38033h;
        if (!m38029l() || (m38033h = m38033h(0)) == null) {
            return false;
        }
        return C1160f0.m38193a(m38033h, this.f3575c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m38039b(float f, float f2) {
        ViewParent m38033h;
        if (!m38029l() || (m38033h = m38033h(0)) == null) {
            return false;
        }
        return C1160f0.m38192b(m38033h, this.f3575c, f, f2);
    }

    /* renamed from: c */
    public boolean m38038c(int i, int i2, int[] iArr, int[] iArr2) {
        return m38037d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m38037d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m38033h;
        int i4;
        int i5;
        if (!m38029l() || (m38033h = m38033h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f3575c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m38032i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C1160f0.m38191c(m38033h, this.f3575c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f3575c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m38036e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m38034g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m38035f(int i, int i2, int i3, int i4, int[] iArr) {
        return m38034g(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: j */
    public boolean m38031j() {
        return m38030k(0);
    }

    /* renamed from: k */
    public boolean m38030k(int i) {
        return m38033h(i) != null;
    }

    /* renamed from: l */
    public boolean m38029l() {
        return this.f3576d;
    }

    /* renamed from: m */
    public void m38028m(boolean z) {
        if (this.f3576d) {
            C1112b0.m38455O0(this.f3575c);
        }
        this.f3576d = z;
    }

    /* renamed from: o */
    public boolean m38026o(int i) {
        return m38025p(i, 0);
    }

    /* renamed from: p */
    public boolean m38025p(int i, int i2) {
        if (m38030k(i2)) {
            return true;
        }
        if (m38029l()) {
            View view = this.f3575c;
            for (ViewParent parent = this.f3575c.getParent(); parent != null; parent = parent.getParent()) {
                if (C1160f0.m38188f(parent, view, this.f3575c, i, i2)) {
                    m38027n(i2, parent);
                    C1160f0.m38189e(parent, view, this.f3575c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: q */
    public void m38024q() {
        m38023r(0);
    }

    /* renamed from: r */
    public void m38023r(int i) {
        ViewParent m38033h = m38033h(i);
        if (m38033h != null) {
            C1160f0.m38187g(m38033h, this.f3575c, i);
            m38027n(i, null);
        }
    }
}
