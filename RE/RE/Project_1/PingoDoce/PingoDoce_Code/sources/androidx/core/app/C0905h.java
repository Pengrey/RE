package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public final class C0905h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavUtils.java */
    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes.dex */
    public static class C0906a {
        /* renamed from: a */
        static Intent m39217a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        static boolean m39216b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        static boolean m39215c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m39223a(Activity activity) {
        Intent m39217a;
        if (Build.VERSION.SDK_INT < 16 || (m39217a = C0906a.m39217a(activity)) == null) {
            String m39221c = m39221c(activity);
            if (m39221c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m39221c);
            try {
                if (m39220d(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m39221c + "' in manifest");
                return null;
            }
        }
        return m39217a;
    }

    /* renamed from: b */
    public static Intent m39222b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String m39220d = m39220d(context, componentName);
        if (m39220d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m39220d);
        if (m39220d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m39221c(Activity activity) {
        try {
            return m39220d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m39220d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (i < 16 || (str = activityInfo.parentActivityName) == null) {
            Bundle bundle = activityInfo.metaData;
            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return context.getPackageName() + string;
            }
            return string;
        }
        return str;
    }

    /* renamed from: e */
    public static void m39219e(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0906a.m39216b(activity, intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: f */
    public static boolean m39218f(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0906a.m39215c(activity, intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }
}
