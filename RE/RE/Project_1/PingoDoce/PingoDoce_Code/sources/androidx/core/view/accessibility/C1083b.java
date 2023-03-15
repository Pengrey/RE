package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes.dex */
public final class C1083b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityEventCompat.java */
    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes.dex */
    public static class C1084a {
        /* renamed from: a */
        static int m38603a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m38602b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m38605a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1084a.m38603a(accessibilityEvent);
        }
        return 0;
    }

    /* renamed from: b */
    public static void m38604b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C1084a.m38602b(accessibilityEvent, i);
        }
    }
}
