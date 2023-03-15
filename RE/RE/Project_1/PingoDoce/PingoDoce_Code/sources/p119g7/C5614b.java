package p119g7;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import p078e7.C5009j;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: g7.b */
/* loaded from: classes.dex */
public class C5614b {

    /* renamed from: a */
    protected final Context f15850a;

    public C5614b(Context context) {
        this.f15850a = context;
    }

    /* renamed from: a */
    public int m23574a(String str) {
        return this.f15850a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m23573b(String str, String str2) {
        return this.f15850a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m23572c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f15850a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence m23571d(String str) throws PackageManager.NameNotFoundException {
        return this.f15850a.getPackageManager().getApplicationLabel(this.f15850a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m23570e(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f15850a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean m23569f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C5613a.m23575a(this.f15850a);
        }
        if (!C5009j.m25895h() || (nameForUid = this.f15850a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f15850a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean m23568g(int i, String str) {
        if (C5009j.m25899d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f15850a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f15850a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
