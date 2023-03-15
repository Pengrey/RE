package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ChangePinSmsRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ChangePinSmsRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8732a();
    @InterfaceC4469e(name = "password")

    /* renamed from: w */
    private final String f22839w;

    /* compiled from: ChangePinSmsRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ChangePinSmsRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8732a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChangePinSmsRequest mo13047a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ChangePinSmsRequest(parcel.readString());
        }

        /* renamed from: b */
        public final ChangePinSmsRequest[] mo13046b(int i) {
            return new ChangePinSmsRequest[i];
        }
    }

    public ChangePinSmsRequest(String str) {
        Intrinsics.isThisObjectNull(str, "password");
        this.f22839w = str;
    }

    /* renamed from: a */
    public final String m14187a() {
        return this.f22839w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangePinSmsRequest) && Intrinsics.equals(this.f22839w, ((ChangePinSmsRequest) obj).f22839w);
    }

    public int hashCode() {
        return this.f22839w.hashCode();
    }

    public String toString() {
        String str = this.f22839w;
        return "ChangePinSmsRequest(password=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22839w);
    }
}
