package module.network.data.remote.models.response.authenticationv2;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.local.pmCards.LoyaltyCardProvisoryV2;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* compiled from: PmCardsResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PmCardsResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7543a();
    @InterfaceC4469e(name = "firstName")

    /* renamed from: w */
    private final String f19963w;
    @InterfaceC4469e(name = "lastName")

    /* renamed from: x */
    private final String f19964x;
    @InterfaceC4469e(name = "pmCards")

    /* renamed from: y */
    private final List f19965y;

    /* compiled from: PmCardsResponse.kt */
    /* renamed from: module.network.data.remote.models.response.authenticationv2.PmCardsResponse$a */
    /* loaded from: classes2.dex */
    public static final class C7543a implements Parcelable.Creator {
        /* renamed from: a */
        public final PmCardsResponse mo17651a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(LoyaltyCardProvisoryV2.CREATOR.createFromParcel(parcel));
            }
            return new PmCardsResponse(readString, readString2, arrayList);
        }

        /* renamed from: b */
        public final PmCardsResponse[] mo17650b(int i) {
            return new PmCardsResponse[i];
        }
    }

    public PmCardsResponse() {
        this(null, null, null, 7, null);
    }

    public PmCardsResponse(String str, String str2, List list) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        Intrinsics.isThisObjectNull(list, "pmCards");
        this.f19963w = str;
        this.f19964x = str2;
        this.f19965y = list;
    }

    /* renamed from: a */
    public final String m18216a() {
        return this.f19963w;
    }

    /* renamed from: b */
    public final String m18215b() {
        return this.f19964x;
    }

    /* renamed from: c */
    public final List m18214c() {
        return this.f19965y;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f19963w);
        parcel.writeString(this.f19964x);
        List<LoyaltyCardProvisoryV2> list = this.f19965y;
        parcel.writeInt(list.size());
        for (LoyaltyCardProvisoryV2 loyaltyCardProvisoryV2 : list) {
            loyaltyCardProvisoryV2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PmCardsResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? C13780s.m197g() : list);
    }
}
