package p356sf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: sf.a */
/* loaded from: classes2.dex */
public class AsyncTimeout extends Timeout {

    /* renamed from: h */
    public static final C10178a f26507h = new C10178a(null);

    /* renamed from: i */
    private static final long f26508i;

    /* renamed from: j */
    private static final long f26509j;

    /* renamed from: k */
    private static AsyncTimeout f26510k;

    /* renamed from: e */
    private boolean f26511e;

    /* renamed from: f */
    private AsyncTimeout f26512f;

    /* renamed from: g */
    private long f26513g;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: sf.a$a */
    /* loaded from: classes2.dex */
    public static final class C10178a {
        private C10178a() {
        }

        public /* synthetic */ C10178a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ boolean m8835a(C10178a c10178a, AsyncTimeout asyncTimeout) {
            return c10178a.m8832d(asyncTimeout);
        }

        /* renamed from: b */
        public static final /* synthetic */ void m8834b(C10178a c10178a, AsyncTimeout asyncTimeout, long j, boolean z) {
            c10178a.m8831e(asyncTimeout, j, z);
        }

        /* renamed from: d */
        private final boolean m8832d(AsyncTimeout asyncTimeout) {
            synchronized (AsyncTimeout.class) {
                if (AsyncTimeout.m8850l(asyncTimeout)) {
                    AsyncTimeout.m8845q(asyncTimeout, false);
                    for (AsyncTimeout m8853i = AsyncTimeout.m8853i(); m8853i != null; m8853i = AsyncTimeout.m8849m(m8853i)) {
                        if (AsyncTimeout.m8849m(m8853i) == asyncTimeout) {
                            AsyncTimeout.m8844r(m8853i, AsyncTimeout.m8849m(asyncTimeout));
                            AsyncTimeout.m8844r(asyncTimeout, null);
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        /* renamed from: e */
        private final void m8831e(AsyncTimeout asyncTimeout, long j, boolean z) {
            synchronized (AsyncTimeout.class) {
                if (!AsyncTimeout.m8850l(asyncTimeout)) {
                    AsyncTimeout.m8845q(asyncTimeout, true);
                    if (AsyncTimeout.m8853i() == null) {
                        C10178a c10178a = AsyncTimeout.f26507h;
                        AsyncTimeout.m8846p(new AsyncTimeout());
                        new C10179b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i != 0 && z) {
                        AsyncTimeout.m8843s(asyncTimeout, Math.min(j, asyncTimeout.m8650c() - nanoTime) + nanoTime);
                    } else if (i != 0) {
                        AsyncTimeout.m8843s(asyncTimeout, j + nanoTime);
                    } else if (z) {
                        AsyncTimeout.m8843s(asyncTimeout, asyncTimeout.m8650c());
                    } else {
                        throw new AssertionError();
                    }
                    long m8847o = AsyncTimeout.m8847o(asyncTimeout, nanoTime);
                    AsyncTimeout m8853i = AsyncTimeout.m8853i();
                    Intrinsics.ifNullDoSomething(m8853i);
                    while (AsyncTimeout.m8849m(m8853i) != null) {
                        AsyncTimeout m8849m = AsyncTimeout.m8849m(m8853i);
                        Intrinsics.ifNullDoSomething(m8849m);
                        if (m8847o < AsyncTimeout.m8847o(m8849m, nanoTime)) {
                            break;
                        }
                        m8853i = AsyncTimeout.m8849m(m8853i);
                        Intrinsics.ifNullDoSomething(m8853i);
                    }
                    AsyncTimeout.m8844r(asyncTimeout, AsyncTimeout.m8849m(m8853i));
                    AsyncTimeout.m8844r(m8853i, asyncTimeout);
                    if (m8853i == AsyncTimeout.m8853i()) {
                        AsyncTimeout.class.notify();
                    }
                    C13195u c13195u = C13195u.f34156a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        /* renamed from: c */
        public final AsyncTimeout m8833c() throws InterruptedException {
            AsyncTimeout m8853i = AsyncTimeout.m8853i();
            Intrinsics.ifNullDoSomething(m8853i);
            AsyncTimeout m8849m = AsyncTimeout.m8849m(m8853i);
            if (m8849m == null) {
                long nanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.m8852j());
                AsyncTimeout m8853i2 = AsyncTimeout.m8853i();
                Intrinsics.ifNullDoSomething(m8853i2);
                if (AsyncTimeout.m8849m(m8853i2) != null || System.nanoTime() - nanoTime < AsyncTimeout.m8851k()) {
                    return null;
                }
                return AsyncTimeout.m8853i();
            }
            long m8847o = AsyncTimeout.m8847o(m8849m, System.nanoTime());
            if (m8847o > 0) {
                long j = m8847o / 1000000;
                AsyncTimeout.class.wait(j, (int) (m8847o - (1000000 * j)));
                return null;
            }
            AsyncTimeout m8853i3 = AsyncTimeout.m8853i();
            Intrinsics.ifNullDoSomething(m8853i3);
            AsyncTimeout.m8844r(m8853i3, AsyncTimeout.m8849m(m8849m));
            AsyncTimeout.m8844r(m8849m, null);
            return m8849m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    /* renamed from: sf.a$b */
    /* loaded from: classes2.dex */
    public static final class C10179b extends Thread {
        public C10179b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        public void run() {
            AsyncTimeout m8833c;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        m8833c = AsyncTimeout.f26507h.m8833c();
                        if (m8833c == AsyncTimeout.m8853i()) {
                            AsyncTimeout.m8846p(null);
                            return;
                        }
                        C13195u c13195u = C13195u.f34156a;
                    }
                    if (m8833c != null) {
                        m8833c.m8836z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: sf.a$c */
    /* loaded from: classes2.dex */
    public static final class C10180c implements InterfaceC10189f0 {

        /* renamed from: x */
        final /* synthetic */ InterfaceC10189f0 f26515x;

        C10180c(InterfaceC10189f0 interfaceC10189f0) {
            this.f26515x = interfaceC10189f0;
        }

        /* renamed from: B */
        public void mo8688B(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "source");
            C10198n0.m8597b(buffer.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                Segment segment = buffer.f26525w;
                Intrinsics.ifNullDoSomething(segment);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += segment.f26531c - segment.f26530b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        segment = segment.f26534f;
                        Intrinsics.ifNullDoSomething(segment);
                    }
                }
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                InterfaceC10189f0 interfaceC10189f0 = this.f26515x;
                asyncTimeout.m8842t();
                try {
                    interfaceC10189f0.mo8688B(buffer, j2);
                    C13195u c13195u = C13195u.f34156a;
                    if (asyncTimeout.m8841u()) {
                        throw asyncTimeout.m8848n(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!asyncTimeout.m8841u()) {
                        throw e;
                    }
                    throw asyncTimeout.m8848n(e);
                } finally {
                    asyncTimeout.m8841u();
                }
            }
        }

        /* renamed from: a */
        public AsyncTimeout mo40536timeout() {
            return AsyncTimeout.this;
        }

        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            InterfaceC10189f0 interfaceC10189f0 = this.f26515x;
            asyncTimeout.m8842t();
            try {
                interfaceC10189f0.close();
                C13195u c13195u = C13195u.f34156a;
                if (asyncTimeout.m8841u()) {
                    throw asyncTimeout.m8848n(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.m8841u()) {
                    throw e;
                }
                throw asyncTimeout.m8848n(e);
            } finally {
                asyncTimeout.m8841u();
            }
        }

        public void flush() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            InterfaceC10189f0 interfaceC10189f0 = this.f26515x;
            asyncTimeout.m8842t();
            try {
                interfaceC10189f0.flush();
                C13195u c13195u = C13195u.f34156a;
                if (asyncTimeout.m8841u()) {
                    throw asyncTimeout.m8848n(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.m8841u()) {
                    throw e;
                }
                throw asyncTimeout.m8848n(e);
            } finally {
                asyncTimeout.m8841u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f26515x + ')';
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: sf.a$d */
    /* loaded from: classes2.dex */
    public static final class C10181d implements InterfaceC10191h0 {

        /* renamed from: x */
        final /* synthetic */ InterfaceC10191h0 f26517x;

        C10181d(InterfaceC10191h0 interfaceC10191h0) {
            this.f26517x = interfaceC10191h0;
        }

        /* renamed from: a */
        public AsyncTimeout mo40537timeout() {
            return AsyncTimeout.this;
        }

        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            InterfaceC10191h0 interfaceC10191h0 = this.f26517x;
            asyncTimeout.m8842t();
            try {
                interfaceC10191h0.close();
                C13195u c13195u = C13195u.f34156a;
                if (asyncTimeout.m8841u()) {
                    throw asyncTimeout.m8848n(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.m8841u()) {
                    throw e;
                }
                throw asyncTimeout.m8848n(e);
            } finally {
                asyncTimeout.m8841u();
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            InterfaceC10191h0 interfaceC10191h0 = this.f26517x;
            asyncTimeout.m8842t();
            try {
                long read = interfaceC10191h0.read(buffer, j);
                if (asyncTimeout.m8841u()) {
                    throw asyncTimeout.m8848n(null);
                }
                return read;
            } catch (IOException e) {
                if (asyncTimeout.m8841u()) {
                    throw asyncTimeout.m8848n(e);
                }
                throw e;
            } finally {
                asyncTimeout.m8841u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f26517x + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f26508i = millis;
        f26509j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    public static final /* synthetic */ AsyncTimeout m8853i() {
        return f26510k;
    }

    /* renamed from: j */
    public static final /* synthetic */ long m8852j() {
        return f26508i;
    }

    /* renamed from: k */
    public static final /* synthetic */ long m8851k() {
        return f26509j;
    }

    /* renamed from: l */
    public static final /* synthetic */ boolean m8850l(AsyncTimeout asyncTimeout) {
        return asyncTimeout.f26511e;
    }

    /* renamed from: m */
    public static final /* synthetic */ AsyncTimeout m8849m(AsyncTimeout asyncTimeout) {
        return asyncTimeout.f26512f;
    }

    /* renamed from: o */
    public static final /* synthetic */ long m8847o(AsyncTimeout asyncTimeout, long j) {
        return asyncTimeout.m8839w(j);
    }

    /* renamed from: p */
    public static final /* synthetic */ void m8846p(AsyncTimeout asyncTimeout) {
        f26510k = asyncTimeout;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m8845q(AsyncTimeout asyncTimeout, boolean z) {
        asyncTimeout.f26511e = z;
    }

    /* renamed from: r */
    public static final /* synthetic */ void m8844r(AsyncTimeout asyncTimeout, AsyncTimeout asyncTimeout2) {
        asyncTimeout.f26512f = asyncTimeout2;
    }

    /* renamed from: s */
    public static final /* synthetic */ void m8843s(AsyncTimeout asyncTimeout, long j) {
        asyncTimeout.f26513g = j;
    }

    /* renamed from: w */
    private final long m8839w(long j) {
        return this.f26513g - j;
    }

    /* renamed from: n */
    public final IOException m8848n(IOException iOException) {
        return m8840v(iOException);
    }

    /* renamed from: t */
    public final void m8842t() {
        long m8645h = m8645h();
        boolean m8648e = m8648e();
        if (m8645h != 0 || m8648e) {
            C10178a.m8834b(f26507h, this, m8645h, m8648e);
        }
    }

    /* renamed from: u */
    public final boolean m8841u() {
        return C10178a.m8835a(f26507h, this);
    }

    /* renamed from: v */
    protected IOException m8840v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: x */
    public final InterfaceC10189f0 m8838x(InterfaceC10189f0 interfaceC10189f0) {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "sink");
        return new C10180c(interfaceC10189f0);
    }

    /* renamed from: y */
    public final InterfaceC10191h0 m8837y(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        return new C10181d(interfaceC10191h0);
    }

    /* renamed from: z */
    protected void m8836z() {
    }
}
