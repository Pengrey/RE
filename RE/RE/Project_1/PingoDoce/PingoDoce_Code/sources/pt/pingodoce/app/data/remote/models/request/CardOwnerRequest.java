package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: CardOwnerRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CardOwnerRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8729a();
    @InterfaceC4469e(name = "cardNumber")

    /* renamed from: w */
    private final String f22827w;

    /* compiled from: CardOwnerRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.CardOwnerRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8729a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardOwnerRequest mo13737a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CardOwnerRequest(parcel.readString());
        }

        /* renamed from: b */
        public final CardOwnerRequest[] mo13736b(int i) {
            return new CardOwnerRequest[i];
        }
    }

    public CardOwnerRequest(String str) {
        Intrinsics.isThisObjectNull(str, "cardNumber");
        this.f22827w = str;
    }

    /* renamed from: a */
    public final String m14205a() {
        return this.f22827w;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22827w);
    }
}
