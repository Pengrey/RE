package p107ff;

import gd.C5640a;
import gf.Util;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.MediaType;
import p181jd.Intrinsics;
import p356sf.ByteString;
import p356sf.C10200t;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10191h0;
import sd.C10150d;

/* renamed from: ff.c0 */
/* loaded from: classes2.dex */
public abstract class RequestBody {
    public static final C5462a Companion = new C5462a(null);

    /* compiled from: RequestBody.kt */
    /* renamed from: ff.c0$a */
    /* loaded from: classes2.dex */
    public static final class C5462a {

        /* compiled from: RequestBody.kt */
        /* renamed from: ff.c0$a$a */
        /* loaded from: classes2.dex */
        public static final class C5463a extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ MediaType f15386a;

            /* renamed from: b */
            final /* synthetic */ File f15387b;

            C5463a(MediaType mediaType, File file) {
                this.f15386a = mediaType;
                this.f15387b = file;
            }

            public long contentLength() {
                return this.f15387b.length();
            }

            public MediaType contentType() {
                return this.f15386a;
            }

            public void writeTo(InterfaceC10186d interfaceC10186d) {
                Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
                InterfaceC10191h0 m8559i = C10200t.m8559i(this.f15387b);
                try {
                    interfaceC10186d.mo8783A(m8559i);
                    C5640a.m23456a(m8559i, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        /* renamed from: ff.c0$a$b */
        /* loaded from: classes2.dex */
        public static final class C5464b extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ MediaType f15388a;

            /* renamed from: b */
            final /* synthetic */ ByteString f15389b;

            C5464b(MediaType mediaType, ByteString byteString) {
                this.f15388a = mediaType;
                this.f15389b = byteString;
            }

            public long contentLength() {
                return this.f15389b.size();
            }

            public MediaType contentType() {
                return this.f15388a;
            }

            public void writeTo(InterfaceC10186d interfaceC10186d) {
                Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
                interfaceC10186d.mo8782C(this.f15389b);
            }
        }

        /* compiled from: RequestBody.kt */
        /* renamed from: ff.c0$a$c */
        /* loaded from: classes2.dex */
        public static final class C5465c extends RequestBody {

            /* renamed from: a */
            final /* synthetic */ MediaType f15390a;

            /* renamed from: b */
            final /* synthetic */ int f15391b;

            /* renamed from: c */
            final /* synthetic */ byte[] f15392c;

            /* renamed from: d */
            final /* synthetic */ int f15393d;

            C5465c(MediaType mediaType, int i, byte[] bArr, int i2) {
                this.f15390a = mediaType;
                this.f15391b = i;
                this.f15392c = bArr;
                this.f15393d = i2;
            }

            public long contentLength() {
                return this.f15391b;
            }

            public MediaType contentType() {
                return this.f15390a;
            }

            public void writeTo(InterfaceC10186d interfaceC10186d) {
                Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
                interfaceC10186d.mo8777g(this.f15392c, this.f15393d, this.f15391b);
            }
        }

        private C5462a() {
        }

        public /* synthetic */ C5462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: n */
        public static /* synthetic */ RequestBody m24235n(C5462a c5462a, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return c5462a.m24243f(mediaType, bArr, i, i2);
        }

        /* renamed from: o */
        public static /* synthetic */ RequestBody m24234o(C5462a c5462a, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return c5462a.m24236m(bArr, mediaType, i, i2);
        }

        /* renamed from: a */
        public final RequestBody m24248a(MediaType mediaType, File file) {
            Intrinsics.isThisObjectNull(file, "file");
            return m24242g(file, mediaType);
        }

        /* renamed from: b */
        public final RequestBody m24247b(MediaType mediaType, String str) {
            Intrinsics.isThisObjectNull(str, "content");
            return m24241h(str, mediaType);
        }

        /* renamed from: c */
        public final RequestBody m24246c(MediaType mediaType, ByteString byteString) {
            Intrinsics.isThisObjectNull(byteString, "content");
            return m24240i(byteString, mediaType);
        }

        /* renamed from: d */
        public final RequestBody m24245d(MediaType mediaType, byte[] bArr) {
            Intrinsics.isThisObjectNull(bArr, "content");
            return m24235n(this, mediaType, bArr, 0, 0, 12, null);
        }

        /* renamed from: e */
        public final RequestBody m24244e(MediaType mediaType, byte[] bArr, int i) {
            Intrinsics.isThisObjectNull(bArr, "content");
            return m24235n(this, mediaType, bArr, i, 0, 8, null);
        }

        /* renamed from: f */
        public final RequestBody m24243f(MediaType mediaType, byte[] bArr, int i, int i2) {
            Intrinsics.isThisObjectNull(bArr, "content");
            return m24236m(bArr, mediaType, i, i2);
        }

        /* renamed from: g */
        public final RequestBody m24242g(File file, MediaType mediaType) {
            Intrinsics.isThisObjectNull(file, "<this>");
            return new C5463a(mediaType, file);
        }

        /* renamed from: h */
        public final RequestBody m24241h(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkIfNull(bytes, "this as java.lang.String).getBytes(charset)");
            return m24236m(bytes, mediaType, 0, bytes.length);
        }

        /* renamed from: i */
        public final RequestBody m24240i(ByteString byteString, MediaType mediaType) {
            Intrinsics.isThisObjectNull(byteString, "<this>");
            return new C5464b(mediaType, byteString);
        }

        /* renamed from: j */
        public final RequestBody m24239j(byte[] bArr) {
            Intrinsics.isThisObjectNull(bArr, "<this>");
            return m24234o(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: k */
        public final RequestBody m24238k(byte[] bArr, MediaType mediaType) {
            Intrinsics.isThisObjectNull(bArr, "<this>");
            return m24234o(this, bArr, mediaType, 0, 0, 6, null);
        }

        /* renamed from: l */
        public final RequestBody m24237l(byte[] bArr, MediaType mediaType, int i) {
            Intrinsics.isThisObjectNull(bArr, "<this>");
            return m24234o(this, bArr, mediaType, i, 0, 4, null);
        }

        /* renamed from: m */
        public final RequestBody m24236m(byte[] bArr, MediaType mediaType, int i, int i2) {
            Intrinsics.isThisObjectNull(bArr, "<this>");
            Util.m23405l(bArr.length, i, i2);
            return new C5465c(mediaType, i2, bArr, i);
        }
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.m24248a(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.m24247b(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.m24246c(mediaType, byteString);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.m24245d(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.m24244e(mediaType, bArr, i);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return Companion.m24243f(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.m24242g(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.m24241h(str, mediaType);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.m24240i(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.m24239j(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.m24238k(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.m24237l(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return Companion.m24236m(bArr, mediaType, i, i2);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC10186d interfaceC10186d) throws IOException;
}
