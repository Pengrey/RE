package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C1085c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1546o implements RecyclerView.AbstractC1561y.InterfaceC1563b {

    /* renamed from: B */
    private BitSet f4688B;

    /* renamed from: G */
    private boolean f4693G;

    /* renamed from: H */
    private boolean f4694H;

    /* renamed from: I */
    private SavedState f4695I;

    /* renamed from: J */
    private int f4696J;

    /* renamed from: O */
    private int[] f4701O;

    /* renamed from: t */
    C1570d[] f4704t;

    /* renamed from: u */
    AbstractC1642t f4705u;

    /* renamed from: v */
    AbstractC1642t f4706v;

    /* renamed from: w */
    private int f4707w;

    /* renamed from: x */
    private int f4708x;

    /* renamed from: y */
    private final C1634n f4709y;

    /* renamed from: s */
    private int f4703s = -1;

    /* renamed from: z */
    boolean f4710z = false;

    /* renamed from: A */
    boolean f4687A = false;

    /* renamed from: C */
    int f4689C = -1;

    /* renamed from: D */
    int f4690D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f4691E = new LazySpanLookup();

    /* renamed from: F */
    private int f4692F = 2;

    /* renamed from: K */
    private final Rect f4697K = new Rect();

    /* renamed from: L */
    private final C1568b f4698L = new C1568b();

    /* renamed from: M */
    private boolean f4699M = false;

    /* renamed from: N */
    private boolean f4700N = true;

    /* renamed from: P */
    private final Runnable f4702P = new RunnableC1567a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1566a();

        /* renamed from: A */
        int f4717A;

        /* renamed from: B */
        int[] f4718B;

        /* renamed from: C */
        List<LazySpanLookup.FullSpanItem> f4719C;

        /* renamed from: D */
        boolean f4720D;

        /* renamed from: E */
        boolean f4721E;

        /* renamed from: F */
        boolean f4722F;

        /* renamed from: w */
        int f4723w;

        /* renamed from: x */
        int f4724x;

        /* renamed from: y */
        int f4725y;

        /* renamed from: z */
        int[] f4726z;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        static class C1566a implements Parcelable.Creator<SavedState> {
            C1566a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        void m36208a() {
            this.f4726z = null;
            this.f4725y = 0;
            this.f4723w = -1;
            this.f4724x = -1;
        }

        /* renamed from: b */
        void m36207b() {
            this.f4726z = null;
            this.f4725y = 0;
            this.f4717A = 0;
            this.f4718B = null;
            this.f4719C = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4723w);
            parcel.writeInt(this.f4724x);
            parcel.writeInt(this.f4725y);
            if (this.f4725y > 0) {
                parcel.writeIntArray(this.f4726z);
            }
            parcel.writeInt(this.f4717A);
            if (this.f4717A > 0) {
                parcel.writeIntArray(this.f4718B);
            }
            parcel.writeInt(this.f4720D ? 1 : 0);
            parcel.writeInt(this.f4721E ? 1 : 0);
            parcel.writeInt(this.f4722F ? 1 : 0);
            parcel.writeList(this.f4719C);
        }

        SavedState(Parcel parcel) {
            this.f4723w = parcel.readInt();
            this.f4724x = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4725y = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4726z = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4717A = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4718B = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4720D = parcel.readInt() == 1;
            this.f4721E = parcel.readInt() == 1;
            this.f4722F = parcel.readInt() == 1;
            this.f4719C = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4725y = savedState.f4725y;
            this.f4723w = savedState.f4723w;
            this.f4724x = savedState.f4724x;
            this.f4726z = savedState.f4726z;
            this.f4717A = savedState.f4717A;
            this.f4718B = savedState.f4718B;
            this.f4720D = savedState.f4720D;
            this.f4721E = savedState.f4721E;
            this.f4722F = savedState.f4722F;
            this.f4719C = savedState.f4719C;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC1567a implements Runnable {
        RunnableC1567a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m36284T1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C1568b {

        /* renamed from: a */
        int f4728a;

        /* renamed from: b */
        int f4729b;

        /* renamed from: c */
        boolean f4730c;

        /* renamed from: d */
        boolean f4731d;

        /* renamed from: e */
        boolean f4732e;

        /* renamed from: f */
        int[] f4733f;

        C1568b() {
            m36202c();
        }

        /* renamed from: a */
        void m36204a() {
            this.f4729b = this.f4730c ? StaggeredGridLayoutManager.this.f4705u.mo35876i() : StaggeredGridLayoutManager.this.f4705u.mo35872m();
        }

        /* renamed from: b */
        void m36203b(int i) {
            if (this.f4730c) {
                this.f4729b = StaggeredGridLayoutManager.this.f4705u.mo35876i() - i;
            } else {
                this.f4729b = StaggeredGridLayoutManager.this.f4705u.mo35872m() + i;
            }
        }

        /* renamed from: c */
        void m36202c() {
            this.f4728a = -1;
            this.f4729b = Integer.MIN_VALUE;
            this.f4730c = false;
            this.f4731d = false;
            this.f4732e = false;
            int[] iArr = this.f4733f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m36201d(C1570d[] c1570dArr) {
            int length = c1570dArr.length;
            int[] iArr = this.f4733f;
            if (iArr == null || iArr.length < length) {
                this.f4733f = new int[StaggeredGridLayoutManager.this.f4704t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4733f[i] = c1570dArr[i].m36183p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C1569c extends RecyclerView.C1551p {

        /* renamed from: e */
        C1570d f4735e;

        /* renamed from: f */
        boolean f4736f;

        public C1569c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int m36200e() {
            C1570d c1570d = this.f4735e;
            if (c1570d == null) {
                return -1;
            }
            return c1570d.f4741e;
        }

        /* renamed from: f */
        public boolean m36199f() {
            return this.f4736f;
        }

        public C1569c(int i, int i2) {
            super(i, i2);
        }

        public C1569c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1569c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public class C1570d {

        /* renamed from: a */
        ArrayList<View> f4737a = new ArrayList<>();

        /* renamed from: b */
        int f4738b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4739c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4740d = 0;

        /* renamed from: e */
        final int f4741e;

        C1570d(int i) {
            this.f4741e = i;
        }

        /* renamed from: a */
        void m36198a(View view) {
            C1569c m36185n = m36185n(view);
            m36185n.f4735e = this;
            this.f4737a.add(view);
            this.f4739c = Integer.MIN_VALUE;
            if (this.f4737a.size() == 1) {
                this.f4738b = Integer.MIN_VALUE;
            }
            if (m36185n.m36404c() || m36185n.m36405b()) {
                this.f4740d += StaggeredGridLayoutManager.this.f4705u.mo35880e(view);
            }
        }

        /* renamed from: b */
        void m36197b(boolean z, int i) {
            int m36183p;
            if (z) {
                m36183p = m36187l(Integer.MIN_VALUE);
            } else {
                m36183p = m36183p(Integer.MIN_VALUE);
            }
            m36194e();
            if (m36183p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m36183p >= StaggeredGridLayoutManager.this.f4705u.mo35876i()) {
                if (z || m36183p <= StaggeredGridLayoutManager.this.f4705u.mo35872m()) {
                    if (i != Integer.MIN_VALUE) {
                        m36183p += i;
                    }
                    this.f4739c = m36183p;
                    this.f4738b = m36183p;
                }
            }
        }

        /* renamed from: c */
        void m36196c() {
            LazySpanLookup.FullSpanItem m36221f;
            ArrayList<View> arrayList = this.f4737a;
            View view = arrayList.get(arrayList.size() - 1);
            C1569c m36185n = m36185n(view);
            this.f4739c = StaggeredGridLayoutManager.this.f4705u.mo35881d(view);
            if (m36185n.f4736f && (m36221f = StaggeredGridLayoutManager.this.f4691E.m36221f(m36185n.m36406a())) != null && m36221f.f4714x == 1) {
                this.f4739c += m36221f.m36211a(this.f4741e);
            }
        }

        /* renamed from: d */
        void m36195d() {
            LazySpanLookup.FullSpanItem m36221f;
            View view = this.f4737a.get(0);
            C1569c m36185n = m36185n(view);
            this.f4738b = StaggeredGridLayoutManager.this.f4705u.mo35878g(view);
            if (m36185n.f4736f && (m36221f = StaggeredGridLayoutManager.this.f4691E.m36221f(m36185n.m36406a())) != null && m36221f.f4714x == -1) {
                this.f4738b -= m36221f.m36211a(this.f4741e);
            }
        }

        /* renamed from: e */
        void m36194e() {
            this.f4737a.clear();
            m36182q();
            this.f4740d = 0;
        }

        /* renamed from: f */
        public int m36193f() {
            if (StaggeredGridLayoutManager.this.f4710z) {
                return m36190i(this.f4737a.size() - 1, -1, true);
            }
            return m36190i(0, this.f4737a.size(), true);
        }

        /* renamed from: g */
        public int m36192g() {
            if (StaggeredGridLayoutManager.this.f4710z) {
                return m36190i(0, this.f4737a.size(), true);
            }
            return m36190i(this.f4737a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m36191h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int mo35872m = StaggeredGridLayoutManager.this.f4705u.mo35872m();
            int mo35876i = StaggeredGridLayoutManager.this.f4705u.mo35876i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f4737a.get(i);
                int mo35878g = StaggeredGridLayoutManager.this.f4705u.mo35878g(view);
                int mo35881d = StaggeredGridLayoutManager.this.f4705u.mo35881d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo35878g >= mo35876i : mo35878g > mo35876i;
                if (!z3 ? mo35881d > mo35872m : mo35881d >= mo35872m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (mo35878g >= mo35872m && mo35881d <= mo35876i) {
                            return StaggeredGridLayoutManager.this.m36442i0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.m36442i0(view);
                    } else {
                        if (mo35878g < mo35872m || mo35881d > mo35876i) {
                            return StaggeredGridLayoutManager.this.m36442i0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        int m36190i(int i, int i2, boolean z) {
            return m36191h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m36189j() {
            return this.f4740d;
        }

        /* renamed from: k */
        int m36188k() {
            int i = this.f4739c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m36196c();
            return this.f4739c;
        }

        /* renamed from: l */
        int m36187l(int i) {
            int i2 = this.f4739c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4737a.size() == 0) {
                return i;
            }
            m36196c();
            return this.f4739c;
        }

        /* renamed from: m */
        public View m36186m(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f4737a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f4737a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4710z && staggeredGridLayoutManager.m36442i0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4710z && staggeredGridLayoutManager2.m36442i0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f4737a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f4737a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4710z && staggeredGridLayoutManager3.m36442i0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4710z && staggeredGridLayoutManager4.m36442i0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C1569c m36185n(View view) {
            return (C1569c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m36184o() {
            int i = this.f4738b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m36195d();
            return this.f4738b;
        }

        /* renamed from: p */
        int m36183p(int i) {
            int i2 = this.f4738b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4737a.size() == 0) {
                return i;
            }
            m36195d();
            return this.f4738b;
        }

        /* renamed from: q */
        void m36182q() {
            this.f4738b = Integer.MIN_VALUE;
            this.f4739c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m36181r(int i) {
            int i2 = this.f4738b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4738b = i2 + i;
            }
            int i3 = this.f4739c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4739c = i3 + i;
            }
        }

        /* renamed from: s */
        void m36180s() {
            int size = this.f4737a.size();
            View remove = this.f4737a.remove(size - 1);
            C1569c m36185n = m36185n(remove);
            m36185n.f4735e = null;
            if (m36185n.m36404c() || m36185n.m36405b()) {
                this.f4740d -= StaggeredGridLayoutManager.this.f4705u.mo35880e(remove);
            }
            if (size == 1) {
                this.f4738b = Integer.MIN_VALUE;
            }
            this.f4739c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m36179t() {
            View remove = this.f4737a.remove(0);
            C1569c m36185n = m36185n(remove);
            m36185n.f4735e = null;
            if (this.f4737a.size() == 0) {
                this.f4739c = Integer.MIN_VALUE;
            }
            if (m36185n.m36404c() || m36185n.m36405b()) {
                this.f4740d -= StaggeredGridLayoutManager.this.f4705u.mo35880e(remove);
            }
            this.f4738b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m36178u(View view) {
            C1569c m36185n = m36185n(view);
            m36185n.f4735e = this;
            this.f4737a.add(0, view);
            this.f4738b = Integer.MIN_VALUE;
            if (this.f4737a.size() == 1) {
                this.f4739c = Integer.MIN_VALUE;
            }
            if (m36185n.m36404c() || m36185n.m36405b()) {
                this.f4740d += StaggeredGridLayoutManager.this.f4705u.mo35880e(view);
            }
        }

        /* renamed from: v */
        void m36177v(int i) {
            this.f4738b = i;
            this.f4739c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC1546o.C1550d m36440j0 = RecyclerView.AbstractC1546o.m36440j0(context, attributeSet, i, i2);
        m36309I2(m36440j0.f4633a);
        m36305K2(m36440j0.f4634b);
        m36307J2(m36440j0.f4635c);
        this.f4709y = new C1634n();
        m36270b2();
    }

    /* renamed from: A2 */
    private void m36323A2(View view) {
        for (int i = this.f4703s - 1; i >= 0; i--) {
            this.f4704t[i].m36178u(view);
        }
    }

    /* renamed from: B2 */
    private void m36322B2(RecyclerView.C1558v c1558v, C1634n c1634n) {
        int min;
        int min2;
        if (!c1634n.f4978a || c1634n.f4986i) {
            return;
        }
        if (c1634n.f4979b == 0) {
            if (c1634n.f4982e == -1) {
                m36321C2(c1558v, c1634n.f4984g);
            } else {
                m36318D2(c1558v, c1634n.f4983f);
            }
        } else if (c1634n.f4982e == -1) {
            int i = c1634n.f4983f;
            int m36250n2 = i - m36250n2(i);
            if (m36250n2 < 0) {
                min2 = c1634n.f4984g;
            } else {
                min2 = c1634n.f4984g - Math.min(m36250n2, c1634n.f4979b);
            }
            m36321C2(c1558v, min2);
        } else {
            int m36249o2 = m36249o2(c1634n.f4984g) - c1634n.f4984g;
            if (m36249o2 < 0) {
                min = c1634n.f4983f;
            } else {
                min = Math.min(m36249o2, c1634n.f4979b) + c1634n.f4983f;
            }
            m36318D2(c1558v, min);
        }
    }

    /* renamed from: C2 */
    private void m36321C2(RecyclerView.C1558v c1558v, int i) {
        for (int m36483K = m36483K() - 1; m36483K >= 0; m36483K--) {
            View m36484J = m36484J(m36483K);
            if (this.f4705u.mo35878g(m36484J) < i || this.f4705u.mo35869q(m36484J) < i) {
                return;
            }
            C1569c c1569c = (C1569c) m36484J.getLayoutParams();
            if (c1569c.f4736f) {
                for (int i2 = 0; i2 < this.f4703s; i2++) {
                    if (this.f4704t[i2].f4737a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4703s; i3++) {
                    this.f4704t[i3].m36180s();
                }
            } else if (c1569c.f4735e.f4737a.size() == 1) {
                return;
            } else {
                c1569c.f4735e.m36180s();
            }
            m36431n1(m36484J, c1558v);
        }
    }

    /* renamed from: D2 */
    private void m36318D2(RecyclerView.C1558v c1558v, int i) {
        while (m36483K() > 0) {
            View m36484J = m36484J(0);
            if (this.f4705u.mo35881d(m36484J) > i || this.f4705u.mo35870p(m36484J) > i) {
                return;
            }
            C1569c c1569c = (C1569c) m36484J.getLayoutParams();
            if (c1569c.f4736f) {
                for (int i2 = 0; i2 < this.f4703s; i2++) {
                    if (this.f4704t[i2].f4737a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4703s; i3++) {
                    this.f4704t[i3].m36179t();
                }
            } else if (c1569c.f4735e.f4737a.size() == 1) {
                return;
            } else {
                c1569c.f4735e.m36179t();
            }
            m36431n1(m36484J, c1558v);
        }
    }

    /* renamed from: E2 */
    private void m36315E2() {
        if (this.f4706v.mo35874k() == 1073741824) {
            return;
        }
        float f = 0.0f;
        int m36483K = m36483K();
        for (int i = 0; i < m36483K; i++) {
            View m36484J = m36484J(i);
            float mo35880e = this.f4706v.mo35880e(m36484J);
            if (mo35880e >= f) {
                if (((C1569c) m36484J.getLayoutParams()).m36199f()) {
                    mo35880e = (mo35880e * 1.0f) / this.f4703s;
                }
                f = Math.max(f, mo35880e);
            }
        }
        int i2 = this.f4708x;
        int round = Math.round(f * this.f4703s);
        if (this.f4706v.mo35874k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4706v.mo35871n());
        }
        m36291Q2(round);
        if (this.f4708x == i2) {
            return;
        }
        for (int i3 = 0; i3 < m36483K; i3++) {
            View m36484J2 = m36484J(i3);
            C1569c c1569c = (C1569c) m36484J2.getLayoutParams();
            if (!c1569c.f4736f) {
                if (m36237u2() && this.f4707w == 1) {
                    int i4 = this.f4703s;
                    int i5 = c1569c.f4735e.f4741e;
                    m36484J2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f4708x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c1569c.f4735e.f4741e;
                    int i7 = this.f4708x * i6;
                    int i8 = i6 * i2;
                    if (this.f4707w == 1) {
                        m36484J2.offsetLeftAndRight(i7 - i8);
                    } else {
                        m36484J2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* renamed from: F2 */
    private void m36313F2() {
        if (this.f4707w != 1 && m36237u2()) {
            this.f4687A = !this.f4710z;
        } else {
            this.f4687A = this.f4710z;
        }
    }

    /* renamed from: H2 */
    private void m36310H2(int i) {
        C1634n c1634n = this.f4709y;
        c1634n.f4982e = i;
        c1634n.f4981d = this.f4687A != (i == -1) ? -1 : 1;
    }

    /* renamed from: L2 */
    private void m36303L2(int i, int i2) {
        for (int i3 = 0; i3 < this.f4703s; i3++) {
            if (!this.f4704t[i3].f4737a.isEmpty()) {
                m36289R2(this.f4704t[i3], i, i2);
            }
        }
    }

    /* renamed from: M2 */
    private boolean m36301M2(RecyclerView.C1564z c1564z, C1568b c1568b) {
        int m36267d2;
        if (this.f4693G) {
            m36267d2 = m36260h2(c1564z.m36329b());
        } else {
            m36267d2 = m36267d2(c1564z.m36329b());
        }
        c1568b.f4728a = m36267d2;
        c1568b.f4729b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: N1 */
    private void m36300N1(View view) {
        for (int i = this.f4703s - 1; i >= 0; i--) {
            this.f4704t[i].m36198a(view);
        }
    }

    /* renamed from: O1 */
    private void m36297O1(C1568b c1568b) {
        int mo35872m;
        SavedState savedState = this.f4695I;
        int i = savedState.f4725y;
        if (i > 0) {
            if (i == this.f4703s) {
                for (int i2 = 0; i2 < this.f4703s; i2++) {
                    this.f4704t[i2].m36194e();
                    SavedState savedState2 = this.f4695I;
                    int i3 = savedState2.f4726z[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.f4721E) {
                            mo35872m = this.f4705u.mo35876i();
                        } else {
                            mo35872m = this.f4705u.mo35872m();
                        }
                        i3 += mo35872m;
                    }
                    this.f4704t[i2].m36177v(i3);
                }
            } else {
                savedState.m36207b();
                SavedState savedState3 = this.f4695I;
                savedState3.f4723w = savedState3.f4724x;
            }
        }
        SavedState savedState4 = this.f4695I;
        this.f4694H = savedState4.f4722F;
        m36307J2(savedState4.f4720D);
        m36313F2();
        SavedState savedState5 = this.f4695I;
        int i4 = savedState5.f4723w;
        if (i4 != -1) {
            this.f4689C = i4;
            c1568b.f4730c = savedState5.f4721E;
        } else {
            c1568b.f4730c = this.f4687A;
        }
        if (savedState5.f4717A > 1) {
            LazySpanLookup lazySpanLookup = this.f4691E;
            lazySpanLookup.f4711a = savedState5.f4718B;
            lazySpanLookup.f4712b = savedState5.f4719C;
        }
    }

    /* renamed from: P2 */
    private void m36294P2(int i, RecyclerView.C1564z c1564z) {
        int i2;
        int i3;
        int m36328c;
        C1634n c1634n = this.f4709y;
        boolean z = false;
        c1634n.f4979b = 0;
        c1634n.f4980c = i;
        if (!m36409y0() || (m36328c = c1564z.m36328c()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f4687A == (m36328c < i)) {
                i2 = this.f4705u.mo35871n();
                i3 = 0;
            } else {
                i3 = this.f4705u.mo35871n();
                i2 = 0;
            }
        }
        if (m36477N()) {
            this.f4709y.f4983f = this.f4705u.mo35872m() - i3;
            this.f4709y.f4984g = this.f4705u.mo35876i() + i2;
        } else {
            this.f4709y.f4984g = this.f4705u.mo35877h() + i2;
            this.f4709y.f4983f = -i3;
        }
        C1634n c1634n2 = this.f4709y;
        c1634n2.f4985h = false;
        c1634n2.f4978a = true;
        if (this.f4705u.mo35874k() == 0 && this.f4705u.mo35877h() == 0) {
            z = true;
        }
        c1634n2.f4986i = z;
    }

    /* renamed from: R1 */
    private void m36290R1(View view, C1569c c1569c, C1634n c1634n) {
        if (c1634n.f4982e == 1) {
            if (c1569c.f4736f) {
                m36300N1(view);
            } else {
                c1569c.f4735e.m36198a(view);
            }
        } else if (c1569c.f4736f) {
            m36323A2(view);
        } else {
            c1569c.f4735e.m36178u(view);
        }
    }

    /* renamed from: R2 */
    private void m36289R2(C1570d c1570d, int i, int i2) {
        int m36189j = c1570d.m36189j();
        if (i == -1) {
            if (c1570d.m36184o() + m36189j <= i2) {
                this.f4688B.set(c1570d.f4741e, false);
            }
        } else if (c1570d.m36188k() - m36189j >= i2) {
            this.f4688B.set(c1570d.f4741e, false);
        }
    }

    /* renamed from: S1 */
    private int m36287S1(int i) {
        if (m36483K() == 0) {
            return this.f4687A ? 1 : -1;
        }
        return (i < m36257k2()) != this.f4687A ? -1 : 1;
    }

    /* renamed from: S2 */
    private int m36286S2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: U1 */
    private boolean m36282U1(C1570d c1570d) {
        if (this.f4687A) {
            if (c1570d.m36188k() < this.f4705u.mo35876i()) {
                ArrayList<View> arrayList = c1570d.f4737a;
                return !c1570d.m36185n(arrayList.get(arrayList.size() - 1)).f4736f;
            }
        } else if (c1570d.m36184o() > this.f4705u.mo35872m()) {
            return !c1570d.m36185n(c1570d.f4737a.get(0)).f4736f;
        }
        return false;
    }

    /* renamed from: V1 */
    private int m36280V1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        return C1649w.m35851a(c1564z, this.f4705u, m36263f2(!this.f4700N), m36265e2(!this.f4700N), this, this.f4700N);
    }

    /* renamed from: W1 */
    private int m36279W1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        return C1649w.m35850b(c1564z, this.f4705u, m36263f2(!this.f4700N), m36265e2(!this.f4700N), this, this.f4700N, this.f4687A);
    }

    /* renamed from: X1 */
    private int m36277X1(RecyclerView.C1564z c1564z) {
        if (m36483K() == 0) {
            return 0;
        }
        return C1649w.m35849c(c1564z, this.f4705u, m36263f2(!this.f4700N), m36265e2(!this.f4700N), this, this.f4700N);
    }

    /* renamed from: Y1 */
    private int m36275Y1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4707w == 1) ? 1 : Integer.MIN_VALUE : this.f4707w == 0 ? 1 : Integer.MIN_VALUE : this.f4707w == 1 ? -1 : Integer.MIN_VALUE : this.f4707w == 0 ? -1 : Integer.MIN_VALUE : (this.f4707w != 1 && m36237u2()) ? -1 : 1 : (this.f4707w != 1 && m36237u2()) ? 1 : -1;
    }

    /* renamed from: Z1 */
    private LazySpanLookup.FullSpanItem m36273Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4715y = new int[this.f4703s];
        for (int i2 = 0; i2 < this.f4703s; i2++) {
            fullSpanItem.f4715y[i2] = i - this.f4704t[i2].m36187l(i);
        }
        return fullSpanItem;
    }

    /* renamed from: a2 */
    private LazySpanLookup.FullSpanItem m36271a2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4715y = new int[this.f4703s];
        for (int i2 = 0; i2 < this.f4703s; i2++) {
            fullSpanItem.f4715y[i2] = this.f4704t[i2].m36183p(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: b2 */
    private void m36270b2() {
        this.f4705u = AbstractC1642t.m35885b(this, this.f4707w);
        this.f4706v = AbstractC1642t.m35885b(this, 1 - this.f4707w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: c2 */
    private int m36269c2(RecyclerView.C1558v c1558v, C1634n c1634n, RecyclerView.C1564z c1564z) {
        int i;
        int mo35872m;
        int m36252m2;
        C1570d c1570d;
        int mo35880e;
        int i2;
        int i3;
        int mo35880e2;
        boolean z;
        boolean m36292Q1;
        ?? r9 = 0;
        this.f4688B.set(0, this.f4703s, true);
        if (this.f4709y.f4986i) {
            i = c1634n.f4982e == 1 ? Reader.READ_DONE : Integer.MIN_VALUE;
        } else if (c1634n.f4982e == 1) {
            i = c1634n.f4984g + c1634n.f4979b;
        } else {
            i = c1634n.f4983f - c1634n.f4979b;
        }
        int i4 = i;
        m36303L2(c1634n.f4982e, i4);
        if (this.f4687A) {
            mo35872m = this.f4705u.mo35876i();
        } else {
            mo35872m = this.f4705u.mo35872m();
        }
        int i5 = mo35872m;
        boolean z2 = false;
        while (c1634n.m35922a(c1564z) && (this.f4709y.f4986i || !this.f4688B.isEmpty())) {
            View m35921b = c1634n.m35921b(c1558v);
            C1569c c1569c = (C1569c) m35921b.getLayoutParams();
            int m36406a = c1569c.m36406a();
            int m36220g = this.f4691E.m36220g(m36406a);
            boolean z3 = m36220g == -1 ? true : r9;
            if (z3) {
                c1570d = c1569c.f4736f ? this.f4704t[r9] : m36246q2(c1634n);
                this.f4691E.m36213n(m36406a, c1570d);
            } else {
                c1570d = this.f4704t[m36220g];
            }
            C1570d c1570d2 = c1570d;
            c1569c.f4735e = c1570d2;
            if (c1634n.f4982e == 1) {
                m36452e(m35921b);
            } else {
                m36450f(m35921b, r9);
            }
            m36233w2(m35921b, c1569c, r9);
            if (c1634n.f4982e == 1) {
                int m36252m22 = c1569c.f4736f ? m36252m2(i5) : c1570d2.m36187l(i5);
                int mo35880e3 = this.f4705u.mo35880e(m35921b) + m36252m22;
                if (z3 && c1569c.f4736f) {
                    LazySpanLookup.FullSpanItem m36273Z1 = m36273Z1(m36252m22);
                    m36273Z1.f4714x = -1;
                    m36273Z1.f4713w = m36406a;
                    this.f4691E.m36226a(m36273Z1);
                }
                i2 = mo35880e3;
                mo35880e = m36252m22;
            } else {
                int m36247p2 = c1569c.f4736f ? m36247p2(i5) : c1570d2.m36183p(i5);
                mo35880e = m36247p2 - this.f4705u.mo35880e(m35921b);
                if (z3 && c1569c.f4736f) {
                    LazySpanLookup.FullSpanItem m36271a2 = m36271a2(m36247p2);
                    m36271a2.f4714x = 1;
                    m36271a2.f4713w = m36406a;
                    this.f4691E.m36226a(m36271a2);
                }
                i2 = m36247p2;
            }
            if (c1569c.f4736f && c1634n.f4981d == -1) {
                if (z3) {
                    this.f4699M = true;
                } else {
                    if (c1634n.f4982e == 1) {
                        m36292Q1 = m36295P1();
                    } else {
                        m36292Q1 = m36292Q1();
                    }
                    if (!m36292Q1) {
                        LazySpanLookup.FullSpanItem m36221f = this.f4691E.m36221f(m36406a);
                        if (m36221f != null) {
                            m36221f.f4716z = true;
                        }
                        this.f4699M = true;
                    }
                }
            }
            m36290R1(m35921b, c1569c, c1634n);
            if (m36237u2() && this.f4707w == 1) {
                int mo35876i = c1569c.f4736f ? this.f4706v.mo35876i() : this.f4706v.mo35876i() - (((this.f4703s - 1) - c1570d2.f4741e) * this.f4708x);
                mo35880e2 = mo35876i;
                i3 = mo35876i - this.f4706v.mo35880e(m35921b);
            } else {
                int mo35872m2 = c1569c.f4736f ? this.f4706v.mo35872m() : (c1570d2.f4741e * this.f4708x) + this.f4706v.mo35872m();
                i3 = mo35872m2;
                mo35880e2 = this.f4706v.mo35880e(m35921b) + mo35872m2;
            }
            if (this.f4707w == 1) {
                m36504A0(m35921b, i3, mo35880e, mo35880e2, i2);
            } else {
                m36504A0(m35921b, mo35880e, i3, i2, mo35880e2);
            }
            if (c1569c.f4736f) {
                m36303L2(this.f4709y.f4982e, i4);
            } else {
                m36289R2(c1570d2, this.f4709y.f4982e, i4);
            }
            m36322B2(c1558v, this.f4709y);
            if (this.f4709y.f4985h && m35921b.hasFocusable()) {
                if (c1569c.f4736f) {
                    this.f4688B.clear();
                } else {
                    z = false;
                    this.f4688B.set(c1570d2.f4741e, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i6 = r9;
        if (!z2) {
            m36322B2(c1558v, this.f4709y);
        }
        if (this.f4709y.f4982e == -1) {
            m36252m2 = this.f4705u.mo35872m() - m36247p2(this.f4705u.mo35872m());
        } else {
            m36252m2 = m36252m2(this.f4705u.mo35876i()) - this.f4705u.mo35876i();
        }
        return m36252m2 > 0 ? Math.min(c1634n.f4979b, m36252m2) : i6;
    }

    /* renamed from: d2 */
    private int m36267d2(int i) {
        int m36483K = m36483K();
        for (int i2 = 0; i2 < m36483K; i2++) {
            int m36442i0 = m36442i0(m36484J(i2));
            if (m36442i0 >= 0 && m36442i0 < i) {
                return m36442i0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private int m36260h2(int i) {
        for (int m36483K = m36483K() - 1; m36483K >= 0; m36483K--) {
            int m36442i0 = m36442i0(m36484J(m36483K));
            if (m36442i0 >= 0 && m36442i0 < i) {
                return m36442i0;
            }
        }
        return 0;
    }

    /* renamed from: i2 */
    private void m36259i2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, boolean z) {
        int mo35876i;
        int m36252m2 = m36252m2(Integer.MIN_VALUE);
        if (m36252m2 != Integer.MIN_VALUE && (mo35876i = this.f4705u.mo35876i() - m36252m2) > 0) {
            int i = mo35876i - (-m36311G2(-mo35876i, c1558v, c1564z));
            if (!z || i <= 0) {
                return;
            }
            this.f4705u.mo35868r(i);
        }
    }

    /* renamed from: j2 */
    private void m36258j2(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, boolean z) {
        int mo35872m;
        int m36247p2 = m36247p2(Reader.READ_DONE);
        if (m36247p2 != Integer.MAX_VALUE && (mo35872m = m36247p2 - this.f4705u.mo35872m()) > 0) {
            int m36311G2 = mo35872m - m36311G2(mo35872m, c1558v, c1564z);
            if (!z || m36311G2 <= 0) {
                return;
            }
            this.f4705u.mo35868r(-m36311G2);
        }
    }

    /* renamed from: m2 */
    private int m36252m2(int i) {
        int m36187l = this.f4704t[0].m36187l(i);
        for (int i2 = 1; i2 < this.f4703s; i2++) {
            int m36187l2 = this.f4704t[i2].m36187l(i);
            if (m36187l2 > m36187l) {
                m36187l = m36187l2;
            }
        }
        return m36187l;
    }

    /* renamed from: n2 */
    private int m36250n2(int i) {
        int m36183p = this.f4704t[0].m36183p(i);
        for (int i2 = 1; i2 < this.f4703s; i2++) {
            int m36183p2 = this.f4704t[i2].m36183p(i);
            if (m36183p2 > m36183p) {
                m36183p = m36183p2;
            }
        }
        return m36183p;
    }

    /* renamed from: o2 */
    private int m36249o2(int i) {
        int m36187l = this.f4704t[0].m36187l(i);
        for (int i2 = 1; i2 < this.f4703s; i2++) {
            int m36187l2 = this.f4704t[i2].m36187l(i);
            if (m36187l2 < m36187l) {
                m36187l = m36187l2;
            }
        }
        return m36187l;
    }

    /* renamed from: p2 */
    private int m36247p2(int i) {
        int m36183p = this.f4704t[0].m36183p(i);
        for (int i2 = 1; i2 < this.f4703s; i2++) {
            int m36183p2 = this.f4704t[i2].m36183p(i);
            if (m36183p2 < m36183p) {
                m36183p = m36183p2;
            }
        }
        return m36183p;
    }

    /* renamed from: q2 */
    private C1570d m36246q2(C1634n c1634n) {
        int i;
        int i2;
        int i3 = -1;
        if (m36229y2(c1634n.f4982e)) {
            i = this.f4703s - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.f4703s;
            i2 = 1;
        }
        C1570d c1570d = null;
        if (c1634n.f4982e == 1) {
            int i4 = Reader.READ_DONE;
            int mo35872m = this.f4705u.mo35872m();
            while (i != i3) {
                C1570d c1570d2 = this.f4704t[i];
                int m36187l = c1570d2.m36187l(mo35872m);
                if (m36187l < i4) {
                    c1570d = c1570d2;
                    i4 = m36187l;
                }
                i += i2;
            }
            return c1570d;
        }
        int i5 = Integer.MIN_VALUE;
        int mo35876i = this.f4705u.mo35876i();
        while (i != i3) {
            C1570d c1570d3 = this.f4704t[i];
            int m36183p = c1570d3.m36183p(mo35876i);
            if (m36183p > i5) {
                c1570d = c1570d3;
                i5 = m36183p;
            }
            i += i2;
        }
        return c1570d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36244r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4687A
            if (r0 == 0) goto L9
            int r0 = r6.m36254l2()
            goto Ld
        L9:
            int r0 = r6.m36257k2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4691E
            r4.m36219h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4691E
            r9.m36216k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4691E
            r7.m36217j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4691E
            r9.m36216k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4691E
            r9.m36217j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4687A
            if (r7 == 0) goto L4d
            int r7 = r6.m36257k2()
            goto L51
        L4d:
            int r7 = r6.m36254l2()
        L51:
            if (r3 > r7) goto L56
            r6.m36417u1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m36244r2(int, int, int):void");
    }

    /* renamed from: v2 */
    private void m36235v2(View view, int i, int i2, boolean z) {
        boolean m36491G1;
        m36438k(view, this.f4697K);
        C1569c c1569c = (C1569c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1569c).leftMargin;
        Rect rect = this.f4697K;
        int m36286S2 = m36286S2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c1569c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c1569c).topMargin;
        Rect rect2 = this.f4697K;
        int m36286S22 = m36286S2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c1569c).bottomMargin + rect2.bottom);
        if (z) {
            m36491G1 = m36485I1(view, m36286S2, m36286S22, c1569c);
        } else {
            m36491G1 = m36491G1(view, m36286S2, m36286S22, c1569c);
        }
        if (m36491G1) {
            view.measure(m36286S2, m36286S22);
        }
    }

    /* renamed from: w2 */
    private void m36233w2(View view, C1569c c1569c, boolean z) {
        if (c1569c.f4736f) {
            if (this.f4707w == 1) {
                m36235v2(view, this.f4696J, RecyclerView.AbstractC1546o.m36481L(m36464X(), m36463Y(), m36445h0() + m36451e0(), ((ViewGroup.MarginLayoutParams) c1569c).height, true), z);
            } else {
                m36235v2(view, RecyclerView.AbstractC1546o.m36481L(m36427p0(), m36424q0(), m36449f0() + m36447g0(), ((ViewGroup.MarginLayoutParams) c1569c).width, true), this.f4696J, z);
            }
        } else if (this.f4707w == 1) {
            m36235v2(view, RecyclerView.AbstractC1546o.m36481L(this.f4708x, m36424q0(), 0, ((ViewGroup.MarginLayoutParams) c1569c).width, false), RecyclerView.AbstractC1546o.m36481L(m36464X(), m36463Y(), m36445h0() + m36451e0(), ((ViewGroup.MarginLayoutParams) c1569c).height, true), z);
        } else {
            m36235v2(view, RecyclerView.AbstractC1546o.m36481L(m36427p0(), m36424q0(), m36449f0() + m36447g0(), ((ViewGroup.MarginLayoutParams) c1569c).width, true), RecyclerView.AbstractC1546o.m36481L(this.f4708x, m36463Y(), 0, ((ViewGroup.MarginLayoutParams) c1569c).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (m36284T1() != false) goto L83;
     */
    /* renamed from: x2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36231x2(androidx.recyclerview.widget.RecyclerView.C1558v r9, androidx.recyclerview.widget.RecyclerView.C1564z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m36231x2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* renamed from: y2 */
    private boolean m36229y2(int i) {
        if (this.f4707w == 0) {
            return (i == -1) != this.f4687A;
        }
        return ((i == -1) == this.f4687A) == m36237u2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: D0 */
    public void mo36320D0(int i) {
        super.mo36320D0(i);
        for (int i2 = 0; i2 < this.f4703s; i2++) {
            this.f4704t[i2].m36181r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: D1 */
    public void mo36319D1(Rect rect, int i, int i2) {
        int m36430o;
        int m36430o2;
        int m36449f0 = m36449f0() + m36447g0();
        int m36445h0 = m36445h0() + m36451e0();
        if (this.f4707w == 1) {
            m36430o2 = RecyclerView.AbstractC1546o.m36430o(i2, rect.height() + m36445h0, m36456c0());
            m36430o = RecyclerView.AbstractC1546o.m36430o(i, (this.f4708x * this.f4703s) + m36449f0, m36453d0());
        } else {
            m36430o = RecyclerView.AbstractC1546o.m36430o(i, rect.width() + m36449f0, m36453d0());
            m36430o2 = RecyclerView.AbstractC1546o.m36430o(i2, (this.f4708x * this.f4703s) + m36445h0, m36456c0());
        }
        m36497C1(m36430o, m36430o2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: E */
    public RecyclerView.C1551p mo36317E() {
        if (this.f4707w == 0) {
            return new C1569c(-2, -1);
        }
        return new C1569c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: E0 */
    public void mo36316E0(int i) {
        super.mo36316E0(i);
        for (int i2 = 0; i2 < this.f4703s; i2++) {
            this.f4704t[i2].m36181r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: F */
    public RecyclerView.C1551p mo36314F(Context context, AttributeSet attributeSet) {
        return new C1569c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: G */
    public RecyclerView.C1551p mo36312G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1569c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1569c(layoutParams);
    }

    /* renamed from: G2 */
    int m36311G2(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (m36483K() == 0 || i == 0) {
            return 0;
        }
        m36227z2(i, c1564z);
        int m36269c2 = m36269c2(c1558v, this.f4709y, c1564z);
        if (this.f4709y.f4979b >= m36269c2) {
            i = i < 0 ? -m36269c2 : m36269c2;
        }
        this.f4705u.mo35868r(-i);
        this.f4693G = this.f4687A;
        C1634n c1634n = this.f4709y;
        c1634n.f4979b = 0;
        m36322B2(c1558v, c1634n);
        return i;
    }

    /* renamed from: I2 */
    public void m36309I2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo36261h(null);
        if (i == this.f4707w) {
            return;
        }
        this.f4707w = i;
        AbstractC1642t abstractC1642t = this.f4705u;
        this.f4705u = this.f4706v;
        this.f4706v = abstractC1642t;
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: J0 */
    public void mo36308J0(RecyclerView recyclerView, RecyclerView.C1558v c1558v) {
        super.mo36308J0(recyclerView, c1558v);
        m36426p1(this.f4702P);
        for (int i = 0; i < this.f4703s; i++) {
            this.f4704t[i].m36194e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: J1 */
    public void mo29858J1(RecyclerView recyclerView, RecyclerView.C1564z c1564z, int i) {
        C1635o c1635o = new C1635o(recyclerView.getContext());
        c1635o.m36338p(i);
        m36482K1(c1635o);
    }

    /* renamed from: J2 */
    public void m36307J2(boolean z) {
        mo36261h(null);
        SavedState savedState = this.f4695I;
        if (savedState != null && savedState.f4720D != z) {
            savedState.f4720D = z;
        }
        this.f4710z = z;
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: K0 */
    public View mo36306K0(View view, int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        View m36499C;
        int m36257k2;
        int m36192g;
        int m36192g2;
        int m36192g3;
        View m36186m;
        if (m36483K() == 0 || (m36499C = m36499C(view)) == null) {
            return null;
        }
        m36313F2();
        int m36275Y1 = m36275Y1(i);
        if (m36275Y1 == Integer.MIN_VALUE) {
            return null;
        }
        C1569c c1569c = (C1569c) m36499C.getLayoutParams();
        boolean z = c1569c.f4736f;
        C1570d c1570d = c1569c.f4735e;
        if (m36275Y1 == 1) {
            m36257k2 = m36254l2();
        } else {
            m36257k2 = m36257k2();
        }
        m36294P2(m36257k2, c1564z);
        m36310H2(m36275Y1);
        C1634n c1634n = this.f4709y;
        c1634n.f4980c = c1634n.f4981d + m36257k2;
        c1634n.f4979b = (int) (this.f4705u.mo35871n() * 0.33333334f);
        C1634n c1634n2 = this.f4709y;
        c1634n2.f4985h = true;
        c1634n2.f4978a = false;
        m36269c2(c1558v, c1634n2, c1564z);
        this.f4693G = this.f4687A;
        if (z || (m36186m = c1570d.m36186m(m36257k2, m36275Y1)) == null || m36186m == m36499C) {
            if (m36229y2(m36275Y1)) {
                for (int i2 = this.f4703s - 1; i2 >= 0; i2--) {
                    View m36186m2 = this.f4704t[i2].m36186m(m36257k2, m36275Y1);
                    if (m36186m2 != null && m36186m2 != m36499C) {
                        return m36186m2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f4703s; i3++) {
                    View m36186m3 = this.f4704t[i3].m36186m(m36257k2, m36275Y1);
                    if (m36186m3 != null && m36186m3 != m36499C) {
                        return m36186m3;
                    }
                }
            }
            boolean z2 = (this.f4710z ^ true) == (m36275Y1 == -1);
            if (!z) {
                if (z2) {
                    m36192g3 = c1570d.m36193f();
                } else {
                    m36192g3 = c1570d.m36192g();
                }
                View mo36496D = mo36496D(m36192g3);
                if (mo36496D != null && mo36496D != m36499C) {
                    return mo36496D;
                }
            }
            if (m36229y2(m36275Y1)) {
                for (int i4 = this.f4703s - 1; i4 >= 0; i4--) {
                    if (i4 != c1570d.f4741e) {
                        if (z2) {
                            m36192g2 = this.f4704t[i4].m36193f();
                        } else {
                            m36192g2 = this.f4704t[i4].m36192g();
                        }
                        View mo36496D2 = mo36496D(m36192g2);
                        if (mo36496D2 != null && mo36496D2 != m36499C) {
                            return mo36496D2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.f4703s; i5++) {
                    if (z2) {
                        m36192g = this.f4704t[i5].m36193f();
                    } else {
                        m36192g = this.f4704t[i5].m36192g();
                    }
                    View mo36496D3 = mo36496D(m36192g);
                    if (mo36496D3 != null && mo36496D3 != m36499C) {
                        return mo36496D3;
                    }
                }
            }
            return null;
        }
        return m36186m;
    }

    /* renamed from: K2 */
    public void m36305K2(int i) {
        mo36261h(null);
        if (i != this.f4703s) {
            m36239t2();
            this.f4703s = i;
            this.f4688B = new BitSet(this.f4703s);
            this.f4704t = new C1570d[this.f4703s];
            for (int i2 = 0; i2 < this.f4703s; i2++) {
                this.f4704t[i2] = new C1570d(i2);
            }
            m36417u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: L0 */
    public void mo36304L0(AccessibilityEvent accessibilityEvent) {
        super.mo36304L0(accessibilityEvent);
        if (m36483K() > 0) {
            View m36263f2 = m36263f2(false);
            View m36265e2 = m36265e2(false);
            if (m36263f2 == null || m36265e2 == null) {
                return;
            }
            int m36442i0 = m36442i0(m36263f2);
            int m36442i02 = m36442i0(m36265e2);
            if (m36442i0 < m36442i02) {
                accessibilityEvent.setFromIndex(m36442i0);
                accessibilityEvent.setToIndex(m36442i02);
                return;
            }
            accessibilityEvent.setFromIndex(m36442i02);
            accessibilityEvent.setToIndex(m36442i0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: M1 */
    public boolean mo36302M1() {
        return this.f4695I == null;
    }

    /* renamed from: N2 */
    boolean m36299N2(RecyclerView.C1564z c1564z, C1568b c1568b) {
        int i;
        int mo35872m;
        if (!c1564z.m36326e() && (i = this.f4689C) != -1) {
            if (i >= 0 && i < c1564z.m36329b()) {
                SavedState savedState = this.f4695I;
                if (savedState != null && savedState.f4723w != -1 && savedState.f4725y >= 1) {
                    c1568b.f4729b = Integer.MIN_VALUE;
                    c1568b.f4728a = this.f4689C;
                } else {
                    View mo36496D = mo36496D(this.f4689C);
                    if (mo36496D != null) {
                        c1568b.f4728a = this.f4687A ? m36254l2() : m36257k2();
                        if (this.f4690D != Integer.MIN_VALUE) {
                            if (c1568b.f4730c) {
                                c1568b.f4729b = (this.f4705u.mo35876i() - this.f4690D) - this.f4705u.mo35881d(mo36496D);
                            } else {
                                c1568b.f4729b = (this.f4705u.mo35872m() + this.f4690D) - this.f4705u.mo35878g(mo36496D);
                            }
                            return true;
                        } else if (this.f4705u.mo35880e(mo36496D) > this.f4705u.mo35871n()) {
                            if (c1568b.f4730c) {
                                mo35872m = this.f4705u.mo35876i();
                            } else {
                                mo35872m = this.f4705u.mo35872m();
                            }
                            c1568b.f4729b = mo35872m;
                            return true;
                        } else {
                            int mo35878g = this.f4705u.mo35878g(mo36496D) - this.f4705u.mo35872m();
                            if (mo35878g < 0) {
                                c1568b.f4729b = -mo35878g;
                                return true;
                            }
                            int mo35876i = this.f4705u.mo35876i() - this.f4705u.mo35881d(mo36496D);
                            if (mo35876i < 0) {
                                c1568b.f4729b = mo35876i;
                                return true;
                            }
                            c1568b.f4729b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f4689C;
                        c1568b.f4728a = i2;
                        int i3 = this.f4690D;
                        if (i3 == Integer.MIN_VALUE) {
                            c1568b.f4730c = m36287S1(i2) == 1;
                            c1568b.m36204a();
                        } else {
                            c1568b.m36203b(i3);
                        }
                        c1568b.f4731d = true;
                    }
                }
                return true;
            }
            this.f4689C = -1;
            this.f4690D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: O */
    public int mo36298O(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4707w == 1) {
            return this.f4703s;
        }
        return super.mo36298O(c1558v, c1564z);
    }

    /* renamed from: O2 */
    void m36296O2(RecyclerView.C1564z c1564z, C1568b c1568b) {
        if (m36299N2(c1564z, c1568b) || m36301M2(c1564z, c1568b)) {
            return;
        }
        c1568b.m36204a();
        c1568b.f4728a = 0;
    }

    /* renamed from: P1 */
    boolean m36295P1() {
        int m36187l = this.f4704t[0].m36187l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4703s; i++) {
            if (this.f4704t[i].m36187l(Integer.MIN_VALUE) != m36187l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Q0 */
    public void mo36293Q0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z, View view, C1085c c1085c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1569c)) {
            super.m36474P0(view, c1085c);
            return;
        }
        C1569c c1569c = (C1569c) layoutParams;
        if (this.f4707w == 0) {
            c1085c.m38556d0(C1085c.C1088c.m38506a(c1569c.m36200e(), c1569c.f4736f ? this.f4703s : 1, -1, -1, false, false));
        } else {
            c1085c.m38556d0(C1085c.C1088c.m38506a(-1, -1, c1569c.m36200e(), c1569c.f4736f ? this.f4703s : 1, false, false));
        }
    }

    /* renamed from: Q1 */
    boolean m36292Q1() {
        int m36183p = this.f4704t[0].m36183p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4703s; i++) {
            if (this.f4704t[i].m36183p(Integer.MIN_VALUE) != m36183p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q2 */
    void m36291Q2(int i) {
        this.f4708x = i / this.f4703s;
        this.f4696J = View.MeasureSpec.makeMeasureSpec(i, this.f4706v.mo35874k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: S0 */
    public void mo36288S0(RecyclerView recyclerView, int i, int i2) {
        m36244r2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: T0 */
    public void mo36285T0(RecyclerView recyclerView) {
        this.f4691E.m36225b();
        m36417u1();
    }

    /* renamed from: T1 */
    boolean m36284T1() {
        int m36257k2;
        int m36254l2;
        if (m36483K() == 0 || this.f4692F == 0 || !m36420s0()) {
            return false;
        }
        if (this.f4687A) {
            m36257k2 = m36254l2();
            m36254l2 = m36257k2();
        } else {
            m36257k2 = m36257k2();
            m36254l2 = m36254l2();
        }
        if (m36257k2 == 0 && m36242s2() != null) {
            this.f4691E.m36225b();
            m36415v1();
            m36417u1();
            return true;
        } else if (this.f4699M) {
            int i = this.f4687A ? -1 : 1;
            int i2 = m36254l2 + 1;
            LazySpanLookup.FullSpanItem m36222e = this.f4691E.m36222e(m36257k2, i2, i, true);
            if (m36222e == null) {
                this.f4699M = false;
                this.f4691E.m36223d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem m36222e2 = this.f4691E.m36222e(m36257k2, m36222e.f4713w, i * (-1), true);
            if (m36222e2 == null) {
                this.f4691E.m36223d(m36222e.f4713w);
            } else {
                this.f4691E.m36223d(m36222e2.f4713w + 1);
            }
            m36415v1();
            m36417u1();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: U0 */
    public void mo36283U0(RecyclerView recyclerView, int i, int i2, int i3) {
        m36244r2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: V0 */
    public void mo36281V0(RecyclerView recyclerView, int i, int i2) {
        m36244r2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: X0 */
    public void mo36278X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m36244r2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Y0 */
    public void mo36276Y0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        m36231x2(c1558v, c1564z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: Z0 */
    public void mo36274Z0(RecyclerView.C1564z c1564z) {
        super.mo36274Z0(c1564z);
        this.f4689C = -1;
        this.f4690D = Integer.MIN_VALUE;
        this.f4695I = null;
        this.f4698L.m36202c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1561y.InterfaceC1563b
    /* renamed from: a */
    public PointF mo36272a(int i) {
        int m36287S1 = m36287S1(i);
        PointF pointF = new PointF();
        if (m36287S1 == 0) {
            return null;
        }
        if (this.f4707w == 0) {
            pointF.x = m36287S1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m36287S1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: d1 */
    public void mo36268d1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4695I = (SavedState) parcelable;
            m36417u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: e1 */
    public Parcelable mo36266e1() {
        int m36183p;
        int mo35872m;
        int[] iArr;
        if (this.f4695I != null) {
            return new SavedState(this.f4695I);
        }
        SavedState savedState = new SavedState();
        savedState.f4720D = this.f4710z;
        savedState.f4721E = this.f4693G;
        savedState.f4722F = this.f4694H;
        LazySpanLookup lazySpanLookup = this.f4691E;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f4711a) != null) {
            savedState.f4718B = iArr;
            savedState.f4717A = iArr.length;
            savedState.f4719C = lazySpanLookup.f4712b;
        } else {
            savedState.f4717A = 0;
        }
        if (m36483K() > 0) {
            savedState.f4723w = this.f4693G ? m36254l2() : m36257k2();
            savedState.f4724x = m36262g2();
            int i = this.f4703s;
            savedState.f4725y = i;
            savedState.f4726z = new int[i];
            for (int i2 = 0; i2 < this.f4703s; i2++) {
                if (this.f4693G) {
                    m36183p = this.f4704t[i2].m36187l(Integer.MIN_VALUE);
                    if (m36183p != Integer.MIN_VALUE) {
                        mo35872m = this.f4705u.mo35876i();
                        m36183p -= mo35872m;
                        savedState.f4726z[i2] = m36183p;
                    } else {
                        savedState.f4726z[i2] = m36183p;
                    }
                } else {
                    m36183p = this.f4704t[i2].m36183p(Integer.MIN_VALUE);
                    if (m36183p != Integer.MIN_VALUE) {
                        mo35872m = this.f4705u.mo35872m();
                        m36183p -= mo35872m;
                        savedState.f4726z[i2] = m36183p;
                    } else {
                        savedState.f4726z[i2] = m36183p;
                    }
                }
            }
        } else {
            savedState.f4723w = -1;
            savedState.f4724x = -1;
            savedState.f4725y = 0;
        }
        return savedState;
    }

    /* renamed from: e2 */
    View m36265e2(boolean z) {
        int mo35872m = this.f4705u.mo35872m();
        int mo35876i = this.f4705u.mo35876i();
        View view = null;
        for (int m36483K = m36483K() - 1; m36483K >= 0; m36483K--) {
            View m36484J = m36484J(m36483K);
            int mo35878g = this.f4705u.mo35878g(m36484J);
            int mo35881d = this.f4705u.mo35881d(m36484J);
            if (mo35881d > mo35872m && mo35878g < mo35876i) {
                if (mo35881d <= mo35876i || !z) {
                    return m36484J;
                }
                if (view == null) {
                    view = m36484J;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: f1 */
    public void mo36264f1(int i) {
        if (i == 0) {
            m36284T1();
        }
    }

    /* renamed from: f2 */
    View m36263f2(boolean z) {
        int mo35872m = this.f4705u.mo35872m();
        int mo35876i = this.f4705u.mo35876i();
        int m36483K = m36483K();
        View view = null;
        for (int i = 0; i < m36483K; i++) {
            View m36484J = m36484J(i);
            int mo35878g = this.f4705u.mo35878g(m36484J);
            if (this.f4705u.mo35881d(m36484J) > mo35872m && mo35878g < mo35876i) {
                if (mo35878g >= mo35872m || !z) {
                    return m36484J;
                }
                if (view == null) {
                    view = m36484J;
                }
            }
        }
        return view;
    }

    /* renamed from: g2 */
    int m36262g2() {
        View m36265e2 = this.f4687A ? m36265e2(true) : m36263f2(true);
        if (m36265e2 == null) {
            return -1;
        }
        return m36442i0(m36265e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: h */
    public void mo36261h(String str) {
        if (this.f4695I == null) {
            super.mo36261h(str);
        }
    }

    /* renamed from: k2 */
    int m36257k2() {
        if (m36483K() == 0) {
            return 0;
        }
        return m36442i0(m36484J(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: l */
    public boolean mo36256l() {
        return this.f4707w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: l0 */
    public int mo36255l0(RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        if (this.f4707w == 0) {
            return this.f4703s;
        }
        return super.mo36255l0(c1558v, c1564z);
    }

    /* renamed from: l2 */
    int m36254l2() {
        int m36483K = m36483K();
        if (m36483K == 0) {
            return 0;
        }
        return m36442i0(m36484J(m36483K - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: m */
    public boolean mo36253m() {
        return this.f4707w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: n */
    public boolean mo36251n(RecyclerView.C1551p c1551p) {
        return c1551p instanceof C1569c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: p */
    public void mo36248p(int i, int i2, RecyclerView.C1564z c1564z, RecyclerView.AbstractC1546o.InterfaceC1549c interfaceC1549c) {
        int m36187l;
        int i3;
        if (this.f4707w != 0) {
            i = i2;
        }
        if (m36483K() == 0 || i == 0) {
            return;
        }
        m36227z2(i, c1564z);
        int[] iArr = this.f4701O;
        if (iArr == null || iArr.length < this.f4703s) {
            this.f4701O = new int[this.f4703s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4703s; i5++) {
            C1634n c1634n = this.f4709y;
            if (c1634n.f4981d == -1) {
                m36187l = c1634n.f4983f;
                i3 = this.f4704t[i5].m36183p(m36187l);
            } else {
                m36187l = this.f4704t[i5].m36187l(c1634n.f4984g);
                i3 = this.f4709y.f4984g;
            }
            int i6 = m36187l - i3;
            if (i6 >= 0) {
                this.f4701O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f4701O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f4709y.m35922a(c1564z); i7++) {
            interfaceC1549c.mo36001a(this.f4709y.f4980c, this.f4701O[i7]);
            C1634n c1634n2 = this.f4709y;
            c1634n2.f4980c += c1634n2.f4981d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: r */
    public int mo36245r(RecyclerView.C1564z c1564z) {
        return m36280V1(c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: s */
    public int mo36243s(RecyclerView.C1564z c1564z) {
        return m36279W1(c1564z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: s2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m36242s2() {
        /*
            r12 = this;
            int r0 = r12.m36483K()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4703s
            r2.<init>(r3)
            int r3 = r12.f4703s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4707w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m36237u2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f4687A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m36484J(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1569c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4735e
            int r9 = r9.f4741e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4735e
            boolean r9 = r12.m36282U1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f4735e
            int r9 = r9.f4741e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4736f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m36484J(r9)
            boolean r10 = r12.f4687A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.t r10 = r12.f4705u
            int r10 = r10.mo35881d(r7)
            androidx.recyclerview.widget.t r11 = r12.f4705u
            int r11 = r11.mo35881d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.t r10 = r12.f4705u
            int r10 = r10.mo35878g(r7)
            androidx.recyclerview.widget.t r11 = r12.f4705u
            int r11 = r11.mo35878g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1569c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f4735e
            int r8 = r8.f4741e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f4735e
            int r9 = r9.f4741e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m36242s2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: t */
    public int mo36241t(RecyclerView.C1564z c1564z) {
        return m36277X1(c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: t0 */
    public boolean mo36240t0() {
        return this.f4692F != 0;
    }

    /* renamed from: t2 */
    public void m36239t2() {
        this.f4691E.m36225b();
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: u */
    public int mo36238u(RecyclerView.C1564z c1564z) {
        return m36280V1(c1564z);
    }

    /* renamed from: u2 */
    boolean m36237u2() {
        return m36461a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: v */
    public int mo36236v(RecyclerView.C1564z c1564z) {
        return m36279W1(c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: w */
    public int mo36234w(RecyclerView.C1564z c1564z) {
        return m36277X1(c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: x1 */
    public int mo36232x1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return m36311G2(i, c1558v, c1564z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: y1 */
    public void mo36230y1(int i) {
        SavedState savedState = this.f4695I;
        if (savedState != null && savedState.f4723w != i) {
            savedState.m36208a();
        }
        this.f4689C = i;
        this.f4690D = Integer.MIN_VALUE;
        m36417u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: z1 */
    public int mo36228z1(int i, RecyclerView.C1558v c1558v, RecyclerView.C1564z c1564z) {
        return m36311G2(i, c1558v, c1564z);
    }

    /* renamed from: z2 */
    void m36227z2(int i, RecyclerView.C1564z c1564z) {
        int i2;
        int m36257k2;
        if (i > 0) {
            m36257k2 = m36254l2();
            i2 = 1;
        } else {
            i2 = -1;
            m36257k2 = m36257k2();
        }
        this.f4709y.f4978a = true;
        m36294P2(m36257k2, c1564z);
        m36310H2(i2);
        C1634n c1634n = this.f4709y;
        c1634n.f4980c = m36257k2 + c1634n.f4981d;
        c1634n.f4979b = Math.abs(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f4711a;

        /* renamed from: b */
        List<FullSpanItem> f4712b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m36218i(int i) {
            if (this.f4712b == null) {
                return -1;
            }
            FullSpanItem m36221f = m36221f(i);
            if (m36221f != null) {
                this.f4712b.remove(m36221f);
            }
            int size = this.f4712b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4712b.get(i2).f4713w >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.f4712b.remove(i2);
                return this.f4712b.get(i2).f4713w;
            }
            return -1;
        }

        /* renamed from: l */
        private void m36215l(int i, int i2) {
            List<FullSpanItem> list = this.f4712b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4712b.get(size);
                int i3 = fullSpanItem.f4713w;
                if (i3 >= i) {
                    fullSpanItem.f4713w = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        private void m36214m(int i, int i2) {
            List<FullSpanItem> list = this.f4712b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4712b.get(size);
                int i4 = fullSpanItem.f4713w;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f4712b.remove(size);
                    } else {
                        fullSpanItem.f4713w = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m36226a(FullSpanItem fullSpanItem) {
            if (this.f4712b == null) {
                this.f4712b = new ArrayList();
            }
            int size = this.f4712b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f4712b.get(i);
                if (fullSpanItem2.f4713w == fullSpanItem.f4713w) {
                    this.f4712b.remove(i);
                }
                if (fullSpanItem2.f4713w >= fullSpanItem.f4713w) {
                    this.f4712b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4712b.add(fullSpanItem);
        }

        /* renamed from: b */
        void m36225b() {
            int[] iArr = this.f4711a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4712b = null;
        }

        /* renamed from: c */
        void m36224c(int i) {
            int[] iArr = this.f4711a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f4711a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m36212o(i)];
                this.f4711a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4711a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m36223d(int i) {
            List<FullSpanItem> list = this.f4712b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4712b.get(size).f4713w >= i) {
                        this.f4712b.remove(size);
                    }
                }
            }
            return m36219h(i);
        }

        /* renamed from: e */
        public FullSpanItem m36222e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f4712b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f4712b.get(i4);
                int i5 = fullSpanItem.f4713w;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f4714x == i3 || (z && fullSpanItem.f4716z))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m36221f(int i) {
            List<FullSpanItem> list = this.f4712b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4712b.get(size);
                if (fullSpanItem.f4713w == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m36220g(int i) {
            int[] iArr = this.f4711a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: h */
        int m36219h(int i) {
            int[] iArr = this.f4711a;
            if (iArr != null && i < iArr.length) {
                int m36218i = m36218i(i);
                if (m36218i == -1) {
                    int[] iArr2 = this.f4711a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f4711a.length;
                }
                int i2 = m36218i + 1;
                Arrays.fill(this.f4711a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        /* renamed from: j */
        void m36217j(int i, int i2) {
            int[] iArr = this.f4711a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m36224c(i3);
            int[] iArr2 = this.f4711a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f4711a, i, i3, -1);
            m36215l(i, i2);
        }

        /* renamed from: k */
        void m36216k(int i, int i2) {
            int[] iArr = this.f4711a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m36224c(i3);
            int[] iArr2 = this.f4711a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f4711a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m36214m(i, i2);
        }

        /* renamed from: n */
        void m36213n(int i, C1570d c1570d) {
            m36224c(i);
            this.f4711a[i] = c1570d.f4741e;
        }

        /* renamed from: o */
        int m36212o(int i) {
            int length = this.f4711a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1565a();

            /* renamed from: w */
            int f4713w;

            /* renamed from: x */
            int f4714x;

            /* renamed from: y */
            int[] f4715y;

            /* renamed from: z */
            boolean f4716z;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes.dex */
            static class C1565a implements Parcelable.Creator<FullSpanItem> {
                C1565a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f4713w = parcel.readInt();
                this.f4714x = parcel.readInt();
                this.f4716z = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4715y = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m36211a(int i) {
                int[] iArr = this.f4715y;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4713w + ", mGapDir=" + this.f4714x + ", mHasUnwantedGapAfter=" + this.f4716z + ", mGapPerSpan=" + Arrays.toString(this.f4715y) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4713w);
                parcel.writeInt(this.f4714x);
                parcel.writeInt(this.f4716z ? 1 : 0);
                int[] iArr = this.f4715y;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4715y);
                    return;
                }
                parcel.writeInt(0);
            }

            FullSpanItem() {
            }
        }
    }
}
