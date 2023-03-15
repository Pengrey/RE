package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.f */
/* loaded from: classes.dex */
public class C2570f {
    @Nullable

    /* renamed from: c */
    private static C2570f f7396c;

    /* renamed from: a */
    private final Context f7397a;

    /* renamed from: b */
    private volatile String f7398b;

    public C2570f(Context context) {
        this.f7397a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C2570f m33205a(Context context) {
        C2597i.m33076j(context);
        synchronized (C2570f.class) {
            if (f7396c == null) {
                C2626r.m33004d(context);
                f7396c = new C2570f(context);
            }
        }
        return f7396c;
    }

    @Nullable
    /* renamed from: d */
    static final AbstractBinderC2622n m33202d(PackageInfo packageInfo, AbstractBinderC2622n... abstractBinderC2622nArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC2623o binderC2623o = new BinderC2623o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC2622nArr.length; i++) {
            if (abstractBinderC2622nArr[i].equals(binderC2623o)) {
                return abstractBinderC2622nArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m33201e(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m33202d(packageInfo, C2625q.f7546a) : m33202d(packageInfo, C2625q.f7546a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    private final C2636x m33200f(String str, boolean z, boolean z2) {
        C2636x m32989c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C2636x.m32989c("null pkg");
        }
        if (!str.equals(this.f7398b)) {
            if (C2626r.m33003e()) {
                m32989c = C2626r.m33006b(str, C2569e.m33212e(this.f7397a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f7397a.getPackageManager().getPackageInfo(str, 64);
                    boolean m33212e = C2569e.m33212e(this.f7397a);
                    if (packageInfo == null) {
                        m32989c = C2636x.m32989c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            BinderC2623o binderC2623o = new BinderC2623o(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            C2636x m33007a = C2626r.m33007a(str2, binderC2623o, m33212e, false);
                            m32989c = (!m33007a.f7556a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C2626r.m33007a(str2, binderC2623o, false, true).f7556a) ? m33007a : C2636x.m32989c("debuggable release cert app rejected");
                        } else {
                            m32989c = C2636x.m32989c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return C2636x.m32988d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e);
                }
            }
            if (m32989c.f7556a) {
                this.f7398b = str;
            }
            return m32989c;
        }
        return C2636x.m32990b();
    }

    /* renamed from: b */
    public boolean m33204b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m33201e(packageInfo, false)) {
            return true;
        }
        if (m33201e(packageInfo, true)) {
            if (C2569e.m33212e(this.f7397a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m33203c(int i) {
        C2636x m32989c;
        int length;
        String[] packagesForUid = this.f7397a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m32989c = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    m32989c = m33200f(packagesForUid[i2], false, false);
                    if (m32989c.f7556a) {
                        break;
                    }
                    i2++;
                } else {
                    C2597i.m33076j(m32989c);
                    break;
                }
            }
        } else {
            m32989c = C2636x.m32989c("no pkgs");
        }
        m32989c.m32987e();
        return m32989c.f7556a;
    }
}
