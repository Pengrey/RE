package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p308q6.C9672e;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<IdToken> CREATOR = new C9672e();

    /* renamed from: w */
    private final String f7029w;

    /* renamed from: x */
    private final String f7030x;

    public IdToken(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        C2597i.m33084b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C2597i.m33084b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f7029w = str;
        this.f7030x = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdToken) {
            IdToken idToken = (IdToken) obj;
            return C13701c.m575a(this.f7029w, idToken.f7029w) && C13701c.m575a(this.f7030x, idToken.f7030x);
        }
        return false;
    }

    /* renamed from: h */
    public String m33634h() {
        return this.f7029w;
    }

    /* renamed from: t */
    public String m33633t() {
        return this.f7030x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 1, m33634h(), false);
        C0066a.m42003r(parcel, 2, m33633t(), false);
        C0066a.m42019b(parcel, m42020a);
    }
}
