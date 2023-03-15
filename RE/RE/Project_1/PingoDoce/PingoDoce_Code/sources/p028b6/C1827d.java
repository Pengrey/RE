package p028b6;

import android.content.Context;
import p057d6.InterfaceC4744b;
import p216l6.InterfaceC6984a;
import p445xc.InterfaceC12341a;

/* renamed from: b6.d */
/* loaded from: classes.dex */
public final class C1827d implements InterfaceC4744b<C1826c> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f5527a;

    /* renamed from: b */
    private final InterfaceC12341a<InterfaceC6984a> f5528b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC6984a> f5529c;

    public C1827d(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<InterfaceC6984a> interfaceC12341a3) {
        this.f5527a = interfaceC12341a;
        this.f5528b = interfaceC12341a2;
        this.f5529c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C1827d m35294a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<InterfaceC6984a> interfaceC12341a2, InterfaceC12341a<InterfaceC6984a> interfaceC12341a3) {
        return new C1827d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static C1826c m35292c(Context context, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2) {
        return new C1826c(context, interfaceC6984a, interfaceC6984a2);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C1826c mo42226get() {
        return m35292c(this.f5527a.mo42226get(), this.f5528b.mo42226get(), this.f5529c.mo42226get());
    }
}
