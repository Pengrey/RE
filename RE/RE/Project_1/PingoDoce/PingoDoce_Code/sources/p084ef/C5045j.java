package p084ef;

import p107ff.Dispatcher;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: ef.j */
/* loaded from: classes2.dex */
public final class C5045j implements InterfaceC11614c<Dispatcher> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetworkProviders_ProvideOkHttpDispatcherFactory.java */
    /* renamed from: ef.j$a */
    /* loaded from: classes2.dex */
    public static final class C5046a {

        /* renamed from: a */
        private static final C5045j f13998a = new C5045j();
    }

    /* renamed from: a */
    public static C5045j m25821a() {
        return C5046a.f13998a;
    }

    /* renamed from: c */
    public static Dispatcher m25819c() {
        return (Dispatcher) C11617f.m4587d(NetworkProviders.f13977a.m25853i());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public Dispatcher mo42226get() {
        return m25819c();
    }
}
