package p427wh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wh.e */
/* loaded from: classes2.dex */
public final class C12153e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32093a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f32094b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f32095c;

    public C12153e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f32093a = interfaceC12341a;
        this.f32094b = interfaceC12341a2;
        this.f32095c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C12153e m3533a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C12153e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TermsOfUseViewModel m3531c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        return new TermsOfUseViewModel(c1459l0, resourcesProvider, consentsManager);
    }

    /* renamed from: b */
    public TermsOfUseViewModel m3532b(C1459l0 c1459l0) {
        TermsOfUseViewModel m3531c = m3531c(c1459l0, this.f32093a.mo42226get(), this.f32094b.mo42226get());
        C13886p.m94a(m3531c, this.f32095c.mo42226get());
        return m3531c;
    }
}
