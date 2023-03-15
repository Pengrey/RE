package p489zc;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: zc.f */
/* loaded from: classes2.dex */
public abstract class AbstractC13759f<K, V> extends AbstractMap<K, V> implements Map<K, V> {
    /* renamed from: b */
    public abstract Set mo411b();

    /* renamed from: d */
    public abstract /* bridge */ Set<Object> mo410d();

    /* renamed from: e */
    public abstract /* bridge */ int mo409e();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo411b();
    }

    /* renamed from: f */
    public abstract /* bridge */ Collection<Object> mo408f();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) mo410d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo409e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) mo408f();
    }
}
