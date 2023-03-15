package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ValidateOwnerRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ValidateOwnerRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8757a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22965w;
    @InterfaceC4469e(name = "password")

    /* renamed from: x */
    private final String f22966x;

    /* compiled from: ValidateOwnerRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ValidateOwnerRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8757a implements Parcelable.Creator {
        /* renamed from: a */
        public final ValidateOwnerRequest mo12890a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ValidateOwnerRequest(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ValidateOwnerRequest[] mo12889b(int i) {
            return new ValidateOwnerRequest[i];
        }
    }

    public ValidateOwnerRequest(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "number");
        Intrinsics.isThisObjectNull(str2, "pin");
        this.f22965w = str;
        this.f22966x = str2;
    }

    /* renamed from: a */
    public final String m14031a() {
        return this.f22965w;
    }

    /* renamed from: b */
    public final String m14030b() {
        return this.f22966x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateOwnerRequest) {
            ValidateOwnerRequest validateOwnerRequest = (ValidateOwnerRequest) obj;
            return Intrinsics.equals(this.f22965w, validateOwnerRequest.f22965w) && Intrinsics.equals(this.f22966x, validateOwnerRequest.f22966x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22965w.hashCode() * 31) + this.f22966x.hashCode();
    }

    public String toString() {
        String str = this.f22965w;
        String str2 = this.f22966x;
        return "ValidateOwnerRequest(number=" + str + ", pin=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22965w);
        parcel.writeString(this.f22966x);
    }
}
