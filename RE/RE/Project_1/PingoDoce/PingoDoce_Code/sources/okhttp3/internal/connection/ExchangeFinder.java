package okhttp3.internal.connection;

import gf.Util;
import java.io.IOException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.EnumC8112a;
import okhttp3.internal.http2.StreamResetException;
import p107ff.Address;
import p107ff.EventListener;
import p107ff.HttpUrl;
import p107ff.OkHttpClient;
import p107ff.Route;
import p181jd.Intrinsics;
import p204kf.RealConnectionPool;
import p222lf.InterfaceC7051d;
import p222lf.RealInterceptorChain;

/* renamed from: okhttp3.internal.connection.d */
/* loaded from: classes2.dex */
public final class ExchangeFinder {

    /* renamed from: a */
    private final RealConnectionPool f20967a;

    /* renamed from: b */
    private final Address f20968b;

    /* renamed from: c */
    private final RealCall f20969c;

    /* renamed from: d */
    private final EventListener f20970d;

    /* renamed from: e */
    private RouteSelector.C8111b f20971e;

    /* renamed from: f */
    private RouteSelector f20972f;

    /* renamed from: g */
    private int f20973g;

    /* renamed from: h */
    private int f20974h;

    /* renamed from: i */
    private int f20975i;

    /* renamed from: j */
    private Route f20976j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        Intrinsics.isThisObjectNull(realConnectionPool, "connectionPool");
        Intrinsics.isThisObjectNull(address, "address");
        Intrinsics.isThisObjectNull(realCall, "call");
        Intrinsics.isThisObjectNull(eventListener, "eventListener");
        this.f20967a = realConnectionPool;
        this.f20968b = address;
        this.f20969c = realCall;
        this.f20970d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.connection.RealConnection m16863b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.m16863b(int, int, int, int, boolean):okhttp3.internal.connection.f");
    }

    /* renamed from: c */
    private final RealConnection m16862c(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            RealConnection m16863b = m16863b(i, i2, i3, i4, z);
            if (m16863b.m16792v(z2)) {
                return m16863b;
            }
            m16863b.m16788z();
            if (this.f20976j == null) {
                RouteSelector.C8111b c8111b = this.f20971e;
                if (c8111b == null ? true : c8111b.m16776b()) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f20972f;
                    if (!(routeSelector != null ? routeSelector.m16785a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private final Route m16859f() {
        RealConnection m16840l;
        if (this.f20973g > 1 || this.f20974h > 1 || this.f20975i > 0 || (m16840l = this.f20969c.m16840l()) == null) {
            return null;
        }
        synchronized (m16840l) {
            if (m16840l.m16796r() != 0) {
                return null;
            }
            if (Util.m23407j(m16840l.m16821A().m24151a().m24279l(), m16861d().m24279l())) {
                return m16840l.m16821A();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final InterfaceC7051d m16864a(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(realInterceptorChain, "chain");
        try {
            return m16862c(realInterceptorChain.m19446f(), realInterceptorChain.m19444h(), realInterceptorChain.m19442j(), okHttpClient.m23867x(), okHttpClient.m23892F(), !Intrinsics.equals(realInterceptorChain.m19443i().m24269g(), "GET")).m16790x(okHttpClient, realInterceptorChain);
        } catch (IOException e) {
            m16857h(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            m16857h(e2.m16891c());
            throw e2;
        }
    }

    /* renamed from: d */
    public final Address m16861d() {
        return this.f20968b;
    }

    /* renamed from: e */
    public final boolean m16860e() {
        RouteSelector routeSelector;
        boolean z = false;
        if (this.f20973g == 0 && this.f20974h == 0 && this.f20975i == 0) {
            return false;
        }
        if (this.f20976j != null) {
            return true;
        }
        Route m16859f = m16859f();
        if (m16859f != null) {
            this.f20976j = m16859f;
            return true;
        }
        RouteSelector.C8111b c8111b = this.f20971e;
        if (c8111b != null && c8111b.m16776b()) {
            z = true;
        }
        if (z || (routeSelector = this.f20972f) == null) {
            return true;
        }
        return routeSelector.m16785a();
    }

    /* renamed from: g */
    public final boolean m16858g(HttpUrl httpUrl) {
        Intrinsics.isThisObjectNull(httpUrl, "url");
        HttpUrl m24279l = this.f20968b.m24279l();
        return httpUrl.m23978n() == m24279l.m23978n() && Intrinsics.equals(httpUrl.m23983i(), m24279l.m23983i());
    }

    /* renamed from: h */
    public final void m16857h(IOException iOException) {
        Intrinsics.isThisObjectNull(iOException, "e");
        this.f20976j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f21032w == EnumC8112a.REFUSED_STREAM) {
            this.f20973g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f20974h++;
        } else {
            this.f20975i++;
        }
    }
}
