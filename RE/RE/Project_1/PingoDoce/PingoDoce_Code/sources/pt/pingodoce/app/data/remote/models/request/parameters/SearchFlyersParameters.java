package pt.pingodoce.app.data.remote.models.request.parameters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import tg.InterfaceC10619b;

/* compiled from: SearchFlyersParameters.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SearchFlyersParameters implements Parcelable, InterfaceC10619b {
    public static final Parcelable.Creator CREATOR = new C8764a();
    @InterfaceC4469e(name = "storeId")

    /* renamed from: w */
    private final int f23026w;
    @InterfaceC4469e(name = "flyerId")

    /* renamed from: x */
    private final Integer f23027x;

    /* compiled from: SearchFlyersParameters.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.parameters.SearchFlyersParameters$a */
    /* loaded from: classes2.dex */
    public static final class C8764a implements Parcelable.Creator {
        /* renamed from: a */
        public final SearchFlyersParameters mo12826a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new SearchFlyersParameters(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final SearchFlyersParameters[] mo12825b(int i) {
            return new SearchFlyersParameters[i];
        }
    }

    public SearchFlyersParameters(int i, Integer num) {
        this.f23026w = i;
        this.f23027x = num;
    }

    /* renamed from: a */
    public final Integer m13967a() {
        return this.f23027x;
    }

    /* renamed from: b */
    public final int m13966b() {
        return this.f23026w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchFlyersParameters) {
            SearchFlyersParameters searchFlyersParameters = (SearchFlyersParameters) obj;
            return this.f23026w == searchFlyersParameters.f23026w && Intrinsics.equals(this.f23027x, searchFlyersParameters.f23027x);
        }
        return false;
    }

    public String getKey() {
        return InterfaceC10619b.C10620a.m7484a(this);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23026w) * 31;
        Integer num = this.f23027x;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        int i = this.f23026w;
        Integer num = this.f23027x;
        return "SearchFlyersParameters(storeId=" + i + ", flyerId=" + num + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23026w);
        Integer num = this.f23027x;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public /* synthetic */ SearchFlyersParameters(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
