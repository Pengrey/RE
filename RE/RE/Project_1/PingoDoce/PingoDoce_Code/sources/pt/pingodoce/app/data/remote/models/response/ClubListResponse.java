package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.clubs.Club;

/* compiled from: ClubListResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ClubListResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8775a();

    /* renamed from: w */
    private final int f23112w;

    /* renamed from: x */
    private List f23113x;

    /* compiled from: ClubListResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.ClubListResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8775a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClubListResponse mo12732a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Club.CREATOR.createFromParcel(parcel));
            }
            return new ClubListResponse(readInt, arrayList);
        }

        /* renamed from: b */
        public final ClubListResponse[] mo12731b(int i) {
            return new ClubListResponse[i];
        }
    }

    public ClubListResponse() {
        this(0, null, 3, null);
    }

    public ClubListResponse(int i, List list) {
        Intrinsics.isThisObjectNull(list, "items");
        this.f23112w = i;
        this.f23113x = list;
    }

    /* renamed from: a */
    public final List m13873a() {
        return this.f23113x;
    }

    /* renamed from: b */
    public final int m13872b() {
        return this.f23112w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClubListResponse) {
            ClubListResponse clubListResponse = (ClubListResponse) obj;
            return this.f23112w == clubListResponse.f23112w && Intrinsics.equals(this.f23113x, clubListResponse.f23113x);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f23112w) * 31) + this.f23113x.hashCode();
    }

    public String toString() {
        int i = this.f23112w;
        List list = this.f23113x;
        return "ClubListResponse(total=" + i + ", items=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23112w);
        List<Club> list = this.f23113x;
        parcel.writeInt(list.size());
        for (Club club : list) {
            club.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ClubListResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13780s.m197g() : list);
    }
}
