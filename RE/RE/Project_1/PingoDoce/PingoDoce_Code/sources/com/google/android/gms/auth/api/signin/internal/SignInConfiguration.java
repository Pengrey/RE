package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p379u6.C10842a;
import p379u6.C10848g;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C10848g();

    /* renamed from: w */
    private final String f7077w;

    /* renamed from: x */
    private GoogleSignInOptions f7078x;

    public SignInConfiguration(@RecentlyNonNull String str, @RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
        this.f7077w = C2597i.m33080f(str);
        this.f7078x = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.f7077w.equals(signInConfiguration.f7077w)) {
                GoogleSignInOptions googleSignInOptions = this.f7078x;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f7078x;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public final GoogleSignInOptions m33586h() {
        return this.f7078x;
    }

    public final int hashCode() {
        return new C10842a().m6895a(this.f7077w).m6895a(this.f7078x).m6894b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 2, this.f7077w, false);
        C0066a.m42004q(parcel, 5, this.f7078x, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
