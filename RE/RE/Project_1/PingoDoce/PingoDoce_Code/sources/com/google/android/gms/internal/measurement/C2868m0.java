package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* loaded from: classes.dex */
public final class C2868m0 extends AbstractC3039x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2868m0() {
        this.f8079a.add(EnumC2884n0.ASSIGN);
        this.f8079a.add(EnumC2884n0.CONST);
        this.f8079a.add(EnumC2884n0.CREATE_ARRAY);
        this.f8079a.add(EnumC2884n0.CREATE_OBJECT);
        this.f8079a.add(EnumC2884n0.EXPRESSION_LIST);
        this.f8079a.add(EnumC2884n0.GET);
        this.f8079a.add(EnumC2884n0.GET_INDEX);
        this.f8079a.add(EnumC2884n0.GET_PROPERTY);
        this.f8079a.add(EnumC2884n0.NULL);
        this.f8079a.add(EnumC2884n0.SET_PROPERTY);
        this.f8079a.add(EnumC2884n0.TYPEOF);
        this.f8079a.add(EnumC2884n0.UNDEFINED);
        this.f8079a.add(EnumC2884n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        String str2;
        EnumC2884n0 enumC2884n0 = EnumC2884n0.ADD;
        int ordinal = C2969s5.m32123e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C2969s5.m32120h(EnumC2884n0.ASSIGN.name(), 2, list);
            InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            if (m32162b instanceof C2994u) {
                if (c2952r4.m32156h(m32162b.mo31990g())) {
                    InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
                    c2952r4.m32157g(m32162b.mo31990g(), m32162b2);
                    return m32162b2;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m32162b.mo31990g()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m32162b.getClass().getCanonicalName()));
        } else if (ordinal == 14) {
            C2969s5.m32119i(EnumC2884n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    InterfaceC2931q m32162b3 = c2952r4.m32162b((InterfaceC2931q) list.get(i2));
                    if (m32162b3 instanceof C2994u) {
                        c2952r4.m32158f(m32162b3.mo31990g(), c2952r4.m32162b((InterfaceC2931q) list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m32162b3.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC2931q.f7930f;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            C2969s5.m32119i(EnumC2884n0.EXPRESSION_LIST.name(), 1, list);
            InterfaceC2931q interfaceC2931q = InterfaceC2931q.f7930f;
            while (i < list.size()) {
                interfaceC2931q = c2952r4.m32162b((InterfaceC2931q) list.get(i));
                if (interfaceC2931q instanceof C2787h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return interfaceC2931q;
        } else if (ordinal == 33) {
            C2969s5.m32120h(EnumC2884n0.GET.name(), 1, list);
            InterfaceC2931q m32162b4 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            if (m32162b4 instanceof C2994u) {
                return c2952r4.m32160d(m32162b4.mo31990g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m32162b4.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            C2969s5.m32120h(EnumC2884n0.NULL.name(), 0, list);
            return InterfaceC2931q.f7931g;
        } else if (ordinal == 58) {
            C2969s5.m32120h(EnumC2884n0.SET_PROPERTY.name(), 3, list);
            InterfaceC2931q m32162b5 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            InterfaceC2931q m32162b6 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
            InterfaceC2931q m32162b7 = c2952r4.m32162b((InterfaceC2931q) list.get(2));
            if (m32162b5 != InterfaceC2931q.f7930f && m32162b5 != InterfaceC2931q.f7931g) {
                if ((m32162b5 instanceof C2755f) && (m32162b6 instanceof C2803i)) {
                    ((C2755f) m32162b5).m32749F(m32162b6.mo31992c().intValue(), m32162b7);
                } else if (m32162b5 instanceof InterfaceC2867m) {
                    ((InterfaceC2867m) m32162b5).mo32458q(m32162b6.mo31990g(), m32162b7);
                }
                return m32162b7;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", m32162b6.mo31990g(), m32162b5.mo31990g()));
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new C2755f();
            }
            C2755f c2755f = new C2755f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC2931q m32162b8 = c2952r4.m32162b((InterfaceC2931q) it.next());
                if (!(m32162b8 instanceof C2787h)) {
                    c2755f.m32749F(i, m32162b8);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return c2755f;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C2883n();
            }
            if (list.size() % 2 == 0) {
                C2883n c2883n = new C2883n();
                while (i < list.size() - 1) {
                    InterfaceC2931q m32162b9 = c2952r4.m32162b((InterfaceC2931q) list.get(i));
                    InterfaceC2931q m32162b10 = c2952r4.m32162b((InterfaceC2931q) list.get(i + 1));
                    if (!(m32162b9 instanceof C2787h) && !(m32162b10 instanceof C2787h)) {
                        c2883n.mo32458q(m32162b9.mo31990g(), m32162b10);
                        i += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c2883n;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    C2969s5.m32120h(EnumC2884n0.TYPEOF.name(), 1, list);
                    InterfaceC2931q m32162b11 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                    if (m32162b11 instanceof C3009v) {
                        str2 = "undefined";
                    } else if (m32162b11 instanceof C2771g) {
                        str2 = "boolean";
                    } else if (m32162b11 instanceof C2803i) {
                        str2 = "number";
                    } else if (m32162b11 instanceof C2994u) {
                        str2 = "string";
                    } else if (m32162b11 instanceof C2915p) {
                        str2 = "function";
                    } else if ((m32162b11 instanceof C2947r) || (m32162b11 instanceof C2787h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m32162b11));
                    } else {
                        str2 = "object";
                    }
                    return new C2994u(str2);
                case 63:
                    C2969s5.m32120h(EnumC2884n0.UNDEFINED.name(), 0, list);
                    return InterfaceC2931q.f7930f;
                case 64:
                    C2969s5.m32119i(EnumC2884n0.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2931q m32162b12 = c2952r4.m32162b((InterfaceC2931q) it2.next());
                        if (m32162b12 instanceof C2994u) {
                            c2952r4.m32159e(m32162b12.mo31990g(), InterfaceC2931q.f7930f);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m32162b12.getClass().getCanonicalName()));
                        }
                    }
                    return InterfaceC2931q.f7930f;
                default:
                    return super.m31854b(str);
            }
        } else {
            C2969s5.m32120h(EnumC2884n0.GET_PROPERTY.name(), 2, list);
            InterfaceC2931q m32162b13 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            InterfaceC2931q m32162b14 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
            if ((m32162b13 instanceof C2755f) && C2969s5.m32117k(m32162b14)) {
                return ((C2755f) m32162b13).m32745v(m32162b14.mo31992c().intValue());
            }
            if (m32162b13 instanceof InterfaceC2867m) {
                return ((InterfaceC2867m) m32162b13).mo32459o(m32162b14.mo31990g());
            }
            if (m32162b13 instanceof C2994u) {
                if ("length".equals(m32162b14.mo31990g())) {
                    return new C2803i(Double.valueOf(m32162b13.mo31990g().length()));
                }
                if (C2969s5.m32117k(m32162b14) && m32162b14.mo31992c().doubleValue() < m32162b13.mo31990g().length()) {
                    return new C2994u(String.valueOf(m32162b13.mo31990g().charAt(m32162b14.mo31992c().intValue())));
                }
            }
            return InterfaceC2931q.f7930f;
        }
    }
}
