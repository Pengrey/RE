package p449xg;

import p107ff.CertificatePinner;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: xg.h */
/* loaded from: classes2.dex */
public final class C12429h implements InterfaceC11614c<CertificatePinner> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppProviders_ProvideCertificatePinnerFactory.java */
    /* renamed from: xg.h$a */
    /* loaded from: classes2.dex */
    public static final class C12430a {

        /* renamed from: a */
        private static final C12429h f32552a = new C12429h();
    }

    /* renamed from: a */
    public static C12429h m2943a() {
        return C12430a.f32552a;
    }

    /* renamed from: c */
    public static CertificatePinner m2941c() {
        return (CertificatePinner) C11617f.m4587d(AppProviders.f32545a.m2976f());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public CertificatePinner mo42226get() {
        return m2941c();
    }
}
