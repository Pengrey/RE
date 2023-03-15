package pt.pingodoce.app.data.local.models.banners;

import android.os.Parcel;
import android.os.Parcelable;
import p181jd.Intrinsics;

/* compiled from: BannerActionGotoType.kt */
/* loaded from: classes2.dex */
public enum BannerActionGotoType implements Parcelable {
    NONE,
    HOME,
    PROMOTIONS,
    SHOPPING_LIST,
    TAKE_AWAY,
    LOYALTY,
    CLUBS;
    
    public static final Parcelable.Creator CREATOR = new C8684a();

    /* compiled from: BannerActionGotoType.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.banners.BannerActionGotoType$a */
    /* loaded from: classes2.dex */
    public static final class C8684a implements Parcelable.Creator {
        /* renamed from: a */
        public final BannerActionGotoType mo14195a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return BannerActionGotoType.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final BannerActionGotoType[] mo14194b(int i) {
            return new BannerActionGotoType[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(name());
    }
}
