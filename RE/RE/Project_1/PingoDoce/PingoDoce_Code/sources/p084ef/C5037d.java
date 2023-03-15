package p084ef;

import p338rf.HttpLoggingInterceptor;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: ef.d */
/* loaded from: classes2.dex */
public final class C5037d implements InterfaceC11614c<HttpLoggingInterceptor> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetworkProviders_ProvideHttpLoggingInterceptorFactory.java */
    /* renamed from: ef.d$a */
    /* loaded from: classes2.dex */
    public static final class C5038a {

        /* renamed from: a */
        private static final C5037d f13980a = new C5037d();
    }

    /* renamed from: a */
    public static C5037d m25841a() {
        return C5038a.f13980a;
    }

    /* renamed from: c */
    public static HttpLoggingInterceptor m25839c() {
        return (HttpLoggingInterceptor) C11617f.m4587d(NetworkProviders.f13977a.m25859c());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public HttpLoggingInterceptor mo42226get() {
        return m25839c();
    }
}
