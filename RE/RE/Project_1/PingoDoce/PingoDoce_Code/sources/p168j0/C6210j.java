package p168j0;

import java.util.Iterator;
import p181jd.Intrinsics;
import p489zc.AbstractC13761g;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* renamed from: j0.j */
/* loaded from: classes.dex */
public final class C6210j<K, V> extends AbstractC13761g {

    /* renamed from: w */
    private final PersistentHashMapBuilder f17046w;

    public C6210j(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "builder");
        this.f17046w = persistentHashMapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo405b() {
        return this.f17046w.size();
    }

    public void clear() {
        this.f17046w.clear();
    }

    public boolean contains(Object obj) {
        return this.f17046w.containsKey(obj);
    }

    public Iterator iterator() {
        return new C6211k(this.f17046w);
    }

    public boolean remove(Object obj) {
        if (this.f17046w.containsKey(obj)) {
            this.f17046w.remove(obj);
            return true;
        }
        return false;
    }
}
