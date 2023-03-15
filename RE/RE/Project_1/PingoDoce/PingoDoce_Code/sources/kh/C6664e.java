package kh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: kh.e */
/* loaded from: classes2.dex */
public final class C6664e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17962a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f17963b;

    public C6664e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f17962a = interfaceC12341a;
        this.f17963b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C6664e m20358a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C6664e(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static EditBirthDateViewModel m20356c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new EditBirthDateViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public EditBirthDateViewModel m20357b(C1459l0 c1459l0) {
        EditBirthDateViewModel m20356c = m20356c(c1459l0, this.f17962a.mo42226get());
        C13886p.m94a(m20356c, this.f17963b.mo42226get());
        return m20356c;
    }
}
