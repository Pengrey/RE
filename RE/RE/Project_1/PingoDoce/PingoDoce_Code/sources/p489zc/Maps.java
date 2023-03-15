package p489zc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.d0 */
/* loaded from: classes2.dex */
public final class Maps implements Map, Serializable, InterfaceC6650a {

    /* renamed from: w */
    public static final Maps f34878w = new Maps();

    private Maps() {
    }

    private final Object readResolve() {
        return f34878w;
    }

    /* renamed from: b */
    public boolean m422b(Void r2) {
        Intrinsics.isThisObjectNull(r2, "value");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m422b((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: e */
    public Set m420e() {
        return Sets.f34879w;
    }

    public final /* bridge */ Set entrySet() {
        return m420e();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Set m419f() {
        return Sets.f34879w;
    }

    /* renamed from: h */
    public int m418h() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    /* renamed from: j */
    public Collection m417j() {
        return Collections.f34877w;
    }

    /* renamed from: k */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set keySet() {
        return m419f();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m418h();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return m417j();
    }
}
