package okhttp3.internal.connection;

import java.io.IOException;
import p107ff.InterfaceC5503w;
import p107ff.Response;
import p181jd.Intrinsics;
import p222lf.RealInterceptorChain;

/* renamed from: okhttp3.internal.connection.a */
/* loaded from: classes2.dex */
public final class ConnectInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    public static final ConnectInterceptor f20945a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) interfaceC5504a;
        return RealInterceptorChain.m19448d(realInterceptorChain, 0, realInterceptorChain.m19447e().m16834r(realInterceptorChain), null, 0, 0, 0, 61, null).mo23918a(realInterceptorChain.m19443i());
    }
}
