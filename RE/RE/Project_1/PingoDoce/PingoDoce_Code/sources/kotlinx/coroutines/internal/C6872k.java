package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.AbstractC10491c1;
import td.C10477a0;
import td.C10494d0;
import td.C10539l0;
import td.C10558p2;
import td.C10589w2;
import td.InterfaceC10574t1;

/* renamed from: kotlinx.coroutines.internal.k */
/* loaded from: classes2.dex */
public final class C6872k {

    /* renamed from: a */
    private static final C6867h0 f18322a = new C6867h0("UNDEFINED");

    /* renamed from: b */
    public static final C6867h0 f18323b = new C6867h0("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final <T> void m19944b(InterfaceC1886d<? super T> interfaceC1886d, Object obj, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        boolean z;
        if (interfaceC1886d instanceof C6870j) {
            C6870j c6870j = (C6870j) interfaceC1886d;
            Object m7924b = C10477a0.m7924b(obj, interfaceC6108l);
            if (c6870j.f18320z.mo7627F0(c6870j.getContext())) {
                c6870j.f18318B = m7924b;
                c6870j.f27291y = 1;
                c6870j.f18320z.mo7628D0(c6870j.getContext(), c6870j);
                return;
            }
            C10539l0.m7720a();
            AbstractC10491c1 m7684b = C10558p2.f27272a.m7684b();
            if (m7684b.m7835O0()) {
                c6870j.f18318B = m7924b;
                c6870j.f27291y = 1;
                m7684b.m7839K0(c6870j);
                return;
            }
            m7684b.m7837M0(true);
            try {
                InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) c6870j.getContext().mo4546c(InterfaceC10574t1.f27288s);
                if (interfaceC10574t1 == null || interfaceC10574t1.mo5659a()) {
                    z = false;
                } else {
                    CancellationException mo7658e0 = interfaceC10574t1.mo7658e0();
                    c6870j.m19958a(m7924b, mo7658e0);
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    c6870j.resumeWith(C13183m.m1458a(C13186n.m1454a(mo7658e0)));
                    z = true;
                }
                if (!z) {
                    InterfaceC1886d interfaceC1886d2 = c6870j.f18317A;
                    Object obj2 = c6870j.f18319C;
                    CoroutineContext context = interfaceC1886d2.getContext();
                    Object m19922c = C6881l0.m19922c(context, obj2);
                    C10589w2<?> m7822g = m19922c != C6881l0.f18331a ? C10494d0.m7822g(interfaceC1886d2, context, m19922c) : null;
                    c6870j.f18317A.resumeWith(obj);
                    C13195u c13195u = C13195u.f34156a;
                    if (m7822g == null || m7822g.m7604b1()) {
                        C6881l0.m19924a(context, m19922c);
                    }
                }
                do {
                } while (m7684b.m7832R0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC1886d.resumeWith(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19943c(InterfaceC1886d interfaceC1886d, Object obj, InterfaceC6108l interfaceC6108l, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC6108l = null;
        }
        m19944b(interfaceC1886d, obj, interfaceC6108l);
    }

    /* renamed from: d */
    public static final boolean m19942d(C6870j<? super C13195u> c6870j) {
        C13195u c13195u = C13195u.f34156a;
        C10539l0.m7720a();
        AbstractC10491c1 m7684b = C10558p2.f27272a.m7684b();
        if (m7684b.m7834P0()) {
            return false;
        }
        if (m7684b.m7835O0()) {
            c6870j.f18318B = c13195u;
            c6870j.f27291y = 1;
            m7684b.m7839K0(c6870j);
            return true;
        }
        m7684b.m7837M0(true);
        try {
            c6870j.run();
            do {
            } while (m7684b.m7832R0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
