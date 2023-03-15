package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* compiled from: VirtualCardRegistrationResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VirtualCardRegistrationResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8800a();
    @InterfaceC4469e(name = "benefitsBalance")

    /* renamed from: A */
    private final float f23296A;
    @InterfaceC4469e(name = "fuelBenefitsPts")

    /* renamed from: B */
    private final int f23297B;
    @InterfaceC4469e(name = "totalSaved")

    /* renamed from: C */
    private final float f23298C;
    @InterfaceC4469e(name = "poupaMaisStatus")

    /* renamed from: D */
    private final LoyaltyCard.PoupaMaisStatus f23299D;
    @InterfaceC4469e(name = "statusPayload")

    /* renamed from: E */
    private final CardStatusPayload f23300E;
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: w */
    private final String f23301w;
    @InterfaceC4469e(name = "cardType")

    /* renamed from: x */
    private final LoyaltyCard.Type f23302x;
    @InterfaceC4469e(name = "status")

    /* renamed from: y */
    private final String f23303y;
    @InterfaceC4469e(name = "fuelBenefits")

    /* renamed from: z */
    private final float f23304z;

    /* compiled from: VirtualCardRegistrationResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.VirtualCardRegistrationResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8800a implements Parcelable.Creator {
        /* renamed from: a */
        public final VirtualCardRegistrationResponse mo12513a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VirtualCardRegistrationResponse(parcel.readString(), (LoyaltyCard.Type) LoyaltyCard.Type.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readFloat(), (LoyaltyCard.PoupaMaisStatus) LoyaltyCard.PoupaMaisStatus.CREATOR.createFromParcel(parcel), (CardStatusPayload) (parcel.readInt() == 0 ? null : CardStatusPayload.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final VirtualCardRegistrationResponse[] mo12512b(int i) {
            return new VirtualCardRegistrationResponse[i];
        }
    }

    public VirtualCardRegistrationResponse(String str, LoyaltyCard.Type type, String str2, float f, float f2, int i, float f3, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, CardStatusPayload cardStatusPayload) {
        Intrinsics.isThisObjectNull(str, "cardNumber");
        Intrinsics.isThisObjectNull(type, "cardType");
        Intrinsics.isThisObjectNull(str2, "status");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        this.f23301w = str;
        this.f23302x = type;
        this.f23303y = str2;
        this.f23304z = f;
        this.f23296A = f2;
        this.f23297B = i;
        this.f23298C = f3;
        this.f23299D = poupaMaisStatus;
        this.f23300E = cardStatusPayload;
    }

    /* renamed from: a */
    public final float m13661a() {
        return this.f23296A;
    }

    /* renamed from: b */
    public final String m13660b() {
        return this.f23301w;
    }

    /* renamed from: c */
    public final LoyaltyCard.Type m13659c() {
        return this.f23302x;
    }

    /* renamed from: d */
    public final float m13658d() {
        return this.f23304z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m13657e() {
        return this.f23297B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualCardRegistrationResponse) {
            VirtualCardRegistrationResponse virtualCardRegistrationResponse = (VirtualCardRegistrationResponse) obj;
            return Intrinsics.equals(this.f23301w, virtualCardRegistrationResponse.f23301w) && this.f23302x == virtualCardRegistrationResponse.f23302x && Intrinsics.equals(this.f23303y, virtualCardRegistrationResponse.f23303y) && Intrinsics.equals(Float.valueOf(this.f23304z), Float.valueOf(virtualCardRegistrationResponse.f23304z)) && Intrinsics.equals(Float.valueOf(this.f23296A), Float.valueOf(virtualCardRegistrationResponse.f23296A)) && this.f23297B == virtualCardRegistrationResponse.f23297B && Intrinsics.equals(Float.valueOf(this.f23298C), Float.valueOf(virtualCardRegistrationResponse.f23298C)) && this.f23299D == virtualCardRegistrationResponse.f23299D && Intrinsics.equals(this.f23300E, virtualCardRegistrationResponse.f23300E);
        }
        return false;
    }

    /* renamed from: f */
    public final LoyaltyCard.PoupaMaisStatus m13656f() {
        return this.f23299D;
    }

    /* renamed from: h */
    public final String m13655h() {
        return this.f23303y;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f23301w.hashCode() * 31) + this.f23302x.hashCode()) * 31) + this.f23303y.hashCode()) * 31) + Float.hashCode(this.f23304z)) * 31) + Float.hashCode(this.f23296A)) * 31) + Integer.hashCode(this.f23297B)) * 31) + Float.hashCode(this.f23298C)) * 31) + this.f23299D.hashCode()) * 31;
        CardStatusPayload cardStatusPayload = this.f23300E;
        return hashCode + (cardStatusPayload == null ? 0 : cardStatusPayload.hashCode());
    }

    /* renamed from: i */
    public final CardStatusPayload m13654i() {
        return this.f23300E;
    }

    /* renamed from: j */
    public final float m13653j() {
        return this.f23298C;
    }

    public String toString() {
        String str = this.f23301w;
        LoyaltyCard.Type type = this.f23302x;
        String str2 = this.f23303y;
        float f = this.f23304z;
        float f2 = this.f23296A;
        int i = this.f23297B;
        float f3 = this.f23298C;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = this.f23299D;
        CardStatusPayload cardStatusPayload = this.f23300E;
        return "VirtualCardRegistrationResponse(cardNumber=" + str + ", cardType=" + type + ", status=" + str2 + ", fuelBenefits=" + f + ", benefitsBalance=" + f2 + ", fuelBenefitsPts=" + i + ", totalSaved=" + f3 + ", poupaMaisStatus=" + poupaMaisStatus + ", statusPayload=" + cardStatusPayload + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23301w);
        this.f23302x.writeToParcel(parcel, i);
        parcel.writeString(this.f23303y);
        parcel.writeFloat(this.f23304z);
        parcel.writeFloat(this.f23296A);
        parcel.writeInt(this.f23297B);
        parcel.writeFloat(this.f23298C);
        this.f23299D.writeToParcel(parcel, i);
        CardStatusPayload cardStatusPayload = this.f23300E;
        if (cardStatusPayload == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        cardStatusPayload.writeToParcel(parcel, i);
    }

    public /* synthetic */ VirtualCardRegistrationResponse(String str, LoyaltyCard.Type type, String str2, float f, float f2, int i, float f3, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, CardStatusPayload cardStatusPayload, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, str2, f, f2, i, f3, poupaMaisStatus, (i2 & 256) != 0 ? null : cardStatusPayload);
    }
}
