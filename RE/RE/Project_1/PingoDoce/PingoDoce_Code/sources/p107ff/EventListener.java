package p107ff;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ff.r */
/* loaded from: classes2.dex */
public abstract class EventListener {

    /* renamed from: a */
    public static final EventListener f15526a;

    /* compiled from: EventListener.kt */
    /* renamed from: ff.r$a */
    /* loaded from: classes2.dex */
    public static final class C5490a extends EventListener {
        C5490a() {
        }
    }

    /* compiled from: EventListener.kt */
    /* renamed from: ff.r$b */
    /* loaded from: classes2.dex */
    public static final class C5491b {
        private C5491b() {
        }

        public /* synthetic */ C5491b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    /* renamed from: ff.r$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5492c {
        /* renamed from: a */
        EventListener mo23443a(InterfaceC5469e interfaceC5469e);
    }

    static {
        new C5491b(null);
        f15526a = new C5490a();
    }

    /* renamed from: A */
    public void m24055A(InterfaceC5469e interfaceC5469e, Handshake handshake) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: B */
    public void m24054B(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: a */
    public void m24053a(InterfaceC5469e interfaceC5469e, Response response) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(response, "cachedResponse");
    }

    /* renamed from: b */
    public void m24052b(InterfaceC5469e interfaceC5469e, Response response) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(response, "response");
    }

    /* renamed from: c */
    public void m24051c(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: d */
    public void m24050d(InterfaceC5469e interfaceC5469e, IOException iOException) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(iOException, "ioe");
    }

    /* renamed from: e */
    public void m24049e(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: f */
    public void m24048f(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: g */
    public void m24047g(InterfaceC5469e interfaceC5469e, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(inetSocketAddress, "inetSocketAddress");
        Intrinsics.isThisObjectNull(proxy, "proxy");
    }

    /* renamed from: h */
    public void m24046h(InterfaceC5469e interfaceC5469e, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(inetSocketAddress, "inetSocketAddress");
        Intrinsics.isThisObjectNull(proxy, "proxy");
        Intrinsics.isThisObjectNull(iOException, "ioe");
    }

    /* renamed from: i */
    public void m24045i(InterfaceC5469e interfaceC5469e, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(inetSocketAddress, "inetSocketAddress");
        Intrinsics.isThisObjectNull(proxy, "proxy");
    }

    /* renamed from: j */
    public void m24044j(InterfaceC5469e interfaceC5469e, InterfaceC5482j interfaceC5482j) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(interfaceC5482j, "connection");
    }

    /* renamed from: k */
    public void m24043k(InterfaceC5469e interfaceC5469e, InterfaceC5482j interfaceC5482j) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(interfaceC5482j, "connection");
    }

    /* renamed from: l */
    public void m24042l(InterfaceC5469e interfaceC5469e, String str, List list) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(str, "domainName");
        Intrinsics.isThisObjectNull(list, "inetAddressList");
    }

    /* renamed from: m */
    public void m24041m(InterfaceC5469e interfaceC5469e, String str) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(str, "domainName");
    }

    /* renamed from: n */
    public void m24040n(InterfaceC5469e interfaceC5469e, HttpUrl httpUrl, List list) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(httpUrl, "url");
        Intrinsics.isThisObjectNull(list, "proxies");
    }

    /* renamed from: o */
    public void m24039o(InterfaceC5469e interfaceC5469e, HttpUrl httpUrl) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(httpUrl, "url");
    }

    /* renamed from: p */
    public void m24038p(InterfaceC5469e interfaceC5469e, long j) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: q */
    public void m24037q(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: r */
    public void m24036r(InterfaceC5469e interfaceC5469e, IOException iOException) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(iOException, "ioe");
    }

    /* renamed from: s */
    public void m24035s(InterfaceC5469e interfaceC5469e, Request request) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(request, "request");
    }

    /* renamed from: t */
    public void m24034t(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: u */
    public void m24033u(InterfaceC5469e interfaceC5469e, long j) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: v */
    public void m24032v(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: w */
    public void m24031w(InterfaceC5469e interfaceC5469e, IOException iOException) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(iOException, "ioe");
    }

    /* renamed from: x */
    public void m24030x(InterfaceC5469e interfaceC5469e, Response response) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(response, "response");
    }

    /* renamed from: y */
    public void m24029y(InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
    }

    /* renamed from: z */
    public void m24028z(InterfaceC5469e interfaceC5469e, Response response) {
        Intrinsics.isThisObjectNull(interfaceC5469e, "call");
        Intrinsics.isThisObjectNull(response, "response");
    }
}
