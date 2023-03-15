package pt.pingodoce.app.data.local.models.loyaltyCard;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: VirtualLoyaltyCardPermissions.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class VirtualLoyaltyCardPermissions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8702a();
    @InterfaceC4469e(name = "communications")

    /* renamed from: w */
    private final boolean f22549w;
    @InterfaceC4469e(name = "geoLocation")

    /* renamed from: x */
    private final boolean f22550x;
    @InterfaceC4469e(name = "analytics")

    /* renamed from: y */
    private final boolean f22551y;

    /* compiled from: VirtualLoyaltyCardPermissions.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.loyaltyCard.VirtualLoyaltyCardPermissions$a */
    /* loaded from: classes2.dex */
    public static final class C8702a implements Parcelable.Creator {
        /* renamed from: a */
        public final VirtualLoyaltyCardPermissions mo14079a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new VirtualLoyaltyCardPermissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final VirtualLoyaltyCardPermissions[] mo14078b(int i) {
            return new VirtualLoyaltyCardPermissions[i];
        }
    }

    public VirtualLoyaltyCardPermissions() {
        this(false, false, false, 7, null);
    }

    public VirtualLoyaltyCardPermissions(boolean z, boolean z2, boolean z3) {
        this.f22549w = z;
        this.f22550x = z2;
        this.f22551y = z3;
    }

    /* renamed from: a */
    public final boolean m14549a() {
        return this.f22551y;
    }

    /* renamed from: b */
    public final boolean m14548b() {
        return this.f22549w;
    }

    /* renamed from: c */
    public final boolean m14547c() {
        return this.f22550x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VirtualLoyaltyCardPermissions) {
            VirtualLoyaltyCardPermissions virtualLoyaltyCardPermissions = (VirtualLoyaltyCardPermissions) obj;
            return this.f22549w == virtualLoyaltyCardPermissions.f22549w && this.f22550x == virtualLoyaltyCardPermissions.f22550x && this.f22551y == virtualLoyaltyCardPermissions.f22551y;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f22549w;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f22550x;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.f22551y;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f22549w;
        boolean z2 = this.f22550x;
        boolean z3 = this.f22551y;
        return "VirtualLoyaltyCardPermissions(communications=" + z + ", geoLocation=" + z2 + ", analytics=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22549w ? 1 : 0);
        parcel.writeInt(this.f22550x ? 1 : 0);
        parcel.writeInt(this.f22551y ? 1 : 0);
    }

    public /* synthetic */ VirtualLoyaltyCardPermissions(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
