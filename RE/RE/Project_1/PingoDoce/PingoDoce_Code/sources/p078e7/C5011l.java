package p078e7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Method;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.l */
/* loaded from: classes.dex */
public class C5011l {

    /* renamed from: a */
    private static final Method f13948a;

    /* renamed from: b */
    private static final Method f13949b;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f13948a = method;
        if (C5009j.m25900c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        }
        f13949b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        if (C5009j.m25900c()) {
            try {
                WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        }
        if (C5009j.m25894i()) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (C5009j.m25894i()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (C5009j.m25894i()) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }

    /* renamed from: a */
    public static void m25889a(WorkSource workSource, int i, String str) {
        Method method = f13949b;
        if (method != null) {
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = f13948a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m25888b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m23572c = C5615c.m23567a(context).m23572c(str, 0);
                if (m23572c == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = m23572c.uid;
                WorkSource workSource = new WorkSource();
                m25889a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m25887c(Context context) {
        return (context == null || context.getPackageManager() == null || C5615c.m23567a(context).m23573b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }
}
