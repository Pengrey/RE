package p440x7;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.v */
/* loaded from: classes.dex */
public final class C12319v {
    private C12319v() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m3092a(Bundle bundle, String str) {
        ClassLoader m3089d = m3089d();
        bundle.setClassLoader(m3089d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(m3089d);
        return (T) bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m3091b(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable m3092a = m3092a(bundle, "MapOptions");
        if (m3092a != null) {
            m3090c(bundle2, "MapOptions", m3092a);
        }
        Parcelable m3092a2 = m3092a(bundle, "StreetViewPanoramaOptions");
        if (m3092a2 != null) {
            m3090c(bundle2, "StreetViewPanoramaOptions", m3092a2);
        }
        Parcelable m3092a3 = m3092a(bundle, "camera");
        if (m3092a3 != null) {
            m3090c(bundle2, "camera", m3092a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    /* renamed from: c */
    public static void m3090c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader m3089d = m3089d();
        bundle.setClassLoader(m3089d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(m3089d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    private static ClassLoader m3089d() {
        return (ClassLoader) C2597i.m33076j(C12319v.class.getClassLoader());
    }
}
