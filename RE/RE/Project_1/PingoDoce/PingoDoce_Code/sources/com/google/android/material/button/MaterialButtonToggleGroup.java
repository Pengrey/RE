package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1170i;
import androidx.core.view.accessibility.C1085c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C3649p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p100f8.C5419b;
import p100f8.C5428k;
import p401v8.C11135a;
import p401v8.C11148k;
import p401v8.InterfaceC11137c;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: G */
    private static final String f9629G = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: H */
    private static final int f9630H = C5428k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: A */
    private Integer[] f9631A;

    /* renamed from: B */
    private boolean f9632B;

    /* renamed from: C */
    private boolean f9633C;

    /* renamed from: D */
    private boolean f9634D;

    /* renamed from: E */
    private final int f9635E;

    /* renamed from: F */
    private Set<Integer> f9636F;

    /* renamed from: w */
    private final List<C3517c> f9637w;

    /* renamed from: x */
    private final C3519e f9638x;

    /* renamed from: y */
    private final LinkedHashSet<InterfaceC3518d> f9639y;

    /* renamed from: z */
    private final Comparator<MaterialButton> f9640z;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes.dex */
    class C3515a implements Comparator<MaterialButton> {
        C3515a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes.dex */
    class C3516b extends C1078a {
        C3516b() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38556d0(C1085c.C1088c.m38506a(0, 1, MaterialButtonToggleGroup.this.m30287i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes.dex */
    public static class C3517c {

        /* renamed from: e */
        private static final InterfaceC11137c f9643e = new C11135a(0.0f);

        /* renamed from: a */
        InterfaceC11137c f9644a;

        /* renamed from: b */
        InterfaceC11137c f9645b;

        /* renamed from: c */
        InterfaceC11137c f9646c;

        /* renamed from: d */
        InterfaceC11137c f9647d;

        C3517c(InterfaceC11137c interfaceC11137c, InterfaceC11137c interfaceC11137c2, InterfaceC11137c interfaceC11137c3, InterfaceC11137c interfaceC11137c4) {
            this.f9644a = interfaceC11137c;
            this.f9645b = interfaceC11137c3;
            this.f9646c = interfaceC11137c4;
            this.f9647d = interfaceC11137c2;
        }

        /* renamed from: a */
        public static C3517c m30275a(C3517c c3517c) {
            InterfaceC11137c interfaceC11137c = f9643e;
            return new C3517c(interfaceC11137c, c3517c.f9647d, interfaceC11137c, c3517c.f9646c);
        }

        /* renamed from: b */
        public static C3517c m30274b(C3517c c3517c, View view) {
            return C3649p.m29488e(view) ? m30273c(c3517c) : m30272d(c3517c);
        }

        /* renamed from: c */
        public static C3517c m30273c(C3517c c3517c) {
            InterfaceC11137c interfaceC11137c = c3517c.f9644a;
            InterfaceC11137c interfaceC11137c2 = c3517c.f9647d;
            InterfaceC11137c interfaceC11137c3 = f9643e;
            return new C3517c(interfaceC11137c, interfaceC11137c2, interfaceC11137c3, interfaceC11137c3);
        }

        /* renamed from: d */
        public static C3517c m30272d(C3517c c3517c) {
            InterfaceC11137c interfaceC11137c = f9643e;
            return new C3517c(interfaceC11137c, interfaceC11137c, c3517c.f9645b, c3517c.f9646c);
        }

        /* renamed from: e */
        public static C3517c m30271e(C3517c c3517c, View view) {
            return C3649p.m29488e(view) ? m30272d(c3517c) : m30273c(c3517c);
        }

        /* renamed from: f */
        public static C3517c m30270f(C3517c c3517c) {
            InterfaceC11137c interfaceC11137c = c3517c.f9644a;
            InterfaceC11137c interfaceC11137c2 = f9643e;
            return new C3517c(interfaceC11137c, interfaceC11137c2, c3517c.f9645b, interfaceC11137c2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3518d {
        /* renamed from: a */
        void mo28817a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes.dex */
    public class C3519e implements MaterialButton.InterfaceC3514b {
        private C3519e() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC3514b
        /* renamed from: a */
        public void mo30269a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C3519e(MaterialButtonToggleGroup materialButtonToggleGroup, C3515a c3515a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.materialButtonToggleGroupStyle);
    }

    /* renamed from: c */
    private void m30293c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m30288h = m30288h(i);
            int min = Math.min(m30288h.getStrokeWidth(), m30288h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m30292d = m30292d(m30288h);
            if (getOrientation() == 0) {
                C1170i.m38155c(m30292d, 0);
                C1170i.m38154d(m30292d, -min);
                m30292d.topMargin = 0;
            } else {
                m30292d.bottomMargin = 0;
                m30292d.topMargin = -min;
                C1170i.m38154d(m30292d, 0);
            }
            m30288h.setLayoutParams(m30292d);
        }
        m30282n(firstVisibleChildIndex);
    }

    /* renamed from: d */
    private LinearLayout.LayoutParams m30292d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: e */
    private void m30291e(int i, boolean z) {
        if (i == -1) {
            String str = f9629G;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f9636F);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f9633C && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.f9634D || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m30279q(hashSet);
    }

    /* renamed from: g */
    private void m30289g(int i, boolean z) {
        Iterator<InterfaceC3518d> it = this.f9639y.iterator();
        while (it.hasNext()) {
            it.next().mo28817a(this, i, z);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m30285k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m30285k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m30285k(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private MaterialButton m30288h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public int m30287i(View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && m30285k(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: j */
    private C3517c m30286j(int i, int i2, int i3) {
        C3517c c3517c = this.f9637w.get(i);
        if (i2 == i3) {
            return c3517c;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C3517c.m30271e(c3517c, this) : C3517c.m30270f(c3517c);
        } else if (i == i3) {
            return z ? C3517c.m30274b(c3517c, this) : C3517c.m30275a(c3517c);
        } else {
            return null;
        }
    }

    /* renamed from: k */
    private boolean m30285k(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: n */
    private void m30282n(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m30288h(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        C1170i.m38155c(layoutParams, 0);
        C1170i.m38154d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    /* renamed from: o */
    private void m30281o(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f9632B = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f9632B = false;
        }
    }

    /* renamed from: p */
    private static void m30280p(C11148k.C11150b c11150b, C3517c c3517c) {
        if (c3517c == null) {
            c11150b.m5912o(0.0f);
        } else {
            c11150b.m5931B(c3517c.f9644a).m5907t(c3517c.f9647d).m5927F(c3517c.f9645b).m5903x(c3517c.f9646c);
        }
    }

    /* renamed from: q */
    private void m30279q(Set<Integer> set) {
        Set<Integer> set2 = this.f9636F;
        this.f9636F = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m30288h(i).getId();
            m30281o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                m30289g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* renamed from: r */
    private void m30278r() {
        TreeMap treeMap = new TreeMap(this.f9640z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m30288h(i), Integer.valueOf(i));
        }
        this.f9631A = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C1112b0.m38418m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9638x);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f9629G, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m30291e(materialButton.getId(), materialButton.isChecked());
        C11148k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9637w.add(new C3517c(shapeAppearanceModel.m5940r(), shapeAppearanceModel.m5948j(), shapeAppearanceModel.m5938t(), shapeAppearanceModel.m5946l()));
        C1112b0.m38405s0(materialButton, new C3516b());
    }

    /* renamed from: b */
    public void m30294b(InterfaceC3518d interfaceC3518d) {
        this.f9639y.add(interfaceC3518d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m30278r();
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    public void m30290f() {
        m30279q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f9633C || this.f9636F.isEmpty()) {
            return -1;
        }
        return this.f9636F.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m30288h(i).getId();
            if (this.f9636F.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f9631A;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f9629G, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: l */
    public boolean m30284l() {
        return this.f9633C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m30283m(MaterialButton materialButton, boolean z) {
        if (this.f9632B) {
            return;
        }
        m30291e(materialButton.getId(), z);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f9635E;
        if (i != -1) {
            m30279q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1085c.m38578L0(accessibilityNodeInfo).m38558c0(C1085c.C1087b.m38507a(1, getVisibleButtonCount(), false, m30284l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m30277s();
        m30293c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9637w.remove(indexOfChild);
        }
        m30277s();
        m30293c();
    }

    /* renamed from: s */
    void m30277s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m30288h = m30288h(i);
            if (m30288h.getVisibility() != 8) {
                C11148k.C11150b m5936v = m30288h.getShapeAppearanceModel().m5936v();
                m30280p(m5936v, m30286j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m30288h.setShapeAppearanceModel(m5936v.m5914m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f9634D = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f9633C != z) {
            this.f9633C = z;
            m30290f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f9630H
            android.content.Context r7 = p419w8.C11602a.m4640c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f9637w = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f9638x = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f9639y = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f9640z = r7
            r7 = 0
            r6.f9632B = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f9636F = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p100f8.C5429l.f15094Z2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r9 = p100f8.C5429l.f15121c3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = p100f8.C5429l.f15103a3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f9635E = r9
            int r9 = p100f8.C5429l.f15112b3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f9634D = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C1112b0.m38479C0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
