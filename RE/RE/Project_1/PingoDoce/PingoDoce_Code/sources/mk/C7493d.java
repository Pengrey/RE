package mk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.PhoneManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: mk.d */
/* loaded from: classes2.dex */
public final class C7493d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19810a;

    /* renamed from: b */
    private final InterfaceC12341a<PhoneManager> f19811b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f19812c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f19813d;

    public C7493d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f19810a = interfaceC12341a;
        this.f19811b = interfaceC12341a2;
        this.f19812c = interfaceC12341a3;
        this.f19813d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7493d m18361a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7493d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static CreatePhoneViewModel m18359c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PhoneManager phoneManager, AnalyticsManager analyticsManager) {
        return new CreatePhoneViewModel(c1459l0, resourcesProvider, phoneManager, analyticsManager);
    }

    /* renamed from: b */
    public CreatePhoneViewModel m18360b(C1459l0 c1459l0) {
        CreatePhoneViewModel m18359c = m18359c(c1459l0, this.f19810a.mo42226get(), this.f19811b.mo42226get(), this.f19812c.mo42226get());
        C13886p.m94a(m18359c, this.f19813d.mo42226get());
        return m18359c;
    }
}
