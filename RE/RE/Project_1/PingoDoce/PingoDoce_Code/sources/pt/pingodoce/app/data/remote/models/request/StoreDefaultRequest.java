package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: StoreDefaultRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class StoreDefaultRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8754a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f22953w;

    /* compiled from: StoreDefaultRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.StoreDefaultRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8754a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoreDefaultRequest mo13581a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new StoreDefaultRequest(parcel.readInt());
        }

        /* renamed from: b */
        public final StoreDefaultRequest[] mo13580b(int i) {
            return new StoreDefaultRequest[i];
        }
    }

    public StoreDefaultRequest(int i) {
        this.f22953w = i;
    }

    /* renamed from: a */
    public final int m14049a() {
        return this.f22953w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreDefaultRequest) && this.f22953w == ((StoreDefaultRequest) obj).f22953w;
    }

    public int hashCode() {
        return Integer.hashCode(this.f22953w);
    }

    public String toString() {
        int i = this.f22953w;
        return "StoreDefaultRequest(id=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22953w);
    }
}
