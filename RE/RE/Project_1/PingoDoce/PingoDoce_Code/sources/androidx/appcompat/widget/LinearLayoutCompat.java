package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1112b0;
import p070e.C4906j;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A */
    private int f1321A;

    /* renamed from: B */
    private int f1322B;

    /* renamed from: C */
    private float f1323C;

    /* renamed from: D */
    private boolean f1324D;

    /* renamed from: E */
    private int[] f1325E;

    /* renamed from: F */
    private int[] f1326F;

    /* renamed from: G */
    private Drawable f1327G;

    /* renamed from: H */
    private int f1328H;

    /* renamed from: I */
    private int f1329I;

    /* renamed from: J */
    private int f1330J;

    /* renamed from: K */
    private int f1331K;

    /* renamed from: w */
    private boolean f1332w;

    /* renamed from: x */
    private int f1333x;

    /* renamed from: y */
    private int f1334y;

    /* renamed from: z */
    private int f1335z;

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    /* loaded from: classes.dex */
    public static class C0425a extends LinearLayout.LayoutParams {
        public C0425a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0425a(int i, int i2) {
            super(i, i2);
        }

        public C0425a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m40825A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m40820k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m40812s = m40812s(i3);
            if (m40812s.getVisibility() != 8) {
                C0425a c0425a = (C0425a) m40812s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0425a).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0425a).width;
                    ((LinearLayout.LayoutParams) c0425a).width = m40812s.getMeasuredWidth();
                    measureChildWithMargins(m40812s, i2, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c0425a).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m40819l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m40812s = m40812s(i3);
            if (m40812s.getVisibility() != 8) {
                C0425a c0425a = (C0425a) m40812s.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0425a).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0425a).height;
                    ((LinearLayout.LayoutParams) c0425a).height = m40812s.getMeasuredHeight();
                    measureChildWithMargins(m40812s, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c0425a).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0425a;
    }

    /* renamed from: g */
    void m40824g(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean m40330b = C0541y0.m40330b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m40812s = m40812s(i2);
            if (m40812s != null && m40812s.getVisibility() != 8 && m40811t(i2)) {
                C0425a c0425a = (C0425a) m40812s.getLayoutParams();
                if (m40330b) {
                    left2 = m40812s.getRight() + ((LinearLayout.LayoutParams) c0425a).rightMargin;
                } else {
                    left2 = (m40812s.getLeft() - ((LinearLayout.LayoutParams) c0425a).leftMargin) - this.f1328H;
                }
                m40821j(canvas, left2);
            }
        }
        if (m40811t(virtualChildCount)) {
            View m40812s2 = m40812s(virtualChildCount - 1);
            if (m40812s2 != null) {
                C0425a c0425a2 = (C0425a) m40812s2.getLayoutParams();
                if (m40330b) {
                    left = m40812s2.getLeft() - ((LinearLayout.LayoutParams) c0425a2).leftMargin;
                    i = this.f1328H;
                    right = left - i;
                } else {
                    right = m40812s2.getRight() + ((LinearLayout.LayoutParams) c0425a2).rightMargin;
                }
            } else if (m40330b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f1328H;
                right = left - i;
            }
            m40821j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1333x < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1333x;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1333x == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f1334y;
            if (this.f1335z == 1 && (i = this.f1321A & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1322B) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1322B;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0425a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1333x;
    }

    public Drawable getDividerDrawable() {
        return this.f1327G;
    }

    public int getDividerPadding() {
        return this.f1331K;
    }

    public int getDividerWidth() {
        return this.f1328H;
    }

    public int getGravity() {
        return this.f1321A;
    }

    public int getOrientation() {
        return this.f1335z;
    }

    public int getShowDividers() {
        return this.f1330J;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1323C;
    }

    /* renamed from: h */
    void m40823h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m40812s = m40812s(i);
            if (m40812s != null && m40812s.getVisibility() != 8 && m40811t(i)) {
                m40822i(canvas, (m40812s.getTop() - ((LinearLayout.LayoutParams) ((C0425a) m40812s.getLayoutParams())).topMargin) - this.f1329I);
            }
        }
        if (m40811t(virtualChildCount)) {
            View m40812s2 = m40812s(virtualChildCount - 1);
            if (m40812s2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1329I;
            } else {
                bottom = m40812s2.getBottom() + ((LinearLayout.LayoutParams) ((C0425a) m40812s2.getLayoutParams())).bottomMargin;
            }
            m40822i(canvas, bottom);
        }
    }

    /* renamed from: i */
    void m40822i(Canvas canvas, int i) {
        this.f1327G.setBounds(getPaddingLeft() + this.f1331K, i, (getWidth() - getPaddingRight()) - this.f1331K, this.f1329I + i);
        this.f1327G.draw(canvas);
    }

    /* renamed from: j */
    void m40821j(Canvas canvas, int i) {
        this.f1327G.setBounds(i, getPaddingTop() + this.f1331K, this.f1328H + i, (getHeight() - getPaddingBottom()) - this.f1331K);
        this.f1327G.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0425a generateDefaultLayoutParams() {
        int i = this.f1335z;
        if (i == 0) {
            return new C0425a(-2, -2);
        }
        if (i == 1) {
            return new C0425a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0425a generateLayoutParams(AttributeSet attributeSet) {
        return new C0425a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0425a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0425a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1327G == null) {
            return;
        }
        if (this.f1335z == 1) {
            m40823h(canvas);
        } else {
            m40824g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1335z == 1) {
            m40809v(i, i2, i3, i4);
        } else {
            m40810u(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1335z == 1) {
            m40805z(i, i2);
        } else {
            m40807x(i, i2);
        }
    }

    /* renamed from: p */
    int m40815p(View view, int i) {
        return 0;
    }

    /* renamed from: q */
    int m40814q(View view) {
        return 0;
    }

    /* renamed from: r */
    int m40813r(View view) {
        return 0;
    }

    /* renamed from: s */
    View m40812s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f1332w = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1333x = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1327G) {
            return;
        }
        this.f1327G = drawable;
        if (drawable != null) {
            this.f1328H = drawable.getIntrinsicWidth();
            this.f1329I = drawable.getIntrinsicHeight();
        } else {
            this.f1328H = 0;
            this.f1329I = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1331K = i;
    }

    public void setGravity(int i) {
        if (this.f1321A != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1321A = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1321A;
        if ((8388615 & i3) != i2) {
            this.f1321A = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1324D = z;
    }

    public void setOrientation(int i) {
        if (this.f1335z != i) {
            this.f1335z = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1330J) {
            requestLayout();
        }
        this.f1330J = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1321A;
        if ((i3 & 112) != i2) {
            this.f1321A = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1323C = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m40811t(int i) {
        if (i == 0) {
            return (this.f1330J & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f1330J & 4) != 0;
        } else if ((this.f1330J & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m40810u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m40810u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m40809v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1321A
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1322B
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1322B
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.m40812s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m40806y(r12)
            int r0 = r0 + r1
            goto Lc7
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0425a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.C1112b0.m38476E(r17)
            int r1 = androidx.core.view.C1158f.m38197b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.m40811t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1329I
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m40814q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m40825A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m40813r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m40815p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc8
        Lc7:
            r1 = r14
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m40809v(int, int, int, int):void");
    }

    /* renamed from: w */
    void m40808w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m40807x(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m40807x(int, int):void");
    }

    /* renamed from: y */
    int m40806y(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m40805z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m40805z(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1332w = true;
        this.f1333x = -1;
        this.f1334y = 0;
        this.f1321A = 8388659;
        int[] iArr = C4906j.f13452Q0;
        C0520s0 m40453v = C0520s0.m40453v(context, attributeSet, iArr, i, 0);
        C1112b0.m38409q0(this, context, iArr, attributeSet, m40453v.m40457r(), i, 0);
        int m40464k = m40453v.m40464k(C4906j.f13460S0, -1);
        if (m40464k >= 0) {
            setOrientation(m40464k);
        }
        int m40464k2 = m40453v.m40464k(C4906j.f13456R0, -1);
        if (m40464k2 >= 0) {
            setGravity(m40464k2);
        }
        boolean m40474a = m40453v.m40474a(C4906j.f13464T0, true);
        if (!m40474a) {
            setBaselineAligned(m40474a);
        }
        this.f1323C = m40453v.m40466i(C4906j.f13472V0, -1.0f);
        this.f1333x = m40453v.m40464k(C4906j.f13468U0, -1);
        this.f1324D = m40453v.m40474a(C4906j.f13484Y0, false);
        setDividerDrawable(m40453v.m40468g(C4906j.f13476W0));
        this.f1330J = m40453v.m40464k(C4906j.f13488Z0, 0);
        this.f1331K = m40453v.m40469f(C4906j.f13480X0, 0);
        m40453v.m40452w();
    }
}
