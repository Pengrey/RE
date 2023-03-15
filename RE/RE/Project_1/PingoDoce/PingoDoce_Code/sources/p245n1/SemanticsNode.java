package p245n1;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import p127h1.InterfaceC5800o;
import p127h1.LayoutCoordinates;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.Rect;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.C13780s;

/* renamed from: n1.p */
/* loaded from: classes.dex */
public final class SemanticsNode {

    /* renamed from: a */
    private final SemanticsWrapper f20126a;

    /* renamed from: b */
    private final boolean f20127b;

    /* renamed from: c */
    private boolean f20128c;

    /* renamed from: d */
    private SemanticsNode f20129d;

    /* renamed from: e */
    private final SemanticsConfiguration f20130e;

    /* renamed from: f */
    private final int f20131f;

    /* renamed from: g */
    private final LayoutNode f20132g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* renamed from: n1.p$a */
    /* loaded from: classes.dex */
    public static final class C7603a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C7591h f20133w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7603a(C7591h c7591h) {
            super(1);
            this.f20133w = c7591h;
        }

        /* renamed from: a */
        public final void m17987a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$fakeSemanticsNode");
            C7617t.m17917u(interfaceC7621v, this.f20133w.m18061m());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17987a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* renamed from: n1.p$b */
    /* loaded from: classes.dex */
    public static final class C7604b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f20134w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7604b(String str) {
            super(1);
            this.f20134w = str;
        }

        /* renamed from: a */
        public final void m17986a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$fakeSemanticsNode");
            C7617t.m17922p(interfaceC7621v, this.f20134w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17986a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* renamed from: n1.p$c */
    /* loaded from: classes.dex */
    public static final class C7605c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7605c f20135w = new C7605c();

        C7605c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            SemanticsConfiguration m17903Y1;
            Intrinsics.isThisObjectNull(layoutNode, "it");
            SemanticsWrapper m17974j = C7607q.m17974j(layoutNode);
            return Boolean.valueOf((m17974j == null || (m17903Y1 = m17974j.m17903Y1()) == null || !m17903Y1.m18029u()) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* renamed from: n1.p$d */
    /* loaded from: classes.dex */
    public static final class C7606d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7606d f20136w = new C7606d();

        C7606d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "it");
            return Boolean.valueOf(C7607q.m17974j(layoutNode) != null);
        }
    }

    public SemanticsNode(SemanticsWrapper semanticsWrapper, boolean z) {
        Intrinsics.isThisObjectNull(semanticsWrapper, "outerSemanticsNodeWrapper");
        this.f20126a = semanticsWrapper;
        this.f20127b = z;
        this.f20130e = semanticsWrapper.m17903Y1();
        this.f20131f = ((SemanticsModifier) semanticsWrapper.m21755P1()).getId();
        this.f20132g = semanticsWrapper.m21378c1();
    }

    /* renamed from: a */
    private final void m18012a(List list) {
        C7591h m17981c = C7607q.m17981c(this);
        if (m17981c != null && this.f20130e.m18029u() && (!list.isEmpty())) {
            list.add(m18011b(m17981c, new C7603a(m17981c)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f20130e;
        C7608s c7608s = C7608s.f20138a;
        if (semanticsConfiguration.m18035h(c7608s.m17968c()) && (!list.isEmpty()) && this.f20130e.m18029u()) {
            List list2 = (List) C7595l.m18025a(this.f20130e, c7608s.m17968c());
            String str = list2 == null ? null : (String) C13777q.m254N(list2);
            if (str != null) {
                list.add(0, m18011b(null, new C7604b(str)));
            }
        }
    }

    /* renamed from: b */
    private final SemanticsNode m18011b(C7591h c7591h, InterfaceC6108l interfaceC6108l) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsWrapper(new LayoutNode(true).m21563P(), new C7598n(c7591h != null ? C7607q.m17980d(this) : C7607q.m17983a(this), false, false, interfaceC6108l)), false);
        semanticsNode.f20128c = true;
        semanticsNode.f20129d = this;
        return semanticsNode;
    }

    /* renamed from: c */
    private final List m18010c(List list, boolean z) {
        List m17988y = m17988y(this, z, false, 2, null);
        int size = m17988y.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            SemanticsNode semanticsNode = (SemanticsNode) m17988y.get(i);
            if (semanticsNode.m17991v()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.m17993t().m18030t()) {
                m18009d(semanticsNode, list, false, 2, null);
            }
            i = i2;
        }
        return list;
    }

    /* renamed from: d */
    static /* synthetic */ List m18009d(SemanticsNode semanticsNode, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return semanticsNode.m18010c(list, z);
    }

    /* renamed from: g */
    private final List m18006g(boolean z, boolean z2, boolean z3) {
        List m197g;
        if (!z2 && this.f20130e.m18030t()) {
            m197g = C13780s.m197g();
            return m197g;
        } else if (m17991v()) {
            return m18009d(this, null, z, 1, null);
        } else {
            return m17989x(z, z3);
        }
    }

    /* renamed from: v */
    private final boolean m17991v() {
        return this.f20127b && this.f20130e.m18029u();
    }

    /* renamed from: w */
    private final void m17990w(SemanticsConfiguration semanticsConfiguration) {
        if (this.f20130e.m18030t()) {
            return;
        }
        int i = 0;
        List m17988y = m17988y(this, false, false, 3, null);
        int size = m17988y.size();
        while (i < size) {
            int i2 = i + 1;
            SemanticsNode semanticsNode = (SemanticsNode) m17988y.get(i);
            if (!semanticsNode.m17991v()) {
                semanticsConfiguration.m18028v(semanticsNode.m17993t());
                semanticsNode.m17990w(semanticsConfiguration);
            }
            i = i2;
        }
    }

    /* renamed from: y */
    public static /* synthetic */ List m17988y(SemanticsNode semanticsNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.m17989x(z, z2);
    }

    /* renamed from: e */
    public final SemanticsWrapper m18008e() {
        if (this.f20130e.m18029u()) {
            SemanticsWrapper m17975i = C7607q.m17975i(this.f20132g);
            return m17975i == null ? this.f20126a : m17975i;
        }
        return this.f20126a;
    }

    /* renamed from: f */
    public final Rect m18007f() {
        return !this.f20132g.m21515q0() ? Rect.f27871e.m7115a() : LayoutCoordinates.m23093b(m18008e());
    }

    /* renamed from: h */
    public final SemanticsConfiguration m18005h() {
        if (m17991v()) {
            SemanticsConfiguration m18034l = this.f20130e.m18034l();
            m17990w(m18034l);
            return m18034l;
        }
        return this.f20130e;
    }

    /* renamed from: i */
    public final int m18004i() {
        return this.f20131f;
    }

    /* renamed from: j */
    public final InterfaceC5800o m18003j() {
        return this.f20132g;
    }

    /* renamed from: k */
    public final LayoutNode m18002k() {
        return this.f20132g;
    }

    /* renamed from: l */
    public final boolean m18001l() {
        return this.f20127b;
    }

    /* renamed from: m */
    public final SemanticsWrapper m18000m() {
        return this.f20126a;
    }

    /* renamed from: n */
    public final SemanticsNode m17999n() {
        SemanticsNode semanticsNode = this.f20129d;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode m17982b = this.f20127b ? C7607q.m17982b(this.f20132g, C7605c.f20135w) : null;
        if (m17982b == null) {
            m17982b = C7607q.m17982b(this.f20132g, C7606d.f20136w);
        }
        SemanticsWrapper m17974j = m17982b == null ? null : C7607q.m17974j(m17982b);
        if (m17974j == null) {
            return null;
        }
        return new SemanticsNode(m17974j, this.f20127b);
    }

    /* renamed from: o */
    public final long m17998o() {
        return !this.f20132g.m21515q0() ? C10774f.f27866b.m7134c() : LayoutCoordinates.m23091d(m18008e());
    }

    /* renamed from: p */
    public final List m17997p() {
        return m18006g(false, false, true);
    }

    /* renamed from: q */
    public final List m17996q() {
        return m18006g(true, false, true);
    }

    /* renamed from: r */
    public final long m17995r() {
        return m18008e().mo23107b();
    }

    /* renamed from: s */
    public final Rect m17994s() {
        return m18008e().m17901a2();
    }

    /* renamed from: t */
    public final SemanticsConfiguration m17993t() {
        return this.f20130e;
    }

    /* renamed from: u */
    public final boolean m17992u() {
        return this.f20128c;
    }

    /* renamed from: x */
    public final List m17989x(boolean z, boolean z2) {
        List m17976h;
        List m197g;
        if (this.f20128c) {
            m197g = C13780s.m197g();
            return m197g;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            m17976h = C7622w.m17907c(this.f20132g, null, 1, null);
        } else {
            m17976h = C7607q.m17976h(this.f20132g, null, 1, null);
        }
        int size = m17976h.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((SemanticsWrapper) m17976h.get(i), m18001l()));
        }
        if (z2) {
            m18012a(arrayList);
        }
        return arrayList;
    }
}
