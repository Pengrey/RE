package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: PhoneRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PhoneRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8746a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22918w;

    /* compiled from: PhoneRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.PhoneRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8746a implements Parcelable.Creator {
        /* renamed from: a */
        public final PhoneRequest mo12953a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PhoneRequest(parcel.readString());
        }

        /* renamed from: b */
        public final PhoneRequest[] mo12952b(int i) {
            return new PhoneRequest[i];
        }
    }

    public PhoneRequest(String str) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        this.f22918w = str;
    }

    /* renamed from: a */
    public final String m14093a() {
        return this.f22918w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhoneRequest) && Intrinsics.equals(this.f22918w, ((PhoneRequest) obj).f22918w);
    }

    public int hashCode() {
        return this.f22918w.hashCode();
    }

    public String toString() {
        String str = this.f22918w;
        return "PhoneRequest(phoneNumber=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22918w);
    }
}
