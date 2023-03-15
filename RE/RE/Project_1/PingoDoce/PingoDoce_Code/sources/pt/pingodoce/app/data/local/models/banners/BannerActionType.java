package pt.pingodoce.app.data.local.models.banners;

import android.os.Parcel;
import android.os.Parcelable;
import p181jd.Intrinsics;

/* compiled from: BannerActionType.kt */
/* loaded from: classes2.dex */
public enum BannerActionType implements Parcelable {
    NONE,
    FLYER,
    PRODUCT,
    GOTO,
    URL,
    CLUBS;
    
    public static final Parcelable.Creator CREATOR = new C8685a();

    /* compiled from: BannerActionType.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.banners.BannerActionType$a */
    /* loaded from: classes2.dex */
    public static final class C8685a implements Parcelable.Creator {
        /* renamed from: a */
        public final BannerActionType mo14191a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return BannerActionType.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final BannerActionType[] mo14190b(int i) {
            return new BannerActionType[i];
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
