package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.constraintlayout.widget.C0868i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C3108v();

    /* renamed from: A */
    long f8166A;

    /* renamed from: B */
    int f8167B;

    /* renamed from: C */
    float f8168C;

    /* renamed from: D */
    long f8169D;

    /* renamed from: E */
    boolean f8170E;

    /* renamed from: w */
    int f8171w;

    /* renamed from: x */
    long f8172x;

    /* renamed from: y */
    long f8173y;

    /* renamed from: z */
    boolean f8174z;

    @Deprecated
    public LocationRequest() {
        this.f8171w = C0868i.f2748C0;
        this.f8172x = 3600000L;
        this.f8173y = 600000L;
        this.f8174z = false;
        this.f8166A = Long.MAX_VALUE;
        this.f8167B = Reader.READ_DONE;
        this.f8168C = 0.0f;
        this.f8169D = 0L;
        this.f8170E = false;
    }

    /* renamed from: H */
    private static void m31629H(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    @RecentlyNonNull
    /* renamed from: h */
    public static LocationRequest m31628h() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m31630G(true);
        return locationRequest;
    }

    @RecentlyNonNull
    /* renamed from: D */
    public LocationRequest m31633D(long j) {
        m31629H(j);
        this.f8174z = true;
        this.f8173y = j;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: E */
    public LocationRequest m31632E(long j) {
        m31629H(j);
        this.f8172x = j;
        if (!this.f8174z) {
            this.f8173y = (long) (j / 6.0d);
        }
        return this;
    }

    @RecentlyNonNull
    /* renamed from: F */
    public LocationRequest m31631F(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f8171w = i;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("invalid quality: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @RecentlyNonNull
    /* renamed from: G */
    public LocationRequest m31630G(boolean z) {
        this.f8170E = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f8171w == locationRequest.f8171w && this.f8172x == locationRequest.f8172x && this.f8173y == locationRequest.f8173y && this.f8174z == locationRequest.f8174z && this.f8166A == locationRequest.f8166A && this.f8167B == locationRequest.f8167B && this.f8168C == locationRequest.f8168C && m31626v() == locationRequest.m31626v() && this.f8170E == locationRequest.f8170E) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C13701c.m574b(Integer.valueOf(this.f8171w), Long.valueOf(this.f8172x), Float.valueOf(this.f8168C), Long.valueOf(this.f8169D));
    }

    /* renamed from: t */
    public long m31627t() {
        return this.f8172x;
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i = this.f8171w;
        sb2.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f8171w != 105) {
            sb2.append(" requested=");
            sb2.append(this.f8172x);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f8173y);
        sb2.append("ms");
        if (this.f8169D > this.f8172x) {
            sb2.append(" maxWait=");
            sb2.append(this.f8169D);
            sb2.append("ms");
        }
        if (this.f8168C > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f8168C);
            sb2.append("m");
        }
        long j = this.f8166A;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f8167B != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f8167B);
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: v */
    public long m31626v() {
        long j = this.f8169D;
        long j2 = this.f8172x;
        return j < j2 ? j2 : j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f8171w);
        C0066a.m42006o(parcel, 2, this.f8172x);
        C0066a.m42006o(parcel, 3, this.f8173y);
        C0066a.m42018c(parcel, 4, this.f8174z);
        C0066a.m42006o(parcel, 5, this.f8166A);
        C0066a.m42009l(parcel, 6, this.f8167B);
        C0066a.m42012i(parcel, 7, this.f8168C);
        C0066a.m42006o(parcel, 8, this.f8169D);
        C0066a.m42018c(parcel, 9, this.f8170E);
        C0066a.m42019b(parcel, m42020a);
    }

    @RecentlyNonNull
    /* renamed from: y */
    public LocationRequest m31625y(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j <= Long.MAX_VALUE - elapsedRealtime ? j + elapsedRealtime : Long.MAX_VALUE;
        this.f8166A = j2;
        if (j2 < 0) {
            this.f8166A = 0L;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.f8171w = i;
        this.f8172x = j;
        this.f8173y = j2;
        this.f8174z = z;
        this.f8166A = j3;
        this.f8167B = i2;
        this.f8168C = f;
        this.f8169D = j4;
        this.f8170E = z2;
    }
}
