package p409vl;

import androidx.lifecycle.C1459l0;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: vl.e */
/* loaded from: classes2.dex */
public final class C11401e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f29257a;

    /* renamed from: b */
    private final InterfaceC12341a<C7347m1> f29258b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f29259c;

    public C11401e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f29257a = interfaceC12341a;
        this.f29258b = interfaceC12341a2;
        this.f29259c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11401e m5229a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C11401e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TakeAwayOrderListViewModel m5227c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1) {
        return new TakeAwayOrderListViewModel(c1459l0, resourcesProvider, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayOrderListViewModel m5228b(C1459l0 c1459l0) {
        TakeAwayOrderListViewModel m5227c = m5227c(c1459l0, this.f29257a.mo42226get(), this.f29258b.mo42226get());
        C13886p.m94a(m5227c, this.f29259c.mo42226get());
        return m5227c;
    }
}
