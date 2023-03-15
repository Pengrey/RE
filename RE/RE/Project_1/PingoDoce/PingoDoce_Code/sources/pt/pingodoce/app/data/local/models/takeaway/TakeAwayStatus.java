package pt.pingodoce.app.data.local.models.takeaway;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.remote.models.response.Store;

/* compiled from: TakeAwayStatus.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwayStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8725a();
    @InterfaceC4469e(name = "orders")

    /* renamed from: w */
    private final List f22808w;
    @InterfaceC4469e(name = "notification")

    /* renamed from: x */
    private final String f22809x;
    @InterfaceC4469e(name = "stores")

    /* renamed from: y */
    private final List f22810y;

    /* compiled from: TakeAwayStatus.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus$a */
    /* loaded from: classes2.dex */
    public static final class C8725a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwayStatus mo13086a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TakeAwayOrder.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Store.CREATOR.createFromParcel(parcel));
            }
            return new TakeAwayStatus(arrayList, readString, arrayList2);
        }

        /* renamed from: b */
        public final TakeAwayStatus[] mo13085b(int i) {
            return new TakeAwayStatus[i];
        }
    }

    public TakeAwayStatus() {
        this(null, null, null, 7, null);
    }

    public TakeAwayStatus(List list, String str, List list2) {
        Intrinsics.isThisObjectNull(list, "orders");
        Intrinsics.isThisObjectNull(str, "notification");
        Intrinsics.isThisObjectNull(list2, "stores");
        this.f22808w = list;
        this.f22809x = str;
        this.f22810y = list2;
    }

    /* renamed from: a */
    public final String m14228a() {
        return this.f22809x;
    }

    /* renamed from: b */
    public final List m14227b() {
        return this.f22808w;
    }

    /* renamed from: c */
    public final List m14226c() {
        return this.f22810y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwayStatus) {
            TakeAwayStatus takeAwayStatus = (TakeAwayStatus) obj;
            return Intrinsics.equals(this.f22808w, takeAwayStatus.f22808w) && Intrinsics.equals(this.f22809x, takeAwayStatus.f22809x) && Intrinsics.equals(this.f22810y, takeAwayStatus.f22810y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22808w.hashCode() * 31) + this.f22809x.hashCode()) * 31) + this.f22810y.hashCode();
    }

    public String toString() {
        List list = this.f22808w;
        String str = this.f22809x;
        List list2 = this.f22810y;
        return "TakeAwayStatus(orders=" + list + ", notification=" + str + ", stores=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<TakeAwayOrder> list = this.f22808w;
        parcel.writeInt(list.size());
        for (TakeAwayOrder takeAwayOrder : list) {
            takeAwayOrder.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f22809x);
        List<Store> list2 = this.f22810y;
        parcel.writeInt(list2.size());
        for (Store store : list2) {
            store.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TakeAwayStatus(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13780s.m197g() : list, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? C13780s.m197g() : list2);
    }
}
