package mh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.NifManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: mh.d */
/* loaded from: classes2.dex */
public final class C7480d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19776a;

    /* renamed from: b */
    private final InterfaceC12341a<NifManager> f19777b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f19778c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f19779d;

    public C7480d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<NifManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f19776a = interfaceC12341a;
        this.f19777b = interfaceC12341a2;
        this.f19778c = interfaceC12341a3;
        this.f19779d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7480d m18399a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<NifManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7480d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static EditNifViewModel m18397c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, NifManager nifManager, AnalyticsManager analyticsManager) {
        return new EditNifViewModel(c1459l0, resourcesProvider, nifManager, analyticsManager);
    }

    /* renamed from: b */
    public EditNifViewModel m18398b(C1459l0 c1459l0) {
        EditNifViewModel m18397c = m18397c(c1459l0, this.f19776a.mo42226get(), this.f19777b.mo42226get(), this.f19778c.mo42226get());
        C13886p.m94a(m18397c, this.f19779d.mo42226get());
        return m18397c;
    }
}
