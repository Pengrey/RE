package pt.pingodoce.app.data.remote.models.request.parameters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import tg.InterfaceC10619b;

/* compiled from: SearchCatalogParameters.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SearchCatalogParameters implements Parcelable, InterfaceC10619b {
    public static final Parcelable.Creator CREATOR = new C8762a();
    @InterfaceC4469e(name = "promoGroupLxPy")

    /* renamed from: A */
    private final String f22993A;
    @InterfaceC4469e(name = "hasPromo")

    /* renamed from: B */
    private final Boolean f22994B;
    @InterfaceC4469e(name = "categoryId")

    /* renamed from: C */
    private final Integer f22995C;
    @InterfaceC4469e(name = "includeCategories")

    /* renamed from: D */
    private final boolean f22996D;
    @InterfaceC4469e(name = "flyerId")

    /* renamed from: E */
    private final Integer f22997E;
    @InterfaceC4469e(name = "text")

    /* renamed from: F */
    private final String f22998F;
    @InterfaceC4469e(name = "tagIds")

    /* renamed from: G */
    private final List f22999G;
    @InterfaceC4469e(name = "brandIds")

    /* renamed from: H */
    private final List f23000H;
    @InterfaceC4469e(name = "sortCriteria")

    /* renamed from: I */
    private final String f23001I;
    @InterfaceC4469e(name = "excludeIds")

    /* renamed from: J */
    private final List f23002J;
    @InterfaceC4469e(name = "productKeys")

    /* renamed from: K */
    private final List f23003K;
    @InterfaceC4469e(name = "page")

    /* renamed from: L */
    private final int f23004L;
    @InterfaceC4469e(name = "pageSize")

    /* renamed from: M */
    private final int f23005M;
    @InterfaceC4469e(name = "userHasLoyaltyCardApproved")

    /* renamed from: N */
    private final boolean f23006N;
    @InterfaceC4469e(name = "storeId")

    /* renamed from: w */
    private final int f23007w;
    @InterfaceC4469e(name = "barcode")

    /* renamed from: x */
    private final Long f23008x;
    @InterfaceC4469e(name = "ownBrand")

    /* renamed from: y */
    private final Boolean f23009y;
    @InterfaceC4469e(name = "promoGroupClass")

    /* renamed from: z */
    private final String f23010z;

    /* compiled from: SearchCatalogParameters.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters$a */
    /* loaded from: classes2.dex */
    public static final class C8762a implements Parcelable.Creator {
        /* renamed from: a */
        public final SearchCatalogParameters mo12838a(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = parcel.readInt() != 0;
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i2 = 0; i2 != readInt3; i2++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList3;
            }
            return new SearchCatalogParameters(readInt, valueOf, valueOf2, readString, readString2, valueOf3, valueOf4, z, valueOf5, readString3, arrayList, arrayList2, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final SearchCatalogParameters[] mo12837b(int i) {
            return new SearchCatalogParameters[i];
        }
    }

    public SearchCatalogParameters() {
        this(0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262143, null);
    }

    public SearchCatalogParameters(int i, Long l, Boolean bool, String str, String str2, Boolean bool2, Integer num, boolean z, Integer num2, String str3, List list, List list2, String str4, List list3, List list4, int i2, int i3, boolean z2) {
        Intrinsics.isThisObjectNull(list3, "excludeIds");
        Intrinsics.isThisObjectNull(list4, "productKeys");
        this.f23007w = i;
        this.f23008x = l;
        this.f23009y = bool;
        this.f23010z = str;
        this.f22993A = str2;
        this.f22994B = bool2;
        this.f22995C = num;
        this.f22996D = z;
        this.f22997E = num2;
        this.f22998F = str3;
        this.f22999G = list;
        this.f23000H = list2;
        this.f23001I = str4;
        this.f23002J = list3;
        this.f23003K = list4;
        this.f23004L = i2;
        this.f23005M = i3;
        this.f23006N = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ SearchCatalogParameters m13995b(SearchCatalogParameters searchCatalogParameters, int i, Long l, Boolean bool, String str, String str2, Boolean bool2, Integer num, boolean z, Integer num2, String str3, List list, List list2, String str4, List list3, List list4, int i2, int i3, boolean z2, int i4, Object obj) {
        return searchCatalogParameters.m13996a((i4 & 1) != 0 ? searchCatalogParameters.f23007w : i, (i4 & 2) != 0 ? searchCatalogParameters.f23008x : l, (i4 & 4) != 0 ? searchCatalogParameters.f23009y : bool, (i4 & 8) != 0 ? searchCatalogParameters.f23010z : str, (i4 & 16) != 0 ? searchCatalogParameters.f22993A : str2, (i4 & 32) != 0 ? searchCatalogParameters.f22994B : bool2, (i4 & 64) != 0 ? searchCatalogParameters.f22995C : num, (i4 & 128) != 0 ? searchCatalogParameters.f22996D : z, (i4 & 256) != 0 ? searchCatalogParameters.f22997E : num2, (i4 & 512) != 0 ? searchCatalogParameters.f22998F : str3, (i4 & 1024) != 0 ? searchCatalogParameters.f22999G : list, (i4 & 2048) != 0 ? searchCatalogParameters.f23000H : list2, (i4 & 4096) != 0 ? searchCatalogParameters.f23001I : str4, (i4 & 8192) != 0 ? searchCatalogParameters.f23002J : list3, (i4 & 16384) != 0 ? searchCatalogParameters.f23003K : list4, (i4 & 32768) != 0 ? searchCatalogParameters.f23004L : i2, (i4 & 65536) != 0 ? searchCatalogParameters.f23005M : i3, (i4 & 131072) != 0 ? searchCatalogParameters.f23006N : z2);
    }

    /* renamed from: A */
    public final boolean m13998A() {
        return this.f23006N;
    }

    /* renamed from: D */
    public final boolean m13997D() {
        String str = this.f22998F;
        if ((str == null || str.length() == 0) && this.f23008x == null && this.f22995C == null && this.f22997E == null) {
            List list = this.f22999G;
            if (list == null || list.isEmpty()) {
                List list2 = this.f23000H;
                if ((list2 == null || list2.isEmpty()) && this.f23003K.isEmpty() && this.f23002J.isEmpty()) {
                    String str2 = this.f22993A;
                    return str2 == null || str2.length() == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final SearchCatalogParameters m13996a(int i, Long l, Boolean bool, String str, String str2, Boolean bool2, Integer num, boolean z, Integer num2, String str3, List list, List list2, String str4, List list3, List list4, int i2, int i3, boolean z2) {
        Intrinsics.isThisObjectNull(list3, "excludeIds");
        Intrinsics.isThisObjectNull(list4, "productKeys");
        return new SearchCatalogParameters(i, l, bool, str, str2, bool2, num, z, num2, str3, list, list2, str4, list3, list4, i2, i3, z2);
    }

    /* renamed from: c */
    public final Long m13994c() {
        return this.f23008x;
    }

    /* renamed from: d */
    public final List m13993d() {
        return this.f23000H;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer m13992e() {
        return this.f22995C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchCatalogParameters) {
            SearchCatalogParameters searchCatalogParameters = (SearchCatalogParameters) obj;
            return this.f23007w == searchCatalogParameters.f23007w && Intrinsics.equals(this.f23008x, searchCatalogParameters.f23008x) && Intrinsics.equals(this.f23009y, searchCatalogParameters.f23009y) && Intrinsics.equals(this.f23010z, searchCatalogParameters.f23010z) && Intrinsics.equals(this.f22993A, searchCatalogParameters.f22993A) && Intrinsics.equals(this.f22994B, searchCatalogParameters.f22994B) && Intrinsics.equals(this.f22995C, searchCatalogParameters.f22995C) && this.f22996D == searchCatalogParameters.f22996D && Intrinsics.equals(this.f22997E, searchCatalogParameters.f22997E) && Intrinsics.equals(this.f22998F, searchCatalogParameters.f22998F) && Intrinsics.equals(this.f22999G, searchCatalogParameters.f22999G) && Intrinsics.equals(this.f23000H, searchCatalogParameters.f23000H) && Intrinsics.equals(this.f23001I, searchCatalogParameters.f23001I) && Intrinsics.equals(this.f23002J, searchCatalogParameters.f23002J) && Intrinsics.equals(this.f23003K, searchCatalogParameters.f23003K) && this.f23004L == searchCatalogParameters.f23004L && this.f23005M == searchCatalogParameters.f23005M && this.f23006N == searchCatalogParameters.f23006N;
        }
        return false;
    }

    /* renamed from: f */
    public final List m13991f() {
        return this.f23002J;
    }

    public String getKey() {
        return InterfaceC10619b.C10620a.m7484a(this);
    }

    /* renamed from: h */
    public final Integer m13990h() {
        return this.f22997E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23007w) * 31;
        Long l = this.f23008x;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f23009y;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f23010z;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22993A;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.f22994B;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f22995C;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f22996D;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        Integer num2 = this.f22997E;
        int hashCode8 = (i2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f22998F;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f22999G;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f23000H;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.f23001I;
        int hashCode12 = (((((((((hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f23002J.hashCode()) * 31) + this.f23003K.hashCode()) * 31) + Integer.hashCode(this.f23004L)) * 31) + Integer.hashCode(this.f23005M)) * 31;
        boolean z2 = this.f23006N;
        return hashCode12 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final Boolean m13989i() {
        return this.f22994B;
    }

    /* renamed from: j */
    public final boolean m13988j() {
        return this.f22996D;
    }

    /* renamed from: k */
    public final Boolean m13987k() {
        return this.f23009y;
    }

    /* renamed from: m */
    public final int m13986m() {
        return this.f23004L;
    }

    /* renamed from: n */
    public final int m13985n() {
        return this.f23005M;
    }

    /* renamed from: r */
    public final List m13984r() {
        return this.f23003K;
    }

    /* renamed from: s */
    public final String m13983s() {
        return this.f23010z;
    }

    /* renamed from: t */
    public final String m13982t() {
        return this.f22993A;
    }

    public String toString() {
        int i = this.f23007w;
        Long l = this.f23008x;
        Boolean bool = this.f23009y;
        String str = this.f23010z;
        String str2 = this.f22993A;
        Boolean bool2 = this.f22994B;
        Integer num = this.f22995C;
        boolean z = this.f22996D;
        Integer num2 = this.f22997E;
        String str3 = this.f22998F;
        List list = this.f22999G;
        List list2 = this.f23000H;
        String str4 = this.f23001I;
        List list3 = this.f23002J;
        List list4 = this.f23003K;
        int i2 = this.f23004L;
        int i3 = this.f23005M;
        boolean z2 = this.f23006N;
        return "SearchCatalogParameters(storeId=" + i + ", barcode=" + l + ", ownBrand=" + bool + ", promoGroupClass=" + str + ", promoGroupLxPy=" + str2 + ", hasPromo=" + bool2 + ", categoryId=" + num + ", includeCategories=" + z + ", flyerId=" + num2 + ", text=" + str3 + ", tagIds=" + list + ", brandIds=" + list2 + ", sortCriteria=" + str4 + ", excludeIds=" + list3 + ", productKeys=" + list4 + ", page=" + i2 + ", pageSize=" + i3 + ", userHasLoyaltyCardApproved=" + z2 + ")";
    }

    /* renamed from: v */
    public final String m13981v() {
        return this.f23001I;
    }

    /* renamed from: w */
    public final int m13980w() {
        return this.f23007w;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23007w);
        Long l = this.f23008x;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.f23009y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f23010z);
        parcel.writeString(this.f22993A);
        Boolean bool2 = this.f22994B;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.f22995C;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f22996D ? 1 : 0);
        Integer num2 = this.f22997E;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f22998F);
        List<Number> list = this.f22999G;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number number : list) {
                parcel.writeInt(number.intValue());
            }
        }
        List<Number> list2 = this.f23000H;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Number number2 : list2) {
                parcel.writeInt(number2.intValue());
            }
        }
        parcel.writeString(this.f23001I);
        parcel.writeStringList(this.f23002J);
        parcel.writeStringList(this.f23003K);
        parcel.writeInt(this.f23004L);
        parcel.writeInt(this.f23005M);
        parcel.writeInt(this.f23006N ? 1 : 0);
    }

    /* renamed from: y */
    public final List m13979y() {
        return this.f22999G;
    }

    /* renamed from: z */
    public final String m13978z() {
        return this.f22998F;
    }

    public /* synthetic */ SearchCatalogParameters(int i, Long l, Boolean bool, String str, String str2, Boolean bool2, Integer num, boolean z, Integer num2, String str3, List list, List list2, String str4, List list3, List list4, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : l, (i4 & 4) != 0 ? null : bool, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : bool2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? true : z, (i4 & 256) != 0 ? null : num2, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : list2, (i4 & 4096) == 0 ? str4 : null, (i4 & 8192) != 0 ? C13780s.m197g() : list3, (i4 & 16384) != 0 ? C13780s.m197g() : list4, (i4 & 32768) != 0 ? 1 : i2, (i4 & 65536) != 0 ? 20 : i3, (i4 & 131072) != 0 ? false : z2);
    }
}
