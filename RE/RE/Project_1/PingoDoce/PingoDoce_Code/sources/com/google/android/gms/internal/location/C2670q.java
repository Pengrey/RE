package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.q */
/* loaded from: classes.dex */
public final class C2670q implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    zzbaVar = (zzba) SafeParcelReader.m33055c(parcel, m33040r, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m33039s(parcel, m33040r);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m33055c(parcel, m33040r, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m33039s(parcel, m33040r);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m33039s(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzbc(i, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
        return new zzbc[i];
    }
}
