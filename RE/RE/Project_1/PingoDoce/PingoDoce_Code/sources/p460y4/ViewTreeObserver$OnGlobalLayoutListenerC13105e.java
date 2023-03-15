package p460y4;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;
import p306q4.C9653d;
import p377u4.AppEventUtility;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y4.e */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC13105e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: z */
    private static final Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC13105e> f34068z = new HashMap();

    /* renamed from: w */
    private WeakReference<Activity> f34069w;

    /* renamed from: x */
    private final Handler f34070x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private AtomicBoolean f34071y = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewObserver.java */
    /* renamed from: y4.e$a */
    /* loaded from: classes.dex */
    public class RunnableC13106a implements Runnable {
        RunnableC13106a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                View m6943e = AppEventUtility.m6943e((Activity) ViewTreeObserver$OnGlobalLayoutListenerC13105e.m1599a(ViewTreeObserver$OnGlobalLayoutListenerC13105e.this).get());
                Activity activity = (Activity) ViewTreeObserver$OnGlobalLayoutListenerC13105e.m1599a(ViewTreeObserver$OnGlobalLayoutListenerC13105e.this).get();
                if (m6943e != null && activity != null) {
                    for (View view : C13102c.m1612a(m6943e)) {
                        if (!C9653d.m10280g(view)) {
                            String m1609d = C13102c.m1609d(view);
                            if (!m1609d.isEmpty() && m1609d.length() <= 300) {
                                View$OnClickListenerC13107f.m1591c(view, m6943e, activity.getLocalClassName());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    private ViewTreeObserver$OnGlobalLayoutListenerC13105e(Activity activity) {
        this.f34069w = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m1599a(ViewTreeObserver$OnGlobalLayoutListenerC13105e viewTreeObserver$OnGlobalLayoutListenerC13105e) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalLayoutListenerC13105e.class)) {
            return null;
        }
        try {
            return viewTreeObserver$OnGlobalLayoutListenerC13105e.f34069w;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalLayoutListenerC13105e.class);
            return null;
        }
    }

    /* renamed from: b */
    private void m1598b() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            RunnableC13106a runnableC13106a = new RunnableC13106a();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnableC13106a.run();
            } else {
                this.f34070x.post(runnableC13106a);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: c */
    private void m1597c() {
        View m6943e;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (this.f34071y.getAndSet(true) || (m6943e = AppEventUtility.m6943e(this.f34069w.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m6943e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                m1598b();
                this.f34069w.get();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m1596d(Activity activity) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalLayoutListenerC13105e.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC13105e> map = f34068z;
            if (map.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC13105e viewTreeObserver$OnGlobalLayoutListenerC13105e = new ViewTreeObserver$OnGlobalLayoutListenerC13105e(activity);
            map.put(Integer.valueOf(hashCode), viewTreeObserver$OnGlobalLayoutListenerC13105e);
            viewTreeObserver$OnGlobalLayoutListenerC13105e.m1597c();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalLayoutListenerC13105e.class);
        }
    }

    /* renamed from: e */
    private void m1595e() {
        View m6943e;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (this.f34071y.getAndSet(false) && (m6943e = AppEventUtility.m6943e(this.f34069w.get())) != null) {
                ViewTreeObserver viewTreeObserver = m6943e.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    if (Build.VERSION.SDK_INT < 16) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m1594f(Activity activity) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalLayoutListenerC13105e.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC13105e> map = f34068z;
            if (map.containsKey(Integer.valueOf(hashCode))) {
                map.remove(Integer.valueOf(hashCode));
                map.get(Integer.valueOf(hashCode)).m1595e();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalLayoutListenerC13105e.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m1598b();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
