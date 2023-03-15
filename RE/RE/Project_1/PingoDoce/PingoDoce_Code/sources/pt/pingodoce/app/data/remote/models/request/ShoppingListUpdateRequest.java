package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* compiled from: ShoppingListUpdateRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ShoppingListUpdateRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8753a();
    @InterfaceC4469e(name = "fullResponse")

    /* renamed from: w */
    private final boolean f22947w;
    @InterfaceC4469e(name = "shoppinglist")

    /* renamed from: x */
    private final ShoppingList f22948x;

    /* compiled from: ShoppingListUpdateRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ShoppingListUpdateRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8753a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingListUpdateRequest mo12914a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ShoppingListUpdateRequest(parcel.readInt() != 0, (ShoppingList) ShoppingList.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final ShoppingListUpdateRequest[] mo12913b(int i) {
            return new ShoppingListUpdateRequest[i];
        }
    }

    public ShoppingListUpdateRequest(boolean z, ShoppingList shoppingList) {
        Intrinsics.isThisObjectNull(shoppingList, "shoppingList");
        this.f22947w = z;
        this.f22948x = shoppingList;
    }

    /* renamed from: a */
    public final boolean m14055a() {
        return this.f22947w;
    }

    /* renamed from: b */
    public final ShoppingList m14054b() {
        return this.f22948x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingListUpdateRequest) {
            ShoppingListUpdateRequest shoppingListUpdateRequest = (ShoppingListUpdateRequest) obj;
            return this.f22947w == shoppingListUpdateRequest.f22947w && Intrinsics.equals(this.f22948x, shoppingListUpdateRequest.f22948x);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f22947w;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.f22948x.hashCode();
    }

    public String toString() {
        boolean z = this.f22947w;
        ShoppingList shoppingList = this.f22948x;
        return "ShoppingListUpdateRequest(fullResponse=" + z + ", shoppingList=" + shoppingList + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22947w ? 1 : 0);
        this.f22948x.writeToParcel(parcel, i);
    }

    public /* synthetic */ ShoppingListUpdateRequest(boolean z, ShoppingList shoppingList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, shoppingList);
    }
}
