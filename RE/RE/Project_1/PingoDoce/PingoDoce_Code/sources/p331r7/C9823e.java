package p331r7;

import android.os.Looper;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: r7.e */
/* loaded from: classes.dex */
public final class C9823e {
    /* renamed from: a */
    public static Looper m9917a(Looper looper) {
        return looper != null ? looper : m9916b();
    }

    /* renamed from: b */
    public static Looper m9916b() {
        C2597i.m33072n(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
