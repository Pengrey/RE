package pt.pingodoce.app.data.remote.models.request.parameters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import tg.InterfaceC10619b;

/* compiled from: RecommendationsParameters.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class RecommendationsParameters implements Parcelable, InterfaceC10619b {
    public static final Parcelable.Creator CREATOR = new C8761a();
    @InterfaceC4469e(name = "page")

    /* renamed from: w */
    private final int f22984w;
    @InterfaceC4469e(name = "pageSize")

    /* renamed from: x */
    private final int f22985x;
    @InterfaceC4469e(name = "userHasLoyaltyCardApproved")

    /* renamed from: y */
    private final boolean f22986y;
    @InterfaceC4469e(name = "ompdCard")

    /* renamed from: z */
    private final String f22987z;

    /* compiled from: RecommendationsParameters.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters$a */
    /* loaded from: classes2.dex */
    public static final class C8761a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecommendationsParameters mo12863a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new RecommendationsParameters(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final RecommendationsParameters[] mo12862b(int i) {
            return new RecommendationsParameters[i];
        }
    }

    public RecommendationsParameters(int i, int i2, boolean z, String str) {
        this.f22984w = i;
        this.f22985x = i2;
        this.f22986y = z;
        this.f22987z = str;
    }

    /* renamed from: a */
    public final String m14006a() {
        return this.f22987z;
    }

    /* renamed from: b */
    public final int m14005b() {
        return this.f22984w;
    }

    /* renamed from: c */
    public final int m14004c() {
        return this.f22985x;
    }

    /* renamed from: d */
    public final boolean m14003d() {
        return this.f22986y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendationsParameters) {
            RecommendationsParameters recommendationsParameters = (RecommendationsParameters) obj;
            return this.f22984w == recommendationsParameters.f22984w && this.f22985x == recommendationsParameters.f22985x && this.f22986y == recommendationsParameters.f22986y && Intrinsics.equals(this.f22987z, recommendationsParameters.f22987z);
        }
        return false;
    }

    public String getKey() {
        return InterfaceC10619b.C10620a.m7484a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f22984w) * 31) + Integer.hashCode(this.f22985x)) * 31;
        boolean z = this.f22986y;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f22987z;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f22984w;
        int i2 = this.f22985x;
        boolean z = this.f22986y;
        String str = this.f22987z;
        return "RecommendationsParameters(page=" + i + ", pageSize=" + i2 + ", userHasLoyaltyCardApproved=" + z + ", ompdCard=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22984w);
        parcel.writeInt(this.f22985x);
        parcel.writeInt(this.f22986y ? 1 : 0);
        parcel.writeString(this.f22987z);
    }

    public /* synthetic */ RecommendationsParameters(int i, int i2, boolean z, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 12 : i2, (i3 & 4) != 0 ? false : z, str);
    }
}
