package p449xg;

import android.content.Context;
import p248n4.AppEventsLogger;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.n */
/* loaded from: classes2.dex */
public final class C12492n implements InterfaceC11614c<AppEventsLogger> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32560a;

    public C12492n(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32560a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12492n m2922a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12492n(interfaceC12341a);
    }

    /* renamed from: c */
    public static AppEventsLogger m2920c(Context context) {
        return (AppEventsLogger) C11617f.m4587d(AppProviders.f32545a.m2970l(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AppEventsLogger mo42226get() {
        return m2920c(this.f32560a.mo42226get());
    }
}
