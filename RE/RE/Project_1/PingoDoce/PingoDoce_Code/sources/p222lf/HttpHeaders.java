package p222lf;

import gf.Util;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.platform.Platform;
import p107ff.Cookie;
import p107ff.CookieJar;
import p107ff.Headers;
import p107ff.HttpUrl;
import p107ff.Response;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;
import sd.StringsJVM;

/* renamed from: lf.e */
/* loaded from: classes2.dex */
public final class HttpHeaders {

    /* renamed from: a */
    private static final ByteString f18714a;

    /* renamed from: b */
    private static final ByteString f18715b;

    static {
        ByteString.C10188a c10188a = ByteString.f26546z;
        f18714a = c10188a.m8692d("\"\\");
        f18715b = c10188a.m8692d("\t ,=");
    }

    /* renamed from: a */
    public static final List m19463a(Headers headers, String str) {
        boolean m8943q;
        Intrinsics.isThisObjectNull(headers, "<this>");
        Intrinsics.isThisObjectNull(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            m8943q = StringsJVM.m8943q(str, headers.m24012h(i), true);
            if (m8943q) {
                try {
                    m19461c(new Buffer().m8814I0(headers.m24009p(i)), arrayList);
                } catch (EOFException e) {
                    Platform.f21214a.m16457g().m16469j("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m19462b(Response response) {
        boolean m8943q;
        Intrinsics.isThisObjectNull(response, "<this>");
        if (Intrinsics.equals(response.m24202a0().m24269g(), "HEAD")) {
            return false;
        }
        int m24197t = response.m24197t();
        if (((m24197t >= 100 && m24197t < 200) || m24197t == 204 || m24197t == 304) && Util.m23395v(response) == -1) {
            m8943q = StringsJVM.m8943q("chunked", Response.m24212F(response, "Transfer-Encoding", null, 2, null), true);
            if (!m8943q) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m19461c(p356sf.Buffer r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m19457g(r7)
            java.lang.String r1 = m19459e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m19457g(r7)
            java.lang.String r3 = m19459e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo8762Q()
            if (r7 != 0) goto L1f
            return
        L1f:
            ff.h r7 = new ff.h
            java.util.Map r0 = p489zc.C13766i0.m398e()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = gf.Util.m23432K(r7, r4)
            boolean r6 = m19457g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.mo8762Q()
            if (r2 == 0) goto L5c
        L40:
            ff.h r2 = new ff.h
            java.lang.String r4 = "="
            java.lang.String r4 = sd.C10163k.m8969u(r4, r5)
            java.lang.String r3 = p181jd.Intrinsics.addStrAndObj(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            p181jd.Intrinsics.checkIfNull(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = gf.Util.m23432K(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = m19459e(r7)
            boolean r5 = m19457g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = gf.Util.m23432K(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            ff.h r4 = new ff.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = m19457g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = m19456h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = m19460d(r7)
            goto La0
        L9c:
            java.lang.String r6 = m19459e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = m19457g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.mo8762Q()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: p222lf.HttpHeaders.m19461c(sf.c, java.util.List):void");
    }

    /* renamed from: d */
    private static final String m19460d(Buffer buffer) throws EOFException {
        if (buffer.readByte() == 34) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long mo8761T = buffer.mo8761T(f18714a);
                if (mo8761T == -1) {
                    return null;
                }
                if (buffer.m8811L(mo8761T) == 34) {
                    buffer2.mo8688B(buffer, mo8761T);
                    buffer.readByte();
                    return buffer2.m8801d0();
                } else if (buffer.size() == mo8761T + 1) {
                    return null;
                } else {
                    buffer2.mo8688B(buffer, mo8761T);
                    buffer.readByte();
                    buffer2.mo8688B(buffer, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m19459e(Buffer buffer) {
        long mo8761T = buffer.mo8761T(f18715b);
        if (mo8761T == -1) {
            mo8761T = buffer.size();
        }
        if (mo8761T != 0) {
            return buffer.mo8754l(mo8761T);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m19458f(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        Intrinsics.isThisObjectNull(cookieJar, "<this>");
        Intrinsics.isThisObjectNull(httpUrl, "url");
        Intrinsics.isThisObjectNull(headers, "headers");
        if (cookieJar == CookieJar.f15515a) {
            return;
        }
        List m24080e = Cookie.f15501j.m24080e(httpUrl, headers);
        if (m24080e.isEmpty()) {
            return;
        }
        cookieJar.m24076a(httpUrl, m24080e);
    }

    /* renamed from: g */
    private static final boolean m19457g(Buffer buffer) {
        boolean z = false;
        while (!buffer.mo8762Q()) {
            byte m8811L = buffer.m8811L(0L);
            if (m8811L != 44) {
                if (!(m8811L == 32 || m8811L == 9)) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m19456h(Buffer buffer, byte b) {
        return !buffer.mo8762Q() && buffer.m8811L(0L) == b;
    }
}
