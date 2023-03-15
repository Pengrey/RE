package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.d */
/* loaded from: classes2.dex */
public final class C7233d implements InterfaceC11614c<AppRatingManager> {

    /* renamed from: a */
    private final InterfaceC12341a<PrefsManager> f19115a;

    public C7233d(InterfaceC12341a<PrefsManager> interfaceC12341a) {
        this.f19115a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7233d m18906a(InterfaceC12341a<PrefsManager> interfaceC12341a) {
        return new C7233d(interfaceC12341a);
    }

    /* renamed from: c */
    public static AppRatingManager m18904c(PrefsManager prefsManager) {
        return new AppRatingManager(prefsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AppRatingManager mo42226get() {
        return m18904c(this.f19115a.mo42226get());
    }
}
