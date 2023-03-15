package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
class C3542c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m29944a(long j) {
        return m29943b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m29943b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3575o.m29852b(locale).format(new Date(j));
        }
        return C3575o.m29848f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m29942c(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m29941d(long j) {
        return m29940e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m29940e(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3575o.m29841m(locale).format(new Date(j));
        }
        return C3575o.m29848f(locale).format(new Date(j));
    }
}
