package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.widget.C0482h0;
import androidx.appcompat.widget.InterfaceC0480g0;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import java.util.ArrayList;
import java.util.List;
import p070e.C4900d;
import p070e.C4903g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0369b extends AbstractC0384h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: X */
    private static final int f1009X = C4903g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private final int f1010A;

    /* renamed from: B */
    private final boolean f1011B;

    /* renamed from: C */
    final Handler f1012C;

    /* renamed from: K */
    private View f1020K;

    /* renamed from: L */
    View f1021L;

    /* renamed from: N */
    private boolean f1023N;

    /* renamed from: O */
    private boolean f1024O;

    /* renamed from: P */
    private int f1025P;

    /* renamed from: Q */
    private int f1026Q;

    /* renamed from: S */
    private boolean f1028S;

    /* renamed from: T */
    private InterfaceC0387j.InterfaceC0388a f1029T;

    /* renamed from: U */
    ViewTreeObserver f1030U;

    /* renamed from: V */
    private PopupWindow.OnDismissListener f1031V;

    /* renamed from: W */
    boolean f1032W;

    /* renamed from: x */
    private final Context f1033x;

    /* renamed from: y */
    private final int f1034y;

    /* renamed from: z */
    private final int f1035z;

    /* renamed from: D */
    private final List<C0378e> f1013D = new ArrayList();

    /* renamed from: E */
    final List<C0374d> f1014E = new ArrayList();

    /* renamed from: F */
    final ViewTreeObserver.OnGlobalLayoutListener f1015F = new ViewTreeObserver$OnGlobalLayoutListenerC0370a();

    /* renamed from: G */
    private final View.OnAttachStateChangeListener f1016G = new View$OnAttachStateChangeListenerC0371b();

    /* renamed from: H */
    private final InterfaceC0480g0 f1017H = new C0372c();

    /* renamed from: I */
    private int f1018I = 0;

    /* renamed from: J */
    private int f1019J = 0;

    /* renamed from: R */
    private boolean f1027R = false;

    /* renamed from: M */
    private int f1022M = m41061F();

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0370a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0370a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0369b.this.mo19709c() || View$OnKeyListenerC0369b.this.f1014E.size() <= 0 || View$OnKeyListenerC0369b.this.f1014E.get(0).f1043a.m40638B()) {
                return;
            }
            View view = View$OnKeyListenerC0369b.this.f1021L;
            if (view != null && view.isShown()) {
                for (C0374d c0374d : View$OnKeyListenerC0369b.this.f1014E) {
                    c0374d.f1043a.mo19710a();
                }
                return;
            }
            View$OnKeyListenerC0369b.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0371b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0371b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0369b.this.f1030U;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0369b.this.f1030U = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0369b view$OnKeyListenerC0369b = View$OnKeyListenerC0369b.this;
                view$OnKeyListenerC0369b.f1030U.removeGlobalOnLayoutListener(view$OnKeyListenerC0369b.f1015F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    class C0372c implements InterfaceC0480g0 {

        /* compiled from: CascadingMenuPopup.java */
        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        class RunnableC0373a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ C0374d f1039w;

            /* renamed from: x */
            final /* synthetic */ MenuItem f1040x;

            /* renamed from: y */
            final /* synthetic */ C0378e f1041y;

            RunnableC0373a(C0374d c0374d, MenuItem menuItem, C0378e c0378e) {
                this.f1039w = c0374d;
                this.f1040x = menuItem;
                this.f1041y = c0378e;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0374d c0374d = this.f1039w;
                if (c0374d != null) {
                    View$OnKeyListenerC0369b.this.f1032W = true;
                    c0374d.f1044b.m41019e(false);
                    View$OnKeyListenerC0369b.this.f1032W = false;
                }
                if (this.f1040x.isEnabled() && this.f1040x.hasSubMenu()) {
                    this.f1041y.m41038N(this.f1040x, 4);
                }
            }
        }

        C0372c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0480g0
        /* renamed from: e */
        public void mo40594e(C0378e c0378e, MenuItem menuItem) {
            View$OnKeyListenerC0369b.this.f1012C.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0369b.this.f1014E.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0378e == View$OnKeyListenerC0369b.this.f1014E.get(i).f1044b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            View$OnKeyListenerC0369b.this.f1012C.postAtTime(new RunnableC0373a(i2 < View$OnKeyListenerC0369b.this.f1014E.size() ? View$OnKeyListenerC0369b.this.f1014E.get(i2) : null, menuItem, c0378e), c0378e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0480g0
        /* renamed from: f */
        public void mo40593f(C0378e c0378e, MenuItem menuItem) {
            View$OnKeyListenerC0369b.this.f1012C.removeCallbacksAndMessages(c0378e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class C0374d {

        /* renamed from: a */
        public final C0482h0 f1043a;

        /* renamed from: b */
        public final C0378e f1044b;

        /* renamed from: c */
        public final int f1045c;

        public C0374d(C0482h0 c0482h0, C0378e c0378e, int i) {
            this.f1043a = c0482h0;
            this.f1044b = c0378e;
            this.f1045c = i;
        }

        /* renamed from: a */
        public ListView m41058a() {
            return this.f1043a.mo19708h();
        }
    }

    public View$OnKeyListenerC0369b(Context context, View view, int i, int i2, boolean z) {
        this.f1033x = context;
        this.f1020K = view;
        this.f1035z = i;
        this.f1010A = i2;
        this.f1011B = z;
        Resources resources = context.getResources();
        this.f1034y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4900d.abc_config_prefDialogWidth));
        this.f1012C = new Handler();
    }

    /* renamed from: B */
    private C0482h0 m41065B() {
        C0482h0 c0482h0 = new C0482h0(this.f1033x, null, this.f1035z, this.f1010A);
        c0482h0.m40596T(this.f1017H);
        c0482h0.m40628L(this);
        c0482h0.m40629K(this);
        c0482h0.m40636D(this.f1020K);
        c0482h0.m40633G(this.f1019J);
        c0482h0.m40630J(true);
        c0482h0.m40631I(2);
        return c0482h0;
    }

    /* renamed from: C */
    private int m41064C(C0378e c0378e) {
        int size = this.f1014E.size();
        for (int i = 0; i < size; i++) {
            if (c0378e == this.f1014E.get(i).f1044b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    private MenuItem m41063D(C0378e c0378e, C0378e c0378e2) {
        int size = c0378e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0378e.getItem(i);
            if (item.hasSubMenu() && c0378e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: E */
    private View m41062E(C0374d c0374d, C0378e c0378e) {
        C0377d c0377d;
        int i;
        int firstVisiblePosition;
        MenuItem m41063D = m41063D(c0374d.f1044b, c0378e);
        if (m41063D == null) {
            return null;
        }
        ListView m41058a = c0374d.m41058a();
        ListAdapter adapter = m41058a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0377d = (C0377d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0377d = (C0377d) adapter;
            i = 0;
        }
        int count = c0377d.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (m41063D == c0377d.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m41058a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m41058a.getChildCount()) {
            return m41058a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: F */
    private int m41061F() {
        return C1112b0.m38476E(this.f1020K) == 1 ? 0 : 1;
    }

    /* renamed from: G */
    private int m41060G(int i) {
        List<C0374d> list = this.f1014E;
        ListView m41058a = list.get(list.size() - 1).m41058a();
        int[] iArr = new int[2];
        m41058a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1021L.getWindowVisibleDisplayFrame(rect);
        return this.f1022M == 1 ? (iArr[0] + m41058a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: H */
    private void m41059H(C0378e c0378e) {
        C0374d c0374d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1033x);
        C0377d c0377d = new C0377d(c0378e, from, this.f1011B, f1009X);
        if (!mo19709c() && this.f1027R) {
            c0377d.m41048d(true);
        } else if (mo19709c()) {
            c0377d.m41048d(AbstractC0384h.m40964z(c0378e));
        }
        int m40966q = AbstractC0384h.m40966q(c0377d, null, this.f1033x, this.f1034y);
        C0482h0 m41065B = m41065B();
        m41065B.mo40616p(c0377d);
        m41065B.m40634F(m40966q);
        m41065B.m40633G(this.f1019J);
        if (this.f1014E.size() > 0) {
            List<C0374d> list = this.f1014E;
            c0374d = list.get(list.size() - 1);
            view = m41062E(c0374d, c0378e);
        } else {
            c0374d = null;
            view = null;
        }
        if (view != null) {
            m41065B.m40595U(false);
            m41065B.m40598R(null);
            int m41060G = m41060G(m40966q);
            boolean z = m41060G == 1;
            this.f1022M = m41060G;
            if (Build.VERSION.SDK_INT >= 26) {
                m41065B.m40636D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1020K.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1019J & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1020K.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1019J & 5) == 5) {
                if (!z) {
                    m40966q = view.getWidth();
                    i3 = i - m40966q;
                }
                i3 = i + m40966q;
            } else {
                if (z) {
                    m40966q = view.getWidth();
                    i3 = i + m40966q;
                }
                i3 = i - m40966q;
            }
            m41065B.m40618l(i3);
            m41065B.m40627M(true);
            m41065B.m40619j(i2);
        } else {
            if (this.f1023N) {
                m41065B.m40618l(this.f1025P);
            }
            if (this.f1024O) {
                m41065B.m40619j(this.f1026Q);
            }
            m41065B.m40632H(m40967p());
        }
        this.f1014E.add(new C0374d(m41065B, c0378e, this.f1022M));
        m41065B.mo19710a();
        ListView mo19708h = m41065B.mo19708h();
        mo19708h.setOnKeyListener(this);
        if (c0374d == null && this.f1028S && c0378e.m40998z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C4903g.abc_popup_menu_header_item_layout, (ViewGroup) mo19708h, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0378e.m40998z());
            mo19708h.addHeaderView(frameLayout, null, false);
            m41065B.mo19710a();
        }
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: a */
    public void mo19710a() {
        if (mo19709c()) {
            return;
        }
        for (C0378e c0378e : this.f1013D) {
            m41059H(c0378e);
        }
        this.f1013D.clear();
        View view = this.f1020K;
        this.f1021L = view;
        if (view != null) {
            boolean z = this.f1030U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1030U = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1015F);
            }
            this.f1021L.addOnAttachStateChangeListener(this.f1016G);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
        int m41064C = m41064C(c0378e);
        if (m41064C < 0) {
            return;
        }
        int i = m41064C + 1;
        if (i < this.f1014E.size()) {
            this.f1014E.get(i).f1044b.m41019e(false);
        }
        C0374d remove = this.f1014E.remove(m41064C);
        remove.f1044b.m41035Q(this);
        if (this.f1032W) {
            remove.f1043a.m40597S(null);
            remove.f1043a.m40635E(0);
        }
        remove.f1043a.dismiss();
        int size = this.f1014E.size();
        if (size > 0) {
            this.f1022M = this.f1014E.get(size - 1).f1045c;
        } else {
            this.f1022M = m41061F();
        }
        if (size != 0) {
            if (z) {
                this.f1014E.get(0).f1044b.m41019e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1029T;
        if (interfaceC0388a != null) {
            interfaceC0388a.mo40856b(c0378e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1030U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1030U.removeGlobalOnLayoutListener(this.f1015F);
            }
            this.f1030U = null;
        }
        this.f1021L.removeOnAttachStateChangeListener(this.f1016G);
        this.f1031V.onDismiss();
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: c */
    public boolean mo19709c() {
        return this.f1014E.size() > 0 && this.f1014E.get(0).f1043a.mo19709c();
    }

    @Override // p209l.InterfaceC6954e
    public void dismiss() {
        int size = this.f1014E.size();
        if (size > 0) {
            C0374d[] c0374dArr = (C0374d[]) this.f1014E.toArray(new C0374d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0374d c0374d = c0374dArr[i];
                if (c0374d.f1043a.mo19709c()) {
                    c0374d.f1043a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: e */
    public void mo29477e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        for (C0374d c0374d : this.f1014E) {
            if (subMenuC0394m == c0374d.f1044b) {
                c0374d.m41058a().requestFocus();
                return true;
            }
        }
        if (subMenuC0394m.hasVisibleItems()) {
            mo40948n(subMenuC0394m);
            InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1029T;
            if (interfaceC0388a != null) {
                interfaceC0388a.mo40855c(subMenuC0394m);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        for (C0374d c0374d : this.f1014E) {
            AbstractC0384h.m40969A(c0374d.m41058a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: h */
    public ListView mo19708h() {
        if (this.f1014E.isEmpty()) {
            return null;
        }
        List<C0374d> list = this.f1014E;
        return list.get(list.size() - 1).m41058a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: i */
    public boolean mo29473i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: j */
    public Parcelable mo29472j() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: m */
    public void mo40949m(InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
        this.f1029T = interfaceC0388a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: n */
    public void mo40948n(C0378e c0378e) {
        c0378e.m41023c(this, this.f1033x);
        if (mo19709c()) {
            m41059H(c0378e);
        } else {
            this.f1013D.add(c0378e);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: o */
    protected boolean mo40968o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0374d c0374d;
        int size = this.f1014E.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0374d = null;
                break;
            }
            c0374d = this.f1014E.get(i);
            if (!c0374d.f1043a.mo19709c()) {
                break;
            }
            i++;
        }
        if (c0374d != null) {
            c0374d.f1044b.m41019e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: r */
    public void mo40947r(View view) {
        if (this.f1020K != view) {
            this.f1020K = view;
            this.f1019J = C1158f.m38197b(this.f1018I, C1112b0.m38476E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: t */
    public void mo40946t(boolean z) {
        this.f1027R = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: u */
    public void mo40945u(int i) {
        if (this.f1018I != i) {
            this.f1018I = i;
            this.f1019J = C1158f.m38197b(i, C1112b0.m38476E(this.f1020K));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: v */
    public void mo40944v(int i) {
        this.f1023N = true;
        this.f1025P = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: w */
    public void mo40943w(PopupWindow.OnDismissListener onDismissListener) {
        this.f1031V = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: x */
    public void mo40942x(boolean z) {
        this.f1028S = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: y */
    public void mo40941y(int i) {
        this.f1024O = true;
        this.f1026Q = i;
    }
}
