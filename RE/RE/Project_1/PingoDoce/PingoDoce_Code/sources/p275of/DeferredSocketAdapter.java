package p275of;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p181jd.Intrinsics;

/* renamed from: of.j */
/* loaded from: classes2.dex */
public final class DeferredSocketAdapter implements InterfaceC8074k {

    /* renamed from: a */
    private final InterfaceC8073a f20874a;

    /* renamed from: b */
    private InterfaceC8074k f20875b;

    /* compiled from: DeferredSocketAdapter.kt */
    /* renamed from: of.j$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC8073a {
        /* renamed from: a */
        boolean m16974a(SSLSocket sSLSocket);

        /* renamed from: b */
        InterfaceC8074k m16973b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(InterfaceC8073a interfaceC8073a) {
        Intrinsics.isThisObjectNull(interfaceC8073a, "socketAdapterFactory");
        this.f20874a = interfaceC8073a;
    }

    /* renamed from: e */
    private final synchronized InterfaceC8074k m16975e(SSLSocket sSLSocket) {
        if (this.f20875b == null && this.f20874a.m16974a(sSLSocket)) {
            this.f20875b = this.f20874a.m16973b(sSLSocket);
        }
        return this.f20875b;
    }

    /* renamed from: a */
    public boolean mo16972a(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return this.f20874a.m16974a(sSLSocket);
    }

    /* renamed from: b */
    public String mo16971b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        InterfaceC8074k m16975e = m16975e(sSLSocket);
        if (m16975e == null) {
            return null;
        }
        return m16975e.mo16971b(sSLSocket);
    }

    /* renamed from: c */
    public boolean mo16970c() {
        return true;
    }

    /* renamed from: d */
    public void mo16969d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        InterfaceC8074k m16975e = m16975e(sSLSocket);
        if (m16975e == null) {
            return;
        }
        m16975e.mo16969d(sSLSocket, str, list);
    }
}
