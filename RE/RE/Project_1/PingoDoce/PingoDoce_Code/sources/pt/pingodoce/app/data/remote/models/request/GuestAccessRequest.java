package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* compiled from: GuestAccessRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class GuestAccessRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8739a();
    @InterfaceC4469e(name = "installationId")

    /* renamed from: w */
    private final String f22865w;
    @InterfaceC4469e(name = "consent")

    /* renamed from: x */
    private final Consent f22866x;
    @InterfaceC4469e(name = "deviceTokenPayload")

    /* renamed from: y */
    private final DeviceTokenRequest f22867y;
    @InterfaceC4469e(name = "preferences")

    /* renamed from: z */
    private final AppNotifications f22868z;

    /* compiled from: GuestAccessRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.GuestAccessRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8739a implements Parcelable.Creator {
        /* renamed from: a */
        public final GuestAccessRequest mo13006a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new GuestAccessRequest(parcel.readString(), (Consent) Consent.CREATOR.createFromParcel(parcel), (DeviceTokenRequest) DeviceTokenRequest.CREATOR.createFromParcel(parcel), (AppNotifications) AppNotifications.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final GuestAccessRequest[] mo13005b(int i) {
            return new GuestAccessRequest[i];
        }
    }

    public GuestAccessRequest(String str, Consent consent, DeviceTokenRequest deviceTokenRequest, AppNotifications appNotifications) {
        Intrinsics.isThisObjectNull(str, "installationId");
        Intrinsics.isThisObjectNull(consent, "consent");
        Intrinsics.isThisObjectNull(deviceTokenRequest, "deviceTokenPayload");
        Intrinsics.isThisObjectNull(appNotifications, "preferences");
        this.f22865w = str;
        this.f22866x = consent;
        this.f22867y = deviceTokenRequest;
        this.f22868z = appNotifications;
    }

    /* renamed from: a */
    public final Consent m14149a() {
        return this.f22866x;
    }

    /* renamed from: b */
    public final DeviceTokenRequest m14148b() {
        return this.f22867y;
    }

    /* renamed from: c */
    public final String m14147c() {
        return this.f22865w;
    }

    /* renamed from: d */
    public final AppNotifications m14146d() {
        return this.f22868z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuestAccessRequest) {
            GuestAccessRequest guestAccessRequest = (GuestAccessRequest) obj;
            return Intrinsics.equals(this.f22865w, guestAccessRequest.f22865w) && Intrinsics.equals(this.f22866x, guestAccessRequest.f22866x) && Intrinsics.equals(this.f22867y, guestAccessRequest.f22867y) && Intrinsics.equals(this.f22868z, guestAccessRequest.f22868z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f22865w.hashCode() * 31) + this.f22866x.hashCode()) * 31) + this.f22867y.hashCode()) * 31) + this.f22868z.hashCode();
    }

    public String toString() {
        String str = this.f22865w;
        Consent consent = this.f22866x;
        DeviceTokenRequest deviceTokenRequest = this.f22867y;
        AppNotifications appNotifications = this.f22868z;
        return "GuestAccessRequest(installationId=" + str + ", consent=" + consent + ", deviceTokenPayload=" + deviceTokenRequest + ", preferences=" + appNotifications + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22865w);
        this.f22866x.writeToParcel(parcel, i);
        this.f22867y.writeToParcel(parcel, i);
        this.f22868z.writeToParcel(parcel, i);
    }
}
