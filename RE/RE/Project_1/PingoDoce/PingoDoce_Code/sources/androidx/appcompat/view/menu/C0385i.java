package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import p070e.C4900d;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public class C0385i {

    /* renamed from: a */
    private final Context f1128a;

    /* renamed from: b */
    private final C0378e f1129b;

    /* renamed from: c */
    private final boolean f1130c;

    /* renamed from: d */
    private final int f1131d;

    /* renamed from: e */
    private final int f1132e;

    /* renamed from: f */
    private View f1133f;

    /* renamed from: g */
    private int f1134g;

    /* renamed from: h */
    private boolean f1135h;

    /* renamed from: i */
    private InterfaceC0387j.InterfaceC0388a f1136i;

    /* renamed from: j */
    private AbstractC0384h f1137j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1138k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1139l;

    /* compiled from: MenuPopupHelper.java */
    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class C0386a implements PopupWindow.OnDismissListener {
        C0386a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0385i.this.mo40875e();
        }
    }

    public C0385i(Context context, C0378e c0378e, View view, boolean z, int i) {
        this(context, c0378e, view, z, i, 0);
    }

    /* renamed from: a */
    private AbstractC0384h m40963a() {
        AbstractC0384h view$OnKeyListenerC0391l;
        Display defaultDisplay = ((WindowManager) this.f1128a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f1128a.getResources().getDimensionPixelSize(C4900d.abc_cascading_menus_min_smallest_width)) {
            view$OnKeyListenerC0391l = new View$OnKeyListenerC0369b(this.f1128a, this.f1133f, this.f1131d, this.f1132e, this.f1130c);
        } else {
            view$OnKeyListenerC0391l = new View$OnKeyListenerC0391l(this.f1128a, this.f1129b, this.f1133f, this.f1131d, this.f1132e, this.f1130c);
        }
        view$OnKeyListenerC0391l.mo40948n(this.f1129b);
        view$OnKeyListenerC0391l.mo40943w(this.f1139l);
        view$OnKeyListenerC0391l.mo40947r(this.f1133f);
        view$OnKeyListenerC0391l.mo40949m(this.f1136i);
        view$OnKeyListenerC0391l.mo40946t(this.f1135h);
        view$OnKeyListenerC0391l.mo40945u(this.f1134g);
        return view$OnKeyListenerC0391l;
    }

    /* renamed from: l */
    private void m40953l(int i, int i2, boolean z, boolean z2) {
        AbstractC0384h m40961c = m40961c();
        m40961c.mo40942x(z2);
        if (z) {
            if ((C1158f.m38197b(this.f1134g, C1112b0.m38476E(this.f1133f)) & 7) == 5) {
                i -= this.f1133f.getWidth();
            }
            m40961c.mo40944v(i);
            m40961c.mo40941y(i2);
            int i3 = (int) ((this.f1128a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m40961c.m40965s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m40961c.mo19710a();
    }

    /* renamed from: b */
    public void m40962b() {
        if (m40960d()) {
            this.f1137j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0384h m40961c() {
        if (this.f1137j == null) {
            this.f1137j = m40963a();
        }
        return this.f1137j;
    }

    /* renamed from: d */
    public boolean m40960d() {
        AbstractC0384h abstractC0384h = this.f1137j;
        return abstractC0384h != null && abstractC0384h.mo19709c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40875e() {
        this.f1137j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1138k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m40959f(View view) {
        this.f1133f = view;
    }

    /* renamed from: g */
    public void m40958g(boolean z) {
        this.f1135h = z;
        AbstractC0384h abstractC0384h = this.f1137j;
        if (abstractC0384h != null) {
            abstractC0384h.mo40946t(z);
        }
    }

    /* renamed from: h */
    public void m40957h(int i) {
        this.f1134g = i;
    }

    /* renamed from: i */
    public void m40956i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1138k = onDismissListener;
    }

    /* renamed from: j */
    public void m40955j(InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
        this.f1136i = interfaceC0388a;
        AbstractC0384h abstractC0384h = this.f1137j;
        if (abstractC0384h != null) {
            abstractC0384h.mo40949m(interfaceC0388a);
        }
    }

    /* renamed from: k */
    public void m40954k() {
        if (!m40952m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m40952m() {
        if (m40960d()) {
            return true;
        }
        if (this.f1133f == null) {
            return false;
        }
        m40953l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m40951n(int i, int i2) {
        if (m40960d()) {
            return true;
        }
        if (this.f1133f == null) {
            return false;
        }
        m40953l(i, i2, true, true);
        return true;
    }

    public C0385i(Context context, C0378e c0378e, View view, boolean z, int i, int i2) {
        this.f1134g = 8388611;
        this.f1139l = new C0386a();
        this.f1128a = context;
        this.f1129b = c0378e;
        this.f1133f = view;
        this.f1130c = z;
        this.f1131d = i;
        this.f1132e = i2;
    }
}
