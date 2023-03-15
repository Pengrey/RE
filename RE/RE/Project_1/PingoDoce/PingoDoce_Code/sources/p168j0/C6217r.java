package p168j0;

import java.util.Iterator;
import p126h0.InterfaceC5733b;
import p181jd.Intrinsics;
import p489zc.AbstractCollection;

/* compiled from: PersistentHashMapContentViews.kt */
/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C6217r<K, V> extends AbstractCollection implements InterfaceC5733b {

    /* renamed from: w */
    private final PersistentHashMap f17050w;

    public C6217r(PersistentHashMap persistentHashMap) {
        Intrinsics.isThisObjectNull(persistentHashMap, "map");
        this.f17050w = persistentHashMap;
    }

    /* renamed from: b */
    public int m21859b() {
        return this.f17050w.size();
    }

    public boolean contains(Object obj) {
        return this.f17050w.containsValue(obj);
    }

    public Iterator iterator() {
        return new C6218s(this.f17050w.m21889q());
    }
}
