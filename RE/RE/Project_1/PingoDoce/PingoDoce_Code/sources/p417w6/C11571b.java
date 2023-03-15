package p417w6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: w6.b */
/* loaded from: classes.dex */
public final class C11571b implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            if (SafeParcelReader.m33048j(m33040r) != 1) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                intent = (Intent) SafeParcelReader.m33055c(parcel, m33040r, Intent.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i) {
        return new CloudMessage[i];
    }
}
