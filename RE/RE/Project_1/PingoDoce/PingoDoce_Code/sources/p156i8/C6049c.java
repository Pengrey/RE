package p156i8;

import android.os.Build;

/* renamed from: i8.c */
/* loaded from: classes.dex */
public class C6049c {

    /* renamed from: a */
    public static final int f16693a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f16693a = 2;
        } else if (i >= 18) {
            f16693a = 1;
        } else {
            f16693a = 0;
        }
    }
}
