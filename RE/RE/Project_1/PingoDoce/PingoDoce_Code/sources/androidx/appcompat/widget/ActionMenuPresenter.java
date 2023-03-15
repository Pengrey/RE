package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0368a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.C0385i;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.view.menu.SubMenuC0394m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.AbstractC1109b;
import java.util.ArrayList;
import p070e.C4897a;
import p070e.C4903g;
import p189k.C6540a;
import p209l.InterfaceC6954e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC0368a implements AbstractC1109b.InterfaceC1110a {

    /* renamed from: F */
    C0405d f1224F;

    /* renamed from: G */
    private Drawable f1225G;

    /* renamed from: H */
    private boolean f1226H;

    /* renamed from: I */
    private boolean f1227I;

    /* renamed from: J */
    private boolean f1228J;

    /* renamed from: K */
    private int f1229K;

    /* renamed from: L */
    private int f1230L;

    /* renamed from: M */
    private int f1231M;

    /* renamed from: N */
    private boolean f1232N;

    /* renamed from: O */
    private boolean f1233O;

    /* renamed from: P */
    private boolean f1234P;

    /* renamed from: Q */
    private boolean f1235Q;

    /* renamed from: R */
    private int f1236R;

    /* renamed from: S */
    private final SparseBooleanArray f1237S;

    /* renamed from: T */
    C0407e f1238T;

    /* renamed from: U */
    C0402a f1239U;

    /* renamed from: V */
    RunnableC0404c f1240V;

    /* renamed from: W */
    private C0403b f1241W;

    /* renamed from: X */
    final C0408f f1242X;

    /* renamed from: Y */
    int f1243Y;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0401a();

        /* renamed from: w */
        public int f1244w;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        /* loaded from: classes.dex */
        class C0401a implements Parcelable.Creator<SavedState> {
            C0401a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1244w);
        }

        SavedState(Parcel parcel) {
            this.f1244w = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C0402a extends C0385i {
        public C0402a(Context context, SubMenuC0394m subMenuC0394m, View view) {
            super(context, subMenuC0394m, view, false, C4897a.actionOverflowMenuStyle);
            if (!((C0382g) subMenuC0394m.getItem()).m40984l()) {
                View view2 = ActionMenuPresenter.this.f1224F;
                m40959f(view2 == null ? (View) ((AbstractC0368a) ActionMenuPresenter.this).f1003D : view2);
            }
            m40955j(ActionMenuPresenter.this.f1242X);
        }

        @Override // androidx.appcompat.view.menu.C0385i
        /* renamed from: e */
        protected void mo40875e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1239U = null;
            actionMenuPresenter.f1243Y = 0;
            super.mo40875e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    /* loaded from: classes.dex */
    private class C0403b extends ActionMenuItemView.AbstractC0367b {
        C0403b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0367b
        /* renamed from: a */
        public InterfaceC6954e mo40876a() {
            C0402a c0402a = ActionMenuPresenter.this.f1239U;
            if (c0402a != null) {
                return c0402a.m40961c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    /* loaded from: classes.dex */
    public class RunnableC0404c implements Runnable {

        /* renamed from: w */
        private C0407e f1247w;

        public RunnableC0404c(C0407e c0407e) {
            this.f1247w = c0407e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0368a) ActionMenuPresenter.this).f1007y != null) {
                ((AbstractC0368a) ActionMenuPresenter.this).f1007y.m41021d();
            }
            View view = (View) ((AbstractC0368a) ActionMenuPresenter.this).f1003D;
            if (view != null && view.getWindowToken() != null && this.f1247w.m40952m()) {
                ActionMenuPresenter.this.f1238T = this.f1247w;
            }
            ActionMenuPresenter.this.f1240V = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    /* loaded from: classes.dex */
    public class C0405d extends AppCompatImageView implements ActionMenuView.InterfaceC0409a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        /* loaded from: classes.dex */
        class C0406a extends AbstractView$OnTouchListenerC0467e0 {
            C0406a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
            /* renamed from: b */
            public InterfaceC6954e mo40648b() {
                C0407e c0407e = ActionMenuPresenter.this.f1238T;
                if (c0407e == null) {
                    return null;
                }
                return c0407e.m40961c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
            /* renamed from: c */
            public boolean mo40647c() {
                ActionMenuPresenter.this.m40891M();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0467e0
            /* renamed from: d */
            public boolean mo40646d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1240V != null) {
                    return false;
                }
                actionMenuPresenter.m40900D();
                return true;
            }
        }

        public C0405d(Context context) {
            super(context, null, C4897a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0526u0.m40411a(this, getContentDescription());
            setOnTouchListener(new C0406a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0409a
        /* renamed from: a */
        public boolean mo40858a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0409a
        /* renamed from: b */
        public boolean mo40857b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m40891M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0981a.m38865l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    /* loaded from: classes.dex */
    public class C0407e extends C0385i {
        public C0407e(Context context, C0378e c0378e, View view, boolean z) {
            super(context, c0378e, view, z, C4897a.actionOverflowMenuStyle);
            m40957h(8388613);
            m40955j(ActionMenuPresenter.this.f1242X);
        }

        @Override // androidx.appcompat.view.menu.C0385i
        /* renamed from: e */
        protected void mo40875e() {
            if (((AbstractC0368a) ActionMenuPresenter.this).f1007y != null) {
                ((AbstractC0368a) ActionMenuPresenter.this).f1007y.close();
            }
            ActionMenuPresenter.this.f1238T = null;
            super.mo40875e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    /* loaded from: classes.dex */
    private class C0408f implements InterfaceC0387j.InterfaceC0388a {
        C0408f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: b */
        public void mo40856b(C0378e c0378e, boolean z) {
            if (c0378e instanceof SubMenuC0394m) {
                c0378e.mo40940F().m41019e(false);
            }
            InterfaceC0387j.InterfaceC0388a m41067o = ActionMenuPresenter.this.m41067o();
            if (m41067o != null) {
                m41067o.mo40856b(c0378e, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: c */
        public boolean mo40855c(C0378e c0378e) {
            if (c0378e == ((AbstractC0368a) ActionMenuPresenter.this).f1007y) {
                return false;
            }
            ActionMenuPresenter.this.f1243Y = ((SubMenuC0394m) c0378e).getItem().getItemId();
            InterfaceC0387j.InterfaceC0388a m41067o = ActionMenuPresenter.this.m41067o();
            if (m41067o != null) {
                return m41067o.mo40855c(c0378e);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C4903g.abc_action_menu_layout, C4903g.abc_action_menu_item_layout);
        this.f1237S = new SparseBooleanArray();
        this.f1242X = new C0408f();
    }

    /* renamed from: B */
    private View m40902B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1003D;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0389k.InterfaceC0390a) && ((InterfaceC0389k.InterfaceC0390a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public boolean m40903A() {
        return m40900D() | m40899E();
    }

    /* renamed from: C */
    public Drawable m40901C() {
        C0405d c0405d = this.f1224F;
        if (c0405d != null) {
            return c0405d.getDrawable();
        }
        if (this.f1226H) {
            return this.f1225G;
        }
        return null;
    }

    /* renamed from: D */
    public boolean m40900D() {
        InterfaceC0389k interfaceC0389k;
        RunnableC0404c runnableC0404c = this.f1240V;
        if (runnableC0404c != null && (interfaceC0389k = this.f1003D) != null) {
            ((View) interfaceC0389k).removeCallbacks(runnableC0404c);
            this.f1240V = null;
            return true;
        }
        C0407e c0407e = this.f1238T;
        if (c0407e != null) {
            c0407e.m40962b();
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m40899E() {
        C0402a c0402a = this.f1239U;
        if (c0402a != null) {
            c0402a.m40962b();
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m40898F() {
        return this.f1240V != null || m40897G();
    }

    /* renamed from: G */
    public boolean m40897G() {
        C0407e c0407e = this.f1238T;
        return c0407e != null && c0407e.m40960d();
    }

    /* renamed from: H */
    public void m40896H(Configuration configuration) {
        if (!this.f1232N) {
            this.f1231M = C6540a.m20663b(this.f1006x).m20661d();
        }
        C0378e c0378e = this.f1007y;
        if (c0378e != null) {
            c0378e.m41039M(true);
        }
    }

    /* renamed from: I */
    public void m40895I(boolean z) {
        this.f1235Q = z;
    }

    /* renamed from: J */
    public void m40894J(ActionMenuView actionMenuView) {
        this.f1003D = actionMenuView;
        actionMenuView.mo29426b(this.f1007y);
    }

    /* renamed from: K */
    public void m40893K(Drawable drawable) {
        C0405d c0405d = this.f1224F;
        if (c0405d != null) {
            c0405d.setImageDrawable(drawable);
            return;
        }
        this.f1226H = true;
        this.f1225G = drawable;
    }

    /* renamed from: L */
    public void m40892L(boolean z) {
        this.f1227I = z;
        this.f1228J = true;
    }

    /* renamed from: M */
    public boolean m40891M() {
        C0378e c0378e;
        if (!this.f1227I || m40897G() || (c0378e = this.f1007y) == null || this.f1003D == null || this.f1240V != null || c0378e.m41046B().isEmpty()) {
            return false;
        }
        RunnableC0404c runnableC0404c = new RunnableC0404c(new C0407e(this.f1006x, this.f1007y, this.f1224F, true));
        this.f1240V = runnableC0404c;
        ((View) this.f1003D).post(runnableC0404c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a, androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
        m40903A();
        super.mo29480b(c0378e, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a
    /* renamed from: c */
    public void mo40890c(C0382g c0382g, InterfaceC0389k.InterfaceC0390a interfaceC0390a) {
        interfaceC0390a.mo29452e(c0382g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0390a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1003D);
        if (this.f1241W == null) {
            this.f1241W = new C0403b();
        }
        actionMenuItemView.setPopupCallback(this.f1241W);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a, androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: d */
    public void mo29478d(Context context, C0378e c0378e) {
        super.mo29478d(context, c0378e);
        Resources resources = context.getResources();
        C6540a m20663b = C6540a.m20663b(context);
        if (!this.f1228J) {
            this.f1227I = m20663b.m20657h();
        }
        if (!this.f1234P) {
            this.f1229K = m20663b.m20662c();
        }
        if (!this.f1232N) {
            this.f1231M = m20663b.m20661d();
        }
        int i = this.f1229K;
        if (this.f1227I) {
            if (this.f1224F == null) {
                C0405d c0405d = new C0405d(this.f1005w);
                this.f1224F = c0405d;
                if (this.f1226H) {
                    c0405d.setImageDrawable(this.f1225G);
                    this.f1225G = null;
                    this.f1226H = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1224F.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1224F.getMeasuredWidth();
        } else {
            this.f1224F = null;
        }
        this.f1230L = i;
        this.f1236R = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: e */
    public void mo29477e(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1244w) > 0 && (findItem = this.f1007y.findItem(i)) != null) {
            mo29476f((SubMenuC0394m) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a, androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        boolean z = false;
        if (subMenuC0394m.hasVisibleItems()) {
            SubMenuC0394m subMenuC0394m2 = subMenuC0394m;
            while (subMenuC0394m2.m40933i0() != this.f1007y) {
                subMenuC0394m2 = (SubMenuC0394m) subMenuC0394m2.m40933i0();
            }
            View m40902B = m40902B(subMenuC0394m2.getItem());
            if (m40902B == null) {
                return false;
            }
            this.f1243Y = subMenuC0394m.getItem().getItemId();
            int size = subMenuC0394m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC0394m.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C0402a c0402a = new C0402a(this.f1006x, subMenuC0394m, m40902B);
            this.f1239U = c0402a;
            c0402a.m40958g(z);
            this.f1239U.m40954k();
            super.mo29476f(subMenuC0394m);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a, androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        super.mo29475g(z);
        ((View) this.f1003D).requestLayout();
        C0378e c0378e = this.f1007y;
        boolean z2 = false;
        if (c0378e != null) {
            ArrayList<C0382g> m41002u = c0378e.m41002u();
            int size = m41002u.size();
            for (int i = 0; i < size; i++) {
                AbstractC1109b mo19732b = m41002u.get(i).mo19732b();
                if (mo19732b != null) {
                    mo19732b.m38485i(this);
                }
            }
        }
        C0378e c0378e2 = this.f1007y;
        ArrayList<C0382g> m41046B = c0378e2 != null ? c0378e2.m41046B() : null;
        if (this.f1227I && m41046B != null) {
            int size2 = m41046B.size();
            if (size2 == 1) {
                z2 = !m41046B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1224F == null) {
                this.f1224F = new C0405d(this.f1005w);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1224F.getParent();
            if (viewGroup != this.f1003D) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1224F);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1003D;
                actionMenuView.addView(this.f1224F, actionMenuView.m40870F());
            }
        } else {
            C0405d c0405d = this.f1224F;
            if (c0405d != null) {
                ViewParent parent = c0405d.getParent();
                InterfaceC0389k interfaceC0389k = this.f1003D;
                if (parent == interfaceC0389k) {
                    ((ViewGroup) interfaceC0389k).removeView(this.f1224F);
                }
            }
        }
        ((ActionMenuView) this.f1003D).setOverflowReserved(this.f1227I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: i */
    public boolean mo29473i() {
        ArrayList<C0382g> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0378e c0378e = actionMenuPresenter.f1007y;
        View view = null;
        ?? r3 = 0;
        if (c0378e != null) {
            arrayList = c0378e.m41042G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f1231M;
        int i6 = actionMenuPresenter.f1230L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1003D;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0382g c0382g = arrayList.get(i9);
            if (c0382g.m40981o()) {
                i7++;
            } else if (c0382g.m40982n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f1235Q && c0382g.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f1227I && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1237S;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1233O) {
            int i11 = actionMenuPresenter.f1236R;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0382g c0382g2 = arrayList.get(i12);
            if (c0382g2.m40981o()) {
                View mo40888p = actionMenuPresenter.mo40888p(c0382g2, view, viewGroup);
                if (actionMenuPresenter.f1233O) {
                    i3 -= ActionMenuView.m40864L(mo40888p, i2, i3, makeMeasureSpec, r3);
                } else {
                    mo40888p.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo40888p.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = c0382g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0382g2.m40975u(true);
                z = r3;
                i4 = i;
            } else if (c0382g2.m40982n()) {
                int groupId2 = c0382g2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!actionMenuPresenter.f1233O || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View mo40888p2 = actionMenuPresenter.mo40888p(c0382g2, null, viewGroup);
                    if (actionMenuPresenter.f1233O) {
                        int m40864L = ActionMenuView.m40864L(mo40888p2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m40864L;
                        if (m40864L == 0) {
                            z5 = false;
                        }
                    } else {
                        mo40888p2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = mo40888p2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!actionMenuPresenter.f1233O ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        C0382g c0382g3 = arrayList.get(i14);
                        if (c0382g3.getGroupId() == groupId2) {
                            if (c0382g3.m40984l()) {
                                i10++;
                            }
                            c0382g3.m40975u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                c0382g2.m40975u(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                c0382g2.m40975u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: j */
    public Parcelable mo29472j() {
        SavedState savedState = new SavedState();
        savedState.f1244w = this.f1243Y;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a
    /* renamed from: n */
    public boolean mo40889n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1224F) {
            return false;
        }
        return super.mo40889n(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a
    /* renamed from: p */
    public View mo40888p(C0382g c0382g, View view, ViewGroup viewGroup) {
        View actionView = c0382g.getActionView();
        if (actionView == null || c0382g.m40986j()) {
            actionView = super.mo40888p(c0382g, view, viewGroup);
        }
        actionView.setVisibility(c0382g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo40816o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a
    /* renamed from: q */
    public InterfaceC0389k mo40887q(ViewGroup viewGroup) {
        InterfaceC0389k interfaceC0389k = this.f1003D;
        InterfaceC0389k mo40887q = super.mo40887q(viewGroup);
        if (interfaceC0389k != mo40887q) {
            ((ActionMenuView) mo40887q).setPresenter(this);
        }
        return mo40887q;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0368a
    /* renamed from: s */
    public boolean mo40886s(int i, C0382g c0382g) {
        return c0382g.m40984l();
    }
}
