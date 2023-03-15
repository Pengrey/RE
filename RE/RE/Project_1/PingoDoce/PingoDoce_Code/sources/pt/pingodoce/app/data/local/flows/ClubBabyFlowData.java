package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ClubBabyFlowData.kt */
/* loaded from: classes2.dex */
public final class ClubBabyFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8670a();

    /* renamed from: w */
    private String f22376w;

    /* renamed from: x */
    private String f22377x;

    /* renamed from: y */
    private String f22378y;

    /* renamed from: z */
    private String f22379z;

    /* compiled from: ClubBabyFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.ClubBabyFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8670a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClubBabyFlowData mo13618a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ClubBabyFlowData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ClubBabyFlowData[] mo13617b(int i) {
            return new ClubBabyFlowData[i];
        }
    }

    public ClubBabyFlowData() {
        this(null, null, null, null, 15, null);
    }

    public ClubBabyFlowData(String str, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(str2, "birthdate");
        Intrinsics.isThisObjectNull(str3, "id");
        Intrinsics.isThisObjectNull(str4, "id_type");
        this.f22376w = str;
        this.f22377x = str2;
        this.f22378y = str3;
        this.f22379z = str4;
    }

    /* renamed from: a */
    public final String m14776a() {
        return this.f22377x;
    }

    /* renamed from: b */
    public final String m14775b() {
        return this.f22378y;
    }

    /* renamed from: c */
    public final String m14774c() {
        return this.f22379z;
    }

    /* renamed from: d */
    public final String m14773d() {
        return this.f22376w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m14772e(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22377x = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClubBabyFlowData) {
            ClubBabyFlowData clubBabyFlowData = (ClubBabyFlowData) obj;
            return Intrinsics.equals(this.f22376w, clubBabyFlowData.f22376w) && Intrinsics.equals(this.f22377x, clubBabyFlowData.f22377x) && Intrinsics.equals(this.f22378y, clubBabyFlowData.f22378y) && Intrinsics.equals(this.f22379z, clubBabyFlowData.f22379z);
        }
        return false;
    }

    /* renamed from: f */
    public final void m14771f(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22378y = str;
    }

    /* renamed from: h */
    public final void m14770h(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22379z = str;
    }

    public int hashCode() {
        return (((((this.f22376w.hashCode() * 31) + this.f22377x.hashCode()) * 31) + this.f22378y.hashCode()) * 31) + this.f22379z.hashCode();
    }

    /* renamed from: i */
    public final void m14769i(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f22376w = str;
    }

    public String toString() {
        String str = this.f22376w;
        String str2 = this.f22377x;
        String str3 = this.f22378y;
        String str4 = this.f22379z;
        return "ClubBabyFlowData(name=" + str + ", birthdate=" + str2 + ", id=" + str3 + ", id_type=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22376w);
        parcel.writeString(this.f22377x);
        parcel.writeString(this.f22378y);
        parcel.writeString(this.f22379z);
    }

    public /* synthetic */ ClubBabyFlowData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
