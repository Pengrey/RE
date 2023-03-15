package p214l4;

import android.content.Context;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.InterfaceC5503w;
import p107ff.Response;
import p181jd.Intrinsics;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class ChuckerInterceptor implements InterfaceC5503w {

    /* compiled from: ChuckerInterceptor.kt */
    /* renamed from: l4.a$a */
    /* loaded from: classes.dex */
    public static final class C6982a {

        /* renamed from: a */
        private final Context f18598a;

        public C6982a(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            this.f18598a = context;
        }

        /* renamed from: a */
        public final C6982a m19661a(boolean z) {
            return this;
        }

        /* renamed from: b */
        public final ChuckerInterceptor m19660b() {
            return new ChuckerInterceptor(this.f18598a, null, null, null, null, 30, null);
        }

        /* renamed from: c */
        public final C6982a m19659c(String... strArr) {
            Intrinsics.isThisObjectNull(strArr, "headerNames");
            return this;
        }
    }

    public ChuckerInterceptor(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Intrinsics.isThisObjectNull(context, "context");
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        Response mo23918a = interfaceC5504a.mo23918a(interfaceC5504a.request());
        Intrinsics.checkIfNull(mo23918a, "chain.proceed(request)");
        return mo23918a;
    }

    public /* synthetic */ ChuckerInterceptor(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : obj3, (i & 16) != 0 ? null : obj4);
    }
}
