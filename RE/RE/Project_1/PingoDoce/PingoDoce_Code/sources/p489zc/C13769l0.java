package p489zc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p181jd.Intrinsics;
import p468yc.C13182l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* renamed from: zc.l0 */
/* loaded from: classes2.dex */
public class C13769l0 extends MapsJVM {
    /* renamed from: e */
    public static Map m334e() {
        Maps maps = Maps.f34878w;
        Intrinsics.m20929f(maps, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return maps;
    }

    /* renamed from: f */
    public static Object m333f(Map map, Object obj) {
        Intrinsics.isThisObjectNull(map, "<this>");
        return MapWithDefault.m375a(map, obj);
    }

    /* renamed from: g */
    public static HashMap m332g(C13182l... c13182lArr) {
        int m339b;
        Intrinsics.isThisObjectNull(c13182lArr, "pairs");
        m339b = MapsJVM.m339b(c13182lArr.length);
        HashMap hashMap = new HashMap(m339b);
        m327l(hashMap, c13182lArr);
        return hashMap;
    }

    /* renamed from: h */
    public static Map m331h(C13182l... c13182lArr) {
        Map m334e;
        int m339b;
        Intrinsics.isThisObjectNull(c13182lArr, "pairs");
        if (c13182lArr.length > 0) {
            m339b = MapsJVM.m339b(c13182lArr.length);
            return m323p(c13182lArr, new LinkedHashMap(m339b));
        }
        m334e = m334e();
        return m334e;
    }

    /* renamed from: i */
    public static Map m330i(C13182l... c13182lArr) {
        int m339b;
        Intrinsics.isThisObjectNull(c13182lArr, "pairs");
        m339b = MapsJVM.m339b(c13182lArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m339b);
        m327l(linkedHashMap, c13182lArr);
        return linkedHashMap;
    }

    /* renamed from: j */
    public static final Map m329j(Map map) {
        Map m334e;
        Intrinsics.isThisObjectNull(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : MapsJVM.m337d(map);
        }
        m334e = m334e();
        return m334e;
    }

    /* renamed from: k */
    public static final void m328k(Map map, Iterable iterable) {
        Intrinsics.isThisObjectNull(map, "<this>");
        Intrinsics.isThisObjectNull(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C13182l c13182l = (C13182l) it.next();
            map.put(c13182l.m1462a(), c13182l.m1461b());
        }
    }

    /* renamed from: l */
    public static final void m327l(Map map, C13182l[] c13182lArr) {
        Intrinsics.isThisObjectNull(map, "<this>");
        Intrinsics.isThisObjectNull(c13182lArr, "pairs");
        for (C13182l c13182l : c13182lArr) {
            map.put(c13182l.m1462a(), c13182l.m1461b());
        }
    }

    /* renamed from: m */
    public static Map m326m(Iterable iterable) {
        Map m334e;
        int m339b;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m334e = m334e();
                return m334e;
            } else if (size == 1) {
                return MapsJVM.m338c((C13182l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            } else {
                m339b = MapsJVM.m339b(collection.size());
                return m325n(iterable, new LinkedHashMap(m339b));
            }
        }
        return m329j(m325n(iterable, new LinkedHashMap()));
    }

    /* renamed from: n */
    public static final Map m325n(Iterable iterable, Map map) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(map, "destination");
        m328k(map, iterable);
        return map;
    }

    /* renamed from: o */
    public static Map m324o(Map map) {
        Map m334e;
        Map m322q;
        Intrinsics.isThisObjectNull(map, "<this>");
        int size = map.size();
        if (size == 0) {
            m334e = m334e();
            return m334e;
        } else if (size != 1) {
            m322q = m322q(map);
            return m322q;
        } else {
            return MapsJVM.m337d(map);
        }
    }

    /* renamed from: p */
    public static final Map m323p(C13182l[] c13182lArr, Map map) {
        Intrinsics.isThisObjectNull(c13182lArr, "<this>");
        Intrinsics.isThisObjectNull(map, "destination");
        m327l(map, c13182lArr);
        return map;
    }

    /* renamed from: q */
    public static Map m322q(Map map) {
        Intrinsics.isThisObjectNull(map, "<this>");
        return new LinkedHashMap(map);
    }
}
