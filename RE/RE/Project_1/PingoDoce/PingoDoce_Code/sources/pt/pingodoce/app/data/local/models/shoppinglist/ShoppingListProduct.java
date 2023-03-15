package pt.pingodoce.app.data.local.models.shoppinglist;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kg.InterfaceC6661b;
import p181jd.Intrinsics;

/* compiled from: ShoppingListProduct.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public class ShoppingListProduct implements InterfaceC6661b, Parcelable {
    public static final Parcelable.Creator CREATOR = new C8717a();
    @InterfaceC4469e(name = "quantity")

    /* renamed from: A */
    private int f22705A;
    @InterfaceC4469e(name = "checked")

    /* renamed from: B */
    private boolean f22706B;
    @InterfaceC4469e(name = "unitLabel")

    /* renamed from: C */
    private final String f22707C;
    @InterfaceC4469e(name = "badgeUrl")

    /* renamed from: D */
    private final String f22708D;
    @InterfaceC4469e(name = "badgeDisclaimer")

    /* renamed from: E */
    private final String f22709E;
    @InterfaceC4469e(name = "badgeDisclaimerTitle")

    /* renamed from: F */
    private final String f22710F;
    @InterfaceC4469e(name = "showBadgeDisclaimer")

    /* renamed from: G */
    private final boolean f22711G;
    @InterfaceC4469e(name = "promotionCode")

    /* renamed from: H */
    private final String f22712H;
    @InterfaceC4469e(name = "priceLabel")

    /* renamed from: I */
    private String f22713I;
    @InterfaceC4469e(name = "unitPriceLabel")

    /* renamed from: J */
    private final String f22714J;
    @InterfaceC4469e(name = "dateUpdated")

    /* renamed from: K */
    private String f22715K;
    @InterfaceC4469e(name = "sortOrder")

    /* renamed from: L */
    private int f22716L;
    @InterfaceC4469e(name = "manualOrder")

    /* renamed from: M */
    private int f22717M;
    @InterfaceC4469e(name = "deleted")

    /* renamed from: N */
    private boolean f22718N;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final String f22719w;
    @InterfaceC4469e(name = "timeStamp")

    /* renamed from: x */
    private final long f22720x;
    @InterfaceC4469e(name = "category")

    /* renamed from: y */
    private final ShoppingListCategory f22721y;
    @InterfaceC4469e(name = "name")

    /* renamed from: z */
    private String f22722z;

    /* compiled from: ShoppingListProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct$a */
    /* loaded from: classes2.dex */
    public static final class C8717a implements Parcelable.Creator {
        /* renamed from: a */
        public final ShoppingListProduct createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ShoppingListProduct(parcel.readString(), parcel.readLong(), (ShoppingListCategory) ShoppingListCategory.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ShoppingListProduct[] newArray(int i) {
            return new ShoppingListProduct[i];
        }
    }

    public ShoppingListProduct(String str, long j, ShoppingListCategory shoppingListCategory, String str2, int i, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8, String str9, String str10, int i2, int i3, boolean z3) {
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(shoppingListCategory, "category");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "unitLabel");
        Intrinsics.isThisObjectNull(str4, "badgeUrl");
        Intrinsics.isThisObjectNull(str5, "badgeDisclaimer");
        Intrinsics.isThisObjectNull(str6, "badgeDisclaimerTitle");
        Intrinsics.isThisObjectNull(str7, "badgeCode");
        Intrinsics.isThisObjectNull(str8, "priceLabel");
        Intrinsics.isThisObjectNull(str9, "unitPriceLabel");
        Intrinsics.isThisObjectNull(str10, "dateUpdated");
        this.f22719w = str;
        this.f22720x = j;
        this.f22721y = shoppingListCategory;
        this.f22722z = str2;
        this.f22705A = i;
        this.f22706B = z;
        this.f22707C = str3;
        this.f22708D = str4;
        this.f22709E = str5;
        this.f22710F = str6;
        this.f22711G = z2;
        this.f22712H = str7;
        this.f22713I = str8;
        this.f22714J = str9;
        this.f22715K = str10;
        this.f22716L = i2;
        this.f22717M = i3;
        this.f22718N = z3;
    }

    /* renamed from: A */
    public final boolean m14351A() {
        return this.f22708D.length() > 0;
    }

    /* renamed from: D */
    public final boolean m14350D() {
        if (this.f22707C.length() == 0) {
            if (this.f22713I.length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m14349E() {
        return !m14350D();
    }

    /* renamed from: F */
    public final String m14348F() {
        return m14327s() > 99 ? "+99" : String.valueOf(m14327s());
    }

    /* renamed from: G */
    public void m14347G(boolean z) {
        this.f22706B = z;
    }

    /* renamed from: H */
    public void m14346H(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22715K = str;
    }

    /* renamed from: I */
    public void m14345I(boolean z) {
        this.f22718N = z;
    }

    /* renamed from: J */
    public void m14344J(int i) {
        this.f22717M = i;
    }

    /* renamed from: K */
    public void m14343K(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22722z = str;
    }

    /* renamed from: L */
    public final void m14342L(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22713I = str;
    }

    /* renamed from: M */
    public void m14341M(int i) {
        this.f22705A = i;
    }

    /* renamed from: a */
    public ShoppingListProduct m14340a() {
        return new ShoppingListProduct(m14331k(), m14324w(), m14335f(), m14329n(), m14327s(), m14334h(), this.f22707C, this.f22708D, this.f22709E, this.f22710F, this.f22711G, this.f22712H, this.f22713I, this.f22714J, m14333i(), m14325v(), m14330m(), m14332j());
    }

    /* renamed from: b */
    public final String m14339b() {
        return this.f22712H;
    }

    /* renamed from: c */
    public final String m14338c() {
        return this.f22709E;
    }

    /* renamed from: d */
    public final String m14337d() {
        return this.f22710F;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14336e() {
        return this.f22708D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShoppingListProduct) {
            ShoppingListProduct shoppingListProduct = (ShoppingListProduct) obj;
            return Intrinsics.equals(m14331k(), shoppingListProduct.m14331k()) && m14324w() == shoppingListProduct.m14324w() && Intrinsics.equals(m14335f(), shoppingListProduct.m14335f()) && Intrinsics.equals(m14329n(), shoppingListProduct.m14329n()) && m14327s() == shoppingListProduct.m14327s() && m14334h() == shoppingListProduct.m14334h() && Intrinsics.equals(this.f22707C, shoppingListProduct.f22707C) && Intrinsics.equals(this.f22708D, shoppingListProduct.f22708D) && Intrinsics.equals(this.f22709E, shoppingListProduct.f22709E) && Intrinsics.equals(this.f22710F, shoppingListProduct.f22710F) && this.f22711G == shoppingListProduct.f22711G && Intrinsics.equals(this.f22712H, shoppingListProduct.f22712H) && Intrinsics.equals(this.f22713I, shoppingListProduct.f22713I) && Intrinsics.equals(this.f22714J, shoppingListProduct.f22714J) && Intrinsics.equals(m14333i(), shoppingListProduct.m14333i()) && m14325v() == shoppingListProduct.m14325v() && m14330m() == shoppingListProduct.m14330m() && m14332j() == shoppingListProduct.m14332j();
        }
        return false;
    }

    /* renamed from: f */
    public ShoppingListCategory m14335f() {
        return this.f22721y;
    }

    /* renamed from: h */
    public boolean m14334h() {
        return this.f22706B;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((m14331k().hashCode() * 31) + Long.hashCode(m14324w())) * 31) + m14335f().hashCode()) * 31) + m14329n().hashCode()) * 31) + m14327s()) * 31) + Boolean.hashCode(m14334h())) * 31) + this.f22707C.hashCode()) * 31) + this.f22708D.hashCode()) * 31) + this.f22709E.hashCode()) * 31) + this.f22710F.hashCode()) * 31) + Boolean.hashCode(this.f22711G)) * 31) + this.f22712H.hashCode()) * 31) + this.f22713I.hashCode()) * 31) + this.f22714J.hashCode()) * 31) + m14333i().hashCode()) * 31) + m14325v()) * 31) + m14330m()) * 31) + Boolean.hashCode(m14332j());
    }

    /* renamed from: i */
    public String m14333i() {
        return this.f22715K;
    }

    /* renamed from: j */
    public boolean m14332j() {
        return this.f22718N;
    }

    /* renamed from: k */
    public String m14331k() {
        return this.f22719w;
    }

    /* renamed from: m */
    public int m14330m() {
        return this.f22717M;
    }

    /* renamed from: n */
    public String m14329n() {
        return this.f22722z;
    }

    /* renamed from: r */
    public final String m14328r() {
        return this.f22713I;
    }

    /* renamed from: s */
    public int m14327s() {
        return this.f22705A;
    }

    /* renamed from: t */
    public final boolean m14326t() {
        return this.f22711G;
    }

    /* renamed from: v */
    public int m14325v() {
        return this.f22716L;
    }

    /* renamed from: w */
    public long m14324w() {
        return this.f22720x;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22719w);
        parcel.writeLong(this.f22720x);
        this.f22721y.writeToParcel(parcel, i);
        parcel.writeString(this.f22722z);
        parcel.writeInt(this.f22705A);
        parcel.writeInt(this.f22706B ? 1 : 0);
        parcel.writeString(this.f22707C);
        parcel.writeString(this.f22708D);
        parcel.writeString(this.f22709E);
        parcel.writeString(this.f22710F);
        parcel.writeInt(this.f22711G ? 1 : 0);
        parcel.writeString(this.f22712H);
        parcel.writeString(this.f22713I);
        parcel.writeString(this.f22714J);
        parcel.writeString(this.f22715K);
        parcel.writeInt(this.f22716L);
        parcel.writeInt(this.f22717M);
        parcel.writeInt(this.f22718N ? 1 : 0);
    }

    /* renamed from: y */
    public final String m14323y() {
        return this.f22707C;
    }

    /* renamed from: z */
    public final String m14322z() {
        return this.f22714J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ShoppingListProduct(java.lang.String r24, long r25, pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory r27, java.lang.String r28, int r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, int r41, boolean r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct.<init>(java.lang.String, long, pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
