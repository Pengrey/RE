package androidx.recyclerview.widget;

import androidx.core.util.C1074f;
import androidx.core.util.InterfaceC1073e;
import androidx.recyclerview.widget.RecyclerView;
import p301q.C9556e;
import p301q.C9558g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a0 */
/* loaded from: classes.dex */
public class C1574a0 {

    /* renamed from: a */
    final C9558g<RecyclerView.AbstractC1531c0, C1575a> f4755a = new C9558g<>();

    /* renamed from: b */
    final C9556e<RecyclerView.AbstractC1531c0> f4756b = new C9556e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.a0$a */
    /* loaded from: classes.dex */
    public static class C1575a {

        /* renamed from: d */
        static InterfaceC1073e<C1575a> f4757d = new C1074f(20);

        /* renamed from: a */
        int f4758a;

        /* renamed from: b */
        RecyclerView.AbstractC1540l.C1543c f4759b;

        /* renamed from: c */
        RecyclerView.AbstractC1540l.C1543c f4760c;

        private C1575a() {
        }

        /* renamed from: a */
        static void m36126a() {
            do {
            } while (f4757d.mo38625b() != null);
        }

        /* renamed from: b */
        static C1575a m36125b() {
            C1575a mo38625b = f4757d.mo38625b();
            return mo38625b == null ? new C1575a() : mo38625b;
        }

        /* renamed from: c */
        static void m36124c(C1575a c1575a) {
            c1575a.f4758a = 0;
            c1575a.f4759b = null;
            c1575a.f4760c = null;
            f4757d.mo38626a(c1575a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* renamed from: androidx.recyclerview.widget.a0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1576b {
        /* renamed from: a */
        void mo36123a(RecyclerView.AbstractC1531c0 abstractC1531c0);

        /* renamed from: b */
        void mo36122b(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2);

        /* renamed from: c */
        void mo36121c(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2);

        /* renamed from: d */
        void mo36120d(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c, RecyclerView.AbstractC1540l.C1543c c1543c2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC1540l.C1543c m36132l(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        C1575a m10610q;
        RecyclerView.AbstractC1540l.C1543c c1543c;
        int m10617j = this.f4755a.m10617j(abstractC1531c0);
        if (m10617j >= 0 && (m10610q = this.f4755a.m10610q(m10617j)) != null) {
            int i2 = m10610q.f4758a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m10610q.f4758a = i3;
                if (i == 4) {
                    c1543c = m10610q.f4759b;
                } else if (i == 8) {
                    c1543c = m10610q.f4760c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4755a.m10612o(m10617j);
                    C1575a.m36124c(m10610q);
                }
                return c1543c;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36143a(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        if (c1575a == null) {
            c1575a = C1575a.m36125b();
            this.f4755a.put(abstractC1531c0, c1575a);
        }
        c1575a.f4758a |= 2;
        c1575a.f4759b = c1543c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36142b(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        if (c1575a == null) {
            c1575a = C1575a.m36125b();
            this.f4755a.put(abstractC1531c0, c1575a);
        }
        c1575a.f4758a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36141c(long j, RecyclerView.AbstractC1531c0 abstractC1531c0) {
        this.f4756b.m10639l(j, abstractC1531c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36140d(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        if (c1575a == null) {
            c1575a = C1575a.m36125b();
            this.f4755a.put(abstractC1531c0, c1575a);
        }
        c1575a.f4760c = c1543c;
        c1575a.f4758a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36139e(RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1540l.C1543c c1543c) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        if (c1575a == null) {
            c1575a = C1575a.m36125b();
            this.f4755a.put(abstractC1531c0, c1575a);
        }
        c1575a.f4759b = c1543c;
        c1575a.f4758a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36138f() {
        this.f4755a.clear();
        this.f4756b.m10648b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC1531c0 m36137g(long j) {
        return this.f4756b.m10644f(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m36136h(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        return (c1575a == null || (c1575a.f4758a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m36135i(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        return (c1575a == null || (c1575a.f4758a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36134j() {
        C1575a.m36126a();
    }

    /* renamed from: k */
    public void m36133k(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        m36128p(abstractC1531c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC1540l.C1543c m36131m(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        return m36132l(abstractC1531c0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC1540l.C1543c m36130n(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        return m36132l(abstractC1531c0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36129o(InterfaceC1576b interfaceC1576b) {
        for (int size = this.f4755a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1531c0 m10614m = this.f4755a.m10614m(size);
            C1575a m10612o = this.f4755a.m10612o(size);
            int i = m10612o.f4758a;
            if ((i & 3) == 3) {
                interfaceC1576b.mo36123a(m10614m);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC1540l.C1543c c1543c = m10612o.f4759b;
                if (c1543c == null) {
                    interfaceC1576b.mo36123a(m10614m);
                } else {
                    interfaceC1576b.mo36121c(m10614m, c1543c, m10612o.f4760c);
                }
            } else if ((i & 14) == 14) {
                interfaceC1576b.mo36122b(m10614m, m10612o.f4759b, m10612o.f4760c);
            } else if ((i & 12) == 12) {
                interfaceC1576b.mo36120d(m10614m, m10612o.f4759b, m10612o.f4760c);
            } else if ((i & 4) != 0) {
                interfaceC1576b.mo36121c(m10614m, m10612o.f4759b, null);
            } else if ((i & 8) != 0) {
                interfaceC1576b.mo36122b(m10614m, m10612o.f4759b, m10612o.f4760c);
            }
            C1575a.m36124c(m10612o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36128p(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        C1575a c1575a = this.f4755a.get(abstractC1531c0);
        if (c1575a == null) {
            return;
        }
        c1575a.f4758a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36127q(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        int m10636o = this.f4756b.m10636o() - 1;
        while (true) {
            if (m10636o < 0) {
                break;
            } else if (abstractC1531c0 == this.f4756b.m10635p(m10636o)) {
                this.f4756b.m10637n(m10636o);
                break;
            } else {
                m10636o--;
            }
        }
        C1575a remove = this.f4755a.remove(abstractC1531c0);
        if (remove != null) {
            C1575a.m36124c(remove);
        }
    }
}
