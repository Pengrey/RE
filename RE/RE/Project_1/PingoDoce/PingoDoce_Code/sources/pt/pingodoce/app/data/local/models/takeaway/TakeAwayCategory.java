package pt.pingodoce.app.data.local.models.takeaway;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p223lg.InterfaceC7054a;

/* compiled from: TakeAwayCategory.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayCategory implements Parcelable, InterfaceC7054a {
    public static final Parcelable.Creator CREATOR = new C8722a();
    @InterfaceC4469e(name = "code")

    /* renamed from: w */
    private final String f22752w;
    @InterfaceC4469e(name = "name")

    /* renamed from: x */
    private final String f22753x;
    @InterfaceC4469e(name = "imageUrl")

    /* renamed from: y */
    private final String f22754y;
    @InterfaceC4469e(name = "isHighlight")

    /* renamed from: z */
    private final boolean f22755z;

    /* compiled from: TakeAwayCategory.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory$a */
    /* loaded from: classes2.dex */
    public static final class C8722a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayCategory mo13150a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final TakeAwayCategory[] mo13149b(int i) {
            return new TakeAwayCategory[i];
        }
    }

    public TakeAwayCategory() {
        this(null, null, null, false, 15, null);
    }

    public TakeAwayCategory(String str, String str2, String str3, boolean z) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "imageUrl");
        this.f22752w = str;
        this.f22753x = str2;
        this.f22754y = str3;
        this.f22755z = z;
    }

    /* renamed from: a */
    public final String m14293a() {
        return this.f22752w;
    }

    /* renamed from: b */
    public final String m14292b() {
        return this.f22754y;
    }

    /* renamed from: c */
    public final String m14291c() {
        return this.f22753x;
    }

    /* renamed from: d */
    public final boolean m14290d() {
        return this.f22755z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayCategory) {
            TakeAwayCategory takeAwayCategory = (TakeAwayCategory) obj;
            return Intrinsics.equals(this.f22752w, takeAwayCategory.f22752w) && Intrinsics.equals(this.f22753x, takeAwayCategory.f22753x) && Intrinsics.equals(this.f22754y, takeAwayCategory.f22754y) && this.f22755z == takeAwayCategory.f22755z;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f22752w.hashCode() * 31) + this.f22753x.hashCode()) * 31) + this.f22754y.hashCode()) * 31;
        boolean z = this.f22755z;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f22752w;
        String str2 = this.f22753x;
        String str3 = this.f22754y;
        boolean z = this.f22755z;
        return "TakeAwayCategory(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", isHighlight=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22752w);
        parcel.writeString(this.f22753x);
        parcel.writeString(this.f22754y);
        parcel.writeInt(this.f22755z ? 1 : 0);
    }

    public /* synthetic */ TakeAwayCategory(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? false : z);
    }
}
