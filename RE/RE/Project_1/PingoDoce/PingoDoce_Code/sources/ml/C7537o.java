package ml;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ml.o */
/* loaded from: classes2.dex */
public final class C7537o {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19915a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f19916b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f19917c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f19918d;

    public C7537o(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f19915a = interfaceC12341a;
        this.f19916b = interfaceC12341a2;
        this.f19917c = interfaceC12341a3;
        this.f19918d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7537o m18260a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7537o(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static C7517n m18258c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7405s1 c7405s1) {
        return new C7517n(c1459l0, resourcesProvider, c7256f1, c7405s1);
    }

    /* renamed from: b */
    public C7517n m18259b(C1459l0 c1459l0) {
        C7517n m18258c = m18258c(c1459l0, this.f19915a.mo42226get(), this.f19916b.mo42226get(), this.f19917c.mo42226get());
        C13886p.m94a(m18258c, this.f19918d.mo42226get());
        return m18258c;
    }
}
