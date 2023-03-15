package mk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.PhoneManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: mk.i */
/* loaded from: classes2.dex */
public final class C7497i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19821a;

    /* renamed from: b */
    private final InterfaceC12341a<PhoneManager> f19822b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f19823c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f19824d;

    public C7497i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f19821a = interfaceC12341a;
        this.f19822b = interfaceC12341a2;
        this.f19823c = interfaceC12341a3;
        this.f19824d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7497i m18351a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7497i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static UpdatePhoneViewModel m18349c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PhoneManager phoneManager, AnalyticsManager analyticsManager) {
        return new UpdatePhoneViewModel(c1459l0, resourcesProvider, phoneManager, analyticsManager);
    }

    /* renamed from: b */
    public UpdatePhoneViewModel m18350b(C1459l0 c1459l0) {
        UpdatePhoneViewModel m18349c = m18349c(c1459l0, this.f19821a.mo42226get(), this.f19822b.mo42226get(), this.f19823c.mo42226get());
        C13886p.m94a(m18349c, this.f19824d.mo42226get());
        return m18349c;
    }
}
