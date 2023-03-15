package p191k1;

import androidx.core.view.accessibility.C1085c;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7581b;
import p245n1.C7582c;
import p245n1.C7595l;
import p245n1.C7608s;
import p245n1.SemanticsConfiguration;
import p245n1.SemanticsNode;
import p373u0.C10774f;
import p373u0.C10776g;
import p489zc.C13777q;
import p489zc.C13780s;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class CollectionInfo {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    /* renamed from: k1.a$a */
    /* loaded from: classes.dex */
    public static final class C6556a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6556a f17792w = new C6556a();

        C6556a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    /* renamed from: k1.a$b */
    /* loaded from: classes.dex */
    public static final class C6557b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6557b f17793w = new C6557b();

        C6557b() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    private static final boolean m20592a(List list) {
        List m197g;
        int m195i;
        long m7137s;
        int m195i2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            m197g = new ArrayList();
            Object obj = list.get(0);
            m195i2 = C13780s.m195i(list);
            int i = 0;
            while (i < m195i2) {
                i++;
                Object obj2 = list.get(i);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                m197g.add(C10774f.m7152d(C10776g.m7133a(Math.abs(C10774f.m7145k(semanticsNode2.m18007f().m7127d()) - C10774f.m7145k(semanticsNode.m18007f().m7127d())), Math.abs(C10774f.m7144l(semanticsNode2.m18007f().m7127d()) - C10774f.m7144l(semanticsNode.m18007f().m7127d())))));
                obj = obj2;
            }
        } else {
            m197g = C13780s.m197g();
        }
        if (m197g.size() == 1) {
            m7137s = ((C10774f) C13777q.m256L(m197g)).m7137s();
        } else if (!m197g.isEmpty()) {
            Object m256L = C13777q.m256L(m197g);
            m195i = C13780s.m195i(m197g);
            if (1 <= m195i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    m256L = C10774f.m7152d(C10774f.m7140p(((C10774f) m256L).m7137s(), ((C10774f) m197g.get(i2)).m7137s()));
                    if (i2 == m195i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            m7137s = ((C10774f) m256L).m7137s();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return C10774f.m7150f(m7137s) < C10774f.m7151e(m7137s);
    }

    /* renamed from: b */
    public static final boolean m20591b(SemanticsNode semanticsNode) {
        Intrinsics.isThisObjectNull(semanticsNode, "<this>");
        SemanticsConfiguration m18005h = semanticsNode.m18005h();
        C7608s c7608s = C7608s.f20138a;
        return (C7595l.m18025a(m18005h, c7608s.m17970a()) == null && C7595l.m18025a(semanticsNode.m18005h(), c7608s.m17953r()) == null) ? false : true;
    }

    /* renamed from: c */
    private static final boolean m20590c(C7581b c7581b) {
        return c7581b.m18102b() < 0 || c7581b.m18103a() < 0;
    }

    /* renamed from: d */
    public static final void m20589d(SemanticsNode semanticsNode, C1085c c1085c) {
        Intrinsics.isThisObjectNull(semanticsNode, "node");
        Intrinsics.isThisObjectNull(c1085c, "info");
        SemanticsConfiguration m18005h = semanticsNode.m18005h();
        C7608s c7608s = C7608s.f20138a;
        C7581b c7581b = (C7581b) C7595l.m18025a(m18005h, c7608s.m17970a());
        if (c7581b != null) {
            c1085c.m38558c0(m20587f(c7581b));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (C7595l.m18025a(semanticsNode.m18005h(), c7608s.m17953r()) != null) {
            List m17997p = semanticsNode.m17997p();
            int size = m17997p.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                SemanticsNode semanticsNode2 = (SemanticsNode) m17997p.get(i);
                if (semanticsNode2.m18005h().m18035h(C7608s.f20138a.m17952s())) {
                    arrayList.add(semanticsNode2);
                }
                i = i2;
            }
        }
        if (!arrayList.isEmpty()) {
            boolean m20592a = m20592a(arrayList);
            c1085c.m38558c0(C1085c.C1087b.m38507a(m20592a ? 1 : arrayList.size(), m20592a ? arrayList.size() : 1, false, 0));
        }
    }

    /* renamed from: e */
    public static final void m20588e(SemanticsNode semanticsNode, C1085c c1085c) {
        Intrinsics.isThisObjectNull(semanticsNode, "node");
        Intrinsics.isThisObjectNull(c1085c, "info");
        SemanticsConfiguration m18005h = semanticsNode.m18005h();
        C7608s c7608s = C7608s.f20138a;
        C7582c c7582c = (C7582c) C7595l.m18025a(m18005h, c7608s.m17969b());
        if (c7582c != null) {
            c1085c.m38556d0(m20586g(c7582c, semanticsNode));
        }
        SemanticsNode m17999n = semanticsNode.m17999n();
        if (m17999n == null || C7595l.m18025a(m17999n.m18005h(), c7608s.m17953r()) == null) {
            return;
        }
        C7581b c7581b = (C7581b) C7595l.m18025a(m17999n.m18005h(), c7608s.m17970a());
        if ((c7581b == null || !m20590c(c7581b)) && semanticsNode.m18005h().m18035h(c7608s.m17952s())) {
            ArrayList arrayList = new ArrayList();
            List m17997p = m17999n.m17997p();
            int size = m17997p.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                SemanticsNode semanticsNode2 = (SemanticsNode) m17997p.get(i);
                if (semanticsNode2.m18005h().m18035h(C7608s.f20138a.m17952s())) {
                    arrayList.add(semanticsNode2);
                }
                i = i2;
            }
            if (!arrayList.isEmpty()) {
                boolean m20592a = m20592a(arrayList);
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = i3 + 1;
                    SemanticsNode semanticsNode3 = (SemanticsNode) arrayList.get(i3);
                    if (semanticsNode3.m18004i() == semanticsNode.m18004i()) {
                        C1085c.C1088c m38506a = C1085c.C1088c.m38506a(m20592a ? 0 : i3, 1, m20592a ? i3 : 0, 1, false, ((Boolean) semanticsNode3.m18005h().m18032p(C7608s.f20138a.m17952s(), C6556a.f17792w)).booleanValue());
                        if (m38506a != null) {
                            c1085c.m38556d0(m38506a);
                        }
                    }
                    i3 = i4;
                }
            }
        }
    }

    /* renamed from: f */
    private static final C1085c.C1087b m20587f(C7581b c7581b) {
        return C1085c.C1087b.m38507a(c7581b.m18102b(), c7581b.m18103a(), false, 0);
    }

    /* renamed from: g */
    private static final C1085c.C1088c m20586g(C7582c c7582c, SemanticsNode semanticsNode) {
        return C1085c.C1088c.m38506a(c7582c.m18099c(), c7582c.m18098d(), c7582c.m18101a(), c7582c.m18100b(), false, ((Boolean) semanticsNode.m18005h().m18032p(C7608s.f20138a.m17952s(), C6557b.f17793w)).booleanValue());
    }
}
