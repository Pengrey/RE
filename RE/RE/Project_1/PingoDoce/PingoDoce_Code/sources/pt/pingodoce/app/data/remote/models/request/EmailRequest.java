package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: EmailRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EmailRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8738a();
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f22862w;

    /* compiled from: EmailRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.EmailRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8738a implements Parcelable.Creator {
        /* renamed from: a */
        public final EmailRequest mo13014a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new EmailRequest(parcel.readString());
        }

        /* renamed from: b */
        public final EmailRequest[] mo13013b(int i) {
            return new EmailRequest[i];
        }
    }

    public EmailRequest(String str) {
        Intrinsics.isThisObjectNull(str, "email");
        this.f22862w = str;
    }

    /* renamed from: a */
    public final String m14154a() {
        return this.f22862w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailRequest) && Intrinsics.equals(this.f22862w, ((EmailRequest) obj).f22862w);
    }

    public int hashCode() {
        return this.f22862w.hashCode();
    }

    public String toString() {
        String str = this.f22862w;
        return "EmailRequest(email=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22862w);
    }
}
