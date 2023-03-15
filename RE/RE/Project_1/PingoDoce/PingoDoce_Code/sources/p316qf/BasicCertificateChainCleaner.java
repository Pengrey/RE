package p316qf;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: qf.a */
/* loaded from: classes2.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: b */
    private final InterfaceC9728e f25583b;

    /* compiled from: BasicCertificateChainCleaner.kt */
    /* renamed from: qf.a$a */
    /* loaded from: classes2.dex */
    public static final class C9726a {
        private C9726a() {
        }

        public /* synthetic */ C9726a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9726a(null);
    }

    public BasicCertificateChainCleaner(InterfaceC9728e interfaceC9728e) {
        Intrinsics.isThisObjectNull(interfaceC9728e, "trustRootIndex");
        this.f25583b = interfaceC9728e;
    }

    /* renamed from: b */
    private final boolean m10112b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (Intrinsics.equals(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public List m10113a(List list, String str) throws SSLPeerUnverifiedException {
        Intrinsics.isThisObjectNull(list, "chain");
        Intrinsics.isThisObjectNull(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.checkIfNull(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate mo10101a = this.f25583b.mo10101a(x509Certificate);
            if (mo10101a != null) {
                if (arrayList.size() > 1 || !Intrinsics.equals(x509Certificate, mo10101a)) {
                    arrayList.add(mo10101a);
                }
                if (m10112b(mo10101a, mo10101a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkIfNull(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m10112b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(Intrinsics.addStrAndObj("Failed to find a trusted cert that signed ", x509Certificate));
            }
        }
        throw new SSLPeerUnverifiedException(Intrinsics.addStrAndObj("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && Intrinsics.equals(((BasicCertificateChainCleaner) obj).f25583b, this.f25583b);
    }

    public int hashCode() {
        return this.f25583b.hashCode();
    }
}
