package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.C0526u0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C0955h;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.widget.C1240i;
import p070e.C4897a;
import p100f8.C5421d;
import p100f8.C5422e;
import p100f8.C5423f;
import p100f8.C5425h;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C3631f implements InterfaceC0389k.InterfaceC0390a {

    /* renamed from: e0 */
    private static final int[] f10091e0 = {16842912};

    /* renamed from: R */
    private int f10092R;

    /* renamed from: S */
    private boolean f10093S;

    /* renamed from: T */
    boolean f10094T;

    /* renamed from: U */
    private final CheckedTextView f10095U;

    /* renamed from: V */
    private FrameLayout f10096V;

    /* renamed from: W */
    private C0382g f10097W;

    /* renamed from: a0 */
    private ColorStateList f10098a0;

    /* renamed from: b0 */
    private boolean f10099b0;

    /* renamed from: c0 */
    private Drawable f10100c0;

    /* renamed from: d0 */
    private final C1078a f10101d0;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C3620a extends C1078a {
        C3620a() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38565Y(NavigationMenuItemView.this.f10094T);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m29663B() {
        if (m29661D()) {
            this.f10095U.setVisibility(8);
            FrameLayout frameLayout = this.f10096V;
            if (frameLayout != null) {
                LinearLayoutCompat.C0425a c0425a = (LinearLayoutCompat.C0425a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0425a).width = -1;
                this.f10096V.setLayoutParams(c0425a);
                return;
            }
            return;
        }
        this.f10095U.setVisibility(0);
        FrameLayout frameLayout2 = this.f10096V;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C0425a c0425a2 = (LinearLayoutCompat.C0425a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0425a2).width = -2;
            this.f10096V.setLayoutParams(c0425a2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m29662C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C4897a.f13370v, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f10091e0, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: D */
    private boolean m29661D() {
        return this.f10097W.getTitle() == null && this.f10097W.getIcon() == null && this.f10097W.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10096V == null) {
                this.f10096V = (FrameLayout) ((ViewStub) findViewById(C5423f.design_menu_item_action_area_stub)).inflate();
            }
            this.f10096V.removeAllViews();
            this.f10096V.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: d */
    public boolean mo29453d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    /* renamed from: e */
    public void mo29452e(C0382g c0382g, int i) {
        this.f10097W = c0382g;
        if (c0382g.getItemId() > 0) {
            setId(c0382g.getItemId());
        }
        setVisibility(c0382g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C1112b0.m38399v0(this, m29662C());
        }
        setCheckable(c0382g.isCheckable());
        setChecked(c0382g.isChecked());
        setEnabled(c0382g.isEnabled());
        setTitle(c0382g.getTitle());
        setIcon(c0382g.getIcon());
        setActionView(c0382g.getActionView());
        setContentDescription(c0382g.getContentDescription());
        C0526u0.m40411a(this, c0382g.getTooltipText());
        m29663B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k.InterfaceC0390a
    public C0382g getItemData() {
        return this.f10097W;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0382g c0382g = this.f10097W;
        if (c0382g != null && c0382g.isCheckable() && this.f10097W.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f10091e0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f10094T != z) {
            this.f10094T = z;
            this.f10101d0.mo35855l(this.f10095U, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f10095U.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10099b0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0981a.m38859r(drawable).mutate();
                C0981a.m38862o(drawable, this.f10098a0);
            }
            int i = this.f10092R;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f10093S) {
            if (this.f10100c0 == null) {
                Drawable m38996e = C0955h.m38996e(getResources(), C5422e.navigation_empty_icon, getContext().getTheme());
                this.f10100c0 = m38996e;
                if (m38996e != null) {
                    int i2 = this.f10092R;
                    m38996e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f10100c0;
        }
        C1240i.m37877l(this.f10095U, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f10095U.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f10092R = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f10098a0 = colorStateList;
        this.f10099b0 = colorStateList != null;
        C0382g c0382g = this.f10097W;
        if (c0382g != null) {
            setIcon(c0382g.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f10095U.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f10093S = z;
    }

    public void setTextAppearance(int i) {
        C1240i.m37872q(this.f10095U, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10095U.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10095U.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3620a c3620a = new C3620a();
        this.f10101d0 = c3620a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5425h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C5421d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C5423f.design_menu_item_text);
        this.f10095U = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1112b0.m38405s0(checkedTextView, c3620a);
    }
}
