package pt.pingodoce.app.data.local.models.products;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Category.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Category implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8705a();
    @InterfaceC4469e(name = "count")

    /* renamed from: A */
    private final String f22582A;
    @InterfaceC4469e(name = "isTailoredForYou")

    /* renamed from: B */
    private final boolean f22583B;
    @InterfaceC4469e(name = "id")

    /* renamed from: w */
    private final int f22584w;
    @InterfaceC4469e(name = "title")

    /* renamed from: x */
    private final String f22585x;
    @InterfaceC4469e(name = "primaryColor")

    /* renamed from: y */
    private final String f22586y;
    @InterfaceC4469e(name = "secondaryColor")

    /* renamed from: z */
    private final String f22587z;

    /* compiled from: Category.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.products.Category$a */
    /* loaded from: classes2.dex */
    public static final class C8705a implements Parcelable.Creator {
        /* renamed from: a */
        public final Category mo14018a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Category(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final Category[] mo14017b(int i) {
            return new Category[i];
        }
    }

    public Category() {
        this(0, null, null, null, null, false, 63, null);
    }

    public Category(int i, String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "primaryColor");
        Intrinsics.isThisObjectNull(str3, "secondaryColor");
        Intrinsics.isThisObjectNull(str4, "count");
        this.f22584w = i;
        this.f22585x = str;
        this.f22586y = str2;
        this.f22587z = str3;
        this.f22582A = str4;
        this.f22583B = z;
    }

    /* renamed from: a */
    public final String m14492a() {
        return this.f22582A;
    }

    /* renamed from: b */
    public final int m14491b() {
        return this.f22584w;
    }

    /* renamed from: c */
    public final String m14490c() {
        return this.f22586y;
    }

    /* renamed from: d */
    public final String m14489d() {
        return this.f22587z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m14488e() {
        return this.f22587z.length() == 0 ? "#FFFFFF" : this.f22587z;
    }

    /* renamed from: f */
    public final String m14487f() {
        return this.f22585x;
    }

    /* renamed from: h */
    public final boolean m14486h() {
        return this.f22583B;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22584w);
        parcel.writeString(this.f22585x);
        parcel.writeString(this.f22586y);
        parcel.writeString(this.f22587z);
        parcel.writeString(this.f22582A);
        parcel.writeInt(this.f22583B ? 1 : 0);
    }

    public /* synthetic */ Category(int i, String str, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i2 & 16) == 0 ? str4 : BuildConfig.VERSION_NAME, (i2 & 32) != 0 ? false : z);
    }
}
