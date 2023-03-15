package p092f0;

import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Effects.kt */
/* renamed from: f0.w */
/* loaded from: classes.dex */
public final class C5260w implements InterfaceC5269z0 {

    /* renamed from: w */
    private final InterfaceC6108l f14530w;

    /* renamed from: x */
    private InterfaceC5264x f14531x;

    public C5260w(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "effect");
        this.f14530w = interfaceC6108l;
    }

    /* renamed from: a */
    public void mo24845a() {
        this.f14531x = (InterfaceC5264x) this.f14530w.mo9587d(Effects.m25534h());
    }

    /* renamed from: b */
    public void mo24844b() {
    }

    /* renamed from: e */
    public void mo24843e() {
        InterfaceC5264x interfaceC5264x = this.f14531x;
        if (interfaceC5264x != null) {
            interfaceC5264x.mo24852b();
        }
        this.f14531x = null;
    }
}
