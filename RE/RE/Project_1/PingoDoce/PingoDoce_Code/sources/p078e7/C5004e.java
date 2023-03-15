package p078e7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.e */
/* loaded from: classes.dex */
public final class C5004e {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m25918a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m25917b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m25916c(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return m25917b(tArr[0]);
        }
        return m25918a();
    }
}
