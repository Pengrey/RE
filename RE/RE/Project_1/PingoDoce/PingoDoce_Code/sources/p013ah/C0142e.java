package p013ah;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;

/* renamed from: ah.e */
/* loaded from: classes2.dex */
public final class C0142e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f315a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f316b;

    public C0142e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f315a = interfaceC12341a;
        this.f316b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C0142e m41767a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C0142e(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static AnonymousAccountViewModel m41765c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new AnonymousAccountViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public AnonymousAccountViewModel m41766b(C1459l0 c1459l0) {
        AnonymousAccountViewModel m41765c = m41765c(c1459l0, this.f315a.mo42226get());
        C13886p.m94a(m41765c, this.f316b.mo42226get());
        return m41765c;
    }
}
