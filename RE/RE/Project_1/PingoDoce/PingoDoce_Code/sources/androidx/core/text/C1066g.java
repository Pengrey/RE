package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Locale;

/* renamed from: androidx.core.text.g */
/* loaded from: classes.dex */
public final class C1066g {

    /* renamed from: a */
    private static final Locale f3405a = new Locale(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);

    /* compiled from: TextUtilsCompat.java */
    /* renamed from: androidx.core.text.g$a */
    /* loaded from: classes.dex */
    static class C1067a {
        /* renamed from: a */
        static int m38636a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    private static int m38638a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m38637b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1067a.m38636a(locale);
        }
        if (locale == null || locale.equals(f3405a)) {
            return 0;
        }
        String m38660c = C1052c.m38660c(locale);
        if (m38660c == null) {
            return m38638a(locale);
        }
        return (m38660c.equalsIgnoreCase("Arab") || m38660c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
