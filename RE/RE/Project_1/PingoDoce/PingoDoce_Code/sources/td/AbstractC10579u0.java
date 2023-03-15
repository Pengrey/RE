package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.internal.C6865g0;
import kotlinx.coroutines.internal.C6870j;
import kotlinx.coroutines.internal.C6881l0;
import kotlinx.coroutines.scheduling.AbstractRunnableC6921h;
import kotlinx.coroutines.scheduling.InterfaceC6922i;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.Exceptions;

/* renamed from: td.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10579u0<T> extends AbstractRunnableC6921h {

    /* renamed from: y */
    public int f27291y;

    public AbstractC10579u0(int i) {
        this.f27291y = i;
    }

    /* renamed from: a */
    public void m7646a(Object obj, Throwable th2) {
    }

    /* renamed from: b */
    public abstract InterfaceC1886d m7645b();

    /* renamed from: c */
    public Throwable m7644c(Object obj) {
        C10590x c10590x = obj instanceof C10590x ? (C10590x) obj : null;
        if (c10590x != null) {
            return c10590x.f27303a;
        }
        return null;
    }

    /* renamed from: d */
    public Object m7643d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public final void m7642e(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            Exceptions.m1470a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        Intrinsics.ifNullDoSomething(th2);
        C10515g0.m7790a(m7645b().getContext(), new C10535k0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* renamed from: f */
    public abstract Object m7641f();

    public final void run() {
        Object m1458a;
        Object m1458a2;
        if (C10539l0.m7720a()) {
            if (!(this.f27291y != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC6922i interfaceC6922i = this.f18408x;
        try {
            C6870j c6870j = (C6870j) m7645b();
            InterfaceC1886d interfaceC1886d = c6870j.f18317A;
            Object obj = c6870j.f18319C;
            CoroutineContext context = interfaceC1886d.getContext();
            Object m19922c = C6881l0.m19922c(context, obj);
            C10589w2<?> m7822g = m19922c != C6881l0.f18331a ? C10494d0.m7822g(interfaceC1886d, context, m19922c) : null;
            CoroutineContext context2 = interfaceC1886d.getContext();
            Object m7641f = m7641f();
            Throwable m7644c = m7644c(m7641f);
            InterfaceC10574t1 interfaceC10574t1 = (m7644c == null && C10583v0.m7636b(this.f27291y)) ? (InterfaceC10574t1) context2.mo4546c(InterfaceC10574t1.f27288s) : null;
            if (interfaceC10574t1 != null && !interfaceC10574t1.mo5659a()) {
                Throwable mo7658e0 = interfaceC10574t1.mo7658e0();
                m7646a(m7641f, mo7658e0);
                C13183m.C13184a c13184a = C13183m.f34143w;
                if (C10539l0.m7717d() && (interfaceC1886d instanceof InterfaceC6758e)) {
                    mo7658e0 = C6865g0.m19979a(mo7658e0, (InterfaceC6758e) interfaceC1886d);
                }
                interfaceC1886d.resumeWith(C13183m.m1458a(C13186n.m1454a(mo7658e0)));
            } else if (m7644c != null) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                interfaceC1886d.resumeWith(C13183m.m1458a(C13186n.m1454a(m7644c)));
            } else {
                C13183m.C13184a c13184a3 = C13183m.f34143w;
                interfaceC1886d.resumeWith(C13183m.m1458a(m7643d(m7641f)));
            }
            C13195u c13195u = C13195u.f34156a;
            if (m7822g == null || m7822g.m7604b1()) {
                C6881l0.m19924a(context, m19922c);
            }
            try {
                C13183m.C13184a c13184a4 = C13183m.f34143w;
                interfaceC6922i.mo19788a();
                m1458a2 = C13183m.m1458a(c13195u);
            } catch (Throwable th2) {
                C13183m.C13184a c13184a5 = C13183m.f34143w;
                m1458a2 = C13183m.m1458a(C13186n.m1454a(th2));
            }
            m7642e(null, C13183m.m1457b(m1458a2));
        } catch (Throwable th3) {
            try {
                C13183m.C13184a c13184a6 = C13183m.f34143w;
                interfaceC6922i.mo19788a();
                m1458a = C13183m.m1458a(C13195u.f34156a);
            } catch (Throwable th4) {
                C13183m.C13184a c13184a7 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th4));
            }
            m7642e(th3, C13183m.m1457b(m1458a));
        }
    }
}
