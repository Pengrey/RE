package p031b9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import p060d9.C4754a;

/* renamed from: b9.m */
/* loaded from: classes.dex */
public final class C1856m {

    /* renamed from: a */
    private static final C1844a f5579a = new C1844a("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m35252a(Context context) {
        Signature[] signatureArr;
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr == null || (r1 = signatureArr.length) == 0) {
            f5579a.m35276g("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String m26694b = C4754a.m26694b(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(m26694b)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(m26694b)) {
                return true;
            }
        }
        return false;
    }
}
