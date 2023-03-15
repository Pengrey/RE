package p484z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.z */
/* loaded from: classes.dex */
public final class C13729z implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionTelemetryConfiguration createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m33055c(parcel, m33040r, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 3:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 4:
                    iArr = SafeParcelReader.m33056b(parcel, m33040r);
                    break;
                case 5:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m33056b(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionTelemetryConfiguration[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
