package p224lh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.EmailManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: lh.d */
/* loaded from: classes2.dex */
public final class C7057d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f18743a;

    /* renamed from: b */
    private final InterfaceC12341a<EmailManager> f18744b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f18745c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f18746d;

    public C7057d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<EmailManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f18743a = interfaceC12341a;
        this.f18744b = interfaceC12341a2;
        this.f18745c = interfaceC12341a3;
        this.f18746d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7057d m19425a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<EmailManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7057d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static EditEmailViewModel m19423c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, EmailManager emailManager, AnalyticsManager analyticsManager) {
        return new EditEmailViewModel(c1459l0, resourcesProvider, emailManager, analyticsManager);
    }

    /* renamed from: b */
    public EditEmailViewModel m19424b(C1459l0 c1459l0) {
        EditEmailViewModel m19423c = m19423c(c1459l0, this.f18743a.mo42226get(), this.f18744b.mo42226get(), this.f18745c.mo42226get());
        C13886p.m94a(m19423c, this.f18746d.mo42226get());
        return m19423c;
    }
}
