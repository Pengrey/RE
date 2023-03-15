package p489zc;

import java.util.Map;
import java.util.NoSuchElementException;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.j0 */
/* loaded from: classes2.dex */
public class MapWithDefault {
    /* renamed from: a */
    public static final Object m375a(Map map, Object obj) {
        Intrinsics.isThisObjectNull(map, "<this>");
        if (map instanceof InterfaceC13764h0) {
            return ((InterfaceC13764h0) map).m401g(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
