package p078e7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C2570f;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.k */
/* loaded from: classes.dex */
public final class C5010k {
    /* renamed from: a */
    public static boolean m25891a(Context context, int i) {
        if (m25890b(context, i, "com.google.android.gms")) {
            try {
                return C2570f.m33205a(context).m33204b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m25890b(Context context, int i, String str) {
        return C5615c.m23567a(context).m23568g(i, str);
    }
}
