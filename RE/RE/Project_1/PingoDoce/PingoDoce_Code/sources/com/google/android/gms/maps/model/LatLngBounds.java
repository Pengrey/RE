package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p463y7.C13132e;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C13132e();

    /* renamed from: w */
    public final LatLng f8255w;

    /* renamed from: x */
    public final LatLng f8256x;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    /* loaded from: classes.dex */
    public static final class C3121a {

        /* renamed from: a */
        private double f8257a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f8258b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f8259c = Double.NaN;

        /* renamed from: d */
        private double f8260d = Double.NaN;

        /* renamed from: a */
        public LatLngBounds m31553a() {
            C2597i.m33072n(!Double.isNaN(this.f8259c), "no included points");
            return new LatLngBounds(new LatLng(this.f8257a, this.f8259c), new LatLng(this.f8258b, this.f8260d));
        }

        /* renamed from: b */
        public C3121a m31552b(LatLng latLng) {
            C2597i.m33075k(latLng, "point must not be null");
            this.f8257a = Math.min(this.f8257a, latLng.f8253w);
            this.f8258b = Math.max(this.f8258b, latLng.f8253w);
            double d = latLng.f8254x;
            if (Double.isNaN(this.f8259c)) {
                this.f8259c = d;
                this.f8260d = d;
            } else {
                double d2 = this.f8259c;
                double d3 = this.f8260d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.f8259c = d;
                    } else {
                        this.f8260d = d;
                    }
                }
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C2597i.m33075k(latLng, "southwest must not be null.");
        C2597i.m33075k(latLng2, "northeast must not be null.");
        double d = latLng2.f8253w;
        double d2 = latLng.f8253w;
        C2597i.m33083c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f8253w));
        this.f8255w = latLng;
        this.f8256x = latLng2;
    }

    /* renamed from: h */
    public static C3121a m31556h() {
        return new C3121a();
    }

    /* renamed from: v */
    private final boolean m31554v(double d) {
        double d2 = this.f8255w.f8254x;
        double d3 = this.f8256x.f8254x;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        int i2 = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        return i <= 0 ? i2 <= 0 && d <= d3 : i2 <= 0 || d <= d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.f8255w.equals(latLngBounds.f8255w) && this.f8256x.equals(latLngBounds.f8256x);
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(this.f8255w, this.f8256x);
    }

    /* renamed from: t */
    public boolean m31555t(LatLng latLng) {
        LatLng latLng2 = (LatLng) C2597i.m33075k(latLng, "point must not be null.");
        double d = latLng2.f8253w;
        return this.f8255w.f8253w <= d && d <= this.f8256x.f8253w && m31554v(latLng2.f8254x);
    }

    public String toString() {
        return C13701c.m573c(this).m572a("southwest", this.f8255w).m572a("northeast", this.f8256x).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 2, this.f8255w, i, false);
        C0066a.m42004q(parcel, 3, this.f8256x, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
