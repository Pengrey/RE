package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardAddress;
import pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardPermissions;

/* compiled from: VirtualCardRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VirtualCardRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8760a();
    @InterfaceC4469e(name = "firstName")

    /* renamed from: w */
    private final String f22976w;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: x */
    private final String f22977x;
    @InterfaceC4469e(name = "address")

    /* renamed from: y */
    private final VirtualLoyaltyCardAddress f22978y;
    @InterfaceC4469e(name = "permissions")

    /* renamed from: z */
    private final VirtualLoyaltyCardPermissions f22979z;

    /* compiled from: VirtualCardRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.VirtualCardRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8760a implements Parcelable.Creator {
        /* renamed from: a */
        public final VirtualCardRequest mo12871a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VirtualCardRequest(parcel.readString(), parcel.readString(), (VirtualLoyaltyCardAddress) VirtualLoyaltyCardAddress.CREATOR.createFromParcel(parcel), (VirtualLoyaltyCardPermissions) VirtualLoyaltyCardPermissions.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final VirtualCardRequest[] mo12870b(int i) {
            return new VirtualCardRequest[i];
        }
    }

    public VirtualCardRequest(String str, String str2, VirtualLoyaltyCardAddress virtualLoyaltyCardAddress, VirtualLoyaltyCardPermissions virtualLoyaltyCardPermissions) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(virtualLoyaltyCardAddress, "address");
        Intrinsics.isThisObjectNull(virtualLoyaltyCardPermissions, "permissions");
        this.f22976w = str;
        this.f22977x = str2;
        this.f22978y = virtualLoyaltyCardAddress;
        this.f22979z = virtualLoyaltyCardPermissions;
    }

    /* renamed from: a */
    public final VirtualLoyaltyCardAddress m14014a() {
        return this.f22978y;
    }

    /* renamed from: b */
    public final String m14013b() {
        return this.f22976w;
    }

    /* renamed from: c */
    public final String m14012c() {
        return this.f22977x;
    }

    /* renamed from: d */
    public final VirtualLoyaltyCardPermissions m14011d() {
        return this.f22979z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualCardRequest) {
            VirtualCardRequest virtualCardRequest = (VirtualCardRequest) obj;
            return Intrinsics.equals(this.f22976w, virtualCardRequest.f22976w) && Intrinsics.equals(this.f22977x, virtualCardRequest.f22977x) && Intrinsics.equals(this.f22978y, virtualCardRequest.f22978y) && Intrinsics.equals(this.f22979z, virtualCardRequest.f22979z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f22976w.hashCode() * 31) + this.f22977x.hashCode()) * 31) + this.f22978y.hashCode()) * 31) + this.f22979z.hashCode();
    }

    public String toString() {
        String str = this.f22976w;
        String str2 = this.f22977x;
        VirtualLoyaltyCardAddress virtualLoyaltyCardAddress = this.f22978y;
        VirtualLoyaltyCardPermissions virtualLoyaltyCardPermissions = this.f22979z;
        return "VirtualCardRequest(firstName=" + str + ", lastName=" + str2 + ", address=" + virtualLoyaltyCardAddress + ", permissions=" + virtualLoyaltyCardPermissions + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22976w);
        parcel.writeString(this.f22977x);
        this.f22978y.writeToParcel(parcel, i);
        this.f22979z.writeToParcel(parcel, i);
    }
}
