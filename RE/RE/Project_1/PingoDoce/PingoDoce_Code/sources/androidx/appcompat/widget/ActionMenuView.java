package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements C0378e.InterfaceC0380b, InterfaceC0389k {

    /* renamed from: L */
    private C0378e f1253L;

    /* renamed from: M */
    private Context f1254M;

    /* renamed from: N */
    private int f1255N;

    /* renamed from: O */
    private boolean f1256O;

    /* renamed from: P */
    private ActionMenuPresenter f1257P;

    /* renamed from: Q */
    private InterfaceC0387j.InterfaceC0388a f1258Q;

    /* renamed from: R */
    C0378e.InterfaceC0379a f1259R;

    /* renamed from: S */
    private boolean f1260S;

    /* renamed from: T */
    private int f1261T;

    /* renamed from: U */
    private int f1262U;

    /* renamed from: V */
    private int f1263V;

    /* renamed from: W */
    InterfaceC0413e f1264W;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0409a {
        /* renamed from: a */
        boolean mo40858a();

        /* renamed from: b */
        boolean mo40857b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0410b implements InterfaceC0387j.InterfaceC0388a {
        C0410b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: b */
        public void mo40856b(C0378e c0378e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
        /* renamed from: c */
        public boolean mo40855c(C0378e c0378e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0411c extends LinearLayoutCompat.C0425a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1265a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1266b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1267c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1268d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1269e;

        /* renamed from: f */
        boolean f1270f;

        public C0411c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0411c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0411c(C0411c c0411c) {
            super(c0411c);
            this.f1265a = c0411c.f1265a;
        }

        public C0411c(int i, int i2) {
            super(i, i2);
            this.f1265a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0412d implements C0378e.InterfaceC0379a {
        C0412d() {
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: a */
        public boolean mo20648a(C0378e c0378e, MenuItem menuItem) {
            InterfaceC0413e interfaceC0413e = ActionMenuView.this.f1264W;
            return interfaceC0413e != null && interfaceC0413e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: b */
        public void mo20647b(C0378e c0378e) {
            C0378e.InterfaceC0379a interfaceC0379a = ActionMenuView.this.f1259R;
            if (interfaceC0379a != null) {
                interfaceC0379a.mo20647b(c0378e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0413e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m40864L(View view, int i, int i2, int i3, int i4) {
        C0411c c0411c = (C0411c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m41078f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (c0411c.f1265a || !z2) {
            z = false;
        }
        c0411c.f1268d = z;
        c0411c.f1266b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: M */
    private void m40863M(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f1262U;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z5) {
                    int i20 = this.f1263V;
                    i7 = i19;
                    r14 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    r14 = 0;
                }
                C0411c c0411c = (C0411c) childAt.getLayoutParams();
                c0411c.f1270f = r14;
                c0411c.f1267c = r14;
                c0411c.f1266b = r14;
                c0411c.f1268d = r14;
                ((LinearLayout.LayoutParams) c0411c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c0411c).rightMargin = r14;
                c0411c.f1269e = z5 && ((ActionMenuItemView) childAt).m41078f();
                int m40864L = m40864L(childAt, i12, c0411c.f1265a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, m40864L);
                if (c0411c.f1268d) {
                    i17++;
                }
                if (c0411c.f1265a) {
                    z4 = true;
                }
                i10 -= m40864L;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (m40864L == 1) {
                    j |= 1 << i14;
                    i13 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i21 = size2;
        boolean z6 = z4 && i15 == 2;
        boolean z7 = false;
        while (i17 > 0 && i10 > 0) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            int i24 = 0;
            long j2 = 0;
            while (i24 < childCount) {
                boolean z8 = z7;
                C0411c c0411c2 = (C0411c) getChildAt(i24).getLayoutParams();
                int i25 = i13;
                if (c0411c2.f1268d) {
                    int i26 = c0411c2.f1266b;
                    if (i26 < i22) {
                        j2 = 1 << i24;
                        i22 = i26;
                        i23 = 1;
                    } else if (i26 == i22) {
                        i23++;
                        j2 |= 1 << i24;
                    }
                }
                i24++;
                i13 = i25;
                z7 = z8;
            }
            z = z7;
            i5 = i13;
            j |= j2;
            if (i23 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i27 = i22 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                C0411c c0411c3 = (C0411c) childAt2.getLayoutParams();
                int i29 = i8;
                int i30 = mode;
                long j3 = 1 << i28;
                if ((j2 & j3) == 0) {
                    if (c0411c3.f1266b == i27) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0411c3.f1269e && i10 == 1) {
                        int i31 = this.f1263V;
                        z3 = z6;
                        childAt2.setPadding(i31 + i12, 0, i31, 0);
                    } else {
                        z3 = z6;
                    }
                    c0411c3.f1266b++;
                    c0411c3.f1270f = true;
                    i10--;
                }
                i28++;
                mode = i30;
                i8 = i29;
                z6 = z3;
            }
            i13 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = i13;
        boolean z9 = !z4 && i15 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i15 - 1 && !z9 && i16 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((C0411c) getChildAt(0).getLayoutParams()).f1269e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & (1 << i32)) != 0 && !((C0411c) getChildAt(i32).getLayoutParams()).f1269e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : i6;
            z2 = z;
            for (int i34 = i6; i34 < childCount; i34++) {
                if ((j & (1 << i34)) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0411c c0411c4 = (C0411c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0411c4.f1267c = i33;
                        c0411c4.f1270f = true;
                        if (i34 == 0 && !c0411c4.f1269e) {
                            ((LinearLayout.LayoutParams) c0411c4).leftMargin = (-i33) / 2;
                        }
                        z2 = true;
                    } else if (c0411c4.f1265a) {
                        c0411c4.f1267c = i33;
                        c0411c4.f1270f = true;
                        ((LinearLayout.LayoutParams) c0411c4).rightMargin = (-i33) / 2;
                        z2 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) c0411c4).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0411c4).rightMargin = i33 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i35 = i6; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0411c c0411c5 = (C0411c) childAt4.getLayoutParams();
                if (c0411c5.f1270f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0411c5.f1266b * i12) + c0411c5.f1267c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i21);
    }

    /* renamed from: B */
    public void m40874B() {
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m40903A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C */
    public C0411c mo40818m() {
        C0411c c0411c = new C0411c(-2, -2);
        ((LinearLayout.LayoutParams) c0411c).gravity = 16;
        return c0411c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: D */
    public C0411c mo40817n(AttributeSet attributeSet) {
        return new C0411c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E */
    public C0411c mo40816o(ViewGroup.LayoutParams layoutParams) {
        C0411c c0411c;
        if (layoutParams != null) {
            if (layoutParams instanceof C0411c) {
                c0411c = new C0411c((C0411c) layoutParams);
            } else {
                c0411c = new C0411c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0411c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0411c).gravity = 16;
            }
            return c0411c;
        }
        return mo40818m();
    }

    /* renamed from: F */
    public C0411c m40870F() {
        C0411c mo40818m = mo40818m();
        mo40818m.f1265a = true;
        return mo40818m;
    }

    /* renamed from: G */
    protected boolean m40869G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0409a)) {
            z = false | ((InterfaceC0409a) childAt).mo40858a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0409a)) ? z : z | ((InterfaceC0409a) childAt2).mo40857b();
    }

    /* renamed from: H */
    public boolean m40868H() {
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        return actionMenuPresenter != null && actionMenuPresenter.m40900D();
    }

    /* renamed from: I */
    public boolean m40867I() {
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        return actionMenuPresenter != null && actionMenuPresenter.m40898F();
    }

    /* renamed from: J */
    public boolean m40866J() {
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        return actionMenuPresenter != null && actionMenuPresenter.m40897G();
    }

    /* renamed from: K */
    public boolean m40865K() {
        return this.f1256O;
    }

    /* renamed from: N */
    public C0378e m40862N() {
        return this.f1253L;
    }

    /* renamed from: O */
    public void m40861O(InterfaceC0387j.InterfaceC0388a interfaceC0388a, C0378e.InterfaceC0379a interfaceC0379a) {
        this.f1258Q = interfaceC0388a;
        this.f1259R = interfaceC0379a;
    }

    /* renamed from: P */
    public boolean m40860P() {
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        return actionMenuPresenter != null && actionMenuPresenter.m40891M();
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0380b
    /* renamed from: a */
    public boolean mo40859a(C0382g c0382g) {
        return this.f1253L.m41038N(c0382g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k
    /* renamed from: b */
    public void mo29426b(C0378e c0378e) {
        this.f1253L = c0378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0411c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1253L == null) {
            Context context = getContext();
            C0378e c0378e = new C0378e(context);
            this.f1253L = c0378e;
            c0378e.mo40936V(new C0412d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1257P = actionMenuPresenter;
            actionMenuPresenter.m40892L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1257P;
            InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1258Q;
            if (interfaceC0388a == null) {
                interfaceC0388a = new C0410b();
            }
            actionMenuPresenter2.mo40949m(interfaceC0388a);
            this.f1253L.m41023c(this.f1257P, this.f1254M);
            this.f1257P.m40894J(this);
        }
        return this.f1253L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1257P.m40901C();
    }

    public int getPopupTheme() {
        return this.f1255N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1257P;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo29475g(false);
            if (this.f1257P.m40897G()) {
                this.f1257P.m40900D();
                this.f1257P.m40891M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40874B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1260S) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m40330b = C0541y0.m40330b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0411c c0411c = (C0411c) childAt.getLayoutParams();
                if (c0411c.f1265a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m40869G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m40330b) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0411c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0411c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0411c).leftMargin) + ((LinearLayout.LayoutParams) c0411c).rightMargin;
                    m40869G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m40330b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0411c c0411c2 = (C0411c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0411c2.f1265a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0411c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0411c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0411c c0411c3 = (C0411c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0411c3.f1265a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0411c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) c0411c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        C0378e c0378e;
        boolean z = this.f1260S;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1260S = z2;
        if (z != z2) {
            this.f1261T = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1260S && (c0378e = this.f1253L) != null && size != this.f1261T) {
            this.f1261T = size;
            c0378e.m41039M(true);
        }
        int childCount = getChildCount();
        if (this.f1260S && childCount > 0) {
            m40863M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0411c c0411c = (C0411c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) c0411c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0411c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1257P.m40895I(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0413e interfaceC0413e) {
        this.f1264W = interfaceC0413e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1257P.m40893K(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1256O = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1255N != i) {
            this.f1255N = i;
            if (i == 0) {
                this.f1254M = getContext();
            } else {
                this.f1254M = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1257P = actionMenuPresenter;
        actionMenuPresenter.m40894J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1262U = (int) (56.0f * f);
        this.f1263V = (int) (f * 4.0f);
        this.f1254M = context;
        this.f1255N = 0;
    }
}
