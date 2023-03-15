package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.provider.b */
/* loaded from: classes.dex */
class C1027b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Handler m38731a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
