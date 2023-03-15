package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: OnboardingUserLoginRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class OnboardingUserLoginRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8744a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22892w;
    @InterfaceC4469e(name = "password")

    /* renamed from: x */
    private final String f22893x;
    @InterfaceC4469e(name = "consents")

    /* renamed from: y */
    private final Consent f22894y;

    /* compiled from: OnboardingUserLoginRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.OnboardingUserLoginRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8744a implements Parcelable.Creator {
        /* renamed from: a */
        public final OnboardingUserLoginRequest mo13647a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new OnboardingUserLoginRequest(parcel.readString(), parcel.readString(), (Consent) (parcel.readInt() == 0 ? null : Consent.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final OnboardingUserLoginRequest[] mo13646b(int i) {
            return new OnboardingUserLoginRequest[i];
        }
    }

    public OnboardingUserLoginRequest(String str, String str2, Consent consent) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "password");
        this.f22892w = str;
        this.f22893x = str2;
        this.f22894y = consent;
    }

    /* renamed from: a */
    public final Consent m14117a() {
        return this.f22894y;
    }

    /* renamed from: b */
    public final String m14116b() {
        return this.f22893x;
    }

    /* renamed from: c */
    public final String m14115c() {
        return this.f22892w;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22892w);
        parcel.writeString(this.f22893x);
        Consent consent = this.f22894y;
        if (consent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        consent.writeToParcel(parcel, i);
    }
}
