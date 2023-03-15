package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes.dex */
public final class C3069z extends AbstractC3039x {
    public C3069z() {
        this.f8079a.add(EnumC2884n0.EQUALS);
        this.f8079a.add(EnumC2884n0.GREATER_THAN);
        this.f8079a.add(EnumC2884n0.GREATER_THAN_EQUALS);
        this.f8079a.add(EnumC2884n0.IDENTITY_EQUALS);
        this.f8079a.add(EnumC2884n0.IDENTITY_NOT_EQUALS);
        this.f8079a.add(EnumC2884n0.LESS_THAN);
        this.f8079a.add(EnumC2884n0.LESS_THAN_EQUALS);
        this.f8079a.add(EnumC2884n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m31734c(InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        if (interfaceC2931q.getClass().equals(interfaceC2931q2.getClass())) {
            if ((interfaceC2931q instanceof C3009v) || (interfaceC2931q instanceof C2899o)) {
                return true;
            }
            if (interfaceC2931q instanceof C2803i) {
                return (Double.isNaN(interfaceC2931q.mo31992c().doubleValue()) || Double.isNaN(interfaceC2931q2.mo31992c().doubleValue()) || interfaceC2931q.mo31992c().doubleValue() != interfaceC2931q2.mo31992c().doubleValue()) ? false : true;
            } else if (interfaceC2931q instanceof C2994u) {
                return interfaceC2931q.mo31990g().equals(interfaceC2931q2.mo31990g());
            } else {
                if (interfaceC2931q instanceof C2771g) {
                    return interfaceC2931q.mo31991f().equals(interfaceC2931q2.mo31991f());
                }
                return interfaceC2931q == interfaceC2931q2;
            }
        } else if (((interfaceC2931q instanceof C3009v) || (interfaceC2931q instanceof C2899o)) && ((interfaceC2931q2 instanceof C3009v) || (interfaceC2931q2 instanceof C2899o))) {
            return true;
        } else {
            boolean z = interfaceC2931q instanceof C2803i;
            if (z && (interfaceC2931q2 instanceof C2994u)) {
                return m31734c(interfaceC2931q, new C2803i(interfaceC2931q2.mo31992c()));
            }
            boolean z2 = interfaceC2931q instanceof C2994u;
            if (z2 && (interfaceC2931q2 instanceof C2803i)) {
                return m31734c(new C2803i(interfaceC2931q.mo31992c()), interfaceC2931q2);
            }
            if (interfaceC2931q instanceof C2771g) {
                return m31734c(new C2803i(interfaceC2931q.mo31992c()), interfaceC2931q2);
            }
            if (interfaceC2931q2 instanceof C2771g) {
                return m31734c(interfaceC2931q, new C2803i(interfaceC2931q2.mo31992c()));
            }
            if ((!z2 && !z) || !(interfaceC2931q2 instanceof InterfaceC2867m)) {
                if ((interfaceC2931q instanceof InterfaceC2867m) && ((interfaceC2931q2 instanceof C2994u) || (interfaceC2931q2 instanceof C2803i))) {
                    return m31734c(new C2994u(interfaceC2931q.mo31990g()), interfaceC2931q2);
                }
                return false;
            }
            return m31734c(interfaceC2931q, new C2994u(interfaceC2931q2.mo31990g()));
        }
    }

    /* renamed from: d */
    private static boolean m31733d(InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        int i;
        if (interfaceC2931q instanceof InterfaceC2867m) {
            interfaceC2931q = new C2994u(interfaceC2931q.mo31990g());
        }
        if (interfaceC2931q2 instanceof InterfaceC2867m) {
            interfaceC2931q2 = new C2994u(interfaceC2931q2.mo31990g());
        }
        if ((interfaceC2931q instanceof C2994u) && (interfaceC2931q2 instanceof C2994u)) {
            return interfaceC2931q.mo31990g().compareTo(interfaceC2931q2.mo31990g()) < 0;
        }
        double doubleValue = interfaceC2931q.mo31992c().doubleValue();
        double doubleValue2 = interfaceC2931q2.mo31992c().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: e */
    private static boolean m31732e(InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        if (interfaceC2931q instanceof InterfaceC2867m) {
            interfaceC2931q = new C2994u(interfaceC2931q.mo31990g());
        }
        if (interfaceC2931q2 instanceof InterfaceC2867m) {
            interfaceC2931q2 = new C2994u(interfaceC2931q2.mo31990g());
        }
        return (((interfaceC2931q instanceof C2994u) && (interfaceC2931q2 instanceof C2994u)) || !(Double.isNaN(interfaceC2931q.mo31992c().doubleValue()) || Double.isNaN(interfaceC2931q2.mo31992c().doubleValue()))) && !m31733d(interfaceC2931q2, interfaceC2931q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        boolean m31734c;
        boolean m31734c2;
        C2969s5.m32120h(C2969s5.m32123e(str).name(), 2, list);
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
        InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
        int ordinal = C2969s5.m32123e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                m31734c2 = m31734c(m32162b, m32162b2);
            } else if (ordinal == 42) {
                m31734c = m31733d(m32162b, m32162b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        m31734c = m31733d(m32162b2, m32162b);
                        break;
                    case 38:
                        m31734c = m31732e(m32162b2, m32162b);
                        break;
                    case 39:
                        m31734c = C2969s5.m32116l(m32162b, m32162b2);
                        break;
                    case 40:
                        m31734c2 = C2969s5.m32116l(m32162b, m32162b2);
                        break;
                    default:
                        return super.m31854b(str);
                }
            } else {
                m31734c = m31732e(m32162b, m32162b2);
            }
            m31734c = !m31734c2;
        } else {
            m31734c = m31734c(m32162b, m32162b2);
        }
        return m31734c ? InterfaceC2931q.f7935k : InterfaceC2931q.f7936l;
    }
}
