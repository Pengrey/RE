package pt.pingodoce.app.data.local.models.takeaway;

import android.os.Parcel;
import android.os.Parcelable;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: TakeAwayOrder.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8723a();
    @InterfaceC4469e(name = "ownerEmail")

    /* renamed from: A */
    private final String f22760A;
    @InterfaceC4469e(name = "storeName")

    /* renamed from: B */
    private final String f22761B;
    @InterfaceC4469e(name = "storeAddress")

    /* renamed from: C */
    private final String f22762C;
    @InterfaceC4469e(name = "storeId")

    /* renamed from: D */
    private final int f22763D;
    @InterfaceC4469e(name = "pickupDate")

    /* renamed from: E */
    private final String f22764E;
    @InterfaceC4469e(name = "total")

    /* renamed from: F */
    private final String f22765F;
    @InterfaceC4469e(name = "disclaimer")

    /* renamed from: G */
    private final String f22766G;
    @InterfaceC4469e(name = "cancellable")

    /* renamed from: H */
    private final boolean f22767H;
    @InterfaceC4469e(name = "orderTypeCode")

    /* renamed from: I */
    private final String f22768I;
    @InterfaceC4469e(name = "orderTypeLabel")

    /* renamed from: J */
    private final String f22769J;

    /* renamed from: K */
    private final DateTimeFormatter f22770K;

    /* renamed from: L */
    private final DateTimeFormatter f22771L;

    /* renamed from: M */
    private final DateTimeFormatter f22772M;
    @InterfaceC4469e(name = "number")

    /* renamed from: w */
    private final String f22773w;
    @InterfaceC4469e(name = "products")

    /* renamed from: x */
    private final List f22774x;
    @InterfaceC4469e(name = "ownerName")

    /* renamed from: y */
    private final String f22775y;
    @InterfaceC4469e(name = "ownerPhone")

    /* renamed from: z */
    private final String f22776z;

    /* compiled from: TakeAwayOrder.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder$a */
    /* loaded from: classes2.dex */
    public static final class C8723a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayOrder createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TakeAwayProduct.CREATOR.createFromParcel(parcel));
            }
            return new TakeAwayOrder(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final TakeAwayOrder[] newArray(int i) {
            return new TakeAwayOrder[i];
        }
    }

    public TakeAwayOrder() {
        this(null, null, null, null, null, null, null, 0, null, null, null, false, null, null, 16383, null);
    }

    public TakeAwayOrder(String str, List list, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, boolean z, String str10, String str11) {
        Intrinsics.isThisObjectNull(str, "number");
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(str2, "ownerName");
        Intrinsics.isThisObjectNull(str3, "ownerPhone");
        Intrinsics.isThisObjectNull(str4, "ownerEmail");
        Intrinsics.isThisObjectNull(str5, "storeName");
        Intrinsics.isThisObjectNull(str6, "storeAddress");
        Intrinsics.isThisObjectNull(str7, "pickupDate");
        Intrinsics.isThisObjectNull(str8, "total");
        Intrinsics.isThisObjectNull(str9, "disclaimer");
        Intrinsics.isThisObjectNull(str10, "orderTypeCode");
        Intrinsics.isThisObjectNull(str11, "orderTypeLabel");
        this.f22773w = str;
        this.f22774x = list;
        this.f22775y = str2;
        this.f22776z = str3;
        this.f22760A = str4;
        this.f22761B = str5;
        this.f22762C = str6;
        this.f22763D = i;
        this.f22764E = str7;
        this.f22765F = str8;
        this.f22766G = str9;
        this.f22767H = z;
        this.f22768I = str10;
        this.f22769J = str11;
        this.f22770K = DateTimeFormat.forPattern("EEE dd MMMM HH:mm").withLocale(new Locale("pt"));
        this.f22771L = DateTimeFormat.forPattern("EEE dd MMMM").withLocale(new Locale("pt"));
        this.f22772M = DateTimeFormat.forPattern("HH:mm");
    }

    /* renamed from: a */
    public final boolean m14285a() {
        return this.f22767H;
    }

    /* renamed from: b */
    public final String m14284b() {
        return this.f22766G;
    }

    /* renamed from: c */
    public final String m14283c() {
        return this.f22773w;
    }

    /* renamed from: d */
    public final String m14282d() {
        return this.f22768I;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14281e() {
        return this.f22769J;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayOrder) {
            TakeAwayOrder takeAwayOrder = (TakeAwayOrder) obj;
            return Intrinsics.equals(this.f22773w, takeAwayOrder.f22773w) && Intrinsics.equals(this.f22774x, takeAwayOrder.f22774x) && Intrinsics.equals(this.f22775y, takeAwayOrder.f22775y) && Intrinsics.equals(this.f22776z, takeAwayOrder.f22776z) && Intrinsics.equals(this.f22760A, takeAwayOrder.f22760A) && Intrinsics.equals(this.f22761B, takeAwayOrder.f22761B) && Intrinsics.equals(this.f22762C, takeAwayOrder.f22762C) && this.f22763D == takeAwayOrder.f22763D && Intrinsics.equals(this.f22764E, takeAwayOrder.f22764E) && Intrinsics.equals(this.f22765F, takeAwayOrder.f22765F) && Intrinsics.equals(this.f22766G, takeAwayOrder.f22766G) && this.f22767H == takeAwayOrder.f22767H && Intrinsics.equals(this.f22768I, takeAwayOrder.f22768I) && Intrinsics.equals(this.f22769J, takeAwayOrder.f22769J);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14280f() {
        return this.f22760A;
    }

    /* renamed from: h */
    public final String m14279h() {
        return this.f22775y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f22773w.hashCode() * 31) + this.f22774x.hashCode()) * 31) + this.f22775y.hashCode()) * 31) + this.f22776z.hashCode()) * 31) + this.f22760A.hashCode()) * 31) + this.f22761B.hashCode()) * 31) + this.f22762C.hashCode()) * 31) + Integer.hashCode(this.f22763D)) * 31) + this.f22764E.hashCode()) * 31) + this.f22765F.hashCode()) * 31) + this.f22766G.hashCode()) * 31;
        boolean z = this.f22767H;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.f22768I.hashCode()) * 31) + this.f22769J.hashCode();
    }

    /* renamed from: i */
    public final String m14278i() {
        return this.f22776z;
    }

    /* renamed from: j */
    public final String m14277j() {
        return this.f22764E;
    }

    /* renamed from: k */
    public final List m14276k() {
        return this.f22774x;
    }

    /* renamed from: m */
    public final String m14275m() {
        return this.f22762C;
    }

    /* renamed from: n */
    public final int m14274n() {
        return this.f22763D;
    }

    /* renamed from: r */
    public final String m14273r() {
        return this.f22761B;
    }

    /* renamed from: s */
    public final String m14272s() {
        return this.f22765F;
    }

    /* renamed from: t */
    public final String m14271t() {
        if (this.f22764E.length() > 0) {
            String print = this.f22771L.print(DateTime.parse(this.f22764E));
            Intrinsics.checkIfNull(print, "dayFormat.print(DateTime.parse(pickupDate))");
            return UtilsExtensions.m35170b(print);
        }
        return BuildConfig.VERSION_NAME;
    }

    public String toString() {
        String str = this.f22773w;
        List list = this.f22774x;
        String str2 = this.f22775y;
        String str3 = this.f22776z;
        String str4 = this.f22760A;
        String str5 = this.f22761B;
        String str6 = this.f22762C;
        int i = this.f22763D;
        String str7 = this.f22764E;
        String str8 = this.f22765F;
        String str9 = this.f22766G;
        boolean z = this.f22767H;
        String str10 = this.f22768I;
        String str11 = this.f22769J;
        return "TakeAwayOrder(number=" + str + ", products=" + list + ", ownerName=" + str2 + ", ownerPhone=" + str3 + ", ownerEmail=" + str4 + ", storeName=" + str5 + ", storeAddress=" + str6 + ", storeId=" + i + ", pickupDate=" + str7 + ", total=" + str8 + ", disclaimer=" + str9 + ", cancellable=" + z + ", orderTypeCode=" + str10 + ", orderTypeLabel=" + str11 + ")";
    }

    /* renamed from: v */
    public final String m14270v() {
        return this.f22764E.length() > 0 ? this.f22772M.print(DateTime.parse(this.f22764E)) : BuildConfig.VERSION_NAME;
    }

    /* renamed from: w */
    public final String m14269w() {
        if (this.f22764E.length() > 0) {
            String print = this.f22770K.print(DateTime.parse(this.f22764E));
            Intrinsics.checkIfNull(print, "scheduleFormat.print(DateTime.parse(pickupDate))");
            return UtilsExtensions.m35170b(print);
        }
        return BuildConfig.VERSION_NAME;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22773w);
        List<TakeAwayProduct> list = this.f22774x;
        parcel.writeInt(list.size());
        for (TakeAwayProduct takeAwayProduct : list) {
            takeAwayProduct.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f22775y);
        parcel.writeString(this.f22776z);
        parcel.writeString(this.f22760A);
        parcel.writeString(this.f22761B);
        parcel.writeString(this.f22762C);
        parcel.writeInt(this.f22763D);
        parcel.writeString(this.f22764E);
        parcel.writeString(this.f22765F);
        parcel.writeString(this.f22766G);
        parcel.writeInt(this.f22767H ? 1 : 0);
        parcel.writeString(this.f22768I);
        parcel.writeString(this.f22769J);
    }

    public /* synthetic */ TakeAwayOrder(String str, List list, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, boolean z, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 2) != 0 ? C13780s.m197g() : list, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i2 & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i2 & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i2 & 64) != 0 ? BuildConfig.VERSION_NAME : str6, (i2 & 128) != 0 ? -1 : i, (i2 & 256) != 0 ? BuildConfig.VERSION_NAME : str7, (i2 & 512) != 0 ? BuildConfig.VERSION_NAME : str8, (i2 & 1024) != 0 ? BuildConfig.VERSION_NAME : str9, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? BuildConfig.VERSION_NAME : str10, (i2 & 8192) == 0 ? str11 : BuildConfig.VERSION_NAME);
    }
}
