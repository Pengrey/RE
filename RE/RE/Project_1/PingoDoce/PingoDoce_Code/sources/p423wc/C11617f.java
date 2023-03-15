package p423wc;

import java.util.Objects;

/* renamed from: wc.f */
/* loaded from: classes2.dex */
public final class C11617f {
    /* renamed from: a */
    public static <T> T m4590a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static <T> T m4589b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static <T> T m4588c(T t, String str, Object obj) {
        String valueOf;
        if (t == null) {
            if (str.contains("%s")) {
                if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                    if (obj instanceof Class) {
                        valueOf = ((Class) obj).getCanonicalName();
                    } else {
                        valueOf = String.valueOf(obj);
                    }
                    throw new NullPointerException(str.replace("%s", valueOf));
                }
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        return t;
    }

    /* renamed from: d */
    public static <T> T m4587d(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }
}
