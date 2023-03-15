package module.network.data.remote.models.local.pmCards;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardProvisoryV2.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardProvisoryV2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7540a();
    @InterfaceC4469e(name = "maskedCardNumber")

    /* renamed from: w */
    private final String f19922w;
    @InterfaceC4469e(name = "hashedCardNumber")

    /* renamed from: x */
    private final String f19923x;

    /* compiled from: LoyaltyCardProvisoryV2.kt */
    /* renamed from: module.network.data.remote.models.local.pmCards.LoyaltyCardProvisoryV2$a */
    /* loaded from: classes2.dex */
    public static final class C7540a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardProvisoryV2 mo16944a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardProvisoryV2(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LoyaltyCardProvisoryV2[] mo16943b(int i) {
            return new LoyaltyCardProvisoryV2[i];
        }
    }

    public LoyaltyCardProvisoryV2() {
        this(null, null, 3, null);
    }

    public LoyaltyCardProvisoryV2(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "maskedCardNumber");
        Intrinsics.isThisObjectNull(str2, "hashedCardNumber");
        this.f19922w = str;
        this.f19923x = str2;
    }

    /* renamed from: a */
    public final String m18254a() {
        return this.f19923x;
    }

    /* renamed from: b */
    public final String m18253b() {
        return this.f19922w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardProvisoryV2) {
            LoyaltyCardProvisoryV2 loyaltyCardProvisoryV2 = (LoyaltyCardProvisoryV2) obj;
            return Intrinsics.equals(this.f19922w, loyaltyCardProvisoryV2.f19922w) && Intrinsics.equals(this.f19923x, loyaltyCardProvisoryV2.f19923x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19922w.hashCode() * 31) + this.f19923x.hashCode();
    }

    public String toString() {
        String str = this.f19922w;
        String str2 = this.f19923x;
        return "LoyaltyCardProvisoryV2(maskedCardNumber=" + str + ", hashedCardNumber=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f19922w);
        parcel.writeString(this.f19923x);
    }

    public /* synthetic */ LoyaltyCardProvisoryV2(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
