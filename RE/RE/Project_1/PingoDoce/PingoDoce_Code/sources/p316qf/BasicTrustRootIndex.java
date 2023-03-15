package p316qf;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p181jd.Intrinsics;

/* renamed from: qf.b */
/* loaded from: classes2.dex */
public final class BasicTrustRootIndex implements InterfaceC9728e {

    /* renamed from: a */
    private final Map f25584a;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        Intrinsics.isThisObjectNull(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkIfNull(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f25584a = linkedHashMap;
    }

    /* renamed from: a */
    public X509Certificate mo10101a(X509Certificate x509Certificate) {
        boolean z;
        Intrinsics.isThisObjectNull(x509Certificate, "cert");
        Set set = (Set) this.f25584a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && Intrinsics.equals(((BasicTrustRootIndex) obj).f25584a, this.f25584a));
    }

    public int hashCode() {
        return this.f25584a.hashCode();
    }
}
