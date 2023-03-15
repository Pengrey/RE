package na;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0928a;
import p081ea.InterfaceC5025c;

/* renamed from: na.a */
/* loaded from: classes.dex */
public class C7692a {

    /* renamed from: a */
    private final Context f20281a;

    /* renamed from: b */
    private final SharedPreferences f20282b;

    /* renamed from: c */
    private final InterfaceC5025c f20283c;

    /* renamed from: d */
    private boolean f20284d;

    public C7692a(Context context, String str, InterfaceC5025c interfaceC5025c) {
        Context m17709a = m17709a(context);
        this.f20281a = m17709a;
        this.f20282b = m17709a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f20283c = interfaceC5025c;
        this.f20284d = m17707c();
    }

    /* renamed from: a */
    private static Context m17709a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C0928a.m39115b(context);
    }

    /* renamed from: c */
    private boolean m17707c() {
        if (this.f20282b.contains("firebase_data_collection_default_enabled")) {
            return this.f20282b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m17706d();
    }

    /* renamed from: d */
    private boolean m17706d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f20281a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f20281a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m17708b() {
        return this.f20284d;
    }
}
