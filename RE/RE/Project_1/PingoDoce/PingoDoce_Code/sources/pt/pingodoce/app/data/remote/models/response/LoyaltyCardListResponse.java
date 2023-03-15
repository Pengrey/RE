package pt.pingodoce.app.data.remote.models.response;

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
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;

/* compiled from: LoyaltyCardListResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LoyaltyCardListResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8785a();
    @InterfaceC4469e(name = "firstName")

    /* renamed from: w */
    private final String f23198w;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: x */
    private final String f23199x;
    @InterfaceC4469e(name = "pmCards")

    /* renamed from: y */
    private final List f23200y;
    @InterfaceC4469e(name = "userHasGuests")

    /* renamed from: z */
    private final boolean f23201z;

    /* compiled from: LoyaltyCardListResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8785a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoyaltyCardListResponse mo13303a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(LoyaltyCardProvisory.CREATOR.createFromParcel(parcel));
            }
            return new LoyaltyCardListResponse(readString, readString2, arrayList, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoyaltyCardListResponse[] mo13302b(int i) {
            return new LoyaltyCardListResponse[i];
        }
    }

    public LoyaltyCardListResponse() {
        this(null, null, null, false, 15, null);
    }

    public LoyaltyCardListResponse(String str, String str2, List list, boolean z) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(list, "cards");
        this.f23198w = str;
        this.f23199x = str2;
        this.f23200y = list;
        this.f23201z = z;
    }

    /* renamed from: a */
    public final List m13774a() {
        return this.f23200y;
    }

    /* renamed from: b */
    public final String m13773b() {
        return this.f23198w;
    }

    /* renamed from: c */
    public final String m13772c() {
        return this.f23199x;
    }

    /* renamed from: d */
    public final boolean m13771d() {
        return this.f23201z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23198w);
        parcel.writeString(this.f23199x);
        List<LoyaltyCardProvisory> list = this.f23200y;
        parcel.writeInt(list.size());
        for (LoyaltyCardProvisory loyaltyCardProvisory : list) {
            loyaltyCardProvisory.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f23201z ? 1 : 0);
    }

    public /* synthetic */ LoyaltyCardListResponse(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? C13780s.m197g() : list, (i & 8) != 0 ? false : z);
    }
}
