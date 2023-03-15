package p423wc;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.LinkedHashMap;

/* renamed from: wc.a */
/* loaded from: classes2.dex */
public final class C11612a {
    /* renamed from: a */
    private static int m4598a(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Reader.READ_DONE;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m4597b(int i) {
        return new LinkedHashMap<>(m4598a(i));
    }
}
