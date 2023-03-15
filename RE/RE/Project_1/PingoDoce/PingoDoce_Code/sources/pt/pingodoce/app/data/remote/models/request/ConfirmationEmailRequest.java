package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ConfirmationEmailRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ConfirmationEmailRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8734a();
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: w */
    private final String f22845w;

    /* compiled from: ConfirmationEmailRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ConfirmationEmailRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8734a implements Parcelable.Creator {
        /* renamed from: a */
        public final ConfirmationEmailRequest mo13037a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ConfirmationEmailRequest(parcel.readString());
        }

        /* renamed from: b */
        public final ConfirmationEmailRequest[] mo13036b(int i) {
            return new ConfirmationEmailRequest[i];
        }
    }

    public ConfirmationEmailRequest(String str) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        this.f22845w = str;
    }

    /* renamed from: a */
    public final String m14177a() {
        return this.f22845w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmationEmailRequest) && Intrinsics.equals(this.f22845w, ((ConfirmationEmailRequest) obj).f22845w);
    }

    public int hashCode() {
        return this.f22845w.hashCode();
    }

    public String toString() {
        String str = this.f22845w;
        return "ConfirmationEmailRequest(phoneNumber=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22845w);
    }
}
