package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ChangePinRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ChangePinRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8731a();
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f22834w;
    @InterfaceC4469e(name = "password")

    /* renamed from: x */
    private final String f22835x;
    @InterfaceC4469e(name = "token")

    /* renamed from: y */
    private final String f22836y;

    /* compiled from: ChangePinRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ChangePinRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8731a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChangePinRequest mo13052a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ChangePinRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ChangePinRequest[] mo13051b(int i) {
            return new ChangePinRequest[i];
        }
    }

    public ChangePinRequest(String str, String str2, String str3) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "password");
        Intrinsics.isThisObjectNull(str3, "token");
        this.f22834w = str;
        this.f22835x = str2;
        this.f22836y = str3;
    }

    /* renamed from: a */
    public final String m14194a() {
        return this.f22834w;
    }

    /* renamed from: b */
    public final String m14193b() {
        return this.f22835x;
    }

    /* renamed from: c */
    public final String m14192c() {
        return this.f22836y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangePinRequest) {
            ChangePinRequest changePinRequest = (ChangePinRequest) obj;
            return Intrinsics.equals(this.f22834w, changePinRequest.f22834w) && Intrinsics.equals(this.f22835x, changePinRequest.f22835x) && Intrinsics.equals(this.f22836y, changePinRequest.f22836y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22834w.hashCode() * 31) + this.f22835x.hashCode()) * 31) + this.f22836y.hashCode();
    }

    public String toString() {
        String str = this.f22834w;
        String str2 = this.f22835x;
        String str3 = this.f22836y;
        return "ChangePinRequest(email=" + str + ", password=" + str2 + ", token=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22834w);
        parcel.writeString(this.f22835x);
        parcel.writeString(this.f22836y);
    }
}
