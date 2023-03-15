package dk;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: dk.e */
/* loaded from: classes2.dex */
public final class C4888e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f13343a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f13344b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f13345c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f13346d;

    public C4888e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f13343a = interfaceC12341a;
        this.f13344b = interfaceC12341a2;
        this.f13345c = interfaceC12341a3;
        this.f13346d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C4888e m26357a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C4888e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TailoredForYouViewModel m26355c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        return new TailoredForYouViewModel(c1459l0, resourcesProvider, c7256f1, c7310l);
    }

    /* renamed from: b */
    public TailoredForYouViewModel m26356b(C1459l0 c1459l0) {
        TailoredForYouViewModel m26355c = m26355c(c1459l0, this.f13343a.mo42226get(), this.f13344b.mo42226get(), this.f13345c.mo42226get());
        C13886p.m94a(m26355c, this.f13346d.mo42226get());
        return m26355c;
    }
}
