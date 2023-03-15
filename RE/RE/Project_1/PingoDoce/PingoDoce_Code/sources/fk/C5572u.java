package fk;

import androidx.lifecycle.C1459l0;
import fm.C5580d;
import mg.AuthManager;
import mg.C7256f1;
import mg.C7296j0;
import mg.C7310l;
import mg.C7405s1;
import mg.ConsentsManager;
import mg.LoyaltyCardManager;
import mg.SmsManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.landing.lock.LockViewModel;

/* renamed from: fk.u */
/* loaded from: classes2.dex */
public final class C5572u {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15746a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f15747b;

    /* renamed from: c */
    private final InterfaceC12341a<SmsManager> f15748c;

    /* renamed from: d */
    private final InterfaceC12341a<ConsentsManager> f15749d;

    /* renamed from: e */
    private final InterfaceC12341a<C5580d> f15750e;

    /* renamed from: f */
    private final InterfaceC12341a<AuthManager> f15751f;

    /* renamed from: g */
    private final InterfaceC12341a<C7296j0> f15752g;

    /* renamed from: h */
    private final InterfaceC12341a<C7256f1> f15753h;

    /* renamed from: i */
    private final InterfaceC12341a<C7310l> f15754i;

    /* renamed from: j */
    private final InterfaceC12341a<LoyaltyCardManager> f15755j;

    /* renamed from: k */
    private final InterfaceC12341a<StoreManager> f15756k;

    /* renamed from: l */
    private final InterfaceC12341a<C7405s1> f15757l;

    public C5572u(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<ConsentsManager> interfaceC12341a4, InterfaceC12341a<C5580d> interfaceC12341a5, InterfaceC12341a<AuthManager> interfaceC12341a6, InterfaceC12341a<C7296j0> interfaceC12341a7, InterfaceC12341a<C7256f1> interfaceC12341a8, InterfaceC12341a<C7310l> interfaceC12341a9, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a10, InterfaceC12341a<StoreManager> interfaceC12341a11, InterfaceC12341a<C7405s1> interfaceC12341a12) {
        this.f15746a = interfaceC12341a;
        this.f15747b = interfaceC12341a2;
        this.f15748c = interfaceC12341a3;
        this.f15749d = interfaceC12341a4;
        this.f15750e = interfaceC12341a5;
        this.f15751f = interfaceC12341a6;
        this.f15752g = interfaceC12341a7;
        this.f15753h = interfaceC12341a8;
        this.f15754i = interfaceC12341a9;
        this.f15755j = interfaceC12341a10;
        this.f15756k = interfaceC12341a11;
        this.f15757l = interfaceC12341a12;
    }

    /* renamed from: a */
    public static C5572u m23734a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<ConsentsManager> interfaceC12341a4, InterfaceC12341a<C5580d> interfaceC12341a5, InterfaceC12341a<AuthManager> interfaceC12341a6, InterfaceC12341a<C7296j0> interfaceC12341a7, InterfaceC12341a<C7256f1> interfaceC12341a8, InterfaceC12341a<C7310l> interfaceC12341a9, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a10, InterfaceC12341a<StoreManager> interfaceC12341a11, InterfaceC12341a<C7405s1> interfaceC12341a12) {
        return new C5572u(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10, interfaceC12341a11, interfaceC12341a12);
    }

    /* renamed from: c */
    public static LockViewModel m23732c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, SmsManager smsManager, ConsentsManager consentsManager, C5580d c5580d, AuthManager authManager, C7296j0 c7296j0, C7256f1 c7256f1, C7310l c7310l, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager) {
        return new LockViewModel(c1459l0, resourcesProvider, c7405s1, smsManager, consentsManager, c5580d, authManager, c7296j0, c7256f1, c7310l, loyaltyCardManager, storeManager);
    }

    /* renamed from: b */
    public LockViewModel m23733b(C1459l0 c1459l0) {
        LockViewModel m23732c = m23732c(c1459l0, this.f15746a.mo42226get(), this.f15747b.mo42226get(), this.f15748c.mo42226get(), this.f15749d.mo42226get(), this.f15750e.mo42226get(), this.f15751f.mo42226get(), this.f15752g.mo42226get(), this.f15753h.mo42226get(), this.f15754i.mo42226get(), this.f15755j.mo42226get(), this.f15756k.mo42226get());
        C13886p.m94a(m23732c, this.f15757l.mo42226get());
        return m23732c;
    }
}
