package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ShoppingListUpdateResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ShoppingListUpdateResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8790a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f23241w;
    @InterfaceC4469e(name = "shoppingList")

    /* renamed from: x */
    private final ShoppingList f23242x;

    /* compiled from: ShoppingListUpdateResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8790a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingListUpdateResponse mo12581a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ShoppingListUpdateResponse(parcel.readString(), (ShoppingList) (parcel.readInt() == 0 ? null : ShoppingList.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final ShoppingListUpdateResponse[] mo12580b(int i) {
            return new ShoppingListUpdateResponse[i];
        }
    }

    public ShoppingListUpdateResponse() {
        this(null, null, 3, null);
    }

    public ShoppingListUpdateResponse(String str, ShoppingList shoppingList) {
        Intrinsics.isThisObjectNull(str, "id");
        this.f23241w = str;
        this.f23242x = shoppingList;
    }

    /* renamed from: a */
    public final String m13722a() {
        return this.f23241w;
    }

    /* renamed from: b */
    public final ShoppingList m13721b() {
        return this.f23242x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingListUpdateResponse) {
            ShoppingListUpdateResponse shoppingListUpdateResponse = (ShoppingListUpdateResponse) obj;
            return Intrinsics.equals(this.f23241w, shoppingListUpdateResponse.f23241w) && Intrinsics.equals(this.f23242x, shoppingListUpdateResponse.f23242x);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f23241w.hashCode() * 31;
        ShoppingList shoppingList = this.f23242x;
        return hashCode + (shoppingList == null ? 0 : shoppingList.hashCode());
    }

    public String toString() {
        String str = this.f23241w;
        ShoppingList shoppingList = this.f23242x;
        return "ShoppingListUpdateResponse(id=" + str + ", shoppingList=" + shoppingList + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23241w);
        ShoppingList shoppingList = this.f23242x;
        if (shoppingList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        shoppingList.writeToParcel(parcel, i);
    }

    public /* synthetic */ ShoppingListUpdateResponse(String str, ShoppingList shoppingList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? null : shoppingList);
    }
}
