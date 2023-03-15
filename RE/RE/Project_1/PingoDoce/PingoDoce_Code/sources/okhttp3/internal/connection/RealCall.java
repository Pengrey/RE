package okhttp3.internal.connection;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gf.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.Platform;
import p107ff.Address;
import p107ff.CertificatePinner;
import p107ff.Dispatcher;
import p107ff.EventListener;
import p107ff.HttpUrl;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5474f;
import p107ff.OkHttpClient;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;
import p204kf.RealConnectionPool;
import p222lf.RealInterceptorChain;
import p356sf.AsyncTimeout;
import p468yc.C13195u;
import p468yc.Exceptions;

/* renamed from: okhttp3.internal.connection.e */
/* loaded from: classes2.dex */
public final class RealCall implements InterfaceC5469e {

    /* renamed from: A */
    private final EventListener f20977A;

    /* renamed from: B */
    private final C8105c f20978B;

    /* renamed from: C */
    private final AtomicBoolean f20979C;

    /* renamed from: D */
    private Object f20980D;

    /* renamed from: E */
    private ExchangeFinder f20981E;

    /* renamed from: F */
    private RealConnection f20982F;

    /* renamed from: G */
    private boolean f20983G;

    /* renamed from: H */
    private Exchange f20984H;

    /* renamed from: I */
    private boolean f20985I;

    /* renamed from: J */
    private boolean f20986J;

    /* renamed from: K */
    private boolean f20987K;

    /* renamed from: L */
    private volatile boolean f20988L;

    /* renamed from: M */
    private volatile Exchange f20989M;

    /* renamed from: N */
    private volatile RealConnection f20990N;

    /* renamed from: w */
    private final OkHttpClient f20991w;

    /* renamed from: x */
    private final Request f20992x;

    /* renamed from: y */
    private final boolean f20993y;

    /* renamed from: z */
    private final RealConnectionPool f20994z;

    /* compiled from: RealCall.kt */
    /* renamed from: okhttp3.internal.connection.e$a */
    /* loaded from: classes2.dex */
    public final class RunnableC8103a implements Runnable {

        /* renamed from: w */
        private final InterfaceC5474f f20995w;

        /* renamed from: x */
        private volatile AtomicInteger f20996x;

        /* renamed from: y */
        final /* synthetic */ RealCall f20997y;

        public RunnableC8103a(RealCall realCall, InterfaceC5474f interfaceC5474f) {
            Intrinsics.isThisObjectNull(realCall, "this$0");
            Intrinsics.isThisObjectNull(interfaceC5474f, "responseCallback");
            this.f20997y = realCall;
            this.f20995w = interfaceC5474f;
            this.f20996x = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m16828a(ExecutorService executorService) {
            Intrinsics.isThisObjectNull(executorService, "executorService");
            Dispatcher m23876m = this.f20997y.m16841k().m23876m();
            if (Util.f15905g && Thread.holdsLock(m23876m)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + m23876m);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f20997y.m16832u(interruptedIOException);
                    this.f20995w.onFailure(this.f20997y, interruptedIOException);
                    this.f20997y.m16841k().m23876m().m24066f(this);
                }
            } catch (Throwable th2) {
                this.f20997y.m16841k().m23876m().m24066f(this);
                throw th2;
            }
        }

        /* renamed from: b */
        public final RealCall m16827b() {
            return this.f20997y;
        }

        /* renamed from: c */
        public final AtomicInteger m16826c() {
            return this.f20996x;
        }

        /* renamed from: d */
        public final String m16825d() {
            return this.f20997y.m16836p().m24266j().m23983i();
        }

        /* renamed from: e */
        public final void m16824e(RunnableC8103a runnableC8103a) {
            Intrinsics.isThisObjectNull(runnableC8103a, "other");
            this.f20996x = runnableC8103a.f20996x;
        }

        public void run() {
            boolean z;
            Throwable th2;
            IOException e;
            Dispatcher m23876m;
            String addStrAndObj = Intrinsics.addStrAndObj("OkHttp ", this.f20997y.m16831w());
            RealCall realCall = this.f20997y;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(addStrAndObj);
            try {
                RealCall.m16850a(realCall).m8842t();
                try {
                    z = true;
                } catch (IOException e2) {
                    z = false;
                    e = e2;
                } catch (Throwable th3) {
                    z = false;
                    th2 = th3;
                }
                try {
                    this.f20995w.onResponse(realCall, realCall.m16835q());
                    m23876m = realCall.m16841k().m23876m();
                } catch (IOException e3) {
                    e = e3;
                    if (z) {
                        Platform.f21214a.m16457g().m16469j(Intrinsics.addStrAndObj("Callback failure for ", RealCall.m16849b(realCall)), 4, e);
                    } else {
                        this.f20995w.onFailure(realCall, e);
                    }
                    m23876m = realCall.m16841k().m23876m();
                    m23876m.m24066f(this);
                } catch (Throwable th4) {
                    th2 = th4;
                    realCall.cancel();
                    if (!z) {
                        IOException iOException = new IOException(Intrinsics.addStrAndObj("canceled due to ", th2));
                        Exceptions.m1470a(iOException, th2);
                        this.f20995w.onFailure(realCall, iOException);
                    }
                    throw th2;
                }
                m23876m.m24066f(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    /* renamed from: okhttp3.internal.connection.e$b */
    /* loaded from: classes2.dex */
    public static final class C8104b extends WeakReference {

        /* renamed from: a */
        private final Object f20998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8104b(RealCall realCall, Object obj) {
            super(realCall);
            Intrinsics.isThisObjectNull(realCall, "referent");
            this.f20998a = obj;
        }

        /* renamed from: a */
        public final Object m16823a() {
            return this.f20998a;
        }
    }

    /* compiled from: RealCall.kt */
    /* renamed from: okhttp3.internal.connection.e$c */
    /* loaded from: classes2.dex */
    public static final class C8105c extends AsyncTimeout {
        C8105c() {
        }

        /* renamed from: z */
        protected void m16822z() {
            RealCall.this.cancel();
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(request, "originalRequest");
        this.f20991w = okHttpClient;
        this.f20992x = request;
        this.f20993y = z;
        this.f20994z = okHttpClient.m23879j().m24118a();
        this.f20977A = okHttpClient.m23874o().mo23443a(this);
        C8105c c8105c = new C8105c();
        c8105c.m8646g(m16841k().m23882f(), TimeUnit.MILLISECONDS);
        this.f20978B = c8105c;
        this.f20979C = new AtomicBoolean();
        this.f20987K = true;
    }

    /* renamed from: D */
    private final IOException m16853D(IOException iOException) {
        if (!this.f20983G && this.f20978B.m8841u()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    /* renamed from: F */
    private final String m16851F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : BuildConfig.VERSION_NAME);
        sb2.append(this.f20993y ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m16831w());
        return sb2.toString();
    }

    /* renamed from: a */
    public static final /* synthetic */ C8105c m16850a(RealCall realCall) {
        return realCall.f20978B;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m16849b(RealCall realCall) {
        return realCall.m16851F();
    }

    /* renamed from: d */
    private final IOException m16847d(IOException iOException) {
        Socket m16830x;
        boolean z = Util.f15905g;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.f20982F;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                m16830x = m16830x();
            }
            if (this.f20982F == null) {
                if (m16830x != null) {
                    Util.m23403n(m16830x);
                }
                this.f20977A.m24043k(this, realConnection);
            } else {
                if (!(m16830x == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        IOException m16853D = m16853D(iOException);
        if (iOException != null) {
            EventListener eventListener = this.f20977A;
            Intrinsics.ifNullDoSomething(m16853D);
            eventListener.m24050d(this, m16853D);
        } else {
            this.f20977A.m24051c(this);
        }
        return m16853D;
    }

    /* renamed from: e */
    private final void m16846e() {
        this.f20980D = Platform.f21214a.m16457g().m16471h("response.body().close()");
        this.f20977A.m24049e(this);
    }

    /* renamed from: g */
    private final Address m16844g(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.m23982j()) {
            SSLSocketFactory m23890H = this.f20991w.m23890H();
            hostnameVerifier = this.f20991w.m23870s();
            sSLSocketFactory = m23890H;
            certificatePinner = this.f20991w.m23881g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.m23983i(), httpUrl.m23978n(), this.f20991w.m23875n(), this.f20991w.m23891G(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.f20991w.m23895B(), this.f20991w.m23896A(), this.f20991w.m23866z(), this.f20991w.m23878k(), this.f20991w.m23894C());
    }

    /* renamed from: A */
    public final void m16856A(RealConnection realConnection) {
        this.f20990N = realConnection;
    }

    /* renamed from: B */
    public AsyncTimeout mo40276timeout() {
        return this.f20978B;
    }

    /* renamed from: C */
    public final void m16854C() {
        if (!this.f20983G) {
            this.f20983G = true;
            this.f20978B.m8841u();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: E */
    public void mo24162E(InterfaceC5474f interfaceC5474f) {
        Intrinsics.isThisObjectNull(interfaceC5474f, "responseCallback");
        if (this.f20979C.compareAndSet(false, true)) {
            m16846e();
            this.f20991w.m23876m().m24071a(new RunnableC8103a(this, interfaceC5474f));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: c */
    public final void m16848c(RealConnection realConnection) {
        Intrinsics.isThisObjectNull(realConnection, "connection");
        if (Util.f15905g && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        if (this.f20982F == null) {
            this.f20982F = realConnection;
            realConnection.m16799o().add(new C8104b(this, this.f20980D));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void cancel() {
        if (this.f20988L) {
            return;
        }
        this.f20988L = true;
        Exchange exchange = this.f20989M;
        if (exchange != null) {
            exchange.m16885b();
        }
        RealConnection realConnection = this.f20990N;
        if (realConnection != null) {
            realConnection.m16809e();
        }
        this.f20977A.m24048f(this);
    }

    public Response execute() {
        if (this.f20979C.compareAndSet(false, true)) {
            this.f20978B.m8842t();
            m16846e();
            try {
                this.f20991w.m23876m().m24070b(this);
                return m16835q();
            } finally {
                this.f20991w.m23876m().m24065g(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: f */
    public RealCall clone() {
        return new RealCall(this.f20991w, this.f20992x, this.f20993y);
    }

    /* renamed from: i */
    public final void m16843i(Request request, boolean z) {
        Intrinsics.isThisObjectNull(request, "request");
        if (this.f20984H == null) {
            synchronized (this) {
                if (!this.f20986J) {
                    if (!this.f20985I) {
                        C13195u c13195u = C13195u.f34156a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z) {
                this.f20981E = new ExchangeFinder(this.f20994z, m16844g(request.m24266j()), this, this.f20977A);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean isCanceled() {
        return this.f20988L;
    }

    /* renamed from: j */
    public final void m16842j(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (this.f20987K) {
                C13195u c13195u = C13195u.f34156a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (exchange = this.f20989M) != null) {
            exchange.m16883d();
        }
        this.f20984H = null;
    }

    /* renamed from: k */
    public final OkHttpClient m16841k() {
        return this.f20991w;
    }

    /* renamed from: l */
    public final RealConnection m16840l() {
        return this.f20982F;
    }

    /* renamed from: m */
    public final EventListener m16839m() {
        return this.f20977A;
    }

    /* renamed from: n */
    public final boolean m16838n() {
        return this.f20993y;
    }

    /* renamed from: o */
    public final Exchange m16837o() {
        return this.f20984H;
    }

    /* renamed from: p */
    public final Request m16836p() {
        return this.f20992x;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p107ff.Response m16835q() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ff.z r0 = r11.f20991w
            java.util.List r0 = r0.m23869u()
            p489zc.C13777q.m212u(r2, r0)
            lf.j r0 = new lf.j
            ff.z r1 = r11.f20991w
            r0.<init>(r1)
            r2.add(r0)
            lf.a r0 = new lf.a
            ff.z r1 = r11.f20991w
            ff.n r1 = r1.m23877l()
            r0.<init>(r1)
            r2.add(r0)
            if.a r0 = new if.a
            ff.z r1 = r11.f20991w
            ff.c r1 = r1.m23883e()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.ConnectInterceptor.f20945a
            r2.add(r0)
            boolean r0 = r11.f20993y
            if (r0 != 0) goto L46
            ff.z r0 = r11.f20991w
            java.util.List r0 = r0.m23868w()
            p489zc.C13777q.m212u(r2, r0)
        L46:
            lf.b r0 = new lf.b
            boolean r1 = r11.f20993y
            r0.<init>(r1)
            r2.add(r0)
            lf.g r9 = new lf.g
            r3 = 0
            r4 = 0
            ff.b0 r5 = r11.f20992x
            ff.z r0 = r11.f20991w
            int r6 = r0.m23880i()
            ff.z r0 = r11.f20991w
            int r7 = r0.m23893D()
            ff.z r0 = r11.f20991w
            int r8 = r0.m23888J()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            ff.b0 r2 = r11.f20992x     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            ff.d0 r2 = r9.mo23918a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.m16832u(r1)
            return r2
        L7f:
            gf.Util.m23404m(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.m16832u(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        La1:
            if (r0 != 0) goto La6
            r11.m16832u(r1)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.m16835q():ff.d0");
    }

    /* renamed from: r */
    public final Exchange m16834r(RealInterceptorChain realInterceptorChain) {
        Intrinsics.isThisObjectNull(realInterceptorChain, "chain");
        synchronized (this) {
            if (this.f20987K) {
                if (!this.f20986J) {
                    if (!this.f20985I) {
                        C13195u c13195u = C13195u.f34156a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder = this.f20981E;
        Intrinsics.ifNullDoSomething(exchangeFinder);
        Exchange exchange = new Exchange(this, this.f20977A, exchangeFinder, exchangeFinder.m16864a(this.f20991w, realInterceptorChain));
        this.f20984H = exchange;
        this.f20989M = exchange;
        synchronized (this) {
            this.f20985I = true;
            this.f20986J = true;
        }
        if (this.f20988L) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public Request request() {
        return this.f20992x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException m16833s(okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            okhttp3.internal.connection.c r0 = r1.f20989M
            boolean r2 = p181jd.Intrinsics.equals(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f20985I     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L5a
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.f20986J     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.f20985I = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f20986J = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f20985I     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f20986J     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f20986J     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f20987K     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            yc.u r4 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r2 = 0
            r1.f20989M = r2
            okhttp3.internal.connection.f r2 = r1.f20982F
            if (r2 != 0) goto L4f
            goto L52
        L4f:
            r2.m16794t()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r1.m16847d(r5)
            return r2
        L59:
            return r5
        L5a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.m16833s(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: u */
    public final IOException m16832u(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f20987K) {
                this.f20987K = false;
                if (!this.f20985I && !this.f20986J) {
                    z = true;
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
        return z ? m16847d(iOException) : iOException;
    }

    /* renamed from: w */
    public final String m16831w() {
        return this.f20992x.m24266j().m23976p();
    }

    /* renamed from: x */
    public final Socket m16830x() {
        RealConnection realConnection = this.f20982F;
        Intrinsics.ifNullDoSomething(realConnection);
        if (Util.f15905g && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List m16799o = realConnection.m16799o();
        Iterator it = m16799o.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.equals(((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            m16799o.remove(i);
            this.f20982F = null;
            if (m16799o.isEmpty()) {
                realConnection.m16819C(System.nanoTime());
                if (this.f20994z.m20372c(realConnection)) {
                    return realConnection.m16817E();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: z */
    public final boolean m16829z() {
        ExchangeFinder exchangeFinder = this.f20981E;
        Intrinsics.ifNullDoSomething(exchangeFinder);
        return exchangeFinder.m16860e();
    }
}
