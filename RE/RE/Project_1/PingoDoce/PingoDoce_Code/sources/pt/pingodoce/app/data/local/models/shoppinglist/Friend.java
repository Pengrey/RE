package pt.pingodoce.app.data.local.models.shoppinglist;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Friend.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Friend implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8713a();
    @InterfaceC4469e(name = "isOwner")

    /* renamed from: A */
    private final boolean f22664A;
    @InterfaceC4469e(name = "canWrite")

    /* renamed from: B */
    private boolean f22665B;
    @InterfaceC4469e(name = "isActive")

    /* renamed from: C */
    private final boolean f22666C;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22667w;
    @InterfaceC4469e(name = "name")

    /* renamed from: x */
    private final String f22668x;
    @InterfaceC4469e(name = "imageUrl")

    /* renamed from: y */
    private final String f22669y;
    @InterfaceC4469e(name = "number")

    /* renamed from: z */
    private final String f22670z;

    /* compiled from: Friend.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.shoppinglist.Friend$a */
    /* loaded from: classes2.dex */
    public static final class C8713a implements Parcelable.Creator {
        /* renamed from: a */
        public final Friend mo13253a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Friend(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final Friend[] mo13252b(int i) {
            return new Friend[i];
        }
    }

    public Friend() {
        this(null, null, null, null, false, false, false, 127, null);
    }

    public Friend(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str4, "number");
        this.f22667w = str;
        this.f22668x = str2;
        this.f22669y = str3;
        this.f22670z = str4;
        this.f22664A = z;
        this.f22665B = z2;
        this.f22666C = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ Friend m14401b(Friend friend, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = friend.f22667w;
        }
        if ((i & 2) != 0) {
            str2 = friend.f22668x;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = friend.f22669y;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = friend.f22670z;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = friend.f22664A;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = friend.f22665B;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = friend.f22666C;
        }
        return friend.m14402a(str, str5, str6, str7, z4, z5, z3);
    }

    /* renamed from: a */
    public final Friend m14402a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str4, "number");
        return new Friend(str, str2, str3, str4, z, z2, z3);
    }

    /* renamed from: c */
    public final boolean m14400c() {
        return this.f22665B;
    }

    /* renamed from: d */
    public final String m14399d() {
        return this.f22667w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14398e() {
        return this.f22669y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Friend) {
            Friend friend = (Friend) obj;
            return Intrinsics.equals(this.f22667w, friend.f22667w) && Intrinsics.equals(this.f22668x, friend.f22668x) && Intrinsics.equals(this.f22669y, friend.f22669y) && Intrinsics.equals(this.f22670z, friend.f22670z) && this.f22664A == friend.f22664A && this.f22665B == friend.f22665B && this.f22666C == friend.f22666C;
        }
        return false;
    }

    /* renamed from: f */
    public final String m14397f() {
        return this.f22668x;
    }

    /* renamed from: h */
    public final String m14396h() {
        return this.f22670z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f22667w.hashCode() * 31) + this.f22668x.hashCode()) * 31;
        String str = this.f22669y;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f22670z.hashCode()) * 31;
        boolean z = this.f22664A;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.f22665B;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f22666C;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m14395i() {
        return this.f22666C;
    }

    /* renamed from: j */
    public final boolean m14394j() {
        return this.f22664A;
    }

    /* renamed from: k */
    public final void m14393k(boolean z) {
        this.f22665B = z;
    }

    public String toString() {
        String str = this.f22667w;
        String str2 = this.f22668x;
        String str3 = this.f22669y;
        String str4 = this.f22670z;
        boolean z = this.f22664A;
        boolean z2 = this.f22665B;
        boolean z3 = this.f22666C;
        return "Friend(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", number=" + str4 + ", isOwner=" + z + ", canWrite=" + z2 + ", isActive=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22667w);
        parcel.writeString(this.f22668x);
        parcel.writeString(this.f22669y);
        parcel.writeString(this.f22670z);
        parcel.writeInt(this.f22664A ? 1 : 0);
        parcel.writeInt(this.f22665B ? 1 : 0);
        parcel.writeInt(this.f22666C ? 1 : 0);
    }

    public /* synthetic */ Friend(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : BuildConfig.VERSION_NAME, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
    }
}
