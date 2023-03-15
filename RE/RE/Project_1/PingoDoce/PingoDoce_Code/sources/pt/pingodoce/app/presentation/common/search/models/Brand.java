package pt.pingodoce.app.presentation.common.search.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;

/* compiled from: Brand.kt */
/* loaded from: classes2.dex */
public final class Brand implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9141a();

    /* renamed from: w */
    private final int f24088w;

    /* renamed from: x */
    private final BrandResponse f24089x;

    /* renamed from: y */
    private final boolean f24090y;

    /* compiled from: Brand.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.models.Brand$a */
    /* loaded from: classes2.dex */
    public static final class C9141a implements Parcelable.Creator {
        /* renamed from: a */
        public final Brand mo11429a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Brand(parcel.readInt(), (BrandResponse) BrandResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final Brand[] mo11428b(int i) {
            return new Brand[i];
        }
    }

    public Brand() {
        this(0, null, false, 7, null);
    }

    public Brand(int i, BrandResponse brandResponse, boolean z) {
        Intrinsics.isThisObjectNull(brandResponse, "brand");
        this.f24088w = i;
        this.f24089x = brandResponse;
        this.f24090y = z;
    }

    /* renamed from: b */
    public static /* synthetic */ Brand m12342b(Brand brand, int i, BrandResponse brandResponse, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = brand.f24088w;
        }
        if ((i2 & 2) != 0) {
            brandResponse = brand.f24089x;
        }
        if ((i2 & 4) != 0) {
            z = brand.f24090y;
        }
        return brand.m12343a(i, brandResponse, z);
    }

    /* renamed from: a */
    public final Brand m12343a(int i, BrandResponse brandResponse, boolean z) {
        Intrinsics.isThisObjectNull(brandResponse, "brand");
        return new Brand(i, brandResponse, z);
    }

    /* renamed from: c */
    public final BrandResponse m12341c() {
        return this.f24089x;
    }

    /* renamed from: d */
    public final int m12340d() {
        return this.f24088w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m12339e() {
        return this.f24090y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Brand) {
            Brand brand = (Brand) obj;
            return this.f24088w == brand.f24088w && Intrinsics.equals(this.f24089x, brand.f24089x) && this.f24090y == brand.f24090y;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f24088w) * 31) + this.f24089x.hashCode()) * 31;
        boolean z = this.f24090y;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f24088w;
        BrandResponse brandResponse = this.f24089x;
        boolean z = this.f24090y;
        return "Brand(position=" + i + ", brand=" + brandResponse + ", isChecked=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f24088w);
        this.f24089x.writeToParcel(parcel, i);
        parcel.writeInt(this.f24090y ? 1 : 0);
    }

    public /* synthetic */ Brand(int i, BrandResponse brandResponse, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? new BrandResponse(null, false, null, null, 15, null) : brandResponse, (i2 & 4) != 0 ? false : z);
    }
}
