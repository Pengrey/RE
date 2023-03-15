package androidx.compose.p018ui.platform;

import android.view.View;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
/* renamed from: androidx.compose.ui.platform.w */
/* loaded from: classes.dex */
public final class C0815w {

    /* renamed from: a */
    public static final C0815w f2432a = new C0815w();

    private C0815w() {
    }

    /* renamed from: a */
    public final void m39493a(View view, int i, boolean z) {
        Intrinsics.isThisObjectNull(view, "view");
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
