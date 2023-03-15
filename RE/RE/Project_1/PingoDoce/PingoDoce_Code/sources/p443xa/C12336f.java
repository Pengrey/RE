package p443xa;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: xa.f */
/* loaded from: classes2.dex */
public class C12336f {
    /* renamed from: a */
    static double m3056a(LatLng latLng, LatLng latLng2) {
        return m3054c(Math.toRadians(latLng.f8253w), Math.toRadians(latLng.f8254x), Math.toRadians(latLng2.f8253w), Math.toRadians(latLng2.f8254x));
    }

    /* renamed from: b */
    public static double m3055b(LatLng latLng, LatLng latLng2) {
        return m3056a(latLng, latLng2) * 6371009.0d;
    }

    /* renamed from: c */
    private static double m3054c(double d, double d2, double d3, double d4) {
        return C12331a.m3059a(C12331a.m3057c(d, d3, d2 - d4));
    }
}
