package p377u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.EnumC2305f;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import p076e5.CrashShieldHandler;
import p131h5.CertificateUtil;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p248n4.InternalAppEventsLogger;
import p482z4.Logger;

/* renamed from: u4.i */
/* loaded from: classes.dex */
public final class SessionLogger {

    /* renamed from: c */
    public static final SessionLogger f28026c = new SessionLogger();

    /* renamed from: a */
    private static final String f28024a = SessionLogger.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f28025b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    /* renamed from: b */
    public static final int m6906b(long j) {
        if (CrashShieldHandler.m25963d(SessionLogger.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f28025b;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, SessionLogger.class);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final void m6905c(String str, C10839j c10839j, String str2, Context context) {
        String str3;
        if (CrashShieldHandler.m25963d(SessionLogger.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(str, "activityName");
            Intrinsics.isThisObjectNull(context, "context");
            if (c10839j == null || (str3 = c10839j.toString()) == null) {
                str3 = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str3);
            bundle.putString("fb_mobile_pckg_fp", f28026c.m6907a(context));
            bundle.putString("fb_mobile_app_cert_hash", CertificateUtil.m22872a(context));
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(str, str2, null);
            internalAppEventsLogger.m17760e("fb_mobile_activate_app", bundle);
            if (InternalAppEventsLogger.f20250b.m17754b() != AppEventsLogger.EnumC7659b.EXPLICIT_ONLY) {
                internalAppEventsLogger.m17764a();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, SessionLogger.class);
        }
    }

    /* renamed from: d */
    private final void m6904d() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Logger.C13648a c13648a = Logger.f34697f;
            EnumC2305f enumC2305f = EnumC2305f.APP_EVENTS;
            String str = f28024a;
            Intrinsics.ifNullDoSomething(str);
            c13648a.m702c(enumC2305f, str, "Clock skew detected");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: e */
    public static final void m6903e(String str, SessionInfo sessionInfo, String str2) {
        long longValue;
        String str3;
        if (CrashShieldHandler.m25963d(SessionLogger.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(str, "activityName");
            if (sessionInfo == null) {
                return;
            }
            Long m6921b = sessionInfo.m6921b();
            if (m6921b != null) {
                longValue = m6921b.longValue();
            } else {
                Long m6918e = sessionInfo.m6918e();
                longValue = 0 - (m6918e != null ? m6918e.longValue() : 0L);
            }
            if (longValue < 0) {
                f28026c.m6904d();
                longValue = 0;
            }
            long m6917f = sessionInfo.m6917f();
            if (m6917f < 0) {
                f28026c.m6904d();
                m6917f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", sessionInfo.m6920c());
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m6906b(longValue))}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            C10839j m6916g = sessionInfo.m6916g();
            if (m6916g == null || (str3 = m6916g.toString()) == null) {
                str3 = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", str3);
            Long m6918e2 = sessionInfo.m6918e();
            bundle.putLong("_logTime", (m6918e2 != null ? m6918e2.longValue() : 0L) / ((long) DateTimeConstants.MILLIS_PER_SECOND));
            new InternalAppEventsLogger(str, str2, null).m17761d("fb_mobile_deactivate_app", m6917f / 1000, bundle);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, SessionLogger.class);
        }
    }

    /* renamed from: a */
    public final String m6907a(Context context) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string = sharedPreferences.getString(str, null);
                if (string == null || string.length() != 32) {
                    String m6924c = HashUtils.m6924c(context, null);
                    if (m6924c == null) {
                        m6924c = HashUtils.m6925b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                    }
                    sharedPreferences.edit().putString(str, m6924c).apply();
                    return m6924c;
                }
                return string;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }
}
