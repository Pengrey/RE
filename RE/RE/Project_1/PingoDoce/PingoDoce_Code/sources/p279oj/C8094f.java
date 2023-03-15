package p279oj;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: oj.f */
/* loaded from: classes2.dex */
public final class C8094f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20921a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f20922b;

    public C8094f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f20921a = interfaceC12341a;
        this.f20922b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C8094f m16916a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C8094f(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static VersionControlViewModel m16914c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new VersionControlViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public VersionControlViewModel m16915b(C1459l0 c1459l0) {
        VersionControlViewModel m16914c = m16914c(c1459l0, this.f20921a.mo42226get());
        C13886p.m94a(m16914c, this.f20922b.mo42226get());
        return m16914c;
    }
}
