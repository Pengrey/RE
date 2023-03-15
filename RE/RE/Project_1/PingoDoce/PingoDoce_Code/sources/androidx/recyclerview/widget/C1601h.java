package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C1601h {

    /* renamed from: a */
    private static final Comparator<C1608g> f4848a = new C1602a();

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    static class C1602a implements Comparator<C1608g> {
        C1602a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int mo36051a(C1608g c1608g, C1608g c1608g2) {
            int i = c1608g.f4863a - c1608g2.f4863a;
            return i == 0 ? c1608g.f4864b - c1608g2.f4864b : i;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1603b {
        /* renamed from: a */
        public abstract boolean mo36050a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo36049b(int i, int i2);

        /* renamed from: c */
        public abstract Object mo36048c(int i, int i2);

        /* renamed from: d */
        public abstract int mo36047d();

        /* renamed from: e */
        public abstract int mo36046e();
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$c */
    /* loaded from: classes.dex */
    public static class C1604c {

        /* renamed from: a */
        private final List<C1608g> f4849a;

        /* renamed from: b */
        private final int[] f4850b;

        /* renamed from: c */
        private final int[] f4851c;

        /* renamed from: d */
        private final AbstractC1603b f4852d;

        /* renamed from: e */
        private final int f4853e;

        /* renamed from: f */
        private final int f4854f;

        /* renamed from: g */
        private final boolean f4855g;

        C1604c(AbstractC1603b abstractC1603b, List<C1608g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4849a = list;
            this.f4850b = iArr;
            this.f4851c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4852d = abstractC1603b;
            this.f4853e = abstractC1603b.mo36046e();
            this.f4854f = abstractC1603b.mo36047d();
            this.f4855g = z;
            m36045a();
            m36038h();
        }

        /* renamed from: a */
        private void m36045a() {
            C1608g c1608g = this.f4849a.isEmpty() ? null : this.f4849a.get(0);
            if (c1608g != null && c1608g.f4863a == 0 && c1608g.f4864b == 0) {
                return;
            }
            C1608g c1608g2 = new C1608g();
            c1608g2.f4863a = 0;
            c1608g2.f4864b = 0;
            c1608g2.f4866d = false;
            c1608g2.f4865c = 0;
            c1608g2.f4867e = false;
            this.f4849a.add(0, c1608g2);
        }

        /* renamed from: b */
        private void m36044b(List<C1606e> list, InterfaceC1639r interfaceC1639r, int i, int i2, int i3) {
            if (!this.f4855g) {
                interfaceC1639r.mo35896c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f4851c;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    interfaceC1639r.mo35896c(i, 1);
                    for (C1606e c1606e : list) {
                        c1606e.f4857b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    interfaceC1639r.mo35897b(m36036j(list, i7, true).f4857b, i);
                    if (i6 == 4) {
                        interfaceC1639r.mo35895d(i, 1, this.f4852d.mo36048c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1606e(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                }
            }
        }

        /* renamed from: c */
        private void m36043c(List<C1606e> list, InterfaceC1639r interfaceC1639r, int i, int i2, int i3) {
            if (!this.f4855g) {
                interfaceC1639r.mo35898a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f4850b;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    interfaceC1639r.mo35898a(i + i4, 1);
                    for (C1606e c1606e : list) {
                        c1606e.f4857b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    C1606e m36036j = m36036j(list, i7, false);
                    interfaceC1639r.mo35897b(i + i4, m36036j.f4857b - 1);
                    if (i6 == 4) {
                        interfaceC1639r.mo35895d(m36036j.f4857b - 1, 1, this.f4852d.mo36048c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1606e(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                }
            }
        }

        /* renamed from: f */
        private void m36040f(int i, int i2, int i3) {
            if (this.f4850b[i - 1] != 0) {
                return;
            }
            m36039g(i, i2, i3, false);
        }

        /* renamed from: g */
        private boolean m36039g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                C1608g c1608g = this.f4849a.get(i3);
                int i7 = c1608g.f4863a;
                int i8 = c1608g.f4865c;
                int i9 = i7 + i8;
                int i10 = c1608g.f4864b + i8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i9; i11--) {
                        if (this.f4852d.mo36049b(i11, i4)) {
                            i6 = this.f4852d.mo36050a(i11, i4) ? 8 : 4;
                            this.f4851c[i4] = (i11 << 5) | 16;
                            this.f4850b[i11] = (i4 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i10; i12--) {
                        if (this.f4852d.mo36049b(i4, i12)) {
                            i6 = this.f4852d.mo36050a(i4, i12) ? 8 : 4;
                            int i13 = i - 1;
                            this.f4850b[i13] = (i12 << 5) | 16;
                            this.f4851c[i12] = (i13 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = c1608g.f4863a;
                i2 = c1608g.f4864b;
                i3--;
            }
            return false;
        }

        /* renamed from: h */
        private void m36038h() {
            int i = this.f4853e;
            int i2 = this.f4854f;
            for (int size = this.f4849a.size() - 1; size >= 0; size--) {
                C1608g c1608g = this.f4849a.get(size);
                int i3 = c1608g.f4863a;
                int i4 = c1608g.f4865c;
                int i5 = i3 + i4;
                int i6 = c1608g.f4864b + i4;
                if (this.f4855g) {
                    while (i > i5) {
                        m36040f(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m36037i(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < c1608g.f4865c; i7++) {
                    int i8 = c1608g.f4863a + i7;
                    int i9 = c1608g.f4864b + i7;
                    int i10 = this.f4852d.mo36050a(i8, i9) ? 1 : 2;
                    this.f4850b[i8] = (i9 << 5) | i10;
                    this.f4851c[i9] = (i8 << 5) | i10;
                }
                i = c1608g.f4863a;
                i2 = c1608g.f4864b;
            }
        }

        /* renamed from: i */
        private void m36037i(int i, int i2, int i3) {
            if (this.f4851c[i2 - 1] != 0) {
                return;
            }
            m36039g(i, i2, i3, true);
        }

        /* renamed from: j */
        private static C1606e m36036j(List<C1606e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1606e c1606e = list.get(size);
                if (c1606e.f4856a == i && c1606e.f4858c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f4857b += z ? 1 : -1;
                        size++;
                    }
                    return c1606e;
                }
                size--;
            }
            return null;
        }

        /* renamed from: d */
        public void m36042d(InterfaceC1639r interfaceC1639r) {
            C1586e c1586e;
            if (interfaceC1639r instanceof C1586e) {
                c1586e = (C1586e) interfaceC1639r;
            } else {
                c1586e = new C1586e(interfaceC1639r);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f4853e;
            int i2 = this.f4854f;
            for (int size = this.f4849a.size() - 1; size >= 0; size--) {
                C1608g c1608g = this.f4849a.get(size);
                int i3 = c1608g.f4865c;
                int i4 = c1608g.f4863a + i3;
                int i5 = c1608g.f4864b + i3;
                if (i4 < i) {
                    m36043c(arrayList, c1586e, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m36044b(arrayList, c1586e, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f4850b;
                    int i7 = c1608g.f4863a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        c1586e.mo35895d(i7 + i6, 1, this.f4852d.mo36048c(i7 + i6, c1608g.f4864b + i6));
                    }
                }
                i = c1608g.f4863a;
                i2 = c1608g.f4864b;
            }
            c1586e.m36109e();
        }

        /* renamed from: e */
        public void m36041e(RecyclerView.AbstractC1535g abstractC1535g) {
            m36042d(new C1577b(abstractC1535g));
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1605d<T> {
        /* renamed from: a */
        public abstract boolean mo36035a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo36034b(T t, T t2);

        /* renamed from: c */
        public Object m36033c(T t, T t2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$e */
    /* loaded from: classes.dex */
    public static class C1606e {

        /* renamed from: a */
        int f4856a;

        /* renamed from: b */
        int f4857b;

        /* renamed from: c */
        boolean f4858c;

        public C1606e(int i, int i2, boolean z) {
            this.f4856a = i;
            this.f4857b = i2;
            this.f4858c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$f */
    /* loaded from: classes.dex */
    public static class C1607f {

        /* renamed from: a */
        int f4859a;

        /* renamed from: b */
        int f4860b;

        /* renamed from: c */
        int f4861c;

        /* renamed from: d */
        int f4862d;

        public C1607f() {
        }

        public C1607f(int i, int i2, int i3, int i4) {
            this.f4859a = i;
            this.f4860b = i2;
            this.f4861c = i3;
            this.f4862d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$g */
    /* loaded from: classes.dex */
    public static class C1608g {

        /* renamed from: a */
        int f4863a;

        /* renamed from: b */
        int f4864b;

        /* renamed from: c */
        int f4865c;

        /* renamed from: d */
        boolean f4866d;

        /* renamed from: e */
        boolean f4867e;

        C1608g() {
        }
    }

    /* renamed from: a */
    public static C1604c m36054a(AbstractC1603b abstractC1603b) {
        return m36053b(abstractC1603b, true);
    }

    /* renamed from: b */
    public static C1604c m36053b(AbstractC1603b abstractC1603b, boolean z) {
        int mo36046e = abstractC1603b.mo36046e();
        int mo36047d = abstractC1603b.mo36047d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1607f(0, mo36046e, 0, mo36047d));
        int abs = mo36046e + mo36047d + Math.abs(mo36046e - mo36047d);
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1607f c1607f = (C1607f) arrayList2.remove(arrayList2.size() - 1);
            C1608g m36052c = m36052c(abstractC1603b, c1607f.f4859a, c1607f.f4860b, c1607f.f4861c, c1607f.f4862d, iArr, iArr2, abs);
            if (m36052c != null) {
                if (m36052c.f4865c > 0) {
                    arrayList.add(m36052c);
                }
                m36052c.f4863a += c1607f.f4859a;
                m36052c.f4864b += c1607f.f4861c;
                C1607f c1607f2 = arrayList3.isEmpty() ? new C1607f() : (C1607f) arrayList3.remove(arrayList3.size() - 1);
                c1607f2.f4859a = c1607f.f4859a;
                c1607f2.f4861c = c1607f.f4861c;
                if (m36052c.f4867e) {
                    c1607f2.f4860b = m36052c.f4863a;
                    c1607f2.f4862d = m36052c.f4864b;
                } else if (m36052c.f4866d) {
                    c1607f2.f4860b = m36052c.f4863a - 1;
                    c1607f2.f4862d = m36052c.f4864b;
                } else {
                    c1607f2.f4860b = m36052c.f4863a;
                    c1607f2.f4862d = m36052c.f4864b - 1;
                }
                arrayList2.add(c1607f2);
                if (m36052c.f4867e) {
                    if (m36052c.f4866d) {
                        int i2 = m36052c.f4863a;
                        int i3 = m36052c.f4865c;
                        c1607f.f4859a = i2 + i3 + 1;
                        c1607f.f4861c = m36052c.f4864b + i3;
                    } else {
                        int i4 = m36052c.f4863a;
                        int i5 = m36052c.f4865c;
                        c1607f.f4859a = i4 + i5;
                        c1607f.f4861c = m36052c.f4864b + i5 + 1;
                    }
                } else {
                    int i6 = m36052c.f4863a;
                    int i7 = m36052c.f4865c;
                    c1607f.f4859a = i6 + i7;
                    c1607f.f4861c = m36052c.f4864b + i7;
                }
                arrayList2.add(c1607f);
            } else {
                arrayList3.add(c1607f);
            }
        }
        Collections.sort(arrayList, f4848a);
        return new C1604c(abstractC1603b, arrayList, iArr, iArr2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1 A[LOOP:4: B:52:0x00cd->B:56:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec A[EDGE_INSN: B:89:0x00ec->B:58:0x00ec ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.recyclerview.widget.C1601h.C1608g m36052c(androidx.recyclerview.widget.C1601h.AbstractC1603b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1601h.m36052c(androidx.recyclerview.widget.h$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.h$g");
    }
}
