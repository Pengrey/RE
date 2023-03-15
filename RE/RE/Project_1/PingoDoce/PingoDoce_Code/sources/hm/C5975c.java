package hm;

import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: hm.c */
/* loaded from: classes2.dex */
public final class C5975c implements InterfaceC11614c<SnackBarWidget> {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16501a;

    public C5975c(InterfaceC12341a<ResourcesProvider> interfaceC12341a) {
        this.f16501a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5975c m22544a(InterfaceC12341a<ResourcesProvider> interfaceC12341a) {
        return new C5975c(interfaceC12341a);
    }

    /* renamed from: c */
    public static SnackBarWidget m22542c(ResourcesProvider resourcesProvider) {
        return new SnackBarWidget(resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SnackBarWidget mo42226get() {
        return m22542c(this.f16501a.mo42226get());
    }
}
