package pt.pingodoce.app.data.local.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;
import pt.pingodoce.app.data.remote.models.response.CriteriaResponse;

/* compiled from: FilterCriteria.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FilterCriteria implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8706a();
    @InterfaceC4469e(name = "sortCriteria")

    /* renamed from: w */
    private final List f22593w;
    @InterfaceC4469e(name = "brands")

    /* renamed from: x */
    private final List f22594x;

    /* compiled from: FilterCriteria.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.FilterCriteria$a */
    /* loaded from: classes2.dex */
    public static final class C8706a implements Parcelable.Creator {
        /* renamed from: a */
        public final FilterCriteria mo13340a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CriteriaResponse.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(BrandResponse.CREATOR.createFromParcel(parcel));
            }
            return new FilterCriteria(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final FilterCriteria[] mo13339b(int i) {
            return new FilterCriteria[i];
        }
    }

    public FilterCriteria() {
        this(null, null, 3, null);
    }

    public FilterCriteria(List list, List list2) {
        Intrinsics.isThisObjectNull(list, "sortCriteria");
        Intrinsics.isThisObjectNull(list2, "brands");
        this.f22593w = list;
        this.f22594x = list2;
    }

    /* renamed from: a */
    public final List m14481a() {
        return this.f22594x;
    }

    /* renamed from: b */
    public final List m14480b() {
        return this.f22593w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterCriteria) {
            FilterCriteria filterCriteria = (FilterCriteria) obj;
            return Intrinsics.equals(this.f22593w, filterCriteria.f22593w) && Intrinsics.equals(this.f22594x, filterCriteria.f22594x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22593w.hashCode() * 31) + this.f22594x.hashCode();
    }

    public String toString() {
        List list = this.f22593w;
        List list2 = this.f22594x;
        return "FilterCriteria(sortCriteria=" + list + ", brands=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<CriteriaResponse> list = this.f22593w;
        parcel.writeInt(list.size());
        for (CriteriaResponse criteriaResponse : list) {
            criteriaResponse.writeToParcel(parcel, i);
        }
        List<BrandResponse> list2 = this.f22594x;
        parcel.writeInt(list2.size());
        for (BrandResponse brandResponse : list2) {
            brandResponse.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FilterCriteria(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13780s.m197g() : list, (i & 2) != 0 ? C13780s.m197g() : list2);
    }
}
