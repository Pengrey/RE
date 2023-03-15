package p450xh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7310l;
import mg.C7405s1;
import mg.ClubManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: xh.f */
/* loaded from: classes2.dex */
public final class C12988f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f33711a;

    /* renamed from: b */
    private final InterfaceC12341a<StoreManager> f33712b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f33713c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f33714d;

    /* renamed from: e */
    private final InterfaceC12341a<ClubManager> f33715e;

    /* renamed from: f */
    private final InterfaceC12341a<C7405s1> f33716f;

    public C12988f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<ClubManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        this.f33711a = interfaceC12341a;
        this.f33712b = interfaceC12341a2;
        this.f33713c = interfaceC12341a3;
        this.f33714d = interfaceC12341a4;
        this.f33715e = interfaceC12341a5;
        this.f33716f = interfaceC12341a6;
    }

    /* renamed from: a */
    public static C12988f m2003a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<ClubManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        return new C12988f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6);
    }

    /* renamed from: c */
    public static BannerDetailViewModel m2001c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager, C7310l c7310l, AnalyticsManager analyticsManager, ClubManager clubManager) {
        return new BannerDetailViewModel(c1459l0, resourcesProvider, storeManager, c7310l, analyticsManager, clubManager);
    }

    /* renamed from: b */
    public BannerDetailViewModel m2002b(C1459l0 c1459l0) {
        BannerDetailViewModel m2001c = m2001c(c1459l0, this.f33711a.mo42226get(), this.f33712b.mo42226get(), this.f33713c.mo42226get(), this.f33714d.mo42226get(), this.f33715e.mo42226get());
        C13886p.m94a(m2001c, this.f33716f.mo42226get());
        return m2001c;
    }
}
