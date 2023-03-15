package pt.pingodoce.app.data.remote.models.request.parameters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;
import tg.InterfaceC10619b;

/* compiled from: SearchTagsParameters.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SearchTagsParameters implements Parcelable, InterfaceC10619b {
    public static final Parcelable.Creator CREATOR = new C8765a();
    @InterfaceC4469e(name = "text")

    /* renamed from: w */
    private final String f23032w;

    /* compiled from: SearchTagsParameters.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.parameters.SearchTagsParameters$a */
    /* loaded from: classes2.dex */
    public static final class C8765a implements Parcelable.Creator {
        /* renamed from: a */
        public final SearchTagsParameters mo12821a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new SearchTagsParameters(parcel.readString());
        }

        /* renamed from: b */
        public final SearchTagsParameters[] mo12820b(int i) {
            return new SearchTagsParameters[i];
        }
    }

    public SearchTagsParameters(String str) {
        Intrinsics.isThisObjectNull(str, "text");
        this.f23032w = str;
    }

    /* renamed from: a */
    public final String m13961a() {
        return this.f23032w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTagsParameters) && Intrinsics.equals(this.f23032w, ((SearchTagsParameters) obj).f23032w);
    }

    public String getKey() {
        return InterfaceC10619b.C10620a.m7484a(this);
    }

    public int hashCode() {
        return this.f23032w.hashCode();
    }

    public String toString() {
        String str = this.f23032w;
        return "SearchTagsParameters(text=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f23032w);
    }
}
