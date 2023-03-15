package p227ll;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ll.h */
/* loaded from: classes2.dex */
public final class C7079h {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f18799a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f18800b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f18801c;

    public C7079h(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f18799a = interfaceC12341a;
        this.f18800b = interfaceC12341a2;
        this.f18801c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C7079h m19350a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C7079h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ManualSortShoppingListViewModel m19348c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1) {
        return new ManualSortShoppingListViewModel(c1459l0, resourcesProvider, c7256f1);
    }

    /* renamed from: b */
    public ManualSortShoppingListViewModel m19349b(C1459l0 c1459l0) {
        ManualSortShoppingListViewModel m19348c = m19348c(c1459l0, this.f18799a.mo42226get(), this.f18800b.mo42226get());
        C13886p.m94a(m19348c, this.f18801c.mo42226get());
        return m19348c;
    }
}
