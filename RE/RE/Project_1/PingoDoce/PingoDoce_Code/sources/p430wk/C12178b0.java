package p430wk;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wk.b0 */
/* loaded from: classes2.dex */
public final class C12178b0 {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32149a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f32150b;

    public C12178b0(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f32149a = interfaceC12341a;
        this.f32150b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12178b0 m3463a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C12178b0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static OnboardingOwnerInV2ViewModel m3461c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new OnboardingOwnerInV2ViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public OnboardingOwnerInV2ViewModel m3462b(C1459l0 c1459l0) {
        OnboardingOwnerInV2ViewModel m3461c = m3461c(c1459l0, this.f32149a.mo42226get());
        C13886p.m94a(m3461c, this.f32150b.mo42226get());
        return m3461c;
    }
}
