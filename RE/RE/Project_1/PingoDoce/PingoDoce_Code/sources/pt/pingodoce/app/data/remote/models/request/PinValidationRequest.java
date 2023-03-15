package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: PinValidationRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PinValidationRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8747a();
    @InterfaceC4469e(name = "password")

    /* renamed from: w */
    private final String f22921w;

    /* compiled from: PinValidationRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.PinValidationRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8747a implements Parcelable.Creator {
        /* renamed from: a */
        public final PinValidationRequest mo12948a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PinValidationRequest(parcel.readString());
        }

        /* renamed from: b */
        public final PinValidationRequest[] mo12947b(int i) {
            return new PinValidationRequest[i];
        }
    }

    public PinValidationRequest(String str) {
        Intrinsics.isThisObjectNull(str, "pin");
        this.f22921w = str;
    }

    /* renamed from: a */
    public final String m14088a() {
        return this.f22921w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinValidationRequest) && Intrinsics.equals(this.f22921w, ((PinValidationRequest) obj).f22921w);
    }

    public int hashCode() {
        return this.f22921w.hashCode();
    }

    public String toString() {
        String str = this.f22921w;
        return "PinValidationRequest(pin=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22921w);
    }
}
