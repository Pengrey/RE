package p021b;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.C0734l0;
import androidx.compose.runtime.CompositionContext;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.C1492v0;
import androidx.savedstate.C1664d;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class ComponentActivity {

    /* renamed from: a */
    private static final ViewGroup.LayoutParams f5414a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final void m35422a(androidx.activity.ComponentActivity componentActivity, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(componentActivity, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        C0734l0 c0734l0 = childAt instanceof C0734l0 ? (C0734l0) childAt : null;
        if (c0734l0 != null) {
            c0734l0.setParentCompositionContext(compositionContext);
            c0734l0.setContent(interfaceC6112p);
            return;
        }
        C0734l0 c0734l02 = new C0734l0(componentActivity, null, 0, 6, null);
        c0734l02.setParentCompositionContext(compositionContext);
        c0734l02.setContent(interfaceC6112p);
        m35420c(componentActivity);
        componentActivity.setContentView(c0734l02, f5414a);
    }

    /* renamed from: b */
    public static /* synthetic */ void m35421b(androidx.activity.ComponentActivity componentActivity, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        m35422a(componentActivity, compositionContext, interfaceC6112p);
    }

    /* renamed from: c */
    private static final void m35420c(androidx.activity.ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkIfNull(decorView, "window.decorView");
        if (C1490u0.m36969a(decorView) == null) {
            C1490u0.m36968b(decorView, componentActivity);
        }
        if (C1492v0.m36967a(decorView) == null) {
            C1492v0.m36966b(decorView, componentActivity);
        }
        if (C1664d.m35783a(decorView) == null) {
            C1664d.m35782b(decorView, componentActivity);
        }
    }
}
