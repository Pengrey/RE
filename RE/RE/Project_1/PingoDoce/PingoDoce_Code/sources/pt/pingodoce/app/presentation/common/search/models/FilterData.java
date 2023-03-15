package pt.pingodoce.app.presentation.common.search.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;

/* compiled from: FilterData.kt */
/* loaded from: classes2.dex */
public final class FilterData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9143a();

    /* renamed from: w */
    private final List f24093w;

    /* renamed from: x */
    private final List f24094x;

    /* compiled from: FilterData.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.models.FilterData$a */
    /* loaded from: classes2.dex */
    public static final class C9143a implements Parcelable.Creator {
        /* renamed from: a */
        public final FilterData createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Criteria.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Brand.CREATOR.createFromParcel(parcel));
            }
            return new FilterData(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final FilterData[] newArray(int i) {
            return new FilterData[i];
        }
    }

    public FilterData(List list, List list2) {
        Intrinsics.isThisObjectNull(list, "sortCriteria");
        Intrinsics.isThisObjectNull(list2, "brands");
        this.f24093w = list;
        this.f24094x = list2;
    }

    /* renamed from: a */
    public final List m12330a() {
        return this.f24094x;
    }

    /* renamed from: b */
    public final List m12329b() {
        return this.f24093w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterData) {
            FilterData filterData = (FilterData) obj;
            return Intrinsics.equals(this.f24093w, filterData.f24093w) && Intrinsics.equals(this.f24094x, filterData.f24094x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f24093w.hashCode() * 31) + this.f24094x.hashCode();
    }

    public String toString() {
        List list = this.f24093w;
        List list2 = this.f24094x;
        return "FilterData(sortCriteria=" + list + ", brands=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<Criteria> list = this.f24093w;
        parcel.writeInt(list.size());
        for (Criteria criteria : list) {
            criteria.writeToParcel(parcel, i);
        }
        List<Brand> list2 = this.f24094x;
        parcel.writeInt(list2.size());
        for (Brand brand : list2) {
            brand.writeToParcel(parcel, i);
        }
    }
}
