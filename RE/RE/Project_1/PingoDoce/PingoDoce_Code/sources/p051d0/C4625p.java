package p051d0;

import p092f0.InterfaceC5179i;
import p393v0.C11003c0;
import p479z1.C13605g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d0.p */
/* loaded from: classes.dex */
public final class C4625p implements InterfaceC4675x {

    /* renamed from: a */
    public static final C4625p f12611a = new C4625p();

    private C4625p() {
    }

    @Override // p051d0.InterfaceC4675x
    /* renamed from: a */
    public long mo26987a(long j, float f, InterfaceC5179i interfaceC5179i, int i) {
        long m26984b;
        C4576g m27117a = C4591j0.f12477a.m27117a(interfaceC5179i, 6);
        if (C13605g.m876f(f, C13605g.m875g(0)) <= 0 || m27117a.m27166o()) {
            return j;
        }
        m26984b = C4677y.m26984b(j, f, interfaceC5179i, (i & 112) | (i & 14));
        return C11003c0.m6591e(m26984b, j);
    }
}
