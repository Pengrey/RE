package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* loaded from: classes.dex */
public final class C2820j0 extends AbstractC3039x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2820j0() {
        this.f8079a.add(EnumC2884n0.FOR_IN);
        this.f8079a.add(EnumC2884n0.FOR_IN_CONST);
        this.f8079a.add(EnumC2884n0.FOR_IN_LET);
        this.f8079a.add(EnumC2884n0.FOR_LET);
        this.f8079a.add(EnumC2884n0.FOR_OF);
        this.f8079a.add(EnumC2884n0.FOR_OF_CONST);
        this.f8079a.add(EnumC2884n0.FOR_OF_LET);
        this.f8079a.add(EnumC2884n0.WHILE);
    }

    /* renamed from: c */
    private static InterfaceC2931q m32561c(InterfaceC2788h0 interfaceC2788h0, Iterator it, InterfaceC2931q interfaceC2931q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2931q m32161c = interfaceC2788h0.mo32592a((InterfaceC2931q) it.next()).m32161c((C2755f) interfaceC2931q);
                if (m32161c instanceof C2787h) {
                    C2787h c2787h = (C2787h) m32161c;
                    if ("break".equals(c2787h.m32606d())) {
                        return InterfaceC2931q.f7930f;
                    }
                    if ("return".equals(c2787h.m32606d())) {
                        return c2787h;
                    }
                }
            }
        }
        return InterfaceC2931q.f7930f;
    }

    /* renamed from: d */
    private static InterfaceC2931q m32560d(InterfaceC2788h0 interfaceC2788h0, InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        return m32561c(interfaceC2788h0, interfaceC2931q.mo31989h(), interfaceC2931q2);
    }

    /* renamed from: e */
    private static InterfaceC2931q m32559e(InterfaceC2788h0 interfaceC2788h0, InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        if (interfaceC2931q instanceof Iterable) {
            return m32561c(interfaceC2788h0, ((Iterable) interfaceC2931q).iterator(), interfaceC2931q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        EnumC2884n0 enumC2884n0 = EnumC2884n0.ADD;
        int ordinal = C2969s5.m32123e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C2969s5.m32120h(EnumC2884n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32560d(new C2804i0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C2969s5.m32120h(EnumC2884n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32560d(new C2756f0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C2969s5.m32120h(EnumC2884n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32560d(new C2772g0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C2969s5.m32120h(EnumC2884n0.FOR_LET.name(), 4, list);
                    InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                    if (m32162b instanceof C2755f) {
                        C2755f c2755f = (C2755f) m32162b;
                        InterfaceC2931q interfaceC2931q = (InterfaceC2931q) list.get(1);
                        InterfaceC2931q interfaceC2931q2 = (InterfaceC2931q) list.get(2);
                        InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(3));
                        C2952r4 m32163a = c2952r4.m32163a();
                        for (int i = 0; i < c2755f.m32746u(); i++) {
                            String mo31990g = c2755f.m32745v(i).mo31990g();
                            m32163a.m32157g(mo31990g, c2952r4.m32160d(mo31990g));
                        }
                        while (c2952r4.m32162b(interfaceC2931q).mo31991f().booleanValue()) {
                            InterfaceC2931q m32161c = c2952r4.m32161c((C2755f) m32162b2);
                            if (m32161c instanceof C2787h) {
                                C2787h c2787h = (C2787h) m32161c;
                                if ("break".equals(c2787h.m32606d())) {
                                    return InterfaceC2931q.f7930f;
                                }
                                if ("return".equals(c2787h.m32606d())) {
                                    return c2787h;
                                }
                            }
                            C2952r4 m32163a2 = c2952r4.m32163a();
                            for (int i2 = 0; i2 < c2755f.m32746u(); i2++) {
                                String mo31990g2 = c2755f.m32745v(i2).mo31990g();
                                m32163a2.m32157g(mo31990g2, m32163a.m32160d(mo31990g2));
                            }
                            m32163a2.m32162b(interfaceC2931q2);
                            m32163a = m32163a2;
                        }
                        return InterfaceC2931q.f7930f;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C2969s5.m32120h(EnumC2884n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32559e(new C2804i0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C2969s5.m32120h(EnumC2884n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32559e(new C2756f0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C2969s5.m32120h(EnumC2884n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C2994u) {
                        return m32559e(new C2772g0(c2952r4, ((InterfaceC2931q) list.get(0)).mo31990g()), c2952r4.m32162b((InterfaceC2931q) list.get(1)), c2952r4.m32162b((InterfaceC2931q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.m31854b(str);
            }
        }
        C2969s5.m32120h(EnumC2884n0.WHILE.name(), 4, list);
        InterfaceC2931q interfaceC2931q3 = (InterfaceC2931q) list.get(0);
        InterfaceC2931q interfaceC2931q4 = (InterfaceC2931q) list.get(1);
        InterfaceC2931q m32162b3 = c2952r4.m32162b((InterfaceC2931q) list.get(3));
        if (c2952r4.m32162b((InterfaceC2931q) list.get(2)).mo31991f().booleanValue()) {
            InterfaceC2931q m32161c2 = c2952r4.m32161c((C2755f) m32162b3);
            if (m32161c2 instanceof C2787h) {
                C2787h c2787h2 = (C2787h) m32161c2;
                if ("break".equals(c2787h2.m32606d())) {
                    return InterfaceC2931q.f7930f;
                }
                if ("return".equals(c2787h2.m32606d())) {
                    return c2787h2;
                }
            }
        }
        while (c2952r4.m32162b(interfaceC2931q3).mo31991f().booleanValue()) {
            InterfaceC2931q m32161c3 = c2952r4.m32161c((C2755f) m32162b3);
            if (m32161c3 instanceof C2787h) {
                C2787h c2787h3 = (C2787h) m32161c3;
                if ("break".equals(c2787h3.m32606d())) {
                    return InterfaceC2931q.f7930f;
                }
                if ("return".equals(c2787h3.m32606d())) {
                    return c2787h3;
                }
            }
            c2952r4.m32162b(interfaceC2931q4);
        }
        return InterfaceC2931q.f7930f;
    }
}
