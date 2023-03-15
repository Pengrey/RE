package p301q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: q.g */
/* loaded from: classes.dex */
public class C9558g<K, V> {

    /* renamed from: A */
    static int f25133A;

    /* renamed from: B */
    static Object[] f25134B;

    /* renamed from: C */
    static int f25135C;

    /* renamed from: z */
    static Object[] f25136z;

    /* renamed from: w */
    int[] f25137w;

    /* renamed from: x */
    Object[] f25138x;

    /* renamed from: y */
    int f25139y;

    public C9558g() {
        this.f25137w = C9554c.f25114a;
        this.f25138x = C9554c.f25116c;
        this.f25139y = 0;
    }

    /* renamed from: b */
    private void m10622b(int i) {
        if (i == 8) {
            synchronized (C9558g.class) {
                Object[] objArr = f25134B;
                if (objArr != null) {
                    this.f25138x = objArr;
                    f25134B = (Object[]) objArr[0];
                    this.f25137w = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f25135C--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C9558g.class) {
                Object[] objArr2 = f25136z;
                if (objArr2 != null) {
                    this.f25138x = objArr2;
                    f25136z = (Object[]) objArr2[0];
                    this.f25137w = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f25133A--;
                    return;
                }
            }
        }
        this.f25137w = new int[i];
        this.f25138x = new Object[i << 1];
    }

    /* renamed from: d */
    private static int m10621d(int[] iArr, int i, int i2) {
        try {
            return C9554c.m10657a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: f */
    private static void m10619f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C9558g.class) {
                if (f25135C < 10) {
                    objArr[0] = f25134B;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f25134B = objArr;
                    f25135C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C9558g.class) {
                if (f25133A < 10) {
                    objArr[0] = f25136z;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f25136z = objArr;
                    f25133A++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f25139y;
        if (i > 0) {
            int[] iArr = this.f25137w;
            Object[] objArr = this.f25138x;
            this.f25137w = C9554c.f25114a;
            this.f25138x = C9554c.f25116c;
            this.f25139y = 0;
            m10619f(iArr, objArr, i);
        }
        if (this.f25139y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m10617j(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m10615l(obj) >= 0;
    }

    /* renamed from: e */
    public void m10620e(int i) {
        int i2 = this.f25139y;
        int[] iArr = this.f25137w;
        if (iArr.length < i) {
            Object[] objArr = this.f25138x;
            m10622b(i);
            if (this.f25139y > 0) {
                System.arraycopy(iArr, 0, this.f25137w, 0, i2);
                System.arraycopy(objArr, 0, this.f25138x, 0, i2 << 1);
            }
            m10619f(iArr, objArr, i2);
        }
        if (this.f25139y != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9558g) {
            C9558g c9558g = (C9558g) obj;
            if (size() != c9558g.size()) {
                return false;
            }
            for (int i = 0; i < this.f25139y; i++) {
                K m10614m = m10614m(i);
                V m10610q = m10610q(i);
                Object obj2 = c9558g.get(m10614m);
                if (m10610q == null) {
                    if (obj2 != null || !c9558g.containsKey(m10614m)) {
                        return false;
                    }
                } else if (!m10610q.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f25139y; i2++) {
                K m10614m2 = m10614m(i2);
                V m10610q2 = m10610q(i2);
                Object obj3 = map.get(m10614m2);
                if (m10610q2 == null) {
                    if (obj3 != null || !map.containsKey(m10614m2)) {
                        return false;
                    }
                } else if (!m10610q2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m10617j = m10617j(obj);
        return m10617j >= 0 ? (V) this.f25138x[(m10617j << 1) + 1] : v;
    }

    /* renamed from: h */
    int m10618h(Object obj, int i) {
        int i2 = this.f25139y;
        if (i2 == 0) {
            return -1;
        }
        int m10621d = m10621d(this.f25137w, i2, i);
        if (m10621d >= 0 && !obj.equals(this.f25138x[m10621d << 1])) {
            int i3 = m10621d + 1;
            while (i3 < i2 && this.f25137w[i3] == i) {
                if (obj.equals(this.f25138x[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m10621d - 1; i4 >= 0 && this.f25137w[i4] == i; i4--) {
                if (obj.equals(this.f25138x[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m10621d;
    }

    public int hashCode() {
        int[] iArr = this.f25137w;
        Object[] objArr = this.f25138x;
        int i = this.f25139y;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f25139y <= 0;
    }

    /* renamed from: j */
    public int m10617j(Object obj) {
        return obj == null ? m10616k() : m10618h(obj, obj.hashCode());
    }

    /* renamed from: k */
    int m10616k() {
        int i = this.f25139y;
        if (i == 0) {
            return -1;
        }
        int m10621d = m10621d(this.f25137w, i, 0);
        if (m10621d >= 0 && this.f25138x[m10621d << 1] != null) {
            int i2 = m10621d + 1;
            while (i2 < i && this.f25137w[i2] == 0) {
                if (this.f25138x[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m10621d - 1; i3 >= 0 && this.f25137w[i3] == 0; i3--) {
                if (this.f25138x[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m10621d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m10615l(Object obj) {
        int i = this.f25139y * 2;
        Object[] objArr = this.f25138x;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public K m10614m(int i) {
        return (K) this.f25138x[i << 1];
    }

    /* renamed from: n */
    public void m10613n(C9558g<? extends K, ? extends V> c9558g) {
        int i = c9558g.f25139y;
        m10620e(this.f25139y + i);
        if (this.f25139y != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c9558g.m10614m(i2), c9558g.m10610q(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c9558g.f25137w, 0, this.f25137w, 0, i);
            System.arraycopy(c9558g.f25138x, 0, this.f25138x, 0, i << 1);
            this.f25139y = i;
        }
    }

    /* renamed from: o */
    public V m10612o(int i) {
        Object[] objArr = this.f25138x;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f25139y;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f25137w;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                m10622b(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f25139y) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f25137w, 0, i);
                    System.arraycopy(objArr, 0, this.f25138x, 0, i2);
                }
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, this.f25137w, i, i6);
                    System.arraycopy(objArr, i5 << 1, this.f25138x, i2, i6 << 1);
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    int i8 = i4 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f25138x;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f25138x;
                int i9 = i4 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            }
            if (i3 == this.f25139y) {
                this.f25139y = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    /* renamed from: p */
    public V m10611p(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f25138x;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V put(K k, V v) {
        int i;
        int m10618h;
        int i2 = this.f25139y;
        if (k == null) {
            m10618h = m10616k();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m10618h = m10618h(k, hashCode);
        }
        if (m10618h >= 0) {
            int i3 = (m10618h << 1) + 1;
            Object[] objArr = this.f25138x;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m10618h;
        int[] iArr = this.f25137w;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f25138x;
            m10622b(i5);
            if (i2 == this.f25139y) {
                int[] iArr2 = this.f25137w;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f25138x, 0, objArr2.length);
                }
                m10619f(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f25137w;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f25138x;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f25139y - i4) << 1);
        }
        int i7 = this.f25139y;
        if (i2 == i7) {
            int[] iArr4 = this.f25137w;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f25138x;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f25139y = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    /* renamed from: q */
    public V m10610q(int i) {
        return (V) this.f25138x[(i << 1) + 1];
    }

    public V remove(Object obj) {
        int m10617j = m10617j(obj);
        if (m10617j >= 0) {
            return m10612o(m10617j);
        }
        return null;
    }

    public V replace(K k, V v) {
        int m10617j = m10617j(k);
        if (m10617j >= 0) {
            return m10611p(m10617j, v);
        }
        return null;
    }

    public int size() {
        return this.f25139y;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f25139y * 28);
        sb2.append('{');
        for (int i = 0; i < this.f25139y; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            K m10614m = m10614m(i);
            if (m10614m != this) {
                sb2.append(m10614m);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m10610q = m10610q(i);
            if (m10610q != this) {
                sb2.append(m10610q);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m10617j = m10617j(obj);
        if (m10617j >= 0) {
            V m10610q = m10610q(m10617j);
            if (obj2 == m10610q || (obj2 != null && obj2.equals(m10610q))) {
                m10612o(m10617j);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int m10617j = m10617j(k);
        if (m10617j >= 0) {
            V m10610q = m10610q(m10617j);
            if (m10610q == v || (v != null && v.equals(m10610q))) {
                m10611p(m10617j, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public C9558g(int i) {
        if (i == 0) {
            this.f25137w = C9554c.f25114a;
            this.f25138x = C9554c.f25116c;
        } else {
            m10622b(i);
        }
        this.f25139y = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9558g(C9558g<K, V> c9558g) {
        this();
        if (c9558g != 0) {
            m10613n(c9558g);
        }
    }
}
