package p092f0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p126h0.C5732a;
import p126h0.InterfaceC5737e;
import p181jd.Intrinsics;
import p468yc.C13191r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.k1 */
/* loaded from: classes.dex */
public final /* synthetic */ class DerivedState {

    /* renamed from: a */
    private static final C5235p1 f14437a = new C5235p1();

    /* renamed from: b */
    private static final C5235p1 f14438b = new C5235p1();

    /* renamed from: a */
    public static final /* synthetic */ C5235p1 m25013a() {
        return f14437a;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5235p1 m25012b() {
        return f14438b;
    }

    /* renamed from: c */
    public static final InterfaceC5242r1 m25011c(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "calculation");
        return new C5252u(interfaceC6097a);
    }

    /* renamed from: d */
    public static final void m25010d(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "start");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "done");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        C5235p1 c5235p1 = f14437a;
        InterfaceC5737e interfaceC5737e = (InterfaceC5737e) c5235p1.m24956a();
        try {
            InterfaceC5737e interfaceC5737e2 = (InterfaceC5737e) c5235p1.m24956a();
            if (interfaceC5737e2 == null) {
                interfaceC5737e2 = C5732a.m23210b();
            }
            c5235p1.m24955b(interfaceC5737e2.add((Object) C13191r.m1447a(interfaceC6108l, interfaceC6108l2)));
            interfaceC6097a.mo42214q();
            c5235p1.m24955b(interfaceC5737e);
        } catch (Throwable th2) {
            f14437a.m24955b(interfaceC5737e);
            throw th2;
        }
    }
}
