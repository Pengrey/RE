package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* compiled from: LoyaltyCardFlowData.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8674a();

    /* renamed from: w */
    private final String f22393w;

    /* renamed from: x */
    private final LoyaltyCard.PoupaMaisStatus f22394x;

    /* renamed from: y */
    private final String f22395y;

    /* renamed from: z */
    private final boolean f22396z;

    /* compiled from: LoyaltyCardFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.LoyaltyCardFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8674a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardFlowData mo13592a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardFlowData(parcel.readString(), (LoyaltyCard.PoupaMaisStatus) LoyaltyCard.PoupaMaisStatus.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoyaltyCardFlowData[] mo13591b(int i) {
            return new LoyaltyCardFlowData[i];
        }
    }

    public LoyaltyCardFlowData() {
        this(null, null, null, false, 15, null);
    }

    public LoyaltyCardFlowData(String str, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, String str2, boolean z) {
        Intrinsics.isThisObjectNull(str, "maskedPhoneNumber");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "status");
        Intrinsics.isThisObjectNull(str2, "maskedCardNumber");
        this.f22393w = str;
        this.f22394x = poupaMaisStatus;
        this.f22395y = str2;
        this.f22396z = z;
    }

    /* renamed from: a */
    public final String m14742a() {
        return this.f22395y;
    }

    /* renamed from: b */
    public final String m14741b() {
        return this.f22393w;
    }

    /* renamed from: c */
    public final LoyaltyCard.PoupaMaisStatus m14740c() {
        return this.f22394x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardFlowData) {
            LoyaltyCardFlowData loyaltyCardFlowData = (LoyaltyCardFlowData) obj;
            return Intrinsics.equals(this.f22393w, loyaltyCardFlowData.f22393w) && this.f22394x == loyaltyCardFlowData.f22394x && Intrinsics.equals(this.f22395y, loyaltyCardFlowData.f22395y) && this.f22396z == loyaltyCardFlowData.f22396z;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f22393w.hashCode() * 31) + this.f22394x.hashCode()) * 31) + this.f22395y.hashCode()) * 31;
        boolean z = this.f22396z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f22393w;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = this.f22394x;
        String str2 = this.f22395y;
        boolean z = this.f22396z;
        return "LoyaltyCardFlowData(maskedPhoneNumber=" + str + ", status=" + poupaMaisStatus + ", maskedCardNumber=" + str2 + ", userHasGuests=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22393w);
        this.f22394x.writeToParcel(parcel, i);
        parcel.writeString(this.f22395y);
        parcel.writeInt(this.f22396z ? 1 : 0);
    }

    public /* synthetic */ LoyaltyCardFlowData(String str, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? LoyaltyCard.PoupaMaisStatus.UndefinedStatus : poupaMaisStatus, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) != 0 ? false : z);
    }
}
