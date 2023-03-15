package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C2422h();
    @Deprecated

    /* renamed from: w */
    String f7070w;

    /* renamed from: x */
    private GoogleSignInAccount f7071x;
    @Deprecated

    /* renamed from: y */
    String f7072y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f7071x = googleSignInAccount;
        this.f7070w = C2597i.m33079g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f7072y = C2597i.m33079g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @RecentlyNullable
    /* renamed from: h */
    public final GoogleSignInAccount m33592h() {
        return this.f7071x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 4, this.f7070w, false);
        C0066a.m42004q(parcel, 7, this.f7071x, i, false);
        C0066a.m42003r(parcel, 8, this.f7072y, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
