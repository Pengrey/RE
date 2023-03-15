package pt.pingodoce.app.data.remote.models.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import p181jd.Intrinsics;

/* compiled from: MadeForYou.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class MadeForYou implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8742a();
    @InterfaceC4469e(name = "history")

    /* renamed from: w */
    private final boolean f22886w;

    /* compiled from: MadeForYou.kt */
    /* renamed from: pt.pingodoce.app.data.remote.models.request.MadeForYou$a */
    /* loaded from: classes2.dex */
    public static final class C8742a implements Parcelable.Creator {
        /* renamed from: a */
        public final MadeForYou mo13659a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new MadeForYou(parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final MadeForYou[] mo13658b(int i) {
            return new MadeForYou[i];
        }
    }

    public MadeForYou(boolean z) {
        this.f22886w = z;
    }

    /* renamed from: a */
    public final boolean m14127a() {
        return this.f22886w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MadeForYou) && this.f22886w == ((MadeForYou) obj).f22886w;
    }

    public int hashCode() {
        boolean z = this.f22886w;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f22886w;
        return "MadeForYou(history=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeInt(this.f22886w ? 1 : 0);
    }
}
