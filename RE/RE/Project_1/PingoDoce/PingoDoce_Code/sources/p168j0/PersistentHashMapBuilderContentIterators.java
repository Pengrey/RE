package p168j0;

import p181jd.Intrinsics;
import p203kd.InterfaceC6653d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j0.c */
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderContentIterators<K, V> extends C6205b implements InterfaceC6653d.InterfaceC6654a {

    /* renamed from: y */
    private final C6209i f17025y;

    /* renamed from: z */
    private Object f17026z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentHashMapBuilderContentIterators(C6209i c6209i, Object obj, Object obj2) {
        super(obj, obj2);
        Intrinsics.isThisObjectNull(c6209i, "parentIterator");
        this.f17025y = c6209i;
        this.f17026z = obj2;
    }

    /* renamed from: a */
    public void m21899a(Object obj) {
        this.f17026z = obj;
    }

    public Object getValue() {
        return this.f17026z;
    }

    public Object setValue(Object obj) {
        Object value = getValue();
        m21899a(obj);
        this.f17025y.m21863b(getKey(), obj);
        return value;
    }
}
