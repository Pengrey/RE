package p168j0;

import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C6208h<K, V> extends PersistentHashMapBuilderContentViews {

    /* renamed from: w */
    private final PersistentHashMapBuilder f17044w;

    public C6208h(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "builder");
        this.f17044w = persistentHashMapBuilder;
    }

    /* renamed from: b */
    public int mo405b() {
        return this.f17044w.size();
    }

    public void clear() {
        this.f17044w.clear();
    }

    /* renamed from: h */
    public boolean m21867h(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        Object obj = this.f17044w.get(entry.getKey());
        Boolean valueOf = obj == null ? null : Boolean.valueOf(Intrinsics.equals(obj, entry.getValue()));
        if (valueOf == null) {
            return entry.getValue() == null && this.f17044w.containsKey(entry.getKey());
        }
        return valueOf.booleanValue();
    }

    public Iterator iterator() {
        return new C6209i(this.f17044w);
    }

    /* renamed from: o */
    public boolean m21866o(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        return this.f17044w.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: p */
    public boolean add(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        throw new UnsupportedOperationException();
    }
}
