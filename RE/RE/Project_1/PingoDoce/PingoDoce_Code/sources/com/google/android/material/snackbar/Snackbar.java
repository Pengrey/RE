package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p100f8.C5419b;
import p100f8.C5425h;

/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: x */
    private static final int[] f10463x = {C5419b.snackbarButtonStyle, C5419b.snackbarTextViewStyle};

    /* renamed from: v */
    private final AccessibilityManager f10464v;

    /* renamed from: w */
    private boolean f10465w;

    /* loaded from: classes.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.C3712s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C3712s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3714a implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ View.OnClickListener f10466w;

        View$OnClickListenerC3714a(View.OnClickListener onClickListener) {
            this.f10466w = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10466w.onClick(view);
            Snackbar.this.m29271r(1);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, InterfaceC3715a interfaceC3715a) {
        super(context, viewGroup, view, interfaceC3715a);
        this.f10464v = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: Y */
    private static ViewGroup m29245Y(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: Z */
    private Button m29244Z() {
        return m29243a0().getActionView();
    }

    /* renamed from: a0 */
    private SnackbarContentLayout m29243a0() {
        return (SnackbarContentLayout) this.f10415c.getChildAt(0);
    }

    /* renamed from: b0 */
    private TextView m29242b0() {
        return m29243a0().getMessageView();
    }

    /* renamed from: c0 */
    private static boolean m29241c0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f10463x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* renamed from: d0 */
    public static Snackbar m29240d0(View view, CharSequence charSequence, int i) {
        return m29239e0(null, view, charSequence, i);
    }

    /* renamed from: e0 */
    private static Snackbar m29239e0(Context context, View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup m29245Y = m29245Y(view);
        if (m29245Y != null) {
            if (context == null) {
                context = m29245Y.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (m29241c0(context)) {
                i2 = C5425h.mtrl_layout_snackbar_include;
            } else {
                i2 = C5425h.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, m29245Y, false);
            Snackbar snackbar = new Snackbar(context, m29245Y, snackbarContentLayout, snackbarContentLayout);
            snackbar.m29237g0(charSequence);
            snackbar.m29298M(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: Q */
    public void mo29246Q() {
        super.mo29246Q();
    }

    /* renamed from: f0 */
    public Snackbar m29238f0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button m29244Z = m29244Z();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f10465w = true;
            m29244Z.setVisibility(0);
            m29244Z.setText(charSequence);
            m29244Z.setOnClickListener(new View$OnClickListenerC3714a(onClickListener));
        } else {
            m29244Z.setVisibility(8);
            m29244Z.setOnClickListener(null);
            this.f10465w = false;
        }
        return this;
    }

    /* renamed from: g0 */
    public Snackbar m29237g0(CharSequence charSequence) {
        m29242b0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: q */
    public void mo29236q() {
        super.mo29236q();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: u */
    public int mo29235u() {
        int mo29235u = super.mo29235u();
        if (mo29235u == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f10464v.getRecommendedTimeoutMillis(mo29235u, (this.f10465w ? 4 : 0) | 1 | 2);
        } else if (this.f10465w && this.f10464v.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return mo29235u;
        }
    }
}
