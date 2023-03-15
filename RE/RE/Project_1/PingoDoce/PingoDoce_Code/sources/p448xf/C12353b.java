package p448xf;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: xf.b */
/* loaded from: classes2.dex */
public final class C12353b {

    /* renamed from: a */
    private final InterfaceC12341a<ClubManager> f32539a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f32540b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f32541c;

    /* renamed from: d */
    private final InterfaceC12341a<ResourcesProvider> f32542d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f32543e;

    public C12353b(InterfaceC12341a<ClubManager> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<ResourcesProvider> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f32539a = interfaceC12341a;
        this.f32540b = interfaceC12341a2;
        this.f32541c = interfaceC12341a3;
        this.f32542d = interfaceC12341a4;
        this.f32543e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C12353b m2987a(InterfaceC12341a<ClubManager> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<ResourcesProvider> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C12353b(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static BabyClubUpdateViewModel m2985c(C1459l0 c1459l0, ClubManager clubManager, ConsentsManager consentsManager, AnalyticsManager analyticsManager, ResourcesProvider resourcesProvider) {
        return new BabyClubUpdateViewModel(c1459l0, clubManager, consentsManager, analyticsManager, resourcesProvider);
    }

    /* renamed from: b */
    public BabyClubUpdateViewModel m2986b(C1459l0 c1459l0) {
        BabyClubUpdateViewModel m2985c = m2985c(c1459l0, this.f32539a.mo42226get(), this.f32540b.mo42226get(), this.f32541c.mo42226get(), this.f32542d.mo42226get());
        C13886p.m94a(m2985c, this.f32543e.mo42226get());
        return m2985c;
    }
}
