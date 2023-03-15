package p264o4;

import android.app.Activity;
import com.facebook.C2290b;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import p076e5.CrashShieldHandler;
import p482z4.FetchedAppSettings;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public final class C8014a {

    /* renamed from: a */
    private static final String f20741a = "o4.a";

    /* renamed from: b */
    private static Boolean f20742b = Boolean.FALSE;

    /* compiled from: MetadataIndexer.java */
    /* renamed from: o4.a$a */
    /* loaded from: classes.dex */
    static class RunnableC8015a implements Runnable {
        RunnableC8015a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                if (AttributionIdentifiers.m34027m(C2290b.m34110e())) {
                    return;
                }
                C8014a.m17172a();
                C8014a.m17171b(Boolean.TRUE);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17172a() {
        if (CrashShieldHandler.m25963d(C8014a.class)) {
            return;
        }
        try {
            m17168e();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8014a.class);
        }
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m17171b(Boolean bool) {
        if (CrashShieldHandler.m25963d(C8014a.class)) {
            return null;
        }
        try {
            f20742b = bool;
            return bool;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8014a.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m17170c() {
        try {
            if (CrashShieldHandler.m25963d(C8014a.class)) {
                return;
            }
            try {
                C2290b.m34103l().execute(new RunnableC8015a());
            } catch (Exception e) {
                Utility.m33974J(f20741a, e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8014a.class);
        }
    }

    /* renamed from: d */
    public static void m17169d(Activity activity) {
        if (CrashShieldHandler.m25963d(C8014a.class)) {
            return;
        }
        try {
            if (f20742b.booleanValue() && !MetadataRule.m17158d().isEmpty()) {
                ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.m17144h(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8014a.class);
        }
    }

    /* renamed from: e */
    private static void m17168e() {
        String m735f;
        if (CrashShieldHandler.m25963d(C8014a.class)) {
            return;
        }
        try {
            FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(C2290b.m34109f(), false);
            if (m33985o == null || (m735f = m33985o.m735f()) == null) {
                return;
            }
            MetadataRule.m17156f(m735f);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8014a.class);
        }
    }
}
