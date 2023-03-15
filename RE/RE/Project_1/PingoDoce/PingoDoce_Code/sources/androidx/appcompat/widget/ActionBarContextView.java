package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0378e;
import androidx.core.view.C1112b0;
import p070e.C4897a;
import p070e.C4902f;
import p070e.C4903g;
import p070e.C4906j;
import p189k.AbstractC6541b;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0452a {

    /* renamed from: E */
    private CharSequence f1176E;

    /* renamed from: F */
    private CharSequence f1177F;

    /* renamed from: G */
    private View f1178G;

    /* renamed from: H */
    private View f1179H;

    /* renamed from: I */
    private View f1180I;

    /* renamed from: J */
    private LinearLayout f1181J;

    /* renamed from: K */
    private TextView f1182K;

    /* renamed from: L */
    private TextView f1183L;

    /* renamed from: M */
    private int f1184M;

    /* renamed from: N */
    private int f1185N;

    /* renamed from: O */
    private boolean f1186O;

    /* renamed from: P */
    private int f1187P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0395a implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ AbstractC6541b f1188w;

        View$OnClickListenerC0395a(ActionBarContextView actionBarContextView, AbstractC6541b abstractC6541b) {
            this.f1188w = abstractC6541b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1188w.mo20646c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m40926i() {
        if (this.f1181J == null) {
            LayoutInflater.from(getContext()).inflate(C4903g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1181J = linearLayout;
            this.f1182K = (TextView) linearLayout.findViewById(C4902f.action_bar_title);
            this.f1183L = (TextView) this.f1181J.findViewById(C4902f.action_bar_subtitle);
            if (this.f1184M != 0) {
                this.f1182K.setTextAppearance(getContext(), this.f1184M);
            }
            if (this.f1185N != 0) {
                this.f1183L.setTextAppearance(getContext(), this.f1185N);
            }
        }
        this.f1182K.setText(this.f1176E);
        this.f1183L.setText(this.f1177F);
        boolean z = !TextUtils.isEmpty(this.f1176E);
        boolean z2 = !TextUtils.isEmpty(this.f1177F);
        int i = 0;
        this.f1183L.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1181J;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1181J.getParent() == null) {
            addView(this.f1181J);
        }
    }

    /* renamed from: g */
    public void m40928g() {
        if (this.f1178G == null) {
            m40924k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0452a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0452a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1177F;
    }

    public CharSequence getTitle() {
        return this.f1176E;
    }

    /* renamed from: h */
    public void m40927h(AbstractC6541b abstractC6541b) {
        View view = this.f1178G;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1187P, (ViewGroup) this, false);
            this.f1178G = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1178G);
        }
        View findViewById = this.f1178G.findViewById(C4902f.action_mode_close_button);
        this.f1179H = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC0395a(this, abstractC6541b));
        C0378e c0378e = (C0378e) abstractC6541b.mo20644e();
        ActionMenuPresenter actionMenuPresenter = this.f1515z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m40903A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1515z = actionMenuPresenter2;
        actionMenuPresenter2.m40892L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0378e.m41023c(this.f1515z, this.f1513x);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1515z.mo40887q(this);
        this.f1514y = actionMenuView;
        C1112b0.m38399v0(actionMenuView, null);
        addView(this.f1514y, layoutParams);
    }

    /* renamed from: j */
    public boolean m40925j() {
        return this.f1186O;
    }

    /* renamed from: k */
    public void m40924k() {
        removeAllViews();
        this.f1180I = null;
        this.f1514y = null;
        this.f1515z = null;
        View view = this.f1179H;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m40923l() {
        ActionMenuPresenter actionMenuPresenter = this.f1515z;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m40891M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1515z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m40900D();
            this.f1515z.m40899E();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1176E);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m40330b = C0541y0.m40330b(this);
        int paddingRight = m40330b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1178G;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1178G.getLayoutParams();
            int i5 = m40330b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m40330b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m40686d = AbstractC0452a.m40686d(paddingRight, i5, m40330b);
            paddingRight = AbstractC0452a.m40686d(m40686d + m40685e(this.f1178G, m40686d, paddingTop, paddingTop2, m40330b), i6, m40330b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1181J;
        if (linearLayout != null && this.f1180I == null && linearLayout.getVisibility() != 8) {
            i7 += m40685e(this.f1181J, i7, paddingTop, paddingTop2, m40330b);
        }
        int i8 = i7;
        View view2 = this.f1180I;
        if (view2 != null) {
            m40685e(view2, i8, paddingTop, paddingTop2, m40330b);
        }
        int paddingLeft = m40330b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1514y;
        if (actionMenuView != null) {
            m40685e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m40330b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i3 = this.f1508A;
                if (i3 <= 0) {
                    i3 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i4 = i3 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                View view = this.f1178G;
                if (view != null) {
                    int m40687c = m40687c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1178G.getLayoutParams();
                    paddingLeft = m40687c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1514y;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m40687c(this.f1514y, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1181J;
                if (linearLayout != null && this.f1180I == null) {
                    if (this.f1186O) {
                        this.f1181J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1181J.getMeasuredWidth();
                        boolean z = measuredWidth <= paddingLeft;
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        this.f1181J.setVisibility(z ? 0 : 8);
                    } else {
                        paddingLeft = m40687c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1180I;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i5 = layoutParams.width;
                    int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
                    if (i5 >= 0) {
                        paddingLeft = Math.min(i5, paddingLeft);
                    }
                    int i7 = layoutParams.height;
                    int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
                    if (i7 >= 0) {
                        i4 = Math.min(i7, i4);
                    }
                    this.f1180I.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
                }
                if (this.f1508A <= 0) {
                    int childCount = getChildCount();
                    int i9 = 0;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i9) {
                            i9 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i9);
                    return;
                }
                setMeasuredDimension(size, i3);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC0452a
    public void setContentHeight(int i) {
        this.f1508A = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1180I;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1180I = view;
        if (view != null && (linearLayout = this.f1181J) != null) {
            removeView(linearLayout);
            this.f1181J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1177F = charSequence;
        m40926i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1176E = charSequence;
        m40926i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1186O) {
            requestLayout();
        }
        this.f1186O = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0452a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, C4906j.f13606x, i, 0);
        C1112b0.m38399v0(this, m40453v.m40468g(C4906j.f13611y));
        this.f1184M = m40453v.m40461n(C4906j.f13389C, 0);
        this.f1185N = m40453v.m40461n(C4906j.f13384B, 0);
        this.f1508A = m40453v.m40462m(C4906j.f13379A, 0);
        this.f1187P = m40453v.m40461n(C4906j.f13616z, C4903g.abc_action_mode_close_item_material);
        m40453v.m40452w();
    }
}
