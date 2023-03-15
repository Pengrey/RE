package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: NifRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class NifRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8743a();
    @InterfaceC4469e(name = "nif")

    /* renamed from: w */
    private final String f22889w;

    /* compiled from: NifRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.NifRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8743a implements Parcelable.Creator {
        /* renamed from: a */
        public final NifRequest mo12982a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new NifRequest(parcel.readString());
        }

        /* renamed from: b */
        public final NifRequest[] mo12981b(int i) {
            return new NifRequest[i];
        }
    }

    public NifRequest(String str) {
        Intrinsics.isThisObjectNull(str, "nif");
        this.f22889w = str;
    }

    /* renamed from: a */
    public final String m14122a() {
        return this.f22889w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NifRequest) && Intrinsics.equals(this.f22889w, ((NifRequest) obj).f22889w);
    }

    public int hashCode() {
        return this.f22889w.hashCode();
    }

    public String toString() {
        String str = this.f22889w;
        return "NifRequest(nif=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22889w);
    }
}
