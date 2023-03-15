package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C3111y();

    /* renamed from: A */
    int f8208A;

    /* renamed from: w */
    boolean f8209w;

    /* renamed from: x */
    long f8210x;

    /* renamed from: y */
    float f8211y;

    /* renamed from: z */
    long f8212z;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Reader.READ_DONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzsVar = (zzs) obj;
            return this.f8209w == zzsVar.f8209w && this.f8210x == zzsVar.f8210x && Float.compare(this.f8211y, zzsVar.f8211y) == 0 && this.f8212z == zzsVar.f8212z && this.f8208A == zzsVar.f8208A;
        }
        return false;
    }

    public final int hashCode() {
        return C13701c.m574b(Boolean.valueOf(this.f8209w), Long.valueOf(this.f8210x), Float.valueOf(this.f8211y), Long.valueOf(this.f8212z), Integer.valueOf(this.f8208A));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f8209w);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f8210x);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f8211y);
        long j = this.f8212z;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f8208A != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f8208A);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42018c(parcel, 1, this.f8209w);
        C0066a.m42006o(parcel, 2, this.f8210x);
        C0066a.m42012i(parcel, 3, this.f8211y);
        C0066a.m42006o(parcel, 4, this.f8212z);
        C0066a.m42009l(parcel, 5, this.f8208A);
        C0066a.m42019b(parcel, m42020a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(boolean z, long j, float f, long j2, int i) {
        this.f8209w = z;
        this.f8210x = j;
        this.f8211y = f;
        this.f8212z = j2;
        this.f8208A = i;
    }
}
