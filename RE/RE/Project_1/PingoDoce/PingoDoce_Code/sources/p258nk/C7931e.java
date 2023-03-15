package p258nk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ConsentsManager;
import mg.SmsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: nk.e */
/* loaded from: classes2.dex */
public final class C7931e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20590a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f20591b;

    /* renamed from: c */
    private final InterfaceC12341a<SmsManager> f20592c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f20593d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f20594e;

    public C7931e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f20590a = interfaceC12341a;
        this.f20591b = interfaceC12341a2;
        this.f20592c = interfaceC12341a3;
        this.f20593d = interfaceC12341a4;
        this.f20594e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C7931e m17527a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C7931e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static LoginPhoneViewModel m17525c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager, SmsManager smsManager, AnalyticsManager analyticsManager) {
        return new LoginPhoneViewModel(c1459l0, resourcesProvider, consentsManager, smsManager, analyticsManager);
    }

    /* renamed from: b */
    public LoginPhoneViewModel m17526b(C1459l0 c1459l0) {
        LoginPhoneViewModel m17525c = m17525c(c1459l0, this.f20590a.mo42226get(), this.f20591b.mo42226get(), this.f20592c.mo42226get(), this.f20593d.mo42226get());
        C13886p.m94a(m17525c, this.f20594e.mo42226get());
        return m17525c;
    }
}
