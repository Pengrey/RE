package td;

import bd.InterfaceC1886d;
import kotlinx.coroutines.internal.C6870j;
import kotlinx.coroutines.internal.C6896t;

/* renamed from: td.m */
/* loaded from: classes2.dex */
public final class C10542m {
    /* renamed from: a */
    public static final void m7715a(InterfaceC10529j<?> interfaceC10529j, InterfaceC10595y0 interfaceC10595y0) {
        interfaceC10529j.mo7778n(new C10600z0(interfaceC10595y0));
    }

    /* renamed from: b */
    public static final <T> C10534k<T> m7714b(InterfaceC1886d<? super T> interfaceC1886d) {
        if (!(interfaceC1886d instanceof C6870j)) {
            return new C10534k<>(interfaceC1886d, 1);
        }
        C10534k<T> m19954h = ((C6870j) interfaceC1886d).m19954h();
        if (m19954h != null) {
            if (!m19954h.m7755H()) {
                m19954h = null;
            }
            if (m19954h != null) {
                return m19954h;
            }
        }
        return new C10534k<>(interfaceC1886d, 2);
    }

    /* renamed from: c */
    public static final void m7713c(InterfaceC10529j<?> interfaceC10529j, C6896t c6896t) {
        interfaceC10529j.mo7778n(new C10528i2(c6896t));
    }
}
