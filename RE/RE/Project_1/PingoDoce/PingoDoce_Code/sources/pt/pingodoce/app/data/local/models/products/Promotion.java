package pt.pingodoce.app.data.local.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Promotion.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Promotion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8708a();
    @InterfaceC4469e(name = "showDisclaimer")

    /* renamed from: A */
    private final boolean f22608A;
    @InterfaceC4469e(name = "price")

    /* renamed from: B */
    private final String f22609B;
    @InterfaceC4469e(name = "badgeUrl")

    /* renamed from: C */
    private final String f22610C;
    @InterfaceC4469e(name = "shortBadgeUrl")

    /* renamed from: D */
    private final String f22611D;
    @InterfaceC4469e(name = "groupClass")

    /* renamed from: E */
    private final String f22612E;
    @InterfaceC4469e(name = "groupLxPy")

    /* renamed from: F */
    private final String f22613F;
    @InterfaceC4469e(name = "lxPySpecial")

    /* renamed from: G */
    private final boolean f22614G;
    @InterfaceC4469e(name = "endDate")

    /* renamed from: H */
    private final String f22615H;
    @InterfaceC4469e(name = "terms")

    /* renamed from: I */
    private final String f22616I;
    @InterfaceC4469e(name = "title")

    /* renamed from: w */
    private final String f22617w;
    @InterfaceC4469e(name = "description")

    /* renamed from: x */
    private final String f22618x;
    @InterfaceC4469e(name = "disclaimer")

    /* renamed from: y */
    private final String f22619y;
    @InterfaceC4469e(name = "disclaimerTitle")

    /* renamed from: z */
    private final String f22620z;

    /* compiled from: Promotion.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.Promotion$a */
    /* loaded from: classes2.dex */
    public static final class C8708a implements Parcelable.Creator {
        /* renamed from: a */
        public final Promotion mo13314a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Promotion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Promotion[] mo13313b(int i) {
            return new Promotion[i];
        }
    }

    public Promotion() {
        this(null, null, null, null, false, null, null, null, null, null, false, null, null, 8191, null);
    }

    public Promotion(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "description");
        Intrinsics.isThisObjectNull(str3, "disclaimer");
        Intrinsics.isThisObjectNull(str4, "disclaimerTitle");
        Intrinsics.isThisObjectNull(str5, "price");
        Intrinsics.isThisObjectNull(str6, "badgeUrl");
        Intrinsics.isThisObjectNull(str7, "shortBadgeUrl");
        Intrinsics.isThisObjectNull(str8, "groupClass");
        Intrinsics.isThisObjectNull(str9, "groupLxPy");
        Intrinsics.isThisObjectNull(str10, "endDate");
        Intrinsics.isThisObjectNull(str11, "code");
        this.f22617w = str;
        this.f22618x = str2;
        this.f22619y = str3;
        this.f22620z = str4;
        this.f22608A = z;
        this.f22609B = str5;
        this.f22610C = str6;
        this.f22611D = str7;
        this.f22612E = str8;
        this.f22613F = str9;
        this.f22614G = z2;
        this.f22615H = str10;
        this.f22616I = str11;
    }

    /* renamed from: a */
    public final String m14466a() {
        return this.f22610C;
    }

    /* renamed from: b */
    public final String m14465b() {
        return this.f22616I;
    }

    /* renamed from: c */
    public final String m14464c() {
        return this.f22618x;
    }

    /* renamed from: d */
    public final String m14463d() {
        return this.f22619y;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14462e() {
        return this.f22620z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Promotion) {
            Promotion promotion = (Promotion) obj;
            return Intrinsics.equals(this.f22617w, promotion.f22617w) && Intrinsics.equals(this.f22618x, promotion.f22618x) && Intrinsics.equals(this.f22619y, promotion.f22619y) && Intrinsics.equals(this.f22620z, promotion.f22620z) && this.f22608A == promotion.f22608A && Intrinsics.equals(this.f22609B, promotion.f22609B) && Intrinsics.equals(this.f22610C, promotion.f22610C) && Intrinsics.equals(this.f22611D, promotion.f22611D) && Intrinsics.equals(this.f22612E, promotion.f22612E) && Intrinsics.equals(this.f22613F, promotion.f22613F) && this.f22614G == promotion.f22614G && Intrinsics.equals(this.f22615H, promotion.f22615H) && Intrinsics.equals(this.f22616I, promotion.f22616I);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14461f() {
        return this.f22615H;
    }

    /* renamed from: h */
    public final String m14460h() {
        return this.f22612E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f22617w.hashCode() * 31) + this.f22618x.hashCode()) * 31) + this.f22619y.hashCode()) * 31) + this.f22620z.hashCode()) * 31;
        boolean z = this.f22608A;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((((hashCode + i) * 31) + this.f22609B.hashCode()) * 31) + this.f22610C.hashCode()) * 31) + this.f22611D.hashCode()) * 31) + this.f22612E.hashCode()) * 31) + this.f22613F.hashCode()) * 31;
        boolean z2 = this.f22614G;
        return ((((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f22615H.hashCode()) * 31) + this.f22616I.hashCode();
    }

    /* renamed from: i */
    public final String m14459i() {
        return this.f22613F;
    }

    /* renamed from: j */
    public final boolean m14458j() {
        return this.f22614G;
    }

    /* renamed from: k */
    public final String m14457k() {
        return this.f22609B;
    }

    /* renamed from: m */
    public final String m14456m() {
        return this.f22611D;
    }

    /* renamed from: n */
    public final boolean m14455n() {
        return this.f22608A;
    }

    /* renamed from: r */
    public final String m14454r() {
        return this.f22617w;
    }

    public String toString() {
        String str = this.f22617w;
        String str2 = this.f22618x;
        String str3 = this.f22619y;
        String str4 = this.f22620z;
        boolean z = this.f22608A;
        String str5 = this.f22609B;
        String str6 = this.f22610C;
        String str7 = this.f22611D;
        String str8 = this.f22612E;
        String str9 = this.f22613F;
        boolean z2 = this.f22614G;
        String str10 = this.f22615H;
        String str11 = this.f22616I;
        return "Promotion(title=" + str + ", description=" + str2 + ", disclaimer=" + str3 + ", disclaimerTitle=" + str4 + ", showDisclaimer=" + z + ", price=" + str5 + ", badgeUrl=" + str6 + ", shortBadgeUrl=" + str7 + ", groupClass=" + str8 + ", groupLxPy=" + str9 + ", lxPySpecial=" + z2 + ", endDate=" + str10 + ", code=" + str11 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22617w);
        parcel.writeString(this.f22618x);
        parcel.writeString(this.f22619y);
        parcel.writeString(this.f22620z);
        parcel.writeInt(this.f22608A ? 1 : 0);
        parcel.writeString(this.f22609B);
        parcel.writeString(this.f22610C);
        parcel.writeString(this.f22611D);
        parcel.writeString(this.f22612E);
        parcel.writeString(this.f22613F);
        parcel.writeInt(this.f22614G ? 1 : 0);
        parcel.writeString(this.f22615H);
        parcel.writeString(this.f22616I);
    }

    public /* synthetic */ Promotion(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, boolean z2, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 64) != 0 ? BuildConfig.VERSION_NAME : str6, (i & 128) != 0 ? BuildConfig.VERSION_NAME : str7, (i & 256) != 0 ? BuildConfig.VERSION_NAME : str8, (i & 512) != 0 ? BuildConfig.VERSION_NAME : str9, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? BuildConfig.VERSION_NAME : str10, (i & 4096) == 0 ? str11 : BuildConfig.VERSION_NAME);
    }
}
