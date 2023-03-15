package p168j0;

import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* renamed from: j0.i */
/* loaded from: classes.dex */
public final class C6209i<K, V> implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private final C6207g f17045w;

    public C6209i(PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "builder");
        AbstractC6221u[] abstractC6221uArr = new AbstractC6221u[8];
        for (int i = 0; i < 8; i++) {
            abstractC6221uArr[i] = new C6225y(this);
        }
        this.f17045w = new C6207g(persistentHashMapBuilder, abstractC6221uArr);
    }

    /* renamed from: a */
    public Map.Entry mo21177a() {
        return (Map.Entry) this.f17045w.next();
    }

    /* renamed from: b */
    public final void m21863b(Object obj, Object obj2) {
        this.f17045w.m21868l(obj, obj2);
    }

    public boolean hasNext() {
        return this.f17045w.hasNext();
    }

    public void remove() {
        this.f17045w.remove();
    }
}
