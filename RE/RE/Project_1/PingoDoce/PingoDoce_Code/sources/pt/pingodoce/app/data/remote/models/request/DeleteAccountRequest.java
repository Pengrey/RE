package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: DeleteAccountRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DeleteAccountRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8735a();
    @InterfaceC4469e(name = "token")

    /* renamed from: w */
    private final String f22848w;

    /* compiled from: DeleteAccountRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.DeleteAccountRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8735a implements Parcelable.Creator {
        /* renamed from: a */
        public final DeleteAccountRequest mo13032a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new DeleteAccountRequest(parcel.readString());
        }

        /* renamed from: b */
        public final DeleteAccountRequest[] mo13031b(int i) {
            return new DeleteAccountRequest[i];
        }
    }

    public DeleteAccountRequest(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        this.f22848w = str;
    }

    /* renamed from: a */
    public final String m14172a() {
        return this.f22848w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAccountRequest) && Intrinsics.equals(this.f22848w, ((DeleteAccountRequest) obj).f22848w);
    }

    public int hashCode() {
        return this.f22848w.hashCode();
    }

    public String toString() {
        String str = this.f22848w;
        return "DeleteAccountRequest(token=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22848w);
    }
}
