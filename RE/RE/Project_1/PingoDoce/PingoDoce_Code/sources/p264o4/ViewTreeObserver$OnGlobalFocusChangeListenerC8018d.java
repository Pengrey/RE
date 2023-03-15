package p264o4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;
import p248n4.InternalAppEventsLogger;
import p377u4.AppEventUtility;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o4.d */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalFocusChangeListenerC8018d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: A */
    private static final Map<Integer, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d> f20748A = new HashMap();

    /* renamed from: y */
    private WeakReference<Activity> f20751y;

    /* renamed from: w */
    private final Set<String> f20749w = new HashSet();

    /* renamed from: x */
    private final Handler f20750x = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private AtomicBoolean f20752z = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataViewObserver.java */
    /* renamed from: o4.d$a */
    /* loaded from: classes.dex */
    public class RunnableC8019a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f20753w;

        RunnableC8019a(View view) {
            this.f20753w = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                View view = this.f20753w;
                if (view instanceof EditText) {
                    ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.m17151a(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.this, view);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    private ViewTreeObserver$OnGlobalFocusChangeListenerC8018d(Activity activity) {
        this.f20751y = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ void m17151a(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d viewTreeObserver$OnGlobalFocusChangeListenerC8018d, View view) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class)) {
            return;
        }
        try {
            viewTreeObserver$OnGlobalFocusChangeListenerC8018d.m17148d(view);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class);
        }
    }

    /* renamed from: b */
    private static String m17150b(String str, String str2) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class)) {
            return null;
        }
        try {
            return "r2".equals(str) ? str2.replaceAll("[^\\d.]", BuildConfig.VERSION_NAME) : str2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class);
            return null;
        }
    }

    /* renamed from: c */
    private void m17149c(View view) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m17146f(new RunnableC8019a(view));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: d */
    private void m17148d(View view) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
            if (!lowerCase.isEmpty() && !this.f20749w.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f20749w.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> m17166b = C8016b.m17166b(view);
                List<String> list = null;
                for (MetadataRule metadataRule : MetadataRule.m17158d()) {
                    String m17150b = m17150b(metadataRule.m17159c(), lowerCase);
                    if (metadataRule.m17157e().isEmpty() || C8016b.m17162f(m17150b, metadataRule.m17157e())) {
                        if (C8016b.m17163e(m17166b, metadataRule.m17160b())) {
                            m17147e(hashMap, metadataRule.m17159c(), m17150b);
                        } else {
                            if (list == null) {
                                list = C8016b.m17167a(view);
                            }
                            if (C8016b.m17163e(list, metadataRule.m17160b())) {
                                m17147e(hashMap, metadataRule.m17159c(), m17150b);
                            }
                        }
                    }
                }
                InternalAppEventsLogger.m17756i(hashMap);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: e */
    private static void m17147e(Map<String, String> map, String str, String str2) {
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class)) {
            return;
        }
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3588:
                    if (str.equals("r6")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (!str2.startsWith("m") && !str2.startsWith("b") && !str2.startsWith("ge")) {
                    str2 = "f";
                }
                str2 = "m";
            } else if (c != 1 && c != 2) {
                if (c == 3 && str2.contains("-")) {
                    str2 = str2.split("-")[0];
                }
            } else {
                str2 = str2.replaceAll("[^a-z]+", BuildConfig.VERSION_NAME);
            }
            map.put(str, str2);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class);
        }
    }

    /* renamed from: f */
    private void m17146f(Runnable runnable) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f20750x.post(runnable);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: g */
    private void m17145g() {
        View m6943e;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (this.f20752z.getAndSet(true) || (m6943e = AppEventUtility.m6943e(this.f20751y.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m6943e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m17144h(Activity activity) {
        ViewTreeObserver$OnGlobalFocusChangeListenerC8018d viewTreeObserver$OnGlobalFocusChangeListenerC8018d;
        if (CrashShieldHandler.m25963d(ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d> map = f20748A;
            if (!map.containsKey(Integer.valueOf(hashCode))) {
                viewTreeObserver$OnGlobalFocusChangeListenerC8018d = new ViewTreeObserver$OnGlobalFocusChangeListenerC8018d(activity);
                map.put(Integer.valueOf(activity.hashCode()), viewTreeObserver$OnGlobalFocusChangeListenerC8018d);
            } else {
                viewTreeObserver$OnGlobalFocusChangeListenerC8018d = map.get(Integer.valueOf(hashCode));
            }
            viewTreeObserver$OnGlobalFocusChangeListenerC8018d.m17145g();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ViewTreeObserver$OnGlobalFocusChangeListenerC8018d.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        if (view != null) {
            try {
                m17149c(view);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            m17149c(view2);
        }
    }
}
