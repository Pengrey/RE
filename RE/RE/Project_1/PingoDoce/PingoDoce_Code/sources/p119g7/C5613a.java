package p119g7;

import android.content.Context;
import p078e7.C5009j;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: g7.a */
/* loaded from: classes.dex */
public class C5613a {

    /* renamed from: a */
    private static Context f15848a;

    /* renamed from: b */
    private static Boolean f15849b;

    /* renamed from: a */
    public static synchronized boolean m23575a(Context context) {
        Boolean bool;
        synchronized (C5613a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f15848a;
            if (context2 != null && (bool = f15849b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f15849b = null;
            if (C5009j.m25895h()) {
                f15849b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f15849b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f15849b = Boolean.FALSE;
                }
            }
            f15848a = applicationContext;
            return f15849b.booleanValue();
        }
    }
}
