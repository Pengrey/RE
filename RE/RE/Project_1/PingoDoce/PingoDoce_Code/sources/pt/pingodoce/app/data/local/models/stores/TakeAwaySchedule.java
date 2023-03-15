package pt.pingodoce.app.data.local.models.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: TakeAwaySchedule.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TakeAwaySchedule implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8721a();
    @InterfaceC4469e(name = "dayLabel")

    /* renamed from: w */
    private final String f22746w;
    @InterfaceC4469e(name = "hourLabels")

    /* renamed from: x */
    private final Map f22747x;

    /* compiled from: TakeAwaySchedule.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.stores.TakeAwaySchedule$a */
    /* loaded from: classes2.dex */
    public static final class C8721a implements Parcelable.Creator {
        /* renamed from: a */
        public final TakeAwaySchedule mo13158a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new TakeAwaySchedule(readString, linkedHashMap);
        }

        /* renamed from: b */
        public final TakeAwaySchedule[] mo13157b(int i) {
            return new TakeAwaySchedule[i];
        }
    }

    public TakeAwaySchedule() {
        this(null, null, 3, null);
    }

    public TakeAwaySchedule(String str, Map map) {
        Intrinsics.isThisObjectNull(str, "dayLabel");
        Intrinsics.isThisObjectNull(map, "hourLabel");
        this.f22746w = str;
        this.f22747x = map;
    }

    /* renamed from: a */
    public final String m14299a() {
        return this.f22746w;
    }

    /* renamed from: b */
    public final Map m14298b() {
        return this.f22747x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakeAwaySchedule) {
            TakeAwaySchedule takeAwaySchedule = (TakeAwaySchedule) obj;
            return Intrinsics.equals(this.f22746w, takeAwaySchedule.f22746w) && Intrinsics.equals(this.f22747x, takeAwaySchedule.f22747x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22746w.hashCode() * 31) + this.f22747x.hashCode();
    }

    public String toString() {
        String str = this.f22746w;
        Map map = this.f22747x;
        return "TakeAwaySchedule(dayLabel=" + str + ", hourLabel=" + map + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22746w);
        Map map = this.f22747x;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ TakeAwaySchedule(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? new LinkedHashMap() : map);
    }
}
