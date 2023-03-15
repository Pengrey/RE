package p222lf;

import p181jd.Intrinsics;

/* renamed from: lf.f */
/* loaded from: classes2.dex */
public final class HttpMethod {

    /* renamed from: a */
    public static final HttpMethod f18716a = new HttpMethod();

    private HttpMethod() {
    }

    /* renamed from: a */
    public static final boolean m19455a(String str) {
        Intrinsics.isThisObjectNull(str, "method");
        return (Intrinsics.equals(str, "GET") || Intrinsics.equals(str, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m19452d(String str) {
        Intrinsics.isThisObjectNull(str, "method");
        return Intrinsics.equals(str, "POST") || Intrinsics.equals(str, "PUT") || Intrinsics.equals(str, "PATCH") || Intrinsics.equals(str, "PROPPATCH") || Intrinsics.equals(str, "REPORT");
    }

    /* renamed from: b */
    public final boolean m19454b(String str) {
        Intrinsics.isThisObjectNull(str, "method");
        return !Intrinsics.equals(str, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m19453c(String str) {
        Intrinsics.isThisObjectNull(str, "method");
        return Intrinsics.equals(str, "PROPFIND");
    }
}
