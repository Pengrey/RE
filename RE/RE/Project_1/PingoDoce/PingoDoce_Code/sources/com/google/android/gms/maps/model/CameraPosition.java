package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p463y7.C13131d;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C13131d();

    /* renamed from: w */
    public final LatLng f8245w;

    /* renamed from: x */
    public final float f8246x;

    /* renamed from: y */
    public final float f8247y;

    /* renamed from: z */
    public final float f8248z;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    /* loaded from: classes.dex */
    public static final class C3120a {

        /* renamed from: a */
        private LatLng f8249a;

        /* renamed from: b */
        private float f8250b;

        /* renamed from: c */
        private float f8251c;

        /* renamed from: d */
        private float f8252d;

        /* renamed from: a */
        public C3120a m31561a(float f) {
            this.f8252d = f;
            return this;
        }

        /* renamed from: b */
        public CameraPosition m31560b() {
            return new CameraPosition(this.f8249a, this.f8250b, this.f8251c, this.f8252d);
        }

        /* renamed from: c */
        public C3120a m31559c(LatLng latLng) {
            this.f8249a = (LatLng) C2597i.m33075k(latLng, "location must not be null.");
            return this;
        }

        /* renamed from: d */
        public C3120a m31558d(float f) {
            this.f8251c = f;
            return this;
        }

        /* renamed from: e */
        public C3120a m31557e(float f) {
            this.f8250b = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C2597i.m33075k(latLng, "camera target must not be null.");
        C2597i.m33083c(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f8245w = latLng;
        this.f8246x = f;
        this.f8247y = f2 + 0.0f;
        this.f8248z = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: h */
    public static C3120a m31562h() {
        return new C3120a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.f8245w.equals(cameraPosition.f8245w) && Float.floatToIntBits(this.f8246x) == Float.floatToIntBits(cameraPosition.f8246x) && Float.floatToIntBits(this.f8247y) == Float.floatToIntBits(cameraPosition.f8247y) && Float.floatToIntBits(this.f8248z) == Float.floatToIntBits(cameraPosition.f8248z);
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(this.f8245w, Float.valueOf(this.f8246x), Float.valueOf(this.f8247y), Float.valueOf(this.f8248z));
    }

    public String toString() {
        return C13701c.m573c(this).m572a("target", this.f8245w).m572a("zoom", Float.valueOf(this.f8246x)).m572a("tilt", Float.valueOf(this.f8247y)).m572a("bearing", Float.valueOf(this.f8248z)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 2, this.f8245w, i, false);
        C0066a.m42012i(parcel, 3, this.f8246x);
        C0066a.m42012i(parcel, 4, this.f8247y);
        C0066a.m42012i(parcel, 5, this.f8248z);
        C0066a.m42019b(parcel, m42020a);
    }
}
