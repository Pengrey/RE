package p229m0;

import java.util.Objects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5258v0;
import p092f0.RecomposeScopeImpl;
import p181jd.Intrinsics;

/* renamed from: m0.c */
/* loaded from: classes.dex */
public final class ComposableLambda {
    /* renamed from: a */
    public static final int m19328a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final InterfaceC7087a m19327b(InterfaceC5179i interfaceC5179i, int i, boolean z, Object obj) {
        C7088b c7088b;
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        Intrinsics.isThisObjectNull(obj, "block");
        interfaceC5179i.mo25263g(i);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            c7088b = new C7088b(i, z);
            interfaceC5179i.mo25247w(c7088b);
        } else {
            Objects.requireNonNull(mo25262h, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c7088b = (C7088b) mo25262h;
        }
        c7088b.m19332g(obj);
        interfaceC5179i.mo25282C();
        return c7088b;
    }

    /* renamed from: c */
    public static final InterfaceC7087a m19326c(int i, boolean z, Object obj) {
        Intrinsics.isThisObjectNull(obj, "block");
        C7088b c7088b = new C7088b(i, z);
        c7088b.m19332g(obj);
        return c7088b;
    }

    /* renamed from: d */
    public static final int m19325d(int i) {
        return m19328a(2, i);
    }

    /* renamed from: e */
    public static final boolean m19324e(InterfaceC5258v0 interfaceC5258v0, InterfaceC5258v0 interfaceC5258v02) {
        Intrinsics.isThisObjectNull(interfaceC5258v02, "other");
        if (interfaceC5258v0 != null) {
            if ((interfaceC5258v0 instanceof RecomposeScopeImpl) && (interfaceC5258v02 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) interfaceC5258v0;
                if (!recomposeScopeImpl.m24867q() || Intrinsics.equals(interfaceC5258v0, interfaceC5258v02) || Intrinsics.equals(recomposeScopeImpl.m24875i(), ((RecomposeScopeImpl) interfaceC5258v02).m24875i())) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final int m19323f(int i) {
        return m19328a(1, i);
    }
}
