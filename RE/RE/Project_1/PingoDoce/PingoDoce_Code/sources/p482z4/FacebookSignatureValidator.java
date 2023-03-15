package p482z4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.internal.Utility;
import java.util.HashSet;
import p181jd.Intrinsics;
import p489zc.C13778q0;
import p489zc._Collections;
import sd.StringsJVM;

/* renamed from: z4.c */
/* loaded from: classes.dex */
public final class FacebookSignatureValidator {

    /* renamed from: a */
    private static final HashSet f34657a;

    static {
        HashSet m207c;
        new FacebookSignatureValidator();
        m207c = C13778q0.m207c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3");
        f34657a = m207c;
    }

    private FacebookSignatureValidator() {
    }

    /* renamed from: a */
    public static final boolean m755a(Context context, String str) {
        boolean m8948C;
        boolean m490E;
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(str, "packageName");
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        Intrinsics.checkIfNull(str2, "brand");
        m8948C = StringsJVM.m8948C(str2, "generic", false, 2, null);
        if (!m8948C || (i & 2) == 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    Intrinsics.checkIfNull(signatureArr, "packageInfo.signatures");
                    if (signatureArr.length == 0) {
                        return false;
                    }
                    Signature[] signatureArr2 = packageInfo.signatures;
                    Intrinsics.checkIfNull(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet hashSet = f34657a;
                        byte[] byteArray = signature.toByteArray();
                        Intrinsics.checkIfNull(byteArray, "it.toByteArray()");
                        m490E = _Collections.m490E(hashSet, Utility.m33960X(byteArray));
                        if (!m490E) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
