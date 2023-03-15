package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.widget.C1226c;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
class C0481h {

    /* renamed from: a */
    private final CompoundButton f1613a;

    /* renamed from: b */
    private ColorStateList f1614b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1615c = null;

    /* renamed from: d */
    private boolean f1616d = false;

    /* renamed from: e */
    private boolean f1617e = false;

    /* renamed from: f */
    private boolean f1618f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0481h(CompoundButton compoundButton) {
        this.f1613a = compoundButton;
    }

    /* renamed from: a */
    void m40606a() {
        Drawable m37928a = C1226c.m37928a(this.f1613a);
        if (m37928a != null) {
            if (this.f1616d || this.f1617e) {
                Drawable mutate = C0981a.m38859r(m37928a).mutate();
                if (this.f1616d) {
                    C0981a.m38862o(mutate, this.f1614b);
                }
                if (this.f1617e) {
                    C0981a.m38861p(mutate, this.f1615c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1613a.getDrawableState());
                }
                this.f1613a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m40605b(int i) {
        Drawable m37928a;
        return (Build.VERSION.SDK_INT >= 17 || (m37928a = C1226c.m37928a(this.f1613a)) == null) ? i : i + m37928a.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40604c() {
        return this.f1614b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40603d() {
        return this.f1615c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40602e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1613a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p070e.C4906j.f13432L0
            r8 = 0
            androidx.appcompat.widget.s0 r0 = androidx.appcompat.widget.C0520s0.m40453v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1613a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m40457r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C1112b0.m38409q0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p070e.C4906j.f13440N0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m40456s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m40461n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f1613a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p111g.C5586a.m23699b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p070e.C4906j.f13436M0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m40456s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m40461n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f1613a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p111g.C5586a.m23699b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p070e.C4906j.f13444O0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m40456s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f1613a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m40472c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1226c.m37926c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p070e.C4906j.f13448P0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m40456s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f1613a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m40464k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0456b0.m40678e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.C1226c.m37925d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m40452w()
            return
        L84:
            r10 = move-exception
            r0.m40452w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0481h.m40602e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40601f() {
        if (this.f1618f) {
            this.f1618f = false;
            return;
        }
        this.f1618f = true;
        m40606a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40600g(ColorStateList colorStateList) {
        this.f1614b = colorStateList;
        this.f1616d = true;
        m40606a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40599h(PorterDuff.Mode mode) {
        this.f1615c = mode;
        this.f1617e = true;
        m40606a();
    }
}
