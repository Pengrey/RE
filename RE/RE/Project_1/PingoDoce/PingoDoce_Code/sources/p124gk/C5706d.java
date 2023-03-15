package p124gk;

import androidx.lifecycle.C1459l0;
import mg.AuthManager;
import mg.C7256f1;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.TransactionCacheManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: gk.d */
/* loaded from: classes2.dex */
public final class C5706d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15963a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f15964b;

    /* renamed from: c */
    private final InterfaceC12341a<C7256f1> f15965c;

    /* renamed from: d */
    private final InterfaceC12341a<TransactionCacheManager> f15966d;

    /* renamed from: e */
    private final InterfaceC12341a<CoachMarkManager> f15967e;

    /* renamed from: f */
    private final InterfaceC12341a<C7405s1> f15968f;

    /* renamed from: g */
    private final InterfaceC12341a<C7405s1> f15969g;

    public C5706d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C7256f1> interfaceC12341a3, InterfaceC12341a<TransactionCacheManager> interfaceC12341a4, InterfaceC12341a<CoachMarkManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        this.f15963a = interfaceC12341a;
        this.f15964b = interfaceC12341a2;
        this.f15965c = interfaceC12341a3;
        this.f15966d = interfaceC12341a4;
        this.f15967e = interfaceC12341a5;
        this.f15968f = interfaceC12341a6;
        this.f15969g = interfaceC12341a7;
    }

    /* renamed from: a */
    public static C5706d m23295a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C7256f1> interfaceC12341a3, InterfaceC12341a<TransactionCacheManager> interfaceC12341a4, InterfaceC12341a<CoachMarkManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        return new C5706d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7);
    }

    /* renamed from: c */
    public static SplashViewModel m23293c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C7256f1 c7256f1, TransactionCacheManager transactionCacheManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        return new SplashViewModel(c1459l0, resourcesProvider, authManager, c7256f1, transactionCacheManager, coachMarkManager, c7405s1);
    }

    /* renamed from: b */
    public SplashViewModel m23294b(C1459l0 c1459l0) {
        SplashViewModel m23293c = m23293c(c1459l0, this.f15963a.mo42226get(), this.f15964b.mo42226get(), this.f15965c.mo42226get(), this.f15966d.mo42226get(), this.f15967e.mo42226get(), this.f15968f.mo42226get());
        C13886p.m94a(m23293c, this.f15969g.mo42226get());
        return m23293c;
    }
}
