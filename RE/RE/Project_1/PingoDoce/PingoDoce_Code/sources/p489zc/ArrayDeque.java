package p489zc;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: zc.j */
/* loaded from: classes2.dex */
public final class ArrayDeque<E> extends AbstractC13758e {

    /* renamed from: w */
    private int f34885w;

    /* renamed from: x */
    private Object[] f34886x = f34889A;

    /* renamed from: y */
    private int f34887y;

    /* renamed from: z */
    public static final C13767a f34888z = new C13767a(null);

    /* renamed from: A */
    private static final Object[] f34889A = new Object[0];

    /* compiled from: ArrayDeque.kt */
    /* renamed from: zc.j$a */
    /* loaded from: classes2.dex */
    public static final class C13767a {
        private C13767a() {
        }

        public /* synthetic */ C13767a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m376a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 > 0) {
                if (i2 > 2147483639) {
                    return Reader.READ_DONE;
                }
                return 2147483639;
            }
            return i3;
        }
    }

    /* renamed from: o */
    private final void m384o(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f34886x.length;
        while (i < length && it.hasNext()) {
            this.f34886x[i] = it.next();
            i++;
        }
        int i2 = this.f34885w;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f34886x[i3] = it.next();
        }
        this.f34887y = size() + collection.size();
    }

    /* renamed from: p */
    private final void m383p(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f34886x;
        C13768k.m353i(objArr2, objArr, 0, this.f34885w, objArr2.length);
        Object[] objArr3 = this.f34886x;
        int length = objArr3.length;
        int i2 = this.f34885w;
        C13768k.m353i(objArr3, objArr, length - i2, 0, i2);
        this.f34885w = 0;
        this.f34886x = objArr;
    }

    /* renamed from: q */
    private final int m382q(int i) {
        int m289E;
        if (i == 0) {
            m289E = _Arrays.m289E(this.f34886x);
            return m289E;
        }
        return i - 1;
    }

    /* renamed from: t */
    private final void m381t(int i) {
        int m15005d;
        if (i >= 0) {
            Object[] objArr = this.f34886x;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f34889A) {
                m15005d = _Ranges.m15005d(i, 10);
                this.f34886x = new Object[m15005d];
                return;
            }
            m383p(f34888z.m376a(objArr.length, i));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: u */
    private final int m380u(int i) {
        int m289E;
        m289E = _Arrays.m289E(this.f34886x);
        if (i == m289E) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: v */
    private final int m379v(int i) {
        return i < 0 ? i + this.f34886x.length : i;
    }

    /* renamed from: x */
    private final int m378x(int i) {
        Object[] objArr = this.f34886x;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: B */
    public final Object m390B() {
        if (isEmpty()) {
            return null;
        }
        return m377y();
    }

    /* renamed from: C */
    public final Object m389C() {
        int m195i;
        if (!isEmpty()) {
            int i = this.f34885w;
            m195i = C13780s.m195i(this);
            int m378x = m378x(i + m195i);
            Object[] objArr = this.f34886x;
            Object obj = objArr[m378x];
            objArr[m378x] = null;
            this.f34887y = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean add(Object obj) {
        m385l(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m381t(size() + collection.size());
        m384o(m378x(this.f34885w + size()), collection);
        return true;
    }

    /* renamed from: b */
    public int mo415b() {
        return this.f34887y;
    }

    public void clear() {
        int m378x = m378x(this.f34885w + size());
        int i = this.f34885w;
        if (i < m378x) {
            _ArraysJvm.m306r(this.f34886x, null, i, m378x);
        } else if (!isEmpty()) {
            Object[] objArr = this.f34886x;
            _ArraysJvm.m306r(objArr, null, this.f34885w, objArr.length);
            _ArraysJvm.m306r(this.f34886x, null, 0, m378x);
        }
        this.f34885w = 0;
        this.f34887y = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: f */
    public Object mo414f(int i) {
        int m195i;
        int m195i2;
        AbstractList.f34868w.m447b(i, size());
        m195i = C13780s.m195i(this);
        if (i == m195i) {
            return m389C();
        }
        if (i == 0) {
            return m377y();
        }
        int m378x = m378x(this.f34885w + i);
        Object obj = this.f34886x[m378x];
        if (i < (size() >> 1)) {
            int i2 = this.f34885w;
            if (m378x >= i2) {
                Object[] objArr = this.f34886x;
                C13768k.m353i(objArr, objArr, i2 + 1, i2, m378x);
            } else {
                Object[] objArr2 = this.f34886x;
                C13768k.m353i(objArr2, objArr2, 1, 0, m378x);
                Object[] objArr3 = this.f34886x;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f34885w;
                C13768k.m353i(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f34886x;
            int i4 = this.f34885w;
            objArr4[i4] = null;
            this.f34885w = m380u(i4);
        } else {
            int i5 = this.f34885w;
            m195i2 = C13780s.m195i(this);
            int m378x2 = m378x(i5 + m195i2);
            if (m378x <= m378x2) {
                Object[] objArr5 = this.f34886x;
                C13768k.m353i(objArr5, objArr5, m378x, m378x + 1, m378x2 + 1);
            } else {
                Object[] objArr6 = this.f34886x;
                C13768k.m353i(objArr6, objArr6, m378x, m378x + 1, objArr6.length);
                Object[] objArr7 = this.f34886x;
                objArr7[objArr7.length - 1] = objArr7[0];
                C13768k.m353i(objArr7, objArr7, 0, 1, m378x2 + 1);
            }
            this.f34886x[m378x2] = null;
        }
        this.f34887y = size() - 1;
        return obj;
    }

    public Object get(int i) {
        AbstractList.f34868w.m447b(i, size());
        return this.f34886x[m378x(this.f34885w + i)];
    }

    /* renamed from: h */
    public final void m386h(Object obj) {
        m381t(size() + 1);
        int m382q = m382q(this.f34885w);
        this.f34885w = m382q;
        this.f34886x[m382q] = obj;
        this.f34887y = size() + 1;
    }

    public int indexOf(Object obj) {
        int i;
        int m378x = m378x(this.f34885w + size());
        int i2 = this.f34885w;
        if (i2 < m378x) {
            while (i2 < m378x) {
                if (Intrinsics.equals(obj, this.f34886x[i2])) {
                    i = this.f34885w;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < m378x) {
            return -1;
        } else {
            int length = this.f34886x.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < m378x; i3++) {
                        if (Intrinsics.equals(obj, this.f34886x[i3])) {
                            i2 = i3 + this.f34886x.length;
                            i = this.f34885w;
                        }
                    }
                    return -1;
                } else if (Intrinsics.equals(obj, this.f34886x[i2])) {
                    i = this.f34885w;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: l */
    public final void m385l(Object obj) {
        m381t(size() + 1);
        this.f34886x[m378x(this.f34885w + size())] = obj;
        this.f34887y = size() + 1;
    }

    public int lastIndexOf(Object obj) {
        int m289E;
        int i;
        int m378x = m378x(this.f34885w + size());
        int i2 = this.f34885w;
        if (i2 < m378x) {
            m289E = m378x - 1;
            if (i2 <= m289E) {
                while (!Intrinsics.equals(obj, this.f34886x[m289E])) {
                    if (m289E != i2) {
                        m289E--;
                    }
                }
                i = this.f34885w;
                return m289E - i;
            }
            return -1;
        }
        if (i2 > m378x) {
            int i3 = m378x - 1;
            while (true) {
                if (-1 < i3) {
                    if (Intrinsics.equals(obj, this.f34886x[i3])) {
                        m289E = i3 + this.f34886x.length;
                        i = this.f34885w;
                        break;
                    }
                    i3--;
                } else {
                    m289E = _Arrays.m289E(this.f34886x);
                    int i4 = this.f34885w;
                    if (i4 <= m289E) {
                        while (!Intrinsics.equals(obj, this.f34886x[m289E])) {
                            if (m289E != i4) {
                                m289E--;
                            }
                        }
                        i = this.f34885w;
                    }
                }
            }
        }
        return -1;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int m378x;
        Intrinsics.isThisObjectNull(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f34886x.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int m378x2 = m378x(this.f34885w + size());
                int i = this.f34885w;
                if (i < m378x2) {
                    m378x = i;
                    while (i < m378x2) {
                        Object obj = this.f34886x[i];
                        if (!collection.contains(obj)) {
                            this.f34886x[m378x] = obj;
                            m378x++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    _ArraysJvm.m306r(this.f34886x, null, m378x, m378x2);
                } else {
                    int length = this.f34886x.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f34886x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.f34886x[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m378x = m378x(i2);
                    for (int i3 = 0; i3 < m378x2; i3++) {
                        Object[] objArr2 = this.f34886x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.f34886x[m378x] = obj3;
                            m378x = m380u(m378x);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f34887y = m379v(m378x - this.f34885w);
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        int m378x;
        Intrinsics.isThisObjectNull(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if ((this.f34886x.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int m378x2 = m378x(this.f34885w + size());
                int i = this.f34885w;
                if (i < m378x2) {
                    m378x = i;
                    while (i < m378x2) {
                        Object obj = this.f34886x[i];
                        if (collection.contains(obj)) {
                            this.f34886x[m378x] = obj;
                            m378x++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    _ArraysJvm.m306r(this.f34886x, null, m378x, m378x2);
                } else {
                    int length = this.f34886x.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f34886x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.f34886x[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m378x = m378x(i2);
                    for (int i3 = 0; i3 < m378x2; i3++) {
                        Object[] objArr2 = this.f34886x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f34886x[m378x] = obj3;
                            m378x = m380u(m378x);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f34887y = m379v(m378x - this.f34885w);
                }
            }
        }
        return z;
    }

    public Object set(int i, Object obj) {
        AbstractList.f34868w.m447b(i, size());
        int m378x = m378x(this.f34885w + i);
        Object[] objArr = this.f34886x;
        Object obj2 = objArr[m378x];
        objArr[m378x] = obj;
        return obj2;
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        if (objArr.length < size()) {
            objArr = ArraysJVM.m336a(objArr, size());
        }
        Intrinsics.m20929f(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int m378x = m378x(this.f34885w + size());
        int i = this.f34885w;
        if (i < m378x) {
            _ArraysJvm.m311m(this.f34886x, objArr, 0, i, m378x, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f34886x;
            C13768k.m353i(objArr2, objArr, 0, this.f34885w, objArr2.length);
            Object[] objArr3 = this.f34886x;
            C13768k.m353i(objArr3, objArr, objArr3.length - this.f34885w, 0, m378x);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    /* renamed from: y */
    public final Object m377y() {
        if (!isEmpty()) {
            Object[] objArr = this.f34886x;
            int i = this.f34885w;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f34885w = m380u(i);
            this.f34887y = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void add(int i, Object obj) {
        AbstractList.f34868w.m446c(i, size());
        if (i == size()) {
            m385l(obj);
        } else if (i == 0) {
            m386h(obj);
        } else {
            m381t(size() + 1);
            int m378x = m378x(this.f34885w + i);
            if (i < ((size() + 1) >> 1)) {
                int m382q = m382q(m378x);
                int m382q2 = m382q(this.f34885w);
                int i2 = this.f34885w;
                if (m382q >= i2) {
                    Object[] objArr = this.f34886x;
                    objArr[m382q2] = objArr[i2];
                    C13768k.m353i(objArr, objArr, i2, i2 + 1, m382q + 1);
                } else {
                    Object[] objArr2 = this.f34886x;
                    C13768k.m353i(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f34886x;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C13768k.m353i(objArr3, objArr3, 0, 1, m382q + 1);
                }
                this.f34886x[m382q] = obj;
                this.f34885w = m382q2;
            } else {
                int m378x2 = m378x(this.f34885w + size());
                if (m378x < m378x2) {
                    Object[] objArr4 = this.f34886x;
                    C13768k.m353i(objArr4, objArr4, m378x + 1, m378x, m378x2);
                } else {
                    Object[] objArr5 = this.f34886x;
                    C13768k.m353i(objArr5, objArr5, 1, 0, m378x2);
                    Object[] objArr6 = this.f34886x;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C13768k.m353i(objArr6, objArr6, m378x + 1, m378x, objArr6.length - 1);
                }
                this.f34886x[m378x] = obj;
            }
            this.f34887y = size() + 1;
        }
    }

    public boolean addAll(int i, Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        AbstractList.f34868w.m446c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m381t(size() + collection.size());
        int m378x = m378x(this.f34885w + size());
        int m378x2 = m378x(this.f34885w + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f34885w;
            int i3 = i2 - size;
            if (m378x2 < i2) {
                Object[] objArr = this.f34886x;
                C13768k.m353i(objArr, objArr, i3, i2, objArr.length);
                if (size >= m378x2) {
                    Object[] objArr2 = this.f34886x;
                    C13768k.m353i(objArr2, objArr2, objArr2.length - size, 0, m378x2);
                } else {
                    Object[] objArr3 = this.f34886x;
                    C13768k.m353i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f34886x;
                    C13768k.m353i(objArr4, objArr4, 0, size, m378x2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f34886x;
                C13768k.m353i(objArr5, objArr5, i3, i2, m378x2);
            } else {
                Object[] objArr6 = this.f34886x;
                i3 += objArr6.length;
                int i4 = m378x2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C13768k.m353i(objArr6, objArr6, i3, i2, m378x2);
                } else {
                    C13768k.m353i(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f34886x;
                    C13768k.m353i(objArr7, objArr7, 0, this.f34885w + length, m378x2);
                }
            }
            this.f34885w = i3;
            m384o(m379v(m378x2 - size), collection);
        } else {
            int i5 = m378x2 + size;
            if (m378x2 < m378x) {
                int i6 = size + m378x;
                Object[] objArr8 = this.f34886x;
                if (i6 <= objArr8.length) {
                    C13768k.m353i(objArr8, objArr8, i5, m378x2, m378x);
                } else if (i5 >= objArr8.length) {
                    C13768k.m353i(objArr8, objArr8, i5 - objArr8.length, m378x2, m378x);
                } else {
                    int length2 = m378x - (i6 - objArr8.length);
                    C13768k.m353i(objArr8, objArr8, 0, length2, m378x);
                    Object[] objArr9 = this.f34886x;
                    C13768k.m353i(objArr9, objArr9, i5, m378x2, length2);
                }
            } else {
                Object[] objArr10 = this.f34886x;
                C13768k.m353i(objArr10, objArr10, size, 0, m378x);
                Object[] objArr11 = this.f34886x;
                if (i5 >= objArr11.length) {
                    C13768k.m353i(objArr11, objArr11, i5 - objArr11.length, m378x2, objArr11.length);
                } else {
                    C13768k.m353i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f34886x;
                    C13768k.m353i(objArr12, objArr12, i5, m378x2, objArr12.length - size);
                }
            }
            m384o(m378x2, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
