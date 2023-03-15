package dj;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: dj.d */
/* loaded from: classes2.dex */
public final class C4880d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f13312a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f13313b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f13314c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f13315d;

    public C4880d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f13312a = interfaceC12341a;
        this.f13313b = interfaceC12341a2;
        this.f13314c = interfaceC12341a3;
        this.f13315d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C4880d m26393a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C4880d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static ProductListFragmentViewModel m26391c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        return new ProductListFragmentViewModel(c1459l0, resourcesProvider, c7256f1, c7310l);
    }

    /* renamed from: b */
    public ProductListFragmentViewModel m26392b(C1459l0 c1459l0) {
        ProductListFragmentViewModel m26391c = m26391c(c1459l0, this.f13312a.mo42226get(), this.f13313b.mo42226get(), this.f13314c.mo42226get());
        C13886p.m94a(m26391c, this.f13315d.mo42226get());
        return m26391c;
    }
}
