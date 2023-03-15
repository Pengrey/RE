package p449xg;

import java.text.SimpleDateFormat;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: xg.d */
/* loaded from: classes2.dex */
public final class C12386d implements InterfaceC11614c<SimpleDateFormat> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppProviders_ProvideAppBirthDateFormatFactory.java */
    /* renamed from: xg.d$a */
    /* loaded from: classes2.dex */
    public static final class C12387a {

        /* renamed from: a */
        private static final C12386d f32548a = new C12386d();
    }

    /* renamed from: a */
    public static C12386d m2958a() {
        return C12387a.f32548a;
    }

    /* renamed from: c */
    public static SimpleDateFormat m2956c() {
        return (SimpleDateFormat) C11617f.m4587d(AppProviders.f32545a.m2980b());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SimpleDateFormat mo42226get() {
        return m2956c();
    }
}
