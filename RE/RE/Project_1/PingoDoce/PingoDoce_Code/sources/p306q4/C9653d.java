package p306q4;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.github.aachartmodel.aainfographics.BuildConfig;
import p076e5.CrashShieldHandler;

/* renamed from: q4.d */
/* loaded from: classes.dex */
public class C9653d {
    /* renamed from: a */
    private static boolean m10286a(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            String replaceAll = C9655f.m10266k(textView).replaceAll("\\s", BuildConfig.VERSION_NAME);
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    char charAt = replaceAll.charAt(i2);
                    if (charAt >= '0' && charAt <= '9') {
                        int i3 = charAt - '0';
                        if (z && (i3 = i3 * 2) > 9) {
                            i3 = (i3 % 10) + 1;
                        }
                        i += i3;
                        z = !z;
                    }
                    return false;
                }
                return i % 10 == 0;
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m10285b(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String m10266k = C9655f.m10266k(textView);
            if (m10266k != null && m10266k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(m10266k).matches();
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m10284c(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m10283d(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m10282e(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m10281f(TextView textView) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m10280g(View view) {
        if (CrashShieldHandler.m25963d(C9653d.class)) {
            return false;
        }
        try {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (!m10284c(textView) && !m10286a(textView) && !m10283d(textView) && !m10281f(textView) && !m10282e(textView)) {
                    if (!m10285b(textView)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C9653d.class);
            return false;
        }
    }
}
