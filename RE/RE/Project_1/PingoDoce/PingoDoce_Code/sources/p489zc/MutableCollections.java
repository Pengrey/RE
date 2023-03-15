package p489zc;

import id.InterfaceC6108l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p297pd.C8611f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.x */
/* loaded from: classes2.dex */
public class MutableCollections extends MutableCollectionsJVM {
    /* renamed from: A */
    public static Object m183A(List list) {
        int m195i;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        m195i = C13780s.m195i(list);
        return list.remove(m195i);
    }

    /* renamed from: B */
    public static Object m182B(List list) {
        int m195i;
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        m195i = C13780s.m195i(list);
        return list.remove(m195i);
    }

    /* renamed from: u */
    public static boolean m181u(Collection collection, Iterable iterable) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        Intrinsics.isThisObjectNull(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object obj : iterable) {
            if (collection.add(obj)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: v */
    public static boolean m180v(Collection collection, Object[] objArr) {
        List m320d;
        Intrinsics.isThisObjectNull(collection, "<this>");
        Intrinsics.isThisObjectNull(objArr, "elements");
        m320d = _ArraysJvm.m320d(objArr);
        return collection.addAll(m320d);
    }

    /* renamed from: w */
    private static final boolean m179w(Iterable iterable, InterfaceC6108l interfaceC6108l, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC6108l.mo9587d(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: x */
    private static final boolean m178x(List list, InterfaceC6108l interfaceC6108l, boolean z) {
        int m195i;
        int m195i2;
        if (!(list instanceof RandomAccess)) {
            Intrinsics.m20929f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m179w(C6431d0.m20954a(list), interfaceC6108l, z);
        }
        m195i = C13780s.m195i(list);
        AbstractC13762g0 mo15031o = new C8611f(0, m195i).mo15031o();
        int i = 0;
        while (mo15031o.hasNext()) {
            int mo404a = mo15031o.mo404a();
            Object obj = list.get(mo404a);
            if (((Boolean) interfaceC6108l.mo9587d(obj)).booleanValue() != z) {
                if (i != mo404a) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        m195i2 = C13780s.m195i(list);
        if (i > m195i2) {
            return true;
        }
        while (true) {
            list.remove(m195i2);
            if (m195i2 == i) {
                return true;
            }
            m195i2--;
        }
    }

    /* renamed from: y */
    public static boolean m177y(List list, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(list, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        return m178x(list, interfaceC6108l, true);
    }

    /* renamed from: z */
    public static Object m176z(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
