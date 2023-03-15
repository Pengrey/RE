package p350s4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.C2290b;
import com.facebook.internal.FeatureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;

/* renamed from: s4.f */
/* loaded from: classes.dex */
public final class C10059f {

    /* renamed from: a */
    private static final AtomicBoolean f26306a = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m9287a() {
        if (CrashShieldHandler.m25963d(C10059f.class)) {
            return;
        }
        try {
            f26306a.set(true);
            m9286b();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10059f.class);
        }
    }

    /* renamed from: b */
    public static void m9286b() {
        if (CrashShieldHandler.m25963d(C10059f.class)) {
            return;
        }
        try {
            if (f26306a.get()) {
                if (m9285c() && FeatureManager.m34002g(FeatureManager.EnumC2317b.IapLoggingLib2)) {
                    C10048b.m9329c(C2290b.m34110e());
                } else {
                    C10043a.m9333g();
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10059f.class);
        }
    }

    /* renamed from: c */
    private static boolean m9285c() {
        if (CrashShieldHandler.m25963d(C10059f.class)) {
            return false;
        }
        try {
            Context m34110e = C2290b.m34110e();
            ApplicationInfo applicationInfo = m34110e.getPackageManager().getApplicationInfo(m34110e.getPackageName(), 128);
            if (applicationInfo != null) {
                return Integer.parseInt(applicationInfo.metaData.getString("com.google.android.play.billingclient.version").split("\\.", 3)[0]) >= 2;
            }
            return false;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10059f.class);
            return false;
        }
    }
}
