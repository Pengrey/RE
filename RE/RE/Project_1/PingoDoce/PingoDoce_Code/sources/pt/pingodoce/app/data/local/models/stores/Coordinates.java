package pt.pingodoce.app.data.local.models.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Coordinates.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Coordinates implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8718a();
    @InterfaceC4469e(name = "latitude")

    /* renamed from: w */
    private final double f22730w;
    @InterfaceC4469e(name = "longitude")

    /* renamed from: x */
    private final double f22731x;

    /* compiled from: Coordinates.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.stores.Coordinates$a */
    /* loaded from: classes2.dex */
    public static final class C8718a implements Parcelable.Creator {
        /* renamed from: a */
        public final Coordinates mo13176a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Coordinates(parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: b */
        public final Coordinates[] mo13175b(int i) {
            return new Coordinates[i];
        }
    }

    public Coordinates() {
        this(0.0d, 0.0d, 3, null);
    }

    public Coordinates(double d, double d2) {
        this.f22730w = d;
        this.f22731x = d2;
    }

    /* renamed from: a */
    public final double m14317a() {
        return this.f22730w;
    }

    /* renamed from: b */
    public final double m14316b() {
        return this.f22731x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Coordinates) {
            Coordinates coordinates = (Coordinates) obj;
            return Intrinsics.equals(Double.valueOf(this.f22730w), Double.valueOf(coordinates.f22730w)) && Intrinsics.equals(Double.valueOf(this.f22731x), Double.valueOf(coordinates.f22731x));
        }
        return false;
    }

    public int hashCode() {
        return (Double.hashCode(this.f22730w) * 31) + Double.hashCode(this.f22731x);
    }

    public String toString() {
        double d = this.f22730w;
        double d2 = this.f22731x;
        return "Coordinates(lat=" + d + ", lng=" + d2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeDouble(this.f22730w);
        parcel.writeDouble(this.f22731x);
    }

    public /* synthetic */ Coordinates(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
