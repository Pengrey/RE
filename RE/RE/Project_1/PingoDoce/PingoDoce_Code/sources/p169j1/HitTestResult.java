package p169j1;

import id.InterfaceC6097a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p489zc.C13768k;
import p489zc.C13780s;
import p489zc._ArraysJvm;

/* renamed from: j1.f */
/* loaded from: classes.dex */
public final class HitTestResult<T> implements List, InterfaceC6650a {

    /* renamed from: w */
    private Object[] f17127w = new Object[16];

    /* renamed from: x */
    private long[] f17128x = new long[16];

    /* renamed from: y */
    private int f17129y = -1;

    /* renamed from: z */
    private int f17130z;

    /* compiled from: HitTestResult.kt */
    /* renamed from: j1.f$b */
    /* loaded from: classes.dex */
    private final class C6252b implements List, InterfaceC6650a {

        /* renamed from: w */
        private final int f17135w;

        /* renamed from: x */
        private final int f17136x;

        /* renamed from: y */
        final /* synthetic */ HitTestResult f17137y;

        public C6252b(HitTestResult hitTestResult, int i, int i2) {
            Intrinsics.isThisObjectNull(hitTestResult, "this$0");
            this.f17137y = hitTestResult;
            this.f17135w = i;
            this.f17136x = i2;
        }

        public void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public int m21653b() {
            return this.f17136x - this.f17135w;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        public boolean containsAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public Object get(int i) {
            return HitTestResult.m21663h(this.f17137y)[i + this.f17135w];
        }

        public int indexOf(Object obj) {
            int i = this.f17135w;
            int i2 = this.f17136x;
            if (i > i2) {
                return -1;
            }
            while (true) {
                int i3 = i + 1;
                if (Intrinsics.equals(HitTestResult.m21663h(this.f17137y)[i], obj)) {
                    return i - this.f17135w;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Iterator iterator() {
            HitTestResult hitTestResult = this.f17137y;
            int i = this.f17135w;
            return new C6251a(hitTestResult, i, i, this.f17136x);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f17136x;
            int i2 = this.f17135w;
            if (i2 > i) {
                return -1;
            }
            while (true) {
                int i3 = i - 1;
                if (Intrinsics.equals(HitTestResult.m21663h(this.f17137y)[i], obj)) {
                    return i - this.f17135w;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        public ListIterator listIterator() {
            HitTestResult hitTestResult = this.f17137y;
            int i = this.f17135w;
            return new C6251a(hitTestResult, i, i, this.f17136x);
        }

        public Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return m21653b();
        }

        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List subList(int i, int i2) {
            HitTestResult hitTestResult = this.f17137y;
            int i3 = this.f17135w;
            return new C6252b(hitTestResult, i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return CollectionToArray.m20939a(this);
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.isThisObjectNull(objArr, "array");
            return CollectionToArray.m20938b(this, objArr);
        }

        public ListIterator listIterator(int i) {
            HitTestResult hitTestResult = this.f17137y;
            int i2 = this.f17135w;
            return new C6251a(hitTestResult, i + i2, i2, this.f17136x);
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ int m21664f(HitTestResult hitTestResult) {
        return hitTestResult.f17129y;
    }

    /* renamed from: h */
    public static final /* synthetic */ Object[] m21663h(HitTestResult hitTestResult) {
        return hitTestResult.f17127w;
    }

    /* renamed from: l */
    public static final /* synthetic */ void m21662l(HitTestResult hitTestResult, int i) {
        hitTestResult.f17129y = i;
    }

    /* renamed from: o */
    private final void m21661o() {
        int i = this.f17129y;
        Object[] objArr = this.f17127w;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            this.f17127w = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f17128x, length);
            Intrinsics.checkIfNull(copyOf2, "copyOf(this, newSize)");
            this.f17128x = copyOf2;
        }
    }

    /* renamed from: p */
    private final long m21660p() {
        long m21640a;
        int m195i;
        m21640a = C6256g.m21640a(Float.POSITIVE_INFINITY, false);
        int i = this.f17129y + 1;
        m195i = C13780s.m195i(this);
        if (i <= m195i) {
            while (true) {
                int i2 = i + 1;
                long m21711b = C6242d.m21711b(this.f17128x[i]);
                if (C6242d.m21712a(m21711b, m21640a) < 0) {
                    m21640a = m21711b;
                }
                if (C6242d.m21710c(m21640a) < 0.0f && C6242d.m21709d(m21640a)) {
                    return m21640a;
                }
                if (i == m195i) {
                    break;
                }
                i = i2;
            }
        }
        return m21640a;
    }

    /* renamed from: y */
    private final void m21654y() {
        int m195i;
        int i = this.f17129y + 1;
        m195i = C13780s.m195i(this);
        if (i <= m195i) {
            while (true) {
                int i2 = i + 1;
                this.f17127w[i] = null;
                if (i == m195i) {
                    break;
                }
                i = i2;
            }
        }
        this.f17130z = this.f17129y + 1;
    }

    /* renamed from: B */
    public final void m21666B(Object obj, float f, boolean z, InterfaceC6097a interfaceC6097a) {
        int m195i;
        int m195i2;
        int m195i3;
        int m195i4;
        Intrinsics.isThisObjectNull(interfaceC6097a, "childHitTest");
        int i = this.f17129y;
        m195i = C13780s.m195i(this);
        if (i == m195i) {
            m21656v(obj, f, z, interfaceC6097a);
            int i2 = this.f17129y + 1;
            m195i4 = C13780s.m195i(this);
            if (i2 == m195i4) {
                m21654y();
                return;
            }
            return;
        }
        long m21660p = m21660p();
        int i3 = this.f17129y;
        m195i2 = C13780s.m195i(this);
        this.f17129y = m195i2;
        m21656v(obj, f, z, interfaceC6097a);
        int i4 = this.f17129y + 1;
        m195i3 = C13780s.m195i(this);
        if (i4 < m195i3 && C6242d.m21712a(m21660p, m21660p()) > 0) {
            int i5 = this.f17129y + 1;
            int i6 = i3 + 1;
            Object[] objArr = this.f17127w;
            C13768k.m353i(objArr, objArr, i6, i5, size());
            long[] jArr = this.f17128x;
            _ArraysJvm.m316h(jArr, jArr, i6, i5, size());
            this.f17129y = ((size() + i3) - this.f17129y) - 1;
        }
        m21654y();
        this.f17129y = i3;
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final void m21665b() {
        this.f17129y = size() - 1;
    }

    public final void clear() {
        this.f17129y = -1;
        m21654y();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        return this.f17127w[i];
    }

    public int indexOf(Object obj) {
        int m195i;
        m195i = C13780s.m195i(this);
        if (m195i < 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.equals(this.f17127w[i], obj)) {
                return i;
            }
            if (i == m195i) {
                return -1;
            }
            i = i2;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new C6251a(0, 0, 0, 7, null);
    }

    public int lastIndexOf(Object obj) {
        int m195i;
        m195i = C13780s.m195i(this);
        if (m195i < 0) {
            return -1;
        }
        while (true) {
            int i = m195i - 1;
            if (Intrinsics.equals(this.f17127w[m195i], obj)) {
                return m195i;
            }
            if (i < 0) {
                return -1;
            }
            m195i = i;
        }
    }

    public ListIterator listIterator() {
        return new C6251a(0, 0, 0, 7, null);
    }

    /* renamed from: q */
    public int m21659q() {
        return this.f17130z;
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m21659q();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new C6252b(this, i, i2);
    }

    /* renamed from: t */
    public final boolean m21658t() {
        long m21660p = m21660p();
        return C6242d.m21710c(m21660p) < 0.0f && C6242d.m21709d(m21660p);
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    /* renamed from: u */
    public final void m21657u(Object obj, boolean z, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "childHitTest");
        m21656v(obj, -1.0f, z, interfaceC6097a);
    }

    /* renamed from: v */
    public final void m21656v(Object obj, float f, boolean z, InterfaceC6097a interfaceC6097a) {
        long m21640a;
        Intrinsics.isThisObjectNull(interfaceC6097a, "childHitTest");
        int i = this.f17129y;
        this.f17129y = i + 1;
        m21661o();
        Object[] objArr = this.f17127w;
        int i2 = this.f17129y;
        objArr[i2] = obj;
        long[] jArr = this.f17128x;
        m21640a = C6256g.m21640a(f, z);
        jArr[i2] = m21640a;
        m21654y();
        interfaceC6097a.mo42214q();
        this.f17129y = i;
    }

    /* renamed from: x */
    public final boolean m21655x(float f, boolean z) {
        int m195i;
        long m21640a;
        int i = this.f17129y;
        m195i = C13780s.m195i(this);
        if (i == m195i) {
            return true;
        }
        m21640a = C6256g.m21640a(f, z);
        return C6242d.m21712a(m21660p(), m21640a) > 0;
    }

    public ListIterator listIterator(int i) {
        return new C6251a(i, 0, 0, 6, null);
    }

    /* compiled from: HitTestResult.kt */
    /* renamed from: j1.f$a */
    /* loaded from: classes.dex */
    private final class C6251a implements ListIterator, InterfaceC6650a {

        /* renamed from: w */
        private int f17131w;

        /* renamed from: x */
        private final int f17132x;

        /* renamed from: y */
        private final int f17133y;

        public C6251a(HitTestResult hitTestResult, int i, int i2, int i3) {
            Intrinsics.isThisObjectNull(hitTestResult, "this$0");
            HitTestResult.this = hitTestResult;
            this.f17131w = i;
            this.f17132x = i2;
            this.f17133y = i3;
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f17131w < this.f17133y;
        }

        public boolean hasPrevious() {
            return this.f17131w > this.f17132x;
        }

        public Object next() {
            Object[] m21663h = HitTestResult.m21663h(HitTestResult.this);
            int i = this.f17131w;
            this.f17131w = i + 1;
            return m21663h[i];
        }

        public int nextIndex() {
            return this.f17131w - this.f17132x;
        }

        public Object previous() {
            Object[] m21663h = HitTestResult.m21663h(HitTestResult.this);
            int i = this.f17131w - 1;
            this.f17131w = i;
            return m21663h[i];
        }

        public int previousIndex() {
            return (this.f17131w - this.f17132x) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ C6251a(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(HitTestResult.this, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? HitTestResult.this.size() : i3);
        }
    }
}
