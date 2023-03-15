package p138hc;

import android.os.Looper;

/* renamed from: hc.s */
/* loaded from: classes2.dex */
public class C5907s {
    /* renamed from: a */
    public static void m22768a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
