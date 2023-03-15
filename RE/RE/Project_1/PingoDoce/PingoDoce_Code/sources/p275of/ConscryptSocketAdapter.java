package p275of;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import p181jd.Intrinsics;
import p275of.DeferredSocketAdapter;

/* renamed from: of.i */
/* loaded from: classes2.dex */
public final class ConscryptSocketAdapter implements InterfaceC8074k {

    /* renamed from: a */
    public static final C8072b f20872a = new C8072b(null);

    /* renamed from: b */
    private static final DeferredSocketAdapter.InterfaceC8073a f20873b = new C8071a();

    /* compiled from: ConscryptSocketAdapter.kt */
    /* renamed from: of.i$a */
    /* loaded from: classes2.dex */
    public static final class C8071a implements DeferredSocketAdapter.InterfaceC8073a {
        C8071a() {
        }

        /* renamed from: a */
        public boolean m16978a(SSLSocket sSLSocket) {
            Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
            return ConscryptPlatform.f21196e.m16497c() && Conscrypt.isConscrypt(sSLSocket);
        }

        /* renamed from: b */
        public InterfaceC8074k m16977b(SSLSocket sSLSocket) {
            Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    /* renamed from: of.i$b */
    /* loaded from: classes2.dex */
    public static final class C8072b {
        private C8072b() {
        }

        public /* synthetic */ C8072b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DeferredSocketAdapter.InterfaceC8073a m16976a() {
            return ConscryptSocketAdapter.m16979e();
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ DeferredSocketAdapter.InterfaceC8073a m16979e() {
        return f20873b;
    }

    /* renamed from: a */
    public boolean mo16972a(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: b */
    public String mo16971b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        if (mo16972a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo16970c() {
        return ConscryptPlatform.f21196e.m16497c();
    }

    /* renamed from: d */
    public void mo16969d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (mo16972a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
