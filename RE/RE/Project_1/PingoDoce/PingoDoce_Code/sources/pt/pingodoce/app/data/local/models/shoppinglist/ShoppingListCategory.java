package pt.pingodoce.app.data.local.models.shoppinglist;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kg.InterfaceC6661b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ShoppingListCategory.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ShoppingListCategory implements InterfaceC6661b, Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C8716a();
    @InterfaceC4469e(name = "name")

    /* renamed from: w */
    private final String f22698w;
    @InterfaceC4469e(name = "primaryColor")

    /* renamed from: x */
    private final String f22699x;
    @InterfaceC4469e(name = "sortOrder")

    /* renamed from: y */
    private final int f22700y;

    /* compiled from: ShoppingListCategory.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory$a */
    /* loaded from: classes2.dex */
    public static final class C8716a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingListCategory mo13216a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ShoppingListCategory(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final ShoppingListCategory[] mo13215b(int i) {
            return new ShoppingListCategory[i];
        }
    }

    public ShoppingListCategory() {
        this(null, null, 0, 7, null);
    }

    public ShoppingListCategory(String str, String str2, int i) {
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(str2, "color");
        this.f22698w = str;
        this.f22699x = str2;
        this.f22700y = i;
    }

    /* renamed from: b */
    public int mo13221b(ShoppingListCategory shoppingListCategory) {
        Intrinsics.isThisObjectNull(shoppingListCategory, "other");
        return Intrinsics.isLessOrEqual(this.f22700y, shoppingListCategory.f22700y);
    }

    /* renamed from: c */
    public final String m14359c() {
        return this.f22699x;
    }

    /* renamed from: d */
    public final String m14358d() {
        return this.f22699x.length() == 0 ? "#8E8E93" : this.f22699x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14357e() {
        return this.f22698w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingListCategory) {
            ShoppingListCategory shoppingListCategory = (ShoppingListCategory) obj;
            return Intrinsics.equals(this.f22698w, shoppingListCategory.f22698w) && Intrinsics.equals(this.f22699x, shoppingListCategory.f22699x) && this.f22700y == shoppingListCategory.f22700y;
        }
        return false;
    }

    /* renamed from: f */
    public final int m14356f() {
        return this.f22700y;
    }

    public int hashCode() {
        return (((this.f22698w.hashCode() * 31) + this.f22699x.hashCode()) * 31) + Integer.hashCode(this.f22700y);
    }

    public String toString() {
        String str = this.f22698w;
        String str2 = this.f22699x;
        int i = this.f22700y;
        return "ShoppingListCategory(name=" + str + ", color=" + str2 + ", sortOrder=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22698w);
        parcel.writeString(this.f22699x);
        parcel.writeInt(this.f22700y);
    }

    public /* synthetic */ ShoppingListCategory(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "Manuais" : str, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 4) != 0 ? Reader.READ_DONE : i);
    }
}
