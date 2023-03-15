package com.github.guilhe.keyboardevents;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC1469p;
import kotlin.TypeCastException;
import p181jd.Intrinsics;

/* renamed from: com.github.guilhe.keyboardevents.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354b {
    /* renamed from: a */
    public static final void m33845a(ComponentActivity componentActivity) {
        Intrinsics.m20926i(componentActivity, "$this$bindKeyboardStateEvents");
        AbstractC1469p mo137b = componentActivity.mo137b();
        View findViewById = componentActivity.findViewById(16908290);
        Intrinsics.isNotNull(findViewById, "findViewById(Window.ID_ANDROID_CONTENT)");
        mo137b.mo10402a(new KeyboardStateEvents((ViewGroup) findViewById));
    }

    /* renamed from: b */
    public static final void m33844b(ComponentActivity componentActivity) {
        Intrinsics.m20926i(componentActivity, "$this$dismissKeyboard");
        Object systemService = componentActivity.getSystemService("input_method");
        if (systemService != null) {
            View findViewById = componentActivity.findViewById(16908290);
            Intrinsics.isNotNull(findViewById, "findViewById<ViewGroup>(Window.ID_ANDROID_CONTENT)");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(((ViewGroup) findViewById).getWindowToken(), 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: c */
    public static final boolean m33843c(ViewGroup viewGroup, float f) {
        Intrinsics.m20926i(viewGroup, "$this$isKeyboardOpen");
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        View rootView = viewGroup.getRootView();
        Intrinsics.isNotNull(rootView, "rootView");
        Resources system = Resources.getSystem();
        Intrinsics.isNotNull(system, "Resources.getSystem()");
        return ((float) (rootView.getHeight() - rect.bottom)) > ((float) Math.ceil((double) (f * system.getDisplayMetrics().density)));
    }

    /* renamed from: d */
    public static final boolean m33842d(ComponentActivity componentActivity, float f) {
        Intrinsics.m20926i(componentActivity, "$this$isKeyboardOpen");
        ViewGroup viewGroup = (ViewGroup) componentActivity.findViewById(16908290);
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Intrinsics.isNotNull(viewGroup, "root");
        View rootView = viewGroup.getRootView();
        Intrinsics.isNotNull(rootView, "root.rootView");
        Resources system = Resources.getSystem();
        Intrinsics.isNotNull(system, "Resources.getSystem()");
        return ((float) (rootView.getHeight() - rect.bottom)) > ((float) Math.ceil((double) (f * system.getDisplayMetrics().density)));
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m33841e(ViewGroup viewGroup, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 100.0f;
        }
        return m33843c(viewGroup, f);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m33840f(ComponentActivity componentActivity, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 100.0f;
        }
        return m33842d(componentActivity, f);
    }

    /* renamed from: g */
    public static final void m33839g(ComponentActivity componentActivity) {
        Intrinsics.m20926i(componentActivity, "$this$toggleKeyboard");
        Object systemService = componentActivity.getSystemService("input_method");
        if (systemService != null) {
            View findViewById = componentActivity.findViewById(16908290);
            Intrinsics.isNotNull(findViewById, "findViewById<ViewGroup>(Window.ID_ANDROID_CONTENT)");
            ((InputMethodManager) systemService).toggleSoftInputFromWindow(((ViewGroup) findViewById).getApplicationWindowToken(), 2, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
