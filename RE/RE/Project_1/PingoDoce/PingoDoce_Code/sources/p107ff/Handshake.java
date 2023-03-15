package p107ff;

import gf.Util;
import id.InterfaceC6097a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import p489zc.Iterables;

/* renamed from: ff.t */
/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: e */
    public static final C5495a f15533e = new C5495a(null);

    /* renamed from: a */
    private final TlsVersion f15534a;

    /* renamed from: b */
    private final CipherSuite f15535b;

    /* renamed from: c */
    private final List f15536c;

    /* renamed from: d */
    private final InterfaceC13178g f15537d;

    /* compiled from: Handshake.kt */
    /* renamed from: ff.t$a */
    /* loaded from: classes2.dex */
    public static final class C5495a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Handshake.kt */
        /* renamed from: ff.t$a$a */
        /* loaded from: classes2.dex */
        public static final class C5496a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ List f15538w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5496a(List list) {
                super(0);
                this.f15538w = list;
            }

            /* renamed from: a */
            public final List mo42214q() {
                return this.f15538w;
            }
        }

        private C5495a() {
        }

        public /* synthetic */ C5495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final List m24017b(Certificate[] certificateArr) {
            List m197g;
            if (certificateArr != null) {
                return Util.m23394w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            m197g = C13780s.m197g();
            return m197g;
        }

        /* renamed from: a */
        public final Handshake m24018a(SSLSession sSLSession) throws IOException {
            List m197g;
            Intrinsics.isThisObjectNull(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(Intrinsics.equals(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.equals(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite m24123b = CipherSuite.f15468b.m24123b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!Intrinsics.equals("NONE", protocol)) {
                            TlsVersion m24132a = TlsVersion.Companion.m24132a(protocol);
                            try {
                                m197g = m24017b(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                m197g = C13780s.m197g();
                            }
                            return new Handshake(m24132a, m24123b, m24017b(sSLSession.getLocalCertificates()), new C5496a(m197g));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException(Intrinsics.addStrAndObj("cipherSuite == ", cipherSuite));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Handshake.kt */
    /* renamed from: ff.t$b */
    /* loaded from: classes2.dex */
    public static final class C5497b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f15539w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5497b(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f15539w = interfaceC6097a;
        }

        /* renamed from: a */
        public final List mo42214q() {
            List m197g;
            try {
                return (List) this.f15539w.mo42214q();
            } catch (SSLPeerUnverifiedException unused) {
                m197g = C13780s.m197g();
                return m197g;
            }
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, InterfaceC6097a interfaceC6097a) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(tlsVersion, "tlsVersion");
        Intrinsics.isThisObjectNull(cipherSuite, "cipherSuite");
        Intrinsics.isThisObjectNull(list, "localCertificates");
        Intrinsics.isThisObjectNull(interfaceC6097a, "peerCertificatesFn");
        this.f15534a = tlsVersion;
        this.f15535b = cipherSuite;
        this.f15536c = list;
        m1464a = LazyJVM.m1464a(new C5497b(interfaceC6097a));
        this.f15537d = m1464a;
    }

    /* renamed from: b */
    private final String m24022b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkIfNull(type, "type");
        return type;
    }

    /* renamed from: a */
    public final CipherSuite m24023a() {
        return this.f15535b;
    }

    /* renamed from: c */
    public final List m24021c() {
        return this.f15536c;
    }

    /* renamed from: d */
    public final List m24020d() {
        return (List) this.f15537d.getValue();
    }

    /* renamed from: e */
    public final TlsVersion m24019e() {
        return this.f15534a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f15534a == this.f15534a && Intrinsics.equals(handshake.f15535b, this.f15535b) && Intrinsics.equals(handshake.m24020d(), m24020d()) && Intrinsics.equals(handshake.f15536c, this.f15536c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f15534a.hashCode()) * 31) + this.f15535b.hashCode()) * 31) + m24020d().hashCode()) * 31) + this.f15536c.hashCode();
    }

    public String toString() {
        int m186r;
        int m186r2;
        List<Certificate> m24020d = m24020d();
        m186r = Iterables.m186r(m24020d, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (Certificate certificate : m24020d) {
            arrayList.add(m24022b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f15534a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f15535b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f15536c;
        m186r2 = Iterables.m186r(list, 10);
        ArrayList arrayList2 = new ArrayList(m186r2);
        for (Certificate certificate2 : list) {
            arrayList2.add(m24022b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
