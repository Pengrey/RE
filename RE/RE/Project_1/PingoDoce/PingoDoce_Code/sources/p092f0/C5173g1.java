package p092f0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import p070e.C4906j;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p489zc.C13768k;
import p489zc.C13780s;
import p489zc._ArraysJvm;

/* compiled from: SlotTable.kt */
/* renamed from: f0.g1 */
/* loaded from: classes.dex */
public final class C5173g1 {

    /* renamed from: a */
    private final C5164e1 f14295a;

    /* renamed from: b */
    private int[] f14296b;

    /* renamed from: c */
    private Object[] f14297c;

    /* renamed from: d */
    private ArrayList f14298d;

    /* renamed from: e */
    private int f14299e;

    /* renamed from: f */
    private int f14300f;

    /* renamed from: g */
    private int f14301g;

    /* renamed from: h */
    private int f14302h;

    /* renamed from: i */
    private int f14303i;

    /* renamed from: j */
    private int f14304j;

    /* renamed from: k */
    private int f14305k;

    /* renamed from: l */
    private int f14306l;

    /* renamed from: m */
    private int f14307m;

    /* renamed from: n */
    private int f14308n;

    /* renamed from: o */
    private final C5160d0 f14309o;

    /* renamed from: p */
    private final C5160d0 f14310p;

    /* renamed from: q */
    private final C5160d0 f14311q;

    /* renamed from: r */
    private int f14312r;

    /* renamed from: s */
    private int f14313s;

    /* renamed from: t */
    private boolean f14314t;

    /* compiled from: SlotTable.kt */
    /* renamed from: f0.g1$a */
    /* loaded from: classes.dex */
    public static final class C5174a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private int f14315w;

        /* renamed from: x */
        final /* synthetic */ int f14316x;

        /* renamed from: y */
        final /* synthetic */ int f14317y;

        /* renamed from: z */
        final /* synthetic */ C5173g1 f14318z;

        C5174a(int i, int i2, C5173g1 c5173g1) {
            this.f14316x = i;
            this.f14317y = i2;
            this.f14318z = c5173g1;
            this.f14315w = i;
        }

        public boolean hasNext() {
            return this.f14315w < this.f14317y;
        }

        public Object next() {
            if (hasNext()) {
                Object[] m25339b = C5173g1.m25339b(this.f14318z);
                C5173g1 c5173g1 = this.f14318z;
                int i = this.f14315w;
                this.f14315w = i + 1;
                return m25339b[C5173g1.m25341a(c5173g1, i)];
            }
            return null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5173g1(C5164e1 c5164e1) {
        Intrinsics.isThisObjectNull(c5164e1, "table");
        this.f14295a = c5164e1;
        this.f14296b = c5164e1.m25437o();
        this.f14297c = c5164e1.m25435q();
        this.f14298d = c5164e1.m25438l();
        this.f14299e = c5164e1.m25436p();
        this.f14300f = (this.f14296b.length / 5) - c5164e1.m25436p();
        this.f14301g = c5164e1.m25436p();
        this.f14304j = c5164e1.m25434t();
        this.f14305k = this.f14297c.length - c5164e1.m25434t();
        this.f14306l = c5164e1.m25436p();
        this.f14309o = new C5160d0();
        this.f14310p = new C5160d0();
        this.f14311q = new C5160d0();
        this.f14313s = -1;
    }

    /* renamed from: E */
    private final void m25363E(int i) {
        if (i > 0) {
            int i2 = this.f14312r;
            m25358J(i2);
            int i3 = this.f14299e;
            int i4 = this.f14300f;
            int[] iArr = this.f14296b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                _ArraysJvm.m317g(iArr, iArr2, 0, 0, i3 * 5);
                _ArraysJvm.m317g(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f14296b = iArr2;
                i4 = i6;
            }
            int i7 = this.f14301g;
            if (i7 >= i3) {
                this.f14301g = i7 + i;
            }
            int i8 = i3 + i;
            this.f14299e = i8;
            this.f14300f = i4 - i;
            int m25317m = m25317m(i5 > 0 ? m25323j(i2 + i) : 0, this.f14306l >= i3 ? this.f14304j : 0, this.f14305k, this.f14297c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                C5168f1.m25384r(this.f14296b, i9, m25317m);
            }
            int i10 = this.f14306l;
            if (i10 >= i3) {
                this.f14306l = i10 + i;
            }
        }
    }

    /* renamed from: F */
    private final void m25362F(int i, int i2) {
        if (i > 0) {
            m25357K(this.f14302h, i2);
            int i3 = this.f14304j;
            int i4 = this.f14305k;
            if (i4 < i) {
                Object[] objArr = this.f14297c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C13768k.m353i(objArr, objArr2, 0, 0, i3);
                C13768k.m353i(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f14297c = objArr2;
                i4 = i7;
            }
            int i8 = this.f14303i;
            if (i8 >= i3) {
                this.f14303i = i8 + i;
            }
            this.f14304j = i3 + i;
            this.f14305k = i4 - i;
        }
    }

    /* renamed from: G */
    private final void m25361G(int i, int i2, int i3) {
        int i4 = i3 + i;
        int m25303w = m25303w();
        int m25391k = C5168f1.m25391k(this.f14298d, i, m25303w);
        ArrayList arrayList = new ArrayList();
        if (m25391k >= 0) {
            while (m25391k < this.f14298d.size()) {
                Object obj = this.f14298d.get(m25391k);
                Intrinsics.checkIfNull(obj, "anchors[index]");
                C5159d c5159d = (C5159d) obj;
                int m25333e = m25333e(c5159d);
                if (m25333e < i || m25333e >= i4) {
                    break;
                }
                arrayList.add(c5159d);
                this.f14298d.remove(m25391k);
            }
        }
        int i5 = i2 - i;
        int i6 = 0;
        int size = arrayList.size();
        while (i6 < size) {
            int i7 = i6 + 1;
            C5159d c5159d2 = (C5159d) arrayList.get(i6);
            int m25333e2 = m25333e(c5159d2) + i5;
            if (m25333e2 >= this.f14299e) {
                c5159d2.m25509c(-(m25303w - m25333e2));
            } else {
                c5159d2.m25509c(m25333e2);
            }
            this.f14298d.add(C5168f1.m25391k(this.f14298d, m25333e2, m25303w), c5159d2);
            i6 = i7;
        }
    }

    /* renamed from: J */
    private final void m25358J(int i) {
        int i2 = this.f14300f;
        int i3 = this.f14299e;
        if (i3 != i) {
            if (!this.f14298d.isEmpty()) {
                m25320k0(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.f14296b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    _ArraysJvm.m317g(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    _ArraysJvm.m317g(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int m25307s = m25307s();
            C5210k.m25048Q(i3 < m25307s);
            while (i3 < m25307s) {
                int m25387o = C5168f1.m25387o(this.f14296b, i3);
                int m25350R = m25350R(m25351Q(m25387o), i);
                if (m25350R != m25387o) {
                    C5168f1.m25381u(this.f14296b, i3, m25350R);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.f14299e = i;
    }

    /* renamed from: K */
    private final void m25357K(int i, int i2) {
        int i3 = this.f14305k;
        int i4 = this.f14304j;
        int i5 = this.f14306l;
        if (i4 != i) {
            Object[] objArr = this.f14297c;
            if (i < i4) {
                C13768k.m353i(objArr, objArr, i + i3, i, i4);
            } else {
                C13768k.m353i(objArr, objArr, i4, i4 + i3, i + i3);
            }
            _ArraysJvm.m306r(objArr, null, i, i + i3);
        }
        int min = Math.min(i2 + 1, m25303w());
        if (i5 != min) {
            int length = this.f14297c.length - i3;
            if (min < i5) {
                int m25300z = m25300z(min);
                int m25300z2 = m25300z(i5);
                int i6 = this.f14299e;
                while (m25300z < m25300z2) {
                    int m25399c = C5168f1.m25399c(this.f14296b, m25300z);
                    if (m25399c >= 0) {
                        C5168f1.m25384r(this.f14296b, m25300z, -((length - m25399c) + 1));
                        m25300z++;
                        if (m25300z == i6) {
                            m25300z += this.f14300f;
                        }
                    } else {
                        C5210k.m25030r("Unexpected anchor value, expected a positive anchor".toString());
                        throw new ExceptionsH();
                    }
                }
            } else {
                int m25300z3 = m25300z(i5);
                int m25300z4 = m25300z(min);
                while (m25300z3 < m25300z4) {
                    int m25399c2 = C5168f1.m25399c(this.f14296b, m25300z3);
                    if (m25399c2 < 0) {
                        C5168f1.m25384r(this.f14296b, m25300z3, m25399c2 + length + 1);
                        m25300z3++;
                        if (m25300z3 == this.f14299e) {
                            m25300z3 += this.f14300f;
                        }
                    } else {
                        C5210k.m25030r("Unexpected anchor value, expected a negative anchor".toString());
                        throw new ExceptionsH();
                    }
                }
            }
            this.f14306l = min;
        }
        this.f14304j = i;
    }

    /* renamed from: N */
    private final int m25354N(int[] iArr, int i) {
        return m25321k(iArr, i);
    }

    /* renamed from: P */
    private final int m25352P(int[] iArr, int i) {
        return m25351Q(C5168f1.m25387o(iArr, m25300z(i)));
    }

    /* renamed from: Q */
    private final int m25351Q(int i) {
        return i > -2 ? i : m25303w() + i + 2;
    }

    /* renamed from: R */
    private final int m25350R(int i, int i2) {
        return i < i2 ? i : -((m25303w() - i) + 2);
    }

    /* renamed from: S */
    private final boolean m25349S(int i, int i2) {
        int i3 = i2 + i;
        int m25391k = C5168f1.m25391k(this.f14298d, i3, m25307s() - this.f14300f);
        if (m25391k >= this.f14298d.size()) {
            m25391k--;
        }
        int i4 = m25391k + 1;
        int i5 = 0;
        while (m25391k >= 0) {
            Object obj = this.f14298d.get(m25391k);
            Intrinsics.checkIfNull(obj, "anchors[index]");
            C5159d c5159d = (C5159d) obj;
            int m25333e = m25333e(c5159d);
            if (m25333e < i) {
                break;
            }
            if (m25333e < i3) {
                c5159d.m25509c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = m25391k + 1;
                }
                i4 = m25391k;
            }
            m25391k--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.f14298d.subList(i4, i5).clear();
        }
        return z;
    }

    /* renamed from: U */
    private final boolean m25347U(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f14298d;
            m25358J(i);
            r0 = arrayList.isEmpty() ^ true ? m25349S(i, i2) : false;
            this.f14299e = i;
            this.f14300f += i2;
            int i3 = this.f14306l;
            if (i3 > i) {
                this.f14306l = i3 - i2;
            }
            int i4 = this.f14301g;
            if (i4 >= i) {
                this.f14301g = i4 - i2;
            }
        }
        return r0;
    }

    /* renamed from: V */
    private final void m25346V(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f14305k;
            int i5 = i + i2;
            m25357K(i5, i3);
            this.f14304j = i;
            this.f14305k = i4 + i2;
            _ArraysJvm.m306r(this.f14297c, null, i, i5);
            int i6 = this.f14303i;
            if (i6 >= i) {
                this.f14303i = i6 - i2;
            }
        }
    }

    /* renamed from: W */
    private final int m25345W() {
        int m25307s = (m25307s() - this.f14300f) - this.f14310p.m25501f();
        this.f14301g = m25307s;
        return m25307s;
    }

    /* renamed from: X */
    private final void m25344X() {
        this.f14310p.m25500g((m25307s() - this.f14300f) - this.f14301g);
    }

    /* renamed from: a */
    public static final /* synthetic */ int m25341a(C5173g1 c5173g1, int i) {
        return c5173g1.m25319l(i);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object[] m25339b(C5173g1 c5173g1) {
        return c5173g1.f14297c;
    }

    /* renamed from: d0 */
    private final int m25334d0(int[] iArr, int i) {
        return i >= m25307s() ? this.f14297c.length - this.f14305k : m25325i(C5168f1.m25385q(iArr, i), this.f14305k, this.f14297c.length);
    }

    /* renamed from: f */
    private final int m25331f(int[] iArr, int i) {
        return m25321k(iArr, i) + C5168f1.m25400b(C5168f1.m25398d(iArr, i) >> 29);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h0 */
    private final void m25326h0(int i, Object obj, boolean z, Object obj2) {
        int m25397e;
        byte b = this.f14307m > 0 ? (byte) 1 : (byte) 0;
        this.f14311q.m25500g(this.f14308n);
        if (b != 0) {
            m25363E(1);
            int i2 = this.f14312r;
            int m25300z = m25300z(i2);
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            int i3 = obj != c5180a.m25243a() ? 1 : 0;
            int i4 = (z || obj2 == c5180a.m25243a()) ? 0 : 1;
            C5168f1.m25394h(this.f14296b, m25300z, i, z, i3, i4, this.f14313s, this.f14302h);
            this.f14303i = this.f14302h;
            int i5 = (z ? 1 : 0) + i3 + i4;
            if (i5 > 0) {
                m25362F(i5, i2);
                Object[] objArr = this.f14297c;
                int i6 = this.f14302h;
                if (z) {
                    objArr[i6] = obj2;
                    i6++;
                }
                if (i3 != 0) {
                    objArr[i6] = obj;
                    i6++;
                }
                if (i4 != 0) {
                    objArr[i6] = obj2;
                    i6++;
                }
                this.f14302h = i6;
            }
            this.f14308n = 0;
            m25397e = i2 + 1;
            this.f14313s = i2;
            this.f14312r = m25397e;
        } else {
            this.f14309o.m25500g(this.f14313s);
            m25344X();
            int i7 = this.f14312r;
            int m25300z2 = m25300z(i7);
            if (!Intrinsics.equals(obj2, InterfaceC5179i.f14328a.m25243a())) {
                if (z) {
                    m25312o0(obj2);
                } else {
                    m25318l0(obj2);
                }
            }
            this.f14302h = m25334d0(this.f14296b, m25300z2);
            this.f14303i = m25321k(this.f14296b, m25300z(this.f14312r + 1));
            this.f14308n = C5168f1.m25390l(this.f14296b, m25300z2);
            this.f14313s = i7;
            this.f14312r = i7 + 1;
            m25397e = i7 + C5168f1.m25397e(this.f14296b, m25300z2);
        }
        this.f14301g = m25397e;
    }

    /* renamed from: i */
    private final int m25325i(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* renamed from: j */
    private final int m25323j(int i) {
        return m25321k(this.f14296b, m25300z(i));
    }

    /* renamed from: k */
    private final int m25321k(int[] iArr, int i) {
        return i >= m25307s() ? this.f14297c.length - this.f14305k : m25325i(C5168f1.m25399c(iArr, i), this.f14305k, this.f14297c.length);
    }

    /* renamed from: k0 */
    private final void m25320k0(int i, int i2) {
        int i3;
        int m25307s = m25307s() - this.f14300f;
        if (i < i2) {
            for (int m25391k = C5168f1.m25391k(this.f14298d, i, m25307s); m25391k < this.f14298d.size(); m25391k++) {
                Object obj = this.f14298d.get(m25391k);
                Intrinsics.checkIfNull(obj, "anchors[index]");
                C5159d c5159d = (C5159d) obj;
                int m25511a = c5159d.m25511a();
                if (m25511a >= 0 || (i3 = m25511a + m25307s) >= i2) {
                    return;
                }
                c5159d.m25509c(i3);
            }
            return;
        }
        for (int m25391k2 = C5168f1.m25391k(this.f14298d, i2, m25307s); m25391k2 < this.f14298d.size(); m25391k2++) {
            Object obj2 = this.f14298d.get(m25391k2);
            Intrinsics.checkIfNull(obj2, "anchors[index]");
            C5159d c5159d2 = (C5159d) obj2;
            int m25511a2 = c5159d2.m25511a();
            if (m25511a2 < 0) {
                return;
            }
            c5159d2.m25509c(-(m25307s - m25511a2));
        }
    }

    /* renamed from: l */
    private final int m25319l(int i) {
        return i < this.f14304j ? i : i + this.f14305k;
    }

    /* renamed from: m */
    private final int m25317m(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* renamed from: m0 */
    private final void m25316m0(int[] iArr, int i, int i2) {
        C5168f1.m25384r(iArr, i, m25317m(i2, this.f14304j, this.f14305k, this.f14297c.length));
    }

    /* renamed from: p0 */
    private final void m25310p0(int i, Object obj) {
        int m25300z = m25300z(i);
        int[] iArr = this.f14296b;
        if (m25300z < iArr.length && C5168f1.m25393i(iArr, m25300z)) {
            this.f14297c[m25319l(m25354N(this.f14296b, m25300z))] = obj;
            return;
        }
        C5210k.m25030r(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new ExceptionsH();
    }

    /* renamed from: r */
    private final void m25308r(int i, int i2, int i3) {
        int m25350R = m25350R(i, this.f14299e);
        while (i3 < i2) {
            C5168f1.m25381u(this.f14296b, m25300z(i3), m25350R);
            int m25397e = C5168f1.m25397e(this.f14296b, m25300z(i3)) + i3;
            m25308r(i3, m25397e, i3 + 1);
            i3 = m25397e;
        }
    }

    /* renamed from: s */
    private final int m25307s() {
        return this.f14296b.length / 5;
    }

    /* renamed from: z */
    private final int m25300z(int i) {
        return i < this.f14299e ? i : i + this.f14300f;
    }

    /* renamed from: A */
    public final int m25367A(int i) {
        return C5168f1.m25392j(this.f14296b, m25300z(i));
    }

    /* renamed from: B */
    public final Object m25366B(int i) {
        int m25300z = m25300z(i);
        if (C5168f1.m25395g(this.f14296b, m25300z)) {
            return this.f14297c[C5168f1.m25388n(this.f14296b, m25300z)];
        }
        return null;
    }

    /* renamed from: C */
    public final int m25365C(int i) {
        return C5168f1.m25397e(this.f14296b, m25300z(i));
    }

    /* renamed from: D */
    public final Iterator m25364D() {
        int m25321k = m25321k(this.f14296b, m25300z(this.f14312r));
        int[] iArr = this.f14296b;
        int i = this.f14312r;
        return new C5174a(m25321k, m25321k(iArr, m25300z(i + m25365C(i))), this);
    }

    /* renamed from: H */
    public final List m25360H(C5164e1 c5164e1, int i) {
        List m197g;
        ArrayList arrayList;
        int i2;
        int i3;
        Intrinsics.isThisObjectNull(c5164e1, "table");
        if (this.f14307m > 0) {
            if (i == 0 && this.f14312r == 0 && this.f14295a.m25436p() == 0) {
                int[] iArr = this.f14296b;
                Object[] objArr = this.f14297c;
                ArrayList arrayList2 = this.f14298d;
                int[] m25437o = c5164e1.m25437o();
                int m25436p = c5164e1.m25436p();
                Object[] m25435q = c5164e1.m25435q();
                int m25434t = c5164e1.m25434t();
                this.f14296b = m25437o;
                this.f14297c = m25435q;
                this.f14298d = c5164e1.m25438l();
                this.f14299e = m25436p;
                this.f14300f = (m25437o.length / 5) - m25436p;
                this.f14304j = m25434t;
                this.f14305k = m25435q.length - m25434t;
                this.f14306l = m25436p;
                c5164e1.m25442C(iArr, 0, objArr, 0, arrayList2);
                return this.f14298d;
            }
            C5173g1 m25430y = c5164e1.m25430y();
            try {
                int m25365C = m25430y.m25365C(i);
                int i4 = i + m25365C;
                int m25323j = m25430y.m25323j(i);
                int m25323j2 = m25430y.m25323j(i4);
                int i5 = m25323j2 - m25323j;
                m25363E(m25365C);
                m25362F(i5, m25305u());
                int[] iArr2 = this.f14296b;
                int m25305u = m25305u();
                _ArraysJvm.m317g(m25430y.f14296b, iArr2, m25305u * 5, i * 5, i4 * 5);
                Object[] objArr2 = this.f14297c;
                int i6 = this.f14302h;
                C13768k.m353i(m25430y.f14297c, objArr2, i6, m25323j, m25323j2);
                C5168f1.m25381u(iArr2, m25305u, m25304v());
                int i7 = m25305u - i;
                int i8 = m25365C + m25305u;
                int m25321k = i6 - m25321k(iArr2, m25305u);
                int i9 = this.f14306l;
                int i10 = this.f14305k;
                int length = objArr2.length;
                int i11 = m25305u;
                while (i11 < i8) {
                    int i12 = i11 + 1;
                    if (i11 != m25305u) {
                        C5168f1.m25381u(iArr2, i11, C5168f1.m25387o(iArr2, i11) + i7);
                    }
                    int m25321k2 = m25321k(iArr2, i11) + m25321k;
                    if (i9 < i11) {
                        i2 = m25321k;
                        i3 = 0;
                    } else {
                        i2 = m25321k;
                        i3 = this.f14304j;
                    }
                    C5168f1.m25384r(iArr2, i11, m25317m(m25321k2, i3, i10, length));
                    if (i11 == i9) {
                        i9++;
                    }
                    i11 = i12;
                    m25321k = i2;
                }
                this.f14306l = i9;
                int m25391k = C5168f1.m25391k(c5164e1.m25438l(), i, c5164e1.m25436p());
                int m25391k2 = C5168f1.m25391k(c5164e1.m25438l(), i4, c5164e1.m25436p());
                if (m25391k < m25391k2) {
                    ArrayList m25438l = c5164e1.m25438l();
                    ArrayList arrayList3 = new ArrayList(m25391k2 - m25391k);
                    int i13 = m25391k;
                    while (i13 < m25391k2) {
                        int i14 = i13 + 1;
                        Object obj = m25438l.get(i13);
                        Intrinsics.checkIfNull(obj, "sourceAnchors[anchorIndex]");
                        C5159d c5159d = (C5159d) obj;
                        c5159d.m25509c(c5159d.m25511a() + i7);
                        arrayList3.add(c5159d);
                        i13 = i14;
                    }
                    m25302x().m25438l().addAll(C5168f1.m25391k(this.f14298d, m25305u(), m25303w()), arrayList3);
                    m25438l.subList(m25391k, m25391k2).clear();
                    arrayList = arrayList3;
                } else {
                    m197g = C13780s.m197g();
                    arrayList = m197g;
                }
                int m25353O = m25430y.m25353O(i);
                if (m25353O >= 0) {
                    m25430y.m25330f0();
                    m25430y.m25337c(m25353O - m25430y.m25305u());
                    m25430y.m25330f0();
                }
                m25430y.m25337c(i - m25430y.m25305u());
                boolean m25348T = m25430y.m25348T();
                if (m25353O >= 0) {
                    m25430y.m25336c0();
                    m25430y.m25315n();
                    m25430y.m25336c0();
                    m25430y.m25315n();
                }
                if (!m25348T) {
                    this.f14308n += C5168f1.m25393i(iArr2, m25305u) ? 1 : C5168f1.m25390l(iArr2, m25305u);
                    this.f14312r = i8;
                    this.f14302h = i6 + i5;
                    return arrayList;
                }
                C5210k.m25030r("Unexpectedly removed anchors".toString());
                throw new ExceptionsH();
            } finally {
                m25430y.m25327h();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: I */
    public final void m25359I(int i) {
        if (!(this.f14307m == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f14312r;
        int i3 = this.f14313s;
        int i4 = this.f14301g;
        int i5 = i2;
        for (int i6 = i; i6 > 0; i6--) {
            i5 += C5168f1.m25397e(this.f14296b, m25300z(i5));
            if (!(i5 <= i4)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
        }
        int m25397e = C5168f1.m25397e(this.f14296b, m25300z(i5));
        int i7 = this.f14302h;
        int m25321k = m25321k(this.f14296b, m25300z(i5));
        int i8 = i5 + m25397e;
        int m25321k2 = m25321k(this.f14296b, m25300z(i8));
        int i9 = m25321k2 - m25321k;
        m25362F(i9, Math.max(this.f14312r - 1, 0));
        m25363E(m25397e);
        int[] iArr = this.f14296b;
        int m25300z = m25300z(i8) * 5;
        _ArraysJvm.m317g(iArr, iArr, m25300z(i2) * 5, m25300z, (m25397e * 5) + m25300z);
        if (i9 > 0) {
            Object[] objArr = this.f14297c;
            C13768k.m353i(objArr, objArr, i7, m25319l(m25321k + i9), m25319l(m25321k2 + i9));
        }
        int i10 = m25321k + i9;
        int i11 = i10 - i7;
        int i12 = this.f14304j;
        int i13 = this.f14305k;
        int length = this.f14297c.length;
        int i14 = this.f14306l;
        int i15 = i2 + m25397e;
        int i16 = i2;
        while (i16 < i15) {
            int i17 = i16 + 1;
            int m25300z2 = m25300z(i16);
            int i18 = i11;
            m25316m0(iArr, m25300z2, m25317m(m25321k(iArr, m25300z2) - i11, i14 < m25300z2 ? 0 : i12, i13, length));
            i11 = i18;
            i16 = i17;
        }
        m25361G(i8, i2, m25397e);
        if (!m25347U(i8, m25397e)) {
            m25308r(i3, this.f14301g, i2);
            if (i9 > 0) {
                m25346V(i10, i9, i8 - 1);
                return;
            }
            return;
        }
        C5210k.m25030r("Unexpectedly removed anchors".toString());
        throw new ExceptionsH();
    }

    /* renamed from: L */
    public final Object m25356L(int i) {
        int m25300z = m25300z(i);
        if (C5168f1.m25393i(this.f14296b, m25300z)) {
            return this.f14297c[m25319l(m25354N(this.f14296b, m25300z))];
        }
        return null;
    }

    /* renamed from: M */
    public final Object m25355M(C5159d c5159d) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        return m25356L(c5159d.m25507e(this));
    }

    /* renamed from: O */
    public final int m25353O(int i) {
        return m25352P(this.f14296b, i);
    }

    /* renamed from: T */
    public final boolean m25348T() {
        if (this.f14307m == 0) {
            int i = this.f14312r;
            int i2 = this.f14302h;
            int m25338b0 = m25338b0();
            boolean m25347U = m25347U(i, this.f14312r - i);
            m25346V(i2, this.f14302h - i2, i - 1);
            this.f14312r = i;
            this.f14302h = i2;
            this.f14308n -= m25338b0;
            return m25347U;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    /* renamed from: Y */
    public final Object m25343Y(int i, Object obj) {
        int m25334d0 = m25334d0(this.f14296b, m25300z(this.f14312r));
        boolean z = true;
        int i2 = m25334d0 + i;
        if ((i2 < m25334d0 || i2 >= m25321k(this.f14296b, m25300z(this.f14312r + 1))) ? false : false) {
            int m25319l = m25319l(i2);
            Object[] objArr = this.f14297c;
            Object obj2 = objArr[m25319l];
            objArr[m25319l] = obj;
            return obj2;
        }
        C5210k.m25030r(("Write to an invalid slot index " + i + " for group " + m25305u()).toString());
        throw new ExceptionsH();
    }

    /* renamed from: Z */
    public final void m25342Z(Object obj) {
        int i = this.f14302h;
        if (i <= this.f14303i) {
            this.f14297c[m25319l(i - 1)] = obj;
        } else {
            C5210k.m25030r("Writing to an invalid slot".toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: a0 */
    public final Object m25340a0() {
        if (this.f14307m > 0) {
            m25362F(1, this.f14313s);
        }
        Object[] objArr = this.f14297c;
        int i = this.f14302h;
        this.f14302h = i + 1;
        return objArr[m25319l(i)];
    }

    /* renamed from: b0 */
    public final int m25338b0() {
        int m25300z = m25300z(this.f14312r);
        int m25397e = this.f14312r + C5168f1.m25397e(this.f14296b, m25300z);
        this.f14312r = m25397e;
        this.f14302h = m25321k(this.f14296b, m25300z(m25397e));
        if (C5168f1.m25393i(this.f14296b, m25300z)) {
            return 1;
        }
        return C5168f1.m25390l(this.f14296b, m25300z);
    }

    /* renamed from: c */
    public final void m25337c(int i) {
        boolean z = true;
        if (i >= 0) {
            if (this.f14307m <= 0) {
                int i2 = this.f14312r + i;
                if (i2 < this.f14313s || i2 > this.f14301g) {
                    z = false;
                }
                if (z) {
                    this.f14312r = i2;
                    int m25321k = m25321k(this.f14296b, m25300z(i2));
                    this.f14302h = m25321k;
                    this.f14303i = m25321k;
                    return;
                }
                C5210k.m25030r(("Cannot seek outside the current group (" + m25304v() + '-' + this.f14301g + ')').toString());
                throw new ExceptionsH();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        throw new IllegalArgumentException("Cannot seek backwards".toString());
    }

    /* renamed from: c0 */
    public final void m25336c0() {
        int i = this.f14301g;
        this.f14312r = i;
        this.f14302h = m25321k(this.f14296b, m25300z(i));
    }

    /* renamed from: d */
    public final C5159d m25335d(int i) {
        ArrayList arrayList = this.f14298d;
        int m25386p = C5168f1.m25386p(arrayList, i, m25303w());
        if (m25386p < 0) {
            if (i > this.f14299e) {
                i = -(m25303w() - i);
            }
            C5159d c5159d = new C5159d(i);
            arrayList.add(-(m25386p + 1), c5159d);
            return c5159d;
        }
        Object obj = arrayList.get(m25386p);
        Intrinsics.checkIfNull(obj, "get(location)");
        return (C5159d) obj;
    }

    /* renamed from: e */
    public final int m25333e(C5159d c5159d) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        int m25511a = c5159d.m25511a();
        return m25511a < 0 ? m25511a + m25303w() : m25511a;
    }

    /* renamed from: e0 */
    public final void m25332e0(int i, Object obj, Object obj2) {
        m25326h0(i, obj, false, obj2);
    }

    /* renamed from: f0 */
    public final void m25330f0() {
        if (this.f14307m == 0) {
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            m25326h0(0, c5180a.m25243a(), false, c5180a.m25243a());
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    /* renamed from: g */
    public final void m25329g() {
        int i = this.f14307m;
        this.f14307m = i + 1;
        if (i == 0) {
            m25344X();
        }
    }

    /* renamed from: g0 */
    public final void m25328g0(int i, Object obj) {
        m25326h0(i, obj, false, InterfaceC5179i.f14328a.m25243a());
    }

    /* renamed from: h */
    public final void m25327h() {
        this.f14314t = true;
        m25358J(m25303w());
        m25357K(this.f14297c.length - this.f14305k, this.f14299e);
        this.f14295a.m25439h(this, this.f14296b, this.f14299e, this.f14297c, this.f14304j, this.f14298d);
    }

    /* renamed from: i0 */
    public final void m25324i0(Object obj) {
        m25326h0(C4906j.f13415H0, obj, true, InterfaceC5179i.f14328a.m25243a());
    }

    /* renamed from: j0 */
    public final Object m25322j0(Object obj) {
        Object m25340a0 = m25340a0();
        m25342Z(obj);
        return m25340a0;
    }

    /* renamed from: l0 */
    public final void m25318l0(Object obj) {
        int m25300z = m25300z(this.f14312r);
        if (C5168f1.m25396f(this.f14296b, m25300z)) {
            this.f14297c[m25319l(m25331f(this.f14296b, m25300z))] = obj;
        } else {
            C5210k.m25030r("Updating the data of a group that was not created with a data slot".toString());
            throw new ExceptionsH();
        }
    }

    /* renamed from: n */
    public final int m25315n() {
        boolean z = this.f14307m > 0;
        int i = this.f14312r;
        int i2 = this.f14301g;
        int i3 = this.f14313s;
        int m25300z = m25300z(i3);
        int i4 = this.f14308n;
        int i5 = i - i3;
        boolean m25393i = C5168f1.m25393i(this.f14296b, m25300z);
        if (z) {
            C5168f1.m25383s(this.f14296b, m25300z, i5);
            C5168f1.m25382t(this.f14296b, m25300z, i4);
            this.f14308n = this.f14311q.m25501f() + (m25393i ? 1 : i4);
            this.f14313s = m25352P(this.f14296b, i3);
        } else {
            if ((i != i2 ? 0 : 1) != 0) {
                int m25397e = C5168f1.m25397e(this.f14296b, m25300z);
                int m25390l = C5168f1.m25390l(this.f14296b, m25300z);
                C5168f1.m25383s(this.f14296b, m25300z, i5);
                C5168f1.m25382t(this.f14296b, m25300z, i4);
                int m25501f = this.f14309o.m25501f();
                m25345W();
                this.f14313s = m25501f;
                int m25352P = m25352P(this.f14296b, i3);
                int m25501f2 = this.f14311q.m25501f();
                this.f14308n = m25501f2;
                if (m25352P == m25501f) {
                    this.f14308n = m25501f2 + (m25393i ? 0 : i4 - m25390l);
                } else {
                    int i6 = i5 - m25397e;
                    int i7 = m25393i ? 0 : i4 - m25390l;
                    if (i6 != 0 || i7 != 0) {
                        while (m25352P != 0 && m25352P != m25501f && (i7 != 0 || i6 != 0)) {
                            int m25300z2 = m25300z(m25352P);
                            if (i6 != 0) {
                                C5168f1.m25383s(this.f14296b, m25300z2, C5168f1.m25397e(this.f14296b, m25300z2) + i6);
                            }
                            if (i7 != 0) {
                                int[] iArr = this.f14296b;
                                C5168f1.m25382t(iArr, m25300z2, C5168f1.m25390l(iArr, m25300z2) + i7);
                            }
                            if (C5168f1.m25393i(this.f14296b, m25300z2)) {
                                i7 = 0;
                            }
                            m25352P = m25352P(this.f14296b, m25352P);
                        }
                    }
                    this.f14308n += i7;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i4;
    }

    /* renamed from: n0 */
    public final void m25314n0(C5159d c5159d, Object obj) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        m25310p0(c5159d.m25507e(this), obj);
    }

    /* renamed from: o */
    public final void m25313o() {
        int i = this.f14307m;
        if (i > 0) {
            int i2 = i - 1;
            this.f14307m = i2;
            if (i2 == 0) {
                if (this.f14311q.m25505b() == this.f14309o.m25505b()) {
                    m25345W();
                    return;
                } else {
                    C5210k.m25030r("startGroup/endGroup mismatch while inserting".toString());
                    throw new ExceptionsH();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    /* renamed from: o0 */
    public final void m25312o0(Object obj) {
        m25310p0(this.f14312r, obj);
    }

    /* renamed from: p */
    public final void m25311p(int i) {
        boolean z = true;
        if (this.f14307m <= 0) {
            int i2 = this.f14313s;
            if (i2 != i) {
                if (i < i2 || i >= this.f14301g) {
                    z = false;
                }
                if (z) {
                    int i3 = this.f14312r;
                    int i4 = this.f14302h;
                    int i5 = this.f14303i;
                    this.f14312r = i;
                    m25330f0();
                    this.f14312r = i3;
                    this.f14302h = i4;
                    this.f14303i = i5;
                    return;
                }
                throw new IllegalArgumentException(Intrinsics.addStrAndObj("Started group must be a subgroup of the group at ", Integer.valueOf(i2)).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    /* renamed from: q */
    public final void m25309q(C5159d c5159d) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        m25311p(c5159d.m25507e(this));
    }

    /* renamed from: t */
    public final boolean m25306t() {
        return this.f14314t;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f14312r + " end=" + this.f14301g + " size = " + m25303w() + " gap=" + this.f14299e + '-' + (this.f14299e + this.f14300f) + ')';
    }

    /* renamed from: u */
    public final int m25305u() {
        return this.f14312r;
    }

    /* renamed from: v */
    public final int m25304v() {
        return this.f14313s;
    }

    /* renamed from: w */
    public final int m25303w() {
        return m25307s() - this.f14300f;
    }

    /* renamed from: x */
    public final C5164e1 m25302x() {
        return this.f14295a;
    }

    /* renamed from: y */
    public final Object m25301y(int i) {
        int m25300z = m25300z(i);
        return C5168f1.m25396f(this.f14296b, m25300z) ? this.f14297c[m25331f(this.f14296b, m25300z)] : InterfaceC5179i.f14328a.m25243a();
    }
}
