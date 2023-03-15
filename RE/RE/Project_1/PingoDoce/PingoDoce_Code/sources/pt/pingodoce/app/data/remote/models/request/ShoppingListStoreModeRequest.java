package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.stores.Coordinates;

/* compiled from: ShoppingListStoreModeRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ShoppingListStoreModeRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8752a();
    @InterfaceC4469e(name = "listId")

    /* renamed from: w */
    private final String f22941w;
    @InterfaceC4469e(name = "coordinates")

    /* renamed from: x */
    private final Coordinates f22942x;

    /* compiled from: ShoppingListStoreModeRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.ShoppingListStoreModeRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8752a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingListStoreModeRequest mo12920a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ShoppingListStoreModeRequest(parcel.readString(), (Coordinates) (parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel)));
        }

        /* renamed from: b */
        public final ShoppingListStoreModeRequest[] mo12919b(int i) {
            return new ShoppingListStoreModeRequest[i];
        }
    }

    public ShoppingListStoreModeRequest(String str, Coordinates coordinates) {
        Intrinsics.isThisObjectNull(str, "listId");
        this.f22941w = str;
        this.f22942x = coordinates;
    }

    /* renamed from: a */
    public final Coordinates m14061a() {
        return this.f22942x;
    }

    /* renamed from: b */
    public final String m14060b() {
        return this.f22941w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingListStoreModeRequest) {
            ShoppingListStoreModeRequest shoppingListStoreModeRequest = (ShoppingListStoreModeRequest) obj;
            return Intrinsics.equals(this.f22941w, shoppingListStoreModeRequest.f22941w) && Intrinsics.equals(this.f22942x, shoppingListStoreModeRequest.f22942x);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f22941w.hashCode() * 31;
        Coordinates coordinates = this.f22942x;
        return hashCode + (coordinates == null ? 0 : coordinates.hashCode());
    }

    public String toString() {
        String str = this.f22941w;
        Coordinates coordinates = this.f22942x;
        return "ShoppingListStoreModeRequest(listId=" + str + ", coordinates=" + coordinates + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22941w);
        Coordinates coordinates = this.f22942x;
        if (coordinates == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        coordinates.writeToParcel(parcel, i);
    }

    public /* synthetic */ ShoppingListStoreModeRequest(String str, Coordinates coordinates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : coordinates);
    }
}
