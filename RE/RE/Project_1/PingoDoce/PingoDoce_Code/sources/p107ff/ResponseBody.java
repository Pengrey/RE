package p107ff;

import gd.C5640a;
import gf.Util;
import id.InterfaceC6108l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.MediaType;
import p181jd.C6436j;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;
import p468yc.C13195u;
import sd.C10150d;

/* renamed from: ff.e0 */
/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {
    public static final C5472b Companion = new C5472b(null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    /* renamed from: ff.e0$a */
    /* loaded from: classes2.dex */
    public static final class C5471a extends Reader {

        /* renamed from: w */
        private final InterfaceC10187e f15445w;

        /* renamed from: x */
        private final Charset f15446x;

        /* renamed from: y */
        private boolean f15447y;

        /* renamed from: z */
        private Reader f15448z;

        public C5471a(InterfaceC10187e interfaceC10187e, Charset charset) {
            Intrinsics.isThisObjectNull(interfaceC10187e, "source");
            Intrinsics.isThisObjectNull(charset, "charset");
            this.f15445w = interfaceC10187e;
            this.f15446x = charset;
        }

        public void close() throws IOException {
            C13195u c13195u;
            this.f15447y = true;
            Reader reader = this.f15448z;
            if (reader == null) {
                c13195u = null;
            } else {
                reader.close();
                c13195u = C13195u.f34156a;
            }
            if (c13195u == null) {
                this.f15445w.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            Intrinsics.isThisObjectNull(cArr, "cbuf");
            if (!this.f15447y) {
                Reader reader = this.f15448z;
                if (reader == null) {
                    reader = new InputStreamReader(this.f15445w.mo8767C0(), Util.m23434I(this.f15445w, this.f15446x));
                    this.f15448z = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    /* renamed from: ff.e0$b */
    /* loaded from: classes2.dex */
    public static final class C5472b {

        /* compiled from: ResponseBody.kt */
        /* renamed from: ff.e0$b$a */
        /* loaded from: classes2.dex */
        public static final class C5473a extends ResponseBody {

            /* renamed from: w */
            final /* synthetic */ MediaType f15449w;

            /* renamed from: x */
            final /* synthetic */ long f15450x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC10187e f15451y;

            C5473a(MediaType mediaType, long j, InterfaceC10187e interfaceC10187e) {
                this.f15449w = mediaType;
                this.f15450x = j;
                this.f15451y = interfaceC10187e;
            }

            public long contentLength() {
                return this.f15450x;
            }

            public MediaType contentType() {
                return this.f15449w;
            }

            public InterfaceC10187e source() {
                return this.f15451y;
            }
        }

        private C5472b() {
        }

        public /* synthetic */ C5472b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ ResponseBody m24152i(C5472b c5472b, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return c5472b.m24153h(bArr, mediaType);
        }

        /* renamed from: a */
        public final ResponseBody m24160a(MediaType mediaType, long j, InterfaceC10187e interfaceC10187e) {
            Intrinsics.isThisObjectNull(interfaceC10187e, "content");
            return m24155f(interfaceC10187e, mediaType, j);
        }

        /* renamed from: b */
        public final ResponseBody m24159b(MediaType mediaType, String str) {
            Intrinsics.isThisObjectNull(str, "content");
            return m24156e(str, mediaType);
        }

        /* renamed from: c */
        public final ResponseBody m24158c(MediaType mediaType, ByteString byteString) {
            Intrinsics.isThisObjectNull(byteString, "content");
            return m24154g(byteString, mediaType);
        }

        /* renamed from: d */
        public final ResponseBody m24157d(MediaType mediaType, byte[] bArr) {
            Intrinsics.isThisObjectNull(bArr, "content");
            return m24153h(bArr, mediaType);
        }

        /* renamed from: e */
        public final ResponseBody m24156e(String str, MediaType mediaType) {
            Intrinsics.isThisObjectNull(str, "<this>");
            Charset charset = C10150d.f26472b;
            if (mediaType != null) {
                Charset m23913d = MediaType.m23913d(mediaType, null, 1, null);
                if (m23913d == null) {
                    MediaType.C5505a c5505a = MediaType.f15564d;
                    mediaType = c5505a.m23908b(mediaType + "; charset=utf-8");
                } else {
                    charset = m23913d;
                }
            }
            Buffer m8815H0 = new Buffer().m8815H0(str, charset);
            return m24155f(m8815H0, mediaType, m8815H0.size());
        }

        /* renamed from: f */
        public final ResponseBody m24155f(InterfaceC10187e interfaceC10187e, MediaType mediaType, long j) {
            Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
            return new C5473a(mediaType, j, interfaceC10187e);
        }

        /* renamed from: g */
        public final ResponseBody m24154g(ByteString byteString, MediaType mediaType) {
            Intrinsics.isThisObjectNull(byteString, "<this>");
            return m24155f(new Buffer().m8794q0(byteString), mediaType, byteString.size());
        }

        /* renamed from: h */
        public final ResponseBody m24153h(byte[] bArr, MediaType mediaType) {
            Intrinsics.isThisObjectNull(bArr, "<this>");
            return m24155f(new Buffer().m8793t0(bArr), mediaType, bArr.length);
        }
    }

    private final Charset charset() {
        MediaType contentType = contentType();
        Charset m23914c = contentType == null ? null : contentType.m23914c(C10150d.f26472b);
        return m23914c == null ? C10150d.f26472b : m23914c;
    }

    private final Object consumeSource(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC10187e source = source();
            try {
                Object mo9587d = interfaceC6108l.mo9587d(source);
                C6436j.m20936b(1);
                C5640a.m23456a(source, null);
                C6436j.m20937a(1);
                int intValue = ((Number) interfaceC6108l2.mo9587d(mo9587d)).intValue();
                if (contentLength == -1 || contentLength == intValue) {
                    return mo9587d;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.addStrAndObj("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public static final ResponseBody create(MediaType mediaType, long j, InterfaceC10187e interfaceC10187e) {
        return Companion.m24160a(mediaType, j, interfaceC10187e);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.m24159b(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m24158c(mediaType, byteString);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m24157d(mediaType, bArr);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.m24156e(str, mediaType);
    }

    public static final ResponseBody create(InterfaceC10187e interfaceC10187e, MediaType mediaType, long j) {
        return Companion.m24155f(interfaceC10187e, mediaType, j);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m24154g(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m24153h(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().mo8767C0();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC10187e source = source();
            try {
                ByteString mo8751r = source.mo8751r();
                C5640a.m23456a(source, null);
                int size = mo8751r.size();
                if (contentLength == -1 || contentLength == size) {
                    return mo8751r;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.addStrAndObj("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            InterfaceC10187e source = source();
            try {
                byte[] mo8764K = source.mo8764K();
                C5640a.m23456a(source, null);
                int length = mo8764K.length;
                if (contentLength == -1 || contentLength == length) {
                    return mo8764K;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.addStrAndObj("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            C5471a c5471a = new C5471a(source(), charset());
            this.reader = c5471a;
            return c5471a;
        }
        return reader;
    }

    public void close() {
        Util.m23404m(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC10187e source();

    public final String string() throws IOException {
        InterfaceC10187e source = source();
        try {
            String mo8768B0 = source.mo8768B0(Util.m23434I(source, charset()));
            C5640a.m23456a(source, null);
            return mo8768B0;
        } finally {
        }
    }
}
