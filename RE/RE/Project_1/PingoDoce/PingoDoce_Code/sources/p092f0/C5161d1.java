package p092f0;

import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: SlotTable.kt */
/* renamed from: f0.d1 */
/* loaded from: classes.dex */
public final class C5161d1 {

    /* renamed from: a */
    private final C5164e1 f14253a;

    /* renamed from: b */
    private final int[] f14254b;

    /* renamed from: c */
    private final int f14255c;

    /* renamed from: d */
    private final Object[] f14256d;

    /* renamed from: e */
    private final int f14257e;

    /* renamed from: f */
    private int f14258f;

    /* renamed from: g */
    private int f14259g;

    /* renamed from: h */
    private int f14260h;

    /* renamed from: i */
    private int f14261i;

    /* renamed from: j */
    private int f14262j;

    /* renamed from: k */
    private int f14263k;

    public C5161d1(C5164e1 c5164e1) {
        Intrinsics.isThisObjectNull(c5164e1, "table");
        this.f14253a = c5164e1;
        this.f14254b = c5164e1.m25437o();
        int m25436p = c5164e1.m25436p();
        this.f14255c = m25436p;
        this.f14256d = c5164e1.m25435q();
        this.f14257e = c5164e1.m25434t();
        this.f14259g = m25436p;
        this.f14260h = -1;
    }

    /* renamed from: E */
    private final Object m25495E(int[] iArr, int i) {
        if (C5168f1.m25393i(iArr, i)) {
            return this.f14256d[C5168f1.m25389m(iArr, i)];
        }
        return InterfaceC5179i.f14328a.m25243a();
    }

    /* renamed from: G */
    private final Object m25493G(int[] iArr, int i) {
        if (C5168f1.m25395g(iArr, i)) {
            return this.f14256d[C5168f1.m25388n(iArr, i)];
        }
        return null;
    }

    /* renamed from: b */
    private final Object m25484b(int[] iArr, int i) {
        if (C5168f1.m25396f(iArr, i)) {
            return this.f14256d[C5168f1.m25401a(iArr, i)];
        }
        return InterfaceC5179i.f14328a.m25243a();
    }

    /* renamed from: A */
    public final boolean m25499A() {
        return C5168f1.m25393i(this.f14254b, this.f14258f);
    }

    /* renamed from: B */
    public final boolean m25498B(int i) {
        return C5168f1.m25393i(this.f14254b, i);
    }

    /* renamed from: C */
    public final Object m25497C() {
        int i;
        if (this.f14261i <= 0 && (i = this.f14262j) < this.f14263k) {
            Object[] objArr = this.f14256d;
            this.f14262j = i + 1;
            return objArr[i];
        }
        return InterfaceC5179i.f14328a.m25243a();
    }

    /* renamed from: D */
    public final Object m25496D(int i) {
        if (C5168f1.m25393i(this.f14254b, i)) {
            return m25495E(this.f14254b, i);
        }
        return null;
    }

    /* renamed from: F */
    public final int m25494F(int i) {
        return C5168f1.m25390l(this.f14254b, i);
    }

    /* renamed from: H */
    public final int m25492H(int i) {
        return C5168f1.m25387o(this.f14254b, i);
    }

    /* renamed from: I */
    public final void m25491I(int i) {
        if (this.f14261i == 0) {
            this.f14258f = i;
            int m25387o = i < this.f14255c ? C5168f1.m25387o(this.f14254b, i) : -1;
            this.f14260h = m25387o;
            if (m25387o < 0) {
                this.f14259g = this.f14255c;
            } else {
                this.f14259g = m25387o + C5168f1.m25397e(this.f14254b, m25387o);
            }
            this.f14262j = 0;
            this.f14263k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    /* renamed from: J */
    public final void m25490J(int i) {
        int m25397e = C5168f1.m25397e(this.f14254b, i) + i;
        int i2 = this.f14258f;
        if (i2 >= i && i2 <= m25397e) {
            this.f14260h = i;
            this.f14259g = m25397e;
            this.f14262j = 0;
            this.f14263k = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i + " is not a parent of " + i2).toString());
    }

    /* renamed from: K */
    public final int m25489K() {
        if (this.f14261i == 0) {
            int m25390l = C5168f1.m25393i(this.f14254b, this.f14258f) ? 1 : C5168f1.m25390l(this.f14254b, this.f14258f);
            int i = this.f14258f;
            this.f14258f = i + C5168f1.m25397e(this.f14254b, i);
            return m25390l;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    /* renamed from: L */
    public final void m25488L() {
        if (this.f14261i == 0) {
            this.f14258f = this.f14259g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    /* renamed from: M */
    public final void m25487M() {
        int m25399c;
        if (this.f14261i <= 0) {
            if (C5168f1.m25387o(this.f14254b, this.f14258f) == this.f14260h) {
                int i = this.f14258f;
                this.f14260h = i;
                this.f14259g = i + C5168f1.m25397e(this.f14254b, i);
                int i2 = this.f14258f;
                int i3 = i2 + 1;
                this.f14258f = i3;
                this.f14262j = C5168f1.m25385q(this.f14254b, i2);
                if (i2 >= this.f14255c - 1) {
                    m25399c = this.f14257e;
                } else {
                    m25399c = C5168f1.m25399c(this.f14254b, i3);
                }
                this.f14263k = m25399c;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    /* renamed from: N */
    public final void m25486N() {
        if (this.f14261i <= 0) {
            if (C5168f1.m25393i(this.f14254b, this.f14258f)) {
                m25487M();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    /* renamed from: a */
    public final C5159d m25485a(int i) {
        ArrayList m25438l = this.f14253a.m25438l();
        int m25386p = C5168f1.m25386p(m25438l, i, this.f14255c);
        if (m25386p < 0) {
            C5159d c5159d = new C5159d(i);
            m25438l.add(-(m25386p + 1), c5159d);
            return c5159d;
        }
        Object obj = m25438l.get(m25386p);
        Intrinsics.checkIfNull(obj, "get(location)");
        return (C5159d) obj;
    }

    /* renamed from: c */
    public final void m25483c() {
        this.f14261i++;
    }

    /* renamed from: d */
    public final void m25482d() {
        this.f14253a.m25440f(this);
    }

    /* renamed from: e */
    public final void m25481e() {
        int i = this.f14261i;
        if (i > 0) {
            this.f14261i = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    /* renamed from: f */
    public final void m25480f() {
        int m25397e;
        if (this.f14261i == 0) {
            if (this.f14258f == this.f14259g) {
                int m25387o = C5168f1.m25387o(this.f14254b, this.f14260h);
                this.f14260h = m25387o;
                if (m25387o < 0) {
                    m25397e = this.f14255c;
                } else {
                    m25397e = m25387o + C5168f1.m25397e(this.f14254b, m25387o);
                }
                this.f14259g = m25397e;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    /* renamed from: g */
    public final List m25479g() {
        ArrayList arrayList = new ArrayList();
        if (this.f14261i > 0) {
            return arrayList;
        }
        int i = this.f14258f;
        int i2 = 0;
        while (i < this.f14259g) {
            arrayList.add(new C5172g0(C5168f1.m25392j(this.f14254b, i), m25493G(this.f14254b, i), i, C5168f1.m25393i(this.f14254b, i) ? 1 : C5168f1.m25390l(this.f14254b, i), i2));
            i += C5168f1.m25397e(this.f14254b, i);
            i2++;
        }
        return arrayList;
    }

    /* renamed from: h */
    public final int m25478h() {
        return this.f14258f;
    }

    /* renamed from: i */
    public final Object m25477i() {
        int i = this.f14258f;
        if (i < this.f14259g) {
            return m25484b(this.f14254b, i);
        }
        return 0;
    }

    /* renamed from: j */
    public final int m25476j() {
        return this.f14259g;
    }

    /* renamed from: k */
    public final int m25475k() {
        int i = this.f14258f;
        if (i < this.f14259g) {
            return C5168f1.m25392j(this.f14254b, i);
        }
        return 0;
    }

    /* renamed from: l */
    public final Object m25474l() {
        int i = this.f14258f;
        if (i < this.f14259g) {
            return m25493G(this.f14254b, i);
        }
        return null;
    }

    /* renamed from: m */
    public final int m25473m() {
        return C5168f1.m25397e(this.f14254b, this.f14258f);
    }

    /* renamed from: n */
    public final int m25472n() {
        return this.f14262j - C5168f1.m25385q(this.f14254b, this.f14260h);
    }

    /* renamed from: o */
    public final boolean m25471o() {
        return this.f14261i > 0;
    }

    /* renamed from: p */
    public final int m25470p() {
        return this.f14260h;
    }

    /* renamed from: q */
    public final int m25469q() {
        int i = this.f14260h;
        if (i >= 0) {
            return C5168f1.m25390l(this.f14254b, i);
        }
        return 0;
    }

    /* renamed from: r */
    public final int m25468r() {
        return this.f14255c;
    }

    /* renamed from: s */
    public final C5164e1 m25467s() {
        return this.f14253a;
    }

    /* renamed from: t */
    public final Object m25466t(int i) {
        return m25484b(this.f14254b, i);
    }

    /* renamed from: u */
    public final Object m25465u(int i) {
        int i2 = this.f14258f;
        int m25385q = C5168f1.m25385q(this.f14254b, i2);
        int i3 = i2 + 1;
        int i4 = m25385q + i;
        return i4 < (i3 < this.f14255c ? C5168f1.m25399c(this.f14254b, i3) : this.f14257e) ? this.f14256d[i4] : InterfaceC5179i.f14328a.m25243a();
    }

    /* renamed from: v */
    public final int m25464v(int i) {
        return C5168f1.m25392j(this.f14254b, i);
    }

    /* renamed from: w */
    public final Object m25463w(int i) {
        return m25493G(this.f14254b, i);
    }

    /* renamed from: x */
    public final int m25462x(int i) {
        return C5168f1.m25397e(this.f14254b, i);
    }

    /* renamed from: y */
    public final boolean m25461y(int i) {
        return C5168f1.m25395g(this.f14254b, i);
    }

    /* renamed from: z */
    public final boolean m25460z() {
        return m25471o() || this.f14258f == this.f14259g;
    }
}
