package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.content.res.C0955h;
import androidx.core.util.C1070c;
import java.io.File;
import java.util.HashMap;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0928a {

    /* renamed from: a */
    private static final Object f3186a = new Object();

    /* renamed from: b */
    private static final Object f3187b = new Object();

    /* renamed from: c */
    private static TypedValue f3188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    public static class C0929a {
        /* renamed from: a */
        static void m39103a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m39102b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    static class C0930b {
        /* renamed from: a */
        static File[] m39101a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m39100b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m39099c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    static class C0931c {
        /* renamed from: a */
        static File m39098a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m39097b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m39096c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    public static class C0932d {
        /* renamed from: a */
        static int m39095a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m39094b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m39093c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    static class C0933e {
        /* renamed from: a */
        static Context m39092a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m39091b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m39090c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes.dex */
    public static final class C0934f {

        /* renamed from: a */
        static final HashMap<Class<?>, String> f3189a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f3189a = hashMap;
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            if (i >= 21) {
                hashMap.put(AppWidgetManager.class, "appwidget");
                hashMap.put(BatteryManager.class, "batterymanager");
                hashMap.put(CameraManager.class, "camera");
                hashMap.put(JobScheduler.class, "jobscheduler");
                hashMap.put(LauncherApps.class, "launcherapps");
                hashMap.put(MediaProjectionManager.class, "media_projection");
                hashMap.put(MediaSessionManager.class, "media_session");
                hashMap.put(RestrictionsManager.class, "restrictions");
                hashMap.put(TelecomManager.class, "telecom");
                hashMap.put(TvInputManager.class, "tv_input");
            }
            if (i >= 19) {
                hashMap.put(AppOpsManager.class, "appops");
                hashMap.put(CaptioningManager.class, "captioning");
                hashMap.put(ConsumerIrManager.class, "consumer_ir");
                hashMap.put(PrintManager.class, "print");
            }
            if (i >= 18) {
                hashMap.put(BluetoothManager.class, "bluetooth");
            }
            if (i >= 17) {
                hashMap.put(DisplayManager.class, "display");
                hashMap.put(UserManager.class, "user");
            }
            if (i >= 16) {
                hashMap.put(InputManager.class, "input");
                hashMap.put(MediaRouter.class, "media_router");
                hashMap.put(NsdManager.class, "servicediscovery");
            }
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static int m39116a(Context context, String str) {
        C1070c.m38631d(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m39115b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0933e.m39092a(context);
        }
        return null;
    }

    /* renamed from: c */
    private static File m39114c(File file) {
        synchronized (f3187b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    /* renamed from: d */
    public static int m39113d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0932d.m39095a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m39112e(Context context, int i) {
        return C0955h.m38997d(context.getResources(), i, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m39111f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0931c.m39097b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f3186a) {
            if (f3188c == null) {
                f3188c = new TypedValue();
            }
            context.getResources().getValue(i, f3188c, true);
            i2 = f3188c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: g */
    public static File[] m39110g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? C0930b.m39101a(context) : new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: h */
    public static File[] m39109h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? C0930b.m39100b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: i */
    public static File m39108i(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0931c.m39096c(context);
        }
        return m39114c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: j */
    public static <T> T m39107j(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) C0932d.m39094b(context, cls);
        }
        String m39106k = m39106k(context, cls);
        if (m39106k != null) {
            return (T) context.getSystemService(m39106k);
        }
        return null;
    }

    /* renamed from: k */
    public static String m39106k(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0932d.m39093c(context, cls);
        }
        return C0934f.f3189a.get(cls);
    }

    /* renamed from: l */
    public static boolean m39105l(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0929a.m39103a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: m */
    public static void m39104m(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0929a.m39102b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
