package p301q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: q.b */
/* loaded from: classes.dex */
public final class C9552b<E> implements Collection<E>, Set<E> {

    /* renamed from: A */
    private static int f25104A;

    /* renamed from: B */
    private static Object[] f25105B;

    /* renamed from: C */
    private static int f25106C;

    /* renamed from: D */
    private static final Object f25107D = new Object();

    /* renamed from: E */
    private static final Object f25108E = new Object();

    /* renamed from: z */
    private static Object[] f25109z;

    /* renamed from: w */
    private int[] f25110w;

    /* renamed from: x */
    Object[] f25111x;

    /* renamed from: y */
    int f25112y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ArraySet.java */
    /* renamed from: q.b$a */
    /* loaded from: classes.dex */
    public class C9553a extends AbstractC9555d<E> {
        C9553a() {
            super(C9552b.this.f25112y);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: a */
        protected E mo10651a(int i) {
            return (E) C9552b.this.m10658q(i);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: b */
        protected void mo10650b(int i) {
            C9552b.this.m10659p(i);
        }
    }

    public C9552b() {
        this(0);
    }

    /* renamed from: b */
    private void m10665b(int i) {
        if (i == 8) {
            synchronized (f25108E) {
                Object[] objArr = f25105B;
                if (objArr != null) {
                    try {
                        this.f25111x = objArr;
                        f25105B = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f25110w = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f25106C--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f25105B = null;
                    f25106C = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f25107D) {
                Object[] objArr2 = f25109z;
                if (objArr2 != null) {
                    try {
                        this.f25111x = objArr2;
                        f25109z = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f25110w = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f25104A--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f25109z = null;
                    f25104A = 0;
                }
            }
        }
        this.f25110w = new int[i];
        this.f25111x = new Object[i];
    }

    /* renamed from: f */
    private int m10664f(int i) {
        try {
            return C9554c.m10657a(this.f25110w, this.f25112y, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: h */
    private static void m10662h(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f25108E) {
                if (f25106C < 10) {
                    objArr[0] = f25105B;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f25105B = objArr;
                    f25106C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f25107D) {
                if (f25104A < 10) {
                    objArr[0] = f25109z;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f25109z = objArr;
                    f25104A++;
                }
            }
        }
    }

    /* renamed from: l */
    private int m10661l(Object obj, int i) {
        int i2 = this.f25112y;
        if (i2 == 0) {
            return -1;
        }
        int m10664f = m10664f(i);
        if (m10664f >= 0 && !obj.equals(this.f25111x[m10664f])) {
            int i3 = m10664f + 1;
            while (i3 < i2 && this.f25110w[i3] == i) {
                if (obj.equals(this.f25111x[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m10664f - 1; i4 >= 0 && this.f25110w[i4] == i; i4--) {
                if (obj.equals(this.f25111x[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m10664f;
    }

    /* renamed from: o */
    private int m10660o() {
        int i = this.f25112y;
        if (i == 0) {
            return -1;
        }
        int m10664f = m10664f(0);
        if (m10664f >= 0 && this.f25111x[m10664f] != null) {
            int i2 = m10664f + 1;
            while (i2 < i && this.f25110w[i2] == 0) {
                if (this.f25111x[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m10664f - 1; i3 >= 0 && this.f25110w[i3] == 0; i3--) {
                if (this.f25111x[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m10664f;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m10661l;
        int i2 = this.f25112y;
        if (e == null) {
            m10661l = m10660o();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m10661l = m10661l(e, hashCode);
        }
        if (m10661l >= 0) {
            return false;
        }
        int i3 = ~m10661l;
        int[] iArr = this.f25110w;
        if (i2 >= iArr.length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f25111x;
            m10665b(i4);
            if (i2 == this.f25112y) {
                int[] iArr2 = this.f25110w;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f25111x, 0, objArr.length);
                }
                m10662h(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f25110w;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f25111x;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f25112y;
        if (i2 == i7) {
            int[] iArr4 = this.f25110w;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f25111x[i3] = e;
                this.f25112y = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m10663g(this.f25112y + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f25112y;
        if (i != 0) {
            int[] iArr = this.f25110w;
            Object[] objArr = this.f25111x;
            this.f25110w = C9554c.f25114a;
            this.f25111x = C9554c.f25116c;
            this.f25112y = 0;
            m10662h(iArr, objArr, i);
        }
        if (this.f25112y != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f25112y; i++) {
                try {
                    if (!set.contains(m10658q(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m10663g(int i) {
        int i2 = this.f25112y;
        int[] iArr = this.f25110w;
        if (iArr.length < i) {
            Object[] objArr = this.f25111x;
            m10665b(i);
            int i3 = this.f25112y;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f25110w, 0, i3);
                System.arraycopy(objArr, 0, this.f25111x, 0, this.f25112y);
            }
            m10662h(iArr, objArr, this.f25112y);
        }
        if (this.f25112y != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f25110w;
        int i = this.f25112y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m10660o() : m10661l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f25112y <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new C9553a();
    }

    /* renamed from: p */
    public E m10659p(int i) {
        int i2 = this.f25112y;
        Object[] objArr = this.f25111x;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f25110w;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                m10665b(i2 > 8 ? i2 + (i2 >> 1) : 8);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f25110w, 0, i);
                    System.arraycopy(objArr, 0, this.f25111x, 0, i);
                }
                if (i < i3) {
                    int i4 = i + 1;
                    int i5 = i3 - i;
                    System.arraycopy(iArr, i4, this.f25110w, i, i5);
                    System.arraycopy(objArr, i4, this.f25111x, i, i5);
                }
            } else {
                if (i < i3) {
                    int i6 = i + 1;
                    int i7 = i3 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f25111x;
                    System.arraycopy(objArr2, i6, objArr2, i, i7);
                }
                this.f25111x[i3] = null;
            }
            if (i2 == this.f25112y) {
                this.f25112y = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    /* renamed from: q */
    public E m10658q(int i) {
        return (E) this.f25111x[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m10659p(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f25112y - 1; i >= 0; i--) {
            if (!collection.contains(this.f25111x[i])) {
                m10659p(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f25112y;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f25112y;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f25111x, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f25112y * 14);
        sb2.append('{');
        for (int i = 0; i < this.f25112y; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            E m10658q = m10658q(i);
            if (m10658q != this) {
                sb2.append(m10658q);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C9552b(int i) {
        if (i == 0) {
            this.f25110w = C9554c.f25114a;
            this.f25111x = C9554c.f25116c;
        } else {
            m10665b(i);
        }
        this.f25112y = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f25112y) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f25112y));
        }
        System.arraycopy(this.f25111x, 0, tArr, 0, this.f25112y);
        int length = tArr.length;
        int i = this.f25112y;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
