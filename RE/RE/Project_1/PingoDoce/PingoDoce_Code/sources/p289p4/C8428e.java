package p289p4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import com.facebook.EnumC2305f;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p306q4.C9654e;
import p306q4.C9655f;
import p377u4.AppEventUtility;
import p482z4.C13646i;
import p482z4.Logger;

/* renamed from: p4.e */
/* loaded from: classes.dex */
public class C8428e {

    /* renamed from: e */
    private static final String f21818e = "p4.e";

    /* renamed from: b */
    private WeakReference<Activity> f21820b;

    /* renamed from: c */
    private Timer f21821c;

    /* renamed from: d */
    private String f21822d = null;

    /* renamed from: a */
    private final Handler f21819a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* renamed from: p4.e$a */
    /* loaded from: classes.dex */
    public class C8429a extends TimerTask {
        C8429a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) C8428e.m15424a(C8428e.this).get();
                View m6943e = AppEventUtility.m6943e(activity);
                if (activity != null && m6943e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (C8416b.m15454j()) {
                        if (C13646i.m716b()) {
                            C9654e.m10279a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC8433e(m6943e));
                        C8428e.m15423b(C8428e.this).post(futureTask);
                        String str = BuildConfig.VERSION_NAME;
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            Log.e(C8428e.m15422c(), "Failed to take screenshot.", e);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(C9655f.m10273d(m6943e));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(C8428e.m15422c(), "Failed to create JSONObject");
                        }
                        C8428e.m15421d(C8428e.this, jSONObject.toString());
                    }
                }
            } catch (Exception e2) {
                Log.e(C8428e.m15422c(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* renamed from: p4.e$b */
    /* loaded from: classes.dex */
    public class RunnableC8430b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ TimerTask f21824w;

        RunnableC8430b(TimerTask timerTask) {
            this.f21824w = timerTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                try {
                    if (C8428e.m15420e(C8428e.this) != null) {
                        C8428e.m15420e(C8428e.this).cancel();
                    }
                    C8428e.m15417h(C8428e.this, null);
                    C8428e.m15419f(C8428e.this, new Timer());
                    C8428e.m15420e(C8428e.this).scheduleAtFixedRate(this.f21824w, 0L, 1000L);
                } catch (Exception e) {
                    Log.e(C8428e.m15422c(), "Error scheduling indexing job", e);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* renamed from: p4.e$c */
    /* loaded from: classes.dex */
    public class RunnableC8431c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f21826w;

        RunnableC8431c(String str) {
            this.f21826w = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                String m33971M = Utility.m33971M(this.f21826w);
                AccessToken m34255c = AccessToken.m34255c();
                if (m33971M == null || !m33971M.equals(C8428e.m15418g(C8428e.this))) {
                    C8428e.this.m15415j(C8428e.m15416i(this.f21826w, m34255c, C2290b.m34109f(), "app_indexing"), m33971M);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* renamed from: p4.e$d */
    /* loaded from: classes.dex */
    public static class C8432d implements GraphRequest.InterfaceC2278b {
        C8432d() {
        }

        @Override // com.facebook.GraphRequest.InterfaceC2278b
        /* renamed from: a */
        public void mo15411a(GraphResponse graphResponse) {
            Logger.m707f(EnumC2305f.APP_EVENTS, C8428e.m15422c(), "App index sent to FB!");
        }
    }

    /* compiled from: ViewIndexer.java */
    /* renamed from: p4.e$e */
    /* loaded from: classes.dex */
    private static class CallableC8433e implements Callable<String> {

        /* renamed from: a */
        private WeakReference<View> f21828a;

        CallableC8433e(View view) {
            this.f21828a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            View view = this.f21828a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return BuildConfig.VERSION_NAME;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public C8428e(Activity activity) {
        this.f21820b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m15424a(C8428e c8428e) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            return c8428e.f21820b;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Handler m15423b(C8428e c8428e) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            return c8428e.f21819a;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m15422c() {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            return f21818e;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m15421d(C8428e c8428e, String str) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return;
        }
        try {
            c8428e.m15413l(str);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
        }
    }

    /* renamed from: e */
    static /* synthetic */ Timer m15420e(C8428e c8428e) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            return c8428e.f21821c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ Timer m15419f(C8428e c8428e, Timer timer) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            c8428e.f21821c = timer;
            return timer;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ String m15418g(C8428e c8428e) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            return c8428e.f21822d;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: h */
    static /* synthetic */ String m15417h(C8428e c8428e, String str) {
        if (CrashShieldHandler.m25963d(C8428e.class)) {
            return null;
        }
        try {
            c8428e.f21822d = str;
            return str;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: i */
    public static GraphRequest m15416i(String str, AccessToken accessToken, String str2, String str3) {
        if (CrashShieldHandler.m25963d(C8428e.class) || str == null) {
            return null;
        }
        try {
            GraphRequest m34187x = GraphRequest.m34187x(accessToken, String.format(Locale.US, "%s/app_indexing", str2), null, null);
            Bundle m34193r = m34187x.m34193r();
            if (m34193r == null) {
                m34193r = new Bundle();
            }
            m34193r.putString("tree", str);
            m34193r.putString("app_version", AppEventUtility.m6944d());
            m34193r.putString("platform", "android");
            m34193r.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                m34193r.putString("device_session_id", C8416b.m15455i());
            }
            m34187x.m34213C(m34193r);
            m34187x.m34185z(new C8432d());
            return m34187x;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8428e.class);
            return null;
        }
    }

    /* renamed from: l */
    private void m15413l(String str) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            C2290b.m34103l().execute(new RunnableC8431c(str));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: j */
    void m15415j(GraphRequest graphRequest, String str) {
        if (CrashShieldHandler.m25963d(this) || graphRequest == null) {
            return;
        }
        try {
            GraphResponse m34201j = graphRequest.m34201j();
            try {
                JSONObject m34082c = m34201j.m34082c();
                if (m34082c != null) {
                    if ("true".equals(m34082c.optString("success"))) {
                        Logger.m707f(EnumC2305f.APP_EVENTS, f21818e, "Successfully send UI component tree to server");
                        this.f21822d = str;
                    }
                    if (m34082c.has("is_app_indexing_enabled")) {
                        C8416b.m15449o(Boolean.valueOf(m34082c.getBoolean("is_app_indexing_enabled")));
                        return;
                    }
                    return;
                }
                String str2 = f21818e;
                Log.e(str2, "Error sending UI component tree to Facebook: " + m34201j.m34083b());
            } catch (JSONException e) {
                Log.e(f21818e, "Error decoding server response.", e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: k */
    public void m15414k() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            try {
                C2290b.m34103l().execute(new RunnableC8430b(new C8429a()));
            } catch (RejectedExecutionException e) {
                Log.e(f21818e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: m */
    public void m15412m() {
        Timer timer;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (this.f21820b.get() == null || (timer = this.f21821c) == null) {
                return;
            }
            try {
                timer.cancel();
                this.f21821c = null;
            } catch (Exception e) {
                Log.e(f21818e, "Error unscheduling indexing job", e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
