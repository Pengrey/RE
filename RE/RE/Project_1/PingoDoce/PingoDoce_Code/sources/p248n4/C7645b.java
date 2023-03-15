package p248n4;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C2290b;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p076e5.CrashShieldHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n4.b */
/* loaded from: classes.dex */
public class C7645b {

    /* renamed from: a */
    private static final String f20198a = "b";

    /* renamed from: c */
    private static String f20199c;

    /* renamed from: b */
    private static ReentrantReadWriteLock f20200b = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static volatile boolean f20201d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticsUserIDStore.java */
    /* renamed from: n4.b$a */
    /* loaded from: classes.dex */
    public static class RunnableC7646a implements Runnable {
        RunnableC7646a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C7645b.m17860c();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* renamed from: b */
    public static String m17861b() {
        if (!f20201d) {
            Log.w(f20198a, "initStore should have been called before calling setUserID");
            m17860c();
        }
        f20200b.readLock().lock();
        try {
            return f20199c;
        } finally {
            f20200b.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m17860c() {
        if (f20201d) {
            return;
        }
        f20200b.writeLock().lock();
        try {
            if (f20201d) {
                return;
            }
            f20199c = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f20201d = true;
        } finally {
            f20200b.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public static void m17859d() {
        if (f20201d) {
            return;
        }
        InternalAppEventsLogger.m17763b().execute(new RunnableC7646a());
    }
}
