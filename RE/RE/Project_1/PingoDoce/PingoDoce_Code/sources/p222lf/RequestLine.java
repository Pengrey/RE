package p222lf;

import java.net.Proxy;
import p107ff.HttpUrl;
import p107ff.Request;
import p181jd.Intrinsics;

/* renamed from: lf.i */
/* loaded from: classes2.dex */
public final class RequestLine {

    /* renamed from: a */
    public static final RequestLine f18729a = new RequestLine();

    private RequestLine() {
    }

    /* renamed from: b */
    private final boolean m19439b(Request request, Proxy.Type type) {
        return !request.m24270f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String m19440a(Request request, Proxy.Type type) {
        Intrinsics.isThisObjectNull(request, "request");
        Intrinsics.isThisObjectNull(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m24269g());
        sb2.append(' ');
        RequestLine requestLine = f18729a;
        if (requestLine.m19439b(request, type)) {
            sb2.append(request.m24266j());
        } else {
            sb2.append(requestLine.m19438c(request.m24266j()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public final String m19438c(HttpUrl httpUrl) {
        Intrinsics.isThisObjectNull(httpUrl, "url");
        String m23988d = httpUrl.m23988d();
        String m23986f = httpUrl.m23986f();
        if (m23986f != null) {
            return m23988d + '?' + ((Object) m23986f);
        }
        return m23988d;
    }
}
