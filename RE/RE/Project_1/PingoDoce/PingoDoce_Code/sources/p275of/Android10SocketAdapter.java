package p275of;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.Platform;
import p181jd.Intrinsics;

@SuppressLint({"NewApi"})
/* renamed from: of.a */
/* loaded from: classes2.dex */
public final class Android10SocketAdapter implements InterfaceC8074k {

    /* renamed from: a */
    public static final C8062a f20850a = new C8062a(null);

    /* compiled from: Android10SocketAdapter.kt */
    /* renamed from: of.a$a */
    /* loaded from: classes2.dex */
    public static final class C8062a {
        private C8062a() {
        }

        public /* synthetic */ C8062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC8074k m17003a() {
            if (m17002b()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m17002b() {
            return Platform.f21214a.m16456h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: a */
    public boolean mo16972a(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public String mo16971b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.equals(applicationProtocol, BuildConfig.VERSION_NAME)) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: c */
    public boolean mo16970c() {
        return f20850a.m17002b();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo16969d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
