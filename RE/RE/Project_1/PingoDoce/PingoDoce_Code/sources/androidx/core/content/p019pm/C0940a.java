package androidx.core.content.p019pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.a */
/* loaded from: classes.dex */
public final class C0940a {

    /* compiled from: PackageInfoCompat.java */
    /* renamed from: androidx.core.content.pm.a$a */
    /* loaded from: classes.dex */
    private static class C0941a {
        /* renamed from: a */
        static Signature[] m39076a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        /* renamed from: b */
        static long m39075b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        /* renamed from: c */
        static Signature[] m39074c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        /* renamed from: d */
        static boolean m39073d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        /* renamed from: e */
        static boolean m39072e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static long m39077a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0941a.m39075b(packageInfo);
        }
        return packageInfo.versionCode;
    }
}
