package androidx.compose.p018ui.platform;

import android.graphics.Region;
import androidx.compose.p018ui.platform.C0780s;
import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p127h1.InterfaceC5800o;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7580a;
import p245n1.C7594j;
import p245n1.C7595l;
import p245n1.C7607q;
import p245n1.C7608s;
import p245n1.C7619u;
import p245n1.SemanticsConfiguration;
import p245n1.SemanticsNode;
import p245n1.SemanticsOwner;
import p245n1.SemanticsWrapper;
import p373u0.Rect;
import p393v0.C11069v0;
import p479z1.EnumC13618o;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* renamed from: androidx.compose.ui.platform.t */
/* loaded from: classes.dex */
public final class C0801t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.t$a */
    /* loaded from: classes.dex */
    public static final class C0802a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0802a f2417w = new C0802a();

        C0802a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "it");
            SemanticsWrapper m17974j = C7607q.m17974j(layoutNode);
            SemanticsConfiguration m17903Y1 = m17974j == null ? null : m17974j.m17903Y1();
            boolean z = false;
            if ((m17903Y1 != null && m17903Y1.m18029u()) && m17903Y1.m18035h(C7594j.f20098a.m18037o())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m39528a(C7580a c7580a, Object obj) {
        return m39519j(c7580a, obj);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m39527b(SemanticsNode semanticsNode) {
        return m39518k(semanticsNode);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m39526c(SemanticsNode semanticsNode) {
        return m39517l(semanticsNode);
    }

    /* renamed from: d */
    public static final /* synthetic */ LayoutNode m39525d(LayoutNode layoutNode, InterfaceC6108l interfaceC6108l) {
        return m39515n(layoutNode, interfaceC6108l);
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m39524e(SemanticsNode semanticsNode) {
        return m39512q(semanticsNode);
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m39523f(SemanticsNode semanticsNode) {
        return m39511r(semanticsNode);
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m39522g(SemanticsNode semanticsNode) {
        return m39510s(semanticsNode);
    }

    /* renamed from: h */
    public static final /* synthetic */ boolean m39521h(SemanticsNode semanticsNode) {
        return m39509t(semanticsNode);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m39520i(SemanticsNode semanticsNode, C0780s.C0789g c0789g) {
        return m39508u(semanticsNode, c0789g);
    }

    /* renamed from: j */
    private static final boolean m39519j(C7580a c7580a, Object obj) {
        if (c7580a == obj) {
            return true;
        }
        if (obj instanceof C7580a) {
            C7580a c7580a2 = (C7580a) obj;
            if (Intrinsics.equals(c7580a.m18104b(), c7580a2.m18104b())) {
                if (c7580a.m18105a() != null || c7580a2.m18105a() == null) {
                    return c7580a.m18105a() == null || c7580a2.m18105a() != null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    private static final boolean m39518k(SemanticsNode semanticsNode) {
        return C7595l.m18025a(semanticsNode.m18005h(), C7608s.f20138a.m17967d()) == null;
    }

    /* renamed from: l */
    private static final boolean m39517l(SemanticsNode semanticsNode) {
        SemanticsConfiguration m17903Y1;
        if (!m39509t(semanticsNode) || Intrinsics.equals(C7595l.m18025a(semanticsNode.m17993t(), C7608s.f20138a.m17964g()), Boolean.TRUE)) {
            LayoutNode m39515n = m39515n(semanticsNode.m18002k(), C0802a.f2417w);
            if (m39515n != null) {
                SemanticsWrapper m17974j = C7607q.m17974j(m39515n);
                if (!((m17974j == null || (m17903Y1 = m17974j.m17903Y1()) == null) ? false : Intrinsics.equals(C7595l.m18025a(m17903Y1, C7608s.f20138a.m17964g()), Boolean.TRUE))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final C0719g1 m39516m(List list, int i) {
        Intrinsics.isThisObjectNull(list, "<this>");
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (((C0719g1) list.get(i2)).m39745d() == i) {
                return (C0719g1) list.get(i2);
            }
            i2 = i3;
        }
        return null;
    }

    /* renamed from: n */
    private static final LayoutNode m39515n(LayoutNode layoutNode, InterfaceC6108l interfaceC6108l) {
        for (LayoutNode m21547a0 = layoutNode.m21547a0(); m21547a0 != null; m21547a0 = m21547a0.m21547a0()) {
            if (((Boolean) interfaceC6108l.mo9587d(m21547a0)).booleanValue()) {
                return m21547a0;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final Map m39514o(SemanticsOwner semanticsOwner) {
        Intrinsics.isThisObjectNull(semanticsOwner, "<this>");
        SemanticsNode m17971a = semanticsOwner.m17971a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (m17971a.m18002k().mo23015f()) {
            Region region = new Region();
            region.set(C11069v0.m6244a(m17971a.m18007f()));
            m39513p(region, m17971a, linkedHashMap, m17971a);
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    /* renamed from: p */
    private static final void m39513p(Region region, SemanticsNode semanticsNode, Map map, SemanticsNode semanticsNode2) {
        InterfaceC5800o m18003j;
        Rect rect;
        if (!region.isEmpty() || semanticsNode2.m18004i() == semanticsNode.m18004i()) {
            if (semanticsNode2.m18002k().mo23015f() || semanticsNode2.m17992u()) {
                android.graphics.Rect m6244a = C11069v0.m6244a(semanticsNode2.m17994s());
                Region region2 = new Region();
                region2.set(m6244a);
                int m18004i = semanticsNode2.m18004i() == semanticsNode.m18004i() ? -1 : semanticsNode2.m18004i();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer valueOf = Integer.valueOf(m18004i);
                    android.graphics.Rect bounds = region2.getBounds();
                    Intrinsics.checkIfNull(bounds, "region.bounds");
                    map.put(valueOf, new C0723h1(semanticsNode2, bounds));
                    List m17997p = semanticsNode2.m17997p();
                    int size = m17997p.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i = size - 1;
                            m39513p(region, semanticsNode, map, (SemanticsNode) m17997p.get(size));
                            if (i < 0) {
                                break;
                            }
                            size = i;
                        }
                    }
                    region.op(m6244a, region, Region.Op.REVERSE_DIFFERENCE);
                } else if (semanticsNode2.m17992u()) {
                    SemanticsNode m17999n = semanticsNode2.m17999n();
                    if ((m17999n == null || (m18003j = m17999n.m18003j()) == null || !m18003j.mo23015f()) ? false : true) {
                        rect = m17999n.m18007f();
                    } else {
                        rect = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
                    }
                    map.put(Integer.valueOf(m18004i), new C0723h1(semanticsNode2, C11069v0.m6244a(rect)));
                } else if (m18004i == -1) {
                    Integer valueOf2 = Integer.valueOf(m18004i);
                    android.graphics.Rect bounds2 = region2.getBounds();
                    Intrinsics.checkIfNull(bounds2, "region.bounds");
                    map.put(valueOf2, new C0723h1(semanticsNode2, bounds2));
                }
            }
        }
    }

    /* renamed from: q */
    private static final boolean m39512q(SemanticsNode semanticsNode) {
        return semanticsNode.m18005h().m18035h(C7608s.f20138a.m17957n());
    }

    /* renamed from: r */
    private static final boolean m39511r(SemanticsNode semanticsNode) {
        return semanticsNode.m18005h().m18035h(C7608s.f20138a.m17956o());
    }

    /* renamed from: s */
    private static final boolean m39510s(SemanticsNode semanticsNode) {
        return semanticsNode.m18003j().getLayoutDirection() == EnumC13618o.Rtl;
    }

    /* renamed from: t */
    private static final boolean m39509t(SemanticsNode semanticsNode) {
        return semanticsNode.m17993t().m18035h(C7594j.f20098a.m18037o());
    }

    /* renamed from: u */
    private static final boolean m39508u(SemanticsNode semanticsNode, C0780s.C0789g c0789g) {
        Iterator it = c0789g.m39539b().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.m18005h().m18035h((C7619u) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
