package module.network.data.remote.models.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* compiled from: User.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7545a();
    @InterfaceC4469e(name = "image")

    /* renamed from: A */
    private final String f19978A;
    @InterfaceC4469e(name = "imageUrl")

    /* renamed from: B */
    private String f19979B;
    @InterfaceC4469e(name = "isActive")

    /* renamed from: C */
    private final boolean f19980C;
    @InterfaceC4469e(name = "phone")

    /* renamed from: D */
    private final String f19981D;
    @InterfaceC4469e(name = "phoneNumber")

    /* renamed from: E */
    private final String f19982E;
    @InterfaceC4469e(name = "userId")

    /* renamed from: F */
    private final String f19983F;
    @InterfaceC4469e(name = "nif")

    /* renamed from: G */
    private final String f19984G;
    @InterfaceC4469e(name = "loyaltyId")

    /* renamed from: H */
    private final String f19985H;
    @InterfaceC4469e(name = "ompdCard")

    /* renamed from: I */
    private final String f19986I;
    @InterfaceC4469e(name = "householdId")

    /* renamed from: J */
    private final String f19987J;
    @InterfaceC4469e(name = "birthDate")

    /* renamed from: K */
    private final String f19988K;
    @InterfaceC4469e(name = "customerStatus")

    /* renamed from: L */
    private final String f19989L;
    @InterfaceC4469e(name = "email")

    /* renamed from: w */
    private final String f19990w;
    @InterfaceC4469e(name = "emailValidated")

    /* renamed from: x */
    private final boolean f19991x;
    @InterfaceC4469e(name = "firstName")

    /* renamed from: y */
    private final String f19992y;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: z */
    private final String f19993z;

    /* compiled from: User.kt */
    /* renamed from: module.network.data.remote.models.user.User$a */
    /* loaded from: classes2.dex */
    public static final class C7545a implements Parcelable.Creator {
        /* renamed from: a */
        public final User mo16864a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new User(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final User[] mo16863b(int i) {
            return new User[i];
        }
    }

    public User() {
        this(null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public User(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "firstName");
        Intrinsics.isThisObjectNull(str3, "lastName");
        Intrinsics.isThisObjectNull(str4, "image");
        Intrinsics.isThisObjectNull(str5, "pictureUrl");
        Intrinsics.isThisObjectNull(str6, "phone");
        Intrinsics.isThisObjectNull(str7, "phoneNumber");
        Intrinsics.isThisObjectNull(str8, "userId");
        Intrinsics.isThisObjectNull(str9, "nif");
        Intrinsics.isThisObjectNull(str11, "ompdId");
        Intrinsics.isThisObjectNull(str13, "birthDate");
        Intrinsics.isThisObjectNull(str14, "customerStatus");
        this.f19990w = str;
        this.f19991x = z;
        this.f19992y = str2;
        this.f19993z = str3;
        this.f19978A = str4;
        this.f19979B = str5;
        this.f19980C = z2;
        this.f19981D = str6;
        this.f19982E = str7;
        this.f19983F = str8;
        this.f19984G = str9;
        this.f19985H = str10;
        this.f19986I = str11;
        this.f19987J = str12;
        this.f19988K = str13;
        this.f19989L = str14;
    }

    /* renamed from: b */
    public static /* synthetic */ User m18190b(User user, String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        return user.m18191a((i & 1) != 0 ? user.f19990w : str, (i & 2) != 0 ? user.f19991x : z, (i & 4) != 0 ? user.f19992y : str2, (i & 8) != 0 ? user.f19993z : str3, (i & 16) != 0 ? user.f19978A : str4, (i & 32) != 0 ? user.f19979B : str5, (i & 64) != 0 ? user.f19980C : z2, (i & 128) != 0 ? user.f19981D : str6, (i & 256) != 0 ? user.f19982E : str7, (i & 512) != 0 ? user.f19983F : str8, (i & 1024) != 0 ? user.f19984G : str9, (i & 2048) != 0 ? user.f19985H : str10, (i & 4096) != 0 ? user.f19986I : str11, (i & 8192) != 0 ? user.f19987J : str12, (i & 16384) != 0 ? user.f19988K : str13, (i & 32768) != 0 ? user.f19989L : str14);
    }

    /* renamed from: A */
    public final boolean m18202A() {
        String str = this.f19987J;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: D */
    public final boolean m18201D() {
        String str = this.f19985H;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: E */
    public final boolean m18200E() {
        return this.f19979B.length() > 0;
    }

    /* renamed from: F */
    public final boolean m18199F() {
        boolean m8948C;
        m8948C = StringsJVM.m8948C(this.f19983F, "0000", false, 2, null);
        return !m8948C;
    }

    /* renamed from: G */
    public final boolean m18198G() {
        return this.f19980C;
    }

    /* renamed from: H */
    public final boolean m18197H() {
        if (this.f19992y.length() == 0) {
            if (this.f19983F.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final boolean m18196I() {
        return this.f19991x;
    }

    /* renamed from: J */
    public final boolean m18195J() {
        if (this.f19992y.length() > 0) {
            if (this.f19983F.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m18194K() {
        return Intrinsics.equals(this.f19989L, "Onboarding");
    }

    /* renamed from: L */
    public final boolean m18193L() {
        if (this.f19989L.length() == 0) {
            return true;
        }
        String str = this.f19985H;
        return str == null || str.length() == 0;
    }

    /* renamed from: M */
    public final void m18192M(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f19979B = str;
    }

    /* renamed from: a */
    public final User m18191a(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        Intrinsics.isThisObjectNull(str, "email");
        Intrinsics.isThisObjectNull(str2, "firstName");
        Intrinsics.isThisObjectNull(str3, "lastName");
        Intrinsics.isThisObjectNull(str4, "image");
        Intrinsics.isThisObjectNull(str5, "pictureUrl");
        Intrinsics.isThisObjectNull(str6, "phone");
        Intrinsics.isThisObjectNull(str7, "phoneNumber");
        Intrinsics.isThisObjectNull(str8, "userId");
        Intrinsics.isThisObjectNull(str9, "nif");
        Intrinsics.isThisObjectNull(str11, "ompdId");
        Intrinsics.isThisObjectNull(str13, "birthDate");
        Intrinsics.isThisObjectNull(str14, "customerStatus");
        return new User(str, z, str2, str3, str4, str5, z2, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* renamed from: c */
    public final String m18189c() {
        String str = this.f19992y;
        String str2 = this.f19993z;
        return str + " " + str2;
    }

    /* renamed from: d */
    public final String m18188d() {
        return this.f19988K;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m18187e() {
        return this.f19989L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.equals(this.f19990w, user.f19990w) && this.f19991x == user.f19991x && Intrinsics.equals(this.f19992y, user.f19992y) && Intrinsics.equals(this.f19993z, user.f19993z) && Intrinsics.equals(this.f19978A, user.f19978A) && Intrinsics.equals(this.f19979B, user.f19979B) && this.f19980C == user.f19980C && Intrinsics.equals(this.f19981D, user.f19981D) && Intrinsics.equals(this.f19982E, user.f19982E) && Intrinsics.equals(this.f19983F, user.f19983F) && Intrinsics.equals(this.f19984G, user.f19984G) && Intrinsics.equals(this.f19985H, user.f19985H) && Intrinsics.equals(this.f19986I, user.f19986I) && Intrinsics.equals(this.f19987J, user.f19987J) && Intrinsics.equals(this.f19988K, user.f19988K) && Intrinsics.equals(this.f19989L, user.f19989L);
        }
        return false;
    }

    /* renamed from: f */
    public final String m18186f() {
        return this.f19990w;
    }

    /* renamed from: h */
    public final String m18185h() {
        String str = this.f19981D;
        return str.length() == 0 ? this.f19982E : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f19990w.hashCode() * 31;
        boolean z = this.f19991x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((hashCode + i) * 31) + this.f19992y.hashCode()) * 31) + this.f19993z.hashCode()) * 31) + this.f19978A.hashCode()) * 31) + this.f19979B.hashCode()) * 31;
        boolean z2 = this.f19980C;
        int hashCode3 = (((((((((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f19981D.hashCode()) * 31) + this.f19982E.hashCode()) * 31) + this.f19983F.hashCode()) * 31) + this.f19984G.hashCode()) * 31;
        String str = this.f19985H;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f19986I.hashCode()) * 31;
        String str2 = this.f19987J;
        return ((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19988K.hashCode()) * 31) + this.f19989L.hashCode();
    }

    /* renamed from: i */
    public final String m18184i() {
        return this.f19992y;
    }

    /* renamed from: j */
    public final String m18183j() {
        return this.f19987J;
    }

    /* renamed from: k */
    public final String m18182k() {
        return this.f19978A;
    }

    /* renamed from: m */
    public final String m18181m() {
        return this.f19993z;
    }

    /* renamed from: n */
    public final String m18180n() {
        return this.f19985H;
    }

    /* renamed from: r */
    public final String m18179r() {
        return this.f19984G;
    }

    /* renamed from: s */
    public final String m18178s() {
        return this.f19986I;
    }

    /* renamed from: t */
    public final String m18177t() {
        return this.f19981D;
    }

    public String toString() {
        String str = this.f19990w;
        boolean z = this.f19991x;
        String str2 = this.f19992y;
        String str3 = this.f19993z;
        String str4 = this.f19978A;
        String str5 = this.f19979B;
        boolean z2 = this.f19980C;
        String str6 = this.f19981D;
        String str7 = this.f19982E;
        String str8 = this.f19983F;
        String str9 = this.f19984G;
        String str10 = this.f19985H;
        String str11 = this.f19986I;
        String str12 = this.f19987J;
        String str13 = this.f19988K;
        String str14 = this.f19989L;
        return "User(email=" + str + ", isEmailValidated=" + z + ", firstName=" + str2 + ", lastName=" + str3 + ", image=" + str4 + ", pictureUrl=" + str5 + ", isActive=" + z2 + ", phone=" + str6 + ", phoneNumber=" + str7 + ", userId=" + str8 + ", nif=" + str9 + ", loyaltyId=" + str10 + ", ompdId=" + str11 + ", householdId=" + str12 + ", birthDate=" + str13 + ", customerStatus=" + str14 + ")";
    }

    /* renamed from: v */
    public final String m18176v() {
        return this.f19982E;
    }

    /* renamed from: w */
    public final String m18175w() {
        return this.f19979B;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f19990w);
        parcel.writeInt(this.f19991x ? 1 : 0);
        parcel.writeString(this.f19992y);
        parcel.writeString(this.f19993z);
        parcel.writeString(this.f19978A);
        parcel.writeString(this.f19979B);
        parcel.writeInt(this.f19980C ? 1 : 0);
        parcel.writeString(this.f19981D);
        parcel.writeString(this.f19982E);
        parcel.writeString(this.f19983F);
        parcel.writeString(this.f19984G);
        parcel.writeString(this.f19985H);
        parcel.writeString(this.f19986I);
        parcel.writeString(this.f19987J);
        parcel.writeString(this.f19988K);
        parcel.writeString(this.f19989L);
    }

    /* renamed from: y */
    public final String m18174y() {
        return this.f19983F;
    }

    /* renamed from: z */
    public final boolean m18173z() {
        return this.f19990w.length() > 0;
    }

    public /* synthetic */ User(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? BuildConfig.VERSION_NAME : str6, (i & 256) != 0 ? BuildConfig.VERSION_NAME : str7, (i & 512) != 0 ? BuildConfig.VERSION_NAME : str8, (i & 1024) != 0 ? BuildConfig.VERSION_NAME : str9, (i & 2048) != 0 ? BuildConfig.VERSION_NAME : str10, (i & 4096) != 0 ? BuildConfig.VERSION_NAME : str11, (i & 8192) != 0 ? BuildConfig.VERSION_NAME : str12, (i & 16384) != 0 ? BuildConfig.VERSION_NAME : str13, (i & 32768) != 0 ? BuildConfig.VERSION_NAME : str14);
    }
}
