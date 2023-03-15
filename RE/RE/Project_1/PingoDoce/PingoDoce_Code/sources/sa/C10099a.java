package sa;

import java.util.Objects;

/* renamed from: sa.a  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C10099a {
    /* renamed from: a */
    public static void m9144a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m9143b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}
