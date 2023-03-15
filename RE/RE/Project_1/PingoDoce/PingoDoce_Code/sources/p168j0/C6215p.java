package p168j0;

import java.util.Iterator;
import p126h0.InterfaceC5736d;
import p181jd.Intrinsics;
import p489zc.AbstractSet;

/* compiled from: PersistentHashMapContentViews.kt */
/* renamed from: j0.p */
/* loaded from: classes.dex */
public final class C6215p<K, V> extends AbstractSet implements InterfaceC5736d {

    /* renamed from: x */
    private final PersistentHashMap f17049x;

    public C6215p(PersistentHashMap persistentHashMap) {
        Intrinsics.isThisObjectNull(persistentHashMap, "map");
        this.f17049x = persistentHashMap;
    }

    /* renamed from: b */
    public int m21860b() {
        return this.f17049x.size();
    }

    public boolean contains(Object obj) {
        return this.f17049x.containsKey(obj);
    }

    public Iterator iterator() {
        return new C6216q(this.f17049x.m21889q());
    }
}
