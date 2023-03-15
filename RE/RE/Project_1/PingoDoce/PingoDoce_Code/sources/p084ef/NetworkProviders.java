package p084ef;

import java.util.concurrent.TimeUnit;
import p107ff.CertificatePinner;
import p107ff.ConnectionPool;
import p107ff.Dispatcher;
import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p181jd.Intrinsics;
import p338rf.HttpLoggingInterceptor;
import p370te.OAuthManager;
import p386ue.OpenIdAuthenticator;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import se.OAuthSharedPrefs;
import ye.HeadersInterceptor;

/* renamed from: ef.a */
/* loaded from: classes2.dex */
public final class NetworkProviders {

    /* renamed from: a */
    public static final NetworkProviders f13977a = new NetworkProviders();

    private NetworkProviders() {
    }

    /* renamed from: a */
    public final String m25861a() {
        return "https://app-proxy.pingodoce.pt/api/";
    }

    /* renamed from: b */
    public final ConnectionPool m25860b() {
        return new ConnectionPool(10, 5L, TimeUnit.MINUTES);
    }

    /* renamed from: c */
    public final HttpLoggingInterceptor m25859c() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.m9742c(HttpLoggingInterceptor.EnumC9896a.BASIC);
        return httpLoggingInterceptor;
    }

    /* renamed from: d */
    public final String m25858d() {
        return "https://app-proxy.pingodoce.pt/";
    }

    /* renamed from: e */
    public final OkHttpClient.C5510a m25857e(Dispatcher dispatcher, ConnectionPool connectionPool) {
        Intrinsics.isThisObjectNull(dispatcher, "dispatcher");
        Intrinsics.isThisObjectNull(connectionPool, "connectionPool");
        OkHttpClient.C5510a m23838g = new OkHttpClient.C5510a().m23839f(connectionPool).m23838g(dispatcher);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return m23838g.m23840e(60L, timeUnit).m23854L(60L, timeUnit).m23845U(60L, timeUnit);
    }

    /* renamed from: f */
    public final OkHttpClient m25856f(OkHttpClient.C5510a c5510a, OAuthSharedPrefs oAuthSharedPrefs, OAuthManager oAuthManager, HttpLoggingInterceptor httpLoggingInterceptor, CertificatePinner certificatePinner, InterfaceC5503w interfaceC5503w, InterfaceC5503w interfaceC5503w2) {
        Intrinsics.isThisObjectNull(c5510a, "builder");
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "sharedPrefs");
        Intrinsics.isThisObjectNull(oAuthManager, "manager");
        Intrinsics.isThisObjectNull(httpLoggingInterceptor, "logger");
        c5510a.m23844a(httpLoggingInterceptor);
        if (certificatePinner != null) {
            c5510a.m23841d(certificatePinner);
        }
        if (interfaceC5503w != null) {
            c5510a.m23844a(interfaceC5503w);
        }
        if (interfaceC5503w2 != null) {
            c5510a.m23844a(interfaceC5503w2);
        }
        c5510a.m23844a(new HeadersInterceptor(oAuthSharedPrefs));
        c5510a.m23843b(new OpenIdAuthenticator(oAuthManager));
        return c5510a.m23842c();
    }

    /* renamed from: g */
    public final OkHttpClient m25855g(OkHttpClient.C5510a c5510a, OAuthSharedPrefs oAuthSharedPrefs, HttpLoggingInterceptor httpLoggingInterceptor, InterfaceC5503w interfaceC5503w) {
        Intrinsics.isThisObjectNull(c5510a, "builder");
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "sharedPrefs");
        Intrinsics.isThisObjectNull(httpLoggingInterceptor, "logger");
        c5510a.m23844a(httpLoggingInterceptor);
        c5510a.m23844a(new HeadersInterceptor(oAuthSharedPrefs));
        if (interfaceC5503w != null) {
            c5510a.m23844a(interfaceC5503w);
        }
        return c5510a.m23842c();
    }

    /* renamed from: h */
    public final OkHttpClient m25854h(OkHttpClient.C5510a c5510a, HttpLoggingInterceptor httpLoggingInterceptor, InterfaceC5503w interfaceC5503w) {
        Intrinsics.isThisObjectNull(c5510a, "builder");
        Intrinsics.isThisObjectNull(httpLoggingInterceptor, "logger");
        c5510a.m23844a(httpLoggingInterceptor);
        if (interfaceC5503w != null) {
            c5510a.m23844a(interfaceC5503w);
        }
        return c5510a.m23842c();
    }

    /* renamed from: i */
    public final Dispatcher m25853i() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.m24059m(10);
        dispatcher.m24058n(10);
        return dispatcher;
    }

    /* renamed from: j */
    public final Retrofit m25852j(OkHttpClient okHttpClient, String str) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(str, "url");
        Retrofit build = new Retrofit.Builder().client(okHttpClient).baseUrl(str).addConverterFactory(MoshiConverterFactory.create()).build();
        Intrinsics.checkIfNull(build, "Builder().client(client)…e())\n            .build()");
        return build;
    }

    /* renamed from: k */
    public final Retrofit m25851k(OkHttpClient okHttpClient, String str) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(str, "url");
        Retrofit build = new Retrofit.Builder().client(okHttpClient).baseUrl(str).addConverterFactory(MoshiConverterFactory.create()).build();
        Intrinsics.checkIfNull(build, "Builder().client(client)…e())\n            .build()");
        return build;
    }

    /* renamed from: l */
    public final Retrofit m25850l(OkHttpClient okHttpClient, String str) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(str, "url");
        Retrofit build = new Retrofit.Builder().client(okHttpClient).baseUrl(str).addConverterFactory(MoshiConverterFactory.create()).build();
        Intrinsics.checkIfNull(build, "Builder().client(client)…e())\n            .build()");
        return build;
    }
}
