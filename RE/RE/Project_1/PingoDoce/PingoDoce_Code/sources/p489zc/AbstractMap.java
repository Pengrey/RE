package p489zc;

import id.InterfaceC6108l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: zc.c */
/* loaded from: classes2.dex */
public abstract class AbstractMap<K, V> implements Map, InterfaceC6650a {

    /* compiled from: AbstractMap.kt */
    /* renamed from: zc.c$a */
    /* loaded from: classes2.dex */
    public static final class C13755a {
        private C13755a() {
        }

        public /* synthetic */ C13755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AbstractMap.kt */
    /* renamed from: zc.c$b */
    /* loaded from: classes2.dex */
    static final class C13756b extends AbstractC6438m implements InterfaceC6108l {
        C13756b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo9587d(Map.Entry entry) {
            Intrinsics.isThisObjectNull(entry, "it");
            return AbstractMap.m437b(AbstractMap.this, entry);
        }
    }

    static {
        new C13755a(null);
    }

    /* renamed from: b */
    public static final /* synthetic */ String m437b(AbstractMap abstractMap, Map.Entry entry) {
        return abstractMap.m430l(entry);
    }

    /* renamed from: k */
    private final String m431k(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* renamed from: l */
    private final String m430l(Map.Entry entry) {
        return m431k(entry.getKey()) + '=' + m431k(entry.getValue());
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (Intrinsics.equals(entry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m436d(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.m20929f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (Intrinsics.equals(value, v)) {
            if (v == null) {
                Intrinsics.m20929f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
                return containsKey(key);
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public abstract Set m435e();

    public final /* bridge */ Set entrySet() {
        return m435e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set<Map.Entry<K, V>> entrySet = map.entrySet();
            if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
                return true;
            }
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                if (!m436d((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public abstract Set m434f();

    /* renamed from: h */
    public abstract int m433h();

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public abstract Collection m432j();

    public final /* bridge */ Set keySet() {
        return m434f();
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m433h();
    }

    public String toString() {
        String m474U;
        m474U = _Collections.m474U(entrySet(), ", ", "{", "}", 0, null, new C13756b(), 24, null);
        return m474U;
    }

    public final /* bridge */ Collection values() {
        return m432j();
    }
}
