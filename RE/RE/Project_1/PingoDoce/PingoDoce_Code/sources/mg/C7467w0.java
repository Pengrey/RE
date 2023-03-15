package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.PurchaseService;

/* renamed from: mg.w0 */
/* loaded from: classes2.dex */
public final class C7467w0 implements InterfaceC11614c<PurchasesManager> {

    /* renamed from: a */
    private final InterfaceC12341a<PurchaseService> f19754a;

    /* renamed from: b */
    private final InterfaceC12341a<PrefsManager> f19755b;

    public C7467w0(InterfaceC12341a<PurchaseService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2) {
        this.f19754a = interfaceC12341a;
        this.f19755b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7467w0 m18433a(InterfaceC12341a<PurchaseService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2) {
        return new C7467w0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static PurchasesManager m18431c(PurchaseService purchaseService, PrefsManager prefsManager) {
        return new PurchasesManager(purchaseService, prefsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PurchasesManager mo42226get() {
        return m18431c(this.f19754a.mo42226get(), this.f19755b.mo42226get());
    }
}
