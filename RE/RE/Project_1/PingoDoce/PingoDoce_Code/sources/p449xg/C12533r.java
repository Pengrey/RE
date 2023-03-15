package p449xg;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.r */
/* loaded from: classes2.dex */
public final class C12533r implements InterfaceC11614c<SharedPreferences> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32564a;

    /* renamed from: b */
    private final InterfaceC12341a<KeyGenParameterSpec> f32565b;

    public C12533r(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<KeyGenParameterSpec> interfaceC12341a2) {
        this.f32564a = interfaceC12341a;
        this.f32565b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12533r m2909a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<KeyGenParameterSpec> interfaceC12341a2) {
        return new C12533r(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static SharedPreferences m2907c(Context context, KeyGenParameterSpec keyGenParameterSpec) {
        return (SharedPreferences) C11617f.m4587d(AppProviders.f32545a.m2966p(context, keyGenParameterSpec));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SharedPreferences mo42226get() {
        return m2907c(this.f32564a.mo42226get(), this.f32565b.mo42226get());
    }
}
