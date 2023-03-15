package p432x;

import id.InterfaceC6097a;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;
import p244n0.C7568e;
import p244n0.InterfaceC7559c;

/* compiled from: LazyLayoutItemContentFactory.kt */
/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C12215d {
    /* renamed from: a */
    public static final LazyLayoutItemContentFactory m3374a(LazyLayoutState lazyLayoutState, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(lazyLayoutState, "state");
        interfaceC5179i.mo25263g(-2067463753);
        InterfaceC7559c m18129a = C7568e.m18129a(interfaceC5179i, 0);
        InterfaceC6097a m3339b = lazyLayoutState.m3339b();
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(m3339b);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new LazyLayoutItemContentFactory(m18129a, m3339b);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) mo25262h;
        interfaceC5179i.mo25282C();
        return lazyLayoutItemContentFactory;
    }
}
