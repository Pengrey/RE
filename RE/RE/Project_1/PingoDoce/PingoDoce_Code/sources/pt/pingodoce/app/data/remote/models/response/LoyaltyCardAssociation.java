package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardAssociation.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardAssociation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8784a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f23178w;
    @InterfaceC4469e(name = "requesterName")

    /* renamed from: x */
    private final String f23179x;
    @InterfaceC4469e(name = "requesterPhoneNumber")

    /* renamed from: y */
    private final String f23180y;
    @InterfaceC4469e(name = "pending")

    /* renamed from: z */
    private boolean f23181z;

    /* compiled from: LoyaltyCardAssociation.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation$a */
    /* loaded from: classes2.dex */
    public static final class C8784a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardAssociation mo12641a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardAssociation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoyaltyCardAssociation[] mo12640b(int i) {
            return new LoyaltyCardAssociation[i];
        }
    }

    public LoyaltyCardAssociation() {
        this(null, null, null, false, 15, null);
    }

    public LoyaltyCardAssociation(String str, String str2, String str3, boolean z) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "requesterName");
        Intrinsics.isThisObjectNull(str3, "requesterPhoneNumber");
        this.f23178w = str;
        this.f23179x = str2;
        this.f23180y = str3;
        this.f23181z = z;
    }

    /* renamed from: a */
    public final String m13784a() {
        return this.f23178w;
    }

    /* renamed from: b */
    public final boolean m13783b() {
        return this.f23181z;
    }

    /* renamed from: c */
    public final String m13782c() {
        return this.f23179x;
    }

    /* renamed from: d */
    public final String m13781d() {
        return this.f23180y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardAssociation) {
            LoyaltyCardAssociation loyaltyCardAssociation = (LoyaltyCardAssociation) obj;
            return Intrinsics.equals(this.f23178w, loyaltyCardAssociation.f23178w) && Intrinsics.equals(this.f23179x, loyaltyCardAssociation.f23179x) && Intrinsics.equals(this.f23180y, loyaltyCardAssociation.f23180y) && this.f23181z == loyaltyCardAssociation.f23181z;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f23178w.hashCode() * 31) + this.f23179x.hashCode()) * 31) + this.f23180y.hashCode()) * 31;
        boolean z = this.f23181z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f23178w;
        String str2 = this.f23179x;
        String str3 = this.f23180y;
        boolean z = this.f23181z;
        return "LoyaltyCardAssociation(id=" + str + ", requesterName=" + str2 + ", requesterPhoneNumber=" + str3 + ", pending=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23178w);
        parcel.writeString(this.f23179x);
        parcel.writeString(this.f23180y);
        parcel.writeInt(this.f23181z ? 1 : 0);
    }

    public /* synthetic */ LoyaltyCardAssociation(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? false : z);
    }
}
