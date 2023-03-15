package td;

import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.internal.C6865g0;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: td.a0 */
/* loaded from: classes2.dex */
public final class C10477a0 {
    /* renamed from: a */
    public static final <T> Object m7925a(Object obj, InterfaceC1886d<? super T> interfaceC1886d) {
        if (obj instanceof C10590x) {
            C13183m.C13184a c13184a = C13183m.f34143w;
            Throwable th2 = ((C10590x) obj).f27303a;
            if (C10539l0.m7717d() && (interfaceC1886d instanceof InterfaceC6758e)) {
                th2 = C6865g0.m19979a(th2, (InterfaceC6758e) interfaceC1886d);
            }
            return C13183m.m1458a(C13186n.m1454a(th2));
        }
        C13183m.C13184a c13184a2 = C13183m.f34143w;
        return C13183m.m1458a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m7924b(Object obj, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        Throwable m1457b = C13183m.m1457b(obj);
        if (m1457b == null) {
            return interfaceC6108l != null ? new C10594y(obj, interfaceC6108l) : obj;
        }
        return new C10590x(m1457b, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m7923c(Object obj, InterfaceC10529j<?> interfaceC10529j) {
        Throwable m1457b = C13183m.m1457b(obj);
        if (m1457b != null) {
            if (C10539l0.m7717d() && (interfaceC10529j instanceof InterfaceC6758e)) {
                m1457b = C6865g0.m19979a(m1457b, (InterfaceC6758e) interfaceC10529j);
            }
            obj = new C10590x(m1457b, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m7922d(Object obj, InterfaceC6108l interfaceC6108l, int i, Object obj2) {
        if ((i & 1) != 0) {
            interfaceC6108l = null;
        }
        return m7924b(obj, interfaceC6108l);
    }
}
