package gl;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: gl.h */
/* loaded from: classes2.dex */
public final class C5713h {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15975a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f15976b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f15977c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f15978d;

    public C5713h(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f15975a = interfaceC12341a;
        this.f15976b = interfaceC12341a2;
        this.f15977c = interfaceC12341a3;
        this.f15978d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5713h m23286a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C5713h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PromotionViewModel m23284c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        return new PromotionViewModel(c1459l0, resourcesProvider, c7256f1, c7310l);
    }

    /* renamed from: b */
    public PromotionViewModel m23285b(C1459l0 c1459l0) {
        PromotionViewModel m23284c = m23284c(c1459l0, this.f15975a.mo42226get(), this.f15976b.mo42226get(), this.f15977c.mo42226get());
        C13886p.m94a(m23284c, this.f15978d.mo42226get());
        return m23284c;
    }
}
