package androidx.compose.p018ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* renamed from: androidx.compose.ui.platform.j */
/* loaded from: classes.dex */
public final class C0725j {

    /* renamed from: a */
    public static final C0725j f2272a = new C0725j();

    private C0725j() {
    }

    /* renamed from: a */
    public final void m39718a(AccessibilityNodeInfo accessibilityNodeInfo, List list) {
        Intrinsics.isThisObjectNull(accessibilityNodeInfo, "node");
        Intrinsics.isThisObjectNull(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
