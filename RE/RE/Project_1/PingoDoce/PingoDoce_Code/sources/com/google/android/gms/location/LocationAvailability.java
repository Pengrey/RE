package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C3107u();

    /* renamed from: A */
    zzbo[] f8161A;
    @Deprecated

    /* renamed from: w */
    int f8162w;
    @Deprecated

    /* renamed from: x */
    int f8163x;

    /* renamed from: y */
    long f8164y;

    /* renamed from: z */
    int f8165z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i, int i2, int i3, long j, zzbo[] zzboVarArr) {
        this.f8165z = i;
        this.f8162w = i2;
        this.f8163x = i3;
        this.f8164y = j;
        this.f8161A = zzboVarArr;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f8162w == locationAvailability.f8162w && this.f8163x == locationAvailability.f8163x && this.f8164y == locationAvailability.f8164y && this.f8165z == locationAvailability.f8165z && Arrays.equals(this.f8161A, locationAvailability.f8161A)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m31634h() {
        return this.f8165z < 1000;
    }

    public int hashCode() {
        return C13701c.m574b(Integer.valueOf(this.f8165z), Integer.valueOf(this.f8162w), Integer.valueOf(this.f8163x), Long.valueOf(this.f8164y), this.f8161A);
    }

    @RecentlyNonNull
    public String toString() {
        boolean m31634h = m31634h();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(m31634h);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f8162w);
        C0066a.m42009l(parcel, 2, this.f8163x);
        C0066a.m42006o(parcel, 3, this.f8164y);
        C0066a.m42009l(parcel, 4, this.f8165z);
        C0066a.m42000u(parcel, 5, this.f8161A, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
