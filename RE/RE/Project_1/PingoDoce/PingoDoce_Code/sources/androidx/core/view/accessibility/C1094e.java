package androidx.core.view.accessibility;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.e */
/* loaded from: classes.dex */
public class C1094e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityRecordCompat.java */
    /* renamed from: androidx.core.view.accessibility.e$a */
    /* loaded from: classes.dex */
    public static class C1095a {
        /* renamed from: a */
        static int m38498a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m38497b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m38496c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m38495d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* compiled from: AccessibilityRecordCompat.java */
    /* renamed from: androidx.core.view.accessibility.e$b */
    /* loaded from: classes.dex */
    static class C1096b {
        /* renamed from: a */
        static void m38494a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m38501a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            C1095a.m38496c(accessibilityRecord, i);
        }
    }

    /* renamed from: b */
    public static void m38500b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            C1095a.m38495d(accessibilityRecord, i);
        }
    }

    /* renamed from: c */
    public static void m38499c(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            C1096b.m38494a(accessibilityRecord, view, i);
        }
    }
}
