package pt.pingodoce.app.data.local.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* compiled from: PriceCalculation.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PriceCalculation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8707a();
    @InterfaceC4469e(name = "promotionCode")

    /* renamed from: A */
    private final String f22599A;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22600w;
    @InterfaceC4469e(name = "quantity")

    /* renamed from: x */
    private final int f22601x;
    @InterfaceC4469e(name = "priceLabel")

    /* renamed from: y */
    private final String f22602y;
    @InterfaceC4469e(name = "unitPriceLabel")

    /* renamed from: z */
    private final String f22603z;

    /* compiled from: PriceCalculation.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.PriceCalculation$a */
    /* loaded from: classes2.dex */
    public static final class C8707a implements Parcelable.Creator {
        /* renamed from: a */
        public final PriceCalculation mo13331a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PriceCalculation(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PriceCalculation[] mo13330b(int i) {
            return new PriceCalculation[i];
        }
    }

    public PriceCalculation() {
        this(null, 0, null, null, null, 31, null);
    }

    public PriceCalculation(String str, int i, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "productId");
        Intrinsics.isThisObjectNull(str2, "priceLabel");
        Intrinsics.isThisObjectNull(str3, "unitPriceLabel");
        Intrinsics.isThisObjectNull(str4, "promotionCode");
        this.f22600w = str;
        this.f22601x = i;
        this.f22602y = str2;
        this.f22603z = str3;
        this.f22599A = str4;
    }

    /* renamed from: a */
    public final String m14475a() {
        return this.f22602y;
    }

    /* renamed from: b */
    public final String m14474b() {
        return this.f22600w;
    }

    /* renamed from: c */
    public final String m14473c() {
        return this.f22599A;
    }

    /* renamed from: d */
    public final int m14472d() {
        return this.f22601x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14471e() {
        return this.f22603z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PriceCalculation) {
            PriceCalculation priceCalculation = (PriceCalculation) obj;
            return Intrinsics.equals(this.f22600w, priceCalculation.f22600w) && this.f22601x == priceCalculation.f22601x && Intrinsics.equals(this.f22602y, priceCalculation.f22602y) && Intrinsics.equals(this.f22603z, priceCalculation.f22603z) && Intrinsics.equals(this.f22599A, priceCalculation.f22599A);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f22600w.hashCode() * 31) + Integer.hashCode(this.f22601x)) * 31) + this.f22602y.hashCode()) * 31) + this.f22603z.hashCode()) * 31) + this.f22599A.hashCode();
    }

    public String toString() {
        String str = this.f22600w;
        int i = this.f22601x;
        String str2 = this.f22602y;
        String str3 = this.f22603z;
        String str4 = this.f22599A;
        return "PriceCalculation(productId=" + str + ", quantity=" + i + ", priceLabel=" + str2 + ", unitPriceLabel=" + str3 + ", promotionCode=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22600w);
        parcel.writeInt(this.f22601x);
        parcel.writeString(this.f22602y);
        parcel.writeString(this.f22603z);
        parcel.writeString(this.f22599A);
    }

    public /* synthetic */ PriceCalculation(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i2 & 16) != 0 ? BuildConfig.VERSION_NAME : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceCalculation(ShoppingListProduct shoppingListProduct) {
        this(shoppingListProduct.m14331k(), shoppingListProduct.m14327s(), shoppingListProduct.m14322z(), shoppingListProduct.m14322z(), shoppingListProduct.m14339b());
        Intrinsics.isThisObjectNull(shoppingListProduct, "item");
    }
}
