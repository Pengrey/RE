package kotlinx.coroutines.flow;

import bd.CoroutineContext;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.internal.C6867h0;
import p424wd.C11650r;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.flow.z */
/* loaded from: classes2.dex */
public final class C6847z {

    /* renamed from: a */
    private static final C6867h0 f18293a = new C6867h0("NONE");

    /* renamed from: b */
    private static final C6867h0 f18294b = new C6867h0("PENDING");

    /* renamed from: a */
    public static final <T> InterfaceC6835r<T> m20023a(T t) {
        if (t == null) {
            t = (T) C11650r.f29782a;
        }
        return new C6845y(t);
    }

    /* renamed from: d */
    public static final <T> InterfaceC6785c<T> m20020d(InterfaceC6844x<? extends T> interfaceC6844x, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        boolean z = true;
        if (C10539l0.m7720a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        if (i < 0 || i >= 2) {
            z = false;
        }
        return ((z || i == -2) && enumC6771a == EnumC6771a.DROP_OLDEST) ? interfaceC6844x : C6842v.m20036e(interfaceC6844x, coroutineContext, i, enumC6771a);
    }
}
