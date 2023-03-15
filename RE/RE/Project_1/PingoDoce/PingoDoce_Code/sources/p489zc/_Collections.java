package p489zc;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p337rd.InterfaceC9870e;
import p468yc.C13191r;
import sd.Appendable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.a0 */
/* loaded from: classes2.dex */
public class _Collections extends _CollectionsJvm {

    /* compiled from: Sequences.kt */
    /* renamed from: zc.a0$a */
    /* loaded from: classes2.dex */
    public static final class C13749a implements InterfaceC9870e {

        /* renamed from: a */
        final /* synthetic */ Iterable f34867a;

        public C13749a(Iterable iterable) {
            this.f34867a = iterable;
        }

        public Iterator iterator() {
            return this.f34867a.iterator();
        }
    }

    /* renamed from: D */
    public static InterfaceC9870e m491D(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        return new C13749a(iterable);
    }

    /* renamed from: E */
    public static boolean m490E(Iterable iterable, Object obj) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m479P(iterable, obj) >= 0;
    }

    /* renamed from: F */
    public static List m489F(Iterable iterable) {
        Set m452q0;
        List m455n0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        m452q0 = m452q0(iterable);
        m455n0 = m455n0(m452q0);
        return m455n0;
    }

    /* renamed from: G */
    public static List m488G(Iterable iterable, int i) {
        ArrayList arrayList;
        List m190n;
        List m202b;
        List m197g;
        List m455n0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m455n0 = m455n0(iterable);
            return m455n0;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    m197g = C13780s.m197g();
                    return m197g;
                } else if (size == 1) {
                    m202b = CollectionsJVM.m202b(m473V(iterable));
                    return m202b;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            m190n = C13780s.m190n(arrayList);
            return m190n;
        }
    }

    /* renamed from: H */
    public static List m487H(List list, int i) {
        int m15005d;
        List m460i0;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (i >= 0) {
            m15005d = _Ranges.m15005d(list.size() - i, 0);
            m460i0 = m460i0(list, m15005d);
            return m460i0;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: I */
    public static List m486I(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        return (List) m485J(iterable, new ArrayList());
    }

    /* renamed from: J */
    public static final Collection m485J(Iterable iterable, Collection collection) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: K */
    public static Object m484K(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof List) {
            return C13777q.m256L((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: L */
    public static Object m483L(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: M */
    public static Object m482M(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: N */
    public static Object m481N(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: O */
    public static Object m480O(List list, int i) {
        int m195i;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (i >= 0) {
            m195i = C13780s.m195i(list);
            if (i <= m195i) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: P */
    public static final int m479P(Iterable iterable, Object obj) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                C13780s.m187q();
            }
            if (Intrinsics.equals(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Q */
    public static int m478Q(List list, Object obj) {
        Intrinsics.isThisObjectNull(list, "<this>");
        return list.indexOf(obj);
    }

    /* renamed from: R */
    public static final Appendable m477R(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(appendable, "buffer");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Appendable.m8964a(appendable, obj, interfaceC6108l);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: S */
    public static /* synthetic */ Appendable m476S(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        int i3 = i2 & 4;
        CharSequence charSequence5 = BuildConfig.VERSION_NAME;
        CharSequence charSequence6 = i3 != 0 ? BuildConfig.VERSION_NAME : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m477R(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : interfaceC6108l);
    }

    /* renamed from: T */
    public static final String m475T(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "separator");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        Intrinsics.isThisObjectNull(charSequence3, "postfix");
        Intrinsics.isThisObjectNull(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m477R(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC6108l)).toString();
        Intrinsics.checkIfNull(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: U */
    public static /* synthetic */ String m474U(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6108l interfaceC6108l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = BuildConfig.VERSION_NAME;
        CharSequence charSequence6 = i3 != 0 ? BuildConfig.VERSION_NAME : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC6108l = null;
        }
        return m475T(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, interfaceC6108l);
    }

    /* renamed from: V */
    public static final Object m473V(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof List) {
            return C13777q.m249W((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: W */
    public static Object m472W(List list) {
        int m195i;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (!list.isEmpty()) {
            m195i = C13780s.m195i(list);
            return list.get(m195i);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: X */
    public static Object m471X(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: Y */
    public static Float m470Y(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* renamed from: Z */
    public static Comparable m469Z(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        return null;
    }

    /* renamed from: a0 */
    public static Float m468a0(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* renamed from: b0 */
    public static List m467b0(Collection collection, Iterable iterable) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        Intrinsics.isThisObjectNull(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        MutableCollections.m181u(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: c0 */
    public static List m466c0(Collection collection, Object obj) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: d0 */
    public static List m465d0(Iterable iterable) {
        List m455n0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            m455n0 = m455n0(iterable);
            return m455n0;
        }
        List m454o0 = m454o0(iterable);
        _CollectionsJvm.m175C(m454o0);
        return m454o0;
    }

    /* renamed from: e0 */
    public static Object m464e0(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof List) {
            return m463f0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: f0 */
    public static final Object m463f0(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: g0 */
    public static Object m462g0(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: h0 */
    public static List m461h0(Iterable iterable, Comparator comparator) {
        List m320d;
        List m455n0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m455n0 = m455n0(iterable);
                return m455n0;
            }
            Object[] array = collection.toArray(new Object[0]);
            Intrinsics.m20929f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Intrinsics.m20929f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            _ArraysJvm.m301w(array, comparator);
            m320d = _ArraysJvm.m320d(array);
            return m320d;
        }
        List m454o0 = m454o0(iterable);
        MutableCollectionsJVM.m184t(m454o0, comparator);
        return m454o0;
    }

    /* renamed from: i0 */
    public static List m460i0(Iterable iterable, int i) {
        List m190n;
        List m202b;
        List m455n0;
        List m197g;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m197g = C13780s.m197g();
            return m197g;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    m455n0 = m455n0(iterable);
                    return m455n0;
                } else if (i == 1) {
                    m202b = CollectionsJVM.m202b(C13777q.m257K(iterable));
                    return m202b;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object obj : iterable) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            m190n = C13780s.m190n(arrayList);
            return m190n;
        }
    }

    /* renamed from: j0 */
    public static List m459j0(List list, int i) {
        List m202b;
        List m455n0;
        List m197g;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            m197g = C13780s.m197g();
            return m197g;
        } else {
            int size = list.size();
            if (i >= size) {
                m455n0 = m455n0(list);
                return m455n0;
            } else if (i == 1) {
                m202b = CollectionsJVM.m202b(C13777q.m249W(list));
                return m202b;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i2 = size - i; i2 < size; i2++) {
                        arrayList.add(list.get(i2));
                    }
                } else {
                    ListIterator listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
    }

    /* renamed from: k0 */
    public static final Collection m458k0(Iterable iterable, Collection collection) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(collection, "destination");
        for (Object obj : iterable) {
            collection.add(obj);
        }
        return collection;
    }

    /* renamed from: l0 */
    public static float[] m457l0(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: m0 */
    public static int[] m456m0(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: n0 */
    public static List m455n0(Iterable iterable) {
        List m190n;
        List m197g;
        List m202b;
        List m453p0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m197g = C13780s.m197g();
                return m197g;
            } else if (size != 1) {
                m453p0 = m453p0(collection);
                return m453p0;
            } else {
                m202b = CollectionsJVM.m202b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return m202b;
            }
        }
        m190n = C13780s.m190n(m454o0(iterable));
        return m190n;
    }

    /* renamed from: o0 */
    public static final List m454o0(Iterable iterable) {
        List m453p0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof Collection) {
            m453p0 = m453p0((Collection) iterable);
            return m453p0;
        }
        return (List) m458k0(iterable, new ArrayList());
    }

    /* renamed from: p0 */
    public static List m453p0(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: q0 */
    public static Set m452q0(Iterable iterable) {
        Intrinsics.isThisObjectNull(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m458k0(iterable, new LinkedHashSet());
    }

    /* renamed from: r0 */
    public static Set m451r0(Iterable iterable) {
        Set m208b;
        int m339b;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m208b = C13778q0.m208b();
                return m208b;
            } else if (size == 1) {
                return C13776p0.m266a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            } else {
                m339b = MapsJVM.m339b(collection.size());
                return (Set) m458k0(iterable, new LinkedHashSet(m339b));
            }
        }
        return C13778q0.m205e((Set) m458k0(iterable, new LinkedHashSet()));
    }

    /* renamed from: s0 */
    public static Set m450s0(Iterable iterable, Iterable iterable2) {
        Set m452q0;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(iterable2, "other");
        m452q0 = m452q0(iterable);
        MutableCollections.m181u(m452q0, iterable2);
        return m452q0;
    }

    /* renamed from: t0 */
    public static List m449t0(Iterable iterable, Iterable iterable2) {
        int m186r;
        int m186r2;
        Intrinsics.isThisObjectNull(iterable, "<this>");
        Intrinsics.isThisObjectNull(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        m186r = Iterables.m186r(iterable, 10);
        m186r2 = Iterables.m186r(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(m186r, m186r2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C13191r.m1447a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
