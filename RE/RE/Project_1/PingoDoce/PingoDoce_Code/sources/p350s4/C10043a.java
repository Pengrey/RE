package p350s4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C2290b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p377u4.AutomaticAnalyticsLogger;

/* renamed from: s4.a */
/* loaded from: classes.dex */
public class C10043a {

    /* renamed from: a */
    private static final String f26261a = "s4.a";

    /* renamed from: b */
    private static final AtomicBoolean f26262b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f26263c = null;

    /* renamed from: d */
    private static Boolean f26264d = null;

    /* renamed from: e */
    private static ServiceConnection f26265e;

    /* renamed from: f */
    private static Application.ActivityLifecycleCallbacks f26266f;

    /* renamed from: g */
    private static Intent f26267g;

    /* renamed from: h */
    private static Object f26268h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
    /* renamed from: s4.a$a */
    /* loaded from: classes.dex */
    public static class ServiceConnectionC10044a implements ServiceConnection {
        ServiceConnectionC10044a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = C10043a.f26268h = C10057d.m9311a(C2290b.m34110e(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
    /* renamed from: s4.a$b */
    /* loaded from: classes.dex */
    public static class C10045b implements Application.ActivityLifecycleCallbacks {

        /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
        /* renamed from: s4.a$b$a */
        /* loaded from: classes.dex */
        class RunnableC10046a implements Runnable {
            RunnableC10046a(C10045b c10045b) {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    Context m34110e = C2290b.m34110e();
                    C10043a.m9334f(m34110e, C10057d.m9303i(m34110e, C10043a.f26268h), false);
                    C10043a.m9334f(m34110e, C10057d.m9302j(m34110e, C10043a.f26268h), true);
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
        /* renamed from: s4.a$b$b */
        /* loaded from: classes.dex */
        class RunnableC10047b implements Runnable {
            RunnableC10047b(C10045b c10045b) {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    Context m34110e = C2290b.m34110e();
                    ArrayList<String> m9303i = C10057d.m9303i(m34110e, C10043a.f26268h);
                    if (m9303i.isEmpty()) {
                        m9303i = C10057d.m9305g(m34110e, C10043a.f26268h);
                    }
                    C10043a.m9334f(m34110e, m9303i, false);
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        C10045b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                C2290b.m34103l().execute(new RunnableC10046a(this));
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                if (C10043a.f26264d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C2290b.m34103l().execute(new RunnableC10047b(this));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static void m9335e() {
        if (f26263c != null) {
            return;
        }
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
            Boolean bool = Boolean.TRUE;
            f26263c = bool;
            try {
                Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                f26264d = bool;
            } catch (ClassNotFoundException unused) {
                f26264d = Boolean.FALSE;
            }
            C10057d.m9310b();
            f26267g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            f26265e = new ServiceConnectionC10044a();
            f26266f = new C10045b();
        } catch (ClassNotFoundException unused2) {
            f26263c = Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m9334f(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String string = new JSONObject(next).getString("productId");
                hashMap.put(string, next);
                arrayList2.add(string);
            } catch (JSONException e) {
                Log.e(f26261a, "Error parsing in-app purchase data.", e);
            }
        }
        for (Map.Entry<String, String> entry : C10057d.m9301k(context, arrayList2, f26268h, z).entrySet()) {
            AutomaticAnalyticsLogger.m6934f((String) hashMap.get(entry.getKey()), entry.getValue(), z);
        }
    }

    /* renamed from: g */
    public static void m9333g() {
        m9335e();
        if (f26263c.booleanValue() && AutomaticAnalyticsLogger.m6937c()) {
            m9332h();
        }
    }

    /* renamed from: h */
    private static void m9332h() {
        if (f26262b.compareAndSet(false, true)) {
            Context m34110e = C2290b.m34110e();
            if (m34110e instanceof Application) {
                ((Application) m34110e).registerActivityLifecycleCallbacks(f26266f);
                m34110e.bindService(f26267g, f26265e, 1);
            }
        }
    }
}
