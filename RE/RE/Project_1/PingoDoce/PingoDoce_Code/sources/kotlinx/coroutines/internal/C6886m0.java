package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.InterfaceC6888n0;
import p181jd.Intrinsics;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.internal.m0 */
/* loaded from: classes2.dex */
public class C6886m0<T extends InterfaceC6888n0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private InterfaceC6888n0[] f18339a;

    /* renamed from: f */
    private final InterfaceC6888n0[] m19907f() {
        InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
        if (interfaceC6888n0Arr == null) {
            InterfaceC6888n0[] interfaceC6888n0Arr2 = new InterfaceC6888n0[4];
            this.f18339a = interfaceC6888n0Arr2;
            return interfaceC6888n0Arr2;
        } else if (m19910c() >= interfaceC6888n0Arr.length) {
            Object[] copyOf = Arrays.copyOf(interfaceC6888n0Arr, m19910c() * 2);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            InterfaceC6888n0[] interfaceC6888n0Arr3 = (InterfaceC6888n0[]) copyOf;
            this.f18339a = interfaceC6888n0Arr3;
            return interfaceC6888n0Arr3;
        } else {
            return interfaceC6888n0Arr;
        }
    }

    /* renamed from: j */
    private final void m19903j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m19902k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m19910c()) {
                return;
            }
            InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
            Intrinsics.ifNullDoSomething(interfaceC6888n0Arr);
            int i3 = i2 + 1;
            if (i3 < m19910c()) {
                InterfaceC6888n0 interfaceC6888n0 = interfaceC6888n0Arr[i3];
                Intrinsics.ifNullDoSomething(interfaceC6888n0);
                InterfaceC6888n0 interfaceC6888n02 = interfaceC6888n0Arr[i2];
                Intrinsics.ifNullDoSomething(interfaceC6888n02);
                if (((Comparable) interfaceC6888n0).compareTo(interfaceC6888n02) < 0) {
                    i2 = i3;
                }
            }
            InterfaceC6888n0 interfaceC6888n03 = interfaceC6888n0Arr[i];
            Intrinsics.ifNullDoSomething(interfaceC6888n03);
            InterfaceC6888n0 interfaceC6888n04 = interfaceC6888n0Arr[i2];
            Intrinsics.ifNullDoSomething(interfaceC6888n04);
            if (((Comparable) interfaceC6888n03).compareTo(interfaceC6888n04) <= 0) {
                return;
            }
            m19900m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    private final void m19901l(int i) {
        while (i > 0) {
            InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
            Intrinsics.ifNullDoSomething(interfaceC6888n0Arr);
            int i2 = (i - 1) / 2;
            InterfaceC6888n0 interfaceC6888n0 = interfaceC6888n0Arr[i2];
            Intrinsics.ifNullDoSomething(interfaceC6888n0);
            InterfaceC6888n0 interfaceC6888n02 = interfaceC6888n0Arr[i];
            Intrinsics.ifNullDoSomething(interfaceC6888n02);
            if (((Comparable) interfaceC6888n0).compareTo(interfaceC6888n02) <= 0) {
                return;
            }
            m19900m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    private final void m19900m(int i, int i2) {
        InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
        Intrinsics.ifNullDoSomething(interfaceC6888n0Arr);
        InterfaceC6888n0 interfaceC6888n0 = interfaceC6888n0Arr[i2];
        Intrinsics.ifNullDoSomething(interfaceC6888n0);
        InterfaceC6888n0 interfaceC6888n02 = interfaceC6888n0Arr[i];
        Intrinsics.ifNullDoSomething(interfaceC6888n02);
        interfaceC6888n0Arr[i] = interfaceC6888n0;
        interfaceC6888n0Arr[i2] = interfaceC6888n02;
        interfaceC6888n0.setIndex(i);
        interfaceC6888n02.setIndex(i2);
    }

    /* renamed from: a */
    public final void m19912a(InterfaceC6888n0 interfaceC6888n0) {
        if (C10539l0.m7720a()) {
            if (!(interfaceC6888n0.mo19897d() == null)) {
                throw new AssertionError();
            }
        }
        interfaceC6888n0.mo19898c(this);
        InterfaceC6888n0[] m19907f = m19907f();
        int m19910c = m19910c();
        m19903j(m19910c + 1);
        m19907f[m19910c] = interfaceC6888n0;
        interfaceC6888n0.setIndex(m19910c);
        m19901l(m19910c);
    }

    /* renamed from: b */
    public final InterfaceC6888n0 m19911b() {
        InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
        if (interfaceC6888n0Arr != null) {
            return interfaceC6888n0Arr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m19910c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m19909d() {
        return m19910c() == 0;
    }

    /* renamed from: e */
    public final InterfaceC6888n0 m19908e() {
        InterfaceC6888n0 m19911b;
        synchronized (this) {
            m19911b = m19911b();
        }
        return m19911b;
    }

    /* renamed from: g */
    public final boolean m19906g(InterfaceC6888n0 interfaceC6888n0) {
        boolean z;
        synchronized (this) {
            z = true;
            if (interfaceC6888n0.mo19897d() == null) {
                z = false;
            } else {
                int index = interfaceC6888n0.getIndex();
                if (C10539l0.m7720a()) {
                    if (!(index >= 0)) {
                        throw new AssertionError();
                    }
                }
                m19905h(index);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final InterfaceC6888n0 m19905h(int i) {
        if (C10539l0.m7720a()) {
            if (!(m19910c() > 0)) {
                throw new AssertionError();
            }
        }
        InterfaceC6888n0[] interfaceC6888n0Arr = this.f18339a;
        Intrinsics.ifNullDoSomething(interfaceC6888n0Arr);
        m19903j(m19910c() - 1);
        if (i < m19910c()) {
            m19900m(i, m19910c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC6888n0 interfaceC6888n0 = interfaceC6888n0Arr[i];
                Intrinsics.ifNullDoSomething(interfaceC6888n0);
                InterfaceC6888n0 interfaceC6888n02 = interfaceC6888n0Arr[i2];
                Intrinsics.ifNullDoSomething(interfaceC6888n02);
                if (((Comparable) interfaceC6888n0).compareTo(interfaceC6888n02) < 0) {
                    m19900m(i, i2);
                    m19901l(i2);
                }
            }
            m19902k(i);
        }
        InterfaceC6888n0 interfaceC6888n03 = interfaceC6888n0Arr[m19910c()];
        Intrinsics.ifNullDoSomething(interfaceC6888n03);
        if (C10539l0.m7720a()) {
            if (!(interfaceC6888n03.mo19897d() == this)) {
                throw new AssertionError();
            }
        }
        interfaceC6888n03.mo19898c(null);
        interfaceC6888n03.setIndex(-1);
        interfaceC6888n0Arr[m19910c()] = null;
        return interfaceC6888n03;
    }

    /* renamed from: i */
    public final InterfaceC6888n0 m19904i() {
        InterfaceC6888n0 m19905h;
        synchronized (this) {
            m19905h = m19910c() > 0 ? m19905h(0) : null;
        }
        return m19905h;
    }
}
