package p359t1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: t1.f */
/* loaded from: classes.dex */
public final class FontFamily extends AbstractC10361c implements List, InterfaceC6650a {

    /* renamed from: y */
    private final List f26953y;

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC10362d) {
            return m8147l((InterfaceC10362d) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return this.f26953y.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontFamily) && Intrinsics.equals(this.f26953y, ((FontFamily) obj).f26953y);
    }

    /* renamed from: f */
    public void mo7741f(int i, InterfaceC10362d interfaceC10362d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: h */
    public boolean mo7740h(InterfaceC10362d interfaceC10362d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return this.f26953y.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC10362d) {
            return m8143t((InterfaceC10362d) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f26953y.isEmpty();
    }

    public Iterator iterator() {
        return this.f26953y.iterator();
    }

    /* renamed from: l */
    public boolean m8147l(InterfaceC10362d interfaceC10362d) {
        Intrinsics.isThisObjectNull(interfaceC10362d, "element");
        return this.f26953y.contains(interfaceC10362d);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC10362d) {
            return m8142u((InterfaceC10362d) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return this.f26953y.listIterator();
    }

    public ListIterator listIterator(int i) {
        return this.f26953y.listIterator(i);
    }

    /* renamed from: o */
    public InterfaceC10362d mo7738o(int i) {
        return (InterfaceC10362d) this.f26953y.get(i);
    }

    /* renamed from: p */
    public final List m8145p() {
        return this.f26953y;
    }

    /* renamed from: q */
    public int m8144q() {
        return this.f26953y.size();
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m8144q();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return this.f26953y.subList(i, i2);
    }

    /* renamed from: t */
    public int m8143t(InterfaceC10362d interfaceC10362d) {
        Intrinsics.isThisObjectNull(interfaceC10362d, "element");
        return this.f26953y.indexOf(interfaceC10362d);
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f26953y + ')';
    }

    /* renamed from: u */
    public int m8142u(InterfaceC10362d interfaceC10362d) {
        Intrinsics.isThisObjectNull(interfaceC10362d, "element");
        return this.f26953y.lastIndexOf(interfaceC10362d);
    }

    /* renamed from: v */
    public InterfaceC10362d mo7733v(int i, InterfaceC10362d interfaceC10362d) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
