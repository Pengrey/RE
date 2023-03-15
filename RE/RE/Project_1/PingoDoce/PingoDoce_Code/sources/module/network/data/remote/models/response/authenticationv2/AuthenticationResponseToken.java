package module.network.data.remote.models.response.authenticationv2;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AuthenticationResponseToken.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AuthenticationResponseToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7542a();
    @InterfaceC4469e(name = "token_type")

    /* renamed from: A */
    private final String f19953A;
    @InterfaceC4469e(name = "scope")

    /* renamed from: B */
    private final String f19954B;
    @InterfaceC4469e(name = "access_token")

    /* renamed from: w */
    private final String f19955w;
    @InterfaceC4469e(name = "expires_in")

    /* renamed from: x */
    private final long f19956x;
    @InterfaceC4469e(name = "identity_token")

    /* renamed from: y */
    private final String f19957y;
    @InterfaceC4469e(name = "refresh_token")

    /* renamed from: z */
    private final String f19958z;

    /* compiled from: AuthenticationResponseToken.kt */
    /* renamed from: module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken$a */
    /* loaded from: classes2.dex */
    public static final class C7542a implements Parcelable.Creator {
        /* renamed from: a */
        public final AuthenticationResponseToken mo16912a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new AuthenticationResponseToken(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final AuthenticationResponseToken[] mo16911b(int i) {
            return new AuthenticationResponseToken[i];
        }
    }

    public AuthenticationResponseToken() {
        this(null, 0L, null, null, null, null, 63, null);
    }

    public AuthenticationResponseToken(String str, long j, String str2, String str3, String str4, String str5) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        Intrinsics.isThisObjectNull(str2, "identityToken");
        Intrinsics.isThisObjectNull(str3, "refreshToken");
        Intrinsics.isThisObjectNull(str4, "tokenType");
        Intrinsics.isThisObjectNull(str5, "scope");
        this.f19955w = str;
        this.f19956x = j;
        this.f19957y = str2;
        this.f19958z = str3;
        this.f19953A = str4;
        this.f19954B = str5;
    }

    /* renamed from: a */
    public final String m18226a() {
        return this.f19955w;
    }

    /* renamed from: b */
    public final long m18225b() {
        return this.f19956x;
    }

    /* renamed from: c */
    public final String m18224c() {
        return this.f19957y;
    }

    /* renamed from: d */
    public final String m18223d() {
        return this.f19958z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m18222e() {
        return this.f19954B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationResponseToken) {
            AuthenticationResponseToken authenticationResponseToken = (AuthenticationResponseToken) obj;
            return Intrinsics.equals(this.f19955w, authenticationResponseToken.f19955w) && this.f19956x == authenticationResponseToken.f19956x && Intrinsics.equals(this.f19957y, authenticationResponseToken.f19957y) && Intrinsics.equals(this.f19958z, authenticationResponseToken.f19958z) && Intrinsics.equals(this.f19953A, authenticationResponseToken.f19953A) && Intrinsics.equals(this.f19954B, authenticationResponseToken.f19954B);
        }
        return false;
    }

    /* renamed from: f */
    public final String m18221f() {
        return this.f19953A;
    }

    public int hashCode() {
        return (((((((((this.f19955w.hashCode() * 31) + Long.hashCode(this.f19956x)) * 31) + this.f19957y.hashCode()) * 31) + this.f19958z.hashCode()) * 31) + this.f19953A.hashCode()) * 31) + this.f19954B.hashCode();
    }

    public String toString() {
        String str = this.f19955w;
        long j = this.f19956x;
        String str2 = this.f19957y;
        String str3 = this.f19958z;
        String str4 = this.f19953A;
        String str5 = this.f19954B;
        return "AuthenticationResponseToken(accessToken=" + str + ", expiresIn=" + j + ", identityToken=" + str2 + ", refreshToken=" + str3 + ", tokenType=" + str4 + ", scope=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f19955w);
        parcel.writeLong(this.f19956x);
        parcel.writeString(this.f19957y);
        parcel.writeString(this.f19958z);
        parcel.writeString(this.f19953A);
        parcel.writeString(this.f19954B);
    }

    public /* synthetic */ AuthenticationResponseToken(String str, long j, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? 100L : j, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 16) != 0 ? "Bearer" : str4, (i & 32) != 0 ? BuildConfig.VERSION_NAME : str5);
    }
}
