package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;

/* compiled from: OnboardingUserLoginResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class OnboardingUserLoginResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8786a();
    @InterfaceC4469e(name = "profile")

    /* renamed from: w */
    private final User f23207w;
    @InterfaceC4469e(name = "token")

    /* renamed from: x */
    private final AuthenticationResponseToken f23208x;

    /* compiled from: OnboardingUserLoginResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.OnboardingUserLoginResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8786a implements Parcelable.Creator {
        /* renamed from: a */
        public final OnboardingUserLoginResponse mo12625a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new OnboardingUserLoginResponse((User) parcel.readParcelable(OnboardingUserLoginResponse.class.getClassLoader()), (AuthenticationResponseToken) parcel.readParcelable(OnboardingUserLoginResponse.class.getClassLoader()));
        }

        /* renamed from: b */
        public final OnboardingUserLoginResponse[] mo12624b(int i) {
            return new OnboardingUserLoginResponse[i];
        }
    }

    public OnboardingUserLoginResponse() {
        this(null, null, 3, null);
    }

    public OnboardingUserLoginResponse(User user, AuthenticationResponseToken authenticationResponseToken) {
        Intrinsics.isThisObjectNull(user, "profile");
        Intrinsics.isThisObjectNull(authenticationResponseToken, "token");
        this.f23207w = user;
        this.f23208x = authenticationResponseToken;
    }

    /* renamed from: a */
    public final User m13766a() {
        return this.f23207w;
    }

    /* renamed from: b */
    public final AuthenticationResponseToken m13765b() {
        return this.f23208x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingUserLoginResponse) {
            OnboardingUserLoginResponse onboardingUserLoginResponse = (OnboardingUserLoginResponse) obj;
            return Intrinsics.equals(this.f23207w, onboardingUserLoginResponse.f23207w) && Intrinsics.equals(this.f23208x, onboardingUserLoginResponse.f23208x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23207w.hashCode() * 31) + this.f23208x.hashCode();
    }

    public String toString() {
        User user = this.f23207w;
        AuthenticationResponseToken authenticationResponseToken = this.f23208x;
        return "OnboardingUserLoginResponse(profile=" + user + ", token=" + authenticationResponseToken + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeParcelable(this.f23207w, i);
        parcel.writeParcelable(this.f23208x, i);
    }

    public /* synthetic */ OnboardingUserLoginResponse(User user, AuthenticationResponseToken authenticationResponseToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
        OnboardingUserLoginResponse onboardingUserLoginResponse;
        AuthenticationResponseToken authenticationResponseToken2;
        User user2 = (i & 1) != 0 ? new User(null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null) : user;
        if ((i & 2) != 0) {
            authenticationResponseToken2 = new AuthenticationResponseToken(null, 0L, null, null, null, null, 63, null);
            onboardingUserLoginResponse = this;
        } else {
            onboardingUserLoginResponse = this;
            authenticationResponseToken2 = authenticationResponseToken;
        }
        new OnboardingUserLoginResponse(user2, authenticationResponseToken2);
    }
}
