package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: CriteriaResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CriteriaResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8777a();
    @InterfaceC4469e(name = "name")

    /* renamed from: w */
    private final String f23126w;
    @InterfaceC4469e(name = "displayName")

    /* renamed from: x */
    private final String f23127x;

    /* compiled from: CriteriaResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.CriteriaResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8777a implements Parcelable.Creator {
        /* renamed from: a */
        public final CriteriaResponse mo12715a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CriteriaResponse(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CriteriaResponse[] mo12714b(int i) {
            return new CriteriaResponse[i];
        }
    }

    public CriteriaResponse() {
        this(null, null, 3, null);
    }

    public CriteriaResponse(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(str2, "displayName");
        this.f23126w = str;
        this.f23127x = str2;
    }

    /* renamed from: a */
    public final String m13856a() {
        return this.f23127x;
    }

    /* renamed from: b */
    public final String m13855b() {
        return this.f23126w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CriteriaResponse) {
            CriteriaResponse criteriaResponse = (CriteriaResponse) obj;
            return Intrinsics.equals(this.f23126w, criteriaResponse.f23126w) && Intrinsics.equals(this.f23127x, criteriaResponse.f23127x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23126w.hashCode() * 31) + this.f23127x.hashCode();
    }

    public String toString() {
        String str = this.f23126w;
        String str2 = this.f23127x;
        return "CriteriaResponse(name=" + str + ", displayName=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23126w);
        parcel.writeString(this.f23127x);
    }

    public /* synthetic */ CriteriaResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
