package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: w */
    private final List<Location> f8176w;

    /* renamed from: x */
    static final List<Location> f8175x = Collections.emptyList();
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new C3109w();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List<Location> list) {
        this.f8176w = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.f8176w.size() != this.f8176w.size()) {
                return false;
            }
            Iterator<Location> it = locationResult.f8176w.iterator();
            Iterator<Location> it2 = this.f8176w.iterator();
            while (it.hasNext()) {
                if (it2.next().getTime() != it.next().getTime()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public Location m31624h() {
        int size = this.f8176w.size();
        if (size == 0) {
            return null;
        }
        return this.f8176w.get(size - 1);
    }

    public int hashCode() {
        int i = 17;
        for (Location location : this.f8176w) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    @RecentlyNonNull
    /* renamed from: t */
    public List<Location> m31623t() {
        return this.f8176w;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.f8176w);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m41999v(parcel, 1, m31623t(), false);
        C0066a.m42019b(parcel, m42020a);
    }
}
