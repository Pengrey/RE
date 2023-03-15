package kotlinx.coroutines;

import bd.C1894h;
import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.internal.C6859d0;
import kotlinx.coroutines.internal.C6881l0;
import p181jd.Intrinsics;
import p446xd.C12342a;
import p446xd.C12343b;
import td.AbstractC10476a;
import td.C10494d0;
import td.C10573t0;
import td.C10588w1;
import td.C10589w2;
import td.InterfaceC10524i0;
import td.InterfaceC10555p0;
import td.InterfaceC10574t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* renamed from: kotlinx.coroutines.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6772d {
    /* renamed from: a */
    public static final InterfaceC10555p0 m20161a(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, EnumC6775f enumC6775f, InterfaceC6112p interfaceC6112p) {
        C6848g c6848g;
        CoroutineContext m7824e = C10494d0.m7824e(interfaceC10524i0, coroutineContext);
        if (enumC6775f.isLazy()) {
            c6848g = new C6849h(m7824e, interfaceC6112p);
        } else {
            c6848g = new C6848g(m7824e, true);
        }
        c6848g.m7928Z0(enumC6775f, c6848g, interfaceC6112p);
        return c6848g;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10555p0 m20160b(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, EnumC6775f enumC6775f, InterfaceC6112p interfaceC6112p, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        if ((i & 2) != 0) {
            enumC6775f = EnumC6775f.DEFAULT;
        }
        return C6769b.m20170a(interfaceC10524i0, coroutineContext, enumC6775f, interfaceC6112p);
    }

    /* renamed from: c */
    public static final InterfaceC10574t1 m20159c(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, EnumC6775f enumC6775f, InterfaceC6112p interfaceC6112p) {
        AbstractC10476a c6909j;
        CoroutineContext m7824e = C10494d0.m7824e(interfaceC10524i0, coroutineContext);
        if (enumC6775f.isLazy()) {
            c6909j = new C6850i(m7824e, interfaceC6112p);
        } else {
            c6909j = new C6909j(m7824e, true);
        }
        c6909j.m7928Z0(enumC6775f, c6909j, interfaceC6112p);
        return c6909j;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10574t1 m20158d(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext, EnumC6775f enumC6775f, InterfaceC6112p interfaceC6112p, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        if ((i & 2) != 0) {
            enumC6775f = EnumC6775f.DEFAULT;
        }
        return C6769b.m20168c(interfaceC10524i0, coroutineContext, enumC6775f, interfaceC6112p);
    }

    /* renamed from: e */
    public static final Object m20157e(CoroutineContext coroutineContext, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m7665b1;
        Object m34636d;
        CoroutineContext context = interfaceC1886d.getContext();
        CoroutineContext m7825d = C10494d0.m7825d(context, coroutineContext);
        C10588w1.m7609j(m7825d);
        if (m7825d == context) {
            C6859d0 c6859d0 = new C6859d0(m7825d, interfaceC1886d);
            m7665b1 = C12343b.m3020c(c6859d0, c6859d0, interfaceC6112p);
        } else {
            ContinuationInterceptor.C1888b c1888b = ContinuationInterceptor.f5618d;
            if (Intrinsics.equals(m7825d.mo4546c(c1888b), context.mo4546c(c1888b))) {
                C10589w2 c10589w2 = new C10589w2(m7825d, interfaceC1886d);
                Object m19922c = C6881l0.m19922c(m7825d, null);
                try {
                    Object m3020c = C12343b.m3020c(c10589w2, c10589w2, interfaceC6112p);
                    C6881l0.m19924a(m7825d, m19922c);
                    m7665b1 = m3020c;
                } catch (Throwable th2) {
                    C6881l0.m19924a(m7825d, m19922c);
                    throw th2;
                }
            } else {
                C10573t0 c10573t0 = new C10573t0(m7825d, interfaceC1886d);
                C12342a.m3023e(interfaceC6112p, c10573t0, c10573t0, null, 4, null);
                m7665b1 = c10573t0.m7665b1();
            }
        }
        m34636d = C2116d.m34636d();
        if (m7665b1 == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7665b1;
    }
}
