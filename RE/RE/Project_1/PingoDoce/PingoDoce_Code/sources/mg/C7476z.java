package mg;

import android.content.SharedPreferences;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.z */
/* loaded from: classes2.dex */
public final class C7476z implements InterfaceC11614c<EncryptedPrefsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f19764a;

    public C7476z(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f19764a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7476z m18409a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C7476z(interfaceC12341a);
    }

    /* renamed from: c */
    public static EncryptedPrefsManager m18407c(SharedPreferences sharedPreferences) {
        return new EncryptedPrefsManager(sharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public EncryptedPrefsManager mo42226get() {
        return m18407c(this.f19764a.mo42226get());
    }
}
