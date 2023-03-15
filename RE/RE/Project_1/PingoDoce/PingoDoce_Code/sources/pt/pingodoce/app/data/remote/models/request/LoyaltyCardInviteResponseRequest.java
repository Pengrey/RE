package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: LoyaltyCardInviteResponseRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardInviteResponseRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8740a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22874w;
    @InterfaceC4469e(name = "hasApproved")

    /* renamed from: x */
    private final boolean f22875x;

    /* compiled from: LoyaltyCardInviteResponseRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.LoyaltyCardInviteResponseRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8740a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardInviteResponseRequest mo13000a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new LoyaltyCardInviteResponseRequest(parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoyaltyCardInviteResponseRequest[] mo12999b(int i) {
            return new LoyaltyCardInviteResponseRequest[i];
        }
    }

    public LoyaltyCardInviteResponseRequest(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "id");
        this.f22874w = str;
        this.f22875x = z;
    }

    /* renamed from: a */
    public final boolean m14141a() {
        return this.f22875x;
    }

    /* renamed from: b */
    public final String m14140b() {
        return this.f22874w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoyaltyCardInviteResponseRequest) {
            LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest = (LoyaltyCardInviteResponseRequest) obj;
            return Intrinsics.equals(this.f22874w, loyaltyCardInviteResponseRequest.f22874w) && this.f22875x == loyaltyCardInviteResponseRequest.f22875x;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f22874w.hashCode() * 31;
        boolean z = this.f22875x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f22874w;
        boolean z = this.f22875x;
        return "LoyaltyCardInviteResponseRequest(id=" + str + ", hasApproved=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22874w);
        parcel.writeInt(this.f22875x ? 1 : 0);
    }
}
