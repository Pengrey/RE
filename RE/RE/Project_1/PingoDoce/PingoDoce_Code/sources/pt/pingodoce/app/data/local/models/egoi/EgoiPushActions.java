package pt.pingodoce.app.data.local.models.egoi;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.InterfaceC4469e;
import com.squareup.moshi.InterfaceC4475g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: EgoiPushActions.kt */
@InterfaceC4475g(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EgoiPushActions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8694a();
    @InterfaceC4469e(name = "type")

    /* renamed from: w */
    private final String f22523w;
    @InterfaceC4469e(name = "url")

    /* renamed from: x */
    private final String f22524x;

    /* compiled from: EgoiPushActions.kt */
    /* renamed from: pt.pingodoce.app.data.local.models.egoi.EgoiPushActions$a */
    /* loaded from: classes2.dex */
    public static final class C8694a implements Parcelable.Creator {
        /* renamed from: a */
        public final EgoiPushActions mo13444a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new EgoiPushActions(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final EgoiPushActions[] mo13443b(int i) {
            return new EgoiPushActions[i];
        }
    }

    public EgoiPushActions() {
        this(null, null, 3, null);
    }

    public EgoiPushActions(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "type");
        Intrinsics.isThisObjectNull(str2, "url");
        this.f22523w = str;
        this.f22524x = str2;
    }

    /* renamed from: a */
    public final String m14589a() {
        return this.f22523w;
    }

    /* renamed from: b */
    public final String m14588b() {
        return this.f22524x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EgoiPushActions) {
            EgoiPushActions egoiPushActions = (EgoiPushActions) obj;
            return Intrinsics.equals(this.f22523w, egoiPushActions.f22523w) && Intrinsics.equals(this.f22524x, egoiPushActions.f22524x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22523w.hashCode() * 31) + this.f22524x.hashCode();
    }

    public String toString() {
        String str = this.f22523w;
        String str2 = this.f22524x;
        return "EgoiPushActions(type=" + str + ", url=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22523w);
        parcel.writeString(this.f22524x);
    }

    public /* synthetic */ EgoiPushActions(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
