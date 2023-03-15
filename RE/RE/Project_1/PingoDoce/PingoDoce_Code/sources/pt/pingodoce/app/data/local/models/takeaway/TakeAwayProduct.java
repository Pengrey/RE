package pt.pingodoce.app.data.local.models.takeaway;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.core.text.C1050b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import fm.C5579c;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p223lg.InterfaceC7054a;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* compiled from: TakeAwayProduct.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayProduct implements Parcelable, InterfaceC7054a {
    public static final Parcelable.Creator CREATOR = new C8724a();
    @InterfaceC4469e(name = "name")

    /* renamed from: A */
    private final String f22783A;
    @InterfaceC4469e(name = "description")

    /* renamed from: B */
    private final String f22784B;
    @InterfaceC4469e(name = "nutritionalInfo")

    /* renamed from: C */
    private final String f22785C;
    @InterfaceC4469e(name = "price")

    /* renamed from: D */
    private final float f22786D;
    @InterfaceC4469e(name = "measureUnitCode")

    /* renamed from: E */
    private final String f22787E;
    @InterfaceC4469e(name = "promotion")

    /* renamed from: F */
    private final Promotion f22788F;
    @InterfaceC4469e(name = "isNew")

    /* renamed from: G */
    private final boolean f22789G;
    @InterfaceC4469e(name = "isMeal")

    /* renamed from: H */
    private final boolean f22790H;
    @InterfaceC4469e(name = "isCeramic")

    /* renamed from: I */
    private final boolean f22791I;
    @InterfaceC4469e(name = "numberOfPeople")

    /* renamed from: J */
    private final int f22792J;
    @InterfaceC4469e(name = "grossWeight")

    /* renamed from: K */
    private final String f22793K;
    @InterfaceC4469e(name = "quantity")

    /* renamed from: L */
    private int f22794L;
    @InterfaceC4469e(name = "productCartRemainingQuantity")

    /* renamed from: M */
    private int f22795M;
    @InterfaceC4469e(name = "quantityAux")

    /* renamed from: N */
    private int f22796N;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f22797w;
    @InterfaceC4469e(name = "categoryId")

    /* renamed from: x */
    private final int f22798x;
    @InterfaceC4469e(name = "thumbUrl")

    /* renamed from: y */
    private final String f22799y;
    @InterfaceC4469e(name = "imageUrl")

    /* renamed from: z */
    private final String f22800z;

    /* compiled from: TakeAwayProduct.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct$a */
    /* loaded from: classes2.dex */
    public static final class C8724a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayProduct createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new TakeAwayProduct(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString(), (Promotion) (parcel.readInt() == 0 ? null : Promotion.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final TakeAwayProduct[] newArray(int i) {
            return new TakeAwayProduct[i];
        }
    }

    public TakeAwayProduct() {
        this(0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null);
    }

    public TakeAwayProduct(int i, int i2, String str, String str2, String str3, String str4, String str5, float f, String str6, Promotion promotion, boolean z, boolean z2, boolean z3, int i3, String str7, int i4, int i5, int i6) {
        Intrinsics.isThisObjectNull(str, "thumbUrl");
        Intrinsics.isThisObjectNull(str2, "imageUrl");
        Intrinsics.isThisObjectNull(str3, "name");
        Intrinsics.isThisObjectNull(str4, "description");
        Intrinsics.isThisObjectNull(str5, "nutritionalInfo");
        Intrinsics.isThisObjectNull(str6, "measureUnitCode");
        Intrinsics.isThisObjectNull(str7, "grossWeight");
        this.f22797w = i;
        this.f22798x = i2;
        this.f22799y = str;
        this.f22800z = str2;
        this.f22783A = str3;
        this.f22784B = str4;
        this.f22785C = str5;
        this.f22786D = f;
        this.f22787E = str6;
        this.f22788F = promotion;
        this.f22789G = z;
        this.f22790H = z2;
        this.f22791I = z3;
        this.f22792J = i3;
        this.f22793K = str7;
        this.f22794L = i4;
        this.f22795M = i5;
        this.f22796N = i6;
    }

    /* renamed from: K */
    private final String m14256K(boolean z) {
        if (z) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22786D)}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            return C5579c.m23716c(format, this.f22787E);
        }
        C6429c0 c6429c02 = C6429c0.f17515a;
        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22786D)}, 1));
        Intrinsics.checkIfNull(format2, "format(format, *args)");
        return format2;
    }

    /* renamed from: c */
    public static /* synthetic */ TakeAwayProduct m14249c(TakeAwayProduct takeAwayProduct, int i, int i2, String str, String str2, String str3, String str4, String str5, float f, String str6, Promotion promotion, boolean z, boolean z2, boolean z3, int i3, String str7, int i4, int i5, int i6, int i7, Object obj) {
        return takeAwayProduct.m14250b((i7 & 1) != 0 ? takeAwayProduct.f22797w : i, (i7 & 2) != 0 ? takeAwayProduct.f22798x : i2, (i7 & 4) != 0 ? takeAwayProduct.f22799y : str, (i7 & 8) != 0 ? takeAwayProduct.f22800z : str2, (i7 & 16) != 0 ? takeAwayProduct.f22783A : str3, (i7 & 32) != 0 ? takeAwayProduct.f22784B : str4, (i7 & 64) != 0 ? takeAwayProduct.f22785C : str5, (i7 & 128) != 0 ? takeAwayProduct.f22786D : f, (i7 & 256) != 0 ? takeAwayProduct.f22787E : str6, (i7 & 512) != 0 ? takeAwayProduct.f22788F : promotion, (i7 & 1024) != 0 ? takeAwayProduct.f22789G : z, (i7 & 2048) != 0 ? takeAwayProduct.f22790H : z2, (i7 & 4096) != 0 ? takeAwayProduct.f22791I : z3, (i7 & 8192) != 0 ? takeAwayProduct.f22792J : i3, (i7 & 16384) != 0 ? takeAwayProduct.f22793K : str7, (i7 & 32768) != 0 ? takeAwayProduct.f22794L : i4, (i7 & 65536) != 0 ? takeAwayProduct.f22795M : i5, (i7 & 131072) != 0 ? takeAwayProduct.f22796N : i6);
    }

    /* renamed from: A */
    public final boolean m14264A() {
        return m14257J().length() > 0;
    }

    /* renamed from: D */
    public final boolean m14263D() {
        return this.f22791I;
    }

    /* renamed from: E */
    public final boolean m14262E() {
        return this.f22790H;
    }

    /* renamed from: F */
    public final boolean m14261F() {
        return this.f22789G;
    }

    /* renamed from: G */
    public final Spanned m14260G() {
        Spanned m38666a = C1050b.m38666a(this.f22785C, 0);
        Intrinsics.checkIfNull(m38666a, "fromHtml(nutritionalInfo…at.FROM_HTML_MODE_LEGACY)");
        return m38666a;
    }

    /* renamed from: H */
    public final String m14259H() {
        return m14258I(true);
    }

    /* renamed from: I */
    public final String m14258I(boolean z) {
        if (this.f22788F == null) {
            if (z) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22786D)}, 1));
                Intrinsics.checkIfNull(format, "format(format, *args)");
                return C5579c.m23716c(format, this.f22787E);
            }
            C6429c0 c6429c02 = C6429c0.f17515a;
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22786D)}, 1));
            Intrinsics.checkIfNull(format2, "format(format, *args)");
            return format2;
        }
        return m14256K(z);
    }

    /* renamed from: J */
    public final String m14257J() {
        String m14466a;
        Promotion promotion = this.f22788F;
        return (promotion == null || (m14466a = promotion.m14466a()) == null) ? BuildConfig.VERSION_NAME : m14466a;
    }

    /* renamed from: L */
    public final String m14255L() {
        int i = this.f22794L;
        return i > 99 ? "+99" : String.valueOf(i);
    }

    /* renamed from: M */
    public final void m14254M(int i) {
        this.f22795M = i;
    }

    /* renamed from: N */
    public final void m14253N(int i) {
        this.f22794L = i;
    }

    /* renamed from: O */
    public final void m14252O(int i) {
        this.f22796N = i;
    }

    /* renamed from: a */
    public final String m14251a() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22786D * this.f22794L)}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    /* renamed from: b */
    public final TakeAwayProduct m14250b(int i, int i2, String str, String str2, String str3, String str4, String str5, float f, String str6, Promotion promotion, boolean z, boolean z2, boolean z3, int i3, String str7, int i4, int i5, int i6) {
        Intrinsics.isThisObjectNull(str, "thumbUrl");
        Intrinsics.isThisObjectNull(str2, "imageUrl");
        Intrinsics.isThisObjectNull(str3, "name");
        Intrinsics.isThisObjectNull(str4, "description");
        Intrinsics.isThisObjectNull(str5, "nutritionalInfo");
        Intrinsics.isThisObjectNull(str6, "measureUnitCode");
        Intrinsics.isThisObjectNull(str7, "grossWeight");
        return new TakeAwayProduct(i, i2, str, str2, str3, str4, str5, f, str6, promotion, z, z2, z3, i3, str7, i4, i5, i6);
    }

    /* renamed from: d */
    public final Spanned m14248d() {
        Spanned m38666a = C1050b.m38666a(this.f22784B, 0);
        Intrinsics.checkIfNull(m38666a, "fromHtml(description, Ht…at.FROM_HTML_MODE_LEGACY)");
        return m38666a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m14247e() {
        return this.f22798x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayProduct) {
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) obj;
            return this.f22797w == takeAwayProduct.f22797w && this.f22798x == takeAwayProduct.f22798x && Intrinsics.equals(this.f22799y, takeAwayProduct.f22799y) && Intrinsics.equals(this.f22800z, takeAwayProduct.f22800z) && Intrinsics.equals(this.f22783A, takeAwayProduct.f22783A) && Intrinsics.equals(this.f22784B, takeAwayProduct.f22784B) && Intrinsics.equals(this.f22785C, takeAwayProduct.f22785C) && Intrinsics.equals(Float.valueOf(this.f22786D), Float.valueOf(takeAwayProduct.f22786D)) && Intrinsics.equals(this.f22787E, takeAwayProduct.f22787E) && Intrinsics.equals(this.f22788F, takeAwayProduct.f22788F) && this.f22789G == takeAwayProduct.f22789G && this.f22790H == takeAwayProduct.f22790H && this.f22791I == takeAwayProduct.f22791I && this.f22792J == takeAwayProduct.f22792J && Intrinsics.equals(this.f22793K, takeAwayProduct.f22793K) && this.f22794L == takeAwayProduct.f22794L && this.f22795M == takeAwayProduct.f22795M && this.f22796N == takeAwayProduct.f22796N;
        }
        return false;
    }

    /* renamed from: f */
    public final String m14246f() {
        return this.f22784B;
    }

    /* renamed from: h */
    public final String m14245h() {
        return this.f22793K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.f22797w) * 31) + Integer.hashCode(this.f22798x)) * 31) + this.f22799y.hashCode()) * 31) + this.f22800z.hashCode()) * 31) + this.f22783A.hashCode()) * 31) + this.f22784B.hashCode()) * 31) + this.f22785C.hashCode()) * 31) + Float.hashCode(this.f22786D)) * 31) + this.f22787E.hashCode()) * 31;
        Promotion promotion = this.f22788F;
        int hashCode2 = (hashCode + (promotion == null ? 0 : promotion.hashCode())) * 31;
        boolean z = this.f22789G;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.f22790H;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f22791I;
        return ((((((((((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f22792J)) * 31) + this.f22793K.hashCode()) * 31) + Integer.hashCode(this.f22794L)) * 31) + Integer.hashCode(this.f22795M)) * 31) + Integer.hashCode(this.f22796N);
    }

    /* renamed from: i */
    public final int m14244i() {
        return this.f22797w;
    }

    /* renamed from: j */
    public final String m14243j() {
        return this.f22800z;
    }

    /* renamed from: k */
    public final String m14242k() {
        return this.f22787E;
    }

    /* renamed from: m */
    public final String m14241m() {
        return this.f22783A;
    }

    /* renamed from: n */
    public final int m14240n() {
        return this.f22792J;
    }

    /* renamed from: r */
    public final String m14239r() {
        return this.f22785C;
    }

    /* renamed from: s */
    public final float m14238s() {
        return this.f22786D;
    }

    /* renamed from: t */
    public final int m14237t() {
        return this.f22795M;
    }

    public String toString() {
        int i = this.f22797w;
        int i2 = this.f22798x;
        String str = this.f22799y;
        String str2 = this.f22800z;
        String str3 = this.f22783A;
        String str4 = this.f22784B;
        String str5 = this.f22785C;
        float f = this.f22786D;
        String str6 = this.f22787E;
        Promotion promotion = this.f22788F;
        boolean z = this.f22789G;
        boolean z2 = this.f22790H;
        boolean z3 = this.f22791I;
        int i3 = this.f22792J;
        String str7 = this.f22793K;
        int i4 = this.f22794L;
        int i5 = this.f22795M;
        int i6 = this.f22796N;
        return "TakeAwayProduct(id=" + i + ", categoryId=" + i2 + ", thumbUrl=" + str + ", imageUrl=" + str2 + ", name=" + str3 + ", description=" + str4 + ", nutritionalInfo=" + str5 + ", price=" + f + ", measureUnitCode=" + str6 + ", promotion=" + promotion + ", isNew=" + z + ", isMeal=" + z2 + ", isCeramic=" + z3 + ", numberOfPeople=" + i3 + ", grossWeight=" + str7 + ", quantity=" + i4 + ", productCartRemainingQuantity=" + i5 + ", quantityAux=" + i6 + ")";
    }

    /* renamed from: v */
    public final Promotion m14236v() {
        return this.f22788F;
    }

    /* renamed from: w */
    public final int m14235w() {
        return this.f22794L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22797w);
        parcel.writeInt(this.f22798x);
        parcel.writeString(this.f22799y);
        parcel.writeString(this.f22800z);
        parcel.writeString(this.f22783A);
        parcel.writeString(this.f22784B);
        parcel.writeString(this.f22785C);
        parcel.writeFloat(this.f22786D);
        parcel.writeString(this.f22787E);
        Promotion promotion = this.f22788F;
        if (promotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotion.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f22789G ? 1 : 0);
        parcel.writeInt(this.f22790H ? 1 : 0);
        parcel.writeInt(this.f22791I ? 1 : 0);
        parcel.writeInt(this.f22792J);
        parcel.writeString(this.f22793K);
        parcel.writeInt(this.f22794L);
        parcel.writeInt(this.f22795M);
        parcel.writeInt(this.f22796N);
    }

    /* renamed from: y */
    public final int m14234y() {
        return this.f22796N;
    }

    /* renamed from: z */
    public final String m14233z() {
        return this.f22799y;
    }

    public /* synthetic */ TakeAwayProduct(int i, int i2, String str, String str2, String str3, String str4, String str5, float f, String str6, Promotion promotion, boolean z, boolean z2, boolean z3, int i3, String str7, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? -1 : i, (i7 & 2) == 0 ? i2 : -1, (i7 & 4) != 0 ? BuildConfig.VERSION_NAME : str, (i7 & 8) != 0 ? BuildConfig.VERSION_NAME : str2, (i7 & 16) != 0 ? BuildConfig.VERSION_NAME : str3, (i7 & 32) != 0 ? BuildConfig.VERSION_NAME : str4, (i7 & 64) != 0 ? BuildConfig.VERSION_NAME : str5, (i7 & 128) != 0 ? 1.0f : f, (i7 & 256) != 0 ? BuildConfig.VERSION_NAME : str6, (i7 & 512) != 0 ? null : promotion, (i7 & 1024) != 0 ? false : z, (i7 & 2048) != 0 ? true : z2, (i7 & 4096) != 0 ? false : z3, (i7 & 8192) != 0 ? 1 : i3, (i7 & 16384) != 0 ? BuildConfig.VERSION_NAME : str7, (i7 & 32768) != 0 ? 0 : i4, (i7 & 65536) != 0 ? 10 : i5, (i7 & 131072) != 0 ? 0 : i6);
    }
}
