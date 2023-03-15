package p260o0;

import java.util.Set;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6655e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.o */
/* loaded from: classes.dex */
public abstract class AbstractC7979o<K, V, E> implements Set, InterfaceC6655e {

    /* renamed from: w */
    private final C7987t f20681w;

    public AbstractC7979o(C7987t c7987t) {
        Intrinsics.isThisObjectNull(c7987t, "map");
        this.f20681w = c7987t;
    }

    /* renamed from: b */
    public final C7987t m17284b() {
        return this.f20681w;
    }

    public void clear() {
        this.f20681w.clear();
    }

    /* renamed from: f */
    public int m17283f() {
        return this.f20681w.size();
    }

    public boolean isEmpty() {
        return this.f20681w.isEmpty();
    }

    public final /* bridge */ int size() {
        return m17283f();
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }
}
