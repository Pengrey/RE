package p066dg;

import gg.C5664k;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.StoreService;

/* renamed from: dg.p */
/* loaded from: classes2.dex */
public final class C4842p implements InterfaceC11614c<DefaultStoreAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<StoreService> f13253a;

    /* renamed from: b */
    private final InterfaceC12341a<C5664k> f13254b;

    public C4842p(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<C5664k> interfaceC12341a2) {
        this.f13253a = interfaceC12341a;
        this.f13254b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4842p m26493a(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<C5664k> interfaceC12341a2) {
        return new C4842p(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static DefaultStoreAgent m26491c(StoreService storeService, C5664k c5664k) {
        return new DefaultStoreAgent(storeService, c5664k);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public DefaultStoreAgent mo42226get() {
        return m26491c(this.f13253a.mo42226get(), this.f13254b.mo42226get());
    }
}
