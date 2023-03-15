package p066dg;

import gg.C5679u;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.StoreService;

/* renamed from: dg.a0 */
/* loaded from: classes2.dex */
public final class C4794a0 implements InterfaceC11614c<StoresAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<StoreService> f13123a;

    /* renamed from: b */
    private final InterfaceC12341a<C5679u> f13124b;

    public C4794a0(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<C5679u> interfaceC12341a2) {
        this.f13123a = interfaceC12341a;
        this.f13124b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4794a0 m26589a(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<C5679u> interfaceC12341a2) {
        return new C4794a0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static StoresAgent m26587c(StoreService storeService, C5679u c5679u) {
        return new StoresAgent(storeService, c5679u);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public StoresAgent mo42226get() {
        return m26587c(this.f13123a.mo42226get(), this.f13124b.mo42226get());
    }
}
