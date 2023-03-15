package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8741a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22879w;
    @InterfaceC4469e(name = "requesterName")

    /* renamed from: x */
    private final String f22880x;
    @InterfaceC4469e(name = "requesterPhoneNumber")

    /* renamed from: y */
    private final String f22881y;
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: z */
    private final String f22882z;

    /* compiled from: LoyaltyCardRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8741a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardRequest mo12992a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LoyaltyCardRequest[] mo12991b(int i) {
            return new LoyaltyCardRequest[i];
        }
    }

    public LoyaltyCardRequest() {
        this(null, null, null, null, 15, null);
    }

    public LoyaltyCardRequest(String str, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "requesterName");
        Intrinsics.isThisObjectNull(str3, "requesterPhoneNumber");
        Intrinsics.isThisObjectNull(str4, "cardNumber");
        this.f22879w = str;
        this.f22880x = str2;
        this.f22881y = str3;
        this.f22882z = str4;
    }

    /* renamed from: a */
    public final String m14135a() {
        return this.f22882z;
    }

    /* renamed from: b */
    public final String m14134b() {
        return this.f22879w;
    }

    /* renamed from: c */
    public final String m14133c() {
        return this.f22880x;
    }

    /* renamed from: d */
    public final String m14132d() {
        return this.f22881y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardRequest) {
            LoyaltyCardRequest loyaltyCardRequest = (LoyaltyCardRequest) obj;
            return Intrinsics.equals(this.f22879w, loyaltyCardRequest.f22879w) && Intrinsics.equals(this.f22880x, loyaltyCardRequest.f22880x) && Intrinsics.equals(this.f22881y, loyaltyCardRequest.f22881y) && Intrinsics.equals(this.f22882z, loyaltyCardRequest.f22882z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f22879w.hashCode() * 31) + this.f22880x.hashCode()) * 31) + this.f22881y.hashCode()) * 31) + this.f22882z.hashCode();
    }

    public String toString() {
        String str = this.f22879w;
        String str2 = this.f22880x;
        String str3 = this.f22881y;
        String str4 = this.f22882z;
        return "LoyaltyCardRequest(id=" + str + ", requesterName=" + str2 + ", requesterPhoneNumber=" + str3 + ", cardNumber=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22879w);
        parcel.writeString(this.f22880x);
        parcel.writeString(this.f22881y);
        parcel.writeString(this.f22882z);
    }

    public /* synthetic */ LoyaltyCardRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
