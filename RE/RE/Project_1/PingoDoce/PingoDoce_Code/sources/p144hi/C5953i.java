package p144hi;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: hi.i */
/* loaded from: classes2.dex */
public final class C5953i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16458a;

    /* renamed from: b */
    private final InterfaceC12341a<ClubManager> f16459b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f16460c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f16461d;

    public C5953i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f16458a = interfaceC12341a;
        this.f16459b = interfaceC12341a2;
        this.f16460c = interfaceC12341a3;
        this.f16461d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5953i m22616a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C5953i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static ClubViewModel m22614c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        return new ClubViewModel(c1459l0, resourcesProvider, clubManager, analyticsManager);
    }

    /* renamed from: b */
    public ClubViewModel m22615b(C1459l0 c1459l0) {
        ClubViewModel m22614c = m22614c(c1459l0, this.f16458a.mo42226get(), this.f16459b.mo42226get(), this.f16460c.mo42226get());
        C13886p.m94a(m22614c, this.f16461d.mo42226get());
        return m22614c;
    }
}
