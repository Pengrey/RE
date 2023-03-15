package androidx.recyclerview.widget;

import androidx.core.util.C1074f;
import androidx.core.util.InterfaceC1073e;
import androidx.recyclerview.widget.C1640s;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C1571a implements C1640s.InterfaceC1641a {

    /* renamed from: a */
    private InterfaceC1073e<C1573b> f4743a;

    /* renamed from: b */
    final ArrayList<C1573b> f4744b;

    /* renamed from: c */
    final ArrayList<C1573b> f4745c;

    /* renamed from: d */
    final InterfaceC1572a f4746d;

    /* renamed from: e */
    Runnable f4747e;

    /* renamed from: f */
    final boolean f4748f;

    /* renamed from: g */
    final C1640s f4749g;

    /* renamed from: h */
    private int f4750h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1572a {
        /* renamed from: a */
        void mo36152a(int i, int i2);

        /* renamed from: b */
        void mo36151b(C1573b c1573b);

        /* renamed from: c */
        RecyclerView.AbstractC1531c0 mo36150c(int i);

        /* renamed from: d */
        void mo36149d(int i, int i2);

        /* renamed from: e */
        void mo36148e(int i, int i2);

        /* renamed from: f */
        void mo36147f(int i, int i2);

        /* renamed from: g */
        void mo36146g(C1573b c1573b);

        /* renamed from: h */
        void mo36145h(int i, int i2, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static class C1573b {

        /* renamed from: a */
        int f4751a;

        /* renamed from: b */
        int f4752b;

        /* renamed from: c */
        Object f4753c;

        /* renamed from: d */
        int f4754d;

        C1573b(int i, int i2, int i3, Object obj) {
            this.f4751a = i;
            this.f4752b = i2;
            this.f4754d = i3;
            this.f4753c = obj;
        }

        /* renamed from: a */
        String m36144a() {
            int i = this.f4751a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1573b.class != obj.getClass()) {
                return false;
            }
            C1573b c1573b = (C1573b) obj;
            int i = this.f4751a;
            if (i != c1573b.f4751a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4754d - this.f4752b) == 1 && this.f4754d == c1573b.f4752b && this.f4752b == c1573b.f4754d) {
                return true;
            }
            if (this.f4754d == c1573b.f4754d && this.f4752b == c1573b.f4752b) {
                Object obj2 = this.f4753c;
                if (obj2 != null) {
                    if (!obj2.equals(c1573b.f4753c)) {
                        return false;
                    }
                } else if (c1573b.f4753c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f4751a * 31) + this.f4752b) * 31) + this.f4754d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m36144a() + ",s:" + this.f4752b + "c:" + this.f4754d + ",p:" + this.f4753c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1571a(InterfaceC1572a interfaceC1572a) {
        this(interfaceC1572a, false);
    }

    /* renamed from: c */
    private void m36176c(C1573b c1573b) {
        m36157v(c1573b);
    }

    /* renamed from: d */
    private void m36175d(C1573b c1573b) {
        m36157v(c1573b);
    }

    /* renamed from: f */
    private void m36173f(C1573b c1573b) {
        boolean z;
        char c;
        int i = c1573b.f4752b;
        int i2 = c1573b.f4754d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4746d.mo36150c(i3) != null || m36171h(i3)) {
                if (c2 == 0) {
                    m36168k(mo35887b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m36157v(mo35887b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c1573b.f4754d) {
            mo35888a(c1573b);
            c1573b = mo35887b(2, i, i4, null);
        }
        if (c2 == 0) {
            m36168k(c1573b);
        } else {
            m36157v(c1573b);
        }
    }

    /* renamed from: g */
    private void m36172g(C1573b c1573b) {
        int i = c1573b.f4752b;
        int i2 = c1573b.f4754d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f4746d.mo36150c(i) != null || m36171h(i)) {
                if (!z) {
                    m36168k(mo35887b(4, i4, i3, c1573b.f4753c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    m36157v(mo35887b(4, i4, i3, c1573b.f4753c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != c1573b.f4754d) {
            Object obj = c1573b.f4753c;
            mo35888a(c1573b);
            c1573b = mo35887b(4, i4, i3, obj);
        }
        if (!z) {
            m36168k(c1573b);
        } else {
            m36157v(c1573b);
        }
    }

    /* renamed from: h */
    private boolean m36171h(int i) {
        int size = this.f4745c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1573b c1573b = this.f4745c.get(i2);
            int i3 = c1573b.f4751a;
            if (i3 == 8) {
                if (m36165n(c1573b.f4754d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1573b.f4752b;
                int i5 = c1573b.f4754d + i4;
                while (i4 < i5) {
                    if (m36165n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m36168k(C1573b c1573b) {
        int i;
        int i2 = c1573b.f4751a;
        if (i2 != 1 && i2 != 8) {
            int m36153z = m36153z(c1573b.f4752b, i2);
            int i3 = c1573b.f4752b;
            int i4 = c1573b.f4751a;
            if (i4 == 2) {
                i = 0;
            } else if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1573b);
            } else {
                i = 1;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c1573b.f4754d; i6++) {
                int m36153z2 = m36153z(c1573b.f4752b + (i * i6), c1573b.f4751a);
                int i7 = c1573b.f4751a;
                if (i7 == 2 ? m36153z2 == m36153z : i7 == 4 && m36153z2 == m36153z + 1) {
                    i5++;
                } else {
                    C1573b mo35887b = mo35887b(i7, m36153z, i5, c1573b.f4753c);
                    m36167l(mo35887b, i3);
                    mo35888a(mo35887b);
                    if (c1573b.f4751a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    m36153z = m36153z2;
                }
            }
            Object obj = c1573b.f4753c;
            mo35888a(c1573b);
            if (i5 > 0) {
                C1573b mo35887b2 = mo35887b(c1573b.f4751a, m36153z, i5, obj);
                m36167l(mo35887b2, i3);
                mo35888a(mo35887b2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: v */
    private void m36157v(C1573b c1573b) {
        this.f4745c.add(c1573b);
        int i = c1573b.f4751a;
        if (i == 1) {
            this.f4746d.mo36148e(c1573b.f4752b, c1573b.f4754d);
        } else if (i == 2) {
            this.f4746d.mo36149d(c1573b.f4752b, c1573b.f4754d);
        } else if (i == 4) {
            this.f4746d.mo36145h(c1573b.f4752b, c1573b.f4754d, c1573b.f4753c);
        } else if (i == 8) {
            this.f4746d.mo36152a(c1573b.f4752b, c1573b.f4754d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1573b);
        }
    }

    /* renamed from: z */
    private int m36153z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4745c.size() - 1; size >= 0; size--) {
            C1573b c1573b = this.f4745c.get(size);
            int i5 = c1573b.f4751a;
            if (i5 == 8) {
                int i6 = c1573b.f4752b;
                int i7 = c1573b.f4754d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c1573b.f4752b = i6 + 1;
                            c1573b.f4754d = i7 + 1;
                        } else if (i2 == 2) {
                            c1573b.f4752b = i6 - 1;
                            c1573b.f4754d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c1573b.f4754d = i7 + 1;
                    } else if (i2 == 2) {
                        c1573b.f4754d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c1573b.f4752b = i6 + 1;
                    } else if (i2 == 2) {
                        c1573b.f4752b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c1573b.f4752b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c1573b.f4754d;
                    } else if (i5 == 2) {
                        i += c1573b.f4754d;
                    }
                } else if (i2 == 1) {
                    c1573b.f4752b = i8 + 1;
                } else if (i2 == 2) {
                    c1573b.f4752b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f4745c.size() - 1; size2 >= 0; size2--) {
            C1573b c1573b2 = this.f4745c.get(size2);
            if (c1573b2.f4751a == 8) {
                int i9 = c1573b2.f4754d;
                if (i9 == c1573b2.f4752b || i9 < 0) {
                    this.f4745c.remove(size2);
                    mo35888a(c1573b2);
                }
            } else if (c1573b2.f4754d <= 0) {
                this.f4745c.remove(size2);
                mo35888a(c1573b2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C1640s.InterfaceC1641a
    /* renamed from: a */
    public void mo35888a(C1573b c1573b) {
        if (this.f4748f) {
            return;
        }
        c1573b.f4753c = null;
        this.f4743a.mo38626a(c1573b);
    }

    @Override // androidx.recyclerview.widget.C1640s.InterfaceC1641a
    /* renamed from: b */
    public C1573b mo35887b(int i, int i2, int i3, Object obj) {
        C1573b mo38625b = this.f4743a.mo38625b();
        if (mo38625b == null) {
            return new C1573b(i, i2, i3, obj);
        }
        mo38625b.f4751a = i;
        mo38625b.f4752b = i2;
        mo38625b.f4754d = i3;
        mo38625b.f4753c = obj;
        return mo38625b;
    }

    /* renamed from: e */
    public int m36174e(int i) {
        int size = this.f4744b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1573b c1573b = this.f4744b.get(i2);
            int i3 = c1573b.f4751a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c1573b.f4752b;
                    if (i4 <= i) {
                        int i5 = c1573b.f4754d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c1573b.f4752b;
                    if (i6 == i) {
                        i = c1573b.f4754d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c1573b.f4754d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c1573b.f4752b <= i) {
                i += c1573b.f4754d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36170i() {
        int size = this.f4745c.size();
        for (int i = 0; i < size; i++) {
            this.f4746d.mo36151b(this.f4745c.get(i));
        }
        m36155x(this.f4745c);
        this.f4750h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36169j() {
        m36170i();
        int size = this.f4744b.size();
        for (int i = 0; i < size; i++) {
            C1573b c1573b = this.f4744b.get(i);
            int i2 = c1573b.f4751a;
            if (i2 == 1) {
                this.f4746d.mo36151b(c1573b);
                this.f4746d.mo36148e(c1573b.f4752b, c1573b.f4754d);
            } else if (i2 == 2) {
                this.f4746d.mo36151b(c1573b);
                this.f4746d.mo36147f(c1573b.f4752b, c1573b.f4754d);
            } else if (i2 == 4) {
                this.f4746d.mo36151b(c1573b);
                this.f4746d.mo36145h(c1573b.f4752b, c1573b.f4754d, c1573b.f4753c);
            } else if (i2 == 8) {
                this.f4746d.mo36151b(c1573b);
                this.f4746d.mo36152a(c1573b.f4752b, c1573b.f4754d);
            }
            Runnable runnable = this.f4747e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m36155x(this.f4744b);
        this.f4750h = 0;
    }

    /* renamed from: l */
    void m36167l(C1573b c1573b, int i) {
        this.f4746d.mo36146g(c1573b);
        int i2 = c1573b.f4751a;
        if (i2 == 2) {
            this.f4746d.mo36147f(i, c1573b.f4754d);
        } else if (i2 == 4) {
            this.f4746d.mo36145h(i, c1573b.f4754d, c1573b.f4753c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m36166m(int i) {
        return m36165n(i, 0);
    }

    /* renamed from: n */
    int m36165n(int i, int i2) {
        int size = this.f4745c.size();
        while (i2 < size) {
            C1573b c1573b = this.f4745c.get(i2);
            int i3 = c1573b.f4751a;
            if (i3 == 8) {
                int i4 = c1573b.f4752b;
                if (i4 == i) {
                    i = c1573b.f4754d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1573b.f4754d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1573b.f4752b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1573b.f4754d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1573b.f4754d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m36164o(int i) {
        return (i & this.f4750h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m36163p() {
        return this.f4744b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m36162q() {
        return (this.f4745c.isEmpty() || this.f4744b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m36161r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4744b.add(mo35887b(4, i, i2, obj));
        this.f4750h |= 4;
        return this.f4744b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m36160s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4744b.add(mo35887b(1, i, i2, null));
        this.f4750h |= 1;
        return this.f4744b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m36159t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4744b.add(mo35887b(8, i, i2, null));
            this.f4750h |= 8;
            return this.f4744b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m36158u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4744b.add(mo35887b(2, i, i2, null));
        this.f4750h |= 2;
        return this.f4744b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m36156w() {
        this.f4749g.m35893b(this.f4744b);
        int size = this.f4744b.size();
        for (int i = 0; i < size; i++) {
            C1573b c1573b = this.f4744b.get(i);
            int i2 = c1573b.f4751a;
            if (i2 == 1) {
                m36176c(c1573b);
            } else if (i2 == 2) {
                m36173f(c1573b);
            } else if (i2 == 4) {
                m36172g(c1573b);
            } else if (i2 == 8) {
                m36175d(c1573b);
            }
            Runnable runnable = this.f4747e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4744b.clear();
    }

    /* renamed from: x */
    void m36155x(List<C1573b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo35888a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36154y() {
        m36155x(this.f4744b);
        m36155x(this.f4745c);
        this.f4750h = 0;
    }

    C1571a(InterfaceC1572a interfaceC1572a, boolean z) {
        this.f4743a = new C1074f(30);
        this.f4744b = new ArrayList<>();
        this.f4745c = new ArrayList<>();
        this.f4750h = 0;
        this.f4746d = interfaceC1572a;
        this.f4748f = z;
        this.f4749g = new C1640s(this);
    }
}
