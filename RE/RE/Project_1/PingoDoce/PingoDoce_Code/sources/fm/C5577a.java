package fm;

import android.text.TextUtils;
import jm.C6537a;

/* renamed from: fm.a */
/* loaded from: classes2.dex */
public final class C5577a {
    static {
        new C5577a();
    }

    private C5577a() {
    }

    /* renamed from: a */
    public static final boolean m23719a(String str, boolean z) {
        if (z) {
            if (str == null || str.length() == 0) {
                return true;
            }
        }
        if (str != null && str.length() == 9 && TextUtils.isDigitsOnly(str)) {
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                try {
                    i += (str.charAt(i2) - '0') * (9 - i2);
                } catch (Exception e) {
                    C6537a.m20672g(e, "Error validating nif: " + str, new Object[0]);
                    return false;
                }
            }
            int i3 = 11 - (i % 11);
            if (i3 >= 10) {
                i3 = 0;
            }
            return i3 == str.charAt(8) + 65488;
        }
        return false;
    }
}
