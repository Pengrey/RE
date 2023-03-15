package p338rf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gd.C5640a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.Platform;
import p107ff.Headers;
import p107ff.InterfaceC5482j;
import p107ff.InterfaceC5503w;
import p107ff.MediaType;
import p107ff.Request;
import p107ff.RequestBody;
import p107ff.Response;
import p107ff.ResponseBody;
import p181jd.Intrinsics;
import p222lf.HttpHeaders;
import p356sf.Buffer;
import p356sf.GzipSource;
import p356sf.InterfaceC10187e;
import p489zc.C13778q0;
import sd.StringsJVM;

/* renamed from: rf.a */
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    private volatile Set f25887a;

    /* renamed from: b */
    private volatile EnumC9896a f25888b;

    /* renamed from: c */
    private final InterfaceC9897b f25889c;

    /* compiled from: HttpLoggingInterceptor.kt */
    /* renamed from: rf.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9896a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    /* renamed from: rf.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9897b {

        /* renamed from: a */
        public static final InterfaceC9897b f25890a;

        /* compiled from: HttpLoggingInterceptor.kt */
        /* renamed from: rf.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C9898a {

            /* compiled from: HttpLoggingInterceptor.kt */
            /* renamed from: rf.a$b$a$a */
            /* loaded from: classes2.dex */
            private static final class C9899a implements InterfaceC9897b {
                /* renamed from: a */
                public void m9739a(String str) {
                    Intrinsics.isThisObjectNull(str, "message");
                    Platform.m16468k(Platform.f21214a.m16457g(), str, 0, null, 6, null);
                }
            }

            private C9898a() {
            }

            public /* synthetic */ C9898a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C9898a(null);
            f25890a = new C9898a.C9899a();
        }

        /* renamed from: a */
        void m9740a(String str);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }

    public HttpLoggingInterceptor(InterfaceC9897b interfaceC9897b) {
        Set m208b;
        Intrinsics.isThisObjectNull(interfaceC9897b, "logger");
        this.f25889c = interfaceC9897b;
        m208b = C13778q0.m208b();
        this.f25887a = m208b;
        this.f25888b = EnumC9896a.NONE;
    }

    /* renamed from: b */
    private final boolean m9743b(Headers headers) {
        boolean m8943q;
        boolean m8943q2;
        String m24014b = headers.m24014b("Content-Encoding");
        if (m24014b != null) {
            m8943q = StringsJVM.m8943q(m24014b, "identity", true);
            if (m8943q) {
                return false;
            }
            m8943q2 = StringsJVM.m8943q(m24014b, "gzip", true);
            return !m8943q2;
        }
        return false;
    }

    /* renamed from: d */
    private final void m9741d(Headers headers, int i) {
        String m24009p = this.f25887a.contains(headers.m24012h(i)) ? "██" : headers.m24009p(i);
        InterfaceC9897b interfaceC9897b = this.f25889c;
        interfaceC9897b.m9740a(headers.m24012h(i) + ": " + m24009p);
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        String str;
        char c;
        String sb2;
        boolean m8943q;
        Charset charset;
        Charset charset2;
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        EnumC9896a enumC9896a = this.f25888b;
        Request request = interfaceC5504a.request();
        if (enumC9896a == EnumC9896a.NONE) {
            return interfaceC5504a.mo23918a(request);
        }
        boolean z = enumC9896a == EnumC9896a.BODY;
        boolean z2 = z || enumC9896a == EnumC9896a.HEADERS;
        RequestBody m24275a = request.m24275a();
        InterfaceC5482j mo23917b = interfaceC5504a.mo23917b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(request.m24269g());
        sb3.append(' ');
        sb3.append(request.m24266j());
        sb3.append(mo23917b != null ? " " + mo23917b.mo24119a() : BuildConfig.VERSION_NAME);
        String sb4 = sb3.toString();
        if (!z2 && m24275a != 0) {
            sb4 = sb4 + " (" + m24275a.contentLength() + "-byte body)";
        }
        this.f25889c.m9740a(sb4);
        if (z2) {
            Headers m24271e = request.m24271e();
            if (m24275a != null) {
                MediaType contentType = m24275a.contentType();
                if (contentType != null && m24271e.m24014b("Content-Type") == null) {
                    this.f25889c.m9740a("Content-Type: " + contentType);
                }
                if (m24275a.contentLength() != -1 && m24271e.m24014b("Content-Length") == null) {
                    this.f25889c.m9740a("Content-Length: " + m24275a.contentLength());
                }
            }
            int size = m24271e.size();
            for (int i = 0; i < size; i++) {
                m9741d(m24271e, i);
            }
            if (z && m24275a != null) {
                if (m9743b(request.m24271e())) {
                    this.f25889c.m9740a("--> END " + request.m24269g() + " (encoded body omitted)");
                } else if (m24275a.isDuplex()) {
                    this.f25889c.m9740a("--> END " + request.m24269g() + " (duplex request body omitted)");
                } else if (m24275a.isOneShot()) {
                    this.f25889c.m9740a("--> END " + request.m24269g() + " (one-shot body omitted)");
                } else {
                    Buffer buffer = new Buffer();
                    m24275a.writeTo(buffer);
                    MediaType contentType2 = m24275a.contentType();
                    if (contentType2 == null || (charset2 = contentType2.m23914c(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                        Intrinsics.checkIfNull(charset2, "UTF_8");
                    }
                    this.f25889c.m9740a(BuildConfig.VERSION_NAME);
                    if (utf8.m9738a(buffer)) {
                        this.f25889c.m9740a(buffer.mo8768B0(charset2));
                        this.f25889c.m9740a("--> END " + request.m24269g() + " (" + m24275a.contentLength() + "-byte body)");
                    } else {
                        this.f25889c.m9740a("--> END " + request.m24269g() + " (binary " + m24275a.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.f25889c.m9740a("--> END " + request.m24269g());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response mo23918a = interfaceC5504a.mo23918a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody m24203a = mo23918a.m24203a();
            Intrinsics.ifNullDoSomething(m24203a);
            long contentLength = m24203a.contentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            InterfaceC9897b interfaceC9897b = this.f25889c;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<-- ");
            sb5.append(mo23918a.m24197t());
            if (mo23918a.m24210L().length() == 0) {
                str = "-byte body omitted)";
                sb2 = BuildConfig.VERSION_NAME;
                c = ' ';
            } else {
                String m24210L = mo23918a.m24210L();
                StringBuilder sb6 = new StringBuilder();
                str = "-byte body omitted)";
                c = ' ';
                sb6.append(String.valueOf(' '));
                sb6.append(m24210L);
                sb2 = sb6.toString();
            }
            sb5.append(sb2);
            sb5.append(c);
            sb5.append(mo23918a.m24202a0().m24266j());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            sb5.append(z2 ? BuildConfig.VERSION_NAME : ", " + str2 + " body");
            sb5.append(')');
            interfaceC9897b.m9740a(sb5.toString());
            if (z2) {
                Headers m24211H = mo23918a.m24211H();
                int size2 = m24211H.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m9741d(m24211H, i2);
                }
                if (z && HttpHeaders.m19462b(mo23918a)) {
                    if (m9743b(mo23918a.m24211H())) {
                        this.f25889c.m9740a("<-- END HTTP (encoded body omitted)");
                    } else {
                        InterfaceC10187e source = m24203a.source();
                        source.mo8746z(Long.MAX_VALUE);
                        Buffer mo8759b = source.mo8759b();
                        m8943q = StringsJVM.m8943q("gzip", m24211H.m24014b("Content-Encoding"), true);
                        Long l = null;
                        if (m8943q) {
                            Long valueOf = Long.valueOf(mo8759b.size());
                            GzipSource gzipSource = new GzipSource(mo8759b.m8802c());
                            try {
                                mo8759b = new Buffer();
                                mo8759b.mo8783A(gzipSource);
                                C5640a.m23456a(gzipSource, null);
                                l = valueOf;
                            } finally {
                            }
                        }
                        MediaType contentType3 = m24203a.contentType();
                        if (contentType3 == null || (charset = contentType3.m23914c(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            Intrinsics.checkIfNull(charset, "UTF_8");
                        }
                        if (!utf8.m9738a(mo8759b)) {
                            this.f25889c.m9740a(BuildConfig.VERSION_NAME);
                            this.f25889c.m9740a("<-- END HTTP (binary " + mo8759b.size() + str);
                            return mo23918a;
                        }
                        if (contentLength != 0) {
                            this.f25889c.m9740a(BuildConfig.VERSION_NAME);
                            this.f25889c.m9740a(mo8759b.m8802c().mo8768B0(charset));
                        }
                        if (l != null) {
                            this.f25889c.m9740a("<-- END HTTP (" + mo8759b.size() + "-byte, " + l + "-gzipped-byte body)");
                        } else {
                            this.f25889c.m9740a("<-- END HTTP (" + mo8759b.size() + "-byte body)");
                        }
                    }
                } else {
                    this.f25889c.m9740a("<-- END HTTP");
                }
            }
            return mo23918a;
        } catch (Exception e) {
            this.f25889c.m9740a("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    /* renamed from: c */
    public final void m9742c(EnumC9896a enumC9896a) {
        Intrinsics.isThisObjectNull(enumC9896a, "<set-?>");
        this.f25888b = enumC9896a;
    }

    public /* synthetic */ HttpLoggingInterceptor(InterfaceC9897b interfaceC9897b, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC9897b.f25890a : interfaceC9897b);
    }
}
