package sj;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: sj.h */
/* loaded from: classes2.dex */
public final class C10232h {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f26661a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f26662b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f26663c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f26664d;

    public C10232h(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f26661a = interfaceC12341a;
        this.f26662b = interfaceC12341a2;
        this.f26663c = interfaceC12341a3;
        this.f26664d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C10232h m8449a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C10232h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static FlyerViewModel m8447c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        return new FlyerViewModel(c1459l0, resourcesProvider, c7256f1, c7310l);
    }

    /* renamed from: b */
    public FlyerViewModel m8448b(C1459l0 c1459l0) {
        FlyerViewModel m8447c = m8447c(c1459l0, this.f26661a.mo42226get(), this.f26662b.mo42226get(), this.f26663c.mo42226get());
        C13886p.m94a(m8447c, this.f26664d.mo42226get());
        return m8447c;
    }
}
