package p107ff;

import ad.C0127b;
import gf.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc._Collections;

/* renamed from: ff.l */
/* loaded from: classes2.dex */
public final class ConnectionSpec {

    /* renamed from: e */
    private static final CipherSuite[] f15489e;

    /* renamed from: f */
    private static final CipherSuite[] f15490f;

    /* renamed from: g */
    public static final ConnectionSpec f15491g;

    /* renamed from: h */
    public static final ConnectionSpec f15492h;

    /* renamed from: a */
    private final boolean f15493a;

    /* renamed from: b */
    private final boolean f15494b;

    /* renamed from: c */
    private final String[] f15495c;

    /* renamed from: d */
    private final String[] f15496d;

    /* compiled from: ConnectionSpec.kt */
    /* renamed from: ff.l$b */
    /* loaded from: classes2.dex */
    public static final class C5484b {
        private C5484b() {
        }

        public /* synthetic */ C5484b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5484b(null);
        CipherSuite cipherSuite = CipherSuite.f15484r;
        CipherSuite cipherSuite2 = CipherSuite.f15485s;
        CipherSuite cipherSuite3 = CipherSuite.f15486t;
        CipherSuite cipherSuite4 = CipherSuite.f15478l;
        CipherSuite cipherSuite5 = CipherSuite.f15480n;
        CipherSuite cipherSuite6 = CipherSuite.f15479m;
        CipherSuite cipherSuite7 = CipherSuite.f15481o;
        CipherSuite cipherSuite8 = CipherSuite.f15483q;
        CipherSuite cipherSuite9 = CipherSuite.f15482p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f15489e = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f15476j, CipherSuite.f15477k, CipherSuite.f15474h, CipherSuite.f15475i, CipherSuite.f15472f, CipherSuite.f15473g, CipherSuite.f15471e};
        f15490f = cipherSuiteArr2;
        C5483a m24107b = new C5483a(true).m24107b((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        m24107b.m24100i(tlsVersion, tlsVersion2).m24101h(true).m24108a();
        f15491g = new C5483a(true).m24107b((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m24100i(tlsVersion, tlsVersion2).m24101h(true).m24108a();
        new C5483a(true).m24107b((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).m24100i(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m24101h(true).m24108a();
        f15492h = new C5483a(false).m24108a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f15493a = z;
        this.f15494b = z2;
        this.f15495c = strArr;
        this.f15496d = strArr2;
    }

    /* renamed from: a */
    public static final /* synthetic */ String[] m24117a(ConnectionSpec connectionSpec) {
        return connectionSpec.f15495c;
    }

    /* renamed from: b */
    public static final /* synthetic */ String[] m24116b(ConnectionSpec connectionSpec) {
        return connectionSpec.f15496d;
    }

    /* renamed from: g */
    private final ConnectionSpec m24111g(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        Comparator m41794b;
        if (this.f15495c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkIfNull(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = Util.m23438E(enabledCipherSuites2, this.f15495c, CipherSuite.f15468b.m24122c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15496d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Intrinsics.checkIfNull(enabledProtocols2, "sslSocket.enabledProtocols");
            String[] strArr = this.f15496d;
            m41794b = C0127b.m41794b();
            enabledProtocols = Util.m23438E(enabledProtocols2, strArr, m41794b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkIfNull(supportedCipherSuites, "supportedCipherSuites");
        int m23393x = Util.m23393x(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f15468b.m24122c());
        if (z && m23393x != -1) {
            Intrinsics.checkIfNull(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[m23393x];
            Intrinsics.checkIfNull(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = Util.m23402o(enabledCipherSuites, str);
        }
        C5483a c5483a = new C5483a(this);
        Intrinsics.checkIfNull(enabledCipherSuites, "cipherSuitesIntersection");
        C5483a m24106c = c5483a.m24106c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics.checkIfNull(enabledProtocols, "tlsVersionsIntersection");
        return m24106c.m24099j((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m24108a();
    }

    /* renamed from: c */
    public final void m24115c(SSLSocket sSLSocket, boolean z) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        ConnectionSpec m24111g = m24111g(sSLSocket, z);
        if (m24111g.m24109i() != null) {
            sSLSocket.setEnabledProtocols(m24111g.f15496d);
        }
        if (m24111g.m24114d() != null) {
            sSLSocket.setEnabledCipherSuites(m24111g.f15495c);
        }
    }

    /* renamed from: d */
    public final List m24114d() {
        List m455n0;
        String[] strArr = this.f15495c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f15468b.m24123b(str));
        }
        m455n0 = _Collections.m455n0(arrayList);
        return m455n0;
    }

    /* renamed from: e */
    public final boolean m24113e(SSLSocket sSLSocket) {
        Comparator m41794b;
        Intrinsics.isThisObjectNull(sSLSocket, "socket");
        if (this.f15493a) {
            String[] strArr = this.f15496d;
            if (strArr != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                m41794b = C0127b.m41794b();
                if (!Util.m23396u(strArr, enabledProtocols, m41794b)) {
                    return false;
                }
            }
            String[] strArr2 = this.f15495c;
            return strArr2 == null || Util.m23396u(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.f15468b.m24122c());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConnectionSpec) {
            if (obj == this) {
                return true;
            }
            boolean z = this.f15493a;
            ConnectionSpec connectionSpec = (ConnectionSpec) obj;
            if (z != connectionSpec.f15493a) {
                return false;
            }
            return !z || (Arrays.equals(this.f15495c, connectionSpec.f15495c) && Arrays.equals(this.f15496d, connectionSpec.f15496d) && this.f15494b == connectionSpec.f15494b);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m24112f() {
        return this.f15493a;
    }

    /* renamed from: h */
    public final boolean m24110h() {
        return this.f15494b;
    }

    public int hashCode() {
        if (this.f15493a) {
            String[] strArr = this.f15495c;
            int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
            String[] strArr2 = this.f15496d;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f15494b ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: i */
    public final List m24109i() {
        List m455n0;
        String[] strArr = this.f15496d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.m24132a(str));
        }
        m455n0 = _Collections.m455n0(arrayList);
        return m455n0;
    }

    public String toString() {
        if (this.f15493a) {
            return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(m24114d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(m24109i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f15494b + ')';
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.kt */
    /* renamed from: ff.l$a */
    /* loaded from: classes2.dex */
    public static final class C5483a {

        /* renamed from: a */
        private boolean f15497a;

        /* renamed from: b */
        private String[] f15498b;

        /* renamed from: c */
        private String[] f15499c;

        /* renamed from: d */
        private boolean f15500d;

        public C5483a(boolean z) {
            this.f15497a = z;
        }

        /* renamed from: a */
        public final ConnectionSpec m24108a() {
            return new ConnectionSpec(this.f15497a, this.f15500d, this.f15498b, this.f15499c);
        }

        /* renamed from: b */
        public final C5483a m24107b(CipherSuite... cipherSuiteArr) {
            Intrinsics.isThisObjectNull(cipherSuiteArr, "cipherSuites");
            if (m24105d()) {
                ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite cipherSuite : cipherSuiteArr) {
                    arrayList.add(cipherSuite.m24126c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                return m24106c((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C5483a m24106c(String... strArr) {
            Intrinsics.isThisObjectNull(strArr, "cipherSuites");
            if (m24105d()) {
                if (!(strArr.length == 0)) {
                    m24104e((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final boolean m24105d() {
            return this.f15497a;
        }

        /* renamed from: e */
        public final void m24104e(String[] strArr) {
            this.f15498b = strArr;
        }

        /* renamed from: f */
        public final void m24103f(boolean z) {
            this.f15500d = z;
        }

        /* renamed from: g */
        public final void m24102g(String[] strArr) {
            this.f15499c = strArr;
        }

        /* renamed from: h */
        public final C5483a m24101h(boolean z) {
            if (m24105d()) {
                m24103f(z);
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: i */
        public final C5483a m24100i(TlsVersion... tlsVersionArr) {
            Intrinsics.isThisObjectNull(tlsVersionArr, "tlsVersions");
            if (m24105d()) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion tlsVersion : tlsVersionArr) {
                    arrayList.add(tlsVersion.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                return m24099j((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: j */
        public final C5483a m24099j(String... strArr) {
            Intrinsics.isThisObjectNull(strArr, "tlsVersions");
            if (m24105d()) {
                if (!(strArr.length == 0)) {
                    m24102g((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C5483a(ConnectionSpec connectionSpec) {
            Intrinsics.isThisObjectNull(connectionSpec, "connectionSpec");
            this.f15497a = connectionSpec.m24112f();
            this.f15498b = ConnectionSpec.m24117a(connectionSpec);
            this.f15499c = ConnectionSpec.m24116b(connectionSpec);
            this.f15500d = connectionSpec.m24110h();
        }
    }
}
