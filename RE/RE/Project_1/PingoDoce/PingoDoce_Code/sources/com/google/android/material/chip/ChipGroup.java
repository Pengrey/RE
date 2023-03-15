package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.internal.C3622a;
import com.google.android.material.internal.C3630e;
import java.util.List;
import java.util.Set;
import p100f8.C5419b;
import p100f8.C5428k;

/* loaded from: classes.dex */
public class ChipGroup extends C3630e {

    /* renamed from: G */
    private static final int f9731G = C5428k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: A */
    private int f9732A;

    /* renamed from: B */
    private int f9733B;

    /* renamed from: C */
    private InterfaceC3531e f9734C;

    /* renamed from: D */
    private final C3622a<Chip> f9735D;

    /* renamed from: E */
    private final int f9736E;

    /* renamed from: F */
    private final ViewGroup$OnHierarchyChangeListenerC3532f f9737F;

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    /* loaded from: classes.dex */
    class C3527a implements C3622a.InterfaceC3624b {
        C3527a() {
        }

        @Override // com.google.android.material.internal.C3622a.InterfaceC3624b
        /* renamed from: a */
        public void mo29638a(Set<Integer> set) {
            if (ChipGroup.this.f9734C != null) {
                InterfaceC3531e interfaceC3531e = ChipGroup.this.f9734C;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC3531e.mo30134a(chipGroup, chipGroup.f9735D.m29648j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes.dex */
    class C3528b implements InterfaceC3531e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3530d f9739a;

        C3528b(InterfaceC3530d interfaceC3530d) {
            this.f9739a = interfaceC3530d;
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC3531e
        /* renamed from: a */
        public void mo30134a(ChipGroup chipGroup, List<Integer> list) {
            if (ChipGroup.this.f9735D.m29646l()) {
                this.f9739a.m30135a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes.dex */
    public static class C3529c extends ViewGroup.MarginLayoutParams {
        public C3529c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C3529c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C3529c(int i, int i2) {
            super(i, i2);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3530d {
        /* renamed from: a */
        void m30135a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes.dex */
    public interface InterfaceC3531e {
        /* renamed from: a */
        void mo30134a(ChipGroup chipGroup, List<Integer> list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$f */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC3532f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: w */
        private ViewGroup.OnHierarchyChangeListener f9741w;

        private ViewGroup$OnHierarchyChangeListenerC3532f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C1112b0.m38418m());
                }
                ChipGroup.this.f9735D.m29653e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9741w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f9735D.m29644n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9741w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroup$OnHierarchyChangeListenerC3532f(ChipGroup chipGroup, C3527a c3527a) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.C3630e
    /* renamed from: c */
    public boolean mo29541c() {
        return super.mo29541c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C3529c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m30137g(View view) {
        if (view instanceof Chip) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    if (((Chip) getChildAt(i2)) == view) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3529c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3529c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f9735D.m29647k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f9735D.m29648j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f9732A;
    }

    public int getChipSpacingVertical() {
        return this.f9733B;
    }

    /* renamed from: h */
    public boolean m30136h() {
        return this.f9735D.m29646l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f9736E;
        if (i != -1) {
            this.f9735D.m29652f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(getRowCount(), mo29541c() ? getChipCount() : -1, false, m30136h() ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f9732A != i) {
            this.f9732A = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f9733B != i) {
            this.f9733B = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC3530d interfaceC3530d) {
        if (interfaceC3530d == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C3528b(interfaceC3530d));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC3531e interfaceC3531e) {
        this.f9734C = interfaceC3531e;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9737F.f9741w = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f9735D.m29642p(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C3630e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f9735D.m29641q(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f9731G
            android.content.Context r9 = p419w8.C11602a.m4640c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f9735D = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f9737F = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = p100f8.C5429l.f15101a1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r11 = p100f8.C5429l.f15119c1
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = p100f8.C5429l.f15128d1
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = p100f8.C5429l.f15137e1
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = p100f8.C5429l.f15155g1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = p100f8.C5429l.f15164h1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = p100f8.C5429l.f15146f1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = p100f8.C5429l.f15110b1
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f9736E = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.m29643o(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C1112b0.m38479C0(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3529c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
