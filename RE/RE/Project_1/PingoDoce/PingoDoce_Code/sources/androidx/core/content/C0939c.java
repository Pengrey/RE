package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0898e;
import androidx.core.util.C1070c;

/* renamed from: androidx.core.content.c */
/* loaded from: classes.dex */
public final class C0939c {
    /* renamed from: a */
    public static int m39079a(Context context, String str, int i, int i2, String str2) {
        int m39236b;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m39235c = C0898e.m39235c(str);
        if (m39235c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i2 && C1070c.m38634a(context.getPackageName(), str2)) {
            m39236b = C0898e.m39237a(context, i2, m39235c, str2);
        } else {
            m39236b = C0898e.m39236b(context, m39235c, str2);
        }
        return m39236b == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m39078b(Context context, String str) {
        return m39079a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
