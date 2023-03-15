package p377u4;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* renamed from: u4.b */
/* loaded from: classes.dex */
public final class AppEventUtility {
    static {
        new AppEventUtility();
    }

    private AppEventUtility() {
    }

    /* renamed from: a */
    public static final void m6947a() {
    }

    /* renamed from: b */
    public static final void m6946b() {
    }

    /* renamed from: c */
    public static final String m6945c(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkIfNull(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: d */
    public static final String m6944d() {
        Context m34110e = C2290b.m34110e();
        try {
            Intrinsics.checkIfNull(m34110e, "context");
            String str = m34110e.getPackageManager().getPackageInfo(m34110e.getPackageName(), 0).versionName;
            Intrinsics.checkIfNull(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: e */
    public static final View m6943e(Activity activity) {
        if (CrashShieldHandler.m25963d(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                Intrinsics.checkIfNull(decorView, "window.decorView");
                return decorView.getRootView();
            }
            return null;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventUtility.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0 == false) goto L17;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m6942f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "Build.FINGERPRINT"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L73
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = sd.C10163k.m9008C(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Build.MODEL"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = sd.C10163k.m9002H(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L73
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = sd.C10163k.m9002H(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L73
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = sd.C10163k.m9002H(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Build.MANUFACTURER"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = sd.C10163k.m9002H(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "Build.BRAND"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            boolean r0 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "Build.DEVICE"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            boolean r0 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = p181jd.Intrinsics.equals(r6, r0)
            if (r0 == 0) goto L74
        L73:
            r3 = 1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p377u4.AppEventUtility.m6942f():boolean");
    }

    /* renamed from: g */
    public static final double m6941g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (matcher.find()) {
                return NumberFormat.getNumberInstance(Utility.m33941q()).parse(matcher.group(0)).doubleValue();
            }
            return 0.0d;
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
