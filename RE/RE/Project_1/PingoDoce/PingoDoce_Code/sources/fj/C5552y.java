package fj;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import mg.RecentProductManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;

/* renamed from: fj.y */
/* loaded from: classes2.dex */
public final class C5552y {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15719a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f15720b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f15721c;

    /* renamed from: d */
    private final InterfaceC12341a<RecentProductManager> f15722d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f15723e;

    public C5552y(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<RecentProductManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f15719a = interfaceC12341a;
        this.f15720b = interfaceC12341a2;
        this.f15721c = interfaceC12341a3;
        this.f15722d = interfaceC12341a4;
        this.f15723e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C5552y m23744a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<RecentProductManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C5552y(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static SearchViewModel m23742c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l, RecentProductManager recentProductManager) {
        return new SearchViewModel(c1459l0, resourcesProvider, c7256f1, c7310l, recentProductManager);
    }

    /* renamed from: b */
    public SearchViewModel m23743b(C1459l0 c1459l0) {
        SearchViewModel m23742c = m23742c(c1459l0, this.f15719a.mo42226get(), this.f15720b.mo42226get(), this.f15721c.mo42226get(), this.f15722d.mo42226get());
        C13886p.m94a(m23742c, this.f15723e.mo42226get());
        return m23742c;
    }
}
