package p148i0;

import id.InterfaceC6108l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p126h0.InterfaceC5737e;
import p181jd.AbstractC6438m;
import p181jd.C6426b;
import p181jd.Intrinsics;
import p210l0.C6956a;
import p210l0.C6959d;
import p210l0.C6960e;
import p297pd._Ranges;
import p489zc.AbstractC13758e;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* renamed from: i0.f */
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends AbstractC13758e implements InterfaceC5737e.InterfaceC5738a {

    /* renamed from: A */
    private C6960e f16526A;

    /* renamed from: B */
    private Object[] f16527B;

    /* renamed from: C */
    private Object[] f16528C;

    /* renamed from: D */
    private int f16529D;

    /* renamed from: w */
    private InterfaceC5737e f16530w;

    /* renamed from: x */
    private Object[] f16531x;

    /* renamed from: y */
    private Object[] f16532y;

    /* renamed from: z */
    private int f16533z;

    /* compiled from: PersistentVectorBuilder.kt */
    /* renamed from: i0.f$a */
    /* loaded from: classes.dex */
    static final class C5984a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Collection f16534w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5984a(Collection collection) {
            super(1);
            this.f16534w = collection;
        }

        /* renamed from: a */
        public final Boolean mo9587d(Object obj) {
            return Boolean.valueOf(this.f16534w.contains(obj));
        }
    }

    public PersistentVectorBuilder(InterfaceC5737e interfaceC5737e, Object[] objArr, Object[] objArr2, int i) {
        Intrinsics.isThisObjectNull(interfaceC5737e, "vector");
        Intrinsics.isThisObjectNull(objArr2, "vectorTail");
        this.f16530w = interfaceC5737e;
        this.f16531x = objArr;
        this.f16532y = objArr2;
        this.f16533z = i;
        this.f16526A = new C6960e();
        this.f16527B = this.f16531x;
        this.f16528C = this.f16532y;
        this.f16529D = this.f16530w.size();
    }

    /* renamed from: B */
    private final ListIterator m22510B(int i) {
        if (this.f16527B != null) {
            int m22490V = m22490V() >> 5;
            C6959d.m19702b(i, m22490V);
            int i2 = this.f16533z;
            if (i2 == 0) {
                Object[] objArr = this.f16527B;
                Intrinsics.ifNullDoSomething(objArr);
                return new C5985i(objArr, i);
            }
            Object[] objArr2 = this.f16527B;
            Intrinsics.ifNullDoSomething(objArr2);
            return new TrieIterator(objArr2, i, m22490V, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: C */
    private final Object[] m22509C(Object[] objArr) {
        int m15000i;
        Object[] m311m;
        if (objArr == null) {
            return m22507E();
        }
        if (m22475y(objArr)) {
            return objArr;
        }
        Object[] m22507E = m22507E();
        m15000i = _Ranges.m15000i(objArr.length, 32);
        m311m = _ArraysJvm.m311m(objArr, m22507E, 0, 0, m15000i, 6, null);
        return m311m;
    }

    /* renamed from: D */
    private final Object[] m22508D(Object[] objArr, int i) {
        if (m22475y(objArr)) {
            return C13768k.m353i(objArr, objArr, i, 0, 32 - i);
        }
        return C13768k.m353i(objArr, m22507E(), i, 0, 32 - i);
    }

    /* renamed from: E */
    private final Object[] m22507E() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f16526A;
        return objArr;
    }

    /* renamed from: F */
    private final Object[] m22506F(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f16526A;
        return objArr;
    }

    /* renamed from: G */
    private final Object[] m22505G(Object[] objArr, int i, int i2) {
        if (i2 >= 0) {
            if (i2 == 0) {
                return objArr;
            }
            int m22458a = C5987l.m22458a(i, i2);
            Object obj = objArr[m22458a];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object m22505G = m22505G((Object[]) obj, i, i2 - 5);
            if (m22458a < 31) {
                int i3 = m22458a + 1;
                if (objArr[i3] != null) {
                    if (m22475y(objArr)) {
                        _ArraysJvm.m306r(objArr, null, i3, 32);
                    }
                    objArr = C13768k.m353i(objArr, m22507E(), 0, 0, i3);
                }
            }
            if (m22505G != objArr[m22458a]) {
                Object[] m22509C = m22509C(objArr);
                m22509C[m22458a] = m22505G;
                return m22509C;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: H */
    private final Object[] m22504H(Object[] objArr, int i, int i2, C5983d c5983d) {
        Object[] m22504H;
        int m22458a = C5987l.m22458a(i2 - 1, i);
        if (i == 5) {
            c5983d.m22527b(objArr[m22458a]);
            m22504H = null;
        } else {
            Object obj = objArr[m22458a];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m22504H = m22504H((Object[]) obj, i - 5, i2, c5983d);
        }
        if (m22504H == null && m22458a == 0) {
            return null;
        }
        Object[] m22509C = m22509C(objArr);
        m22509C[m22458a] = m22504H;
        return m22509C;
    }

    /* renamed from: I */
    private final void m22503I(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f16527B = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f16528C = objArr;
            this.f16529D = i;
            this.f16533z = i2;
            return;
        }
        C5983d c5983d = new C5983d(null);
        Intrinsics.ifNullDoSomething(objArr);
        Object[] m22504H = m22504H(objArr, i2, i, c5983d);
        Intrinsics.ifNullDoSomething(m22504H);
        Object m22528a = c5983d.m22528a();
        Objects.requireNonNull(m22528a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f16528C = (Object[]) m22528a;
        this.f16529D = i;
        if (m22504H[1] == null) {
            this.f16527B = (Object[]) m22504H[0];
            this.f16533z = i2 - 5;
            return;
        }
        this.f16527B = m22504H;
        this.f16533z = i2;
    }

    /* renamed from: J */
    private final Object[] m22502J(Object[] objArr, int i, int i2, Iterator it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return (Object[]) it.next();
                }
                Object[] m22509C = m22509C(objArr);
                int m22458a = C5987l.m22458a(i, i2);
                int i3 = i2 - 5;
                m22509C[m22458a] = m22502J((Object[]) m22509C[m22458a], i, i3, it);
                while (true) {
                    m22458a++;
                    if (m22458a >= 32 || !it.hasNext()) {
                        break;
                    }
                    m22509C[m22458a] = m22502J((Object[]) m22509C[m22458a], 0, i3, it);
                }
                return m22509C;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: K */
    private final Object[] m22501K(Object[] objArr, int i, Object[][] objArr2) {
        Object[] m22509C;
        Iterator m20963a = C6426b.m20963a(objArr2);
        int i2 = i >> 5;
        int i3 = this.f16533z;
        if (i2 < (1 << i3)) {
            m22509C = m22502J(objArr, i, i3, m20963a);
        } else {
            m22509C = m22509C(objArr);
        }
        while (m20963a.hasNext()) {
            this.f16533z += 5;
            m22509C = m22506F(m22509C);
            int i4 = this.f16533z;
            m22502J(m22509C, 1 << i4, i4, m20963a);
        }
        return m22509C;
    }

    /* renamed from: L */
    private final void m22500L(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f16533z;
        if (size > (1 << i)) {
            this.f16527B = m22499M(m22506F(objArr), objArr2, this.f16533z + 5);
            this.f16528C = objArr3;
            this.f16533z += 5;
            this.f16529D = size() + 1;
        } else if (objArr == null) {
            this.f16527B = objArr2;
            this.f16528C = objArr3;
            this.f16529D = size() + 1;
        } else {
            this.f16527B = m22499M(objArr, objArr2, i);
            this.f16528C = objArr3;
            this.f16529D = size() + 1;
        }
    }

    /* renamed from: M */
    private final Object[] m22499M(Object[] objArr, Object[] objArr2, int i) {
        int m22458a = C5987l.m22458a(size() - 1, i);
        Object[] m22509C = m22509C(objArr);
        if (i == 5) {
            m22509C[m22458a] = objArr2;
        } else {
            m22509C[m22458a] = m22499M((Object[]) m22509C[m22458a], objArr2, i - 5);
        }
        return m22509C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private final int m22498N(InterfaceC6108l interfaceC6108l, Object[] objArr, int i, int i2, C5983d c5983d, List list, List list2) {
        Object[] m22507E;
        if (m22475y(objArr)) {
            list.add(objArr);
        }
        Object m22528a = c5983d.m22528a();
        Objects.requireNonNull(m22528a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) m22528a;
        Object[] objArr3 = objArr2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            Object obj = objArr[i3];
            if (((Boolean) interfaceC6108l.mo9587d(obj)).booleanValue()) {
                i3 = i4;
            } else {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        m22507E = (Object[]) list.remove(list.size() - 1);
                    } else {
                        m22507E = m22507E();
                    }
                    objArr3 = m22507E;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i3 = i4;
                i2++;
            }
        }
        c5983d.m22527b(objArr3);
        if (objArr2 != c5983d.m22528a()) {
            list2.add(objArr2);
        }
        return i2;
    }

    /* renamed from: O */
    private final int m22497O(InterfaceC6108l interfaceC6108l, Object[] objArr, int i, C5983d c5983d) {
        int i2 = 0;
        Object[] objArr2 = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) interfaceC6108l.mo9587d(obj)).booleanValue()) {
                if (z) {
                    i2 = i4;
                } else {
                    objArr2 = m22509C(objArr);
                    z = true;
                    i3 = i2;
                    i2 = i4;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArr2[i3] = obj;
                i3 = i2;
                i2 = i4;
            } else {
                i2 = i4;
            }
        }
        c5983d.m22527b(objArr2);
        return i3;
    }

    /* renamed from: P */
    private final boolean m22496P(InterfaceC6108l interfaceC6108l) {
        Object[] m22502J;
        int m22486Z = m22486Z();
        C5983d c5983d = new C5983d(null);
        if (this.f16527B == null) {
            return m22495Q(interfaceC6108l, m22486Z, c5983d) != m22486Z;
        }
        ListIterator m22510B = m22510B(0);
        int i = 32;
        while (i == 32 && m22510B.hasNext()) {
            i = m22497O(interfaceC6108l, (Object[]) m22510B.next(), 32, c5983d);
        }
        if (i == 32) {
            C6956a.m19707a(!m22510B.hasNext());
            int m22495Q = m22495Q(interfaceC6108l, m22486Z, c5983d);
            if (m22495Q == 0) {
                m22503I(this.f16527B, size(), this.f16533z);
            }
            return m22495Q != m22486Z;
        }
        int previousIndex = m22510B.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (m22510B.hasNext()) {
            i2 = m22498N(interfaceC6108l, (Object[]) m22510B.next(), 32, i2, c5983d, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int m22498N = m22498N(interfaceC6108l, this.f16528C, m22486Z, i2, c5983d, arrayList2, arrayList);
        Object m22528a = c5983d.m22528a();
        Objects.requireNonNull(m22528a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) m22528a;
        _ArraysJvm.m306r(objArr, null, m22498N, 32);
        if (arrayList.isEmpty()) {
            m22502J = this.f16527B;
            Intrinsics.ifNullDoSomething(m22502J);
        } else {
            m22502J = m22502J(this.f16527B, i3, this.f16533z, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.f16527B = m22491U(m22502J, size);
        this.f16528C = objArr;
        this.f16529D = size + m22498N;
        return true;
    }

    /* renamed from: Q */
    private final int m22495Q(InterfaceC6108l interfaceC6108l, int i, C5983d c5983d) {
        int m22497O = m22497O(interfaceC6108l, this.f16528C, i, c5983d);
        if (m22497O == i) {
            C6956a.m19707a(c5983d.m22528a() == this.f16528C);
            return i;
        }
        Object m22528a = c5983d.m22528a();
        Objects.requireNonNull(m22528a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) m22528a;
        _ArraysJvm.m306r(objArr, null, m22497O, i);
        this.f16528C = objArr;
        this.f16529D = size() - (i - m22497O);
        return m22497O;
    }

    /* renamed from: S */
    private final Object[] m22493S(Object[] objArr, int i, int i2, C5983d c5983d) {
        int m22458a = C5987l.m22458a(i2, i);
        if (i == 0) {
            Object obj = objArr[m22458a];
            Object[] m353i = C13768k.m353i(objArr, m22509C(objArr), m22458a, m22458a + 1, 32);
            m353i[31] = c5983d.m22528a();
            c5983d.m22527b(obj);
            return m353i;
        }
        int m22458a2 = objArr[31] == null ? C5987l.m22458a(m22490V() - 1, i) : 31;
        Object[] m22509C = m22509C(objArr);
        int i3 = i - 5;
        int i4 = m22458a + 1;
        if (i4 <= m22458a2) {
            while (true) {
                int i5 = m22458a2 - 1;
                Object obj2 = m22509C[m22458a2];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                m22509C[m22458a2] = m22493S((Object[]) obj2, i3, 0, c5983d);
                if (m22458a2 == i4) {
                    break;
                }
                m22458a2 = i5;
            }
        }
        Object obj3 = m22509C[m22458a];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m22509C[m22458a] = m22493S((Object[]) obj3, i3, i2, c5983d);
        return m22509C;
    }

    /* renamed from: T */
    private final Object m22492T(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        C6956a.m19707a(i3 < size);
        if (size == 1) {
            Object obj = this.f16528C[0];
            m22503I(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f16528C;
        Object obj2 = objArr2[i3];
        Object[] m353i = C13768k.m353i(objArr2, m22509C(objArr2), i3, i3 + 1, size);
        m353i[size - 1] = null;
        this.f16527B = objArr;
        this.f16528C = m353i;
        this.f16529D = (i + size) - 1;
        this.f16533z = i2;
        return obj2;
    }

    /* renamed from: U */
    private final Object[] m22491U(Object[] objArr, int i) {
        if (!((i & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i == 0) {
            this.f16533z = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.f16533z;
            if ((i2 >> i3) == 0) {
                this.f16533z = i3 - 5;
                Object[] objArr2 = objArr[0];
                Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            } else {
                return m22505G(objArr, i2, i3);
            }
        }
    }

    /* renamed from: V */
    private final int m22490V() {
        if (size() <= 32) {
            return 0;
        }
        return C5987l.m22455d(size());
    }

    /* renamed from: W */
    private final Object[] m22489W(Object[] objArr, int i, int i2, Object obj, C5983d c5983d) {
        int m22458a = C5987l.m22458a(i2, i);
        Object[] m22509C = m22509C(objArr);
        if (i == 0) {
            if (m22509C != objArr) {
                ((AbstractList) this).modCount++;
            }
            c5983d.m22527b(m22509C[m22458a]);
            m22509C[m22458a] = obj;
            return m22509C;
        }
        Object obj2 = m22509C[m22458a];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m22509C[m22458a] = m22489W((Object[]) obj2, i - 5, i2, obj, c5983d);
        return m22509C;
    }

    /* renamed from: X */
    private final Object[] m22488X(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f16527B != null) {
            ListIterator m22510B = m22510B(m22490V() >> 5);
            while (m22510B.previousIndex() != i) {
                Object[] objArr3 = (Object[]) m22510B.previous();
                C13768k.m353i(objArr3, objArr2, 0, 32 - i2, 32);
                objArr2 = m22508D(objArr3, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return (Object[]) m22510B.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: Y */
    private final void m22487Y(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m22507E;
        if (i3 >= 1) {
            Object[] m22509C = m22509C(objArr);
            objArr2[0] = m22509C;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C13768k.m353i(m22509C, objArr3, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    m22507E = m22509C;
                } else {
                    m22507E = m22507E();
                    i3--;
                    objArr2[i3] = m22507E;
                }
                int i7 = i2 - i6;
                C13768k.m353i(m22509C, objArr3, 0, i7, i2);
                C13768k.m353i(m22509C, m22507E, size + 1, i4, i7);
                objArr3 = m22507E;
            }
            Iterator<E> it = collection.iterator();
            m22483l(m22509C, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = m22483l(m22507E(), 0, it);
            }
            m22483l(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: Z */
    private final int m22486Z() {
        return m22485a0(size());
    }

    /* renamed from: a0 */
    private final int m22485a0(int i) {
        return i <= 32 ? i : i - C5987l.m22455d(i);
    }

    /* renamed from: h */
    private final Object[] m22484h(int i) {
        if (m22490V() <= i) {
            return this.f16528C;
        }
        Object[] objArr = this.f16527B;
        Intrinsics.ifNullDoSomething(objArr);
        for (int i2 = this.f16533z; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C5987l.m22458a(i, i2)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    /* renamed from: l */
    private final Object[] m22483l(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* renamed from: u */
    private final void m22478u(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f16527B != null) {
            int i4 = i >> 5;
            Object[] m22488X = m22488X(i4, i2, objArr, i3, objArr2);
            int m22490V = i3 - (((m22490V() >> 5) - 1) - i4);
            if (m22490V < i3) {
                objArr2 = objArr[m22490V];
                Intrinsics.ifNullDoSomething(objArr2);
            }
            m22487Y(collection, i, m22488X, 32, objArr, m22490V, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: v */
    private final Object[] m22477v(Object[] objArr, int i, int i2, Object obj, C5983d c5983d) {
        int m22458a = C5987l.m22458a(i2, i);
        if (i == 0) {
            c5983d.m22527b(objArr[31]);
            Object[] m353i = C13768k.m353i(objArr, m22509C(objArr), m22458a + 1, m22458a, 31);
            m353i[m22458a] = obj;
            return m353i;
        }
        Object[] m22509C = m22509C(objArr);
        int i3 = i - 5;
        Object obj2 = m22509C[m22458a];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m22509C[m22458a] = m22477v((Object[]) obj2, i3, i2, obj, c5983d);
        int i4 = m22458a + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            if (m22509C[i4] == null) {
                break;
            }
            Object obj3 = m22509C[i4];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m22509C[i4] = m22477v((Object[]) obj3, i3, 0, c5983d.m22528a(), c5983d);
            i4 = i5;
        }
        return m22509C;
    }

    /* renamed from: x */
    private final void m22476x(Object[] objArr, int i, Object obj) {
        int m22486Z = m22486Z();
        Object[] m22509C = m22509C(this.f16528C);
        if (m22486Z < 32) {
            C13768k.m353i(this.f16528C, m22509C, i + 1, i, m22486Z);
            m22509C[i] = obj;
            this.f16527B = objArr;
            this.f16528C = m22509C;
            this.f16529D = size() + 1;
            return;
        }
        Object[] objArr2 = this.f16528C;
        Object obj2 = objArr2[31];
        C13768k.m353i(objArr2, m22509C, i + 1, i, 31);
        m22509C[i] = obj;
        m22500L(objArr, m22509C, m22506F(obj2));
    }

    /* renamed from: y */
    private final boolean m22475y(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f16526A;
    }

    /* renamed from: R */
    public final boolean m22494R(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        boolean m22496P = m22496P(interfaceC6108l);
        if (m22496P) {
            ((AbstractList) this).modCount++;
        }
        return m22496P;
    }

    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int m22486Z = m22486Z();
        if (m22486Z < 32) {
            Object[] m22509C = m22509C(this.f16528C);
            m22509C[m22486Z] = obj;
            this.f16528C = m22509C;
            this.f16529D = size() + 1;
        } else {
            m22500L(this.f16527B, this.f16528C, m22506F(obj));
        }
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m22486Z = m22486Z();
        Iterator<E> it = collection.iterator();
        if (32 - m22486Z >= collection.size()) {
            this.f16528C = m22483l(m22509C(this.f16528C), m22486Z, it);
            this.f16529D = size() + collection.size();
        } else {
            int size = ((collection.size() + m22486Z) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = m22483l(m22509C(this.f16528C), m22486Z, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = m22483l(m22507E(), 0, it);
            }
            this.f16527B = m22501K(this.f16527B, m22490V(), objArr);
            this.f16528C = m22483l(m22507E(), 0, it);
            this.f16529D = size() + collection.size();
        }
        return true;
    }

    /* renamed from: b */
    public int mo415b() {
        return this.f16529D;
    }

    public InterfaceC5737e build() {
        InterfaceC5737e persistentVector;
        if (this.f16527B == this.f16531x && this.f16528C == this.f16532y) {
            persistentVector = this.f16530w;
        } else {
            this.f16526A = new C6960e();
            Object[] objArr = this.f16527B;
            this.f16531x = objArr;
            Object[] objArr2 = this.f16528C;
            this.f16532y = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = C5987l.m22457b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f16528C, size());
                    Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.f16527B;
                Intrinsics.ifNullDoSomething(objArr3);
                persistentVector = new PersistentVector(objArr3, this.f16528C, size(), this.f16533z);
            }
        }
        this.f16530w = persistentVector;
        return persistentVector;
    }

    /* renamed from: f */
    public Object mo414f(int i) {
        C6959d.m19703a(i, size());
        ((AbstractList) this).modCount++;
        int m22490V = m22490V();
        if (i >= m22490V) {
            return m22492T(this.f16527B, m22490V, this.f16533z, i - m22490V);
        }
        C5983d c5983d = new C5983d(this.f16528C[0]);
        Object[] objArr = this.f16527B;
        Intrinsics.ifNullDoSomething(objArr);
        m22492T(m22493S(objArr, this.f16533z, i, c5983d), m22490V, this.f16533z, 0);
        return c5983d.m22528a();
    }

    public Object get(int i) {
        C6959d.m19703a(i, size());
        return m22484h(i)[i & 31];
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public final int m22482o() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: p */
    public final Object[] m22481p() {
        return this.f16527B;
    }

    /* renamed from: q */
    public final int m22480q() {
        return this.f16533z;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m22494R(new C5984a(collection));
    }

    public Object set(int i, Object obj) {
        C6959d.m19703a(i, size());
        if (m22490V() <= i) {
            Object[] m22509C = m22509C(this.f16528C);
            if (m22509C != this.f16528C) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = m22509C[i2];
            m22509C[i2] = obj;
            this.f16528C = m22509C;
            return obj2;
        }
        C5983d c5983d = new C5983d(null);
        Object[] objArr = this.f16527B;
        Intrinsics.ifNullDoSomething(objArr);
        this.f16527B = m22489W(objArr, this.f16533z, i, obj, c5983d);
        return c5983d.m22528a();
    }

    /* renamed from: t */
    public final Object[] m22479t() {
        return this.f16528C;
    }

    public ListIterator listIterator(int i) {
        C6959d.m19702b(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    public void add(int i, Object obj) {
        C6959d.m19702b(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int m22490V = m22490V();
        if (i >= m22490V) {
            m22476x(this.f16527B, i - m22490V, obj);
            return;
        }
        C5983d c5983d = new C5983d(null);
        Object[] objArr = this.f16527B;
        Intrinsics.ifNullDoSomething(objArr);
        m22476x(m22477v(objArr, this.f16533z, i, obj, c5983d), 0, c5983d.m22528a());
    }

    public boolean addAll(int i, Collection collection) {
        Object[] m353i;
        Intrinsics.isThisObjectNull(collection, "elements");
        C6959d.m19702b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            C6956a.m19707a(i >= m22490V());
            int i3 = i & 31;
            Object[] objArr = this.f16528C;
            Object[] m353i2 = C13768k.m353i(objArr, m22509C(objArr), (((i + collection.size()) - 1) & 31) + 1, i3, m22486Z());
            m22483l(m353i2, i3, collection.iterator());
            this.f16528C = m353i2;
            this.f16529D = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m22486Z = m22486Z();
        int m22485a0 = m22485a0(size() + collection.size());
        if (i >= m22490V()) {
            m353i = m22507E();
            m22487Y(collection, i, this.f16528C, m22486Z, objArr2, size, m353i);
        } else if (m22485a0 > m22486Z) {
            int i4 = m22485a0 - m22486Z;
            m353i = m22508D(this.f16528C, i4);
            m22478u(collection, i, i4, objArr2, size, m353i);
        } else {
            int i5 = m22486Z - m22485a0;
            m353i = C13768k.m353i(this.f16528C, m22507E(), 0, i5, m22486Z);
            int i6 = 32 - i5;
            Object[] m22508D = m22508D(this.f16528C, i6);
            int i7 = size - 1;
            objArr2[i7] = m22508D;
            m22478u(collection, i, i6, objArr2, i7, m22508D);
        }
        this.f16527B = m22501K(this.f16527B, i2, objArr2);
        this.f16528C = m353i;
        this.f16529D = size() + collection.size();
        return true;
    }
}
