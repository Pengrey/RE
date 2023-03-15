package p177j9;

import java.util.Objects;

/* renamed from: j9.z */
/* loaded from: classes.dex */
public final class C6410z {
    /* renamed from: a */
    public static void m21019a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m21018b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m21017c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m21016d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
