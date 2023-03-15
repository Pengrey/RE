package p340rh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: rh.d */
/* loaded from: classes2.dex */
public final class C9905d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25903a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f25904b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f25905c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f25906d;

    public C9905d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f25903a = interfaceC12341a;
        this.f25904b = interfaceC12341a2;
        this.f25905c = interfaceC12341a3;
        this.f25906d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C9905d m9732a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C9905d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static ElectronicInvoicePhoneViewModel m9730c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        return new ElectronicInvoicePhoneViewModel(c1459l0, resourcesProvider, loyaltyCardManager, analyticsManager);
    }

    /* renamed from: b */
    public ElectronicInvoicePhoneViewModel m9731b(C1459l0 c1459l0) {
        ElectronicInvoicePhoneViewModel m9730c = m9730c(c1459l0, this.f25903a.mo42226get(), this.f25904b.mo42226get(), this.f25905c.mo42226get());
        C13886p.m94a(m9730c, this.f25906d.mo42226get());
        return m9730c;
    }
}
