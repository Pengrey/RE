package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

@InterfaceC4475g(generateAdapter = true)
/* renamed from: pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceRequest */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceStatusRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8737a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22858w;
    @InterfaceC4469e(name = "email")

    /* renamed from: x */
    private final String f22859x;

    /* compiled from: ElectronicInvoiceStatusRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8737a implements Parcelable.Creator {
        /* renamed from: a */
        public final ElectronicInvoiceStatusRequest mo13019a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ElectronicInvoiceStatusRequest(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ElectronicInvoiceStatusRequest[] mo13018b(int i) {
            return new ElectronicInvoiceStatusRequest[i];
        }
    }

    public ElectronicInvoiceStatusRequest(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "email");
        this.f22858w = str;
        this.f22859x = str2;
    }

    /* renamed from: a */
    public final String m14160a() {
        return this.f22859x;
    }

    /* renamed from: b */
    public final String m14159b() {
        return this.f22858w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ElectronicInvoiceStatusRequest) {
            ElectronicInvoiceStatusRequest electronicInvoiceStatusRequest = (ElectronicInvoiceStatusRequest) obj;
            return Intrinsics.equals(this.f22858w, electronicInvoiceStatusRequest.f22858w) && Intrinsics.equals(this.f22859x, electronicInvoiceStatusRequest.f22859x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22858w.hashCode() * 31) + this.f22859x.hashCode();
    }

    public String toString() {
        String str = this.f22858w;
        String str2 = this.f22859x;
        return "ElectronicInvoiceRequest(phoneNumber=" + str + ", email=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22858w);
        parcel.writeString(this.f22859x);
    }
}
