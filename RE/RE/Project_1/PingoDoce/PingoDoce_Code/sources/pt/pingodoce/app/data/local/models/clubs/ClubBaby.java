package pt.pingodoce.app.data.local.models.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ClubBaby.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ClubBaby implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8687a();

    /* renamed from: w */
    private final String f22472w;

    /* renamed from: x */
    private final String f22473x;

    /* renamed from: y */
    private final String f22474y;

    /* renamed from: z */
    private String f22475z;

    /* compiled from: ClubBaby.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.clubs.ClubBaby$a */
    /* loaded from: classes2.dex */
    public static final class C8687a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClubBaby mo13486a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ClubBaby(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ClubBaby[] mo13485b(int i) {
            return new ClubBaby[i];
        }
    }

    public ClubBaby() {
        this(null, null, null, null, 15, null);
    }

    public ClubBaby(String str, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "idCard");
        Intrinsics.isThisObjectNull(str2, "birthdate");
        Intrinsics.isThisObjectNull(str3, "idCardType");
        Intrinsics.isThisObjectNull(str4, "name");
        this.f22472w = str;
        this.f22473x = str2;
        this.f22474y = str3;
        this.f22475z = str4;
    }

    /* renamed from: b */
    public static /* synthetic */ ClubBaby m14634b(ClubBaby clubBaby, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clubBaby.f22472w;
        }
        if ((i & 2) != 0) {
            str2 = clubBaby.f22473x;
        }
        if ((i & 4) != 0) {
            str3 = clubBaby.f22474y;
        }
        if ((i & 8) != 0) {
            str4 = clubBaby.f22475z;
        }
        return clubBaby.m14635a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final ClubBaby m14635a(String str, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "idCard");
        Intrinsics.isThisObjectNull(str2, "birthdate");
        Intrinsics.isThisObjectNull(str3, "idCardType");
        Intrinsics.isThisObjectNull(str4, "name");
        return new ClubBaby(str, str2, str3, str4);
    }

    /* renamed from: c */
    public final String m14633c() {
        return this.f22473x;
    }

    /* renamed from: d */
    public final String m14632d() {
        return this.f22472w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14631e() {
        return this.f22474y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClubBaby) {
            ClubBaby clubBaby = (ClubBaby) obj;
            return Intrinsics.equals(this.f22472w, clubBaby.f22472w) && Intrinsics.equals(this.f22473x, clubBaby.f22473x) && Intrinsics.equals(this.f22474y, clubBaby.f22474y) && Intrinsics.equals(this.f22475z, clubBaby.f22475z);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14630f() {
        return this.f22475z;
    }

    public int hashCode() {
        return (((((this.f22472w.hashCode() * 31) + this.f22473x.hashCode()) * 31) + this.f22474y.hashCode()) * 31) + this.f22475z.hashCode();
    }

    public String toString() {
        String str = this.f22472w;
        String str2 = this.f22473x;
        String str3 = this.f22474y;
        String str4 = this.f22475z;
        return "ClubBaby(idCard=" + str + ", birthdate=" + str2 + ", idCardType=" + str3 + ", name=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22472w);
        parcel.writeString(this.f22473x);
        parcel.writeString(this.f22474y);
        parcel.writeString(this.f22475z);
    }

    public /* synthetic */ ClubBaby(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? EnumC8692b.CC.toString() : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
