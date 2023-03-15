package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.products.Category;

/* compiled from: CatalogResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CatalogResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8773a();
    @InterfaceC4469e(name = "totalHits")

    /* renamed from: w */
    private final int f23100w;
    @InterfaceC4469e(name = "documents")

    /* renamed from: x */
    private final List f23101x;
    @InterfaceC4469e(name = "categories")

    /* renamed from: y */
    private final List f23102y;

    /* compiled from: CatalogResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.CatalogResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8773a implements Parcelable.Creator {
        /* renamed from: a */
        public final CatalogResponse mo12743a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(parcel.readParcelable(CatalogResponse.class.getClassLoader()));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                arrayList2.add(Category.CREATOR.createFromParcel(parcel));
            }
            return new CatalogResponse(readInt, arrayList, arrayList2);
        }

        /* renamed from: b */
        public final CatalogResponse[] mo12742b(int i) {
            return new CatalogResponse[i];
        }
    }

    public CatalogResponse() {
        this(0, null, null, 7, null);
    }

    public CatalogResponse(int i, List list, List list2) {
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(list2, "categories");
        this.f23100w = i;
        this.f23101x = list;
        this.f23102y = list2;
    }

    /* renamed from: a */
    public final List m13885a() {
        return this.f23102y;
    }

    /* renamed from: b */
    public final List m13884b() {
        return this.f23101x;
    }

    /* renamed from: c */
    public final int m13883c() {
        return this.f23100w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogResponse) {
            CatalogResponse catalogResponse = (CatalogResponse) obj;
            return this.f23100w == catalogResponse.f23100w && Intrinsics.equals(this.f23101x, catalogResponse.f23101x) && Intrinsics.equals(this.f23102y, catalogResponse.f23102y);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f23100w) * 31) + this.f23101x.hashCode()) * 31) + this.f23102y.hashCode();
    }

    public String toString() {
        int i = this.f23100w;
        List list = this.f23101x;
        List list2 = this.f23102y;
        return "CatalogResponse(totalHits=" + i + ", products=" + list + ", categories=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23100w);
        List<Parcelable> list = this.f23101x;
        parcel.writeInt(list.size());
        for (Parcelable parcelable : list) {
            parcel.writeParcelable(parcelable, i);
        }
        List<Category> list2 = this.f23102y;
        parcel.writeInt(list2.size());
        for (Category category : list2) {
            category.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogResponse(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13780s.m197g() : list, (i2 & 4) != 0 ? C13780s.m197g() : list2);
    }
}
