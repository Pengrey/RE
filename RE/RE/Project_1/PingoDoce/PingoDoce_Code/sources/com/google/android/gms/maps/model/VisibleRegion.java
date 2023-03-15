package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p463y7.C13135h;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C13135h();

    /* renamed from: A */
    public final LatLngBounds f8276A;

    /* renamed from: w */
    public final LatLng f8277w;

    /* renamed from: x */
    public final LatLng f8278x;

    /* renamed from: y */
    public final LatLng f8279y;

    /* renamed from: z */
    public final LatLng f8280z;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f8277w = latLng;
        this.f8278x = latLng2;
        this.f8279y = latLng3;
        this.f8280z = latLng4;
        this.f8276A = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisibleRegion) {
            VisibleRegion visibleRegion = (VisibleRegion) obj;
            return this.f8277w.equals(visibleRegion.f8277w) && this.f8278x.equals(visibleRegion.f8278x) && this.f8279y.equals(visibleRegion.f8279y) && this.f8280z.equals(visibleRegion.f8280z) && this.f8276A.equals(visibleRegion.f8276A);
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(this.f8277w, this.f8278x, this.f8279y, this.f8280z, this.f8276A);
    }

    public String toString() {
        return C13701c.m573c(this).m572a("nearLeft", this.f8277w).m572a("nearRight", this.f8278x).m572a("farLeft", this.f8279y).m572a("farRight", this.f8280z).m572a("latLngBounds", this.f8276A).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 2, this.f8277w, i, false);
        C0066a.m42004q(parcel, 3, this.f8278x, i, false);
        C0066a.m42004q(parcel, 4, this.f8279y, i, false);
        C0066a.m42004q(parcel, 5, this.f8280z, i, false);
        C0066a.m42004q(parcel, 6, this.f8276A, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
