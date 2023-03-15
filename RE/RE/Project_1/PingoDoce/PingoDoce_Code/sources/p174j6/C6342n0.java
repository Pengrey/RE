package p174j6;

import p042c6.InterfaceC2092a;
import p057d6.C4743a;
import p057d6.InterfaceC4744b;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: j6.n0 */
/* loaded from: classes.dex */
public final class C6342n0 implements InterfaceC4744b<C6336m0> {

    /* renamed from: a */
    private final InterfaceC12341a<InterfaceC6984a> f17365a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC6984a> f17366b;

    /* renamed from: c */
    private final InterfaceC12341a<AbstractC6315e> f17367c;

    /* renamed from: d */
    private final InterfaceC12341a<C6354t0> f17368d;

    /* renamed from: e */
    private final InterfaceC12341a<String> f17369e;

    public C6342n0(InterfaceC12341a<InterfaceC6984a> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<AbstractC6315e> interfaceC12341a3, InterfaceC12341a<C6354t0> interfaceC12341a4, InterfaceC12341a<String> interfaceC12341a5) {
        this.f17365a = interfaceC12341a;
        this.f17366b = interfaceC12341a2;
        this.f17367c = interfaceC12341a3;
        this.f17368d = interfaceC12341a4;
        this.f17369e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C6342n0 m21153a(InterfaceC12341a<InterfaceC6984a> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<AbstractC6315e> interfaceC12341a3, InterfaceC12341a<C6354t0> interfaceC12341a4, InterfaceC12341a<String> interfaceC12341a5) {
        return new C6342n0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static C6336m0 m21151c(InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, Object obj, Object obj2, InterfaceC2092a<String> interfaceC2092a) {
        return new C6336m0(interfaceC6984a, interfaceC6984a2, (AbstractC6315e) obj, (C6354t0) obj2, interfaceC2092a);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C6336m0 mo42226get() {
        return m21151c(this.f17365a.mo42226get(), this.f17366b.mo42226get(), this.f17367c.mo42226get(), this.f17368d.mo42226get(), C4743a.m26719a(this.f17369e));
    }
}
