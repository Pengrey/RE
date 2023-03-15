package okhttp3.internal.http2;

import gf.Util;
import id.InterfaceC6097a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.Settings;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import p181jd.C6447w;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p182jf.C6452c;
import p182jf.Task;
import p182jf.TaskQueue;
import p182jf.TaskRunner;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p468yc.C13195u;

/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable {

    /* renamed from: Y */
    public static final C8117b f21054Y = new C8117b(null);

    /* renamed from: Z */
    private static final Settings f21055Z;

    /* renamed from: A */
    private int f21056A;

    /* renamed from: B */
    private int f21057B;

    /* renamed from: C */
    private boolean f21058C;

    /* renamed from: D */
    private final TaskRunner f21059D;

    /* renamed from: E */
    private final TaskQueue f21060E;

    /* renamed from: F */
    private final TaskQueue f21061F;

    /* renamed from: G */
    private final TaskQueue f21062G;

    /* renamed from: H */
    private final PushObserver f21063H;

    /* renamed from: I */
    private long f21064I;

    /* renamed from: J */
    private long f21065J;

    /* renamed from: K */
    private long f21066K;

    /* renamed from: L */
    private long f21067L;

    /* renamed from: M */
    private long f21068M;

    /* renamed from: N */
    private long f21069N;

    /* renamed from: O */
    private final Settings f21070O;

    /* renamed from: P */
    private Settings f21071P;

    /* renamed from: Q */
    private long f21072Q;

    /* renamed from: R */
    private long f21073R;

    /* renamed from: S */
    private long f21074S;

    /* renamed from: T */
    private long f21075T;

    /* renamed from: U */
    private final Socket f21076U;

    /* renamed from: V */
    private final Http2Writer f21077V;

    /* renamed from: W */
    private final C8121d f21078W;

    /* renamed from: X */
    private final Set f21079X;

    /* renamed from: w */
    private final boolean f21080w;

    /* renamed from: x */
    private final AbstractC8118c f21081x;

    /* renamed from: y */
    private final Map f21082y;

    /* renamed from: z */
    private final String f21083z;

    /* compiled from: Http2Connection.kt */
    /* renamed from: okhttp3.internal.http2.c$a */
    /* loaded from: classes2.dex */
    public static final class C8116a {

        /* renamed from: a */
        private boolean f21084a;

        /* renamed from: b */
        private final TaskRunner f21085b;

        /* renamed from: c */
        public Socket f21086c;

        /* renamed from: d */
        public String f21087d;

        /* renamed from: e */
        public InterfaceC10187e f21088e;

        /* renamed from: f */
        public InterfaceC10186d f21089f;

        /* renamed from: g */
        private AbstractC8118c f21090g;

        /* renamed from: h */
        private PushObserver f21091h;

        /* renamed from: i */
        private int f21092i;

        public C8116a(boolean z, TaskRunner taskRunner) {
            Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
            this.f21084a = z;
            this.f21085b = taskRunner;
            this.f21090g = AbstractC8118c.f21093a;
            this.f21091h = PushObserver.f21182a;
        }

        /* renamed from: a */
        public final Http2Connection m16688a() {
            return new Http2Connection(this);
        }

        /* renamed from: b */
        public final boolean m16687b() {
            return this.f21084a;
        }

        /* renamed from: c */
        public final String m16686c() {
            String str = this.f21087d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitPropException("connectionName");
            return null;
        }

        /* renamed from: d */
        public final AbstractC8118c m16685d() {
            return this.f21090g;
        }

        /* renamed from: e */
        public final int m16684e() {
            return this.f21092i;
        }

        /* renamed from: f */
        public final PushObserver m16683f() {
            return this.f21091h;
        }

        /* renamed from: g */
        public final InterfaceC10186d m16682g() {
            InterfaceC10186d interfaceC10186d = this.f21089f;
            if (interfaceC10186d != null) {
                return interfaceC10186d;
            }
            Intrinsics.throwUninitPropException("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket m16681h() {
            Socket socket = this.f21086c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitPropException("socket");
            return null;
        }

        /* renamed from: i */
        public final InterfaceC10187e m16680i() {
            InterfaceC10187e interfaceC10187e = this.f21088e;
            if (interfaceC10187e != null) {
                return interfaceC10187e;
            }
            Intrinsics.throwUninitPropException("source");
            return null;
        }

        /* renamed from: j */
        public final TaskRunner m16679j() {
            return this.f21085b;
        }

        /* renamed from: k */
        public final C8116a m16678k(AbstractC8118c abstractC8118c) {
            Intrinsics.isThisObjectNull(abstractC8118c, "listener");
            m16675n(abstractC8118c);
            return this;
        }

        /* renamed from: l */
        public final C8116a m16677l(int i) {
            m16674o(i);
            return this;
        }

        /* renamed from: m */
        public final void m16676m(String str) {
            Intrinsics.isThisObjectNull(str, "<set-?>");
            this.f21087d = str;
        }

        /* renamed from: n */
        public final void m16675n(AbstractC8118c abstractC8118c) {
            Intrinsics.isThisObjectNull(abstractC8118c, "<set-?>");
            this.f21090g = abstractC8118c;
        }

        /* renamed from: o */
        public final void m16674o(int i) {
            this.f21092i = i;
        }

        /* renamed from: p */
        public final void m16673p(InterfaceC10186d interfaceC10186d) {
            Intrinsics.isThisObjectNull(interfaceC10186d, "<set-?>");
            this.f21089f = interfaceC10186d;
        }

        /* renamed from: q */
        public final void m16672q(Socket socket) {
            Intrinsics.isThisObjectNull(socket, "<set-?>");
            this.f21086c = socket;
        }

        /* renamed from: r */
        public final void m16671r(InterfaceC10187e interfaceC10187e) {
            Intrinsics.isThisObjectNull(interfaceC10187e, "<set-?>");
            this.f21088e = interfaceC10187e;
        }

        /* renamed from: s */
        public final C8116a m16670s(Socket socket, String str, InterfaceC10187e interfaceC10187e, InterfaceC10186d interfaceC10186d) throws IOException {
            String addStrAndObj;
            Intrinsics.isThisObjectNull(socket, "socket");
            Intrinsics.isThisObjectNull(str, "peerName");
            Intrinsics.isThisObjectNull(interfaceC10187e, "source");
            Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
            m16672q(socket);
            if (m16687b()) {
                addStrAndObj = Util.f15906h + ' ' + str;
            } else {
                addStrAndObj = Intrinsics.addStrAndObj("MockWebServer ", str);
            }
            m16676m(addStrAndObj);
            m16671r(interfaceC10187e);
            m16673p(interfaceC10186d);
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    /* renamed from: okhttp3.internal.http2.c$b */
    /* loaded from: classes2.dex */
    public static final class C8117b {
        private C8117b() {
        }

        public /* synthetic */ C8117b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Settings m16669a() {
            return Http2Connection.m16699h();
        }
    }

    /* compiled from: Http2Connection.kt */
    /* renamed from: okhttp3.internal.http2.c$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8118c {

        /* renamed from: a */
        public static final AbstractC8118c f21093a;

        /* compiled from: Http2Connection.kt */
        /* renamed from: okhttp3.internal.http2.c$c$a */
        /* loaded from: classes2.dex */
        public static final class C8119a extends AbstractC8118c {
            C8119a() {
            }

            /* renamed from: c */
            public void m16666c(Http2Stream http2Stream) throws IOException {
                Intrinsics.isThisObjectNull(http2Stream, "stream");
                http2Stream.m16598d(EnumC8112a.REFUSED_STREAM, null);
            }
        }

        /* compiled from: Http2Connection.kt */
        /* renamed from: okhttp3.internal.http2.c$c$b */
        /* loaded from: classes2.dex */
        public static final class C8120b {
            private C8120b() {
            }

            public /* synthetic */ C8120b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C8120b(null);
            f21093a = new C8119a();
        }

        /* renamed from: b */
        public void m16668b(Http2Connection http2Connection, Settings settings) {
            Intrinsics.isThisObjectNull(http2Connection, "connection");
            Intrinsics.isThisObjectNull(settings, "settings");
        }

        /* renamed from: c */
        public abstract void m16667c(Http2Stream http2Stream) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    /* renamed from: okhttp3.internal.http2.c$d */
    /* loaded from: classes2.dex */
    public final class C8121d implements Http2Reader.InterfaceC8136c, InterfaceC6097a {

        /* renamed from: w */
        private final Http2Reader f21094w;

        /* renamed from: x */
        final /* synthetic */ Http2Connection f21095x;

        /* compiled from: TaskQueue.kt */
        /* renamed from: okhttp3.internal.http2.c$d$a */
        /* loaded from: classes2.dex */
        public static final class C8122a extends Task {

            /* renamed from: e */
            final /* synthetic */ Http2Connection f21096e;

            /* renamed from: f */
            final /* synthetic */ C6449y f21097f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8122a(String str, boolean z, Http2Connection http2Connection, C6449y c6449y) {
                super(str, z);
                this.f21096e = http2Connection;
                this.f21097f = c6449y;
            }

            /* renamed from: f */
            public long mo20881f() {
                this.f21096e.m16696o0().m16668b(this.f21096e, (Settings) this.f21097f.f17533w);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        /* renamed from: okhttp3.internal.http2.c$d$b */
        /* loaded from: classes2.dex */
        public static final class C8123b extends Task {

            /* renamed from: e */
            final /* synthetic */ Http2Connection f21098e;

            /* renamed from: f */
            final /* synthetic */ Http2Stream f21099f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8123b(String str, boolean z, Http2Connection http2Connection, Http2Stream http2Stream) {
                super(str, z);
                this.f21098e = http2Connection;
                this.f21099f = http2Stream;
            }

            /* renamed from: f */
            public long mo20881f() {
                try {
                    this.f21098e.m16696o0().m16667c(this.f21099f);
                    return -1L;
                } catch (IOException e) {
                    Platform.f21214a.m16457g().m16469j(Intrinsics.addStrAndObj("Http2Connection.Listener failure for ", this.f21098e.m16698j0()), 4, e);
                    try {
                        this.f21099f.m16598d(EnumC8112a.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        /* renamed from: okhttp3.internal.http2.c$d$c */
        /* loaded from: classes2.dex */
        public static final class C8124c extends Task {

            /* renamed from: e */
            final /* synthetic */ Http2Connection f21100e;

            /* renamed from: f */
            final /* synthetic */ int f21101f;

            /* renamed from: g */
            final /* synthetic */ int f21102g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8124c(String str, boolean z, Http2Connection http2Connection, int i, int i2) {
                super(str, z);
                this.f21100e = http2Connection;
                this.f21101f = i;
                this.f21102g = i2;
            }

            /* renamed from: f */
            public long mo20881f() {
                this.f21100e.m16709a1(true, this.f21101f, this.f21102g);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        /* renamed from: okhttp3.internal.http2.c$d$d */
        /* loaded from: classes2.dex */
        public static final class C8125d extends Task {

            /* renamed from: e */
            final /* synthetic */ C8121d f21103e;

            /* renamed from: f */
            final /* synthetic */ boolean f21104f;

            /* renamed from: g */
            final /* synthetic */ Settings f21105g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8125d(String str, boolean z, C8121d c8121d, boolean z2, Settings settings) {
                super(str, z);
                this.f21103e = c8121d;
                this.f21104f = z2;
                this.f21105g = settings;
            }

            /* renamed from: f */
            public long mo20881f() {
                this.f21103e.m16655k(this.f21104f, this.f21105g);
                return -1L;
            }
        }

        public C8121d(Http2Connection http2Connection, Http2Reader http2Reader) {
            Intrinsics.isThisObjectNull(http2Connection, "this$0");
            Intrinsics.isThisObjectNull(http2Reader, "reader");
            this.f21095x = http2Connection;
            this.f21094w = http2Reader;
        }

        /* renamed from: a */
        public void m16665a() {
        }

        /* renamed from: b */
        public void m16664b(boolean z, int i, int i2) {
            if (z) {
                Http2Connection http2Connection = this.f21095x;
                synchronized (http2Connection) {
                    if (i == 1) {
                        Http2Connection.m16715X(http2Connection, Http2Connection.m16689y(http2Connection) + 1);
                    } else if (i != 2) {
                        if (i == 3) {
                            Http2Connection.m16726P(http2Connection, Http2Connection.m16706c(http2Connection) + 1);
                            http2Connection.notifyAll();
                        }
                        C13195u c13195u = C13195u.f34156a;
                    } else {
                        Http2Connection.m16723R(http2Connection, Http2Connection.m16694t(http2Connection) + 1);
                    }
                }
                return;
            }
            Http2Connection.m16732L(this.f21095x).m20872i(new C8124c(Intrinsics.addStrAndObj(this.f21095x.m16698j0(), " ping"), true, this.f21095x, i, i2), 0L);
        }

        /* renamed from: c */
        public void m16663c(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: d */
        public void m16662d(int i, EnumC8112a enumC8112a) {
            Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
            if (this.f21095x.m16727O0(i)) {
                this.f21095x.m16728N0(i, enumC8112a);
                return;
            }
            Http2Stream m16725P0 = this.f21095x.m16725P0(i);
            if (m16725P0 == null) {
                return;
            }
            m16725P0.m16577y(enumC8112a);
        }

        /* renamed from: e */
        public void m16661e(int i, EnumC8112a enumC8112a, ByteString byteString) {
            int i2;
            Object[] array;
            Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
            Intrinsics.isThisObjectNull(byteString, "debugData");
            byteString.size();
            Http2Connection http2Connection = this.f21095x;
            synchronized (http2Connection) {
                i2 = 0;
                array = http2Connection.m16743D0().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    Http2Connection.m16710a0(http2Connection, true);
                    C13195u c13195u = C13195u.f34156a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i2 < length) {
                Http2Stream http2Stream = http2StreamArr[i2];
                i2++;
                if (http2Stream.m16592j() > i && http2Stream.m16582t()) {
                    http2Stream.m16577y(EnumC8112a.REFUSED_STREAM);
                    this.f21095x.m16725P0(http2Stream.m16592j());
                }
            }
        }

        /* renamed from: f */
        public void m16660f(boolean z, int i, int i2, List list) {
            Intrinsics.isThisObjectNull(list, "headerBlock");
            if (this.f21095x.m16727O0(i)) {
                this.f21095x.m16731L0(i, list, z);
                return;
            }
            Http2Connection http2Connection = this.f21095x;
            synchronized (http2Connection) {
                Http2Stream m16744A0 = http2Connection.m16744A0(i);
                if (m16744A0 == null) {
                    if (Http2Connection.m16730M(http2Connection)) {
                        return;
                    }
                    if (i <= http2Connection.m16697l0()) {
                        return;
                    }
                    if (i % 2 == http2Connection.m16695q0() % 2) {
                        return;
                    }
                    Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.m23427P(list));
                    http2Connection.m16722R0(i);
                    http2Connection.m16743D0().put(Integer.valueOf(i), http2Stream);
                    TaskQueue m20857i = Http2Connection.m16737H(http2Connection).m20857i();
                    m20857i.m20872i(new C8123b(http2Connection.m16698j0() + '[' + i + "] onStream", true, http2Connection, http2Stream), 0L);
                    return;
                }
                C13195u c13195u = C13195u.f34156a;
                m16744A0.m16578x(Util.m23427P(list), z);
            }
        }

        /* renamed from: g */
        public void m16659g(boolean z, int i, InterfaceC10187e interfaceC10187e, int i2) throws IOException {
            Intrinsics.isThisObjectNull(interfaceC10187e, "source");
            if (this.f21095x.m16727O0(i)) {
                this.f21095x.m16733K0(i, interfaceC10187e, i2, z);
                return;
            }
            Http2Stream m16744A0 = this.f21095x.m16744A0(i);
            if (m16744A0 == null) {
                this.f21095x.m16705c1(i, EnumC8112a.PROTOCOL_ERROR);
                long j = i2;
                this.f21095x.m16714X0(j);
                interfaceC10187e.skip(j);
                return;
            }
            m16744A0.m16579w(interfaceC10187e, i2);
            if (z) {
                m16744A0.m16578x(Util.f15900b, true);
            }
        }

        /* renamed from: h */
        public void m16658h(boolean z, Settings settings) {
            Intrinsics.isThisObjectNull(settings, "settings");
            Http2Connection.m16732L(this.f21095x).m20872i(new C8125d(Intrinsics.addStrAndObj(this.f21095x.m16698j0(), " applyAndAckSettings"), true, this, z, settings), 0L);
        }

        /* renamed from: i */
        public void m16657i(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = this.f21095x;
                synchronized (http2Connection) {
                    Http2Connection.m16708b0(http2Connection, http2Connection.m16741E0() + j);
                    http2Connection.notifyAll();
                    C13195u c13195u = C13195u.f34156a;
                }
                return;
            }
            Http2Stream m16744A0 = this.f21095x.m16744A0(i);
            if (m16744A0 != null) {
                synchronized (m16744A0) {
                    m16744A0.m16601a(j);
                    C13195u c13195u2 = C13195u.f34156a;
                }
            }
        }

        /* renamed from: j */
        public void m16656j(int i, int i2, List list) {
            Intrinsics.isThisObjectNull(list, "requestHeaders");
            this.f21095x.m16729M0(i2, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public final void m16655k(boolean z, Settings settings) {
            T t;
            long m17647c;
            int i;
            Http2Stream[] http2StreamArr;
            Intrinsics.isThisObjectNull(settings, "settings");
            C6449y c6449y = new C6449y();
            Http2Writer m16738G0 = this.f21095x.m16738G0();
            Http2Connection http2Connection = this.f21095x;
            synchronized (m16738G0) {
                synchronized (http2Connection) {
                    Settings m16691v0 = http2Connection.m16691v0();
                    if (z) {
                        t = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.m17643g(m16691v0);
                        settings2.m17643g(settings);
                        t = settings2;
                    }
                    c6449y.f17533w = t;
                    m17647c = ((Settings) t).m17647c() - m16691v0.m17647c();
                    i = 0;
                    if (m17647c != 0 && !http2Connection.m16743D0().isEmpty()) {
                        Object[] array = http2Connection.m16743D0().values().toArray(new Http2Stream[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        http2StreamArr = (Http2Stream[]) array;
                        http2Connection.m16720T0((Settings) c6449y.f17533w);
                        Http2Connection.m16740F(http2Connection).m20872i(new C8122a(Intrinsics.addStrAndObj(http2Connection.m16698j0(), " onSettings"), true, http2Connection, c6449y), 0L);
                        C13195u c13195u = C13195u.f34156a;
                    }
                    http2StreamArr = null;
                    http2Connection.m16720T0((Settings) c6449y.f17533w);
                    Http2Connection.m16740F(http2Connection).m20872i(new C8122a(Intrinsics.addStrAndObj(http2Connection.m16698j0(), " onSettings"), true, http2Connection, c6449y), 0L);
                    C13195u c13195u2 = C13195u.f34156a;
                }
                try {
                    http2Connection.m16738G0().m16552a((Settings) c6449y.f17533w);
                } catch (IOException e) {
                    Http2Connection.m16711a(http2Connection, e);
                }
                C13195u c13195u3 = C13195u.f34156a;
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i < length) {
                    Http2Stream http2Stream = http2StreamArr[i];
                    i++;
                    synchronized (http2Stream) {
                        http2Stream.m16601a(m17647c);
                        C13195u c13195u4 = C13195u.f34156a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.d] */
        /* renamed from: l */
        public void m16654l() {
            EnumC8112a enumC8112a;
            EnumC8112a enumC8112a2;
            EnumC8112a enumC8112a3 = EnumC8112a.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.f21094w.m16632e(this);
                    while (this.f21094w.m16633c(false, this)) {
                    }
                    enumC8112a2 = EnumC8112a.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    enumC8112a = enumC8112a3;
                    this.f21095x.m16704d0(enumC8112a, enumC8112a3, e);
                    Util.m23404m(this.f21094w);
                    throw th;
                }
                try {
                    this.f21095x.m16704d0(enumC8112a2, EnumC8112a.CANCEL, null);
                    enumC8112a = enumC8112a2;
                } catch (IOException e3) {
                    e = e3;
                    EnumC8112a enumC8112a4 = EnumC8112a.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.f21095x;
                    http2Connection.m16704d0(enumC8112a4, enumC8112a4, e);
                    enumC8112a = http2Connection;
                    enumC8112a3 = this.f21094w;
                    Util.m23404m(enumC8112a3);
                }
                enumC8112a3 = this.f21094w;
                Util.m23404m(enumC8112a3);
            } catch (Throwable th3) {
                th = th3;
                this.f21095x.m16704d0(enumC8112a, enumC8112a3, e);
                Util.m23404m(this.f21094w);
                throw th;
            }
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m16654l();
            return C13195u.f34156a;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$e */
    /* loaded from: classes2.dex */
    public static final class C8126e extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21106e;

        /* renamed from: f */
        final /* synthetic */ int f21107f;

        /* renamed from: g */
        final /* synthetic */ Buffer f21108g;

        /* renamed from: h */
        final /* synthetic */ int f21109h;

        /* renamed from: i */
        final /* synthetic */ boolean f21110i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8126e(String str, boolean z, Http2Connection http2Connection, int i, Buffer buffer, int i2, boolean z2) {
            super(str, z);
            this.f21106e = http2Connection;
            this.f21107f = i;
            this.f21108g = buffer;
            this.f21109h = i2;
            this.f21110i = z2;
        }

        /* renamed from: f */
        public long mo20881f() {
            try {
                boolean m16536c = Http2Connection.m16742E(this.f21106e).m16536c(this.f21107f, this.f21108g, this.f21109h, this.f21110i);
                if (m16536c) {
                    this.f21106e.m16738G0().m16556L(this.f21107f, EnumC8112a.CANCEL);
                }
                if (m16536c || this.f21110i) {
                    synchronized (this.f21106e) {
                        Http2Connection.m16702e(this.f21106e).remove(Integer.valueOf(this.f21107f));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$f */
    /* loaded from: classes2.dex */
    public static final class C8127f extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21111e;

        /* renamed from: f */
        final /* synthetic */ int f21112f;

        /* renamed from: g */
        final /* synthetic */ List f21113g;

        /* renamed from: h */
        final /* synthetic */ boolean f21114h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8127f(String str, boolean z, Http2Connection http2Connection, int i, List list, boolean z2) {
            super(str, z);
            this.f21111e = http2Connection;
            this.f21112f = i;
            this.f21113g = list;
            this.f21114h = z2;
        }

        /* renamed from: f */
        public long mo20881f() {
            boolean m16537b = Http2Connection.m16742E(this.f21111e).m16537b(this.f21112f, this.f21113g, this.f21114h);
            if (m16537b) {
                try {
                    this.f21111e.m16738G0().m16556L(this.f21112f, EnumC8112a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (m16537b || this.f21114h) {
                synchronized (this.f21111e) {
                    Http2Connection.m16702e(this.f21111e).remove(Integer.valueOf(this.f21112f));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$g */
    /* loaded from: classes2.dex */
    public static final class C8128g extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21115e;

        /* renamed from: f */
        final /* synthetic */ int f21116f;

        /* renamed from: g */
        final /* synthetic */ List f21117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8128g(String str, boolean z, Http2Connection http2Connection, int i, List list) {
            super(str, z);
            this.f21115e = http2Connection;
            this.f21116f = i;
            this.f21117g = list;
        }

        /* renamed from: f */
        public long mo20881f() {
            if (Http2Connection.m16742E(this.f21115e).m16538a(this.f21116f, this.f21117g)) {
                try {
                    this.f21115e.m16738G0().m16556L(this.f21116f, EnumC8112a.CANCEL);
                    synchronized (this.f21115e) {
                        Http2Connection.m16702e(this.f21115e).remove(Integer.valueOf(this.f21116f));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$h */
    /* loaded from: classes2.dex */
    public static final class C8129h extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21118e;

        /* renamed from: f */
        final /* synthetic */ int f21119f;

        /* renamed from: g */
        final /* synthetic */ EnumC8112a f21120g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8129h(String str, boolean z, Http2Connection http2Connection, int i, EnumC8112a enumC8112a) {
            super(str, z);
            this.f21118e = http2Connection;
            this.f21119f = i;
            this.f21120g = enumC8112a;
        }

        /* renamed from: f */
        public long mo20881f() {
            Http2Connection.m16742E(this.f21118e).m16535d(this.f21119f, this.f21120g);
            synchronized (this.f21118e) {
                Http2Connection.m16702e(this.f21118e).remove(Integer.valueOf(this.f21119f));
                C13195u c13195u = C13195u.f34156a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$i */
    /* loaded from: classes2.dex */
    public static final class C8130i extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21121e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8130i(String str, boolean z, Http2Connection http2Connection) {
            super(str, z);
            this.f21121e = http2Connection;
        }

        /* renamed from: f */
        public long mo20881f() {
            this.f21121e.m16709a1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$j */
    /* loaded from: classes2.dex */
    public static final class C8131j extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21122e;

        /* renamed from: f */
        final /* synthetic */ long f21123f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8131j(String str, Http2Connection http2Connection, long j) {
            super(str, false, 2, null);
            this.f21122e = http2Connection;
            this.f21123f = j;
        }

        /* renamed from: f */
        public long mo20881f() {
            boolean z;
            synchronized (this.f21122e) {
                if (Http2Connection.m16689y(this.f21122e) < Http2Connection.m16692v(this.f21122e)) {
                    z = true;
                } else {
                    Http2Connection.m16717W(this.f21122e, Http2Connection.m16692v(this.f21122e) + 1);
                    z = false;
                }
            }
            if (z) {
                Http2Connection.m16711a(this.f21122e, null);
                return -1L;
            }
            this.f21122e.m16709a1(false, 1, 0);
            return this.f21123f;
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$k */
    /* loaded from: classes2.dex */
    public static final class C8132k extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21124e;

        /* renamed from: f */
        final /* synthetic */ int f21125f;

        /* renamed from: g */
        final /* synthetic */ EnumC8112a f21126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8132k(String str, boolean z, Http2Connection http2Connection, int i, EnumC8112a enumC8112a) {
            super(str, z);
            this.f21124e = http2Connection;
            this.f21125f = i;
            this.f21126g = enumC8112a;
        }

        /* renamed from: f */
        public long mo20881f() {
            try {
                this.f21124e.m16707b1(this.f21125f, this.f21126g);
                return -1L;
            } catch (IOException e) {
                Http2Connection.m16711a(this.f21124e, e);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: okhttp3.internal.http2.c$l */
    /* loaded from: classes2.dex */
    public static final class C8133l extends Task {

        /* renamed from: e */
        final /* synthetic */ Http2Connection f21127e;

        /* renamed from: f */
        final /* synthetic */ int f21128f;

        /* renamed from: g */
        final /* synthetic */ long f21129g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8133l(String str, boolean z, Http2Connection http2Connection, int i, long j) {
            super(str, z);
            this.f21127e = http2Connection;
            this.f21128f = i;
            this.f21129g = j;
        }

        /* renamed from: f */
        public long mo20881f() {
            try {
                this.f21127e.m16738G0().m16554P(this.f21128f, this.f21129g);
                return -1L;
            } catch (IOException e) {
                Http2Connection.m16711a(this.f21127e, e);
                return -1L;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.m17642h(7, 65535);
        settings.m17642h(5, 16384);
        f21055Z = settings;
    }

    public Http2Connection(C8116a c8116a) {
        Intrinsics.isThisObjectNull(c8116a, "builder");
        boolean m16687b = c8116a.m16687b();
        this.f21080w = m16687b;
        this.f21081x = c8116a.m16685d();
        this.f21082y = new LinkedHashMap();
        String m16686c = c8116a.m16686c();
        this.f21083z = m16686c;
        this.f21057B = c8116a.m16687b() ? 3 : 2;
        TaskRunner m16679j = c8116a.m16679j();
        this.f21059D = m16679j;
        TaskQueue m20857i = m16679j.m20857i();
        this.f21060E = m20857i;
        this.f21061F = m16679j.m20857i();
        this.f21062G = m16679j.m20857i();
        this.f21063H = c8116a.m16683f();
        Settings settings = new Settings();
        if (c8116a.m16687b()) {
            settings.m17642h(7, 16777216);
        }
        this.f21070O = settings;
        Settings settings2 = f21055Z;
        this.f21071P = settings2;
        this.f21075T = settings2.m17647c();
        this.f21076U = c8116a.m16681h();
        this.f21077V = new Http2Writer(c8116a.m16682g(), m16687b);
        this.f21078W = new C8121d(this, new Http2Reader(c8116a.m16680i(), m16687b));
        this.f21079X = new LinkedHashSet();
        if (c8116a.m16684e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(c8116a.m16684e());
            m20857i.m20872i(new C8131j(Intrinsics.addStrAndObj(m16686c, " ping"), this, nanos), nanos);
        }
    }

    /* renamed from: E */
    public static final /* synthetic */ PushObserver m16742E(Http2Connection http2Connection) {
        return http2Connection.f21063H;
    }

    /* renamed from: F */
    public static final /* synthetic */ TaskQueue m16740F(Http2Connection http2Connection) {
        return http2Connection.f21062G;
    }

    /* renamed from: H */
    public static final /* synthetic */ TaskRunner m16737H(Http2Connection http2Connection) {
        return http2Connection.f21059D;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0096, TryCatch #1 {, blocks: (B:4:0x0006, B:23:0x0062, B:25:0x0065, B:26:0x006d, B:28:0x0074, B:33:0x0084, B:34:0x008f, B:5:0x0007, B:7:0x0010, B:8:0x0015, B:10:0x0019, B:12:0x0033, B:14:0x003f, B:19:0x004f, B:21:0x0055, B:22:0x0060, B:35:0x0090, B:36:0x0095), top: B:43:0x0006 }] */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.http2.Http2Stream m16735I0(int r11, java.util.List r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.f r7 = r10.f21077V
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L99
            int r0 = r10.m16695q0()     // Catch: java.lang.Throwable -> L96
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.EnumC8112a.REFUSED_STREAM     // Catch: java.lang.Throwable -> L96
            r10.m16719U0(r0)     // Catch: java.lang.Throwable -> L96
        L15:
            boolean r0 = r10.f21058C     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L90
            int r8 = r10.m16695q0()     // Catch: java.lang.Throwable -> L96
            int r0 = r10.m16695q0()     // Catch: java.lang.Throwable -> L96
            int r0 = r0 + 2
            r10.m16721S0(r0)     // Catch: java.lang.Throwable -> L96
            okhttp3.internal.http2.e r9 = new okhttp3.internal.http2.e     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L96
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.m16739F0()     // Catch: java.lang.Throwable -> L96
            long r3 = r10.m16741E0()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.m16584r()     // Catch: java.lang.Throwable -> L96
            long r3 = r9.m16585q()     // Catch: java.lang.Throwable -> L96
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = r0
        L4f:
            boolean r1 = r9.m16581u()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.m16743D0()     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L96
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L96
        L60:
            yc.u r1 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L96
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L6d
            okhttp3.internal.http2.f r11 = r10.m16738G0()     // Catch: java.lang.Throwable -> L99
            r11.m16546y(r6, r8, r12)     // Catch: java.lang.Throwable -> L99
            goto L7b
        L6d:
            boolean r1 = r10.m16700f0()     // Catch: java.lang.Throwable -> L99
            r0 = r0 ^ r1
            if (r0 == 0) goto L84
            okhttp3.internal.http2.f r0 = r10.m16738G0()     // Catch: java.lang.Throwable -> L99
            r0.m16557H(r11, r8, r12)     // Catch: java.lang.Throwable -> L99
        L7b:
            monitor-exit(r7)
            if (r13 == 0) goto L83
            okhttp3.internal.http2.f r11 = r10.f21077V
            r11.flush()
        L83:
            return r9
        L84:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L99
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L99
            throw r12     // Catch: java.lang.Throwable -> L99
        L90:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L96
            r11.<init>()     // Catch: java.lang.Throwable -> L96
            throw r11     // Catch: java.lang.Throwable -> L96
        L96:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L99
            throw r11     // Catch: java.lang.Throwable -> L99
        L99:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.m16735I0(int, java.util.List, boolean):okhttp3.internal.http2.e");
    }

    /* renamed from: L */
    public static final /* synthetic */ TaskQueue m16732L(Http2Connection http2Connection) {
        return http2Connection.f21060E;
    }

    /* renamed from: M */
    public static final /* synthetic */ boolean m16730M(Http2Connection http2Connection) {
        return http2Connection.f21058C;
    }

    /* renamed from: P */
    public static final /* synthetic */ void m16726P(Http2Connection http2Connection, long j) {
        http2Connection.f21068M = j;
    }

    /* renamed from: R */
    public static final /* synthetic */ void m16723R(Http2Connection http2Connection, long j) {
        http2Connection.f21067L = j;
    }

    /* renamed from: W */
    public static final /* synthetic */ void m16717W(Http2Connection http2Connection, long j) {
        http2Connection.f21064I = j;
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m16716W0(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.f17553i;
        }
        http2Connection.m16718V0(z, taskRunner);
    }

    /* renamed from: X */
    public static final /* synthetic */ void m16715X(Http2Connection http2Connection, long j) {
        http2Connection.f21065J = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m16711a(Http2Connection http2Connection, IOException iOException) {
        http2Connection.m16701e0(iOException);
    }

    /* renamed from: a0 */
    public static final /* synthetic */ void m16710a0(Http2Connection http2Connection, boolean z) {
        http2Connection.f21058C = z;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ void m16708b0(Http2Connection http2Connection, long j) {
        http2Connection.f21075T = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ long m16706c(Http2Connection http2Connection) {
        return http2Connection.f21068M;
    }

    /* renamed from: e */
    public static final /* synthetic */ Set m16702e(Http2Connection http2Connection) {
        return http2Connection.f21079X;
    }

    /* renamed from: e0 */
    private final void m16701e0(IOException iOException) {
        EnumC8112a enumC8112a = EnumC8112a.PROTOCOL_ERROR;
        m16704d0(enumC8112a, enumC8112a, iOException);
    }

    /* renamed from: h */
    public static final /* synthetic */ Settings m16699h() {
        return f21055Z;
    }

    /* renamed from: t */
    public static final /* synthetic */ long m16694t(Http2Connection http2Connection) {
        return http2Connection.f21067L;
    }

    /* renamed from: v */
    public static final /* synthetic */ long m16692v(Http2Connection http2Connection) {
        return http2Connection.f21064I;
    }

    /* renamed from: y */
    public static final /* synthetic */ long m16689y(Http2Connection http2Connection) {
        return http2Connection.f21065J;
    }

    /* renamed from: A0 */
    public final synchronized Http2Stream m16744A0(int i) {
        return (Http2Stream) this.f21082y.get(Integer.valueOf(i));
    }

    /* renamed from: D0 */
    public final Map m16743D0() {
        return this.f21082y;
    }

    /* renamed from: E0 */
    public final long m16741E0() {
        return this.f21075T;
    }

    /* renamed from: F0 */
    public final long m16739F0() {
        return this.f21074S;
    }

    /* renamed from: G0 */
    public final Http2Writer m16738G0() {
        return this.f21077V;
    }

    /* renamed from: H0 */
    public final synchronized boolean m16736H0(long j) {
        if (this.f21058C) {
            return false;
        }
        if (this.f21067L < this.f21066K) {
            if (j >= this.f21069N) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public final Http2Stream m16734J0(List list, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(list, "requestHeaders");
        return m16735I0(0, list, z);
    }

    /* renamed from: K0 */
    public final void m16733K0(int i, InterfaceC10187e interfaceC10187e, int i2, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        Buffer buffer = new Buffer();
        long j = i2;
        interfaceC10187e.mo8750r0(j);
        interfaceC10187e.read(buffer, j);
        this.f21061F.m20872i(new C8126e(this.f21083z + '[' + i + "] onData", true, this, i, buffer, i2, z), 0L);
    }

    /* renamed from: L0 */
    public final void m16731L0(int i, List list, boolean z) {
        Intrinsics.isThisObjectNull(list, "requestHeaders");
        TaskQueue taskQueue = this.f21061F;
        taskQueue.m20872i(new C8127f(this.f21083z + '[' + i + "] onHeaders", true, this, i, list, z), 0L);
    }

    /* renamed from: M0 */
    public final void m16729M0(int i, List list) {
        Intrinsics.isThisObjectNull(list, "requestHeaders");
        synchronized (this) {
            if (this.f21079X.contains(Integer.valueOf(i))) {
                m16705c1(i, EnumC8112a.PROTOCOL_ERROR);
                return;
            }
            this.f21079X.add(Integer.valueOf(i));
            TaskQueue taskQueue = this.f21061F;
            taskQueue.m20872i(new C8128g(this.f21083z + '[' + i + "] onRequest", true, this, i, list), 0L);
        }
    }

    /* renamed from: N0 */
    public final void m16728N0(int i, EnumC8112a enumC8112a) {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        TaskQueue taskQueue = this.f21061F;
        taskQueue.m20872i(new C8129h(this.f21083z + '[' + i + "] onReset", true, this, i, enumC8112a), 0L);
    }

    /* renamed from: O0 */
    public final boolean m16727O0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: P0 */
    public final synchronized Http2Stream m16725P0(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f21082y.remove(Integer.valueOf(i));
        notifyAll();
        return http2Stream;
    }

    /* renamed from: Q0 */
    public final void m16724Q0() {
        synchronized (this) {
            long j = this.f21067L;
            long j2 = this.f21066K;
            if (j < j2) {
                return;
            }
            this.f21066K = j2 + 1;
            this.f21069N = System.nanoTime() + 1000000000;
            C13195u c13195u = C13195u.f34156a;
            this.f21060E.m20872i(new C8130i(Intrinsics.addStrAndObj(this.f21083z, " ping"), true, this), 0L);
        }
    }

    /* renamed from: R0 */
    public final void m16722R0(int i) {
        this.f21056A = i;
    }

    /* renamed from: S0 */
    public final void m16721S0(int i) {
        this.f21057B = i;
    }

    /* renamed from: T0 */
    public final void m16720T0(Settings settings) {
        Intrinsics.isThisObjectNull(settings, "<set-?>");
        this.f21071P = settings;
    }

    /* renamed from: U0 */
    public final void m16719U0(EnumC8112a enumC8112a) throws IOException {
        Intrinsics.isThisObjectNull(enumC8112a, "statusCode");
        synchronized (this.f21077V) {
            C6447w c6447w = new C6447w();
            synchronized (this) {
                if (this.f21058C) {
                    return;
                }
                this.f21058C = true;
                c6447w.f17531w = m16697l0();
                C13195u c13195u = C13195u.f34156a;
                m16738G0().m16547v(c6447w.f17531w, enumC8112a, Util.f15899a);
            }
        }
    }

    /* renamed from: V0 */
    public final void m16718V0(boolean z, TaskRunner taskRunner) throws IOException {
        Intrinsics.isThisObjectNull(taskRunner, "taskRunner");
        if (z) {
            this.f21077V.m16551c();
            this.f21077V.m16555M(this.f21070O);
            int m17647c = this.f21070O.m17647c();
            if (m17647c != 65535) {
                this.f21077V.m16554P(0, m17647c - 65535);
            }
        }
        taskRunner.m20857i().m20872i(new C6452c(this.f21083z, true, this.f21078W), 0L);
    }

    /* renamed from: X0 */
    public final synchronized void m16714X0(long j) {
        long j2 = this.f21072Q + j;
        this.f21072Q = j2;
        long j3 = j2 - this.f21073R;
        if (j3 >= this.f21070O.m17647c() / 2) {
            m16703d1(0, j3);
            this.f21073R += j3;
        }
    }

    /* renamed from: Y0 */
    public final void m16713Y0(int i, boolean z, Buffer buffer, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.f21077V.m16550e(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (m16739F0() >= m16741E0()) {
                    try {
                        if (m16743D0().containsKey(Integer.valueOf(i))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, m16741E0() - m16739F0()), m16738G0().m16559E());
                j2 = min;
                this.f21074S = m16739F0() + j2;
                C13195u c13195u = C13195u.f34156a;
            }
            j -= j2;
            this.f21077V.m16550e(z && j == 0, i, buffer, min);
        }
    }

    /* renamed from: Z0 */
    public final void m16712Z0(int i, boolean z, List list) throws IOException {
        Intrinsics.isThisObjectNull(list, "alternating");
        this.f21077V.m16546y(z, i, list);
    }

    /* renamed from: a1 */
    public final void m16709a1(boolean z, int i, int i2) {
        try {
            this.f21077V.m16558F(z, i, i2);
        } catch (IOException e) {
            m16701e0(e);
        }
    }

    /* renamed from: b1 */
    public final void m16707b1(int i, EnumC8112a enumC8112a) throws IOException {
        Intrinsics.isThisObjectNull(enumC8112a, "statusCode");
        this.f21077V.m16556L(i, enumC8112a);
    }

    /* renamed from: c1 */
    public final void m16705c1(int i, EnumC8112a enumC8112a) {
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        TaskQueue taskQueue = this.f21060E;
        taskQueue.m20872i(new C8132k(this.f21083z + '[' + i + "] writeSynReset", true, this, i, enumC8112a), 0L);
    }

    public void close() {
        m16704d0(EnumC8112a.NO_ERROR, EnumC8112a.CANCEL, null);
    }

    /* renamed from: d0 */
    public final void m16704d0(EnumC8112a enumC8112a, EnumC8112a enumC8112a2, IOException iOException) {
        int i;
        Intrinsics.isThisObjectNull(enumC8112a, "connectionCode");
        Intrinsics.isThisObjectNull(enumC8112a2, "streamCode");
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            m16719U0(enumC8112a);
        } catch (IOException unused) {
        }
        Object[] objArr = null;
        synchronized (this) {
            if (!m16743D0().isEmpty()) {
                objArr = m16743D0().values().toArray(new Http2Stream[0]);
                if (objArr != null) {
                    m16743D0().clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.m16598d(enumC8112a2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            m16738G0().close();
        } catch (IOException unused3) {
        }
        try {
            m16690x0().close();
        } catch (IOException unused4) {
        }
        this.f21060E.m20866o();
        this.f21061F.m20866o();
        this.f21062G.m20866o();
    }

    /* renamed from: d1 */
    public final void m16703d1(int i, long j) {
        TaskQueue taskQueue = this.f21060E;
        taskQueue.m20872i(new C8133l(this.f21083z + '[' + i + "] windowUpdate", true, this, i, j), 0L);
    }

    /* renamed from: f0 */
    public final boolean m16700f0() {
        return this.f21080w;
    }

    public final void flush() throws IOException {
        this.f21077V.flush();
    }

    /* renamed from: j0 */
    public final String m16698j0() {
        return this.f21083z;
    }

    /* renamed from: l0 */
    public final int m16697l0() {
        return this.f21056A;
    }

    /* renamed from: o0 */
    public final AbstractC8118c m16696o0() {
        return this.f21081x;
    }

    /* renamed from: q0 */
    public final int m16695q0() {
        return this.f21057B;
    }

    /* renamed from: t0 */
    public final Settings m16693t0() {
        return this.f21070O;
    }

    /* renamed from: v0 */
    public final Settings m16691v0() {
        return this.f21071P;
    }

    /* renamed from: x0 */
    public final Socket m16690x0() {
        return this.f21076U;
    }
}
