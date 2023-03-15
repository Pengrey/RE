package p169j1;

import java.util.HashMap;
import java.util.Map;
import p112g0.MutableVector;
import p127h1.AbstractC5743a;
import p127h1.AlignmentLine;
import p127h1.C5767g;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10774f;
import p373u0.C10776g;
import p489zc.C13766i0;

/* renamed from: j1.l */
/* loaded from: classes.dex */
public final class LayoutNodeAlignmentLines {

    /* renamed from: a */
    private final LayoutNode f17211a;

    /* renamed from: b */
    private boolean f17212b;

    /* renamed from: c */
    private boolean f17213c;

    /* renamed from: d */
    private boolean f17214d;

    /* renamed from: e */
    private boolean f17215e;

    /* renamed from: f */
    private boolean f17216f;

    /* renamed from: g */
    private boolean f17217g;

    /* renamed from: h */
    private LayoutNode f17218h;

    /* renamed from: i */
    private final Map f17219i;

    public LayoutNodeAlignmentLines(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f17211a = layoutNode;
        this.f17212b = true;
        this.f17219i = new HashMap();
    }

    /* renamed from: k */
    private static final void m21463k(LayoutNodeAlignmentLines layoutNodeAlignmentLines, AbstractC5743a abstractC5743a, int i, LayoutNodeWrapper layoutNodeWrapper) {
        int m19530c;
        float f = i;
        long m7133a = C10776g.m7133a(f, f);
        while (true) {
            m7133a = layoutNodeWrapper.m21401L1(m7133a);
            layoutNodeWrapper = layoutNodeWrapper.m21368l1();
            Intrinsics.ifNullDoSomething(layoutNodeWrapper);
            if (Intrinsics.equals(layoutNodeWrapper, layoutNodeAlignmentLines.f17211a.m21563P())) {
                break;
            } else if (layoutNodeWrapper.m21373h1().contains(abstractC5743a)) {
                float mo22989p = layoutNodeWrapper.mo22989p(abstractC5743a);
                m7133a = C10776g.m7133a(mo22989p, mo22989p);
            }
        }
        if (abstractC5743a instanceof C5767g) {
            m19530c = C7037c.m19530c(C10774f.m7144l(m7133a));
        } else {
            m19530c = C7037c.m19530c(C10774f.m7145k(m7133a));
        }
        Map map = layoutNodeAlignmentLines.f17219i;
        if (map.containsKey(abstractC5743a)) {
            m19530c = AlignmentLine.m23196c(abstractC5743a, ((Number) C13766i0.m397f(layoutNodeAlignmentLines.f17219i, abstractC5743a)).intValue(), m19530c);
        }
        map.put(abstractC5743a, Integer.valueOf(m19530c));
    }

    /* renamed from: a */
    public final boolean m21473a() {
        return this.f17212b;
    }

    /* renamed from: b */
    public final Map m21472b() {
        return this.f17219i;
    }

    /* renamed from: c */
    public final boolean m21471c() {
        return this.f17215e;
    }

    /* renamed from: d */
    public final boolean m21470d() {
        return this.f17213c || this.f17215e || this.f17216f || this.f17217g;
    }

    /* renamed from: e */
    public final boolean m21469e() {
        m21462l();
        return this.f17218h != null;
    }

    /* renamed from: f */
    public final boolean m21468f() {
        return this.f17217g;
    }

    /* renamed from: g */
    public final boolean m21467g() {
        return this.f17216f;
    }

    /* renamed from: h */
    public final boolean m21466h() {
        return this.f17214d;
    }

    /* renamed from: i */
    public final boolean m21465i() {
        return this.f17213c;
    }

    /* renamed from: j */
    public final void m21464j() {
        this.f17219i.clear();
        MutableVector m21537f0 = this.f17211a.m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = m21537f0.m23650o();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) m23650o[i];
                if (layoutNode.mo23015f()) {
                    if (layoutNode.m21579H().m21473a()) {
                        layoutNode.m21513r0();
                    }
                    for (Map.Entry entry : layoutNode.m21579H().f17219i.entrySet()) {
                        m21463k(this, (AbstractC5743a) entry.getKey(), ((Number) entry.getValue()).intValue(), layoutNode.m21563P());
                    }
                    LayoutNodeWrapper m21368l1 = layoutNode.m21563P().m21368l1();
                    Intrinsics.ifNullDoSomething(m21368l1);
                    while (!Intrinsics.equals(m21368l1, this.f17211a.m21563P())) {
                        for (AbstractC5743a abstractC5743a : m21368l1.m21373h1()) {
                            m21463k(this, abstractC5743a, m21368l1.mo22989p(abstractC5743a), m21368l1);
                        }
                        m21368l1 = m21368l1.m21368l1();
                        Intrinsics.ifNullDoSomething(m21368l1);
                    }
                }
                i++;
            } while (i < m23649p);
            this.f17219i.putAll(this.f17211a.m21563P().m21377d1().mo23002e());
            this.f17212b = false;
        }
        this.f17219i.putAll(this.f17211a.m21563P().m21377d1().mo23002e());
        this.f17212b = false;
    }

    /* renamed from: l */
    public final void m21462l() {
        LayoutNodeAlignmentLines m21579H;
        LayoutNodeAlignmentLines m21579H2;
        LayoutNode layoutNode = null;
        if (m21470d()) {
            layoutNode = this.f17211a;
        } else {
            LayoutNode m21547a0 = this.f17211a.m21547a0();
            if (m21547a0 == null) {
                return;
            }
            LayoutNode layoutNode2 = m21547a0.m21579H().f17218h;
            if (layoutNode2 == null || !layoutNode2.m21579H().m21470d()) {
                LayoutNode layoutNode3 = this.f17218h;
                if (layoutNode3 == null || layoutNode3.m21579H().m21470d()) {
                    return;
                }
                LayoutNode m21547a02 = layoutNode3.m21547a0();
                if (m21547a02 != null && (m21579H2 = m21547a02.m21579H()) != null) {
                    m21579H2.m21462l();
                }
                LayoutNode m21547a03 = layoutNode3.m21547a0();
                if (m21547a03 != null && (m21579H = m21547a03.m21579H()) != null) {
                    layoutNode = m21579H.f17218h;
                }
            } else {
                layoutNode = layoutNode2;
            }
        }
        this.f17218h = layoutNode;
    }

    /* renamed from: m */
    public final void m21461m() {
        this.f17212b = true;
        this.f17213c = false;
        this.f17215e = false;
        this.f17214d = false;
        this.f17216f = false;
        this.f17217g = false;
        this.f17218h = null;
    }

    /* renamed from: n */
    public final void m21460n(boolean z) {
        this.f17212b = z;
    }

    /* renamed from: o */
    public final void m21459o(boolean z) {
        this.f17215e = z;
    }

    /* renamed from: p */
    public final void m21458p(boolean z) {
        this.f17217g = z;
    }

    /* renamed from: q */
    public final void m21457q(boolean z) {
        this.f17216f = z;
    }

    /* renamed from: r */
    public final void m21456r(boolean z) {
        this.f17214d = z;
    }

    /* renamed from: s */
    public final void m21455s(boolean z) {
        this.f17213c = z;
    }
}
