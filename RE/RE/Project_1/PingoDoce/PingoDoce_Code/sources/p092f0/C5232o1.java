package p092f0;

import p181jd.Intrinsics;
import p260o0.C7982r;
import p260o0.C7987t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotState.kt */
/* renamed from: f0.o1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C5232o1 {
    /* renamed from: a */
    public static final C7982r m24965a() {
        return new C7982r();
    }

    /* renamed from: b */
    public static final C7987t m24964b() {
        return new C7987t();
    }

    /* renamed from: c */
    public static final InterfaceC5220m0 m24963c(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
        return C5152b.m25531a(obj, snapshotMutationPolicy);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC5220m0 m24962d(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = C5209j1.m25065m();
        }
        return C5209j1.m25073e(obj, snapshotMutationPolicy);
    }

    /* renamed from: e */
    public static final InterfaceC5242r1 m24961e(Object obj, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-1519466435);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = m24962d(obj, null, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        interfaceC5220m0.setValue(obj);
        interfaceC5179i.mo25282C();
        return interfaceC5220m0;
    }
}
