package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* compiled from: TakeAwayOrderResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayOrderResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8795a();
    @InterfaceC4469e(name = "order")

    /* renamed from: w */
    private final TakeAwayOrder f23277w;
    @InterfaceC4469e(name = "message")

    /* renamed from: x */
    private final String f23278x;

    /* compiled from: TakeAwayOrderResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8795a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayOrderResponse mo12540a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayOrderResponse((TakeAwayOrder) (parcel.readInt() == 0 ? null : TakeAwayOrder.CREATOR.createFromParcel(parcel)), parcel.readString());
        }

        /* renamed from: b */
        public final TakeAwayOrderResponse[] mo12539b(int i) {
            return new TakeAwayOrderResponse[i];
        }
    }

    public TakeAwayOrderResponse() {
        this(null, null, 3, null);
    }

    public TakeAwayOrderResponse(TakeAwayOrder takeAwayOrder, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f23277w = takeAwayOrder;
        this.f23278x = str;
    }

    /* renamed from: a */
    public final String m13681a() {
        return this.f23278x;
    }

    /* renamed from: b */
    public final TakeAwayOrder m13680b() {
        return this.f23277w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayOrderResponse) {
            TakeAwayOrderResponse takeAwayOrderResponse = (TakeAwayOrderResponse) obj;
            return Intrinsics.equals(this.f23277w, takeAwayOrderResponse.f23277w) && Intrinsics.equals(this.f23278x, takeAwayOrderResponse.f23278x);
        }
        return false;
    }

    public int hashCode() {
        TakeAwayOrder takeAwayOrder = this.f23277w;
        return ((takeAwayOrder == null ? 0 : takeAwayOrder.hashCode()) * 31) + this.f23278x.hashCode();
    }

    public String toString() {
        TakeAwayOrder takeAwayOrder = this.f23277w;
        String str = this.f23278x;
        return "TakeAwayOrderResponse(order=" + takeAwayOrder + ", message=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        TakeAwayOrder takeAwayOrder = this.f23277w;
        if (takeAwayOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            takeAwayOrder.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f23278x);
    }

    public /* synthetic */ TakeAwayOrderResponse(TakeAwayOrder takeAwayOrder, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : takeAwayOrder, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
