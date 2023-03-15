package gf;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import nf.Header;
import p107ff.EventListener;
import p107ff.Headers;
import p107ff.HttpUrl;
import p107ff.InterfaceC5469e;
import p107ff.OkHttpClient;
import p107ff.RequestBody;
import p107ff.Response;
import p107ff.ResponseBody;
import p181jd.C6426b;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10191h0;
import p356sf.Options;
import p468yc.Exceptions;
import p489zc.AbstractC13762g0;
import p489zc.C13769l0;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc._Arrays;
import p489zc._Collections;
import sd.C10150d;
import sd.C10156i;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: gf.d */
/* loaded from: classes2.dex */
public final class Util {

    /* renamed from: a */
    public static final byte[] f15899a;

    /* renamed from: b */
    public static final Headers f15900b = Headers.f15540x.m23992g(new String[0]);

    /* renamed from: c */
    public static final ResponseBody f15901c;

    /* renamed from: d */
    private static final Options f15902d;

    /* renamed from: e */
    public static final TimeZone f15903e;

    /* renamed from: f */
    private static final C10156i f15904f;

    /* renamed from: g */
    public static final boolean f15905g;

    /* renamed from: h */
    public static final String f15906h;

    static {
        String m8891i0;
        String m8889k0;
        byte[] bArr = new byte[0];
        f15899a = bArr;
        f15901c = ResponseBody.C5472b.m24152i(ResponseBody.Companion, bArr, null, 1, null);
        RequestBody.C5462a.m24234o(RequestBody.Companion, bArr, null, 0, 0, 7, null);
        Options.C10203a c10203a = Options.f26590z;
        ByteString.C10188a c10188a = ByteString.f26546z;
        f15902d = c10203a.m8533d(c10188a.m8694b("efbbbf"), c10188a.m8694b("feff"), c10188a.m8694b("fffe"), c10188a.m8694b("0000ffff"), c10188a.m8694b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.ifNullDoSomething(timeZone);
        f15903e = timeZone;
        f15904f = new C10156i("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f15905g = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkIfNull(name, "OkHttpClient::class.java.name");
        m8891i0 = C10171u.m8891i0(name, "okhttp3.");
        m8889k0 = C10171u.m8889k0(m8891i0, "Client");
        f15906h = m8889k0;
    }

    /* renamed from: A */
    public static /* synthetic */ int m23442A(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23391z(str, i, i2);
    }

    /* renamed from: B */
    public static final int m23441B(String str, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    /* renamed from: C */
    public static /* synthetic */ int m23440C(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23441B(str, i, i2);
    }

    /* renamed from: D */
    public static final int m23439D(String str, int i) {
        Intrinsics.isThisObjectNull(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    /* renamed from: E */
    public static final String[] m23438E(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.isThisObjectNull(strArr, "<this>");
        Intrinsics.isThisObjectNull(strArr2, "other");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String str2 = strArr2[i2];
                    i2++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: F */
    public static final boolean m23437F(Socket socket, InterfaceC10187e interfaceC10187e) {
        Intrinsics.isThisObjectNull(socket, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !interfaceC10187e.mo8762Q();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: G */
    public static final boolean m23436G(String str) {
        boolean m8943q;
        boolean m8943q2;
        boolean m8943q3;
        boolean m8943q4;
        Intrinsics.isThisObjectNull(str, "name");
        m8943q = StringsJVM.m8943q(str, "Authorization", true);
        if (m8943q) {
            return true;
        }
        m8943q2 = StringsJVM.m8943q(str, "Cookie", true);
        if (m8943q2) {
            return true;
        }
        m8943q3 = StringsJVM.m8943q(str, "Proxy-Authorization", true);
        if (m8943q3) {
            return true;
        }
        m8943q4 = StringsJVM.m8943q(str, "Set-Cookie", true);
        return m8943q4;
    }

    /* renamed from: H */
    public static final int m23435H(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: I */
    public static final Charset m23434I(InterfaceC10187e interfaceC10187e, Charset charset) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
        Intrinsics.isThisObjectNull(charset, "default");
        int mo8766I = interfaceC10187e.mo8766I(f15902d);
        if (mo8766I != -1) {
            if (mo8766I == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                Intrinsics.checkIfNull(charset2, "UTF_8");
                return charset2;
            } else if (mo8766I == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                Intrinsics.checkIfNull(charset3, "UTF_16BE");
                return charset3;
            } else if (mo8766I == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                Intrinsics.checkIfNull(charset4, "UTF_16LE");
                return charset4;
            } else if (mo8766I != 3) {
                if (mo8766I == 4) {
                    return C10150d.f26471a.m9037b();
                }
                throw new AssertionError();
            } else {
                return C10150d.f26471a.m9038a();
            }
        }
        return charset;
    }

    /* renamed from: J */
    public static final int m23433J(InterfaceC10187e interfaceC10187e) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10187e, "<this>");
        return m23413d(interfaceC10187e.readByte(), 255) | (m23413d(interfaceC10187e.readByte(), 255) << 16) | (m23413d(interfaceC10187e.readByte(), 255) << 8);
    }

    /* renamed from: K */
    public static final int m23432K(Buffer buffer, byte b) {
        Intrinsics.isThisObjectNull(buffer, "<this>");
        int i = 0;
        while (!buffer.mo8762Q() && buffer.m8811L(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        r11.mo40537timeout().m8652a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        r11.mo40537timeout().m8649d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        return r12;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m23431L(p356sf.InterfaceC10191h0 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            p181jd.Intrinsics.isThisObjectNull(r11, r0)
            java.lang.String r0 = "timeUnit"
            p181jd.Intrinsics.isThisObjectNull(r13, r0)
            long r0 = java.lang.System.nanoTime()
            sf.i0 r2 = r11.mo40537timeout()
            boolean r2 = r2.m8648e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            sf.i0 r2 = r11.mo40537timeout()
            long r5 = r2.m8650c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            sf.i0 r2 = r11.mo40537timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.m8649d(r12)
            sf.c r12 = new sf.c     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.m8805a()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            sf.i0 r11 = r11.mo40537timeout()
            r11.m8652a()
            goto L80
        L5b:
            sf.i0 r11 = r11.mo40537timeout()
            long r0 = r0 + r5
            r11.m8649d(r0)
            goto L80
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            sf.i0 r11 = r11.mo40537timeout()
            r11.m8652a()
            goto L79
        L71:
            sf.i0 r11 = r11.mo40537timeout()
            long r0 = r0 + r5
            r11.m8649d(r0)
        L79:
            throw r12
        L7a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.Util.m23431L(sf.h0, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: M */
    public static final ThreadFactory m23430M(final String str, final boolean z) {
        Intrinsics.isThisObjectNull(str, "name");
        return new ThreadFactory() { // from class: gf.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m23429N;
                m23429N = Util.m23429N(str, z, runnable);
                return m23429N;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final Thread m23429N(String str, boolean z, Runnable runnable) {
        Intrinsics.isThisObjectNull(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: O */
    public static final List m23428O(Headers headers) {
        C8611f m14992q;
        int m186r;
        Intrinsics.isThisObjectNull(headers, "<this>");
        m14992q = _Ranges.m14992q(0, headers.size());
        m186r = Iterables.m186r(m14992q, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator<Integer> it = m14992q.iterator();
        while (it.hasNext()) {
            int mo404a = ((AbstractC13762g0) it).mo404a();
            arrayList.add(new Header(headers.m24012h(mo404a), headers.m24009p(mo404a)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final Headers m23427P(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        Headers.C5498a c5498a = new Headers.C5498a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            c5498a.m24004d(header.m17666a().m8722F(), header.m17665b().m8722F());
        }
        return c5498a.m24002f();
    }

    /* renamed from: Q */
    public static final String m23426Q(HttpUrl httpUrl, boolean z) {
        boolean m8922H;
        String m23983i;
        Intrinsics.isThisObjectNull(httpUrl, "<this>");
        m8922H = C10171u.m8922H(httpUrl.m23983i(), ":", false, 2, null);
        if (m8922H) {
            m23983i = '[' + httpUrl.m23983i() + ']';
        } else {
            m23983i = httpUrl.m23983i();
        }
        if (z || httpUrl.m23978n() != HttpUrl.f15543k.m23929c(httpUrl.m23974r())) {
            return m23983i + ':' + httpUrl.m23978n();
        }
        return m23983i;
    }

    /* renamed from: R */
    public static /* synthetic */ String m23425R(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m23426Q(httpUrl, z);
    }

    /* renamed from: S */
    public static final List m23424S(List list) {
        List m453p0;
        Intrinsics.isThisObjectNull(list, "<this>");
        m453p0 = _Collections.m453p0(list);
        List unmodifiableList = Collections.unmodifiableList(m453p0);
        Intrinsics.checkIfNull(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: T */
    public static final Map m23423T(Map map) {
        Map m334e;
        Intrinsics.isThisObjectNull(map, "<this>");
        if (map.isEmpty()) {
            m334e = C13769l0.m334e();
            return m334e;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkIfNull(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    /* renamed from: U */
    public static final long m23422U(String str, long j) {
        Intrinsics.isThisObjectNull(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: V */
    public static final int m23421V(String str, int i) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (valueOf == null) {
            return i;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Reader.READ_DONE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    /* renamed from: W */
    public static final String m23420W(String str, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "<this>");
        int m23391z = m23391z(str, i, i2);
        String substring = str.substring(m23391z, m23441B(str, m23391z, i2));
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: X */
    public static /* synthetic */ String m23419X(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23420W(str, i, i2);
    }

    /* renamed from: Y */
    public static final Throwable m23418Y(Exception exc, List list) {
        Intrinsics.isThisObjectNull(exc, "<this>");
        Intrinsics.isThisObjectNull(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Exceptions.m1470a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: Z */
    public static final void m23417Z(InterfaceC10186d interfaceC10186d, int i) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10186d, "<this>");
        interfaceC10186d.mo8780S((i >>> 16) & 255);
        interfaceC10186d.mo8780S((i >>> 8) & 255);
        interfaceC10186d.mo8780S(i & 255);
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m23416a(String str, boolean z, Runnable runnable) {
        return m23429N(str, z, runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ EventListener m23415b(EventListener eventListener, InterfaceC5469e interfaceC5469e) {
        return m23409h(eventListener, interfaceC5469e);
    }

    /* renamed from: c */
    public static final void m23414c(List list, Object obj) {
        Intrinsics.isThisObjectNull(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    /* renamed from: d */
    public static final int m23413d(byte b, int i) {
        return b & i;
    }

    /* renamed from: e */
    public static final int m23412e(short s, int i) {
        return s & i;
    }

    /* renamed from: f */
    public static final long m23411f(int i, long j) {
        return i & j;
    }

    /* renamed from: g */
    public static final EventListener.InterfaceC5492c m23410g(final EventListener eventListener) {
        Intrinsics.isThisObjectNull(eventListener, "<this>");
        return new EventListener.InterfaceC5492c() { // from class: gf.b
            @Override // p107ff.EventListener.InterfaceC5492c
            /* renamed from: a */
            public final EventListener mo23443a(InterfaceC5469e interfaceC5469e) {
                EventListener m23409h;
                m23409h = Util.m23409h(EventListener.this, interfaceC5469e);
                return m23409h;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final EventListener m23409h(EventListener eventListener, InterfaceC5469e interfaceC5469e) {
        Intrinsics.isThisObjectNull(eventListener, "$this_asFactory");
        Intrinsics.isThisObjectNull(interfaceC5469e, "it");
        return eventListener;
    }

    /* renamed from: i */
    public static final boolean m23408i(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        return f15904f.m9021d(str);
    }

    /* renamed from: j */
    public static final boolean m23407j(HttpUrl httpUrl, HttpUrl httpUrl2) {
        Intrinsics.isThisObjectNull(httpUrl, "<this>");
        Intrinsics.isThisObjectNull(httpUrl2, "other");
        return Intrinsics.equals(httpUrl.m23983i(), httpUrl2.m23983i()) && httpUrl.m23978n() == httpUrl2.m23978n() && Intrinsics.equals(httpUrl.m23974r(), httpUrl2.m23974r());
    }

    /* renamed from: k */
    public static final int m23406k(String str, long j, TimeUnit timeUnit) {
        Intrinsics.isThisObjectNull(str, "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, " too small.").toString());
                }
                throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj(str, " < 0").toString());
    }

    /* renamed from: l */
    public static final void m23405l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m23404m(Closeable closeable) {
        Intrinsics.isThisObjectNull(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m23403n(Socket socket) {
        Intrinsics.isThisObjectNull(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.equals(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static final String[] m23402o(String[] strArr, String str) {
        int m289E;
        Intrinsics.isThisObjectNull(strArr, "<this>");
        Intrinsics.isThisObjectNull(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        m289E = _Arrays.m289E(strArr2);
        strArr2[m289E] = str;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m23401p(String str, char c, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: q */
    public static final int m23400q(String str, String str2, int i, int i2) {
        boolean m8924G;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            m8924G = C10171u.m8924G(str2, str.charAt(i), false, 2, null);
            if (m8924G) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: r */
    public static /* synthetic */ int m23399r(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m23401p(str, c, i, i2);
    }

    /* renamed from: s */
    public static final boolean m23398s(InterfaceC10191h0 interfaceC10191h0, int i, TimeUnit timeUnit) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "<this>");
        Intrinsics.isThisObjectNull(timeUnit, "timeUnit");
        try {
            return m23431L(interfaceC10191h0, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m23397t(String str, Object... objArr) {
        Intrinsics.isThisObjectNull(str, "format");
        Intrinsics.isThisObjectNull(objArr, "args");
        C6429c0 c6429c0 = C6429c0.f17515a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkIfNull(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: u */
    public static final boolean m23396u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.isThisObjectNull(strArr, "<this>");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator m20963a = C6426b.m20963a(strArr2);
                    while (m20963a.hasNext()) {
                        if (comparator.compare(str, (String) m20963a.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static final long m23395v(Response response) {
        Intrinsics.isThisObjectNull(response, "<this>");
        String m24014b = response.m24211H().m24014b("Content-Length");
        if (m24014b == null) {
            return -1L;
        }
        return m23422U(m24014b, -1L);
    }

    @SafeVarargs
    /* renamed from: w */
    public static final List m23394w(Object... objArr) {
        List m194j;
        Intrinsics.isThisObjectNull(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        m194j = C13780s.m194j(Arrays.copyOf(objArr2, objArr2.length));
        List unmodifiableList = Collections.unmodifiableList(m194j);
        Intrinsics.checkIfNull(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: x */
    public static final int m23393x(String[] strArr, String str, Comparator comparator) {
        Intrinsics.isThisObjectNull(strArr, "<this>");
        Intrinsics.isThisObjectNull(str, "value");
        Intrinsics.isThisObjectNull(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m23392y(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (Intrinsics.isLessOrEqual(charAt, 31) <= 0 || Intrinsics.isLessOrEqual(charAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m23391z(String str, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                return i;
            }
            i = i3;
        }
        return i2;
    }
}
