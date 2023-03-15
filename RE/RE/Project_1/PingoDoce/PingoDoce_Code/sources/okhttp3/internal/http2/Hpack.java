package okhttp3.internal.http2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.Header;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.C10200t;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10191h0;
import p489zc._ArraysJvm;
import p489zc._Collections;

/* renamed from: okhttp3.internal.http2.b */
/* loaded from: classes2.dex */
public final class Hpack {

    /* renamed from: a */
    public static final Hpack f21033a;

    /* renamed from: b */
    private static final Header[] f21034b;

    /* renamed from: c */
    private static final Map f21035c;

    static {
        Hpack hpack = new Hpack();
        f21033a = hpack;
        ByteString byteString = Header.f20310f;
        ByteString byteString2 = Header.f20311g;
        ByteString byteString3 = Header.f20312h;
        ByteString byteString4 = Header.f20309e;
        f21034b = new Header[]{new Header(Header.f20313i, BuildConfig.VERSION_NAME), new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", BuildConfig.VERSION_NAME), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", BuildConfig.VERSION_NAME), new Header("accept-ranges", BuildConfig.VERSION_NAME), new Header("accept", BuildConfig.VERSION_NAME), new Header("access-control-allow-origin", BuildConfig.VERSION_NAME), new Header("age", BuildConfig.VERSION_NAME), new Header("allow", BuildConfig.VERSION_NAME), new Header("authorization", BuildConfig.VERSION_NAME), new Header("cache-control", BuildConfig.VERSION_NAME), new Header("content-disposition", BuildConfig.VERSION_NAME), new Header("content-encoding", BuildConfig.VERSION_NAME), new Header("content-language", BuildConfig.VERSION_NAME), new Header("content-length", BuildConfig.VERSION_NAME), new Header("content-location", BuildConfig.VERSION_NAME), new Header("content-range", BuildConfig.VERSION_NAME), new Header("content-type", BuildConfig.VERSION_NAME), new Header("cookie", BuildConfig.VERSION_NAME), new Header("date", BuildConfig.VERSION_NAME), new Header("etag", BuildConfig.VERSION_NAME), new Header("expect", BuildConfig.VERSION_NAME), new Header("expires", BuildConfig.VERSION_NAME), new Header("from", BuildConfig.VERSION_NAME), new Header("host", BuildConfig.VERSION_NAME), new Header("if-match", BuildConfig.VERSION_NAME), new Header("if-modified-since", BuildConfig.VERSION_NAME), new Header("if-none-match", BuildConfig.VERSION_NAME), new Header("if-range", BuildConfig.VERSION_NAME), new Header("if-unmodified-since", BuildConfig.VERSION_NAME), new Header("last-modified", BuildConfig.VERSION_NAME), new Header("link", BuildConfig.VERSION_NAME), new Header("location", BuildConfig.VERSION_NAME), new Header("max-forwards", BuildConfig.VERSION_NAME), new Header("proxy-authenticate", BuildConfig.VERSION_NAME), new Header("proxy-authorization", BuildConfig.VERSION_NAME), new Header("range", BuildConfig.VERSION_NAME), new Header("referer", BuildConfig.VERSION_NAME), new Header("refresh", BuildConfig.VERSION_NAME), new Header("retry-after", BuildConfig.VERSION_NAME), new Header("server", BuildConfig.VERSION_NAME), new Header("set-cookie", BuildConfig.VERSION_NAME), new Header("strict-transport-security", BuildConfig.VERSION_NAME), new Header("transfer-encoding", BuildConfig.VERSION_NAME), new Header("user-agent", BuildConfig.VERSION_NAME), new Header("vary", BuildConfig.VERSION_NAME), new Header("via", BuildConfig.VERSION_NAME), new Header("www-authenticate", BuildConfig.VERSION_NAME)};
        f21035c = hpack.m16770d();
    }

    private Hpack() {
    }

    /* renamed from: d */
    private final Map m16770d() {
        Header[] headerArr = f21034b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Header[] headerArr2 = f21034b;
            if (!linkedHashMap.containsKey(headerArr2[i].f20314a)) {
                linkedHashMap.put(headerArr2[i].f20314a, Integer.valueOf(i));
            }
            i = i2;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkIfNull(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final ByteString m16773a(ByteString byteString) throws IOException {
        Intrinsics.isThisObjectNull(byteString, "name");
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            byte m8714h = byteString.m8714h(i);
            if (65 <= m8714h && m8714h <= 90) {
                throw new IOException(Intrinsics.addStrAndObj("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.m8722F()));
            }
            i = i2;
        }
        return byteString;
    }

    /* renamed from: b */
    public final Map m16772b() {
        return f21035c;
    }

    /* renamed from: c */
    public final Header[] m16771c() {
        return f21034b;
    }

    /* compiled from: Hpack.kt */
    /* renamed from: okhttp3.internal.http2.b$a */
    /* loaded from: classes2.dex */
    public static final class C8114a {

        /* renamed from: a */
        private final int f21036a;

        /* renamed from: b */
        private int f21037b;

        /* renamed from: c */
        private final List f21038c;

        /* renamed from: d */
        private final InterfaceC10187e f21039d;

        /* renamed from: e */
        public Header[] f21040e;

        /* renamed from: f */
        private int f21041f;

        /* renamed from: g */
        public int f21042g;

        /* renamed from: h */
        public int f21043h;

        public C8114a(InterfaceC10191h0 interfaceC10191h0, int i, int i2) {
            Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
            this.f21036a = i;
            this.f21037b = i2;
            this.f21038c = new ArrayList();
            this.f21039d = C10200t.m8565c(interfaceC10191h0);
            Header[] headerArr = new Header[8];
            this.f21040e = headerArr;
            this.f21041f = headerArr.length - 1;
        }

        /* renamed from: a */
        private final void m16769a() {
            int i = this.f21037b;
            int i2 = this.f21043h;
            if (i < i2) {
                if (i == 0) {
                    m16768b();
                } else {
                    m16766d(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private final void m16768b() {
            _ArraysJvm.m304t(this.f21040e, null, 0, 0, 6, null);
            this.f21041f = this.f21040e.length - 1;
            this.f21042g = 0;
            this.f21043h = 0;
        }

        /* renamed from: c */
        private final int m16767c(int i) {
            return this.f21041f + 1 + i;
        }

        /* renamed from: d */
        private final int m16766d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f21040e.length;
                while (true) {
                    length--;
                    i2 = this.f21041f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.f21040e[length];
                    Intrinsics.ifNullDoSomething(header);
                    int i4 = header.f20316c;
                    i -= i4;
                    this.f21043h -= i4;
                    this.f21042g--;
                    i3++;
                }
                Header[] headerArr = this.f21040e;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f21042g);
                this.f21041f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final ByteString m16764f(int i) throws IOException {
            if (m16762h(i)) {
                return Hpack.f21033a.m16771c()[i].f20314a;
            }
            int m16767c = m16767c(i - Hpack.f21033a.m16771c().length);
            if (m16767c >= 0) {
                Header[] headerArr = this.f21040e;
                if (m16767c < headerArr.length) {
                    Header header = headerArr[m16767c];
                    Intrinsics.ifNullDoSomething(header);
                    return header.f20314a;
                }
            }
            throw new IOException(Intrinsics.addStrAndObj("Header index too large ", Integer.valueOf(i + 1)));
        }

        /* renamed from: g */
        private final void m16763g(int i, Header header) {
            this.f21038c.add(header);
            int i2 = header.f20316c;
            if (i != -1) {
                Header header2 = this.f21040e[m16767c(i)];
                Intrinsics.ifNullDoSomething(header2);
                i2 -= header2.f20316c;
            }
            int i3 = this.f21037b;
            if (i2 > i3) {
                m16768b();
                return;
            }
            int m16766d = m16766d((this.f21043h + i2) - i3);
            if (i == -1) {
                int i4 = this.f21042g + 1;
                Header[] headerArr = this.f21040e;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f21041f = this.f21040e.length - 1;
                    this.f21040e = headerArr2;
                }
                int i5 = this.f21041f;
                this.f21041f = i5 - 1;
                this.f21040e[i5] = header;
                this.f21042g++;
            } else {
                this.f21040e[i + m16767c(i) + m16766d] = header;
            }
            this.f21043h += i2;
        }

        /* renamed from: h */
        private final boolean m16762h(int i) {
            return i >= 0 && i <= Hpack.f21033a.m16771c().length - 1;
        }

        /* renamed from: i */
        private final int m16761i() throws IOException {
            return Util.m23413d(this.f21039d.readByte(), 255);
        }

        /* renamed from: l */
        private final void m16758l(int i) throws IOException {
            if (m16762h(i)) {
                this.f21038c.add(Hpack.f21033a.m16771c()[i]);
                return;
            }
            int m16767c = m16767c(i - Hpack.f21033a.m16771c().length);
            if (m16767c >= 0) {
                Header[] headerArr = this.f21040e;
                if (m16767c < headerArr.length) {
                    List list = this.f21038c;
                    Header header = headerArr[m16767c];
                    Intrinsics.ifNullDoSomething(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(Intrinsics.addStrAndObj("Header index too large ", Integer.valueOf(i + 1)));
        }

        /* renamed from: n */
        private final void m16756n(int i) throws IOException {
            m16763g(-1, new Header(m16764f(i), m16760j()));
        }

        /* renamed from: o */
        private final void m16755o() throws IOException {
            m16763g(-1, new Header(Hpack.f21033a.m16773a(m16760j()), m16760j()));
        }

        /* renamed from: p */
        private final void m16754p(int i) throws IOException {
            this.f21038c.add(new Header(m16764f(i), m16760j()));
        }

        /* renamed from: q */
        private final void m16753q() throws IOException {
            this.f21038c.add(new Header(Hpack.f21033a.m16773a(m16760j()), m16760j()));
        }

        /* renamed from: e */
        public final List m16765e() {
            List m455n0;
            m455n0 = _Collections.m455n0(this.f21038c);
            this.f21038c.clear();
            return m455n0;
        }

        /* renamed from: j */
        public final ByteString m16760j() throws IOException {
            int m16761i = m16761i();
            boolean z = (m16761i & 128) == 128;
            long m16757m = m16757m(m16761i, 127);
            if (z) {
                Buffer buffer = new Buffer();
                Huffman.f21175a.m16544b(this.f21039d, m16757m, buffer);
                return buffer.mo8751r();
            }
            return this.f21039d.mo8748u(m16757m);
        }

        /* renamed from: k */
        public final void m16759k() throws IOException {
            while (!this.f21039d.mo8762Q()) {
                int m23413d = Util.m23413d(this.f21039d.readByte(), 255);
                if (m23413d == 128) {
                    throw new IOException("index == 0");
                }
                if ((m23413d & 128) == 128) {
                    m16758l(m16757m(m23413d, 127) - 1);
                } else if (m23413d == 64) {
                    m16755o();
                } else if ((m23413d & 64) == 64) {
                    m16756n(m16757m(m23413d, 63) - 1);
                } else if ((m23413d & 32) == 32) {
                    int m16757m = m16757m(m23413d, 31);
                    this.f21037b = m16757m;
                    if (m16757m >= 0 && m16757m <= this.f21036a) {
                        m16769a();
                    } else {
                        throw new IOException(Intrinsics.addStrAndObj("Invalid dynamic table size update ", Integer.valueOf(this.f21037b)));
                    }
                } else if (m23413d != 16 && m23413d != 0) {
                    m16754p(m16757m(m23413d, 15) - 1);
                } else {
                    m16753q();
                }
            }
        }

        /* renamed from: m */
        public final int m16757m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int m16761i = m16761i();
                if ((m16761i & 128) == 0) {
                    return i2 + (m16761i << i4);
                }
                i2 += (m16761i & 127) << i4;
                i4 += 7;
            }
        }

        public /* synthetic */ C8114a(InterfaceC10191h0 interfaceC10191h0, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC10191h0, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* compiled from: Hpack.kt */
    /* renamed from: okhttp3.internal.http2.b$b */
    /* loaded from: classes2.dex */
    public static final class C8115b {

        /* renamed from: a */
        public int f21044a;

        /* renamed from: b */
        private final boolean f21045b;

        /* renamed from: c */
        private final Buffer f21046c;

        /* renamed from: d */
        private int f21047d;

        /* renamed from: e */
        private boolean f21048e;

        /* renamed from: f */
        public int f21049f;

        /* renamed from: g */
        public Header[] f21050g;

        /* renamed from: h */
        private int f21051h;

        /* renamed from: i */
        public int f21052i;

        /* renamed from: j */
        public int f21053j;

        public C8115b(int i, boolean z, Buffer buffer) {
            Intrinsics.isThisObjectNull(buffer, "out");
            this.f21044a = i;
            this.f21045b = z;
            this.f21046c = buffer;
            this.f21047d = Reader.READ_DONE;
            this.f21049f = i;
            Header[] headerArr = new Header[8];
            this.f21050g = headerArr;
            this.f21051h = headerArr.length - 1;
        }

        /* renamed from: a */
        private final void m16752a() {
            int i = this.f21049f;
            int i2 = this.f21053j;
            if (i < i2) {
                if (i == 0) {
                    m16751b();
                } else {
                    m16750c(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private final void m16751b() {
            _ArraysJvm.m304t(this.f21050g, null, 0, 0, 6, null);
            this.f21051h = this.f21050g.length - 1;
            this.f21052i = 0;
            this.f21053j = 0;
        }

        /* renamed from: c */
        private final int m16750c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f21050g.length;
                while (true) {
                    length--;
                    i2 = this.f21051h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.f21050g[length];
                    Intrinsics.ifNullDoSomething(header);
                    i -= header.f20316c;
                    int i4 = this.f21053j;
                    Header header2 = this.f21050g[length];
                    Intrinsics.ifNullDoSomething(header2);
                    this.f21053j = i4 - header2.f20316c;
                    this.f21052i--;
                    i3++;
                }
                Header[] headerArr = this.f21050g;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f21052i);
                Header[] headerArr2 = this.f21050g;
                int i5 = this.f21051h;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f21051h += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m16749d(Header header) {
            int i = header.f20316c;
            int i2 = this.f21049f;
            if (i > i2) {
                m16751b();
                return;
            }
            m16750c((this.f21053j + i) - i2);
            int i3 = this.f21052i + 1;
            Header[] headerArr = this.f21050g;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f21051h = this.f21050g.length - 1;
                this.f21050g = headerArr2;
            }
            int i4 = this.f21051h;
            this.f21051h = i4 - 1;
            this.f21050g[i4] = header;
            this.f21052i++;
            this.f21053j += i;
        }

        /* renamed from: e */
        public final void m16748e(int i) {
            this.f21044a = i;
            int min = Math.min(i, 16384);
            int i2 = this.f21049f;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f21047d = Math.min(this.f21047d, min);
            }
            this.f21048e = true;
            this.f21049f = min;
            m16752a();
        }

        /* renamed from: f */
        public final void m16747f(ByteString byteString) throws IOException {
            Intrinsics.isThisObjectNull(byteString, "data");
            if (this.f21045b) {
                Huffman huffman = Huffman.f21175a;
                if (huffman.m16542d(byteString) < byteString.size()) {
                    Buffer buffer = new Buffer();
                    huffman.m16543c(byteString, buffer);
                    ByteString mo8751r = buffer.mo8751r();
                    m16745h(mo8751r.size(), 127, 128);
                    this.f21046c.m8794q0(mo8751r);
                    return;
                }
            }
            m16745h(byteString.size(), 127, 0);
            this.f21046c.m8794q0(byteString);
        }

        /* renamed from: g */
        public final void m16746g(List list) throws IOException {
            int i;
            int i2;
            Intrinsics.isThisObjectNull(list, "headerBlock");
            if (this.f21048e) {
                int i3 = this.f21047d;
                if (i3 < this.f21049f) {
                    m16745h(i3, 31, 32);
                }
                this.f21048e = false;
                this.f21047d = Reader.READ_DONE;
                m16745h(this.f21049f, 31, 32);
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Header header = (Header) list.get(i4);
                ByteString m8723E = header.f20314a.m8723E();
                ByteString byteString = header.f20315b;
                Hpack hpack = Hpack.f21033a;
                Integer num = (Integer) hpack.m16772b().get(m8723E);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (Intrinsics.equals(hpack.m16771c()[i2 - 1].f20315b, byteString)) {
                            i = i2;
                        } else if (Intrinsics.equals(hpack.m16771c()[i2].f20315b, byteString)) {
                            i2++;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i6 = this.f21051h + 1;
                    int length = this.f21050g.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        int i7 = i6 + 1;
                        Header header2 = this.f21050g[i6];
                        Intrinsics.ifNullDoSomething(header2);
                        if (Intrinsics.equals(header2.f20314a, m8723E)) {
                            Header header3 = this.f21050g[i6];
                            Intrinsics.ifNullDoSomething(header3);
                            if (Intrinsics.equals(header3.f20315b, byteString)) {
                                i2 = Hpack.f21033a.m16771c().length + (i6 - this.f21051h);
                                break;
                            } else if (i == -1) {
                                i = Hpack.f21033a.m16771c().length + (i6 - this.f21051h);
                            }
                        }
                        i6 = i7;
                    }
                }
                if (i2 != -1) {
                    m16745h(i2, 127, 128);
                } else if (i == -1) {
                    this.f21046c.m8791x0(64);
                    m16747f(m8723E);
                    m16747f(byteString);
                    m16749d(header);
                } else if (m8723E.m8726B(Header.f20308d) && !Intrinsics.equals(Header.f20313i, m8723E)) {
                    m16745h(i, 15, 0);
                    m16747f(byteString);
                } else {
                    m16745h(i, 63, 64);
                    m16747f(byteString);
                    m16749d(header);
                }
                i4 = i5;
            }
        }

        /* renamed from: h */
        public final void m16745h(int i, int i2, int i3) {
            if (i < i2) {
                this.f21046c.m8791x0(i | i3);
                return;
            }
            this.f21046c.m8791x0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f21046c.m8791x0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f21046c.m8791x0(i4);
        }

        public /* synthetic */ C8115b(int i, boolean z, Buffer buffer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }
    }
}
