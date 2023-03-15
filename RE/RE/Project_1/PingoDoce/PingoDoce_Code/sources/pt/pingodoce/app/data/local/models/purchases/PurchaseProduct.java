package pt.pingodoce.app.data.local.models.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import fm.C5579c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p183jg.InterfaceC6457b;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* compiled from: PurchaseProduct.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PurchaseProduct extends CatalogProduct implements InterfaceC6457b {
    public static final Parcelable.Creator CREATOR = new C8712a();
    @InterfaceC4469e(name = "purchasePrice")

    /* renamed from: N */
    private final String f22652N;
    @InterfaceC4469e(name = "purchaseQuantity")

    /* renamed from: O */
    private final String f22653O;
    @InterfaceC4469e(name = "elasticID")

    /* renamed from: P */
    private final String f22654P;
    @InterfaceC4469e(name = "name")

    /* renamed from: Q */
    private final String f22655Q;
    @InterfaceC4469e(name = "storePrice")

    /* renamed from: R */
    private final String f22656R;
    @InterfaceC4469e(name = "measureUnitCode")

    /* renamed from: S */
    private final String f22657S;
    @InterfaceC4469e(name = "isSelected")

    /* renamed from: T */
    private boolean f22658T;

    /* compiled from: PurchaseProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.purchases.PurchaseProduct$a */
    /* loaded from: classes2.dex */
    public static final class C8712a implements Parcelable.Creator {
        /* renamed from: a */
        public final PurchaseProduct mo13267a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PurchaseProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final PurchaseProduct[] mo13266b(int i) {
            return new PurchaseProduct[i];
        }
    }

    public PurchaseProduct() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public /* synthetic */ PurchaseProduct(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 32) == 0 ? str6 : BuildConfig.VERSION_NAME, (i & 64) != 0 ? false : z);
    }

    /* renamed from: D */
    public String m14417D() {
        return this.f22657S;
    }

    /* renamed from: E */
    public String m14416E() {
        return this.f22655Q;
    }

    /* renamed from: I */
    public String m14415I() {
        return this.f22656R;
    }

    /* renamed from: c0 */
    public final String m14414c0() {
        return this.f22652N;
    }

    /* renamed from: d0 */
    public final String m14413d0() {
        return C5579c.m23715d(this.f22652N, null, 1, null);
    }

    /* renamed from: e0 */
    public final String m14412e0() {
        return this.f22653O;
    }

    /* renamed from: f0 */
    public final String m14411f0() {
        return C5579c.m23715d(m14415I(), null, 1, null);
    }

    /* renamed from: g0 */
    public final boolean m14410g0() {
        return !Intrinsics.equals(this.f22652N, m14415I());
    }

    /* renamed from: h0 */
    public final boolean m14409h0() {
        return this.f22658T;
    }

    /* renamed from: i0 */
    public final void m14408i0(boolean z) {
        this.f22658T = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22652N);
        parcel.writeString(this.f22653O);
        parcel.writeString(this.f22654P);
        parcel.writeString(this.f22655Q);
        parcel.writeString(this.f22656R);
        parcel.writeString(this.f22657S);
        parcel.writeInt(this.f22658T ? 1 : 0);
    }

    /* renamed from: y */
    public String m14407y() {
        return this.f22654P;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProduct(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        super(str3, 0, str4, null, null, null, null, str5, str6, false, null, null, 0, 0, false, null, 65146, null);
        Intrinsics.isThisObjectNull(str, "purchasePrice");
        Intrinsics.isThisObjectNull(str2, "purchaseQuantity");
        Intrinsics.isThisObjectNull(str3, "id");
        Intrinsics.isThisObjectNull(str4, "name");
        Intrinsics.isThisObjectNull(str5, "storePrice");
        Intrinsics.isThisObjectNull(str6, "measureUnitCode");
        this.f22652N = str;
        this.f22653O = str2;
        this.f22654P = str3;
        this.f22655Q = str4;
        this.f22656R = str5;
        this.f22657S = str6;
        this.f22658T = z;
    }
}
