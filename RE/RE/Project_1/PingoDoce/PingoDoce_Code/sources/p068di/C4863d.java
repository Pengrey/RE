package p068di;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: di.d */
/* loaded from: classes2.dex */
public final class C4863d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f13286a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f13287b;

    public C4863d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f13286a = interfaceC12341a;
        this.f13287b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4863d m26435a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C4863d(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static WebViewModel m26433c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new WebViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public WebViewModel m26434b(C1459l0 c1459l0) {
        WebViewModel m26433c = m26433c(c1459l0, this.f13286a.mo42226get());
        C13886p.m94a(m26433c, this.f13287b.mo42226get());
        return m26433c;
    }
}
