package p168j0;

import java.util.Iterator;
import java.util.Map;
import p126h0.InterfaceC5736d;
import p181jd.Intrinsics;
import p489zc.AbstractSet;

/* renamed from: j0.n */
/* loaded from: classes.dex */
public final class PersistentHashMapContentViews<K, V> extends AbstractSet implements InterfaceC5736d {

    /* renamed from: x */
    private final PersistentHashMap f17048x;

    public PersistentHashMapContentViews(PersistentHashMap persistentHashMap) {
        Intrinsics.isThisObjectNull(persistentHashMap, "map");
        this.f17048x = persistentHashMap;
    }

    /* renamed from: b */
    public int m21862b() {
        return this.f17048x.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m21861f((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m21861f(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        Object obj = this.f17048x.get(entry.getKey());
        Boolean valueOf = obj == null ? null : Boolean.valueOf(Intrinsics.equals(obj, entry.getValue()));
        if (valueOf == null) {
            return entry.getValue() == null && this.f17048x.containsKey(entry.getKey());
        }
        return valueOf.booleanValue();
    }

    public Iterator iterator() {
        return new C6214o(this.f17048x.m21889q());
    }
}
