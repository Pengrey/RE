package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* compiled from: CardOwnerResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CardOwnerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8771a();
    @InterfaceC4469e(name = "poupaMaisStatus")

    /* renamed from: A */
    private final LoyaltyCard.PoupaMaisStatus f23082A;
    @InterfaceC4469e(name = "userHasGuests")

    /* renamed from: B */
    private final boolean f23083B;
    @InterfaceC4469e(name = "delegateInvite")

    /* renamed from: w */
    private final boolean f23084w;
    @InterfaceC4469e(name = "status")

    /* renamed from: x */
    private final String f23085x;
    @InterfaceC4469e(name = "maskedPhoneNumber")

    /* renamed from: y */
    private final String f23086y;
    @InterfaceC4469e(name = "pendingPoupaMaisNumber")

    /* renamed from: z */
    private final String f23087z;

    /* compiled from: CardOwnerResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.CardOwnerResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8771a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardOwnerResponse mo13429a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CardOwnerResponse(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (LoyaltyCard.PoupaMaisStatus) LoyaltyCard.PoupaMaisStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardOwnerResponse[] mo13428b(int i) {
            return new CardOwnerResponse[i];
        }
    }

    public CardOwnerResponse() {
        this(false, null, null, null, null, false, 63, null);
    }

    public CardOwnerResponse(boolean z, String str, String str2, String str3, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, boolean z2) {
        Intrinsics.isThisObjectNull(str, "status");
        Intrinsics.isThisObjectNull(str2, "maskedPhoneNumber");
        Intrinsics.isThisObjectNull(str3, "pendingPoupaMaisNumber");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "poupaMaisStatus");
        this.f23084w = z;
        this.f23085x = str;
        this.f23086y = str2;
        this.f23087z = str3;
        this.f23082A = poupaMaisStatus;
        this.f23083B = z2;
    }

    /* renamed from: a */
    public final boolean m13903a() {
        return this.f23084w;
    }

    /* renamed from: b */
    public final String m13902b() {
        return this.f23086y;
    }

    /* renamed from: c */
    public final String m13901c() {
        return this.f23087z;
    }

    /* renamed from: d */
    public final LoyaltyCard.PoupaMaisStatus m13900d() {
        return this.f23082A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13899e() {
        return this.f23085x;
    }

    /* renamed from: f */
    public final boolean m13898f() {
        return this.f23083B;
    }

    /* renamed from: h */
    public final boolean m13897h() {
        return LoyaltyCardStatus.C8699a.m14559b(LoyaltyCardStatus.Companion, this.f23085x, false, 2, null) == LoyaltyCardStatus.APPROVED;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23084w ? 1 : 0);
        parcel.writeString(this.f23085x);
        parcel.writeString(this.f23086y);
        parcel.writeString(this.f23087z);
        this.f23082A.writeToParcel(parcel, i);
        parcel.writeInt(this.f23083B ? 1 : 0);
    }

    public /* synthetic */ CardOwnerResponse(boolean z, String str, String str2, String str3, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) == 0 ? str3 : BuildConfig.VERSION_NAME, (i & 16) != 0 ? LoyaltyCard.PoupaMaisStatus.UndefinedStatus : poupaMaisStatus, (i & 32) != 0 ? false : z2);
    }
}
