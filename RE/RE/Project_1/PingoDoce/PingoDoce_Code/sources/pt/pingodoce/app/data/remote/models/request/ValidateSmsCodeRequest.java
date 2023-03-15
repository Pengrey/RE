package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ValidateSmsCodeRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ValidateSmsCodeRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8758a();

    /* renamed from: w */
    private final String f22969w;

    /* compiled from: ValidateSmsCodeRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ValidateSmsCodeRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8758a implements Parcelable.Creator {
        /* renamed from: a */
        public final ValidateSmsCodeRequest mo12885a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ValidateSmsCodeRequest(parcel.readString());
        }

        /* renamed from: b */
        public final ValidateSmsCodeRequest[] mo12884b(int i) {
            return new ValidateSmsCodeRequest[i];
        }
    }

    public ValidateSmsCodeRequest(String str) {
        Intrinsics.isThisObjectNull(str, "code");
        this.f22969w = str;
    }

    /* renamed from: a */
    public final String m14025a() {
        return this.f22969w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateSmsCodeRequest) && Intrinsics.equals(this.f22969w, ((ValidateSmsCodeRequest) obj).f22969w);
    }

    public int hashCode() {
        return this.f22969w.hashCode();
    }

    public String toString() {
        String str = this.f22969w;
        return "ValidateSmsCodeRequest(code=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22969w);
    }
}
