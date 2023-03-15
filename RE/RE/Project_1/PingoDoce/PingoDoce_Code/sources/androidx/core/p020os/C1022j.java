package androidx.core.p020os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.j */
/* loaded from: classes.dex */
public class C1022j {

    /* compiled from: UserManagerCompat.java */
    /* renamed from: androidx.core.os.j$a */
    /* loaded from: classes.dex */
    static class C1023a {
        /* renamed from: a */
        static boolean m38735a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m38736a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1023a.m38735a(context);
        }
        return true;
    }
}
