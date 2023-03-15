package mg;

import androidx.biometric.C0577e;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.k */
/* loaded from: classes2.dex */
public final class C7307k implements InterfaceC11614c<BiometricsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<EncryptedPrefsManager> f19372a;

    /* renamed from: b */
    private final InterfaceC12341a<C0577e> f19373b;

    public C7307k(InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a, InterfaceC12341a<C0577e> interfaceC12341a2) {
        this.f19372a = interfaceC12341a;
        this.f19373b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7307k m18751a(InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a, InterfaceC12341a<C0577e> interfaceC12341a2) {
        return new C7307k(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static BiometricsManager m18749c(EncryptedPrefsManager encryptedPrefsManager, C0577e c0577e) {
        return new BiometricsManager(encryptedPrefsManager, c0577e);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public BiometricsManager mo42226get() {
        return m18749c(this.f19372a.mo42226get(), this.f19373b.mo42226get());
    }
}
