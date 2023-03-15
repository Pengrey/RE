package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new C3110x();

    /* renamed from: w */
    public final int f8204w;

    /* renamed from: x */
    public final int f8205x;

    /* renamed from: y */
    public final long f8206y;

    /* renamed from: z */
    public final long f8207z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbo(int i, int i2, long j, long j2) {
        this.f8204w = i;
        this.f8205x = i2;
        this.f8206y = j;
        this.f8207z = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f8204w == zzboVar.f8204w && this.f8205x == zzboVar.f8205x && this.f8206y == zzboVar.f8206y && this.f8207z == zzboVar.f8207z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13701c.m574b(Integer.valueOf(this.f8205x), Integer.valueOf(this.f8204w), Long.valueOf(this.f8207z), Long.valueOf(this.f8206y));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f8204w + " Cell status: " + this.f8205x + " elapsed time NS: " + this.f8207z + " system time ms: " + this.f8206y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f8204w);
        C0066a.m42009l(parcel, 2, this.f8205x);
        C0066a.m42006o(parcel, 3, this.f8206y);
        C0066a.m42006o(parcel, 4, this.f8207z);
        C0066a.m42019b(parcel, m42020a);
    }
}
