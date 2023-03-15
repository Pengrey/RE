package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class C0893d {

    /* renamed from: a */
    protected static final Class<?> f3068a;

    /* renamed from: b */
    protected static final Field f3069b;

    /* renamed from: c */
    protected static final Field f3070c;

    /* renamed from: d */
    protected static final Method f3071d;

    /* renamed from: e */
    protected static final Method f3072e;

    /* renamed from: f */
    protected static final Method f3073f;

    /* renamed from: g */
    private static final Handler f3074g = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.d$a */
    /* loaded from: classes.dex */
    public class RunnableC0894a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C0897d f3075w;

        /* renamed from: x */
        final /* synthetic */ Object f3076x;

        RunnableC0894a(C0897d c0897d, Object obj) {
            this.f3075w = c0897d;
            this.f3076x = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3075w.f3083w = this.f3076x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.d$b */
    /* loaded from: classes.dex */
    public class RunnableC0895b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Application f3077w;

        /* renamed from: x */
        final /* synthetic */ C0897d f3078x;

        RunnableC0895b(Application application, C0897d c0897d) {
            this.f3077w = application;
            this.f3078x = c0897d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3077w.unregisterActivityLifecycleCallbacks(this.f3078x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.d$c */
    /* loaded from: classes.dex */
    public class RunnableC0896c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Object f3079w;

        /* renamed from: x */
        final /* synthetic */ Object f3080x;

        RunnableC0896c(Object obj, Object obj2) {
            this.f3079w = obj;
            this.f3080x = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0893d.f3071d;
                if (method != null) {
                    method.invoke(this.f3079w, this.f3080x, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0893d.f3072e.invoke(this.f3079w, this.f3080x, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.d$d */
    /* loaded from: classes.dex */
    public static final class C0897d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: w */
        Object f3083w;

        /* renamed from: x */
        private Activity f3084x;

        /* renamed from: y */
        private final int f3085y;

        /* renamed from: z */
        private boolean f3086z = false;

        /* renamed from: A */
        private boolean f3081A = false;

        /* renamed from: B */
        private boolean f3082B = false;

        C0897d(Activity activity) {
            this.f3084x = activity;
            this.f3085y = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3084x == activity) {
                this.f3084x = null;
                this.f3081A = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3081A || this.f3082B || this.f3086z || !C0893d.m39239h(this.f3083w, this.f3085y, activity)) {
                return;
            }
            this.f3082B = true;
            this.f3083w = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3084x == activity) {
                this.f3086z = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m39246a = m39246a();
        f3068a = m39246a;
        f3069b = m39245b();
        f3070c = m39241f();
        f3071d = m39243d(m39246a);
        f3072e = m39244c(m39246a);
        f3073f = m39242e(m39246a);
    }

    /* renamed from: a */
    private static Class<?> m39246a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m39245b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m39244c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m39243d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m39242e(Class<?> cls) {
        if (m39240g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m39241f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m39240g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m39239h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f3070c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f3074g.postAtFrontOfQueue(new RunnableC0896c(f3069b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m39238i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m39240g() && f3073f == null) {
            return false;
        } else {
            if (f3072e == null && f3071d == null) {
                return false;
            }
            try {
                Object obj2 = f3070c.get(activity);
                if (obj2 == null || (obj = f3069b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0897d c0897d = new C0897d(activity);
                application.registerActivityLifecycleCallbacks(c0897d);
                Handler handler = f3074g;
                handler.post(new RunnableC0894a(c0897d, obj2));
                if (m39240g()) {
                    Method method = f3073f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0895b(application, c0897d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
