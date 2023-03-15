package p449xg;

import android.security.keystore.KeyGenParameterSpec;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: xg.q */
/* loaded from: classes2.dex */
public final class C12522q implements InterfaceC11614c<KeyGenParameterSpec> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppProviders_ProvideMasterKeyFactory.java */
    /* renamed from: xg.q$a */
    /* loaded from: classes2.dex */
    public static final class C12523a {

        /* renamed from: a */
        private static final C12522q f32563a = new C12522q();
    }

    /* renamed from: a */
    public static C12522q m2913a() {
        return C12523a.f32563a;
    }

    /* renamed from: c */
    public static KeyGenParameterSpec m2911c() {
        return (KeyGenParameterSpec) C11617f.m4587d(AppProviders.f32545a.m2967o());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public KeyGenParameterSpec mo42226get() {
        return m2911c();
    }
}
