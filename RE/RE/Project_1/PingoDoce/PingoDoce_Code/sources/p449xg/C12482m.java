package p449xg;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.m */
/* loaded from: classes2.dex */
public final class C12482m implements InterfaceC11614c<SharedPreferences> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32558a;

    /* renamed from: b */
    private final InterfaceC12341a<KeyGenParameterSpec> f32559b;

    public C12482m(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<KeyGenParameterSpec> interfaceC12341a2) {
        this.f32558a = interfaceC12341a;
        this.f32559b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12482m m2925a(InterfaceC12341a<Context> interfaceC12341a, InterfaceC12341a<KeyGenParameterSpec> interfaceC12341a2) {
        return new C12482m(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static SharedPreferences m2923c(Context context, KeyGenParameterSpec keyGenParameterSpec) {
        return (SharedPreferences) C11617f.m4587d(AppProviders.f32545a.m2971k(context, keyGenParameterSpec));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SharedPreferences mo42226get() {
        return m2923c(this.f32558a.mo42226get(), this.f32559b.mo42226get());
    }
}
