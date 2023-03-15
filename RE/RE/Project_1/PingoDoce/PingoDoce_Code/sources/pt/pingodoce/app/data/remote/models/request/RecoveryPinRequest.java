package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: RecoveryPinRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class RecoveryPinRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8749a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22927w;

    /* compiled from: RecoveryPinRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.RecoveryPinRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8749a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecoveryPinRequest mo12938a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new RecoveryPinRequest(parcel.readString());
        }

        /* renamed from: b */
        public final RecoveryPinRequest[] mo12937b(int i) {
            return new RecoveryPinRequest[i];
        }
    }

    public RecoveryPinRequest(String str) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        this.f22927w = str;
    }

    /* renamed from: a */
    public final String m14078a() {
        return this.f22927w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecoveryPinRequest) && Intrinsics.equals(this.f22927w, ((RecoveryPinRequest) obj).f22927w);
    }

    public int hashCode() {
        return this.f22927w.hashCode();
    }

    public String toString() {
        String str = this.f22927w;
        return "RecoveryPinRequest(phoneNumber=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22927w);
    }
}
