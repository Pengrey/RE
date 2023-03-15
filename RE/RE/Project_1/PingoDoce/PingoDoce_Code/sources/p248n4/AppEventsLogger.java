package p248n4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: n4.g */
/* loaded from: classes.dex */
public final class AppEventsLogger {

    /* renamed from: b */
    public static final C7658a f20233b = new C7658a(null);

    /* renamed from: a */
    private final AppEventsLoggerImpl f20234a;

    /* compiled from: AppEventsLogger.kt */
    /* renamed from: n4.g$a */
    /* loaded from: classes.dex */
    public static final class C7658a {
        private C7658a() {
        }

        /* renamed from: a */
        public final void m17814a(Application application, String str) {
            Intrinsics.isThisObjectNull(application, "application");
            AppEventsLoggerImpl.f20242j.m17786d(application, str);
        }

        /* renamed from: b */
        public final String m17813b(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            return AppEventsLoggerImpl.f20242j.m17783g(context);
        }

        /* renamed from: c */
        public final EnumC7659b m17812c() {
            return AppEventsLoggerImpl.f20242j.m17782h();
        }

        /* renamed from: d */
        public final String m17811d() {
            return C7645b.m17861b();
        }

        /* renamed from: e */
        public final void m17810e(Context context, String str) {
            Intrinsics.isThisObjectNull(context, "context");
            AppEventsLoggerImpl.f20242j.m17779k(context, str);
        }

        /* renamed from: f */
        public final AppEventsLogger m17809f(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            return new AppEventsLogger(context, null, null, null);
        }

        /* renamed from: g */
        public final void m17808g() {
            AppEventsLoggerImpl.f20242j.m17775o();
        }

        public /* synthetic */ C7658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AppEventsLogger.kt */
    /* renamed from: n4.g$b */
    /* loaded from: classes.dex */
    public enum EnumC7659b {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    /* renamed from: b */
    public static final String m17818b(Context context) {
        return f20233b.m17813b(context);
    }

    /* renamed from: c */
    public static final void m17817c(Context context, String str) {
        f20233b.m17810e(context, str);
    }

    /* renamed from: e */
    public static final AppEventsLogger m17815e(Context context) {
        return f20233b.m17809f(context);
    }

    /* renamed from: a */
    public final void m17819a() {
        this.f20234a.m17798j();
    }

    /* renamed from: d */
    public final void m17816d(String str, Bundle bundle) {
        this.f20234a.m17796l(str, bundle);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.f20234a = new AppEventsLoggerImpl(context, str, accessToken);
    }
}
