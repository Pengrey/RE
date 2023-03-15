package androidx.compose.p018ui.platform;

import android.view.ViewParent;
import p181jd.Intrinsics;

/* compiled from: RenderNodeLayer.android.kt */
/* renamed from: androidx.compose.ui.platform.z1 */
/* loaded from: classes.dex */
public final class C0844z1 {

    /* renamed from: a */
    public static final C0844z1 f2478a = new C0844z1();

    private C0844z1() {
    }

    /* renamed from: a */
    public final void m39449a(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent == null) {
            return;
        }
        parent.onDescendantInvalidated(androidComposeView, androidComposeView);
    }
}
