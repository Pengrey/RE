package p275of;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.Platform;
import p181jd.Intrinsics;

/* renamed from: of.l */
/* loaded from: classes2.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {

    /* renamed from: h */
    public static final C8075a f20876h = new C8075a(null);

    /* compiled from: StandardAndroidSocketAdapter.kt */
    /* renamed from: of.l$a */
    /* loaded from: classes2.dex */
    public static final class C8075a {
        private C8075a() {
        }

        public /* synthetic */ C8075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC8074k m16967b(C8075a c8075a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c8075a.m16968a(str);
        }

        /* renamed from: a */
        public final InterfaceC8074k m16968a(String str) {
            Intrinsics.isThisObjectNull(str, "packageName");
            try {
                Class<?> cls = Class.forName(Intrinsics.addStrAndObj(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.addStrAndObj(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(Intrinsics.addStrAndObj(str, ".SSLParametersImpl"));
                Intrinsics.checkIfNull(cls3, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e) {
                Platform.f21214a.m16457g().m16469j("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class cls, Class cls2, Class cls3) {
        super(cls);
        Intrinsics.isThisObjectNull(cls, "sslSocketClass");
        Intrinsics.isThisObjectNull(cls2, "sslSocketFactoryClass");
        Intrinsics.isThisObjectNull(cls3, "paramClass");
    }
}
