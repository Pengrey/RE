package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p020os.C1020i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public final class RunnableC1614j implements Runnable {

    /* renamed from: A */
    static final ThreadLocal<RunnableC1614j> f4904A = new ThreadLocal<>();

    /* renamed from: B */
    static Comparator<C1617c> f4905B = new C1615a();

    /* renamed from: x */
    long f4907x;

    /* renamed from: y */
    long f4908y;

    /* renamed from: w */
    ArrayList<RecyclerView> f4906w = new ArrayList<>();

    /* renamed from: z */
    private ArrayList<C1617c> f4909z = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    static class C1615a implements Comparator<C1617c> {
        C1615a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1617c c1617c, C1617c c1617c2) {
            RecyclerView recyclerView = c1617c.f4917d;
            if ((recyclerView == null) != (c1617c2.f4917d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = c1617c.f4914a;
            if (z != c1617c2.f4914a) {
                return z ? -1 : 1;
            }
            int i = c1617c2.f4915b - c1617c.f4915b;
            if (i != 0) {
                return i;
            }
            int i2 = c1617c.f4916c - c1617c2.f4916c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    public static class C1616b implements RecyclerView.AbstractC1546o.InterfaceC1549c {

        /* renamed from: a */
        int f4910a;

        /* renamed from: b */
        int f4911b;

        /* renamed from: c */
        int[] f4912c;

        /* renamed from: d */
        int f4913d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1546o.InterfaceC1549c
        /* renamed from: a */
        public void mo36001a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 >= 0) {
                int i3 = this.f4913d * 2;
                int[] iArr = this.f4912c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4912c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.f4912c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4912c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4913d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m36000b() {
            int[] iArr = this.f4912c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4913d = 0;
        }

        /* renamed from: c */
        void m35999c(RecyclerView recyclerView, boolean z) {
            this.f4913d = 0;
            int[] iArr = this.f4912c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1546o abstractC1546o = recyclerView.f4513I;
            if (recyclerView.f4511H == null || abstractC1546o == null || !abstractC1546o.m36416v0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f4568z.m36163p()) {
                    abstractC1546o.mo36425q(recyclerView.f4511H.mo29834f(), this);
                }
            } else if (!recyclerView.m36635o0()) {
                abstractC1546o.mo36248p(this.f4910a, this.f4911b, recyclerView.f4504D0, this);
            }
            int i = this.f4913d;
            if (i > abstractC1546o.f4625m) {
                abstractC1546o.f4625m = i;
                abstractC1546o.f4626n = z;
                recyclerView.f4564x.m36380K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m35998d(int i) {
            if (this.f4912c != null) {
                int i2 = this.f4913d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4912c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m35997e(int i, int i2) {
            this.f4910a = i;
            this.f4911b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes.dex */
    public static class C1617c {

        /* renamed from: a */
        public boolean f4914a;

        /* renamed from: b */
        public int f4915b;

        /* renamed from: c */
        public int f4916c;

        /* renamed from: d */
        public RecyclerView f4917d;

        /* renamed from: e */
        public int f4918e;

        C1617c() {
        }

        /* renamed from: a */
        public void m35996a() {
            this.f4914a = false;
            this.f4915b = 0;
            this.f4916c = 0;
            this.f4917d = null;
            this.f4918e = 0;
        }
    }

    /* renamed from: b */
    private void m36011b() {
        C1617c c1617c;
        int size = this.f4906w.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4906w.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4502C0.m35999c(recyclerView, false);
                i += recyclerView.f4502C0.f4913d;
            }
        }
        this.f4909z.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4906w.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1616b c1616b = recyclerView2.f4502C0;
                int abs = Math.abs(c1616b.f4910a) + Math.abs(c1616b.f4911b);
                for (int i5 = 0; i5 < c1616b.f4913d * 2; i5 += 2) {
                    if (i3 >= this.f4909z.size()) {
                        c1617c = new C1617c();
                        this.f4909z.add(c1617c);
                    } else {
                        c1617c = this.f4909z.get(i3);
                    }
                    int[] iArr = c1616b.f4912c;
                    int i6 = iArr[i5 + 1];
                    c1617c.f4914a = i6 <= abs;
                    c1617c.f4915b = abs;
                    c1617c.f4916c = i6;
                    c1617c.f4917d = recyclerView2;
                    c1617c.f4918e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4909z, f4905B);
    }

    /* renamed from: c */
    private void m36010c(C1617c c1617c, long j) {
        RecyclerView.AbstractC1531c0 m36004i = m36004i(c1617c.f4917d, c1617c.f4918e, c1617c.f4914a ? Long.MAX_VALUE : j);
        if (m36004i == null || m36004i.f4582b == null || !m36004i.m36559s() || m36004i.m36558t()) {
            return;
        }
        m36005h(m36004i.f4582b.get(), j);
    }

    /* renamed from: d */
    private void m36009d(long j) {
        for (int i = 0; i < this.f4909z.size(); i++) {
            C1617c c1617c = this.f4909z.get(i);
            if (c1617c.f4917d == null) {
                return;
            }
            m36010c(c1617c, j);
            c1617c.m35996a();
        }
    }

    /* renamed from: e */
    static boolean m36008e(RecyclerView recyclerView, int i) {
        int m36099j = recyclerView.f4497A.m36099j();
        for (int i2 = 0; i2 < m36099j; i2++) {
            RecyclerView.AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(recyclerView.f4497A.m36100i(i2));
            if (m36653i0.f4585c == i && !m36653i0.m36558t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m36005h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4542c0 && recyclerView.f4497A.m36099j() != 0) {
            recyclerView.m36682X0();
        }
        C1616b c1616b = recyclerView.f4502C0;
        c1616b.m35999c(recyclerView, true);
        if (c1616b.f4913d != 0) {
            try {
                C1020i.m38740a("RV Nested Prefetch");
                recyclerView.f4504D0.m36325f(recyclerView.f4511H);
                for (int i = 0; i < c1616b.f4913d * 2; i += 2) {
                    m36004i(recyclerView, c1616b.f4912c[i], j);
                }
            } finally {
                C1020i.m38739b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC1531c0 m36004i(RecyclerView recyclerView, int i, long j) {
        if (m36008e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1558v c1558v = recyclerView.f4564x;
        try {
            recyclerView.m36710J0();
            RecyclerView.AbstractC1531c0 m36382I = c1558v.m36382I(i, false, j);
            if (m36382I != null) {
                if (m36382I.m36559s() && !m36382I.m36558t()) {
                    c1558v.m36389B(m36382I.f4581a);
                } else {
                    c1558v.m36377a(m36382I, false);
                }
            }
            return m36382I;
        } finally {
            recyclerView.m36706L0(false);
        }
    }

    /* renamed from: a */
    public void m36012a(RecyclerView recyclerView) {
        this.f4906w.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36007f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4907x == 0) {
            this.f4907x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4502C0.m35997e(i, i2);
    }

    /* renamed from: g */
    void m36006g(long j) {
        m36011b();
        m36009d(j);
    }

    /* renamed from: j */
    public void m36003j(RecyclerView recyclerView) {
        this.f4906w.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C1020i.m38740a("RV Prefetch");
            if (!this.f4906w.isEmpty()) {
                int size = this.f4906w.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4906w.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m36006g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4908y);
                }
            }
        } finally {
            this.f4907x = 0L;
            C1020i.m38739b();
        }
    }
}
