package p489zc;

import ad.C0127b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p181jd.Intrinsics;
import p297pd.C8611f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* renamed from: zc.s */
/* loaded from: classes2.dex */
public class C13780s extends CollectionsJVM {
    /* renamed from: c */
    public static ArrayList m201c(Object... objArr) {
        Intrinsics.isThisObjectNull(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C13765i(objArr, true));
    }

    /* renamed from: d */
    public static final Collection m200d(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "<this>");
        return new C13765i(objArr, false);
    }

    /* renamed from: e */
    public static final int m199e(List list, Comparable comparable, int i, int i2) {
        int m41795a;
        Intrinsics.isThisObjectNull(list, "<this>");
        m189o(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            m41795a = C0127b.m41795a((Comparable) list.get(i4), comparable);
            if (m41795a < 0) {
                i = i4 + 1;
            } else if (m41795a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: f */
    public static /* synthetic */ int m198f(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m199e(list, comparable, i, i2);
    }

    /* renamed from: g */
    public static List m197g() {
        return Collections.f34877w;
    }

    /* renamed from: h */
    public static C8611f m196h(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "<this>");
        return new C8611f(0, collection.size() - 1);
    }

    /* renamed from: i */
    public static int m195i(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: j */
    public static List m194j(Object... objArr) {
        List m197g;
        List m320d;
        Intrinsics.isThisObjectNull(objArr, "elements");
        if (objArr.length > 0) {
            m320d = _ArraysJvm.m320d(objArr);
            return m320d;
        }
        m197g = m197g();
        return m197g;
    }

    /* renamed from: k */
    public static List m193k(Object obj) {
        List m197g;
        List m202b;
        if (obj != null) {
            m202b = CollectionsJVM.m202b(obj);
            return m202b;
        }
        m197g = m197g();
        return m197g;
    }

    /* renamed from: l */
    public static List m192l(Object... objArr) {
        List m293A;
        Intrinsics.isThisObjectNull(objArr, "elements");
        m293A = _Arrays.m293A(objArr);
        return m293A;
    }

    /* renamed from: m */
    public static List m191m(Object... objArr) {
        Intrinsics.isThisObjectNull(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C13765i(objArr, true));
    }

    /* renamed from: n */
    public static List m190n(List list) {
        List m197g;
        List m202b;
        Intrinsics.isThisObjectNull(list, "<this>");
        int size = list.size();
        if (size == 0) {
            m197g = m197g();
            return m197g;
        } else if (size != 1) {
            return list;
        } else {
            m202b = CollectionsJVM.m202b(list.get(0));
            return m202b;
        }
    }

    /* renamed from: o */
    private static final void m189o(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 <= i) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: p */
    public static void m188p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: q */
    public static void m187q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
