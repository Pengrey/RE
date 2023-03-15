package p065df;

import kotlinx.coroutines.flow.C6847z;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6835r;
import p181jd.Intrinsics;

/* renamed from: df.a */
/* loaded from: classes2.dex */
public final class C4786a {

    /* renamed from: a */
    public static final C4786a f13106a = new C4786a();

    /* renamed from: b */
    private static final InterfaceC6835r f13107b;

    /* renamed from: c */
    private static final InterfaceC6785c f13108c;

    static {
        InterfaceC6835r m20023a = C6847z.m20023a(null);
        f13107b = m20023a;
        f13108c = m20023a;
    }

    private C4786a() {
    }

    /* renamed from: a */
    public final void m26606a(Throwable th2) {
        InterfaceC6835r interfaceC6835r = f13107b;
        if (Intrinsics.equals(interfaceC6835r.getValue(), th2)) {
            return;
        }
        interfaceC6835r.mo20083c(th2);
    }

    /* renamed from: b */
    public final InterfaceC6785c m26605b() {
        return f13108c;
    }
}
