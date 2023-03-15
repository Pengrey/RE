package p449xg;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.o */
/* loaded from: classes2.dex */
public final class C12502o implements InterfaceC11614c<FirebaseAnalytics> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32561a;

    public C12502o(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32561a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12502o m2919a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12502o(interfaceC12341a);
    }

    /* renamed from: c */
    public static FirebaseAnalytics m2917c(Context context) {
        return (FirebaseAnalytics) C11617f.m4587d(AppProviders.f32545a.m2969m(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public FirebaseAnalytics mo42226get() {
        return m2917c(this.f32561a.mo42226get());
    }
}
