package pt.pingodoce.app.data.local.models.purchases;

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

/* compiled from: ChartData.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class ChartData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8709a();
    @InterfaceC4469e(name = "data")

    /* renamed from: w */
    private final List f22625w;
    @InterfaceC4469e(name = "minDateLabel")

    /* renamed from: x */
    private final String f22626x;
    @InterfaceC4469e(name = "maxDateLabel")

    /* renamed from: y */
    private final String f22627y;

    /* compiled from: ChartData.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.purchases.ChartData$a */
    /* loaded from: classes2.dex */
    public static final class C8709a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChartData mo13306a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new ChartData(arrayList, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ChartData[] mo13305b(int i) {
            return new ChartData[i];
        }
    }

    public ChartData() {
        this(null, null, null, 7, null);
    }

    public ChartData(List list, String str, String str2) {
        Intrinsics.isThisObjectNull(list, "data");
        Intrinsics.isThisObjectNull(str, "minDateLabel");
        Intrinsics.isThisObjectNull(str2, "maxDateLabel");
        this.f22625w = list;
        this.f22626x = str;
        this.f22627y = str2;
    }

    /* renamed from: a */
    public final List m14449a() {
        return this.f22625w;
    }

    /* renamed from: b */
    public final String m14448b() {
        return this.f22627y;
    }

    /* renamed from: c */
    public final String m14447c() {
        return this.f22626x;
    }

    /* renamed from: d */
    public final boolean m14446d() {
        if (this.f22625w.isEmpty()) {
            if (this.f22626x.length() == 0) {
                if (this.f22627y.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChartData) {
            ChartData chartData = (ChartData) obj;
            return Intrinsics.equals(this.f22625w, chartData.f22625w) && Intrinsics.equals(this.f22626x, chartData.f22626x) && Intrinsics.equals(this.f22627y, chartData.f22627y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22625w.hashCode() * 31) + this.f22626x.hashCode()) * 31) + this.f22627y.hashCode();
    }

    public String toString() {
        List list = this.f22625w;
        String str = this.f22626x;
        String str2 = this.f22627y;
        return "ChartData(data=" + list + ", minDateLabel=" + str + ", maxDateLabel=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<Number> list = this.f22625w;
        parcel.writeInt(list.size());
        for (Number number : list) {
            parcel.writeFloat(number.floatValue());
        }
        parcel.writeString(this.f22626x);
        parcel.writeString(this.f22627y);
    }

    public /* synthetic */ ChartData(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13780s.m197g() : list, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
