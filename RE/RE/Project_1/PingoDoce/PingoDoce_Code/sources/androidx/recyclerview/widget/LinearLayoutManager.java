package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1546o implements C1618k.InterfaceC1631j, RecyclerView.AbstractC1561y.InterfaceC1563b {

    /* renamed from: A */
    int f4447A;

    /* renamed from: B */
    int f4448B;

    /* renamed from: C */
    private boolean f4449C;

    /* renamed from: D */
    SavedState f4450D;

    /* renamed from: E */
    final C1522a f4451E;

    /* renamed from: F */
    private final C1523b f4452F;

    /* renamed from: G */
    private int f4453G;

    /* renamed from: H */
    private int[] f4454H;

    /* renamed from: s */
    int f4455s;

    /* renamed from: t */
    private C1524c f4456t;

    /* renamed from: u */
    AbstractC1642t f4457u;

    /* renamed from: v */
    private boolean f4458v;

    /* renamed from: w */
    private boolean f4459w;

    /* renamed from: x */
    boolean f4460x;

    /* renamed from: y */
    private boolean f4461y;

    /* renamed from: z */
    private boolean f4462z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1521a();

        /* renamed from: w */
        int f4463w;

        /* renamed from: x */
        int f4464x;

        /* renamed from: y */
        boolean f4465y;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        static class C1521a implements Parcelable.Creator<SavedState> {
            C1521a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo36744a(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] mo36743b(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        boolean m36746a() {
            return this.f4463w >= 0;
        }

        /* renamed from: b */
        void m36745b() {
            this.f4463w = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4463w);
            parcel.writeInt(this.f4464x);
            parcel.writeInt(this.f4465y ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f4463w = parcel.readInt();
            this.f4464x = parcel.readInt();
            this.f4465y = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f4463w = savedState.f4463w;
            this.f4464x = savedState.f4464x;
            this.f4465y = savedState.f4465y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C1522a {

        /* renamed from: a */
        AbstractC1642t f4466a;

        /* renamed from: b */
        int f4467b;

        /* renamed from: c */
        int f4468c;

        /* renamed from: d */
        boolean f4469d;

        /* renamed from: e */
        boolean f4470e;

        C1522a() {
            m36738e();
        }

        /* renamed from: a */
        void m36742a() {
            int mo35872m;
            if (this.f4469d) {
                mo35872m = this.f4466a.mo35876i();
            } else {
                mo35872m = this.f4466a.mo35872m();
            }
            this.f4468c = mo35872m;
        }

        /* renamed from: b */
        public void m36741b(View view, int i) {
            if (this.f4469d) {
                this.f4468c = this.f4466a.mo35881d(view) + this.f4466a.m35883o();
            } else {
                this.f4468c = this.f4466a.mo35878g(view);
            }
            this.f4467b = i;
        }

        /* renamed from: c */
        public void m36740c(View view, int i) {
            int m35883o = this.f4466a.m35883o();
            if (m35883o >= 0) {
                m36741b(view, i);
                return;
            }
            this.f4467b = i;
            if (this.f4469d) {
                int mo35876i = (this.f4466a.mo35876i() - m35883o) - this.f4466a.mo35881d(view);
                this.f4468c = this.f4466a.mo35876i() - mo35876i;
                if (mo35876i > 0) {
                    int mo35880e = this.f4468c - this.f4466a.mo35880e(view);
                    int mo35872m = this.f4466a.mo35872m();
                    int min = mo35880e - (mo35872m + Math.min(this.f4466a.mo35878g(view) - mo35872m, 0));
                    if (min < 0) {
                        this.f4468c += Math.min(mo35876i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo35878g = this.f4466a.mo35878g(view);
            int mo35872m2 = mo35878g - this.f4466a.mo35872m();
            this.f4468c = mo35878g;
            if (mo35872m2 > 0) {
                int mo35876i2 = (this.f4466a.mo35876i() - Math.min(0, (this.f4466a.mo35876i() - m35883o) - this.f4466a.mo35881d(view))) - (mo35878g + this.f4466a.mo35880e(view));
                if (mo35876i2 < 0) {
                    this.f4468c -= Math.min(mo35872m2, -mo35876i2);
                }
            }
        }

        /* renamed from: d */
        boolean m36739d(View view, RecyclerView.C1564z c1564z) {
            RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
            return !c1551p.m36404c() && c1551p.m36406a() >= 0 && c1551p.m36406a() < c1564z.m36329b();
        }

        /* renamed from: e */
        void m36738e() {
            this.f4467b = -1;
            this.f4468c = Integer.MIN_VALUE;
            this.f4469d = false;
            this.f4470e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4467b + ", mCoordinate=" + this.f4468c + ", mLayoutFromEnd=" + this.f4469d + ", mValid=" + this.f4470e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C1523b {

        /* renamed from: a */
        public int f4471a;

        /* renamed from: b */
        public boolean f4472b;

        /* renamed from: c */
        public boolean f4473c;

        /* renamed from: d */
        public boolean f4474d;

        protected C1523b() {
        }

        /* renamed from: a */
        void m36737a() {
            this.f4471a = 0;
            this.f4472b = false;
            this.f4473c = false;
            this.f4474d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C1524c {

        /* renamed from: b */
        int f4475b;

        /* renamed from: c */
        int f4476c;

        /* renamed from: d */
        int f4477d;

        /* renamed from: e */
        int f4478e;

        /* renamed from: f */
        int f4479f;

        /* renamed from: g */
        int f4480g;

        /* renamed from: j */
        boolean f4481j;

        /* renamed from: k */
        int f4482k;

        /* renamed from: m */
        boolean f4483m;

        /* renamed from: a */
        boolean f4484a = true;

        /* renamed from: h */
        int f4485h = 0;

        /* renamed from: i */
        int f4486i = 0;

        /* renamed from: l */
        List<RecyclerView.AbstractC1531c0> f4487l = null;

        C1524c() {
        }

        /* renamed from: e */
        private View m36732e() {
            int size = this.f4487l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4487l.get(i).f4581a;
                RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view.getLayoutParams();
                if (!c1551p.m36404c() && this.f4477d == c1551p.m36406a()) {
                    m36735b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m36736a() {
            m36735b(null);
        }

        /* renamed from: b */
        public void m36735b(View view) {
            View m36731f = m36731f(view);
            if (m36731f == null) {
                this.f4477d = -1;
            } else {
                this.f4477d = ((RecyclerView.C1551p) m36731f.getLayoutParams()).m36406a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m36734c(RecyclerView.C1564z c1564z) {
            int i = this.f4477d;
            return i >= 0 && i < c1564z.m36329b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public View m36733d(RecyclerView.C1558v c1558v) {
            if (this.f4487l != null) {
                return m36732e();
            }
            View m36363o = c1558v.m36363o(this.f4477d);
            this.f4477d += this.f4478e;
            return m36363o;
        }

        /* renamed from: f */
        public View m36731f(View view) {
            int m36406a;
            int size = this.f4487l.size();
            View view2 = null;
            int i = Reader.READ_DONE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4487l.get(i2).f4581a;
                RecyclerView.C1551p c1551p = (RecyclerView.C1551p) view3.getLayoutParams();
                if (view3 != view && !c1551p.m36404c() && (m36406a = (c1551p.m36406a() - this.f4477d) * this.f4478e) >= 0 && m36406a < i) {
                    view2 = view3;
                    if (m36406a == 0) {
                        break;
                    }
                    i = m36406a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A2 */
    private void m36802A2(RecyclerView.C1558v c1558v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m36428o1(i, c1558v);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            m36428o1(i3, c1558v);
        }
    }

    /* renamed from: B2 */
    private void m36801B2(RecyclerView.C1558v c1558v, int i, int i2) {
        int m36483K = m36483K();
        if (i < 0) {
            return;
        }
        int mo35877h = (this.f4457u.mo35877h() - i) + i2;
        if (this.f4460x) {
            for (int i3 = 0; i3 < m36483K; i3++) {
                View m36484J = m36484J(i3);
                if (this.f4457u.mo35878g(m36484J) < mo35877h || this.f4457u.mo35869q(m36484J) < mo35877h) {
                    m36802A2(c1558v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m36483K - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m36484J2 = m36484J(i5);
            if (this.f4457u.mo35878g(m36484J2) < mo35877h || this.f4457u.mo35869q(m36484J2) < mo35877h) {
                m36802A2(c1558v, i4, i5);
                return;
            }
        }
    }

    /* renamed from: C2 */
    private void m36800C2(RecyclerView.C1558v c1558v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m36483K = m36483K();
        if (!this.f4460x) {
            for (int i4 = 0; i4 < m36483K; i4++) {
                View m36484J = m36484J(i4);
                if (this.f4457u.mo35881d(m36484J) > i3 || this.f4457u.mo35870p(m36484J) > i3) {
                    m36802A2(c1558v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = m36483K - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View m36484J2 = m36484J(i6);
            if (this.f4457u.mo35881d(m36484J2) > i3 || this.f4457u.mo35870p(m36484J2) > i3) {
                m36802A2(c1558v, i5, i6);
                return;
            }
        }
    }

    /* renamed from: E2 */
    private void m36798E2() {
        if (this.f4455s != 1 && m36752u2()) {
            this.f4460x = !this.f4459w;
        } else {
            this.f4460x = this.f4459w;
        }
    }

    /* renamed from: K2 */
    private boolean m36792K2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, C1522a c1522a) {
        View m36760m2;
        int mo35872m;
        boolean z = false;
        if (m36483K() == 0) {
            return false;
        }
        View m36466W = m36466W();
        if (m36466W != null && c1522a.m36739d(m36466W, c1564z)) {
            c1522a.m36740c(m36466W, m36442i0(m36466W));
            return true;
        } else if (this.f4458v != this.f4461y) {
            return false;
        } else {
            if (c1522a.f4469d) {
                m36760m2 = m36761l2(c1558v, c1564z);
            } else {
                m36760m2 = m36760m2(c1558v, c1564z);
            }
            if (m36760m2 != null) {
                c1522a.m36741b(m36760m2, m36442i0(m36760m2));
                if (!c1564z.m36326e() && mo36302M1()) {
                    if (this.f4457u.mo35878g(m36760m2) >= this.f4457u.mo35876i() || this.f4457u.mo35881d(m36760m2) < this.f4457u.mo35872m()) {
                        z = true;
                    }
                    if (z) {
                        if (c1522a.f4469d) {
                            mo35872m = this.f4457u.mo35876i();
                        } else {
                            mo35872m = this.f4457u.mo35872m();
                        }
                        c1522a.f4468c = mo35872m;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: L2 */
    private boolean m36791L2(RecyclerView.C1564z c1564z, C1522a c1522a) {
        int i;
        int mo35878g;
        if (!c1564z.m36326e() && (i = this.f4447A) != -1) {
            if (i >= 0 && i < c1564z.m36329b()) {
                c1522a.f4467b = this.f4447A;
                SavedState savedState = this.f4450D;
                if (savedState != null && savedState.m36746a()) {
                    boolean z = this.f4450D.f4465y;
                    c1522a.f4469d = z;
                    if (z) {
                        c1522a.f4468c = this.f4457u.mo35876i() - this.f4450D.f4464x;
                    } else {
                        c1522a.f4468c = this.f4457u.mo35872m() + this.f4450D.f4464x;
                    }
                    return true;
                } else if (this.f4448B == Integer.MIN_VALUE) {
                    View mo36496D = mo36496D(this.f4447A);
                    if (mo36496D != null) {
                        if (this.f4457u.mo35880e(mo36496D) > this.f4457u.mo35871n()) {
                            c1522a.m36742a();
                            return true;
                        } else if (this.f4457u.mo35878g(mo36496D) - this.f4457u.mo35872m() < 0) {
                            c1522a.f4468c = this.f4457u.mo35872m();
                            c1522a.f4469d = false;
                            return true;
                        } else if (this.f4457u.mo35876i() - this.f4457u.mo35881d(mo36496D) < 0) {
                            c1522a.f4468c = this.f4457u.mo35876i();
                            c1522a.f4469d = true;
                            return true;
                        } else {
                            if (c1522a.f4469d) {
                                mo35878g = this.f4457u.mo35881d(mo36496D) + this.f4457u.m35883o();
                            } else {
                                mo35878g = this.f4457u.mo35878g(mo36496D);
                            }
                            c1522a.f4468c = mo35878g;
                        }
                    } else {
                        if (m36483K() > 0) {
                            c1522a.f4469d = (this.f4447A < m36442i0(m36484J(0))) == this.f4460x;
                        }
                        c1522a.m36742a();
                    }
                    return true;
                } else {
                    boolean z2 = this.f4460x;
                    c1522a.f4469d = z2;
                    if (z2) {
                        c1522a.f4468c = this.f4457u.mo35876i() - this.f4448B;
                    } else {
                        c1522a.f4468c = this.f4457u.mo35872m() + this.f4448B;
                    }
                    return true;
                }
            }
            this.f4447A = -1;
            this.f4448B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: M2 */
    private void m36790M2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, C1522a c1522a) {
        if (m36791L2(c1564z, c1522a) || m36792K2(c1558v, c1564z, c1522a)) {
            return;
        }
        c1522a.m36742a();
        c1522a.f4467b = this.f4461y ? c1564z.m36329b() - 1 : 0;
    }

    /* renamed from: N2 */
    private void m36789N2(int i, int i2, boolean z, RecyclerView.C1564z c1564z) {
        int mo35872m;
        this.f4456t.f4483m = m36799D2();
        this.f4456t.f4479f = i;
        int[] iArr = this.f4454H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo29916N1(c1564z, iArr);
        int max = Math.max(0, this.f4454H[0]);
        int max2 = Math.max(0, this.f4454H[1]);
        boolean z2 = i == 1;
        C1524c c1524c = this.f4456t;
        int i3 = z2 ? max2 : max;
        c1524c.f4485h = i3;
        if (!z2) {
            max = max2;
        }
        c1524c.f4486i = max;
        if (z2) {
            c1524c.f4485h = i3 + this.f4457u.mo35875j();
            View m36757p2 = m36757p2();
            C1524c c1524c2 = this.f4456t;
            c1524c2.f4478e = this.f4460x ? -1 : 1;
            int m36442i0 = m36442i0(m36757p2);
            C1524c c1524c3 = this.f4456t;
            c1524c2.f4477d = m36442i0 + c1524c3.f4478e;
            c1524c3.f4475b = this.f4457u.mo35881d(m36757p2);
            mo35872m = this.f4457u.mo35881d(m36757p2) - this.f4457u.mo35876i();
        } else {
            View m36756q2 = m36756q2();
            this.f4456t.f4485h += this.f4457u.mo35872m();
            C1524c c1524c4 = this.f4456t;
            c1524c4.f4478e = this.f4460x ? 1 : -1;
            int m36442i02 = m36442i0(m36756q2);
            C1524c c1524c5 = this.f4456t;
            c1524c4.f4477d = m36442i02 + c1524c5.f4478e;
            c1524c5.f4475b = this.f4457u.mo35878g(m36756q2);
            mo35872m = (-this.f4457u.mo35878g(m36756q2)) + this.f4457u.mo35872m();
        }
        C1524c c1524c6 = this.f4456t;
        c1524c6.f4476c = i2;
        if (z) {
            c1524c6.f4476c = i2 - mo35872m;
        }
        c1524c6.f4480g = mo35872m;
    }

    /* renamed from: O2 */
    private void m36787O2(int i, int i2) {
        this.f4456t.f4476c = this.f4457u.mo35876i() - i2;
        C1524c c1524c = this.f4456t;
        c1524c.f4478e = this.f4460x ? -1 : 1;
        c1524c.f4477d = i;
        c1524c.f4479f = 1;
        c1524c.f4475b = i2;
        c1524c.f4480g = Integer.MIN_VALUE;
    }

    /* renamed from: P1 */
    private int m36786P1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        m36778U1();
        return C1649w.m35851a(c1564z, this.f4457u, m36772a2(!this.f4462z, true), m36773Z1(!this.f4462z, true), this, this.f4462z);
    }

    /* renamed from: P2 */
    private void m36785P2(C1522a c1522a) {
        m36787O2(c1522a.f4467b, c1522a.f4468c);
    }

    /* renamed from: Q1 */
    private int m36784Q1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        m36778U1();
        return C1649w.m35850b(c1564z, this.f4457u, m36772a2(!this.f4462z, true), m36773Z1(!this.f4462z, true), this, this.f4462z, this.f4460x);
    }

    /* renamed from: Q2 */
    private void m36783Q2(int i, int i2) {
        this.f4456t.f4476c = i2 - this.f4457u.mo35872m();
        C1524c c1524c = this.f4456t;
        c1524c.f4477d = i;
        c1524c.f4478e = this.f4460x ? 1 : -1;
        c1524c.f4479f = -1;
        c1524c.f4475b = i2;
        c1524c.f4480g = Integer.MIN_VALUE;
    }

    /* renamed from: R1 */
    private int m36782R1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        m36778U1();
        return C1649w.m35849c(c1564z, this.f4457u, m36772a2(!this.f4462z, true), m36773Z1(!this.f4462z, true), this, this.f4462z);
    }

    /* renamed from: R2 */
    private void m36781R2(C1522a c1522a) {
        m36783Q2(c1522a.f4467b, c1522a.f4468c);
    }

    /* renamed from: X1 */
    private View m36775X1() {
        return m36766g2(0, m36483K());
    }

    /* renamed from: Y1 */
    private View m36774Y1(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return mo36762k2(c1558v, c1564z, 0, m36483K(), c1564z.m36329b());
    }

    /* renamed from: d2 */
    private View m36769d2() {
        return m36766g2(m36483K() - 1, -1);
    }

    /* renamed from: e2 */
    private View m36768e2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return mo36762k2(c1558v, c1564z, m36483K() - 1, -1, c1564z.m36329b());
    }

    /* renamed from: i2 */
    private View m36764i2() {
        return this.f4460x ? m36775X1() : m36769d2();
    }

    /* renamed from: j2 */
    private View m36763j2() {
        return this.f4460x ? m36769d2() : m36775X1();
    }

    /* renamed from: l2 */
    private View m36761l2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return this.f4460x ? m36774Y1(c1558v, c1564z) : m36768e2(c1558v, c1564z);
    }

    /* renamed from: m2 */
    private View m36760m2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return this.f4460x ? m36768e2(c1558v, c1564z) : m36774Y1(c1558v, c1564z);
    }

    /* renamed from: n2 */
    private int m36759n2(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, boolean z) {
        int mo35876i;
        int mo35876i2 = this.f4457u.mo35876i() - i;
        if (mo35876i2 > 0) {
            int i2 = -m36797F2(-mo35876i2, c1558v, c1564z);
            int i3 = i + i2;
            if (!z || (mo35876i = this.f4457u.mo35876i() - i3) <= 0) {
                return i2;
            }
            this.f4457u.mo35868r(mo35876i);
            return mo35876i + i2;
        }
        return 0;
    }

    /* renamed from: o2 */
    private int m36758o2(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, boolean z) {
        int mo35872m;
        int mo35872m2 = i - this.f4457u.mo35872m();
        if (mo35872m2 > 0) {
            int i2 = -m36797F2(mo35872m2, c1558v, c1564z);
            int i3 = i + i2;
            if (!z || (mo35872m = i3 - this.f4457u.mo35872m()) <= 0) {
                return i2;
            }
            this.f4457u.mo35868r(-mo35872m);
            return i2 - mo35872m;
        }
        return 0;
    }

    /* renamed from: p2 */
    private View m36757p2() {
        return m36484J(this.f4460x ? 0 : m36483K() - 1);
    }

    /* renamed from: q2 */
    private View m36756q2() {
        return m36484J(this.f4460x ? m36483K() - 1 : 0);
    }

    /* renamed from: x2 */
    private void m36749x2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, int i, int i2) {
        if (!c1564z.m36324g() || m36483K() == 0 || c1564z.m36326e() || !mo36302M1()) {
            return;
        }
        List<RecyclerView.AbstractC1531c0> m36367k = c1558v.m36367k();
        int size = m36367k.size();
        int m36442i0 = m36442i0(m36484J(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.AbstractC1531c0 abstractC1531c0 = m36367k.get(i5);
            if (!abstractC1531c0.m36556v()) {
                if ((abstractC1531c0.m36565m() < m36442i0) != this.f4460x ? true : true) {
                    i3 += this.f4457u.mo35880e(abstractC1531c0.f4581a);
                } else {
                    i4 += this.f4457u.mo35880e(abstractC1531c0.f4581a);
                }
            }
        }
        this.f4456t.f4487l = m36367k;
        if (i3 > 0) {
            m36783Q2(m36442i0(m36756q2()), i);
            C1524c c1524c = this.f4456t;
            c1524c.f4485h = i3;
            c1524c.f4476c = 0;
            c1524c.m36736a();
            m36777V1(c1558v, this.f4456t, c1564z, false);
        }
        if (i4 > 0) {
            m36787O2(m36442i0(m36757p2()), i2);
            C1524c c1524c2 = this.f4456t;
            c1524c2.f4485h = i4;
            c1524c2.f4476c = 0;
            c1524c2.m36736a();
            m36777V1(c1558v, this.f4456t, c1564z, false);
        }
        this.f4456t.f4487l = null;
    }

    /* renamed from: z2 */
    private void m36747z2(RecyclerView.C1558v c1558v, C1524c c1524c) {
        if (!c1524c.f4484a || c1524c.f4483m) {
            return;
        }
        int i = c1524c.f4480g;
        int i2 = c1524c.f4486i;
        if (c1524c.f4479f == -1) {
            m36801B2(c1558v, i, i2);
        } else {
            m36800C2(c1558v, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: D */
    public View mo36496D(int i) {
        int m36483K = m36483K();
        if (m36483K == 0) {
            return null;
        }
        int m36442i0 = i - m36442i0(m36484J(0));
        if (m36442i0 >= 0 && m36442i0 < m36483K) {
            View m36484J = m36484J(m36442i0);
            if (m36442i0(m36484J) == i) {
                return m36484J;
            }
        }
        return super.mo36496D(i);
    }

    /* renamed from: D2 */
    boolean m36799D2() {
        return this.f4457u.mo35874k() == 0 && this.f4457u.mo35877h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: E */
    public RecyclerView.C1551p mo36317E() {
        return new RecyclerView.C1551p(-2, -2);
    }

    /* renamed from: F2 */
    int m36797F2(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (m36483K() == 0 || i == 0) {
            return 0;
        }
        m36778U1();
        this.f4456t.f4484a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m36789N2(i2, abs, true, c1564z);
        C1524c c1524c = this.f4456t;
        int m36777V1 = c1524c.f4480g + m36777V1(c1558v, c1524c, c1564z, false);
        if (m36777V1 < 0) {
            return 0;
        }
        if (abs > m36777V1) {
            i = i2 * m36777V1;
        }
        this.f4457u.mo35868r(-i);
        this.f4456t.f4482k = i;
        return i;
    }

    /* renamed from: G2 */
    public void m36796G2(int i, int i2) {
        this.f4447A = i;
        this.f4448B = i2;
        SavedState savedState = this.f4450D;
        if (savedState != null) {
            savedState.m36745b();
        }
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: H1 */
    boolean mo36488H1() {
        return (m36463Y() == 1073741824 || m36424q0() == 1073741824 || !m36422r0()) ? false : true;
    }

    /* renamed from: H2 */
    public void m36795H2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo36261h(null);
        if (i != this.f4455s || this.f4457u == null) {
            AbstractC1642t m35885b = AbstractC1642t.m35885b(this, i);
            this.f4457u = m35885b;
            this.f4451E.f4466a = m35885b;
            this.f4455s = i;
            m36417u1();
        }
    }

    /* renamed from: I2 */
    public void m36794I2(boolean z) {
        mo36261h(null);
        if (z == this.f4459w) {
            return;
        }
        this.f4459w = z;
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: J0 */
    public void mo36308J0(RecyclerView recyclerView, RecyclerView.C1558v c1558v) {
        super.mo36308J0(recyclerView, c1558v);
        if (this.f4449C) {
            m36435l1(c1558v);
            c1558v.m36375c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: J1 */
    public void mo29858J1(RecyclerView recyclerView, RecyclerView.C1564z c1564z, int i) {
        C1635o c1635o = new C1635o(recyclerView.getContext());
        c1635o.m36338p(i);
        m36482K1(c1635o);
    }

    /* renamed from: J2 */
    public void mo36793J2(boolean z) {
        mo36261h(null);
        if (this.f4461y == z) {
            return;
        }
        this.f4461y = z;
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: K0 */
    public View mo36306K0(View view, int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        int m36780S1;
        View m36764i2;
        View m36757p2;
        m36798E2();
        if (m36483K() == 0 || (m36780S1 = m36780S1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m36778U1();
        m36789N2(m36780S1, (int) (this.f4457u.mo35871n() * 0.33333334f), false, c1564z);
        C1524c c1524c = this.f4456t;
        c1524c.f4480g = Integer.MIN_VALUE;
        c1524c.f4484a = false;
        m36777V1(c1558v, c1524c, c1564z, true);
        if (m36780S1 == -1) {
            m36764i2 = m36763j2();
        } else {
            m36764i2 = m36764i2();
        }
        if (m36780S1 == -1) {
            m36757p2 = m36756q2();
        } else {
            m36757p2 = m36757p2();
        }
        if (m36757p2.hasFocusable()) {
            if (m36764i2 == null) {
                return null;
            }
            return m36757p2;
        }
        return m36764i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: L0 */
    public void mo36304L0(AccessibilityEvent accessibilityEvent) {
        super.mo36304L0(accessibilityEvent);
        if (m36483K() > 0) {
            accessibilityEvent.setFromIndex(m36771b2());
            accessibilityEvent.setToIndex(m36767f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: M1 */
    public boolean mo36302M1() {
        return this.f4450D == null && this.f4458v == this.f4461y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N1 */
    public void mo29916N1(RecyclerView.C1564z c1564z, int[] iArr) {
        int i;
        int m36755r2 = m36755r2(c1564z);
        if (this.f4456t.f4479f == -1) {
            i = 0;
        } else {
            i = m36755r2;
            m36755r2 = 0;
        }
        iArr[0] = m36755r2;
        iArr[1] = i;
    }

    /* renamed from: O1 */
    void mo36788O1(RecyclerView.C1564z c1564z, C1524c c1524c, RecyclerView.AbstractC1546o.InterfaceC1549c interfaceC1549c) {
        int i = c1524c.f4477d;
        if (i < 0 || i >= c1564z.m36329b()) {
            return;
        }
        interfaceC1549c.mo36001a(i, Math.max(0, c1524c.f4480g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S1 */
    public int m36780S1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4455s == 1) ? 1 : Integer.MIN_VALUE : this.f4455s == 0 ? 1 : Integer.MIN_VALUE : this.f4455s == 1 ? -1 : Integer.MIN_VALUE : this.f4455s == 0 ? -1 : Integer.MIN_VALUE : (this.f4455s != 1 && m36752u2()) ? -1 : 1 : (this.f4455s != 1 && m36752u2()) ? 1 : -1;
    }

    /* renamed from: T1 */
    C1524c m36779T1() {
        return new C1524c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U1 */
    public void m36778U1() {
        if (this.f4456t == null) {
            this.f4456t = m36779T1();
        }
    }

    /* renamed from: V1 */
    int m36777V1(RecyclerView.C1558v c1558v, C1524c c1524c, RecyclerView.C1564z c1564z, boolean z) {
        int i = c1524c.f4476c;
        int i2 = c1524c.f4480g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c1524c.f4480g = i2 + i;
            }
            m36747z2(c1558v, c1524c);
        }
        int i3 = c1524c.f4476c + c1524c.f4485h;
        C1523b c1523b = this.f4452F;
        while (true) {
            if ((!c1524c.f4483m && i3 <= 0) || !c1524c.m36734c(c1564z)) {
                break;
            }
            c1523b.m36737a();
            mo36750w2(c1558v, c1564z, c1524c, c1523b);
            if (!c1523b.f4472b) {
                c1524c.f4475b += c1523b.f4471a * c1524c.f4479f;
                if (!c1523b.f4473c || c1524c.f4487l != null || !c1564z.m36326e()) {
                    int i4 = c1524c.f4476c;
                    int i5 = c1523b.f4471a;
                    c1524c.f4476c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c1524c.f4480g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c1523b.f4471a;
                    c1524c.f4480g = i7;
                    int i8 = c1524c.f4476c;
                    if (i8 < 0) {
                        c1524c.f4480g = i7 + i8;
                    }
                    m36747z2(c1558v, c1524c);
                }
                if (z && c1523b.f4474d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c1524c.f4476c;
    }

    /* renamed from: W1 */
    public int m36776W1() {
        View m36765h2 = m36765h2(0, m36483K(), true, false);
        if (m36765h2 == null) {
            return -1;
        }
        return m36442i0(m36765h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Y0 */
    public void mo36276Y0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        int i;
        int i2;
        int i3;
        int i4;
        int m36759n2;
        int i5;
        View mo36496D;
        int mo35878g;
        int i6;
        int i7 = -1;
        if ((this.f4450D != null || this.f4447A != -1) && c1564z.m36329b() == 0) {
            m36435l1(c1558v);
            return;
        }
        SavedState savedState = this.f4450D;
        if (savedState != null && savedState.m36746a()) {
            this.f4447A = this.f4450D.f4463w;
        }
        m36778U1();
        this.f4456t.f4484a = false;
        m36798E2();
        View m36466W = m36466W();
        C1522a c1522a = this.f4451E;
        if (c1522a.f4470e && this.f4447A == -1 && this.f4450D == null) {
            if (m36466W != null && (this.f4457u.mo35878g(m36466W) >= this.f4457u.mo35876i() || this.f4457u.mo35881d(m36466W) <= this.f4457u.mo35872m())) {
                this.f4451E.m36740c(m36466W, m36442i0(m36466W));
            }
        } else {
            c1522a.m36738e();
            C1522a c1522a2 = this.f4451E;
            c1522a2.f4469d = this.f4460x ^ this.f4461y;
            m36790M2(c1558v, c1564z, c1522a2);
            this.f4451E.f4470e = true;
        }
        C1524c c1524c = this.f4456t;
        c1524c.f4479f = c1524c.f4482k >= 0 ? 1 : -1;
        int[] iArr = this.f4454H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo29916N1(c1564z, iArr);
        int max = Math.max(0, this.f4454H[0]) + this.f4457u.mo35872m();
        int max2 = Math.max(0, this.f4454H[1]) + this.f4457u.mo35875j();
        if (c1564z.m36326e() && (i5 = this.f4447A) != -1 && this.f4448B != Integer.MIN_VALUE && (mo36496D = mo36496D(i5)) != null) {
            if (this.f4460x) {
                i6 = this.f4457u.mo35876i() - this.f4457u.mo35881d(mo36496D);
                mo35878g = this.f4448B;
            } else {
                mo35878g = this.f4457u.mo35878g(mo36496D) - this.f4457u.mo35872m();
                i6 = this.f4448B;
            }
            int i8 = i6 - mo35878g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        C1522a c1522a3 = this.f4451E;
        if (!c1522a3.f4469d ? !this.f4460x : this.f4460x) {
            i7 = 1;
        }
        mo36748y2(c1558v, c1564z, c1522a3, i7);
        m36412x(c1558v);
        this.f4456t.f4483m = m36799D2();
        this.f4456t.f4481j = c1564z.m36326e();
        this.f4456t.f4486i = 0;
        C1522a c1522a4 = this.f4451E;
        if (c1522a4.f4469d) {
            m36781R2(c1522a4);
            C1524c c1524c2 = this.f4456t;
            c1524c2.f4485h = max;
            m36777V1(c1558v, c1524c2, c1564z, false);
            C1524c c1524c3 = this.f4456t;
            i2 = c1524c3.f4475b;
            int i9 = c1524c3.f4477d;
            int i10 = c1524c3.f4476c;
            if (i10 > 0) {
                max2 += i10;
            }
            m36785P2(this.f4451E);
            C1524c c1524c4 = this.f4456t;
            c1524c4.f4485h = max2;
            c1524c4.f4477d += c1524c4.f4478e;
            m36777V1(c1558v, c1524c4, c1564z, false);
            C1524c c1524c5 = this.f4456t;
            i = c1524c5.f4475b;
            int i11 = c1524c5.f4476c;
            if (i11 > 0) {
                m36783Q2(i9, i2);
                C1524c c1524c6 = this.f4456t;
                c1524c6.f4485h = i11;
                m36777V1(c1558v, c1524c6, c1564z, false);
                i2 = this.f4456t.f4475b;
            }
        } else {
            m36785P2(c1522a4);
            C1524c c1524c7 = this.f4456t;
            c1524c7.f4485h = max2;
            m36777V1(c1558v, c1524c7, c1564z, false);
            C1524c c1524c8 = this.f4456t;
            i = c1524c8.f4475b;
            int i12 = c1524c8.f4477d;
            int i13 = c1524c8.f4476c;
            if (i13 > 0) {
                max += i13;
            }
            m36781R2(this.f4451E);
            C1524c c1524c9 = this.f4456t;
            c1524c9.f4485h = max;
            c1524c9.f4477d += c1524c9.f4478e;
            m36777V1(c1558v, c1524c9, c1564z, false);
            C1524c c1524c10 = this.f4456t;
            i2 = c1524c10.f4475b;
            int i14 = c1524c10.f4476c;
            if (i14 > 0) {
                m36787O2(i12, i);
                C1524c c1524c11 = this.f4456t;
                c1524c11.f4485h = i14;
                m36777V1(c1558v, c1524c11, c1564z, false);
                i = this.f4456t.f4475b;
            }
        }
        if (m36483K() > 0) {
            if (this.f4460x ^ this.f4461y) {
                int m36759n22 = m36759n2(i, c1558v, c1564z, true);
                i3 = i2 + m36759n22;
                i4 = i + m36759n22;
                m36759n2 = m36758o2(i3, c1558v, c1564z, false);
            } else {
                int m36758o2 = m36758o2(i2, c1558v, c1564z, true);
                i3 = i2 + m36758o2;
                i4 = i + m36758o2;
                m36759n2 = m36759n2(i4, c1558v, c1564z, false);
            }
            i2 = i3 + m36759n2;
            i = i4 + m36759n2;
        }
        m36749x2(c1558v, c1564z, i2, i);
        if (!c1564z.m36326e()) {
            this.f4457u.m35882s();
        } else {
            this.f4451E.m36738e();
        }
        this.f4458v = this.f4461y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Z0 */
    public void mo36274Z0(RecyclerView.C1564z c1564z) {
        super.mo36274Z0(c1564z);
        this.f4450D = null;
        this.f4447A = -1;
        this.f4448B = Integer.MIN_VALUE;
        this.f4451E.m36738e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public View m36773Z1(boolean z, boolean z2) {
        if (this.f4460x) {
            return m36765h2(0, m36483K(), z, z2);
        }
        return m36765h2(m36483K() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y.InterfaceC1563b
    /* renamed from: a */
    public PointF mo36272a(int i) {
        if (m36483K() == 0) {
            return null;
        }
        int i2 = (i < m36442i0(m36484J(0))) != this.f4460x ? -1 : 1;
        if (this.f4455s == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2 */
    public View m36772a2(boolean z, boolean z2) {
        if (this.f4460x) {
            return m36765h2(m36483K() - 1, -1, z, z2);
        }
        return m36765h2(0, m36483K(), z, z2);
    }

    @Override // androidx.recyclerview.widget.C1618k.InterfaceC1631j
    /* renamed from: b */
    public void mo35928b(View view, View view2, int i, int i2) {
        mo36261h("Cannot drop a view during a scroll or layout calculation");
        m36778U1();
        m36798E2();
        int m36442i0 = m36442i0(view);
        int m36442i02 = m36442i0(view2);
        boolean z = m36442i0 < m36442i02 ? true : true;
        if (this.f4460x) {
            if (z) {
                m36796G2(m36442i02, this.f4457u.mo35876i() - (this.f4457u.mo35878g(view2) + this.f4457u.mo35880e(view)));
            } else {
                m36796G2(m36442i02, this.f4457u.mo35876i() - this.f4457u.mo35881d(view2));
            }
        } else if (z) {
            m36796G2(m36442i02, this.f4457u.mo35878g(view2));
        } else {
            m36796G2(m36442i02, this.f4457u.mo35881d(view2) - this.f4457u.mo35880e(view));
        }
    }

    /* renamed from: b2 */
    public int m36771b2() {
        View m36765h2 = m36765h2(0, m36483K(), false, true);
        if (m36765h2 == null) {
            return -1;
        }
        return m36442i0(m36765h2);
    }

    /* renamed from: c2 */
    public int m36770c2() {
        View m36765h2 = m36765h2(m36483K() - 1, -1, true, false);
        if (m36765h2 == null) {
            return -1;
        }
        return m36442i0(m36765h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: d1 */
    public void mo36268d1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4450D = (SavedState) parcelable;
            m36417u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: e1 */
    public Parcelable mo36266e1() {
        if (this.f4450D != null) {
            return new SavedState(this.f4450D);
        }
        SavedState savedState = new SavedState();
        if (m36483K() > 0) {
            m36778U1();
            boolean z = this.f4458v ^ this.f4460x;
            savedState.f4465y = z;
            if (z) {
                View m36757p2 = m36757p2();
                savedState.f4464x = this.f4457u.mo35876i() - this.f4457u.mo35881d(m36757p2);
                savedState.f4463w = m36442i0(m36757p2);
            } else {
                View m36756q2 = m36756q2();
                savedState.f4463w = m36442i0(m36756q2);
                savedState.f4464x = this.f4457u.mo35878g(m36756q2) - this.f4457u.mo35872m();
            }
        } else {
            savedState.m36745b();
        }
        return savedState;
    }

    /* renamed from: f2 */
    public int m36767f2() {
        View m36765h2 = m36765h2(m36483K() - 1, -1, false, true);
        if (m36765h2 == null) {
            return -1;
        }
        return m36442i0(m36765h2);
    }

    /* renamed from: g2 */
    View m36766g2(int i, int i2) {
        int i3;
        int i4;
        m36778U1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m36484J(i);
        }
        if (this.f4457u.mo35878g(m36484J(i)) < this.f4457u.mo35872m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f4455s == 0) {
            return this.f4617e.m35810a(i, i2, i3, i4);
        }
        return this.f4618f.m35810a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: h */
    public void mo36261h(String str) {
        if (this.f4450D == null) {
            super.mo36261h(str);
        }
    }

    /* renamed from: h2 */
    View m36765h2(int i, int i2, boolean z, boolean z2) {
        m36778U1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.f4455s == 0) {
            return this.f4617e.m35810a(i, i2, i3, i4);
        }
        return this.f4618f.m35810a(i, i2, i3, i4);
    }

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
            if (m36442i0 >= 0 && m36442i0 < i3) {
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
    /* renamed from: l */
    public boolean mo36256l() {
        return this.f4455s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: m */
    public boolean mo36253m() {
        return this.f4455s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: p */
    public void mo36248p(int i, int i2, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1546o.InterfaceC1549c interfaceC1549c) {
        if (this.f4455s != 0) {
            i = i2;
        }
        if (m36483K() == 0 || i == 0) {
            return;
        }
        m36778U1();
        m36789N2(i > 0 ? 1 : -1, Math.abs(i), true, c1564z);
        mo36788O1(c1564z, this.f4456t, interfaceC1549c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: q */
    public void mo36425q(int i, RecyclerView.AbstractC1546o.InterfaceC1549c interfaceC1549c) {
        boolean z;
        int i2;
        SavedState savedState = this.f4450D;
        if (savedState != null && savedState.m36746a()) {
            SavedState savedState2 = this.f4450D;
            z = savedState2.f4465y;
            i2 = savedState2.f4463w;
        } else {
            m36798E2();
            z = this.f4460x;
            i2 = this.f4447A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f4453G && i2 >= 0 && i2 < i; i4++) {
            interfaceC1549c.mo36001a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: r */
    public int mo36245r(RecyclerView.C1564z c1564z) {
        return m36786P1(c1564z);
    }

    @Deprecated
    /* renamed from: r2 */
    protected int m36755r2(RecyclerView.C1564z c1564z) {
        if (c1564z.m36327d()) {
            return this.f4457u.mo35871n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: s */
    public int mo36243s(RecyclerView.C1564z c1564z) {
        return m36784Q1(c1564z);
    }

    /* renamed from: s2 */
    public int m36754s2() {
        return this.f4455s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: t */
    public int mo36241t(RecyclerView.C1564z c1564z) {
        return m36782R1(c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: t0 */
    public boolean mo36240t0() {
        return true;
    }

    /* renamed from: t2 */
    public boolean m36753t2() {
        return this.f4459w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: u */
    public int mo36238u(RecyclerView.C1564z c1564z) {
        return m36786P1(c1564z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u2 */
    public boolean m36752u2() {
        return m36461a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: v */
    public int mo36236v(RecyclerView.C1564z c1564z) {
        return m36784Q1(c1564z);
    }

    /* renamed from: v2 */
    public boolean m36751v2() {
        return this.f4462z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: w */
    public int mo36234w(RecyclerView.C1564z c1564z) {
        return m36782R1(c1564z);
    }

    /* renamed from: w2 */
    void mo36750w2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, C1524c c1524c, C1523b c1523b) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo35879f;
        View m36733d = c1524c.m36733d(c1558v);
        if (m36733d == null) {
            c1523b.f4472b = true;
            return;
        }
        RecyclerView.C1551p c1551p = (RecyclerView.C1551p) m36733d.getLayoutParams();
        if (c1524c.f4487l == null) {
            if (this.f4460x == (c1524c.f4479f == -1)) {
                m36452e(m36733d);
            } else {
                m36450f(m36733d, 0);
            }
        } else {
            if (this.f4460x == (c1524c.f4479f == -1)) {
                m36457c(m36733d);
            } else {
                m36454d(m36733d, 0);
            }
        }
        m36501B0(m36733d, 0, 0);
        c1523b.f4471a = this.f4457u.mo35880e(m36733d);
        if (this.f4455s == 1) {
            if (m36752u2()) {
                mo35879f = m36427p0() - m36447g0();
                i4 = mo35879f - this.f4457u.mo35879f(m36733d);
            } else {
                i4 = m36449f0();
                mo35879f = this.f4457u.mo35879f(m36733d) + i4;
            }
            if (c1524c.f4479f == -1) {
                int i5 = c1524c.f4475b;
                i3 = i5;
                i2 = mo35879f;
                i = i5 - c1523b.f4471a;
            } else {
                int i6 = c1524c.f4475b;
                i = i6;
                i2 = mo35879f;
                i3 = c1523b.f4471a + i6;
            }
        } else {
            int m36445h0 = m36445h0();
            int mo35879f2 = this.f4457u.mo35879f(m36733d) + m36445h0;
            if (c1524c.f4479f == -1) {
                int i7 = c1524c.f4475b;
                i2 = i7;
                i = m36445h0;
                i3 = mo35879f2;
                i4 = i7 - c1523b.f4471a;
            } else {
                int i8 = c1524c.f4475b;
                i = m36445h0;
                i2 = c1523b.f4471a + i8;
                i3 = mo35879f2;
                i4 = i8;
            }
        }
        m36504A0(m36733d, i4, i, i2, i3);
        if (c1551p.m36404c() || c1551p.m36405b()) {
            c1523b.f4473c = true;
        }
        c1523b.f4474d = m36733d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: x1 */
    public int mo36232x1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4455s == 1) {
            return 0;
        }
        return m36797F2(i, c1558v, c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: y1 */
    public void mo36230y1(int i) {
        this.f4447A = i;
        this.f4448B = Integer.MIN_VALUE;
        SavedState savedState = this.f4450D;
        if (savedState != null) {
            savedState.m36745b();
        }
        m36417u1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo36748y2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, C1522a c1522a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: z1 */
    public int mo36228z1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4455s == 0) {
            return 0;
        }
        return m36797F2(i, c1558v, c1564z);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4455s = 1;
        this.f4459w = false;
        this.f4460x = false;
        this.f4461y = false;
        this.f4462z = true;
        this.f4447A = -1;
        this.f4448B = Integer.MIN_VALUE;
        this.f4450D = null;
        this.f4451E = new C1522a();
        this.f4452F = new C1523b();
        this.f4453G = 2;
        this.f4454H = new int[2];
        m36795H2(i);
        m36794I2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4455s = 1;
        this.f4459w = false;
        this.f4460x = false;
        this.f4461y = false;
        this.f4462z = true;
        this.f4447A = -1;
        this.f4448B = Integer.MIN_VALUE;
        this.f4450D = null;
        this.f4451E = new C1522a();
        this.f4452F = new C1523b();
        this.f4453G = 2;
        this.f4454H = new int[2];
        RecyclerView.AbstractC1546o.C1550d m36440j0 = RecyclerView.AbstractC1546o.m36440j0(context, attributeSet, i, i2);
        m36795H2(m36440j0.f4633a);
        m36794I2(m36440j0.f4635c);
        mo36793J2(m36440j0.f4636d);
    }
}
