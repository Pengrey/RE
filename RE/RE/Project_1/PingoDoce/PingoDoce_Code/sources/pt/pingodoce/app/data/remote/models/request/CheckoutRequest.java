package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* compiled from: CheckoutRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CheckoutRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8733a();
    @InterfaceC4469e(name = "shoppingList")

    /* renamed from: w */
    private final ShoppingList f22842w;

    /* compiled from: CheckoutRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.CheckoutRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8733a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckoutRequest mo13714a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new CheckoutRequest((ShoppingList) ShoppingList.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final CheckoutRequest[] mo13713b(int i) {
            return new CheckoutRequest[i];
        }
    }

    public CheckoutRequest(ShoppingList shoppingList) {
        Intrinsics.isThisObjectNull(shoppingList, "shoppingList");
        this.f22842w = shoppingList;
    }

    /* renamed from: a */
    public final ShoppingList m14182a() {
        return this.f22842w;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        this.f22842w.writeToParcel(parcel, i);
    }
}
