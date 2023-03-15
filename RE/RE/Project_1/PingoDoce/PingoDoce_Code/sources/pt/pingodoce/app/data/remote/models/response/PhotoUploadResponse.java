package pt.pingodoce.app.data.remote.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: PhotoUploadResponse.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class PhotoUploadResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8787a();
    @InterfaceC4469e(name = "url")

    /* renamed from: w */
    private final String f23213w;

    /* compiled from: PhotoUploadResponse.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse$a */
    /* loaded from: classes2.dex */
    public static final class C8787a implements Parcelable.Creator {
        /* renamed from: a */
        public final PhotoUploadResponse mo12620a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new PhotoUploadResponse(parcel.readString());
        }

        /* renamed from: b */
        public final PhotoUploadResponse[] mo12619b(int i) {
            return new PhotoUploadResponse[i];
        }
    }

    public PhotoUploadResponse() {
        this(null, 1, null);
    }

    public PhotoUploadResponse(String str) {
        Intrinsics.isThisObjectNull(str, "url");
        this.f23213w = str;
    }

    /* renamed from: a */
    public final String m13760a() {
        return this.f23213w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotoUploadResponse) && Intrinsics.equals(this.f23213w, ((PhotoUploadResponse) obj).f23213w);
    }

    public int hashCode() {
        return this.f23213w.hashCode();
    }

    public String toString() {
        String str = this.f23213w;
        return "PhotoUploadResponse(url=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23213w);
    }

    public /* synthetic */ PhotoUploadResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
