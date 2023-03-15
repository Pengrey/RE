package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlinx.coroutines.internal.C6870j;
import kotlinx.coroutines.internal.C6881l0;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: td.v0 */
/* loaded from: classes2.dex */
public final class C10583v0 {
    /* renamed from: a */
    public static final <T> void m7637a(AbstractC10579u0<? super T> abstractC10579u0, int i) {
        if (C10539l0.m7720a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC1886d m7645b = abstractC10579u0.m7645b();
        boolean z = i == 4;
        if (!z && (m7645b instanceof C6870j) && m7636b(i) == m7636b(abstractC10579u0.f27291y)) {
            AbstractC10505e0 abstractC10505e0 = ((C6870j) m7645b).f18320z;
            CoroutineContext context = m7645b.getContext();
            if (abstractC10505e0.mo7627F0(context)) {
                abstractC10505e0.mo7628D0(context, abstractC10579u0);
                return;
            } else {
                m7633e(abstractC10579u0);
                return;
            }
        }
        m7634d(abstractC10579u0, m7645b, z);
    }

    /* renamed from: b */
    public static final boolean m7636b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m7635c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m7634d(AbstractC10579u0<? super T> abstractC10579u0, InterfaceC1886d<? super T> interfaceC1886d, boolean z) {
        Object m7643d;
        boolean m7604b1;
        Object m7641f = abstractC10579u0.m7641f();
        Throwable m7644c = abstractC10579u0.m7644c(m7641f);
        if (m7644c != null) {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m7643d = C13186n.m1454a(m7644c);
        } else {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m7643d = abstractC10579u0.m7643d(m7641f);
        }
        Object m1458a = C13183m.m1458a(m7643d);
        if (z) {
            C6870j c6870j = (C6870j) interfaceC1886d;
            InterfaceC1886d interfaceC1886d2 = c6870j.f18317A;
            Object obj = c6870j.f18319C;
            CoroutineContext context = interfaceC1886d2.getContext();
            Object m19922c = C6881l0.m19922c(context, obj);
            C10589w2<?> m7822g = m19922c != C6881l0.f18331a ? C10494d0.m7822g(interfaceC1886d2, context, m19922c) : null;
            try {
                c6870j.f18317A.resumeWith(m1458a);
                C13195u c13195u = C13195u.f34156a;
                if (m7822g != null) {
                    if (!m7604b1) {
                        return;
                    }
                }
                return;
            } finally {
                if (m7822g == null || m7822g.m7604b1()) {
                    C6881l0.m19924a(context, m19922c);
                }
            }
        }
        interfaceC1886d.resumeWith(m1458a);
    }

    /* renamed from: e */
    private static final void m7633e(AbstractC10579u0<?> abstractC10579u0) {
        AbstractC10491c1 m7684b = C10558p2.f27272a.m7684b();
        if (m7684b.m7835O0()) {
            m7684b.m7839K0(abstractC10579u0);
            return;
        }
        m7684b.m7837M0(true);
        try {
            m7634d(abstractC10579u0, abstractC10579u0.m7645b(), true);
            do {
            } while (m7684b.m7832R0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
