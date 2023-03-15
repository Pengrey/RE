package okhttp3.internal.http2;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C7705b;
import nf.Settings;
import okhttp3.internal.http2.Hpack;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.InterfaceC10186d;

/* renamed from: okhttp3.internal.http2.f */
/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: C */
    private static final Logger f21168C;

    /* renamed from: A */
    private boolean f21169A;

    /* renamed from: B */
    private final Hpack.C8115b f21170B;

    /* renamed from: w */
    private final InterfaceC10186d f21171w;

    /* renamed from: x */
    private final boolean f21172x;

    /* renamed from: y */
    private final Buffer f21173y;

    /* renamed from: z */
    private int f21174z;

    /* compiled from: Http2Writer.kt */
    /* renamed from: okhttp3.internal.http2.f$a */
    /* loaded from: classes2.dex */
    public static final class C8141a {
        private C8141a() {
        }

        public /* synthetic */ C8141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8141a(null);
        f21168C = Logger.getLogger(C7705b.class.getName());
    }

    public Http2Writer(InterfaceC10186d interfaceC10186d, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        this.f21171w = interfaceC10186d;
        this.f21172x = z;
        Buffer buffer = new Buffer();
        this.f21173y = buffer;
        this.f21174z = 16384;
        this.f21170B = new Hpack.C8115b(0, false, buffer, 3, null);
    }

    /* renamed from: R */
    private final void m16553R(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min(this.f21174z, j);
            j -= min;
            m16548t(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f21171w.mo8688B(this.f21173y, min);
        }
    }

    /* renamed from: E */
    public final int m16559E() {
        return this.f21174z;
    }

    /* renamed from: F */
    public final synchronized void m16558F(boolean z, int i, int i2) throws IOException {
        if (!this.f21169A) {
            m16548t(0, 8, 6, z ? 1 : 0);
            this.f21171w.mo8781D(i);
            this.f21171w.mo8781D(i2);
            this.f21171w.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: H */
    public final synchronized void m16557H(int i, int i2, List list) throws IOException {
        Intrinsics.isThisObjectNull(list, "requestHeaders");
        if (!this.f21169A) {
            this.f21170B.m16746g(list);
            long size = this.f21173y.size();
            int min = (int) Math.min(this.f21174z - 4, size);
            int i3 = min + 4;
            long j = min;
            int i4 = (size > j ? 1 : (size == j ? 0 : -1));
            m16548t(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f21171w.mo8781D(i2 & Reader.READ_DONE);
            this.f21171w.mo8688B(this.f21173y, j);
            if (i4 > 0) {
                m16553R(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: L */
    public final synchronized void m16556L(int i, EnumC8112a enumC8112a) throws IOException {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        if (!this.f21169A) {
            if (enumC8112a.getHttpCode() != -1) {
                m16548t(i, 4, 3, 0);
                this.f21171w.mo8781D(enumC8112a.getHttpCode());
                this.f21171w.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: M */
    public final synchronized void m16555M(Settings settings) throws IOException {
        Intrinsics.isThisObjectNull(settings, "settings");
        if (!this.f21169A) {
            int i = 0;
            m16548t(0, settings.m17641i() * 6, 4, 0);
            while (i < 10) {
                int i2 = i + 1;
                if (settings.m17644f(i)) {
                    this.f21171w.mo8772x(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f21171w.mo8781D(settings.m17649a(i));
                }
                i = i2;
            }
            this.f21171w.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: P */
    public final synchronized void m16554P(int i, long j) throws IOException {
        if (this.f21169A) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            m16548t(i, 4, 8, 0);
            this.f21171w.mo8781D((int) j);
            this.f21171w.flush();
        } else {
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
    }

    /* renamed from: a */
    public final synchronized void m16552a(Settings settings) throws IOException {
        Intrinsics.isThisObjectNull(settings, "peerSettings");
        if (!this.f21169A) {
            this.f21174z = settings.m17645e(this.f21174z);
            if (settings.m17648b() != -1) {
                this.f21170B.m16748e(settings.m17648b());
            }
            m16548t(0, 0, 4, 1);
            this.f21171w.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public final synchronized void m16551c() throws IOException {
        if (!this.f21169A) {
            if (this.f21172x) {
                Logger logger = f21168C;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.m23397t(Intrinsics.addStrAndObj(">> CONNECTION ", C7705b.f20318b.m8709m()), new Object[0]));
                }
                this.f21171w.mo8782C(C7705b.f20318b);
                this.f21171w.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void close() throws IOException {
        this.f21169A = true;
        this.f21171w.close();
    }

    /* renamed from: e */
    public final synchronized void m16550e(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.f21169A) {
            m16549h(i, z ? 1 : 0, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f21169A) {
            this.f21171w.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final void m16549h(int i, int i2, Buffer buffer, int i3) throws IOException {
        m16548t(i, i3, 0, i2);
        if (i3 > 0) {
            InterfaceC10186d interfaceC10186d = this.f21171w;
            Intrinsics.ifNullDoSomething(buffer);
            interfaceC10186d.mo8688B(buffer, i3);
        }
    }

    /* renamed from: t */
    public final void m16548t(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f21168C;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C7705b.f20317a.m17662c(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.f21174z)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f21174z + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            Util.m23417Z(this.f21171w, i2);
            this.f21171w.mo8780S(i3 & 255);
            this.f21171w.mo8780S(i4 & 255);
            this.f21171w.mo8781D(i & Reader.READ_DONE);
            return;
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("reserved bit set: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: v */
    public final synchronized void m16547v(int i, EnumC8112a enumC8112a, byte[] bArr) throws IOException {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        Intrinsics.isThisObjectNull(bArr, "debugData");
        if (!this.f21169A) {
            if (enumC8112a.getHttpCode() != -1) {
                m16548t(0, bArr.length + 8, 7, 0);
                this.f21171w.mo8781D(i);
                this.f21171w.mo8781D(enumC8112a.getHttpCode());
                if (!(bArr.length == 0)) {
                    this.f21171w.mo8779Z(bArr);
                }
                this.f21171w.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: y */
    public final synchronized void m16546y(boolean z, int i, List list) throws IOException {
        Intrinsics.isThisObjectNull(list, "headerBlock");
        if (!this.f21169A) {
            this.f21170B.m16746g(list);
            long size = this.f21173y.size();
            long min = Math.min(this.f21174z, size);
            int i2 = (size > min ? 1 : (size == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            m16548t(i, (int) min, 1, i3);
            this.f21171w.mo8688B(this.f21173y, min);
            if (i2 > 0) {
                m16553R(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
