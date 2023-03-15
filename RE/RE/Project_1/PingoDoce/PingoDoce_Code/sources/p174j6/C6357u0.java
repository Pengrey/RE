package p174j6;

import android.content.Context;
import p057d6.InterfaceC4744b;
import p445xc.InterfaceC12341a;

/* renamed from: j6.u0 */
/* loaded from: classes.dex */
public final class C6357u0 implements InterfaceC4744b<C6354t0> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f17398a;

    /* renamed from: b */
    private final InterfaceC12341a<String> f17399b;

    /* renamed from: c */
    private final InterfaceC12341a<Integer> f17400c;

    public C6357u0(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2, InterfaceC12341a<Integer> interfaceC12341a3) {
        this.f17398a = interfaceC12341a;
        this.f17399b = interfaceC12341a2;
        this.f17400c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C6357u0 m21136a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2, InterfaceC12341a<Integer> interfaceC12341a3) {
        return new C6357u0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static C6354t0 m21134c(Context context, String str, int i) {
        return new C6354t0(context, str, i);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C6354t0 mo42226get() {
        return m21134c(this.f17398a.mo42226get(), this.f17399b.mo42226get(), this.f17400c.mo42226get().intValue());
    }
}
