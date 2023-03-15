package p066dg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.ConsentsService;

/* renamed from: dg.n */
/* loaded from: classes2.dex */
public final class C4838n implements InterfaceC11614c<ConsentsAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<ConsentsService> f13240a;

    public C4838n(InterfaceC12341a<ConsentsService> interfaceC12341a) {
        this.f13240a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C4838n m26504a(InterfaceC12341a<ConsentsService> interfaceC12341a) {
        return new C4838n(interfaceC12341a);
    }

    /* renamed from: c */
    public static ConsentsAgent m26502c(ConsentsService consentsService) {
        return new ConsentsAgent(consentsService);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ConsentsAgent mo42226get() {
        return m26502c(this.f13240a.mo42226get());
    }
}
