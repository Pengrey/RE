package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ValidateSmsRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ValidateSmsRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8759a();

    /* renamed from: w */
    private final String f22972w;

    /* renamed from: x */
    private final String f22973x;

    /* compiled from: ValidateSmsRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ValidateSmsRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8759a implements Parcelable.Creator {
        /* renamed from: a */
        public final ValidateSmsRequest mo12879a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ValidateSmsRequest(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ValidateSmsRequest[] mo12878b(int i) {
            return new ValidateSmsRequest[i];
        }
    }

    public ValidateSmsRequest(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "code");
        this.f22972w = str;
        this.f22973x = str2;
    }

    /* renamed from: a */
    public final String m14020a() {
        return this.f22973x;
    }

    /* renamed from: b */
    public final String m14019b() {
        return this.f22972w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateSmsRequest) {
            ValidateSmsRequest validateSmsRequest = (ValidateSmsRequest) obj;
            return Intrinsics.equals(this.f22972w, validateSmsRequest.f22972w) && Intrinsics.equals(this.f22973x, validateSmsRequest.f22973x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22972w.hashCode() * 31) + this.f22973x.hashCode();
    }

    public String toString() {
        String str = this.f22972w;
        String str2 = this.f22973x;
        return "ValidateSmsRequest(phoneNumber=" + str + ", code=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22972w);
        parcel.writeString(this.f22973x);
    }
}
