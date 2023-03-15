package p294p9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: p9.b0 */
/* loaded from: classes.dex */
public final class C8516b0<E> implements List<E>, RandomAccess {

    /* renamed from: w */
    private final List<E> f21987w;

    private C8516b0(List<E> list) {
        this.f21987w = Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static <E> C8516b0<E> m15317b(List<E> list) {
        return new C8516b0<>(list);
    }

    /* renamed from: f */
    public static <E> C8516b0<E> m15316f(E... eArr) {
        return new C8516b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.f21987w.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f21987w.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f21987w.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f21987w.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f21987w.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f21987w.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f21987w.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f21987w.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f21987w.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f21987w.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f21987w.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f21987w.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f21987w.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f21987w.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f21987w.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f21987w.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.f21987w.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f21987w.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f21987w.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f21987w.toArray();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f21987w.add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f21987w.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f21987w.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.f21987w.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f21987w.toArray(tArr);
    }
}
