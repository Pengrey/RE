package okhttp3.internal.http2;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C7705b;
import nf.Settings;
import okhttp3.internal.http2.Hpack;
import p181jd.Intrinsics;
import p297pd.C8608d;
import p297pd.C8611f;
import p297pd._Ranges;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10191h0;
import p356sf.Timeout;

/* renamed from: okhttp3.internal.http2.d */
/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: A */
    public static final C8134a f21130A = new C8134a(null);

    /* renamed from: B */
    private static final Logger f21131B;

    /* renamed from: w */
    private final InterfaceC10187e f21132w;

    /* renamed from: x */
    private final boolean f21133x;

    /* renamed from: y */
    private final C8135b f21134y;

    /* renamed from: z */
    private final Hpack.C8114a f21135z;

    /* compiled from: Http2Reader.kt */
    /* renamed from: okhttp3.internal.http2.d$a */
    /* loaded from: classes2.dex */
    public static final class C8134a {
        private C8134a() {
        }

        public /* synthetic */ C8134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m16627a() {
            return Http2Reader.m16634a();
        }

        /* renamed from: b */
        public final int m16626b(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* compiled from: Http2Reader.kt */
    /* renamed from: okhttp3.internal.http2.d$b */
    /* loaded from: classes2.dex */
    public static final class C8135b implements InterfaceC10191h0 {

        /* renamed from: A */
        private int f21136A;

        /* renamed from: B */
        private int f21137B;

        /* renamed from: w */
        private final InterfaceC10187e f21138w;

        /* renamed from: x */
        private int f21139x;

        /* renamed from: y */
        private int f21140y;

        /* renamed from: z */
        private int f21141z;

        public C8135b(InterfaceC10187e interfaceC10187e) {
            Intrinsics.isThisObjectNull(interfaceC10187e, "source");
            this.f21138w = interfaceC10187e;
        }

        /* renamed from: c */
        private final void m16624c() throws IOException {
            int i = this.f21141z;
            int m23433J = Util.m23433J(this.f21138w);
            this.f21136A = m23433J;
            this.f21139x = m23433J;
            int m23413d = Util.m23413d(this.f21138w.readByte(), 255);
            this.f21140y = Util.m23413d(this.f21138w.readByte(), 255);
            C8134a c8134a = Http2Reader.f21130A;
            if (c8134a.m16627a().isLoggable(Level.FINE)) {
                c8134a.m16627a().fine(C7705b.f20317a.m17662c(true, this.f21141z, this.f21139x, m23413d, this.f21140y));
            }
            int readInt = this.f21138w.readInt() & Reader.READ_DONE;
            this.f21141z = readInt;
            if (m23413d == 9) {
                if (readInt != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(m23413d + " != TYPE_CONTINUATION");
        }

        /* renamed from: a */
        public final int m16625a() {
            return this.f21136A;
        }

        public void close() throws IOException {
        }

        /* renamed from: e */
        public final void m16623e(int i) {
            this.f21140y = i;
        }

        /* renamed from: h */
        public final void m16622h(int i) {
            this.f21136A = i;
        }

        public long read(Buffer buffer, long j) throws IOException {
            Intrinsics.isThisObjectNull(buffer, "sink");
            while (true) {
                int i = this.f21136A;
                if (i == 0) {
                    this.f21138w.skip(this.f21137B);
                    this.f21137B = 0;
                    if ((this.f21140y & 4) != 0) {
                        return -1L;
                    }
                    m16624c();
                } else {
                    long read = this.f21138w.read(buffer, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f21136A -= (int) read;
                    return read;
                }
            }
        }

        /* renamed from: t */
        public final void m16621t(int i) {
            this.f21139x = i;
        }

        /* renamed from: timeout */
        public Timeout mo40537timeout() {
            return this.f21138w.mo40537timeout();
        }

        /* renamed from: v */
        public final void m16620v(int i) {
            this.f21137B = i;
        }

        /* renamed from: y */
        public final void m16619y(int i) {
            this.f21141z = i;
        }
    }

    /* compiled from: Http2Reader.kt */
    /* renamed from: okhttp3.internal.http2.d$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC8136c {
        /* renamed from: a */
        void m16618a();

        /* renamed from: b */
        void m16617b(boolean z, int i, int i2);

        /* renamed from: c */
        void m16616c(int i, int i2, int i3, boolean z);

        /* renamed from: d */
        void m16615d(int i, EnumC8112a enumC8112a);

        /* renamed from: e */
        void m16614e(int i, EnumC8112a enumC8112a, ByteString byteString);

        /* renamed from: f */
        void m16613f(boolean z, int i, int i2, List list);

        /* renamed from: g */
        void m16612g(boolean z, int i, InterfaceC10187e interfaceC10187e, int i2) throws IOException;

        /* renamed from: h */
        void m16611h(boolean z, Settings settings);

        /* renamed from: i */
        void m16610i(int i, long j);

        /* renamed from: j */
        void m16609j(int i, int i2, List list) throws IOException;
    }

    static {
        Logger logger = Logger.getLogger(C7705b.class.getName());
        Intrinsics.checkIfNull(logger, "getLogger(Http2::class.java.name)");
        f21131B = logger;
    }

    public Http2Reader(InterfaceC10187e interfaceC10187e, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        this.f21132w = interfaceC10187e;
        this.f21133x = z;
        C8135b c8135b = new C8135b(interfaceC10187e);
        this.f21134y = c8135b;
        this.f21135z = new Hpack.C8114a(c8135b, 4096, 0, 4, null);
    }

    /* renamed from: E */
    private final void m16641E(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(Intrinsics.addStrAndObj("TYPE_PING length != 8: ", Integer.valueOf(i)));
        }
        if (i3 == 0) {
            interfaceC8136c.m16617b((i2 & 1) != 0, this.f21132w.readInt(), this.f21132w.readInt());
            return;
        }
        throw new IOException("TYPE_PING streamId != 0");
    }

    /* renamed from: F */
    private final void m16640F(InterfaceC8136c interfaceC8136c, int i) throws IOException {
        int readInt = this.f21132w.readInt();
        interfaceC8136c.m16616c(i, readInt & Reader.READ_DONE, Util.m23413d(this.f21132w.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: H */
    private final void m16639H(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 != 0) {
                m16640F(interfaceC8136c, i3);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
    }

    /* renamed from: L */
    private final void m16638L(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            int m23413d = (i2 & 8) != 0 ? Util.m23413d(this.f21132w.readByte(), 255) : 0;
            interfaceC8136c.m16609j(i3, this.f21132w.readInt() & Reader.READ_DONE, m16629v(f21130A.m16626b(i - 4, i2, m23413d), m23413d, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: M */
    private final void m16637M(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f21132w.readInt();
            EnumC8112a m16774a = EnumC8112a.Companion.m16774a(readInt);
            if (m16774a != null) {
                interfaceC8136c.m16615d(i3, m16774a);
                return;
            }
            throw new IOException(Intrinsics.addStrAndObj("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: P */
    private final void m16636P(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        C8611f m14992q;
        C8608d m14993p;
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i == 0) {
                interfaceC8136c.m16618a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            m14992q = _Ranges.m14992q(0, i);
            m14993p = _Ranges.m14993p(m14992q, 6);
            int m15034f = m14993p.m15034f();
            int m15033h = m14993p.m15033h();
            int m15032l = m14993p.m15032l();
            if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
                while (true) {
                    int i4 = m15034f + m15032l;
                    int m23412e = Util.m23412e(this.f21132w.readShort(), 65535);
                    readInt = this.f21132w.readInt();
                    if (m23412e != 2) {
                        if (m23412e == 3) {
                            m23412e = 4;
                        } else if (m23412e == 4) {
                            m23412e = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (m23412e == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    settings.m17642h(m23412e, readInt);
                    if (m15034f == m15033h) {
                        break;
                    }
                    m15034f = i4;
                }
                throw new IOException(Intrinsics.addStrAndObj("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
            }
            interfaceC8136c.m16611h(false, settings);
        } else {
            throw new IOException(Intrinsics.addStrAndObj("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
    }

    /* renamed from: R */
    private final void m16635R(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i == 4) {
            long m23411f = Util.m23411f(this.f21132w.readInt(), 2147483647L);
            if (m23411f != 0) {
                interfaceC8136c.m16610i(i3, m23411f);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(Intrinsics.addStrAndObj("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static final /* synthetic */ Logger m16634a() {
        return f21131B;
    }

    /* renamed from: h */
    private final void m16631h(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if (!((i2 & 32) != 0)) {
            int m23413d = (i2 & 8) != 0 ? Util.m23413d(this.f21132w.readByte(), 255) : 0;
            interfaceC8136c.m16612g(z, i3, this.f21132w, f21130A.m16626b(i, i2, m23413d));
            this.f21132w.skip(m23413d);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }

    /* renamed from: t */
    private final void m16630t(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException(Intrinsics.addStrAndObj("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        }
        if (i3 == 0) {
            int readInt = this.f21132w.readInt();
            int readInt2 = this.f21132w.readInt();
            int i4 = i - 8;
            EnumC8112a m16774a = EnumC8112a.Companion.m16774a(readInt2);
            if (m16774a != null) {
                ByteString byteString = ByteString.f26547A;
                if (i4 > 0) {
                    byteString = this.f21132w.mo8748u(i4);
                }
                interfaceC8136c.m16614e(readInt, m16774a, byteString);
                return;
            }
            throw new IOException(Intrinsics.addStrAndObj("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        }
        throw new IOException("TYPE_GOAWAY streamId != 0");
    }

    /* renamed from: v */
    private final List m16629v(int i, int i2, int i3, int i4) throws IOException {
        this.f21134y.m16622h(i);
        C8135b c8135b = this.f21134y;
        c8135b.m16621t(c8135b.m16625a());
        this.f21134y.m16620v(i2);
        this.f21134y.m16623e(i3);
        this.f21134y.m16619y(i4);
        this.f21135z.m16759k();
        return this.f21135z.m16765e();
    }

    /* renamed from: y */
    private final void m16628y(InterfaceC8136c interfaceC8136c, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            boolean z = (i2 & 1) != 0;
            int m23413d = (i2 & 8) != 0 ? Util.m23413d(this.f21132w.readByte(), 255) : 0;
            if ((i2 & 32) != 0) {
                m16640F(interfaceC8136c, i3);
                i -= 5;
            }
            interfaceC8136c.m16613f(z, i3, -1, m16629v(f21130A.m16626b(i, i2, m23413d), m23413d, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: c */
    public final boolean m16633c(boolean z, InterfaceC8136c interfaceC8136c) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC8136c, "handler");
        try {
            this.f21132w.mo8750r0(9L);
            int m23433J = Util.m23433J(this.f21132w);
            if (m23433J <= 16384) {
                int m23413d = Util.m23413d(this.f21132w.readByte(), 255);
                int m23413d2 = Util.m23413d(this.f21132w.readByte(), 255);
                int readInt = this.f21132w.readInt() & Reader.READ_DONE;
                Logger logger = f21131B;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C7705b.f20317a.m17662c(true, readInt, m23433J, m23413d, m23413d2));
                }
                if (z && m23413d != 4) {
                    throw new IOException(Intrinsics.addStrAndObj("Expected a SETTINGS frame but was ", C7705b.f20317a.m17663b(m23413d)));
                }
                switch (m23413d) {
                    case 0:
                        m16631h(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 1:
                        m16628y(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 2:
                        m16639H(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 3:
                        m16637M(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 4:
                        m16636P(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 5:
                        m16638L(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 6:
                        m16641E(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 7:
                        m16630t(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    case 8:
                        m16635R(interfaceC8136c, m23433J, m23413d2, readInt);
                        return true;
                    default:
                        this.f21132w.skip(m23433J);
                        return true;
                }
            }
            throw new IOException(Intrinsics.addStrAndObj("FRAME_SIZE_ERROR: ", Integer.valueOf(m23433J)));
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() throws IOException {
        this.f21132w.close();
    }

    /* renamed from: e */
    public final void m16632e(InterfaceC8136c interfaceC8136c) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC8136c, "handler");
        if (this.f21133x) {
            if (!m16633c(true, interfaceC8136c)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC10187e interfaceC10187e = this.f21132w;
        ByteString byteString = C7705b.f20318b;
        ByteString mo8748u = interfaceC10187e.mo8748u(byteString.size());
        Logger logger = f21131B;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.m23397t(Intrinsics.addStrAndObj("<< CONNECTION ", mo8748u.m8709m()), new Object[0]));
        }
        if (!Intrinsics.equals(byteString, mo8748u)) {
            throw new IOException(Intrinsics.addStrAndObj("Expected a connection header but was ", mo8748u.m8722F()));
        }
    }
}
