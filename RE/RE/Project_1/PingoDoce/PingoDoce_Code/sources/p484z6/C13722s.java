package p484z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.s */
/* loaded from: classes.dex */
public final class C13722s implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    i2 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 3:
                    i3 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 4:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 5:
                    j2 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 6:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 7:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 8:
                    i4 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 9:
                    i5 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
