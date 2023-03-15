package p207kl;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7347m1;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;

/* renamed from: kl.f1 */
/* loaded from: classes2.dex */
public final class C6705f1 {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f18029a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f18030b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f18031c;

    /* renamed from: d */
    private final InterfaceC12341a<C7347m1> f18032d;

    /* renamed from: e */
    private final InterfaceC12341a<CoachMarkManager> f18033e;

    /* renamed from: f */
    private final InterfaceC12341a<StoreManager> f18034f;

    /* renamed from: g */
    private final InterfaceC12341a<C7405s1> f18035g;

    public C6705f1(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7347m1> interfaceC12341a4, InterfaceC12341a<CoachMarkManager> interfaceC12341a5, InterfaceC12341a<StoreManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        this.f18029a = interfaceC12341a;
        this.f18030b = interfaceC12341a2;
        this.f18031c = interfaceC12341a3;
        this.f18032d = interfaceC12341a4;
        this.f18033e = interfaceC12341a5;
        this.f18034f = interfaceC12341a6;
        this.f18035g = interfaceC12341a7;
    }

    /* renamed from: a */
    public static C6705f1 m20272a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7347m1> interfaceC12341a4, InterfaceC12341a<CoachMarkManager> interfaceC12341a5, InterfaceC12341a<StoreManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        return new C6705f1(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7);
    }

    /* renamed from: c */
    public static ShoppingListViewModel m20270c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l, C7347m1 c7347m1, CoachMarkManager coachMarkManager, StoreManager storeManager) {
        return new ShoppingListViewModel(c1459l0, resourcesProvider, c7256f1, c7310l, c7347m1, coachMarkManager, storeManager);
    }

    /* renamed from: b */
    public ShoppingListViewModel m20271b(C1459l0 c1459l0) {
        ShoppingListViewModel m20270c = m20270c(c1459l0, this.f18029a.mo42226get(), this.f18030b.mo42226get(), this.f18031c.mo42226get(), this.f18032d.mo42226get(), this.f18033e.mo42226get(), this.f18034f.mo42226get());
        C13886p.m94a(m20270c, this.f18035g.mo42226get());
        return m20270c;
    }
}
