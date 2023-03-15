package p379u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: u6.g */
/* loaded from: classes.dex */
public final class C10848g implements Parcelable.Creator<SignInConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m33055c(parcel, m33040r, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
