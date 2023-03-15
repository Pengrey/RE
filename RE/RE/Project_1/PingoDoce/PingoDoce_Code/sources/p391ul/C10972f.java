package p391ul;

import androidx.lifecycle.C1459l0;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ul.f */
/* loaded from: classes2.dex */
public final class C10972f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f28270a;

    /* renamed from: b */
    private final InterfaceC12341a<C7347m1> f28271b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f28272c;

    public C10972f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f28270a = interfaceC12341a;
        this.f28271b = interfaceC12341a2;
        this.f28272c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C10972f m6687a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C10972f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TakeAwayOrderDetailViewModel m6685c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1) {
        return new TakeAwayOrderDetailViewModel(c1459l0, resourcesProvider, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayOrderDetailViewModel m6686b(C1459l0 c1459l0) {
        TakeAwayOrderDetailViewModel m6685c = m6685c(c1459l0, this.f28270a.mo42226get(), this.f28271b.mo42226get());
        C13886p.m94a(m6685c, this.f28272c.mo42226get());
        return m6685c;
    }
}
