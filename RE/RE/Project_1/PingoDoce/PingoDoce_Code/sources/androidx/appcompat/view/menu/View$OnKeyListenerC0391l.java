package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.widget.C0482h0;
import androidx.core.view.C1112b0;
import p070e.C4900d;
import p070e.C4903g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0391l extends AbstractC0384h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: R */
    private static final int f1141R = C4903g.abc_popup_menu_item_layout;

    /* renamed from: A */
    private final boolean f1142A;

    /* renamed from: B */
    private final int f1143B;

    /* renamed from: C */
    private final int f1144C;

    /* renamed from: D */
    private final int f1145D;

    /* renamed from: E */
    final C0482h0 f1146E;

    /* renamed from: H */
    private PopupWindow.OnDismissListener f1149H;

    /* renamed from: I */
    private View f1150I;

    /* renamed from: J */
    View f1151J;

    /* renamed from: K */
    private InterfaceC0387j.InterfaceC0388a f1152K;

    /* renamed from: L */
    ViewTreeObserver f1153L;

    /* renamed from: M */
    private boolean f1154M;

    /* renamed from: N */
    private boolean f1155N;

    /* renamed from: O */
    private int f1156O;

    /* renamed from: Q */
    private boolean f1158Q;

    /* renamed from: x */
    private final Context f1159x;

    /* renamed from: y */
    private final C0378e f1160y;

    /* renamed from: z */
    private final C0377d f1161z;

    /* renamed from: F */
    final ViewTreeObserver.OnGlobalLayoutListener f1147F = new ViewTreeObserver$OnGlobalLayoutListenerC0392a();

    /* renamed from: G */
    private final View.OnAttachStateChangeListener f1148G = new View$OnAttachStateChangeListenerC0393b();

    /* renamed from: P */
    private int f1157P = 0;

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0392a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0392a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0391l.this.mo19709c() || View$OnKeyListenerC0391l.this.f1146E.m40638B()) {
                return;
            }
            View view = View$OnKeyListenerC0391l.this.f1151J;
            if (view != null && view.isShown()) {
                View$OnKeyListenerC0391l.this.f1146E.mo19710a();
            } else {
                View$OnKeyListenerC0391l.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0393b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0393b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0391l.this.f1153L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0391l.this.f1153L = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0391l view$OnKeyListenerC0391l = View$OnKeyListenerC0391l.this;
                view$OnKeyListenerC0391l.f1153L.removeGlobalOnLayoutListener(view$OnKeyListenerC0391l.f1147F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0391l(Context context, C0378e c0378e, View view, int i, int i2, boolean z) {
        this.f1159x = context;
        this.f1160y = c0378e;
        this.f1142A = z;
        this.f1161z = new C0377d(c0378e, LayoutInflater.from(context), z, f1141R);
        this.f1144C = i;
        this.f1145D = i2;
        Resources resources = context.getResources();
        this.f1143B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4900d.abc_config_prefDialogWidth));
        this.f1150I = view;
        this.f1146E = new C0482h0(context, null, i, i2);
        c0378e.m41023c(this, context);
    }

    /* renamed from: B */
    private boolean m40950B() {
        View view;
        if (mo19709c()) {
            return true;
        }
        if (this.f1154M || (view = this.f1150I) == null) {
            return false;
        }
        this.f1151J = view;
        this.f1146E.m40629K(this);
        this.f1146E.m40628L(this);
        this.f1146E.m40630J(true);
        View view2 = this.f1151J;
        boolean z = this.f1153L == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1153L = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1147F);
        }
        view2.addOnAttachStateChangeListener(this.f1148G);
        this.f1146E.m40636D(view2);
        this.f1146E.m40633G(this.f1157P);
        if (!this.f1155N) {
            this.f1156O = AbstractC0384h.m40966q(this.f1161z, null, this.f1159x, this.f1143B);
            this.f1155N = true;
        }
        this.f1146E.m40634F(this.f1156O);
        this.f1146E.m40631I(2);
        this.f1146E.m40632H(m40967p());
        this.f1146E.mo19710a();
        ListView mo19708h = this.f1146E.mo19708h();
        mo19708h.setOnKeyListener(this);
        if (this.f1158Q && this.f1160y.m40998z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1159x).inflate(C4903g.abc_popup_menu_header_item_layout, (ViewGroup) mo19708h, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1160y.m40998z());
            }
            frameLayout.setEnabled(false);
            mo19708h.addHeaderView(frameLayout, null, false);
        }
        this.f1146E.mo40616p(this.f1161z);
        this.f1146E.mo19710a();
        return true;
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: a */
    public void mo19710a() {
        if (!m40950B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
        if (c0378e != this.f1160y) {
            return;
        }
        dismiss();
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1152K;
        if (interfaceC0388a != null) {
            interfaceC0388a.mo40856b(c0378e, z);
        }
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: c */
    public boolean mo19709c() {
        return !this.f1154M && this.f1146E.mo19709c();
    }

    @Override // p209l.InterfaceC6954e
    public void dismiss() {
        if (mo19709c()) {
            this.f1146E.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: e */
    public void mo29477e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        if (subMenuC0394m.hasVisibleItems()) {
            C0385i c0385i = new C0385i(this.f1159x, subMenuC0394m, this.f1151J, this.f1142A, this.f1144C, this.f1145D);
            c0385i.m40955j(this.f1152K);
            c0385i.m40958g(AbstractC0384h.m40964z(subMenuC0394m));
            c0385i.m40956i(this.f1149H);
            this.f1149H = null;
            this.f1160y.m41019e(false);
            int m40621d = this.f1146E.m40621d();
            int m40617n = this.f1146E.m40617n();
            if ((Gravity.getAbsoluteGravity(this.f1157P, C1112b0.m38476E(this.f1150I)) & 7) == 5) {
                m40621d += this.f1150I.getWidth();
            }
            if (c0385i.m40951n(m40621d, m40617n)) {
                InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1152K;
                if (interfaceC0388a != null) {
                    interfaceC0388a.mo40855c(subMenuC0394m);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        this.f1155N = false;
        C0377d c0377d = this.f1161z;
        if (c0377d != null) {
            c0377d.notifyDataSetChanged();
        }
    }

    @Override // p209l.InterfaceC6954e
    /* renamed from: h */
    public ListView mo19708h() {
        return this.f1146E.mo19708h();
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
        this.f1152K = interfaceC0388a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: n */
    public void mo40948n(C0378e c0378e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1154M = true;
        this.f1160y.close();
        ViewTreeObserver viewTreeObserver = this.f1153L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1153L = this.f1151J.getViewTreeObserver();
            }
            this.f1153L.removeGlobalOnLayoutListener(this.f1147F);
            this.f1153L = null;
        }
        this.f1151J.removeOnAttachStateChangeListener(this.f1148G);
        PopupWindow.OnDismissListener onDismissListener = this.f1149H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f1150I = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: t */
    public void mo40946t(boolean z) {
        this.f1161z.m41048d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: u */
    public void mo40945u(int i) {
        this.f1157P = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: v */
    public void mo40944v(int i) {
        this.f1146E.m40618l(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: w */
    public void mo40943w(PopupWindow.OnDismissListener onDismissListener) {
        this.f1149H = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: x */
    public void mo40942x(boolean z) {
        this.f1158Q = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0384h
    /* renamed from: y */
    public void mo40941y(int i) {
        this.f1146E.m40619j(i);
    }
}
