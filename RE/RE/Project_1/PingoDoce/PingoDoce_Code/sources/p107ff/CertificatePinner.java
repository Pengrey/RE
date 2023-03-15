package p107ff;

import id.InterfaceC6097a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p316qf.CertificateChainCleaner;
import p356sf.ByteString;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc._Collections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: ff.g */
/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: c */
    public static final C5476b f15455c = new C5476b(null);

    /* renamed from: d */
    public static final CertificatePinner f15456d = new C5475a().m24141b();

    /* renamed from: a */
    private final Set f15457a;

    /* renamed from: b */
    private final CertificateChainCleaner f15458b;

    /* compiled from: CertificatePinner.kt */
    /* renamed from: ff.g$a */
    /* loaded from: classes2.dex */
    public static final class C5475a {

        /* renamed from: a */
        private final List f15459a = new ArrayList();

        /* renamed from: a */
        public final C5475a m24142a(String str, String... strArr) {
            Intrinsics.isThisObjectNull(str, "pattern");
            Intrinsics.isThisObjectNull(strArr, "pins");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                m24140c().add(new C5477c(str, str2));
            }
            return this;
        }

        /* renamed from: b */
        public final CertificatePinner m24141b() {
            Set m451r0;
            m451r0 = _Collections.m451r0(this.f15459a);
            return new CertificatePinner(m451r0, null, 2, null);
        }

        /* renamed from: c */
        public final List m24140c() {
            return this.f15459a;
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* renamed from: ff.g$b */
    /* loaded from: classes2.dex */
    public static final class C5476b {
        private C5476b() {
        }

        public /* synthetic */ C5476b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m24139a(Certificate certificate) {
            Intrinsics.isThisObjectNull(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return Intrinsics.addStrAndObj("sha256/", m24137c((X509Certificate) certificate).m8720b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final ByteString m24138b(X509Certificate x509Certificate) {
            Intrinsics.isThisObjectNull(x509Certificate, "<this>");
            ByteString.C10188a c10188a = ByteString.f26546z;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkIfNull(encoded, "publicKey.encoded");
            return ByteString.C10188a.m8690f(c10188a, encoded, 0, 0, 3, null).m8696z();
        }

        /* renamed from: c */
        public final ByteString m24137c(X509Certificate x509Certificate) {
            Intrinsics.isThisObjectNull(x509Certificate, "<this>");
            ByteString.C10188a c10188a = ByteString.f26546z;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkIfNull(encoded, "publicKey.encoded");
            return ByteString.C10188a.m8690f(c10188a, encoded, 0, 0, 3, null).m8727A();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* renamed from: ff.g$c */
    /* loaded from: classes2.dex */
    public static final class C5477c {

        /* renamed from: a */
        private final String f15460a;

        /* renamed from: b */
        private final String f15461b;

        /* renamed from: c */
        private final ByteString f15462c;

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
            if (r0 != (-1)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
            if (r0 != (-1)) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C5477c(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "pattern"
                p181jd.Intrinsics.isThisObjectNull(r12, r0)
                java.lang.String r0 = "pin"
                p181jd.Intrinsics.isThisObjectNull(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = sd.C10163k.m9008C(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L26
                r7 = 1
                r8 = 0
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = sd.C10163k.m8989U(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L26:
                java.lang.String r0 = "**."
                boolean r0 = sd.C10163k.m9008C(r12, r0, r1, r2, r3)
                if (r0 == 0) goto L3b
                r7 = 2
                r8 = 0
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = sd.C10163k.m8989U(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L3b:
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = sd.C10163k.m8989U(r5, r6, r7, r8, r9, r10)
                if (r0 != r4) goto L4a
            L48:
                r0 = 1
                goto L4b
            L4a:
                r0 = r1
            L4b:
                if (r0 == 0) goto Lc3
                java.lang.String r0 = gf.hostnames.m23444e(r12)
                if (r0 == 0) goto Lb7
                r11.f15460a = r0
                java.lang.String r12 = "sha1/"
                boolean r12 = sd.C10163k.m9008C(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r12 == 0) goto L82
                java.lang.String r12 = "sha1"
                r11.f15461b = r12
                sf.f$a r12 = p356sf.ByteString.f26546z
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                p181jd.Intrinsics.checkIfNull(r1, r4)
                sf.f r12 = r12.m8695a(r1)
                if (r12 == 0) goto L78
                r11.f15462c = r12
                goto La0
            L78:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = p181jd.Intrinsics.addStrAndObj(r0, r13)
                r12.<init>(r13)
                throw r12
            L82:
                java.lang.String r12 = "sha256/"
                boolean r12 = sd.C10163k.m9008C(r13, r12, r1, r2, r3)
                if (r12 == 0) goto Lab
                java.lang.String r12 = "sha256"
                r11.f15461b = r12
                sf.f$a r12 = p356sf.ByteString.f26546z
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                p181jd.Intrinsics.checkIfNull(r1, r4)
                sf.f r12 = r12.m8695a(r1)
                if (r12 == 0) goto La1
                r11.f15462c = r12
            La0:
                return
            La1:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = p181jd.Intrinsics.addStrAndObj(r0, r13)
                r12.<init>(r13)
                throw r12
            Lab:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r13 = p181jd.Intrinsics.addStrAndObj(r0, r13)
                r12.<init>(r13)
                throw r12
            Lb7:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid pattern: "
                java.lang.String r12 = p181jd.Intrinsics.addStrAndObj(r0, r12)
                r13.<init>(r12)
                throw r13
            Lc3:
                java.lang.String r13 = "Unexpected pattern: "
                java.lang.String r12 = p181jd.Intrinsics.addStrAndObj(r13, r12)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.CertificatePinner.C5477c.<init>(java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public final ByteString m24136a() {
            return this.f15462c;
        }

        /* renamed from: b */
        public final String m24135b() {
            return this.f15461b;
        }

        /* renamed from: c */
        public final boolean m24134c(String str) {
            boolean m8948C;
            boolean m8948C2;
            boolean m8940t;
            int m8901Y;
            boolean m8940t2;
            Intrinsics.isThisObjectNull(str, "hostname");
            m8948C = StringsJVM.m8948C(this.f15460a, "**.", false, 2, null);
            if (m8948C) {
                int length = this.f15460a.length() - 3;
                int length2 = str.length() - length;
                m8940t2 = StringsJVM.m8940t(str, str.length() - length, this.f15460a, 3, length, false, 16, null);
                if (!m8940t2) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                m8948C2 = StringsJVM.m8948C(this.f15460a, "*.", false, 2, null);
                if (m8948C2) {
                    int length3 = this.f15460a.length() - 1;
                    int length4 = str.length() - length3;
                    m8940t = StringsJVM.m8940t(str, str.length() - length3, this.f15460a, 1, length3, false, 16, null);
                    if (!m8940t) {
                        return false;
                    }
                    m8901Y = C10171u.m8901Y(str, '.', length4 - 1, false, 4, null);
                    if (m8901Y != -1) {
                        return false;
                    }
                } else {
                    return Intrinsics.equals(str, this.f15460a);
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5477c) {
                C5477c c5477c = (C5477c) obj;
                return Intrinsics.equals(this.f15460a, c5477c.f15460a) && Intrinsics.equals(this.f15461b, c5477c.f15461b) && Intrinsics.equals(this.f15462c, c5477c.f15462c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15460a.hashCode() * 31) + this.f15461b.hashCode()) * 31) + this.f15462c.hashCode();
        }

        public String toString() {
            return this.f15461b + '/' + this.f15462c.m8720b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CertificatePinner.kt */
    /* renamed from: ff.g$d */
    /* loaded from: classes2.dex */
    public static final class C5478d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ List f15464x;

        /* renamed from: y */
        final /* synthetic */ String f15465y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5478d(List list, String str) {
            super(0);
            this.f15464x = list;
            this.f15465y = str;
        }

        /* renamed from: a */
        public final List mo42214q() {
            int m186r;
            CertificateChainCleaner m24144d = CertificatePinner.this.m24144d();
            List<Certificate> m10111a = m24144d == null ? null : m24144d.m10111a(this.f15464x, this.f15465y);
            if (m10111a == null) {
                m10111a = this.f15464x;
            }
            m186r = Iterables.m186r(m10111a, 10);
            ArrayList arrayList = new ArrayList(m186r);
            for (Certificate certificate : m10111a) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.isThisObjectNull(set, "pins");
        this.f15457a = set;
        this.f15458b = certificateChainCleaner;
    }

    /* renamed from: a */
    public final void m24147a(String str, List list) throws SSLPeerUnverifiedException {
        Intrinsics.isThisObjectNull(str, "hostname");
        Intrinsics.isThisObjectNull(list, "peerCertificates");
        m24146b(str, new C5478d(list, str));
    }

    /* renamed from: b */
    public final void m24146b(String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(str, "hostname");
        Intrinsics.isThisObjectNull(interfaceC6097a, "cleanedPeerCertificatesFn");
        List<C5477c> m24145c = m24145c(str);
        if (m24145c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC6097a.mo42214q();
        for (X509Certificate x509Certificate : list) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (C5477c c5477c : m24145c) {
                String m24135b = c5477c.m24135b();
                if (Intrinsics.equals(m24135b, "sha256")) {
                    if (byteString == null) {
                        byteString = f15455c.m24137c(x509Certificate);
                    }
                    if (Intrinsics.equals(c5477c.m24136a(), byteString)) {
                        return;
                    }
                } else if (Intrinsics.equals(m24135b, "sha1")) {
                    if (byteString2 == null) {
                        byteString2 = f15455c.m24138b(x509Certificate);
                    }
                    if (Intrinsics.equals(c5477c.m24136a(), byteString2)) {
                        return;
                    }
                } else {
                    throw new AssertionError(Intrinsics.addStrAndObj("unsupported hashAlgorithm: ", c5477c.m24135b()));
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f15455c.m24139a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (C5477c c5477c2 : m24145c) {
            sb2.append("\n    ");
            sb2.append(c5477c2);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    /* renamed from: c */
    public final List m24145c(String str) {
        List m197g;
        Intrinsics.isThisObjectNull(str, "hostname");
        Set set = this.f15457a;
        m197g = C13780s.m197g();
        for (Object obj : set) {
            if (((C5477c) obj).m24134c(str)) {
                if (m197g.isEmpty()) {
                    m197g = new ArrayList();
                }
                C6431d0.m20953b(m197g).add(obj);
            }
        }
        return m197g;
    }

    /* renamed from: d */
    public final CertificateChainCleaner m24144d() {
        return this.f15458b;
    }

    /* renamed from: e */
    public final CertificatePinner m24143e(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.isThisObjectNull(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.equals(this.f15458b, certificateChainCleaner) ? this : new CertificatePinner(this.f15457a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.equals(certificatePinner.f15457a, this.f15457a) && Intrinsics.equals(certificatePinner.f15458b, this.f15458b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f15457a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f15458b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
