package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0389k;
import androidx.core.util.C1075g;
import androidx.core.util.InterfaceC1073e;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.badge.C3469a;
import com.google.android.material.internal.C3643l;
import java.util.HashSet;
import p039c3.C1993b;
import p039c3.C2046o;
import p039c3.C2050q;
import p070e.C4897a;
import p100f8.C5419b;
import p100f8.C5424g;
import p111g.C5586a;
import p120g8.C5616a;
import p310q8.C9698a;
import p401v8.C11141g;
import p401v8.C11148k;

/* renamed from: com.google.android.material.navigation.c */
/* loaded from: classes.dex */
public abstract class AbstractC3668c extends ViewGroup implements InterfaceC0389k {

    /* renamed from: b0 */
    private static final int[] f10292b0 = {16842912};

    /* renamed from: c0 */
    private static final int[] f10293c0 = {-16842910};

    /* renamed from: A */
    private int f10294A;

    /* renamed from: B */
    private AbstractC3661a[] f10295B;

    /* renamed from: C */
    private int f10296C;

    /* renamed from: D */
    private int f10297D;

    /* renamed from: E */
    private ColorStateList f10298E;

    /* renamed from: F */
    private int f10299F;

    /* renamed from: G */
    private ColorStateList f10300G;

    /* renamed from: H */
    private final ColorStateList f10301H;

    /* renamed from: I */
    private int f10302I;

    /* renamed from: J */
    private int f10303J;

    /* renamed from: K */
    private Drawable f10304K;

    /* renamed from: L */
    private int f10305L;

    /* renamed from: M */
    private final SparseArray<C3469a> f10306M;

    /* renamed from: N */
    private int f10307N;

    /* renamed from: O */
    private int f10308O;

    /* renamed from: P */
    private boolean f10309P;

    /* renamed from: Q */
    private int f10310Q;

    /* renamed from: R */
    private int f10311R;

    /* renamed from: S */
    private int f10312S;

    /* renamed from: T */
    private C11148k f10313T;

    /* renamed from: U */
    private boolean f10314U;

    /* renamed from: V */
    private ColorStateList f10315V;

    /* renamed from: W */
    private NavigationBarPresenter f10316W;

    /* renamed from: a0 */
    private C0378e f10317a0;

    /* renamed from: w */
    private final C2050q f10318w;

    /* renamed from: x */
    private final View.OnClickListener f10319x;

    /* renamed from: y */
    private final InterfaceC1073e<AbstractC3661a> f10320y;

    /* renamed from: z */
    private final SparseArray<View.OnTouchListener> f10321z;

    /* compiled from: NavigationBarMenuView.java */
    /* renamed from: com.google.android.material.navigation.c$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3669a implements View.OnClickListener {
        View$OnClickListenerC3669a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0382g itemData = ((AbstractC3661a) view).getItemData();
            if (AbstractC3668c.this.f10317a0.m41037O(itemData, AbstractC3668c.this.f10316W, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public AbstractC3668c(Context context) {
        super(context);
        this.f10320y = new C1075g(5);
        this.f10321z = new SparseArray<>(5);
        this.f10296C = 0;
        this.f10297D = 0;
        this.f10306M = new SparseArray<>(5);
        this.f10307N = -1;
        this.f10308O = -1;
        this.f10314U = false;
        this.f10301H = m29423e(16842808);
        if (isInEditMode()) {
            this.f10318w = null;
        } else {
            C1993b c1993b = new C1993b();
            this.f10318w = c1993b;
            c1993b.m34820q0(0);
            c1993b.mo34842Y(C9698a.m10188d(getContext(), C5419b.motionDurationLong1, getResources().getInteger(C5424g.material_motion_duration_long_1)));
            c1993b.mo34839a0(C9698a.m10187e(getContext(), C5419b.motionEasingStandard, C5616a.f15854b));
            c1993b.m34830i0(new C3643l());
        }
        this.f10319x = new View$OnClickListenerC3669a();
        C1112b0.m38479C0(this, 1);
    }

    /* renamed from: f */
    private Drawable m29422f() {
        if (this.f10313T == null || this.f10315V == null) {
            return null;
        }
        C11141g c11141g = new C11141g(this.f10313T);
        c11141g.m6004Z(this.f10315V);
        return c11141g;
    }

    private AbstractC3661a getNewItem() {
        AbstractC3661a mo38625b = this.f10320y.mo38625b();
        return mo38625b == null ? mo29421g(getContext()) : mo38625b;
    }

    /* renamed from: k */
    private boolean m29417k(int i) {
        return i != -1;
    }

    /* renamed from: l */
    private void m29416l() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f10317a0.size(); i++) {
            hashSet.add(Integer.valueOf(this.f10317a0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f10306M.size(); i2++) {
            int keyAt = this.f10306M.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f10306M.delete(keyAt);
            }
        }
    }

    /* renamed from: p */
    private void m29412p(int i) {
        if (m29417k(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    private void setBadgeIfNeeded(AbstractC3661a abstractC3661a) {
        C3469a c3469a;
        int id2 = abstractC3661a.getId();
        if (m29417k(id2) && (c3469a = this.f10306M.get(id2)) != null) {
            abstractC3661a.setBadge(c3469a);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0389k
    /* renamed from: b */
    public void mo29426b(C0378e c0378e) {
        this.f10317a0 = c0378e;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void m29424d() {
        removeAllViews();
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                if (abstractC3661a != null) {
                    this.f10320y.mo38626a(abstractC3661a);
                    abstractC3661a.m29449h();
                }
            }
        }
        if (this.f10317a0.size() == 0) {
            this.f10296C = 0;
            this.f10297D = 0;
            this.f10295B = null;
            return;
        }
        m29416l();
        this.f10295B = new AbstractC3661a[this.f10317a0.size()];
        boolean m29418j = m29418j(this.f10294A, this.f10317a0.m41042G().size());
        for (int i = 0; i < this.f10317a0.size(); i++) {
            this.f10316W.m29474h(true);
            this.f10317a0.getItem(i).setCheckable(true);
            this.f10316W.m29474h(false);
            AbstractC3661a newItem = getNewItem();
            this.f10295B[i] = newItem;
            newItem.setIconTintList(this.f10298E);
            newItem.setIconSize(this.f10299F);
            newItem.setTextColor(this.f10301H);
            newItem.setTextAppearanceInactive(this.f10302I);
            newItem.setTextAppearanceActive(this.f10303J);
            newItem.setTextColor(this.f10300G);
            int i2 = this.f10307N;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f10308O;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f10310Q);
            newItem.setActiveIndicatorHeight(this.f10311R);
            newItem.setActiveIndicatorMarginHorizontal(this.f10312S);
            newItem.setActiveIndicatorDrawable(m29422f());
            newItem.setActiveIndicatorResizeable(this.f10314U);
            newItem.setActiveIndicatorEnabled(this.f10309P);
            Drawable drawable = this.f10304K;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f10305L);
            }
            newItem.setShifting(m29418j);
            newItem.setLabelVisibilityMode(this.f10294A);
            C0382g c0382g = (C0382g) this.f10317a0.getItem(i);
            newItem.mo29452e(c0382g, 0);
            newItem.setItemPosition(i);
            int itemId = c0382g.getItemId();
            newItem.setOnTouchListener(this.f10321z.get(itemId));
            newItem.setOnClickListener(this.f10319x);
            int i4 = this.f10296C;
            if (i4 != 0 && itemId == i4) {
                this.f10297D = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f10317a0.size() - 1, this.f10297D);
        this.f10297D = min;
        this.f10317a0.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList m29423e(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList m23700a = C5586a.m23700a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(C4897a.f13371x, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = m23700a.getDefaultColor();
                int[] iArr = f10293c0;
                return new ColorStateList(new int[][]{iArr, f10292b0, ViewGroup.EMPTY_STATE_SET}, new int[]{m23700a.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    protected abstract AbstractC3661a mo29421g(Context context);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<C3469a> getBadgeDrawables() {
        return this.f10306M;
    }

    public ColorStateList getIconTintList() {
        return this.f10298E;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f10315V;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f10309P;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f10311R;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f10312S;
    }

    public C11148k getItemActiveIndicatorShapeAppearance() {
        return this.f10313T;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f10310Q;
    }

    public Drawable getItemBackground() {
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null && abstractC3661aArr.length > 0) {
            return abstractC3661aArr[0].getBackground();
        }
        return this.f10304K;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f10305L;
    }

    public int getItemIconSize() {
        return this.f10299F;
    }

    public int getItemPaddingBottom() {
        return this.f10308O;
    }

    public int getItemPaddingTop() {
        return this.f10307N;
    }

    public int getItemTextAppearanceActive() {
        return this.f10303J;
    }

    public int getItemTextAppearanceInactive() {
        return this.f10302I;
    }

    public ColorStateList getItemTextColor() {
        return this.f10300G;
    }

    public int getLabelVisibilityMode() {
        return this.f10294A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0378e getMenu() {
        return this.f10317a0;
    }

    public int getSelectedItemId() {
        return this.f10296C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f10297D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public AbstractC3661a m29420h(int i) {
        m29412p(i);
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                if (abstractC3661a.getId() == i) {
                    return abstractC3661a;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C3469a m29419i(int i) {
        m29412p(i);
        C3469a c3469a = this.f10306M.get(i);
        if (c3469a == null) {
            c3469a = C3469a.m30531c(getContext());
            this.f10306M.put(i, c3469a);
        }
        AbstractC3661a m29420h = m29420h(i);
        if (m29420h != null) {
            m29420h.setBadge(c3469a);
        }
        return c3469a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public boolean m29418j(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m29415m(SparseArray<C3469a> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f10306M.indexOfKey(keyAt) < 0) {
                this.f10306M.append(keyAt, sparseArray.get(keyAt));
            }
        }
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setBadge(this.f10306M.get(abstractC3661a.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m29414n(int i) {
        int size = this.f10317a0.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f10317a0.getItem(i2);
            if (i == item.getItemId()) {
                this.f10296C = i;
                this.f10297D = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: o */
    public void m29413o() {
        C2050q c2050q;
        C0378e c0378e = this.f10317a0;
        if (c0378e == null || this.f10295B == null) {
            return;
        }
        int size = c0378e.size();
        if (size != this.f10295B.length) {
            m29424d();
            return;
        }
        int i = this.f10296C;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f10317a0.getItem(i2);
            if (item.isChecked()) {
                this.f10296C = item.getItemId();
                this.f10297D = i2;
            }
        }
        if (i != this.f10296C && (c2050q = this.f10318w) != null) {
            C2046o.m34852b(this, c2050q);
        }
        boolean m29418j = m29418j(this.f10294A, this.f10317a0.m41042G().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.f10316W.m29474h(true);
            this.f10295B[i3].setLabelVisibilityMode(this.f10294A);
            this.f10295B[i3].setShifting(m29418j);
            this.f10295B[i3].mo29452e((C0382g) this.f10317a0.getItem(i3), 0);
            this.f10316W.m29474h(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(1, this.f10317a0.m41042G().size(), false, 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10298E = colorStateList;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f10315V = colorStateList;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorDrawable(m29422f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f10309P = z;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f10311R = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f10312S = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        this.f10314U = z;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C11148k c11148k) {
        this.f10313T = c11148k;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorDrawable(m29422f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f10310Q = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f10304K = drawable;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f10305L = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f10299F = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f10308O = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f10307N = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f10303J = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f10300G;
                if (colorStateList != null) {
                    abstractC3661a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f10302I = i;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f10300G;
                if (colorStateList != null) {
                    abstractC3661a.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f10300G = colorStateList;
        AbstractC3661a[] abstractC3661aArr = this.f10295B;
        if (abstractC3661aArr != null) {
            for (AbstractC3661a abstractC3661a : abstractC3661aArr) {
                abstractC3661a.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f10294A = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f10316W = navigationBarPresenter;
    }
}
