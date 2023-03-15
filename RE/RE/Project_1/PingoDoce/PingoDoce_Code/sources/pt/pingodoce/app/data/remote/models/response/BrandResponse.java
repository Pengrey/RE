package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: BrandResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class BrandResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8770a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f23074w;
    @InterfaceC4469e(name = "ownBrand")

    /* renamed from: x */
    private final boolean f23075x;
    @InterfaceC4469e(name = "name")

    /* renamed from: y */
    private final String f23076y;
    @InterfaceC4469e(name = "logo")

    /* renamed from: z */
    private final String f23077z;

    /* compiled from: BrandResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.BrandResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8770a implements Parcelable.Creator {
        /* renamed from: a */
        public final BrandResponse mo12768a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new BrandResponse(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BrandResponse[] mo12767b(int i) {
            return new BrandResponse[i];
        }
    }

    public BrandResponse() {
        this(null, false, null, null, 15, null);
    }

    public BrandResponse(String str, boolean z, String str2, String str3) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "logo");
        this.f23074w = str;
        this.f23075x = z;
        this.f23076y = str2;
        this.f23077z = str3;
    }

    /* renamed from: a */
    public final String m13912a() {
        return this.f23074w;
    }

    /* renamed from: b */
    public final String m13911b() {
        return this.f23077z;
    }

    /* renamed from: c */
    public final String m13910c() {
        return this.f23076y;
    }

    /* renamed from: d */
    public final boolean m13909d() {
        return this.f23075x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m13908e() {
        return this.f23077z.length() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrandResponse) {
            BrandResponse brandResponse = (BrandResponse) obj;
            return Intrinsics.equals(this.f23074w, brandResponse.f23074w) && this.f23075x == brandResponse.f23075x && Intrinsics.equals(this.f23076y, brandResponse.f23076y) && Intrinsics.equals(this.f23077z, brandResponse.f23077z);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f23074w.hashCode() * 31;
        boolean z = this.f23075x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.f23076y.hashCode()) * 31) + this.f23077z.hashCode();
    }

    public String toString() {
        String str = this.f23074w;
        boolean z = this.f23075x;
        String str2 = this.f23076y;
        String str3 = this.f23077z;
        return "BrandResponse(id=" + str + ", ownBrand=" + z + ", name=" + str2 + ", logo=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23074w);
        parcel.writeInt(this.f23075x ? 1 : 0);
        parcel.writeString(this.f23076y);
        parcel.writeString(this.f23077z);
    }

    public /* synthetic */ BrandResponse(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str3);
    }
}
