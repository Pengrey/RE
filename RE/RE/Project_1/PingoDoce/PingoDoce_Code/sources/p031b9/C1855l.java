package p031b9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.File;

/* renamed from: b9.l */
/* loaded from: classes.dex */
public final class C1855l {
    /* renamed from: a */
    public static String m35255a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.VERSION_NAME).replace("base-", "config.").replace("-", ".config.").replace(".config.master", BuildConfig.VERSION_NAME).replace("config.master", BuildConfig.VERSION_NAME);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: b */
    public static <T> void m35254b(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m35253c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
