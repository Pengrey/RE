package p107ff;

import androidx.constraintlayout.widget.C0868i;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: ff.i */
/* loaded from: classes2.dex */
public final class CipherSuite {

    /* renamed from: b */
    public static final C5481b f15468b;

    /* renamed from: c */
    private static final Comparator f15469c;

    /* renamed from: d */
    private static final Map f15470d;

    /* renamed from: e */
    public static final CipherSuite f15471e;

    /* renamed from: f */
    public static final CipherSuite f15472f;

    /* renamed from: g */
    public static final CipherSuite f15473g;

    /* renamed from: h */
    public static final CipherSuite f15474h;

    /* renamed from: i */
    public static final CipherSuite f15475i;

    /* renamed from: j */
    public static final CipherSuite f15476j;

    /* renamed from: k */
    public static final CipherSuite f15477k;

    /* renamed from: l */
    public static final CipherSuite f15478l;

    /* renamed from: m */
    public static final CipherSuite f15479m;

    /* renamed from: n */
    public static final CipherSuite f15480n;

    /* renamed from: o */
    public static final CipherSuite f15481o;

    /* renamed from: p */
    public static final CipherSuite f15482p;

    /* renamed from: q */
    public static final CipherSuite f15483q;

    /* renamed from: r */
    public static final CipherSuite f15484r;

    /* renamed from: s */
    public static final CipherSuite f15485s;

    /* renamed from: t */
    public static final CipherSuite f15486t;

    /* renamed from: a */
    private final String f15487a;

    /* compiled from: CipherSuite.kt */
    /* renamed from: ff.i$a */
    /* loaded from: classes2.dex */
    public static final class C5480a implements Comparator {
        C5480a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "a");
            Intrinsics.isThisObjectNull(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return Intrinsics.isLessOrEqual(charAt, charAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    /* renamed from: ff.i$b */
    /* loaded from: classes2.dex */
    public static final class C5481b {
        private C5481b() {
        }

        public /* synthetic */ C5481b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ CipherSuite m24124a(C5481b c5481b, String str, int i) {
            return c5481b.m24121d(str, i);
        }

        /* renamed from: d */
        private final CipherSuite m24121d(String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.m24128a().put(str, cipherSuite);
            return cipherSuite;
        }

        /* renamed from: e */
        private final String m24120e(String str) {
            boolean m8948C;
            boolean m8948C2;
            m8948C = StringsJVM.m8948C(str, "TLS_", false, 2, null);
            if (m8948C) {
                String substring = str.substring(4);
                Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                return Intrinsics.addStrAndObj("SSL_", substring);
            }
            m8948C2 = StringsJVM.m8948C(str, "SSL_", false, 2, null);
            if (m8948C2) {
                String substring2 = str.substring(4);
                Intrinsics.checkIfNull(substring2, "this as java.lang.String).substring(startIndex)");
                return Intrinsics.addStrAndObj("TLS_", substring2);
            }
            return str;
        }

        /* renamed from: b */
        public final synchronized CipherSuite m24123b(String str) {
            CipherSuite cipherSuite;
            Intrinsics.isThisObjectNull(str, "javaName");
            cipherSuite = (CipherSuite) CipherSuite.m24128a().get(str);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) CipherSuite.m24128a().get(m24120e(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str, null);
                }
                CipherSuite.m24128a().put(str, cipherSuite);
            }
            return cipherSuite;
        }

        /* renamed from: c */
        public final Comparator m24122c() {
            return CipherSuite.m24127b();
        }
    }

    static {
        C5481b c5481b = new C5481b(null);
        f15468b = c5481b;
        f15469c = new C5480a();
        f15470d = new LinkedHashMap();
        C5481b.m24124a(c5481b, "SSL_RSA_WITH_NULL_MD5", 1);
        C5481b.m24124a(c5481b, "SSL_RSA_WITH_NULL_SHA", 2);
        C5481b.m24124a(c5481b, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        C5481b.m24124a(c5481b, "SSL_RSA_WITH_RC4_128_MD5", 4);
        C5481b.m24124a(c5481b, "SSL_RSA_WITH_RC4_128_SHA", 5);
        C5481b.m24124a(c5481b, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        C5481b.m24124a(c5481b, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f15471e = C5481b.m24124a(c5481b, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        C5481b.m24124a(c5481b, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        C5481b.m24124a(c5481b, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        C5481b.m24124a(c5481b, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        C5481b.m24124a(c5481b, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        C5481b.m24124a(c5481b, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        C5481b.m24124a(c5481b, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        C5481b.m24124a(c5481b, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        C5481b.m24124a(c5481b, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        C5481b.m24124a(c5481b, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        C5481b.m24124a(c5481b, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        C5481b.m24124a(c5481b, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C5481b.m24124a(c5481b, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        C5481b.m24124a(c5481b, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        C5481b.m24124a(c5481b, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        C5481b.m24124a(c5481b, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        C5481b.m24124a(c5481b, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f15472f = C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f15473g = C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_NULL_SHA256", 59);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", C0868i.f2753D0);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", C0868i.f2768G0);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", C0868i.f2773H0);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", C0868i.f2778I0);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        C5481b.m24124a(c5481b, "TLS_PSK_WITH_RC4_128_SHA", 138);
        C5481b.m24124a(c5481b, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        C5481b.m24124a(c5481b, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        C5481b.m24124a(c5481b, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        C5481b.m24124a(c5481b, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f15474h = C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f15475i = C5481b.m24124a(c5481b, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        C5481b.m24124a(c5481b, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        C5481b.m24124a(c5481b, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        C5481b.m24124a(c5481b, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        C5481b.m24124a(c5481b, "TLS_FALLBACK_SCSV", 22016);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f15476j = C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f15477k = C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        C5481b.m24124a(c5481b, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        C5481b.m24124a(c5481b, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        C5481b.m24124a(c5481b, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        C5481b.m24124a(c5481b, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        C5481b.m24124a(c5481b, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f15478l = C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f15479m = C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        C5481b.m24124a(c5481b, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f15480n = C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f15481o = C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        C5481b.m24124a(c5481b, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        C5481b.m24124a(c5481b, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        C5481b.m24124a(c5481b, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f15482p = C5481b.m24124a(c5481b, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f15483q = C5481b.m24124a(c5481b, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        C5481b.m24124a(c5481b, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        C5481b.m24124a(c5481b, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f15484r = C5481b.m24124a(c5481b, "TLS_AES_128_GCM_SHA256", 4865);
        f15485s = C5481b.m24124a(c5481b, "TLS_AES_256_GCM_SHA384", 4866);
        f15486t = C5481b.m24124a(c5481b, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        C5481b.m24124a(c5481b, "TLS_AES_128_CCM_SHA256", 4868);
        C5481b.m24124a(c5481b, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private CipherSuite(String str) {
        this.f15487a = str;
    }

    public /* synthetic */ CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m24128a() {
        return f15470d;
    }

    /* renamed from: b */
    public static final /* synthetic */ Comparator m24127b() {
        return f15469c;
    }

    /* renamed from: c */
    public final String m24126c() {
        return this.f15487a;
    }

    public String toString() {
        return this.f15487a;
    }
}
