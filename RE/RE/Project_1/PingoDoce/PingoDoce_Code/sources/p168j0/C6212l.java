package p168j0;

import java.util.Iterator;
import p181jd.Intrinsics;
import p489zc.AbstractC13757d;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* renamed from: j0.l */
/* loaded from: classes.dex */
public final class C6212l<K, V> extends AbstractC13757d {

    /* renamed from: w */
    private final PersistentHashMapBuilder f17047w;

    public C6212l(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "builder");
        this.f17047w = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo423b() {
        return this.f17047w.size();
    }

    public void clear() {
        this.f17047w.clear();
    }

    public boolean contains(Object obj) {
        return this.f17047w.containsValue(obj);
    }

    public Iterator iterator() {
        return new C6213m(this.f17047w);
    }
}
