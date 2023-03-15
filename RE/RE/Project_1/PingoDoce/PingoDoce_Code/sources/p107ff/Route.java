package p107ff;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p181jd.Intrinsics;

/* renamed from: ff.f0 */
/* loaded from: classes2.dex */
public final class Route {

    /* renamed from: a */
    private final Address f15452a;

    /* renamed from: b */
    private final Proxy f15453b;

    /* renamed from: c */
    private final InetSocketAddress f15454c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Intrinsics.isThisObjectNull(address, "address");
        Intrinsics.isThisObjectNull(proxy, "proxy");
        Intrinsics.isThisObjectNull(inetSocketAddress, "socketAddress");
        this.f15452a = address;
        this.f15453b = proxy;
        this.f15454c = inetSocketAddress;
    }

    /* renamed from: a */
    public final Address m24151a() {
        return this.f15452a;
    }

    /* renamed from: b */
    public final Proxy m24150b() {
        return this.f15453b;
    }

    /* renamed from: c */
    public final boolean m24149c() {
        return this.f15452a.m24280k() != null && this.f15453b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m24148d() {
        return this.f15454c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (Intrinsics.equals(route.f15452a, this.f15452a) && Intrinsics.equals(route.f15453b, this.f15453b) && Intrinsics.equals(route.f15454c, this.f15454c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f15452a.hashCode()) * 31) + this.f15453b.hashCode()) * 31) + this.f15454c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f15454c + '}';
    }
}
