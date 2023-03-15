package androidx.core.p020os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.c */
/* loaded from: classes.dex */
public final class C1011c {

    /* compiled from: ConfigurationCompat.java */
    /* renamed from: androidx.core.os.c$a */
    /* loaded from: classes.dex */
    static class C1012a {
        /* renamed from: a */
        static LocaleList m38752a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C1015e m38753a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C1015e.m38746d(C1012a.m38752a(configuration)) : C1015e.m38749a(configuration.locale);
    }
}
