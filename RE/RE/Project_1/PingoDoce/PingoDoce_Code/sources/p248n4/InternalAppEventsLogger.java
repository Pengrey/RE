package p248n4;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;

/* renamed from: n4.m */
/* loaded from: classes.dex */
public final class InternalAppEventsLogger {

    /* renamed from: b */
    public static final C7673a f20250b = new C7673a(null);

    /* renamed from: a */
    private final AppEventsLoggerImpl f20251a;

    /* compiled from: InternalAppEventsLogger.kt */
    /* renamed from: n4.m$a */
    /* loaded from: classes.dex */
    public static final class C7673a {
        private C7673a() {
        }

        /* renamed from: a */
        public final Executor m17755a() {
            return AppEventsLoggerImpl.f20242j.m17784f();
        }

        /* renamed from: b */
        public final AppEventsLogger.EnumC7659b m17754b() {
            return AppEventsLoggerImpl.f20242j.m17782h();
        }

        /* renamed from: c */
        public final String m17753c() {
            return AppEventsLoggerImpl.f20242j.m17780j();
        }

        /* renamed from: d */
        public final void m17752d(Map map) {
            Intrinsics.isThisObjectNull(map, "ud");
            UserDataStore.m17734i(map);
        }

        public /* synthetic */ C7673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InternalAppEventsLogger(AppEventsLoggerImpl appEventsLoggerImpl) {
        Intrinsics.isThisObjectNull(appEventsLoggerImpl, "loggerImpl");
        this.f20251a = appEventsLoggerImpl;
    }

    /* renamed from: b */
    public static final Executor m17763b() {
        return f20250b.m17755a();
    }

    /* renamed from: i */
    public static final void m17756i(Map map) {
        f20250b.m17752d(map);
    }

    /* renamed from: a */
    public final void m17764a() {
        this.f20251a.m17798j();
    }

    /* renamed from: c */
    public final void m17762c(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "parameters");
        if (((bundle.getInt("previous") & 2) != 0) || C2290b.m34106i()) {
            this.f20251a.m17793o("fb_sdk_settings_changed", null, bundle);
        }
    }

    /* renamed from: d */
    public final void m17761d(String str, double d, Bundle bundle) {
        if (C2290b.m34106i()) {
            this.f20251a.m17797k(str, d, bundle);
        }
    }

    /* renamed from: e */
    public final void m17760e(String str, Bundle bundle) {
        if (C2290b.m34106i()) {
            this.f20251a.m17796l(str, bundle);
        }
    }

    /* renamed from: f */
    public final void m17759f(String str, String str2) {
        this.f20251a.m17794n(str, str2);
    }

    /* renamed from: g */
    public final void m17758g(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2290b.m34106i()) {
            this.f20251a.m17792p(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: h */
    public final void m17757h(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C2290b.m34106i()) {
            this.f20251a.m17790r(bigDecimal, currency, bundle);
        }
    }

    public InternalAppEventsLogger(Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(String str, String str2, AccessToken accessToken) {
        this(new AppEventsLoggerImpl(str, str2, accessToken));
        Intrinsics.isThisObjectNull(str, "activityName");
    }
}
