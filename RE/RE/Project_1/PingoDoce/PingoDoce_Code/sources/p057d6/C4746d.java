package p057d6;

import java.util.Objects;

/* renamed from: d6.d */
/* loaded from: classes.dex */
public final class C4746d {
    /* renamed from: a */
    public static <T> void m26715a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m26714b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m26713c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
