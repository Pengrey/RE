package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p107ff.ConnectionSpec;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.connection.b */
/* loaded from: classes2.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a */
    private final List f20946a;

    /* renamed from: b */
    private int f20947b;

    /* renamed from: c */
    private boolean f20948c;

    /* renamed from: d */
    private boolean f20949d;

    public ConnectionSpecSelector(List list) {
        Intrinsics.isThisObjectNull(list, "connectionSpecs");
        this.f20946a = list;
    }

    /* renamed from: c */
    private final boolean m16887c(SSLSocket sSLSocket) {
        int i = this.f20947b;
        int size = this.f20946a.size();
        while (i < size) {
            int i2 = i + 1;
            if (((ConnectionSpec) this.f20946a.get(i)).m24113e(sSLSocket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: a */
    public final ConnectionSpec m16889a(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        int i = this.f20947b;
        int size = this.f20946a.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            int i2 = i + 1;
            connectionSpec = (ConnectionSpec) this.f20946a.get(i);
            if (connectionSpec.m24113e(sSLSocket)) {
                this.f20947b = i2;
                break;
            }
            i = i2;
        }
        if (connectionSpec != null) {
            this.f20948c = m16887c(sSLSocket);
            connectionSpec.m24115c(sSLSocket, this.f20949d);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f20949d);
        sb2.append(", modes=");
        sb2.append(this.f20946a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        Intrinsics.ifNullDoSomething(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkIfNull(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m16888b(IOException iOException) {
        Intrinsics.isThisObjectNull(iOException, "e");
        this.f20949d = true;
        return (!this.f20948c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
