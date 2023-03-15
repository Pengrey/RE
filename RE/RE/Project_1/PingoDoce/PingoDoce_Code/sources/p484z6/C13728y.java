package p484z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.y */
/* loaded from: classes.dex */
public final class C13728y implements Parcelable.Creator<RootTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RootTelemetryConfiguration createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 3) {
                z2 = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 4) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                i3 = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RootTelemetryConfiguration[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
