package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.a1 */
/* loaded from: classes2.dex */
public final class C7199a1 implements InterfaceC11614c<RecentProductManager> {

    /* renamed from: a */
    private final InterfaceC12341a<PrefsManager> f19041a;

    public C7199a1(InterfaceC12341a<PrefsManager> interfaceC12341a) {
        this.f19041a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7199a1 m18956a(InterfaceC12341a<PrefsManager> interfaceC12341a) {
        return new C7199a1(interfaceC12341a);
    }

    /* renamed from: c */
    public static RecentProductManager m18954c(PrefsManager prefsManager) {
        return new RecentProductManager(prefsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public RecentProductManager mo42226get() {
        return m18954c(this.f19041a.mo42226get());
    }
}
