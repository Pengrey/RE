package p168j0;

import java.util.Map;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public class C6205b<K, V> implements Map.Entry, InterfaceC6650a {

    /* renamed from: w */
    private final Object f17023w;

    /* renamed from: x */
    private final Object f17024x;

    public C6205b(Object obj, Object obj2) {
        this.f17023w = obj;
        this.f17024x = obj2;
    }

    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.equals(entry.getKey(), getKey()) && Intrinsics.equals(entry.getValue(), getValue());
    }

    public Object getKey() {
        return this.f17023w;
    }

    public Object getValue() {
        return this.f17024x;
    }

    public int hashCode() {
        Object key = getKey();
        int hashCode = key == null ? 0 : key.hashCode();
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
