package nl;

import androidx.lifecycle.C1459l0;
import ke.InterfaceC6657b;
import p423wc.C11615d;
import p445xc.InterfaceC12341a;

/* renamed from: nl.k */
/* loaded from: classes2.dex */
public final class C7945k implements InterfaceC6657b {

    /* renamed from: a */
    private final C7944j f20616a;

    C7945k(C7944j c7944j) {
        this.f20616a = c7944j;
    }

    /* renamed from: c */
    public static InterfaceC12341a<Object> m17493c(C7944j c7944j) {
        return C11615d.m4594a(new C7945k(c7944j));
    }

    @Override // ke.InterfaceC6657b
    /* renamed from: b */
    public SharedWithViewModel mo14a(C1459l0 c1459l0) {
        return this.f20616a.m17496b(c1459l0);
    }
}
