package bd;

import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13195u;

/* renamed from: bd.f */
/* loaded from: classes2.dex */
public final class Continuation {
    /* renamed from: a */
    public static final InterfaceC1886d m35189a(InterfaceC6112p interfaceC6112p, Object obj, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d<C13195u> m34638b;
        InterfaceC1886d m34637c;
        Object m34636d;
        Intrinsics.isThisObjectNull(interfaceC6112p, "<this>");
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        m34638b = IntrinsicsJvm.m34638b(interfaceC6112p, obj, interfaceC1886d);
        m34637c = IntrinsicsJvm.m34637c(m34638b);
        m34636d = C2116d.m34636d();
        return new SafeContinuationJvm(m34637c, m34636d);
    }

    /* renamed from: b */
    public static final void m35188b(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d<C13195u> m34639a;
        InterfaceC1886d m34637c;
        Intrinsics.isThisObjectNull(interfaceC6108l, "<this>");
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        m34639a = IntrinsicsJvm.m34639a(interfaceC6108l, interfaceC1886d);
        m34637c = IntrinsicsJvm.m34637c(m34639a);
        C13183m.C13184a c13184a = C13183m.f34143w;
        m34637c.resumeWith(C13183m.m1458a(C13195u.f34156a));
    }

    /* renamed from: c */
    public static final void m35187c(InterfaceC6112p interfaceC6112p, Object obj, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d<C13195u> m34638b;
        InterfaceC1886d m34637c;
        Intrinsics.isThisObjectNull(interfaceC6112p, "<this>");
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        m34638b = IntrinsicsJvm.m34638b(interfaceC6112p, obj, interfaceC1886d);
        m34637c = IntrinsicsJvm.m34637c(m34638b);
        C13183m.C13184a c13184a = C13183m.f34143w;
        m34637c.resumeWith(C13183m.m1458a(C13195u.f34156a));
    }
}
