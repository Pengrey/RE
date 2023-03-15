package androidx.compose.p018ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.viewinterop.AbstractC0845a;
import java.util.HashMap;
import java.util.Set;
import p169j1.LayoutNode;
import p181jd.Intrinsics;

/* compiled from: AndroidViewsHandler.android.kt */
/* renamed from: androidx.compose.ui.platform.h0 */
/* loaded from: classes.dex */
public final class C0722h0 extends ViewGroup {

    /* renamed from: w */
    private final HashMap f2267w;

    /* renamed from: x */
    private final HashMap f2268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0722h0(Context context) {
        super(context);
        Intrinsics.isThisObjectNull(context, "context");
        setClipChildren(false);
        this.f2267w = new HashMap();
        this.f2268x = new HashMap();
    }

    /* renamed from: a */
    public Void m39729a(int[] iArr, Rect rect) {
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap getHolderToLayoutNode() {
        return this.f2267w;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.f2268x;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) m39729a(iArr, rect);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        Intrinsics.isThisObjectNull(view, "child");
        Intrinsics.isThisObjectNull(view2, "target");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AbstractC0845a> keySet = this.f2267w.keySet();
        Intrinsics.checkIfNull(keySet, "holderToLayoutNode.keys");
        for (AbstractC0845a abstractC0845a : keySet) {
            abstractC0845a.layout(abstractC0845a.getLeft(), abstractC0845a.getTop(), abstractC0845a.getRight(), abstractC0845a.getBottom());
        }
    }

    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<AbstractC0845a> keySet = this.f2267w.keySet();
                Intrinsics.checkIfNull(keySet, "holderToLayoutNode.keys");
                for (AbstractC0845a abstractC0845a : keySet) {
                    abstractC0845a.m39448a();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            LayoutNode layoutNode = (LayoutNode) this.f2267w.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                layoutNode.m21574J0();
            }
            i = i2;
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
