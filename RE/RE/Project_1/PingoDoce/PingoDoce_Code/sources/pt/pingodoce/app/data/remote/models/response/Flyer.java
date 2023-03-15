package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.products.Category;

/* compiled from: Flyer.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Flyer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8779a();
    @InterfaceC4469e(name = "dateStart")

    /* renamed from: A */
    private final String f23139A;
    @InterfaceC4469e(name = "dateEnd")

    /* renamed from: B */
    private final String f23140B;
    @InterfaceC4469e(name = "description")

    /* renamed from: C */
    private final String f23141C;
    @InterfaceC4469e(name = "promotionId")

    /* renamed from: D */
    private final int f23142D;
    @InterfaceC4469e(name = "storeGroupId")

    /* renamed from: E */
    private final int f23143E;
    @InterfaceC4469e(name = "categories")

    /* renamed from: F */
    private final List f23144F;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f23145w;
    @InterfaceC4469e(name = "title")

    /* renamed from: x */
    private final String f23146x;
    @InterfaceC4469e(name = "image")

    /* renamed from: y */
    private final String f23147y;
    @InterfaceC4469e(name = "pdfUrl")

    /* renamed from: z */
    private final String f23148z;

    /* compiled from: Flyer.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Flyer$a */
    /* loaded from: classes2.dex */
    public static final class C8779a implements Parcelable.Creator {
        /* renamed from: a */
        public final Flyer mo13364a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            for (int i = 0; i != readInt4; i++) {
                arrayList.add(Category.CREATOR.createFromParcel(parcel));
            }
            return new Flyer(readInt, readString, readString2, readString3, readString4, readString5, readString6, readInt2, readInt3, arrayList);
        }

        /* renamed from: b */
        public final Flyer[] mo13363b(int i) {
            return new Flyer[i];
        }
    }

    public Flyer() {
        this(0, null, null, null, null, null, null, 0, 0, null, 1023, null);
    }

    public Flyer(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, List list) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str3, "pdfUrl");
        Intrinsics.isThisObjectNull(str4, "dateStart");
        Intrinsics.isThisObjectNull(str5, "dateEnd");
        Intrinsics.isThisObjectNull(str6, "description");
        Intrinsics.isThisObjectNull(list, "categories");
        this.f23145w = i;
        this.f23146x = str;
        this.f23147y = str2;
        this.f23148z = str3;
        this.f23139A = str4;
        this.f23140B = str5;
        this.f23141C = str6;
        this.f23142D = i2;
        this.f23143E = i3;
        this.f23144F = list;
    }

    /* renamed from: a */
    public final List m13842a() {
        return this.f23144F;
    }

    /* renamed from: b */
    public final String m13841b() {
        return this.f23140B;
    }

    /* renamed from: c */
    public final String m13840c() {
        return this.f23139A;
    }

    /* renamed from: d */
    public final String m13839d() {
        return this.f23141C;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m13838e() {
        return this.f23145w;
    }

    /* renamed from: f */
    public final String m13837f() {
        return this.f23147y;
    }

    /* renamed from: h */
    public final String m13836h() {
        return this.f23148z;
    }

    /* renamed from: i */
    public final int m13835i() {
        return this.f23142D;
    }

    /* renamed from: j */
    public final int m13834j() {
        return this.f23143E;
    }

    /* renamed from: k */
    public final String m13833k() {
        return this.f23146x;
    }

    /* renamed from: m */
    public final boolean m13832m() {
        return this.f23144F.isEmpty();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23145w);
        parcel.writeString(this.f23146x);
        parcel.writeString(this.f23147y);
        parcel.writeString(this.f23148z);
        parcel.writeString(this.f23139A);
        parcel.writeString(this.f23140B);
        parcel.writeString(this.f23141C);
        parcel.writeInt(this.f23142D);
        parcel.writeInt(this.f23143E);
        List<Category> list = this.f23144F;
        parcel.writeInt(list.size());
        for (Category category : list) {
            category.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ Flyer(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i4 & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i4 & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i4 & 64) == 0 ? str6 : BuildConfig.VERSION_NAME, (i4 & 128) != 0 ? -1 : i2, (i4 & 256) == 0 ? i3 : -1, (i4 & 512) != 0 ? C13780s.m197g() : list);
    }
}
