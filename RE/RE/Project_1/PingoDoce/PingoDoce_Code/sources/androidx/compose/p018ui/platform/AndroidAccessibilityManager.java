package androidx.compose.p018ui.platform;

import android.view.accessibility.AccessibilityManager;
import p181jd.Intrinsics;

/* renamed from: androidx.compose.ui.platform.i0 */
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager {

    /* renamed from: a */
    public static final AndroidAccessibilityManager f2271a = new AndroidAccessibilityManager();

    private AndroidAccessibilityManager() {
    }

    /* renamed from: a */
    public final int m39725a(AccessibilityManager accessibilityManager, int i, int i2) {
        Intrinsics.isThisObjectNull(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
