package se;

import android.content.SharedPreferences;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: se.b */
/* loaded from: classes2.dex */
public final class C10177b implements InterfaceC11614c<OAuthSharedPrefs> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f26506a;

    public C10177b(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f26506a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C10177b m8856a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C10177b(interfaceC12341a);
    }

    /* renamed from: c */
    public static OAuthSharedPrefs m8854c(SharedPreferences sharedPreferences) {
        return new OAuthSharedPrefs(sharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OAuthSharedPrefs mo42226get() {
        return m8854c(this.f26506a.mo42226get());
    }
}
