package p489zc;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.Collections;
import java.util.Map;
import p181jd.Intrinsics;
import p468yc.C13182l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.k0 */
/* loaded from: classes2.dex */
public class MapsJVM extends MapWithDefault {
    /* renamed from: b */
    public static int m339b(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Reader.READ_DONE;
    }

    /* renamed from: c */
    public static final Map m338c(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        Map singletonMap = Collections.singletonMap(c13182l.m1460c(), c13182l.m1459d());
        Intrinsics.checkIfNull(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: d */
    public static final Map m337d(Map map) {
        Intrinsics.isThisObjectNull(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.checkIfNull(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
