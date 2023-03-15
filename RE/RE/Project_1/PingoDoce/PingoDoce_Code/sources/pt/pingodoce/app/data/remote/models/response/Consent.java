package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Consent.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Consent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8776a();
    @InterfaceC4469e(name = "title")

    /* renamed from: A */
    private final String f23118A;
    @InterfaceC4469e(name = "version")

    /* renamed from: w */
    private final String f23119w;
    @InterfaceC4469e(name = "type")

    /* renamed from: x */
    private final String f23120x;
    @InterfaceC4469e(name = "privacyUrl")

    /* renamed from: y */
    private final String f23121y;
    @InterfaceC4469e(name = "termsOfUseUrl")

    /* renamed from: z */
    private final String f23122z;

    /* compiled from: Consent.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.Consent$a */
    /* loaded from: classes2.dex */
    public static final class C8776a implements Parcelable.Creator {
        /* renamed from: a */
        public final Consent mo12721a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new Consent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Consent[] mo12720b(int i) {
            return new Consent[i];
        }
    }

    public Consent() {
        this(null, null, null, null, null, 31, null);
    }

    public Consent(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.isThisObjectNull(str, "version");
        Intrinsics.isThisObjectNull(str2, "type");
        Intrinsics.isThisObjectNull(str3, "privacyUrl");
        Intrinsics.isThisObjectNull(str4, "termsOfUseUrl");
        Intrinsics.isThisObjectNull(str5, "title");
        this.f23119w = str;
        this.f23120x = str2;
        this.f23121y = str3;
        this.f23122z = str4;
        this.f23118A = str5;
    }

    /* renamed from: a */
    public final String m13867a() {
        return this.f23121y;
    }

    /* renamed from: b */
    public final String m13866b() {
        return this.f23122z;
    }

    /* renamed from: c */
    public final String m13865c() {
        return this.f23118A;
    }

    /* renamed from: d */
    public final String m13864d() {
        return this.f23120x;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m13863e() {
        return this.f23119w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Consent) {
            Consent consent = (Consent) obj;
            return Intrinsics.equals(this.f23119w, consent.f23119w) && Intrinsics.equals(this.f23120x, consent.f23120x) && Intrinsics.equals(this.f23121y, consent.f23121y) && Intrinsics.equals(this.f23122z, consent.f23122z) && Intrinsics.equals(this.f23118A, consent.f23118A);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m13862f() {
        if (this.f23119w.length() == 0) {
            if (this.f23120x.length() == 0) {
                if (this.f23121y.length() == 0) {
                    if (this.f23122z.length() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m13861h() {
        return Intrinsics.equals(this.f23120x, "TermsPrivacy");
    }

    public int hashCode() {
        return (((((((this.f23119w.hashCode() * 31) + this.f23120x.hashCode()) * 31) + this.f23121y.hashCode()) * 31) + this.f23122z.hashCode()) * 31) + this.f23118A.hashCode();
    }

    public String toString() {
        String str = this.f23119w;
        String str2 = this.f23120x;
        String str3 = this.f23121y;
        String str4 = this.f23122z;
        String str5 = this.f23118A;
        return "Consent(version=" + str + ", type=" + str2 + ", privacyUrl=" + str3 + ", termsOfUseUrl=" + str4 + ", title=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23119w);
        parcel.writeString(this.f23120x);
        parcel.writeString(this.f23121y);
        parcel.writeString(this.f23122z);
        parcel.writeString(this.f23118A);
    }

    public /* synthetic */ Consent(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str5);
    }
}
