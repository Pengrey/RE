package androidx.compose.p018ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.CompositionContext;
import id.InterfaceC6112p;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import p092f0.C5231o;
import p092f0.InterfaceC5216l;
import p169j1.C6285n0;
import p169j1.LayoutNode;
import p181jd.Intrinsics;
import p302q0.C9575g;

/* compiled from: Wrapper.android.kt */
/* renamed from: androidx.compose.ui.platform.b2 */
/* loaded from: classes.dex */
public final class C0689b2 {

    /* renamed from: a */
    private static final String f2189a = "Wrapper";

    /* renamed from: b */
    private static final ViewGroup.LayoutParams f2190b = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final InterfaceC5216l m39812a(LayoutNode layoutNode, CompositionContext compositionContext) {
        Intrinsics.isThisObjectNull(layoutNode, "container");
        Intrinsics.isThisObjectNull(compositionContext, "parent");
        return C5231o.m24969a(new C6285n0(layoutNode), compositionContext);
    }

    /* renamed from: b */
    private static final InterfaceC5216l m39811b(AndroidComposeView androidComposeView, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p) {
        if (m39809d(androidComposeView)) {
            androidComposeView.setTag(C9575g.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            m39810c();
        }
        InterfaceC5216l m24969a = C5231o.m24969a(new C6285n0(androidComposeView.getRoot()), compositionContext);
        View view = androidComposeView.getView();
        int i = C9575g.wrapped_composition_tag;
        Object tag = view.getTag(i);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, m24969a);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.mo25006r(interfaceC6112p);
        return wrappedComposition;
    }

    /* renamed from: c */
    private static final void m39810c() {
        if (C0812v0.m39495c()) {
            return;
        }
        try {
            int i = C0812v0.f2430c;
            Field declaredField = C0812v0.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
            Log.w(f2189a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    /* renamed from: d */
    private static final boolean m39809d(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (C0685a2.f2167a.m39829a(androidComposeView).isEmpty() ^ true);
    }

    /* renamed from: e */
    public static final InterfaceC5216l m39808e(AbstractC0682a abstractC0682a, CompositionContext compositionContext, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(abstractC0682a, "<this>");
        Intrinsics.isThisObjectNull(compositionContext, "parent");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        C0797s0.f2409a.m39532a();
        AndroidComposeView androidComposeView = null;
        if (abstractC0682a.getChildCount() > 0) {
            View childAt = abstractC0682a.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractC0682a.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = abstractC0682a.getContext();
            Intrinsics.checkIfNull(context, "context");
            androidComposeView = new AndroidComposeView(context);
            abstractC0682a.addView(androidComposeView.getView(), f2190b);
        }
        return m39811b(androidComposeView, compositionContext, interfaceC6112p);
    }
}
