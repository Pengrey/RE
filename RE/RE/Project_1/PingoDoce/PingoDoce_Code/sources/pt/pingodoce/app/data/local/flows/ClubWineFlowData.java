package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: ClubWineFlowData.kt */
/* loaded from: classes2.dex */
public final class ClubWineFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8671a();

    /* renamed from: w */
    private String f22380w;

    /* renamed from: x */
    private List f22381x;

    /* renamed from: y */
    private List f22382y;

    /* renamed from: z */
    private List f22383z;

    /* compiled from: ClubWineFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.ClubWineFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8671a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClubWineFlowData mo13611a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ClubWineFlowData(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final ClubWineFlowData[] mo13610b(int i) {
            return new ClubWineFlowData[i];
        }
    }

    public ClubWineFlowData() {
        this(null, null, null, null, 15, null);
    }

    public ClubWineFlowData(String str, List list, List list2, List list3) {
        Intrinsics.isThisObjectNull(str, "birthdate");
        Intrinsics.isThisObjectNull(list, "region");
        Intrinsics.isThisObjectNull(list2, "wineType");
        Intrinsics.isThisObjectNull(list3, "regionSegment");
        this.f22380w = str;
        this.f22381x = list;
        this.f22382y = list2;
        this.f22383z = list3;
    }

    /* renamed from: b */
    public static /* synthetic */ ClubWineFlowData m14765b(ClubWineFlowData clubWineFlowData, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clubWineFlowData.f22380w;
        }
        if ((i & 2) != 0) {
            list = clubWineFlowData.f22381x;
        }
        if ((i & 4) != 0) {
            list2 = clubWineFlowData.f22382y;
        }
        if ((i & 8) != 0) {
            list3 = clubWineFlowData.f22383z;
        }
        return clubWineFlowData.m14766a(str, list, list2, list3);
    }

    /* renamed from: a */
    public final ClubWineFlowData m14766a(String str, List list, List list2, List list3) {
        Intrinsics.isThisObjectNull(str, "birthdate");
        Intrinsics.isThisObjectNull(list, "region");
        Intrinsics.isThisObjectNull(list2, "wineType");
        Intrinsics.isThisObjectNull(list3, "regionSegment");
        return new ClubWineFlowData(str, list, list2, list3);
    }

    /* renamed from: c */
    public final String m14764c() {
        return this.f22380w;
    }

    /* renamed from: d */
    public final List m14763d() {
        return this.f22381x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List m14762e() {
        return this.f22382y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClubWineFlowData) {
            ClubWineFlowData clubWineFlowData = (ClubWineFlowData) obj;
            return Intrinsics.equals(this.f22380w, clubWineFlowData.f22380w) && Intrinsics.equals(this.f22381x, clubWineFlowData.f22381x) && Intrinsics.equals(this.f22382y, clubWineFlowData.f22382y) && Intrinsics.equals(this.f22383z, clubWineFlowData.f22383z);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f22380w.hashCode() * 31) + this.f22381x.hashCode()) * 31) + this.f22382y.hashCode()) * 31) + this.f22383z.hashCode();
    }

    public String toString() {
        String str = this.f22380w;
        List list = this.f22381x;
        List list2 = this.f22382y;
        List list3 = this.f22383z;
        return "ClubWineFlowData(birthdate=" + str + ", region=" + list + ", wineType=" + list2 + ", regionSegment=" + list3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22380w);
        parcel.writeStringList(this.f22381x);
        parcel.writeStringList(this.f22382y);
        parcel.writeStringList(this.f22383z);
    }

    public /* synthetic */ ClubWineFlowData(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? C13780s.m197g() : list, (i & 4) != 0 ? C13780s.m197g() : list2, (i & 8) != 0 ? C13780s.m197g() : list3);
    }
}
