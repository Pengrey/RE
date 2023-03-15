package p078e7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.f */
/* loaded from: classes.dex */
public final class C5005f {
    /* renamed from: a */
    public static boolean m25915a(Context context, Throwable th2) {
        try {
            C2597i.m33076j(context);
            C2597i.m33076j(th2);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
