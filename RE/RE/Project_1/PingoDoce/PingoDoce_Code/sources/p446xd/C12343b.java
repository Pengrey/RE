package p446xd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.Timeout;
import kotlinx.coroutines.internal.C6859d0;
import kotlinx.coroutines.internal.C6865g0;
import kotlinx.coroutines.internal.C6881l0;
import p181jd.C6431d0;
import p468yc.C13183m;
import p468yc.C13186n;
import td.C10488b2;
import td.C10539l0;
import td.C10590x;

/* renamed from: xd.b */
/* loaded from: classes2.dex */
public final class C12343b {
    /* renamed from: a */
    public static final <T> void m3022a(InterfaceC6108l<? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6108l, InterfaceC1886d<? super T> interfaceC1886d) {
        Object m34636d;
        InterfaceC1886d m20188a = DebugProbes.m20188a(interfaceC1886d);
        try {
            CoroutineContext context = interfaceC1886d.getContext();
            Object m19922c = C6881l0.m19922c(context, null);
            Object mo9587d = ((InterfaceC6108l) C6431d0.m20951d(interfaceC6108l, 1)).mo9587d(m20188a);
            C6881l0.m19924a(context, m19922c);
            m34636d = C2116d.m34636d();
            if (mo9587d != m34636d) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m20188a.resumeWith(C13183m.m1458a(mo9587d));
            }
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m20188a.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
        }
    }

    /* renamed from: b */
    public static final <R, T> void m3021b(InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, R r, InterfaceC1886d<? super T> interfaceC1886d) {
        Object m34636d;
        InterfaceC1886d m20188a = DebugProbes.m20188a(interfaceC1886d);
        try {
            CoroutineContext context = interfaceC1886d.getContext();
            Object m19922c = C6881l0.m19922c(context, null);
            Object mo39856d = ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(r, m20188a);
            C6881l0.m19924a(context, m19922c);
            m34636d = C2116d.m34636d();
            if (mo39856d != m34636d) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m20188a.resumeWith(C13183m.m1458a(mo39856d));
            }
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m20188a.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
        }
    }

    /* renamed from: c */
    public static final <T, R> Object m3020c(C6859d0<? super T> c6859d0, R r, InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) {
        Object c10590x;
        Object m34636d;
        Object m34636d2;
        Object m34636d3;
        try {
            c10590x = ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(r, c6859d0);
        } catch (Throwable th2) {
            c10590x = new C10590x(th2, false, 2, null);
        }
        m34636d = C2116d.m34636d();
        if (c10590x == m34636d) {
            m34636d3 = C2116d.m34636d();
            return m34636d3;
        }
        Object m7872y0 = c6859d0.m7872y0(c10590x);
        if (m7872y0 == C10488b2.f27209b) {
            m34636d2 = C2116d.m34636d();
            return m34636d2;
        } else if (m7872y0 instanceof C10590x) {
            Throwable th3 = ((C10590x) m7872y0).f27303a;
            InterfaceC1886d<? super T> interfaceC1886d = c6859d0.f18305y;
            if (C10539l0.m7717d() && (interfaceC1886d instanceof InterfaceC6758e)) {
                throw C6865g0.m19979a(th3, (InterfaceC6758e) interfaceC1886d);
            }
            throw th3;
        } else {
            return C10488b2.m7845h(m7872y0);
        }
    }

    /* renamed from: d */
    public static final <T, R> Object m3019d(C6859d0<? super T> c6859d0, R r, InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) {
        Object c10590x;
        Object m34636d;
        Object m34636d2;
        Object m34636d3;
        boolean z = false;
        try {
            c10590x = ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(r, c6859d0);
        } catch (Throwable th2) {
            c10590x = new C10590x(th2, false, 2, null);
        }
        m34636d = C2116d.m34636d();
        if (c10590x == m34636d) {
            m34636d3 = C2116d.m34636d();
            return m34636d3;
        }
        Object m7872y0 = c6859d0.m7872y0(c10590x);
        if (m7872y0 == C10488b2.f27209b) {
            m34636d2 = C2116d.m34636d();
            return m34636d2;
        }
        if (m7872y0 instanceof C10590x) {
            Throwable th3 = ((C10590x) m7872y0).f27303a;
            if (((th3 instanceof Timeout) && ((Timeout) th3).f18139w == c6859d0) ? true : true) {
                InterfaceC1886d<? super T> interfaceC1886d = c6859d0.f18305y;
                if (C10539l0.m7717d() && (interfaceC1886d instanceof InterfaceC6758e)) {
                    throw C6865g0.m19979a(th3, (InterfaceC6758e) interfaceC1886d);
                }
                throw th3;
            } else if (c10590x instanceof C10590x) {
                Throwable th4 = ((C10590x) c10590x).f27303a;
                InterfaceC1886d<? super T> interfaceC1886d2 = c6859d0.f18305y;
                if (C10539l0.m7717d() && (interfaceC1886d2 instanceof InterfaceC6758e)) {
                    throw C6865g0.m19979a(th4, (InterfaceC6758e) interfaceC1886d2);
                }
                throw th4;
            }
        } else {
            c10590x = C10488b2.m7845h(m7872y0);
        }
        return c10590x;
    }
}
