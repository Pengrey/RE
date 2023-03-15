package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0928a;
import java.util.Arrays;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public class C0883b extends C0928a {

    /* renamed from: d */
    private static InterfaceC0888e f3063d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    public class RunnableC0884a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String[] f3064w;

        /* renamed from: x */
        final /* synthetic */ Activity f3065x;

        /* renamed from: y */
        final /* synthetic */ int f3066y;

        RunnableC0884a(String[] strArr, Activity activity, int i) {
            this.f3064w = strArr;
            this.f3065x = activity;
            this.f3066y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f3064w.length];
            PackageManager packageManager = this.f3065x.getPackageManager();
            String packageName = this.f3065x.getPackageName();
            int length = this.f3064w.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f3064w[i], packageName);
            }
            ((InterfaceC0887d) this.f3065x).onRequestPermissionsResult(this.f3066y, this.f3064w, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes.dex */
    public static class C0885b {
        /* renamed from: a */
        static void m39258a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m39257b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m39256c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    public static class C0886c {
        /* renamed from: a */
        static void m39255a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m39254b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m39253c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0887d {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0888e {
        /* renamed from: a */
        boolean m39252a(Activity activity, String[] strArr, int i);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0889f {
        /* renamed from: a */
        void mo37314a(int i);
    }

    /* renamed from: o */
    public static void m39265o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0885b.m39258a(activity);
        } else {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m39264p(Activity activity) {
        if (activity.isFinishing() || C0893d.m39238i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: q */
    public static void m39263q(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0883b.m39264p(activity);
                }
            });
        }
    }

    /* renamed from: r */
    public static void m39262r(Activity activity, String[] strArr, int i) {
        InterfaceC0888e interfaceC0888e = f3063d;
        if (interfaceC0888e == null || !interfaceC0888e.m39252a(activity, strArr, i)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof InterfaceC0889f) {
                    ((InterfaceC0889f) activity).mo37314a(i);
                }
                C0886c.m39254b(activity, strArr, i);
            } else if (activity instanceof InterfaceC0887d) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0884a(strArr, activity, i));
            }
        }
    }

    /* renamed from: s */
    public static boolean m39261s(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0886c.m39253c(activity, str);
        }
        return false;
    }

    /* renamed from: t */
    public static void m39260t(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0885b.m39257b(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: u */
    public static void m39259u(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            C0885b.m39256c(activity, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
