package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.C0969a;
import androidx.core.view.C1179l0;
import androidx.core.view.C1199n0;
import p198k8.C6608a;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C3629d {
    /* renamed from: a */
    public static void m29547a(Window window, boolean z, Integer num, Integer num2) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z2 = true;
        }
        if (z3 || z2) {
            int m20506b = C6608a.m20506b(window.getContext(), 16842801, -16777216);
            if (z3) {
                num = Integer.valueOf(m20506b);
            }
            if (z2) {
                num2 = Integer.valueOf(m20506b);
            }
        }
        C1179l0.m38118b(window, !z);
        int m29545c = m29545c(window.getContext(), z);
        int m29546b = m29546b(window.getContext(), z);
        window.setStatusBarColor(m29545c);
        window.setNavigationBarColor(m29546b);
        boolean m29544d = m29544d(m29545c, C6608a.m20502f(num.intValue()));
        boolean m29544d2 = m29544d(m29546b, C6608a.m20502f(num2.intValue()));
        C1199n0 m38119a = C1179l0.m38119a(window, window.getDecorView());
        if (m38119a != null) {
            m38119a.m38049b(m29544d);
            m38119a.m38050a(m29544d2);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m29546b(Context context, boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 27) {
            if (z) {
                return 0;
            }
            return C6608a.m20506b(context, 16843858, -16777216);
        }
        return C0969a.m38939j(C6608a.m20506b(context, 16843858, -16777216), 128);
    }

    @TargetApi(21)
    /* renamed from: c */
    private static int m29545c(Context context, boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 23) {
            if (z) {
                return 0;
            }
            return C6608a.m20506b(context, 16843857, -16777216);
        }
        return C0969a.m38939j(C6608a.m20506b(context, 16843857, -16777216), 128);
    }

    /* renamed from: d */
    private static boolean m29544d(int i, boolean z) {
        return C6608a.m20502f(i) || (i == 0 && z);
    }
}
