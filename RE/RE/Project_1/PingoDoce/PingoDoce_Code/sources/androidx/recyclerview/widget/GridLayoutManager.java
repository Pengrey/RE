package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C1085c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f4432I;

    /* renamed from: J */
    int f4433J;

    /* renamed from: K */
    int[] f4434K;

    /* renamed from: L */
    View[] f4435L;

    /* renamed from: M */
    final SparseIntArray f4436M;

    /* renamed from: N */
    final SparseIntArray f4437N;

    /* renamed from: O */
    AbstractC1520c f4438O;

    /* renamed from: P */
    final Rect f4439P;

    /* renamed from: Q */
    private boolean f4440Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C1518a extends AbstractC1520c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1520c
        /* renamed from: e */
        public int mo36806e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1520c
        /* renamed from: f */
        public int mo36805f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1520c {

        /* renamed from: a */
        final SparseIntArray f4443a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4444b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4445c = false;

        /* renamed from: d */
        private boolean f4446d = false;

        /* renamed from: a */
        static int m36810a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        int m36809b(int i, int i2) {
            if (!this.f4446d) {
                return m36807d(i, i2);
            }
            int i3 = this.f4444b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int m36807d = m36807d(i, i2);
            this.f4444b.put(i, m36807d);
            return m36807d;
        }

        /* renamed from: c */
        int m36808c(int i, int i2) {
            if (!this.f4445c) {
                return mo36806e(i, i2);
            }
            int i3 = this.f4443a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int mo36806e = mo36806e(i, i2);
            this.f4443a.put(i, mo36806e);
            return mo36806e;
        }

        /* renamed from: d */
        public int m36807d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int m36810a;
            if (!this.f4446d || (m36810a = m36810a(this.f4444b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i3 = this.f4444b.get(m36810a);
                i4 = m36810a + 1;
                i5 = m36808c(m36810a, i2) + mo36805f(m36810a);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            }
            int mo36805f = mo36805f(i);
            while (i4 < i) {
                int mo36805f2 = mo36805f(i4);
                i5 += mo36805f2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = mo36805f2;
                }
                i4++;
            }
            return i5 + mo36805f > i2 ? i3 + 1 : i3;
        }

        /* renamed from: e */
        public abstract int mo36806e(int i, int i2);

        /* renamed from: f */
        public abstract int mo36805f(int i);

        /* renamed from: g */
        public void m36804g() {
            this.f4444b.clear();
        }

        /* renamed from: h */
        public void m36803h() {
            this.f4443a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4432I = false;
        this.f4433J = -1;
        this.f4436M = new SparseIntArray();
        this.f4437N = new SparseIntArray();
        this.f4438O = new C1518a();
        this.f4439P = new Rect();
        m36814j3(RecyclerView.AbstractC1546o.m36440j0(context, attributeSet, i, i2).f4634b);
    }

    /* renamed from: S2 */
    private void m36831S2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i3 = 1;
            i5 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.f4435L[i2];
            C1519b c1519b = (C1519b) view.getLayoutParams();
            int m36818f3 = m36818f3(c1558v, c1564z, m36442i0(view));
            c1519b.f4442f = m36818f3;
            c1519b.f4441e = i4;
            i4 += m36818f3;
            i2 += i3;
        }
    }

    /* renamed from: T2 */
    private void m36830T2() {
        int m36483K = m36483K();
        for (int i = 0; i < m36483K; i++) {
            C1519b c1519b = (C1519b) m36484J(i).getLayoutParams();
            int m36406a = c1519b.m36406a();
            this.f4436M.put(m36406a, c1519b.m36811f());
            this.f4437N.put(m36406a, c1519b.m36812e());
        }
    }

    /* renamed from: U2 */
    private void m36829U2(int i) {
        this.f4434K = m36828V2(this.f4434K, this.f4433J, i);
    }

    /* renamed from: V2 */
    static int[] m36828V2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: W2 */
    private void m36827W2() {
        this.f4436M.clear();
        this.f4437N.clear();
    }

    /* renamed from: X2 */
    private int m36826X2(RecyclerView.C1564z c1564z) {
        int max;
        if (m36483K() != 0 && c1564z.m36329b() != 0) {
            m36778U1();
            boolean m36751v2 = m36751v2();
            View m36772a2 = m36772a2(!m36751v2, true);
            View m36773Z1 = m36773Z1(!m36751v2, true);
            if (m36772a2 != null && m36773Z1 != null) {
                int m36809b = this.f4438O.m36809b(m36442i0(m36772a2), this.f4433J);
                int m36809b2 = this.f4438O.m36809b(m36442i0(m36773Z1), this.f4433J);
                int min = Math.min(m36809b, m36809b2);
                int max2 = Math.max(m36809b, m36809b2);
                int m36809b3 = this.f4438O.m36809b(c1564z.m36329b() - 1, this.f4433J) + 1;
                if (this.f4460x) {
                    max = Math.max(0, (m36809b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (m36751v2) {
                    return Math.round((max * (Math.abs(this.f4457u.mo35881d(m36773Z1) - this.f4457u.mo35878g(m36772a2)) / ((this.f4438O.m36809b(m36442i0(m36773Z1), this.f4433J) - this.f4438O.m36809b(m36442i0(m36772a2), this.f4433J)) + 1))) + (this.f4457u.mo35872m() - this.f4457u.mo35878g(m36772a2)));
                }
                return max;
            }
        }
        return 0;
    }

    /* renamed from: Y2 */
    private int m36825Y2(RecyclerView.C1564z c1564z) {
        if (m36483K() != 0 && c1564z.m36329b() != 0) {
            m36778U1();
            View m36772a2 = m36772a2(!m36751v2(), true);
            View m36773Z1 = m36773Z1(!m36751v2(), true);
            if (m36772a2 != null && m36773Z1 != null) {
                if (!m36751v2()) {
                    return this.f4438O.m36809b(c1564z.m36329b() - 1, this.f4433J) + 1;
                }
                int mo35881d = this.f4457u.mo35881d(m36773Z1) - this.f4457u.mo35878g(m36772a2);
                int m36809b = this.f4438O.m36809b(m36442i0(m36772a2), this.f4433J);
                return (int) ((mo35881d / ((this.f4438O.m36809b(m36442i0(m36773Z1), this.f4433J) - m36809b) + 1)) * (this.f4438O.m36809b(c1564z.m36329b() - 1, this.f4433J) + 1));
            }
        }
        return 0;
    }

    /* renamed from: Z2 */
    private void m36824Z2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, LinearLayoutManager.C1522a c1522a, int i) {
        boolean z = i == 1;
        int m36819e3 = m36819e3(c1558v, c1564z, c1522a.f4467b);
        if (z) {
            while (m36819e3 > 0) {
                int i2 = c1522a.f4467b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c1522a.f4467b = i3;
                m36819e3 = m36819e3(c1558v, c1564z, i3);
            }
            return;
        }
        int m36329b = c1564z.m36329b() - 1;
        int i4 = c1522a.f4467b;
        while (i4 < m36329b) {
            int i5 = i4 + 1;
            int m36819e32 = m36819e3(c1558v, c1564z, i5);
            if (m36819e32 <= m36819e3) {
                break;
            }
            i4 = i5;
            m36819e3 = m36819e32;
        }
        c1522a.f4467b = i4;
    }

    /* renamed from: a3 */
    private void m36823a3() {
        View[] viewArr = this.f4435L;
        if (viewArr == null || viewArr.length != this.f4433J) {
            this.f4435L = new View[this.f4433J];
        }
    }

    /* renamed from: d3 */
    private int m36820d3(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i) {
        if (!c1564z.m36326e()) {
            return this.f4438O.m36809b(i, this.f4433J);
        }
        int m36372f = c1558v.m36372f(i);
        if (m36372f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f4438O.m36809b(m36372f, this.f4433J);
    }

    /* renamed from: e3 */
    private int m36819e3(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i) {
        if (!c1564z.m36326e()) {
            return this.f4438O.m36808c(i, this.f4433J);
        }
        int i2 = this.f4437N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m36372f = c1558v.m36372f(i);
        if (m36372f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f4438O.m36808c(m36372f, this.f4433J);
    }

    /* renamed from: f3 */
    private int m36818f3(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i) {
        if (!c1564z.m36326e()) {
            return this.f4438O.mo36805f(i);
        }
        int i2 = this.f4436M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m36372f = c1558v.m36372f(i);
        if (m36372f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f4438O.mo36805f(m36372f);
    }

    /* renamed from: g3 */
    private void m36817g3(float f, int i) {
        m36829U2(Math.max(Math.round(f * this.f4433J), i));
    }

    /* renamed from: h3 */
    private void m36816h3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1519b c1519b = (C1519b) view.getLayoutParams();
        Rect rect = c1519b.f4638b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1519b).topMargin + ((ViewGroup.MarginLayoutParams) c1519b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1519b).leftMargin + ((ViewGroup.MarginLayoutParams) c1519b).rightMargin;
        int m36822b3 = m36822b3(c1519b.f4441e, c1519b.f4442f);
        if (this.f4455s == 1) {
            i3 = RecyclerView.AbstractC1546o.m36481L(m36822b3, i, i5, ((ViewGroup.MarginLayoutParams) c1519b).width, false);
            i2 = RecyclerView.AbstractC1546o.m36481L(this.f4457u.mo35871n(), m36463Y(), i4, ((ViewGroup.MarginLayoutParams) c1519b).height, true);
        } else {
            int m36481L = RecyclerView.AbstractC1546o.m36481L(m36822b3, i, i4, ((ViewGroup.MarginLayoutParams) c1519b).height, false);
            int m36481L2 = RecyclerView.AbstractC1546o.m36481L(this.f4457u.mo35871n(), m36424q0(), i5, ((ViewGroup.MarginLayoutParams) c1519b).width, true);
            i2 = m36481L;
            i3 = m36481L2;
        }
        m36815i3(view, i3, i2, z);
    }

    /* renamed from: i3 */
    private void m36815i3(View view, int i, int i2, boolean z) {
        boolean m36491G1;
        RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
        if (z) {
            m36491G1 = m36485I1(view, i, i2, c1551p);
        } else {
            m36491G1 = m36491G1(view, i, i2, c1551p);
        }
        if (m36491G1) {
            view.measure(i, i2);
        }
    }

    /* renamed from: k3 */
    private void m36813k3() {
        int m36464X;
        int m36445h0;
        if (m36754s2() == 1) {
            m36464X = m36427p0() - m36447g0();
            m36445h0 = m36449f0();
        } else {
            m36464X = m36464X() - m36451e0();
            m36445h0 = m36445h0();
        }
        m36829U2(m36464X - m36445h0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: D1 */
    public void mo36319D1(Rect rect, int i, int i2) {
        int m36430o;
        int m36430o2;
        if (this.f4434K == null) {
            super.mo36319D1(rect, i, i2);
        }
        int m36449f0 = m36449f0() + m36447g0();
        int m36445h0 = m36445h0() + m36451e0();
        if (this.f4455s == 1) {
            m36430o2 = RecyclerView.AbstractC1546o.m36430o(i2, rect.height() + m36445h0, m36456c0());
            int[] iArr = this.f4434K;
            m36430o = RecyclerView.AbstractC1546o.m36430o(i, iArr[iArr.length - 1] + m36449f0, m36453d0());
        } else {
            m36430o = RecyclerView.AbstractC1546o.m36430o(i, rect.width() + m36449f0, m36453d0());
            int[] iArr2 = this.f4434K;
            m36430o2 = RecyclerView.AbstractC1546o.m36430o(i2, iArr2[iArr2.length - 1] + m36445h0, m36456c0());
        }
        m36497C1(m36430o, m36430o2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: E */
    public RecyclerView.C1551p mo36317E() {
        if (this.f4455s == 0) {
            return new C1519b(-2, -1);
        }
        return new C1519b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: F */
    public RecyclerView.C1551p mo36314F(Context context, AttributeSet attributeSet) {
        return new C1519b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: G */
    public RecyclerView.C1551p mo36312G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1519b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1519b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: J2 */
    public void mo36793J2(boolean z) {
        if (!z) {
            super.mo36793J2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo36306K0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1558v r26, androidx.recyclerview.widget.RecyclerView.C1564z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo36306K0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: M1 */
    public boolean mo36302M1() {
        return this.f4450D == null && !this.f4432I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: O */
    public int mo36298O(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4455s == 1) {
            return this.f4433J;
        }
        if (c1564z.m36329b() < 1) {
            return 0;
        }
        return m36820d3(c1558v, c1564z, c1564z.m36329b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: O1 */
    void mo36788O1(RecyclerView.C1564z c1564z, LinearLayoutManager.C1524c c1524c, RecyclerView.AbstractC1546o.InterfaceC1549c interfaceC1549c) {
        int i = this.f4433J;
        for (int i2 = 0; i2 < this.f4433J && c1524c.m36734c(c1564z) && i > 0; i2++) {
            int i3 = c1524c.f4477d;
            interfaceC1549c.mo36001a(i3, Math.max(0, c1524c.f4480g));
            i -= this.f4438O.mo36805f(i3);
            c1524c.f4477d += c1524c.f4478e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Q0 */
    public void mo36293Q0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, View view, C1085c c1085c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1519b)) {
            super.m36474P0(view, c1085c);
            return;
        }
        C1519b c1519b = (C1519b) layoutParams;
        int m36820d3 = m36820d3(c1558v, c1564z, c1519b.m36406a());
        if (this.f4455s == 0) {
            c1085c.m38556d0(C1085c.C1088c.m38506a(c1519b.m36812e(), c1519b.m36811f(), m36820d3, 1, false, false));
        } else {
            c1085c.m38556d0(C1085c.C1088c.m38506a(m36820d3, 1, c1519b.m36812e(), c1519b.m36811f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: S0 */
    public void mo36288S0(RecyclerView recyclerView, int i, int i2) {
        this.f4438O.m36803h();
        this.f4438O.m36804g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: T0 */
    public void mo36285T0(RecyclerView recyclerView) {
        this.f4438O.m36803h();
        this.f4438O.m36804g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: U0 */
    public void mo36283U0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4438O.m36803h();
        this.f4438O.m36804g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: V0 */
    public void mo36281V0(RecyclerView recyclerView, int i, int i2) {
        this.f4438O.m36803h();
        this.f4438O.m36804g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: X0 */
    public void mo36278X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4438O.m36803h();
        this.f4438O.m36804g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Y0 */
    public void mo36276Y0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (c1564z.m36326e()) {
            m36830T2();
        }
        super.mo36276Y0(c1558v, c1564z);
        m36827W2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Z0 */
    public void mo36274Z0(RecyclerView.C1564z c1564z) {
        super.mo36274Z0(c1564z);
        this.f4432I = false;
    }

    /* renamed from: b3 */
    int m36822b3(int i, int i2) {
        if (this.f4455s == 1 && m36752u2()) {
            int[] iArr = this.f4434K;
            int i3 = this.f4433J;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f4434K;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* renamed from: c3 */
    public int m36821c3() {
        return this.f4433J;
    }

    /* renamed from: j3 */
    public void m36814j3(int i) {
        if (i == this.f4433J) {
            return;
        }
        this.f4432I = true;
        if (i >= 1) {
            this.f4433J = i;
            this.f4438O.m36803h();
            m36417u1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: k2 */
    View mo36762k2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i, int i2, int i3) {
        m36778U1();
        int mo35872m = this.f4457u.mo35872m();
        int mo35876i = this.f4457u.mo35876i();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m36484J = m36484J(i);
            int m36442i0 = m36442i0(m36484J);
            if (m36442i0 >= 0 && m36442i0 < i3 && m36819e3(c1558v, c1564z, m36442i0) == 0) {
                if (((RecyclerView.C1551p) m36484J.getLayoutParams()).m36404c()) {
                    if (view2 == null) {
                        view2 = m36484J;
                    }
                } else if (this.f4457u.mo35878g(m36484J) < mo35876i && this.f4457u.mo35881d(m36484J) >= mo35872m) {
                    return m36484J;
                } else {
                    if (view == null) {
                        view = m36484J;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: l0 */
    public int mo36255l0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4455s == 0) {
            return this.f4433J;
        }
        if (c1564z.m36329b() < 1) {
            return 0;
        }
        return m36820d3(c1558v, c1564z, c1564z.m36329b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: n */
    public boolean mo36251n(RecyclerView.C1551p c1551p) {
        return c1551p instanceof C1519b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: s */
    public int mo36243s(RecyclerView.C1564z c1564z) {
        if (this.f4440Q) {
            return m36826X2(c1564z);
        }
        return super.mo36243s(c1564z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: t */
    public int mo36241t(RecyclerView.C1564z c1564z) {
        if (this.f4440Q) {
            return m36825Y2(c1564z);
        }
        return super.mo36241t(c1564z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: v */
    public int mo36236v(RecyclerView.C1564z c1564z) {
        if (this.f4440Q) {
            return m36826X2(c1564z);
        }
        return super.mo36236v(c1564z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: w */
    public int mo36234w(RecyclerView.C1564z c1564z) {
        if (this.f4440Q) {
            return m36825Y2(c1564z);
        }
        return super.mo36234w(c1564z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f4472b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: w2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo36750w2(androidx.recyclerview.widget.RecyclerView.C1558v r18, androidx.recyclerview.widget.RecyclerView.C1564z r19, androidx.recyclerview.widget.LinearLayoutManager.C1524c r20, androidx.recyclerview.widget.LinearLayoutManager.C1523b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo36750w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: x1 */
    public int mo36232x1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        m36813k3();
        m36823a3();
        return super.mo36232x1(i, c1558v, c1564z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: y2 */
    public void mo36748y2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, LinearLayoutManager.C1522a c1522a, int i) {
        super.mo36748y2(c1558v, c1564z, c1522a, i);
        m36813k3();
        if (c1564z.m36329b() > 0 && !c1564z.m36326e()) {
            m36824Z2(c1558v, c1564z, c1522a, i);
        }
        m36823a3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: z1 */
    public int mo36228z1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        m36813k3();
        m36823a3();
        return super.mo36228z1(i, c1558v, c1564z);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C1519b extends RecyclerView.C1551p {

        /* renamed from: e */
        int f4441e;

        /* renamed from: f */
        int f4442f;

        public C1519b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4441e = -1;
            this.f4442f = 0;
        }

        /* renamed from: e */
        public int m36812e() {
            return this.f4441e;
        }

        /* renamed from: f */
        public int m36811f() {
            return this.f4442f;
        }

        public C1519b(int i, int i2) {
            super(i, i2);
            this.f4441e = -1;
            this.f4442f = 0;
        }

        public C1519b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4441e = -1;
            this.f4442f = 0;
        }

        public C1519b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4441e = -1;
            this.f4442f = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f4432I = false;
        this.f4433J = -1;
        this.f4436M = new SparseIntArray();
        this.f4437N = new SparseIntArray();
        this.f4438O = new C1518a();
        this.f4439P = new Rect();
        m36814j3(i);
    }
}
