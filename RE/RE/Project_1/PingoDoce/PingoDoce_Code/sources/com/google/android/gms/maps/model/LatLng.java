package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p463y7.C13133f;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C13133f();

    /* renamed from: w */
    public final double f8253w;

    /* renamed from: x */
    public final double f8254x;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.f8254x = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f8254x = d2;
        }
        this.f8253w = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLng) {
            LatLng latLng = (LatLng) obj;
            return Double.doubleToLongBits(this.f8253w) == Double.doubleToLongBits(latLng.f8253w) && Double.doubleToLongBits(this.f8254x) == Double.doubleToLongBits(latLng.f8254x);
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f8253w);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8254x);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d = this.f8253w;
        double d2 = this.f8254x;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("lat/lng: (");
        sb2.append(d);
        sb2.append(",");
        sb2.append(d2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42014g(parcel, 2, this.f8253w);
        C0066a.m42014g(parcel, 3, this.f8254x);
        C0066a.m42019b(parcel, m42020a);
    }
}
