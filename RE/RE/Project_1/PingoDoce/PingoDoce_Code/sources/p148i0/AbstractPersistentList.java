package p148i0;

import id.InterfaceC6108l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p126h0.ImmutableList;
import p126h0.InterfaceC5737e;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p489zc.AbstractList;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends AbstractList implements InterfaceC5737e {

    /* compiled from: AbstractPersistentList.kt */
    /* renamed from: i0.b$a */
    /* loaded from: classes.dex */
    static final class C5982a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Collection f16519w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5982a(Collection collection) {
            super(1);
            this.f16519w = collection;
        }

        /* renamed from: a */
        public final Boolean mo9587d(Object obj) {
            return Boolean.valueOf(this.f16519w.contains(obj));
        }
    }

    public InterfaceC5737e addAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        InterfaceC5737e.InterfaceC5738a m23205i = m23205i();
        m23205i.addAll(collection);
        return m23205i.build();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public ImmutableList mo22469f(int i, int i2) {
        return InterfaceC5737e.C5739b.m23202a(this, i, i2);
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public InterfaceC5737e remove(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf != -1 ? m23203z(indexOf) : this;
    }

    public InterfaceC5737e removeAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m23204w(new C5982a(collection));
    }
}
