package module.network.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AuthenticationResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AuthenticationResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7541a();
    @InterfaceC4469e(name = "scope")

    /* renamed from: A */
    private final String f19931A;
    @InterfaceC4469e(name = "access_token")

    /* renamed from: w */
    private final String f19932w;
    @InterfaceC4469e(name = "refresh_token")

    /* renamed from: x */
    private final String f19933x;
    @InterfaceC4469e(name = "expires_in")

    /* renamed from: y */
    private final long f19934y;
    @InterfaceC4469e(name = "token_type")

    /* renamed from: z */
    private final String f19935z;

    /* compiled from: AuthenticationResponse.kt */
    /* renamed from: module.network.data.remote.models.response.AuthenticationResponse$a */
    /* loaded from: classes2.dex */
    public static final class C7541a implements Parcelable.Creator {
        /* renamed from: a */
        public final AuthenticationResponse mo16932a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new AuthenticationResponse(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final AuthenticationResponse[] mo16931b(int i) {
            return new AuthenticationResponse[i];
        }
    }

    public AuthenticationResponse() {
        this(null, null, 0L, null, null, 31, null);
    }

    public AuthenticationResponse(String str, String str2, long j, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        Intrinsics.isThisObjectNull(str2, "refreshToken");
        Intrinsics.isThisObjectNull(str3, "tokenType");
        Intrinsics.isThisObjectNull(str4, "scope");
        this.f19932w = str;
        this.f19933x = str2;
        this.f19934y = j;
        this.f19935z = str3;
        this.f19931A = str4;
    }

    /* renamed from: a */
    public final String m18245a() {
        return this.f19932w;
    }

    /* renamed from: b */
    public final long m18244b() {
        return this.f19934y;
    }

    /* renamed from: c */
    public final String m18243c() {
        return this.f19933x;
    }

    /* renamed from: d */
    public final String m18242d() {
        return this.f19931A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m18241e() {
        return this.f19935z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationResponse) {
            AuthenticationResponse authenticationResponse = (AuthenticationResponse) obj;
            return Intrinsics.equals(this.f19932w, authenticationResponse.f19932w) && Intrinsics.equals(this.f19933x, authenticationResponse.f19933x) && this.f19934y == authenticationResponse.f19934y && Intrinsics.equals(this.f19935z, authenticationResponse.f19935z) && Intrinsics.equals(this.f19931A, authenticationResponse.f19931A);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f19932w.hashCode() * 31) + this.f19933x.hashCode()) * 31) + Long.hashCode(this.f19934y)) * 31) + this.f19935z.hashCode()) * 31) + this.f19931A.hashCode();
    }

    public String toString() {
        String str = this.f19932w;
        String str2 = this.f19933x;
        long j = this.f19934y;
        String str3 = this.f19935z;
        String str4 = this.f19931A;
        return "AuthenticationResponse(accessToken=" + str + ", refreshToken=" + str2 + ", expiresIn=" + j + ", tokenType=" + str3 + ", scope=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f19932w);
        parcel.writeString(this.f19933x);
        parcel.writeLong(this.f19934y);
        parcel.writeString(this.f19935z);
        parcel.writeString(this.f19931A);
    }

    public /* synthetic */ AuthenticationResponse(String str, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? 100L : j, (i & 8) != 0 ? "Bearer" : str3, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
