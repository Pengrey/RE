package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: TakeAwayOrderCancellationRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayOrderCancellationRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8755a();
    @InterfaceC4469e(name = "number")

    /* renamed from: w */
    private final String f22956w;

    /* compiled from: TakeAwayOrderCancellationRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.TakeAwayOrderCancellationRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8755a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayOrderCancellationRequest mo12904a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayOrderCancellationRequest(parcel.readString());
        }

        /* renamed from: b */
        public final TakeAwayOrderCancellationRequest[] mo12903b(int i) {
            return new TakeAwayOrderCancellationRequest[i];
        }
    }

    public TakeAwayOrderCancellationRequest(String str) {
        Intrinsics.isThisObjectNull(str, "number");
        this.f22956w = str;
    }

    /* renamed from: a */
    public final String m14044a() {
        return this.f22956w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakeAwayOrderCancellationRequest) && Intrinsics.equals(this.f22956w, ((TakeAwayOrderCancellationRequest) obj).f22956w);
    }

    public int hashCode() {
        return this.f22956w.hashCode();
    }

    public String toString() {
        String str = this.f22956w;
        return "TakeAwayOrderCancellationRequest(number=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22956w);
    }
}
