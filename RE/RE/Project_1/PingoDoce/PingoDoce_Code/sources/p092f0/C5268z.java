package p092f0;

import id.InterfaceC6097a;
import p181jd.Intrinsics;

/* compiled from: CompositionLocal.kt */
/* renamed from: f0.z */
/* loaded from: classes.dex */
public final class C5268z<T> extends AbstractC5250t0 {

    /* renamed from: b */
    private final SnapshotMutationPolicy f14544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5268z(SnapshotMutationPolicy snapshotMutationPolicy, InterfaceC6097a interfaceC6097a) {
        super(interfaceC6097a);
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
        Intrinsics.isThisObjectNull(interfaceC6097a, "defaultFactory");
        this.f14544b = snapshotMutationPolicy;
    }

    /* renamed from: b */
    public InterfaceC5242r1 mo24959b(Object obj, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-1007657376);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C5209j1.m25073e(obj, this.f14544b);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        interfaceC5220m0.setValue(obj);
        interfaceC5179i.mo25282C();
        return interfaceC5220m0;
    }
}
