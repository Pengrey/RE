package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.core.text.C1050b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.banners.BannerAction;
import pt.pingodoce.app.data.local.models.banners.BannerActionGotoType;
import pt.pingodoce.app.data.local.models.banners.BannerActionType;

/* compiled from: Banner.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Banner implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8766a();
    @InterfaceC4469e(name = "thumb")

    /* renamed from: A */
    private final String f23035A;
    @InterfaceC4469e(name = "image")

    /* renamed from: B */
    private final String f23036B;
    @InterfaceC4469e(name = "isNew")

    /* renamed from: C */
    private final boolean f23037C;
    @InterfaceC4469e(name = "color")

    /* renamed from: D */
    private final String f23038D;
    @InterfaceC4469e(name = "action")

    /* renamed from: E */
    private final BannerAction f23039E;
    @InterfaceC4469e(name = "shortTitle")

    /* renamed from: F */
    private final String f23040F;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f23041w;
    @InterfaceC4469e(name = "title")

    /* renamed from: x */
    private final String f23042x;
    @InterfaceC4469e(name = "description")

    /* renamed from: y */
    private final String f23043y;
    @InterfaceC4469e(name = "shortAction")

    /* renamed from: z */
    private final String f23044z;

    /* compiled from: Banner.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Banner$a */
    /* loaded from: classes2.dex */
    public static final class C8766a implements Parcelable.Creator {
        /* renamed from: a */
        public final Banner createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Banner(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (BannerAction) BannerAction.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* renamed from: b */
        public final Banner[] newArray(int i) {
            return new Banner[i];
        }
    }

    public Banner() {
        this(0, null, null, null, null, null, false, null, null, null, 1023, null);
    }

    public Banner(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, BannerAction bannerAction, String str7) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "description");
        Intrinsics.isThisObjectNull(str4, "thumb");
        Intrinsics.isThisObjectNull(str5, "image");
        Intrinsics.isThisObjectNull(str6, "backgroundColor");
        Intrinsics.isThisObjectNull(bannerAction, "action");
        Intrinsics.isThisObjectNull(str7, "shortTitle");
        this.f23041w = i;
        this.f23042x = str;
        this.f23043y = str2;
        this.f23044z = str3;
        this.f23035A = str4;
        this.f23036B = str5;
        this.f23037C = z;
        this.f23038D = str6;
        this.f23039E = bannerAction;
        this.f23040F = str7;
    }

    /* renamed from: a */
    public final BannerActionGotoType m13956a() {
        if (m13955b() == BannerActionType.GOTO) {
            String m14666b = this.f23039E.m14666b();
            switch (m14666b.hashCode()) {
                case 49:
                    if (m14666b.equals("1")) {
                        return BannerActionGotoType.PROMOTIONS;
                    }
                    break;
                case 50:
                    if (m14666b.equals("2")) {
                        return BannerActionGotoType.SHOPPING_LIST;
                    }
                    break;
                case 51:
                    if (m14666b.equals("3")) {
                        return BannerActionGotoType.TAKE_AWAY;
                    }
                    break;
                case 52:
                    if (m14666b.equals("4")) {
                        return BannerActionGotoType.LOYALTY;
                    }
                    break;
                case 53:
                    if (m14666b.equals("5")) {
                        return BannerActionGotoType.CLUBS;
                    }
                    break;
            }
            return BannerActionGotoType.NONE;
        }
        return BannerActionGotoType.NONE;
    }

    /* renamed from: b */
    public final BannerActionType m13955b() {
        int m14665c = this.f23039E.m14665c();
        if (m14665c != 1) {
            if (m14665c != 2) {
                if (m14665c != 3) {
                    if (m14665c != 4) {
                        if (m14665c != 5) {
                            return BannerActionType.NONE;
                        }
                        return BannerActionType.CLUBS;
                    }
                    return BannerActionType.URL;
                }
                return BannerActionType.GOTO;
            }
            return BannerActionType.PRODUCT;
        }
        return BannerActionType.FLYER;
    }

    /* renamed from: c */
    public final Spanned m13954c() {
        Spanned m38666a = C1050b.m38666a(this.f23043y, 0);
        Intrinsics.checkIfNull(m38666a, "fromHtml(description, Ht…at.FROM_HTML_MODE_LEGACY)");
        return m38666a;
    }

    /* renamed from: d */
    public final BannerAction m13953d() {
        return this.f23039E;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13952e() {
        return this.f23038D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Banner) {
            Banner banner = (Banner) obj;
            return this.f23041w == banner.f23041w && Intrinsics.equals(this.f23042x, banner.f23042x) && Intrinsics.equals(this.f23043y, banner.f23043y) && Intrinsics.equals(this.f23044z, banner.f23044z) && Intrinsics.equals(this.f23035A, banner.f23035A) && Intrinsics.equals(this.f23036B, banner.f23036B) && this.f23037C == banner.f23037C && Intrinsics.equals(this.f23038D, banner.f23038D) && Intrinsics.equals(this.f23039E, banner.f23039E) && Intrinsics.equals(this.f23040F, banner.f23040F);
        }
        return false;
    }

    /* renamed from: f */
    public final String m13951f() {
        return this.f23043y;
    }

    /* renamed from: h */
    public final int m13950h() {
        return this.f23041w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f23041w) * 31) + this.f23042x.hashCode()) * 31) + this.f23043y.hashCode()) * 31;
        String str = this.f23044z;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23035A.hashCode()) * 31) + this.f23036B.hashCode()) * 31;
        boolean z = this.f23037C;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode2 + i) * 31) + this.f23038D.hashCode()) * 31) + this.f23039E.hashCode()) * 31) + this.f23040F.hashCode();
    }

    /* renamed from: i */
    public final String m13949i() {
        return this.f23036B;
    }

    /* renamed from: j */
    public final String m13948j() {
        return this.f23044z;
    }

    /* renamed from: k */
    public final String m13947k() {
        return this.f23040F;
    }

    /* renamed from: m */
    public final String m13946m() {
        return this.f23035A;
    }

    /* renamed from: n */
    public final String m13945n() {
        return this.f23042x;
    }

    /* renamed from: r */
    public final boolean m13944r() {
        return this.f23037C;
    }

    public String toString() {
        int i = this.f23041w;
        String str = this.f23042x;
        String str2 = this.f23043y;
        String str3 = this.f23044z;
        String str4 = this.f23035A;
        String str5 = this.f23036B;
        boolean z = this.f23037C;
        String str6 = this.f23038D;
        BannerAction bannerAction = this.f23039E;
        String str7 = this.f23040F;
        return "Banner(id=" + i + ", title=" + str + ", description=" + str2 + ", shortAction=" + str3 + ", thumb=" + str4 + ", image=" + str5 + ", isNew=" + z + ", backgroundColor=" + str6 + ", action=" + bannerAction + ", shortTitle=" + str7 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f23041w);
        parcel.writeString(this.f23042x);
        parcel.writeString(this.f23043y);
        parcel.writeString(this.f23044z);
        parcel.writeString(this.f23035A);
        parcel.writeString(this.f23036B);
        parcel.writeInt(this.f23037C ? 1 : 0);
        parcel.writeString(this.f23038D);
        this.f23039E.writeToParcel(parcel, i);
        parcel.writeString(this.f23040F);
    }

    public /* synthetic */ Banner(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, BannerAction bannerAction, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i2 & 32) != 0 ? BuildConfig.VERSION_NAME : str5, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? BuildConfig.VERSION_NAME : str6, (i2 & 256) != 0 ? new BannerAction(0, null, null, 7, null) : bannerAction, (i2 & 512) == 0 ? str7 : BuildConfig.VERSION_NAME);
    }
}
