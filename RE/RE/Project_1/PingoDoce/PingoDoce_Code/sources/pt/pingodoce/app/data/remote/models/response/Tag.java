package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Tag.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8794a();
    @InterfaceC4469e(name = "secondaryColor")

    /* renamed from: A */
    private final String f23268A;
    @InterfaceC4469e(name = "elasticID")

    /* renamed from: w */
    private final String f23269w;
    @InterfaceC4469e(name = "id")

    /* renamed from: x */
    private final int f23270x;
    @InterfaceC4469e(name = "name")

    /* renamed from: y */
    private final String f23271y;
    @InterfaceC4469e(name = "primaryColor")

    /* renamed from: z */
    private final String f23272z;

    /* compiled from: Tag.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Tag$a */
    /* loaded from: classes2.dex */
    public static final class C8794a implements Parcelable.Creator {
        /* renamed from: a */
        public final Tag mo12546a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Tag(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Tag[] mo12545b(int i) {
            return new Tag[i];
        }
    }

    public Tag() {
        this(null, 0, null, null, null, 31, null);
    }

    public Tag(String str, int i, String str2, String str3, String str4) {
        Intrinsics.isThisObjectNull(str, "elasticId");
        Intrinsics.isThisObjectNull(str2, "name");
        Intrinsics.isThisObjectNull(str3, "primaryColor");
        Intrinsics.isThisObjectNull(str4, "secondaryColor");
        this.f23269w = str;
        this.f23270x = i;
        this.f23271y = str2;
        this.f23272z = str3;
        this.f23268A = str4;
    }

    /* renamed from: a */
    public final String m13692a() {
        return this.f23269w;
    }

    /* renamed from: b */
    public final int m13691b() {
        return this.f23270x;
    }

    /* renamed from: c */
    public final String m13690c() {
        return this.f23271y;
    }

    /* renamed from: d */
    public final String m13689d() {
        return this.f23272z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13688e() {
        return this.f23272z.length() == 0 ? "#8E8E93" : this.f23272z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tag) {
            Tag tag = (Tag) obj;
            return Intrinsics.equals(this.f23269w, tag.f23269w) && this.f23270x == tag.f23270x && Intrinsics.equals(this.f23271y, tag.f23271y) && Intrinsics.equals(this.f23272z, tag.f23272z) && Intrinsics.equals(this.f23268A, tag.f23268A);
        }
        return false;
    }

    /* renamed from: f */
    public final String m13687f() {
        return this.f23268A;
    }

    /* renamed from: h */
    public final String m13686h() {
        return this.f23268A.length() == 0 ? "#FFFFFF" : this.f23268A;
    }

    public int hashCode() {
        return (((((((this.f23269w.hashCode() * 31) + Integer.hashCode(this.f23270x)) * 31) + this.f23271y.hashCode()) * 31) + this.f23272z.hashCode()) * 31) + this.f23268A.hashCode();
    }

    public String toString() {
        String str = this.f23269w;
        int i = this.f23270x;
        String str2 = this.f23271y;
        String str3 = this.f23272z;
        String str4 = this.f23268A;
        return "Tag(elasticId=" + str + ", id=" + i + ", name=" + str2 + ", primaryColor=" + str3 + ", secondaryColor=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23269w);
        parcel.writeInt(this.f23270x);
        parcel.writeString(this.f23271y);
        parcel.writeString(this.f23272z);
        parcel.writeString(this.f23268A);
    }

    public /* synthetic */ Tag(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i2 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i2 & 16) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
