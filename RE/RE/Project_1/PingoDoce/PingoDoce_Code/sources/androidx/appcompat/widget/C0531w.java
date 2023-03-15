package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0955h;
import androidx.core.view.C1112b0;
import androidx.core.widget.InterfaceC1225b;
import java.lang.ref.WeakReference;
import p070e.C4906j;
import p192k2.C6558a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0531w {

    /* renamed from: a */
    private final TextView f1777a;

    /* renamed from: b */
    private C0514q0 f1778b;

    /* renamed from: c */
    private C0514q0 f1779c;

    /* renamed from: d */
    private C0514q0 f1780d;

    /* renamed from: e */
    private C0514q0 f1781e;

    /* renamed from: f */
    private C0514q0 f1782f;

    /* renamed from: g */
    private C0514q0 f1783g;

    /* renamed from: h */
    private C0514q0 f1784h;

    /* renamed from: i */
    private final C0535x f1785i;

    /* renamed from: j */
    private int f1786j = 0;

    /* renamed from: k */
    private int f1787k = -1;

    /* renamed from: l */
    private Typeface f1788l;

    /* renamed from: m */
    private boolean f1789m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    public class C0532a extends C0955h.AbstractC0961f {

        /* renamed from: a */
        final /* synthetic */ int f1790a;

        /* renamed from: b */
        final /* synthetic */ int f1791b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1792c;

        C0532a(int i, int i2, WeakReference weakReference) {
            this.f1790a = i;
            this.f1791b = i2;
            this.f1792c = weakReference;
        }

        @Override // androidx.core.content.res.C0955h.AbstractC0961f
        /* renamed from: h */
        public void mo9203h(int i) {
        }

        @Override // androidx.core.content.res.C0955h.AbstractC0961f
        /* renamed from: i */
        public void mo9202i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1790a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1791b & 2) != 0);
            }
            C0531w.this.m40384n(this.f1792c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes.dex */
    public class RunnableC0533b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ TextView f1794w;

        /* renamed from: x */
        final /* synthetic */ Typeface f1795x;

        /* renamed from: y */
        final /* synthetic */ int f1796y;

        RunnableC0533b(C0531w c0531w, TextView textView, Typeface typeface, int i) {
            this.f1794w = textView;
            this.f1795x = typeface;
            this.f1796y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1794w.setTypeface(this.f1795x, this.f1796y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0531w(TextView textView) {
        this.f1777a = textView;
        this.f1785i = new C0535x(textView);
    }

    /* renamed from: B */
    private void m40399B(int i, float f) {
        this.f1785i.m40337y(i, f);
    }

    /* renamed from: C */
    private void m40398C(Context context, C0520s0 c0520s0) {
        String m40460o;
        this.f1786j = c0520s0.m40464k(C4906j.f13426J2, this.f1786j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m40464k = c0520s0.m40464k(C4906j.f13446O2, -1);
            this.f1787k = m40464k;
            if (m40464k != -1) {
                this.f1786j = (this.f1786j & 2) | 0;
            }
        }
        int i2 = C4906j.f13442N2;
        if (!c0520s0.m40456s(i2) && !c0520s0.m40456s(C4906j.f13450P2)) {
            int i3 = C4906j.f13422I2;
            if (c0520s0.m40456s(i3)) {
                this.f1789m = false;
                int m40464k2 = c0520s0.m40464k(i3, 1);
                if (m40464k2 == 1) {
                    this.f1788l = Typeface.SANS_SERIF;
                    return;
                } else if (m40464k2 == 2) {
                    this.f1788l = Typeface.SERIF;
                    return;
                } else if (m40464k2 != 3) {
                    return;
                } else {
                    this.f1788l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1788l = null;
        int i4 = C4906j.f13450P2;
        if (c0520s0.m40456s(i4)) {
            i2 = i4;
        }
        int i5 = this.f1787k;
        int i6 = this.f1786j;
        if (!context.isRestricted()) {
            try {
                Typeface m40465j = c0520s0.m40465j(i2, this.f1786j, new C0532a(i5, i6, new WeakReference(this.f1777a)));
                if (m40465j != null) {
                    if (i >= 28 && this.f1787k != -1) {
                        this.f1788l = Typeface.create(Typeface.create(m40465j, 0), this.f1787k, (this.f1786j & 2) != 0);
                    } else {
                        this.f1788l = m40465j;
                    }
                }
                this.f1789m = this.f1788l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1788l != null || (m40460o = c0520s0.m40460o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1787k != -1) {
            this.f1788l = Typeface.create(Typeface.create(m40460o, 0), this.f1787k, (this.f1786j & 2) != 0);
        } else {
            this.f1788l = Typeface.create(m40460o, this.f1786j);
        }
    }

    /* renamed from: a */
    private void m40397a(Drawable drawable, C0514q0 c0514q0) {
        if (drawable == null || c0514q0 == null) {
            return;
        }
        C0484i.m40583i(drawable, c0514q0, this.f1777a.getDrawableState());
    }

    /* renamed from: d */
    private static C0514q0 m40394d(Context context, C0484i c0484i, int i) {
        ColorStateList m40586f = c0484i.m40586f(context, i);
        if (m40586f != null) {
            C0514q0 c0514q0 = new C0514q0();
            c0514q0.f1726d = true;
            c0514q0.f1723a = m40586f;
            return c0514q0;
        }
        return null;
    }

    /* renamed from: y */
    private void m40373y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1777a.getCompoundDrawablesRelative();
            TextView textView = this.f1777a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1777a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1777a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1777a.getCompoundDrawables();
            TextView textView3 = this.f1777a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: z */
    private void m40372z() {
        C0514q0 c0514q0 = this.f1784h;
        this.f1778b = c0514q0;
        this.f1779c = c0514q0;
        this.f1780d = c0514q0;
        this.f1781e = c0514q0;
        this.f1782f = c0514q0;
        this.f1783g = c0514q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m40400A(int i, float f) {
        if (InterfaceC1225b.f3643c || m40386l()) {
            return;
        }
        m40399B(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40396b() {
        if (this.f1778b != null || this.f1779c != null || this.f1780d != null || this.f1781e != null) {
            Drawable[] compoundDrawables = this.f1777a.getCompoundDrawables();
            m40397a(compoundDrawables[0], this.f1778b);
            m40397a(compoundDrawables[1], this.f1779c);
            m40397a(compoundDrawables[2], this.f1780d);
            m40397a(compoundDrawables[3], this.f1781e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1782f == null && this.f1783g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1777a.getCompoundDrawablesRelative();
            m40397a(compoundDrawablesRelative[0], this.f1782f);
            m40397a(compoundDrawablesRelative[2], this.f1783g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40395c() {
        this.f1785i.m40360b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m40393e() {
        return this.f1785i.m40352j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m40392f() {
        return this.f1785i.m40351k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m40391g() {
        return this.f1785i.m40350l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m40390h() {
        return this.f1785i.m40349m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m40389i() {
        return this.f1785i.m40348n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m40388j() {
        C0514q0 c0514q0 = this.f1784h;
        if (c0514q0 != null) {
            return c0514q0.f1723a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m40387k() {
        C0514q0 c0514q0 = this.f1784h;
        if (c0514q0 != null) {
            return c0514q0.f1724b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m40386l() {
        return this.f1785i.m40343s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40385m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0531w.m40385m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m40384n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1789m) {
            this.f1788l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C1112b0.m38447V(textView)) {
                    textView.post(new RunnableC0533b(this, textView, typeface, this.f1786j));
                } else {
                    textView.setTypeface(typeface, this.f1786j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m40383o(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC1225b.f3643c) {
            return;
        }
        m40395c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m40382p() {
        m40396b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m40381q(Context context, int i) {
        String m40460o;
        ColorStateList m40472c;
        ColorStateList m40472c2;
        ColorStateList m40472c3;
        C0520s0 m40455t = C0520s0.m40455t(context, i, C4906j.f13412G2);
        int i2 = C4906j.f13458R2;
        if (m40455t.m40456s(i2)) {
            m40379s(m40455t.m40474a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C4906j.f13430K2;
            if (m40455t.m40456s(i4) && (m40472c3 = m40455t.m40472c(i4)) != null) {
                this.f1777a.setTextColor(m40472c3);
            }
            int i5 = C4906j.f13438M2;
            if (m40455t.m40456s(i5) && (m40472c2 = m40455t.m40472c(i5)) != null) {
                this.f1777a.setLinkTextColor(m40472c2);
            }
            int i6 = C4906j.f13434L2;
            if (m40455t.m40456s(i6) && (m40472c = m40455t.m40472c(i6)) != null) {
                this.f1777a.setHintTextColor(m40472c);
            }
        }
        int i7 = C4906j.f13417H2;
        if (m40455t.m40456s(i7) && m40455t.m40469f(i7, -1) == 0) {
            this.f1777a.setTextSize(0, 0.0f);
        }
        m40398C(context, m40455t);
        if (i3 >= 26) {
            int i8 = C4906j.f13454Q2;
            if (m40455t.m40456s(i8) && (m40460o = m40455t.m40460o(i8)) != null) {
                this.f1777a.setFontVariationSettings(m40460o);
            }
        }
        m40455t.m40452w();
        Typeface typeface = this.f1788l;
        if (typeface != null) {
            this.f1777a.setTypeface(typeface, this.f1786j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m40380r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C6558a.m20578f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m40379s(boolean z) {
        this.f1777a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m40378t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1785i.m40341u(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m40377u(int[] iArr, int i) throws IllegalArgumentException {
        this.f1785i.m40340v(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m40376v(int i) {
        this.f1785i.m40339w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m40375w(ColorStateList colorStateList) {
        if (this.f1784h == null) {
            this.f1784h = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1784h;
        c0514q0.f1723a = colorStateList;
        c0514q0.f1726d = colorStateList != null;
        m40372z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m40374x(PorterDuff.Mode mode) {
        if (this.f1784h == null) {
            this.f1784h = new C0514q0();
        }
        C0514q0 c0514q0 = this.f1784h;
        c0514q0.f1724b = mode;
        c0514q0.f1725c = mode != null;
        m40372z();
    }
}
