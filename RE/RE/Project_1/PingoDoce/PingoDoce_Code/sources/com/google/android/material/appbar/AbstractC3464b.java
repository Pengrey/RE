package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import androidx.core.view.C1183m0;
import java.util.List;
import p170j2.C6298a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
public abstract class AbstractC3464b extends C3465c<View> {

    /* renamed from: d */
    final Rect f9385d;

    /* renamed from: e */
    final Rect f9386e;

    /* renamed from: f */
    private int f9387f;

    /* renamed from: g */
    private int f9388g;

    public AbstractC3464b() {
        this.f9385d = new Rect();
        this.f9386e = new Rect();
        this.f9387f = 0;
    }

    /* renamed from: N */
    private static int m30615N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C3465c
    /* renamed from: F */
    public void mo30611F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View mo30678Q = mo30678Q(coordinatorLayout.m39327r(view));
        if (mo30678Q != null) {
            CoordinatorLayout.C0876f c0876f = (CoordinatorLayout.C0876f) view.getLayoutParams();
            Rect rect = this.f9385d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0876f).leftMargin, mo30678Q.getBottom() + ((ViewGroup.MarginLayoutParams) c0876f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin, ((coordinatorLayout.getHeight() + mo30678Q.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin);
            C1183m0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1112b0.m38482B(coordinatorLayout) && !C1112b0.m38482B(view)) {
                rect.left += lastWindowInsets.m38105i();
                rect.right -= lastWindowInsets.m38104j();
            }
            Rect rect2 = this.f9386e;
            C1158f.m38198a(m30615N(c0876f.f3034c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m30620I = m30620I(mo30678Q);
            view.layout(rect2.left, rect2.top - m30620I, rect2.right, rect2.bottom - m30620I);
            this.f9387f = rect2.top - mo30678Q.getBottom();
            return;
        }
        super.mo30611F(coordinatorLayout, view, i);
        this.f9387f = 0;
    }

    /* renamed from: H */
    abstract View mo30678Q(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m30620I(View view) {
        if (this.f9388g == 0) {
            return 0;
        }
        float mo30619J = mo30619J(view);
        int i = this.f9388g;
        return C6298a.m21277b((int) (mo30619J * i), 0, i);
    }

    /* renamed from: J */
    abstract float mo30619J(View view);

    /* renamed from: K */
    public final int m30618K() {
        return this.f9388g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo30617L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m30616M() {
        return this.f9387f;
    }

    /* renamed from: O */
    public final void m30614O(int i) {
        this.f9388g = i;
    }

    /* renamed from: P */
    protected boolean m30613P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: m */
    public boolean mo30695i0(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo30678Q;
        C1183m0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo30678Q = mo30678Q(coordinatorLayout.m39327r(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (C1112b0.m38482B(mo30678Q) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m38103k() + lastWindowInsets.m38106h();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo30617L = size + mo30617L(mo30678Q);
            int measuredHeight = mo30678Q.getMeasuredHeight();
            if (m30613P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo30617L -= measuredHeight;
            }
            coordinatorLayout.m39353J(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo30617L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public AbstractC3464b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9385d = new Rect();
        this.f9386e = new Rect();
        this.f9387f = 0;
    }
}
