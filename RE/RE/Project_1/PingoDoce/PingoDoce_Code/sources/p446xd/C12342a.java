package p446xd;

import bd.InterfaceC1886d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlinx.coroutines.internal.C6872k;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: xd.a */
/* loaded from: classes2.dex */
public final class C12342a {
    /* renamed from: a */
    private static final void m3027a(InterfaceC1886d<?> interfaceC1886d, Throwable th2) {
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC1886d.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
        throw th2;
    }

    /* renamed from: b */
    public static final void m3026b(InterfaceC1886d<? super C13195u> interfaceC1886d, InterfaceC1886d<?> interfaceC1886d2) {
        InterfaceC1886d m34637c;
        try {
            m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
            C13183m.C13184a c13184a = C13183m.f34143w;
            C6872k.m19943c(m34637c, C13183m.m1458a(C13195u.f34156a), null, 2, null);
        } catch (Throwable th2) {
            m3027a(interfaceC1886d2, th2);
        }
    }

    /* renamed from: c */
    public static final <T> void m3025c(InterfaceC6108l<? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6108l, InterfaceC1886d<? super T> interfaceC1886d) {
        InterfaceC1886d<C13195u> m34639a;
        InterfaceC1886d m34637c;
        try {
            m34639a = IntrinsicsJvm.m34639a(interfaceC6108l, interfaceC1886d);
            m34637c = IntrinsicsJvm.m34637c(m34639a);
            C13183m.C13184a c13184a = C13183m.f34143w;
            C6872k.m19943c(m34637c, C13183m.m1458a(C13195u.f34156a), null, 2, null);
        } catch (Throwable th2) {
            m3027a(interfaceC1886d, th2);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m3024d(InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, R r, InterfaceC1886d<? super T> interfaceC1886d, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        InterfaceC1886d<C13195u> m34638b;
        InterfaceC1886d m34637c;
        try {
            m34638b = IntrinsicsJvm.m34638b(interfaceC6112p, r, interfaceC1886d);
            m34637c = IntrinsicsJvm.m34637c(m34638b);
            C13183m.C13184a c13184a = C13183m.f34143w;
            C6872k.m19944b(m34637c, C13183m.m1458a(C13195u.f34156a), interfaceC6108l);
        } catch (Throwable th2) {
            m3027a(interfaceC1886d, th2);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m3023e(InterfaceC6112p interfaceC6112p, Object obj, InterfaceC1886d interfaceC1886d, InterfaceC6108l interfaceC6108l, int i, Object obj2) {
        if ((i & 4) != 0) {
            interfaceC6108l = null;
        }
        m3024d(interfaceC6112p, obj, interfaceC1886d, interfaceC6108l);
    }
}
