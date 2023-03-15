package p449xg;

import java.text.SimpleDateFormat;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: xg.u */
/* loaded from: classes2.dex */
public final class C12564u implements InterfaceC11614c<SimpleDateFormat> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppProviders_ProvideServerDateFormatFactory.java */
    /* renamed from: xg.u$a */
    /* loaded from: classes2.dex */
    public static final class C12565a {

        /* renamed from: a */
        private static final C12564u f32568a = new C12564u();
    }

    /* renamed from: a */
    public static C12564u m2899a() {
        return C12565a.f32568a;
    }

    /* renamed from: c */
    public static SimpleDateFormat m2897c() {
        return (SimpleDateFormat) C11617f.m4587d(AppProviders.f32545a.m2964r());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SimpleDateFormat mo42226get() {
        return m2897c();
    }
}
