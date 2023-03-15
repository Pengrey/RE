package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0319a;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.SubMenuC0394m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import androidx.core.view.C1170i;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p070e.C4897a;
import p070e.C4906j;
import p111g.C5586a;
import p189k.C6548g;
import p189k.InterfaceC6543c;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ImageView f1453A;

    /* renamed from: B */
    private Drawable f1454B;

    /* renamed from: C */
    private CharSequence f1455C;

    /* renamed from: D */
    ImageButton f1456D;

    /* renamed from: E */
    View f1457E;

    /* renamed from: F */
    private Context f1458F;

    /* renamed from: G */
    private int f1459G;

    /* renamed from: H */
    private int f1460H;

    /* renamed from: I */
    private int f1461I;

    /* renamed from: J */
    int f1462J;

    /* renamed from: K */
    private int f1463K;

    /* renamed from: L */
    private int f1464L;

    /* renamed from: M */
    private int f1465M;

    /* renamed from: N */
    private int f1466N;

    /* renamed from: O */
    private int f1467O;

    /* renamed from: P */
    private C0497k0 f1468P;

    /* renamed from: Q */
    private int f1469Q;

    /* renamed from: R */
    private int f1470R;

    /* renamed from: S */
    private int f1471S;

    /* renamed from: T */
    private CharSequence f1472T;

    /* renamed from: U */
    private CharSequence f1473U;

    /* renamed from: V */
    private ColorStateList f1474V;

    /* renamed from: W */
    private ColorStateList f1475W;

    /* renamed from: a0 */
    private boolean f1476a0;

    /* renamed from: b0 */
    private boolean f1477b0;

    /* renamed from: c0 */
    private final ArrayList<View> f1478c0;

    /* renamed from: d0 */
    private final ArrayList<View> f1479d0;

    /* renamed from: e0 */
    private final int[] f1480e0;

    /* renamed from: f0 */
    InterfaceC0450f f1481f0;

    /* renamed from: g0 */
    private final ActionMenuView.InterfaceC0413e f1482g0;

    /* renamed from: h0 */
    private C0522t0 f1483h0;

    /* renamed from: i0 */
    private ActionMenuPresenter f1484i0;

    /* renamed from: j0 */
    private C0448d f1485j0;

    /* renamed from: k0 */
    private InterfaceC0387j.InterfaceC0388a f1486k0;

    /* renamed from: l0 */
    private C0378e.InterfaceC0379a f1487l0;

    /* renamed from: m0 */
    private boolean f1488m0;

    /* renamed from: n0 */
    private final Runnable f1489n0;

    /* renamed from: w */
    private ActionMenuView f1490w;

    /* renamed from: x */
    private TextView f1491x;

    /* renamed from: y */
    private TextView f1492y;

    /* renamed from: z */
    private ImageButton f1493z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0445a implements ActionMenuView.InterfaceC0413e {
        C0445a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0413e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0450f interfaceC0450f = Toolbar.this.f1481f0;
            if (interfaceC0450f != null) {
                return interfaceC0450f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0446b implements Runnable {
        RunnableC0446b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m40722N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0447c implements View.OnClickListener {
        View$OnClickListenerC0447c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m40717e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0448d implements InterfaceC0387j {

        /* renamed from: w */
        C0378e f1499w;

        /* renamed from: x */
        C0382g f1500x;

        C0448d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: b */
        public void mo29480b(C0378e c0378e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: d */
        public void mo29478d(Context context, C0378e c0378e) {
            C0382g c0382g;
            C0378e c0378e2 = this.f1499w;
            if (c0378e2 != null && (c0382g = this.f1500x) != null) {
                c0378e2.mo40935f(c0382g);
            }
            this.f1499w = c0378e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: e */
        public void mo29477e(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: f */
        public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: g */
        public void mo29475g(boolean z) {
            if (this.f1500x != null) {
                C0378e c0378e = this.f1499w;
                boolean z2 = false;
                if (c0378e != null) {
                    int size = c0378e.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1499w.getItem(i) == this.f1500x) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo29471k(this.f1499w, this.f1500x);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        public int getId() {
            return 0;
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
        /* renamed from: k */
        public boolean mo29471k(C0378e c0378e, C0382g c0382g) {
            View view = Toolbar.this.f1457E;
            if (view instanceof InterfaceC6543c) {
                ((InterfaceC6543c) view).mo19711f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1457E);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1456D);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1457E = null;
            toolbar3.m40721a();
            this.f1500x = null;
            Toolbar.this.requestLayout();
            c0382g.m40978r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j
        /* renamed from: l */
        public boolean mo29470l(C0378e c0378e, C0382g c0382g) {
            Toolbar.this.m40715g();
            ViewParent parent = Toolbar.this.f1456D.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1456D);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1456D);
            }
            Toolbar.this.f1457E = c0382g.getActionView();
            this.f1500x = c0382g;
            ViewParent parent2 = Toolbar.this.f1457E.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1457E);
                }
                C0449e mo40709m = Toolbar.this.mo40709m();
                Toolbar toolbar4 = Toolbar.this;
                mo40709m.f795a = 8388611 | (toolbar4.f1462J & 112);
                mo40709m.f1502b = 2;
                toolbar4.f1457E.setLayoutParams(mo40709m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1457E);
            }
            Toolbar.this.m40729G();
            Toolbar.this.requestLayout();
            c0382g.m40978r(true);
            View view = Toolbar.this.f1457E;
            if (view instanceof InterfaceC6543c) {
                ((InterfaceC6543c) view).mo19712c();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0450f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.f13366O);
    }

    /* renamed from: B */
    private int m40734B(View view, int i, int[] iArr, int i2) {
        C0449e c0449e = (C0449e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0449e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m40705q = m40705q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m40705q, max + measuredWidth, view.getMeasuredHeight() + m40705q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0449e).rightMargin;
    }

    /* renamed from: C */
    private int m40733C(View view, int i, int[] iArr, int i2) {
        C0449e c0449e = (C0449e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0449e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m40705q = m40705q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m40705q, max, view.getMeasuredHeight() + m40705q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0449e).leftMargin);
    }

    /* renamed from: D */
    private int m40732D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m40731E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m40730F() {
        removeCallbacks(this.f1489n0);
        post(this.f1489n0);
    }

    /* renamed from: L */
    private boolean m40724L() {
        if (this.f1488m0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (m40723M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: M */
    private boolean m40723M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m40720b(List<View> list, int i) {
        boolean z = C1112b0.m38476E(this) == 1;
        int childCount = getChildCount();
        int m38197b = C1158f.m38197b(i, C1112b0.m38476E(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0449e c0449e = (C0449e) childAt.getLayoutParams();
                if (c0449e.f1502b == 0 && m40723M(childAt) && m40706p(c0449e.f795a) == m38197b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0449e c0449e2 = (C0449e) childAt2.getLayoutParams();
            if (c0449e2.f1502b == 0 && m40723M(childAt2) && m40706p(c0449e2.f795a) == m38197b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m40719c(View view, boolean z) {
        C0449e c0449e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0449e = mo40709m();
        } else if (!checkLayoutParams(layoutParams)) {
            c0449e = mo40707o(layoutParams);
        } else {
            c0449e = (C0449e) layoutParams;
        }
        c0449e.f1502b = 1;
        if (z && this.f1457E != null) {
            view.setLayoutParams(c0449e);
            this.f1479d0.add(view);
            return;
        }
        addView(view, c0449e);
    }

    private MenuInflater getMenuInflater() {
        return new C6548g(getContext());
    }

    /* renamed from: h */
    private void m40714h() {
        if (this.f1468P == null) {
            this.f1468P = new C0497k0();
        }
    }

    /* renamed from: i */
    private void m40713i() {
        if (this.f1453A == null) {
            this.f1453A = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m40712j() {
        m40711k();
        if (this.f1490w.m40862N() == null) {
            C0378e c0378e = (C0378e) this.f1490w.getMenu();
            if (this.f1485j0 == null) {
                this.f1485j0 = new C0448d();
            }
            this.f1490w.setExpandedActionViewsExclusive(true);
            c0378e.m41023c(this.f1485j0, this.f1458F);
        }
    }

    /* renamed from: k */
    private void m40711k() {
        if (this.f1490w == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1490w = actionMenuView;
            actionMenuView.setPopupTheme(this.f1459G);
            this.f1490w.setOnMenuItemClickListener(this.f1482g0);
            this.f1490w.m40861O(this.f1486k0, this.f1487l0);
            C0449e mo40709m = mo40709m();
            mo40709m.f795a = 8388613 | (this.f1462J & 112);
            this.f1490w.setLayoutParams(mo40709m);
            m40719c(this.f1490w, false);
        }
    }

    /* renamed from: l */
    private void m40710l() {
        if (this.f1493z == null) {
            this.f1493z = new C0498l(getContext(), null, C4897a.toolbarNavigationButtonStyle);
            C0449e mo40709m = mo40709m();
            mo40709m.f795a = 8388611 | (this.f1462J & 112);
            this.f1493z.setLayoutParams(mo40709m);
        }
    }

    /* renamed from: p */
    private int m40706p(int i) {
        int m38476E = C1112b0.m38476E(this);
        int m38197b = C1158f.m38197b(i, m38476E) & 7;
        return (m38197b == 1 || m38197b == 3 || m38197b == 5) ? m38197b : m38476E == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m40705q(View view, int i) {
        C0449e c0449e = (C0449e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m40704r = m40704r(c0449e.f795a);
        if (m40704r != 48) {
            if (m40704r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c0449e).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c0449e).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0449e).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: r */
    private int m40704r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1471S & 112;
    }

    /* renamed from: s */
    private int m40703s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1170i.m38156b(marginLayoutParams) + C1170i.m38157a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m40702t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m40701u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0449e c0449e = (C0449e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0449e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0449e).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m40697y(View view) {
        return view.getParent() == this || this.f1479d0.contains(view);
    }

    /* renamed from: A */
    public boolean m40735A() {
        ActionMenuView actionMenuView = this.f1490w;
        return actionMenuView != null && actionMenuView.m40866J();
    }

    /* renamed from: G */
    void m40729G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0449e) childAt.getLayoutParams()).f1502b != 2 && childAt != this.f1490w) {
                removeViewAt(childCount);
                this.f1479d0.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void m40728H(int i, int i2) {
        m40714h();
        this.f1468P.m40533g(i, i2);
    }

    /* renamed from: I */
    public void m40727I(C0378e c0378e, ActionMenuPresenter actionMenuPresenter) {
        if (c0378e == null && this.f1490w == null) {
            return;
        }
        m40711k();
        C0378e m40862N = this.f1490w.m40862N();
        if (m40862N == c0378e) {
            return;
        }
        if (m40862N != null) {
            m40862N.m41035Q(this.f1484i0);
            m40862N.m41035Q(this.f1485j0);
        }
        if (this.f1485j0 == null) {
            this.f1485j0 = new C0448d();
        }
        actionMenuPresenter.m40895I(true);
        if (c0378e != null) {
            c0378e.m41023c(actionMenuPresenter, this.f1458F);
            c0378e.m41023c(this.f1485j0, this.f1458F);
        } else {
            actionMenuPresenter.mo29478d(this.f1458F, null);
            this.f1485j0.mo29478d(this.f1458F, null);
            actionMenuPresenter.mo29475g(true);
            this.f1485j0.mo29475g(true);
        }
        this.f1490w.setPopupTheme(this.f1459G);
        this.f1490w.setPresenter(actionMenuPresenter);
        this.f1484i0 = actionMenuPresenter;
    }

    /* renamed from: J */
    public void m40726J(Context context, int i) {
        this.f1461I = i;
        TextView textView = this.f1492y;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: K */
    public void m40725K(Context context, int i) {
        this.f1460H = i;
        TextView textView = this.f1491x;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public boolean m40722N() {
        ActionMenuView actionMenuView = this.f1490w;
        return actionMenuView != null && actionMenuView.m40860P();
    }

    /* renamed from: a */
    void m40721a() {
        for (int size = this.f1479d0.size() - 1; size >= 0; size--) {
            addView(this.f1479d0.get(size));
        }
        this.f1479d0.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0449e);
    }

    /* renamed from: d */
    public boolean m40718d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1490w) != null && actionMenuView.m40865K();
    }

    /* renamed from: e */
    public void m40717e() {
        C0448d c0448d = this.f1485j0;
        C0382g c0382g = c0448d == null ? null : c0448d.f1500x;
        if (c0382g != null) {
            c0382g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m40716f() {
        ActionMenuView actionMenuView = this.f1490w;
        if (actionMenuView != null) {
            actionMenuView.m40874B();
        }
    }

    /* renamed from: g */
    void m40715g() {
        if (this.f1456D == null) {
            C0498l c0498l = new C0498l(getContext(), null, C4897a.toolbarNavigationButtonStyle);
            this.f1456D = c0498l;
            c0498l.setImageDrawable(this.f1454B);
            this.f1456D.setContentDescription(this.f1455C);
            C0449e mo40709m = mo40709m();
            mo40709m.f795a = 8388611 | (this.f1462J & 112);
            mo40709m.f1502b = 2;
            this.f1456D.setLayoutParams(mo40709m);
            this.f1456D.setOnClickListener(new View$OnClickListenerC0447c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1456D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1456D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0497k0 c0497k0 = this.f1468P;
        if (c0497k0 != null) {
            return c0497k0.m40539a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1470R;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0497k0 c0497k0 = this.f1468P;
        if (c0497k0 != null) {
            return c0497k0.m40538b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0497k0 c0497k0 = this.f1468P;
        if (c0497k0 != null) {
            return c0497k0.m40537c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0497k0 c0497k0 = this.f1468P;
        if (c0497k0 != null) {
            return c0497k0.m40536d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1469Q;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0378e m40862N;
        ActionMenuView actionMenuView = this.f1490w;
        if ((actionMenuView == null || (m40862N = actionMenuView.m40862N()) == null || !m40862N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1470R, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C1112b0.m38476E(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C1112b0.m38476E(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1469Q, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1453A;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1453A;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m40712j();
        return this.f1490w.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1493z;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1493z;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1484i0;
    }

    public Drawable getOverflowIcon() {
        m40712j();
        return this.f1490w.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1458F;
    }

    public int getPopupTheme() {
        return this.f1459G;
    }

    public CharSequence getSubtitle() {
        return this.f1473U;
    }

    final TextView getSubtitleTextView() {
        return this.f1492y;
    }

    public CharSequence getTitle() {
        return this.f1472T;
    }

    public int getTitleMarginBottom() {
        return this.f1467O;
    }

    public int getTitleMarginEnd() {
        return this.f1465M;
    }

    public int getTitleMarginStart() {
        return this.f1464L;
    }

    public int getTitleMarginTop() {
        return this.f1466N;
    }

    final TextView getTitleTextView() {
        return this.f1491x;
    }

    public InterfaceC0454a0 getWrapper() {
        if (this.f1483h0 == null) {
            this.f1483h0 = new C0522t0(this, true);
        }
        return this.f1483h0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0449e mo40709m() {
        return new C0449e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0449e mo40708n(AttributeSet attributeSet) {
        return new C0449e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0449e mo40707o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0449e) {
            return new C0449e((C0449e) layoutParams);
        }
        if (layoutParams instanceof AbstractC0319a.C0320a) {
            return new C0449e((AbstractC0319a.C0320a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0449e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0449e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1489n0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1477b0 = false;
        }
        if (!this.f1477b0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1477b0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1477b0 = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1480e0;
        boolean m40330b = C0541y0.m40330b(this);
        int i10 = !m40330b ? 1 : 0;
        if (m40723M(this.f1493z)) {
            m40731E(this.f1493z, i, 0, i2, 0, this.f1463K);
            i3 = this.f1493z.getMeasuredWidth() + m40703s(this.f1493z);
            i4 = Math.max(0, this.f1493z.getMeasuredHeight() + m40702t(this.f1493z));
            i5 = View.combineMeasuredStates(0, this.f1493z.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m40723M(this.f1456D)) {
            m40731E(this.f1456D, i, 0, i2, 0, this.f1463K);
            i3 = this.f1456D.getMeasuredWidth() + m40703s(this.f1456D);
            i4 = Math.max(i4, this.f1456D.getMeasuredHeight() + m40702t(this.f1456D));
            i5 = View.combineMeasuredStates(i5, this.f1456D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[m40330b ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (m40723M(this.f1490w)) {
            m40731E(this.f1490w, i, max, i2, 0, this.f1463K);
            i6 = this.f1490w.getMeasuredWidth() + m40703s(this.f1490w);
            i4 = Math.max(i4, this.f1490w.getMeasuredHeight() + m40702t(this.f1490w));
            i5 = View.combineMeasuredStates(i5, this.f1490w.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (m40723M(this.f1457E)) {
            max2 += m40732D(this.f1457E, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1457E.getMeasuredHeight() + m40702t(this.f1457E));
            i5 = View.combineMeasuredStates(i5, this.f1457E.getMeasuredState());
        }
        if (m40723M(this.f1453A)) {
            max2 += m40732D(this.f1453A, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1453A.getMeasuredHeight() + m40702t(this.f1453A));
            i5 = View.combineMeasuredStates(i5, this.f1453A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0449e) childAt.getLayoutParams()).f1502b == 0 && m40723M(childAt)) {
                max2 += m40732D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m40702t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1466N + this.f1467O;
        int i13 = this.f1464L + this.f1465M;
        if (m40723M(this.f1491x)) {
            m40732D(this.f1491x, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1491x.getMeasuredWidth() + m40703s(this.f1491x);
            i7 = this.f1491x.getMeasuredHeight() + m40702t(this.f1491x);
            i8 = View.combineMeasuredStates(i5, this.f1491x.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (m40723M(this.f1492y)) {
            i9 = Math.max(i9, m40732D(this.f1492y, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1492y.getMeasuredHeight() + m40702t(this.f1492y);
            i8 = View.combineMeasuredStates(i8, this.f1492y.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i8), m40724L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i4, i7) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        ActionMenuView actionMenuView = this.f1490w;
        C0378e m40862N = actionMenuView != null ? actionMenuView.m40862N() : null;
        int i = savedState.f1494y;
        if (i != 0 && this.f1485j0 != null && m40862N != null && (findItem = m40862N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1495z) {
            m40730F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m40714h();
        this.f1468P.m40534f(i == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0382g c0382g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0448d c0448d = this.f1485j0;
        if (c0448d != null && (c0382g = c0448d.f1500x) != null) {
            savedState.f1494y = c0382g.getItemId();
        }
        savedState.f1495z = m40735A();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1476a0 = false;
        }
        if (!this.f1476a0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1476a0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1476a0 = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C5586a.m23699b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1488m0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1470R) {
            this.f1470R = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1469Q) {
            this.f1469Q = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C5586a.m23699b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C5586a.m23699b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m40710l();
        this.f1493z.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0450f interfaceC0450f) {
        this.f1481f0 = interfaceC0450f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m40712j();
        this.f1490w.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1459G != i) {
            this.f1459G = i;
            if (i == 0) {
                this.f1458F = getContext();
            } else {
                this.f1458F = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1467O = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1465M = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1464L = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1466N = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean m40700v() {
        C0448d c0448d = this.f1485j0;
        return (c0448d == null || c0448d.f1500x == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m40699w() {
        ActionMenuView actionMenuView = this.f1490w;
        return actionMenuView != null && actionMenuView.m40868H();
    }

    /* renamed from: x */
    public void m40698x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean m40696z() {
        ActionMenuView actionMenuView = this.f1490w;
        return actionMenuView != null && actionMenuView.m40867I();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0449e extends AbstractC0319a.C0320a {

        /* renamed from: b */
        int f1502b;

        public C0449e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1502b = 0;
        }

        /* renamed from: a */
        void m40692a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0449e(int i, int i2) {
            super(i, i2);
            this.f1502b = 0;
            this.f795a = 8388627;
        }

        public C0449e(C0449e c0449e) {
            super((AbstractC0319a.C0320a) c0449e);
            this.f1502b = 0;
            this.f1502b = c0449e.f1502b;
        }

        public C0449e(AbstractC0319a.C0320a c0320a) {
            super(c0320a);
            this.f1502b = 0;
        }

        public C0449e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1502b = 0;
            m40692a(marginLayoutParams);
        }

        public C0449e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1502b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1471S = 8388627;
        this.f1478c0 = new ArrayList<>();
        this.f1479d0 = new ArrayList<>();
        this.f1480e0 = new int[2];
        this.f1482g0 = new C0445a();
        this.f1489n0 = new RunnableC0446b();
        Context context2 = getContext();
        int[] iArr = C4906j.f13466T2;
        C0520s0 m40453v = C0520s0.m40453v(context2, attributeSet, iArr, i, 0);
        C1112b0.m38409q0(this, context, iArr, attributeSet, m40453v.m40457r(), i, 0);
        this.f1460H = m40453v.m40461n(C4906j.f13600v3, 0);
        this.f1461I = m40453v.m40461n(C4906j.f13555m3, 0);
        this.f1471S = m40453v.m40463l(C4906j.f13470U2, this.f1471S);
        this.f1462J = m40453v.m40463l(C4906j.f13474V2, 48);
        int m40470e = m40453v.m40470e(C4906j.f13570p3, 0);
        int i2 = C4906j.f13595u3;
        m40470e = m40453v.m40456s(i2) ? m40453v.m40470e(i2, m40470e) : m40470e;
        this.f1467O = m40470e;
        this.f1466N = m40470e;
        this.f1465M = m40470e;
        this.f1464L = m40470e;
        int m40470e2 = m40453v.m40470e(C4906j.f13585s3, -1);
        if (m40470e2 >= 0) {
            this.f1464L = m40470e2;
        }
        int m40470e3 = m40453v.m40470e(C4906j.f13580r3, -1);
        if (m40470e3 >= 0) {
            this.f1465M = m40470e3;
        }
        int m40470e4 = m40453v.m40470e(C4906j.f13590t3, -1);
        if (m40470e4 >= 0) {
            this.f1466N = m40470e4;
        }
        int m40470e5 = m40453v.m40470e(C4906j.f13575q3, -1);
        if (m40470e5 >= 0) {
            this.f1467O = m40470e5;
        }
        this.f1463K = m40453v.m40469f(C4906j.f13525g3, -1);
        int m40470e6 = m40453v.m40470e(C4906j.f13505c3, Integer.MIN_VALUE);
        int m40470e7 = m40453v.m40470e(C4906j.f13486Y2, Integer.MIN_VALUE);
        int m40469f = m40453v.m40469f(C4906j.f13495a3, 0);
        int m40469f2 = m40453v.m40469f(C4906j.f13500b3, 0);
        m40714h();
        this.f1468P.m40535e(m40469f, m40469f2);
        if (m40470e6 != Integer.MIN_VALUE || m40470e7 != Integer.MIN_VALUE) {
            this.f1468P.m40533g(m40470e6, m40470e7);
        }
        this.f1469Q = m40453v.m40470e(C4906j.f13510d3, Integer.MIN_VALUE);
        this.f1470R = m40453v.m40470e(C4906j.f13490Z2, Integer.MIN_VALUE);
        this.f1454B = m40453v.m40468g(C4906j.f13482X2);
        this.f1455C = m40453v.m40459p(C4906j.f13478W2);
        CharSequence m40459p = m40453v.m40459p(C4906j.f13565o3);
        if (!TextUtils.isEmpty(m40459p)) {
            setTitle(m40459p);
        }
        CharSequence m40459p2 = m40453v.m40459p(C4906j.f13550l3);
        if (!TextUtils.isEmpty(m40459p2)) {
            setSubtitle(m40459p2);
        }
        this.f1458F = getContext();
        setPopupTheme(m40453v.m40461n(C4906j.f13545k3, 0));
        Drawable m40468g = m40453v.m40468g(C4906j.f13540j3);
        if (m40468g != null) {
            setNavigationIcon(m40468g);
        }
        CharSequence m40459p3 = m40453v.m40459p(C4906j.f13535i3);
        if (!TextUtils.isEmpty(m40459p3)) {
            setNavigationContentDescription(m40459p3);
        }
        Drawable m40468g2 = m40453v.m40468g(C4906j.f13515e3);
        if (m40468g2 != null) {
            setLogo(m40468g2);
        }
        CharSequence m40459p4 = m40453v.m40459p(C4906j.f13520f3);
        if (!TextUtils.isEmpty(m40459p4)) {
            setLogoDescription(m40459p4);
        }
        int i3 = C4906j.f13605w3;
        if (m40453v.m40456s(i3)) {
            setTitleTextColor(m40453v.m40472c(i3));
        }
        int i4 = C4906j.f13560n3;
        if (m40453v.m40456s(i4)) {
            setSubtitleTextColor(m40453v.m40472c(i4));
        }
        int i5 = C4906j.f13530h3;
        if (m40453v.m40456s(i5)) {
            m40698x(m40453v.m40461n(i5, 0));
        }
        m40453v.m40452w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40715g();
        }
        ImageButton imageButton = this.f1456D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m40715g();
            this.f1456D.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1456D;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1454B);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m40713i();
            if (!m40697y(this.f1453A)) {
                m40719c(this.f1453A, true);
            }
        } else {
            ImageView imageView = this.f1453A;
            if (imageView != null && m40697y(imageView)) {
                removeView(this.f1453A);
                this.f1479d0.remove(this.f1453A);
            }
        }
        ImageView imageView2 = this.f1453A;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40713i();
        }
        ImageView imageView = this.f1453A;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40710l();
        }
        ImageButton imageButton = this.f1493z;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40710l();
            if (!m40697y(this.f1493z)) {
                m40719c(this.f1493z, true);
            }
        } else {
            ImageButton imageButton = this.f1493z;
            if (imageButton != null && m40697y(imageButton)) {
                removeView(this.f1493z);
                this.f1479d0.remove(this.f1493z);
            }
        }
        ImageButton imageButton2 = this.f1493z;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1492y == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1492y = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1492y.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1461I;
                if (i != 0) {
                    this.f1492y.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1475W;
                if (colorStateList != null) {
                    this.f1492y.setTextColor(colorStateList);
                }
            }
            if (!m40697y(this.f1492y)) {
                m40719c(this.f1492y, true);
            }
        } else {
            TextView textView = this.f1492y;
            if (textView != null && m40697y(textView)) {
                removeView(this.f1492y);
                this.f1479d0.remove(this.f1492y);
            }
        }
        TextView textView2 = this.f1492y;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1473U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1475W = colorStateList;
        TextView textView = this.f1492y;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1491x == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1491x = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1491x.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1460H;
                if (i != 0) {
                    this.f1491x.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1474V;
                if (colorStateList != null) {
                    this.f1491x.setTextColor(colorStateList);
                }
            }
            if (!m40697y(this.f1491x)) {
                m40719c(this.f1491x, true);
            }
        } else {
            TextView textView = this.f1491x;
            if (textView != null && m40697y(textView)) {
                removeView(this.f1491x);
                this.f1479d0.remove(this.f1491x);
            }
        }
        TextView textView2 = this.f1491x;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1472T = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1474V = colorStateList;
        TextView textView = this.f1491x;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0444a();

        /* renamed from: y */
        int f1494y;

        /* renamed from: z */
        boolean f1495z;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes.dex */
        class C0444a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0444a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo40695a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo40694b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo40693c(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1494y = parcel.readInt();
            this.f1495z = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1494y);
            parcel.writeInt(this.f1495z ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
