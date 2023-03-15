package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: OnboardingUserRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class OnboardingUserRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8745a();
    @InterfaceC4469e(name = "code")

    /* renamed from: A */
    private final String f22898A;
    @InterfaceC4469e(name = "isOwner")

    /* renamed from: B */
    private final boolean f22899B;
    @InterfaceC4469e(name = "delegateInvite")

    /* renamed from: C */
    private final boolean f22900C;
    @InterfaceC4469e(name = "pmCard")

    /* renamed from: D */
    private final LoyaltyCardProvisory f22901D;
    @InterfaceC4469e(name = "email")

    /* renamed from: E */
    private final String f22902E;
    @InterfaceC4469e(name = "nif")

    /* renamed from: F */
    private final String f22903F;
    @InterfaceC4469e(name = "consents")

    /* renamed from: G */
    private final Consent f22904G;
    @InterfaceC4469e(name = "preferences")

    /* renamed from: H */
    private final AppNotifications f22905H;
    @InterfaceC4469e(name = "deviceTokenPayload")

    /* renamed from: I */
    private final DeviceTokenRequest f22906I;
    @InterfaceC4469e(name = "firstName")

    /* renamed from: w */
    private final String f22907w;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: x */
    private final String f22908x;
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: y */
    private final String f22909y;
    @InterfaceC4469e(name = "password")

    /* renamed from: z */
    private final String f22910z;

    /* compiled from: OnboardingUserRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.OnboardingUserRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8745a implements Parcelable.Creator {
        /* renamed from: a */
        public final OnboardingUserRequest mo12958a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new OnboardingUserRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (LoyaltyCardProvisory) (parcel.readInt() == 0 ? null : LoyaltyCardProvisory.CREATOR.createFromParcel(parcel)), parcel.readString(), parcel.readString(), (Consent) (parcel.readInt() != 0 ? Consent.CREATOR.createFromParcel(parcel) : null), (AppNotifications) AppNotifications.CREATOR.createFromParcel(parcel), (DeviceTokenRequest) DeviceTokenRequest.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final OnboardingUserRequest[] mo12957b(int i) {
            return new OnboardingUserRequest[i];
        }
    }

    public OnboardingUserRequest(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, LoyaltyCardProvisory loyaltyCardProvisory, String str6, String str7, Consent consent, AppNotifications appNotifications, DeviceTokenRequest deviceTokenRequest) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(str3, "phoneNumber");
        Intrinsics.isThisObjectNull(str4, "password");
        Intrinsics.isThisObjectNull(str5, "code");
        Intrinsics.isThisObjectNull(str6, "email");
        Intrinsics.isThisObjectNull(str7, "nif");
        Intrinsics.isThisObjectNull(appNotifications, "preferences");
        Intrinsics.isThisObjectNull(deviceTokenRequest, "deviceTokenPayload");
        this.f22907w = str;
        this.f22908x = str2;
        this.f22909y = str3;
        this.f22910z = str4;
        this.f22898A = str5;
        this.f22899B = z;
        this.f22900C = z2;
        this.f22901D = loyaltyCardProvisory;
        this.f22902E = str6;
        this.f22903F = str7;
        this.f22904G = consent;
        this.f22905H = appNotifications;
        this.f22906I = deviceTokenRequest;
    }

    /* renamed from: a */
    public final String m14110a() {
        return this.f22898A;
    }

    /* renamed from: b */
    public final Consent m14109b() {
        return this.f22904G;
    }

    /* renamed from: c */
    public final boolean m14108c() {
        return this.f22900C;
    }

    /* renamed from: d */
    public final DeviceTokenRequest m14107d() {
        return this.f22906I;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14106e() {
        return this.f22902E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingUserRequest) {
            OnboardingUserRequest onboardingUserRequest = (OnboardingUserRequest) obj;
            return Intrinsics.equals(this.f22907w, onboardingUserRequest.f22907w) && Intrinsics.equals(this.f22908x, onboardingUserRequest.f22908x) && Intrinsics.equals(this.f22909y, onboardingUserRequest.f22909y) && Intrinsics.equals(this.f22910z, onboardingUserRequest.f22910z) && Intrinsics.equals(this.f22898A, onboardingUserRequest.f22898A) && this.f22899B == onboardingUserRequest.f22899B && this.f22900C == onboardingUserRequest.f22900C && Intrinsics.equals(this.f22901D, onboardingUserRequest.f22901D) && Intrinsics.equals(this.f22902E, onboardingUserRequest.f22902E) && Intrinsics.equals(this.f22903F, onboardingUserRequest.f22903F) && Intrinsics.equals(this.f22904G, onboardingUserRequest.f22904G) && Intrinsics.equals(this.f22905H, onboardingUserRequest.f22905H) && Intrinsics.equals(this.f22906I, onboardingUserRequest.f22906I);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14105f() {
        return this.f22907w;
    }

    /* renamed from: h */
    public final String m14104h() {
        return this.f22908x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f22907w.hashCode() * 31) + this.f22908x.hashCode()) * 31) + this.f22909y.hashCode()) * 31) + this.f22910z.hashCode()) * 31) + this.f22898A.hashCode()) * 31;
        boolean z = this.f22899B;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f22900C;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        LoyaltyCardProvisory loyaltyCardProvisory = this.f22901D;
        int hashCode2 = (((((i3 + (loyaltyCardProvisory == null ? 0 : loyaltyCardProvisory.hashCode())) * 31) + this.f22902E.hashCode()) * 31) + this.f22903F.hashCode()) * 31;
        Consent consent = this.f22904G;
        return ((((hashCode2 + (consent != null ? consent.hashCode() : 0)) * 31) + this.f22905H.hashCode()) * 31) + this.f22906I.hashCode();
    }

    /* renamed from: i */
    public final LoyaltyCardProvisory m14103i() {
        return this.f22901D;
    }

    /* renamed from: j */
    public final String m14102j() {
        return this.f22903F;
    }

    /* renamed from: k */
    public final String m14101k() {
        return this.f22910z;
    }

    /* renamed from: m */
    public final String m14100m() {
        return this.f22909y;
    }

    /* renamed from: n */
    public final AppNotifications m14099n() {
        return this.f22905H;
    }

    /* renamed from: r */
    public final boolean m14098r() {
        return this.f22899B;
    }

    public String toString() {
        String str = this.f22907w;
        String str2 = this.f22908x;
        String str3 = this.f22909y;
        String str4 = this.f22910z;
        String str5 = this.f22898A;
        boolean z = this.f22899B;
        boolean z2 = this.f22900C;
        LoyaltyCardProvisory loyaltyCardProvisory = this.f22901D;
        String str6 = this.f22902E;
        String str7 = this.f22903F;
        Consent consent = this.f22904G;
        AppNotifications appNotifications = this.f22905H;
        DeviceTokenRequest deviceTokenRequest = this.f22906I;
        return "OnboardingUserRequest(firstName=" + str + ", lastName=" + str2 + ", phoneNumber=" + str3 + ", password=" + str4 + ", code=" + str5 + ", isOwner=" + z + ", delegateInvite=" + z2 + ", loyaltyCard=" + loyaltyCardProvisory + ", email=" + str6 + ", nif=" + str7 + ", consents=" + consent + ", preferences=" + appNotifications + ", deviceTokenPayload=" + deviceTokenRequest + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22907w);
        parcel.writeString(this.f22908x);
        parcel.writeString(this.f22909y);
        parcel.writeString(this.f22910z);
        parcel.writeString(this.f22898A);
        parcel.writeInt(this.f22899B ? 1 : 0);
        parcel.writeInt(this.f22900C ? 1 : 0);
        LoyaltyCardProvisory loyaltyCardProvisory = this.f22901D;
        if (loyaltyCardProvisory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loyaltyCardProvisory.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f22902E);
        parcel.writeString(this.f22903F);
        Consent consent = this.f22904G;
        if (consent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consent.writeToParcel(parcel, i);
        }
        this.f22905H.writeToParcel(parcel, i);
        this.f22906I.writeToParcel(parcel, i);
    }
}
