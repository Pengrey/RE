package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.z */
/* loaded from: classes2.dex */
public final class C11354z implements InterfaceC11614c<PinRecoveryService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29131a;

    /* renamed from: b */
    private final InterfaceC12341a<Retrofit> f29132b;

    /* renamed from: c */
    private final InterfaceC12341a<ResourcesProvider> f29133c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f29134d;

    public C11354z(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<Retrofit> interfaceC12341a2, InterfaceC12341a<ResourcesProvider> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4) {
        this.f29131a = interfaceC12341a;
        this.f29132b = interfaceC12341a2;
        this.f29133c = interfaceC12341a3;
        this.f29134d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C11354z m5360a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<Retrofit> interfaceC12341a2, InterfaceC12341a<ResourcesProvider> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4) {
        return new C11354z(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PinRecoveryService m5358c(Retrofit retrofit, Retrofit retrofit3, ResourcesProvider resourcesProvider) {
        return new PinRecoveryService(retrofit, retrofit3, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PinRecoveryService mo42226get() {
        PinRecoveryService m5358c = m5358c(this.f29131a.mo42226get(), this.f29132b.mo42226get(), this.f29133c.mo42226get());
        C11278f.m5547a(m5358c, this.f29134d.mo42226get());
        return m5358c;
    }
}
