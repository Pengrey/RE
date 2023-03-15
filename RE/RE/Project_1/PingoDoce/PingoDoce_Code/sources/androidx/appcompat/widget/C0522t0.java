package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1112b0;
import androidx.core.view.C1166h0;
import androidx.core.view.C1174j0;
import p070e.C4897a;
import p070e.C4901e;
import p070e.C4902f;
import p070e.C4904h;
import p070e.C4906j;
import p111g.C5586a;
import p209l.C6945a;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0522t0 implements InterfaceC0454a0 {

    /* renamed from: a */
    Toolbar f1734a;

    /* renamed from: b */
    private int f1735b;

    /* renamed from: c */
    private View f1736c;

    /* renamed from: d */
    private View f1737d;

    /* renamed from: e */
    private Drawable f1738e;

    /* renamed from: f */
    private Drawable f1739f;

    /* renamed from: g */
    private Drawable f1740g;

    /* renamed from: h */
    private boolean f1741h;

    /* renamed from: i */
    CharSequence f1742i;

    /* renamed from: j */
    private CharSequence f1743j;

    /* renamed from: k */
    private CharSequence f1744k;

    /* renamed from: l */
    Window.Callback f1745l;

    /* renamed from: m */
    boolean f1746m;

    /* renamed from: n */
    private ActionMenuPresenter f1747n;

    /* renamed from: o */
    private int f1748o;

    /* renamed from: p */
    private int f1749p;

    /* renamed from: q */
    private Drawable f1750q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.t0$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0523a implements View.OnClickListener {

        /* renamed from: w */
        final C6945a f1751w;

        View$OnClickListenerC0523a() {
            this.f1751w = new C6945a(C0522t0.this.f1734a.getContext(), 0, 16908332, 0, 0, C0522t0.this.f1742i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0522t0 c0522t0 = C0522t0.this;
            Window.Callback callback = c0522t0.f1745l;
            if (callback == null || !c0522t0.f1746m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1751w);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* renamed from: androidx.appcompat.widget.t0$b */
    /* loaded from: classes.dex */
    class C0524b extends C1174j0 {

        /* renamed from: a */
        private boolean f1753a = false;

        /* renamed from: b */
        final /* synthetic */ int f1754b;

        C0524b(int i) {
            this.f1754b = i;
        }

        @Override // androidx.core.view.C1174j0, androidx.core.view.InterfaceC1172i0
        /* renamed from: a */
        public void mo38143a(View view) {
            this.f1753a = true;
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            if (this.f1753a) {
                return;
            }
            C0522t0.this.f1734a.setVisibility(this.f1754b);
        }

        @Override // androidx.core.view.C1174j0, androidx.core.view.InterfaceC1172i0
        /* renamed from: c */
        public void mo20605c(View view) {
            C0522t0.this.f1734a.setVisibility(0);
        }
    }

    public C0522t0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C4904h.abc_action_bar_up_description, C4901e.abc_ic_ab_back_material);
    }

    /* renamed from: E */
    private void m40447E(CharSequence charSequence) {
        this.f1742i = charSequence;
        if ((this.f1735b & 8) != 0) {
            this.f1734a.setTitle(charSequence);
        }
    }

    /* renamed from: F */
    private void m40446F() {
        if ((this.f1735b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1744k)) {
                this.f1734a.setNavigationContentDescription(this.f1749p);
            } else {
                this.f1734a.setNavigationContentDescription(this.f1744k);
            }
        }
    }

    /* renamed from: G */
    private void m40445G() {
        if ((this.f1735b & 4) != 0) {
            Toolbar toolbar = this.f1734a;
            Drawable drawable = this.f1740g;
            if (drawable == null) {
                drawable = this.f1750q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1734a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: H */
    private void m40444H() {
        Drawable drawable;
        int i = this.f1735b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1739f;
            if (drawable == null) {
                drawable = this.f1738e;
            }
        } else {
            drawable = this.f1738e;
        }
        this.f1734a.setLogo(drawable);
    }

    /* renamed from: v */
    private int m40422v() {
        if (this.f1734a.getNavigationIcon() != null) {
            this.f1750q = this.f1734a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m40451A(CharSequence charSequence) {
        this.f1744k = charSequence;
        m40446F();
    }

    /* renamed from: B */
    public void m40450B(Drawable drawable) {
        this.f1740g = drawable;
        m40445G();
    }

    /* renamed from: C */
    public void m40449C(CharSequence charSequence) {
        this.f1743j = charSequence;
        if ((this.f1735b & 8) != 0) {
            this.f1734a.setSubtitle(charSequence);
        }
    }

    /* renamed from: D */
    public void m40448D(CharSequence charSequence) {
        this.f1741h = true;
        m40447E(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: a */
    public void mo40443a(Menu menu, InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
        if (this.f1747n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1734a.getContext());
            this.f1747n = actionMenuPresenter;
            actionMenuPresenter.m41066r(C4902f.action_menu_presenter);
        }
        this.f1747n.mo40949m(interfaceC0388a);
        this.f1734a.m40727I((C0378e) menu, this.f1747n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: b */
    public boolean mo40442b() {
        return this.f1734a.m40735A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: c */
    public void mo40441c() {
        this.f1746m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public void collapseActionView() {
        this.f1734a.m40717e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: d */
    public boolean mo40440d() {
        return this.f1734a.m40696z();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: e */
    public boolean mo40439e() {
        return this.f1734a.m40699w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: f */
    public boolean mo40438f() {
        return this.f1734a.m40722N();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: g */
    public boolean mo40437g() {
        return this.f1734a.m40718d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public Context getContext() {
        return this.f1734a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public CharSequence getTitle() {
        return this.f1734a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: h */
    public void mo40436h() {
        this.f1734a.m40716f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: i */
    public void mo40435i(int i) {
        this.f1734a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: j */
    public void mo40434j(C0499l0 c0499l0) {
        View view = this.f1736c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1734a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1736c);
            }
        }
        this.f1736c = c0499l0;
        if (c0499l0 == null || this.f1748o != 2) {
            return;
        }
        this.f1734a.addView(c0499l0, 0);
        Toolbar.C0449e c0449e = (Toolbar.C0449e) this.f1736c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0449e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0449e).height = -2;
        c0449e.f795a = 8388691;
        c0499l0.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: k */
    public ViewGroup mo40433k() {
        return this.f1734a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: l */
    public void mo40432l(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: m */
    public boolean mo40431m() {
        return this.f1734a.m40700v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: n */
    public void mo40430n(int i) {
        View view;
        int i2 = this.f1735b ^ i;
        this.f1735b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m40446F();
                }
                m40445G();
            }
            if ((i2 & 3) != 0) {
                m40444H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1734a.setTitle(this.f1742i);
                    this.f1734a.setSubtitle(this.f1743j);
                } else {
                    this.f1734a.setTitle((CharSequence) null);
                    this.f1734a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f1737d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1734a.addView(view);
            } else {
                this.f1734a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: o */
    public int mo40429o() {
        return this.f1735b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: p */
    public void mo40428p(int i) {
        m40419y(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: q */
    public int mo40427q() {
        return this.f1748o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: r */
    public C1166h0 mo40426r(int i, long j) {
        return C1112b0.m38434e(this.f1734a).m38170b(i == 0 ? 1.0f : 0.0f).m38166f(j).m38164h(new C0524b(i));
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: s */
    public void mo40425s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public void setIcon(int i) {
        setIcon(i != 0 ? C5586a.m23699b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public void setWindowCallback(Window.Callback callback) {
        this.f1745l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1741h) {
            return;
        }
        m40447E(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: t */
    public void mo40424t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    /* renamed from: u */
    public void mo40423u(boolean z) {
        this.f1734a.setCollapsible(z);
    }

    /* renamed from: w */
    public void m40421w(View view) {
        View view2 = this.f1737d;
        if (view2 != null && (this.f1735b & 16) != 0) {
            this.f1734a.removeView(view2);
        }
        this.f1737d = view;
        if (view == null || (this.f1735b & 16) == 0) {
            return;
        }
        this.f1734a.addView(view);
    }

    /* renamed from: x */
    public void m40420x(int i) {
        if (i == this.f1749p) {
            return;
        }
        this.f1749p = i;
        if (TextUtils.isEmpty(this.f1734a.getNavigationContentDescription())) {
            m40418z(this.f1749p);
        }
    }

    /* renamed from: y */
    public void m40419y(Drawable drawable) {
        this.f1739f = drawable;
        m40444H();
    }

    /* renamed from: z */
    public void m40418z(int i) {
        m40451A(i == 0 ? null : getContext().getString(i));
    }

    public C0522t0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1748o = 0;
        this.f1749p = 0;
        this.f1734a = toolbar;
        this.f1742i = toolbar.getTitle();
        this.f1743j = toolbar.getSubtitle();
        this.f1741h = this.f1742i != null;
        this.f1740g = toolbar.getNavigationIcon();
        C0520s0 m40453v = C0520s0.m40453v(toolbar.getContext(), null, C4906j.f13491a, C4897a.actionBarStyle, 0);
        this.f1750q = m40453v.m40468g(C4906j.f13546l);
        if (z) {
            CharSequence m40459p = m40453v.m40459p(C4906j.f13576r);
            if (!TextUtils.isEmpty(m40459p)) {
                m40448D(m40459p);
            }
            CharSequence m40459p2 = m40453v.m40459p(C4906j.f13566p);
            if (!TextUtils.isEmpty(m40459p2)) {
                m40449C(m40459p2);
            }
            Drawable m40468g = m40453v.m40468g(C4906j.f13556n);
            if (m40468g != null) {
                m40419y(m40468g);
            }
            Drawable m40468g2 = m40453v.m40468g(C4906j.f13551m);
            if (m40468g2 != null) {
                setIcon(m40468g2);
            }
            if (this.f1740g == null && (drawable = this.f1750q) != null) {
                m40450B(drawable);
            }
            mo40430n(m40453v.m40464k(C4906j.f13526h, 0));
            int m40461n = m40453v.m40461n(C4906j.f13521g, 0);
            if (m40461n != 0) {
                m40421w(LayoutInflater.from(this.f1734a.getContext()).inflate(m40461n, (ViewGroup) this.f1734a, false));
                mo40430n(this.f1735b | 16);
            }
            int m40462m = m40453v.m40462m(C4906j.f13536j, 0);
            if (m40462m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1734a.getLayoutParams();
                layoutParams.height = m40462m;
                this.f1734a.setLayoutParams(layoutParams);
            }
            int m40470e = m40453v.m40470e(C4906j.f13516f, -1);
            int m40470e2 = m40453v.m40470e(C4906j.f13511e, -1);
            if (m40470e >= 0 || m40470e2 >= 0) {
                this.f1734a.m40728H(Math.max(m40470e, 0), Math.max(m40470e2, 0));
            }
            int m40461n2 = m40453v.m40461n(C4906j.f13581s, 0);
            if (m40461n2 != 0) {
                Toolbar toolbar2 = this.f1734a;
                toolbar2.m40725K(toolbar2.getContext(), m40461n2);
            }
            int m40461n3 = m40453v.m40461n(C4906j.f13571q, 0);
            if (m40461n3 != 0) {
                Toolbar toolbar3 = this.f1734a;
                toolbar3.m40726J(toolbar3.getContext(), m40461n3);
            }
            int m40461n4 = m40453v.m40461n(C4906j.f13561o, 0);
            if (m40461n4 != 0) {
                this.f1734a.setPopupTheme(m40461n4);
            }
        } else {
            this.f1735b = m40422v();
        }
        m40453v.m40452w();
        m40420x(i);
        this.f1744k = this.f1734a.getNavigationContentDescription();
        this.f1734a.setNavigationOnClickListener(new View$OnClickListenerC0523a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0454a0
    public void setIcon(Drawable drawable) {
        this.f1738e = drawable;
        m40444H();
    }
}
