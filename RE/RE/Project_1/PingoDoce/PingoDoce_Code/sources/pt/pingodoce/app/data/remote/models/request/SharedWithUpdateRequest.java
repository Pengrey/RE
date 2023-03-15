package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.shoppinglist.FriendLight;

/* compiled from: SharedWithUpdateRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SharedWithUpdateRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8751a();
    @InterfaceC4469e(name = "listId")

    /* renamed from: w */
    private final String f22936w;
    @InterfaceC4469e(name = "sharedWith")

    /* renamed from: x */
    private final List f22937x;

    /* compiled from: SharedWithUpdateRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.SharedWithUpdateRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8751a implements Parcelable.Creator {
        /* renamed from: a */
        public final SharedWithUpdateRequest mo12926a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(FriendLight.CREATOR.createFromParcel(parcel));
            }
            return new SharedWithUpdateRequest(readString, arrayList);
        }

        /* renamed from: b */
        public final SharedWithUpdateRequest[] mo12925b(int i) {
            return new SharedWithUpdateRequest[i];
        }
    }

    public SharedWithUpdateRequest(String str, List list) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(list, "users");
        this.f22936w = str;
        this.f22937x = list;
    }

    /* renamed from: a */
    public final String m14067a() {
        return this.f22936w;
    }

    /* renamed from: b */
    public final List m14066b() {
        return this.f22937x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedWithUpdateRequest) {
            SharedWithUpdateRequest sharedWithUpdateRequest = (SharedWithUpdateRequest) obj;
            return Intrinsics.equals(this.f22936w, sharedWithUpdateRequest.f22936w) && Intrinsics.equals(this.f22937x, sharedWithUpdateRequest.f22937x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22936w.hashCode() * 31) + this.f22937x.hashCode();
    }

    public String toString() {
        String str = this.f22936w;
        List list = this.f22937x;
        return "SharedWithUpdateRequest(id=" + str + ", users=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22936w);
        List<FriendLight> list = this.f22937x;
        parcel.writeInt(list.size());
        for (FriendLight friendLight : list) {
            friendLight.writeToParcel(parcel, i);
        }
    }
}
