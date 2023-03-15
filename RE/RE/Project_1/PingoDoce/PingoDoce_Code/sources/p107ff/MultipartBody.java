package p107ff;

import gf.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Headers;
import p107ff.MediaType;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10186d;

/* renamed from: ff.y */
/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: f */
    public static final C5507b f15570f = new C5507b(null);

    /* renamed from: g */
    public static final MediaType f15571g;

    /* renamed from: h */
    public static final MediaType f15572h;

    /* renamed from: i */
    private static final byte[] f15573i;

    /* renamed from: j */
    private static final byte[] f15574j;

    /* renamed from: k */
    private static final byte[] f15575k;

    /* renamed from: a */
    private final ByteString f15576a;

    /* renamed from: b */
    private final MediaType f15577b;

    /* renamed from: c */
    private final List f15578c;

    /* renamed from: d */
    private final MediaType f15579d;

    /* renamed from: e */
    private long f15580e;

    /* compiled from: MultipartBody.kt */
    /* renamed from: ff.y$b */
    /* loaded from: classes2.dex */
    public static final class C5507b {
        private C5507b() {
        }

        public /* synthetic */ C5507b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m23901a(StringBuilder sb2, String str) {
            Intrinsics.isThisObjectNull(sb2, "<this>");
            Intrinsics.isThisObjectNull(str, "key");
            sb2.append('\"');
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
                i = i2;
            }
            sb2.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    /* renamed from: ff.y$c */
    /* loaded from: classes2.dex */
    public static final class C5508c {

        /* renamed from: c */
        public static final C5509a f15584c = new C5509a(null);

        /* renamed from: a */
        private final Headers f15585a;

        /* renamed from: b */
        private final RequestBody f15586b;

        /* compiled from: MultipartBody.kt */
        /* renamed from: ff.y$c$a */
        /* loaded from: classes2.dex */
        public static final class C5509a {
            private C5509a() {
            }

            public /* synthetic */ C5509a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C5508c m23898a(Headers headers, RequestBody requestBody) {
                Intrinsics.isThisObjectNull(requestBody, "body");
                if ((headers == null ? null : headers.m24014b("Content-Type")) == null) {
                    if ((headers == null ? null : headers.m24014b("Content-Length")) == null) {
                        return new C5508c(headers, requestBody, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            /* renamed from: b */
            public final C5508c m23897b(String str, String str2, RequestBody requestBody) {
                Intrinsics.isThisObjectNull(str, "name");
                Intrinsics.isThisObjectNull(requestBody, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                C5507b c5507b = MultipartBody.f15570f;
                c5507b.m23901a(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    c5507b.m23901a(sb2, str2);
                }
                String sb3 = sb2.toString();
                Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
                return m23898a(new Headers.C5498a().m24003e("Content-Disposition", sb3).m24002f(), requestBody);
            }
        }

        private C5508c(Headers headers, RequestBody requestBody) {
            this.f15585a = headers;
            this.f15586b = requestBody;
        }

        public /* synthetic */ C5508c(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        /* renamed from: a */
        public final RequestBody m23900a() {
            return this.f15586b;
        }

        /* renamed from: b */
        public final Headers m23899b() {
            return this.f15585a;
        }
    }

    static {
        MediaType.C5505a c5505a = MediaType.f15564d;
        f15571g = c5505a.m23909a("multipart/mixed");
        c5505a.m23909a("multipart/alternative");
        c5505a.m23909a("multipart/digest");
        c5505a.m23909a("multipart/parallel");
        f15572h = c5505a.m23909a("multipart/form-data");
        f15573i = new byte[]{58, 32};
        f15574j = new byte[]{13, 10};
        f15575k = new byte[]{45, 45};
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List list) {
        Intrinsics.isThisObjectNull(byteString, "boundaryByteString");
        Intrinsics.isThisObjectNull(mediaType, "type");
        Intrinsics.isThisObjectNull(list, "parts");
        this.f15576a = byteString;
        this.f15577b = mediaType;
        this.f15578c = list;
        MediaType.C5505a c5505a = MediaType.f15564d;
        this.f15579d = c5505a.m23909a(mediaType + "; boundary=" + m23907a());
        this.f15580e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final long m23906b(InterfaceC10186d interfaceC10186d, boolean z) throws IOException {
        Buffer buffer;
        if (z) {
            interfaceC10186d = new Buffer();
            buffer = interfaceC10186d;
        } else {
            buffer = 0;
        }
        int size = this.f15578c.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C5508c c5508c = (C5508c) this.f15578c.get(i);
            Headers m23899b = c5508c.m23899b();
            RequestBody m23900a = c5508c.m23900a();
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            interfaceC10186d.mo8779Z(f15575k);
            interfaceC10186d.mo8782C(this.f15576a);
            interfaceC10186d.mo8779Z(f15574j);
            if (m23899b != null) {
                int size2 = m23899b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    interfaceC10186d.mo8774u0(m23899b.m24012h(i3)).mo8779Z(f15573i).mo8774u0(m23899b.m24009p(i3)).mo8779Z(f15574j);
                }
            }
            MediaType contentType = m23900a.contentType();
            if (contentType != null) {
                interfaceC10186d.mo8774u0("Content-Type: ").mo8774u0(contentType.toString()).mo8779Z(f15574j);
            }
            long contentLength = m23900a.contentLength();
            if (contentLength != -1) {
                interfaceC10186d.mo8774u0("Content-Length: ").mo8773w0(contentLength).mo8779Z(f15574j);
            } else if (z) {
                Intrinsics.ifNullDoSomething(buffer);
                buffer.m8805a();
                return -1L;
            }
            byte[] bArr = f15574j;
            interfaceC10186d.mo8779Z(bArr);
            if (z) {
                j += contentLength;
            } else {
                m23900a.writeTo(interfaceC10186d);
            }
            interfaceC10186d.mo8779Z(bArr);
            i = i2;
        }
        Intrinsics.ifNullDoSomething(interfaceC10186d);
        byte[] bArr2 = f15575k;
        interfaceC10186d.mo8779Z(bArr2);
        interfaceC10186d.mo8782C(this.f15576a);
        interfaceC10186d.mo8779Z(bArr2);
        interfaceC10186d.mo8779Z(f15574j);
        if (z) {
            Intrinsics.ifNullDoSomething(buffer);
            long size3 = j + buffer.size();
            buffer.m8805a();
            return size3;
        }
        return j;
    }

    /* renamed from: a */
    public final String m23907a() {
        return this.f15576a.m8722F();
    }

    public long contentLength() throws IOException {
        long j = this.f15580e;
        if (j == -1) {
            long m23906b = m23906b(null, true);
            this.f15580e = m23906b;
            return m23906b;
        }
        return j;
    }

    public MediaType contentType() {
        return this.f15579d;
    }

    public void writeTo(InterfaceC10186d interfaceC10186d) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        m23906b(interfaceC10186d, false);
    }

    /* compiled from: MultipartBody.kt */
    /* renamed from: ff.y$a */
    /* loaded from: classes2.dex */
    public static final class C5506a {

        /* renamed from: a */
        private final ByteString f15581a;

        /* renamed from: b */
        private MediaType f15582b;

        /* renamed from: c */
        private final List f15583c;

        public C5506a() {
            this(null, 1, null);
        }

        public C5506a(String str) {
            Intrinsics.isThisObjectNull(str, "boundary");
            this.f15581a = ByteString.f26546z.m8692d(str);
            this.f15582b = MultipartBody.f15571g;
            this.f15583c = new ArrayList();
        }

        /* renamed from: a */
        public final C5506a m23905a(Headers headers, RequestBody requestBody) {
            Intrinsics.isThisObjectNull(requestBody, "body");
            m23904b(C5508c.f15584c.m23898a(headers, requestBody));
            return this;
        }

        /* renamed from: b */
        public final C5506a m23904b(C5508c c5508c) {
            Intrinsics.isThisObjectNull(c5508c, "part");
            this.f15583c.add(c5508c);
            return this;
        }

        /* renamed from: c */
        public final MultipartBody m23903c() {
            if (!this.f15583c.isEmpty()) {
                return new MultipartBody(this.f15581a, this.f15582b, Util.m23424S(this.f15583c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: d */
        public final C5506a m23902d(MediaType mediaType) {
            Intrinsics.isThisObjectNull(mediaType, "type");
            if (Intrinsics.equals(mediaType.m23910g(), "multipart")) {
                this.f15582b = mediaType;
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("multipart != ", mediaType).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ C5506a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                p181jd.Intrinsics.checkIfNull(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.MultipartBody.C5506a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
