package androidx.compose.p018ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import p181jd.Intrinsics;
import p302q0.C9575g;
import p393v0.C11002c;
import p393v0.InterfaceC11064u;

/* compiled from: ViewLayerContainer.android.kt */
/* renamed from: androidx.compose.ui.platform.r0 */
/* loaded from: classes.dex */
public class C0778r0 extends ViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0778r0(Context context) {
        super(context);
        Intrinsics.isThisObjectNull(context, "context");
        setClipChildren(false);
        setTag(C9575g.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m39610a(InterfaceC11064u interfaceC11064u, View view, long j) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        Intrinsics.isThisObjectNull(view, "view");
        super.drawChild(C11002c.m6596c(interfaceC11064u), view, j);
    }

    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C0771q1) childAt).m39619t()) {
                z = true;
                break;
            }
            i = i2;
        }
        if (z) {
            super.dispatchDraw(canvas);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
