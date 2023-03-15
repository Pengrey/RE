package p107ff;

import gf.Util;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p107ff.HttpUrl;
import p181jd.Intrinsics;

/* renamed from: ff.a */
/* loaded from: classes2.dex */
public final class Address {

    /* renamed from: a */
    private final Dns f15362a;

    /* renamed from: b */
    private final SocketFactory f15363b;

    /* renamed from: c */
    private final SSLSocketFactory f15364c;

    /* renamed from: d */
    private final HostnameVerifier f15365d;

    /* renamed from: e */
    private final CertificatePinner f15366e;

    /* renamed from: f */
    private final Authenticator f15367f;

    /* renamed from: g */
    private final Proxy f15368g;

    /* renamed from: h */
    private final ProxySelector f15369h;

    /* renamed from: i */
    private final HttpUrl f15370i;

    /* renamed from: j */
    private final List f15371j;

    /* renamed from: k */
    private final List f15372k;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        Intrinsics.isThisObjectNull(str, "uriHost");
        Intrinsics.isThisObjectNull(dns, "dns");
        Intrinsics.isThisObjectNull(socketFactory, "socketFactory");
        Intrinsics.isThisObjectNull(authenticator, "proxyAuthenticator");
        Intrinsics.isThisObjectNull(list, "protocols");
        Intrinsics.isThisObjectNull(list2, "connectionSpecs");
        Intrinsics.isThisObjectNull(proxySelector, "proxySelector");
        this.f15362a = dns;
        this.f15363b = socketFactory;
        this.f15364c = sSLSocketFactory;
        this.f15365d = hostnameVerifier;
        this.f15366e = certificatePinner;
        this.f15367f = authenticator;
        this.f15368g = proxy;
        this.f15369h = proxySelector;
        this.f15370i = new HttpUrl.C5500a().m23942x(sSLSocketFactory != null ? "https" : "http").m23952n(str).m23946t(i).m23963c();
        this.f15371j = Util.m23424S(list);
        this.f15372k = Util.m23424S(list2);
    }

    /* renamed from: a */
    public final CertificatePinner m24290a() {
        return this.f15366e;
    }

    /* renamed from: b */
    public final List m24289b() {
        return this.f15372k;
    }

    /* renamed from: c */
    public final Dns m24288c() {
        return this.f15362a;
    }

    /* renamed from: d */
    public final boolean m24287d(Address address) {
        Intrinsics.isThisObjectNull(address, "that");
        return Intrinsics.equals(this.f15362a, address.f15362a) && Intrinsics.equals(this.f15367f, address.f15367f) && Intrinsics.equals(this.f15371j, address.f15371j) && Intrinsics.equals(this.f15372k, address.f15372k) && Intrinsics.equals(this.f15369h, address.f15369h) && Intrinsics.equals(this.f15368g, address.f15368g) && Intrinsics.equals(this.f15364c, address.f15364c) && Intrinsics.equals(this.f15365d, address.f15365d) && Intrinsics.equals(this.f15366e, address.f15366e) && this.f15370i.m23978n() == address.f15370i.m23978n();
    }

    /* renamed from: e */
    public final HostnameVerifier m24286e() {
        return this.f15365d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (Intrinsics.equals(this.f15370i, address.f15370i) && m24287d(address)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List m24285f() {
        return this.f15371j;
    }

    /* renamed from: g */
    public final Proxy m24284g() {
        return this.f15368g;
    }

    /* renamed from: h */
    public final Authenticator m24283h() {
        return this.f15367f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f15370i.hashCode()) * 31) + this.f15362a.hashCode()) * 31) + this.f15367f.hashCode()) * 31) + this.f15371j.hashCode()) * 31) + this.f15372k.hashCode()) * 31) + this.f15369h.hashCode()) * 31) + Objects.hashCode(this.f15368g)) * 31) + Objects.hashCode(this.f15364c)) * 31) + Objects.hashCode(this.f15365d)) * 31) + Objects.hashCode(this.f15366e);
    }

    /* renamed from: i */
    public final ProxySelector m24282i() {
        return this.f15369h;
    }

    /* renamed from: j */
    public final SocketFactory m24281j() {
        return this.f15363b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m24280k() {
        return this.f15364c;
    }

    /* renamed from: l */
    public final HttpUrl m24279l() {
        return this.f15370i;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f15370i.m23983i());
        sb2.append(':');
        sb2.append(this.f15370i.m23978n());
        sb2.append(", ");
        Object obj = this.f15368g;
        if (obj != null) {
            str = "proxy=";
        } else {
            obj = this.f15369h;
            str = "proxySelector=";
        }
        sb2.append(Intrinsics.addStrAndObj(str, obj));
        sb2.append('}');
        return sb2.toString();
    }
}
