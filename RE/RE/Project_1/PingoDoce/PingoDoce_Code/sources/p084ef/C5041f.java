package p084ef;

import p107ff.ConnectionPool;
import p107ff.Dispatcher;
import p107ff.OkHttpClient;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: ef.f */
/* loaded from: classes2.dex */
public final class C5041f implements InterfaceC11614c<OkHttpClient.C5510a> {

    /* renamed from: a */
    private final InterfaceC12341a<Dispatcher> f13982a;

    /* renamed from: b */
    private final InterfaceC12341a<ConnectionPool> f13983b;

    public C5041f(InterfaceC12341a<Dispatcher> interfaceC12341a, InterfaceC12341a<ConnectionPool> interfaceC12341a2) {
        this.f13982a = interfaceC12341a;
        this.f13983b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5041f m25833a(InterfaceC12341a<Dispatcher> interfaceC12341a, InterfaceC12341a<ConnectionPool> interfaceC12341a2) {
        return new C5041f(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static OkHttpClient.C5510a m25831c(Dispatcher dispatcher, ConnectionPool connectionPool) {
        return (OkHttpClient.C5510a) C11617f.m4587d(NetworkProviders.f13977a.m25857e(dispatcher, connectionPool));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OkHttpClient.C5510a mo42226get() {
        return m25831c(this.f13982a.mo42226get(), this.f13983b.mo42226get());
    }
}
