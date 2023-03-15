package p241mi;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: mi.b */
/* loaded from: classes2.dex */
public final class C7483b {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19789a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f19790b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f19791c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f19792d;

    public C7483b(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f19789a = interfaceC12341a;
        this.f19790b = interfaceC12341a2;
        this.f19791c = interfaceC12341a3;
        this.f19792d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7483b m18388a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7483b(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static BottomNavigationViewModel m18386c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7347m1 c7347m1) {
        return new BottomNavigationViewModel(c1459l0, resourcesProvider, c7256f1, c7347m1);
    }

    /* renamed from: b */
    public BottomNavigationViewModel m18387b(C1459l0 c1459l0) {
        BottomNavigationViewModel m18386c = m18386c(c1459l0, this.f19789a.mo42226get(), this.f19790b.mo42226get(), this.f19791c.mo42226get());
        C13886p.m94a(m18386c, this.f19792d.mo42226get());
        return m18386c;
    }
}
