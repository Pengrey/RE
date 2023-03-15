package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.response.AuthenticationResponse;
import p181jd.Intrinsics;

/* compiled from: TokenResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TokenResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8796a();
    @InterfaceC4469e(name = "token")

    /* renamed from: w */
    private final AuthenticationResponse f23283w;

    /* compiled from: TokenResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.TokenResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8796a implements Parcelable.Creator {
        /* renamed from: a */
        public final TokenResponse mo12535a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TokenResponse((AuthenticationResponse) parcel.readParcelable(TokenResponse.class.getClassLoader()));
        }

        /* renamed from: b */
        public final TokenResponse[] mo12534b(int i) {
            return new TokenResponse[i];
        }
    }

    public TokenResponse() {
        this(null, 1, null);
    }

    public TokenResponse(AuthenticationResponse authenticationResponse) {
        this.f23283w = authenticationResponse;
    }

    /* renamed from: a */
    public final AuthenticationResponse m13675a() {
        return this.f23283w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenResponse) && Intrinsics.equals(this.f23283w, ((TokenResponse) obj).f23283w);
    }

    public int hashCode() {
        AuthenticationResponse authenticationResponse = this.f23283w;
        if (authenticationResponse == null) {
            return 0;
        }
        return authenticationResponse.hashCode();
    }

    public String toString() {
        AuthenticationResponse authenticationResponse = this.f23283w;
        return "TokenResponse(token=" + authenticationResponse + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeParcelable(this.f23283w, i);
    }

    public /* synthetic */ TokenResponse(AuthenticationResponse authenticationResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authenticationResponse);
    }
}
