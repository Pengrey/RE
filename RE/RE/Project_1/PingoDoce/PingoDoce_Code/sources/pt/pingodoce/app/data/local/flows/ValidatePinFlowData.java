package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ValidatePinFlowData.kt */
/* loaded from: classes2.dex */
public final class ValidatePinFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8680a();

    /* renamed from: w */
    private final String f22440w;

    /* compiled from: ValidatePinFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.ValidatePinFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8680a implements Parcelable.Creator {
        /* renamed from: a */
        public final ValidatePinFlowData createFromParcel(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new ValidatePinFlowData(parcel.readString());
        }

        /* renamed from: b */
        public final ValidatePinFlowData[] newArray(int i) {
            return new ValidatePinFlowData[i];
        }
    }

    public ValidatePinFlowData() {
        this(null, 1, null);
    }

    public ValidatePinFlowData(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        this.f22440w = str;
    }

    /* renamed from: a */
    public final String m14681a() {
        return this.f22440w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidatePinFlowData) && Intrinsics.equals(this.f22440w, ((ValidatePinFlowData) obj).f22440w);
    }

    public int hashCode() {
        return this.f22440w.hashCode();
    }

    public String toString() {
        String str = this.f22440w;
        return "ValidatePinFlowData(token=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22440w);
    }

    public /* synthetic */ ValidatePinFlowData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
