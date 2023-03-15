package p154i6;

import java.util.concurrent.Executor;
import p057d6.InterfaceC4744b;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;
import p445xc.InterfaceC12341a;

/* renamed from: i6.u */
/* loaded from: classes.dex */
public final class C6040u implements InterfaceC4744b<C6039t> {

    /* renamed from: a */
    private final InterfaceC12341a<Executor> f16686a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC6313d> f16687b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC6041v> f16688c;

    /* renamed from: d */
    private final InterfaceC12341a<InterfaceC6601a> f16689d;

    public C6040u(InterfaceC12341a<Executor> interfaceC12341a, InterfaceC12341a<InterfaceC6313d> interfaceC12341a2, InterfaceC12341a<InterfaceC6041v> interfaceC12341a3, InterfaceC12341a<InterfaceC6601a> interfaceC12341a4) {
        this.f16686a = interfaceC12341a;
        this.f16687b = interfaceC12341a2;
        this.f16688c = interfaceC12341a3;
        this.f16689d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6040u m22313a(InterfaceC12341a<Executor> interfaceC12341a, InterfaceC12341a<InterfaceC6313d> interfaceC12341a2, InterfaceC12341a<InterfaceC6041v> interfaceC12341a3, InterfaceC12341a<InterfaceC6601a> interfaceC12341a4) {
        return new C6040u(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static C6039t m22311c(Executor executor, InterfaceC6313d interfaceC6313d, InterfaceC6041v interfaceC6041v, InterfaceC6601a interfaceC6601a) {
        return new C6039t(executor, interfaceC6313d, interfaceC6041v, interfaceC6601a);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C6039t mo42226get() {
        return m22311c(this.f16686a.mo42226get(), this.f16687b.mo42226get(), this.f16688c.mo42226get(), this.f16689d.mo42226get());
    }
}
