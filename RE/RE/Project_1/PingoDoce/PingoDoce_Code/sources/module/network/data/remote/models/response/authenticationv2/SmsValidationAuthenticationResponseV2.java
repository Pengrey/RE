package module.network.data.remote.models.response.authenticationv2;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;

/* compiled from: SmsValidationAuthenticationResponseV2.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SmsValidationAuthenticationResponseV2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7544a();
    @InterfaceC4469e(name = "token")

    /* renamed from: w */
    private final AuthenticationResponseToken f19970w;
    @InterfaceC4469e(name = "pmCardsResponse")

    /* renamed from: x */
    private final PmCardsResponse f19971x;
    @InterfaceC4469e(name = "profile")

    /* renamed from: y */
    private final User f19972y;

    /* compiled from: SmsValidationAuthenticationResponseV2.kt */
    /* renamed from: module.network.data.remote.models.response.authenticationv2.SmsValidationAuthenticationResponseV2$a */
    /* loaded from: classes2.dex */
    public static final class C7544a implements Parcelable.Creator {
        /* renamed from: a */
        public final SmsValidationAuthenticationResponseV2 mo16898a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new SmsValidationAuthenticationResponseV2((AuthenticationResponseToken) AuthenticationResponseToken.CREATOR.createFromParcel(parcel), (PmCardsResponse) PmCardsResponse.CREATOR.createFromParcel(parcel), (User) User.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final SmsValidationAuthenticationResponseV2[] mo16897b(int i) {
            return new SmsValidationAuthenticationResponseV2[i];
        }
    }

    public SmsValidationAuthenticationResponseV2() {
        this(null, null, null, 7, null);
    }

    public SmsValidationAuthenticationResponseV2(AuthenticationResponseToken authenticationResponseToken, PmCardsResponse pmCardsResponse, User user) {
        Intrinsics.isThisObjectNull(authenticationResponseToken, "token");
        Intrinsics.isThisObjectNull(pmCardsResponse, "pmCardsResponse");
        Intrinsics.isThisObjectNull(user, "user");
        this.f19970w = authenticationResponseToken;
        this.f19971x = pmCardsResponse;
        this.f19972y = user;
    }

    /* renamed from: a */
    public final PmCardsResponse m18209a() {
        return this.f19971x;
    }

    /* renamed from: b */
    public final AuthenticationResponseToken m18208b() {
        return this.f19970w;
    }

    /* renamed from: c */
    public final User m18207c() {
        return this.f19972y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmsValidationAuthenticationResponseV2) {
            SmsValidationAuthenticationResponseV2 smsValidationAuthenticationResponseV2 = (SmsValidationAuthenticationResponseV2) obj;
            return Intrinsics.equals(this.f19970w, smsValidationAuthenticationResponseV2.f19970w) && Intrinsics.equals(this.f19971x, smsValidationAuthenticationResponseV2.f19971x) && Intrinsics.equals(this.f19972y, smsValidationAuthenticationResponseV2.f19972y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f19970w.hashCode() * 31) + this.f19971x.hashCode()) * 31) + this.f19972y.hashCode();
    }

    public String toString() {
        AuthenticationResponseToken authenticationResponseToken = this.f19970w;
        PmCardsResponse pmCardsResponse = this.f19971x;
        User user = this.f19972y;
        return "SmsValidationAuthenticationResponseV2(token=" + authenticationResponseToken + ", pmCardsResponse=" + pmCardsResponse + ", user=" + user + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        this.f19970w.writeToParcel(parcel, i);
        this.f19971x.writeToParcel(parcel, i);
        this.f19972y.writeToParcel(parcel, i);
    }

    public /* synthetic */ SmsValidationAuthenticationResponseV2(AuthenticationResponseToken authenticationResponseToken, PmCardsResponse pmCardsResponse, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SmsValidationAuthenticationResponseV2 smsValidationAuthenticationResponseV2;
        User user2;
        AuthenticationResponseToken authenticationResponseToken2 = (i & 1) != 0 ? new AuthenticationResponseToken(null, 0L, null, null, null, null, 63, null) : authenticationResponseToken;
        PmCardsResponse pmCardsResponse2 = (i & 2) != 0 ? new PmCardsResponse(null, null, null, 7, null) : pmCardsResponse;
        if ((i & 4) != 0) {
            user2 = new User(null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null);
            smsValidationAuthenticationResponseV2 = this;
        } else {
            smsValidationAuthenticationResponseV2 = this;
            user2 = user;
        }
        new SmsValidationAuthenticationResponseV2(authenticationResponseToken2, pmCardsResponse2, user2);
    }
}
