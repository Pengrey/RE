package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0319a;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0499l0;
import androidx.appcompat.widget.InterfaceC0454a0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1112b0;
import androidx.core.view.C1166h0;
import androidx.core.view.C1174j0;
import androidx.core.view.InterfaceC1172i0;
import androidx.core.view.InterfaceC1177k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p070e.C4897a;
import p070e.C4902f;
import p070e.C4906j;
import p189k.AbstractC6541b;
import p189k.C6540a;
import p189k.C6548g;
import p189k.C6551h;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
public class C0361k extends AbstractC0319a implements ActionBarOverlayLayout.InterfaceC0399d {

    /* renamed from: B */
    private static final Interpolator f931B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f932C = new DecelerateInterpolator();

    /* renamed from: A */
    final InterfaceC1177k0 f933A;

    /* renamed from: a */
    Context f934a;

    /* renamed from: b */
    private Context f935b;

    /* renamed from: c */
    ActionBarOverlayLayout f936c;

    /* renamed from: d */
    ActionBarContainer f937d;

    /* renamed from: e */
    InterfaceC0454a0 f938e;

    /* renamed from: f */
    ActionBarContextView f939f;

    /* renamed from: g */
    View f940g;

    /* renamed from: h */
    C0499l0 f941h;

    /* renamed from: i */
    private boolean f942i;

    /* renamed from: j */
    C0365d f943j;

    /* renamed from: k */
    AbstractC6541b f944k;

    /* renamed from: l */
    AbstractC6541b.InterfaceC6542a f945l;

    /* renamed from: m */
    private boolean f946m;

    /* renamed from: n */
    private ArrayList<AbstractC0319a.InterfaceC0321b> f947n;

    /* renamed from: o */
    private boolean f948o;

    /* renamed from: p */
    private int f949p;

    /* renamed from: q */
    boolean f950q;

    /* renamed from: r */
    boolean f951r;

    /* renamed from: s */
    boolean f952s;

    /* renamed from: t */
    private boolean f953t;

    /* renamed from: u */
    private boolean f954u;

    /* renamed from: v */
    C6551h f955v;

    /* renamed from: w */
    private boolean f956w;

    /* renamed from: x */
    boolean f957x;

    /* renamed from: y */
    final InterfaceC1172i0 f958y;

    /* renamed from: z */
    final InterfaceC1172i0 f959z;

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    class C0362a extends C1174j0 {
        C0362a() {
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            View view2;
            C0361k c0361k = C0361k.this;
            if (c0361k.f950q && (view2 = c0361k.f940g) != null) {
                view2.setTranslationY(0.0f);
                C0361k.this.f937d.setTranslationY(0.0f);
            }
            C0361k.this.f937d.setVisibility(8);
            C0361k.this.f937d.setTransitioning(false);
            C0361k c0361k2 = C0361k.this;
            c0361k2.f955v = null;
            c0361k2.m41082x();
            ActionBarOverlayLayout actionBarOverlayLayout = C0361k.this.f936c;
            if (actionBarOverlayLayout != null) {
                C1112b0.m38411p0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.k$b */
    /* loaded from: classes.dex */
    class C0363b extends C1174j0 {
        C0363b() {
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            C0361k c0361k = C0361k.this;
            c0361k.f955v = null;
            c0361k.f937d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.k$c */
    /* loaded from: classes.dex */
    class C0364c implements InterfaceC1177k0 {
        C0364c() {
        }

        @Override // androidx.core.view.InterfaceC1177k0
        /* renamed from: a */
        public void mo38122a(View view) {
            ((View) C0361k.this.f937d.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: androidx.appcompat.app.k$d */
    /* loaded from: classes.dex */
    public class C0365d extends AbstractC6541b implements C0378e.InterfaceC0379a {

        /* renamed from: A */
        private AbstractC6541b.InterfaceC6542a f963A;

        /* renamed from: B */
        private WeakReference<View> f964B;

        /* renamed from: y */
        private final Context f966y;

        /* renamed from: z */
        private final C0378e f967z;

        public C0365d(Context context, AbstractC6541b.InterfaceC6542a interfaceC6542a) {
            this.f966y = context;
            this.f963A = interfaceC6542a;
            C0378e m41030W = new C0378e(context).m41030W(1);
            this.f967z = m41030W;
            m41030W.mo40936V(this);
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: a */
        public boolean mo20648a(C0378e c0378e, MenuItem menuItem) {
            AbstractC6541b.InterfaceC6542a interfaceC6542a = this.f963A;
            if (interfaceC6542a != null) {
                return interfaceC6542a.mo20632a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: b */
        public void mo20647b(C0378e c0378e) {
            if (this.f963A == null) {
                return;
            }
            mo20640k();
            C0361k.this.f939f.m40923l();
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: c */
        public void mo20646c() {
            C0361k c0361k = C0361k.this;
            if (c0361k.f943j != this) {
                return;
            }
            if (!C0361k.m41083w(c0361k.f951r, c0361k.f952s, false)) {
                C0361k c0361k2 = C0361k.this;
                c0361k2.f944k = this;
                c0361k2.f945l = this.f963A;
            } else {
                this.f963A.mo20629d(this);
            }
            this.f963A = null;
            C0361k.this.m41084v(false);
            C0361k.this.f939f.m40928g();
            C0361k.this.f938e.mo40433k().sendAccessibilityEvent(32);
            C0361k c0361k3 = C0361k.this;
            c0361k3.f936c.setHideOnContentScrollEnabled(c0361k3.f957x);
            C0361k.this.f943j = null;
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: d */
        public View mo20645d() {
            WeakReference<View> weakReference = this.f964B;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: e */
        public Menu mo20644e() {
            return this.f967z;
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: f */
        public MenuInflater mo20643f() {
            return new C6548g(this.f966y);
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: g */
        public CharSequence mo20642g() {
            return C0361k.this.f939f.getSubtitle();
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: i */
        public CharSequence mo20641i() {
            return C0361k.this.f939f.getTitle();
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: k */
        public void mo20640k() {
            if (C0361k.this.f943j != this) {
                return;
            }
            this.f967z.m41014h0();
            try {
                this.f963A.mo20630c(this, this.f967z);
            } finally {
                this.f967z.m41015g0();
            }
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: l */
        public boolean mo20639l() {
            return C0361k.this.f939f.m40925j();
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: m */
        public void mo20638m(View view) {
            C0361k.this.f939f.setCustomView(view);
            this.f964B = new WeakReference<>(view);
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: n */
        public void mo20637n(int i) {
            mo20636o(C0361k.this.f934a.getResources().getString(i));
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: o */
        public void mo20636o(CharSequence charSequence) {
            C0361k.this.f939f.setSubtitle(charSequence);
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: q */
        public void mo20635q(int i) {
            mo20634r(C0361k.this.f934a.getResources().getString(i));
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: r */
        public void mo20634r(CharSequence charSequence) {
            C0361k.this.f939f.setTitle(charSequence);
        }

        @Override // p189k.AbstractC6541b
        /* renamed from: s */
        public void mo20633s(boolean z) {
            super.mo20633s(z);
            C0361k.this.f939f.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m41079t() {
            this.f967z.m41014h0();
            try {
                return this.f963A.mo20631b(this, this.f967z);
            } finally {
                this.f967z.m41015g0();
            }
        }
    }

    public C0361k(Activity activity, boolean z) {
        new ArrayList();
        this.f947n = new ArrayList<>();
        this.f949p = 0;
        this.f950q = true;
        this.f954u = true;
        this.f958y = new C0362a();
        this.f959z = new C0363b();
        this.f933A = new C0364c();
        View decorView = activity.getWindow().getDecorView();
        m41104D(decorView);
        if (z) {
            return;
        }
        this.f940g = decorView.findViewById(16908290);
    }

    /* renamed from: A */
    private InterfaceC0454a0 m41107A(View view) {
        if (view instanceof InterfaceC0454a0) {
            return (InterfaceC0454a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: C */
    private void m41105C() {
        if (this.f953t) {
            this.f953t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f936c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m41095M(false);
        }
    }

    /* renamed from: D */
    private void m41104D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C4902f.decor_content_parent);
        this.f936c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f938e = m41107A(view.findViewById(C4902f.action_bar));
        this.f939f = (ActionBarContextView) view.findViewById(C4902f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C4902f.action_bar_container);
        this.f937d = actionBarContainer;
        InterfaceC0454a0 interfaceC0454a0 = this.f938e;
        if (interfaceC0454a0 != null && this.f939f != null && actionBarContainer != null) {
            this.f934a = interfaceC0454a0.getContext();
            boolean z = (this.f938e.mo40429o() & 4) != 0;
            if (z) {
                this.f942i = true;
            }
            C6540a m20663b = C6540a.m20663b(this.f934a);
            m41098J(m20663b.m20664a() || z);
            m41100H(m20663b.m20658g());
            TypedArray obtainStyledAttributes = this.f934a.obtainStyledAttributes(null, C4906j.f13491a, C4897a.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(C4906j.f13541k, false)) {
                m41099I(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4906j.f13531i, 0);
            if (dimensionPixelSize != 0) {
                m41101G(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C0361k.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: H */
    private void m41100H(boolean z) {
        this.f948o = z;
        if (!z) {
            this.f938e.mo40434j(null);
            this.f937d.setTabContainer(this.f941h);
        } else {
            this.f937d.setTabContainer(null);
            this.f938e.mo40434j(this.f941h);
        }
        boolean z2 = true;
        boolean z3 = m41106B() == 2;
        C0499l0 c0499l0 = this.f941h;
        if (c0499l0 != null) {
            if (z3) {
                c0499l0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f936c;
                if (actionBarOverlayLayout != null) {
                    C1112b0.m38411p0(actionBarOverlayLayout);
                }
            } else {
                c0499l0.setVisibility(8);
            }
        }
        this.f938e.mo40423u(!this.f948o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f936c;
        if (this.f948o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: K */
    private boolean m41097K() {
        return C1112b0.m38446W(this.f937d);
    }

    /* renamed from: L */
    private void m41096L() {
        if (this.f953t) {
            return;
        }
        this.f953t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f936c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m41095M(false);
    }

    /* renamed from: M */
    private void m41095M(boolean z) {
        if (m41083w(this.f951r, this.f952s, this.f953t)) {
            if (this.f954u) {
                return;
            }
            this.f954u = true;
            m41080z(z);
        } else if (this.f954u) {
            this.f954u = false;
            m41081y(z);
        }
    }

    /* renamed from: w */
    static boolean m41083w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: B */
    public int m41106B() {
        return this.f938e.mo40427q();
    }

    /* renamed from: E */
    public void m41103E(boolean z) {
        m41102F(z ? 4 : 0, 4);
    }

    /* renamed from: F */
    public void m41102F(int i, int i2) {
        int mo40429o = this.f938e.mo40429o();
        if ((i2 & 4) != 0) {
            this.f942i = true;
        }
        this.f938e.mo40430n((i & i2) | ((~i2) & mo40429o));
    }

    /* renamed from: G */
    public void m41101G(float f) {
        C1112b0.m38391z0(this.f937d, f);
    }

    /* renamed from: I */
    public void m41099I(boolean z) {
        if (z && !this.f936c.m40913w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f957x = z;
        this.f936c.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: J */
    public void m41098J(boolean z) {
        this.f938e.mo40432l(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: a */
    public void mo40909a() {
        if (this.f952s) {
            this.f952s = false;
            m41095M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: b */
    public void mo40908b() {
        C6551h c6551h = this.f955v;
        if (c6551h != null) {
            c6551h.m20614a();
            this.f955v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: c */
    public void mo40907c(int i) {
        this.f949p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: d */
    public void mo40906d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: e */
    public void mo40905e(boolean z) {
        this.f950q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0399d
    /* renamed from: f */
    public void mo40904f() {
        if (this.f952s) {
            return;
        }
        this.f952s = true;
        m41095M(true);
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: h */
    public boolean mo41094h() {
        InterfaceC0454a0 interfaceC0454a0 = this.f938e;
        if (interfaceC0454a0 == null || !interfaceC0454a0.mo40431m()) {
            return false;
        }
        this.f938e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: i */
    public void mo41093i(boolean z) {
        if (z == this.f946m) {
            return;
        }
        this.f946m = z;
        int size = this.f947n.size();
        for (int i = 0; i < size; i++) {
            this.f947n.get(i).m41288a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: j */
    public int mo41092j() {
        return this.f938e.mo40429o();
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: k */
    public Context mo41091k() {
        if (this.f935b == null) {
            TypedValue typedValue = new TypedValue();
            this.f934a.getTheme().resolveAttribute(C4897a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f935b = new ContextThemeWrapper(this.f934a, i);
            } else {
                this.f935b = this.f934a;
            }
        }
        return this.f935b;
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: m */
    public void mo41090m(Configuration configuration) {
        m41100H(C6540a.m20663b(this.f934a).m20658g());
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: o */
    public boolean mo41089o(int i, KeyEvent keyEvent) {
        Menu mo20644e;
        C0365d c0365d = this.f943j;
        if (c0365d == null || (mo20644e = c0365d.mo20644e()) == null) {
            return false;
        }
        mo20644e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo20644e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: r */
    public void mo41088r(boolean z) {
        if (this.f942i) {
            return;
        }
        m41103E(z);
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: s */
    public void mo41087s(boolean z) {
        C6551h c6551h;
        this.f956w = z;
        if (z || (c6551h = this.f955v) == null) {
            return;
        }
        c6551h.m20614a();
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: t */
    public void mo41086t(CharSequence charSequence) {
        this.f938e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0319a
    /* renamed from: u */
    public AbstractC6541b mo41085u(AbstractC6541b.InterfaceC6542a interfaceC6542a) {
        C0365d c0365d = this.f943j;
        if (c0365d != null) {
            c0365d.mo20646c();
        }
        this.f936c.setHideOnContentScrollEnabled(false);
        this.f939f.m40924k();
        C0365d c0365d2 = new C0365d(this.f939f.getContext(), interfaceC6542a);
        if (c0365d2.m41079t()) {
            this.f943j = c0365d2;
            c0365d2.mo20640k();
            this.f939f.m40927h(c0365d2);
            m41084v(true);
            this.f939f.sendAccessibilityEvent(32);
            return c0365d2;
        }
        return null;
    }

    /* renamed from: v */
    public void m41084v(boolean z) {
        C1166h0 mo40426r;
        C1166h0 f;
        if (z) {
            m41096L();
        } else {
            m41105C();
        }
        if (!m41097K()) {
            if (z) {
                this.f938e.mo40435i(4);
                this.f939f.setVisibility(0);
                return;
            }
            this.f938e.mo40435i(0);
            this.f939f.setVisibility(8);
            return;
        }
        if (z) {
            f = this.f938e.mo40426r(4, 100L);
            mo40426r = this.f939f.m40684f(0, 200L);
        } else {
            mo40426r = this.f938e.mo40426r(0, 200L);
            f = this.f939f.m40684f(8, 100L);
        }
        C6551h c6551h = new C6551h();
        c6551h.m20611d(f, mo40426r);
        c6551h.m20607h();
    }

    /* renamed from: x */
    void m41082x() {
        AbstractC6541b.InterfaceC6542a interfaceC6542a = this.f945l;
        if (interfaceC6542a != null) {
            interfaceC6542a.mo20629d(this.f944k);
            this.f944k = null;
            this.f945l = null;
        }
    }

    /* renamed from: y */
    public void m41081y(boolean z) {
        View view;
        int[] iArr;
        C6551h c6551h = this.f955v;
        if (c6551h != null) {
            c6551h.m20614a();
        }
        if (this.f949p == 0 && (this.f956w || z)) {
            this.f937d.setAlpha(1.0f);
            this.f937d.setTransitioning(true);
            C6551h c6551h2 = new C6551h();
            float f = -this.f937d.getHeight();
            if (z) {
                this.f937d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C1166h0 m38159m = C1112b0.m38434e(this.f937d).m38159m(f);
            m38159m.m38161k(this.f933A);
            c6551h2.m20612c(m38159m);
            if (this.f950q && (view = this.f940g) != null) {
                c6551h2.m20612c(C1112b0.m38434e(view).m38159m(f));
            }
            c6551h2.m20609f(f931B);
            c6551h2.m20610e(250L);
            c6551h2.m20608g(this.f958y);
            this.f955v = c6551h2;
            c6551h2.m20607h();
            return;
        }
        this.f958y.mo20606b(null);
    }

    /* renamed from: z */
    public void m41080z(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C6551h c6551h = this.f955v;
        if (c6551h != null) {
            c6551h.m20614a();
        }
        this.f937d.setVisibility(0);
        if (this.f949p == 0 && (this.f956w || z)) {
            this.f937d.setTranslationY(0.0f);
            float f = -this.f937d.getHeight();
            if (z) {
                this.f937d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f937d.setTranslationY(f);
            C6551h c6551h2 = new C6551h();
            C1166h0 m38159m = C1112b0.m38434e(this.f937d).m38159m(0.0f);
            m38159m.m38161k(this.f933A);
            c6551h2.m20612c(m38159m);
            if (this.f950q && (view2 = this.f940g) != null) {
                view2.setTranslationY(f);
                c6551h2.m20612c(C1112b0.m38434e(this.f940g).m38159m(0.0f));
            }
            c6551h2.m20609f(f932C);
            c6551h2.m20610e(250L);
            c6551h2.m20608g(this.f959z);
            this.f955v = c6551h2;
            c6551h2.m20607h();
        } else {
            this.f937d.setAlpha(1.0f);
            this.f937d.setTranslationY(0.0f);
            if (this.f950q && (view = this.f940g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f959z.mo20606b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f936c;
        if (actionBarOverlayLayout != null) {
            C1112b0.m38411p0(actionBarOverlayLayout);
        }
    }

    public C0361k(Dialog dialog) {
        new ArrayList();
        this.f947n = new ArrayList<>();
        this.f949p = 0;
        this.f950q = true;
        this.f954u = true;
        this.f958y = new C0362a();
        this.f959z = new C0363b();
        this.f933A = new C0364c();
        m41104D(dialog.getWindow().getDecorView());
    }
}
