package pt.pingodoce.app.data.local.models.banners;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: BannerAction.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class BannerAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8683a();
    @InterfaceC4469e(name = "type")

    /* renamed from: w */
    private final int f22449w;
    @InterfaceC4469e(name = "description")

    /* renamed from: x */
    private final String f22450x;
    @InterfaceC4469e(name = "data")

    /* renamed from: y */
    private final String f22451y;

    /* compiled from: BannerAction.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.banners.BannerAction$a */
    /* loaded from: classes2.dex */
    public static final class C8683a implements Parcelable.Creator {
        /* renamed from: a */
        public final BannerAction mo13521a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new BannerAction(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BannerAction[] mo13520b(int i) {
            return new BannerAction[i];
        }
    }

    public BannerAction() {
        this(0, null, null, 7, null);
    }

    public BannerAction(int i, String str, String str2) {
        Intrinsics.isThisObjectNull(str, "description");
        Intrinsics.isThisObjectNull(str2, "payload");
        this.f22449w = i;
        this.f22450x = str;
        this.f22451y = str2;
    }

    /* renamed from: a */
    public final String m14667a() {
        return this.f22450x;
    }

    /* renamed from: b */
    public final String m14666b() {
        return this.f22451y;
    }

    /* renamed from: c */
    public final int m14665c() {
        return this.f22449w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerAction) {
            BannerAction bannerAction = (BannerAction) obj;
            return this.f22449w == bannerAction.f22449w && Intrinsics.equals(this.f22450x, bannerAction.f22450x) && Intrinsics.equals(this.f22451y, bannerAction.f22451y);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22449w * 31) + this.f22450x.hashCode()) * 31) + this.f22451y.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22449w);
        parcel.writeString(this.f22450x);
        parcel.writeString(this.f22451y);
    }

    public /* synthetic */ BannerAction(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
