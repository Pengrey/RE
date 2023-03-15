package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: ChangeNumberRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ChangeNumberRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8730a();
    @InterfaceC4469e(name = "newPhoneNumber")

    /* renamed from: w */
    private final String f22830w;
    @InterfaceC4469e(name = "code")

    /* renamed from: x */
    private final String f22831x;

    /* compiled from: ChangeNumberRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ChangeNumberRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8730a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChangeNumberRequest mo13059a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ChangeNumberRequest(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ChangeNumberRequest[] mo13058b(int i) {
            return new ChangeNumberRequest[i];
        }
    }

    public ChangeNumberRequest(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "number");
        Intrinsics.isThisObjectNull(str2, "code");
        this.f22830w = str;
        this.f22831x = str2;
    }

    /* renamed from: a */
    public final String m14200a() {
        return this.f22831x;
    }

    /* renamed from: b */
    public final String m14199b() {
        return this.f22830w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeNumberRequest) {
            ChangeNumberRequest changeNumberRequest = (ChangeNumberRequest) obj;
            return Intrinsics.equals(this.f22830w, changeNumberRequest.f22830w) && Intrinsics.equals(this.f22831x, changeNumberRequest.f22831x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22830w.hashCode() * 31) + this.f22831x.hashCode();
    }

    public String toString() {
        String str = this.f22830w;
        String str2 = this.f22831x;
        return "ChangeNumberRequest(number=" + str + ", code=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22830w);
        parcel.writeString(this.f22831x);
    }
}
