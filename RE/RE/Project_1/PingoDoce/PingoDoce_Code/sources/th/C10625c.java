package th;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: th.c */
/* loaded from: classes2.dex */
public final class C10625c {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f27377a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f27378b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f27379c;

    public C10625c(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f27377a = interfaceC12341a;
        this.f27378b = interfaceC12341a2;
        this.f27379c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C10625c m7470a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C10625c(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static MadeForYouViewModel m7468c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1) {
        return new MadeForYouViewModel(c1459l0, resourcesProvider, c7405s1);
    }

    /* renamed from: b */
    public MadeForYouViewModel m7469b(C1459l0 c1459l0) {
        MadeForYouViewModel m7468c = m7468c(c1459l0, this.f27377a.mo42226get(), this.f27378b.mo42226get());
        C13886p.m94a(m7468c, this.f27379c.mo42226get());
        return m7468c;
    }
}
