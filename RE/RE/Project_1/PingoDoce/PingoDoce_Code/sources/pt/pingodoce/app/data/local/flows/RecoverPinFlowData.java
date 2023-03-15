package pt.pingodoce.app.data.local.flows;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: RecoverPinFlowData.kt */
/* loaded from: classes2.dex */
public final class RecoverPinFlowData implements FlowData {
    public static final Parcelable.Creator CREATOR = new C8677a();

    /* renamed from: w */
    private final String f22433w;

    /* renamed from: x */
    private final String f22434x;

    /* compiled from: RecoverPinFlowData.kt */
    /* renamed from: pt.pingodoce.app.data.local.flows.RecoverPinFlowData$a */
    /* loaded from: classes2.dex */
    public static final class C8677a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecoverPinFlowData mo13549a(Parcel parcel) {
            Intrinsics.isThisObjectNull(parcel, "parcel");
            return new RecoverPinFlowData(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RecoverPinFlowData[] mo13548b(int i) {
            return new RecoverPinFlowData[i];
        }
    }

    public RecoverPinFlowData(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "maskedEmail");
        this.f22433w = str;
        this.f22434x = str2;
    }

    /* renamed from: a */
    public final RecoverPinFlowData m14695a(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "phoneNumber");
        Intrinsics.isThisObjectNull(str2, "maskedEmail");
        return new RecoverPinFlowData(str, str2);
    }

    /* renamed from: b */
    public final String m14694b() {
        return this.f22434x;
    }

    /* renamed from: c */
    public final String m14693c() {
        return this.f22433w;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecoverPinFlowData) {
            RecoverPinFlowData recoverPinFlowData = (RecoverPinFlowData) obj;
            return Intrinsics.equals(this.f22433w, recoverPinFlowData.f22433w) && Intrinsics.equals(this.f22434x, recoverPinFlowData.f22434x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22433w.hashCode() * 31) + this.f22434x.hashCode();
    }

    public String toString() {
        String str = this.f22433w;
        String str2 = this.f22434x;
        return "RecoverPinFlowData(phoneNumber=" + str + ", maskedEmail=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.isThisObjectNull(parcel, "out");
        parcel.writeString(this.f22433w);
        parcel.writeString(this.f22434x);
    }

    public /* synthetic */ RecoverPinFlowData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
