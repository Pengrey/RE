package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: CheckoutResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CheckoutResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8774a();
    @InterfaceC4469e(name = "redirectUrl")

    /* renamed from: w */
    private final String f23108w;

    /* compiled from: CheckoutResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.CheckoutResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8774a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckoutResponse mo12738a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CheckoutResponse(parcel.readString());
        }

        /* renamed from: b */
        public final CheckoutResponse[] mo12737b(int i) {
            return new CheckoutResponse[i];
        }
    }

    public CheckoutResponse() {
        this(null, 1, null);
    }

    public CheckoutResponse(String str) {
        Intrinsics.isThisObjectNull(str, "url");
        this.f23108w = str;
    }

    /* renamed from: a */
    public final String m13878a() {
        return this.f23108w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutResponse) && Intrinsics.equals(this.f23108w, ((CheckoutResponse) obj).f23108w);
    }

    public int hashCode() {
        return this.f23108w.hashCode();
    }

    public String toString() {
        String str = this.f23108w;
        return "CheckoutResponse(url=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23108w);
    }

    public /* synthetic */ CheckoutResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
