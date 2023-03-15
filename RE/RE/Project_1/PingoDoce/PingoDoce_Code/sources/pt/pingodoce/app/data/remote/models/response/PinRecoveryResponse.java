package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.response.AuthenticationResponse;
import p181jd.Intrinsics;

/* compiled from: PinRecoveryResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PinRecoveryResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8788a();
    @InterfaceC4469e(name = "flow")

    /* renamed from: w */
    private final EnumC8801a f23217w;
    @InterfaceC4469e(name = "maskedEmail")

    /* renamed from: x */
    private final String f23218x;
    @InterfaceC4469e(name = "token")

    /* renamed from: y */
    private final AuthenticationResponse f23219y;

    /* compiled from: PinRecoveryResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.PinRecoveryResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8788a implements Parcelable.Creator {
        /* renamed from: a */
        public final PinRecoveryResponse mo12613a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PinRecoveryResponse(EnumC8801a.valueOf(parcel.readString()), parcel.readString(), (AuthenticationResponse) parcel.readParcelable(PinRecoveryResponse.class.getClassLoader()));
        }

        /* renamed from: b */
        public final PinRecoveryResponse[] mo12612b(int i) {
            return new PinRecoveryResponse[i];
        }
    }

    public PinRecoveryResponse() {
        this(null, null, null, 7, null);
    }

    public PinRecoveryResponse(EnumC8801a enumC8801a, String str, AuthenticationResponse authenticationResponse) {
        Intrinsics.isThisObjectNull(enumC8801a, "flow");
        Intrinsics.isThisObjectNull(str, "maskedEmail");
        this.f23217w = enumC8801a;
        this.f23218x = str;
        this.f23219y = authenticationResponse;
    }

    /* renamed from: a */
    public final EnumC8801a m13755a() {
        return this.f23217w;
    }

    /* renamed from: b */
    public final String m13754b() {
        return this.f23218x;
    }

    /* renamed from: c */
    public final AuthenticationResponse m13753c() {
        return this.f23219y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinRecoveryResponse) {
            PinRecoveryResponse pinRecoveryResponse = (PinRecoveryResponse) obj;
            return this.f23217w == pinRecoveryResponse.f23217w && Intrinsics.equals(this.f23218x, pinRecoveryResponse.f23218x) && Intrinsics.equals(this.f23219y, pinRecoveryResponse.f23219y);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f23217w.hashCode() * 31) + this.f23218x.hashCode()) * 31;
        AuthenticationResponse authenticationResponse = this.f23219y;
        return hashCode + (authenticationResponse == null ? 0 : authenticationResponse.hashCode());
    }

    public String toString() {
        EnumC8801a enumC8801a = this.f23217w;
        String str = this.f23218x;
        AuthenticationResponse authenticationResponse = this.f23219y;
        return "PinRecoveryResponse(flow=" + enumC8801a + ", maskedEmail=" + str + ", token=" + authenticationResponse + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23217w.name());
        parcel.writeString(this.f23218x);
        parcel.writeParcelable(this.f23219y, i);
    }

    public /* synthetic */ PinRecoveryResponse(EnumC8801a enumC8801a, String str, AuthenticationResponse authenticationResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC8801a.UNDEFINED : enumC8801a, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? null : authenticationResponse);
    }
}
