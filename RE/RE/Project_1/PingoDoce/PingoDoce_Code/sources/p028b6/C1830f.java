package p028b6;

import android.content.Context;
import p057d6.InterfaceC4744b;
import p445xc.InterfaceC12341a;

/* renamed from: b6.f */
/* loaded from: classes.dex */
public final class C1830f implements InterfaceC4744b<C1828e> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f5535a;

    /* renamed from: b */
    private final InterfaceC12341a<C1826c> f5536b;

    public C1830f(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<C1826c> interfaceC12341a2) {
        this.f5535a = interfaceC12341a;
        this.f5536b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C1830f m35286a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<C1826c> interfaceC12341a2) {
        return new C1830f(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C1828e m35284c(Context context, Object obj) {
        return new C1828e(context, (C1826c) obj);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C1828e mo42226get() {
        return m35284c(this.f5535a.mo42226get(), this.f5536b.mo42226get());
    }
}
