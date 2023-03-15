package pt.pingodoce.app.data.local.models.loyaltyCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: VirtualLoyaltyCardAddress.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VirtualLoyaltyCardAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8701a();
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f22544w;
    @InterfaceC4469e(name = "mobile")

    /* renamed from: x */
    private final String f22545x;

    /* compiled from: VirtualLoyaltyCardAddress.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardAddress$a */
    /* loaded from: classes2.dex */
    public static final class C8701a implements Parcelable.Creator {
        /* renamed from: a */
        public final VirtualLoyaltyCardAddress mo13410a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VirtualLoyaltyCardAddress(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final VirtualLoyaltyCardAddress[] mo13409b(int i) {
            return new VirtualLoyaltyCardAddress[i];
        }
    }

    public VirtualLoyaltyCardAddress() {
        this(null, null, 3, null);
    }

    public VirtualLoyaltyCardAddress(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "mobile");
        this.f22544w = str;
        this.f22545x = str2;
    }

    /* renamed from: a */
    public final String m14555a() {
        return this.f22544w;
    }

    /* renamed from: b */
    public final String m14554b() {
        return this.f22545x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualLoyaltyCardAddress) {
            VirtualLoyaltyCardAddress virtualLoyaltyCardAddress = (VirtualLoyaltyCardAddress) obj;
            return Intrinsics.equals(this.f22544w, virtualLoyaltyCardAddress.f22544w) && Intrinsics.equals(this.f22545x, virtualLoyaltyCardAddress.f22545x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22544w.hashCode() * 31) + this.f22545x.hashCode();
    }

    public String toString() {
        String str = this.f22544w;
        String str2 = this.f22545x;
        return "VirtualLoyaltyCardAddress(email=" + str + ", mobile=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22544w);
        parcel.writeString(this.f22545x);
    }

    public /* synthetic */ VirtualLoyaltyCardAddress(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
