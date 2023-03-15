package p482z4;

import android.content.Context;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.internal.Utility;
import java.util.Collection;
import p181jd.Intrinsics;

/* renamed from: z4.o */
/* loaded from: classes.dex */
public final class Validate {

    /* renamed from: a */
    private static final String f34710a;

    static {
        new Validate();
        String name = Validate.class.getName();
        Intrinsics.checkIfNull(name, "Validate::class.java.name");
        f34710a = name;
    }

    private Validate() {
    }

    /* renamed from: a */
    public static final void m677a(Collection collection, String str) {
        Intrinsics.isThisObjectNull(collection, "container");
        Intrinsics.isThisObjectNull(str, "name");
        m671g(collection, str);
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m676b(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            p181jd.Intrinsics.isThisObjectNull(r4, r0)
            m671g(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L1b
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 != 0) goto L34
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L2a
            java.lang.String r4 = p482z4.Validate.f34710a
            android.util.Log.w(r4, r5)
            goto L34
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z4.Validate.m676b(android.content.Context, boolean):void");
    }

    /* renamed from: c */
    public static final void m675c(Context context, boolean z) {
        Intrinsics.isThisObjectNull(context, "context");
        m671g(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z) {
                Log.w(f34710a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                return;
            }
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
        }
    }

    /* renamed from: d */
    public static final void m674d(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "arg");
        Intrinsics.isThisObjectNull(str2, "name");
        if (str.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    /* renamed from: e */
    public static final void m673e(Collection collection, String str) {
        Intrinsics.isThisObjectNull(collection, "container");
        Intrinsics.isThisObjectNull(str, "name");
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
    }

    /* renamed from: f */
    public static final void m672f(Collection collection, String str) {
        Intrinsics.isThisObjectNull(collection, "container");
        Intrinsics.isThisObjectNull(str, "name");
        m677a(collection, str);
        m673e(collection, str);
    }

    /* renamed from: g */
    public static final void m671g(Object obj, String str) {
        Intrinsics.isThisObjectNull(str, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    /* renamed from: h */
    public static final void m670h(String str, String str2) {
        Intrinsics.isThisObjectNull(str2, "name");
        if (!Utility.m33977G(str)) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    /* renamed from: i */
    public static final void m669i() {
        if (!C2290b.m34095t()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
