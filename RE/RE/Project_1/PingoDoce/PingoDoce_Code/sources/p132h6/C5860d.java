package p132h6;

import java.util.concurrent.Executor;
import p028b6.InterfaceC1825b;
import p057d6.InterfaceC4744b;
import p154i6.InterfaceC6041v;
import p174j6.InterfaceC6313d;
import p196k6.InterfaceC6601a;
import p445xc.InterfaceC12341a;

/* renamed from: h6.d */
/* loaded from: classes.dex */
public final class C5860d implements InterfaceC4744b<C5859c> {

    /* renamed from: a */
    private final InterfaceC12341a<Executor> f16289a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC1825b> f16290b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC6041v> f16291c;

    /* renamed from: d */
    private final InterfaceC12341a<InterfaceC6313d> f16292d;

    /* renamed from: e */
    private final InterfaceC12341a<InterfaceC6601a> f16293e;

    public C5860d(InterfaceC12341a<Executor> interfaceC12341a, InterfaceC12341a<InterfaceC1825b> interfaceC12341a2, InterfaceC12341a<InterfaceC6041v> interfaceC12341a3, InterfaceC12341a<InterfaceC6313d> interfaceC12341a4, InterfaceC12341a<InterfaceC6601a> interfaceC12341a5) {
        this.f16289a = interfaceC12341a;
        this.f16290b = interfaceC12341a2;
        this.f16291c = interfaceC12341a3;
        this.f16292d = interfaceC12341a4;
        this.f16293e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C5860d m22867a(InterfaceC12341a<Executor> interfaceC12341a, InterfaceC12341a<InterfaceC1825b> interfaceC12341a2, InterfaceC12341a<InterfaceC6041v> interfaceC12341a3, InterfaceC12341a<InterfaceC6313d> interfaceC12341a4, InterfaceC12341a<InterfaceC6601a> interfaceC12341a5) {
        return new C5860d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static C5859c m22865c(Executor executor, InterfaceC1825b interfaceC1825b, InterfaceC6041v interfaceC6041v, InterfaceC6313d interfaceC6313d, InterfaceC6601a interfaceC6601a) {
        return new C5859c(executor, interfaceC1825b, interfaceC6041v, interfaceC6313d, interfaceC6601a);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5859c mo42226get() {
        return m22865c(this.f16289a.mo42226get(), this.f16290b.mo42226get(), this.f16291c.mo42226get(), this.f16292d.mo42226get(), this.f16293e.mo42226get());
    }
}
