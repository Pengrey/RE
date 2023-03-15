package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.NifService;

/* renamed from: mg.g0 */
/* loaded from: classes2.dex */
public final class C7280g0 implements InterfaceC11614c<NifManager> {

    /* renamed from: a */
    private final InterfaceC12341a<NifService> f19277a;

    public C7280g0(InterfaceC12341a<NifService> interfaceC12341a) {
        this.f19277a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7280g0 m18806a(InterfaceC12341a<NifService> interfaceC12341a) {
        return new C7280g0(interfaceC12341a);
    }

    /* renamed from: c */
    public static NifManager m18804c(NifService nifService) {
        return new NifManager(nifService);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public NifManager mo42226get() {
        return m18804c(this.f19277a.mo42226get());
    }
}
