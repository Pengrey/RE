package p062db;

import com.google.android.gms.maps.model.LatLng;
import p046cb.C2107b;

/* renamed from: db.b */
/* loaded from: classes2.dex */
public class C4774b {

    /* renamed from: a */
    final double f13075a;

    public C4774b(double d) {
        this.f13075a = d;
    }

    /* renamed from: a */
    public LatLng m26652a(C2107b c2107b) {
        double d = c2107b.f6112a;
        double d2 = this.f13075a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (c2107b.f6113b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public C4773a m26651b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f8253w));
        double d = this.f13075a;
        return new C4773a(((latLng.f8254x / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * d);
    }
}
