package pt.pingodoce.app.data.local.models.shoppinglist;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: FriendLight.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FriendLight implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8714a();
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22676w;
    @InterfaceC4469e(name = "canWrite")

    /* renamed from: x */
    private final boolean f22677x;

    /* compiled from: FriendLight.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.shoppinglist.FriendLight$a */
    /* loaded from: classes2.dex */
    public static final class C8714a implements Parcelable.Creator {
        /* renamed from: a */
        public final FriendLight mo13247a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new FriendLight(parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final FriendLight[] mo13246b(int i) {
            return new FriendLight[i];
        }
    }

    public FriendLight(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "id");
        this.f22676w = str;
        this.f22677x = z;
    }

    /* renamed from: a */
    public final boolean m14388a() {
        return this.f22677x;
    }

    /* renamed from: b */
    public final String m14387b() {
        return this.f22676w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FriendLight) {
            FriendLight friendLight = (FriendLight) obj;
            return Intrinsics.equals(this.f22676w, friendLight.f22676w) && this.f22677x == friendLight.f22677x;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f22676w.hashCode() * 31;
        boolean z = this.f22677x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f22676w;
        boolean z = this.f22677x;
        return "FriendLight(id=" + str + ", canWrite=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22676w);
        parcel.writeInt(this.f22677x ? 1 : 0);
    }
}
