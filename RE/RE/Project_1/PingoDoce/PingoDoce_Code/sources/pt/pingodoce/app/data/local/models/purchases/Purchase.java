package pt.pingodoce.app.data.local.models.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import fm.C5579c;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p183jg.InterfaceC6457b;
import p183jg.InterfaceC6458c;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import sd.CharJVM;

/* compiled from: Purchase.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Purchase implements Parcelable, Comparable, InterfaceC6458c, InterfaceC6457b {
    public static final Parcelable.Creator CREATOR = new C8710a();
    @InterfaceC4469e(name = "transactionDate")

    /* renamed from: A */
    private final String f22632A;
    @InterfaceC4469e(name = "storeName")

    /* renamed from: B */
    private final String f22633B;
    @InterfaceC4469e(name = "total")

    /* renamed from: C */
    private final float f22634C;
    @InterfaceC4469e(name = "totalDiscount")

    /* renamed from: D */
    private final float f22635D;
    @InterfaceC4469e(name = "totalItems")

    /* renamed from: E */
    private final int f22636E;
    @InterfaceC4469e(name = "products")

    /* renamed from: F */
    private final List f22637F;
    @InterfaceC4469e(name = "benefitsLabel")

    /* renamed from: G */
    private final List f22638G;

    /* renamed from: H */
    private final InterfaceC13178g f22639H;
    @InterfaceC4469e(name = "transactionId")

    /* renamed from: w */
    private final String f22640w;
    @InterfaceC4469e(name = "idOperator")

    /* renamed from: x */
    private final String f22641x;
    @InterfaceC4469e(name = "idPos")

    /* renamed from: y */
    private final String f22642y;
    @InterfaceC4469e(name = "storeId")

    /* renamed from: z */
    private final String f22643z;

    /* compiled from: Purchase.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.purchases.Purchase$a */
    /* loaded from: classes2.dex */
    public static final class C8710a implements Parcelable.Creator {
        /* renamed from: a */
        public final Purchase createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(PurchaseProduct.CREATOR.createFromParcel(parcel));
            }
            return new Purchase(readString, readString2, readString3, readString4, readString5, readString6, readFloat, readFloat2, readInt, arrayList, parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final Purchase[] newArray(int i) {
            return new Purchase[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Purchase.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.purchases.Purchase$b */
    /* loaded from: classes2.dex */
    public static final class C8711b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C8711b f22644w = new C8711b();

        C8711b() {
            super(0);
        }

        /* renamed from: a */
        public final Locale mo42214q() {
            return Locale.getDefault();
        }
    }

    public Purchase() {
        this(null, null, null, null, null, null, 0.0f, 0.0f, 0, null, null, 2047, null);
    }

    public Purchase(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, int i, List list, List list2) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "idOperator");
        Intrinsics.isThisObjectNull(str3, "idPos");
        Intrinsics.isThisObjectNull(str4, "storeId");
        Intrinsics.isThisObjectNull(str5, "date");
        Intrinsics.isThisObjectNull(str6, "storeName");
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(list2, "benefitsLabelList");
        this.f22640w = str;
        this.f22641x = str2;
        this.f22642y = str3;
        this.f22643z = str4;
        this.f22632A = str5;
        this.f22633B = str6;
        this.f22634C = f;
        this.f22635D = f2;
        this.f22636E = i;
        this.f22637F = list;
        this.f22638G = list2;
        m1464a = LazyJVM.m1464a(C8711b.f22644w);
        this.f22639H = m1464a;
    }

    /* renamed from: A */
    public final String m14441A() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22634C)}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    /* renamed from: b */
    public int compareTo(Purchase purchase) {
        Intrinsics.isThisObjectNull(purchase, "other");
        if (new DateTime(this.f22632A).isBefore(new DateTime(purchase.f22632A))) {
            return -1;
        }
        return new DateTime(this.f22632A).isAfter(new DateTime(purchase.f22632A)) ? 1 : 0;
    }

    /* renamed from: c */
    public final List m14439c() {
        return this.f22638G;
    }

    /* renamed from: d */
    public final String m14438d() {
        return this.f22632A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final float m14437e() {
        return this.f22635D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Purchase) {
            Purchase purchase = (Purchase) obj;
            return Intrinsics.equals(this.f22640w, purchase.f22640w) && Intrinsics.equals(this.f22632A, purchase.f22632A);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14436f() {
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22635D)}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        return C5579c.m23715d(format, null, 1, null);
    }

    /* renamed from: h */
    public final String m14435h() {
        String print = DateTimeFormat.forPattern("dd MMMM, yyyy").print(DateTime.parse(this.f22632A));
        Intrinsics.checkIfNull(print, "forPattern(\"dd MMMM, yyy…int(DateTime.parse(date))");
        return print;
    }

    public int hashCode() {
        return (this.f22640w.hashCode() * 31) + this.f22632A.hashCode();
    }

    /* renamed from: i */
    public final String m14434i() {
        return this.f22640w;
    }

    /* renamed from: j */
    public final String m14433j() {
        return this.f22641x;
    }

    /* renamed from: k */
    public final String m14432k() {
        return this.f22642y;
    }

    /* renamed from: m */
    public final Locale m14431m() {
        Object value = this.f22639H.getValue();
        Intrinsics.checkIfNull(value, "<get-locale>(...)");
        return (Locale) value;
    }

    /* renamed from: n */
    public final String m14430n() {
        String print = DateTimeFormat.forPattern("MMMM").print(DateTime.parse(this.f22632A));
        Intrinsics.checkIfNull(print, "forPattern(\"MMMM\").print(DateTime.parse(date))");
        if (print.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = print.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? CharJVM.m9041d(charAt, m14431m()) : String.valueOf(charAt)));
            String substring = print.substring(1);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return print;
    }

    /* renamed from: r */
    public final String m14429r() {
        String print = DateTimeFormat.forPattern("MMMM yyyy").print(DateTime.parse(this.f22632A));
        Intrinsics.checkIfNull(print, "forPattern(\"MMMM yyyy\").…int(DateTime.parse(date))");
        if (print.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = print.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? CharJVM.m9041d(charAt, m14431m()) : String.valueOf(charAt)));
            String substring = print.substring(1);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return print;
    }

    /* renamed from: s */
    public final int m14428s() {
        return this.f22636E;
    }

    /* renamed from: t */
    public final List m14427t() {
        return this.f22637F;
    }

    public String toString() {
        String str = this.f22640w;
        String str2 = this.f22641x;
        String str3 = this.f22642y;
        String str4 = this.f22643z;
        String str5 = this.f22632A;
        String str6 = this.f22633B;
        float f = this.f22634C;
        float f2 = this.f22635D;
        int i = this.f22636E;
        List list = this.f22637F;
        List list2 = this.f22638G;
        return "Purchase(id=" + str + ", idOperator=" + str2 + ", idPos=" + str3 + ", storeId=" + str4 + ", date=" + str5 + ", storeName=" + str6 + ", total=" + f + ", discount=" + f2 + ", productCount=" + i + ", products=" + list + ", benefitsLabelList=" + list2 + ")";
    }

    /* renamed from: v */
    public final String m14426v() {
        String print = DateTimeFormat.forPattern("MMM dd").print(DateTime.parse(this.f22632A));
        Intrinsics.checkIfNull(print, "forPattern(\"MMM dd\").print(DateTime.parse(date))");
        if (print.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = print.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? CharJVM.m9041d(charAt, m14431m()) : String.valueOf(charAt)));
            String substring = print.substring(1);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return print;
    }

    /* renamed from: w */
    public final String m14425w() {
        return this.f22643z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22640w);
        parcel.writeString(this.f22641x);
        parcel.writeString(this.f22642y);
        parcel.writeString(this.f22643z);
        parcel.writeString(this.f22632A);
        parcel.writeString(this.f22633B);
        parcel.writeFloat(this.f22634C);
        parcel.writeFloat(this.f22635D);
        parcel.writeInt(this.f22636E);
        List<PurchaseProduct> list = this.f22637F;
        parcel.writeInt(list.size());
        for (PurchaseProduct purchaseProduct : list) {
            purchaseProduct.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f22638G);
    }

    /* renamed from: y */
    public final String m14424y() {
        return this.f22633B;
    }

    /* renamed from: z */
    public final float m14423z() {
        return this.f22634C;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Purchase(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, float r18, float r19, int r20, java.util.List r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r11 = this;
            r0 = r23
            r1 = r0 & 1
            if (r1 == 0) goto L14
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            p181jd.Intrinsics.checkIfNull(r1, r2)
            goto L15
        L14:
            r1 = r12
        L15:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r13
        L1e:
            r4 = r0 & 4
            if (r4 == 0) goto L24
            r4 = r3
            goto L25
        L24:
            r4 = r14
        L25:
            r5 = r0 & 8
            if (r5 == 0) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = r15
        L2c:
            r6 = r0 & 16
            if (r6 == 0) goto L32
            r6 = r3
            goto L34
        L32:
            r6 = r16
        L34:
            r7 = r0 & 32
            if (r7 == 0) goto L39
            goto L3b
        L39:
            r3 = r17
        L3b:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L42
            r7 = r8
            goto L44
        L42:
            r7 = r18
        L44:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L49
            goto L4b
        L49:
            r8 = r19
        L4b:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L51
            r9 = 0
            goto L53
        L51:
            r9 = r20
        L53:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L5c
            java.util.List r10 = p489zc.C13777q.m237g()
            goto L5e
        L5c:
            r10 = r21
        L5e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L67
            java.util.List r0 = p489zc.C13777q.m237g()
            goto L69
        L67:
            r0 = r22
        L69:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r3
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.data.local.models.purchases.Purchase.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, float, int, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
