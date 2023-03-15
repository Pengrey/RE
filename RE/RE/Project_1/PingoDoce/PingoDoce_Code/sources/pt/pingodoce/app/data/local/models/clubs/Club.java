package pt.pingodoce.app.data.local.models.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: Club.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Club implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8686a();

    /* renamed from: A */
    private final String f22456A;

    /* renamed from: B */
    private final String f22457B;

    /* renamed from: C */
    private final String f22458C;

    /* renamed from: D */
    private final String f22459D;

    /* renamed from: E */
    private final String f22460E;

    /* renamed from: F */
    private final String f22461F;

    /* renamed from: G */
    private final String f22462G;

    /* renamed from: H */
    private final String f22463H;

    /* renamed from: I */
    private final boolean f22464I;

    /* renamed from: J */
    private final List f22465J;

    /* renamed from: K */
    private ClubData f22466K;

    /* renamed from: L */
    private final String f22467L;

    /* renamed from: w */
    private final EnumC8691a f22468w;

    /* renamed from: x */
    private final String f22469x;

    /* renamed from: y */
    private final String f22470y;

    /* renamed from: z */
    private final String f22471z;

    /* compiled from: Club.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.clubs.Club$a */
    /* loaded from: classes2.dex */
    public static final class C8686a implements Parcelable.Creator {
        /* renamed from: a */
        public final Club mo13494a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            EnumC8691a valueOf = EnumC8691a.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            boolean z2 = z;
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                arrayList.add(FormField.CREATOR.createFromParcel(parcel));
                i++;
                readInt = readInt;
            }
            return new Club(valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, z2, arrayList, (ClubData) parcel.readParcelable(Club.class.getClassLoader()), parcel.readString());
        }

        /* renamed from: b */
        public final Club[] mo13493b(int i) {
            return new Club[i];
        }
    }

    public Club() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 65535, null);
    }

    public Club(EnumC8691a enumC8691a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, List list, ClubData clubData, String str12) {
        Intrinsics.isThisObjectNull(enumC8691a, "clubType");
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "code");
        Intrinsics.isThisObjectNull(str3, "title");
        Intrinsics.isThisObjectNull(str4, "name");
        Intrinsics.isThisObjectNull(str5, "description");
        Intrinsics.isThisObjectNull(str6, "imageUrl");
        Intrinsics.isThisObjectNull(str7, "startDate");
        Intrinsics.isThisObjectNull(str8, "endDate");
        Intrinsics.isThisObjectNull(str9, "requestDate");
        Intrinsics.isThisObjectNull(str10, "latestTerms");
        Intrinsics.isThisObjectNull(str11, "termsUrl");
        Intrinsics.isThisObjectNull(list, "formFields");
        Intrinsics.isThisObjectNull(clubData, "data");
        Intrinsics.isThisObjectNull(str12, "agreedTermsVersion");
        this.f22468w = enumC8691a;
        this.f22469x = str;
        this.f22470y = str2;
        this.f22471z = str3;
        this.f22456A = str4;
        this.f22457B = str5;
        this.f22458C = str6;
        this.f22459D = str7;
        this.f22460E = str8;
        this.f22461F = str9;
        this.f22462G = str10;
        this.f22463H = str11;
        this.f22464I = z;
        this.f22465J = list;
        this.f22466K = clubData;
        this.f22467L = str12;
    }

    /* renamed from: b */
    public static /* synthetic */ Club m14655b(Club club, EnumC8691a enumC8691a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, List list, ClubData clubData, String str12, int i, Object obj) {
        return club.m14656a((i & 1) != 0 ? club.f22468w : enumC8691a, (i & 2) != 0 ? club.m14646m() : str, (i & 4) != 0 ? club.f22470y : str2, (i & 8) != 0 ? club.f22471z : str3, (i & 16) != 0 ? club.f22456A : str4, (i & 32) != 0 ? club.f22457B : str5, (i & 64) != 0 ? club.f22458C : str6, (i & 128) != 0 ? club.f22459D : str7, (i & 256) != 0 ? club.f22460E : str8, (i & 512) != 0 ? club.f22461F : str9, (i & 1024) != 0 ? club.f22462G : str10, (i & 2048) != 0 ? club.f22463H : str11, (i & 4096) != 0 ? club.f22464I : z, (i & 8192) != 0 ? club.f22465J : list, (i & 16384) != 0 ? club.f22466K : clubData, (i & 32768) != 0 ? club.f22467L : str12);
    }

    /* renamed from: a */
    public final Club m14656a(EnumC8691a enumC8691a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, List list, ClubData clubData, String str12) {
        Intrinsics.isThisObjectNull(enumC8691a, "clubType");
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "code");
        Intrinsics.isThisObjectNull(str3, "title");
        Intrinsics.isThisObjectNull(str4, "name");
        Intrinsics.isThisObjectNull(str5, "description");
        Intrinsics.isThisObjectNull(str6, "imageUrl");
        Intrinsics.isThisObjectNull(str7, "startDate");
        Intrinsics.isThisObjectNull(str8, "endDate");
        Intrinsics.isThisObjectNull(str9, "requestDate");
        Intrinsics.isThisObjectNull(str10, "latestTerms");
        Intrinsics.isThisObjectNull(str11, "termsUrl");
        Intrinsics.isThisObjectNull(list, "formFields");
        Intrinsics.isThisObjectNull(clubData, "data");
        Intrinsics.isThisObjectNull(str12, "agreedTermsVersion");
        return new Club(enumC8691a, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, list, clubData, str12);
    }

    /* renamed from: c */
    public final String m14654c() {
        return this.f22467L;
    }

    /* renamed from: d */
    public final EnumC8691a m14653d() {
        return this.f22468w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14652e() {
        return this.f22470y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Club) {
            Club club = (Club) obj;
            return this.f22468w == club.f22468w && Intrinsics.equals(m14646m(), club.m14646m()) && Intrinsics.equals(this.f22470y, club.f22470y) && Intrinsics.equals(this.f22471z, club.f22471z) && Intrinsics.equals(this.f22456A, club.f22456A) && Intrinsics.equals(this.f22457B, club.f22457B) && Intrinsics.equals(this.f22458C, club.f22458C) && Intrinsics.equals(this.f22459D, club.f22459D) && Intrinsics.equals(this.f22460E, club.f22460E) && Intrinsics.equals(this.f22461F, club.f22461F) && Intrinsics.equals(this.f22462G, club.f22462G) && Intrinsics.equals(this.f22463H, club.f22463H) && this.f22464I == club.f22464I && Intrinsics.equals(this.f22465J, club.f22465J) && Intrinsics.equals(this.f22466K, club.f22466K) && Intrinsics.equals(this.f22467L, club.f22467L);
        }
        return false;
    }

    /* renamed from: f */
    public final ClubData m14651f() {
        return this.f22466K;
    }

    /* renamed from: h */
    public final String m14650h() {
        return this.f22457B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f22468w.hashCode() * 31) + m14646m().hashCode()) * 31) + this.f22470y.hashCode()) * 31) + this.f22471z.hashCode()) * 31) + this.f22456A.hashCode()) * 31) + this.f22457B.hashCode()) * 31) + this.f22458C.hashCode()) * 31) + this.f22459D.hashCode()) * 31) + this.f22460E.hashCode()) * 31) + this.f22461F.hashCode()) * 31) + this.f22462G.hashCode()) * 31) + this.f22463H.hashCode()) * 31;
        boolean z = this.f22464I;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + this.f22465J.hashCode()) * 31) + this.f22466K.hashCode()) * 31) + this.f22467L.hashCode();
    }

    /* renamed from: i */
    public final String m14649i() {
        return this.f22460E;
    }

    /* renamed from: j */
    public final List m14648j() {
        return this.f22465J;
    }

    /* renamed from: k */
    public final String m14647k() {
        return DateTimeFormat.forPattern("dd/MM/yyyy").print(DateTime.parse(this.f22461F));
    }

    /* renamed from: m */
    public String m14646m() {
        return this.f22469x;
    }

    /* renamed from: n */
    public final String m14645n() {
        return this.f22458C;
    }

    /* renamed from: r */
    public final String m14644r() {
        return this.f22462G;
    }

    /* renamed from: s */
    public final String m14643s() {
        return this.f22456A;
    }

    /* renamed from: t */
    public final String m14642t() {
        return this.f22461F;
    }

    public String toString() {
        EnumC8691a enumC8691a = this.f22468w;
        String m14646m = m14646m();
        String str = this.f22470y;
        String str2 = this.f22471z;
        String str3 = this.f22456A;
        String str4 = this.f22457B;
        String str5 = this.f22458C;
        String str6 = this.f22459D;
        String str7 = this.f22460E;
        String str8 = this.f22461F;
        String str9 = this.f22462G;
        String str10 = this.f22463H;
        boolean z = this.f22464I;
        List list = this.f22465J;
        ClubData clubData = this.f22466K;
        String str11 = this.f22467L;
        return "Club(clubType=" + enumC8691a + ", id=" + m14646m + ", code=" + str + ", title=" + str2 + ", name=" + str3 + ", description=" + str4 + ", imageUrl=" + str5 + ", startDate=" + str6 + ", endDate=" + str7 + ", requestDate=" + str8 + ", latestTerms=" + str9 + ", termsUrl=" + str10 + ", subscribed=" + z + ", formFields=" + list + ", data=" + clubData + ", agreedTermsVersion=" + str11 + ")";
    }

    /* renamed from: v */
    public final String m14641v() {
        return this.f22459D;
    }

    /* renamed from: w */
    public final boolean m14640w() {
        return this.f22464I;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22468w.name());
        parcel.writeString(this.f22469x);
        parcel.writeString(this.f22470y);
        parcel.writeString(this.f22471z);
        parcel.writeString(this.f22456A);
        parcel.writeString(this.f22457B);
        parcel.writeString(this.f22458C);
        parcel.writeString(this.f22459D);
        parcel.writeString(this.f22460E);
        parcel.writeString(this.f22461F);
        parcel.writeString(this.f22462G);
        parcel.writeString(this.f22463H);
        parcel.writeInt(this.f22464I ? 1 : 0);
        List<FormField> list = this.f22465J;
        parcel.writeInt(list.size());
        for (FormField formField : list) {
            formField.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f22466K, i);
        parcel.writeString(this.f22467L);
    }

    /* renamed from: y */
    public final String m14639y() {
        return this.f22463H;
    }

    /* renamed from: z */
    public final String m14638z() {
        return this.f22471z;
    }

    public /* synthetic */ Club(EnumC8691a enumC8691a, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, List list, ClubData clubData, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC8691a.Undefined : enumC8691a, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 64) != 0 ? BuildConfig.VERSION_NAME : str6, (i & 128) != 0 ? BuildConfig.VERSION_NAME : str7, (i & 256) != 0 ? BuildConfig.VERSION_NAME : str8, (i & 512) != 0 ? BuildConfig.VERSION_NAME : str9, (i & 1024) != 0 ? BuildConfig.VERSION_NAME : str10, (i & 2048) != 0 ? BuildConfig.VERSION_NAME : str11, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? C13780s.m197g() : list, (i & 16384) != 0 ? new ClubData(null, null, null, null, 15, null) : clubData, (i & 32768) != 0 ? BuildConfig.VERSION_NAME : str12);
    }
}
