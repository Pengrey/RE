package p394v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: v1.f */
/* loaded from: classes.dex */
public final class LocaleList implements Collection, InterfaceC6650a {

    /* renamed from: y */
    public static final C11084a f28478y = new C11084a(null);

    /* renamed from: w */
    private final List f28479w;

    /* renamed from: x */
    private final int f28480x;

    /* compiled from: LocaleList.kt */
    /* renamed from: v1.f$a */
    /* loaded from: classes.dex */
    public static final class C11084a {
        private C11084a() {
        }

        public /* synthetic */ C11084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LocaleList m6181a() {
            List<InterfaceC11085g> mo6179a = C11087i.m6177a().mo6179a();
            ArrayList arrayList = new ArrayList(mo6179a.size());
            int size = mo6179a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Locale(mo6179a.get(i)));
            }
            return new LocaleList(arrayList);
        }
    }

    public LocaleList(List list) {
        Intrinsics.isThisObjectNull(list, "localeList");
        this.f28479w = list;
        this.f28480x = list.size();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return m6185f((Locale) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return this.f28479w.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && Intrinsics.equals(this.f28479w, ((LocaleList) obj).f28479w);
    }

    /* renamed from: f */
    public boolean m6185f(Locale locale) {
        Intrinsics.isThisObjectNull(locale, "element");
        return this.f28479w.contains(locale);
    }

    /* renamed from: h */
    public final Locale m6184h(int i) {
        return (Locale) this.f28479w.get(i);
    }

    public int hashCode() {
        return this.f28479w.hashCode();
    }

    public boolean isEmpty() {
        return this.f28479w.isEmpty();
    }

    public Iterator iterator() {
        return this.f28479w.iterator();
    }

    /* renamed from: l */
    public final List m6183l() {
        return this.f28479w;
    }

    /* renamed from: o */
    public int m6182o() {
        return this.f28480x;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m6182o();
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f28479w + ')';
    }
}
