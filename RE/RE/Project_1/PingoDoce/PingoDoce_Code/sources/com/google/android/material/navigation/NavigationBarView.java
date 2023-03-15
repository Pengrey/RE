package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.appcompat.widget.C0520s0;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.C3469a;
import com.google.android.material.internal.C3646n;
import p100f8.C5421d;
import p100f8.C5429l;
import p189k.C6548g;
import p354s8.C10086c;
import p366t8.C10399b;
import p401v8.C11141g;
import p401v8.C11145h;
import p401v8.C11148k;
import p419w8.C11602a;

/* loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: A */
    private MenuInflater f10245A;

    /* renamed from: B */
    private InterfaceC3660c f10246B;

    /* renamed from: C */
    private InterfaceC3659b f10247C;

    /* renamed from: w */
    private final C3667b f10248w;

    /* renamed from: x */
    private final AbstractC3668c f10249x;

    /* renamed from: y */
    private final NavigationBarPresenter f10250y;

    /* renamed from: z */
    private ColorStateList f10251z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3657a();

        /* renamed from: y */
        Bundle f10252y;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        /* loaded from: classes.dex */
        class C3657a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3657a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo29460a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo29459b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo29458c(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m29461b(Parcel parcel, ClassLoader classLoader) {
            this.f10252y = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f10252y);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m29461b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    /* loaded from: classes.dex */
    class C3658a implements C0378e.InterfaceC0379a {
        C3658a() {
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: a */
        public boolean mo20648a(C0378e c0378e, MenuItem menuItem) {
            if (NavigationBarView.this.f10247C == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.f10246B == null || NavigationBarView.this.f10246B.mo4257a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f10247C.m29457a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
        /* renamed from: b */
        public void mo20647b(C0378e c0378e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3659b {
        /* renamed from: a */
        void m29457a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3660c {
        /* renamed from: a */
        boolean mo4257a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C11602a.m4640c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f10250y = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C5429l.f15210m4;
        int i3 = C5429l.f15298x4;
        int i4 = C5429l.f15290w4;
        C0520s0 m29499i = C3646n.m29499i(context2, attributeSet, iArr, i, i2, i3, i4);
        C3667b c3667b = new C3667b(context2, getClass(), getMaxItemCount());
        this.f10248w = c3667b;
        AbstractC3668c mo29464d = mo29464d(context2);
        this.f10249x = mo29464d;
        navigationBarPresenter.m29479c(mo29464d);
        navigationBarPresenter.m29481a(1);
        mo29464d.setPresenter(navigationBarPresenter);
        c3667b.m41025b(navigationBarPresenter);
        navigationBarPresenter.mo29478d(getContext(), c3667b);
        int i5 = C5429l.f15258s4;
        if (m29499i.m40456s(i5)) {
            mo29464d.setIconTintList(m29499i.m40472c(i5));
        } else {
            mo29464d.setIconTintList(mo29464d.m29423e(16842808));
        }
        setItemIconSize(m29499i.m40469f(C5429l.f15250r4, getResources().getDimensionPixelSize(C5421d.mtrl_navigation_bar_item_default_icon_size)));
        if (m29499i.m40456s(i3)) {
            setItemTextAppearanceInactive(m29499i.m40461n(i3, 0));
        }
        if (m29499i.m40456s(i4)) {
            setItemTextAppearanceActive(m29499i.m40461n(i4, 0));
        }
        int i6 = C5429l.f15306y4;
        if (m29499i.m40456s(i6)) {
            setItemTextColor(m29499i.m40472c(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C1112b0.m38399v0(this, m29465c(context2));
        }
        int i7 = C5429l.f15274u4;
        if (m29499i.m40456s(i7)) {
            setItemPaddingTop(m29499i.m40469f(i7, 0));
        }
        int i8 = C5429l.f15266t4;
        if (m29499i.m40456s(i8)) {
            setItemPaddingBottom(m29499i.m40469f(i8, 0));
        }
        int i9 = C5429l.f15226o4;
        if (m29499i.m40456s(i9)) {
            setElevation(m29499i.m40469f(i9, 0));
        }
        C0981a.m38862o(getBackground().mutate(), C10086c.m9228b(context2, m29499i, C5429l.f15218n4));
        setLabelVisibilityMode(m29499i.m40463l(C5429l.f15314z4, -1));
        int m40461n = m29499i.m40461n(C5429l.f15242q4, 0);
        if (m40461n != 0) {
            mo29464d.setItemBackgroundRes(m40461n);
        } else {
            setItemRippleColor(C10086c.m9228b(context2, m29499i, C5429l.f15282v4));
        }
        int m40461n2 = m29499i.m40461n(C5429l.f15234p4, 0);
        if (m40461n2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m40461n2, C5429l.f15158g4);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C5429l.f15176i4, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C5429l.f15167h4, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C5429l.f15194k4, 0));
            setItemActiveIndicatorColor(C10086c.m9229a(context2, obtainStyledAttributes, C5429l.f15185j4));
            setItemActiveIndicatorShapeAppearance(C11148k.m5956b(context2, obtainStyledAttributes.getResourceId(C5429l.f15202l4, 0), 0).m5914m());
            obtainStyledAttributes.recycle();
        }
        int i10 = C5429l.f14896A4;
        if (m29499i.m40456s(i10)) {
            m29462f(m29499i.m40461n(i10, 0));
        }
        m29499i.m40452w();
        addView(mo29464d);
        c3667b.mo40936V(new C3658a());
    }

    /* renamed from: c */
    private C11141g m29465c(Context context) {
        C11141g c11141g = new C11141g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c11141g.m6004Z(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c11141g.m6015O(context);
        return c11141g;
    }

    private MenuInflater getMenuInflater() {
        if (this.f10245A == null) {
            this.f10245A = new C6548g(getContext());
        }
        return this.f10245A;
    }

    /* renamed from: d */
    protected abstract AbstractC3668c mo29464d(Context context);

    /* renamed from: e */
    public C3469a m29463e(int i) {
        return this.f10249x.m29419i(i);
    }

    /* renamed from: f */
    public void m29462f(int i) {
        this.f10250y.m29474h(true);
        getMenuInflater().inflate(i, this.f10248w);
        this.f10250y.m29474h(false);
        this.f10250y.mo29475g(true);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f10249x.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f10249x.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f10249x.getItemActiveIndicatorMarginHorizontal();
    }

    public C11148k getItemActiveIndicatorShapeAppearance() {
        return this.f10249x.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f10249x.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f10249x.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f10249x.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f10249x.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f10249x.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f10249x.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f10249x.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f10251z;
    }

    public int getItemTextAppearanceActive() {
        return this.f10249x.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f10249x.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f10249x.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f10249x.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f10248w;
    }

    public InterfaceC0389k getMenuView() {
        return this.f10249x;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f10250y;
    }

    public int getSelectedItemId() {
        return this.f10249x.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5961e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        this.f10248w.m41033S(savedState.f10252y);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f10252y = bundle;
        this.f10248w.m41031U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C11145h.m5962d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f10249x.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f10249x.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f10249x.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f10249x.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C11148k c11148k) {
        this.f10249x.setItemActiveIndicatorShapeAppearance(c11148k);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f10249x.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f10249x.setItemBackground(drawable);
        this.f10251z = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f10249x.setItemBackgroundRes(i);
        this.f10251z = null;
    }

    public void setItemIconSize(int i) {
        this.f10249x.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f10249x.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f10249x.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f10249x.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f10251z == colorStateList) {
            if (colorStateList != null || this.f10249x.getItemBackground() == null) {
                return;
            }
            this.f10249x.setItemBackground(null);
            return;
        }
        this.f10251z = colorStateList;
        if (colorStateList == null) {
            this.f10249x.setItemBackground(null);
            return;
        }
        ColorStateList m8074a = C10399b.m8074a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10249x.setItemBackground(new RippleDrawable(m8074a, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m38859r = C0981a.m38859r(gradientDrawable);
        C0981a.m38862o(m38859r, m8074a);
        this.f10249x.setItemBackground(m38859r);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f10249x.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f10249x.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f10249x.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f10249x.getLabelVisibilityMode() != i) {
            this.f10249x.setLabelVisibilityMode(i);
            this.f10250y.mo29475g(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC3659b interfaceC3659b) {
        this.f10247C = interfaceC3659b;
    }

    public void setOnItemSelectedListener(InterfaceC3660c interfaceC3660c) {
        this.f10246B = interfaceC3660c;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f10248w.findItem(i);
        if (findItem == null || this.f10248w.m41037O(findItem, this.f10250y, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
