package p084ef;

import p107ff.ConnectionPool;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;

/* renamed from: ef.c */
/* loaded from: classes2.dex */
public final class C5035c implements InterfaceC11614c<ConnectionPool> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetworkProviders_ProvideConnectionPoolFactory.java */
    /* renamed from: ef.c$a */
    /* loaded from: classes2.dex */
    public static final class C5036a {

        /* renamed from: a */
        private static final C5035c f13979a = new C5035c();
    }

    /* renamed from: a */
    public static C5035c m25845a() {
        return C5036a.f13979a;
    }

    /* renamed from: c */
    public static ConnectionPool m25843c() {
        return (ConnectionPool) C11617f.m4587d(NetworkProviders.f13977a.m25860b());
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ConnectionPool mo42226get() {
        return m25843c();
    }
}
