package okhttp3.internal.connection;

import gf.Util;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Address;
import p107ff.EventListener;
import p107ff.HttpUrl;
import p107ff.InterfaceC5469e;
import p107ff.Route;
import p181jd.Intrinsics;
import p204kf.RouteDatabase;
import p489zc.C13780s;
import p489zc.CollectionsJVM;
import p489zc.MutableCollections;

/* renamed from: okhttp3.internal.connection.g */
/* loaded from: classes2.dex */
public final class RouteSelector {

    /* renamed from: i */
    public static final C8110a f21021i = new C8110a(null);

    /* renamed from: a */
    private final Address f21022a;

    /* renamed from: b */
    private final RouteDatabase f21023b;

    /* renamed from: c */
    private final InterfaceC5469e f21024c;

    /* renamed from: d */
    private final EventListener f21025d;

    /* renamed from: e */
    private List f21026e;

    /* renamed from: f */
    private int f21027f;

    /* renamed from: g */
    private List f21028g;

    /* renamed from: h */
    private final List f21029h;

    /* compiled from: RouteSelector.kt */
    /* renamed from: okhttp3.internal.connection.g$a */
    /* loaded from: classes2.dex */
    public static final class C8110a {
        private C8110a() {
        }

        public /* synthetic */ C8110a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m16778a(InetSocketAddress inetSocketAddress) {
            Intrinsics.isThisObjectNull(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkIfNull(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkIfNull(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* compiled from: RouteSelector.kt */
    /* renamed from: okhttp3.internal.connection.g$b */
    /* loaded from: classes2.dex */
    public static final class C8111b {

        /* renamed from: a */
        private final List f21030a;

        /* renamed from: b */
        private int f21031b;

        public C8111b(List list) {
            Intrinsics.isThisObjectNull(list, "routes");
            this.f21030a = list;
        }

        /* renamed from: a */
        public final List m16777a() {
            return this.f21030a;
        }

        /* renamed from: b */
        public final boolean m16776b() {
            return this.f21031b < this.f21030a.size();
        }

        /* renamed from: c */
        public final Route m16775c() {
            if (m16776b()) {
                List list = this.f21030a;
                int i = this.f21031b;
                this.f21031b = i + 1;
                return (Route) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, InterfaceC5469e interfaceC5469e, EventListener eventListener) {
        List m197g;
        List m197g2;
        Intrinsics.isThisObjectNull(address, "address");
        Intrinsics.isThisObjectNull(routeDatabase, "routeDatabase");
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(eventListener, "eventListener");
        this.f21022a = address;
        this.f21023b = routeDatabase;
        this.f21024c = interfaceC5469e;
        this.f21025d = eventListener;
        m197g = C13780s.m197g();
        this.f21026e = m197g;
        m197g2 = C13780s.m197g();
        this.f21028g = m197g2;
        this.f21029h = new ArrayList();
        m16780f(address.m24279l(), address.m24284g());
    }

    /* renamed from: b */
    private final boolean m16784b() {
        return this.f21027f < this.f21026e.size();
    }

    /* renamed from: d */
    private final Proxy m16782d() throws IOException {
        if (m16784b()) {
            List list = this.f21026e;
            int i = this.f21027f;
            this.f21027f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m16781e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f21022a.m24279l().m23983i() + "; exhausted proxy configurations: " + this.f21026e);
    }

    /* renamed from: e */
    private final void m16781e(Proxy proxy) throws IOException {
        String m23983i;
        int m23978n;
        ArrayList arrayList = new ArrayList();
        this.f21028g = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                C8110a c8110a = f21021i;
                Intrinsics.checkIfNull(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                m23983i = c8110a.m16778a(inetSocketAddress);
                m23978n = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(Intrinsics.addStrAndObj("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
            }
        } else {
            m23983i = this.f21022a.m24279l().m23983i();
            m23978n = this.f21022a.m24279l().m23978n();
        }
        boolean z = false;
        if (1 <= m23978n && m23978n < 65536) {
            z = true;
        }
        if (z) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(m23983i, m23978n));
                return;
            }
            this.f21025d.m24041m(this.f21024c, m23983i);
            List<InetAddress> m24057a = this.f21022a.m24288c().m24057a(m23983i);
            if (!m24057a.isEmpty()) {
                this.f21025d.m24042l(this.f21024c, m23983i, m24057a);
                for (InetAddress inetAddress : m24057a) {
                    arrayList.add(new InetSocketAddress(inetAddress, m23978n));
                }
                return;
            }
            throw new UnknownHostException(this.f21022a.m24288c() + " returned no addresses for " + m23983i);
        }
        throw new SocketException("No route to " + m23983i + ':' + m23978n + "; port is out of range");
    }

    /* renamed from: f */
    private final void m16780f(HttpUrl httpUrl, Proxy proxy) {
        this.f21025d.m24039o(this.f21024c, httpUrl);
        List m16779g = m16779g(proxy, httpUrl, this);
        this.f21026e = m16779g;
        this.f21027f = 0;
        this.f21025d.m24040n(this.f21024c, httpUrl, m16779g);
    }

    /* renamed from: g */
    private static final List m16779g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        List m202b;
        if (proxy != null) {
            m202b = CollectionsJVM.m202b(proxy);
            return m202b;
        }
        URI m23973s = httpUrl.m23973s();
        if (m23973s.getHost() == null) {
            return Util.m23394w(Proxy.NO_PROXY);
        }
        List<Proxy> select = routeSelector.f21022a.m24282i().select(m23973s);
        if (select == null || select.isEmpty()) {
            return Util.m23394w(Proxy.NO_PROXY);
        }
        Intrinsics.checkIfNull(select, "proxiesOrNull");
        return Util.m23424S(select);
    }

    /* renamed from: a */
    public final boolean m16785a() {
        return m16784b() || (this.f21029h.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final C8111b m16783c() throws IOException {
        if (m16785a()) {
            ArrayList arrayList = new ArrayList();
            while (m16784b()) {
                Proxy m16782d = m16782d();
                for (InetSocketAddress inetSocketAddress : this.f21028g) {
                    Route route = new Route(this.f21022a, m16782d, inetSocketAddress);
                    if (this.f21023b.m20366c(route)) {
                        this.f21029h.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                MutableCollections.m181u(arrayList, this.f21029h);
                this.f21029h.clear();
            }
            return new C8111b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
