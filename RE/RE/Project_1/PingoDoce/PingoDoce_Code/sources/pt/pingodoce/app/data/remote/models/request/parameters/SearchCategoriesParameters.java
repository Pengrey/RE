package pt.pingodoce.app.data.remote.models.request.parameters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import tg.InterfaceC10619b;

/* compiled from: SearchCategoriesParameters.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SearchCategoriesParameters implements Parcelable, InterfaceC10619b {
    public static final Parcelable.Creator CREATOR = new C8763a();
    @InterfaceC4469e(name = "storeId")

    /* renamed from: w */
    private final int f23021w;
    @InterfaceC4469e(name = "hasPromo")

    /* renamed from: x */
    private final boolean f23022x;

    /* compiled from: SearchCategoriesParameters.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.parameters.SearchCategoriesParameters$a */
    /* loaded from: classes2.dex */
    public static final class C8763a implements Parcelable.Creator {
        /* renamed from: a */
        public final SearchCategoriesParameters mo13504a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new SearchCategoriesParameters(parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final SearchCategoriesParameters[] mo13503b(int i) {
            return new SearchCategoriesParameters[i];
        }
    }

    public SearchCategoriesParameters(int i, boolean z) {
        this.f23021w = i;
        this.f23022x = z;
    }

    /* renamed from: a */
    public final boolean m13973a() {
        return this.f23022x;
    }

    /* renamed from: b */
    public final int m13972b() {
        return this.f23021w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchCategoriesParameters) {
            SearchCategoriesParameters searchCategoriesParameters = (SearchCategoriesParameters) obj;
            return this.f23021w == searchCategoriesParameters.f23021w && this.f23022x == searchCategoriesParameters.f23022x;
        }
        return false;
    }

    public String getKey() {
        return InterfaceC10619b.C10620a.m7484a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23021w) * 31;
        boolean z = this.f23022x;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f23021w;
        boolean z = this.f23022x;
        return "SearchCategoriesParameters(storeId=" + i + ", hasPromo=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23021w);
        parcel.writeInt(this.f23022x ? 1 : 0);
    }
}
