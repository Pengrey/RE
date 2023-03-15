package p107ff;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ff.g0 */
/* loaded from: classes2.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final C5479a Companion = new C5479a(null);
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    /* renamed from: ff.g0$a */
    /* loaded from: classes2.dex */
    public static final class C5479a {
        private C5479a() {
        }

        public /* synthetic */ C5479a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TlsVersion m24132a(String str) {
            Intrinsics.isThisObjectNull(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("Unexpected TLS version: ", str));
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        return Companion.m24132a(str);
    }

    /* renamed from: -deprecated_javaName */
    public final String m39645deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
