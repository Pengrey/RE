package sk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.PhoneManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: sk.d */
/* loaded from: classes2.dex */
public final class C10238d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f26675a;

    /* renamed from: b */
    private final InterfaceC12341a<PhoneManager> f26676b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f26677c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f26678d;

    public C10238d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f26675a = interfaceC12341a;
        this.f26676b = interfaceC12341a2;
        this.f26677c = interfaceC12341a3;
        this.f26678d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C10238d m8435a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PhoneManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C10238d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PhoneUpdateSmsValidationViewModel m8433c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PhoneManager phoneManager, AnalyticsManager analyticsManager) {
        return new PhoneUpdateSmsValidationViewModel(c1459l0, resourcesProvider, phoneManager, analyticsManager);
    }

    /* renamed from: b */
    public PhoneUpdateSmsValidationViewModel m8434b(C1459l0 c1459l0) {
        PhoneUpdateSmsValidationViewModel m8433c = m8433c(c1459l0, this.f26675a.mo42226get(), this.f26676b.mo42226get(), this.f26677c.mo42226get());
        C13886p.m94a(m8433c, this.f26678d.mo42226get());
        return m8433c;
    }
}
