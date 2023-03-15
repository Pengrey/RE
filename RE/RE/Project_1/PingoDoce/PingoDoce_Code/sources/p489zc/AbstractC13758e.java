package p489zc;

import java.util.AbstractList;
import java.util.List;

/* renamed from: zc.e */
/* loaded from: classes2.dex */
public abstract class AbstractC13758e<E> extends AbstractList<E> implements List<E> {
    /* renamed from: b */
    public abstract int mo415b();

    /* renamed from: f */
    public abstract E mo414f(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return mo414f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo415b();
    }
}
