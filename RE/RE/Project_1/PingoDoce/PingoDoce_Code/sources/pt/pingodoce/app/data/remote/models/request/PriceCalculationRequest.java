package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.products.PriceCalculation;

/* compiled from: PriceCalculationRequest.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PriceCalculationRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8748a();
    @InterfaceC4469e(name = "products")

    /* renamed from: w */
    private final List f22924w;

    /* compiled from: PriceCalculationRequest.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.PriceCalculationRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8748a implements Parcelable.Creator {
        /* renamed from: a */
        public final PriceCalculationRequest mo13615a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PriceCalculation.CREATOR.createFromParcel(parcel));
            }
            return new PriceCalculationRequest(arrayList);
        }

        /* renamed from: b */
        public final PriceCalculationRequest[] mo13614b(int i) {
            return new PriceCalculationRequest[i];
        }
    }

    public PriceCalculationRequest(List list) {
        Intrinsics.isThisObjectNull(list, "products");
        this.f22924w = list;
    }

    /* renamed from: a */
    public final List m14083a() {
        return this.f22924w;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        List<PriceCalculation> list = this.f22924w;
        parcel.writeInt(list.size());
        for (PriceCalculation priceCalculation : list) {
            priceCalculation.writeToParcel(parcel, i);
        }
    }
}
