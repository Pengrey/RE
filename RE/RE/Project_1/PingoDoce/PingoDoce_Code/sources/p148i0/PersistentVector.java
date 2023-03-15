package p148i0;

import id.InterfaceC6108l;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
import p126h0.InterfaceC5737e;
import p181jd.Intrinsics;
import p210l0.C6956a;
import p210l0.C6959d;
import p297pd._Ranges;
import p489zc.C13768k;

/* renamed from: i0.e */
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList {

    /* renamed from: A */
    private final int f16522A;

    /* renamed from: x */
    private final Object[] f16523x;

    /* renamed from: y */
    private final Object[] f16524y;

    /* renamed from: z */
    private final int f16525z;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        int m15000i;
        Intrinsics.isThisObjectNull(objArr, "root");
        Intrinsics.isThisObjectNull(objArr2, "tail");
        this.f16523x = objArr;
        this.f16524y = objArr2;
        this.f16525z = i;
        this.f16522A = i2;
        if (size() > 32) {
            int size = size() - C5987l.m22455d(size());
            m15000i = _Ranges.m15000i(objArr2.length, 32);
            C6956a.m19707a(size <= m15000i);
            return;
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("Trie-based persistent vector should have at least 33 elements, got ", Integer.valueOf(size())).toString());
    }

    /* renamed from: B */
    private final int m22526B() {
        return C5987l.m22455d(size());
    }

    /* renamed from: C */
    private final Object[] m22525C(Object[] objArr, int i, int i2, Object obj) {
        int m22458a = C5987l.m22458a(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[m22458a] = obj;
        } else {
            Object obj2 = copyOf[m22458a];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[m22458a] = m22525C((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    /* renamed from: h */
    private final Object[] m22523h(int i) {
        if (m22526B() <= i) {
            return this.f16524y;
        }
        Object[] objArr = this.f16523x;
        for (int i2 = this.f16522A; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C5987l.m22458a(i, i2)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    /* renamed from: o */
    private final Object[] m22520o(Object[] objArr, int i, int i2, Object obj, C5983d c5983d) {
        Object[] copyOf;
        int m22458a = C5987l.m22458a(i2, i);
        if (i == 0) {
            if (m22458a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            }
            C13768k.m353i(objArr, copyOf, m22458a + 1, m22458a, 31);
            c5983d.m22527b(objArr[31]);
            copyOf[m22458a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkIfNull(copyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        Object obj2 = objArr[m22458a];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[m22458a] = m22520o((Object[]) obj2, i3, i2, obj, c5983d);
        int i4 = m22458a + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            if (copyOf2[i4] == null) {
                break;
            }
            Object obj3 = objArr[i4];
            Objects.requireNonNull(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i4] = m22520o((Object[]) obj3, i3, 0, c5983d.m22528a(), c5983d);
            i4 = i5;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    /* renamed from: p */
    private final PersistentVector m22519p(Object[] objArr, int i, Object obj) {
        int size = size() - m22526B();
        Object[] copyOf = Arrays.copyOf(this.f16524y, 32);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C13768k.m353i(this.f16524y, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new PersistentVector(objArr, copyOf, size() + 1, this.f16522A);
        }
        Object[] objArr2 = this.f16524y;
        Object obj2 = objArr2[31];
        C13768k.m353i(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return m22516u(objArr, copyOf, C5987l.m22456c(obj2));
    }

    /* renamed from: q */
    private final Object[] m22518q(Object[] objArr, int i, int i2, C5983d c5983d) {
        Object[] m22518q;
        int m22458a = C5987l.m22458a(i2, i);
        if (i == 5) {
            c5983d.m22527b(objArr[m22458a]);
            m22518q = null;
        } else {
            Object obj = objArr[m22458a];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m22518q = m22518q((Object[]) obj, i - 5, i2, c5983d);
        }
        if (m22518q == null && m22458a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        copyOf[m22458a] = m22518q;
        return copyOf;
    }

    /* renamed from: t */
    private final InterfaceC5737e m22517t(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkIfNull(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        C5983d c5983d = new C5983d(null);
        Object[] m22518q = m22518q(objArr, i2, i - 1, c5983d);
        Intrinsics.ifNullDoSomething(m22518q);
        Object m22528a = c5983d.m22528a();
        Objects.requireNonNull(m22528a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) m22528a;
        if (m22518q[1] == null) {
            Object obj = m22518q[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new PersistentVector((Object[]) obj, objArr2, i, i2 - 5);
        }
        return new PersistentVector(m22518q, objArr2, i, i2);
    }

    /* renamed from: u */
    private final PersistentVector m22516u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f16522A;
        if (size > (1 << i)) {
            Object[] m22456c = C5987l.m22456c(objArr);
            int i2 = this.f16522A + 5;
            return new PersistentVector(m22515v(m22456c, i2, objArr2), objArr3, size() + 1, i2);
        }
        return new PersistentVector(m22515v(objArr, i, objArr2), objArr3, size() + 1, this.f16522A);
    }

    /* renamed from: v */
    private final Object[] m22515v(Object[] objArr, int i, Object[] objArr2) {
        Object[] copyOf;
        int m22458a = C5987l.m22458a(size() - 1, i);
        if (objArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        }
        if (copyOf == null) {
            copyOf = new Object[32];
        }
        if (i == 5) {
            copyOf[m22458a] = objArr2;
        } else {
            copyOf[m22458a] = m22515v((Object[]) copyOf[m22458a], i - 5, objArr2);
        }
        return copyOf;
    }

    /* renamed from: x */
    private final Object[] m22513x(Object[] objArr, int i, int i2, C5983d c5983d) {
        Object[] copyOf;
        int m22458a = C5987l.m22458a(i2, i);
        if (i == 0) {
            if (m22458a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            }
            C13768k.m353i(objArr, copyOf, m22458a, m22458a + 1, 32);
            copyOf[31] = c5983d.m22528a();
            c5983d.m22527b(objArr[m22458a]);
            return copyOf;
        }
        int m22458a2 = objArr[31] == null ? C5987l.m22458a(m22526B() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkIfNull(copyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        int i4 = m22458a + 1;
        if (i4 <= m22458a2) {
            while (true) {
                int i5 = m22458a2 - 1;
                Object obj = copyOf2[m22458a2];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[m22458a2] = m22513x((Object[]) obj, i3, 0, c5983d);
                if (m22458a2 == i4) {
                    break;
                }
                m22458a2 = i5;
            }
        }
        Object obj2 = copyOf2[m22458a];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[m22458a] = m22513x((Object[]) obj2, i3, i2, c5983d);
        return copyOf2;
    }

    /* renamed from: y */
    private final InterfaceC5737e m22512y(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        C6956a.m19707a(i3 < size);
        if (size == 1) {
            return m22517t(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.f16524y, 32);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (i3 < i4) {
            C13768k.m353i(this.f16524y, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new PersistentVector(objArr, copyOf, (i + size) - 1, i2);
    }

    public InterfaceC5737e add(Object obj) {
        int size = size() - m22526B();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f16524y, 32);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            copyOf[size] = obj;
            return new PersistentVector(this.f16523x, copyOf, size() + 1, this.f16522A);
        }
        return m22516u(this.f16523x, this.f16524y, C5987l.m22456c(obj));
    }

    /* renamed from: b */
    public int m22524b() {
        return this.f16525z;
    }

    public Object get(int i) {
        C6959d.m19703a(i, size());
        return m22523h(i)[i & 31];
    }

    /* renamed from: l */
    public PersistentVectorBuilder m22522i() {
        return new PersistentVectorBuilder(this, this.f16523x, this.f16524y, this.f16522A);
    }

    public ListIterator listIterator(int i) {
        C6959d.m19702b(i, size());
        return new PersistentVectorIterator(this.f16523x, this.f16524y, i, size(), (this.f16522A / 5) + 1);
    }

    public InterfaceC5737e set(int i, Object obj) {
        C6959d.m19703a(i, size());
        if (m22526B() <= i) {
            Object[] copyOf = Arrays.copyOf(this.f16524y, 32);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            copyOf[i & 31] = obj;
            return new PersistentVector(this.f16523x, copyOf, size(), this.f16522A);
        }
        return new PersistentVector(m22525C(this.f16523x, this.f16522A, i, obj), this.f16524y, size(), this.f16522A);
    }

    /* renamed from: w */
    public InterfaceC5737e m22514w(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        PersistentVectorBuilder m22522i = m22522i();
        m22522i.m22494R(interfaceC6108l);
        return m22522i.build();
    }

    /* renamed from: z */
    public InterfaceC5737e m22511z(int i) {
        C6959d.m19703a(i, size());
        int m22526B = m22526B();
        if (i >= m22526B) {
            return m22512y(this.f16523x, m22526B, this.f16522A, i - m22526B);
        }
        return m22512y(m22513x(this.f16523x, this.f16522A, i, new C5983d(this.f16524y[0])), m22526B, this.f16522A, 0);
    }

    public InterfaceC5737e add(int i, Object obj) {
        C6959d.m19702b(i, size());
        if (i == size()) {
            return add(obj);
        }
        int m22526B = m22526B();
        if (i >= m22526B) {
            return m22519p(this.f16523x, i - m22526B, obj);
        }
        C5983d c5983d = new C5983d(null);
        return m22519p(m22520o(this.f16523x, this.f16522A, i, obj, c5983d), 0, c5983d.m22528a());
    }
}
