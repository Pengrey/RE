package androidx.compose.p018ui.viewinterop;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.C1664d;
import androidx.savedstate.InterfaceC1663c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p169j1.LayoutNode;
import p181jd.Intrinsics;
import p260o0.SnapshotStateObserver;
import p302q0.InterfaceC9570f;
import p479z1.Density;

/* compiled from: AndroidViewHolder.android.kt */
/* renamed from: androidx.compose.ui.viewinterop.a */
/* loaded from: classes.dex */
public abstract class AbstractC0845a extends ViewGroup {

    /* renamed from: A */
    private Density f2479A;

    /* renamed from: B */
    private InterfaceC6108l f2480B;

    /* renamed from: C */
    private InterfaceC1491v f2481C;

    /* renamed from: D */
    private InterfaceC1663c f2482D;

    /* renamed from: E */
    private final SnapshotStateObserver f2483E;

    /* renamed from: F */
    private final InterfaceC6097a f2484F;

    /* renamed from: G */
    private InterfaceC6108l f2485G;

    /* renamed from: H */
    private final int[] f2486H;

    /* renamed from: I */
    private int f2487I;

    /* renamed from: J */
    private int f2488J;

    /* renamed from: K */
    private final LayoutNode f2489K;

    /* renamed from: w */
    private View f2490w;

    /* renamed from: x */
    private InterfaceC6097a f2491x;

    /* renamed from: y */
    private InterfaceC9570f f2492y;

    /* renamed from: z */
    private InterfaceC6108l f2493z;

    /* renamed from: a */
    public final void m39448a() {
        int i;
        int i2 = this.f2487I;
        if (i2 == Integer.MIN_VALUE || (i = this.f2488J) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f2486H);
        int[] iArr = this.f2486H;
        region.op(iArr[0], iArr[1], iArr[0] + getWidth(), this.f2486H[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final Density getDensity() {
        return this.f2479A;
    }

    public final LayoutNode getLayoutNode() {
        return this.f2489K;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        View view = this.f2490w;
        ViewGroup.LayoutParams layoutParams = view == null ? null : view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1491v getLifecycleOwner() {
        return this.f2481C;
    }

    public final InterfaceC9570f getModifier() {
        return this.f2492y;
    }

    public final InterfaceC6108l getOnDensityChanged$ui_release() {
        return this.f2480B;
    }

    public final InterfaceC6108l getOnModifierChanged$ui_release() {
        return this.f2493z;
    }

    public final InterfaceC6108l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f2485G;
    }

    public final InterfaceC1663c getSavedStateRegistryOwner() {
        return this.f2482D;
    }

    public final InterfaceC6097a getUpdate() {
        return this.f2491x;
    }

    public final View getView() {
        return this.f2490w;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f2489K.m21521n0();
        return null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2483E.m17227k();
    }

    public void onDescendantInvalidated(View view, View view2) {
        Intrinsics.isThisObjectNull(view, "child");
        Intrinsics.isThisObjectNull(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.f2489K.m21521n0();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2483E.m17226l();
        this.f2483E.m17231g();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f2490w;
        if (view == null) {
            return;
        }
        view.layout(0, 0, i3 - i, i4 - i2);
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f2490w;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.f2490w;
        int measuredWidth = view2 == null ? 0 : view2.getMeasuredWidth();
        View view3 = this.f2490w;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f2487I = i;
        this.f2488J = i2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC6108l interfaceC6108l = this.f2485G;
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density) {
        Intrinsics.isThisObjectNull(density, "value");
        if (density != this.f2479A) {
            this.f2479A = density;
            InterfaceC6108l interfaceC6108l = this.f2480B;
            if (interfaceC6108l == null) {
                return;
            }
            interfaceC6108l.mo9587d(density);
        }
    }

    public final void setLifecycleOwner(InterfaceC1491v interfaceC1491v) {
        if (interfaceC1491v != this.f2481C) {
            this.f2481C = interfaceC1491v;
            C1490u0.m36968b(this, interfaceC1491v);
        }
    }

    public final void setModifier(InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "value");
        if (interfaceC9570f != this.f2492y) {
            this.f2492y = interfaceC9570f;
            InterfaceC6108l interfaceC6108l = this.f2493z;
            if (interfaceC6108l == null) {
                return;
            }
            interfaceC6108l.mo9587d(interfaceC9570f);
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC6108l interfaceC6108l) {
        this.f2480B = interfaceC6108l;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC6108l interfaceC6108l) {
        this.f2493z = interfaceC6108l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC6108l interfaceC6108l) {
        this.f2485G = interfaceC6108l;
    }

    public final void setSavedStateRegistryOwner(InterfaceC1663c interfaceC1663c) {
        if (interfaceC1663c != this.f2482D) {
            this.f2482D = interfaceC1663c;
            C1664d.m35782b(this, interfaceC1663c);
        }
    }

    protected final void setUpdate(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "value");
        this.f2491x = interfaceC6097a;
        this.f2484F.mo42214q();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f2490w) {
            this.f2490w = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f2484F.mo42214q();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
