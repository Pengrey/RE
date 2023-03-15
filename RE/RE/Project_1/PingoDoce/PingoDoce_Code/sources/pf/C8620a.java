package pf;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p489zc.CollectionsJVM;

/* renamed from: pf.a */
/* loaded from: classes2.dex */
public final class C8620a extends ProxySelector {

    /* renamed from: a */
    public static final C8620a f22231a = new C8620a();

    private C8620a() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> m202b;
        if (uri != null) {
            m202b = CollectionsJVM.m202b(Proxy.NO_PROXY);
            return m202b;
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
