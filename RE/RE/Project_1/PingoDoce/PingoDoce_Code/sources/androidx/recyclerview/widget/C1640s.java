package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1571a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
public class C1640s {

    /* renamed from: a */
    final InterfaceC1641a f5000a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OpReorderer.java */
    /* renamed from: androidx.recyclerview.widget.s$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1641a {
        /* renamed from: a */
        void mo35888a(C1571a.C1573b c1573b);

        /* renamed from: b */
        C1571a.C1573b mo35887b(int i, int i2, int i3, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1640s(InterfaceC1641a interfaceC1641a) {
        this.f5000a = interfaceC1641a;
    }

    /* renamed from: a */
    private int m35894a(List<C1571a.C1573b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4751a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m35892c(List<C1571a.C1573b> list, int i, C1571a.C1573b c1573b, int i2, C1571a.C1573b c1573b2) {
        int i3 = c1573b.f4754d;
        int i4 = c1573b2.f4752b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = c1573b.f4752b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            c1573b.f4752b = i6 + c1573b2.f4754d;
        }
        int i7 = c1573b2.f4752b;
        if (i7 <= i3) {
            c1573b.f4754d = i3 + c1573b2.f4754d;
        }
        c1573b2.f4752b = i7 + i5;
        list.set(i, c1573b2);
        list.set(i2, c1573b);
    }

    /* renamed from: d */
    private void m35891d(List<C1571a.C1573b> list, int i, int i2) {
        C1571a.C1573b c1573b = list.get(i);
        C1571a.C1573b c1573b2 = list.get(i2);
        int i3 = c1573b2.f4751a;
        if (i3 == 1) {
            m35892c(list, i, c1573b, i2, c1573b2);
        } else if (i3 == 2) {
            m35890e(list, i, c1573b, i2, c1573b2);
        } else if (i3 != 4) {
        } else {
            m35889f(list, i, c1573b, i2, c1573b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35893b(List<C1571a.C1573b> list) {
        while (true) {
            int m35894a = m35894a(list);
            if (m35894a == -1) {
                return;
            }
            m35891d(list, m35894a, m35894a + 1);
        }
    }

    /* renamed from: e */
    void m35890e(List<C1571a.C1573b> list, int i, C1571a.C1573b c1573b, int i2, C1571a.C1573b c1573b2) {
        boolean z;
        int i3 = c1573b.f4752b;
        int i4 = c1573b.f4754d;
        boolean z2 = false;
        if (i3 < i4) {
            if (c1573b2.f4752b == i3 && c1573b2.f4754d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c1573b2.f4752b == i4 + 1 && c1573b2.f4754d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c1573b2.f4752b;
        if (i4 < i5) {
            c1573b2.f4752b = i5 - 1;
        } else {
            int i6 = c1573b2.f4754d;
            if (i4 < i5 + i6) {
                c1573b2.f4754d = i6 - 1;
                c1573b.f4751a = 2;
                c1573b.f4754d = 1;
                if (c1573b2.f4754d == 0) {
                    list.remove(i2);
                    this.f5000a.mo35888a(c1573b2);
                    return;
                }
                return;
            }
        }
        int i7 = c1573b.f4752b;
        int i8 = c1573b2.f4752b;
        C1571a.C1573b c1573b3 = null;
        if (i7 <= i8) {
            c1573b2.f4752b = i8 + 1;
        } else {
            int i9 = c1573b2.f4754d;
            if (i7 < i8 + i9) {
                c1573b3 = this.f5000a.mo35887b(2, i7 + 1, (i8 + i9) - i7, null);
                c1573b2.f4754d = c1573b.f4752b - c1573b2.f4752b;
            }
        }
        if (z2) {
            list.set(i, c1573b2);
            list.remove(i2);
            this.f5000a.mo35888a(c1573b);
            return;
        }
        if (z) {
            if (c1573b3 != null) {
                int i10 = c1573b.f4752b;
                if (i10 > c1573b3.f4752b) {
                    c1573b.f4752b = i10 - c1573b3.f4754d;
                }
                int i11 = c1573b.f4754d;
                if (i11 > c1573b3.f4752b) {
                    c1573b.f4754d = i11 - c1573b3.f4754d;
                }
            }
            int i12 = c1573b.f4752b;
            if (i12 > c1573b2.f4752b) {
                c1573b.f4752b = i12 - c1573b2.f4754d;
            }
            int i13 = c1573b.f4754d;
            if (i13 > c1573b2.f4752b) {
                c1573b.f4754d = i13 - c1573b2.f4754d;
            }
        } else {
            if (c1573b3 != null) {
                int i14 = c1573b.f4752b;
                if (i14 >= c1573b3.f4752b) {
                    c1573b.f4752b = i14 - c1573b3.f4754d;
                }
                int i15 = c1573b.f4754d;
                if (i15 >= c1573b3.f4752b) {
                    c1573b.f4754d = i15 - c1573b3.f4754d;
                }
            }
            int i16 = c1573b.f4752b;
            if (i16 >= c1573b2.f4752b) {
                c1573b.f4752b = i16 - c1573b2.f4754d;
            }
            int i17 = c1573b.f4754d;
            if (i17 >= c1573b2.f4752b) {
                c1573b.f4754d = i17 - c1573b2.f4754d;
            }
        }
        list.set(i, c1573b2);
        if (c1573b.f4752b != c1573b.f4754d) {
            list.set(i2, c1573b);
        } else {
            list.remove(i2);
        }
        if (c1573b3 != null) {
            list.add(i, c1573b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m35889f(java.util.List<androidx.recyclerview.widget.C1571a.C1573b> r9, int r10, androidx.recyclerview.widget.C1571a.C1573b r11, int r12, androidx.recyclerview.widget.C1571a.C1573b r13) {
        /*
            r8 = this;
            int r0 = r11.f4754d
            int r1 = r13.f4752b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f4752b = r1
            goto L20
        Ld:
            int r5 = r13.f4754d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f4754d = r5
            androidx.recyclerview.widget.s$a r0 = r8.f5000a
            int r1 = r11.f4752b
            java.lang.Object r5 = r13.f4753c
            androidx.recyclerview.widget.a$b r0 = r0.mo35887b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f4752b
            int r5 = r13.f4752b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f4752b = r5
            goto L41
        L2b:
            int r6 = r13.f4754d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.s$a r3 = r8.f5000a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f4753c
            androidx.recyclerview.widget.a$b r3 = r3.mo35887b(r2, r1, r5, r4)
            int r1 = r13.f4754d
            int r1 = r1 - r5
            r13.f4754d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4754d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.s$a r11 = r8.f5000a
            r11.mo35888a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1640s.m35889f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
