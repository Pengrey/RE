package pt.pingodoce.app.data.local.models.egoi;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: EgoiPushData.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EgoiPushData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8695a();
    @InterfaceC4469e(name = "deviceId")

    /* renamed from: A */
    private final int f22528A;
    @InterfaceC4469e(name = "actions")

    /* renamed from: B */
    private final String f22529B;
    @InterfaceC4469e(name = "title")

    /* renamed from: w */
    private final String f22530w;
    @InterfaceC4469e(name = "body")

    /* renamed from: x */
    private final String f22531x;
    @InterfaceC4469e(name = "contactId")

    /* renamed from: y */
    private final String f22532y;
    @InterfaceC4469e(name = "messageHash")

    /* renamed from: z */
    private final String f22533z;

    /* compiled from: EgoiPushData.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.egoi.EgoiPushData$a */
    /* loaded from: classes2.dex */
    public static final class C8695a implements Parcelable.Creator {
        /* renamed from: a */
        public final EgoiPushData mo13434a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new EgoiPushData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final EgoiPushData[] mo13433b(int i) {
            return new EgoiPushData[i];
        }
    }

    public EgoiPushData() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public EgoiPushData(String str, String str2, String str3, String str4, int i, String str5) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "body");
        Intrinsics.isThisObjectNull(str3, "contactId");
        Intrinsics.isThisObjectNull(str4, "messageHash");
        Intrinsics.isThisObjectNull(str5, "actions");
        this.f22530w = str;
        this.f22531x = str2;
        this.f22532y = str3;
        this.f22533z = str4;
        this.f22528A = i;
        this.f22529B = str5;
    }

    /* renamed from: a */
    public final String m14583a() {
        return this.f22529B;
    }

    /* renamed from: b */
    public final String m14582b() {
        return this.f22531x;
    }

    /* renamed from: c */
    public final String m14581c() {
        return this.f22532y;
    }

    /* renamed from: d */
    public final int m14580d() {
        return this.f22528A;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14579e() {
        return this.f22533z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EgoiPushData) {
            EgoiPushData egoiPushData = (EgoiPushData) obj;
            return Intrinsics.equals(this.f22530w, egoiPushData.f22530w) && Intrinsics.equals(this.f22531x, egoiPushData.f22531x) && Intrinsics.equals(this.f22532y, egoiPushData.f22532y) && Intrinsics.equals(this.f22533z, egoiPushData.f22533z) && this.f22528A == egoiPushData.f22528A && Intrinsics.equals(this.f22529B, egoiPushData.f22529B);
        }
        return false;
    }

    /* renamed from: f */
    public final String m14578f() {
        return this.f22530w;
    }

    public int hashCode() {
        return (((((((((this.f22530w.hashCode() * 31) + this.f22531x.hashCode()) * 31) + this.f22532y.hashCode()) * 31) + this.f22533z.hashCode()) * 31) + Integer.hashCode(this.f22528A)) * 31) + this.f22529B.hashCode();
    }

    public String toString() {
        String str = this.f22530w;
        String str2 = this.f22531x;
        String str3 = this.f22532y;
        String str4 = this.f22533z;
        int i = this.f22528A;
        String str5 = this.f22529B;
        return "EgoiPushData(title=" + str + ", body=" + str2 + ", contactId=" + str3 + ", messageHash=" + str4 + ", deviceId=" + i + ", actions=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22530w);
        parcel.writeString(this.f22531x);
        parcel.writeString(this.f22532y);
        parcel.writeString(this.f22533z);
        parcel.writeInt(this.f22528A);
        parcel.writeString(this.f22529B);
    }

    public /* synthetic */ EgoiPushData(String str, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 4) != 0 ? "000000" : str3, (i2 & 8) != 0 ? "0000" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? BuildConfig.VERSION_NAME : str5);
    }
}
