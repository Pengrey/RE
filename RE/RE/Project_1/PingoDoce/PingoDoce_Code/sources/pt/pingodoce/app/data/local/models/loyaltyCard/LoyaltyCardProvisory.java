package pt.pingodoce.app.data.local.models.loyaltyCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardProvisory.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardProvisory implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8698a();
    @InterfaceC4469e(name = "maskedCardNumber")

    /* renamed from: w */
    private final String f22538w;
    @InterfaceC4469e(name = "hashedCardNumber")

    /* renamed from: x */
    private final String f22539x;
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: y */
    private final String f22540y;

    /* compiled from: LoyaltyCardProvisory.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory$a */
    /* loaded from: classes2.dex */
    public static final class C8698a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardProvisory mo13421a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardProvisory(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LoyaltyCardProvisory[] mo13420b(int i) {
            return new LoyaltyCardProvisory[i];
        }
    }

    public LoyaltyCardProvisory() {
        this(null, null, null, 7, null);
    }

    public LoyaltyCardProvisory(String str, String str2, String str3) {
        Intrinsics.isThisObjectNull(str, "maskedCardNumber");
        Intrinsics.isThisObjectNull(str2, "hashedCardNumber");
        Intrinsics.isThisObjectNull(str3, "cardNumber");
        this.f22538w = str;
        this.f22539x = str2;
        this.f22540y = str3;
    }

    /* renamed from: b */
    public static /* synthetic */ LoyaltyCardProvisory m14569b(LoyaltyCardProvisory loyaltyCardProvisory, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyCardProvisory.f22538w;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyCardProvisory.f22539x;
        }
        if ((i & 4) != 0) {
            str3 = loyaltyCardProvisory.f22540y;
        }
        return loyaltyCardProvisory.m14570a(str, str2, str3);
    }

    /* renamed from: a */
    public final LoyaltyCardProvisory m14570a(String str, String str2, String str3) {
        Intrinsics.isThisObjectNull(str, "maskedCardNumber");
        Intrinsics.isThisObjectNull(str2, "hashedCardNumber");
        Intrinsics.isThisObjectNull(str3, "cardNumber");
        return new LoyaltyCardProvisory(str, str2, str3);
    }

    /* renamed from: c */
    public final String m14568c() {
        return this.f22540y;
    }

    /* renamed from: d */
    public final String m14567d() {
        return this.f22539x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14566e() {
        return this.f22538w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardProvisory) {
            LoyaltyCardProvisory loyaltyCardProvisory = (LoyaltyCardProvisory) obj;
            return Intrinsics.equals(this.f22538w, loyaltyCardProvisory.f22538w) && Intrinsics.equals(this.f22539x, loyaltyCardProvisory.f22539x) && Intrinsics.equals(this.f22540y, loyaltyCardProvisory.f22540y);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m14565f() {
        if (this.f22538w.length() == 0) {
            if (this.f22539x.length() == 0) {
                if (this.f22540y.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22538w.hashCode() * 31) + this.f22539x.hashCode()) * 31) + this.f22540y.hashCode();
    }

    public String toString() {
        String str = this.f22538w;
        String str2 = this.f22539x;
        String str3 = this.f22540y;
        return "LoyaltyCardProvisory(maskedCardNumber=" + str + ", hashedCardNumber=" + str2 + ", cardNumber=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22538w);
        parcel.writeString(this.f22539x);
        parcel.writeString(this.f22540y);
    }

    public /* synthetic */ LoyaltyCardProvisory(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3);
    }
}
