package p350s4;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;

/* renamed from: s4.b */
/* loaded from: classes.dex */
public class C10048b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseAutoLogger.java */
    /* renamed from: s4.b$a */
    /* loaded from: classes.dex */
    public static class RunnableC10049a implements Runnable {
        RunnableC10049a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C10048b.m9331a();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseAutoLogger.java */
    /* renamed from: s4.b$b */
    /* loaded from: classes.dex */
    public static class RunnableC10050b implements Runnable {
        RunnableC10050b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C10048b.m9331a();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9331a() {
        if (CrashShieldHandler.m25963d(C10048b.class)) {
            return;
        }
        try {
            m9330b();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10048b.class);
        }
    }

    /* renamed from: b */
    private static void m9330b() {
        if (CrashShieldHandler.m25963d(C10048b.class)) {
            return;
        }
        try {
            Map<String, JSONObject> map = C10051c.f26272v;
            C10058e.m9290e(map, C10051c.f26273w);
            map.clear();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10048b.class);
        }
    }

    /* renamed from: c */
    public static void m9329c(Context context) {
        C10051c m9319j;
        if (CrashShieldHandler.m25963d(C10048b.class)) {
            return;
        }
        try {
            if (C10061h.m9280a("com.android.billingclient.api.Purchase") == null || (m9319j = C10051c.m9319j(context)) == null || !C10051c.f26271u.get()) {
                return;
            }
            if (C10058e.m9291d()) {
                m9319j.m9317l("inapp", new RunnableC10049a());
            } else {
                m9319j.m9318k("inapp", new RunnableC10050b());
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10048b.class);
        }
    }
}
