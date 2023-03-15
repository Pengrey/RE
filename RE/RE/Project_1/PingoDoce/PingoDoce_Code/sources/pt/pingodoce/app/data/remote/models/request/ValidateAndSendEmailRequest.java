package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ValidateAndSendEmailRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ValidateAndSendEmailRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8756a();
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f22959w;
    @InterfaceC4469e(name = "firstName")

    /* renamed from: x */
    private final String f22960x;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: y */
    private final String f22961y;
    @InterfaceC4469e(name = "nif")

    /* renamed from: z */
    private final String f22962z;

    /* compiled from: ValidateAndSendEmailRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ValidateAndSendEmailRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8756a implements Parcelable.Creator {
        /* renamed from: a */
        public final ValidateAndSendEmailRequest mo12896a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ValidateAndSendEmailRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ValidateAndSendEmailRequest[] mo12895b(int i) {
            return new ValidateAndSendEmailRequest[i];
        }
    }

    public ValidateAndSendEmailRequest(String str, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "firstName");
        Intrinsics.isThisObjectNull(str3, "lastName");
        Intrinsics.isThisObjectNull(str4, "nif");
        this.f22959w = str;
        this.f22960x = str2;
        this.f22961y = str3;
        this.f22962z = str4;
    }

    /* renamed from: a */
    public final String m14039a() {
        return this.f22959w;
    }

    /* renamed from: b */
    public final String m14038b() {
        return this.f22960x;
    }

    /* renamed from: c */
    public final String m14037c() {
        return this.f22961y;
    }

    /* renamed from: d */
    public final String m14036d() {
        return this.f22962z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateAndSendEmailRequest) {
            ValidateAndSendEmailRequest validateAndSendEmailRequest = (ValidateAndSendEmailRequest) obj;
            return Intrinsics.equals(this.f22959w, validateAndSendEmailRequest.f22959w) && Intrinsics.equals(this.f22960x, validateAndSendEmailRequest.f22960x) && Intrinsics.equals(this.f22961y, validateAndSendEmailRequest.f22961y) && Intrinsics.equals(this.f22962z, validateAndSendEmailRequest.f22962z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f22959w.hashCode() * 31) + this.f22960x.hashCode()) * 31) + this.f22961y.hashCode()) * 31) + this.f22962z.hashCode();
    }

    public String toString() {
        String str = this.f22959w;
        String str2 = this.f22960x;
        String str3 = this.f22961y;
        String str4 = this.f22962z;
        return "ValidateAndSendEmailRequest(email=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", nif=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22959w);
        parcel.writeString(this.f22960x);
        parcel.writeString(this.f22961y);
        parcel.writeString(this.f22962z);
    }
}
