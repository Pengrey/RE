package okhttp3.internal.http2;

import gf.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Headers;
import p181jd.Intrinsics;
import p356sf.AsyncTimeout;
import p356sf.Buffer;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;
import p356sf.Timeout;
import p468yc.C13195u;

/* renamed from: okhttp3.internal.http2.e */
/* loaded from: classes2.dex */
public final class Http2Stream {

    /* renamed from: a */
    private final int f21142a;

    /* renamed from: b */
    private final Http2Connection f21143b;

    /* renamed from: c */
    private long f21144c;

    /* renamed from: d */
    private long f21145d;

    /* renamed from: e */
    private long f21146e;

    /* renamed from: f */
    private long f21147f;

    /* renamed from: g */
    private final ArrayDeque f21148g;

    /* renamed from: h */
    private boolean f21149h;

    /* renamed from: i */
    private final C8139c f21150i;

    /* renamed from: j */
    private final C8138b f21151j;

    /* renamed from: k */
    private final C8140d f21152k;

    /* renamed from: l */
    private final C8140d f21153l;

    /* renamed from: m */
    private EnumC8112a f21154m;

    /* renamed from: n */
    private IOException f21155n;

    /* compiled from: Http2Stream.kt */
    /* renamed from: okhttp3.internal.http2.e$a */
    /* loaded from: classes2.dex */
    public static final class C8137a {
        private C8137a() {
        }

        public /* synthetic */ C8137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    /* renamed from: okhttp3.internal.http2.e$b */
    /* loaded from: classes2.dex */
    public final class C8138b implements InterfaceC10189f0 {

        /* renamed from: A */
        final /* synthetic */ Http2Stream f21156A;

        /* renamed from: w */
        private boolean f21157w;

        /* renamed from: x */
        private final Buffer f21158x;

        /* renamed from: y */
        private Headers f21159y;

        /* renamed from: z */
        private boolean f21160z;

        public C8138b(Http2Stream http2Stream, boolean z) {
            Intrinsics.isThisObjectNull(http2Stream, "this$0");
            this.f21156A = http2Stream;
            this.f21157w = z;
            this.f21158x = new Buffer();
        }

        /* renamed from: a */
        private final void m16575a(boolean z) throws IOException {
            long min;
            boolean z2;
            Http2Stream http2Stream = this.f21156A;
            synchronized (http2Stream) {
                http2Stream.m16583s().m8842t();
                while (http2Stream.m16584r() >= http2Stream.m16585q() && !m16573e() && !m16574c() && http2Stream.m16594h() == null) {
                    http2Stream.m16603F();
                }
                http2Stream.m16583s().m16562A();
                http2Stream.m16599c();
                min = Math.min(http2Stream.m16585q() - http2Stream.m16584r(), this.f21158x.size());
                http2Stream.m16605D(http2Stream.m16584r() + min);
                z2 = z && min == this.f21158x.size();
                C13195u c13195u = C13195u.f34156a;
            }
            this.f21156A.m16583s().m8842t();
            try {
                this.f21156A.m16595g().m16713Y0(this.f21156A.m16592j(), z2, this.f21158x, min);
            } finally {
                this.f21156A.m16583s().m16562A();
            }
        }

        /* renamed from: B */
        public void mo8688B(Buffer buffer, long j) throws IOException {
            Intrinsics.isThisObjectNull(buffer, "source");
            Http2Stream http2Stream = this.f21156A;
            if (Util.f15905g && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            this.f21158x.mo8688B(buffer, j);
            while (this.f21158x.size() >= 16384) {
                m16575a(false);
            }
        }

        /* renamed from: c */
        public final boolean m16574c() {
            return this.f21160z;
        }

        public void close() throws IOException {
            Http2Stream http2Stream = this.f21156A;
            if (Util.f15905g && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.f21156A;
            synchronized (http2Stream2) {
                if (m16574c()) {
                    return;
                }
                boolean z = http2Stream2.m16594h() == null;
                C13195u c13195u = C13195u.f34156a;
                if (!this.f21156A.m16587o().f21157w) {
                    boolean z2 = this.f21158x.size() > 0;
                    if (this.f21159y != null) {
                        while (this.f21158x.size() > 0) {
                            m16575a(false);
                        }
                        Http2Connection m16595g = this.f21156A.m16595g();
                        int m16592j = this.f21156A.m16592j();
                        Headers headers = this.f21159y;
                        Intrinsics.ifNullDoSomething(headers);
                        m16595g.m16712Z0(m16592j, z, Util.m23428O(headers));
                    } else if (z2) {
                        while (this.f21158x.size() > 0) {
                            m16575a(true);
                        }
                    } else if (z) {
                        this.f21156A.m16595g().m16713Y0(this.f21156A.m16592j(), true, null, 0L);
                    }
                }
                synchronized (this.f21156A) {
                    m16572h(true);
                    C13195u c13195u2 = C13195u.f34156a;
                }
                this.f21156A.m16595g().flush();
                this.f21156A.m16600b();
            }
        }

        /* renamed from: e */
        public final boolean m16573e() {
            return this.f21157w;
        }

        public void flush() throws IOException {
            Http2Stream http2Stream = this.f21156A;
            if (Util.f15905g && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.f21156A;
            synchronized (http2Stream2) {
                http2Stream2.m16599c();
                C13195u c13195u = C13195u.f34156a;
            }
            while (this.f21158x.size() > 0) {
                m16575a(false);
                this.f21156A.m16595g().flush();
            }
        }

        /* renamed from: h */
        public final void m16572h(boolean z) {
            this.f21160z = z;
        }

        /* renamed from: timeout */
        public Timeout mo40536timeout() {
            return this.f21156A.m16583s();
        }
    }

    /* compiled from: Http2Stream.kt */
    /* renamed from: okhttp3.internal.http2.e$c */
    /* loaded from: classes2.dex */
    public final class C8139c implements InterfaceC10191h0 {

        /* renamed from: A */
        private boolean f21161A;

        /* renamed from: B */
        final /* synthetic */ Http2Stream f21162B;

        /* renamed from: w */
        private final long f21163w;

        /* renamed from: x */
        private boolean f21164x;

        /* renamed from: y */
        private final Buffer f21165y;

        /* renamed from: z */
        private final Buffer f21166z;

        public C8139c(Http2Stream http2Stream, long j, boolean z) {
            Intrinsics.isThisObjectNull(http2Stream, "this$0");
            this.f21162B = http2Stream;
            this.f21163w = j;
            this.f21164x = z;
            this.f21165y = new Buffer();
            this.f21166z = new Buffer();
        }

        /* renamed from: F */
        private final void m16570F(long j) {
            Http2Stream http2Stream = this.f21162B;
            if (Util.f15905g && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            this.f21162B.m16595g().m16714X0(j);
        }

        /* renamed from: E */
        public final void m16571E(Headers headers) {
        }

        /* renamed from: a */
        public final boolean m16569a() {
            return this.f21161A;
        }

        /* renamed from: c */
        public final boolean m16568c() {
            return this.f21164x;
        }

        public void close() throws IOException {
            long size;
            Http2Stream http2Stream = this.f21162B;
            synchronized (http2Stream) {
                m16564v(true);
                size = m16567e().size();
                m16567e().m8805a();
                http2Stream.notifyAll();
                C13195u c13195u = C13195u.f34156a;
            }
            if (size > 0) {
                m16570F(size);
            }
            this.f21162B.m16600b();
        }

        /* renamed from: e */
        public final Buffer m16567e() {
            return this.f21166z;
        }

        /* renamed from: h */
        public final Buffer m16566h() {
            return this.f21165y;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
            throw new java.io.IOException("stream closed");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(p356sf.Buffer r18, long r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r4 = "sink"
                p181jd.Intrinsics.isThisObjectNull(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L13
                r6 = 1
                goto L14
            L13:
                r6 = 0
            L14:
                if (r6 == 0) goto Ldb
            L16:
                r6 = 0
                okhttp3.internal.http2.e r9 = r1.f21162B
                monitor-enter(r9)
                okhttp3.internal.http2.e$d r10 = r9.m16589m()     // Catch: java.lang.Throwable -> Ld8
                r10.m8842t()     // Catch: java.lang.Throwable -> Ld8
                okhttp3.internal.http2.a r10 = r9.m16594h()     // Catch: java.lang.Throwable -> Lcf
                if (r10 == 0) goto L39
                java.io.IOException r6 = r9.m16593i()     // Catch: java.lang.Throwable -> Lcf
                if (r6 != 0) goto L39
                okhttp3.internal.http2.StreamResetException r6 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lcf
                okhttp3.internal.http2.a r10 = r9.m16594h()     // Catch: java.lang.Throwable -> Lcf
                p181jd.Intrinsics.ifNullDoSomething(r10)     // Catch: java.lang.Throwable -> Lcf
                r6.<init>(r10)     // Catch: java.lang.Throwable -> Lcf
            L39:
                boolean r10 = r17.m16569a()     // Catch: java.lang.Throwable -> Lcf
                if (r10 != 0) goto Lc7
                sf.c r10 = r17.m16567e()     // Catch: java.lang.Throwable -> Lcf
                long r10 = r10.size()     // Catch: java.lang.Throwable -> Lcf
                int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                r11 = -1
                if (r10 <= 0) goto L9b
                sf.c r10 = r17.m16567e()     // Catch: java.lang.Throwable -> Lcf
                sf.c r13 = r17.m16567e()     // Catch: java.lang.Throwable -> Lcf
                long r13 = r13.size()     // Catch: java.lang.Throwable -> Lcf
                long r13 = java.lang.Math.min(r2, r13)     // Catch: java.lang.Throwable -> Lcf
                long r13 = r10.read(r0, r13)     // Catch: java.lang.Throwable -> Lcf
                long r15 = r9.m16590l()     // Catch: java.lang.Throwable -> Lcf
                long r4 = r15 + r13
                r9.m16606C(r4)     // Catch: java.lang.Throwable -> Lcf
                long r4 = r9.m16590l()     // Catch: java.lang.Throwable -> Lcf
                long r15 = r9.m16591k()     // Catch: java.lang.Throwable -> Lcf
                long r4 = r4 - r15
                if (r6 != 0) goto Laa
                okhttp3.internal.http2.c r10 = r9.m16595g()     // Catch: java.lang.Throwable -> Lcf
                nf.d r10 = r10.m16693t0()     // Catch: java.lang.Throwable -> Lcf
                int r10 = r10.m17647c()     // Catch: java.lang.Throwable -> Lcf
                int r10 = r10 / 2
                long r7 = (long) r10     // Catch: java.lang.Throwable -> Lcf
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 < 0) goto Laa
                okhttp3.internal.http2.c r7 = r9.m16595g()     // Catch: java.lang.Throwable -> Lcf
                int r8 = r9.m16592j()     // Catch: java.lang.Throwable -> Lcf
                r7.m16703d1(r8, r4)     // Catch: java.lang.Throwable -> Lcf
                long r4 = r9.m16590l()     // Catch: java.lang.Throwable -> Lcf
                r9.m16607B(r4)     // Catch: java.lang.Throwable -> Lcf
                goto Laa
            L9b:
                boolean r4 = r17.m16568c()     // Catch: java.lang.Throwable -> Lcf
                if (r4 != 0) goto La9
                if (r6 != 0) goto La9
                r9.m16603F()     // Catch: java.lang.Throwable -> Lcf
                r13 = r11
                r4 = 1
                goto Lab
            La9:
                r13 = r11
            Laa:
                r4 = 0
            Lab:
                okhttp3.internal.http2.e$d r5 = r9.m16589m()     // Catch: java.lang.Throwable -> Ld8
                r5.m16562A()     // Catch: java.lang.Throwable -> Ld8
                yc.u r5 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> Ld8
                monitor-exit(r9)
                if (r4 == 0) goto Lbb
                r4 = 0
                goto L16
            Lbb:
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 == 0) goto Lc3
                r1.m16570F(r13)
                return r13
            Lc3:
                if (r6 != 0) goto Lc6
                return r11
            Lc6:
                throw r6
            Lc7:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lcf
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lcf
                throw r0     // Catch: java.lang.Throwable -> Lcf
            Lcf:
                r0 = move-exception
                okhttp3.internal.http2.e$d r2 = r9.m16589m()     // Catch: java.lang.Throwable -> Ld8
                r2.m16562A()     // Catch: java.lang.Throwable -> Ld8
                throw r0     // Catch: java.lang.Throwable -> Ld8
            Ld8:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            Ldb:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.Long r2 = java.lang.Long.valueOf(r19)
                java.lang.String r0 = p181jd.Intrinsics.addStrAndObj(r0, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.C8139c.read(sf.c, long):long");
        }

        /* renamed from: t */
        public final void m16565t(InterfaceC10187e interfaceC10187e, long j) throws IOException {
            boolean m16568c;
            boolean z;
            boolean z2;
            long j2;
            Intrinsics.isThisObjectNull(interfaceC10187e, "source");
            Http2Stream http2Stream = this.f21162B;
            if (Util.f15905g && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            while (j > 0) {
                synchronized (this.f21162B) {
                    m16568c = m16568c();
                    z = true;
                    z2 = m16567e().size() + j > this.f21163w;
                    C13195u c13195u = C13195u.f34156a;
                }
                if (z2) {
                    interfaceC10187e.skip(j);
                    this.f21162B.m16596f(EnumC8112a.FLOW_CONTROL_ERROR);
                    return;
                } else if (m16568c) {
                    interfaceC10187e.skip(j);
                    return;
                } else {
                    long read = interfaceC10187e.read(this.f21165y, j);
                    if (read != -1) {
                        j -= read;
                        Http2Stream http2Stream2 = this.f21162B;
                        synchronized (http2Stream2) {
                            if (m16569a()) {
                                j2 = m16566h().size();
                                m16566h().m8805a();
                            } else {
                                if (m16567e().size() != 0) {
                                    z = false;
                                }
                                m16567e().mo8783A(m16566h());
                                if (z) {
                                    http2Stream2.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            m16570F(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        /* renamed from: timeout */
        public Timeout mo40537timeout() {
            return this.f21162B.m16589m();
        }

        /* renamed from: v */
        public final void m16564v(boolean z) {
            this.f21161A = z;
        }

        /* renamed from: y */
        public final void m16563y(boolean z) {
            this.f21164x = z;
        }
    }

    /* compiled from: Http2Stream.kt */
    /* renamed from: okhttp3.internal.http2.e$d */
    /* loaded from: classes2.dex */
    public final class C8140d extends AsyncTimeout {

        /* renamed from: l */
        final /* synthetic */ Http2Stream f21167l;

        public C8140d(Http2Stream http2Stream) {
            Intrinsics.isThisObjectNull(http2Stream, "this$0");
            this.f21167l = http2Stream;
        }

        /* renamed from: A */
        public final void m16562A() throws IOException {
            if (m8841u()) {
                throw m16561v(null);
            }
        }

        /* renamed from: v */
        protected IOException m16561v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: z */
        protected void m16560z() {
            this.f21167l.m16596f(EnumC8112a.CANCEL);
            this.f21167l.m16595g().m16724Q0();
        }
    }

    static {
        new C8137a(null);
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        Intrinsics.isThisObjectNull(http2Connection, "connection");
        this.f21142a = i;
        this.f21143b = http2Connection;
        this.f21147f = http2Connection.m16691v0().m17647c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f21148g = arrayDeque;
        this.f21150i = new C8139c(this, http2Connection.m16693t0().m17647c(), z2);
        this.f21151j = new C8138b(this, z);
        this.f21152k = new C8140d(this);
        this.f21153l = new C8140d(this);
        if (headers != null) {
            if (!m16582t()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!m16582t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m16597e(EnumC8112a enumC8112a, IOException iOException) {
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (m16594h() != null) {
                return false;
            }
            if (m16586p().m16568c() && m16587o().m16573e()) {
                return false;
            }
            m16576z(enumC8112a);
            m16608A(iOException);
            notifyAll();
            C13195u c13195u = C13195u.f34156a;
            this.f21143b.m16725P0(this.f21142a);
            return true;
        }
    }

    /* renamed from: A */
    public final void m16608A(IOException iOException) {
        this.f21155n = iOException;
    }

    /* renamed from: B */
    public final void m16607B(long j) {
        this.f21145d = j;
    }

    /* renamed from: C */
    public final void m16606C(long j) {
        this.f21144c = j;
    }

    /* renamed from: D */
    public final void m16605D(long j) {
        this.f21146e = j;
    }

    /* renamed from: E */
    public final synchronized Headers m16604E() throws IOException {
        Object removeFirst;
        this.f21152k.m8842t();
        while (this.f21148g.isEmpty() && this.f21154m == null) {
            m16603F();
        }
        this.f21152k.m16562A();
        if (!this.f21148g.isEmpty()) {
            removeFirst = this.f21148g.removeFirst();
            Intrinsics.checkIfNull(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f21155n;
            if (iOException == null) {
                EnumC8112a enumC8112a = this.f21154m;
                Intrinsics.ifNullDoSomething(enumC8112a);
                throw new StreamResetException(enumC8112a);
            }
            throw iOException;
        }
        return (Headers) removeFirst;
    }

    /* renamed from: F */
    public final void m16603F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: G */
    public final Timeout m16602G() {
        return this.f21153l;
    }

    /* renamed from: a */
    public final void m16601a(long j) {
        this.f21147f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m16600b() throws IOException {
        boolean z;
        boolean m16581u;
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z = !m16586p().m16568c() && m16586p().m16569a() && (m16587o().m16573e() || m16587o().m16574c());
            m16581u = m16581u();
            C13195u c13195u = C13195u.f34156a;
        }
        if (z) {
            m16598d(EnumC8112a.CANCEL, null);
        } else if (m16581u) {
        } else {
            this.f21143b.m16725P0(this.f21142a);
        }
    }

    /* renamed from: c */
    public final void m16599c() throws IOException {
        if (!this.f21151j.m16574c()) {
            if (!this.f21151j.m16573e()) {
                if (this.f21154m != null) {
                    IOException iOException = this.f21155n;
                    if (iOException != null) {
                        throw iOException;
                    }
                    EnumC8112a enumC8112a = this.f21154m;
                    Intrinsics.ifNullDoSomething(enumC8112a);
                    throw new StreamResetException(enumC8112a);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: d */
    public final void m16598d(EnumC8112a enumC8112a, IOException iOException) throws IOException {
        Intrinsics.isThisObjectNull(enumC8112a, "rstStatusCode");
        if (m16597e(enumC8112a, iOException)) {
            this.f21143b.m16707b1(this.f21142a, enumC8112a);
        }
    }

    /* renamed from: f */
    public final void m16596f(EnumC8112a enumC8112a) {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        if (m16597e(enumC8112a, null)) {
            this.f21143b.m16705c1(this.f21142a, enumC8112a);
        }
    }

    /* renamed from: g */
    public final Http2Connection m16595g() {
        return this.f21143b;
    }

    /* renamed from: h */
    public final synchronized EnumC8112a m16594h() {
        return this.f21154m;
    }

    /* renamed from: i */
    public final IOException m16593i() {
        return this.f21155n;
    }

    /* renamed from: j */
    public final int m16592j() {
        return this.f21142a;
    }

    /* renamed from: k */
    public final long m16591k() {
        return this.f21145d;
    }

    /* renamed from: l */
    public final long m16590l() {
        return this.f21144c;
    }

    /* renamed from: m */
    public final C8140d m16589m() {
        return this.f21152k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p356sf.InterfaceC10189f0 m16588n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f21149h     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.m16582t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            yc.u r0 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            okhttp3.internal.http2.e$b r0 = r2.f21151j
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.m16588n():sf.f0");
    }

    /* renamed from: o */
    public final C8138b m16587o() {
        return this.f21151j;
    }

    /* renamed from: p */
    public final C8139c m16586p() {
        return this.f21150i;
    }

    /* renamed from: q */
    public final long m16585q() {
        return this.f21147f;
    }

    /* renamed from: r */
    public final long m16584r() {
        return this.f21146e;
    }

    /* renamed from: s */
    public final C8140d m16583s() {
        return this.f21153l;
    }

    /* renamed from: t */
    public final boolean m16582t() {
        return this.f21143b.m16700f0() == ((this.f21142a & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean m16581u() {
        if (this.f21154m != null) {
            return false;
        }
        if ((this.f21150i.m16568c() || this.f21150i.m16569a()) && (this.f21151j.m16573e() || this.f21151j.m16574c())) {
            if (this.f21149h) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final Timeout m16580v() {
        return this.f21152k;
    }

    /* renamed from: w */
    public final void m16579w(InterfaceC10187e interfaceC10187e, int i) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        this.f21150i.m16565t(interfaceC10187e, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:10:0x0038, B:14:0x0040, B:17:0x0051, B:18:0x0058, B:15:0x0048), top: B:26:0x0038 }] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16578x(p107ff.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            boolean r0 = gf.Util.f15905g
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.f21149h     // Catch: java.lang.Throwable -> L6c
            r1 = 1
            if (r0 == 0) goto L48
            if (r4 != 0) goto L40
            goto L48
        L40:
            okhttp3.internal.http2.e$c r0 = r2.m16586p()     // Catch: java.lang.Throwable -> L6c
            r0.m16571E(r3)     // Catch: java.lang.Throwable -> L6c
            goto L4f
        L48:
            r2.f21149h = r1     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayDeque r0 = r2.f21148g     // Catch: java.lang.Throwable -> L6c
            r0.add(r3)     // Catch: java.lang.Throwable -> L6c
        L4f:
            if (r4 == 0) goto L58
            okhttp3.internal.http2.e$c r3 = r2.m16586p()     // Catch: java.lang.Throwable -> L6c
            r3.m16563y(r1)     // Catch: java.lang.Throwable -> L6c
        L58:
            boolean r3 = r2.m16581u()     // Catch: java.lang.Throwable -> L6c
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6c
            yc.u r4 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)
            if (r3 != 0) goto L6b
            okhttp3.internal.http2.c r3 = r2.f21143b
            int r4 = r2.f21142a
            r3.m16725P0(r4)
        L6b:
            return
        L6c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.m16578x(ff.u, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void m16577y(EnumC8112a enumC8112a) {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        if (this.f21154m == null) {
            this.f21154m = enumC8112a;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void m16576z(EnumC8112a enumC8112a) {
        this.f21154m = enumC8112a;
    }
}
